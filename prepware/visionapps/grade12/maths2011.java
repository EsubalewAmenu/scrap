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

public class maths2011 extends AppCompatActivity {
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
    private Boolean f600b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreMaths2011;
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
    private Toolbar f601tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_maths2011);
        this.f600b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextMath2011);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questionsMaths);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_maths2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.m2011q1, 0, 0, 0, 0, "-1", "1", "0", "4/3", "", "b", C2719R.C2721drawable.maths111e, 1, this.f600b));
        arrayList.add(new questions("2.", "", C2719R.C2721drawable.m2011q2, 0, 0, 0, 0, "1/2", "1", "0", "3/2", "", "c", C2719R.C2721drawable.maths112e, 1, this.f600b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.m2011q3, 0, 0, 0, 0, "2π/27 cubic units", "2π/25 cubic units", "2π/35 cubic units", "2π/5 cubic units", "", "b", C2719R.C2721drawable.maths113e, 1, this.f600b));
        arrayList.add(new questions("4.", "", C2719R.C2721drawable.m2011q4, C2719R.C2721drawable.m2011q4a, C2719R.C2721drawable.m2011q4b, C2719R.C2721drawable.m2011q4c, C2719R.C2721drawable.m2011q4d, "", "", "", "", "", "a", C2719R.C2721drawable.maths114e, 1, this.f600b));
        arrayList.add(new questions("5.", "Suppose 2500 items are produced by a machine and 2% of the product are randomly selected and tested. If 5 of the tested items have a defect, then what is the probability that an item produced by a machine has No defect? ", 0, 0, 0, 0, 0, "0.90", "0.85", "0.80", "0.95", "", "c", C2719R.C2721drawable.maths115e, 1, this.f600b));
        arrayList.add(new questions("6.", "", C2719R.C2721drawable.m2011q6, C2719R.C2721drawable.m2011q6a, C2719R.C2721drawable.m2011q6b, C2719R.C2721drawable.m2011q6c, C2719R.C2721drawable.m2011q6d, "", "", "", "", "", "c", 0, 1, this.f600b));
        arrayList.add(new questions("7.", "Which one of the following is a valid argument? ", 0, 0, 0, 0, 0, "If I am literate, then I can read and write. I can read but I can’t write. Thus, I am not literate.", "If I don’t change my oil regularly, my engine will die. My engine died. Thus, I didn't change my oil regularly. ", "If you do every problem in the book, then you will learn the subject. You learned the subject. Thus, you did every problem in the book.", "If it rains or snows, then my roof leaks. My roof is leaking. Thus, it is raining and snowing.", "", "a", C2719R.C2721drawable.maths116e, 1, this.f600b));
        arrayList.add(new questions("8.", "If the second and fifth terms of a geometric progression are -1/2 and 1/16, respectively, what is the sum of the first eight terms of the sequence?", 0, 0, 0, 0, 0, "256/255", "255/256", "128/85", "85/128", "", "d", C2719R.C2721drawable.maths117e, 1, this.f600b));
        arrayList.add(new questions("9.", "For real numbers x and y, which one of the following is NOT true? ", 0, C2719R.C2721drawable.m2011q9a, C2719R.C2721drawable.m2011q9b, C2719R.C2721drawable.m2011q9c, C2719R.C2721drawable.m2011q9d, "", "", "", "", "", "d", C2719R.C2721drawable.maths118e, 1, this.f600b));
        arrayList.add(new questions("10.", "There are three children in a room with, ages four, five, and six. If a five-year-old child enters the room, then which of the following statement is correct?", 0, 0, 0, 0, 0, "Mean age and standard deviation will increase.", "Mean age will stay the same but the standard deviation will increase. ", "Mean age will stay the same but the standard deviation will decrease. ", "Mean age and standard deviation will stay the same. ", "", "c", C2719R.C2721drawable.maths119e, 1, this.f600b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.m2011q11, 0, 0, 0, 0, "f1 = 7, f2 = 20", "f1 = 20, f2 = 7", "f1 = 15, f2 = 12", "f1 = 12, f2 = 15", "", "b", C2719R.C2721drawable.maths1110e, 1, this.f600b));
        arrayList.add(new questions("12.", "", C2719R.C2721drawable.m2011q12, 0, 0, 0, 0, "65/4", "25/4", "5", "15", "No Answer", "n", 0, 1, this.f600b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.m2011q13, 0, 0, 0, 0, "0.03m/sec", "0.02m/sec", "0.04m/sec", "0.06m/sec", "", "b", C2719R.C2721drawable.maths1113e, 1, this.f600b));
        arrayList.add(new questions("14.", "The earth’s orbit has a semi-major axis a = 149.6 (gigameters) and an eccentricity of e = 0.017. What is the approximate value of the semi-minor axis? \n", 0, 0, 0, 0, 0, "152.14Gm", "145.32Gm", "149.58Gm", "149.06Gm", "", "c", C2719R.C2721drawable.maths1114e, 1, this.f600b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.m2011q15, C2719R.C2721drawable.m2011q15a, C2719R.C2721drawable.m2011q15b, C2719R.C2721drawable.m2011q15c, C2719R.C2721drawable.m2011q15d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1115e, 1, this.f600b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.m2011q16, 0, 0, 0, 0, "The graph has a hole at x =2", "The vertical asymptote of the graph are x = -2 and x = 2", "The graph has a y-intercept at (0,-3/2)", "The horizontal asymptote of the graph is y = 4", "", "d", C2719R.C2721drawable.maths1116e, 1, this.f600b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.m2011q17, 0, 0, 0, 0, "1", "-1", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "", "c", C2719R.C2721drawable.maths1117e, 1, this.f600b));
        arrayList.add(new questions("18.", "", C2719R.C2721drawable.m2011q18, C2719R.C2721drawable.m2011q18a, C2719R.C2721drawable.m2011q18b, C2719R.C2721drawable.m2011q18c, C2719R.C2721drawable.m2011q18d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1118e, 1, this.f600b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.m2011q19, 0, 0, 0, 0, "-2", "1/2", ExifInterface.GPS_MEASUREMENT_2D, "-1/2", "", "c", C2719R.C2721drawable.maths1119e, 1, this.f600b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.m2011q20, 0, 0, 0, 0, "a = 2,b= 3", "a = 2,b= 2", "a = 1,b= 1", "a = 1/2,b= -2", "", "a", C2719R.C2721drawable.maths1120e, 1, this.f600b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.m2011q21, 0, 0, 0, 0, "-2ln2", "ln2", "ln2/2", "1", "", "b", C2719R.C2721drawable.maths1121e, 1, this.f600b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.m2011q22, 0, 0, 0, 0, "f(c) = 0 for some c E [-2,0]", "f(c) = 1/2 for some c E [0,1]", "f(c) = 3 for some c E [1,2]", "f(c) = 1/4 for some c E [-1,0]", "", "d", C2719R.C2721drawable.maths1122e, 1, this.f600b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.m2011q23, 0, 0, 0, 0, "1530 m.square", "1536 m.square", "1664 m.square", "1564 m.square", "", "b", C2719R.C2721drawable.maths1123e, 1, this.f600b));
        arrayList.add(new questions("24.", "What is the polar form of 7-i/3-4i", 0, C2719R.C2721drawable.m2011q24a, C2719R.C2721drawable.m2011q24b, C2719R.C2721drawable.m2011q24c, C2719R.C2721drawable.m2011q24d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1124e, 1, this.f600b));
        arrayList.add(new questions("25.", "Fatuma can solve 90% of the problems given in a book and Mesfin can solve 70%. What is the probability that at least one of them will solve the problem? ", 0, 0, 0, 0, 0, "0.97", "0.87", "0.77", "0.67", "", "a", C2719R.C2721drawable.maths1125e, 1, this.f600b));
        arrayList.add(new questions("26.", "", C2719R.C2721drawable.m2011q26, 0, 0, 0, 0, "-1", "0", "1/2", "-1/2", "", "d", C2719R.C2721drawable.maths1126e, 1, this.f600b));
        arrayList.add(new questions("27.", "Among 2000 students who took a regional exam, the percentile of certain student’s score is 90. Which of the following is correct about the student’s score? ", 0, 0, 0, 0, 0, "The students have answered 90% of the question correctly", "The students score is the same as the top 10% of the scores", "The students score is greater than or equal to that of 1800 students", "The score of the students is as good as that of 90% of the students", "", "c", C2719R.C2721drawable.maths1127e, 1, this.f600b));
        arrayList.add(new questions("28.", "", C2719R.C2721drawable.m2011q28, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "-2", ExifInterface.GPS_MEASUREMENT_3D, "The limit doesnt exist", "", "c", C2719R.C2721drawable.maths1128e, 1, this.f600b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.m2011q29, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "-5", "-3", "", "d", C2719R.C2721drawable.maths1129e, 1, this.f600b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.m2011q30, 0, 0, 0, 0, "20,020", "20,200", "22,000", "20,000", "", "d", C2719R.C2721drawable.maths1130e, 1, this.f600b));
        arrayList.add(new questions("31.", "The center of a circle is on the line y = 2x and the line x = 1 is tangent to the circle at the point (1, 6). How long is the radius of the circle?", 0, 0, 0, 0, 0, "5", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "b", C2719R.C2721drawable.maths1131e, 1, this.f600b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.m2011q32, 0, 0, 0, 0, "{-2,2}", "{-2,0,2}", "{-1,0,1}", "{-1,1}", "", "b", C2719R.C2721drawable.maths1132e, 1, this.f600b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.m2011q33, C2719R.C2721drawable.m2011q33a, C2719R.C2721drawable.m2011q33b, C2719R.C2721drawable.m2011q33c, C2719R.C2721drawable.m2011q33d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1133e, 1, this.f600b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.m2011q34, C2719R.C2721drawable.m2011q34a, C2719R.C2721drawable.m2011q34b, C2719R.C2721drawable.m2011q34c, C2719R.C2721drawable.m2011q34d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1134e, 1, this.f600b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.m2011q35, 0, 0, 0, 0, "g(x) = x + 4", "g(x) = x + 2", "g(x) = |x| + 4", "g(x) = |x + 4|", "", "d", C2719R.C2721drawable.maths1135e, 1, this.f600b));
        arrayList.add(new questions("36.", "", C2719R.C2721drawable.m2011q36, 0, 0, 0, 0, "a =-1/4 , b= 12", "a = 1/4, b = -12", "a= 1/4, b = 12", "a= -1/4, b= -12", "", "d", C2719R.C2721drawable.maths1136e, 1, this.f600b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.m2011q37, C2719R.C2721drawable.m2011q37a, C2719R.C2721drawable.m2011q37b, C2719R.C2721drawable.m2011q37c, C2719R.C2721drawable.m2011q37d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1137e, 1, this.f600b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.m2011q38, 0, 0, 0, 0, "7", "-1", "0", "1", "", "b", C2719R.C2721drawable.maths1138e, 1, this.f600b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.m2011q39, 0, 0, 0, 0, "2/3", "-2/5", "2/5", "-2/3", "", "c", C2719R.C2721drawable.maths1139e, 1, this.f600b));
        arrayList.add(new questions("40.", "If the circle passing through the point (-1, 0) touches the y-axis at (0, 2), then what is the equation of the circle? ", 0, C2719R.C2721drawable.m2011q40a, C2719R.C2721drawable.m2011q40b, C2719R.C2721drawable.m2011q40c, C2719R.C2721drawable.m2011q40d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1140e, 1, this.f600b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.m2011q41, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "-3", "Does not exist", "", "c", C2719R.C2721drawable.maths1141e, 1, this.f600b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.m2011q42, 0, 0, 0, 0, "-4-2i", "4-2i", "-1-i", "-1+i", "", "c", C2719R.C2721drawable.maths1142e, 1, this.f600b));
        arrayList.add(new questions("43.", "If there are two children in a family, what is the probability that there is at least one girl in the family? ", 0, 0, 0, 0, 0, "3/4", "1/4", "1/2", "2/3", "", "a", C2719R.C2721drawable.maths1143e, 1, this.f600b));
        arrayList.add(new questions("44.", "Every day a person saves 5 cents more than the amount he saved on the previous day. His target is to save the total amount of 3225 cents by the end of 30 days. How much cents must to be the starting saving to meet the target?", 0, 0, 0, 0, 0, "25 cents", "35 cents", "50 cents", "60 cents", "", "b", C2719R.C2721drawable.maths1144e, 1, this.f600b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.m2011q45, 0, 0, 0, 0, "-ln2/2 - 1/2", "-ln2/2 + 1/2", "ln2/2 - 1/2", "ln2/2 + 1/2", "", "b", C2719R.C2721drawable.maths1145e, 1, this.f600b));
        arrayList.add(new questions("46.", "", C2719R.C2721drawable.m2011q46, C2719R.C2721drawable.m2011q46a, C2719R.C2721drawable.m2011q46b, C2719R.C2721drawable.m2011q46c, C2719R.C2721drawable.m2011q46d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1146e, 1, this.f600b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.m2011q47, 0, 0, 0, 0, "100", "200", "50", "20", "", "b", C2719R.C2721drawable.maths1147e, 1, this.f600b));
        arrayList.add(new questions("48.", "Which one of the following is true about the pair of lines 3x + 9y - 24 and 4x + 12y + 32 = 0? ", 0, 0, 0, 0, 0, "perpendicular lines", "parallel and distinct lines", "intersecting lines", "representing the same lines", "", "b", C2719R.C2721drawable.maths1148e, 1, this.f600b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.m2011q49, C2719R.C2721drawable.m2011q49a, C2719R.C2721drawable.m2011q49b, C2719R.C2721drawable.m2011q49c, C2719R.C2721drawable.m2011q49d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1149e, 1, this.f600b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.m2011q50, 0, 0, 0, 0, "0", "4", "The limit does not exist", "8", "", "d", C2719R.C2721drawable.maths1150e, 1, this.f600b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.m2011q51, 0, 0, 0, 0, "0", "1", "∞", "5/6", "", "a", C2719R.C2721drawable.maths1151e, 1, this.f600b));
        arrayList.add(new questions("52.", "Which one of the following is a valid assertion that can be proved by the principle of mathematical induction?", 0, C2719R.C2721drawable.maths1152a, C2719R.C2721drawable.maths1152b, C2719R.C2721drawable.maths1152c, C2719R.C2721drawable.maths1152d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1152e, 1, this.f600b));
        arrayList.add(new questions("53.", "", C2719R.C2721drawable.m2011q53, 0, 0, 0, 0, "{0,π,5π/4,2π}", "{0,π/4,π,5π/4,2π}", "{0,π/4,π,2π}", "{0,π/4,π,5π/4}", "", "b", C2719R.C2721drawable.maths1153e, 1, this.f600b));
        arrayList.add(new questions("54.", "When the plane is rotated 45 degrees about the point (1,-2),then what would be the image of the point (2, 4)?", 0, C2719R.C2721drawable.m2011q54a, C2719R.C2721drawable.m2011q54b, C2719R.C2721drawable.m2011q54c, C2719R.C2721drawable.m2011q54d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1154e, 1, this.f600b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.m2011q55, 0, 0, 0, 0, "1", "-1", "-2", ExifInterface.GPS_MEASUREMENT_2D, "", "d", C2719R.C2721drawable.maths1155e, 1, this.f600b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.m2011q56, 0, 0, 0, 0, "-2", "4", "8", "7", "", "b", C2719R.C2721drawable.maths1156e, 1, this.f600b));
        arrayList.add(new questions("57.", "Consider a rectangle ABCD with base vertices A (0, 3) and B and the other vertices, C and D, in the first quadrant of the coordinate plane. If its height BC is half of the length of its base, then which of the following indicates the coordinate of the vertex C? ", 0, 0, 0, 0, 0, "(11/2, 2)", "6, 3/2", "(5/2, -2)", "(4, 5/2)", "", "a", C2719R.C2721drawable.maths1157e, 1, this.f600b));
        arrayList.add(new questions("58.", "", C2719R.C2721drawable.m2011q58, 0, 0, 0, 0, "√3x-y=2", "x - y = 2", "-x + y = 2", "-x+ √3y=1", "", "c", C2719R.C2721drawable.maths1158e, 1, this.f600b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.m2011q59, 0, 0, 0, 0, "Direct proof", "Proof by Exhaustion", "Proof by contradiction", "Disapproved by Counter Example", "", "d", C2719R.C2721drawable.maths1159e, 1, this.f600b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.m2011q60, C2719R.C2721drawable.m2011q60a, C2719R.C2721drawable.m2011q60b, C2719R.C2721drawable.m2011q60c, C2719R.C2721drawable.m2011q60d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1160e, 1, this.f600b));
        arrayList.add(new questions("61.", "", C2719R.C2721drawable.m2011q61, C2719R.C2721drawable.m2011q61a, C2719R.C2721drawable.m2011q61b, C2719R.C2721drawable.m2011q61c, C2719R.C2721drawable.m2011q61d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1161e, 1, this.f600b));
        arrayList.add(new questions("62.", "", C2719R.C2721drawable.m2011q62, C2719R.C2721drawable.m2011q62a, C2719R.C2721drawable.m2011q62b, C2719R.C2721drawable.m2011q62c, C2719R.C2721drawable.m2011q62d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1162e, 1, this.f600b));
        arrayList.add(new questions("63.", "Which of the following is a correct assertion that can be proved by the principle of mathematical induction?", 0, C2719R.C2721drawable.m2011q63a, C2719R.C2721drawable.m2011q63b, C2719R.C2721drawable.m2011q63c, C2719R.C2721drawable.m2011q63d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1163e, 1, this.f600b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.m2011q64, 0, 0, 0, 0, "1", "0", ExifInterface.GPS_MEASUREMENT_2D, "-3", "", "a", C2719R.C2721drawable.maths1164e, 1, this.f600b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.m2011q65, 0, 0, 0, 0, "", "", "", "", "", "c", C2719R.C2721drawable.maths1165e, 1, this.f600b));
        recviewquestionmaths recviewquestionmaths = new recviewquestionmaths();
        recviewquestionmaths.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestionmaths);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f601tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(180), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    maths2011.this.timer.setVisibility(0);
                    maths2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    maths2011.this.scr.setVisibility(8);
                    maths2011.this.chr.stop();
                    maths2011.this.toolbar.setVisibility(8);
                    maths2011.this.Relative.setBackgroundColor(-7829368);
                    maths2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2011.this.getBaseContext());
                    int unused = maths2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = maths2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = maths2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = maths2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = maths2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = maths2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = maths2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = maths2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = maths2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = maths2011.this.highscoreMaths2011 = defaultSharedPreferences.getInt("math2011hs", 0);
                    int access$600 = maths2011.this.part1 + maths2011.this.part2 + maths2011.this.part3 + maths2011.this.part4 + maths2011.this.part5 + maths2011.this.part6 + maths2011.this.part7 + maths2011.this.part8 + maths2011.this.part9;
                    TextView access$1600 = maths2011.this.resultText;
                    access$1600.setText(access$600 + "/65");
                    maths2011.this.progressbar.setProgress(access$600);
                    maths2011.this.progressbar.setMax(65);
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
                    int unused11 = maths2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = maths2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = maths2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = maths2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = maths2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = maths2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = maths2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = maths2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = maths2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = maths2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = maths2011.this.answered1 + maths2011.this.answered2 + maths2011.this.answered3 + maths2011.this.answered4 + maths2011.this.answered5 + maths2011.this.answered6 + maths2011.this.answered7 + maths2011.this.answered8 + maths2011.this.answered9 + maths2011.this.answered10;
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
                    if (access$600 > maths2011.this.highscoreMaths2011) {
                        edit.putInt("math2011hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 65;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - ((SystemClock.elapsedRealtime() - maths2011.this.chr.getBase()) / 1000)) * 3600) / 10800))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1math111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1math112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1math113", 0);
                    long j4 = defaultSharedPreferences.getLong("date1math114", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1math115", 0);
                    long j6 = defaultSharedPreferences.getLong("date1math116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1math117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1math118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1math119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1math1110", 0);
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
                        editor.putString("scoremath111", str);
                        editor.putLong("date1math111", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoremath112", str2);
                            editor.putLong("date1math112", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoremath113", str2);
                            editor.putLong("date1math113", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoremath114", str2);
                            editor.putLong("date1math114", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoremath115", str2);
                            editor.putLong("date1math115", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoremath116", str2);
                            editor.putLong("date1math116", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoremath117", str2);
                            editor.putLong("date1math117", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoremath118", str2);
                            editor.putLong("date1math118", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoremath119", str2);
                            editor.putLong("date1math119", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoremath1110", str2);
                            editor.putLong("date1math1110", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datemath111", 0);
                    long j12 = defaultSharedPreferences.getLong("datemath112", 0);
                    long j13 = defaultSharedPreferences.getLong("datemath113", 0);
                    long j14 = defaultSharedPreferences.getLong("datemath114", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datemath115", 0);
                    long j16 = defaultSharedPreferences.getLong("datemath116", 0);
                    long j17 = defaultSharedPreferences.getLong("datemath117", 0);
                    long j18 = defaultSharedPreferences.getLong("datemath118", 0);
                    long j19 = defaultSharedPreferences.getLong("datemath119", 0);
                    long j20 = defaultSharedPreferences.getLong("datemath1110", 0);
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
                        editor2.putString("iScoremath111", f);
                        editor2.putLong("datemath111", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoremath112", f);
                            editor2.putLong("datemath112", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoremath113", f);
                            editor2.putLong("datemath113", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoremath114", f);
                            editor2.putLong("datemath114", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoremath115", f);
                            editor2.putLong("datemath115", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoremath116", f);
                            editor2.putLong("datemath116", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoremath117", f);
                            editor2.putLong("datemath117", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoremath118", f);
                            editor2.putLong("datemath118", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoremath119", f);
                            editor2.putLong("datemath119", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoremath1110", f);
                            editor2.putLong("datemath1110", valueOf.longValue());
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
                        maths2011.this.scr.setVisibility(8);
                        maths2011.this.chr.stop();
                        maths2011.this.toolbar.setVisibility(8);
                        maths2011.this.Relative.setBackgroundColor(-7829368);
                        maths2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2011.this.getBaseContext());
                        int unused = maths2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = maths2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = maths2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = maths2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = maths2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = maths2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = maths2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = maths2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = maths2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = maths2011.this.highscoreMaths2011 = defaultSharedPreferences.getInt("math2011hs", 0);
                        int access$600 = maths2011.this.part1 + maths2011.this.part2 + maths2011.this.part3 + maths2011.this.part4 + maths2011.this.part5 + maths2011.this.part6 + maths2011.this.part7 + maths2011.this.part8 + maths2011.this.part9;
                        TextView access$1600 = maths2011.this.resultText;
                        access$1600.setText(access$600 + "/65");
                        maths2011.this.progressbar.setProgress(access$600);
                        maths2011.this.progressbar.setMax(65);
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
                        int unused11 = maths2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = maths2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = maths2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = maths2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = maths2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = maths2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = maths2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = maths2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = maths2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = maths2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = maths2011.this.answered1 + maths2011.this.answered2 + maths2011.this.answered3 + maths2011.this.answered4 + maths2011.this.answered5 + maths2011.this.answered6 + maths2011.this.answered7 + maths2011.this.answered8 + maths2011.this.answered9 + maths2011.this.answered10;
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
                        if (access$600 > maths2011.this.highscoreMaths2011) {
                            edit.putInt("math2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - maths2011.this.chr.getBase()) / 1000;
                        SharedPreferences.Editor editor3 = edit;
                        String str = "datemath1110";
                        String str2 = "datemath119";
                        if (maths2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 65) * (access$1800 * access$1800)) / ((int) (((10800 - elapsedRealtime) * 3600) / 10800))))))).floatValue());
                            long j = defaultSharedPreferences.getLong("datemath111", 0);
                            Long l = valueOf;
                            String str3 = f;
                            long j2 = defaultSharedPreferences.getLong("datemath112", 0);
                            long j3 = defaultSharedPreferences.getLong("datemath113", 0);
                            long j4 = defaultSharedPreferences.getLong("datemath114", 0);
                            String str4 = "datemath114";
                            String str5 = "datemath113";
                            long j5 = defaultSharedPreferences.getLong("datemath115", 0);
                            String str6 = "datemath111";
                            String str7 = "datemath115";
                            long j6 = defaultSharedPreferences.getLong("datemath116", 0);
                            long j7 = defaultSharedPreferences.getLong("datemath117", 0);
                            String str8 = "datemath117";
                            String str9 = "datemath116";
                            String str10 = "datemath118";
                            long j8 = defaultSharedPreferences.getLong("datemath118", 0);
                            long j9 = defaultSharedPreferences.getLong(str2, 0);
                            String str11 = str;
                            long j10 = defaultSharedPreferences.getLong(str11, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            String str12 = "datemath112";
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(j6);
                            Date date7 = new Date(j7);
                            Date date8 = new Date(j8);
                            Date date9 = new Date(j9);
                            Date date10 = new Date(j10);
                            ArrayList arrayList = new ArrayList();
                            Date date11 = date;
                            arrayList.add(date11);
                            arrayList.add(date2);
                            arrayList.add(date3);
                            arrayList.add(date4);
                            arrayList.add(date5);
                            arrayList.add(date6);
                            arrayList.add(date7);
                            arrayList.add(date8);
                            arrayList.add(date9);
                            arrayList.add(date10);
                            Date date12 = (Date) Collections.min(arrayList);
                            if (date12.compareTo(date11) == 0) {
                                editor2 = editor3;
                                editor2.putString("iScoremath111", str3);
                                editor2.putLong(str6, l.longValue());
                            } else {
                                editor2 = editor3;
                                if (date12.compareTo(date2) == 0) {
                                    editor2.putString("iScoremath112", str3);
                                    editor2.putLong(str12, l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor2.putString("iScoremath113", str3);
                                    editor2.putLong(str5, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor2.putString("iScoremath114", str3);
                                    editor2.putLong(str4, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor2.putString("iScoremath115", str3);
                                    editor2.putLong(str7, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor2.putString("iScoremath116", str3);
                                    editor2.putLong(str9, l.longValue());
                                } else if (date12.compareTo(date7) == 0) {
                                    editor2.putString("iScoremath117", str3);
                                    editor2.putLong(str8, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor2.putString("iScoremath118", str3);
                                    editor2.putLong(str10, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor2.putString("iScoremath119", str3);
                                    editor2.putLong(str2, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor2.putString("iScoremath1110", str3);
                                    editor2.putLong(str11, l.longValue());
                                }
                            }
                            editor = editor2;
                        } else {
                            String str13 = "datemath114";
                            String str14 = "datemath111";
                            String str15 = "datemath115";
                            String str16 = "datemath116";
                            String str17 = "datemath112";
                            String str18 = "datemath118";
                            String str19 = str;
                            String str20 = str2;
                            String str21 = "datemath117";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f2 = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 65) * (access$1800 * access$1800)) / ((int) ((elapsedRealtime * 3600) / 10800))))))).floatValue());
                            long j11 = defaultSharedPreferences.getLong(str14, 0);
                            String str22 = str14;
                            long j12 = defaultSharedPreferences.getLong(str17, 0);
                            String str23 = f2;
                            String str24 = str17;
                            long j13 = defaultSharedPreferences.getLong("datemath113", 0);
                            long j14 = defaultSharedPreferences.getLong(str13, 0);
                            String str25 = "datemath113";
                            String str26 = str13;
                            long j15 = defaultSharedPreferences.getLong(str15, 0);
                            long j16 = defaultSharedPreferences.getLong(str16, 0);
                            String str27 = str16;
                            long j17 = defaultSharedPreferences.getLong(str21, 0);
                            String str28 = str15;
                            long j18 = defaultSharedPreferences.getLong(str18, 0);
                            long j19 = defaultSharedPreferences.getLong(str20, 0);
                            String str29 = str20;
                            String str30 = str;
                            long j20 = defaultSharedPreferences.getLong(str30, 0);
                            Date date13 = new Date(j11);
                            Date date14 = new Date(j12);
                            String str31 = str18;
                            Date date15 = new Date(j13);
                            Date date16 = new Date(j14);
                            Date date17 = new Date(j15);
                            Date date18 = date16;
                            Date date19 = new Date(j16);
                            Date date20 = new Date(j17);
                            Date date21 = new Date(j18);
                            Date date22 = new Date(j19);
                            Date date23 = new Date(j20);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            Date date24 = date18;
                            arrayList2.add(date24);
                            Date date25 = date17;
                            arrayList2.add(date25);
                            arrayList2.add(date19);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            arrayList2.add(date23);
                            Date date26 = (Date) Collections.min(arrayList2);
                            if (date26.compareTo(date13) == 0) {
                                editor = editor3;
                                editor.putString("iScoremath111", str23);
                                editor.putLong(str22, valueOf2.longValue());
                            } else {
                                String str32 = str23;
                                editor = editor3;
                                if (date26.compareTo(date14) == 0) {
                                    editor.putString("iScoremath112", str32);
                                    editor.putLong(str24, valueOf2.longValue());
                                } else if (date26.compareTo(date15) == 0) {
                                    editor.putString("iScoremath113", str32);
                                    editor.putLong(str25, valueOf2.longValue());
                                } else if (date26.compareTo(date24) == 0) {
                                    editor.putString("iScoremath114", str32);
                                    editor.putLong(str26, valueOf2.longValue());
                                } else if (date26.compareTo(date25) == 0) {
                                    editor.putString("iScoremath115", str32);
                                    editor.putLong(str28, valueOf2.longValue());
                                } else if (date26.compareTo(date19) == 0) {
                                    editor.putString("iScoremath116", str32);
                                    editor.putLong(str27, valueOf2.longValue());
                                } else if (date26.compareTo(date20) == 0) {
                                    editor.putString("iScoremath117", str32);
                                    editor.putLong(str21, valueOf2.longValue());
                                } else if (date26.compareTo(date21) == 0) {
                                    editor.putString("iScoremath118", str32);
                                    editor.putLong(str31, valueOf2.longValue());
                                } else if (date26.compareTo(date22) == 0) {
                                    editor.putString("iScoremath119", str32);
                                    editor.putLong(str29, valueOf2.longValue());
                                } else if (date26.compareTo(date23) == 0) {
                                    editor.putString("iScoremath1110", str32);
                                    editor.putLong(str30, valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        maths2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2011.this.scr.setVisibility(8);
                maths2011.this.chr.stop();
                maths2011.this.toolbar.setVisibility(8);
                maths2011.this.Relative.setBackgroundColor(maths2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                maths2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2011.this.scr.setVisibility(0);
                maths2011.this.toolbar.setVisibility(0);
                maths2011.this.telegram_layout.setVisibility(8);
                maths2011.this.chr.start();
                maths2011.this.Relative.setBackgroundColor(maths2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = maths2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = maths2011.this.mInterstitialAd = null;
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
                maths2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
