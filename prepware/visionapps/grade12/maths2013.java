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

public class maths2013 extends AppCompatActivity {
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
    private Boolean f604b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreMaths2013;
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
    private Toolbar f605tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_maths2013);
        this.f604b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextMath2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_maths2013);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.maths1301q, 0, 0, 0, 0, "[0, ∞] and (0, ∞) ", "R and [0, ∞) ", "[0, ∞) and [0, ∞) ", "[0, ∞) and R", "", "c", C2719R.C2721drawable.maths1301e, 1, this.f604b));
        arrayList.add(new questions("2.", "Which one of the following defines a one-to-one function? \n", 0, 0, 0, 0, C2719R.C2721drawable.maths1302d, "f= {(x,y): y = 3x-1)} ", "f= {(x,y): x is a sister of y} ", "f= {(x,y): y is a father of x}", "", "", "a", C2719R.C2721drawable.maths1302e, 1, this.f604b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.maths1303q, 0, 0, 0, 0, "(3, 2) and 3 ", "(3, -2) and 3 ", "(3, 2) and 9 ", "(3, -2) and 9", "", "b", C2719R.C2721drawable.maths1303e, 1, this.f604b));
        arrayList.add(new questions("4.", "Which one of the following sentences has a truth value? \n", 0, 0, 0, 0, 0, "We shall win! ", "Man is selfish. ", "Tomorrow is a beautiful day. ", "Man is mortal.", "Truth value is a value indicating either true or false, but not both. \nThe statement, man is mortal is true. ", "d", 0, 1, this.f604b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.maths1305q, 0, 0, 0, 0, "-47 ", "-37 ", "37 ", "47", "", "d", C2719R.C2721drawable.maths1305e, 1, this.f604b));
        arrayList.add(new questions("6.", "The additive inverse of the complex number 3-4i is \n", 0, 0, 0, 0, 0, "-3 – 4i", "3 + 4i ", "-3 - 4i", "3 - 4i", "Additive inverse is a number or set of numbers that when added give zero. For value a + b, its additive inverse is -a -b. \nUsing the above fact \nThe additive inverse of 3 — 4i is-3 + 4i ", "c", 0, 1, this.f604b));
        arrayList.add(new questions("7.", "What is the modulus of the complex number -6 + 8i?\n", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "5", "8", "10", "", "d", C2719R.C2721drawable.maths1307e, 1, this.f604b));
        arrayList.add(new questions("8.", "What are the modulus and argument of the complex number 2 + 2i respectively?\n", 0, 0, 0, 0, 0, "2 and π/4 ", "2√2 and π/4 ", "4 and π/4 ", "2√2 and - π /4", "", "b", C2719R.C2721drawable.maths1308e, 1, this.f604b));
        arrayList.add(new questions("9.", "Given two vectors u = (1, 3) and v = (-3, 5) in the plane. \nThen 6u + 2v is equal to \n", 0, 0, 0, 0, 0, "(3, 3)", "(0, 18) ", "(0, 28) ", "(2, 28)", "", "c", C2719R.C2721drawable.maths1309e, 1, this.f604b));
        arrayList.add(new questions("10.", "Which one of the following is the standard form of the equation of the circle centered at (2, -3) and radius 5? \n", 0, C2719R.C2721drawable.maths1310a, C2719R.C2721drawable.maths1310b, C2719R.C2721drawable.maths1310c, C2719R.C2721drawable.maths1310d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1310e, 1, this.f604b));
        arrayList.add(new questions("11.", "If f is a continuous function on [a, b] and F is its Anti-derivative, then which of the following is True?\n", 0, C2719R.C2721drawable.maths1311a, C2719R.C2721drawable.maths1311b, C2719R.C2721drawable.maths1311c, C2719R.C2721drawable.maths1311d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1311e, 1, this.f604b));
        arrayList.add(new questions("12.", "Which of the following defines the equation of a sphere whose center is at (0, -1, 2) and radius 6 units?\n", 0, C2719R.C2721drawable.maths1312a, C2719R.C2721drawable.maths1312b, C2719R.C2721drawable.maths1312c, C2719R.C2721drawable.maths1312d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1312e, 1, this.f604b));
        arrayList.add(new questions("13.", "Which of the following represents the vector (3,-5,7) in the space using the standard unit vectors l, I and k? \n", 0, 0, 0, 0, 0, "3i + 5j + 7k ", "3i – 5j – 7k", "-3i – 5j - 7k ", "3i - 5j + 7k", "", "d", C2719R.C2721drawable.maths1313e, 1, this.f604b));
        arrayList.add(new questions("14.", "Which one of the following is the scalar (dot) product of the vectors (2, -4, 6) and (-2, -1, 0)\n", 0, 0, 0, 0, 0, "-8", "0", "6", "8", "", "b", C2719R.C2721drawable.maths1314e, 1, this.f604b));
        arrayList.add(new questions("15.", "The inverse of the function y= 3x - 5 is equal to ", 0, 0, 0, 0, 0, "y = (x+3)/5", "y = (x+5)/3", "y = -5x + 3", "y = (x-5)/3", "", "b", C2719R.C2721drawable.maths1315e, 1, this.f604b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.maths1316q, 0, 0, 0, 0, "R/{0}", "R/{0, 1}", "R/{0, -1}", "R/{0, 1, -1}", "", "c", C2719R.C2721drawable.maths1316e, 1, this.f604b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.maths1317q, 0, 0, 0, 0, "y = 0 is its horizontal asymptote. ", "x = 1 is its vertical asymptote. ", "It is increasing on (∞,1). ", "It is decreasing on (1, ∞).", "", "d", C2719R.C2721drawable.maths1317e, 1, this.f604b));
        arrayList.add(new questions("18.", "The equation of a line is given by 3x - 2y + 6 = 0. Then which of the following is true about the line? \n", 0, 0, 0, 0, 0, "Its slope is 3/2. ", "Its y-intercept is -3. ", "Its x-intercept is 2. ", "(2,5) lies on the line.", "", "a", C2719R.C2721drawable.maths1318e, 1, this.f604b));
        arrayList.add(new questions("19.", "Which one of the following is the standard form of the equation of the parabola with vertex (4,6) and focus (-8,6)?\n", 0, C2719R.C2721drawable.maths1319a, C2719R.C2721drawable.maths1319b, C2719R.C2721drawable.maths1319c, C2719R.C2721drawable.maths1319d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1319e, 1, this.f604b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.maths1320q, 0, 0, 0, 0, "Its vertices are at (-2,0) and (2,0).", "Its foci are at (-5,0) and (5,0). ", "An asymptote to the hyperbola is y=2x. ", "Its center is at (2,1)", "", "a", C2719R.C2721drawable.maths1320e, 1, this.f604b));
        arrayList.add(new questions("21.", "Two statements p and q are given by p:22/7 is an irrational number. q= the sum of two odd integers is odd. Then which of the following has a truth value T?", 0, C2719R.C2721drawable.maths1321a, C2719R.C2721drawable.maths1321b, C2719R.C2721drawable.maths1321c, C2719R.C2721drawable.maths1321d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1321e, 1, this.f604b));
        arrayList.add(new questions("22.", "Which one of the following is the contrapositive of the statement: 'If 21 is a prime number, then 4 is an odd number'\n", 0, 0, 0, 0, 0, "If 4 is an odd number, then 21 is a prime number.", "If 4 is an odd number, then 21 is not a prime number.", "If 21 is not a prime number, then 4 is an even number. ", "If 4 is not an odd number, then 21 is not a prime number.", "", "d", C2719R.C2721drawable.maths1322e, 1, this.f604b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.maths1323q, 0, 0, 0, 0, "5", "6.5", "7", "7.5", "", "c", C2719R.C2721drawable.maths1323e, 1, this.f604b));
        arrayList.add(new questions("24.", "In a certain health center there are 3 doctors, 8 nurses and 2 physicians. In how many ways one can form a group of 5 members consisting of 1 doctor, 3 nurses and 1 physician? \n", 0, 0, 0, 0, 0, "112", "168", "330", "336", "", "d", C2719R.C2721drawable.maths1324e, 1, this.f604b));
        arrayList.add(new questions("25.", "Which one of the following forms represents an exhaustive set of events if a die is thrown once?\n", 0, 0, 0, 0, 0, "{1, 2, 3}, {4, 5}, {6}", "{1, 2}, {4}, {4, 5, 6}", "{1, 2, 3}, {3, 4}, {6}", "{1, 2}, {2}, {4, 5}, {5, 6}", "Exhaustive events is a set of events where at least one of them must occur whenever the experiment is performed. \nThe exhaustive events of a die thrown once is {1,2,3}, {4,5}, {6} ", "a", 0, 1, this.f604b));
        arrayList.add(new questions("26.", "A bag contains 2 red, 3 yellow and 5 green balls. One ball is drawn at random. What is the probability that the drawn ball is NOT yellow? \n", 0, 0, 0, 0, 0, "1/5 ", "3/10 ", "7/10 ", "4/5", "Given \n\n2 red, 3 yellow and 5 green balls \n\nSolution \n\nP(red ball) = 2/10 \nP(green ball) = 5/10 \nP(yellow ball) = 3/10 \nP(not yellow) = 1 — P(yellow) \n= 1 - 3/10 \n= 7/10 ", "c", 0, 1, this.f604b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.maths1327q, C2719R.C2721drawable.maths1327a, C2719R.C2721drawable.maths1327b, C2719R.C2721drawable.maths1327c, C2719R.C2721drawable.maths1327d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1327e, 1, this.f604b));
        arrayList.add(new questions("28.", "Which one of the following is NOT true about the determinant of a given square matrix A? \n", 0, 0, 0, 0, 0, "If A has identical rows, then its determinant is zero. ", "If A contains a row of zeros, then its determinant is zero. ", "Interchanging two rows of A gives the same determinant. ", "The determinant of A is equal to the determinant of its transpose.", "", "c", C2719R.C2721drawable.maths1328e, 1, this.f604b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.maths1329q, C2719R.C2721drawable.maths1329a, C2719R.C2721drawable.maths1329b, C2719R.C2721drawable.maths1329c, C2719R.C2721drawable.maths1329d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1329e, 1, this.f604b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.maths1330q, 0, 0, 0, 0, "If a = -2, then the system has a unique solution. ", "If a > -2, then the system has a unique solution. ", "If a > 2, then the system has infinitely many solutions. ", "If a = 2, then the system has no solution.", "", "b", C2719R.C2721drawable.maths1330e, 1, this.f604b));
        arrayList.add(new questions("31.", "What is the magnitude of the vector whose initial point is at (1, -3) and terminal point is at (4, 1)? \n", 0, 0, 0, 0, 0, "6", "5", "4", "1", "", "b", C2719R.C2721drawable.maths1331e, 1, this.f604b));
        arrayList.add(new questions("32.", "Let T be a translation that takes the origin into (2,3). Then which of the following is true about the translation T?\n", 0, C2719R.C2721drawable.maths1332a, C2719R.C2721drawable.maths1332b, C2719R.C2721drawable.maths1332c, C2719R.C2721drawable.maths1332d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1332e, 1, this.f604b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.maths1333q, 0, 0, 0, 0, "f(x) = secx ", "f(x) = tanx ", "f(x) = cotx ", "f(x) = cscx", "", "c", C2719R.C2721drawable.maths1333e, 1, this.f604b));
        arrayList.add(new questions("34.", "Which of the following is true?", 0, C2719R.C2721drawable.maths1334a, C2719R.C2721drawable.maths1334b, C2719R.C2721drawable.maths1334c, C2719R.C2721drawable.maths1334d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1334e, 1, this.f604b));
        arrayList.add(new questions("35.", "Which one of the following is the fourth term of the sequence {cos(nπ/2)}? \n", 0, 0, 0, 0, 0, "-1", "0", "0.5", "1", "", "d", C2719R.C2721drawable.maths1335e, 1, this.f604b));
        arrayList.add(new questions("36.", "Which of the following is a geometric sequence? \n", 0, 0, 0, 0, 0, "0.1, 0.01, 0.0011, 0.000111, ... ", "1, 1.5, 2.5, 3.5, ... ", "0.1, 0.11, 0.12, 0.13, ...", "8, -4, 2, -1, …", "8, -4, 2, -1, … Is a geometric sequence with first term 8 and common ratio -1/2 ", "d", 0, 1, this.f604b));
        arrayList.add(new questions("37.", "A factory that produces electric cable had sales Birr 1,000,000 the first day. During each successive days the sales increased by Birr 10,000 every day. What is the total sales of the factory in the first 10 days? \n", 0, 0, 0, 0, 0, "Birr 1,090,000", "Birr 10,000,000", "Birr 10,450,000", "Birr 10,900,000", "", "c", C2719R.C2721drawable.maths1337e, 1, this.f604b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.maths1338q, 0, 0, 0, 0, "0", "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "", "d", C2719R.C2721drawable.maths1338e, 1, this.f604b));
        arrayList.add(new questions("39.", "Which one of the following sequences is a null sequence? \n", 0, 0, 0, 0, 0, "{1-1/n}", "{nsin(1/n)} ", "{cosn/n} ", "{n/n+1}", "", "c", C2719R.C2721drawable.maths1339e, 1, this.f604b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.maths1340q, C2719R.C2721drawable.maths1340a, C2719R.C2721drawable.maths1340b, C2719R.C2721drawable.maths1340c, C2719R.C2721drawable.maths1340d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1340e, 1, this.f604b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.maths1341q, 0, 0, 0, 0, "-3", "-1", "0", "1", "", "a", C2719R.C2721drawable.maths1341e, 1, this.f604b));
        arrayList.add(new questions("42.", "Which of the following is the same as the derivative of a function f at a point P, where P is on the graph of f? \n", 0, 0, 0, 0, 0, "The slope of a secant line through P. ", "The continuity of the function at P. ", "The graph of f has no jump at P. ", "The slope of the tangent line through P.", "", "d", C2719R.C2721drawable.maths1342e, 1, this.f604b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.maths1343q, 0, 0, 0, 0, "-3", "-1", "1", ExifInterface.GPS_MEASUREMENT_3D, "", "d", C2719R.C2721drawable.maths1343e, 1, this.f604b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.maths1344q, C2719R.C2721drawable.maths1344a, C2719R.C2721drawable.maths1344b, C2719R.C2721drawable.maths1344c, C2719R.C2721drawable.maths1344d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1344e, 1, this.f604b));
        arrayList.add(new questions("45.", "Which of the following is true about the zero of a function? \n", 0, 0, 0, 0, 0, "It is the x-intercept of the function. ", "It is the y-intercept of the function. ", "It is the critical point of the function. ", "It is the concavity point of the function.", "The zero of a function is the x-intercept of the function. i.e., f(x)= 0 ", "a", 0, 1, this.f604b));
        arrayList.add(new questions("46.", "", C2719R.C2721drawable.maths1346q, 0, 0, 0, 0, "Its critical numbers are 0, 2, 3 and its maximum value is 0. ", "Its critical numbers are 0 and 2 and its maximum value is 15. ", "Its critical numbers are 0 and 2 and its maximum value is -4. ", "It has critical numbers at 0 and 2 and its maximum value is 0.", "", "d", C2719R.C2721drawable.maths1346e, 1, this.f604b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.maths1347q, 0, 0, 0, 0, "-3/2", "1", "3/2", ExifInterface.GPS_MEASUREMENT_2D, "", "c", C2719R.C2721drawable.maths1347e, 1, this.f604b));
        arrayList.add(new questions("48.", "What are the length L and width W of a rectangle with perimeter 10,000m that maximizes the area? \n", 0, 0, 0, 0, 0, "L = 2,500m and W = 2,500m", "L = 2,500m and W = 3,000m", "L = 3,000m and W = 2,500m", "L = 5,000m and W = 5,000m", "", "a", C2719R.C2721drawable.maths1348e, 1, this.f604b));
        arrayList.add(new questions("49.", "If the radius r of a sphere is increasing at the rate of 2cm/min, then the rate of change of the volume of when r=1cm is\n", 0, C2719R.C2721drawable.maths1349a, C2719R.C2721drawable.maths1349b, C2719R.C2721drawable.maths1349c, C2719R.C2721drawable.maths1349d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1349e, 1, this.f604b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.maths1350q, C2719R.C2721drawable.maths1350a, C2719R.C2721drawable.maths1350b, C2719R.C2721drawable.maths1350c, C2719R.C2721drawable.maths1350d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1350e, 1, this.f604b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.maths1351q, 0, 0, 0, 0, "2/3", "22/3", "8", "26/3", "", "b", C2719R.C2721drawable.maths1351e, 1, this.f604b));
        arrayList.add(new questions("52.", "", C2719R.C2721drawable.maths1352q, 0, 0, 0, 0, "-4", ExifInterface.GPS_MEASUREMENT_2D, "4", "16", "", "a", C2719R.C2721drawable.maths1352e, 1, this.f604b));
        arrayList.add(new questions("53.", "Which of the following statements has a truth value T?\n", 0, C2719R.C2721drawable.maths1353a, C2719R.C2721drawable.maths1353b, C2719R.C2721drawable.maths1353c, C2719R.C2721drawable.maths1353d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1353e, 1, this.f604b));
        arrayList.add(new questions("54.", "", C2719R.C2721drawable.maths1354q, 0, 0, 0, 0, "4", "5", "√20", "√21", "", "d", C2719R.C2721drawable.maths1354e, 1, this.f604b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.maths1355q, 0, 0, 0, 0, "0", "6", "500", "576", "", "a", C2719R.C2721drawable.maths1355e, 1, this.f604b));
        arrayList.add(new questions("56.", "Which of the following is true about the graph of y = -4cos(2x/3)?", 0, 0, 0, 0, 0, "Its amplitude is -4 ", "Its period is 3π ", "The graph completes one cycle on the interval [0, 2π /3] ", "The graph completes one cycle on the interval [0, 3π /2]", "", "b", C2719R.C2721drawable.maths1356e, 1, this.f604b));
        arrayList.add(new questions("57.", "", C2719R.C2721drawable.maths1357q, 0, 0, 0, 0, "4m", "8m", "12m", "14m", "", "c", C2719R.C2721drawable.maths1357e, 1, this.f604b));
        arrayList.add(new questions("58.", "Which of the following series is convergent?", 0, C2719R.C2721drawable.maths1358a, C2719R.C2721drawable.maths1358b, C2719R.C2721drawable.maths1358c, C2719R.C2721drawable.maths1358d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1358e, 1, this.f604b));
        arrayList.add(new questions("59.", "Let f be a function defined on a closed bounded interval [a,b]. Which of the following describes that f is continuous on [a,b]? \n", 0, 0, 0, 0, 0, "f is continuous at each point in (a,b) and at both a and b. ", "f is continuous on (a,b), f is continuous from the right at a and from the left at b. ", "f is continuous on (a,b), f is continuous from the left at a and from the left b. ", "f is continuous on (a,b), f is continuous from the left at a and from the right at b.", "If f is continuous on [a, b], then \n•f is continuous on (a, b) \n• f is continuous from the right at a \n• f is continuous from the left at b \n", "b", 0, 1, this.f604b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.maths1360q, C2719R.C2721drawable.maths1360a, C2719R.C2721drawable.maths1360b, C2719R.C2721drawable.maths1360c, C2719R.C2721drawable.maths1360d, "2π", ExifInterface.GPS_MEASUREMENT_2D, "2π+1", "2π-1", "", "c", C2719R.C2721drawable.maths1360e, 1, this.f604b));
        arrayList.add(new questions("61.", "If f'(1) = 4, f(1) = 3 and g'(3) = 5, then (gof)'(l) is equal to \n", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_3D, "5", "15", "20", "", "d", C2719R.C2721drawable.maths1361e, 1, this.f604b));
        arrayList.add(new questions("62.", "Which of the following is true where c is at constant?\n", 0, C2719R.C2721drawable.maths1362a, C2719R.C2721drawable.maths1362b, C2719R.C2721drawable.maths1362c, C2719R.C2721drawable.maths1362d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1362e, 1, this.f604b));
        arrayList.add(new questions("63.", "", C2719R.C2721drawable.maths1363q, C2719R.C2721drawable.maths1363a, C2719R.C2721drawable.maths1363b, C2719R.C2721drawable.maths1363c, C2719R.C2721drawable.maths1363d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1363e, 1, this.f604b));
        arrayList.add(new questions("64.", "Which of the following arguments is valid?", 0, C2719R.C2721drawable.maths1364a, C2719R.C2721drawable.maths1364b, C2719R.C2721drawable.maths1364c, C2719R.C2721drawable.maths1364d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1364e, 1, this.f604b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.maths1365q, 0, 0, 0, 0, "Proof by the principle of mathematical induction. ", "Proof by counter example. ", "Proof by indirect proof. ", "Proof by contradiction.", "Proof by the principle of mathematical induction. ", "a", 0, 1, this.f604b));
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
        this.f605tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(180), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    maths2013.this.timer.setVisibility(0);
                    maths2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    maths2013.this.scr.setVisibility(8);
                    maths2013.this.chr.stop();
                    maths2013.this.toolbar.setVisibility(8);
                    maths2013.this.Relative.setBackgroundColor(-7829368);
                    maths2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2013.this.getBaseContext());
                    int unused = maths2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = maths2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = maths2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = maths2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = maths2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = maths2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = maths2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = maths2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = maths2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = maths2013.this.highscoreMaths2013 = defaultSharedPreferences.getInt("math2013hs", 0);
                    int access$600 = maths2013.this.part1 + maths2013.this.part2 + maths2013.this.part3 + maths2013.this.part4 + maths2013.this.part5 + maths2013.this.part6 + maths2013.this.part7 + maths2013.this.part8 + maths2013.this.part9;
                    TextView access$1600 = maths2013.this.resultText;
                    access$1600.setText(access$600 + "/65");
                    maths2013.this.progressbar.setProgress(access$600);
                    maths2013.this.progressbar.setMax(65);
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
                    int unused11 = maths2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = maths2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = maths2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = maths2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = maths2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = maths2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = maths2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = maths2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = maths2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = maths2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = maths2013.this.answered1 + maths2013.this.answered2 + maths2013.this.answered3 + maths2013.this.answered4 + maths2013.this.answered5 + maths2013.this.answered6 + maths2013.this.answered7 + maths2013.this.answered8 + maths2013.this.answered9 + maths2013.this.answered10;
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
                    if (access$600 > maths2013.this.highscoreMaths2013) {
                        edit.putInt("math2013hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 65;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - ((SystemClock.elapsedRealtime() - maths2013.this.chr.getBase()) / 1000)) * 3600) / 10800))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1math131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1math132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1math133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1math134", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1math135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1math136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1math137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1math138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1math139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1math1310", 0);
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
                        editor.putString("scoremath131", str);
                        editor.putLong("date1math131", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoremath132", str2);
                            editor.putLong("date1math132", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoremath133", str2);
                            editor.putLong("date1math133", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoremath134", str2);
                            editor.putLong("date1math134", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoremath135", str2);
                            editor.putLong("date1math135", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoremath136", str2);
                            editor.putLong("date1math136", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoremath137", str2);
                            editor.putLong("date1math137", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoremath138", str2);
                            editor.putLong("date1math138", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoremath139", str2);
                            editor.putLong("date1math139", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoremath1310", str2);
                            editor.putLong("date1math1310", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datemath131", 0);
                    long j12 = defaultSharedPreferences.getLong("datemath132", 0);
                    long j13 = defaultSharedPreferences.getLong("datemath133", 0);
                    long j14 = defaultSharedPreferences.getLong("datemath134", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datemath135", 0);
                    long j16 = defaultSharedPreferences.getLong("datemath136", 0);
                    long j17 = defaultSharedPreferences.getLong("datemath137", 0);
                    long j18 = defaultSharedPreferences.getLong("datemath138", 0);
                    long j19 = defaultSharedPreferences.getLong("datemath139", 0);
                    long j20 = defaultSharedPreferences.getLong("datemath1310", 0);
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
                        editor2.putString("iScoremath131", f);
                        editor2.putLong("datemath131", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoremath132", f);
                            editor2.putLong("datemath132", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoremath133", f);
                            editor2.putLong("datemath133", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoremath134", f);
                            editor2.putLong("datemath134", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoremath135", f);
                            editor2.putLong("datemath135", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoremath136", f);
                            editor2.putLong("datemath136", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoremath137", f);
                            editor2.putLong("datemath137", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoremath138", f);
                            editor2.putLong("datemath138", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoremath139", f);
                            editor2.putLong("datemath139", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoremath1310", f);
                            editor2.putLong("datemath1310", valueOf.longValue());
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
                        maths2013.this.scr.setVisibility(8);
                        maths2013.this.chr.stop();
                        maths2013.this.toolbar.setVisibility(8);
                        maths2013.this.Relative.setBackgroundColor(-7829368);
                        maths2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2013.this.getBaseContext());
                        int unused = maths2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = maths2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = maths2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = maths2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = maths2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = maths2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = maths2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = maths2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = maths2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = maths2013.this.highscoreMaths2013 = defaultSharedPreferences.getInt("math2013hs", 0);
                        int access$600 = maths2013.this.part1 + maths2013.this.part2 + maths2013.this.part3 + maths2013.this.part4 + maths2013.this.part5 + maths2013.this.part6 + maths2013.this.part7 + maths2013.this.part8 + maths2013.this.part9;
                        TextView access$1600 = maths2013.this.resultText;
                        access$1600.setText(access$600 + "/65");
                        maths2013.this.progressbar.setProgress(access$600);
                        maths2013.this.progressbar.setMax(65);
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
                        int unused11 = maths2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = maths2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = maths2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = maths2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = maths2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = maths2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = maths2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = maths2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = maths2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = maths2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = maths2013.this.answered1 + maths2013.this.answered2 + maths2013.this.answered3 + maths2013.this.answered4 + maths2013.this.answered5 + maths2013.this.answered6 + maths2013.this.answered7 + maths2013.this.answered8 + maths2013.this.answered9 + maths2013.this.answered10;
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
                        if (access$600 > maths2013.this.highscoreMaths2013) {
                            edit.putInt("math2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - maths2013.this.chr.getBase()) / 1000;
                        String str = "datemath1310";
                        String str2 = "datemath139";
                        String str3 = "datemath138";
                        String str4 = "datemath137";
                        String str5 = "datemath136";
                        String str6 = "datemath135";
                        String str7 = "datemath134";
                        String str8 = "datemath133";
                        String str9 = "datemath132";
                        String str10 = "datemath131";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1math1310";
                        String str12 = "date1math139";
                        if (maths2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - elapsedRealtime) * 3600) / 10800))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1math131", 0);
                            String str13 = "date1math131";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1math132", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1math133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1math134", 0);
                            long j5 = defaultSharedPreferences.getLong("date1math135", 0);
                            String str16 = "date1math135";
                            String str17 = "date1math134";
                            String str18 = "date1math136";
                            long j6 = defaultSharedPreferences.getLong("date1math136", 0);
                            long j7 = defaultSharedPreferences.getLong("date1math137", 0);
                            String str19 = str12;
                            String str20 = "date1math138";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1math137";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1math133";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1math138", 0));
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
                                editor3.putString("scoremath131", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoremath132", str25);
                                    editor3.putLong("date1math132", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoremath133", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoremath134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoremath135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoremath136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoremath137", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoremath138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoremath139", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoremath1310", str25);
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
                                editor4.putString("iScoremath131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoremath132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoremath133", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoremath134", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoremath135", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoremath136", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoremath137", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoremath138", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoremath139", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoremath1310", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1math131";
                            String str30 = "date1math134";
                            String str31 = str12;
                            String str32 = "date1math133";
                            String str33 = "date1math137";
                            String str34 = "date1math136";
                            String str35 = str11;
                            String str36 = "date1math135";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 10800))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1math132", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1math132";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1math138";
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
                                editor2.putString("scoremath131", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoremath132", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoremath133", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoremath134", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoremath135", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoremath136", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoremath137", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoremath138", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoremath139", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoremath1310", str49);
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
                                editor.putString("iScoremath131", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoremath132", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoremath133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoremath134", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoremath135", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoremath136", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoremath137", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoremath138", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoremath139", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoremath1310", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        maths2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2013.this.scr.setVisibility(8);
                maths2013.this.chr.stop();
                maths2013.this.toolbar.setVisibility(8);
                maths2013.this.Relative.setBackgroundColor(maths2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                maths2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2013.this.scr.setVisibility(0);
                maths2013.this.toolbar.setVisibility(0);
                maths2013.this.telegram_layout.setVisibility(8);
                maths2013.this.chr.start();
                maths2013.this.Relative.setBackgroundColor(maths2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = maths2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = maths2013.this.mInterstitialAd = null;
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
                maths2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
