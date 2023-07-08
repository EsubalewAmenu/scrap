package com.visionapps.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class economics2013 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;
    /* access modifiers changed from: private */
    public int answered1;
    /* access modifiers changed from: private */
    public int answered10;
    /* access modifiers changed from: private */
    public int answered2;
    /* access modifiers changed from: private */
    public int answered3;
    /* access modifiers changed from: private */
    public int answered4;
    /* access modifiers changed from: private */
    public int answered5;
    /* access modifiers changed from: private */
    public int answered6;
    /* access modifiers changed from: private */
    public int answered7;
    /* access modifiers changed from: private */
    public int answered8;
    /* access modifiers changed from: private */
    public int answered9;

    /* renamed from: b */
    private Boolean f551b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEconomics2013;
    /* access modifiers changed from: private */
    public View layout;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    /* access modifiers changed from: private */
    public Boolean mode;
    /* access modifiers changed from: private */
    public int part1;
    /* access modifiers changed from: private */
    public int part2;
    /* access modifiers changed from: private */
    public int part3;
    /* access modifiers changed from: private */
    public int part4;
    /* access modifiers changed from: private */
    public int part5;
    /* access modifiers changed from: private */
    public int part6;
    /* access modifiers changed from: private */
    public int part7;
    /* access modifiers changed from: private */
    public int part8;
    /* access modifiers changed from: private */
    public int part9;
    /* access modifiers changed from: private */
    public ProgressBar progressbar;
    RecyclerView recview;
    RecyclerView recview2;
    RecyclerView recview3;
    RecyclerView recview4;
    RecyclerView recview5;
    RecyclerView recview6;
    RecyclerView recview7;
    RecyclerView recview8;
    RecyclerView recview9;
    private TextView report;
    /* access modifiers changed from: private */
    public TextView resultText;
    /* access modifiers changed from: private */
    public ScrollView scr;

    /* renamed from: tb */
    private Toolbar f552tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_economics2013);
        this.f551b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEconomics2012);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_economics2013);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("2.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("3.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("4.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("5.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("6.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("7.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("8.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("9.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("10.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("11.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("12.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("13.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("14.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("15.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("16.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("17.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("18.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("19.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("20.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("21.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("22.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("23.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("24.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("25.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("26.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("27.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("28.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("29.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("30.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("31.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("32.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("33.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("34.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("35.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("36.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("37.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("38.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("39.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("40.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("41.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("42.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("43.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("44.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("45.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("46.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("47.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("48.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("49.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("50.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("51.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("52.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("53.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("54.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("55.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("56.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("57.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("58.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("59.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("60.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("61.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("62.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("63.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("64.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("65.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("66.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("67.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("68.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("69.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("70.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("71.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("72.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("73.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("74.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("75.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("76.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("77.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("78.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("79.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("80.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("81.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("82.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("83.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("84.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("85.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("86.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("87.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("88.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("89.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("90.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("91.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("92.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("93.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("94.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("95.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("96.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("97.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("98.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("99.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        arrayList.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f551b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f552tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    economics2013.this.timer.setVisibility(0);
                    economics2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    economics2013.this.scr.setVisibility(8);
                    economics2013.this.chr.stop();
                    economics2013.this.toolbar.setVisibility(8);
                    economics2013.this.Relative.setBackgroundColor(-7829368);
                    economics2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2013.this.getBaseContext());
                    int unused = economics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = economics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = economics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = economics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = economics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = economics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = economics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = economics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = economics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = economics2013.this.highscoreEconomics2013 = defaultSharedPreferences.getInt("econ2013hs", 0);
                    int access$600 = economics2013.this.part1 + economics2013.this.part2 + economics2013.this.part3 + economics2013.this.part4 + economics2013.this.part5 + economics2013.this.part6 + economics2013.this.part7 + economics2013.this.part8 + economics2013.this.part9;
                    economics2013.this.resultText.setText(String.valueOf(access$600));
                    economics2013.this.progressbar.setProgress(access$600);
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("ans1", 0);
                    edit.putInt("ans2", 0);
                    edit.putInt("ans3", 0);
                    edit.putInt("ans4", 0);
                    edit.putInt("ans5", 0);
                    edit.putInt("ans6", 0);
                    edit.putInt("ans7", 0);
                    edit.putInt("ans8", 0);
                    edit.putInt("ans9", 0);
                    int unused11 = economics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = economics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = economics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = economics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = economics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = economics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = economics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = economics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "econ2013hs";
                    int unused19 = economics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = economics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = economics2013.this.answered1 + economics2013.this.answered2 + economics2013.this.answered3 + economics2013.this.answered4 + economics2013.this.answered5 + economics2013.this.answered6 + economics2013.this.answered7 + economics2013.this.answered8 + economics2013.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > economics2013.this.highscoreEconomics2013) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 75;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - economics2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1econ131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1econ132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1econ133", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1econ134", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1econ135", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1econ136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1econ137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1econ138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1econ139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1econ1310", 0);
                    Date date = new Date(j);
                    Date date2 = new Date(j2);
                    Date date3 = new Date(j3);
                    Date date4 = new Date(j4);
                    Date date5 = new Date(j5);
                    Date date6 = new Date(j6);
                    Date date7 = new Date(j7);
                    Date date8 = new Date(j8);
                    Date date9 = new Date(j9);
                    Date date10 = new Date(j10);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(date);
                    arrayList.add(date2);
                    arrayList.add(date3);
                    arrayList.add(date4);
                    arrayList.add(date5);
                    arrayList.add(date6);
                    arrayList.add(date7);
                    arrayList.add(date8);
                    arrayList.add(date9);
                    arrayList.add(date10);
                    Date date11 = (Date) Collections.min(arrayList);
                    if (date11.compareTo(date) == 0) {
                        editor = editor3;
                        editor.putString("scoreecon131", str3);
                        editor.putLong("date1econ131", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreecon132", str5);
                            editor.putLong("date1econ132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreecon133", str5);
                            editor.putLong("date1econ133", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreecon134", str5);
                            editor.putLong("date1econ134", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreecon135", str5);
                            editor.putLong("date1econ135", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreecon136", str5);
                            editor.putLong("date1econ136", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreecon137", str5);
                            editor.putLong("date1econ137", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreecon138", str5);
                            editor.putLong("date1econ138", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreecon139", str5);
                            editor.putLong("date1econ139", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreecon1310", str5);
                            editor.putLong("date1econ1310", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateecon131", 0);
                    long j12 = defaultSharedPreferences.getLong("dateecon132", 0);
                    long j13 = defaultSharedPreferences.getLong("dateecon133", 0);
                    long j14 = defaultSharedPreferences.getLong("dateecon134", 0);
                    long j15 = defaultSharedPreferences.getLong("dateecon135", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateecon136", 0);
                    long j17 = defaultSharedPreferences.getLong("dateecon137", 0);
                    long j18 = defaultSharedPreferences.getLong("dateecon138", 0);
                    long j19 = defaultSharedPreferences.getLong("dateecon139", 0);
                    long j20 = defaultSharedPreferences.getLong("dateecon1310", 0);
                    Date date12 = new Date(j11);
                    Date date13 = new Date(j12);
                    Date date14 = new Date(j13);
                    Date date15 = new Date(j14);
                    Date date16 = new Date(j15);
                    Date date17 = new Date(j16);
                    Date date18 = new Date(j17);
                    Date date19 = new Date(j18);
                    Date date20 = new Date(j19);
                    Date date21 = new Date(j20);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(date12);
                    arrayList2.add(date13);
                    arrayList2.add(date14);
                    arrayList2.add(date15);
                    arrayList2.add(date16);
                    arrayList2.add(date17);
                    arrayList2.add(date18);
                    arrayList2.add(date19);
                    arrayList2.add(date20);
                    arrayList2.add(date21);
                    Date date22 = (Date) Collections.min(arrayList2);
                    if (date22.compareTo(date12) == 0) {
                        editor2 = editor4;
                        editor2.putString("iScoreecon131", str4);
                        editor2.putLong("dateecon131", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreecon132", str6);
                            editor2.putLong("dateecon132", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreecon133", str6);
                            editor2.putLong("dateecon133", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreecon134", str6);
                            editor2.putLong("dateecon134", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreecon135", str6);
                            editor2.putLong("dateecon135", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreecon136", str6);
                            editor2.putLong("dateecon136", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreecon137", str6);
                            editor2.putLong("dateecon137", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreecon138", str6);
                            editor2.putLong("dateecon138", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreecon139", str6);
                            editor2.putLong("dateecon139", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreecon1310", str6);
                            editor2.putLong("dateecon1310", l.longValue());
                        }
                    }
                    editor2.commit();
                }
            }.start();
        } else {
            this.chr.setVisibility(0);
            this.chr.start();
        }
        this.finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                new Runnable() {
                    public void run() {
                        SharedPreferences.Editor editor;
                        SharedPreferences.Editor editor2;
                        SharedPreferences.Editor editor3;
                        SharedPreferences.Editor editor4;
                        economics2013.this.scr.setVisibility(8);
                        economics2013.this.chr.stop();
                        economics2013.this.toolbar.setVisibility(8);
                        economics2013.this.Relative.setBackgroundColor(-7829368);
                        economics2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2013.this.getBaseContext());
                        int unused = economics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = economics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = economics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = economics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = economics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = economics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = economics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = economics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = economics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = economics2013.this.highscoreEconomics2013 = defaultSharedPreferences.getInt("econ2013hs", 0);
                        int access$600 = economics2013.this.part1 + economics2013.this.part2 + economics2013.this.part3 + economics2013.this.part4 + economics2013.this.part5 + economics2013.this.part6 + economics2013.this.part7 + economics2013.this.part8 + economics2013.this.part9;
                        TextView access$1600 = economics2013.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        economics2013.this.progressbar.setProgress(access$600);
                        economics2013.this.progressbar.setMax(80);
                        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                        edit.putInt("ans1", 0);
                        edit.putInt("ans2", 0);
                        edit.putInt("ans3", 0);
                        edit.putInt("ans4", 0);
                        edit.putInt("ans5", 0);
                        edit.putInt("ans6", 0);
                        edit.putInt("ans7", 0);
                        edit.putInt("ans8", 0);
                        edit.putInt("ans9", 0);
                        int unused11 = economics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = economics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = economics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = economics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = economics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = economics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = economics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = economics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = economics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = economics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = economics2013.this.answered1 + economics2013.this.answered2 + economics2013.this.answered3 + economics2013.this.answered4 + economics2013.this.answered5 + economics2013.this.answered6 + economics2013.this.answered7 + economics2013.this.answered8 + economics2013.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > economics2013.this.highscoreEconomics2013) {
                            edit.putInt("econ2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - economics2013.this.chr.getBase()) / 1000;
                        String str = "dateecon1310";
                        String str2 = "dateecon139";
                        String str3 = "dateecon138";
                        String str4 = "dateecon137";
                        String str5 = "dateecon136";
                        String str6 = "dateecon135";
                        String str7 = "dateecon134";
                        String str8 = "dateecon133";
                        String str9 = "dateecon132";
                        String str10 = "dateecon131";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1econ1310";
                        String str12 = "date1econ139";
                        if (economics2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1econ131", 0);
                            String str13 = "date1econ131";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1econ132", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1econ133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1econ134", 0);
                            long j5 = defaultSharedPreferences.getLong("date1econ135", 0);
                            String str16 = "date1econ135";
                            String str17 = "date1econ134";
                            String str18 = "date1econ136";
                            long j6 = defaultSharedPreferences.getLong("date1econ136", 0);
                            long j7 = defaultSharedPreferences.getLong("date1econ137", 0);
                            String str19 = str12;
                            String str20 = "date1econ138";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1econ137";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1econ133";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1econ138", 0));
                            Date date9 = new Date(j8);
                            Date date10 = new Date(j9);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(date);
                            arrayList.add(date2);
                            arrayList.add(date3);
                            arrayList.add(date4);
                            arrayList.add(date5);
                            Date date11 = date7;
                            arrayList.add(date11);
                            arrayList.add(date6);
                            arrayList.add(date8);
                            arrayList.add(date9);
                            arrayList.add(date10);
                            Date date12 = (Date) Collections.min(arrayList);
                            if (date12.compareTo(date) == 0) {
                                editor3 = editor5;
                                editor3.putString("scoreecon131", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreecon132", str25);
                                    editor3.putLong("date1econ132", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreecon133", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreecon134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreecon135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreecon136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreecon137", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreecon138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreecon139", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreecon1310", str25);
                                    editor3.putLong(str22, l.longValue());
                                }
                            }
                            String str26 = str10;
                            long j10 = sharedPreferences.getLong(str26, 0);
                            String str27 = str9;
                            long j11 = sharedPreferences.getLong(str27, 0);
                            long j12 = sharedPreferences.getLong(str8, 0);
                            SharedPreferences.Editor editor6 = editor3;
                            long j13 = sharedPreferences.getLong(str7, 0);
                            long j14 = sharedPreferences.getLong(str6, 0);
                            long j15 = sharedPreferences.getLong(str5, 0);
                            long j16 = sharedPreferences.getLong(str4, 0);
                            long j17 = sharedPreferences.getLong(str3, 0);
                            long j18 = sharedPreferences.getLong(str2, 0);
                            long j19 = sharedPreferences.getLong(str, 0);
                            Date date13 = new Date(j10);
                            Date date14 = new Date(j11);
                            Date date15 = new Date(j12);
                            Date date16 = new Date(j13);
                            Date date17 = new Date(j14);
                            Date date18 = new Date(j15);
                            Date date19 = new Date(j16);
                            Date date20 = new Date(j17);
                            Date date21 = new Date(j18);
                            Date date22 = new Date(j19);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            arrayList2.add(date16);
                            arrayList2.add(date17);
                            arrayList2.add(date18);
                            arrayList2.add(date19);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            Date date23 = (Date) Collections.min(arrayList2);
                            if (date23.compareTo(date13) == 0) {
                                editor4 = editor6;
                                editor4.putString("iScoreecon131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreecon132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreecon133", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreecon134", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreecon135", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreecon136", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreecon137", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreecon138", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreecon139", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreecon1310", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1econ131";
                            String str30 = "date1econ134";
                            String str31 = str12;
                            String str32 = "date1econ133";
                            String str33 = "date1econ137";
                            String str34 = "date1econ136";
                            String str35 = str11;
                            String str36 = "date1econ135";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1econ132", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1econ132";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1econ138";
                            long j27 = sharedPreferences2.getLong(str46, 0);
                            String str47 = str31;
                            long j28 = sharedPreferences2.getLong(str31, 0);
                            long j29 = sharedPreferences2.getLong(str11, 0);
                            Date date24 = new Date(j20);
                            Date date25 = new Date(j21);
                            Date date26 = new Date(j22);
                            Date date27 = new Date(j23);
                            Date date28 = new Date(j24);
                            Date date29 = new Date(j25);
                            Date date30 = new Date(j26);
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            Date date31 = new Date(j27);
                            String str48 = str46;
                            Date date32 = new Date(j28);
                            Date date33 = new Date(j29);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(date24);
                            arrayList3.add(date25);
                            arrayList3.add(date26);
                            arrayList3.add(date27);
                            arrayList3.add(date28);
                            arrayList3.add(date29);
                            arrayList3.add(date30);
                            arrayList3.add(date31);
                            arrayList3.add(date32);
                            arrayList3.add(date33);
                            Date date34 = (Date) Collections.min(arrayList3);
                            if (date34.compareTo(date24) == 0) {
                                editor2 = editor5;
                                editor2.putString("scoreecon131", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreecon132", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreecon133", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreecon134", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreecon135", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreecon136", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreecon137", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreecon138", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreecon139", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreecon1310", str49);
                                    editor2.putLong(str11, valueOf2.longValue());
                                }
                            }
                            SharedPreferences sharedPreferences4 = sharedPreferences3;
                            String str50 = str10;
                            long j30 = sharedPreferences4.getLong(str50, 0);
                            long j31 = sharedPreferences4.getLong(str9, 0);
                            String str51 = str8;
                            long j32 = sharedPreferences4.getLong(str51, 0);
                            SharedPreferences.Editor editor7 = editor2;
                            long j33 = sharedPreferences4.getLong(str7, 0);
                            String str52 = str6;
                            Long l2 = valueOf2;
                            long j34 = sharedPreferences4.getLong(str52, 0);
                            String str53 = str52;
                            long j35 = sharedPreferences4.getLong(str5, 0);
                            long j36 = sharedPreferences4.getLong(str4, 0);
                            long j37 = sharedPreferences4.getLong(str3, 0);
                            long j38 = sharedPreferences4.getLong(str2, 0);
                            String str54 = str;
                            long j39 = sharedPreferences4.getLong(str54, 0);
                            Date date35 = new Date(j30);
                            Date date36 = new Date(j31);
                            Date date37 = new Date(j32);
                            Date date38 = new Date(j33);
                            Date date39 = new Date(j34);
                            Date date40 = new Date(j35);
                            Date date41 = new Date(j36);
                            String str55 = str51;
                            Date date42 = new Date(j37);
                            Date date43 = new Date(j38);
                            Date date44 = new Date(j39);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date35);
                            arrayList4.add(date36);
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date39);
                            arrayList4.add(date40);
                            Date date45 = date41;
                            arrayList4.add(date45);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            arrayList4.add(date44);
                            Date date46 = (Date) Collections.min(arrayList4);
                            if (date46.compareTo(date35) == 0) {
                                editor = editor7;
                                editor.putString("iScoreecon131", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreecon132", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreecon133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreecon134", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreecon135", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreecon136", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreecon137", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreecon138", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreecon139", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreecon1310", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        economics2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2013.this.scr.setVisibility(8);
                economics2013.this.chr.stop();
                economics2013.this.toolbar.setVisibility(8);
                economics2013.this.Relative.setBackgroundColor(economics2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                economics2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2013.this.scr.setVisibility(0);
                economics2013.this.toolbar.setVisibility(0);
                economics2013.this.telegram_layout.setVisibility(8);
                economics2013.this.chr.start();
                economics2013.this.Relative.setBackgroundColor(economics2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = economics2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = economics2013.this.mInterstitialAd = null;
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
            showAd();
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                economics2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
