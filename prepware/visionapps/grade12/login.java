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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.database.FirebaseDatabase;
import com.visionapps.grade12.Utility.NetworkChangeListener;
import java.util.concurrent.TimeUnit;

public class login extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth bAuth;
    private EditText email;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            String smsCode = phoneAuthCredential.getSmsCode();
            if (smsCode != null) {
                login.this.verifyotpcode(smsCode);
            }
        }

        public void onVerificationFailed(FirebaseException firebaseException) {
            Toast.makeText(login.this, firebaseException.getMessage(), 0).show();
        }

        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            super.onCodeSent(str, forceResendingToken);
            String unused = login.this.verificationId = str;
            login.this.otpcode.setVisibility(0);
            login.this.verifyotp.setVisibility(0);
            login.this.verifynumber.setText("Code Sent");
            Toast.makeText(login.this, "Phone verification code has been sent.", 0).show();
            login.this.verifynumber.setEnabled(false);
            login.this.verifynumber.setBackgroundColor(login.this.getResources().getColor(C2719R.C2720color.graycolor));
        }
    };
    private EditText name;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    /* access modifiers changed from: private */
    public boolean numberverified = false;
    /* access modifiers changed from: private */
    public EditText otpcode;
    private EditText password;
    /* access modifiers changed from: private */
    public EditText phonenumber;
    /* access modifiers changed from: private */
    public ProgressBar progressbar;
    private Button register;
    private EditText school;
    private TextView signin;
    private Spinner spinner;
    /* access modifiers changed from: private */
    public String verificationId;
    /* access modifiers changed from: private */
    public Button verifynumber;
    /* access modifiers changed from: private */
    public Button verifyotp;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_login);
        this.bAuth = FirebaseAuth.getInstance();
        Button button = (Button) findViewById(C2719R.C2722id.btnRegister);
        this.register = button;
        button.setOnClickListener(this);
        this.otpcode = (EditText) findViewById(C2719R.C2722id.editotp);
        this.phonenumber = (EditText) findViewById(C2719R.C2722id.enterphone);
        this.verifynumber = (Button) findViewById(C2719R.C2722id.btnverifynumber);
        this.verifyotp = (Button) findViewById(C2719R.C2722id.btnverifyotp);
        TextView textView = (TextView) findViewById(C2719R.C2722id.signin);
        this.signin = textView;
        textView.setOnClickListener(this);
        this.name = (EditText) findViewById(C2719R.C2722id.Nameid);
        this.email = (EditText) findViewById(C2719R.C2722id.enterEmail);
        this.password = (EditText) findViewById(C2719R.C2722id.editPassword);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.progressBar);
        this.school = (EditText) findViewById(C2719R.C2722id.textView2);
        this.spinner = (Spinner) findViewById(C2719R.C2722id.spinner1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.field));
        arrayAdapter.setDropDownViewResource(17367049);
        this.spinner.setAdapter(arrayAdapter);
        this.verifynumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (login.this.phonenumber.getText().toString().isEmpty()) {
                    login.this.phonenumber.setError("Please enter your phone number.");
                    login.this.phonenumber.requestFocus();
                    return;
                }
                login.this.verifynumber.setText("Please wait...");
                login.this.verifynumber.setEnabled(false);
                login.this.sendverificationcode(login.this.phonenumber.getText().toString());
            }
        });
        this.verifyotp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (login.this.otpcode.getText().toString().isEmpty()) {
                    login.this.otpcode.setError("The code you entered is wrong.");
                    login.this.otpcode.requestFocus();
                    return;
                }
                login.this.verifyotp.setBackgroundColor(login.this.getResources().getColor(C2719R.C2720color.graycolor));
                login.this.verifyotp.setText("Verifying");
                login.this.verifyotp.setEnabled(false);
                login login = login.this;
                login.verifyotpcode(login.otpcode.getText().toString());
            }
        });
    }

    public void sendverificationcode(String str) {
        PhoneAuthOptions.Builder newBuilder = PhoneAuthOptions.newBuilder(this.bAuth);
        PhoneAuthProvider.verifyPhoneNumber(newBuilder.setPhoneNumber("+251" + str).setTimeout(60L, TimeUnit.SECONDS).setActivity(this).setCallbacks(this.mCallbacks).build());
    }

    public void verifyotpcode(String str) {
        signinbycredentials(PhoneAuthProvider.getCredential(this.verificationId, str));
    }

    private void signinbycredentials(PhoneAuthCredential phoneAuthCredential) {
        FirebaseAuth.getInstance().signInWithCredential(phoneAuthCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            public void onComplete(Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(login.this, "Phone number successfully verified.", 0).show();
                    boolean unused = login.this.numberverified = true;
                    login.this.verifyotp.setText("Verified");
                    login.this.verifynumber.setText("Verified");
                    login.this.verifyotp.setVisibility(8);
                    login.this.otpcode.setVisibility(8);
                    return;
                }
                Toast.makeText(login.this, "Verification Failed. Please re-enter the correct code and retry.", 0).show();
                login.this.verifyotp.setText("Verify Code");
                login.this.verifyotp.setEnabled(true);
            }
        });
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C2719R.C2722id.btnRegister) {
            registeruser();
        } else if (id == C2719R.C2722id.signin) {
            startActivity(new Intent(this, already.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        }
    }

    private void registeruser() {
        final String trim = this.name.getText().toString().trim();
        final String trim2 = this.email.getText().toString().trim();
        String trim3 = this.password.getText().toString().trim();
        final String string = Settings.Secure.getString(getContentResolver(), "android_id");
        final String trim4 = this.phonenumber.getText().toString().trim();
        final String trim5 = this.school.getText().toString().trim();
        final String obj = this.spinner.getSelectedItem().toString();
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            FirebaseAuth.getInstance().signOut();
        }
        if (trim.isEmpty()) {
            this.name.setError("Please enter your name.");
            this.name.requestFocus();
        } else if (trim2.isEmpty()) {
            this.email.setError("Please enter your email.");
            this.email.requestFocus();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(trim2).matches()) {
            this.email.setError("Please enter a valid email address");
            this.email.requestFocus();
        } else if (trim3.isEmpty()) {
            this.password.setError("Please enter password.");
            this.password.requestFocus();
        } else if (trim3.length() < 6) {
            this.password.setError("Password needs to be more than 6 characters");
            this.password.requestFocus();
        } else if (this.numberverified) {
            this.progressbar.setVisibility(0);
            this.bAuth.createUserWithEmailAndPassword(trim2, trim3).addOnCompleteListener(new OnCompleteListener<AuthResult>((String) null, "unpaid", "", "") {
                public void onComplete(Task<AuthResult> task) {
                    try {
                        if (task.isSuccessful()) {
                            User user = new User(trim, trim2, string, null, trim5, obj, "unpaid", "", "", trim4);
                            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(login.this.getBaseContext()).edit();
                            edit.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, trim);
                            edit.putString("email", trim2);
                            edit.putString("school", trim5);
                            edit.putString("field", obj);
                            edit.commit();
                            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                public void onComplete(Task<Void> task) {
                                    try {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(login.this, "User has been registered", 0).show();
                                            FirebaseAuth.getInstance().getCurrentUser().sendEmailVerification();
                                            login.this.startActivity(new Intent(login.this, nameact.class), ActivityOptions.makeSceneTransitionAnimation(login.this, new Pair[0]).toBundle());
                                            login.this.finish();
                                            login.this.progressbar.setVisibility(8);
                                            return;
                                        }
                                        String exc = task.getException().toString();
                                        login login = login.this;
                                        Toast.makeText(login, "Failed to register: " + exc, 0).show();
                                        login.this.progressbar.setVisibility(8);
                                    } catch (NullPointerException unused) {
                                        Toast.makeText(login.this, "Something went wrong, Please try again.", 0).show();
                                    }
                                }
                            });
                            return;
                        }
                        String message = task.getException().getMessage();
                        login login = login.this;
                        Toast.makeText(login, "Failed to register: " + message, 0).show();
                        login.this.progressbar.setVisibility(8);
                    } catch (NullPointerException unused) {
                        Toast.makeText(login.this, "Something went wrong, Please try again.", 0).show();
                    }
                }
            });
        } else {
            this.phonenumber.setError("Please verify your phone number.");
            this.phonenumber.requestFocus();
        }
    }
}
