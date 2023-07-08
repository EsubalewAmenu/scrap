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

public class english2006 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEng2003;
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
    private Toolbar f553tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2006);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "us him and go up and pick", 0, 0, 0, 0, 0, "Let him go and pick up us.", "Let him up and go pick us ", "Let him go up and us pick", "Let us go and pick him up", "", "", 0));
        arrayList.add(new questions("2.", "Carefully work you did your check?", 0, 0, 0, 0, 0, "Did you work your check carefully?", "Did carefully you check your work?", "Did you carefully check your work?", "Your work did you carefully check?", "", "", 0));
        arrayList.add(new questions("3.", "People going to many invite party are to your you?", 0, 0, 0, 0, 0, "Are you going to invite many people to your party?", "Are your many people going to invite you to party?", "Are your many party going to you people to invite?", "Are you going to many party to invite your people?", "", "", 0));
        arrayList.add(new questions("4.", "Many got you how sisters have", 0, 0, 0, 0, 0, "How many got sisters you have?", "How many you have sisters got?", "How many sisters have you got?", "How many have you got sisters?", "", "", 0));
        arrayList.add(new questions("5.", "for and join come us celebration the?", 0, 0, 0, 0, 0, "Come and join for us the celebration. ", "For us the celebration come and join.", "Come and join the celebration for us.", "Come and join us for the celebration.", "", "", 0));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("6.", "a. This is the planet Venus.\nb. Venus is our nearest neighbour.\nC. However, no plants or animals could exist on Venus.\nd. There is no oxygen in the air and the planet is without water.\ne. In the evening just after sunset we see a bright object in the west.\n", 0, 0, 0, 0, 0, "d e c a b", "a e b c d", "b c a d e", "e a b c d", "", "", 0));
        arrayList2.add(new questions("7.", "a. Dallol is found in the Afar Region of Ethiopia.\nb. It is one of the lowest and hottest areas of the world.\nC. Temperatures can reach as high as 145°C in the sun.\nd. This makes the place very difficult for wild life to live and vegetation to grow\ne. There is no rain for most of the year, and the highest annual rainfall is only 200mm\n", 0, 0, 0, 0, 0, "c e a d", "b a b c e d ", "e c a b d", "c a b e d ", "", "", 0));
        arrayList2.add(new questions("8.", "a. This may not be practical as it is at the expensive end.\nb. Segregation of waste should also be seriously considered.\nc. Cities must look at their waste economy and invest in re-use.\nd. This helps to clean up relatively less toxic waste to irrigate fields.\ne. For instance, Singapore uses membrane technology to clean up waste water. \n", 0, 0, 0, 0, 0, "c e a b d", "c b e d a", "c d e b a", "c a b e d ", "", "", 0));
        arrayList2.add(new questions("9.", "a. Informative speech is meant to convey knowledge.\nb. She/He should also organize her/his speech coherently.\nC. Its application in other spheres of life is also common.\nd. This type of speech is mostly practiced in the academia.\ne. The user of such a speech should prepare her/himself very well.\n", 0, 0, 0, 0, 0, "a d c e b", "a c d e b ", "a c e b d ", "a e d b c", "", "", 0));
        arrayList2.add(new questions("10.", "a. Every year one million children die of malaria.\nb. Malaria is very common in many parts of the world.\nC. However, people must also cooperate to stop its spread.\nd. Governments have special programmes to Control malaria.\ne. Many others cannot go to school or work because of malaria.\n", 0, 0, 0, 0, 0, "a b c e d", "b a e d c ", "b d a e c", "a e b c d", "", "", 0));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("11.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("12.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("13.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("14.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("15.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("16.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList3.add(new questions("17.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("20.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("21.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("22.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("23.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("24.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("25.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList4.add(new questions("26.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("27.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("28.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("29.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("30.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("31.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("32.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("33.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("34.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("35.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("36.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("37.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("38.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("39.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("40.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("41.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("42.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("43.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("44.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("45.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList5.add(new questions("46.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("47.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("48.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("49.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("50.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("51.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("52.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("53.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("54.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("55.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("56.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList6.add(new questions("57.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("58.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("59.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("60.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("61.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("62.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("63.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("64.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("65.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("66.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("67.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("68.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("69.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("70.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("71.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("72.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("73.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("74.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("75.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("76.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("77.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("78.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("79.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("80.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("81.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("82.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("83.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList7.add(new questions("84.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("85.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("86.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("87.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("88.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("89.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("90.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("91.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("92.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("93.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("94.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("95.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("96.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("97.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("98.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("99.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("100.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList8.add(new questions("105.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("106.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("107.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("108.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("109.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("110.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("111.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("112.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("113.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("114.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("115.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("116.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("117.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("118.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("119.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        arrayList9.add(new questions("120.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "", 0));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f553tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2006.this.timer.setVisibility(0);
                    english2006.this.timer.setText(format);
                }

                public void onFinish() {
                    Toast.makeText(english2006.this, "LLLLLLLL", 0).show();
                }
            }.start();
        } else {
            this.chr.setVisibility(0);
            this.chr.start();
        }
        this.finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2006.this.scr.setVisibility(8);
                english2006.this.chr.stop();
                english2006.this.toolbar.setVisibility(8);
                english2006.this.Relative.setBackgroundColor(-7829368);
                english2006.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2006.this.getBaseContext());
                int unused = english2006.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = english2006.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = english2006.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = english2006.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = english2006.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = english2006.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = english2006.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = english2006.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = english2006.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = english2006.this.highscoreEng2003 = defaultSharedPreferences.getInt("eng2003hs", 0);
                int access$600 = english2006.this.part1 + english2006.this.part2 + english2006.this.part3 + english2006.this.part4 + english2006.this.part5 + english2006.this.part6 + english2006.this.part7 + english2006.this.part8 + english2006.this.part9;
                english2006.this.resultText.setText(String.valueOf(access$600));
                english2006.this.progressbar.setProgress(access$600);
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
                if (access$600 > english2006.this.highscoreEng2003) {
                    edit.putInt("eng2003hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2006.this.scr.setVisibility(8);
                english2006.this.chr.stop();
                english2006.this.toolbar.setVisibility(8);
                english2006.this.Relative.setBackgroundColor(-7829368);
                english2006.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2006.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
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
                english2006.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
