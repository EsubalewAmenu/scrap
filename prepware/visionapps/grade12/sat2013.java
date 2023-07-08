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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class sat2013 extends AppCompatActivity {
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
    private Boolean f632b;
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
    private Toolbar f633tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_sat2013);
        Intent intent = getIntent();
        this.f632b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_sat2013);
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
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "ATTACHMENT ", 0, 0, 0, 0, 0, "affinity ", "influence ", "causation ", "appendage ", "", "d", 0, 1, this.f632b));
        arrayList.add(new questions("2.", "FOUND ", 0, 0, 0, 0, 0, "see ", "establish ", "realise ", "search ", "", "b", 0, 1, this.f632b));
        arrayList.add(new questions("3.", "ADVICE ", 0, 0, 0, 0, 0, "council ", "counsel ", "practice ", "proposal ", "", "b", 0, 1, this.f632b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("4.", "IMPARTIAL ", 0, 0, 0, 0, 0, "hostile ", "need ", "biased ", "worried ", "", "c", 0, 2, this.f632b));
        arrayList2.add(new questions("5.", "PROGRESS ", 0, 0, 0, 0, 0, "silence ", "movement ", "reversion ", "advance ", "", "c", 0, 2, this.f632b));
        arrayList2.add(new questions("6.", "CANDID ", 0, 0, 0, 0, 0, "vague ", "rude ", "cunning ", "deceptive ", "", "d", 0, 2, this.f632b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("7.", "BRIDGE is to RIVER as TUNNEL is to ________", 0, 0, 0, 0, 0, "nails ", "underway ", "mountain ", "rock ", "", "b", 0, 3, this.f632b));
        arrayList3.add(new questions("8.", "PROSE is to a POETRY as \nCONVERSATION is to __________", 0, 0, 0, 0, 0, "song ", "poem ", "language ", "listening ", "", "d", 0, 3, this.f632b));
        arrayList3.add(new questions("9.", "READING is to a KNOWLEDGE as WORK is to _________", 0, 0, 0, 0, 0, "money ", "employment ", "experience ", "engagement ", "", "a", 0, 3, this.f632b));
        arrayList3.add(new questions("10.", "COLLEGE is related to TEACHERS in the same way as HOSPITAL is related to: ", 0, 0, 0, 0, 0, "doctors ", "patients ", "employer ", "medicine ", "", "a", 0, 3, this.f632b));
        arrayList3.add(new questions("11.", "TABLE is related to WOOD in the same way as SHIRT is related to: ", 0, 0, 0, 0, 0, "cotton ", "cloth ", "dress ", "uniform ", "", "a", 0, 3, this.f632b));
        arrayList3.add(new questions("12.", "WALK is related RUN in the same as BREEZE is related to: ", 0, 0, 0, 0, 0, "cold ", "dust ", "wind ", "air ", "", "c", 0, 3, this.f632b));
        arrayList3.add(new questions("13.", "WAX is related to GREASE in the same as MILK is related to: ", 0, 0, 0, 0, 0, "drink ", "ghee ", "protein ", "curd ", "", "d", 0, 3, this.f632b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("14.", "Choose the word that is different from others ", 0, 0, 0, 0, 0, "Haughty ", "Reticent ", "Sociable ", "Aloof ", "", "c", 0, 4, this.f632b));
        arrayList4.add(new questions("15.", "Choose the word that is different from others ", 0, 0, 0, 0, 0, "Treachery ", "Morbid ", "Deceit ", "Swindle ", "", "b", 0, 4, this.f632b));
        arrayList4.add(new questions("16.", "Choose the word that is different from others ", 0, 0, 0, 0, 0, "Sporadic ", "Frequent ", "Intermittent ", "Scarce ", "", "b", 0, 4, this.f632b));
        arrayList4.add(new questions("17.", "Choose the word that is different from others ", 0, 0, 0, 0, 0, "Cease ", "Launch ", "Initiate ", "Commence ", "", "a", 0, 4, this.f632b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("18.", "The coconut earned the nick name \"ghost\" because ", 0, 0, 0, 0, 0, "its pale color ", "it resembles ghost's a face ", "it is round ", "of its smell ", "", "b", 0, 5, this.f632b));
        arrayList5.add(new questions("19.", "What is the main focus of this passage? ", 0, 0, 0, 0, 0, "the history of coconut ", "Coconut trees have many uses ", "how cooking oil is made ", "Portuguese discoveries ", "", "a", 0, 5, this.f632b));
        arrayList5.add(new questions("20.", "The passage implies that coconut palms are ", 0, 0, 0, 0, 0, "known valuable plants ", "coconut oil is the best way to cook ", "Portuguese explorers loved coconuts ", "coconut palms are good shade trees ", "", "b", 0, 5, this.f632b));
        arrayList5.add(new questions("21.", "Coconut differs from the other seeds because of its ", 0, 0, 0, 0, 0, "color ", "special uses ", "contents ", "flavour ", "", "c", 0, 5, this.f632b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("22.", "According to the passage, why is chocolate poisonous for dogs and cats? ", 0, 0, 0, 0, 0, "It contains caffeine ", "Chocolate is made from processed cocoa ", "It gets stuck in their intestines ", "They cannot process theorbromine ", "", "d", 0, 6, this.f632b));
        arrayList6.add(new questions("23.", "According to the passage, how much milk chocolate would be poisonous to a cat? ", 0, 0, 0, 0, 0, "substantially less than 20 ounces ", "substantially more than 20 ounces ", "approximately one pound ", "half a Hershey bar ", "", "a", 0, 6, this.f632b));
        arrayList6.add(new questions("24.", "Why might a dog eat chocolate, according to the passage? ", 0, 0, 0, 0, 0, "Because it tastes good ", "Dogs won't eat chocolate ", "They can smell the theobromine ", "Dogs like to imitate their owners ", "", "d", 0, 6, this.f632b));
        arrayList6.add(new questions("25.", "What best summarizes this passage? ", 0, 0, 0, 0, 0, "Look before you leap ", "Pet food for pets, people food for people ", "Monkey see, monkey do ", "A penny saved is penny earned ", "", "b", 0, 6, this.f632b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("26.", "According to the schedule, which of the following could be true? ", 0, 0, 0, 0, 0, "Plants are watered on Saturday ", "Lunch is served on Tuesday ", "Floors are polished on Tuesday ", "Dinner is served on Thursday ", "", "a", 0, 7, this.f632b));
        arrayList7.add(new questions("27.", "According to the schedule, the restaurant's floors are polished on either", 0, 0, 0, 0, 0, "Tuesday or Wednesday ", "Tuesday or Thursday ", "Wednesday or Friday ", "Thursday or Friday ", "", "c", 0, 7, this.f632b));
        arrayList7.add(new questions("28.", "If dinner is served on a day that plants are watered, which of the following must be true? ", 0, 0, 0, 0, 0, "Plants are watered on Tuesday ", "Floors are polished on Thursday ", "Plants are watered on Wednesday ", "Floors are polished on Wednesday ", "", "c", 0, 7, this.f632b));
        arrayList7.add(new questions("29.", "Assume that floors are polished on consecutive instead on non-consecutive days but that all other scheduling policies are unchanged. For how many of the six days can it be determined both whether plants watered and whether floors are polished. ", 0, 0, 0, 0, 0, "Two ", "Three ", "Four ", "Six ", "", "d", 0, 7, this.f632b));
        arrayList7.add(new questions("30.", "Read the following text and answer the question that follow it. \n\nCollege in Addis Ababa has built its reputation for academic excellence largely on significant contributions from wealthy alumni who are fans of the colleges' football team. Although the team has won more national Championships over the years than any other team in its division, this year It did not even win the division title, and so the College can expect to see A decline in alumni contribution next year. \n\nThe above argument relies which of the following assumptions about the college? ", 0, 0, 0, 0, 0, "The college's reputation for academic excellence depends on the performance of its football team ", "Contributions from alumni are needed for the college to products a winning football team ", "The college's alumni contributions depend to an extent on a winning record by the college's football team", "The college's football team will continue its losing streak next year ", "", "c", 0, 7, this.f632b));
        arrayList7.add(new questions("31.", "Read the following text and answer the question that follow it. \n\nIt is well known that the world urgently needs the adequate distribution of food so that everyone gets enough. Adequate distribution of medicine is just as urgent as the need for food. Medical expertise and medical supplies need to be redistributed throughout the world so that in emerging nations will have proper medical care. \n\nThis paragraph best supports the statement that, ", 0, 0, 0, 0, 0, "food production in emerging nations has slowed during the past several years ", "Most of the world's doctors are selfish about giving time and money products. ", "The medical-supply industry should step up production of its products ", "Many people who live in emerging nations are not receiving proper medical care ", "", "d", 0, 7, this.f632b));
        arrayList7.add(new questions("32.", "Five children are sitting in a row. S is sitting next to P but not T. K is Sitting next to R who is sitting on the extreme left and T is not sitting Next to K. Who are sitting adjacent to S? ", 0, 0, 0, 0, 0, "A.K & P ", "R & P", "only P ", "P & T", "", "d", 0, 7, this.f632b));
        arrayList7.add(new questions("33.", "In a family, there are husband-wife, two sons and two daughters. All the ladies were invited to a dinner. Both sons went out to play. Husband did not return from office. \nWho was at home? ", 0, 0, 0, 0, 0, "Only wife was at home ", "Nobody was at home ", "Only sons were at home ", "All ladies were at home ", "", "a", 0, 7, this.f632b));
        arrayList7.add(new questions("34.", "Read the following statement and the conclusions. Then choose the conclusion that can be reached based on the statement. \nStatement: Parents are prepared to pay any price for an elite education to their children. \nConclusions: ______", 0, 0, 0, 0, 0, "All parents these days are very well off ", "Parents have an obsessive passion for perfect development of their children through good schooling", "Parents are read to do whatever they can to satisfy their children", "Rich parents were more concerned for their children's education that poor parents are ", "", "b", 0, 7, this.f632b));
        arrayList7.add(new questions("35.", "Rearrange the following five sentences in proper sequence to from a meaningful paragraph, then answer the questions given below. \n1. Kemal received a call to attend the interview. \n2. He applied for a new job. \n3. Kemal was an ambitious boy. \n4. But, he was not happy there. \n5. His father had put him in a clerical job. ", 0, 0, 0, 0, 0, "2, 4, 5, 3, 2", "4, 2, 1, 5, 3", "3, 5, 4, 2, 1", "2, 5, 4, 3, 1", "", "c", 0, 7, this.f632b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("1.", "", C2719R.C2721drawable.sat1301q, 0, 0, 0, 0, "6, 11, 16, 21, 26 ", "5, 10, 15, 20, 25 ", "4, 9, 14, 19, 24 ", "3, 8, 13, 18, 23 ", "", "a", C2719R.C2721drawable.sat1301e, 8, this.f632b));
        arrayList8.add(new questions("2.", "Which term of the following geometric sequence 2, 8, 32, 128,... is 2048? ", 0, 0, 0, 0, 0, "11th ", "12th ", "6th ", "7th ", "", "c", C2719R.C2721drawable.sat1302e, 8, this.f632b));
        arrayList8.add(new questions("3.", "In the arithmetic sequence: -1, n, 13, ...., which one of the following Is the value of n ", 0, 0, 0, 0, 0, "7", "6", "9", "8", "-1, n, 13, ... <--AP\nn - ( - 1) = 13 - n n + 1 = 13 - n \n2n = 12 = 6", "b", 0, 8, this.f632b));
        arrayList8.add(new questions("4.", "Which one of the following is a term in the sequence 6, 14, 22, ... ", 0, 0, 0, 0, 0, "246 ", "264 ", "284 ", "258 ", "", "a", C2719R.C2721drawable.sat1304e, 8, this.f632b));
        arrayList8.add(new questions("5.", "", C2719R.C2721drawable.sat1305q, 0, 0, 0, 0, "(1) + (5) + (9) + ...", "(1) + (-3) + (1) + ...", "(1) + (-3) + (-7) + ...", "(-3) + (-1) + (1) + ...", "= (2 - 5) + (2 x 2 - 5) + (2 x 3 - 5) + ...\n= -3 + (-1) + 1 + ...", "d", 0, 8, this.f632b));
        arrayList8.add(new questions("6.", "Which one of the following is the value of x in the sequence: 1, 5, 14, 30, x, 91 ,  ...?", 0, 0, 0, 0, 0, "85 ", "65 ", "55 ", "75 ", "", "c", 0, 8, this.f632b));
        arrayList8.add(new questions("7.", "Which of the following is the sum of the series: 3 + 1 + 1/3 + 1/9 + 1/27 + ...? ", 0, 0, 0, 0, 0, "9/2 ", "3/2 ", "2/9 ", "1/3 ", "", "a", C2719R.C2721drawable.sat1307e, 8, this.f632b));
        arrayList8.add(new questions("8.", "Which of the following is the quadrant that the common solution of the equations 2x+3y= 2 and 3x + 2y= 2 is found? ", 0, 0, 0, 0, 0, "I quadrant ", "III quadrant ", "II quadrant ", "IV quadrant ", "", "a", C2719R.C2721drawable.sat1308e, 8, this.f632b));
        arrayList8.add(new questions("9.", "Given the inequality y 2x +2, which of the following ordered pairs of numbers is NOT a solution for the given inequality? ", 0, 0, 0, 0, 0, "(2, 3)", "(0, 2)", "(-3, 3)", "(-1, 0) ", "", "c", C2719R.C2721drawable.sat1309e, 8, this.f632b));
        arrayList8.add(new questions("10.", "The equation T = 25 + 3c is used to model the number of chirps, c, made by a certain species of cricket in one minute, and the temperature, T, in degrees Fahrenheit. According to this model, what is the estimated increase in temperature, in degrees Fahrenheit, when the number of chirps in one minute is increased by 1? ", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_3D, "5", "25", "28", "", "a", C2719R.C2721drawable.sat1310e, 8, this.f632b));
        arrayList8.add(new questions("11.", "At a certain school, if the ratio of teachers to students is 1 to 10, which one of the following can be a total number of teachers and students in the school? ", 0, 0, 0, 0, 0, "100", "121", "144", "1011", "T: S = 1 : 10 => S = 10T\nTotal = n(Teacher) + n(Students) = n(T) + n(S) = T + 10T = 11T \nThe total number of teaches and students will be a multiple of 11. ", "b", 0, 8, this.f632b));
        arrayList8.add(new questions("12.", "If x is 30% of 400, y is 40% of x, and z is 25% of y, which of the following is equal x + y + z? ", 0, 0, 0, 0, 0, "120", "180", "150", "175", "", "b", C2719R.C2721drawable.sat1312e, 8, this.f632b));
        arrayList8.add(new questions("13.", "A radioactive substance decays at an annual rate of 17%. If the initial amount of the substance is 650 grams, which one of the following function h(t) models the remaining amount of the substance, in grams after t years? ", 0, C2719R.C2721drawable.sat1313a, C2719R.C2721drawable.sat1313b, C2719R.C2721drawable.sat1313c, C2719R.C2721drawable.sat1313d, "", "", "", "", "", "d", C2719R.C2721drawable.sat1313e, 8, this.f632b));
        arrayList8.add(new questions("14.", "", C2719R.C2721drawable.sat1314q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "b", C2719R.C2721drawable.sat1314e, 8, this.f632b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("15.", "The diameter of a circle O is the same as the length of the side of a square S \nColumn A:  The area of circle O \nColumn B:  The area of circle S ", 0, 0, 0, 0, 0, "The quantity in column A is greater ", "The quantity in column B is greater ", "The two quantities are equal ", "The relationship cannot be determined ", "", "b", C2719R.C2721drawable.sat1315e, 9, this.f632b));
        arrayList9.add(new questions("16.", "Let y be a real number \nColumn A:  (y + 1) x y(y - 1)\nColumn B:  y x y x y ", 0, 0, 0, 0, 0, "The quantity in column A is greater ", "The quantity in column B is greater ", "The two quantities are equal ", "The relationship cannot be determined ", "", "b", C2719R.C2721drawable.sat1316e, 9, this.f632b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("17.", "", C2719R.C2721drawable.sat1317q, 0, 0, 0, 0, "1996", "2000", "1998", "1999", "25 % of T = L \n25% of the 476 = (25/100) x 476 = 476/4 = 119 ", "b", 0, 10, this.f632b));
        arrayList10.add(new questions("18.", "", C2719R.C2721drawable.sat1318q, 0, 0, 0, 0, "138", "128", "123", "166", "Percentage increase in 2000 over 1999 is \n(103 - 86)/86 x 100% = (17/86) x 100% = 19.76% \nTotal number of Heavy Vehicles sold in 2001 is 103 + 19.76% of 103 \n= 103 + 20.35 = 123.35 = 123 ", "c", 0, 10, this.f632b));
        arrayList10.add(new questions("19.", "", C2719R.C2721drawable.sat1319q, 0, 0, 0, 0, "12%", "7.5%", "8.6%", "9%", "Number of Heavy vehicles sold in 1999 = 86 \nTotal number of all vehicles sold in 1998 1000 \nPercentage = (86 x 1000) x 100% = 8.6% ", "c", 0, 10, this.f632b));
        arrayList10.add(new questions("20.", "", C2719R.C2721drawable.sat1320q, 0, 0, 0, 0, "1999", "1996", "1998", "1997", "Percentage highest if the denominator is smaller than the Numerator or nearly equal \nThus in 1996, (349/750) x 100% = 46.5% and in 1999, (418/1143) x 100% = 36.6% ", "b", 0, 10, this.f632b));
        arrayList10.add(new questions("21.", "", C2719R.C2721drawable.sat1321q, 0, 0, 0, 0, "Cars", "Two-wheelers", "Jeeps", "Light commercial", "", "d", C2719R.C2721drawable.sat1321e, 10, this.f632b));
        arrayList10.add(new questions("22.", "A container has 235 flowers in a variety of colors: red, blue, yellow, and purple. There are 45 blue flowers; one-fifth of the flowers are red; forty percent of them are purple and the rest are yellow. A flower is picked at random from the container. Which one of the following is the probability that the flower picked is yellow? ", 0, 0, 0, 0, 0, "1/5 ", "2/5 ", "49/235 ", "9/47 ", "", "c", C2719R.C2721drawable.sat1322e, 10, this.f632b));
        arrayList10.add(new questions("23.", "You go to a restaurant for lunch and want to order a sandwich. There are twenty-five sandwiches on the menu and six of them are toasted. If you order a sandwich at random, then what is the probability of your ordering a sandwich is NOT toasted? ", 0, 0, 0, 0, 0, "6/25 ", "9/25 ", "16/25 ", "19/25 ", "", "d", C2719R.C2721drawable.sat1323e, 10, this.f632b));
        arrayList10.add(new questions("24.", "28 male lions and 172 female lions are living in 500-acre Park. If 35 More male lions are introduced into the park, how many more female lions should be introduced so that 6/7 of the total number of lions in the park is female? ", 0, 0, 0, 0, 0, "378 ", "206 ", "324 ", "241 ", "Total Male = 28 +35= 63 \nTotal Female = 172+ Fadded \n6/7(total) = Female total \nTotal = (7/6)Ftotal \n63 + (172 + Fadded) = 7/6 (172 + Fadded) \n6(235 + Fadded) = 7(172 + 7Fadded) \n1410 + 6Fadded = 1204 + 7Fadded \n1410 - 1204 = Fadded \n206 = Fadded ", "b", 0, 10, this.f632b));
        arrayList10.add(new questions("25.", "A business is owned by 1 man and 5 women, each of whom, have equal shares. If one of the women sells 2/5 of her share to the man, and another woman keeps 1/4 of her share and sells the rest to the man, what fraction of the total share of the business is owned by the man? ", 0, 0, 0, 0, 0, "9/40 ", "37/120 ", "2/3 ", "43/120 ", "", "d", C2719R.C2721drawable.sat1325e, 10, this.f632b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f633tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    sat2013.this.timer.setVisibility(0);
                    sat2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    sat2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2013.this.getBaseContext());
                    int unused = sat2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = sat2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = sat2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = sat2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = sat2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = sat2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = sat2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = sat2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = sat2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = sat2013.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = sat2013.this.highscore = defaultSharedPreferences.getInt("sat2013hs", 0);
                    int access$200 = sat2013.this.part1 + sat2013.this.part2 + sat2013.this.part3 + sat2013.this.part4 + sat2013.this.part5 + sat2013.this.part6 + sat2013.this.part7 + sat2013.this.part8 + sat2013.this.part9 + sat2013.this.part10;
                    sat2013.this.resultText.setText(String.valueOf(access$200));
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
                    int unused12 = sat2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused13 = sat2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused14 = sat2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused15 = sat2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused16 = sat2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused17 = sat2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused18 = sat2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused19 = sat2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "sat2013hs";
                    int unused20 = sat2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused21 = sat2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1400 = sat2013.this.answered1 + sat2013.this.answered2 + sat2013.this.answered3 + sat2013.this.answered4 + sat2013.this.answered5 + sat2013.this.answered6 + sat2013.this.answered7 + sat2013.this.answered8 + sat2013.this.answered9 + sat2013.this.answered10;
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
                    if (access$200 > sat2013.this.highscore) {
                        edit.putInt(str, access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 60;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - sat2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1sat131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1sat132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1sat133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1sat134", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1sat135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1sat136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1sat137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1sat138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1sat139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1sat1310", 0);
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
                        editor.putString("scoresat131", str2);
                        editor.putLong("date1sat131", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoresat132", str3);
                            editor.putLong("date1sat132", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoresat133", str3);
                            editor.putLong("date1sat133", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoresat134", str3);
                            editor.putLong("date1sat134", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoresat135", str3);
                            editor.putLong("date1sat135", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoresat136", str3);
                            editor.putLong("date1sat136", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoresat137", str3);
                            editor.putLong("date1sat137", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoresat138", str3);
                            editor.putLong("date1sat138", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoresat139", str3);
                            editor.putLong("date1sat139", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoresat1310", str3);
                            editor.putLong("date1sat1310", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datesat131", 0);
                    long j12 = defaultSharedPreferences.getLong("datesat132", 0);
                    long j13 = defaultSharedPreferences.getLong("datesat133", 0);
                    long j14 = defaultSharedPreferences.getLong("datesat134", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datesat135", 0);
                    long j16 = defaultSharedPreferences.getLong("datesat136", 0);
                    long j17 = defaultSharedPreferences.getLong("datesat137", 0);
                    long j18 = defaultSharedPreferences.getLong("datesat138", 0);
                    long j19 = defaultSharedPreferences.getLong("datesat139", 0);
                    long j20 = defaultSharedPreferences.getLong("datesat1310", 0);
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
                        editor2.putString("iScoresat131", f);
                        editor2.putLong("datesat131", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoresat132", f);
                            editor2.putLong("datesat132", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoresat133", f);
                            editor2.putLong("datesat133", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoresat134", f);
                            editor2.putLong("datesat134", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoresat135", f);
                            editor2.putLong("datesat135", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoresat136", f);
                            editor2.putLong("datesat136", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoresat137", f);
                            editor2.putLong("datesat137", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoresat138", f);
                            editor2.putLong("datesat138", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoresat139", f);
                            editor2.putLong("datesat139", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoresat1310", f);
                            editor2.putLong("datesat1310", valueOf.longValue());
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
                        sat2013.this.scr.setVisibility(8);
                        sat2013.this.chr.stop();
                        sat2013.this.toolbar.setVisibility(8);
                        sat2013.this.Relative.setBackgroundColor(-7829368);
                        sat2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2013.this.getBaseContext());
                        int unused = sat2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = sat2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = sat2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = sat2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = sat2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = sat2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = sat2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = sat2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = sat2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = sat2013.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = sat2013.this.highscore = defaultSharedPreferences.getInt("sat2013hs", 0);
                        int access$200 = sat2013.this.part1 + sat2013.this.part2 + sat2013.this.part3 + sat2013.this.part4 + sat2013.this.part5 + sat2013.this.part6 + sat2013.this.part7 + sat2013.this.part8 + sat2013.this.part9 + sat2013.this.part10;
                        TextView access$1300 = sat2013.this.resultText;
                        access$1300.setText(access$200 + "/60");
                        sat2013.this.progressbar.setProgress(access$200);
                        sat2013.this.progressbar.setMax(60);
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
                        int unused12 = sat2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused13 = sat2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused14 = sat2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused15 = sat2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused16 = sat2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused17 = sat2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused18 = sat2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused19 = sat2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused20 = sat2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused21 = sat2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1400 = sat2013.this.answered1 + sat2013.this.answered2 + sat2013.this.answered3 + sat2013.this.answered4 + sat2013.this.answered5 + sat2013.this.answered6 + sat2013.this.answered7 + sat2013.this.answered8 + sat2013.this.answered9 + sat2013.this.answered10;
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
                        if (access$200 > sat2013.this.highscore) {
                            edit.putInt("sat2013hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - sat2013.this.chr.getBase()) / 1000;
                        String str = "datesat1310";
                        String str2 = "datesat139";
                        String str3 = "datesat138";
                        String str4 = "datesat137";
                        String str5 = "datesat136";
                        String str6 = "datesat135";
                        String str7 = "datesat134";
                        String str8 = "datesat133";
                        String str9 = "datesat132";
                        String str10 = "datesat131";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1sat1310";
                        String str12 = "date1sat139";
                        if (sat2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1sat131", 0);
                            String str13 = "date1sat131";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1sat132", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1sat133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1sat134", 0);
                            long j5 = defaultSharedPreferences.getLong("date1sat135", 0);
                            String str16 = "date1sat135";
                            String str17 = "date1sat134";
                            String str18 = "date1sat136";
                            long j6 = defaultSharedPreferences.getLong("date1sat136", 0);
                            long j7 = defaultSharedPreferences.getLong("date1sat137", 0);
                            String str19 = str12;
                            String str20 = "date1sat138";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1sat137";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1sat133";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1sat138", 0));
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
                                editor3.putString("scoresat131", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoresat132", str25);
                                    editor3.putLong("date1sat132", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoresat133", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoresat134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoresat135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoresat136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoresat137", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoresat138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoresat139", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoresat1310", str25);
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
                                editor4.putString("iScoresat131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoresat132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoresat133", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoresat134", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoresat135", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoresat136", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoresat137", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoresat138", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoresat139", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoresat1310", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1sat131";
                            String str30 = "date1sat134";
                            String str31 = str12;
                            String str32 = "date1sat133";
                            String str33 = "date1sat137";
                            String str34 = "date1sat136";
                            String str35 = str11;
                            String str36 = "date1sat135";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1sat132", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1sat132";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1sat138";
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
                                editor2.putString("scoresat131", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoresat132", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoresat133", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoresat134", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoresat135", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoresat136", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoresat137", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoresat138", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoresat139", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoresat1310", str49);
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
                                editor.putString("iScoresat131", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoresat132", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoresat133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoresat134", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoresat135", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoresat136", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoresat137", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoresat138", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoresat139", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoresat1310", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        sat2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2013.this.scr.setVisibility(8);
                sat2013.this.chr.stop();
                sat2013.this.toolbar.setVisibility(8);
                sat2013.this.Relative.setBackgroundColor(sat2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                sat2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2013.this.scr.setVisibility(0);
                sat2013.this.toolbar.setVisibility(0);
                sat2013.this.telegram_layout.setVisibility(8);
                sat2013.this.chr.start();
                sat2013.this.Relative.setBackgroundColor(sat2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = sat2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = sat2013.this.mInterstitialAd = null;
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
                sat2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
