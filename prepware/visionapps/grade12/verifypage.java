package com.visionapps.grade12;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class verifypage extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_verifypage);
        final Button button = (Button) findViewById(C2719R.C2722id.resend);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    FirebaseAuth.getInstance().getCurrentUser().sendEmailVerification();
                    button.setEnabled(false);
                    Toast.makeText(verifypage.this, "Code has been resent", 0).show();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
