package com.visionapps.grade12;

import android.app.AlertDialog;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class forgotpassword extends AppCompatActivity {
    FirebaseAuth auth;
    private EditText emailtext;
    /* access modifiers changed from: private */
    public ProgressBar prog;
    private Button reset;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_forgotpassword);
        this.emailtext = (EditText) findViewById(C2719R.C2722id.editTextTextEmailAddress1);
        this.reset = (Button) findViewById(C2719R.C2722id.button31);
        this.prog = (ProgressBar) findViewById(C2719R.C2722id.progressBar3);
        this.auth = FirebaseAuth.getInstance();
        InternetCheck();
        this.reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                forgotpassword.this.resetpassword();
            }
        });
    }

    /* access modifiers changed from: private */
    public void resetpassword() {
        String trim = this.emailtext.getText().toString().trim();
        if (trim.isEmpty()) {
            this.emailtext.setError("Please enter your email");
            this.emailtext.requestFocus();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(trim).matches()) {
            this.emailtext.setError("Please enter a valid email");
            this.emailtext.requestFocus();
        } else {
            this.prog.setVisibility(0);
            this.auth.sendPasswordResetEmail(trim).addOnCompleteListener(new OnCompleteListener<Void>() {
                public void onComplete(Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(forgotpassword.this, "Please check your email", 1).show();
                        forgotpassword.this.prog.setVisibility(8);
                        return;
                    }
                    Toast.makeText(forgotpassword.this, "Something went wrong please try again", 1).show();
                    forgotpassword.this.prog.setVisibility(8);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void InternetCheck() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        if (!networkInfo.isConnected() && !networkInfo2.isConnected()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            View inflate = LayoutInflater.from(this).inflate(C2719R.C2724layout.check_internet_dialog, (ViewGroup) null);
            builder.setView(inflate);
            final AlertDialog create = builder.create();
            create.show();
            create.setCancelable(false);
            create.getWindow().setGravity(17);
            ((AppCompatButton) inflate.findViewById(C2719R.C2722id.btnRetry)).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    forgotpassword.this.InternetCheck();
                    create.dismiss();
                }
            });
        }
    }
}
