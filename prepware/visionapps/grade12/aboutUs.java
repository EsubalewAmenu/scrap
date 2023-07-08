package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class aboutUs extends AppCompatActivity {
    ColoredIconView instagram;
    ColoredIconView instagram1;
    ColoredIconView mail;
    ColoredIconView mail1;
    ColoredIconView phone;
    ColoredIconView phone1;
    ColoredIconView telegram;
    ColoredIconView telegram1;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_about_us);
        this.phone = (ColoredIconView) findViewById(C2719R.C2722id.phone_logo);
        this.instagram = (ColoredIconView) findViewById(C2719R.C2722id.instagram_logo);
        this.telegram = (ColoredIconView) findViewById(C2719R.C2722id.telegram_logo);
        this.mail = (ColoredIconView) findViewById(C2719R.C2722id.mail_logo);
        this.phone1 = (ColoredIconView) findViewById(C2719R.C2722id.phone_logo1);
        this.instagram1 = (ColoredIconView) findViewById(C2719R.C2722id.instagram_logo1);
        this.telegram1 = (ColoredIconView) findViewById(C2719R.C2722id.telegram_logo1);
        this.mail1 = (ColoredIconView) findViewById(C2719R.C2722id.mail_logo1);
        this.phone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:0921378554"));
                aboutUs.this.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(aboutUs.this, new Pair[0]).toBundle());
            }
        });
        this.phone1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:0920336555"));
                aboutUs.this.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(aboutUs.this, new Pair[0]).toBundle());
            }
        });
        this.instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.instagram.com/sura_br/")));
            }
        });
        this.instagram1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://instagram.com/jay_maaruf")));
            }
        });
        this.telegram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/Surafel_b")));
            }
        });
        this.telegram1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/jay_maaruf")));
            }
        });
        this.mail1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=Jmaaruf007@gmail.com")));
            }
        });
        this.mail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                aboutUs.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=surafelbrhan1@gmail.com")));
            }
        });
    }

    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}
