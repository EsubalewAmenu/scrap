package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.visionapps.grade12.Utility.NetworkChangeListener;

public class already extends AppCompatActivity implements View.OnClickListener {
    private EditText email;
    private TextView forgotpassword;
    private FirebaseAuth mAuth;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private EditText password;
    /* access modifiers changed from: private */
    public ProgressBar progressBar;
    private TextView register;
    private Button signin;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_already);
        TextView textView = (TextView) findViewById(C2719R.C2722id.textview19);
        this.register = textView;
        textView.setOnClickListener(this);
        this.email = (EditText) findViewById(C2719R.C2722id.inputEmail);
        this.password = (EditText) findViewById(C2719R.C2722id.inputPassword);
        Button button = (Button) findViewById(C2719R.C2722id.button5);
        this.signin = button;
        button.setOnClickListener(this);
        this.progressBar = (ProgressBar) findViewById(C2719R.C2722id.progressBar2);
        this.mAuth = FirebaseAuth.getInstance();
        TextView textView2 = (TextView) findViewById(C2719R.C2722id.forgot);
        this.forgotpassword = textView2;
        textView2.setOnClickListener(this);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C2719R.C2722id.button5) {
            usersignin();
        } else if (id == C2719R.C2722id.forgot) {
            startActivity(new Intent(this, forgotpassword.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        } else if (id == C2719R.C2722id.textview19) {
            startActivity(new Intent(this, login.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        }
    }

    private void usersignin() {
        String trim = this.email.getText().toString().trim();
        String trim2 = this.password.getText().toString().trim();
        final String string = Settings.Secure.getString(getContentResolver(), "android_id");
        if (trim.isEmpty()) {
            this.email.setError("Please enter your email address");
            this.email.requestFocus();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
            this.email.setError("Please enter a valid email address");
            this.email.requestFocus();
        } else if (trim2.isEmpty()) {
            this.password.setError("Please enter your password");
            this.password.requestFocus();
        } else if (trim2.length() < 6) {
            this.password.setError("Password must have min. 6 characters");
            this.password.requestFocus();
        } else {
            this.progressBar.setVisibility(0);
            this.mAuth.signInWithEmailAndPassword(trim, trim2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                public void onComplete(Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                        final DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
                        final String uid = currentUser.getUid();
                        reference.child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
                            public void onCancelled(DatabaseError databaseError) {
                            }

                            public void onDataChange(DataSnapshot dataSnapshot) {
                                User user = (User) dataSnapshot.getValue(User.class);
                                String str = user.deviceid;
                                String str2 = user.fname;
                                String str3 = user.email;
                                String str4 = user.schoolname;
                                String str5 = user.field;
                                if (!string.equals(str)) {
                                    reference.child(uid).child("oldid").setValue(str);
                                    reference.child(uid).child("deviceid").setValue(string);
                                }
                                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(already.this.getBaseContext()).edit();
                                edit.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
                                edit.putString("email", str3);
                                edit.putString("school", str4);
                                edit.putString("field", str5);
                                edit.commit();
                            }
                        });
                        already.this.startActivity(new Intent(already.this, homePage.class), ActivityOptions.makeSceneTransitionAnimation(already.this, new Pair[0]).toBundle());
                        already.this.finish();
                        already.this.progressBar.setVisibility(8);
                        return;
                    }
                    String message = task.getException().getMessage();
                    already already = already.this;
                    Toast.makeText(already, "An error occurred. " + message + ". Please try again", 1).show();
                    already.this.progressBar.setVisibility(8);
                }
            });
        }
    }
}
