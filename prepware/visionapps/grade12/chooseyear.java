package com.visionapps.grade12;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.visionapps.grade12.Utility.NetworkChangeListener;

public class chooseyear extends AppCompatActivity {
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private CardView payment;
    private ProgressBar progressBar06;
    private ProgressBar progressBar07;
    private ProgressBar progressBar08;
    private ProgressBar progressBar09;
    private ProgressBar progressBar10;
    private ProgressBar progressBar11;
    private ProgressBar progressBar12;
    private ProgressBar progressBar13;
    ProgressDialog progressDialog;
    /* access modifiers changed from: private */
    public RelativeLayout progressDialogLayout;
    private TextView r09;
    private TextView r10;
    private TextView r11;
    private TextView r12;
    private TextView r13;
    private TextView timeAllowed06;
    private TextView timeAllowed07;
    private TextView timeAllowed08;
    private TextView timeAllowed09;
    private TextView timeAllowed10;
    private TextView timeAllowed11;
    private TextView timeAllowed12;
    private TextView timeAllowed13;
    private CardView y2006;
    private CardView y2007;
    private CardView y2008;
    private CardView y2009;
    private CardView y2010;
    private CardView y2011;
    private CardView y2012;
    private CardView y2013;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chooseyear);
        this.progressBar09 = (ProgressBar) findViewById(C2719R.C2722id.progressbar09);
        this.progressBar10 = (ProgressBar) findViewById(C2719R.C2722id.progressbar10);
        this.progressBar11 = (ProgressBar) findViewById(C2719R.C2722id.progressbar11);
        this.progressBar12 = (ProgressBar) findViewById(C2719R.C2722id.progressbar12);
        this.progressBar13 = (ProgressBar) findViewById(C2719R.C2722id.progressbar13);
        this.payment = (CardView) findViewById(C2719R.C2722id.pay);
        this.progressDialogLayout = (RelativeLayout) findViewById(C2719R.C2722id.progressDialog_layout);
        this.y2009 = (CardView) findViewById(C2719R.C2722id.cardView2009);
        this.y2010 = (CardView) findViewById(C2719R.C2722id.cardView2010);
        this.y2011 = (CardView) findViewById(C2719R.C2722id.cardView2011);
        this.y2012 = (CardView) findViewById(C2719R.C2722id.cardView2012);
        this.y2013 = (CardView) findViewById(C2719R.C2722id.cardView2013);
        this.r09 = (TextView) findViewById(C2719R.C2722id.resultText09);
        this.r10 = (TextView) findViewById(C2719R.C2722id.resultText10);
        this.r11 = (TextView) findViewById(C2719R.C2722id.resultText11);
        this.r12 = (TextView) findViewById(C2719R.C2722id.resultText12);
        this.r13 = (TextView) findViewById(C2719R.C2722id.resultText13);
        this.timeAllowed09 = (TextView) findViewById(C2719R.C2722id.timeAllowed09);
        this.timeAllowed10 = (TextView) findViewById(C2719R.C2722id.timeAllowed10);
        this.timeAllowed11 = (TextView) findViewById(C2719R.C2722id.timeAllowed11);
        this.timeAllowed12 = (TextView) findViewById(C2719R.C2722id.timeAllowed12);
        this.timeAllowed13 = (TextView) findViewById(C2719R.C2722id.timeAllowed13);
        try {
            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });
            LoadAd();
        } catch (Exception unused) {
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        this.payment.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (PreferenceManager.getDefaultSharedPreferences(chooseyear.this.getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
                    chooseyear.this.startActivity(new Intent(chooseyear.this, payforpremium.class));
                    return;
                }
                chooseyear.this.startActivity(new Intent(chooseyear.this, C3394stats.class));
            }
        });
        final String string = getIntent().getExtras().getString("subject");
        if (string.equals("english")) {
            int i = defaultSharedPreferences.getInt("eng2009hs", 0);
            TextView textView = this.r09;
            textView.setText(i + "/120");
            this.progressBar09.incrementProgressBy(i);
            this.progressBar09.setMax(120);
            int i2 = defaultSharedPreferences.getInt("eng2010hs", 0);
            TextView textView2 = this.r10;
            textView2.setText(i2 + "/120");
            this.progressBar10.incrementProgressBy(i2);
            this.progressBar10.setMax(120);
            int i3 = defaultSharedPreferences.getInt("eng2011hs", 0);
            TextView textView3 = this.r11;
            textView3.setText(i3 + "/120");
            this.progressBar11.incrementProgressBy(i3);
            this.progressBar11.setMax(120);
            int i4 = defaultSharedPreferences.getInt("eng2012hs", 0);
            TextView textView4 = this.r12;
            textView4.setText(i4 + "/120");
            this.progressBar12.incrementProgressBy(i4);
            this.progressBar12.setMax(120);
            int i5 = defaultSharedPreferences.getInt("eng2013hs", 0);
            TextView textView5 = this.r13;
            textView5.setText(i5 + "/120");
            this.progressBar13.incrementProgressBy(i5);
            this.progressBar13.setMax(120);
        }
        if (string.equals("biology")) {
            int i6 = defaultSharedPreferences.getInt("bio2009hs", 0);
            TextView textView6 = this.r09;
            textView6.setText(i6 + "/100");
            this.progressBar09.incrementProgressBy(i6);
            this.progressBar09.setMax(100);
            int i7 = defaultSharedPreferences.getInt("bio2010hs", 0);
            TextView textView7 = this.r10;
            textView7.setText(i7 + "/100");
            this.progressBar10.incrementProgressBy(i7);
            this.progressBar10.setMax(100);
            int i8 = defaultSharedPreferences.getInt("bio2011hs", 0);
            TextView textView8 = this.r11;
            textView8.setText(i8 + "/100");
            this.progressBar11.incrementProgressBy(i8);
            this.progressBar11.setMax(100);
            int i9 = defaultSharedPreferences.getInt("bio2012hs", 0);
            TextView textView9 = this.r12;
            textView9.setText(i9 + "/100");
            this.progressBar12.incrementProgressBy(i9);
            this.progressBar12.setMax(100);
            int i10 = defaultSharedPreferences.getInt("bio2013hs", 0);
            TextView textView10 = this.r13;
            textView10.setText(i10 + "/100");
            this.progressBar13.incrementProgressBy(i10);
            this.progressBar13.setMax(100);
        }
        if (string.equals("economics")) {
            int i11 = defaultSharedPreferences.getInt("econ2009hs", 0);
            TextView textView11 = this.r09;
            textView11.setText(i11 + "/75");
            this.progressBar09.incrementProgressBy(i11);
            this.progressBar09.setMax(75);
            int i12 = defaultSharedPreferences.getInt("econ2010hs", 0);
            TextView textView12 = this.r10;
            textView12.setText(i12 + "/80");
            this.progressBar10.incrementProgressBy(i12);
            this.progressBar10.setMax(80);
            int i13 = defaultSharedPreferences.getInt("econ2011hs", 0);
            TextView textView13 = this.r11;
            textView13.setText(i13 + "/80");
            this.progressBar11.incrementProgressBy(i13);
            this.progressBar11.setMax(80);
            int i14 = defaultSharedPreferences.getInt("econ2012hs", 0);
            TextView textView14 = this.r12;
            textView14.setText(i14 + "/75");
            this.progressBar12.incrementProgressBy(i14);
            this.progressBar12.setMax(75);
            this.r13.setText("Coming soon!");
        }
        if (string.equals("history")) {
            int i15 = defaultSharedPreferences.getInt("hist2009hs", 0);
            TextView textView15 = this.r09;
            textView15.setText(i15 + "/100");
            this.progressBar09.incrementProgressBy(i15);
            this.progressBar09.setMax(100);
            int i16 = defaultSharedPreferences.getInt("hist2010hs", 0);
            TextView textView16 = this.r10;
            textView16.setText(i16 + "/100");
            this.progressBar10.incrementProgressBy(i16);
            this.progressBar10.setMax(100);
            int i17 = defaultSharedPreferences.getInt("hist2011hs", 0);
            TextView textView17 = this.r11;
            textView17.setText(i17 + "/100");
            this.progressBar11.incrementProgressBy(i17);
            this.progressBar11.setMax(100);
            int i18 = defaultSharedPreferences.getInt("hist2012hs", 0);
            TextView textView18 = this.r12;
            textView18.setText(i18 + "/100");
            this.progressBar12.incrementProgressBy(i18);
            this.progressBar12.setMax(100);
            int i19 = defaultSharedPreferences.getInt("hist2013hs", 0);
            TextView textView19 = this.r13;
            textView19.setText(i19 + "/100");
            this.progressBar13.incrementProgressBy(i19);
            this.progressBar13.setMax(100);
        }
        if (string.equals("geography")) {
            int i20 = defaultSharedPreferences.getInt("geo2009hs", 0);
            TextView textView20 = this.r09;
            textView20.setText(i20 + "/100");
            this.progressBar09.incrementProgressBy(i20);
            this.progressBar09.setMax(100);
            int i21 = defaultSharedPreferences.getInt("geo2010hs", 0);
            TextView textView21 = this.r10;
            textView21.setText(i21 + "/100");
            this.progressBar10.incrementProgressBy(i21);
            this.progressBar10.setMax(100);
            int i22 = defaultSharedPreferences.getInt("geo2011hs", 0);
            TextView textView22 = this.r11;
            textView22.setText(i22 + "/100");
            this.progressBar11.incrementProgressBy(i22);
            this.progressBar11.setMax(100);
            int i23 = defaultSharedPreferences.getInt("geo2012hs", 0);
            TextView textView23 = this.r12;
            textView23.setText(i23 + "/100");
            this.progressBar12.incrementProgressBy(i23);
            this.progressBar12.setMax(100);
            int i24 = defaultSharedPreferences.getInt("geo2013hs", 0);
            TextView textView24 = this.r13;
            textView24.setText(i24 + "/100");
            this.progressBar13.incrementProgressBy(i24);
            this.progressBar13.setMax(100);
        }
        if (string.equals("civics")) {
            int i25 = defaultSharedPreferences.getInt("civ2009hs", 0);
            TextView textView25 = this.r09;
            textView25.setText(i25 + "/100");
            this.progressBar09.incrementProgressBy(i25);
            this.progressBar09.setMax(100);
            int i26 = defaultSharedPreferences.getInt("civ2010hs", 0);
            TextView textView26 = this.r10;
            textView26.setText(i26 + "/100");
            this.progressBar10.incrementProgressBy(i26);
            this.progressBar10.setMax(100);
            int i27 = defaultSharedPreferences.getInt("civ2011hs", 0);
            TextView textView27 = this.r11;
            textView27.setText(i27 + "/100");
            this.progressBar11.incrementProgressBy(i27);
            this.progressBar11.setMax(100);
            int i28 = defaultSharedPreferences.getInt("civ2012hs", 0);
            TextView textView28 = this.r12;
            textView28.setText(i28 + "/100");
            this.progressBar12.incrementProgressBy(i28);
            this.progressBar12.setMax(100);
            int i29 = defaultSharedPreferences.getInt("civ2013hs", 0);
            TextView textView29 = this.r13;
            textView29.setText(i29 + "/100");
            this.progressBar13.incrementProgressBy(i29);
            this.progressBar13.setMax(100);
        }
        if (string.equals("maths")) {
            int i30 = defaultSharedPreferences.getInt("math2009hs", 0);
            TextView textView30 = this.r09;
            textView30.setText(i30 + "/65");
            this.progressBar09.incrementProgressBy(i30);
            this.progressBar09.setMax(65);
            int i31 = defaultSharedPreferences.getInt("math2010hs", 0);
            TextView textView31 = this.r10;
            textView31.setText(i31 + "/65");
            this.progressBar10.incrementProgressBy(i31);
            this.progressBar10.setMax(65);
            int i32 = defaultSharedPreferences.getInt("math2011hs", 0);
            TextView textView32 = this.r11;
            textView32.setText(i32 + "/65");
            this.progressBar11.incrementProgressBy(i32);
            this.progressBar11.setMax(65);
            int i33 = defaultSharedPreferences.getInt("math2012hs", 0);
            TextView textView33 = this.r12;
            textView33.setText(i33 + "/65");
            this.progressBar12.incrementProgressBy(i33);
            this.progressBar12.setMax(65);
            int i34 = defaultSharedPreferences.getInt("math2013hs", 0);
            TextView textView34 = this.r13;
            textView34.setText(i34 + "/65");
            this.progressBar13.incrementProgressBy(i34);
            this.progressBar13.setMax(65);
        }
        if (string.equals("chemistry")) {
            int i35 = defaultSharedPreferences.getInt("chem2009hs", 0);
            TextView textView35 = this.r09;
            textView35.setText(i35 + "/80");
            this.progressBar09.incrementProgressBy(i35);
            this.progressBar09.setMax(80);
            int i36 = defaultSharedPreferences.getInt("chem2010hs", 0);
            TextView textView36 = this.r10;
            textView36.setText(i36 + "/80");
            this.progressBar10.incrementProgressBy(i36);
            this.progressBar10.setMax(80);
            int i37 = defaultSharedPreferences.getInt("chem2011hs", 0);
            TextView textView37 = this.r11;
            textView37.setText(i37 + "/80");
            this.progressBar11.incrementProgressBy(i37);
            this.progressBar11.setMax(80);
            int i38 = defaultSharedPreferences.getInt("chem2012hs", 0);
            TextView textView38 = this.r12;
            textView38.setText(i38 + "/80");
            this.progressBar12.incrementProgressBy(i38);
            this.progressBar12.setMax(80);
            int i39 = defaultSharedPreferences.getInt("chem2013hs", 0);
            TextView textView39 = this.r13;
            textView39.setText(i39 + "/80");
            this.progressBar13.incrementProgressBy(i39);
            this.progressBar13.setMax(80);
        }
        if (string.equals("physics")) {
            int i40 = defaultSharedPreferences.getInt("phy2009hs", 0);
            TextView textView40 = this.r09;
            textView40.setText(i40 + "/50");
            this.progressBar09.incrementProgressBy(i40);
            this.progressBar09.setMax(50);
            int i41 = defaultSharedPreferences.getInt("phy2010hs", 0);
            TextView textView41 = this.r10;
            textView41.setText(i41 + "/50");
            this.progressBar10.incrementProgressBy(i41);
            this.progressBar10.setMax(50);
            int i42 = defaultSharedPreferences.getInt("phy2011hs", 0);
            TextView textView42 = this.r11;
            textView42.setText(i42 + "/50");
            this.progressBar11.incrementProgressBy(i42);
            this.progressBar11.setMax(50);
            int i43 = defaultSharedPreferences.getInt("phy2012hs", 0);
            TextView textView43 = this.r12;
            textView43.setText(i43 + "/50");
            this.progressBar12.incrementProgressBy(i43);
            this.progressBar12.setMax(50);
            int i44 = defaultSharedPreferences.getInt("phy2013hs", 0);
            TextView textView44 = this.r13;
            textView44.setText(i44 + "/50");
            this.progressBar13.incrementProgressBy(i44);
            this.progressBar13.setMax(50);
        }
        if (string.equals("sat")) {
            int i45 = defaultSharedPreferences.getInt("sat2009hs", 0);
            TextView textView45 = this.r09;
            textView45.setText(i45 + "/60");
            this.progressBar09.incrementProgressBy(i45);
            this.progressBar09.setMax(60);
            int i46 = defaultSharedPreferences.getInt("sat2010hs", 0);
            TextView textView46 = this.r10;
            textView46.setText(i46 + "/60");
            this.progressBar10.incrementProgressBy(i46);
            this.progressBar10.setMax(60);
            int i47 = defaultSharedPreferences.getInt("sat2011hs", 0);
            TextView textView47 = this.r11;
            textView47.setText(i47 + "/60");
            this.progressBar11.incrementProgressBy(i47);
            this.progressBar11.setMax(60);
            int i48 = defaultSharedPreferences.getInt("sat2012hs", 0);
            TextView textView48 = this.r12;
            textView48.setText(i48 + "/60");
            this.progressBar12.incrementProgressBy(i48);
            this.progressBar12.setMax(60);
            int i49 = defaultSharedPreferences.getInt("sat2013hs", 0);
            TextView textView49 = this.r13;
            textView49.setText(i49 + "/60");
            this.progressBar13.incrementProgressBy(i49);
            this.progressBar13.setMax(60);
        }
        this.y2009.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chooseyear.this.showAd();
                chooseyear.this.progressDialogLayout.setVisibility(0);
                new Thread() {
                    public void run() {
                        if (string.equals("english")) {
                            try {
                                Intent intent = new Intent(chooseyear.this.getApplicationContext(), english2009.class);
                                intent.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (string.equals("maths")) {
                            try {
                                Intent intent2 = new Intent(chooseyear.this.getApplicationContext(), maths2009.class);
                                intent2.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent2);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (string.equals("civics")) {
                            try {
                                Intent intent3 = new Intent(chooseyear.this.getApplicationContext(), civics2009.class);
                                intent3.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent3);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (string.equals("biology")) {
                            try {
                                Intent intent4 = new Intent(chooseyear.this.getApplicationContext(), bio2009.class);
                                intent4.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent4);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (string.equals("economics")) {
                            try {
                                Intent intent5 = new Intent(chooseyear.this.getApplicationContext(), economics2009.class);
                                intent5.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent5);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (string.equals("history")) {
                            try {
                                Intent intent6 = new Intent(chooseyear.this.getApplicationContext(), history2009.class);
                                intent6.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent6);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (string.equals("geography")) {
                            try {
                                Intent intent7 = new Intent(chooseyear.this.getApplicationContext(), geography2009.class);
                                intent7.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent7);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (string.equals("chemistry")) {
                            try {
                                Intent intent8 = new Intent(chooseyear.this.getApplicationContext(), chemistry2009.class);
                                intent8.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent8);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (string.equals("physics")) {
                            try {
                                Intent intent9 = new Intent(chooseyear.this.getApplicationContext(), physics2009.class);
                                intent9.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent9);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (string.equals("sat")) {
                            try {
                                Intent intent10 = new Intent(chooseyear.this.getApplicationContext(), sat2009.class);
                                intent10.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent10);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }.start();
                chooseyear.this.finish();
            }
        });
        this.y2010.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chooseyear.this.showAd();
                chooseyear.this.progressDialogLayout.setVisibility(0);
                new Thread() {
                    public void run() {
                        if (string.equals("english")) {
                            try {
                                Intent intent = new Intent(chooseyear.this.getApplicationContext(), english2010.class);
                                intent.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (string.equals("maths")) {
                            try {
                                Intent intent2 = new Intent(chooseyear.this.getApplicationContext(), maths2010.class);
                                intent2.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent2);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (string.equals("civics")) {
                            try {
                                Intent intent3 = new Intent(chooseyear.this.getApplicationContext(), civics2010.class);
                                intent3.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent3);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (string.equals("biology")) {
                            try {
                                Intent intent4 = new Intent(chooseyear.this.getApplicationContext(), bio2010.class);
                                intent4.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent4);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (string.equals("economics")) {
                            try {
                                Intent intent5 = new Intent(chooseyear.this.getApplicationContext(), economics2010.class);
                                intent5.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent5);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (string.equals("history")) {
                            try {
                                Intent intent6 = new Intent(chooseyear.this.getApplicationContext(), history2010.class);
                                intent6.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent6);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (string.equals("geography")) {
                            try {
                                Intent intent7 = new Intent(chooseyear.this.getApplicationContext(), geography2010.class);
                                intent7.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent7);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (string.equals("chemistry")) {
                            try {
                                Intent intent8 = new Intent(chooseyear.this.getApplicationContext(), chemistry2010.class);
                                intent8.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent8);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (string.equals("physics")) {
                            try {
                                Intent intent9 = new Intent(chooseyear.this.getApplicationContext(), physics2010.class);
                                intent9.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent9);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (string.equals("sat")) {
                            try {
                                Intent intent10 = new Intent(chooseyear.this.getApplicationContext(), sat2010.class);
                                intent10.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent10);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }.start();
                chooseyear.this.finish();
            }
        });
        this.y2011.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chooseyear.this.showAd();
                chooseyear.this.progressDialogLayout.setVisibility(0);
                new Thread() {
                    public void run() {
                        if (string.equals("english")) {
                            try {
                                Intent intent = new Intent(chooseyear.this.getApplicationContext(), english2011.class);
                                intent.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (string.equals("civics")) {
                            try {
                                Intent intent2 = new Intent(chooseyear.this.getApplicationContext(), civics2011.class);
                                intent2.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent2);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (string.equals("biology")) {
                            try {
                                Intent intent3 = new Intent(chooseyear.this.getApplicationContext(), bio2011.class);
                                intent3.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent3);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (string.equals("economics")) {
                            try {
                                Intent intent4 = new Intent(chooseyear.this.getApplicationContext(), economics2011.class);
                                intent4.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent4);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (string.equals("history")) {
                            try {
                                Intent intent5 = new Intent(chooseyear.this.getApplicationContext(), history2011.class);
                                intent5.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent5);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (string.equals("geography")) {
                            try {
                                Intent intent6 = new Intent(chooseyear.this.getApplicationContext(), geography2011.class);
                                intent6.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent6);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (string.equals("maths")) {
                            try {
                                Intent intent7 = new Intent(chooseyear.this.getApplicationContext(), maths2011.class);
                                intent7.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent7);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (string.equals("chemistry")) {
                            try {
                                Intent intent8 = new Intent(chooseyear.this.getApplicationContext(), chemistry2011.class);
                                intent8.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent8);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (string.equals("physics")) {
                            try {
                                Intent intent9 = new Intent(chooseyear.this.getApplicationContext(), physics2011.class);
                                intent9.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent9);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (string.equals("sat")) {
                            try {
                                Intent intent10 = new Intent(chooseyear.this.getApplicationContext(), sat2011.class);
                                intent10.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent10);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }.start();
                chooseyear.this.finish();
            }
        });
        this.y2012.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chooseyear.this.showAd();
                chooseyear.this.progressDialogLayout.setVisibility(0);
                new Thread() {
                    public void run() {
                        if (string.equals("english")) {
                            try {
                                Intent intent = new Intent(chooseyear.this.getApplicationContext(), english2012.class);
                                intent.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (string.equals("maths")) {
                            try {
                                Intent intent2 = new Intent(chooseyear.this.getApplicationContext(), maths2012.class);
                                intent2.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent2);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (string.equals("civics")) {
                            try {
                                Intent intent3 = new Intent(chooseyear.this.getApplicationContext(), civics2012.class);
                                intent3.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent3);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (string.equals("biology")) {
                            try {
                                Intent intent4 = new Intent(chooseyear.this.getApplicationContext(), bio2012.class);
                                intent4.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent4);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (string.equals("economics")) {
                            try {
                                Intent intent5 = new Intent(chooseyear.this.getApplicationContext(), economics2012.class);
                                intent5.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent5);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (string.equals("history")) {
                            try {
                                Intent intent6 = new Intent(chooseyear.this.getApplicationContext(), history2012.class);
                                intent6.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent6);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (string.equals("geography")) {
                            try {
                                Intent intent7 = new Intent(chooseyear.this.getApplicationContext(), geography2012.class);
                                intent7.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent7);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (string.equals("chemistry")) {
                            try {
                                Intent intent8 = new Intent(chooseyear.this.getApplicationContext(), chemistry2012.class);
                                intent8.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent8);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (string.equals("physics")) {
                            try {
                                Intent intent9 = new Intent(chooseyear.this.getApplicationContext(), physics2012.class);
                                intent9.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent9);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (string.equals("sat")) {
                            try {
                                Intent intent10 = new Intent(chooseyear.this.getApplicationContext(), sat2012.class);
                                intent10.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent10);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                }.start();
                chooseyear.this.finish();
            }
        });
        this.y2013.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chooseyear.this.showAd();
                chooseyear.this.progressDialogLayout.setVisibility(0);
                C28651 r3 = new Thread() {
                    public void run() {
                        if (string.equals("english")) {
                            try {
                                Intent intent = new Intent(chooseyear.this.getApplicationContext(), english2013.class);
                                intent.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (string.equals("maths")) {
                            try {
                                Intent intent2 = new Intent(chooseyear.this.getApplicationContext(), maths2013.class);
                                intent2.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent2);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (string.equals("civics")) {
                            try {
                                Intent intent3 = new Intent(chooseyear.this.getApplicationContext(), civics2013.class);
                                intent3.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent3);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (string.equals("biology")) {
                            try {
                                Intent intent4 = new Intent(chooseyear.this.getApplicationContext(), bio2013.class);
                                intent4.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent4);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (string.equals("history")) {
                            try {
                                Intent intent5 = new Intent(chooseyear.this.getApplicationContext(), history2013.class);
                                intent5.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent5);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (string.equals("geography")) {
                            try {
                                Intent intent6 = new Intent(chooseyear.this.getApplicationContext(), geography2013.class);
                                intent6.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent6);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        if (string.equals("chemistry")) {
                            try {
                                Intent intent7 = new Intent(chooseyear.this.getApplicationContext(), chemistry2013.class);
                                intent7.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent7);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (string.equals("physics")) {
                            try {
                                Intent intent8 = new Intent(chooseyear.this.getApplicationContext(), physics2013.class);
                                intent8.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent8);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e8) {
                                e8.printStackTrace();
                            }
                        }
                        if (string.equals("sat")) {
                            try {
                                Intent intent9 = new Intent(chooseyear.this.getApplicationContext(), sat2013.class);
                                intent9.putExtra("mode", "false");
                                chooseyear.this.startActivity(intent9);
                                sleep(6000);
                                super.run();
                            } catch (InterruptedException e9) {
                                e9.printStackTrace();
                            }
                        }
                    }
                };
                if (!string.equals("economics")) {
                    r3.start();
                    chooseyear.this.finish();
                }
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chooseyear.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chooseyear.this.mInterstitialAd = null;
            }
        });
    }

    /* access modifiers changed from: private */
    public void showAd() {
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.show(this);
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.");
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        InternetCheck();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        InternetCheck();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        InternetCheck();
    }

    private void InternetCheck() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.payment.setVisibility(0);
            return;
        }
        this.payment.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            unregisterReceiver(this.networkChangeListener);
        }
        super.onStop();
    }
}
