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

public class maths2012 extends AppCompatActivity {
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
    private Boolean f602b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreMaths2012;
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
    private Toolbar f603tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_maths2012);
        this.f602b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextMath2012);
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
        arrayList.add(new questions("1.", "A Geometric Series with first term a and common ratio r is convergent if", 0, 0, 0, 0, 0, "r≥1", "r>1", "r≤1", "r<1", "", "n", C2719R.C2721drawable.maths121e, 1, this.f602b));
        arrayList.add(new questions("2.", "", C2719R.C2721drawable.maths122q, 0, 0, 0, 0, "1", "0", ExifInterface.GPS_MEASUREMENT_2D, "4/3", "", "c", C2719R.C2721drawable.maths122e, 1, this.f602b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.maths123q, 0, 0, 0, 0, "0 is one of its terms. ", "Its terms are non-positive.", "Its terms are odd numbers.", "Its terms are natural numbers.", "", "d", C2719R.C2721drawable.maths123e, 1, this.f602b));
        arrayList.add(new questions("4.", "The distance between point (4,-3) and the line l:x+y-7=0 is", 0, 0, 0, C2719R.C2721drawable.maths124c, 0, "4√2", "2√2", "", "3√2", "", "d", C2719R.C2721drawable.maths124e, 1, this.f602b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.maths125q, 0, 0, 0, 0, "The line x=-1/2 is a vertical asymptote ", "Graph of f has hole at a point(1,1/3).", "f Is an even function", "The line y=1/2 is a horizontal asymptote", "", "c", C2719R.C2721drawable.maths125e, 1, this.f602b));
        arrayList.add(new questions("6.", "Which one of the following statements is NOT true?", 0, 0, 0, 0, 0, "When a variance of a data is close to zero, the data shows less variability", "Variance indicates the variability of a set of numerical data items", "If two data have equal mean, the data with less variance shows less variability.", "The large value of variance shows that the data values are closer to the mean.", "", "d", C2719R.C2721drawable.maths126e, 1, this.f602b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.maths127q, 0, 0, 0, 0, "15", "14", "12.5", "13", "", "a", C2719R.C2721drawable.maths127e, 1, this.f602b));
        arrayList.add(new questions("8.", "If p: \"the rainy season is very good this year\" and q : \"rivers are rising\", then the statement \"It is not true that neither the rainy season is very good this year nor rivers are rising\" is denoted by:", 0, 0, 0, 0, 0, "(¬p⇒¬q)∨¬q", "(p⇒q)∨(¬p⇒¬q)", "¬p∧¬q", "¬(¬p∨¬q)", "", "n", C2719R.C2721drawable.maths128e, 1, this.f602b));
        arrayList.add(new questions("9.", "", C2719R.C2721drawable.maths129q, C2719R.C2721drawable.maths129a, C2719R.C2721drawable.maths129b, C2719R.C2721drawable.maths129c, C2719R.C2721drawable.maths129d, "", "", "", "", "", "a", C2719R.C2721drawable.maths129e, 1, this.f602b));
        arrayList.add(new questions("10.", "Given 0<a_n<1/n for each n=1,2,3,…, which one of the following is true?", 0, C2719R.C2721drawable.maths1210a, C2719R.C2721drawable.maths1210b, C2719R.C2721drawable.maths1210c, C2719R.C2721drawable.maths1210d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1210e, 1, this.f602b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.maths1211q, 0, 0, 0, 0, "-6", "6", "-2", ExifInterface.GPS_MEASUREMENT_2D, "", "d", C2719R.C2721drawable.maths1211e, 1, this.f602b));
        arrayList.add(new questions("12.", "", C2719R.C2721drawable.maths1212q, C2719R.C2721drawable.maths1212a, C2719R.C2721drawable.maths1212b, C2719R.C2721drawable.maths1212c, C2719R.C2721drawable.maths1212d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1212e, 1, this.f602b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.maths1213q, 0, 0, 0, 0, "6 and 3", "-6 and -3", "-1 and 1", "10 and 0", "", "d", C2719R.C2721drawable.maths1213e, 1, this.f602b));
        arrayList.add(new questions("14.", "", C2719R.C2721drawable.maths1214q, 0, 0, 0, 0, "a=3/4,b=-8/3", "a=3/4,b=8/3", "a=-3/4,b=8/3", "a=-3/4,b=-8/3", "", "c", C2719R.C2721drawable.maths1214e, 1, this.f602b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.maths1215q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_3D, "√3", "3.2", "2.3", "", "d", C2719R.C2721drawable.maths1215e, 1, this.f602b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.maths1216q, C2719R.C2721drawable.maths1216a, C2719R.C2721drawable.maths1216b, C2719R.C2721drawable.maths1216c, C2719R.C2721drawable.maths1216d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1216e, 1, this.f602b));
        arrayList.add(new questions("17.", "If p and q are propositions, then which one of the following pairs of compound propositions are equivalent?", 0, 0, 0, 0, 0, "p⇒¬q And ¬p∧q", "¬(p∧q) and ¬p∨q", "p⇔q and →p↔7q", "¬p⇒q and q⇒¬p", "", "c", C2719R.C2721drawable.maths1217e, 1, this.f602b));
        arrayList.add(new questions("18.", "The volume of a cube is increasing at a rate of 9〖\" \" cm〗^1/sec. How fact is the surface area increasing when the length of the edge is 10\" \" cm ?", 0, 0, 0, 0, 0, "3.6〖\" \" cm〗^2/sec", "36〖\" \" cm〗^2/sec", "90〖\" \" cm〗^2/sec", "6〖\" \" cm〗^2/sec", "", "a", C2719R.C2721drawable.maths1218e, 1, this.f602b));
        arrayList.add(new questions("19.", "The product of two positive numbers is 100 such that the sum of two times the first number and eight times the second number is minimum. Which one of the following pairs of numbers are the first and the second numbers respectively?", 0, 0, 0, 0, 0, "25 and 4", "20 and 5", "1 and 99", "50 and 2", "", "b", C2719R.C2721drawable.maths1219e, 1, this.f602b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.maths1220q, 0, 0, 0, 0, "124", "31", "2232", "108", "", "d", C2719R.C2721drawable.maths1220e, 1, this.f602b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.maths1221q, 0, 0, 0, 0, "7/4", "4", ExifInterface.GPS_MEASUREMENT_2D, "7/2", "", "a", C2719R.C2721drawable.maths1221e, 1, this.f602b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.maths1222q, C2719R.C2721drawable.maths1222a, C2719R.C2721drawable.maths1222b, C2719R.C2721drawable.maths1222c, C2719R.C2721drawable.maths1222d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1222e, 1, this.f602b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.maths1223q, 0, 0, 0, 0, "The period is 2π", "The Amplitude is 1", "The range is [-5,1]", "The phase shift is 6", "", "c", C2719R.C2721drawable.maths1223e, 1, this.f602b));
        arrayList.add(new questions("24.", "If the 1st and 4th terms of a geometric progression are 3 and 81 respectively, what is the common ratio of this progression?", 0, 0, 0, 0, 0, "1/3", "9", "1/9", ExifInterface.GPS_MEASUREMENT_3D, "", "d", C2719R.C2721drawable.maths1224e, 1, this.f602b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.maths1225q, 0, 0, 0, 0, "-1", "1", "-1/3", "1/3", "", "n", C2719R.C2721drawable.maths1225e, 1, this.f602b));
        arrayList.add(new questions("26.", "What is the solution? kx-2y-z=5", 0, 0, 0, 0, 0, "R", "R/{1}", "R/{-1}", "R/{-1,1}", "", "a", C2719R.C2721drawable.maths1226e, 1, this.f602b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.maths1227q, C2719R.C2721drawable.maths1227a, C2719R.C2721drawable.maths1227b, C2719R.C2721drawable.maths1227c, C2719R.C2721drawable.maths1227d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1227e, 1, this.f602b));
        arrayList.add(new questions("28.", "", C2719R.C2721drawable.maths1228q, 0, 0, 0, 0, "(-2,1)∪(1,2)", "(-2,2)", "(-∞,-2)∪(2,∞)", "{-2,1)∪(1,2}", "", "a", C2719R.C2721drawable.maths1228e, 1, this.f602b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.maths1229q, 0, 0, 0, 0, "[1,∞)", "(-∞,1]", "(-∞,-1)∪(-1,∞)", "(-∞,1)∪(1,∞)", "", "d", C2719R.C2721drawable.maths1229e, 1, this.f602b));
        arrayList.add(new questions("30.", "", 0, 0, 0, 0, 0, "", "", "", "", "", "c", C2719R.C2721drawable.maths1230e, 1, this.f602b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.maths1231q, 0, 0, 0, 0, "-x(xcos⁡x+2sin⁡x)", "1+cos⁡x+2sin⁡x", "x(xcos⁡x-2sin⁡x)", "1-cos⁡x-2sin⁡x", "", "a", C2719R.C2721drawable.maths1231e, 1, this.f602b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.maths1232q, C2719R.C2721drawable.maths1232a, C2719R.C2721drawable.maths1232b, C2719R.C2721drawable.maths1232c, C2719R.C2721drawable.maths1232d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1232e, 1, this.f602b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.maths1233q, C2719R.C2721drawable.maths1233a, C2719R.C2721drawable.maths1233b, C2719R.C2721drawable.maths1233c, C2719R.C2721drawable.maths1233d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1233e, 1, this.f602b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.maths1234q, 0, 0, 0, 0, "k≠-1/2", "k=-1/3,1/2", "k≠- 1/6", "k≠ 1/2", "", "d", C2719R.C2721drawable.maths1234e, 1, this.f602b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.maths1235q, C2719R.C2721drawable.maths1235a, C2719R.C2721drawable.maths1235b, C2719R.C2721drawable.maths1235c, C2719R.C2721drawable.maths1235d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1235e, 1, this.f602b));
        arrayList.add(new questions("36.", "", C2719R.C2721drawable.maths1236q, 0, 0, 0, 0, "m is odd, n is even and m>n", "m is even, n is odd and m<n", "m is odd, n is even and m<n", "m is even, n is odd and m>n", "", "a", C2719R.C2721drawable.maths1236e, 1, this.f602b));
        arrayList.add(new questions("37.", "Consider the experiment of rolling a die whose sample space is{1,2,3,4,5,6} If two dies are rolled simultancously, what is the probability that a prime number turns up on one of the dice and a composite number on the other'?", 0, 0, 0, 0, 0, "1/3", "2/3", "5/6", "1/6", "", "d", C2719R.C2721drawable.maths1237e, 1, this.f602b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.maths1238q, 0, 0, 0, 0, "The class interval is 4", "95.5 is the upper limit of the second class.", "85.5-90.5 Is one of the class boundaries", "82 is the class midpoint of the fourth class.", "", "d", C2719R.C2721drawable.maths1238e, 1, this.f602b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.maths1239q, 0, 0, 0, 0, "1/2", "-112", "1", ExifInterface.GPS_MEASUREMENT_2D, "", "a", C2719R.C2721drawable.maths1239e, 1, this.f602b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.maths1240q, 0, 0, 0, 0, "-1", "-1/3", "1/3", "-1", "", "d", C2719R.C2721drawable.maths1240e, 1, this.f602b));
        arrayList.add(new questions("41.", "Let u=(2,0) and v=(-1,3) be two vectors in a plane and w=-3u+2v. Which one of the following is the unit vector in the direction of w, in terms of the standard unit vectors f and j ?", 0, C2719R.C2721drawable.maths1241a, C2719R.C2721drawable.maths1241b, C2719R.C2721drawable.maths1241c, C2719R.C2721drawable.maths1241d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1241e, 1, this.f602b));
        arrayList.add(new questions("42.", "Which one of the following is NOT true about the scalar product of vectors?", 0, 0, 0, 0, 0, "The scalar product is commutative.", "The scalar product of non-zero parallel vectors is zero.", "The scalar product is distributive over addition of vectors.", "The scalar product of perpendicular vectors is zero.", "", "b", C2719R.C2721drawable.maths1242e, 1, this.f602b));
        arrayList.add(new questions("43.", "Which one of the following is NOT true about transformation?", 0, 0, 0, 0, 0, "Rotation moves triangles in to congruent triangles.", "Translations move angles 10 congruent angles.", "Rotation is a rigid motion.", "Reflection is not a rigid motion.", "", "d", C2719R.C2721drawable.maths1243e, 1, this.f602b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.maths1244q, 0, 0, 0, 0, "41", "5i", "4+5i", "5+4i", "", "n", C2719R.C2721drawable.maths1244e, 1, this.f602b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.maths1245q, 0, C2719R.C2721drawable.maths1245b, 0, C2719R.C2721drawable.maths1245d, "‘a’ is closer to every term of the sequence.", "", "a Is very close to all terms a_n from some arbitrary sign onwards.", "", "", "c", C2719R.C2721drawable.maths1245e, 1, this.f602b));
        arrayList.add(new questions("46.", "Which one of the following is the standard form of equation of an ellipse with vertices(3,1),(3,9); and minor axis length 6?", 0, C2719R.C2721drawable.maths1246a, C2719R.C2721drawable.maths1246b, C2719R.C2721drawable.maths1246c, C2719R.C2721drawable.maths1246d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1246e, 1, this.f602b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.maths1247q, C2719R.C2721drawable.maths1247a, C2719R.C2721drawable.maths1247b, C2719R.C2721drawable.maths1247c, C2719R.C2721drawable.maths1247d, "", "", "", "", "", "d", C2719R.C2721drawable.maths1247e, 1, this.f602b));
        arrayList.add(new questions("48.", "Let p and q be propositions with truth values True and False respectively. Then, which one of the following is correct?", 0, 0, 0, 0, 0, "(p∨-q)⇒q Is True", "¬p⇒q is False", "p V (4∼p) is True", "(p⇒q)∧p is True", "", "c", C2719R.C2721drawable.maths1248e, 1, this.f602b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.maths1249q, 0, 0, 0, 0, "R And [1,∞)", "R and [0,∞)", "[0,∞) and [1,∞)", "[0,∞) and (0,∞)", "", "a", C2719R.C2721drawable.maths1249e, 1, this.f602b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.maths1250q, 0, 0, 0, 0, "A horizontal asymptote. y=2.", "A vertical asymptote, x=1.", "y-intercept(0,-4).", "x-intercept(-4,0).", "", "d", C2719R.C2721drawable.maths1250e, 1, this.f602b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.maths1251q, 0, C2719R.C2721drawable.maths1251b, 0, C2719R.C2721drawable.maths1251d, "1/e", "", "5e", "", "", "b", C2719R.C2721drawable.maths1251e, 1, this.f602b));
        arrayList.add(new questions("52.", "Which one of the following is true about limit of a function?", 0, 0, 0, 0, 0, "Limit of a constant function is always zero.", "Right hand and Left hand limits are the same for every function", "Initiatively, the limit of a function f is a y-value L to which f(x) approaches as x approaches to some specified number.", "Whenever the limit exists for a function it is the same as functional value.", "", "c", C2719R.C2721drawable.maths1252e, 1, this.f602b));
        arrayList.add(new questions("53.", "", C2719R.C2721drawable.maths1253q, 0, 0, 0, 0, "-1", "1", "π", "0", "", "d", C2719R.C2721drawable.maths1253e, 1, this.f602b));
        arrayList.add(new questions("54.", "If the functions f and g are continuous at x=c, then which one of the following combinations is continuous at x=c ?", 0, 0, 0, 0, C2719R.C2721drawable.maths1254d, "√g", "f/g", "f-1", "", "", "d", C2719R.C2721drawable.maths1254e, 1, this.f602b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.maths1255q, 0, 0, 0, 0, "3/2", "2√3", "24", "6", "", "b", C2719R.C2721drawable.maths1255e, 1, this.f602b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.maths1256q, 0, 0, 0, 0, "0", "1", "-2", "-1", "", "b", C2719R.C2721drawable.maths1256e, 1, this.f602b));
        arrayList.add(new questions("57.", "", C2719R.C2721drawable.maths1257q, C2719R.C2721drawable.maths1257a, C2719R.C2721drawable.maths1257b, C2719R.C2721drawable.maths1257c, C2719R.C2721drawable.maths1257d, "", "", "", "", "", "b", C2719R.C2721drawable.maths1257e, 1, this.f602b));
        arrayList.add(new questions("58.", "", C2719R.C2721drawable.maths1258q, 0, 0, 0, 0, "5", "√5", "√2", ExifInterface.GPS_MEASUREMENT_2D, "", "b", C2719R.C2721drawable.maths1258e, 1, this.f602b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.maths1259q, 0, 0, 0, 0, "Its vertex is (-2,-3)", "its directrix is the y-axis", "It is open to the right", "Its focus lies at (-4,-3)", "", "n", C2719R.C2721drawable.maths1259e, 1, this.f602b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.maths1260q, 0, 0, 0, 0, "2π", ExifInterface.GPS_MEASUREMENT_2D, "2π+1", "2π-1", "", "c", C2719R.C2721drawable.maths1260e, 1, this.f602b));
        arrayList.add(new questions("61.", "Suppose the measurement of height (in meter) of twelve students is: 1.72,1.65,1.70,1.56,1.72,1.70,1.65,1.70,1.65,1.65,1.70,1.72 Which one of the following is true about the mode of the data?", 0, 0, 0, 0, 0, "The data is Unimodal with mode 1.75.", "The data is Unimodal with mode 1.65.", "The data is bimodal with modes 1.65 and 1.70.", "The data is multimodal.", "", "c", C2719R.C2721drawable.maths1261e, 1, this.f602b));
        arrayList.add(new questions("62.", "Which one of the following is correct about, (x)=cot⁡x ?", 0, C2719R.C2721drawable.maths1262a, C2719R.C2721drawable.maths1262b, C2719R.C2721drawable.maths1262c, C2719R.C2721drawable.maths1262d, "", "", "", "", "", "a", C2719R.C2721drawable.maths1262e, 1, this.f602b));
        arrayList.add(new questions("63.", "Let f(x)=3-2x. What is the inverse of f ?", 0, C2719R.C2721drawable.maths1263a, C2719R.C2721drawable.maths1263b, C2719R.C2721drawable.maths1263c, C2719R.C2721drawable.maths1263d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1263e, 1, this.f602b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.maths1264q, C2719R.C2721drawable.maths1264a, C2719R.C2721drawable.maths1264b, C2719R.C2721drawable.maths1264c, C2719R.C2721drawable.maths1264d, "", "", "", "", "", "c", C2719R.C2721drawable.maths1264e, 1, this.f602b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.maths1265q, 0, 0, 0, 0, "9/5", "1", "7/4", "5/3", "", "b", C2719R.C2721drawable.maths1265e, 1, this.f602b));
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
        this.f603tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(180), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    maths2012.this.timer.setVisibility(0);
                    maths2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    maths2012.this.scr.setVisibility(8);
                    maths2012.this.chr.stop();
                    maths2012.this.toolbar.setVisibility(8);
                    maths2012.this.Relative.setBackgroundColor(-7829368);
                    maths2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2012.this.getBaseContext());
                    int unused = maths2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = maths2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = maths2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = maths2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = maths2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = maths2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = maths2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = maths2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = maths2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = maths2012.this.highscoreMaths2012 = defaultSharedPreferences.getInt("math2012hs", 0);
                    int access$600 = maths2012.this.part1 + maths2012.this.part2 + maths2012.this.part3 + maths2012.this.part4 + maths2012.this.part5 + maths2012.this.part6 + maths2012.this.part7 + maths2012.this.part8 + maths2012.this.part9;
                    TextView access$1600 = maths2012.this.resultText;
                    access$1600.setText(access$600 + "/65");
                    maths2012.this.progressbar.setProgress(access$600);
                    maths2012.this.progressbar.setMax(65);
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
                    int unused11 = maths2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = maths2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = maths2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = maths2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = maths2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = maths2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = maths2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = maths2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = maths2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = maths2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = maths2012.this.answered1 + maths2012.this.answered2 + maths2012.this.answered3 + maths2012.this.answered4 + maths2012.this.answered5 + maths2012.this.answered6 + maths2012.this.answered7 + maths2012.this.answered8 + maths2012.this.answered9 + maths2012.this.answered10;
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
                    if (access$600 > maths2012.this.highscoreMaths2012) {
                        edit.putInt("math2012hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 65;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - ((SystemClock.elapsedRealtime() - maths2012.this.chr.getBase()) / 1000)) * 3600) / 10800))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1math121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1math122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1math123", 0);
                    long j4 = defaultSharedPreferences.getLong("date1math124", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1math125", 0);
                    long j6 = defaultSharedPreferences.getLong("date1math126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1math127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1math128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1math129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1math1210", 0);
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
                        editor.putString("scoremath121", str);
                        editor.putLong("date1math121", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoremath122", str2);
                            editor.putLong("date1math122", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoremath123", str2);
                            editor.putLong("date1math123", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoremath124", str2);
                            editor.putLong("date1math124", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoremath125", str2);
                            editor.putLong("date1math125", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoremath126", str2);
                            editor.putLong("date1math126", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoremath127", str2);
                            editor.putLong("date1math127", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoremath128", str2);
                            editor.putLong("date1math128", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoremath129", str2);
                            editor.putLong("date1math129", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoremath1210", str2);
                            editor.putLong("date1math1210", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datemath121", 0);
                    long j12 = defaultSharedPreferences.getLong("datemath122", 0);
                    long j13 = defaultSharedPreferences.getLong("datemath123", 0);
                    long j14 = defaultSharedPreferences.getLong("datemath124", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datemath125", 0);
                    long j16 = defaultSharedPreferences.getLong("datemath126", 0);
                    long j17 = defaultSharedPreferences.getLong("datemath127", 0);
                    long j18 = defaultSharedPreferences.getLong("datemath128", 0);
                    long j19 = defaultSharedPreferences.getLong("datemath129", 0);
                    long j20 = defaultSharedPreferences.getLong("datemath1210", 0);
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
                        editor2.putString("iScoremath121", f);
                        editor2.putLong("datemath121", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoremath122", f);
                            editor2.putLong("datemath122", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoremath123", f);
                            editor2.putLong("datemath123", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoremath124", f);
                            editor2.putLong("datemath124", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoremath125", f);
                            editor2.putLong("datemath125", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoremath126", f);
                            editor2.putLong("datemath126", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoremath127", f);
                            editor2.putLong("datemath127", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoremath128", f);
                            editor2.putLong("datemath128", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoremath129", f);
                            editor2.putLong("datemath129", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoremath1210", f);
                            editor2.putLong("datemath1210", valueOf.longValue());
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
                        maths2012.this.scr.setVisibility(8);
                        maths2012.this.chr.stop();
                        maths2012.this.toolbar.setVisibility(8);
                        maths2012.this.Relative.setBackgroundColor(-7829368);
                        maths2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2012.this.getBaseContext());
                        int unused = maths2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = maths2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = maths2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = maths2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = maths2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = maths2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = maths2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = maths2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = maths2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = maths2012.this.highscoreMaths2012 = defaultSharedPreferences.getInt("math2012hs", 0);
                        int access$600 = maths2012.this.part1 + maths2012.this.part2 + maths2012.this.part3 + maths2012.this.part4 + maths2012.this.part5 + maths2012.this.part6 + maths2012.this.part7 + maths2012.this.part8 + maths2012.this.part9;
                        TextView access$1600 = maths2012.this.resultText;
                        access$1600.setText(access$600 + "/65");
                        maths2012.this.progressbar.setProgress(access$600);
                        maths2012.this.progressbar.setMax(65);
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
                        int unused11 = maths2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = maths2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = maths2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = maths2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = maths2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = maths2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = maths2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = maths2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = maths2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = maths2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = maths2012.this.answered1 + maths2012.this.answered2 + maths2012.this.answered3 + maths2012.this.answered4 + maths2012.this.answered5 + maths2012.this.answered6 + maths2012.this.answered7 + maths2012.this.answered8 + maths2012.this.answered9 + maths2012.this.answered10;
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
                        if (access$600 > maths2012.this.highscoreMaths2012) {
                            edit.putInt("math2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - maths2012.this.chr.getBase()) / 1000;
                        String str = "datemath1210";
                        String str2 = "datemath129";
                        String str3 = "datemath128";
                        String str4 = "datemath127";
                        String str5 = "datemath126";
                        String str6 = "datemath125";
                        String str7 = "datemath124";
                        String str8 = "datemath123";
                        String str9 = "datemath122";
                        String str10 = "datemath121";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1math1210";
                        String str12 = "date1math129";
                        if (maths2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - elapsedRealtime) * 3600) / 10800))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1math121", 0);
                            String str13 = "date1math121";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1math122", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1math123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1math124", 0);
                            long j5 = defaultSharedPreferences.getLong("date1math125", 0);
                            String str16 = "date1math125";
                            String str17 = "date1math124";
                            String str18 = "date1math126";
                            long j6 = defaultSharedPreferences.getLong("date1math126", 0);
                            long j7 = defaultSharedPreferences.getLong("date1math127", 0);
                            String str19 = str12;
                            String str20 = "date1math128";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1math127";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1math123";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1math128", 0));
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
                                editor3.putString("scoremath121", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoremath122", str25);
                                    editor3.putLong("date1math122", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoremath123", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoremath124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoremath125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoremath126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoremath127", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoremath128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoremath129", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoremath1210", str25);
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
                                editor4.putString("iScoremath121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoremath122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoremath123", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoremath124", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoremath125", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoremath126", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoremath127", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoremath128", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoremath129", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoremath1210", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1math121";
                            String str30 = "date1math124";
                            String str31 = str12;
                            String str32 = "date1math123";
                            String str33 = "date1math127";
                            String str34 = "date1math126";
                            String str35 = str11;
                            String str36 = "date1math125";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 10800))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1math122", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1math122";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1math128";
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
                                editor2.putString("scoremath121", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoremath122", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoremath123", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoremath124", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoremath125", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoremath126", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoremath127", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoremath128", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoremath129", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoremath1210", str49);
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
                                editor.putString("iScoremath121", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoremath122", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoremath123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoremath124", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoremath125", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoremath126", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoremath127", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoremath128", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoremath129", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoremath1210", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        maths2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2012.this.scr.setVisibility(8);
                maths2012.this.chr.stop();
                maths2012.this.toolbar.setVisibility(8);
                maths2012.this.Relative.setBackgroundColor(maths2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                maths2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2012.this.scr.setVisibility(0);
                maths2012.this.toolbar.setVisibility(0);
                maths2012.this.telegram_layout.setVisibility(8);
                maths2012.this.chr.start();
                maths2012.this.Relative.setBackgroundColor(maths2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = maths2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = maths2012.this.mInterstitialAd = null;
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
                maths2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
