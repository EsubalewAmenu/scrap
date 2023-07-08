package com.visionapps.grade12;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class deleteAccount extends AppCompatActivity {
    RelativeLayout areyousuredelete;
    CardView cardDelete;
    public Button deleteNo;
    public Button deleteYes;
    public Button submit;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_delete_account);
        final EditText editText = (EditText) findViewById(C2719R.C2722id.emailAuth);
        final EditText editText2 = (EditText) findViewById(C2719R.C2722id.logpass);
        this.submit = (Button) findViewById(C2719R.C2722id.submit);
        this.areyousuredelete = (RelativeLayout) findViewById(C2719R.C2722id.areYouSureDelete);
        this.deleteYes = (Button) findViewById(C2719R.C2722id.deleteYes);
        this.deleteNo = (Button) findViewById(C2719R.C2722id.deleteNo);
        this.cardDelete = (CardView) findViewById(C2719R.C2722id.cardDelete);
        InternetCheck();
        this.submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String trim = editText.getText().toString().trim();
                String trim2 = editText2.getText().toString().trim();
                if (trim.isEmpty()) {
                    editText.setError("Please enter your email address");
                    editText.requestFocus();
                } else if (trim2.isEmpty()) {
                    editText2.setError("Please enter your password");
                    editText2.requestFocus();
                } else {
                    deleteAccount.this.areyousuredelete.setVisibility(0);
                    editText.setClickable(false);
                    editText.setEnabled(false);
                    editText2.setEnabled(false);
                    editText2.setClickable(false);
                    deleteAccount.this.submit.setClickable(false);
                    deleteAccount.this.submit.setEnabled(false);
                }
            }
        });
        this.deleteNo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                deleteAccount.this.areyousuredelete.setVisibility(8);
                editText.setClickable(true);
                editText.setEnabled(true);
                editText2.setEnabled(true);
                editText2.setClickable(true);
                deleteAccount.this.submit.setClickable(true);
                deleteAccount.this.submit.setEnabled(true);
            }
        });
        this.deleteYes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                deleteAccount.this.deleteuser(editText.getText().toString(), editText2.getText().toString());
            }
        });
    }

    /* access modifiers changed from: private */
    public void deleteuser(String str, String str2) {
        final FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        AuthCredential credential = EmailAuthProvider.getCredential(str, str2);
        if (currentUser != null) {
            currentUser.reauthenticate(credential).addOnCompleteListener(new OnCompleteListener<Void>() {
                public void onComplete(Task<Void> task) {
                    currentUser.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                deleteAccount.this.startActivity(new Intent(deleteAccount.this, already.class));
                                Toast.makeText(deleteAccount.this, "Deleted User Successfully,", 1).show();
                                return;
                            }
                            Toast.makeText(deleteAccount.this, "Deleting user unsuccessful, please check your Internet ", 0).show();
                        }
                    });
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
                    deleteAccount.this.InternetCheck();
                    create.dismiss();
                }
            });
        }
    }
}
