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
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class sat2011 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;
    /* access modifiers changed from: private */
    public int answered1;
    /* access modifiers changed from: private */
    public int answered10;
    /* access modifiers changed from: private */
    public int answered11;
    /* access modifiers changed from: private */
    public int answered12;
    /* access modifiers changed from: private */
    public int answered13;
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
    private Boolean f628b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscore;
    /* access modifiers changed from: private */
    public View layout;
    /* access modifiers changed from: private */
    public InterstitialAd mInterstitialAd;
    /* access modifiers changed from: private */
    public Boolean mode;
    /* access modifiers changed from: private */
    public int part1;
    /* access modifiers changed from: private */
    public int part10;
    /* access modifiers changed from: private */
    public int part11;
    /* access modifiers changed from: private */
    public int part12;
    /* access modifiers changed from: private */
    public int part13;
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
    RecyclerView recview10;
    RecyclerView recview11;
    RecyclerView recview12;
    RecyclerView recview13;
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
    private Toolbar f629tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_sat2011);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f628b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_sat2011);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.recview10 = (RecyclerView) findViewById(C2719R.C2722id.questions10);
        this.recview11 = (RecyclerView) findViewById(C2719R.C2722id.questions11);
        this.recview12 = (RecyclerView) findViewById(C2719R.C2722id.questions12);
        this.recview13 = (RecyclerView) findViewById(C2719R.C2722id.questions13);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "GALLON: LITRE ", 0, 0, 0, 0, 0, "MILE: KILOMETRE", "KILOMETRE: METRE", "YARD: POUND", "POUND: WEIGHT", "Gallon= measurement of liquid i.e., 4.5 liter. \n      mile= measurement of distance i.e., around 1.6 kms. \n", "a", 0, 1, this.f628b));
        arrayList.add(new questions("2.", "BELT: WAIST ", 0, 0, 0, 0, 0, "WATCH: ARM", "SHOE: LEG", "STOCKINGS: GLOVE", "BRACELET: WRIST", "Belt= clothing worn around the waist. \n      Bracelet= a kind of jewelry worn around the wrist or arm. \n      The relation is item/clothing and where or on which part of the body it is worn \n ", "d", 0, 1, this.f628b));
        arrayList.add(new questions("3.", "NATIVE: FOREIGN ", 0, 0, 0, 0, 0, "MEAN: UNKIND ", "NAIVE: SOPHISTICATED ", "DOMESTIC: HOMEGROWN ", "LOCAL: IMPORT ", "Native= local, homemade is antonym. of foreign \n      Naïve= simple \n      The relation is opposite to each other. It is antonym to sophisticated. \n", "a", 0, 1, this.f628b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("4.", "QUIET is to NOISY as CALM is to……………  ", 0, 0, 0, 0, 0, "Agitated", "Slow", "Dormant", "Arrogance", "Quiet is the opposite of noisy similarly agitated is the opposite of calm. \n      Agitated=disturb\n", "a", 0, 2, this.f628b));
        arrayList2.add(new questions("5.", "WAR is to DESTRUCTION as GERM is to  ", 0, 0, 0, 0, 0, "Doctor", "Bacteria", "Hospital ", "Disease", "The relation between war and destruction is cause and effect. Therefore, the effect of       germ is disease. \n      Disease \n", "c", 0, 2, this.f628b));
        arrayList2.add(new questions("6.", "MOUNT is to HORSE as……………... is to TRAIN. ", 0, 0, 0, 0, 0, "ride", "board", "lift", "drive ", "Action of getting on a horse is mount means go up like wise, action of getting on a train is board. \nBoard= getting on a vehicle \n", "b", 0, 2, this.f628b));
        arrayList2.add(new questions("7.", "HIRE is to FIRE as SELECT is to…………….  ", 0, 0, 0, 0, 0, "Receive", "Employ", "Reject", "Admit", "Hire/employ/ and fire are opposite events. Then, select and reject are also opposite\n      Reject= put aside, throw away as not good enough to be kept. \n", "c", 0, 2, this.f628b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("8.", "EXTINGUISH ", 0, 0, 0, 0, 0, "Switch off", "Turn on", "Distinguish", "Ignite", "Extinguish= put out the light \n      switch off= turn off \n", "a", 0, 3, this.f628b));
        arrayList3.add(new questions("9.", "PERSEVERANCE ", 0, 0, 0, 0, 0, "Severity of disease", "Frequent suffering", "Lack of energy ", "Continuity of effort ", "Perseverance= constant effort to achieve something continuity of effort lot  ", "a", 0, 3, this.f628b));
        arrayList3.add(new questions("10.", "INDEPENDENT", 0, 0, 0, 0, 0, "individualism", "Colonialism ", "Sovereignty", "Cordiality", "10.\tC   independence= state of being independent \n      sovereignty= of the highest power, without limit. \n", "c", 0, 3, this.f628b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("11.", "EXTRAORDINARY", 0, 0, 0, 0, 0, "Unexpected", "Unique", "Usual", "Amazing", "Extraordinary= beyond what is used, remarkable \n      usual= commonly happens \n", "c", 0, 4, this.f628b));
        arrayList4.add(new questions("12.", "FOLLOW", 0, 0, 0, 0, 0, "Go behind", "Trail", "Precede", "Go after", "Follow= come or go after \n      Precede= come or go before \n", "c", 0, 4, this.f628b));
        arrayList4.add(new questions("13.", "FRAUD", 0, 0, 0, 0, 0, "Fragile", "Fake", "Scam", "Authentic", "Fraud= deceptive \n      Authentic= genuine, known to be true \n", "d", 0, 4, this.f628b));
        arrayList4.add(new questions("14.", "DOMESTIC", 0, 0, 0, 0, 0, "Foreign", "Neighborhood", "Household", "Local", "Domestic= of the home Foreign= from another country ", "a", 0, 4, this.f628b));
        arrayList4.add(new questions("15.", "SINCERE", 0, 0, 0, 0, 0, "Genuine", "Dishonest", "Dissent", "Disapprove", "Sincere = genuine \n      Dishonest= intended to cheat, deceive or misuse, \n", "b", 0, 4, this.f628b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("16.", "Choose the odd one out. ", 0, 0, 0, 0, 0, "Disregard", "Respect", "Ignore", "Disobey", "Respect=honor, high regard \n      The others have negative meaning. \n", "b", 0, 5, this.f628b));
        arrayList5.add(new questions("17.", "Which of the following words is different from to others? ", 0, 0, 0, 0, 0, "unbreakable", "helpless", "fragile", "weak", "unbreakable-- not broken \n      The others are in the same classification \n", "a", 0, 5, this.f628b));
        arrayList5.add(new questions("18.", "Which one of the following words has a different meaning from the others?", 0, 0, 0, 0, 0, "luminous", "bright", "shining", "shade", "Shade= comparative darkness. \n      The other three show brightness. \n", "d", 0, 5, this.f628b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("19.", "Which of the following is the correct word that should replace 4 (the fourth blank in the passage)? ", 0, 0, 0, 0, 0, "brain", "specialization", "creative", "potential", "Potential something that may come into existence ", "d", 0, 6, this.f628b));
        arrayList6.add(new questions("20.", "Which of the following is the correct word that should replace 5 (the filth blank in the passage)?", 0, 0, 0, 0, 0, "potential", "brain", "creative", "specialization", "brain-- mind, intellect ", "b", 0, 6, this.f628b));
        arrayList6.add(new questions("21.", "Which of the following blank in the passage)? ", 0, 0, 0, 0, 0, "creative", "potential ", "specialization", "brain", "specialization= adapt for a particular knowledge ", "c", 0, 6, this.f628b));
        arrayList6.add(new questions("22.", "Which of the following is the correct word that should replace 1(the first blank in the passage)? ", 0, 0, 0, 0, 0, "encouragement", "creative", "specialization", "potential", "creative= having power to create ", "b", 0, 6, this.f628b));
        arrayList6.add(new questions("23.", "Which of the following is the correct word that should replace 3 (the third blank in the passage)? ", 0, 0, 0, 0, 0, "encouragement", "creative", "specialization", "brain", "encouragement = giving courage or confidence \n      Anagrams= Forming a new word with different meaning by rearranging the letters in the given one.\n", "a", 0, 6, this.f628b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("24.", "Only one of the groups of seven letters below can be rearranged to yield seven-letter English word which is an item. Identify. ", 0, 0, 0, 0, 0, "recital", FirebaseAnalytics.Param.SUCCESS, "crooked", "visible", "recital - The seven letters English word formed rearranging this is certain.", "a", 0, 7, this.f628b));
        arrayList7.add(new questions("25.", "Only one of the groups of four letters below can be rearranged to spell-out a four-letter English word which is direction.", 0, 0, 0, 0, 0, "norm", "tank", "seat", "inch", "seat - the four letters English word formed to show direction is east ", "c", 0, 7, this.f628b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("26.", "If Nahom is assigned on Wednesday, Kargebo is to be assigned on: ", 0, 0, 0, 0, 0, "Thursday", "Friday", "Saturday", "Monday", "Thursday is a day immediately after Wednesday. Because kargebo must be immediately after Nahom. ", "a", 0, 8, this.f628b));
        arrayList8.add(new questions("27.", "Which can be assigned on Monday?  ", 0, 0, 0, 0, 0, "Kargebo", "Paulos", "Melaku", "Robel", "Melaku must be before Robel means Robel can be on any of the four days except Tuesday. ", "c", 0, 8, this.f628b));
        arrayList8.add(new questions("28.", "If Melaku is assigned on Wednesday, Robel cannot be assigned on: ", 0, 0, 0, 0, 0, "Friday", "Thursday", "Monday", "Saturday", "If Melaku is assigned on Wednesday, Robel cannot be assigned on Monday. Because according to the given information Melaku must be before Robel and the day before Monday is Sunday which is not tutor day.", "c", 0, 8, this.f628b));
        arrayList8.add(new questions("29.", "If Nahom is assigned on Saturday, when should Kargebo be assigned? ", 0, 0, 0, 0, 0, "Wednesday", "Friday", "Thursday", "Monday", "The day which is immediately before Saturday when Nahom assigned is Friday. ", "b", 0, 8, this.f628b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("30.", "Adama is one of the cities with lowest car accidents. And it is one of the few cities that require strict annual car safety inspections. Therefore, all cities of Ethiopia should apply similar safety inspection procedures. \nThe argument above is based on which of the following assumptions? \n", 0, 0, 0, 0, 0, "Most cities tend to imposed few rules on the car’s drivers use ", "Most cities are doubtful that annual car safety inspection can reduce accidents. ", "Annual car safety inspections contribute significantly to reduce Adarna car accident.", "Smaller number of accidents can be reported in other major cities of Ethiopia", "Annual car safety inspections are necessary to reduce car accident by applying car safely inspection. ", "c", 0, 9, this.f628b));
        arrayList9.add(new questions("31.", "According to one psychological Theory, in order to be happy, one must have an intimate relationship with another person. Yet the world's greatest composers spent most of their time in solitude and had no intimate relationships. So, the psychological theory must be wrong. \nThe conclusion above assumes that \n", 0, 0, 0, 0, 0, "The world's greatest composers chose to avoid intimate relationship ", "The world's greatest composers were happy. ", "People who have intimate relationships spend little in solitude ", "Less well-known composers have intimate relationship. ", "people who have intimate friend spend most of their time with their friends not solitude of lonely.", "c", 0, 9, this.f628b));
        arrayList9.add(new questions("32.", "A factory worker has one than five children. No one else in the factor has six children. Which of the following conclusions logically follows from the given statements? ", 0, 0, 0, 0, 0, "Only one worker in the factory has exactly six children. ", "All workers in the factory have six children each. ", "Some of the factory workers have more than six children. ", "Everybody in the factory has children. ", "There is only one worker in the factory who has six children. ", "a", 0, 9, this.f628b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("33.", "Statement: The teacher humiliated Abraham in the presence of his colleagues. \nConclusions:  I. The Teacher did not like Abraham. \n                       II. Abraham was popular with colleague. \n", 0, 0, 0, 0, 0, "only conclusion (II) follows ", "Only conclusion (I) follows ", "Neither conclusion (I) nor (II) follows ", "Both conclusions (I) and (II) follow ", "only conclusion (I) follows. The teacher humiliated Abraham because the teacher didn't like Abraham. ", "b", 0, 10, this.f628b));
        arrayList10.add(new questions("34.", "Statement: Population increase coupled with recurrent drought is going to be the scenario of many African countries in the days to come. \nConclusions: (I) The population of developing countries will not continue to increase in the future. \n                       (II) It will be vent difficult for the governments of many African countries   to provide its people decent quality of. life. \n", 0, 0, 0, 0, 0, "Only conclusion (I) follows ", "Both conclusions (I) and (II) follow ", "Only conclusion (II) follows ", "Neither conclusion (I) nor (II) follows ", "only conclusion (II) follows. Under the recurrent drought going in many African countries, the population number coupled. And governments cannot provide the people with quality of life. ", "c", 0, 10, this.f628b));
        arrayList10.add(new questions("35.", "Statement: North Korea faced growing international opposition for its decision to explode nuclear weapons at its test site. \nConclusions: (I) The citizens of the nation favored the decision. \n                        (II) Some powerful countries do not want other nations to become       powerful as they are \n", 0, 0, 0, 0, 0, "Only conclusion (II) follows ", "Both conclusions (I) and (II) follow ", "Neither conclusion (I) nor (II) follows ", "Only conclusion (I) follows", "only conclusion (II) follows. It is true that same powerful countries do not want other nations to explode nuclear weapons at their test sites.", "a", 0, 10, this.f628b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new questions("1.", "Find the value of X in the following sequence.\n \t 3,12,X,48,75,…\n", 0, 0, 0, 0, 0, "15", "21", "36", "27", "", "d", C2719R.C2721drawable.sat111e, 11, this.f628b));
        arrayList11.add(new questions("2.", "What the value of X in the following sequence?\n \t\t10, 15, 22, X, 42, 55, 70…\n", 0, 0, 0, 0, 0, "28  ", "31", "30 ", "29", "", "b", C2719R.C2721drawable.sat112e, 11, this.f628b));
        arrayList11.add(new questions("3.", "What is the length of a side of a square with area c ?", 0, 0, 0, 0, C2719R.C2721drawable.sat113d, "4c", "2c", "√c", "", "", "c", C2719R.C2721drawable.sat113e, 11, this.f628b));
        arrayList11.add(new questions("4.", "If ABCD is a four digit positive number divisible by 5 and 10, what is the value of D ?", 0, 0, 0, 0, 0, "0", "1", ExifInterface.GPS_MEASUREMENT_2D, "It can't be determined", "Any positive number divisible by 10 has a unit digit 0 so that If ABCO=10d⇒ABCO=5(2d)⇒ divisible by 5", "a", 0, 11, this.f628b));
        arrayList11.add(new questions("5.", "If one-third of one-fourth of a number is 15 , then what is the three-tenth of that number?", 0, 0, 0, 0, 0, "35", "36", "54", "45", "", "c", C2719R.C2721drawable.sat115e, 11, this.f628b));
        arrayList11.add(new questions("6.", "Which of the following number pair is different from the others in the group?", 0, 0, 0, 0, 0, "7, 3", "3, 5", "6, 2", "4, 5", "Only choice (C) is a pair of evens;\nATTENTION! You might have better choice!!!!!!!\n", "c", 0, 11, this.f628b));
        arrayList11.add(new questions("7.", "Which of the following number pair is different from the others in the group?", 0, 0, 0, 0, 0, "37", "29", "17", "27", "Only choice (D) is composite (non-prime) number.\nATTENTION! You might have better choice!!!!!!! \n", "d", 0, 11, this.f628b));
        arrayList11.add(new questions("8.", "Find the value of X in the following sequence.\n\t16,8,4,2,X,1/2,…\n", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "1", "1/4", "1/8", "It goes geometrically with r=1/2 so, that X=r(2)=1", "b", 0, 11, this.f628b));
        arrayList11.add(new questions("9.", "What is the sum of the first five prime numbers?", 0, 0, 0, 0, 0, "15", "14", "9", "10", "", "d", C2719R.C2721drawable.sat119e, 11, this.f628b));
        arrayList11.add(new questions("10.", "It takes two and half an hour from Addis Ababa to Adama traveling at a", 0, 0, 0, 0, 0, "11", "26", "18", "28", "Sum of the first five prime numbers is = 2 + 3+ 5 + 7 + 11 = 28", "d", 0, 11, this.f628b));
        arrayList11.add(new questions("11.", "It takes two and half an hour from Addis Ababa to Adama traveling at a constant rate of speed. What part of the distance is travelled by 4/3 of an hour, approximately?", 0, 0, 0, 0, 0, "1/3", "1/2", "2/3", "3/4", "Let x be part of the distance is travelled by 4/3 of an hour then, given 5/2 hr full journey so that x=(4/3)/(5/2)=0.5333…≈0.5=1/2", "b", 0, 11, this.f628b));
        arrayList11.add(new questions("12.", "Assume that Ujulu saves 1/4 of his income and his father had been saving half of his income. If the income of his father, which is 5000 Birr, is doubled of his son. How much is saved by his son?", 0, 0, 0, 0, 0, "500", "1250", "625", "2500", "", "c", C2719R.C2721drawable.sat1112e, 11, this.f628b));
        arrayList11.add(new questions("13.", "", C2719R.C2721drawable.sat1113q, 0, 0, 0, 0, "18 ", "15", "12", "9", "There are 3 main squares and in the largest square each four parts contains 3 squares-so that totally there are 3+4(3)=15 squares.", "c", 0, 11, this.f628b));
        arrayList11.add(new questions("14.", "A bag contains 28 yellow, 44 black and 36 green marbles. Ali takes out one marble from the bag at random. What is the probability that he will take out a green marble?", 0, 0, 0, 0, 0, "1/3", "36%", "1/36", "1/9", "", "c", C2719R.C2721drawable.sat1114e, 11, this.f628b));
        arrayList11.add(new questions("15.", "How many irrational numbers are there between 2 and 7?", 0, 0, 0, 0, 0, "10", "20", "infinitely many", "30", "between any two real numbers there are infinitely many rational and irrational numbers.", "c", 0, 11, this.f628b));
        arrayList11.add(new questions("16.", "What number should replace X in the following series?\n \t\t-1,0,2,6,X,30,62,…\n", 0, 0, 0, 0, 0, "14", "24", "12", "10", "", "a", C2719R.C2721drawable.sat1116e, 11, this.f628b));
        arrayList11.add(new questions("17.", "The square of positive number is greater than the number itself when the number is?", 0, 0, 0, 0, 0, "Greater than 1", "greater than 0", "between zero and one", "impossible to determine", "", "a", C2719R.C2721drawable.sat1117e, 11, this.f628b));
        recviewquestion recviewquestion11 = new recviewquestion();
        recviewquestion11.setQuestions(arrayList11);
        this.recview11.setAdapter(recviewquestion11);
        this.recview11.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new questions("18.", "", C2719R.C2721drawable.sat1118q, 0, 0, 0, 0, "Quantity A is greater than quantity B.", "The relationship cannot be determined from the information given.", "Quantity A is equal Quantity B.", "Quantity A is less than quantity B.", "", "b", C2719R.C2721drawable.sat1118e, 12, this.f628b));
        arrayList12.add(new questions("19.", "", C2719R.C2721drawable.sat1119q, 0, 0, 0, 0, "Quantity A is equal to quantity B.", "Quantity A is less than quantity B.", "Quantity A is greater than quantity B.", "The relationship cannot be determined based on the given information.", "", "c", C2719R.C2721drawable.sat1119e, 12, this.f628b));
        arrayList12.add(new questions("20.", "", C2719R.C2721drawable.sat1120q, 0, 0, 0, 0, "Quantity A is equal to quantity B.", "Quantity A is less than quantity B.", "Quantity A is greater than quantity B.", "The relationship cannot be determined based on the given information.", "", "c", C2719R.C2721drawable.sat1120e, 12, this.f628b));
        recviewquestion recviewquestion12 = new recviewquestion();
        recviewquestion12.setQuestions(arrayList12);
        this.recview12.setAdapter(recviewquestion12);
        this.recview12.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new questions("21.", "Which Region is least in enrolling girls to school compared to the boys?", 0, 0, 0, 0, 0, "C", "F", ExifInterface.LONGITUDE_EAST, "D", "", "d", C2719R.C2721drawable.sat1121e, 13, this.f628b));
        arrayList13.add(new questions("22.", "Total male population, in million, in the seven Regions is nearly:", 0, 0, 0, 0, 0, "35", "13", "20", "26", "From the last cell of the second column total male population is 35,886,000, i.e. nearly 35 million.", "a", 0, 13, this.f628b));
        arrayList13.add(new questions("23.", "Assuming that the total population of the country at the time the above data is taken is 73 million, what is the share, in percent, of the population in C and D together?", 0, 0, 0, 0, 0, "40", "50", "70", "60", "", "d", C2719R.C2721drawable.sat1123e, 13, this.f628b));
        arrayList13.add(new questions("24.", "The proportion of girls enrolled in schools in Region D to the female population is", 0, 0, 0, 0, 0, "1:2", "2:13", "1:17", "5:14", "", "c", C2719R.C2721drawable.sat1124e, 13, this.f628b));
        arrayList13.add(new questions("25.", "The three least populous Regions in order are:", 0, 0, 0, 0, 0, "A, D, G", "B, A, E", "A, G, F", "B, A, F", "", "d", C2719R.C2721drawable.sat1125e, 13, this.f628b));
        recviewquestion recviewquestion13 = new recviewquestion();
        recviewquestion13.setQuestions(arrayList13);
        this.recview13.setAdapter(recviewquestion13);
        this.recview13.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f629tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    sat2011.this.timer.setVisibility(0);
                    sat2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    sat2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2011.this.getBaseContext());
                    int unused = sat2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = sat2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = sat2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = sat2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = sat2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = sat2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = sat2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = sat2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = sat2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = sat2011.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = sat2011.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                    int unused12 = sat2011.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                    int unused13 = sat2011.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                    int unused14 = sat2011.this.highscore = defaultSharedPreferences.getInt("sat2011hs", 0);
                    int access$200 = sat2011.this.part1 + sat2011.this.part2 + sat2011.this.part3 + sat2011.this.part4 + sat2011.this.part5 + sat2011.this.part6 + sat2011.this.part7 + sat2011.this.part8 + sat2011.this.part9 + sat2011.this.part10 + sat2011.this.part11 + sat2011.this.part12 + sat2011.this.part13;
                    sat2011.this.resultText.setText(String.valueOf(access$200));
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
                    edit.putInt("ans10", 0);
                    edit.putInt("ans11", 0);
                    edit.putInt("ans12", 0);
                    edit.putInt("ans13", 0);
                    int unused15 = sat2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused16 = sat2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused17 = sat2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused18 = sat2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused19 = sat2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused20 = sat2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused21 = sat2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused22 = sat2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused23 = sat2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused24 = sat2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int unused25 = sat2011.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                    int unused26 = sat2011.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                    int unused27 = sat2011.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                    int access$1700 = sat2011.this.answered1 + sat2011.this.answered2 + sat2011.this.answered3 + sat2011.this.answered4 + sat2011.this.answered5 + sat2011.this.answered6 + sat2011.this.answered7 + sat2011.this.answered8 + sat2011.this.answered9 + sat2011.this.answered10 + sat2011.this.answered11 + sat2011.this.answered12 + sat2011.this.answered13;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    edit.putInt("answered10", 0);
                    edit.putInt("answered11", 0);
                    edit.putInt("answered12", 0);
                    edit.putInt("answered13", 0);
                    if (access$200 > sat2011.this.highscore) {
                        edit.putInt("sat2011hs", access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 60;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - sat2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1sat111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1sat112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1sat113", 0);
                    long j4 = defaultSharedPreferences.getLong("date1sat114", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1sat115", 0);
                    long j6 = defaultSharedPreferences.getLong("date1sat116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1sat117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1sat118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1sat119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1sat1110", 0);
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
                        editor.putString("scoresat111", str);
                        editor.putLong("date1sat111", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoresat112", str2);
                            editor.putLong("date1sat112", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoresat113", str2);
                            editor.putLong("date1sat113", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoresat114", str2);
                            editor.putLong("date1sat114", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoresat115", str2);
                            editor.putLong("date1sat115", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoresat116", str2);
                            editor.putLong("date1sat116", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoresat117", str2);
                            editor.putLong("date1sat117", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoresat118", str2);
                            editor.putLong("date1sat118", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoresat119", str2);
                            editor.putLong("date1sat119", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoresat1110", str2);
                            editor.putLong("date1sat1110", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datesat111", 0);
                    long j12 = defaultSharedPreferences.getLong("datesat112", 0);
                    long j13 = defaultSharedPreferences.getLong("datesat113", 0);
                    long j14 = defaultSharedPreferences.getLong("datesat114", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datesat115", 0);
                    long j16 = defaultSharedPreferences.getLong("datesat116", 0);
                    long j17 = defaultSharedPreferences.getLong("datesat117", 0);
                    long j18 = defaultSharedPreferences.getLong("datesat118", 0);
                    long j19 = defaultSharedPreferences.getLong("datesat119", 0);
                    long j20 = defaultSharedPreferences.getLong("datesat1110", 0);
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
                        editor2.putString("iScoresat111", f);
                        editor2.putLong("datesat111", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoresat112", f);
                            editor2.putLong("datesat112", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoresat113", f);
                            editor2.putLong("datesat113", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoresat114", f);
                            editor2.putLong("datesat114", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoresat115", f);
                            editor2.putLong("datesat115", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoresat116", f);
                            editor2.putLong("datesat116", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoresat117", f);
                            editor2.putLong("datesat117", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoresat118", f);
                            editor2.putLong("datesat118", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoresat119", f);
                            editor2.putLong("datesat119", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoresat1110", f);
                            editor2.putLong("datesat1110", valueOf.longValue());
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
                        sat2011.this.scr.setVisibility(8);
                        sat2011.this.chr.stop();
                        sat2011.this.toolbar.setVisibility(8);
                        sat2011.this.Relative.setBackgroundColor(-7829368);
                        sat2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2011.this.getBaseContext());
                        int unused = sat2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = sat2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = sat2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = sat2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = sat2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = sat2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = sat2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = sat2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = sat2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = sat2011.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = sat2011.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                        int unused12 = sat2011.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                        int unused13 = sat2011.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                        int unused14 = sat2011.this.highscore = defaultSharedPreferences.getInt("sat2011hs", 0);
                        int access$200 = sat2011.this.part1 + sat2011.this.part2 + sat2011.this.part3 + sat2011.this.part4 + sat2011.this.part5 + sat2011.this.part6 + sat2011.this.part7 + sat2011.this.part8 + sat2011.this.part9 + sat2011.this.part10 + sat2011.this.part11 + sat2011.this.part12 + sat2011.this.part13;
                        TextView access$1600 = sat2011.this.resultText;
                        access$1600.setText(access$200 + "/60");
                        sat2011.this.progressbar.setProgress(access$200);
                        sat2011.this.progressbar.setMax(60);
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
                        edit.putInt("ans10", 0);
                        edit.putInt("ans11", 0);
                        edit.putInt("ans12", 0);
                        edit.putInt("ans13", 0);
                        int unused15 = sat2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused16 = sat2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused17 = sat2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused18 = sat2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused19 = sat2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused20 = sat2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused21 = sat2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused22 = sat2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused23 = sat2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused24 = sat2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int unused25 = sat2011.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                        int unused26 = sat2011.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                        int unused27 = sat2011.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                        int access$1700 = sat2011.this.answered1 + sat2011.this.answered2 + sat2011.this.answered3 + sat2011.this.answered4 + sat2011.this.answered5 + sat2011.this.answered6 + sat2011.this.answered7 + sat2011.this.answered8 + sat2011.this.answered9 + sat2011.this.answered10 + sat2011.this.answered11 + sat2011.this.answered12 + sat2011.this.answered13;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        edit.putInt("answered10", 0);
                        edit.putInt("answered11", 0);
                        edit.putInt("answered12", 0);
                        edit.putInt("answered13", 0);
                        if (access$200 > sat2011.this.highscore) {
                            edit.putInt("sat2011hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - sat2011.this.chr.getBase()) / 1000;
                        String str = "datesat1110";
                        String str2 = "datesat119";
                        String str3 = "datesat118";
                        String str4 = "datesat117";
                        String str5 = "datesat116";
                        String str6 = "datesat115";
                        String str7 = "datesat114";
                        String str8 = "datesat113";
                        String str9 = "datesat112";
                        String str10 = "datesat111";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1sat1110";
                        String str12 = "date1sat119";
                        if (sat2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1sat111", 0);
                            String str13 = "date1sat111";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1sat112", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1sat113", 0);
                            long j4 = defaultSharedPreferences.getLong("date1sat114", 0);
                            long j5 = defaultSharedPreferences.getLong("date1sat115", 0);
                            String str16 = "date1sat115";
                            String str17 = "date1sat114";
                            String str18 = "date1sat116";
                            long j6 = defaultSharedPreferences.getLong("date1sat116", 0);
                            long j7 = defaultSharedPreferences.getLong("date1sat117", 0);
                            String str19 = str12;
                            String str20 = "date1sat118";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1sat117";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1sat113";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1sat118", 0));
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
                                editor3.putString("scoresat111", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoresat112", str25);
                                    editor3.putLong("date1sat112", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoresat113", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoresat114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoresat115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoresat116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoresat117", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoresat118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoresat119", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoresat1110", str25);
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
                                editor4.putString("iScoresat111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoresat112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoresat113", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoresat114", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoresat115", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoresat116", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoresat117", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoresat118", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoresat119", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoresat1110", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1sat111";
                            String str30 = "date1sat114";
                            String str31 = str12;
                            String str32 = "date1sat113";
                            String str33 = "date1sat117";
                            String str34 = "date1sat116";
                            String str35 = str11;
                            String str36 = "date1sat115";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1sat112", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1sat112";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1sat118";
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
                                editor2.putString("scoresat111", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoresat112", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoresat113", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoresat114", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoresat115", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoresat116", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoresat117", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoresat118", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoresat119", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoresat1110", str49);
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
                                editor.putString("iScoresat111", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoresat112", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoresat113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoresat114", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoresat115", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoresat116", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoresat117", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoresat118", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoresat119", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoresat1110", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        sat2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2011.this.scr.setVisibility(8);
                sat2011.this.chr.stop();
                sat2011.this.toolbar.setVisibility(8);
                sat2011.this.Relative.setBackgroundColor(sat2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                sat2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2011.this.scr.setVisibility(0);
                sat2011.this.toolbar.setVisibility(0);
                sat2011.this.telegram_layout.setVisibility(8);
                sat2011.this.chr.start();
                sat2011.this.Relative.setBackgroundColor(sat2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = sat2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = sat2011.this.mInterstitialAd = null;
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
            super.onBackPressed();
            showAd();
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                sat2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
