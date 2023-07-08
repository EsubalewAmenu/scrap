package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
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

public class Naturalscience extends AppCompatActivity {
    private CardView cardAptitude;
    private CardView cardBiology;
    private CardView cardChemistry;
    private CardView cardCivics;
    private CardView cardEnglish;
    private CardView cardMath;
    private CardView cardPhysics;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    private RelativeLayout naturalLayout;
    private CardView natural_no_internet_card;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private Button reloadBtn;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_naturalscience);
        this.cardEnglish = (CardView) findViewById(C2719R.C2722id.cardEnglish);
        this.cardMath = (CardView) findViewById(C2719R.C2722id.cardMath);
        this.cardBiology = (CardView) findViewById(C2719R.C2722id.cardBiology);
        this.cardChemistry = (CardView) findViewById(C2719R.C2722id.cardChemistry);
        this.cardPhysics = (CardView) findViewById(C2719R.C2722id.cardPhysics);
        this.cardCivics = (CardView) findViewById(C2719R.C2722id.cardCivics);
        this.cardAptitude = (CardView) findViewById(C2719R.C2722id.cardAptitude);
        this.reloadBtn = (Button) findViewById(C2719R.C2722id.no_internet_button);
        this.naturalLayout = (RelativeLayout) findViewById(C2719R.C2722id.natural_layout);
        this.natural_no_internet_card = (CardView) findViewById(C2719R.C2722id.natural_no_internet_card);
        final String string = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid");
        if (string.equals("unpaid")) {
            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                }
            });
            LoadAd();
        }
        this.cardEnglish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, english.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardMath.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, maths.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardBiology.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, biology.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardChemistry.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, chemistry.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardPhysics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, physics.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardCivics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, civics.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardAptitude.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(Naturalscience.this, sat.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(Naturalscience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        Naturalscience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            Naturalscience.this.showAd();
                        }
                    }
                }.run();
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = Naturalscience.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = Naturalscience.this.mInterstitialAd = null;
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
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            unregisterReceiver(this.networkChangeListener);
        }
        super.onStop();
    }
}
