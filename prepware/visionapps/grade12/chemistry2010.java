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

public class chemistry2010 extends AppCompatActivity {
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
    private Boolean f493b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreChemistry2010;
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
    private Toolbar f494tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chemistry2010);
        this.f493b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextChemistry2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_chemistry2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Fats and oils are:", 0, 0, 0, 0, 0, "Acids", "Alcohols ", "Alkenes", "Esters", "- Fats are derived from saturated fatty acids and glycerol and are solid esters.\n-\tOils are derived from unsaturated fatty acids and glycerol and are liquid esters.\n", "d", 0, 1, this.f493b));
        arrayList.add(new questions("2.", "The reaction between alcohols and acyl chlorides produces", 0, 0, 0, 0, 0, "Ethers", "Esters", "Carboxylic acids", "Aromatic salts", "", "b", C2719R.C2721drawable.chem102e, 1, this.f493b));
        arrayList.add(new questions("3.", "Which one of the following aqueous solutions will have the LOWEST freezing point?", 0, C2719R.C2721drawable.c2010q3a, C2719R.C2721drawable.c2010q3b, C2719R.C2721drawable.c2010q3c, C2719R.C2721drawable.c2010q3d, "", "", "", "", "", "c", C2719R.C2721drawable.chem103e, 1, this.f493b));
        arrayList.add(new questions("4.", "", C2719R.C2721drawable.c2010q4, 0, 0, 0, 0, "1", "4", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "", "d", C2719R.C2721drawable.chem104e, 1, this.f493b));
        arrayList.add(new questions("5.", "Who used the cathode Ray tube to discover the electron and determine its charge to mass ratio?", 0, 0, 0, 0, 0, "Robert A. Millikan", "James Chadwick", "J.J Thomson ", "Ernest Rutherford", "J.J Thomson discovered the electron and determined its charge - tomass ratio by the cathode ray tube experiment. The cathode rays when placed in electric and magnetic fields, they deflected towards the positive end showing that they are negatively charged. These cathode rays are known as electrons. He calculated the charge - to - mass ratio from the amount of deflection of a cathode ray beam. Robert A. Millikan determined the charge on the electron by observing the behavior of electrically - charged oil drops in an electric field known", "c", 0, 1, this.f493b));
        arrayList.add(new questions("6.", "Compounds that contain the carboxyl (carbonyl and hydroxyl) group are said to be:", 0, 0, 0, 0, 0, "Organic acids", "Ketones", "Aldehydes", "Esters", "", "a", C2719R.C2721drawable.chem106e, 1, this.f493b));
        arrayList.add(new questions("7.", "The main ore of lead is called:", 0, 0, 0, 0, 0, "Zinc blend", "Galena", "Cinnabar", "Chromite", "", "b", C2719R.C2721drawable.chem107e, 1, this.f493b));
        arrayList.add(new questions("8.", "During nitrification, bacteria convert in to", 0, C2719R.C2721drawable.c2010q8a, C2719R.C2721drawable.c2010q8b, C2719R.C2721drawable.c2010q8c, C2719R.C2721drawable.c2010q8d, "", "", "", "", "", "c", C2719R.C2721drawable.chem108e, 1, this.f493b));
        arrayList.add(new questions("9.", "Which one of the following metals exists in a free state?", 0, 0, 0, 0, 0, "Na", "Mg", "Pt", "Zn", "– Na,Mg and Zn are active metals and are never found in the free state Pt is uncreative and it exists in the Free State.", "c", 0, 1, this.f493b));
        arrayList.add(new questions("10.", "A ____ ΔH corresponds to an _____ process.", 0, 0, 0, 0, 0, "Negative, endothermic", "Positive, exothermic", "Zero, exothermic", "Positive, endothermic", "", "d", C2719R.C2721drawable.chem1010e, 1, this.f493b));
        arrayList.add(new questions("11.", "Which of the following is NOT both a Bronsted - Lowry acid and a Bronsted-Lowry base?", 0, C2719R.C2721drawable.c2010q11a, C2719R.C2721drawable.c2010q11b, C2719R.C2721drawable.c2010q11c, C2719R.C2721drawable.c2010q11d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1011e, 1, this.f493b));
        arrayList.add(new questions("12.", "Chlorine has an oxidation number of +5 in:", 0, C2719R.C2721drawable.c2010q12a, C2719R.C2721drawable.c2010q12b, C2719R.C2721drawable.c2010q12c, C2719R.C2721drawable.c2010q12d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1012e, 1, this.f493b));
        arrayList.add(new questions("13.", "What is a measure of the closeness of a measurement to its true value?", 0, 0, 0, 0, 0, "Accuracy", "Precision", "Reproducibility", "Usefulness", "Precision is the closeness among several measurements of the same quantity.\n  \t-  Accuracy is the extent to which a measured value coincides with the true value of the measured quantity\n", "a", 0, 1, this.f493b));
        arrayList.add(new questions("14.", "The monomer of neoprene is:", 0, 0, 0, 0, 0, "Butadiene", "Isoprene", "Chloroprene", "2 -methyl-1,3-butadiene", "The monomer of neoprene is\n \t       2 - Chloro-1,3-butadiene (Chloroprene)\n \t       The monomer of natural rubber is\n  \t       2-methyl-1,3 - butadiene.(Isoprene)\n", "c", 0, 1, this.f493b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.c2010q15, C2719R.C2721drawable.c2010q15a, C2719R.C2721drawable.c2010q15b, C2719R.C2721drawable.c2010q15c, C2719R.C2721drawable.c2010q15c, "", "", "", "", "", "b", C2719R.C2721drawable.chem1015e, 1, this.f493b));
        arrayList.add(new questions("16.", "Which of the following is a natural polymer?", 0, 0, 0, 0, 0, "PVC", "Rubber", "Perspex", "Teflon", "PVC, Perspex and Teflon are synthetic polymers Rubber is obtained from rubber tree and it is a natural polymer with the monomer 2 - Methyl -1,3-butadiene (Isoprene)", "b", 0, 1, this.f493b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.c2010q17, C2719R.C2721drawable.c2010q17a, C2719R.C2721drawable.c2010q17b, C2719R.C2721drawable.c2010q17c, C2719R.C2721drawable.c2010q17d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1017e, 1, this.f493b));
        arrayList.add(new questions("18.", "Nylons are:", 0, 0, 0, 0, 0, "Amides", "peptides", "polyesters", "polyamides", "Nylon is a generic name for polyamides rather than the name of a polymer", "d", 0, 1, this.f493b));
        arrayList.add(new questions("19.", "Which quantum number is used to determine sub shells?", 0, 0, 0, 0, 0, "Principal quantum number", "Magnetic quantum number", "Spin quantum number", "Azimuthal quantum number", "", "d", C2719R.C2721drawable.chem1019e, 1, this.f493b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.c2010q20, C2719R.C2721drawable.c2010q20a, C2719R.C2721drawable.c2010q20b, C2719R.C2721drawable.c2010q20c, C2719R.C2721drawable.c2010q20d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1020e, 1, this.f493b));
        arrayList.add(new questions("21.", "What is the maximum number of electrons in an atom that can have the principal quantum number=4 ?", 0, 0, 0, 0, 0, "34", "8", "32", "18", "", "c", C2719R.C2721drawable.chem1021e, 1, this.f493b));
        arrayList.add(new questions("22.", "Which of the following equations expresses de Broglie's hypothesis?", 0, 0, 0, 0, 0, "λ=h/(mv)", "ΔE=hc/λ", "v=c/λ", "ΔE=c/λ", "", "a", C2719R.C2721drawable.chem1022e, 1, this.f493b));
        arrayList.add(new questions("23.", "What skill is a scientist using when he/she listens to the sounds that animals make?", 0, 0, 0, 0, 0, "Drawing conclusions", "Making a hypothesis", "Interpreting data", "Making observations", "The steps in a scientific method are\n \t \tStep 1 Observation and experiment\n \t \tStep 2 Data and interpretation\n \t\tStep 3 Finding patterns trends and laws\n \t\tStep 4 Formulating and testing hypothesis\n \t\tStep 5 Theory\nNote: During hypothesis and theory there must be observation and experiment\n", "d", 0, 1, this.f493b));
        arrayList.add(new questions("24.", "Which of the following is fundamentally different from the others?", 0, 0, 0, 0, 0, "Light waves", "Radio waves", "Sound waves", "Microwaves", "Light consists of electromagnetic waves such as radio waves\nMicrowaves, infrared ray, Ultraviolet ray, X - ray, and gamma ray.\nSound waves are not electromagnetic waves\n", "c", 0, 1, this.f493b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.c2010q25, 0, 0, 0, 0, "109.5 degree", "90 degree", "90 and 109.5 degrees", "180 degree", "", "b", C2719R.C2721drawable.chem1025e, 1, this.f493b));
        arrayList.add(new questions("26.", "", C2719R.C2721drawable.c2010q26, 0, 0, 0, 0, "9", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "6", "", "c", C2719R.C2721drawable.chem1026e, 1, this.f493b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.c2010q27, C2719R.C2721drawable.c2010q27a, C2719R.C2721drawable.c2010q27b, C2719R.C2721drawable.c2010q27c, C2719R.C2721drawable.c2010q27d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1027e, 1, this.f493b));
        arrayList.add(new questions("28.", "Which of the following compounds does NOT contain an ionic bond?", 0, C2719R.C2721drawable.c2010q28a, 0, C2719R.C2721drawable.c2010q28c, 0, "", "HCl", "", "LiH", "–  NaOH,K_2 \" \" S, and LiH are formed by transfer of electrons and contain ionic bond, but HCl is formed by sharing of electrons and contains a polar covalent bond.", "b", 0, 1, this.f493b));
        arrayList.add(new questions("29.", "Which of the following statements about oxygen and fluorine is NOT Correct?", 0, 0, 0, C2719R.C2721drawable.c2010q29c, 0, "O Has a smaller atomic radius than F.", "O Has a smaller electron affinity than F", "", "O And F have the same number of core electrons", "", "a", C2719R.C2721drawable.chem1029e, 1, this.f493b));
        arrayList.add(new questions("30.", "What will be the charges on the ions formed when silicon react is with nitrogen?", 0, C2719R.C2721drawable.c2010q30a, C2719R.C2721drawable.c2010q20b, C2719R.C2721drawable.c2010q20c, C2719R.C2721drawable.c2010q20d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1030e, 1, this.f493b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.c2010q31, 0, 0, 0, 0, "II and III", "I and IV", "I and III", "II and IV", "", "d", C2719R.C2721drawable.chem1031e, 1, this.f493b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.c2010q32, C2719R.C2721drawable.c2010q32a, C2719R.C2721drawable.c2010q32b, C2719R.C2721drawable.c2010q32c, C2719R.C2721drawable.c2010q32d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1032e, 1, this.f493b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.c2010q33, C2719R.C2721drawable.c2010q33a, C2719R.C2721drawable.c2010q33b, C2719R.C2721drawable.c2010q33c, C2719R.C2721drawable.c2010q33d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1033e, 1, this.f493b));
        arrayList.add(new questions("34.", "Which one of the following factors does NOT affect the rate of a chemical reaction?", 0, 0, 0, 0, 0, "Concentration", "Nature of reactants", "Temperature", "humidity", "The rate of a reaction is affected by nature of reactants concentration, temperature, surface area for solid reactants, pressure for gaseous reactants, and catalysts", "d", 0, 1, this.f493b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.c2010q35, C2719R.C2721drawable.c2010q35a, C2719R.C2721drawable.c2010q35b, C2719R.C2721drawable.c2010q35c, C2719R.C2721drawable.c2010q35d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1035e, 1, this.f493b));
        arrayList.add(new questions("36.", "If a reaction is zero order in A, tripling the concentration of A will cause the reaction rate to:", 0, 0, 0, 0, 0, "Increase by a factor of 3", "Remain constant", "increase by a factor of 27", "increase by a factor of 9", "", "b", C2719R.C2721drawable.chem1036e, 1, this.f493b));
        arrayList.add(new questions("37.", "The phrase \"like dissolves like\" refers to the fact that:", 0, 0, 0, 0, 0, "polar solvents dissolve non polar solutes and vice versa", "solvents can only dissolve solutes of similar molar mass", "Polar solvents dissolve polar solutes and non-polar solvents dissolve non polar solutes", "Gases can only dissolve other gases", "\"Like dissolves like\" means polar solvents dissolve polar solutes and non-polar solvents dissolve non- polar solutes\nExample: water (polar) dissolves NaCl (polar)\n \t      Benzene (non - polar)dissolves\n \t      Hexane (non-polar)\n", "c", 0, 1, this.f493b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.c2010q38, 0, 0, 0, 0, "Propanoic acid and propanol -1 ", "Butanoic acid and ethanol", "Ethanoic acid and butanol - 1", "Propanoic acid and ethanol", "", "b", C2719R.C2721drawable.chem1038e, 1, this.f493b));
        arrayList.add(new questions("39.", "You are given a bottle of solid X and three aqueous solutions of Y, the first saturated the second unsaturated and the third supersaturated. Whicf of the following is correct, if you add a small amount of the solid solute to each solution?", 0, 0, 0, 0, 0, "The solution in which the added solid solute dissolves is the saturated solution.", "The solution is which the added solid solute remains undissolved is the unsaturated solution.", "In all the three solutions, saturated. Unsaturated and supersaturated the added solid solute will dissolve.", "The supersaturated solution is unstable and addition of additional solute causes the excess solute to crystallize.", "A saturated solution is a solution in which the dissolved and undissolved solutes are in dynamic equilibrium. An unsaturated solution is a solution that can dissolve more solute at a given temperature.\nSupersaturated solutions are unstable and addition of a seed crystal of solute causes the excess solute to crystallize.\n", "d", 0, 1, this.f493b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.c2010q40, C2719R.C2721drawable.c2010q40a, C2719R.C2721drawable.c2010q40b, C2719R.C2721drawable.c2010q40c, C2719R.C2721drawable.c2010q40d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1040e, 1, this.f493b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.c2010q41, 0, 0, 0, 0, "I", "II", "I and II", "III", "The forward reaction is endothermic and a temperature increase shifts the equilibrium to the right, that is ,more B and/or C is formed Moreover, the value of K increases as there are more products.", "d", 0, 1, this.f493b));
        arrayList.add(new questions("42.", "Which of the following compounds would be the most soluble in water ?", 0, 0, 0, 0, 0, "Ethane", "Pentane", "Ethanoic acid", "Octatonic acid", "", "c", C2719R.C2721drawable.chem1042e, 1, this.f493b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.c2010q43, C2719R.C2721drawable.c2010q43a, C2719R.C2721drawable.c2010q43b, C2719R.C2721drawable.c2010q43c, C2719R.C2721drawable.c2010q43d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1043e, 1, this.f493b));
        arrayList.add(new questions("44.", "What species of ions are present in a 0.1M solution of HCl and what be their equilibrium concentrations?", 0, C2719R.C2721drawable.c2010q44a, C2719R.C2721drawable.c2010q44b, C2719R.C2721drawable.c2010q44c, C2719R.C2721drawable.c2010q44d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1044e, 1, this.f493b));
        arrayList.add(new questions("45.", "A solution in which prop ionic acid is 0.94% ionized has a PH of 2.85. What is the value of the acid ionization constant (Ka) for prop ionic acid?", 0, C2719R.C2721drawable.c2010q45a, C2719R.C2721drawable.c2010q45b, C2719R.C2721drawable.c2010q45c, C2719R.C2721drawable.c2010q45d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1045e, 1, this.f493b));
        arrayList.add(new questions("46.", "", C2719R.C2721drawable.c2010q46, 0, 0, 0, 0, "16.8M", "35.0N", "28.2", "40.4M", "", "b", C2719R.C2721drawable.chem1046e, 1, this.f493b));
        arrayList.add(new questions("47.", "", 0, 0, 0, 0, 0, "0.1m", "0.01m", "1.0m", "10.0m", "", "a", C2719R.C2721drawable.chem1047e, 1, this.f493b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.c2010q48, C2719R.C2721drawable.c2010q48a, C2719R.C2721drawable.c2010q48b, C2719R.C2721drawable.c2010q48c, C2719R.C2721drawable.c2010q48d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1048e, 1, this.f493b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.c2010q49, C2719R.C2721drawable.c2010q49a, C2719R.C2721drawable.c2010q49b, C2719R.C2721drawable.c2010q49c, C2719R.C2721drawable.c2010q49d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1049e, 1, this.f493b));
        arrayList.add(new questions("50.", "During the electrolysis of a concentrated aqueous solution of NaCl, what substance is formed at the cathode?", 0, 0, 0, 0, 0, "Chlorine", "hydrogen", "oxygen", "sodium", "", "b", C2719R.C2721drawable.chem1050e, 1, this.f493b));
        arrayList.add(new questions("51.", "In a voltaic cell, electrons flow from the to the", 0, 0, 0, 0, 0, "Anode, cathode", "Salt bridge, anode", "anode, salt bridge", "salt bridge, cathode", "In a voltaic (galvanic)Cell, electrons flow from the anode to the\ncathode\n", "a", 0, 1, this.f493b));
        arrayList.add(new questions("52.", "What is the PH of a mixture of 15.0mL of 0.126M NaOH and 21.0M  H2SO4?", 0, 0, 0, 0, 0, "1.70", "11.81", "2.15", "13.60", "", "a", C2719R.C2721drawable.chem1052e, 1, this.f493b));
        arrayList.add(new questions("53.", "Which of the following statement is true?", 0, C2719R.C2721drawable.c2010q53a, C2719R.C2721drawable.c2010q53b, C2719R.C2721drawable.c2010q53c, C2719R.C2721drawable.c2010q53d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1053e, 1, this.f493b));
        arrayList.add(new questions("54.", "What is final temperature when 150.0mL of water at 90 degree C is added to 100.0mL of water at 30 degree C ?", 0, 0, 0, 0, 0, "66 degree C", "45 degree C", "60 degree C", "33 degree C", "", "c", C2719R.C2721drawable.chem1054e, 1, this.f493b));
        arrayList.add(new questions("55.", "Which of the following correctly lists electromagnetic waves in order from shortest to longest wavelength?", 0, 0, 0, 0, 0, "Microwaves, ultraviolet, visible light, gamma rays", "Gamma rays, ultraviolet, infrared, microwaves", "Radio waves, infrared, gamma rays, ultraviolet", "Gamma rays, infrared, ultraviolet, microwaves", "The electromagnetic waves in order of increasing wavelength (from shortest to longest) is Gamma rays, X - rays, ultraviolet, infrared, microwaves, radio waves", "b", 0, 1, this.f493b));
        arrayList.add(new questions("56.", "The relationship between Pico meter (pm) and nanometer (nm) is:", 0, 0, 0, 0, 0, "1 nm = 1000 pm", "1 nm = 10 pm", "1 pm = 100 nm", "1 pm = 10 nm", "", "a", C2719R.C2721drawable.chem1056e, 1, this.f493b));
        arrayList.add(new questions("57.", "What would be the wavelength of a radio wave having a frequency of 3MHz ?", 0, 0, 0, 0, 0, "100 nm", "300 m", "100 m", "300 nm", "", "c", C2719R.C2721drawable.chem1057e, 1, this.f493b));
        arrayList.add(new questions("58.", "The process of vulcanization of rubber makes it", 0, 0, 0, 0, 0, "more soluble in solvents", "Soft", "less elastic", "hard", "Vulcanization is the addition of sulfur to rubber to make it harder and reduce its susceptibility to oxidation or other chemical attack.", "d", 0, 1, this.f493b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.c2010q59, C2719R.C2721drawable.c2010q59a, C2719R.C2721drawable.c2010q59b, C2719R.C2721drawable.c2010q59c, C2719R.C2721drawable.c2010q59d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1059e, 1, this.f493b));
        arrayList.add(new questions("60.", "", C2719R.C2721drawable.c2010q60, C2719R.C2721drawable.c2010q60a, C2719R.C2721drawable.c2010q60b, C2719R.C2721drawable.c2010q60c, C2719R.C2721drawable.c2010q60d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1060e, 1, this.f493b));
        arrayList.add(new questions("61.", "", C2719R.C2721drawable.c2010q61, 0, 0, 0, 0, "T1 = T2, fraction of molecules at both temperatures are equal.", "T2 < T1, fraction of molecules at T2 is smaller.", "T1 < T2, fraction of molecules at T1 is larger.", "T1 < T2, fraction of molecules at T1 is smaller.", "From the diagram, we can see that at T_1=T_2 fraction of molecules at both temperatures are equal", "a", 0, 1, this.f493b));
        arrayList.add(new questions("62.", "", C2719R.C2721drawable.c2010q62, C2719R.C2721drawable.c2010q62a, C2719R.C2721drawable.c2010q62b, C2719R.C2721drawable.c2010q62c, C2719R.C2721drawable.c2010q62d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1062e, 1, this.f493b));
        arrayList.add(new questions("63.", "The decomposition of a compound at 400 degrees C is first order with a half - life of 1570 seconds what fraction of an initial amount of the compound remains after 4710 seconds?", 0, 0, 0, 0, 0, "1/8", "1/12", "1/6", "1/3", "", "a", C2719R.C2721drawable.chem1063e, 1, this.f493b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.c2010q64, C2719R.C2721drawable.c2010q64a, C2719R.C2721drawable.c2010q64b, C2719R.C2721drawable.c2010q64c, C2719R.C2721drawable.c2010q64d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1064e, 1, this.f493b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.c2010q65, C2719R.C2721drawable.c2010q65a, C2719R.C2721drawable.c2010q65b, C2719R.C2721drawable.c2010q65c, C2719R.C2721drawable.c2010q65d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1065e, 1, this.f493b));
        arrayList.add(new questions("66.", "", C2719R.C2721drawable.c2010q66, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "1", ExifInterface.GPS_MEASUREMENT_3D, "4", "", "b", C2719R.C2721drawable.chem1066e, 1, this.f493b));
        arrayList.add(new questions("67.", "", C2719R.C2721drawable.c2010q67, 0, 0, 0, 0, "0.9659", "0.2100", "0.6500", "0.0341", "", "d", C2719R.C2721drawable.chem1067e, 1, this.f493b));
        arrayList.add(new questions("68.", "Which of the following is true regarding the solution formation process?", 0, 0, 0, 0, 0, "New columbic attraction between the solute and solvent form in which enthalpy change is exothermic (∆H<0)", "Intermolecular forces between the solvent molecules must weaken in which the enthalpy change is exothermic (∆H<0)", "Intermolecular forces between the solute particles must weaken in which the enthalpy change is exothermic (∆H<0)", "Covalent bonds within the solute and solvent molecules must be broken.", "", "a", C2719R.C2721drawable.chem1068e, 1, this.f493b));
        arrayList.add(new questions("69.", "", C2719R.C2721drawable.c2010q69, 0, 0, 0, 0, "2,643 mL", "264.3 mL", "26.43 mL", "2643 mL", "", "b", C2719R.C2721drawable.chem1069e, 1, this.f493b));
        arrayList.add(new questions("70.", "Which of the following statements is NOT true in relation to the triple point on a single component phase diagram?", 0, 0, 0, 0, 0, "The point at which the solid, Liquid and gaseous phases for a substance co-exist", "The triple point exists at a single temperature and is independent of pressure", "The system must be enclosed so that no Vapor can escape", "The triple point exists for a substance occurs at a specific temperature and pressure", "Triple point is the point at which the solid, liquid and gaseous phases for a substance to exist. It exists at a specific temperature and pressure, and the system must be enclosed so that no vapor can escape.", "b", 0, 1, this.f493b));
        arrayList.add(new questions("71.", "", C2719R.C2721drawable.c2010q71, 0, 0, 0, 0, "0.80M", "0.89M", "10M", "4.5M", "", "d", C2719R.C2721drawable.chem1070e, 1, this.f493b));
        arrayList.add(new questions("72.", "", C2719R.C2721drawable.c2010q72, 0, 0, 0, 0, "Phenyl acetic acid", "Toluic acid", "Benzoic acid", "Phthalic acid", "", "c", C2719R.C2721drawable.chem1072e, 1, this.f493b));
        arrayList.add(new questions("73.", "Which of the following statement is true?", 0, 0, 0, 0, 0, "If the entropy of the system increases during a reversible process, the entropy change will also increase by the same amount.", "If the entropy of the system increases during a reversible process, the entropy change of the surroundings will remain the same", "If the entropy of the system increases during a reversible process, the entropy change of the surroundings will decrease by the same amount", "If the entropy of the system decreases during a reversible process, the entropy change of the surroundings will also decrease by the same amount", "", "a", C2719R.C2721drawable.chem1073e, 1, this.f493b));
        arrayList.add(new questions("74.", "", C2719R.C2721drawable.c2010q74, 0, 0, 0, 0, "-7KJ", "-290KJ", "+7 KJ", "+290KJ", "", "a", C2719R.C2721drawable.chem1074e, 1, this.f493b));
        arrayList.add(new questions("75.", "", C2719R.C2721drawable.c2010q75, 0, 0, 0, 0, "476s", "1252s", "683s", "1028s", "", "b", C2719R.C2721drawable.chem1075e, 1, this.f493b));
        arrayList.add(new questions("76.", "Which of the following is an organic acid?", 0, C2719R.C2721drawable.c2010q76a, C2719R.C2721drawable.c2010q76b, C2719R.C2721drawable.c2010q76c, C2719R.C2721drawable.c2010q76d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1076e, 1, this.f493b));
        arrayList.add(new questions("77.", "", C2719R.C2721drawable.c2010q77, 0, 0, 0, 0, "-0.186", "-0.372", "-1.86", "-0.093", "", "a", C2719R.C2721drawable.chem1077e, 1, this.f493b));
        arrayList.add(new questions("78.", "", C2719R.C2721drawable.c2010q78, 0, 0, 0, 0, "10.0 mL", "40.0 mL", "25.0 mL", "20.0 mL", "", "b", C2719R.C2721drawable.chem1078e, 1, this.f493b));
        arrayList.add(new questions("79.", "", C2719R.C2721drawable.c2010q79, 0, 0, 0, 0, "7.02 V", "3.51 V", "1.17 V", "14.04 V", "", "c", C2719R.C2721drawable.chem1079e, 1, this.f493b));
        arrayList.add(new questions("80.", "", C2719R.C2721drawable.c2010q80, 0, 0, 0, 0, "0.374", "0.0118", "0.748", "0.954", "", "a", C2719R.C2721drawable.chem1080e, 1, this.f493b));
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
        this.f494tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(150), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    chemistry2010.this.timer.setVisibility(0);
                    chemistry2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    chemistry2010.this.scr.setVisibility(8);
                    chemistry2010.this.chr.stop();
                    chemistry2010.this.toolbar.setVisibility(8);
                    chemistry2010.this.Relative.setBackgroundColor(-7829368);
                    chemistry2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2010.this.getBaseContext());
                    int unused = chemistry2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = chemistry2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = chemistry2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = chemistry2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = chemistry2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = chemistry2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = chemistry2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = chemistry2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = chemistry2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = chemistry2010.this.highscoreChemistry2010 = defaultSharedPreferences.getInt("chem2010hs", 0);
                    int access$600 = chemistry2010.this.part1 + chemistry2010.this.part2 + chemistry2010.this.part3 + chemistry2010.this.part4 + chemistry2010.this.part5 + chemistry2010.this.part6 + chemistry2010.this.part7 + chemistry2010.this.part8 + chemistry2010.this.part9;
                    TextView access$1600 = chemistry2010.this.resultText;
                    access$1600.setText(access$600 + "/80");
                    chemistry2010.this.progressbar.setProgress(access$600);
                    chemistry2010.this.progressbar.setMax(80);
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
                    int unused11 = chemistry2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = chemistry2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = chemistry2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = chemistry2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = chemistry2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = chemistry2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = chemistry2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = chemistry2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "chem2010hs";
                    int unused19 = chemistry2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = chemistry2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = chemistry2010.this.answered1 + chemistry2010.this.answered2 + chemistry2010.this.answered3 + chemistry2010.this.answered4 + chemistry2010.this.answered5 + chemistry2010.this.answered6 + chemistry2010.this.answered7 + chemistry2010.this.answered8 + chemistry2010.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > chemistry2010.this.highscoreChemistry2010) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - ((SystemClock.elapsedRealtime() - chemistry2010.this.chr.getBase()) / 1000)) * 3600) / 9000))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1chem101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1chem102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1chem103", 0);
                    long j4 = defaultSharedPreferences.getLong("date1chem104", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1chem105", 0);
                    long j6 = defaultSharedPreferences.getLong("date1chem106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1chem107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1chem108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1chem109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1chem1010", 0);
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
                        editor.putString("scorechem101", str2);
                        editor.putLong("date1chem101", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorechem102", str3);
                            editor.putLong("date1chem102", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorechem103", str3);
                            editor.putLong("date1chem103", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorechem104", str3);
                            editor.putLong("date1chem104", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorechem105", str3);
                            editor.putLong("date1chem105", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorechem106", str3);
                            editor.putLong("date1chem106", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorechem107", str3);
                            editor.putLong("date1chem107", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorechem108", str3);
                            editor.putLong("date1chem108", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorechem109", str3);
                            editor.putLong("date1chem109", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorechem1010", str3);
                            editor.putLong("date1chem1010", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datechem101", 0);
                    long j12 = defaultSharedPreferences.getLong("datechem102", 0);
                    long j13 = defaultSharedPreferences.getLong("datechem103", 0);
                    long j14 = defaultSharedPreferences.getLong("datechem104", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datechem105", 0);
                    long j16 = defaultSharedPreferences.getLong("datechem106", 0);
                    long j17 = defaultSharedPreferences.getLong("datechem107", 0);
                    long j18 = defaultSharedPreferences.getLong("datechem108", 0);
                    long j19 = defaultSharedPreferences.getLong("datechem109", 0);
                    long j20 = defaultSharedPreferences.getLong("datechem1010", 0);
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
                        editor2.putString("iScorechem101", f);
                        editor2.putLong("datechem101", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorechem102", f);
                            editor2.putLong("datechem102", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorechem103", f);
                            editor2.putLong("datechem103", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorechem104", f);
                            editor2.putLong("datechem104", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorechem105", f);
                            editor2.putLong("datechem105", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorechem106", f);
                            editor2.putLong("datechem106", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorechem107", f);
                            editor2.putLong("datechem107", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorechem108", f);
                            editor2.putLong("datechem108", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorechem109", f);
                            editor2.putLong("datechem109", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorechem1010", f);
                            editor2.putLong("datechem1010", valueOf.longValue());
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
                        chemistry2010.this.scr.setVisibility(8);
                        chemistry2010.this.chr.stop();
                        chemistry2010.this.toolbar.setVisibility(8);
                        chemistry2010.this.Relative.setBackgroundColor(-7829368);
                        chemistry2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2010.this.getBaseContext());
                        int unused = chemistry2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = chemistry2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = chemistry2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = chemistry2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = chemistry2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = chemistry2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = chemistry2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = chemistry2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = chemistry2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = chemistry2010.this.highscoreChemistry2010 = defaultSharedPreferences.getInt("chem2010hs", 0);
                        int access$600 = chemistry2010.this.part1 + chemistry2010.this.part2 + chemistry2010.this.part3 + chemistry2010.this.part4 + chemistry2010.this.part5 + chemistry2010.this.part6 + chemistry2010.this.part7 + chemistry2010.this.part8 + chemistry2010.this.part9;
                        TextView access$1600 = chemistry2010.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        chemistry2010.this.progressbar.setProgress(access$600);
                        chemistry2010.this.progressbar.setMax(80);
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
                        int unused11 = chemistry2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = chemistry2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = chemistry2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = chemistry2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = chemistry2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = chemistry2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = chemistry2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = chemistry2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = chemistry2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = chemistry2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = chemistry2010.this.answered1 + chemistry2010.this.answered2 + chemistry2010.this.answered3 + chemistry2010.this.answered4 + chemistry2010.this.answered5 + chemistry2010.this.answered6 + chemistry2010.this.answered7 + chemistry2010.this.answered8 + chemistry2010.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > chemistry2010.this.highscoreChemistry2010) {
                            edit.putInt("chem2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - chemistry2010.this.chr.getBase()) / 1000;
                        defaultSharedPreferences.getFloat("iScorechem10", 0.0f);
                        String str = "datechem109";
                        String str2 = "datechem108";
                        String str3 = "datechem107";
                        String str4 = "datechem106";
                        String str5 = "datechem105";
                        String str6 = "datechem104";
                        String str7 = "datechem103";
                        String str8 = "datechem102";
                        String str9 = "datechem101";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1chem1010";
                        String str11 = "date1chem109";
                        if (chemistry2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - elapsedRealtime) * 3600) / 9000))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1chem101", 0);
                            String str12 = "date1chem101";
                            String str13 = f;
                            long j2 = defaultSharedPreferences.getLong("date1chem102", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1chem103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1chem104", 0);
                            String str15 = "date1chem104";
                            String str16 = "date1chem103";
                            String str17 = "date1chem105";
                            long j5 = defaultSharedPreferences.getLong("date1chem105", 0);
                            long j6 = defaultSharedPreferences.getLong("date1chem107", 0);
                            String str18 = "date1chem106";
                            String str19 = "date1chem108";
                            long j7 = defaultSharedPreferences.getLong("date1chem108", 0);
                            long j8 = defaultSharedPreferences.getLong(str11, 0);
                            long j9 = defaultSharedPreferences.getLong(str10, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(defaultSharedPreferences.getLong("date1chem106", 0));
                            Date date7 = new Date(j6);
                            Date date8 = new Date(j7);
                            String str20 = "date1chem107";
                            Date date9 = new Date(j8);
                            Date date10 = new Date(j9);
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
                                editor3 = editor5;
                                editor3.putString("scorechem101", str14);
                                editor3.putLong(str12, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str21 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorechem102", str21);
                                    editor3.putLong("date1chem102", l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorechem103", str21);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorechem104", str21);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorechem105", str21);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorechem106", str21);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorechem107", str21);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorechem108", str21);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorechem109", str21);
                                    editor3.putLong(str11, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorechem1010", str21);
                                    editor3.putLong(str10, l.longValue());
                                }
                            }
                            String str22 = str9;
                            long j10 = defaultSharedPreferences.getLong(str22, 0);
                            String str23 = str8;
                            long j11 = defaultSharedPreferences.getLong(str23, 0);
                            String str24 = str7;
                            long j12 = defaultSharedPreferences.getLong(str24, 0);
                            SharedPreferences.Editor editor6 = editor3;
                            String str25 = str5;
                            String str26 = str4;
                            long j13 = defaultSharedPreferences.getLong(str25, 0);
                            long j14 = defaultSharedPreferences.getLong(str26, 0);
                            String str27 = str26;
                            long j15 = defaultSharedPreferences.getLong(str3, 0);
                            long j16 = defaultSharedPreferences.getLong(str2, 0);
                            long j17 = defaultSharedPreferences.getLong(str, 0);
                            long j18 = defaultSharedPreferences.getLong("datechem1010", 0);
                            Date date12 = new Date(j10);
                            Date date13 = new Date(j11);
                            Date date14 = new Date(j12);
                            Date date15 = new Date(defaultSharedPreferences.getLong(str6, 0));
                            Date date16 = new Date(j13);
                            String str28 = str25;
                            Date date17 = new Date(j14);
                            Date date18 = new Date(j15);
                            String str29 = str24;
                            Date date19 = date17;
                            Date date20 = new Date(j16);
                            Date date21 = new Date(j17);
                            Date date22 = new Date(j18);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date12);
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            arrayList2.add(date16);
                            Date date23 = date19;
                            arrayList2.add(date23);
                            arrayList2.add(date18);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            Date date24 = (Date) Collections.min(arrayList2);
                            if (date24.compareTo(date12) == 0) {
                                editor4 = editor6;
                                editor4.putString("iScorechem101", str13);
                                editor4.putLong(str22, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str30 = str13;
                                if (date24.compareTo(date13) == 0) {
                                    editor4.putString("iScorechem102", str30);
                                    editor4.putLong(str23, l.longValue());
                                } else if (date24.compareTo(date14) == 0) {
                                    editor4.putString("iScorechem103", str30);
                                    editor4.putLong(str29, l.longValue());
                                } else if (date24.compareTo(date15) == 0) {
                                    editor4.putString("iScorechem104", str30);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date24.compareTo(date16) == 0) {
                                    editor4.putString("iScorechem105", str30);
                                    editor4.putLong(str28, l.longValue());
                                } else if (date24.compareTo(date23) == 0) {
                                    editor4.putString("iScorechem106", str30);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date24.compareTo(date18) == 0) {
                                    editor4.putString("iScorechem107", str30);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date24.compareTo(date20) == 0) {
                                    editor4.putString("iScorechem108", str30);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date24.compareTo(date21) == 0) {
                                    editor4.putString("iScorechem109", str30);
                                    editor4.putLong(str, l.longValue());
                                } else if (date24.compareTo(date22) == 0) {
                                    editor4.putString("iScorechem1010", str30);
                                    editor4.putLong("datechem1010", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            String str31 = "date1chem104";
                            String str32 = "date1chem103";
                            String str33 = str;
                            String str34 = str2;
                            String str35 = str3;
                            String str36 = str5;
                            String str37 = str6;
                            String str38 = str7;
                            String str39 = str8;
                            String str40 = str10;
                            String str41 = str11;
                            String str42 = "date1chem105";
                            String str43 = "date1chem106";
                            String str44 = "date1chem107";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 9000))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j19 = defaultSharedPreferences.getLong("date1chem101", 0);
                            String str45 = "date1chem101";
                            String str46 = f3;
                            String str47 = f4;
                            long j20 = defaultSharedPreferences.getLong(str32, 0);
                            long j21 = defaultSharedPreferences.getLong(str31, 0);
                            String str48 = str32;
                            String str49 = str31;
                            long j22 = defaultSharedPreferences.getLong(str42, 0);
                            long j23 = defaultSharedPreferences.getLong(str43, 0);
                            String str50 = str42;
                            String str51 = str43;
                            long j24 = defaultSharedPreferences.getLong(str44, 0);
                            String str52 = "date1chem108";
                            long j25 = defaultSharedPreferences.getLong(str52, 0);
                            long j26 = defaultSharedPreferences.getLong(str41, 0);
                            long j27 = defaultSharedPreferences.getLong(str40, 0);
                            Date date25 = new Date(j19);
                            Date date26 = new Date(defaultSharedPreferences.getLong("date1chem102", 0));
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            String str53 = str40;
                            Date date27 = new Date(j20);
                            Date date28 = new Date(j21);
                            Date date29 = new Date(j22);
                            Date date30 = new Date(j23);
                            Date date31 = new Date(j24);
                            String str54 = str41;
                            Date date32 = new Date(j25);
                            SharedPreferences sharedPreferences2 = sharedPreferences;
                            Date date33 = new Date(j26);
                            Date date34 = new Date(j27);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(date25);
                            arrayList3.add(date26);
                            arrayList3.add(date27);
                            arrayList3.add(date28);
                            arrayList3.add(date29);
                            arrayList3.add(date30);
                            arrayList3.add(date31);
                            Date date35 = date32;
                            arrayList3.add(date35);
                            arrayList3.add(date33);
                            arrayList3.add(date34);
                            Date date36 = (Date) Collections.min(arrayList3);
                            if (date36.compareTo(date25) == 0) {
                                editor2 = editor5;
                                editor2.putString("scorechem101", str47);
                                editor2.putLong(str45, valueOf2.longValue());
                            } else {
                                String str55 = str47;
                                editor2 = editor5;
                                if (date36.compareTo(date26) == 0) {
                                    editor2.putString("scorechem102", str55);
                                    editor2.putLong("date1chem102", valueOf2.longValue());
                                } else if (date36.compareTo(date27) == 0) {
                                    editor2.putString("scorechem103", str55);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date36.compareTo(date28) == 0) {
                                    editor2.putString("scorechem104", str55);
                                    editor2.putLong(str49, valueOf2.longValue());
                                } else if (date36.compareTo(date29) == 0) {
                                    editor2.putString("scorechem105", str55);
                                    editor2.putLong(str50, valueOf2.longValue());
                                } else if (date36.compareTo(date30) == 0) {
                                    editor2.putString("scorechem106", str55);
                                    editor2.putLong(str51, valueOf2.longValue());
                                } else if (date36.compareTo(date31) == 0) {
                                    editor2.putString("scorechem107", str55);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date36.compareTo(date35) == 0) {
                                    editor2.putString("scorechem108", str55);
                                    editor2.putLong(str52, valueOf2.longValue());
                                } else if (date36.compareTo(date33) == 0) {
                                    editor2.putString("scorechem109", str55);
                                    editor2.putLong(str54, valueOf2.longValue());
                                } else if (date36.compareTo(date34) == 0) {
                                    editor2.putString("scorechem1010", str55);
                                    editor2.putLong(str53, valueOf2.longValue());
                                }
                            }
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            String str56 = str9;
                            long j28 = sharedPreferences3.getLong(str56, 0);
                            String str57 = str39;
                            long j29 = sharedPreferences3.getLong(str57, 0);
                            String str58 = str38;
                            long j30 = sharedPreferences3.getLong(str58, 0);
                            SharedPreferences.Editor editor7 = editor2;
                            String str59 = str57;
                            String str60 = str37;
                            long j31 = sharedPreferences3.getLong(str60, 0);
                            String str61 = str58;
                            String str62 = str60;
                            String str63 = str36;
                            long j32 = sharedPreferences3.getLong(str63, 0);
                            String str64 = str63;
                            String str65 = str4;
                            long j33 = j32;
                            long j34 = sharedPreferences3.getLong(str65, 0);
                            String str66 = str65;
                            long j35 = sharedPreferences3.getLong(str35, 0);
                            long j36 = sharedPreferences3.getLong(str34, 0);
                            String str67 = str33;
                            long j37 = sharedPreferences3.getLong(str67, 0);
                            String str68 = str67;
                            long j38 = sharedPreferences3.getLong("datechem1010", 0);
                            Date date37 = new Date(j28);
                            Date date38 = new Date(j29);
                            Date date39 = new Date(j30);
                            Date date40 = new Date(j31);
                            Date date41 = new Date(j33);
                            Date date42 = new Date(j34);
                            Date date43 = new Date(j35);
                            Date date44 = new Date(j36);
                            Date date45 = new Date(j37);
                            Date date46 = new Date(j38);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date39);
                            arrayList4.add(date40);
                            arrayList4.add(date41);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            arrayList4.add(date44);
                            arrayList4.add(date45);
                            arrayList4.add(date46);
                            Date date47 = (Date) Collections.min(arrayList4);
                            if (date47.compareTo(date37) == 0) {
                                editor = editor7;
                                editor.putString("iScorechem101", str46);
                                editor.putLong(str56, valueOf2.longValue());
                            } else {
                                String str69 = str46;
                                editor = editor7;
                                if (date47.compareTo(date38) == 0) {
                                    editor.putString("iScorechem102", str69);
                                    editor.putLong(str59, valueOf2.longValue());
                                } else if (date47.compareTo(date39) == 0) {
                                    editor.putString("iScorechem103", str69);
                                    editor.putLong(str61, valueOf2.longValue());
                                } else if (date47.compareTo(date40) == 0) {
                                    editor.putString("iScorechem104", str69);
                                    editor.putLong(str62, valueOf2.longValue());
                                } else if (date47.compareTo(date41) == 0) {
                                    editor.putString("iScorechem105", str69);
                                    editor.putLong(str64, valueOf2.longValue());
                                } else if (date47.compareTo(date42) == 0) {
                                    editor.putString("iScorechem106", str69);
                                    editor.putLong(str66, valueOf2.longValue());
                                } else if (date47.compareTo(date43) == 0) {
                                    editor.putString("iScorechem107", str69);
                                    editor.putLong(str35, valueOf2.longValue());
                                } else if (date47.compareTo(date44) == 0) {
                                    editor.putString("iScorechem108", str69);
                                    editor.putLong(str34, valueOf2.longValue());
                                } else if (date47.compareTo(date45) == 0) {
                                    editor.putString("iScorechem109", str69);
                                    editor.putLong(str68, valueOf2.longValue());
                                } else if (date47.compareTo(date46) == 0) {
                                    editor.putString("iScorechem1010", str69);
                                    editor.putLong("datechem1010", valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        chemistry2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2010.this.scr.setVisibility(8);
                chemistry2010.this.chr.stop();
                chemistry2010.this.toolbar.setVisibility(8);
                chemistry2010.this.Relative.setBackgroundColor(chemistry2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                chemistry2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2010.this.scr.setVisibility(0);
                chemistry2010.this.toolbar.setVisibility(0);
                chemistry2010.this.telegram_layout.setVisibility(8);
                chemistry2010.this.chr.start();
                chemistry2010.this.Relative.setBackgroundColor(chemistry2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chemistry2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chemistry2010.this.mInterstitialAd = null;
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
            finish();
            showAd();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                chemistry2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
