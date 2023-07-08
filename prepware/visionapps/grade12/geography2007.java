package com.visionapps.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
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
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class geography2007 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f566b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2007;
    /* access modifiers changed from: private */
    public View layout;
    private Boolean mode;
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
    private Toolbar f567tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2007);
        this.f566b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2007);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2007);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("2.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("3.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("4.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("5.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("6.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("7.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("8.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("9.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("10.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("11.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("12.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("13.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("14.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("15.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("16.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("17.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("18.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("19.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("20.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("21.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("22.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("23.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("24.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("25.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("26.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("27.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("28.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("29.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("30.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("31.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("32.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("33.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("34.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("35.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("36.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("37.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("38.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("39.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("40.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("41.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("42.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("43.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("44.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("45.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("46.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("47.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("48.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("49.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("50.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("51.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("52.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("53.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("54.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("55.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("56.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("57.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("58.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("59.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("60.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("61.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("62.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("63.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("64.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("65.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("66.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("67.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("68.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("69.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("70.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("71.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("72.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("73.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("74.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("75.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("76.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("77.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("78.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("79.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("80.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("81.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("82.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("83.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("84.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("85.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("86.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("87.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("88.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("89.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("90.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("91.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("92.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("93.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("94.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("95.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("96.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("97.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("98.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("99.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
        arrayList.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0, 1, this.f566b));
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
        this.f567tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2007.this.timer.setVisibility(0);
                    geography2007.this.timer.setText(format);
                }

                public void onFinish() {
                    geography2007.this.scr.setVisibility(8);
                    geography2007.this.chr.stop();
                    geography2007.this.toolbar.setVisibility(8);
                    geography2007.this.Relative.setBackgroundColor(-7829368);
                    geography2007.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2007.this.getBaseContext());
                    int unused = geography2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2007.this.highscoreGeography2007 = defaultSharedPreferences.getInt("Geography2007hs", 0);
                    int access$600 = geography2007.this.part1 + geography2007.this.part2 + geography2007.this.part3 + geography2007.this.part4 + geography2007.this.part5 + geography2007.this.part6 + geography2007.this.part7 + geography2007.this.part8 + geography2007.this.part9;
                    geography2007.this.resultText.setText(String.valueOf(access$600));
                    geography2007.this.progressbar.setProgress(access$600);
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
                    if (access$600 > geography2007.this.highscoreGeography2007) {
                        edit.putInt("Geography2007hs", access$600);
                    }
                    edit.commit();
                }
            }.start();
        } else {
            this.chr.setVisibility(0);
            this.chr.start();
        }
        this.finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2007.this.scr.setVisibility(8);
                geography2007.this.chr.stop();
                geography2007.this.toolbar.setVisibility(8);
                geography2007.this.Relative.setBackgroundColor(-7829368);
                geography2007.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2007.this.getBaseContext());
                int unused = geography2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = geography2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = geography2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = geography2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = geography2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = geography2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = geography2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = geography2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = geography2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = geography2007.this.highscoreGeography2007 = defaultSharedPreferences.getInt("Geography2007hs", 0);
                int access$600 = geography2007.this.part1 + geography2007.this.part2 + geography2007.this.part3 + geography2007.this.part4 + geography2007.this.part5 + geography2007.this.part6 + geography2007.this.part7 + geography2007.this.part8 + geography2007.this.part9;
                geography2007.this.resultText.setText(String.valueOf(access$600));
                geography2007.this.progressbar.setProgress(access$600);
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
                if (access$600 > geography2007.this.highscoreGeography2007) {
                    edit.putInt("Geography2007hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2007.this.scr.setVisibility(8);
                geography2007.this.chr.stop();
                geography2007.this.toolbar.setVisibility(8);
                geography2007.this.Relative.setBackgroundColor(geography2007.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2007.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2007.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2007.this.scr.setVisibility(0);
                geography2007.this.toolbar.setVisibility(0);
                geography2007.this.telegram_layout.setVisibility(8);
                geography2007.this.chr.start();
                geography2007.this.Relative.setBackgroundColor(geography2007.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            startActivity(new Intent(this, Naturalscience.class));
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                geography2007.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
