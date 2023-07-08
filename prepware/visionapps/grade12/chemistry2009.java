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

public class chemistry2009 extends AppCompatActivity {
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
    private Boolean f491b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreChemistry2009;
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
    private Toolbar f492tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chemistry2009);
        this.f491b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextChemistry2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_chemistry2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following covalent bonds is the most polar?", 0, 0, 0, 0, 0, "H-F", "H-C", "H-H", "H-N", "Polarity depends on the electronegativity difference between the combining atoms. H-H<H-C<H-N<H-F In polarity. The electronegativity difference between H and F is large. ", "a", 0, 1, this.f491b));
        arrayList.add(new questions("2.", "The force that hold different atoms or ions together are called?", 0, 0, 0, 0, 0, "Electric forces", "Physical bonds ", "Chemical bond", "Atomic forces", "A chemical bond is an attraction force that holds atoms or ions together.", "c", 0, 1, this.f491b));
        arrayList.add(new questions("3.", "How many electrons are shared between two atoms in a double bond?", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "6", "A covalent bond is formed by sharing electrons between the combining atoms. 2 electrons are shared in a single bond. 4 electrons are shared in a double bond 6 electrons are shared in a triple bond.", "c", 0, 1, this.f491b));
        arrayList.add(new questions("4.", "Which of the following is the correct Lewis structure for oxygen atom?", 0, 0, 0, 0, 0, "Three lone- pairs of valence electrons", "One lone-pair of valence electrons and one bonding site.", "Two lone- pairs of valence electrons and one bonding site.", "Two lone- pairs of valence electrons and two bonding sites.", "Oxygen has 6 valence electrons and its Lewis structure contains three lone- pairs of valence electrons ⇒  :O ̈", "a", 0, 1, this.f491b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.c2009q5, C2719R.C2721drawable.c2009q5a, C2719R.C2721drawable.c2009q5b, C2719R.C2721drawable.c2009q5c, C2719R.C2721drawable.c2009q5d, "", "", "", "", "", "a", C2719R.C2721drawable.chem095e, 1, this.f491b));
        arrayList.add(new questions("6.", "Which of following is the most reasonable valence-bond structure of the nirocyl chloride (NOCl)?", 0, C2719R.C2721drawable.c2009q6a, C2719R.C2721drawable.c2009q6b, C2719R.C2721drawable.c2009q6c, C2719R.C2721drawable.c2009q6d, "", "", "", "", "", "b", C2719R.C2721drawable.chem096e, 1, this.f491b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.c2009q7, C2719R.C2721drawable.c2009q7a, C2719R.C2721drawable.c2009q7b, C2719R.C2721drawable.c2009q7c, C2719R.C2721drawable.c2009q7d, "", "", "", "", "", "c", C2719R.C2721drawable.chem097e, 1, this.f491b));
        arrayList.add(new questions("8.", "Which of the following is the correct order for electrons filling in orbitals?", 0, 0, 0, 0, 0, "3s, 3p, 4s, 3d", "2p, 3s, 3p, 3d", "3p, 4s, 3d, 5s", "4s, 3d, 4p, 4d", "", "a", C2719R.C2721drawable.chem098e, 1, this.f491b));
        arrayList.add(new questions("9.", "The normal human eye responds to visible light of wavelength ranging from about 390 to 710 nm. What is the frequency range of the human eye?", 0, C2719R.C2721drawable.c2009q9a, C2719R.C2721drawable.c2009q9b, C2719R.C2721drawable.c2009q9c, C2719R.C2721drawable.c2009q9d, "", "", "", "", "", "a", C2719R.C2721drawable.chem099e, 1, this.f491b));
        arrayList.add(new questions("10.", "How many different types of orbitals are there in the third energy level?", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "6", "7", "The third energy level contains three different types of orbitals, that is 3\" \" s ,3P, and 3\" \" d", "b", 0, 1, this.f491b));
        arrayList.add(new questions("11.", "The Heisenberg uncertainty principle states that", 0, 0, 0, 0, 0, "Two atoms of the same element must have the same number of protons.", "No two electrons in the same atom can have the same set of four quantum numbers.", "It is impossible to determine both position and momentum of an electron simultaneously.", "Electrons of atoms in ground state enter energetically equivalent set of orbitals singly before they pair any orbitals of the set.", "", "c", C2719R.C2721drawable.chem0911e, 1, this.f491b));
        arrayList.add(new questions("12.", "Which of the following transitions will have minimum wavelength?", 0, C2719R.C2721drawable.c2009q12a, C2719R.C2721drawable.c2009q12b, C2719R.C2721drawable.c2009q12c, C2719R.C2721drawable.c2009q12d, "", "", "", "", "", "a", C2719R.C2721drawable.chem0912e, 1, this.f491b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.c2009q13, C2719R.C2721drawable.c2009q13a, C2719R.C2721drawable.c2009q13b, C2719R.C2721drawable.c2009q13c, C2719R.C2721drawable.c2009q13d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0913e, 1, this.f491b));
        arrayList.add(new questions("14.", "", C2719R.C2721drawable.c2009q14, C2719R.C2721drawable.c2009q14a, C2719R.C2721drawable.c2009q14b, C2719R.C2721drawable.c2009q14c, C2719R.C2721drawable.c2009q14d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0914e, 1, this.f491b));
        arrayList.add(new questions("15.", "Which of the following particle was discovered by the cathode rays experiment?", 0, 0, 0, 0, 0, "electron", "Neutron", "Nucleus", "Proton", "The electron was discovered by the cathode ray tube experiment (by J.). Thomson).\n \t-The nucleus was discovered by the alpha scattering experiment (by \nErnest Rutherford)\n \t-The neutron was discovered through bombardment of beryllium\nAtoms by alpha particles (by James Chadwick)\n", "a", 0, 1, this.f491b));
        arrayList.add(new questions("16.", "Which of the following is NOT a laboratory safety rule?", 0, 0, 0, 0, 0, "You should tie back loose hair.", "You should never add acid to water.", "Do not suck solution in the pipette by mouth.", "When lighting a Bunsen burner, you should light the match stick before turning on the gas.", "Always add acid to water not water to acid because it splashes on your body and cloth.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("17.", "Which of the following are the correct steps of the Scientific Method?", 0, 0, 0, 0, 0, "Observation- Hypothesis- Experimentation-Formulation of Laws-Theories.", "Observation- Formulation of Laws- Experimentation-Hypothesis-Theories", "Observation- Experimentation- Hypothesis- Formulation of Laws-Theories", "Observation-Experimentation- formulation of Laws- Hypothesis-Theories", "The steps in a scientific method are\nObservation → Experimentation → Formulation of laws → Hypothesis → Theories.\nNote that observations and experiments are done during the stages of hypothesis and theory.\n", "d", 0, 1, this.f491b));
        arrayList.add(new questions("18.", "Which of the following is the correct relationship between Pico meter (Pm) and nanometer (nm) ?", 0, 0, 0, 0, 0, "1Pm = 10nm", "1pm = 100nm", "1nm = 10pm", "1nm = 1000pm", "", "d", C2719R.C2721drawable.chem0918e, 1, this.f491b));
        arrayList.add(new questions("19.", "How many significant figures has the sum of 2.453, 4.6 and 8.14 ", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "For addition and subtraction, use the least number when reporting the result. 2.453+4.6+8.14=15.193\nThe least number of decimal places is 1 , that is, 4.6. Hence, the sum equals 15.2 which has 3 significant figures.\nFor multiplication and division, use the least number of significant figures when reporting the result.\n", "b", 0, 1, this.f491b));
        arrayList.add(new questions("20.", "Which one of the following measurements has the greatest number of significant figures?", 0, 0, 0, 0, C2719R.C2721drawable.c2009q20d, "0.00046", "0.00460", "460", "", "", "b", C2719R.C2721drawable.chem0920e, 1, this.f491b));
        arrayList.add(new questions("21.", "Which of the following methods is used to convert oils into fats?", 0, 0, 0, 0, 0, "Esterification reaction using strong bases like NaOH or KOH", "Saponification reaction using strong bases like NaOH or KOH", "Hydrolysis reaction in the presence of water and a catalyst", "Hydrogenation reaction at high temperature and in the presence of a catalyst", "Oils are unsaturated, Fats are Saturated oils can be converted into fats by addition of hydrogen (hydrogenation) at high temperature", "d", 0, 1, this.f491b));
        arrayList.add(new questions("22.", "The solubility of compounds containing the carboxylic acid group can be increased by reaction with", 0, 0, 0, 0, 0, "sulfuric acid", "sodium hydroxide", "water", "benzoic acid", "Carboxylic acids react with bases such as NaOH or KOH to form salt and water, and their solubility increases in the meantime.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.c2009q23, C2719R.C2721drawable.c2009q23a, C2719R.C2721drawable.c2009q23b, C2719R.C2721drawable.c2009q23c, C2719R.C2721drawable.c2009q23d, "", "", "", "", "", "a", C2719R.C2721drawable.chem0923e, 1, this.f491b));
        arrayList.add(new questions("24.", "What products will be formed when a carboxylic acid reacts with an alcohol?", 0, 0, 0, 0, 0, "Ketone and water", "Amide and water ", "Acid chloride and water", "Easter and water", "", "d", C2719R.C2721drawable.chem0924e, 1, this.f491b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.c2009q25, C2719R.C2721drawable.c2009q25a, C2719R.C2721drawable.c2009q25b, C2719R.C2721drawable.c2009q25c, C2719R.C2721drawable.c2009q25d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0925e, 1, this.f491b));
        arrayList.add(new questions("26.", "", C2719R.C2721drawable.c2009q26, 0, 0, C2719R.C2721drawable.c2009q26c, C2719R.C2721drawable.c2009q26d, "The value of the equilibrium constant will increase.", "The value of the equilibrium constant will decrease.", "", "", "Since the reaction is exothermic the equilibrium shifts to the left (more CO_2 is formed), Hence the equilibrium constant value decreases since small K_c implies more reactant is formed.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("27.", "For one component system, when would the degree of freedom becomes one?", 0, 0, 0, 0, 0, "When only one phase is present.", "When two phases are present at equilibrium.", "When three phases are present at equilibrium.", "At all times.", "When two phases are present at equilibrium, the degree of freedom is one (only temperature or pressure is required to describe it)\nExample: When water coexists as ice and liquid water\n\tDegree of freedom is zero when all the three states of a substance \n\tAre present at equilibrium called triple point,\n\tThat is, no variable is required to describe the system\n", "b", 0, 1, this.f491b));
        arrayList.add(new questions("28.", "", C2719R.C2721drawable.c2009q28, C2719R.C2721drawable.c2009q28a, C2719R.C2721drawable.c2009q28b, C2719R.C2721drawable.c2009q28c, C2719R.C2721drawable.c2009q28d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0928e, 1, this.f491b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.c2009q29, 0, 0, 0, 0, "Only 1", "Only 2", "1 and 2", "2 and 3", "Since the above reaction is exothermic, decreasing the temperature shifts the equilibrium to the right (more CO is formed). Adding C shifts the equilibrium to the right increasing the pressure shifts the equilibrium to the left (towards smaller number of gaseous molecules).", "c", 0, 1, this.f491b));
        arrayList.add(new questions("30.", "Which one of the following is correct when a reaction reaches equilibrium?", 0, 0, 0, 0, 0, "The reaction rate for the forward direction is decreased to zero.", "The rate of the forward and reverse reaction becomes equal.", "The rate of the reverse reaction is reached a maximum.", "The amounts of reactants and products becomes equal.", "At equilibrium, the rate of the forward and reverse reaction is equal, and the amounts (concentrations) of reactants and products are not equal. Free energy change (ΔG) is zero at equilibrium.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.c2009q31, 0, C2719R.C2721drawable.c2009q31b, C2719R.C2721drawable.c2009q31c, 0, "Rate =K[A][B]", "", "", "Rate =K|A|", "The slowest step is the rate determining step. Hence, the rate law is Rate =K[A][B] ", "a", 0, 1, this.f491b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.c2009q32, C2719R.C2721drawable.c2009q32a, C2719R.C2721drawable.c2009q32b, C2719R.C2721drawable.c2009q32c, C2719R.C2721drawable.c2009q32d, "", "", "", "", "", "c", C2719R.C2721drawable.chem0932e, 1, this.f491b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.c2009q33, C2719R.C2721drawable.c2009q33a, C2719R.C2721drawable.c2009q33b, C2719R.C2721drawable.c2009q33c, C2719R.C2721drawable.c2009q33d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0933e, 1, this.f491b));
        arrayList.add(new questions("34.", "The rate of a reaction increases with increasing the concentration of reactant molecules, because", 0, 0, 0, 0, 0, "The average kinetic energy of the molecules increases.", "The frequency of molecular collisions increases.", "The order of the reaction increases.", "The activation energy increases.", "As the concentration of reactants increases more molecules become in contact ant the frequency of collision increases there by increasing the rate of the reaction.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.c2009q35, C2719R.C2721drawable.c2009q35a, C2719R.C2721drawable.c2009q35b, C2719R.C2721drawable.c2009q35c, C2719R.C2721drawable.c2009q35d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0935e, 1, this.f491b));
        arrayList.add(new questions("36.", "Which of the following refer to a reaction that is NOT dependent on the concentration of a reactant?", 0, 0, 0, 0, 0, "Second order reaction", "First order reaction", "Zero order reaction", "Third order reaction", "", "c", C2719R.C2721drawable.chem0936e, 1, this.f491b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.c2009q37, 0, 0, 0, 0, "109.5 degree", "120 degree", "90 and 120 degree", "90 and 180 degree", " S_6 Constant are the same.", "c", 0, 1, this.f491b));
        arrayList.add(new questions("38.", "", C2719R.C2721drawable.c2009q38, 0, 0, 0, 0, "3.0", "2.5", "2.0", "1.5", "", "d", C2719R.C2721drawable.chem0938e, 1, this.f491b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.c2009q39, C2719R.C2721drawable.c2009q39a, C2719R.C2721drawable.c2009q39b, C2719R.C2721drawable.c2009q39c, C2719R.C2721drawable.c2009q39d, "", "", "", "", "", "c", C2719R.C2721drawable.chem0939e, 1, this.f491b));
        arrayList.add(new questions("40.", "Which of the following molecule is INCORRECTLY matched with the electronic geometry of the central atom?", 0, C2719R.C2721drawable.c2009q40a, C2719R.C2721drawable.c2009q40b, C2719R.C2721drawable.c2009q40c, C2719R.C2721drawable.c2009q40d, "", "", "", "", "", "b", C2719R.C2721drawable.chem0940e, 1, this.f491b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.c2009q41, 0, 0, 0, 0, "1.0", "10", "20", "50", "", "b", C2719R.C2721drawable.chem0941e, 1, this.f491b));
        arrayList.add(new questions("42.", "Which statement about indicators is always correct?", 0, 0, 0, 0, 0, "The mid-point of the PH range of an indicator is 7.0", "The PH range is greater with higher PK2 values.", "The color red indicates an acidic solution.", "The PKa values of the indicator is within its pH range.", "Different indicators have different PH ranges. The way the indicator changes color depends of PH. The PH determines the Pka values of the indicator.", "d", 0, 1, this.f491b));
        arrayList.add(new questions("43.", "To a 50.0 mL of a buffer solution that is 0.25M in HF and 0.10M in NaF, if 5.0 mL of 0.050M NaOH is added, what is the final PH of this buffer solution? Given the pKaHF = 3.17", 0, 0, 0, 0, 0, "2.77", "2.80", "2.74", "3.17", "", "a", C2719R.C2721drawable.chem0943e, 1, this.f491b));
        arrayList.add(new questions("44.", "The suppression of ionization of a weak acid or a weak base by adding one of its own ions is known as:", 0, 0, 0, 0, 0, "buffer effect", "Ionization effect", "common ion effect", "association effect", "The common ion effect is caused by the addition of a compound having an ion common with the dissolved compound and suppresses the ionization of a weak acid or a weak base by shifting the equilibrium.", "c", 0, 1, this.f491b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.c2009q45, C2719R.C2721drawable.c2009q45a, C2719R.C2721drawable.c2009q45b, C2719R.C2721drawable.c2009q45c, C2719R.C2721drawable.c2009q45d, "", "", "", "", "", "c", C2719R.C2721drawable.chem0945e, 1, this.f491b));
        arrayList.add(new questions("46.", "Among the following acids, which has the lowest PKa value?", 0, C2719R.C2721drawable.c2009q46a, C2719R.C2721drawable.c2009q46b, C2719R.C2721drawable.c2009q46c, C2719R.C2721drawable.c2009q46d, "", "", "", "", "", "b", C2719R.C2721drawable.chem0946e, 1, this.f491b));
        arrayList.add(new questions("47.", "Which one of the following is a Lewis acid?", 0, C2719R.C2721drawable.c2009q47a, C2719R.C2721drawable.c2009q47b, C2719R.C2721drawable.c2009q47c, C2719R.C2721drawable.c2009q47d, "", "", "", "", "", "c", C2719R.C2721drawable.chem0947e, 1, this.f491b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.c2009q48, C2719R.C2721drawable.c2009q48a, C2719R.C2721drawable.c2009q48b, C2719R.C2721drawable.c2009q48c, C2719R.C2721drawable.c2009q48d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0948e, 1, this.f491b));
        arrayList.add(new questions("49.", "What will be the ration of the boiling point elevation of a 0.1M solution of sucrose, sodium sulphate and potassium bromide?", 0, 0, 0, 0, 0, "1:3:1", "1:1:2", "1:3:2", "1:2:2", "", "c", C2719R.C2721drawable.chem0949e, 1, this.f491b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.c2009q50, C2719R.C2721drawable.c2009q50a, C2719R.C2721drawable.c2009q50b, C2719R.C2721drawable.c2009q50c, C2719R.C2721drawable.c2009q50d, "", "", "", "", "", "a", C2719R.C2721drawable.chem0950e, 1, this.f491b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.c2009q51, 0, 0, 0, 0, "44.8", "163", "325", "650", "", "c", C2719R.C2721drawable.chem0951e, 1, this.f491b));
        arrayList.add(new questions("52.", "How many grams of methanol would have to be added to water to prepare 150mL of solution which is 2.0M methanol?", 0, 0, 0, C2719R.C2721drawable.c2009q52c, C2719R.C2721drawable.c2009q52d, "2.4", "9.6", "", "", "", "b", C2719R.C2721drawable.chem0952e, 1, this.f491b));
        arrayList.add(new questions("53.", "A certain 500 g toothpaste sample has 0.2g of fluoride. What is the concentration of the fluoride in ppm?", 0, 0, 0, 0, 0, "200", "250", "400", "1,000", "", "c", C2719R.C2721drawable.chem0953e, 1, this.f491b));
        arrayList.add(new questions("54.", "What will be the normality of a 2.3M sulphuric acid solution?", 0, 0, 0, 0, 0, "0.23 N", "0.46 N", "2.3 N", "4.6 N", "", "d", C2719R.C2721drawable.chem0954e, 1, this.f491b));
        arrayList.add(new questions("55.", "The solubility of NaCl in water at 20 degree C is 36 g in 100g of water. A solution that contains 18g of NaCl in 50g of water at 20 degree C is", 0, 0, 0, 0, 0, "Saturated", "Unsaturated", "Supersaturated ", "Dilute", "A saturated solution is a solution in which the dissolved & undissolved solutes are in dynamic equilibrium. The solubility of ionic solids increases as temperature increases & they form supersaturated solution, which contains larger amounts of solutes than in saturated solution.", "a", 0, 1, this.f491b));
        arrayList.add(new questions("56.", "Which of the following will increase the rate at which a solid dissolves in a liquid?", 0, 0, 0, 0, 0, "Supersaturating the solution", "grinding the solid into smaller pieces", "Lowering the temperature of the solvent", "placing the solution in opaque container", "Supersaturating a solution increases the rate at which a solid dissolves in a liquids. This is done by increasing the temperature of the saturated solution.", "a", 0, 1, this.f491b));
        arrayList.add(new questions("57.", "Which of the following pairs of substances are miscible?", 0, 0, 0, 0, 0, "Water and gasoline", "Water and oxygen", "Water and salt", "Water and ethanol", "Two liquids are said to be miscible if they are completely in each other in all proportions. Alcohols such as ethanol are miscible in water because they can form hydrogen bonds with water molecules.", "d", 0, 1, this.f491b));
        arrayList.add(new questions("58.", "Which of the following types of solution are possible?\n \t1. Solid dissolved in a liquid\n \t2. Gas dissolved in a gas\n \t3. Gas dissolved in a liquid\n \t4. Solid dissolved in a solid\n", 0, 0, 0, 0, 0, "1 and 2", "1,2,3 and 4", "1, 2 and 4", "1", "Solid dissolved in a liquid \t\tExample: NaCl solution\n\t      Gas dissolved in gas\t\t\tExample: Air\n\t      Solid dissolved in a liquid\t\tExample: Beer\n\t      Solid dissolved in solid\t\tExample: Bronze\n", "b", 0, 1, this.f491b));
        arrayList.add(new questions("59.", "The chemical makeup of oil is esters of glycerol with three ", 0, 0, 0, 0, 0, "Identical saturated fatty acids.", "Predominantly saturated fatty acids.", "Predominantly unsaturated fatty acids.", "Identical unsaturated fatty acids.", "Oils are derived from unsaturated fatty acids and glycerol and are liquid esters, Triglycerides having three identical acyl chains are called simple triglycerides.", "c", 0, 1, this.f491b));
        arrayList.add(new questions("60.", "Which of the following general class of organic molecules do triglycerides belong to?", 0, 0, 0, 0, 0, "Ketones", "Carboxylic acids", "Esters", "Ethers", "Triglycerides are triesters of glycerol and liquid esters", "c", 0, 1, this.f491b));
        arrayList.add(new questions("61.", "What type of polymerization occurs when amino acids react to form peptides and proteins?", 0, 0, 0, 0, 0, "Addition polymerization", "Condensation polymerization", "Substitution polymerization", "Hydration polymerization", "", "b", C2719R.C2721drawable.chem0961e, 1, this.f491b));
        arrayList.add(new questions("62.", "Which of the following is the most abundant polysaccharide?", 0, 0, 0, 0, 0, "Amylose", "Cellulose", "Starch", "Sucrose", "Cellulose is the most abundant polysaccharide and it is the structural component of the cell walls of plants ", "b", 0, 1, this.f491b));
        arrayList.add(new questions("63.", "What is the other name for poly methyl methacrylate (PMMA)?", 0, 0, 0, 0, 0, "Perspex", "Teflon", "Bakelite", "Nylon- 6", "Poly methyl methacrylate (PMMA) is Perspex and its trade name is Lucite or plexi glass and can be used as a glass substitute.\nThe other name for poly tetra fluro ethylene (PTFE) is Teflon.\n", "a", 0, 1, this.f491b));
        arrayList.add(new questions("64.", "What is the monomer of polyvinyl chloride (PVC)?", 0, 0, 0, 0, 0, "Cloro ethane", "Ethylene dichloride", "Chloroform", "Ethyl chloride", "The monomer for PVC is vinyl chloride or Ethylene dichloride, \nClCH=CHCl,\n", "b", 0, 1, this.f491b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.c2009q65, 0, 0, 0, 0, "High temperature and low pressure", "Low temperature and high pressure", "High temperature and high pressure", "Low temperature and low pressure", "", "b", C2719R.C2721drawable.chem0965e, 1, this.f491b));
        arrayList.add(new questions("66.", "Which of the following reactions is used in the production of industrially important chemical?", 0, C2719R.C2721drawable.c2009q66a, C2719R.C2721drawable.c2009q66b, C2719R.C2721drawable.c2009q66c, C2719R.C2721drawable.c2009q66d, "", "", "", "", "", "a", C2719R.C2721drawable.chem0966e, 1, this.f491b));
        arrayList.add(new questions("67.", "Which one of the following metal is used for galvanization of iron sheets?", 0, 0, 0, 0, 0, "Nickel", "Zinc", "Chromium", "Aluminum", "Zinc is a galvanizing metal because it prevents corrosion.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("68.", "In what way is the phosphorous cycle differs from the carbon and nitrogen cycle?", 0, 0, 0, 0, 0, "Phosphorus is more abundant than carbon and nitrogen", "Phosphorus is less important than carbon and nitrogen", "Phosphorus, once used by an organism does not cycle back to the environment", "The reservoirs for phosphorus exists in mineral form in rocks than in the atmosphere", "The phosphorus cycle differs from the nitrogen and carbon cycles in that phosphorus is not found in the atmosphere in the gaseous state. It is found in water, soil and sediments, and in mineral form in rocks.", "d", 0, 1, this.f491b));
        arrayList.add(new questions("69.", "Which one of the following is needed for photosynthesis?", 0, 0, 0, 0, 0, "Carbon dioxide", "Nitrogen", "Oxygen", "Phosphorus", "", "a", C2719R.C2721drawable.chem0969e, 1, this.f491b));
        arrayList.add(new questions("70.", "", C2719R.C2721drawable.c2009q70, 0, 0, 0, 0, "0.72V", "0.75V", "0.81V", "0.84V", "", "b", C2719R.C2721drawable.chem0970e, 1, this.f491b));
        arrayList.add(new questions("71.", "", C2719R.C2721drawable.c2009q71, C2719R.C2721drawable.c2009q71a, C2719R.C2721drawable.c2009q71b, C2719R.C2721drawable.c2009q71c, C2719R.C2721drawable.c2009q71d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0971e, 1, this.f491b));
        arrayList.add(new questions("72.", "What product(s) are formed during the electrolysis of a concentrated aqueous solution of sodium chloride?", 0, C2719R.C2721drawable.c2009q72a, C2719R.C2721drawable.c2009q72b, C2719R.C2721drawable.c2009q72c, C2719R.C2721drawable.c2009q72d, "", "", "", "", "", "d", C2719R.C2721drawable.chem0972e, 1, this.f491b));
        arrayList.add(new questions("73.", "", C2719R.C2721drawable.c2009q73, 0, 0, 0, 0, "Pb", "PbSO4", "PbO2", "H2SO4", "", "c", C2719R.C2721drawable.chem0973e, 1, this.f491b));
        arrayList.add(new questions("74.", "", C2719R.C2721drawable.c2009q74, C2719R.C2721drawable.c2009q74a, C2719R.C2721drawable.c2009q74b, C2719R.C2721drawable.c2009q74c, C2719R.C2721drawable.c2009q74d, "", "", "", "", "", "a", C2719R.C2721drawable.chem0974e, 1, this.f491b));
        arrayList.add(new questions("75.", "Devices in which oxidation-reduction reaction is induced by an electric current are called", 0, 0, 0, 0, 0, "Galvanic cells", "Electrolytic cells", "Voltaic cells", "Electromotive cells", "Electrolytic cells produce redox reactions by applying electric current and the reactions are non- spontaneous redox reactions.", "b", 0, 1, this.f491b));
        arrayList.add(new questions("76.", "", C2719R.C2721drawable.c2009q76, 0, 0, 0, 0, "An acid", "A base ", "An oxidizing agent", "A reducing agent", "", "d", C2719R.C2721drawable.chem0976e, 1, this.f491b));
        arrayList.add(new questions("77.", "", C2719R.C2721drawable.c2009q77, 0, 0, 0, 0, "ΔH > 0, ΔS < 0", "ΔH > 0, ΔS > 0", "ΔH < 0, ΔS > 0", "ΔH < 0, ΔS < 0", "", "a", C2719R.C2721drawable.chem0977e, 1, this.f491b));
        arrayList.add(new questions("78.", "", C2719R.C2721drawable.c2009q78, 0, 0, 0, 0, "-987 KJ", "-722 KJ", "-150 KJ", "+275 KJ", "", "c", C2719R.C2721drawable.chem0978e, 1, this.f491b));
        arrayList.add(new questions("79.", "At what condition(s) is the equation, ΔH = ΔU+ PΔV, applicable?", 0, 0, 0, 0, 0, "For constant pressure and temperature processes", "Only for constant pressure processes", "Only for constant temperature processes", "Only for constant volume processes", "", "b", C2719R.C2721drawable.chem0979e, 1, this.f491b));
        arrayList.add(new questions("80.", "What is a thermodynamic system that exchanges both energy and matter with the surroundings?", 0, 0, 0, 0, 0, "Adiabatic", "Closed", "Isolated", "Open", "Open system exchanges both mass (matter) and energy with the surroundings.\n \tClosed system exchanges only energy with the surroundings\nIsolated system does not exchange both matter and energy with its \nSurroundings\nAdiabatic process does not exchange heat with the surroundings.\n", "d", 0, 1, this.f491b));
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
        this.f492tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(150), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    chemistry2009.this.timer.setVisibility(0);
                    chemistry2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    chemistry2009.this.scr.setVisibility(8);
                    chemistry2009.this.chr.stop();
                    chemistry2009.this.toolbar.setVisibility(8);
                    chemistry2009.this.Relative.setBackgroundColor(-7829368);
                    chemistry2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2009.this.getBaseContext());
                    int unused = chemistry2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = chemistry2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = chemistry2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = chemistry2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = chemistry2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = chemistry2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = chemistry2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = chemistry2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = chemistry2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = chemistry2009.this.highscoreChemistry2009 = defaultSharedPreferences.getInt("chemistry2009hs", 0);
                    int access$600 = chemistry2009.this.part1 + chemistry2009.this.part2 + chemistry2009.this.part3 + chemistry2009.this.part4 + chemistry2009.this.part5 + chemistry2009.this.part6 + chemistry2009.this.part7 + chemistry2009.this.part8 + chemistry2009.this.part9;
                    TextView access$1600 = chemistry2009.this.resultText;
                    access$1600.setText(access$600 + "/80");
                    chemistry2009.this.progressbar.setProgress(access$600);
                    chemistry2009.this.progressbar.setMax(80);
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
                    int unused11 = chemistry2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = chemistry2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = chemistry2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = chemistry2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = chemistry2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = chemistry2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = chemistry2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = chemistry2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "chemistry2009hs";
                    int unused19 = chemistry2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = chemistry2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = chemistry2009.this.answered1 + chemistry2009.this.answered2 + chemistry2009.this.answered3 + chemistry2009.this.answered4 + chemistry2009.this.answered5 + chemistry2009.this.answered6 + chemistry2009.this.answered7 + chemistry2009.this.answered8 + chemistry2009.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > chemistry2009.this.highscoreChemistry2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - ((SystemClock.elapsedRealtime() - chemistry2009.this.chr.getBase()) / 1000)) * 3600) / 9000))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1chem091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1chem092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1chem093", 0);
                    long j4 = defaultSharedPreferences.getLong("date1chem094", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1chem095", 0);
                    long j6 = defaultSharedPreferences.getLong("date1chem096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1chem097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1chem098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1chem099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1chem0910", 0);
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
                        editor.putString("scorechem091", str2);
                        editor.putLong("date1chem091", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorechem092", str3);
                            editor.putLong("date1chem092", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorechem093", str3);
                            editor.putLong("date1chem093", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorechem094", str3);
                            editor.putLong("date1chem094", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorechem095", str3);
                            editor.putLong("date1chem095", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorechem096", str3);
                            editor.putLong("date1chem096", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorechem097", str3);
                            editor.putLong("date1chem097", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorechem098", str3);
                            editor.putLong("date1chem098", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorechem099", str3);
                            editor.putLong("date1chem099", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorechem0910", str3);
                            editor.putLong("date1chem0910", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datechem091", 0);
                    long j12 = defaultSharedPreferences.getLong("datechem092", 0);
                    long j13 = defaultSharedPreferences.getLong("datechem093", 0);
                    long j14 = defaultSharedPreferences.getLong("datechem094", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datechem095", 0);
                    long j16 = defaultSharedPreferences.getLong("datechem096", 0);
                    long j17 = defaultSharedPreferences.getLong("datechem097", 0);
                    long j18 = defaultSharedPreferences.getLong("datechem098", 0);
                    long j19 = defaultSharedPreferences.getLong("datechem099", 0);
                    long j20 = defaultSharedPreferences.getLong("datechem0910", 0);
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
                        editor2.putString("iScorechem091", f);
                        editor2.putLong("datechem091", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorechem092", f);
                            editor2.putLong("datechem092", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorechem093", f);
                            editor2.putLong("datechem093", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorechem094", f);
                            editor2.putLong("datechem094", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorechem095", f);
                            editor2.putLong("datechem095", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorechem096", f);
                            editor2.putLong("datechem096", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorechem097", f);
                            editor2.putLong("datechem097", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorechem098", f);
                            editor2.putLong("datechem098", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorechem099", f);
                            editor2.putLong("datechem099", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorechem0910", f);
                            editor2.putLong("datechem0910", valueOf.longValue());
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
                        chemistry2009.this.scr.setVisibility(8);
                        chemistry2009.this.chr.stop();
                        chemistry2009.this.toolbar.setVisibility(8);
                        chemistry2009.this.Relative.setBackgroundColor(-7829368);
                        chemistry2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2009.this.getBaseContext());
                        int unused = chemistry2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = chemistry2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = chemistry2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = chemistry2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = chemistry2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = chemistry2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = chemistry2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = chemistry2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = chemistry2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = chemistry2009.this.highscoreChemistry2009 = defaultSharedPreferences.getInt("chemistry2009hs", 0);
                        int access$600 = chemistry2009.this.part1 + chemistry2009.this.part2 + chemistry2009.this.part3 + chemistry2009.this.part4 + chemistry2009.this.part5 + chemistry2009.this.part6 + chemistry2009.this.part7 + chemistry2009.this.part8 + chemistry2009.this.part9;
                        TextView access$1600 = chemistry2009.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        chemistry2009.this.progressbar.setProgress(access$600);
                        chemistry2009.this.progressbar.setMax(80);
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
                        int unused11 = chemistry2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = chemistry2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = chemistry2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = chemistry2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = chemistry2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = chemistry2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = chemistry2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = chemistry2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = chemistry2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = chemistry2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = chemistry2009.this.answered1 + chemistry2009.this.answered2 + chemistry2009.this.answered3 + chemistry2009.this.answered4 + chemistry2009.this.answered5 + chemistry2009.this.answered6 + chemistry2009.this.answered7 + chemistry2009.this.answered8 + chemistry2009.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > chemistry2009.this.highscoreChemistry2009) {
                            edit.putInt("chemistry2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - chemistry2009.this.chr.getBase()) / 1000;
                        String str = "datechem0910";
                        String str2 = "datechem099";
                        String str3 = "datechem098";
                        String str4 = "datechem097";
                        String str5 = "datechem096";
                        String str6 = "datechem095";
                        String str7 = "datechem094";
                        String str8 = "datechem093";
                        String str9 = "datechem092";
                        String str10 = "datechem091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1chem0910";
                        String str12 = "date1chem099";
                        if (chemistry2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - elapsedRealtime) * 3600) / 9000))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1chem091", 0);
                            String str13 = "date1chem091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1chem092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1chem093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1chem094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1chem095", 0);
                            String str16 = "date1chem095";
                            String str17 = "date1chem094";
                            String str18 = "date1chem096";
                            long j6 = defaultSharedPreferences.getLong("date1chem096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1chem097", 0);
                            String str19 = str12;
                            String str20 = "date1chem098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1chem097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1chem093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1chem098", 0));
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
                                editor3.putString("scorechem091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorechem092", str25);
                                    editor3.putLong("date1chem092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorechem093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorechem094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorechem095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorechem096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorechem097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorechem098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorechem099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorechem0910", str25);
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
                                editor4.putString("iScorechem091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorechem092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorechem093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorechem094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorechem095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorechem096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorechem097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorechem098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorechem099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorechem0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1chem091";
                            String str30 = "date1chem094";
                            String str31 = str12;
                            String str32 = "date1chem093";
                            String str33 = "date1chem097";
                            String str34 = "date1chem096";
                            String str35 = str11;
                            String str36 = "date1chem095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 80;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 9000))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1chem092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1chem092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1chem098";
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
                                editor2.putString("scorechem091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorechem092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorechem093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorechem094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorechem095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorechem096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorechem097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorechem098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorechem099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorechem0910", str49);
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
                                editor.putString("iScorechem091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorechem092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorechem093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorechem094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorechem095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorechem096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorechem097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorechem098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorechem099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorechem0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        chemistry2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2009.this.scr.setVisibility(8);
                chemistry2009.this.chr.stop();
                chemistry2009.this.toolbar.setVisibility(8);
                chemistry2009.this.Relative.setBackgroundColor(chemistry2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                chemistry2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2009.this.scr.setVisibility(0);
                chemistry2009.this.toolbar.setVisibility(0);
                chemistry2009.this.telegram_layout.setVisibility(8);
                chemistry2009.this.chr.start();
                chemistry2009.this.Relative.setBackgroundColor(chemistry2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chemistry2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chemistry2009.this.mInterstitialAd = null;
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
                chemistry2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
