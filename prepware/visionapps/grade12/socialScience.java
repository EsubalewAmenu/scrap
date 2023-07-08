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

public class socialScience extends AppCompatActivity {
    private CardView cardAptitude;
    private CardView cardCivics;
    private CardView cardEconomics;
    private CardView cardEnglish;
    private CardView cardGeography;
    private CardView cardHistory;
    private CardView cardMath;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    private RelativeLayout naturalLayout;
    private CardView natural_no_internet_card;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private Button reloadBtn;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_social_science);
        this.cardEnglish = (CardView) findViewById(C2719R.C2722id.cardEnglish);
        this.cardMath = (CardView) findViewById(C2719R.C2722id.cardMath);
        this.cardEconomics = (CardView) findViewById(C2719R.C2722id.cardEconomics);
        this.cardGeography = (CardView) findViewById(C2719R.C2722id.cardGeography);
        this.cardHistory = (CardView) findViewById(C2719R.C2722id.cardHistory);
        this.cardCivics = (CardView) findViewById(C2719R.C2722id.cardCivics);
        this.cardAptitude = (CardView) findViewById(C2719R.C2722id.cardAptitude);
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
        InternetCheck();
        this.cardEnglish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, english.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardMath.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, maths.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardEconomics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, economics.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardGeography.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, geography.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardHistory.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, history.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardCivics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, civics.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
        this.cardAptitude.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(socialScience.this, sat.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(socialScience.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        socialScience.this.startActivity(intent, bundle);
                        if (string.equals("unpaid")) {
                            socialScience.this.showAd();
                        }
                    }
                }.run();
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = socialScience.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = socialScience.this.mInterstitialAd = null;
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
