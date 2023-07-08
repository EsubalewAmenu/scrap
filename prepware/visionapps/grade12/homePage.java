package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.visionapps.grade12.Utility.NetworkChangeListener;

public class homePage extends AppCompatActivity {
    LinearLayout areyousure;
    CardView cardAboutUs;
    CardView cardHome;
    CardView cardLogout;
    CardView cardProfile;
    CardView cardReport;
    CardView cardSetting;
    boolean doubleBackToExitPressedOnce = false;
    Button logoutno;
    Button logoutyes;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    private ReviewManager manager;
    private RelativeLayout naturalLayout;
    private CardView natural_no_internet_card;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    Button premium;
    ProgressBar progressBar;
    ProgressDialog progressDialog;
    private ReviewInfo reviewinfo;
    Button updatecheck;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_home_page);
        activatereviewinfo();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        int i = defaultSharedPreferences.getInt("reviewnum", 0);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putInt("reviewnum", i);
        edit.commit();
        activatereview();
        this.progressBar = (ProgressBar) findViewById(C2719R.C2722id.home_progressbar);
        this.areyousure = (LinearLayout) findViewById(C2719R.C2722id.areyousure);
        this.logoutyes = (Button) findViewById(C2719R.C2722id.logoutyes);
        this.logoutno = (Button) findViewById(C2719R.C2722id.logoutno);
        this.naturalLayout = (RelativeLayout) findViewById(C2719R.C2722id.natural_layout);
        this.natural_no_internet_card = (CardView) findViewById(C2719R.C2722id.natural_no_internet_card);
        final String string = Settings.Secure.getString(getContentResolver(), "android_id");
        try {
            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (string.equals(((User) dataSnapshot.getValue(User.class)).oldid)) {
                        FirebaseAuth.getInstance().signOut();
                        homePage.this.startActivity(new Intent(homePage.this, already.class), ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle());
                    }
                }

                public void onCancelled(DatabaseError databaseError) {
                    Toast.makeText(homePage.this, "Something went wrong", 0).show();
                }
            });
        } catch (NullPointerException unused) {
        }
        PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid");
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        final String string2 = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("field", "");
        CardView cardView = (CardView) findViewById(C2719R.C2722id.cardHome);
        this.cardHome = cardView;
        cardView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homePage.this.progressDialog = new ProgressDialog(homePage.this);
                homePage.this.progressDialog.show();
                homePage.this.progressDialog.setContentView(C2719R.C2724layout.progress_dialog);
                homePage.this.progressDialog.getWindow().setBackgroundDrawableResource(17170445);
                new Thread() {
                    public void run() {
                        try {
                            sleep(6000);
                            homePage.this.progressDialog.dismiss();
                            super.run();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                if (string2.equals("Natural Science")) {
                    homePage.this.startActivity(new Intent(homePage.this, Naturalscience.class), ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle());
                    return;
                }
                homePage.this.startActivity(new Intent(homePage.this, socialScience.class), ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle());
            }
        });
        CardView cardView2 = (CardView) findViewById(C2719R.C2722id.cardReport);
        this.cardReport = cardView2;
        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homePage.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        CardView cardView3 = (CardView) findViewById(C2719R.C2722id.cardProfile);
        this.cardProfile = cardView3;
        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(homePage.this, Editprofile.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        homePage.this.startActivity(intent, bundle);
                        homePage.this.showAd();
                    }
                }.run();
                homePage.this.finish();
            }
        });
        CardView cardView4 = (CardView) findViewById(C2719R.C2722id.cardLogout);
        this.cardLogout = cardView4;
        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homePage.this.areyousure.setVisibility(0);
                homePage.this.showAd();
                homePage.this.cardHome.setClickable(false);
                homePage.this.cardProfile.setClickable(false);
                homePage.this.cardLogout.setClickable(false);
                homePage.this.cardSetting.setClickable(false);
            }
        });
        this.logoutyes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                homePage.this.startActivity(new Intent(homePage.this, already.class), ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle());
                homePage.this.finish();
            }
        });
        this.logoutno.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homePage.this.areyousure.setVisibility(8);
                homePage.this.cardHome.setClickable(true);
                homePage.this.cardProfile.setClickable(true);
                homePage.this.cardLogout.setClickable(true);
                homePage.this.cardSetting.setClickable(true);
            }
        });
        CardView cardView5 = (CardView) findViewById(C2719R.C2722id.cardSetting);
        this.cardSetting = cardView5;
        cardView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(homePage.this, Settings.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        homePage.this.startActivity(intent, bundle);
                        homePage.this.showAd();
                    }
                }.run();
                homePage.this.finish();
            }
        });
        CardView cardView6 = (CardView) findViewById(C2719R.C2722id.cardAbout);
        this.cardAboutUs = cardView6;
        cardView6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final Intent intent = new Intent(homePage.this, aboutUs.class);
                final Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(homePage.this, new Pair[0]).toBundle();
                new Runnable() {
                    public void run() {
                        homePage.this.startActivity(intent, bundle);
                        homePage.this.showAd();
                    }
                }.run();
            }
        });
        Button button = (Button) findViewById(C2719R.C2722id.updatecheck);
        this.updatecheck = button;
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                homePage.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.visionapps.grade12")));
            }
        });
        Button button2 = (Button) findViewById(C2719R.C2722id.premium);
        this.premium = button2;
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (PreferenceManager.getDefaultSharedPreferences(homePage.this.getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
                    homePage.this.startActivity(new Intent(homePage.this, payforpremium.class));
                    return;
                }
                homePage.this.startActivity(new Intent(homePage.this, C3394stats.class));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = homePage.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = homePage.this.mInterstitialAd = null;
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

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                homePage.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            unregisterReceiver(this.networkChangeListener);
        }
        super.onStop();
    }

    public void activatereviewinfo() {
        ReviewManager create = ReviewManagerFactory.create(this);
        this.manager = create;
        create.requestReviewFlow().addOnCompleteListener(new homePage$$ExternalSyntheticLambda0(this));
    }

    /* renamed from: lambda$activatereviewinfo$0$com-visionapps-grade12-homePage  reason: not valid java name */
    public /* synthetic */ void m423lambda$activatereviewinfo$0$comvisionappsgrade12homePage(Task task) {
        if (task.isSuccessful()) {
            this.reviewinfo = (ReviewInfo) task.getResult();
        } else {
            Toast.makeText(this, "Failed to start In-app review.", 0).show();
        }
    }

    public void startreviewflow() {
        ReviewInfo reviewInfo = this.reviewinfo;
        if (reviewInfo != null) {
            this.manager.launchReviewFlow(this, reviewInfo).addOnCompleteListener(new homePage$$ExternalSyntheticLambda1(this));
        }
    }

    /* renamed from: lambda$startreviewflow$1$com-visionapps-grade12-homePage  reason: not valid java name */
    public /* synthetic */ void m424lambda$startreviewflow$1$comvisionappsgrade12homePage(Task task) {
        Toast.makeText(this, "Rating is complete.", 0).show();
    }

    public void activatereview() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getInt("reviewnum", 0) >= 5) {
            startreviewflow();
        }
    }
}
