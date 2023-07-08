package com.visionapps.grade12;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class payforpremium extends AppCompatActivity {
    ImageView cancel;
    CardView gopremium;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_payforpremium);
        this.gopremium = (CardView) findViewById(C2719R.C2722id.gopremium);
        this.cancel = (ImageView) findViewById(C2719R.C2722id.cancel);
        this.gopremium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(payforpremium.this, "Contact us through telegram.", 0).show();
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                payforpremium.super.onBackPressed();
            }
        });
    }
}
