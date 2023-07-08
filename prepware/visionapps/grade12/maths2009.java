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

public class maths2009 extends AppCompatActivity {
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
    private Boolean f596b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreMaths2009;
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
    private Toolbar f597tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_maths2009);
        this.f596b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextMath2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_maths2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.m2009q1, C2719R.C2721drawable.m2009q1a, C2719R.C2721drawable.m2009q1b, C2719R.C2721drawable.m2009q1c, C2719R.C2721drawable.m2009q1d, "", "", "", "", "", "b", C2719R.C2721drawable.maths091e, 1, this.f596b));
        arrayList.add(new questions("2.", "A team of 10 researchers consists of 4 biologists and 6 chemists. If 3 persons are chosen randomly from the team, what is the probability that at least one is a biologist?  ", 0, C2719R.C2721drawable.m2009q2a, C2719R.C2721drawable.m2009q2b, C2719R.C2721drawable.m2009q2c, C2719R.C2721drawable.m2009q2d, "", "", "", "", "", "c", C2719R.C2721drawable.maths092e, 1, this.f596b));
        arrayList.add(new questions("3.", "The probability that an electronic device produced by a company does not function properly is equal to 0.1. If two devices are bought, then what is the probability that at least one device function properly? ", 0, 0, 0, 0, 0, "0.81", "0.09", "0.18", "0.99", "", "d", C2719R.C2721drawable.maths093e, 1, this.f596b));
        arrayList.add(new questions("4.", "Two machines A and B produce respectively 60% and 40% of the total number of items of a factory. The percentages of defective of these machines are 2% and 5%, respectively. If an item is selected at random, then what is the probability that the item is defective?  ", 0, 0, 0, 0, 0, "0.032", "0.07", "0.32", "0.426", "", "b", C2719R.C2721drawable.maths094e, 1, this.f596b));
        arrayList.add(new questions("5.", "In how many ways can a committee of 3 members be formed from 7 candidates?  ", 0, 0, 0, 0, 0, "7", "21", "28", "35", "", "d", C2719R.C2721drawable.maths095e, 1, this.f596b));
        arrayList.add(new questions("6.", "", C2719R.C2721drawable.m2009q6, C2719R.C2721drawable.m2009q6a, C2719R.C2721drawable.m2009q6b, C2719R.C2721drawable.m2009q6c, C2719R.C2721drawable.m2009q6d, "", "", "", "", "", "a", C2719R.C2721drawable.maths096e, 1, this.f596b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.m2009q7, 0, 0, 0, 0, "F1=27, F2=15 ", "F1=15, F2=27", "F1=25, F2=17", "F1=17, F2=25", "", "a", C2719R.C2721drawable.maths097e, 1, this.f596b));
        arrayList.add(new questions("8.", "The first group of 10 children has a mean weight of 15.6 kg, and the second group of another 10 children has a mean weight of 16 kg, and the third group of children has a mean weight 20kg. If the mean weight of all children is 17 kg, what is the total number of children in all of the three groups?  ", 0, 0, 0, 0, 0, "28", "29", "30", "32", "", "a", C2719R.C2721drawable.maths098e, 1, this.f596b));
        arrayList.add(new questions("9.", "Which of the following is a valid argument?", 0, C2719R.C2721drawable.m2009q9a, C2719R.C2721drawable.m2009q9b, C2719R.C2721drawable.m2009q9c, C2719R.C2721drawable.m2009q9d, "", "", "", "", "", "b", C2719R.C2721drawable.maths099e, 1, this.f596b));
        arrayList.add(new questions("10.", "", C2719R.C2721drawable.m2009q10, C2719R.C2721drawable.m2009q10a, C2719R.C2721drawable.m2009q10b, C2719R.C2721drawable.m2009q10c, C2719R.C2721drawable.m2009q10d, "", "", "", "", "", "c", C2719R.C2721drawable.maths0910e, 1, this.f596b));
        arrayList.add(new questions("11.", "Which of the following functions is one-to-one correspondence? ", 0, 0, 0, 0, 0, "f:[0,∞)→R defined by f(x)= |x|", "f:R →[0,∞)defined by f(x)= x^2", "f:R →[0,∞)defined by f(x)= 3^x", "f:(0,∞)→R defined by f(x)=  log_2⁡x", "", "d", C2719R.C2721drawable.maths0911e, 1, this.f596b));
        arrayList.add(new questions("12.", "", C2719R.C2721drawable.m2009q12, C2719R.C2721drawable.m2009q12a, 0, C2719R.C2721drawable.m2009q12c, C2719R.C2721drawable.m2009q12d, "", ExifInterface.GPS_MEASUREMENT_2D, "", "", "", "c", C2719R.C2721drawable.maths0912e, 1, this.f596b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.m2009q13, C2719R.C2721drawable.m2009q13a, C2719R.C2721drawable.m2009q13b, C2719R.C2721drawable.m2009q13c, C2719R.C2721drawable.m2009q13d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0913e, 1, this.f596b));
        arrayList.add(new questions("14.", "", C2719R.C2721drawable.m2009q14, 0, 0, 0, 0, "{}", "{-1}", "{1}", "{-1,1}", "", "a", C2719R.C2721drawable.maths0914e, 1, this.f596b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.m2009q15, 0, 0, 0, 0, "The vertical asymptotes of the graph are x = 0 and x=1 ", "The horizontal asymptote of the graph is y = 1", "The graph intersects its horizontal asymptote at the point(-1,0)", "The graph intersects the vertical line x = 1 at the point (1,2)", "", "c", C2719R.C2721drawable.maths0915e, 1, this.f596b));
        arrayList.add(new questions("16.", "What is the equation of a line that passes through (a, a) in the xy-plane if it is parallel to a line   that passes points through (a, b) and (b, a), where a≠b? ", 0, 0, 0, 0, 0, "Y = x", "y = -x", "y = -x+2a", "y = 2x-a", "", "c", C2719R.C2721drawable.maths0916e, 1, this.f596b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.m2009q17, C2719R.C2721drawable.m2009q17a, C2719R.C2721drawable.m2009q17b, C2719R.C2721drawable.m2009q17c, C2719R.C2721drawable.m2009q17d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0917e, 1, this.f596b));
        arrayList.add(new questions("18.", "", C2719R.C2721drawable.m2009q18, C2719R.C2721drawable.m2009q18a, C2719R.C2721drawable.m2009q18b, 0, 0, "", "", ExifInterface.GPS_MEASUREMENT_3D, "5", "", "a", C2719R.C2721drawable.maths0918e, 1, this.f596b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.m2009q19, C2719R.C2721drawable.m2009q19a, C2719R.C2721drawable.m2009q19b, C2719R.C2721drawable.m2009q19c, C2719R.C2721drawable.m2009q19d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0919e, 1, this.f596b));
        arrayList.add(new questions("20.", "Let p and q stands for the statements “Nejat is intelligent” and “Almaz is hard working”, respectively. Which of the following represent the statement “Almaz is hard working if Nejat is intelligent”?", 0, C2719R.C2721drawable.m2009q20a, C2719R.C2721drawable.m2009q20b, C2719R.C2721drawable.m2009q20c, C2719R.C2721drawable.m2009q20d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0920e, 1, this.f596b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.m2009q21, 0, 0, 0, 0, "4", ExifInterface.GPS_MEASUREMENT_2D, "-2", "-4", "", "a", C2719R.C2721drawable.maths0921e, 1, this.f596b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.m2009q22, C2719R.C2721drawable.m2009q22a, C2719R.C2721drawable.m2009q22b, C2719R.C2721drawable.m2009q22c, C2719R.C2721drawable.m2009q22d, "", "", "", "", "", "d", C2719R.C2721drawable.maths0922e, 1, this.f596b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.m2009q23, C2719R.C2721drawable.m2009q23a, C2719R.C2721drawable.m2009q23b, C2719R.C2721drawable.m2009q23c, C2719R.C2721drawable.m2009q23d, "", "", "", "", "", "a", C2719R.C2721drawable.maths0923e, 1, this.f596b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.m2009q24, 0, 0, 0, 0, "10x-y-8 = 0", "-10x+y-8 = 0", "-10x-y-8 = 0", "10x + y - 8 = 0", "", "a", C2719R.C2721drawable.maths0924e, 1, this.f596b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.m2009q25, C2719R.C2721drawable.m2009q25a, C2719R.C2721drawable.m2009q25b, 0, 0, "", "", ExifInterface.GPS_MEASUREMENT_2D, "0", "", "d", C2719R.C2721drawable.maths0925e, 1, this.f596b));
        arrayList.add(new questions("26.", "Suppose f is continuous on, 2,6 - and the only solutions of the equation F(x)=7 are x = 2 and x = 5. If f(3) = 9, then one of the following CANNOT be the value of f(4) :", 0, 0, 0, 0, 0, "5", "7.5", "8", "9", "", "a", C2719R.C2721drawable.maths0926e, 1, this.f596b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.m2009q27, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "1", "0", "", "b", C2719R.C2721drawable.maths0927e, 1, this.f596b));
        arrayList.add(new questions("28.", "", C2719R.C2721drawable.m2009q28, 0, 0, 0, 0, "0", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "5", "", "c", C2719R.C2721drawable.maths0928e, 1, this.f596b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.m2009q29, C2719R.C2721drawable.m2009q29a, C2719R.C2721drawable.m2009q29b, 0, 0, "", "", "1", ExifInterface.GPS_MEASUREMENT_2D, "", "a", C2719R.C2721drawable.maths0929e, 1, this.f596b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.m2009q30, C2719R.C2721drawable.m2009q30a, C2719R.C2721drawable.m2009q30b, C2719R.C2721drawable.m2009q30c, 0, "", "", "", "0", "", "b", C2719R.C2721drawable.maths0930e, 1, this.f596b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.m2009q31, C2719R.C2721drawable.m2009q31a, C2719R.C2721drawable.m2009q31b, C2719R.C2721drawable.m2009q31c, C2719R.C2721drawable.m2009q31d, "", "", "", "", "", "c", C2719R.C2721drawable.maths0931e, 1, this.f596b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.m2009q32, 0, 0, 0, 0, "x = 0, y = 2a, z = 2a", "x = 1/a, y = -2a, z = 2a", "x = 1/a, y = -2/a, z = 2/a", "x = 0, y = 2/a, z = 2/a", "", "d", C2719R.C2721drawable.maths0932e, 1, this.f596b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.m2009q33, 0, C2719R.C2721drawable.m2009q33b, C2719R.C2721drawable.m2009q33c, 0, "1 + i", "", "", "1 - i", "", "b", C2719R.C2721drawable.maths0933e, 1, this.f596b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.m2009q34, 0, 0, 0, 0, "5 + 3i", "1 + 3i", "3 - 5i", "1 - 3i", "", "b", C2719R.C2721drawable.maths0934e, 1, this.f596b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.m2009q35, 0, C2719R.C2721drawable.m2009q35b, C2719R.C2721drawable.m2009q35c, C2719R.C2721drawable.m2009q35c, "2 + 2i", "", "", "", "", "a", C2719R.C2721drawable.maths0935e, 1, this.f596b));
        arrayList.add(new questions("36.", "Which of the following relation holds for the sequence: -10, -3, 4, 11....", 0, C2719R.C2721drawable.m2009q36a, C2719R.C2721drawable.m2009q36b, C2719R.C2721drawable.m2009q36c, C2719R.C2721drawable.m2009q36d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0936e, 1, this.f596b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.m2009q37, 0, 0, 0, 0, "-29/30", "29/30", "30/31", "-30/31", "", "d", C2719R.C2721drawable.maths0937e, 1, this.f596b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.m2009q38, 0, 0, 0, 0, "-5", "-3", ExifInterface.GPS_MEASUREMENT_3D, "5", "", "c", C2719R.C2721drawable.maths0938e, 1, this.f596b));
        arrayList.add(new questions("39.", "Suppose a radioactive material loses one-third of its mass per year. If its current mass is 81 gram, then how much will its mass (in gram) just after 7 years? ", 0, 0, 0, 0, 0, "27 g", "1/27 g", "128/27 g", "128/81 g", "", "d", C2719R.C2721drawable.maths0939e, 1, this.f596b));
        arrayList.add(new questions("40.", "Which one of the following is a convergent sequence?", 0, C2719R.C2721drawable.m2009q40a, C2719R.C2721drawable.m2009q40b, C2719R.C2721drawable.m2009q40c, C2719R.C2721drawable.m2009q40d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0940e, 1, this.f596b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.m2009q41, C2719R.C2721drawable.m2009q41a, C2719R.C2721drawable.m2009q41b, C2719R.C2721drawable.m2009q41c, C2719R.C2721drawable.m2009q41d, "", "", "", "", "", "a", C2719R.C2721drawable.maths0941e, 1, this.f596b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.m2009q42, 0, 0, 0, 0, "16/3", "14/3", "8/3", "4/3", "", "b", C2719R.C2721drawable.maths0942e, 1, this.f596b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.m2009q43, C2719R.C2721drawable.m2009q43a, C2719R.C2721drawable.m2009q43b, C2719R.C2721drawable.m2009q43c, C2719R.C2721drawable.m2009q43d, "", "", "", "", "", "c", C2719R.C2721drawable.maths0943e, 1, this.f596b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.m2009q44, 0, 0, 0, 0, "6", "9", "11", "12", "", "a", C2719R.C2721drawable.maths0944e, 1, this.f596b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.m2009q45, C2719R.C2721drawable.m2009q45a, C2719R.C2721drawable.m2009q45b, C2719R.C2721drawable.m2009q45c, C2719R.C2721drawable.m2009q45d, "", "", "", "", "", "c", C2719R.C2721drawable.maths0945e, 1, this.f596b));
        arrayList.add(new questions("46.", "", C2719R.C2721drawable.m2009q46, 0, 0, 0, 0, "1/2 ln2", "ln4", "ln2", "1", "", "a", C2719R.C2721drawable.maths0946e, 1, this.f596b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.m2009q47, C2719R.C2721drawable.m2009q47a, C2719R.C2721drawable.m2009q47b, 0, 0, "", "", "f has no relative maximum value", "f has a relative maximum value at x = 2", "", "d", C2719R.C2721drawable.maths0947e, 1, this.f596b));
        arrayList.add(new questions("48.", "If 2≤f(x)≤4 for all values of x, then the value of f(8)-f(2) is between which of the following numbers? ", 0, 0, 0, 0, 0, "14 and 24", "12 and 24", "12 and 18", "8 and 10", "", "b", C2719R.C2721drawable.maths0948e, 1, this.f596b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.m2009q49, 0, 0, 0, 0, "{1/2}", "{0, 1/2}", "{0, -1/2}", "{-1/2, 0, 1/2 }", "", "d", C2719R.C2721drawable.maths0949e, 1, this.f596b));
        arrayList.add(new questions("50.", "A tin can of volume 54π cm cube is to be made in the form of a circular cylinder that has both flat top and bottom. What is the base radius of the tin if it is to be made of the least amount of metal?", 0, 0, 0, 0, 0, "2cm", "3cm", "4cm", "6cm", "", "b", C2719R.C2721drawable.maths0950e, 1, this.f596b));
        arrayList.add(new questions("51.", "Air is being pumped into a spherical balloon so that its volume increases at a rate of 50 cm cube per second. How fast is the radius of the balloon increasing when the diameter is 5 cm? ", 0, C2719R.C2721drawable.m2009q51a, C2719R.C2721drawable.m2009q51b, C2719R.C2721drawable.m2009q51c, C2719R.C2721drawable.m2009q51d, "", "", "", "", "", "d", C2719R.C2721drawable.maths0951e, 1, this.f596b));
        arrayList.add(new questions("52.", "Which one of the following is a valid assertion that can be proved by the principle of mathematical induction? ", 0, 0, C2719R.C2721drawable.m2009q52b, C2719R.C2721drawable.m2009q52c, C2719R.C2721drawable.m2009q52d, "The sum of any two rational numbers is positive.", "", "", "", "", "c", C2719R.C2721drawable.maths0952e, 1, this.f596b));
        arrayList.add(new questions("53.", "Consider the assertion: “The sum of positive irrational numbers is positive irrational number”. Which one of the following is correct about the assertion?", 0, 0, 0, 0, 0, "Taking the irrational numbers such as √2, √3, √5, √6, √7 and so on, if we add any two of them,the sum is irrational. Therefore the assertion is true.", "The sum of 1 + √2 and 1 - √2 is 2, which is rational. This is a counter example that disprovesthe assertion.", "The sum of √7 and √2 is a counter example that shows the assertion is false.", "The assertion can be disproved by taking the sum of 1 + √2 and 2 - √2 .", "", "b", C2719R.C2721drawable.maths0953e, 1, this.f596b));
        arrayList.add(new questions("54.", "", C2719R.C2721drawable.m2009q54, C2719R.C2721drawable.m2009q54a, C2719R.C2721drawable.m2009q54b, C2719R.C2721drawable.m2009q54c, C2719R.C2721drawable.m2009q54d, "", "", "", "", "", "d", C2719R.C2721drawable.maths0954e, 1, this.f596b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.m2009q55, C2719R.C2721drawable.m2009q55a, C2719R.C2721drawable.m2009q55b, C2719R.C2721drawable.m2009q55c, C2719R.C2721drawable.m2009q55d, "", "", "", "", "", "d", C2719R.C2721drawable.maths0955e, 1, this.f596b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.m2009q56, 0, 0, 0, 0, "(-4,3,5)", "(2,-2,1)", "(3,1,1)", "(0,0,0)", "", "d", C2719R.C2721drawable.maths0956e, 1, this.f596b));
        arrayList.add(new questions("57.", "", C2719R.C2721drawable.m2009q57, 0, 0, 0, 0, "5", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "1", "", "d", C2719R.C2721drawable.maths0957e, 1, this.f596b));
        arrayList.add(new questions("58.", "", C2719R.C2721drawable.m2009q58, 0, 0, C2719R.C2721drawable.m2009q58c, C2719R.C2721drawable.m2009q58d, "5 km", "7 km", "", "", "", "a", C2719R.C2721drawable.maths0958e, 1, this.f596b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.m2009q59, 0, 0, 0, 0, "-6/5", "-2/5", "-3", ExifInterface.GPS_MEASUREMENT_3D, "", "a", C2719R.C2721drawable.maths0959e, 1, this.f596b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.m2009q60, C2719R.C2721drawable.m2009q60a, C2719R.C2721drawable.m2009q60b, C2719R.C2721drawable.m2009q60c, C2719R.C2721drawable.m2009q60d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0960e, 1, this.f596b));
        arrayList.add(new questions("61.", "", C2719R.C2721drawable.m2009q61, C2719R.C2721drawable.m2009q61a, C2719R.C2721drawable.m2009q61b, C2719R.C2721drawable.m2009q61c, C2719R.C2721drawable.m2009q61d, "", "", "", "", "", "b", C2719R.C2721drawable.maths0961e, 1, this.f596b));
        arrayList.add(new questions("62.", "", C2719R.C2721drawable.m2009q62, 0, 0, 0, 0, "U = (-3,2)", "U = (3,-2)", "U = (-2,3)", "U = (2,-3)", "", "b", C2719R.C2721drawable.maths0962e, 1, this.f596b));
        arrayList.add(new questions("63.", "", C2719R.C2721drawable.m2009q63, C2719R.C2721drawable.m2009q63a, 0, C2719R.C2721drawable.m2009q63c, C2719R.C2721drawable.m2009q63d, "", ExifInterface.GPS_MEASUREMENT_3D, "", "", "", "b", C2719R.C2721drawable.maths0963e, 1, this.f596b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.m2009q64, 0, 0, C2719R.C2721drawable.m2009q64c, C2719R.C2721drawable.m2009q64d, "2/5", "4/5", "", "", "", "b", C2719R.C2721drawable.maths0964e, 1, this.f596b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.m2009q65, C2719R.C2721drawable.m2009q65a, C2719R.C2721drawable.m2009q65b, C2719R.C2721drawable.m2009q65c, C2719R.C2721drawable.m2009q65d, "", "", "", "", "", "c", C2719R.C2721drawable.maths0965e, 1, this.f596b));
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
        this.f597tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(180), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    maths2009.this.timer.setVisibility(0);
                    maths2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    maths2009.this.scr.setVisibility(8);
                    maths2009.this.chr.stop();
                    maths2009.this.toolbar.setVisibility(8);
                    maths2009.this.Relative.setBackgroundColor(-7829368);
                    maths2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2009.this.getBaseContext());
                    int unused = maths2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = maths2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = maths2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = maths2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = maths2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = maths2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = maths2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = maths2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = maths2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = maths2009.this.highscoreMaths2009 = defaultSharedPreferences.getInt("math2009hs", 0);
                    int access$600 = maths2009.this.part1 + maths2009.this.part2 + maths2009.this.part3 + maths2009.this.part4 + maths2009.this.part5 + maths2009.this.part6 + maths2009.this.part7 + maths2009.this.part8 + maths2009.this.part9;
                    maths2009.this.resultText.setText(String.valueOf(access$600));
                    maths2009.this.progressbar.setProgress(access$600);
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
                    int unused11 = maths2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = maths2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = maths2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = maths2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = maths2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = maths2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = maths2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = maths2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "math2009hs";
                    int unused19 = maths2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = maths2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = maths2009.this.answered1 + maths2009.this.answered2 + maths2009.this.answered3 + maths2009.this.answered4 + maths2009.this.answered5 + maths2009.this.answered6 + maths2009.this.answered7 + maths2009.this.answered8 + maths2009.this.answered9 + maths2009.this.answered10;
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
                    if (access$600 > maths2009.this.highscoreMaths2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 65;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - ((SystemClock.elapsedRealtime() - maths2009.this.chr.getBase()) / 1000)) * 3600) / 10800))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1math091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1math092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1math093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1math094", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1math095", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1math096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1math097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1math098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1math099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1math0910", 0);
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
                        editor.putString("scoremath091", str3);
                        editor.putLong("date1math091", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoremath092", str5);
                            editor.putLong("date1math092", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoremath093", str5);
                            editor.putLong("date1math093", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoremath094", str5);
                            editor.putLong("date1math094", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoremath095", str5);
                            editor.putLong("date1math095", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoremath096", str5);
                            editor.putLong("date1math096", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoremath097", str5);
                            editor.putLong("date1math097", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoremath098", str5);
                            editor.putLong("date1math098", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoremath099", str5);
                            editor.putLong("date1math099", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoremath0910", str5);
                            editor.putLong("date1math0910", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datemath091", 0);
                    long j12 = defaultSharedPreferences.getLong("datemath092", 0);
                    long j13 = defaultSharedPreferences.getLong("datemath093", 0);
                    long j14 = defaultSharedPreferences.getLong("datemath094", 0);
                    long j15 = defaultSharedPreferences.getLong("datemath095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datemath096", 0);
                    long j17 = defaultSharedPreferences.getLong("datemath097", 0);
                    long j18 = defaultSharedPreferences.getLong("datemath098", 0);
                    long j19 = defaultSharedPreferences.getLong("datemath099", 0);
                    long j20 = defaultSharedPreferences.getLong("datemath0910", 0);
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
                        editor2.putString("iScoremath091", str4);
                        editor2.putLong("datemath091", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoremath092", str6);
                            editor2.putLong("datemath092", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoremath093", str6);
                            editor2.putLong("datemath093", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoremath094", str6);
                            editor2.putLong("datemath094", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoremath095", str6);
                            editor2.putLong("datemath095", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoremath096", str6);
                            editor2.putLong("datemath096", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoremath097", str6);
                            editor2.putLong("datemath097", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoremath098", str6);
                            editor2.putLong("datemath098", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoremath099", str6);
                            editor2.putLong("datemath099", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoremath0910", str6);
                            editor2.putLong("datemath0910", l.longValue());
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
                        maths2009.this.scr.setVisibility(8);
                        maths2009.this.chr.stop();
                        maths2009.this.toolbar.setVisibility(8);
                        maths2009.this.Relative.setBackgroundColor(-7829368);
                        maths2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(maths2009.this.getBaseContext());
                        int unused = maths2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = maths2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = maths2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = maths2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = maths2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = maths2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = maths2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = maths2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = maths2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = maths2009.this.highscoreMaths2009 = defaultSharedPreferences.getInt("math2009hs", 0);
                        int access$600 = maths2009.this.part1 + maths2009.this.part2 + maths2009.this.part3 + maths2009.this.part4 + maths2009.this.part5 + maths2009.this.part6 + maths2009.this.part7 + maths2009.this.part8 + maths2009.this.part9;
                        TextView access$1600 = maths2009.this.resultText;
                        access$1600.setText(access$600 + "/65");
                        maths2009.this.progressbar.setProgress(access$600);
                        maths2009.this.progressbar.setMax(65);
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
                        int unused11 = maths2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = maths2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = maths2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = maths2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = maths2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = maths2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = maths2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = maths2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = maths2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = maths2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = maths2009.this.answered1 + maths2009.this.answered2 + maths2009.this.answered3 + maths2009.this.answered4 + maths2009.this.answered5 + maths2009.this.answered6 + maths2009.this.answered7 + maths2009.this.answered8 + maths2009.this.answered9 + maths2009.this.answered10;
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
                        if (access$600 > maths2009.this.highscoreMaths2009) {
                            edit.putInt("math2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - maths2009.this.chr.getBase()) / 1000;
                        String str = "datemath0910";
                        String str2 = "datemath099";
                        String str3 = "datemath098";
                        String str4 = "datemath097";
                        String str5 = "datemath096";
                        String str6 = "datemath095";
                        String str7 = "datemath094";
                        String str8 = "datemath093";
                        String str9 = "datemath092";
                        String str10 = "datemath091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1math0910";
                        String str12 = "date1math099";
                        if (maths2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((10800 - elapsedRealtime) * 3600) / 10800))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1math091", 0);
                            String str13 = "date1math091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1math092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1math093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1math094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1math095", 0);
                            String str16 = "date1math095";
                            String str17 = "date1math094";
                            String str18 = "date1math096";
                            long j6 = defaultSharedPreferences.getLong("date1math096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1math097", 0);
                            String str19 = str12;
                            String str20 = "date1math098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1math097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1math093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1math098", 0));
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
                                editor3.putString("scoremath091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoremath092", str25);
                                    editor3.putLong("date1math092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoremath093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoremath094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoremath095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoremath096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoremath097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoremath098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoremath099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoremath0910", str25);
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
                                editor4.putString("iScoremath091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoremath092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoremath093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoremath094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoremath095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoremath096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoremath097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoremath098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoremath099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoremath0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1math091";
                            String str30 = "date1math094";
                            String str31 = str12;
                            String str32 = "date1math093";
                            String str33 = "date1math097";
                            String str34 = "date1math096";
                            String str35 = str11;
                            String str36 = "date1math095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 65;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 10800))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1math092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1math092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1math098";
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
                                editor2.putString("scoremath091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoremath092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoremath093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoremath094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoremath095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoremath096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoremath097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoremath098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoremath099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoremath0910", str49);
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
                                editor.putString("iScoremath091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoremath092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoremath093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoremath094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoremath095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoremath096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoremath097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoremath098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoremath099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoremath0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        maths2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2009.this.scr.setVisibility(8);
                maths2009.this.chr.stop();
                maths2009.this.toolbar.setVisibility(8);
                maths2009.this.Relative.setBackgroundColor(maths2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                maths2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                maths2009.this.scr.setVisibility(0);
                maths2009.this.toolbar.setVisibility(0);
                maths2009.this.telegram_layout.setVisibility(8);
                maths2009.this.chr.start();
                maths2009.this.Relative.setBackgroundColor(maths2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = maths2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = maths2009.this.mInterstitialAd = null;
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
                maths2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
