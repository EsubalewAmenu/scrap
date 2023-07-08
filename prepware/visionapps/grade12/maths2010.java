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

public class maths2010 extends AppCompatActivity {
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
    private Boolean f598b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreMaths2010;
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
    private Toolbar f599tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_maths2010);
        this.f598b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextMath2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_maths2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.m2010q1, 0, 0, 0, 0, "24", "12", "8", "40", "", "c", C2719R.C2721drawable.maths101e, 1, this.f598b));
        arrayList.add(new questions("2.", "", C2719R.C2721drawable.m2010q2, 0, 0, 0, 0, "-2 and 2", "-2 and -3/2", "-3/2 and 2", "-2 and -3/2", "", "d", C2719R.C2721drawable.maths102e, 1, this.f598b));
        arrayList.add(new questions("3.", "Which one of the following is the equation of the circle whose end points of a diameter are  (0, -2) and (2, 2)? ", 0, C2719R.C2721drawable.m2010q3a, C2719R.C2721drawable.m2010q3b, C2719R.C2721drawable.m2010q3c, C2719R.C2721drawable.m2010q3d, "", "", "", "", "", "b", C2719R.C2721drawable.maths103e, 1, this.f598b));
        arrayList.add(new questions("4.", "What is the equation of the line that passes through (1, 1) and is parallel to the line 3y - x = 1", 0, C2719R.C2721drawable.m2010q4a, C2719R.C2721drawable.m2010q4b, C2719R.C2721drawable.m2010q4c, C2719R.C2721drawable.m2010q4d, "", "", "", "", "", "c", C2719R.C2721drawable.maths104e, 1, this.f598b));
        arrayList.add(new questions("5.", "Which of the following is true about signum, absolute value and greatest integer functions?", 0, C2719R.C2721drawable.m2010q5a, C2719R.C2721drawable.m2010q5b, C2719R.C2721drawable.m2010q5c, C2719R.C2721drawable.m2010q5d, "", "", "", "", "", "a", C2719R.C2721drawable.maths105e, 1, this.f598b));
        arrayList.add(new questions("6.", "", C2719R.C2721drawable.m2010q6, 0, 0, 0, 0, "f'(a)", "0", "f(a)", "f'(a) - f(a)", "", "c", C2719R.C2721drawable.maths106e, 1, this.f598b));
        arrayList.add(new questions("7.", "Which one of the following is a convergent sequence?", 0, C2719R.C2721drawable.m2010q7a, C2719R.C2721drawable.m2010q7b, C2719R.C2721drawable.m2010q7c, C2719R.C2721drawable.m2010q7d, "", "", "", "", "", "c", C2719R.C2721drawable.maths107e, 1, this.f598b));
        arrayList.add(new questions("8.", "", C2719R.C2721drawable.m2010q8, 0, 0, 0, 0, "17/20", "19/20", "21/20", "23/20", "", "b", C2719R.C2721drawable.maths108e, 1, this.f598b));
        arrayList.add(new questions("9.", "Let A and B be two events. Suppose that the probability that neither event occurs is 3/8. What the probability that at least one of the events occur? ", 0, 0, 0, 0, 0, "1/8", "1/4", "3/4", "5/8", "", "d", C2719R.C2721drawable.maths109e, 1, this.f598b));
        arrayList.add(new questions("10.", "", C2719R.C2721drawable.m2010q10, C2719R.C2721drawable.m2010q10a, 0, C2719R.C2721drawable.m2010q10c, 0, "", "q", "", "p", "", "a", C2719R.C2721drawable.maths1010e, 1, this.f598b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.m2010q11, 0, 0, 0, 0, "130,000", "1,060,000", "134,000", "1,378,000", "", "c", C2719R.C2721drawable.maths1011e, 1, this.f598b));
        arrayList.add(new questions("12.", "", C2719R.C2721drawable.m2010q12, 0, 0, 0, 0, "4,2 and 11", "4,11 and 2", "11,2 and 4", "2,4 and 11", "", "d", C2719R.C2721drawable.maths1012e, 1, this.f598b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.m2010q13, 0, 0, 0, 0, "2+3i", "3-2i", "3+5i", "3+2i", "", "d", C2719R.C2721drawable.maths1013e, 1, this.f598b));
        arrayList.add(new questions("14.", "If A is a square matrix of order 3 and det(A)  5, then what is the value of det(A.adj(A))? ", 0, 0, 0, 0, 0, "125", "5", "25", ExifInterface.GPS_MEASUREMENT_3D, "", "a", C2719R.C2721drawable.maths1014e, 1, this.f598b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.m2010q15, C2719R.C2721drawable.m2010q15a, C2719R.C2721drawable.m2010q15b, C2719R.C2721drawable.m2010q15c, C2719R.C2721drawable.m2010q15d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1015e, 1, this.f598b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.m2010q16, 0, 0, 0, 0, "162", "126", "216", "261", "", "a", C2719R.C2721drawable.maths1016e, 1, this.f598b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.m2010q17, 0, 0, 0, 0, "4/3 sq.units", "8/3 sq.units", "3/8 sq.units", "3/4 sq.units", "", "b", C2719R.C2721drawable.maths1017e, 1, this.f598b));
        arrayList.add(new questions("18.", "", C2719R.C2721drawable.m2010q18, C2719R.C2721drawable.m2010q18a, C2719R.C2721drawable.m2010q18b, C2719R.C2721drawable.m2010q18c, C2719R.C2721drawable.m2010q18d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1018e, 1, this.f598b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.m2010q19, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "ln2", "ln4 - ln3", "ln3", "", "d", C2719R.C2721drawable.maths1019e, 1, this.f598b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.m2010q20, 0, 0, 0, 0, "4", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "5", "", "b", C2719R.C2721drawable.maths1020e, 1, this.f598b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.m2010q21, 0, 0, 0, 0, "4", "1/2", ExifInterface.GPS_MEASUREMENT_2D, "1/4", "", "d", C2719R.C2721drawable.maths1021e, 1, this.f598b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.m2010q22, 0, 0, 0, 0, "i", "-i", "-1", "1-i", "", "c", C2719R.C2721drawable.maths1022e, 1, this.f598b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.m2010q23, 0, 0, 0, 0, "-7/8", "-9/8", "9/8", "∞", "", "a", C2719R.C2721drawable.maths1023e, 1, this.f598b));
        arrayList.add(new questions("24.", "Let A be a 3×3 invertible of matrix and B be any 3×3 matrix. If |A| = a and, |B| = b, then which of the following is not true? ", 0, C2719R.C2721drawable.m2010q24a, C2719R.C2721drawable.m2010q24b, C2719R.C2721drawable.m2010q25c, 0, "", "", "", "if b = 0, then B is not invertible ", "", "b", C2719R.C2721drawable.maths1024e, 1, this.f598b));
        arrayList.add(new questions("25.", "The time needed to type a sample of 8 business letters in an office is 7, 8, 6, 8, 9, 7, 5, 6 minutes. What is the mean (x) and the standard deviation (sd) of the data in minute?", 0, C2719R.C2721drawable.m2010q25a, C2719R.C2721drawable.m2010q25b, C2719R.C2721drawable.m2010q25c, C2719R.C2721drawable.m2010q25d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1025e, 1, this.f598b));
        arrayList.add(new questions("26.", "Suppose the following are premises of an argument:\n\tHe is healthy and he is not angry. \n\tHe is angry or his plan fails. \n\tHis plan does not fail if he does not travel abroad. \nGiven that the premises are true, which one of the following can be a conclusion that makes the argument valid?", 0, 0, 0, 0, 0, "His plan fails and he is angry. ", "He travels abroad.", "His plan does not fail.", "His plan fails and he does not travel abroad.", "", "b", C2719R.C2721drawable.maths1026e, 1, this.f598b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.m2010q27, C2719R.C2721drawable.m2010q27a, C2719R.C2721drawable.m2010q27b, C2719R.C2721drawable.m2010q27c, C2719R.C2721drawable.m2010q27d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1027e, 1, this.f598b));
        arrayList.add(new questions("28.", "A man running a race-course noted that the sum of the distances from the two flag posts from him is always 10 m and the distance between the flag posts is 8 m. what is the equation of the path traced by the man? ", 0, C2719R.C2721drawable.m2010q28a, C2719R.C2721drawable.m2010q28b, C2719R.C2721drawable.m2010q28c, C2719R.C2721drawable.m2010q28d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1028e, 1, this.f598b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.m2010q29, C2719R.C2721drawable.m2010q29a, C2719R.C2721drawable.m2010q29b, C2719R.C2721drawable.m2010q29c, C2719R.C2721drawable.m2010q29d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1029e, 1, this.f598b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.m2010q30, 0, 0, 0, 0, "(0,0) is point of inflection of f.", "f is concave upward on (0,2/3)  and concave downward on (-∞,0)  and (2/3,∞)", "0 and 1 are critical numbers of f.", "f is decreasing on (-∞,1)and increasing on (1,∞)", "", "b", C2719R.C2721drawable.maths1030e, 1, this.f598b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.m2010q31, C2719R.C2721drawable.m2010q31a, C2719R.C2721drawable.m2010q31b, 0, 0, "", "", "5", "1", "", "c", C2719R.C2721drawable.maths1031e, 1, this.f598b));
        arrayList.add(new questions("32.", "Let A be a 3×3 matrix and |A| = -2 . Then what is the value of |Adj(A)|  ?", 0, 0, 0, 0, 0, "-8", "-2", "-1/2", "4", "", "d", C2719R.C2721drawable.maths1032e, 1, this.f598b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.m2010q33, C2719R.C2721drawable.m2010q33a, C2719R.C2721drawable.m2010q33b, C2719R.C2721drawable.m2010q33c, C2719R.C2721drawable.m2010q33d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1033e, 1, this.f598b));
        arrayList.add(new questions("34.", "Let A = {1, 2, 3, 4, 5, 6, 7} , B = {7, 8, 9}  and C= {8, 9, 10} . If one of the numbers is deleted randomly from each of these sets, what is the probability that all of the three deleted numbers are even or all are multiple of 3?", 0, 0, 0, 0, 0, "8/63", "2/21", "1/9", "4/5", "", "a", C2719R.C2721drawable.maths1034e, 1, this.f598b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.m2010q35, 0, 0, 0, 0, "17.38", "18.37", "17.83", "18.73", "", "c", C2719R.C2721drawable.maths1035e, 1, this.f598b));
        arrayList.add(new questions("36.", "A private college has 1000 students. 60% of these students are males, 45% of these students pay their payment by credit card including 175 females. What is the probability that the student is a male or a credit card user?", 0, 0, 0, 0, 0, "0.775", "0.225", "0.675", "0.325", "", "a", C2719R.C2721drawable.maths1036e, 1, this.f598b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.m2010q37, C2719R.C2721drawable.m2010q37a, C2719R.C2721drawable.m2010q37b, C2719R.C2721drawable.m2010q37c, C2719R.C2721drawable.m2010q37d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1037e, 1, this.f598b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.m2010q38, 0, 0, 0, 0, "The graph has y-intercept at (0, 3).", "The graph has at least one x-intercept.", "The vertical asymptote of the graph is only x = -1  and its oblique asymptote is y = 2x", "The vertical asymptotes of the graphs are at x = 0 and x = -1 but it has no horizontal asymptote.", "", "c", C2719R.C2721drawable.maths1038e, 1, this.f598b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.m2010q39, C2719R.C2721drawable.m2010q39a, C2719R.C2721drawable.m2010q39b, C2719R.C2721drawable.m2010q39c, C2719R.C2721drawable.m2010q39d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1039e, 1, this.f598b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.m2010q40, C2719R.C2721drawable.m2010q40a, C2719R.C2721drawable.m2010q40b, C2719R.C2721drawable.m2010q40c, C2719R.C2721drawable.m2010q40d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1040e, 1, this.f598b));
        arrayList.add(new questions("41.", "What is the maximum possible area of a rectangle in square units with diagonal of length 16 units? ", 0, 0, 0, 0, 0, "45", "64", "256", "128", "", "d", C2719R.C2721drawable.maths1041e, 1, this.f598b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.m2010q42, C2719R.C2721drawable.m2010q42a, C2719R.C2721drawable.m2010q42b, C2719R.C2721drawable.m2010q42c, C2719R.C2721drawable.m2010q42d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1042e, 1, this.f598b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.m2010q43, C2719R.C2721drawable.m2010q43a, C2719R.C2721drawable.m2010q43b, C2719R.C2721drawable.m2010q43c, C2719R.C2721drawable.m2010q43d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1043e, 1, this.f598b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.m2010q44, 0, 0, 0, 0, "∞", ExifInterface.GPS_MEASUREMENT_3D, "4", "3/16", "", "b", C2719R.C2721drawable.maths1044e, 1, this.f598b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.m2010q45, C2719R.C2721drawable.m2010q45a, C2719R.C2721drawable.m2010q45b, C2719R.C2721drawable.m2010q45c, C2719R.C2721drawable.m2010q45d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1045e, 1, this.f598b));
        arrayList.add(new questions("46.", "The variance of 20 observations is 5. If each observation is multiplied by 2, then what is the variance of the resulting observations?", 0, 0, 0, 0, 0, "5", "20", "10", "40", "", "b", C2719R.C2721drawable.maths1046e, 1, this.f598b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.m2010q47, C2719R.C2721drawable.m2010q47a, C2719R.C2721drawable.m2010q47b, C2719R.C2721drawable.m2010q47c, C2719R.C2721drawable.m2010q47d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1047e, 1, this.f598b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.m2010q48, C2719R.C2721drawable.m2010q48a, C2719R.C2721drawable.m2010q48b, C2719R.C2721drawable.m2010q48c, C2719R.C2721drawable.m2010q48d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1048e, 1, this.f598b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.m2010q49, 0, 0, 0, 0, "6", "4", "4/3", "12", "", "a", C2719R.C2721drawable.maths1049e, 1, this.f598b));
        arrayList.add(new questions("50.", "Let U =N(the set of natural numbers) be the universe. Which one of the following propulsion is True?", 0, C2719R.C2721drawable.m2010q50a, C2719R.C2721drawable.m2010q50b, C2719R.C2721drawable.m2010q50c, C2719R.C2721drawable.m2010q50d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1050e, 1, this.f598b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.m2010q51, 0, 0, 0, 0, "a = 4, b = 2", "a = -4, b = -2", "a = 4, b = -2", "a = -4, b = 2", "", "c", C2719R.C2721drawable.maths1051e, 1, this.f598b));
        arrayList.add(new questions("52.", "", C2719R.C2721drawable.m2010q52, C2719R.C2721drawable.m2010q52a, C2719R.C2721drawable.m2009q52b, C2719R.C2721drawable.m2010q52c, C2719R.C2721drawable.m2010q52d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1052e, 1, this.f598b));
        arrayList.add(new questions("53.", "If the image of the line 2x-3y = 7 under a translation is  2x-3y = 0, which one of the following is a translation vector of the translation line? ", 0, 0, 0, 0, 0, "U = (2, -1)", "U = (1, -2)", "U = (-1, 2)", "U = (-2, 1)", "", "d", C2719R.C2721drawable.maths1053e, 1, this.f598b));
        arrayList.add(new questions("54.", "Let P(n) be an open proposition on the set of natural number (N). Which one of the following is correct application of the principle of mathematical induction? ", 0, 0, 0, 0, 0, "If P(10) is true; and assuming P(n) is true for any n > 10, if it follows that  P(n+1) is true, then P(n) is true for all n ≥ 10.", "If P(1) is true for n = 1; and if both P(n) and P(n+1) are true for a certain n E N  , then P(n) is true for all n E N.", "If P(10) is true; and if  P(n) is true implies that  P(n+1) is true, then P(n) is true for all n E N.", "If P(1) is true; and P(n) ---> P(n+1) is true for any n E N, then P(n) is true for all n E N.", "", "d", C2719R.C2721drawable.maths1054e, 1, this.f598b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.m2010q55, C2719R.C2721drawable.m2010q55a, C2719R.C2721drawable.m2010q55b, C2719R.C2721drawable.m2010q55c, C2719R.C2721drawable.m2010q55d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1055e, 1, this.f598b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.m2010q56, 0, 0, 0, 0, "x-2/1 = y-3/2", "x-2/2 = y-3/-1", "x-1/2 = y-3/-2", "x-1/1 = y-3/-2", "", "b", C2719R.C2721drawable.maths1056e, 1, this.f598b));
        arrayList.add(new questions("57.", "", C2719R.C2721drawable.m2010q57, 0, 0, 0, 0, "The assertion can be proved by direct method;because p is odd and 2^n=2(2^(n-1) )  is even imply that p+2^n  is odd since the sum of even and odd is odd.", "The assertion can be proved by the direct method;because n ∉N,then 2^n  ∉N and hence p+ 2^n  is not odd.", "The assertion can be proved by the method of contradiction.", "There is a counter example that disproves the assertion.", "", "d", C2719R.C2721drawable.maths1057e, 1, this.f598b));
        arrayList.add(new questions("58.", "", C2719R.C2721drawable.m2010q58, 0, 0, 0, 0, "-√2", "-1/√2", "1/√2", "√2", "", "a", C2719R.C2721drawable.maths1058e, 1, this.f598b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.m2010q59, 0, 0, 0, 0, "4", "10", "14", "18", "", "c", C2719R.C2721drawable.maths1059e, 1, this.f598b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.m2010q60, 0, 0, 0, 0, "5/√70", "7/√35", "5/√35", "7/√70", "", "a", C2719R.C2721drawable.maths1060e, 1, this.f598b));
        arrayList.add(new questions("61.", "What is the period (p) and the range(R) of f(x) = 5sin(1/3x + 2)+3 ?", 0, 0, 0, 0, 0, "p = 6π, range = [-5,5]", "p = 2/3π, range = [-5,5]", "p = 6π, range = [-2,8]", "p = 2/3π, range = [-2,8]", "", "c", C2719R.C2721drawable.maths1061e, 1, this.f598b));
        arrayList.add(new questions("62.", "", C2719R.C2721drawable.m2010q62, 0, 0, 0, 0, "Y = √2", "x = 0", "Y = √2x", "Y = -2√2", "", "b", C2719R.C2721drawable.maths1062e, 1, this.f598b));
        arrayList.add(new questions("63.", "", C2719R.C2721drawable.m2010q63, C2719R.C2721drawable.m2010q63a, C2719R.C2721drawable.m2010q63b, C2719R.C2721drawable.m2010q63c, C2719R.C2721drawable.m2010q63d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1063e, 1, this.f598b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.m2010q64, 0, 0, 0, 0, "A = (2, -1, 1)", "A = (-2, 1, -1)", "A = (-2, -1, 1)", "A = (2,1,1)", "", "a", C2719R.C2721drawable.maths1064e, 1, this.f598b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.m2010q65, C2719R.C2721drawable.m2010q65a, C2719R.C2721drawable.m2010q65b, C2719R.C2721drawable.m2010q65c, C2719R.C2721drawable.m2010q65d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1065e, 1, this.f598b));
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
        this.f599tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(180), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    maths2010.this.timer.setVisibility(0);
                    maths2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    maths2010.this.scr.setVisibility(8);
                    maths2010.this.chr.stop();
                    maths2010.this.toolbar.setVisibility(8);
                    maths2010.this.Relative.setBackgroundColor(-7829368);
                    maths2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2010.this.getBaseContext());
                    int unused = maths2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = maths2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = maths2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = maths2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = maths2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = maths2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = maths2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = maths2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = maths2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = maths2010.this.highscoreMaths2010 = defaultSharedPreferences.getInt("math2010hs", 0);
                    int access$600 = maths2010.this.part1 + maths2010.this.part2 + maths2010.this.part3 + maths2010.this.part4 + maths2010.this.part5 + maths2010.this.part6 + maths2010.this.part7 + maths2010.this.part8 + maths2010.this.part9;
                    TextView access$1600 = maths2010.this.resultText;
                    access$1600.setText(access$600 + "/65");
                    maths2010.this.progressbar.setProgress(access$600);
                    maths2010.this.progressbar.setMax(65);
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
                    int unused11 = maths2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = maths2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = maths2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = maths2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = maths2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = maths2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = maths2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = maths2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = maths2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = maths2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = maths2010.this.answered1 + maths2010.this.answered2 + maths2010.this.answered3 + maths2010.this.answered4 + maths2010.this.answered5 + maths2010.this.answered6 + maths2010.this.answered7 + maths2010.this.answered8 + maths2010.this.answered9 + maths2010.this.answered10;
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
                    if (access$600 > maths2010.this.highscoreMaths2010) {
                        edit.putInt("math2010hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 65;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - ((SystemClock.elapsedRealtime() - maths2010.this.chr.getBase()) / 1000)) * 3600) / 10800))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1math101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1math102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1math103", 0);
                    long j4 = defaultSharedPreferences.getLong("date1math104", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1math105", 0);
                    long j6 = defaultSharedPreferences.getLong("date1math106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1math107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1math108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1math109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1math1010", 0);
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
                        editor.putString("scoremath101", str);
                        editor.putLong("date1math101", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoremath102", str2);
                            editor.putLong("date1math102", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoremath103", str2);
                            editor.putLong("date1math103", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoremath104", str2);
                            editor.putLong("date1math104", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoremath105", str2);
                            editor.putLong("date1math105", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoremath106", str2);
                            editor.putLong("date1math106", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoremath107", str2);
                            editor.putLong("date1math107", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoremath108", str2);
                            editor.putLong("date1math108", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoremath109", str2);
                            editor.putLong("date1math109", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoremath1010", str2);
                            editor.putLong("date1math1010", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datemath101", 0);
                    long j12 = defaultSharedPreferences.getLong("datemath102", 0);
                    long j13 = defaultSharedPreferences.getLong("datemath103", 0);
                    long j14 = defaultSharedPreferences.getLong("datemath104", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datemath105", 0);
                    long j16 = defaultSharedPreferences.getLong("datemath106", 0);
                    long j17 = defaultSharedPreferences.getLong("datemath107", 0);
                    long j18 = defaultSharedPreferences.getLong("datemath108", 0);
                    long j19 = defaultSharedPreferences.getLong("datemath109", 0);
                    long j20 = defaultSharedPreferences.getLong("datemath1010", 0);
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
                        editor2.putString("iScoremath101", f);
                        editor2.putLong("datemath101", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoremath102", f);
                            editor2.putLong("datemath102", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoremath103", f);
                            editor2.putLong("datemath103", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoremath104", f);
                            editor2.putLong("datemath104", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoremath105", f);
                            editor2.putLong("datemath105", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoremath106", f);
                            editor2.putLong("datemath106", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoremath107", f);
                            editor2.putLong("datemath107", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoremath108", f);
                            editor2.putLong("datemath108", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoremath109", f);
                            editor2.putLong("datemath109", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoremath1010", f);
                            editor2.putLong("datemath1010", valueOf.longValue());
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
                        maths2010.this.scr.setVisibility(8);
                        maths2010.this.chr.stop();
                        maths2010.this.toolbar.setVisibility(8);
                        maths2010.this.Relative.setBackgroundColor(-7829368);
                        maths2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2010.this.getBaseContext());
                        int unused = maths2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = maths2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = maths2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = maths2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = maths2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = maths2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = maths2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = maths2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = maths2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = maths2010.this.highscoreMaths2010 = defaultSharedPreferences.getInt("math2010hs", 0);
                        int access$600 = maths2010.this.part1 + maths2010.this.part2 + maths2010.this.part3 + maths2010.this.part4 + maths2010.this.part5 + maths2010.this.part6 + maths2010.this.part7 + maths2010.this.part8 + maths2010.this.part9;
                        TextView access$1600 = maths2010.this.resultText;
                        access$1600.setText(access$600 + "/65");
                        maths2010.this.progressbar.setProgress(access$600);
                        maths2010.this.progressbar.setMax(65);
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
                        int unused11 = maths2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = maths2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = maths2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = maths2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = maths2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = maths2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = maths2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = maths2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = maths2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = maths2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = maths2010.this.answered1 + maths2010.this.answered2 + maths2010.this.answered3 + maths2010.this.answered4 + maths2010.this.answered5 + maths2010.this.answered6 + maths2010.this.answered7 + maths2010.this.answered8 + maths2010.this.answered9 + maths2010.this.answered10;
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
                        if (access$600 > maths2010.this.highscoreMaths2010) {
                            edit.putInt("math2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - maths2010.this.chr.getBase()) / 1000;
                        String str = "datemath1010";
                        String str2 = "datemath109";
                        String str3 = "datemath108";
                        String str4 = "datemath107";
                        String str5 = "datemath106";
                        String str6 = "datemath105";
                        String str7 = "datemath104";
                        String str8 = "datemath103";
                        String str9 = "datemath102";
                        String str10 = "datemath101";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1math1010";
                        String str12 = "date1math109";
                        if (maths2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - elapsedRealtime) * 3600) / 10800))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1math101", 0);
                            String str13 = "date1math101";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1math102", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1math103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1math104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1math105", 0);
                            String str16 = "date1math105";
                            String str17 = "date1math104";
                            String str18 = "date1math106";
                            long j6 = defaultSharedPreferences.getLong("date1math106", 0);
                            long j7 = defaultSharedPreferences.getLong("date1math107", 0);
                            String str19 = str12;
                            String str20 = "date1math108";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1math107";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1math103";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1math108", 0));
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
                                editor3.putString("scoremath101", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoremath102", str25);
                                    editor3.putLong("date1math102", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoremath103", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoremath104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoremath105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoremath106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoremath107", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoremath108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoremath109", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoremath1010", str25);
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
                                editor4.putString("iScoremath101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoremath102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoremath103", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoremath104", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoremath105", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoremath106", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoremath107", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoremath108", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoremath109", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoremath1010", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1math101";
                            String str30 = "date1math104";
                            String str31 = str12;
                            String str32 = "date1math103";
                            String str33 = "date1math107";
                            String str34 = "date1math106";
                            String str35 = str11;
                            String str36 = "date1math105";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 10800))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1math102", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1math102";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1math108";
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
                                editor2.putString("scoremath101", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoremath102", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoremath103", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoremath104", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoremath105", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoremath106", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoremath107", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoremath108", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoremath109", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoremath1010", str49);
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
                                editor.putString("iScoremath101", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoremath102", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoremath103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoremath104", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoremath105", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoremath106", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoremath107", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoremath108", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoremath109", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoremath1010", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        maths2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2010.this.scr.setVisibility(8);
                maths2010.this.chr.stop();
                maths2010.this.toolbar.setVisibility(8);
                maths2010.this.Relative.setBackgroundColor(maths2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                maths2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2010.this.scr.setVisibility(0);
                maths2010.this.toolbar.setVisibility(0);
                maths2010.this.telegram_layout.setVisibility(8);
                maths2010.this.chr.start();
                maths2010.this.Relative.setBackgroundColor(maths2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = maths2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = maths2010.this.mInterstitialAd = null;
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
                maths2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
