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

public class chemistry2013 extends AppCompatActivity {
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
    private Boolean f499b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreChemistry2013;
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
    private Toolbar f500tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chemistry2013);
        this.f499b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextChemistry2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_chemistry2013);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The branch of chemistry that is involved in separation, identifying and determining the relative amounts of components in a sample of Material is known as \n", 0, 0, 0, 0, 0, "Biochemistry ", "Analytical chemistry ", "Physical chemistry ", "Inorganic chemistry ", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("2.", "Significant figures are figures with ", 0, 0, 0, 0, 0, "measured values with the highest precision ", "measured values with the highest accuracy", "measured values with the highest uncertainty ", "exactly known digits with the last digit uncertain ", "Significant figures are exactly known digits with the last digit uncertain. The more the number of significant figures, the higher is the precision of measurement ", "d", 0, 1, this.f499b));
        arrayList.add(new questions("3.", "For the determination of the density of a new ceramic, a student measured the mass of a piece on an analytical and obtained 3.8056 gram and its volume 2.5 mL by displacement of water in a graduated cylinder. The correct reported density of the ceramic should be\n", 0, 0, 0, 0, 0, "1.5222 g/mL ", "1.5224 g/mL ", "1.5 g/mL ", "3.5 g/mL ", "", "c", C2719R.C2721drawable.chem1303e, 1, this.f499b));
        arrayList.add(new questions("4.", "The scientific method is ", 0, 0, 0, 0, 0, "a collection of scientific guesses and hypotheses by seeking patterns in he observation. ", "a method of arriving at an organized body of knowledge based on reproducible experiments and observation ", "the sum total of unique guidelines for the practice of science in The world ", "the result of fortunate, accidental discovery in the development of science ", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("5.", "0ne of the following is NOT a cause of uncertainty in measurement? \n", 0, 0, 0, 0, 0, "The type of material measured ", "The person doing the experiment ", "The measuring device ", "The environment where the measurement is made ", "There are four causes for uncertainty in measurement \n\nThe person doing the experiment \nThe item to be measured \nThe environment when the measure is made \nThe instrument used to measure the material ", "a", 0, 1, this.f499b));
        arrayList.add(new questions("6.", "Which of the following is true about isotopes? Isotopes of an element have\n", 0, 0, 0, 0, 0, "the same number of electrons and neutrons ", "different number of neutrons and the same number protons ", "different physical and chemical properties ", "the same atomic mass but different atomic numbers ", "Isotopes are atoms of the same element with same proton, electron and atomic number but different neutron and mass number ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.chem1307q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("8.", "", C2719R.C2721drawable.chem1308q, 0, 0, 0, 0, "108.9 amu ", "107.94 amu ", "107.4 amu ", "107.86 amu ", "", "d", C2719R.C2721drawable.chem1308e, 1, this.f499b));
        arrayList.add(new questions("9.", "Which statement correctly describes Heisenberg's uncertainty principle? ", 0, 0, 0, 0, 0, "If we measure the momentum of a particle precisely then its Position will be correspondingly precise ", "A particle with a mass moving at a given speed can be described by the wave characteristics of material particles ", "A small particle like the electron can behave both as a particle and a wave ", "Both the location and the momentum of a subatomic particle like The electron cannot be precisely known", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("10.", "Which of the following statement is correct about energy changes When an electron changes its energy level? ", 0, 0, 0, 0, 0, "When an electron jumps from a lower energy level to a higher Level, the photon emitted is equal to the difference between the two Energy levels ", "When an electron falls from a higher energy level to a lower energy Level, the energy is equal to the difference between the two energy Levels is observed", "When an electron jumps from a lower energy to a higher energy Level, the energy is equal to the difference between the two energy Levels is absorbed", "When an electron falls from a higher energy level to a lower Energy level, the energy is higher than the difference between the Atwo energy levels is emitted ", "", "c", C2719R.C2721drawable.chem1310e, 1, this.f499b));
        arrayList.add(new questions("11.", "The sanitizer in wide use for protection against Covid-19 is labeled 83% alcohol. How can one scientifically check the concentration? This can be done by ", 0, 0, 0, 0, 0, "forming a hypothesis ", "experimentation ", "collection of data ", "making observation ", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("12.", "The correct electronic configuration for chromium (Cr, Z = 24) is ", 0, C2719R.C2721drawable.chem1312a, C2719R.C2721drawable.chem1312b, C2719R.C2721drawable.chem1312c, C2719R.C2721drawable.chem1312d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1312e, 1, this.f499b));
        arrayList.add(new questions("13.", "According to Hund's rule equal energy (degenerate) orbitals are filled with ", 0, 0, 0, 0, 0, "two electrons of opposite spins placed in the first orbitals ", "maximum number of unpaired electrons with parallel spins ", "two electrons of parallel spins placed in the first orbital ", "maximum number of unpaired electrons with opposite spins ", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("14.", "In the modern periodic table ", 0, 0, 0, 0, 0, "non-metals are placed on the right hand side of the periodic table ", "elements with similar properties are placed in the same period ", "metals are placed on the right hand side of the periodic table ", "transition and inner transition elements are placed in the middle of the periodic table ", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.chem1315q, C2719R.C2721drawable.chem1315a, C2719R.C2721drawable.chem1315b, C2719R.C2721drawable.chem1351c, C2719R.C2721drawable.chem1315d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1315e, 1, this.f499b));
        arrayList.add(new questions("16.", "Covalent compounds are liquids or gases at room temperature and have low melting and boiling points. Which of the following statements explains these properties of covalent compounds?", 0, 0, 0, 0, 0, "The intermolecular forces of attraction in covalent compounds are strong ", "The unit of particles in covalent compounds are ions ", "There are no forces of attraction between the molecules in covalent compounds ", "Covalent compounds exist as separate molecules ", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.chem1317q, C2719R.C2721drawable.chem1317a, C2719R.C2721drawable.chem1317b, C2719R.C2721drawable.chem1317c, C2719R.C2721drawable.chem1317d, "", "", "", "", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("18.", "", C2719R.C2721drawable.chem1318q, C2719R.C2721drawable.chem1318a, C2719R.C2721drawable.chem1318b, C2719R.C2721drawable.chem1318c, C2719R.C2721drawable.chem1318d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1318e, 1, this.f499b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.chem1319q, C2719R.C2721drawable.chem1319a, C2719R.C2721drawable.chem1319b, C2719R.C2721drawable.chem1319c, C2719R.C2721drawable.chem1319d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1319e, 1, this.f499b));
        arrayList.add(new questions("20.", "0ne of the following reactions illustrates the formation of coordinate Covalent bond? ", 0, C2719R.C2721drawable.chem1320a, C2719R.C2721drawable.chem1320b, C2719R.C2721drawable.chem1320c, C2719R.C2721drawable.chem1320d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1320e, 1, this.f499b));
        arrayList.add(new questions("21.", "Hydrogen bonding occurs in compounds that contain H-N, H-O and H-F bonds. These bonds are stronger than the ordinary dipole-dipole Interaction because ", 0, 0, 0, 0, 0, "The partially positive H of one molecule is attracted to the partially negative lone pairs on the N, O or F another molecule", "The H-N, H-O and H-F bonds are less polar than ordinary covalent bonds ", "The small sizes of N, O and F makes these atoms so electropositive that their covalently bonded H is highly negative ", "The H-N, H-O and H-F bonds are non-polar and thus do not interact with neighboring molecules", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("22.", "Which of the following is an example of exception to the octet rule? ", 0, C2719R.C2721drawable.chem1322a, C2719R.C2721drawable.chem1322b, C2719R.C2721drawable.chem1322c, C2719R.C2721drawable.chem1322d, "", "", "", "", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.chem1323q, 0, 0, 0, 0, "I and III ", "II and III ", "I and II", "I and IV ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.chem1324q, 0, 0, 0, C2719R.C2721drawable.chem1324d, "the small size of O compared to the other group VIA elements ", "the basic different structures of each hydride ", "increasing boiling points with increasing molecular mass ", "", "", "d", C2719R.C2721drawable.chem1324e, 1, this.f499b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.chem1325q, 0, 0, 0, 0, "I and II ", "II", "II and III", "IV", "Homogeneous catalysis - catalyst has similar state as reactants and products \n\nHeterogeneous catalysis - catalyst has different state as reactants and products ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("26.", "Which statement is true about catalyst?", 0, 0, 0, 0, 0, "A catalyst slows down or speeds up a reaction, itself being consumed ", "A positive catalyst decreases the rate of a reaction by increasing the activation energy ", "A negative catalyst increases the rate of a reaction by decreasing the value of activation energy ", "The role of a catalyst is to increase or decrease the rate of a reaction by lowering or increasing the activation energy ", "Positive catalysts — increase the rate of a reaction by lowering Activation energy \n\nNegative catalysts - Decrease the rate of a reaction by increasing Activation energy ", "d", 0, 1, this.f499b));
        arrayList.add(new questions("27.", "According to the transition state theory ", 0, 0, 0, 0, C2719R.C2721drawable.chem1327d, "the collision between two reacting species results in the formation of an activated complex, which has less energy than both reactants and products ", "in the activated complex, the original bonds are weakened and the New bonds are partially formed ", "the activation energy is the energy that must be absorbed or released by reactants to reach the activated complex ", "", "According to the transition state theory the collision between two reacting species results in the formation of an activated complex, which has higher energy than both reactants and products in the activated complex the original bonds are weakened and the new bonds are partially formed ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("28.", "Which of the following is true about the rate constant?", 0, 0, 0, 0, 0, "It expresses the relationship between the rate of a chemical reaction and the volume of reacting species ", "The volume of a rate constant tells us how fast or slow a reaction is", "The value of a rate constant is independent of reaction conditions ", "A small rate constant indicates a faster reaction and a larger rate constant indicates a slower reaction ", "A rate constant is affected by temperature but independent of reaction conditions ", "c", 0, 1, this.f499b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.chem1329q, 0, 0, 0, 0, "1 hr ", "4 hr ", "5 hr ", "3 hr ", "", "c", C2719R.C2721drawable.chem1329e, 1, this.f499b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.chem1330q, 0, 0, 0, 0, "Reactions with larger activation energies have higher values of k And are therefore faster ", "For a given value Of activation energy of the rate constant increases as the temperature increases ", "Reactions with larger activation energies, the value of the rate constant decreases as the temperature increases ", "For a given value of activation energy, the value of the rate constant decreases as the temperature increases", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.chem1331q, C2719R.C2721drawable.chem1331a, C2719R.C2721drawable.chem1331b, C2719R.C2721drawable.chem1331c, C2719R.C2721drawable.chem1331d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1331e, 1, this.f499b));
        arrayList.add(new questions("32.", "The statement \"If a system at equilibrium is subjected to a stress, the system will readjust itself to reduce the effects of the stress is known as", 0, 0, 0, 0, 0, "Faradays law ", "Avogadro's principle ", "Boyle's law ", "Le-Chaterlier's principle ", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("33.", "The law of mass action states that:", 0, C2719R.C2721drawable.chem1333a, C2719R.C2721drawable.chem1333b, C2719R.C2721drawable.chem1333c, C2719R.C2721drawable.chem1333d, "", "", "", "", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.chem1334q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "a", C2719R.C2721drawable.chem1334e, 1, this.f499b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.chem1335q, C2719R.C2721drawable.chem1335a, C2719R.C2721drawable.chem1335b, C2719R.C2721drawable.chem1335c, C2719R.C2721drawable.chem1335d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1335e, 1, this.f499b));
        arrayList.add(new questions("36.", "", C2719R.C2721drawable.chem1336q, 0, 0, 0, 0, "Low pressure and low temperature ", "High pressure and low temperature ", "High pressure and high temperature ", "Low pressure and high temperature ", "Formation of ammonia is favored by lowering temperature and increasing pressure ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("37.", "Which one of the following statements describes laboratory and Industrial preparation of acetic acid respectively? ", 0, C2719R.C2721drawable.chem1337a, C2719R.C2721drawable.chem1337b, C2719R.C2721drawable.chem1337c, C2719R.C2721drawable.chem1337d, "", "", "", "", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("38.", "Which of the following is true about carboxylic acids? ", 0, 0, 0, 0, 0, "Carboxylic acid with the formula RCOOH ", "Methanoic, Ethanoic and Citric acids are monocarboxylic acids ", "Propanedioic acid is the simplest dicarboxylic acid ", "Citric acid is typical dicarboxylic acid ", "Carboxylic acid: RCOOH \nMethanoic and ethanoic acids: are monocarboxylic acids \nCritic acid is tricarboxylic acid \nEthanedioic acid is the simplest dicarboxylic acid ", "a", 0, 1, this.f499b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.chem1339q, 0, 0, 0, 0, "1 ,2-dimethyl-4-chloro 1 - pentanoic acid ", "4 - choro -2, methyl 1- pentanoic acid ", "4-chloro-2, 3-dimethyl 1- pentanoic acid ", "4-chloro-l-methyl 1- pentanoic acid ", "", "c", C2719R.C2721drawable.chem1339e, 1, this.f499b));
        arrayList.add(new questions("40.", "Esters are characterized by the following properties EXCEPT ", 0, 0, 0, 0, 0, "esters have pleasant odors of perfumes and food flavoring", "esters have lower boiling point compared to the carboxylic acid and alcohols", "all esters are soluble in inorganic solvents and organic", "esters have higher boiling point than carboxylic acid and alcohols ", "Esters: \n- Have pleasant smell \n- Have lower boiling point compound to carboxylic acid and alcohol \n-Are soluble in organic solvents ", "d", 0, 1, this.f499b));
        arrayList.add(new questions("41.", "Oils are unsaturated fatty acids. The process Of converting Oils to solid Fats involves? ", 0, 0, 0, 0, 0, "Esterification of the acids ", "Saponification with NaOH ", "Hydrogenation of C-C double bonds ", "Halogenations of the C-C double bonds ", "Oils are unsaturated fatty acids and converted to solid fats by hydrogenation of the carbon double bonds ", "c", 0, 1, this.f499b));
        arrayList.add(new questions("42.", "A chemistry teacher has added different reactants and reagents in three different test tubes as described below \nI. Into the test tube A he added ethanol, sodium dichromate, sulphuric Acid \nII. Into the test tube B he added acetaldehyde, sodium borohydride and water. \nIII. Into the tube C he added methyl acetate and ethanol and sodium Hydroxide \nIn which test tube would a reaction take place that provides acetic acid?", 0, 0, 0, 0, 0, "III ", "I and II ", "II and III", "I", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("43.", "The difference between colloids and suspension is that ", 0, 0, 0, 0, 0, "colloidal particles are small enough and do not settle down unlike in a suspension ", "most colloids and suspensions appear cloudy ", "both colloids and suspensions are heterogeneous mixtures ", "colloids are as transparent as solution ", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("44.", "The solubility of a substance is the amount of a substance that", 0, 0, 0, 0, 0, "gives an unsaturated solution of the substance at given temperature ", "dissolves more amount of solute than it can normally dissolve ", "gives a saturated solution of the substance at a given temperature ", "dissolves double the amount of solute than it can normally dissolve ", "Solubility is the maximum amount of material that will dissolve in given amount of solvent at a given temperature to produce a stable solution called saturated solution ", "c", 0, 1, this.f499b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.chem1345q, 0, 0, 0, 0, "37.4g/100g of water ", "113.7g/100g of water ", "18.7g/100 g of water ", "187 g/100 g of water ", "", "a", C2719R.C2721drawable.chem1345e, 1, this.f499b));
        arrayList.add(new questions("46.", "The \"like dissolves like\" rule accounts for one of the following observations", 0, C2719R.C2721drawable.chem1346a, C2719R.C2721drawable.chem1346b, C2719R.C2721drawable.chem1346c, C2719R.C2721drawable.chem1346d, "", "", "", "", "\"Like dissolves like\" means polar dissolves polar and non-polar Dissolves non-polar ", "a", 0, 1, this.f499b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.chem1347q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "d", C2719R.C2721drawable.chem1347e, 1, this.f499b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.chem1348q, 0, 0, 0, 0, "Molarity = 18.3 M, Normality = 36.6 N, Mole fraction = 9 ", "Molarity = 36.6 M, Normality = 18 3 N, Mole fraction = 0.1 ", "Molarity = 18.3 M, Normality = 3 66 N, Mole fraction = 0.9 ", "Molarity = 1.83 M, Normality = 3 66 N, Mole fraction = 0.9 ", "", "a", C2719R.C2721drawable.chem1348e, 1, this.f499b));
        arrayList.add(new questions("49.", "", C2719R.C2721drawable.chem1349q, 0, 0, 0, 0, "By dissolving 37 g Of Ca(OH), in 1 liter of solution ", "By dissolving 74 g Of Ca(OH), in 500. mL of solution ", "By dissolving 74 g of Ca(OH), in 1 liter of solution ", "By dissolving 37 g of Ca(OH), in 500. mL of solution", "", "a", C2719R.C2721drawable.chem1349e, 1, this.f499b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.chem1350q, 0, 0, 0, 0, "3.6", "1.42", "1.34", "4.2", "", "d", C2719R.C2721drawable.chem1350e, 1, this.f499b));
        arrayList.add(new questions("51.", "According to the Lewis definition of an acid, an acid is a substance that ", 0, C2719R.C2721drawable.chem1351a, C2719R.C2721drawable.chem1351b, C2719R.C2721drawable.chem1351c, C2719R.C2721drawable.chem1351d, "", "", "", "", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("52.", "Water is a weak electrolyte, because ", 0, 0, 0, 0, 0, "it acts as an acid", "it can accept a proton from an acid and donate a proton to a base ", "it undergoes a reversible dissociation with a very low ionic product, Kw ", "it acts both as Bronsted- Lowry acid and base ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("53.", "Which of the following reactions represent the amphiprotic behavior of water ", 0, C2719R.C2721drawable.chem1353a, C2719R.C2721drawable.chem1353b, C2719R.C2721drawable.chem1353c, C2719R.C2721drawable.chem1353d, "", "", "", "", "Amphiprotic species donate and accept a proton ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("54.", "For an acidic solution, which of the following is correct? ", 0, C2719R.C2721drawable.chem1354a, C2719R.C2721drawable.chem1354b, C2719R.C2721drawable.chem1354c, C2719R.C2721drawable.chem1354d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1354e, 1, this.f499b));
        arrayList.add(new questions("55.", "", C2719R.C2721drawable.chem1355q, 0, 0, 0, 0, "12.1 ", "1.89 ", "12.3 ", "1.741 ", "", "b", C2719R.C2721drawable.chem1355e, 1, this.f499b));
        arrayList.add(new questions("56.", "One of the following given pairs represents examples of buffer systems ", 0, C2719R.C2721drawable.chem1356a, C2719R.C2721drawable.chem1356b, C2719R.C2721drawable.chem1356c, C2719R.C2721drawable.chem1356d, "", "", "", "", "Buffer solution is formed from weak acid and its conjugate Base or weak base and its conjugate acid ", "c", 0, 1, this.f499b));
        arrayList.add(new questions("57.", "", C2719R.C2721drawable.chem1357q, C2719R.C2721drawable.chem1357a, C2719R.C2721drawable.chem1357b, C2719R.C2721drawable.chem1357c, C2719R.C2721drawable.chem1357d, "", "", "", "", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("58.", "An acid is a substance that", 0, 0, 0, 0, 0, "has a bitter taste ", "produces more OH- ions in water than H+ ions ", "donates a proton in a chemical reaction ", "donates a pair of electrons to a chemical species ", "", "c", C2719R.C2721drawable.chem1358e, 1, this.f499b));
        arrayList.add(new questions("59.", "One of the following given masses of acids constitutions the corresponding equivalent of the acid ", 0, C2719R.C2721drawable.chem1359a, C2719R.C2721drawable.chem1359b, C2719R.C2721drawable.chem1359c, C2719R.C2721drawable.chem1359d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1359e, 1, this.f499b));
        arrayList.add(new questions("60.", "One of the following pairs shows Bronsted- Lowry acids behavior in Water? ", 0, C2719R.C2721drawable.chem1360a, C2719R.C2721drawable.chem1360b, C2719R.C2721drawable.chem1360c, C2719R.C2721drawable.chem1360d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1360e, 1, this.f499b));
        arrayList.add(new questions("61.", "", C2719R.C2721drawable.chem1361q, C2719R.C2721drawable.chem1361a, C2719R.C2721drawable.chem1361b, C2719R.C2721drawable.chem1361c, C2719R.C2721drawable.chem1361d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1361e, 1, this.f499b));
        arrayList.add(new questions("62.", "", C2719R.C2721drawable.chem1362q, 0, 0, 0, 0, "Water is dissociate to a higher extent at 40 degree Celsius than at 25 degree Celsius ", "At 40 degree Celsius pure water is no more neutral ", "Hydrogen ion concentration at 25 degree Celsius is higher than at 40 degree Celsius ", "Hydroxyl ion concentration is higher at 40 degree Celsius than hydrogen ion concentration ", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("63.", "What is reduction? Reduction is ", 0, 0, 0, 0, 0, "gain of electrons and increase in oxidation number ", "loss of electrons and decrease in oxidation number", "gain of electrons and decease in oxidation number ", "gain of electrons and no change in oxidation number ", "Reduction is gain of electrons and decrease in oxidation number ", "c", 0, 1, this.f499b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.chem1364q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "a", C2719R.C2721drawable.chem1364e, 1, this.f499b));
        arrayList.add(new questions("65.", "Which one of the following is NOT correct about electrodes and electrochemical cells?", 0, 0, 0, 0, 0, "Electrons flow spontaneously from negative to positive electrode ", "The overall cell potential is calculated by the formula EO cell = Ecathode - Eanode ", "EO is greater than zero for non-spontaneous process ", "The difference in the electrical potential of the electrode is positive, that is positive cell ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("66.", "The mathematical expressions for Faraday's first law is summarized as", 0, 0, 0, 0, 0, "n = mIT/MF ", "m = MIt/nf ", "M = mIT/nF ", "m = It/F", "", "b", 0, 1, this.f499b));
        arrayList.add(new questions("67.", "", C2719R.C2721drawable.chem1367q, 0, 0, 0, 0, "At the anode the copper electrode dissolves and copper metal is deposited at the cathode ", "At the anode H2 is liberated, whereas copper is deposited at the Cathode ", "At the anode copper is reduced, where copper is oxidized at the cathode ", "No electrochemical reaction takes place involving copper ", "", "a", C2719R.C2721drawable.chem1367e, 1, this.f499b));
        arrayList.add(new questions("68.", "The statement 'the amount of a substance consumed or produced in An electrolytic cell is directly proportional to the amount of electricity that passes through the cell' is known as ", 0, 0, 0, 0, 0, "Dalton's law ", "Raoult's law", "Faraday's law ", "Henry's law ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("69.", "", C2719R.C2721drawable.chem1369q, C2719R.C2721drawable.chem1369a, C2719R.C2721drawable.chem1369b, C2719R.C2721drawable.chem1369c, C2719R.C2721drawable.chem1369d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1369e, 1, this.f499b));
        arrayList.add(new questions("70.", "0ne of the following is NOT true about the effects of corrosion?", 0, 0, 0, 0, 0, "It causes deterioration of metals by spontaneous chemical process", "It causes enormous damage to buildings, bridges, ships and cars ", "Damage from corrosion costs billions of dollars annually ", "Corrosion forms protection oxide layers to prevent damage ", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("71.", "", C2719R.C2721drawable.chem1371q, C2719R.C2721drawable.chem1371a, C2719R.C2721drawable.chem1371b, C2719R.C2721drawable.chem1371c, C2719R.C2721drawable.chem1371d, "", "", "", "", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("72.", "The conversion of nitrogen gas into useful nitrogen compounds is known as ", 0, 0, 0, 0, 0, "Respiration ", "Photosynthesis ", "Fixation ", "Oxidation ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("73.", "CO2 is released into the atmosphere by one of the following processes ", 0, 0, 0, 0, 0, "Plants consume atmospheric carbon dioxide during photosynthesis ", "Animals eat pants and release CO2 by photosynthesis", "Natural fires and volcanoes release CO2 into the air ", "Utilization of electrical energy as energy sources", "", "c", C2719R.C2721drawable.chem1373e, 1, this.f499b));
        arrayList.add(new questions("74.", "0ne of the following is NOT a common application of silicon ", 0, 0, 0, 0, 0, "in the construction of transistors and microprocessors ", "in the control of the frequency of television transmissions ", "in the production of polish body parts cars ", "in coating iron to prevent in from rusting ", "", "d", 0, 1, this.f499b));
        arrayList.add(new questions("75.", "0ne of the following is NOT among the chemical properties of silicon ", 0, C2719R.C2721drawable.chem1375a, C2719R.C2721drawable.chem1375b, C2719R.C2721drawable.chem1375c, C2719R.C2721drawable.chem1375d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1375e, 1, this.f499b));
        arrayList.add(new questions("76.", "Which one of the following is a common reaction of tin?", 0, C2719R.C2721drawable.chem1376a, C2719R.C2721drawable.chem1376b, C2719R.C2721drawable.chem1376c, C2719R.C2721drawable.chem1376d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1376e, 1, this.f499b));
        arrayList.add(new questions("77.", "", C2719R.C2721drawable.chem1377q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "The monomer of natural rubber is 2 - methyl - 1 ,3 - butadiene or isoprene ", "b", 0, 1, this.f499b));
        arrayList.add(new questions("78.", "", C2719R.C2721drawable.chem1378q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "a", 0, 1, this.f499b));
        arrayList.add(new questions("79.", "One of the following examples of polymers is correctly matched with its uses:", 0, 0, 0, 0, 0, "Polyethylene; food containers ", "Polypropylene; electrical insulation ", "Polyvinyl chloride; making pipes ", "Polytetrafluoroethylene; making shoes ", "", "c", 0, 1, this.f499b));
        arrayList.add(new questions("80.", "Natural polymers are ", 0, 0, 0, 0, 0, "Polymers produced by the addition reaction of monomer units ", "Polymers produced by condensation reaction of monomer units ", "Polymers found in some substances like rubber in nature", "Polymers produced by the substitution of one or more atoms in the monomer units ", "", "c", 0, 1, this.f499b));
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
        this.f500tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(150), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    chemistry2013.this.timer.setVisibility(0);
                    chemistry2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    chemistry2013.this.scr.setVisibility(8);
                    chemistry2013.this.chr.stop();
                    chemistry2013.this.toolbar.setVisibility(8);
                    chemistry2013.this.Relative.setBackgroundColor(-7829368);
                    chemistry2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2013.this.getBaseContext());
                    int unused = chemistry2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = chemistry2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = chemistry2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = chemistry2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = chemistry2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = chemistry2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = chemistry2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = chemistry2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = chemistry2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = chemistry2013.this.highscoreChemistry2013 = defaultSharedPreferences.getInt("chem2013hs", 0);
                    int access$600 = chemistry2013.this.part1 + chemistry2013.this.part2 + chemistry2013.this.part3 + chemistry2013.this.part4 + chemistry2013.this.part5 + chemistry2013.this.part6 + chemistry2013.this.part7 + chemistry2013.this.part8 + chemistry2013.this.part9;
                    TextView access$1600 = chemistry2013.this.resultText;
                    access$1600.setText(access$600 + "/80");
                    chemistry2013.this.progressbar.setProgress(access$600);
                    chemistry2013.this.progressbar.setMax(80);
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
                    int unused11 = chemistry2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = chemistry2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = chemistry2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = chemistry2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = chemistry2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = chemistry2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = chemistry2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = chemistry2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "chem2013hs";
                    int unused19 = chemistry2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = chemistry2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = chemistry2013.this.answered1 + chemistry2013.this.answered2 + chemistry2013.this.answered3 + chemistry2013.this.answered4 + chemistry2013.this.answered5 + chemistry2013.this.answered6 + chemistry2013.this.answered7 + chemistry2013.this.answered8 + chemistry2013.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > chemistry2013.this.highscoreChemistry2013) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - ((SystemClock.elapsedRealtime() - chemistry2013.this.chr.getBase()) / 1000)) * 3600) / 9000))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1chem131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1chem132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1chem133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1chem134", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1chem135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1chem136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1chem137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1chem138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1chem139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1chem1310", 0);
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
                        editor.putString("scorechem131", str2);
                        editor.putLong("date1chem131", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorechem132", str3);
                            editor.putLong("date1chem132", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorechem133", str3);
                            editor.putLong("date1chem133", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorechem134", str3);
                            editor.putLong("date1chem134", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorechem135", str3);
                            editor.putLong("date1chem135", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorechem136", str3);
                            editor.putLong("date1chem136", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorechem137", str3);
                            editor.putLong("date1chem137", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorechem138", str3);
                            editor.putLong("date1chem138", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorechem139", str3);
                            editor.putLong("date1chem139", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorechem1310", str3);
                            editor.putLong("date1chem1310", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datechem131", 0);
                    long j12 = defaultSharedPreferences.getLong("datechem132", 0);
                    long j13 = defaultSharedPreferences.getLong("datechem133", 0);
                    long j14 = defaultSharedPreferences.getLong("datechem134", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datechem135", 0);
                    long j16 = defaultSharedPreferences.getLong("datechem136", 0);
                    long j17 = defaultSharedPreferences.getLong("datechem137", 0);
                    long j18 = defaultSharedPreferences.getLong("datechem138", 0);
                    long j19 = defaultSharedPreferences.getLong("datechem139", 0);
                    long j20 = defaultSharedPreferences.getLong("datechem1310", 0);
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
                        editor2.putString("iScorechem131", f);
                        editor2.putLong("datechem131", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorechem132", f);
                            editor2.putLong("datechem132", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorechem133", f);
                            editor2.putLong("datechem133", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorechem134", f);
                            editor2.putLong("datechem134", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorechem135", f);
                            editor2.putLong("datechem135", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorechem136", f);
                            editor2.putLong("datechem136", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorechem137", f);
                            editor2.putLong("datechem137", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorechem138", f);
                            editor2.putLong("datechem138", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorechem139", f);
                            editor2.putLong("datechem139", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorechem1310", f);
                            editor2.putLong("datechem1310", valueOf.longValue());
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
                        chemistry2013.this.scr.setVisibility(8);
                        chemistry2013.this.chr.stop();
                        chemistry2013.this.toolbar.setVisibility(8);
                        chemistry2013.this.Relative.setBackgroundColor(-7829368);
                        chemistry2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2013.this.getBaseContext());
                        int unused = chemistry2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = chemistry2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = chemistry2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = chemistry2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = chemistry2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = chemistry2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = chemistry2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = chemistry2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = chemistry2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = chemistry2013.this.highscoreChemistry2013 = defaultSharedPreferences.getInt("chem2013hs", 0);
                        int access$600 = chemistry2013.this.part1 + chemistry2013.this.part2 + chemistry2013.this.part3 + chemistry2013.this.part4 + chemistry2013.this.part5 + chemistry2013.this.part6 + chemistry2013.this.part7 + chemistry2013.this.part8 + chemistry2013.this.part9;
                        TextView access$1600 = chemistry2013.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        chemistry2013.this.progressbar.setProgress(access$600);
                        chemistry2013.this.progressbar.setMax(80);
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
                        int unused11 = chemistry2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = chemistry2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = chemistry2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = chemistry2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = chemistry2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = chemistry2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = chemistry2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = chemistry2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = chemistry2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = chemistry2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = chemistry2013.this.answered1 + chemistry2013.this.answered2 + chemistry2013.this.answered3 + chemistry2013.this.answered4 + chemistry2013.this.answered5 + chemistry2013.this.answered6 + chemistry2013.this.answered7 + chemistry2013.this.answered8 + chemistry2013.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > chemistry2013.this.highscoreChemistry2013) {
                            edit.putInt("chem2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - chemistry2013.this.chr.getBase()) / 1000;
                        String str = "datechem139";
                        String str2 = "datechem138";
                        String str3 = "datechem137";
                        String str4 = "datechem136";
                        String str5 = "datechem135";
                        String str6 = "datechem134";
                        String str7 = "datechem133";
                        String str8 = "datechem132";
                        String str9 = "datechem131";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1chem1310";
                        String str11 = "date1chem139";
                        if (chemistry2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - elapsedRealtime) * 3600) / 9000))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1chem131", 0);
                            String str12 = "date1chem131";
                            String str13 = f;
                            long j2 = defaultSharedPreferences.getLong("date1chem132", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1chem133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1chem134", 0);
                            String str15 = "date1chem134";
                            String str16 = "date1chem133";
                            String str17 = "date1chem135";
                            long j5 = defaultSharedPreferences.getLong("date1chem135", 0);
                            long j6 = defaultSharedPreferences.getLong("date1chem137", 0);
                            String str18 = "date1chem136";
                            String str19 = "date1chem138";
                            long j7 = defaultSharedPreferences.getLong("date1chem138", 0);
                            long j8 = defaultSharedPreferences.getLong(str11, 0);
                            long j9 = defaultSharedPreferences.getLong(str10, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(defaultSharedPreferences.getLong("date1chem136", 0));
                            Date date7 = new Date(j6);
                            Date date8 = new Date(j7);
                            String str20 = "date1chem137";
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
                                editor3.putString("scorechem131", str14);
                                editor3.putLong(str12, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str21 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorechem132", str21);
                                    editor3.putLong("date1chem132", l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorechem133", str21);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorechem134", str21);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorechem135", str21);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorechem136", str21);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorechem137", str21);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorechem138", str21);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorechem139", str21);
                                    editor3.putLong(str11, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorechem1310", str21);
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
                            long j18 = defaultSharedPreferences.getLong("datechem1310", 0);
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
                                editor4.putString("iScorechem131", str13);
                                editor4.putLong(str22, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str30 = str13;
                                if (date24.compareTo(date13) == 0) {
                                    editor4.putString("iScorechem132", str30);
                                    editor4.putLong(str23, l.longValue());
                                } else if (date24.compareTo(date14) == 0) {
                                    editor4.putString("iScorechem133", str30);
                                    editor4.putLong(str29, l.longValue());
                                } else if (date24.compareTo(date15) == 0) {
                                    editor4.putString("iScorechem134", str30);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date24.compareTo(date16) == 0) {
                                    editor4.putString("iScorechem135", str30);
                                    editor4.putLong(str28, l.longValue());
                                } else if (date24.compareTo(date23) == 0) {
                                    editor4.putString("iScorechem136", str30);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date24.compareTo(date18) == 0) {
                                    editor4.putString("iScorechem137", str30);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date24.compareTo(date20) == 0) {
                                    editor4.putString("iScorechem138", str30);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date24.compareTo(date21) == 0) {
                                    editor4.putString("iScorechem139", str30);
                                    editor4.putLong(str, l.longValue());
                                } else if (date24.compareTo(date22) == 0) {
                                    editor4.putString("iScorechem1310", str30);
                                    editor4.putLong("datechem1310", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            String str31 = "date1chem134";
                            String str32 = "date1chem133";
                            String str33 = str;
                            String str34 = str2;
                            String str35 = str3;
                            String str36 = str5;
                            String str37 = str6;
                            String str38 = str7;
                            String str39 = str8;
                            String str40 = str10;
                            String str41 = str11;
                            String str42 = "date1chem135";
                            String str43 = "date1chem136";
                            String str44 = "date1chem137";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 9000))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j19 = defaultSharedPreferences.getLong("date1chem131", 0);
                            String str45 = "date1chem131";
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
                            String str52 = "date1chem138";
                            long j25 = defaultSharedPreferences.getLong(str52, 0);
                            long j26 = defaultSharedPreferences.getLong(str41, 0);
                            long j27 = defaultSharedPreferences.getLong(str40, 0);
                            Date date25 = new Date(j19);
                            Date date26 = new Date(defaultSharedPreferences.getLong("date1chem132", 0));
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
                                editor2.putString("scorechem131", str47);
                                editor2.putLong(str45, valueOf2.longValue());
                            } else {
                                String str55 = str47;
                                editor2 = editor5;
                                if (date36.compareTo(date26) == 0) {
                                    editor2.putString("scorechem132", str55);
                                    editor2.putLong("date1chem132", valueOf2.longValue());
                                } else if (date36.compareTo(date27) == 0) {
                                    editor2.putString("scorechem133", str55);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date36.compareTo(date28) == 0) {
                                    editor2.putString("scorechem134", str55);
                                    editor2.putLong(str49, valueOf2.longValue());
                                } else if (date36.compareTo(date29) == 0) {
                                    editor2.putString("scorechem135", str55);
                                    editor2.putLong(str50, valueOf2.longValue());
                                } else if (date36.compareTo(date30) == 0) {
                                    editor2.putString("scorechem136", str55);
                                    editor2.putLong(str51, valueOf2.longValue());
                                } else if (date36.compareTo(date31) == 0) {
                                    editor2.putString("scorechem137", str55);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date36.compareTo(date35) == 0) {
                                    editor2.putString("scorechem138", str55);
                                    editor2.putLong(str52, valueOf2.longValue());
                                } else if (date36.compareTo(date33) == 0) {
                                    editor2.putString("scorechem139", str55);
                                    editor2.putLong(str54, valueOf2.longValue());
                                } else if (date36.compareTo(date34) == 0) {
                                    editor2.putString("scorechem1310", str55);
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
                            long j38 = sharedPreferences3.getLong("datechem1310", 0);
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
                                editor.putString("iScorechem131", str46);
                                editor.putLong(str56, valueOf2.longValue());
                            } else {
                                String str69 = str46;
                                editor = editor7;
                                if (date47.compareTo(date38) == 0) {
                                    editor.putString("iScorechem132", str69);
                                    editor.putLong(str59, valueOf2.longValue());
                                } else if (date47.compareTo(date39) == 0) {
                                    editor.putString("iScorechem133", str69);
                                    editor.putLong(str61, valueOf2.longValue());
                                } else if (date47.compareTo(date40) == 0) {
                                    editor.putString("iScorechem134", str69);
                                    editor.putLong(str62, valueOf2.longValue());
                                } else if (date47.compareTo(date41) == 0) {
                                    editor.putString("iScorechem135", str69);
                                    editor.putLong(str64, valueOf2.longValue());
                                } else if (date47.compareTo(date42) == 0) {
                                    editor.putString("iScorechem136", str69);
                                    editor.putLong(str66, valueOf2.longValue());
                                } else if (date47.compareTo(date43) == 0) {
                                    editor.putString("iScorechem137", str69);
                                    editor.putLong(str35, valueOf2.longValue());
                                } else if (date47.compareTo(date44) == 0) {
                                    editor.putString("iScorechem138", str69);
                                    editor.putLong(str34, valueOf2.longValue());
                                } else if (date47.compareTo(date45) == 0) {
                                    editor.putString("iScorechem139", str69);
                                    editor.putLong(str68, valueOf2.longValue());
                                } else if (date47.compareTo(date46) == 0) {
                                    editor.putString("iScorechem1310", str69);
                                    editor.putLong("datechem1310", valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        chemistry2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2013.this.scr.setVisibility(8);
                chemistry2013.this.chr.stop();
                chemistry2013.this.toolbar.setVisibility(8);
                chemistry2013.this.Relative.setBackgroundColor(chemistry2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                chemistry2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2013.this.scr.setVisibility(0);
                chemistry2013.this.toolbar.setVisibility(0);
                chemistry2013.this.telegram_layout.setVisibility(8);
                chemistry2013.this.chr.start();
                chemistry2013.this.Relative.setBackgroundColor(chemistry2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chemistry2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chemistry2013.this.mInterstitialAd = null;
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
                chemistry2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
