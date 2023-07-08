package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.visionapps.grade12.Utility.NetworkChangeListener;

public class Payment extends AppCompatActivity {
    Button Awash;
    Button CBE;
    Button cbeBirr;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    Button teleBirr;
    ImageView youtube;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_payment);
        this.CBE = (Button) findViewById(C2719R.C2722id.CBE);
        this.Awash = (Button) findViewById(C2719R.C2722id.awashBank);
        this.cbeBirr = (Button) findViewById(C2719R.C2722id.cbeBirr);
        this.teleBirr = (Button) findViewById(C2719R.C2722id.teleBirr);
        this.youtube = (ImageView) findViewById(C2719R.C2722id.youtube);
        this.CBE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Payment.this.startActivity(new Intent(Payment.this, bankPayment.class), ActivityOptions.makeSceneTransitionAnimation(Payment.this, new Pair[0]).toBundle());
            }
        });
        this.Awash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Payment.this.startActivity(new Intent(Payment.this, bankPayment.class), ActivityOptions.makeSceneTransitionAnimation(Payment.this, new Pair[0]).toBundle());
            }
        });
        this.cbeBirr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Payment.this.startActivity(new Intent(Payment.this, mobileBanking.class), ActivityOptions.makeSceneTransitionAnimation(Payment.this, new Pair[0]).toBundle());
            }
        });
        this.teleBirr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Payment.this.startActivity(new Intent(Payment.this, mobileBanking.class), ActivityOptions.makeSceneTransitionAnimation(Payment.this, new Pair[0]).toBundle());
            }
        });
        this.youtube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Payment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/channel/UCpFq0PcrpX_p6voCJTJ118w")));
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } else {
            Toast.makeText(this, "Enjoy the offline Version", 0).show();
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            unregisterReceiver(this.networkChangeListener);
        }
        super.onStop();
    }
}
