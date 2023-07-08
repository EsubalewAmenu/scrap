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

public class chemistry2012 extends AppCompatActivity {
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
    private Boolean f497b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreChemistry2012;
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
    private Toolbar f498tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chemistry2012);
        this.f497b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextChemistry2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_chemistry2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following does a closed system allow to happen?", 0, 0, 0, 0, 0, "Neither matter nor energy to cross a system boundary", "Only matter to cross a system boundary", "Only energy to cross a system boundary", "Matter and energy to cross a system boundary", "In a closed system, energy can exchange between the system and surrounding but not matter.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("2.", "", C2719R.C2721drawable.c2012q2, C2719R.C2721drawable.c2012q2a, C2719R.C2721drawable.c2012q2b, C2719R.C2721drawable.c2012q2c, C2719R.C2721drawable.c2012q2d, "", "", "", "", "", "a", C2719R.C2721drawable.chem122e, 1, this.f497b));
        arrayList.add(new questions("3.", "Which of the following statements about the standard state of a substance is correct?\nAccording to their observation, which one of the following elements has the highest melting and boiling point?\n", 0, C2719R.C2721drawable.c2012q3a, C2719R.C2721drawable.c2012q3b, C2719R.C2721drawable.c2012q3c, C2719R.C2721drawable.c2012q3d, "", "", "", "", "", "b", C2719R.C2721drawable.chem123e, 1, this.f497b));
        arrayList.add(new questions("4.", "Which of the following statements best describes the Second Law of Thermodynamics?", 0, 0, 0, 0, 0, "The internal energy of the universe is constant.", "Energy can neither be created nor destroyed.", "When an isolated system under goes a spontaneous change, the entropy of the system will increase.", "At absolute zero, the entropy of a perfect crystal is considered to be zero.", "The second law of thermodynamics can be stated in different ways. The most common statement in chemical contexts is that in any spontaneous process the entropy of universe increases.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("5.", "Colligative property is defined as a property that depend on", 0, 0, 0, 0, 0, "The amount of solute present in the solution.", "The nature of pure liquid.", "The amount of pure liquid.", "The nature of solute present in the solution.", "Colligative properties are properties that depend on the quantity (amount) or concentration of the solute particle.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("6.", "Which of the following is NOT the correct geometric configuration for the given molecule?", 0, C2719R.C2721drawable.c2012q6a, C2719R.C2721drawable.c2012q6b, C2719R.C2721drawable.c2012q6c, C2719R.C2721drawable.c2012q6d, "", "", "", "", "", "c", C2719R.C2721drawable.chem126e, 1, this.f497b));
        arrayList.add(new questions("7.", "Which one of the following substances has London dispersion forces as it’s only inter molecular force? (No hydrogen bonding, no dipole-dipole forces).", 0, C2719R.C2721drawable.c2012q7a, C2719R.C2721drawable.c2012q7b, C2719R.C2721drawable.c2012q7c, C2719R.C2721drawable.c2012q7d, "", "", "", "", "All the given molecules are polar except CH_4. London dispersion forces exist in all kinds of molecules, but more important in nonpolar molecules.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("8.", "Which of the following is a basic chemical bonding theory?", 0, 0, 0, 0, 0, "Valance Shell Electron Repulsion (VSER) theory", "Ionic bonding theory", "Covalent Boning Theory.", "Molecular orbital theory.", "Valance bond theory and Molecular orbital theories are the two basic chemical bonding theories.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("9.", "Which type of intermolecular forces are present molecular crystalline solids?", 0, 0, 0, 0, 0, "Metallic, dispersion, dipole-dipole, hydrogen bonding", "Covalent, dispersion, dipole-dipole, hydrogen bonding", "Dispersion, dipole-dipole, hydrogen bonding", "Ionic, dispersion, dipole-dipole, hydrogen bonding", "Metallic, covalent and ionic bonds are intramolecular forces not intermolecular forces.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("10.", "Which statement is NOT correct about the valance bond theory?", 0, 0, 0, 0, 0, "According to the valance bond theory, each bond only involves two atoms.", "Valance bond theory treats electrons as localized between pairs of atoms.", "According to valance bond theory, molecular orbitals are formed by combining atomic orbitals.", "According to valance bond theory, hybrid orbitals are formed by overlapping of atomic orbitals.", "Molecular orbitals are formed by combining atomic orbitals according to molecular orbital (MO) theory not according valance bond theory.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("11.", "Which of the following statements is correct about fats and oils?", 0, 0, 0, 0, 0, "They are soluble in polar solvents", "They burn without leaving gash", "They are heavier than water", "They are readily volatile", "Fats and oils are:\n  \t    -     Soluble in non-polar solvents.\n \t    -     Not readily volatile.\n-\tAre lighter than water.\n-\tOdorless and colorless.\n", "b", 0, 1, this.f497b));
        arrayList.add(new questions("12.", "Which of the following is the correct procedure during the preparation of soap?", 0, 0, 0, 0, 0, "Placing animal fats or vegetable oil in a reflex set up and boiling with concentrated solution of brine.", "Placing vegetable oil and animal fat in a reflux set up and boiling after addition of boiling chips.", "When saponification is complete, pouring the mixture quickly into a saturated NaOH solution.", "When saponification is complete, pouring the mixture quickly in to saturated NaCl solution", "The main procedure is: Setup a reflux apparatus → place vegetable oil or animal fat in ditilation flask → add 20%NaOH solution → add few boiling chip → when saponification is complete pour the mixture into brine (concentrate NaCl solution) → collect the precipitate and wash it with ice-cold distilled water and dry it.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("13.", "Which of the following discretion about a suspension is correct?", 0, 0, 0, 0, 0, "A suspension contains particles which will not settle out if the suspension is left standing.", "A suspension is a cloudy mixture contain particles which will easily settle out when the suspension is left standing.", "A suspension is a homogenous mixture.", "A suspension is a heterogeneous mixture.", "Suspensions are heterogeneous mixtures whose particles appear cloudy and settle down upon standing.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("14.", "What is meant by the rate of dissolution of solute?", 0, 0, 0, 0, 0, "The dynamic equilibrium attained between the solute and the solvent", "The maximum amount of solute that a pure solvent can hold in solution", "The ability of solute to go into solution", "The amount of solute that goes into solution per unit tone.", "Rate of dissolution is the speed with which solute goes into solution.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("15.", "How can you prepare a super saturated solution of sodium thiosulfate, if the solubility of the salt at 25 degree C is 50g per 100g water?", 0, 0, 0, 0, 0, "By dissolving 70g of sodium thiosulfate in hot 100g water, carefully cooling the solution to 25 degree C and adding a seed crystal of the solute.", "By dissolving 45g of sodium thiosulfate in 95g hot water and then cooling the solution to 25 degree C.", "By dissolving 70g of sodium thiosulfate in hot 100g water and then carefully cooling the solution to 25 degree C.", "By dissolving 45g of sodium thiosulfate in 100g water.", "As the solubility of the given salt is 50\" \" g/100\" \" g of water, the solution which contain more than 50\" \" g of the salt at the given temperature is supersaturated solution.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("16.", "What is dynamic chemical equilibrium?", 0, 0, 0, 0, 0, "Dynamic chemical equilibrium is the state where the forward and backward reaction rates are equal to zero.", "Dynamic chemical equilibrium is the state of equal opposite rates with equal concentrations of reactants and products.", "At dynamic chemical equilibrium, reactants are converted to products and products are converted to reactants at an equal and constant rate.", "Dynamic chemical equilibrium is the state where all reactants and products in the reaction are at rest.", "At dynamic chemical equilibrium, rates of forward and back ward are equal.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("17.", "The Reaction Quotient (Q) is", 0, 0, 0, 0, 0, "The ratio of concentration of the products to the concentrations of reactants to the power of their respective coefficients under equilibrium conditions.", "The ratio of concentrations of the products to the concentrations of reactants to the power of their respective coefficients at any stage after the start of the reaction.", "A quantity that does not change as a reaction system approaches equilibrium.", "A measurement of the relative quantities of products and reactants present in a reaction mixture.", "", "b", C2719R.C2721drawable.chem1217e, 1, this.f497b));
        arrayList.add(new questions("18.", "What factors affect chemical equilibrium in a chemical reaction?", 0, 0, 0, 0, 0, "Change in reactant or product concentrations, pressure change, temperature, presence of catalyst.", "Change in reactant or product concentrations, volume, and pressure changes, temperature, presence of catalyst", "Change in reactant(s) concentration(s), volume changes, temperature, presence of catalyst", "Change in reactant or product concentrations, volume and pressure changes, temperature", "Factors that can affect chemical equilibrium are: Temperature, concentration, pressure and volume.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("19.", "Which of the following are equal for a chemical system at equilibrium?", 0, 0, 0, 0, 0, "The rate of the forward and reverse reaction", "The time that a particular atom or molecule stays as a reactant or product", "The rate constant for the forward and reverse reactions", "The concentrations of reactant and products", "", "d", 0, 1, this.f497b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.c2012q20, C2719R.C2721drawable.c2012q20a, C2719R.C2721drawable.c2012q20b, C2719R.C2721drawable.c2012q20c, C2719R.C2721drawable.c2012q20d, "", "", "", "", "If the equilibrium constant for a reaction is K, the equilibrium constant for the reverse reaction is 1/K. Therefor the equilibrium constant for the reverse reaction is 1/(2.2×〖10〗^8 )=0.445×〖10〗^(-8) =4.55×〖10〗^(-9)", "b", C2719R.C2721drawable.chem1220e, 1, this.f497b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.c2012q21, 0, 0, 0, 0, "diluted", "super saturated", "saturated", "unsaturated", "From the solubility curve given, at 〖20〗^∘ C the solubility of the salt is 20\" \" g per 100\" \" g of water. That the solution is saturated and the solution containing more than 20\" \" g (i.e. 30\" \" g ) is supersaturated solution. ", "b", C2719R.C2721drawable.chem1221e, 1, this.f497b));
        arrayList.add(new questions("22.", "What is mole fraction? Mole fraction is", 0, 0, 0, 0, 0, "Mass of solute divided by mass of solution.", "Moles of solute divided by kilogram of solvent.", "Mass of a component divided by the total mass of all components.", "Number of moles of a component divided by the total number of moles of all components.", "Number of moles of all component divided by the total numbers of components is said to be mole fraction of the component.", "n", 0, 1, this.f497b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.c2012q23, 0, 0, 0, 0, "3.4", "2.1 ", "1.7", "0.48 ", "", "b", C2719R.C2721drawable.chem1220e, 1, this.f497b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.c2012q24, 0, 0, 0, 0, "By dissolving 8.6g sugar in 914g of water", "By dissolving 8.6g sugar in 91.4g of water", "By dissolving 86g sugar in 100g of water", "By dissolving 8.6g sugar in 100ml water", "No explanation", "n", C2719R.C2721drawable.chem1221e, 1, this.f497b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.c2012q25, 0, 0, 0, 0, "27.8", "2.78", "0.36", "3.60", "", "c", 0, 1, this.f497b));
        arrayList.add(new questions("26.", "Which of the following properties is true about covalent molecules?", 0, 0, 0, 0, 0, "High electrical and thermal conductivity", "Low melting point and boiling points", "Low melting point but high boiling points", "High melting but low boiling points", "Covalent compounds have generally low melting and boiling points and are non-conductors of heat and electricity.", "d", C2719R.C2721drawable.chem1226e, 1, this.f497b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.c2012q27, 0, 0, 0, 0, "Lone pairs occupy less space, but multiple bonds occupy more space than single bonds.", "Both multiple bonds and lone pairs occupy less space.", "Lone pairs repel smaller than bonded pairs and multiple bonds have a higher charge density around the central atom.", "Lone pairs repel more due to a greater charge density than bonding pairs.", "The shape of the given molecule is trigonal planar and the bond angles are 〖120〗^∘. There is no lone pair on the central atom (has no effect on the bond angles). The three sets of electrons repeal each other nearly equally.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("28.", "If you are provided with four covalent compounds namely naphthalene, graphite, iodine and ethanol to investigate their electrical conductivity, which one would you expect to conduct electricity either in the solid or in the liquid state?", 0, 0, 0, 0, 0, "Ethanol", "Iodine", "Graphite", "Naphthalene", "Graphite is the only nonmetal that can conduct electricity.", "c", C2719R.C2721drawable.chem1228e, 1, this.f497b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.c2012q29, C2719R.C2721drawable.c2012q29a, C2719R.C2721drawable.c2012q29b, C2719R.C2721drawable.c2012q29c, C2719R.C2721drawable.c2012q29d, "", "", "", "", "The molecule [I_3 ]^-takes the form AX_2 E_3 type and has linear shape.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.c2012q30, 0, 0, 0, 0, "Nonpolar covalent", "Coordinate covalent", "Simple covalent", "Ionic band", "Ammonia molecule (NH_3 ) donate lone pair to H^+and coordinate covalent bond is formed.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("31.", "If 3.423 grams of sucrose is dissolved in 200.0 & of water. What is molatity of the sucrose solution? (Molar mass of sucrose =342.3\" \" mol )", 0, 0, 0, 0, 0, "0.01 m", "0.5 m", "0.1 m", "0.03 m", "", "d", C2719R.C2721drawable.chem1228e, 1, this.f497b));
        arrayList.add(new questions("32.", "What is the Arrhenius concept of base?", 0, 0, 0, 0, 0, "A substance that releases hydrogen won in water is base", "A base furnishes a pair of electrons.", "A substance that increases hydrogen ion in water is a basic.", "A base is proton acceptor.", "According to Arrhenius acid-base concept, acid is the substance that produce H^+in water and base is a sabstance the produce OH^- in water.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("33.", "The Bronsted-Lowry concept defines an acid as a substance that", 0, 0, 0, 0, 0, "Furnishes proton to a molecule", "Gives hydrogen ion in water.", "Accepts proton from a molecule.", "Produces hydroxide ion in water.", "According to Bronsted-Lowry, acid is proton donor and base is proton acceptor.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("34.", "Which of the following explains the cleaning action of soap.", 0, 0, 0, 0, 0, "Cleaning action is not related to hydrophilic and hydrophobic nature of soap.", "Oily dirt is absorbed into both hydrophilic and hydrophobic parts but not washed away.", "Oily part is absorbed into the hydrophilic part of soap and washed away.", "Oily dirt is absorbed into the hydrophobic part of soap and washed away", "Soap has two ends; polar and non-polar ends. The oily dirt is dissolved by the non-polar part (hydrophobic end) of the soap which is in the middle of cells that washed away by water.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("35.", "Which of the following statement is WRONG about entropy and change of entropy(ΔS) ?", 0, 0, 0, 0, 0, "ΔS Decreases with randomness.", "Entropy is a measure of randomness.", "ΔSReaction = ∑mSreactant -∑nSproduct.", "ΔS>0 Indicates an increase in randomness.", "", "c", C2719R.C2721drawable.chem1232e, 1, this.f497b));
        arrayList.add(new questions("36.", "Which of the following states the law of definite proportion?", 0, 0, 0, 0, 0, "Chemical compounds are formed when atoms combines in whole number ratios.", "The mass of products in a chemical reaction must he equal to the mass of the reactants.", "The total mass in the universe is always constant.", "Every compound always contains the same elements in the same proportions by weight.", "According to the law of definite proportion, a pure compound always contains the same elements in the same proportion by mass.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("37.", "What did J.J Thomson contribute with his experiments in cathode-ray tubes in understanding the atome structure of the atom?", 0, 0, 0, 0, 0, "Cathode rays and electric charge were separate entities and not combined together.", "The electric charge deposited was negative.", "Cathode rays were actually electrons.", "Cathode rays and charge were combined together, and not separate entities.", "J.J. Thomson in his discharge tube experiments showed that cathode rays consist of negatively charged particles called electrons.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("38.", "An element X has two naturally occurring isotopes. X(10.013 amu) and X( 11.01amu ). The first accounts for 19.9% of the total and the second accounts for remaining 80.1%. What is the average atomic mass of element?", 0, 0, 0, 0, 0, "10.125", "10.512", "10.211", "10.812", "", "d", C2719R.C2721drawable.chem1235e, 1, this.f497b));
        arrayList.add(new questions("39.", "What are isotopes? Isotopes are atoms with the same number of protons but different numbers of", 0, 0, 0, 0, 0, "neutrons", "ions", "protons", "electrons", "Isotopes are atoms of the same element with the same atomic number (number of proton) but different number of neutron or atomic mass.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("40.", "Which statement is correct for the emission spectrum of hydrogen atom?", 0, 0, 0, 0, 0, "The line corresponding to the greatest emission of energy is in the ultraviolet region.", "The lines are produced when electrons move from lower to higher energy levels.", "The lines in the visible region involve electron transitions into the energy level closest to the nucleus.", "The lines are produced when electrons move from second to fourth.", "When electrons drop from any energy level to n=1, Lyman series which is ultra-violate (Uv) emission spectrum is formed.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("41.", "Which of the following physical properties of a solvent are affected by the formation of solution?", 0, 0, 0, 0, 0, "Vapour pressure lowering and boiling point lowering.", "Vapour pressure elevation, boiling point lowering, freezing point lowering, and osmotic pressure.", "Vapour pressure lowering, boiling point lowering, freezing point lowering, osmotic pressure", "Vapour pressure lowering, boiling point elevation, freezing point lowering, and osmotic pressure.", "The colligative properties of solution are: Vapor pressure lowering, boiling point elevation, freezing point depression and osmotic pressure.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("42.", "A solution is made by dissolving 3.75g of pure non-volatile solute in 95g of octane. The BP of pure octane was observed to be 55.95 degree C and that of solution was 56.5 degrees C. Which of the following is correct based on the given evidence? If the dissolved solute is electrolyte. The boiling point of the solution", 0, 0, 0, 0, 0, "Will be slightly higher than 55.95 degree Celsius", "Will be slightly lower than 56.50 degree Celsius", "Will be slightly lower than 56.50 degree Celsius", "Remains to be 56.50 degree Celsius", "Colligative properties of electrolyte solutions are higher than that.", "c", C2719R.C2721drawable.chem1242e, 1, this.f497b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.c2012q43, C2719R.C2721drawable.c2012q43a, C2719R.C2721drawable.c2012q43b, C2719R.C2721drawable.c2012q43c, C2719R.C2721drawable.c2012q43d, "", "", "", "", "One water molecule act as Bronsted-Lowry acid and the one water molecule act as Bronsted-Lowry base (Proton transfer from one water molecule to another water molecule).", "b", 0, 1, this.f497b));
        arrayList.add(new questions("44.", "In the auto ionization of water", 0, 0, 0, 0, 0, "There is no transfer of hydrogen ion from the acid or the base.", "One water molecule acts as a Lewis base and the other water molecule acts as Lewis acid.", "A proton is transferred from one water molecule to another.", "An electron is transferred from one water molecule to another.", "According to the second law of thermodynamics energy of the universe is conserved,", "c", 0, 1, this.f497b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.c2012q45, C2719R.C2721drawable.c2012q45a, C2719R.C2721drawable.c2012q45b, C2719R.C2721drawable.c2012q45c, C2719R.C2721drawable.c2012q45d, "", "", "", "", "Ag^+is electron deficient an act as Lewis acid, while NH_3 has lone pair of electron and it is electron rich and act as Lewis base.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("46.", "", C2719R.C2721drawable.c2012q46, C2719R.C2721drawable.c2012q46a, C2719R.C2721drawable.c2012q46b, C2719R.C2721drawable.c2012q46c, C2719R.C2721drawable.c2012q46d, "", "", "", "", "According to the law of mass action, the equilibrium constant K_c is the ratio of concentrations of the products to the concentrations of reactants to the power of their respective coefficients at equilibrium.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("47.", "The first law of thermodynamics states that", 0, 0, 0, 0, 0, "Energy can be created or destroyed.", "The total amount of energy in the universe is constanit.", "In absolute zero the entropy of a perfect crystal is considered to be zero.", "The entropy of universe increases in spontaneous process.", "According to the second law of thermodynamics energy of the universe is conserved,", "b", 0, 1, this.f497b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.c2012q48, C2719R.C2721drawable.c2012q48a, C2719R.C2721drawable.c2012q48b, C2719R.C2721drawable.c2012q48c, C2719R.C2721drawable.c2012q48d, "", "", "", "", "K_p and K_c are defined similarly, but K_p is defined for gaseous reactants and products in terms of partial pressures.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("49.", "Which of the following is a homogeneous reaction?", 0, C2719R.C2721drawable.c2012q49a, C2719R.C2721drawable.c2012q49b, C2719R.C2721drawable.c2012q49c, C2719R.C2721drawable.c2012q49d, "", "", "", "", "Homogeneous reaction is a reaction whose both the reactant and product are in gaseous or liquid phase.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("50.", "Which of the following procuders indicates a system which CANNOT exchange both energy and matter with surroundings?", 0, 0, 0, 0, 0, "Baking injera", "Cooking Shiro-wet in a closed pan", "Keeping hot water in thermostat", "Water boiling in an open beaker", "Thermostat is example of isolated system.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("51.", "The major fields of chemistry that study all the elements and their compounds with the exception of carbon and its compounds are known as", 0, 0, 0, 0, 0, "Analytical", "inorganic", "physical", "organic", "Inorganic chemistry is branch of chemistry which study about all compounds except organic compounds.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("52.", "Which of the following correctly defines accuracy of a measurements?", 0, 0, 0, 0, 0, "The degree to which reacted measurements under the same conditions are unchanged.", "Measurements that are close to the known value.", "Measurements that have been repeated several times.", "Measurements that are close each other.", "Accuracy is degree to which measurements close to true or actual value.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("53.", "", C2719R.C2721drawable.c2012q53, 0, 0, 0, 0, "Six", "Five", "Four", "Three", "Zeros that are not proceeded by non-zero digit are not significant.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("54.", "What is a scientific method? It is a method of", 0, 0, 0, 0, 0, "quantitative observations and experiments.", "Investigation involving experimentation and observation to acquire new knowledge, solve problems, and answer questions.", "Searching for information based only on past scientific research.", "Gaining knowledge through theory modified as needed.", "A scientific method is a general approach to solve problems which involves making observation, formulating hypothesis and testing hypothesis.", "b", C2719R.C2721drawable.chem1254e, 1, this.f497b));
        arrayList.add(new questions("55.", "A hypothesis step in the scientific method is", 0, 0, 0, 0, 0, "The step at which data collected by observations and experiments.", "An explanation of the general principles of certain phenomena.", "A possible explanation for an observation.", "A verbal statement or a mathematical equation that summarizes observations.", "Hypothesis is tentative explanation for observation.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("56.", "Which of the following factors will affect the rate of a chemical reaction?", 0, 0, 0, 0, 0, "Humidity, presence of catalyst, concentration or pressure of reactants, surface area of solid reactant", "Temperature, volume of container, presence of catalyst, concentration or pressure of reactants", "Temperature, presence of catalyst, concentration or pressure of reactant, surface area of solid reactant", "Temperature, volume of container, presence of catalyst, concentration or pressure of reactants, surface area of solid reactant", "Factors that can affect rate of chemical reaction are: Concentration, pressure, temperature, surface area of reactant and catalyst.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("57.", "Which statement is correct for the reaction:2A+B→C ?", 0, 0, 0, 0, 0, "The rate of disappearance of B is twice that of A.", "The rate of appearance of C equals the rate of disappearance of A.", "The rate of disappearance of A is twice that of B.", "C appears at a rate equal to the sum of the rates of the disappearance of A and B.", "", "c", C2719R.C2721drawable.chem1254e, 1, this.f497b));
        arrayList.add(new questions("58.", "The theory that states \"the collision between two reacting species results in the formation of an activated complex\" is known as", 0, 0, 0, 0, 0, "Intermediate state theory.", "Rate theory.", "Transition state.", "Collision theory.", "According to Transition state Theory or Activated-Complex Theory, collision between two reacting species results in the formation an activated complex or transition state.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("59.", "For the reaction: A+B→C, the ate equation is r=k[A]\nWhich of the following statement is NOT correct?\n", 0, C2719R.C2721drawable.c2012q59a, 0, 0, 0, "", "The rate depends on the concentration of A.", "A lot of [Λ] against time is linear.", "The rate is independent of the concentration of B.", "For first order reaction the plot [A] against time is not linear, but ln[A] against time is linear.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("60.", "What is meant by rate-determining step in chemical kinetics?", 0, 0, 0, 0, 0, "The rate determining step is the mechanism step with the average activation energy.", "The rate determining step is the mechanism step with the least activation energy", "The rate determining step is the fastest step of a chemical reaction that determines the speed (rate) at which the overall reaction proceeds.", "The rate determining step, is the slowest step of a chemical reaction that determines the speed (rate) at which the overall reaction proceeds.", "In a reaction mechanism, the slowest step (elementary reaction) determines the rate of the overall reaction.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("61.", "", C2719R.C2721drawable.c2012q61, C2719R.C2721drawable.c2012q61a, C2719R.C2721drawable.c2012q61b, C2719R.C2721drawable.c2012q61c, C2719R.C2721drawable.c2012q61d, "", "", "", "", "", "d", C2719R.C2721drawable.chem1258e, 1, this.f497b));
        arrayList.add(new questions("62.", "Which set of quantum numbers uniquely defines one of the electrons in an atomic orbital with n=2 and=0 ?", 0, C2719R.C2721drawable.c2012q62a, C2719R.C2721drawable.c2012q62b, C2719R.C2721drawable.c2012q62c, C2719R.C2721drawable.c2012q62d, "", "", "", "", "For l=0,ml=0 and the value of ms is either +1/2 or -1/2.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("63.", "What is Pauli Exclusion Principle? The Pauli Exclusion Principle states that", 0, 0, 0, 0, 0, "An orbital can hold a maximum of two electrons with the same quantum number ms.", "Two electrons in an atom can have the same set of the four quantum numbers.", "No two electrons in an atom can have the same set of the four quantum numbers.", "All electrons in an atom are in the same energy state.", "According to Pauli Exclusion Principle, no two electrons in an atom can have the same four quantum numbers.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("64.", "Which of the following is correct relationship between the given parameter and the property of an EMR?", 0, 0, 0, 0, 0, "The lower the frequency of an EMR, the higher is its wave length.", "The higher the value of the wave length of an EMR, the greater is its energy.", "The lower the value of the frequency of an EMR, the higher is the energy of an EMR.", "The higher the value of the wave length of an EMR, the greater is its frequency.", "For a given EMR, the higher the frequency, the lower the wave length and the higher the energy.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("65.", "When equal amount of sodium chloride lead iodide are dissolved in water. Which of the following statements are true regarding the electrical conductivity of the dissolved ionic solution?", 0, 0, 0, 0, 0, "The electrical conductivity depends on the type of electrodes.", "Both solutions will have the same electrical conductivity.", "The lead iodide solution will have higher electrical conductivity.", "The sodium chloride solution will have higher electrical conductivity.", "Sodium chloride is more soluble than lead iodide. The sodium chloride solution contain more ions than the lead iodide solution.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("66.", "Which of the following explanation is correct about Vapour pressure and its relation with phase changes?", 0, 0, 0, 0, 0, "Rate of evaporation increases as higher number of molecules go into the vapor phase.", "Rate of condensatıon increases as lower number of molecules go into the Vapour phase.", "As the temperature decreased more molecules go from liquid phase to the vapor phase.", "As the temperature is increased; more molecules go from liquid phase to the vapor phase.", "The number of molecules go to gas phase from liquid form increases as temperature increases.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("67.", "Which of the following structural formula represents Propanoic acid?", 0, C2719R.C2721drawable.c2012q67a, C2719R.C2721drawable.c2012q67b, C2719R.C2721drawable.c2012q67c, C2719R.C2721drawable.c2012q67d, "", "", "", "", "Propanoic acid is carboxylic acid with three carbon atoms.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("68.", "Acetic acid is manufactured industrially by the fermentation of", 0, 0, 0, 0, 0, "Methanal", "Ethanal", "Ethanol", "Methanol", "Large quantities of acetic acid is prepared industrial by fermentation of ethanol.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("69.", "", C2719R.C2721drawable.c2012q69, 0, 0, 0, 0, "Pentyl formate", "Buthyl methnoate", "Ethyl propanoate", "Propyl ethanoate", "Pentayl formate contain 9 carbon atoms and cannot be isomer of the remaining compounds which have 5 carbon atoms.", "a", 0, 1, this.f497b));
        arrayList.add(new questions("70.", "What is the characteristic smell of an ester?", 0, 0, 0, 0, 0, "Fish like smell", "Fruity like smell", "Alcoholic smell", "Rotten egg small", "Pleasant small of many esters is responsible for the flavor and fragrance of many fruits.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("71.", "", C2719R.C2721drawable.c2012q71, C2719R.C2721drawable.c2012q71a, C2719R.C2721drawable.c2012q71b, C2719R.C2721drawable.c2012q71c, C2719R.C2721drawable.c2012q71d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1268e, 1, this.f497b));
        arrayList.add(new questions("72.", "A common ion effect in a certain week acid will make the solution less acidic.\nThis is because the presence of a common ion\n", 0, 0, 0, 0, 0, "enhances the ionization of salt of weak acid.", "Suppresses the ionization of weak acid.", "Enhances the ionization of the weak acid.", "Suppresses the ionization of the weak acid.", "Presence common ion suppresses the ionization of weak acid and the solution becomes less acidic.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("73.", "", C2719R.C2721drawable.c2012q73, 0, 0, 0, 0, "The solution can be either acidic or basic at the same time.", "The solution will be neutral, because the concentration of OH^-equals that of H+", "The solution will be basic, because the concentration of OH- is less than that of H+.", "The solution will be basic, because the concentration of OH- is greater than that of H+.", "Since K_b is greater than K_a, the solution becomes basic.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("74.", "", C2719R.C2721drawable.c2012q74, 0, 0, 0, 0, "A weak acid with strong base. ", "A weak base with strong acid. ", "A weak acid with a weak basic.", "A strong base with a strong acid.", "From the given titration curve:  pH is low at the beging and at the equivalent point pH is 7 and these are characteristics of titration curve of strong acid with strong base.", "d", 0, 1, this.f497b));
        arrayList.add(new questions("75.", "What is the difference between equivalence point and end point in an acid base titration?", 0, 0, 0, 0, 0, "At the equivalence point, pH is always 7 and at the end point there is a color change.", "At the end point, pH is always 7 and at the equivalence point there is a color change.", "Equivalence point is where stoichiometrically equivalent amounts of the analyte and titrant react and end point where an observable physical change occurs in a titration.", "Equivalence point is where an observable physical change occurs in a titration.", "End point is the point at which color of indicator changes and equivalence point is the point at which stoichiometrically equivalent amounts of the acid and the base react (neutralization reaction complete).", "c", 0, 1, this.f497b));
        arrayList.add(new questions("76.", "Which of the following represents a net ionic equation?", 0, C2719R.C2721drawable.c2012q76a, C2719R.C2721drawable.c2012q76b, C2719R.C2721drawable.c2012q76c, C2719R.C2721drawable.c2012q76d, "", "", "", "", "Net ionic equation is a chemical equation with no spectator ions.", "b", 0, 1, this.f497b));
        arrayList.add(new questions("77.", "Which of the following is correct about the solution process?", 0, 0, 0, 0, 0, "A dilution process is carried out by adding a solute.", "Adding solute to a stock solution gives less concentrated solution.", "Adding solvent to a stock solution to get less concentrated solution.", "A dilution process gives a concentrated solution.", "Dilution process is preparing less concentrated solution from more concentrated solution by adding solvent.", "c", 0, 1, this.f497b));
        arrayList.add(new questions("78.", "The number of equivalent per liter of solution is known as", 0, 0, 0, 0, 0, "Mole fraction", "Molality", "Normality", "Molarity", "", "c", C2719R.C2721drawable.chem1275e, 1, this.f497b));
        arrayList.add(new questions("79.", "When silver nitrate solution is mixed sodium chloride solution it gives an insoluble silver chloride. Which of the following is correct?", 0, 0, 0, 0, 0, "Silver and chloride ions are reacting species.", "Sodium ion is spectator ion while nitrate is reacting ion.", "Silver and chloride ions are spectator ions.", "Nitrate and sodium ions are reacting species.", "", "a", C2719R.C2721drawable.chem1276e, 1, this.f497b));
        arrayList.add(new questions("80.", "Which of the following explains the change of colligative properties of a solvent upon addition of a non-volatile solute?", 0, 0, 0, 0, 0, "The nature of the solute determines the volatility of the solvent.", "The solvent shows weak intermolecular interactions.", "The solute covers the surface of the solvent and results in lowering of Vapour pressure.", "Lower amount of a non-volatile solute results in a higher Vapour pressure change.", "", "c", 0, 1, this.f497b));
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
        this.f498tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(150), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    chemistry2012.this.timer.setVisibility(0);
                    chemistry2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    chemistry2012.this.scr.setVisibility(8);
                    chemistry2012.this.chr.stop();
                    chemistry2012.this.toolbar.setVisibility(8);
                    chemistry2012.this.Relative.setBackgroundColor(-7829368);
                    chemistry2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2012.this.getBaseContext());
                    int unused = chemistry2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = chemistry2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = chemistry2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = chemistry2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = chemistry2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = chemistry2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = chemistry2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = chemistry2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = chemistry2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = chemistry2012.this.highscoreChemistry2012 = defaultSharedPreferences.getInt("chem2012hs", 0);
                    int access$600 = chemistry2012.this.part1 + chemistry2012.this.part2 + chemistry2012.this.part3 + chemistry2012.this.part4 + chemistry2012.this.part5 + chemistry2012.this.part6 + chemistry2012.this.part7 + chemistry2012.this.part8 + chemistry2012.this.part9;
                    TextView access$1600 = chemistry2012.this.resultText;
                    access$1600.setText(access$600 + "/80");
                    chemistry2012.this.progressbar.setProgress(access$600);
                    chemistry2012.this.progressbar.setMax(80);
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
                    int unused11 = chemistry2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = chemistry2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = chemistry2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = chemistry2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = chemistry2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = chemistry2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = chemistry2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = chemistry2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "chem2012hs";
                    int unused19 = chemistry2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = chemistry2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = chemistry2012.this.answered1 + chemistry2012.this.answered2 + chemistry2012.this.answered3 + chemistry2012.this.answered4 + chemistry2012.this.answered5 + chemistry2012.this.answered6 + chemistry2012.this.answered7 + chemistry2012.this.answered8 + chemistry2012.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > chemistry2012.this.highscoreChemistry2012) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - ((SystemClock.elapsedRealtime() - chemistry2012.this.chr.getBase()) / 1000)) * 3600) / 9000))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1chem121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1chem122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1chem123", 0);
                    long j4 = defaultSharedPreferences.getLong("date1chem124", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1chem125", 0);
                    long j6 = defaultSharedPreferences.getLong("date1chem126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1chem127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1chem128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1chem129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1chem1210", 0);
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
                        editor.putString("scorechem121", str2);
                        editor.putLong("date1chem121", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorechem122", str3);
                            editor.putLong("date1chem122", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorechem123", str3);
                            editor.putLong("date1chem123", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorechem124", str3);
                            editor.putLong("date1chem124", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorechem125", str3);
                            editor.putLong("date1chem125", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorechem126", str3);
                            editor.putLong("date1chem126", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorechem127", str3);
                            editor.putLong("date1chem127", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorechem128", str3);
                            editor.putLong("date1chem128", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorechem129", str3);
                            editor.putLong("date1chem129", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorechem1210", str3);
                            editor.putLong("date1chem1210", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datechem121", 0);
                    long j12 = defaultSharedPreferences.getLong("datechem122", 0);
                    long j13 = defaultSharedPreferences.getLong("datechem123", 0);
                    long j14 = defaultSharedPreferences.getLong("datechem124", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datechem125", 0);
                    long j16 = defaultSharedPreferences.getLong("datechem126", 0);
                    long j17 = defaultSharedPreferences.getLong("datechem127", 0);
                    long j18 = defaultSharedPreferences.getLong("datechem128", 0);
                    long j19 = defaultSharedPreferences.getLong("datechem129", 0);
                    long j20 = defaultSharedPreferences.getLong("datechem1210", 0);
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
                        editor2.putString("iScorechem121", f);
                        editor2.putLong("datechem121", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorechem122", f);
                            editor2.putLong("datechem122", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorechem123", f);
                            editor2.putLong("datechem123", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorechem124", f);
                            editor2.putLong("datechem124", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorechem125", f);
                            editor2.putLong("datechem125", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorechem126", f);
                            editor2.putLong("datechem126", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorechem127", f);
                            editor2.putLong("datechem127", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorechem128", f);
                            editor2.putLong("datechem128", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorechem129", f);
                            editor2.putLong("datechem129", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorechem1210", f);
                            editor2.putLong("datechem1210", valueOf.longValue());
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
                        chemistry2012.this.scr.setVisibility(8);
                        chemistry2012.this.chr.stop();
                        chemistry2012.this.toolbar.setVisibility(8);
                        chemistry2012.this.Relative.setBackgroundColor(-7829368);
                        chemistry2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2012.this.getBaseContext());
                        int unused = chemistry2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = chemistry2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = chemistry2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = chemistry2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = chemistry2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = chemistry2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = chemistry2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = chemistry2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = chemistry2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = chemistry2012.this.highscoreChemistry2012 = defaultSharedPreferences.getInt("chem2012hs", 0);
                        int access$600 = chemistry2012.this.part1 + chemistry2012.this.part2 + chemistry2012.this.part3 + chemistry2012.this.part4 + chemistry2012.this.part5 + chemistry2012.this.part6 + chemistry2012.this.part7 + chemistry2012.this.part8 + chemistry2012.this.part9;
                        TextView access$1600 = chemistry2012.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        chemistry2012.this.progressbar.setProgress(access$600);
                        chemistry2012.this.progressbar.setMax(80);
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
                        int unused11 = chemistry2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = chemistry2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = chemistry2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = chemistry2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = chemistry2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = chemistry2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = chemistry2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = chemistry2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = chemistry2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = chemistry2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = chemistry2012.this.answered1 + chemistry2012.this.answered2 + chemistry2012.this.answered3 + chemistry2012.this.answered4 + chemistry2012.this.answered5 + chemistry2012.this.answered6 + chemistry2012.this.answered7 + chemistry2012.this.answered8 + chemistry2012.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > chemistry2012.this.highscoreChemistry2012) {
                            edit.putInt("chem2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - chemistry2012.this.chr.getBase()) / 1000;
                        String str = "datechem129";
                        String str2 = "datechem128";
                        String str3 = "datechem127";
                        String str4 = "datechem126";
                        String str5 = "datechem125";
                        String str6 = "datechem124";
                        String str7 = "datechem123";
                        String str8 = "datechem122";
                        String str9 = "datechem121";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1chem1210";
                        String str11 = "date1chem129";
                        if (chemistry2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - elapsedRealtime) * 3600) / 9000))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1chem121", 0);
                            String str12 = "date1chem121";
                            String str13 = f;
                            long j2 = defaultSharedPreferences.getLong("date1chem122", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1chem123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1chem124", 0);
                            String str15 = "date1chem124";
                            String str16 = "date1chem123";
                            String str17 = "date1chem125";
                            long j5 = defaultSharedPreferences.getLong("date1chem125", 0);
                            long j6 = defaultSharedPreferences.getLong("date1chem127", 0);
                            String str18 = "date1chem126";
                            String str19 = "date1chem128";
                            long j7 = defaultSharedPreferences.getLong("date1chem128", 0);
                            long j8 = defaultSharedPreferences.getLong(str11, 0);
                            long j9 = defaultSharedPreferences.getLong(str10, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(defaultSharedPreferences.getLong("date1chem126", 0));
                            Date date7 = new Date(j6);
                            Date date8 = new Date(j7);
                            String str20 = "date1chem127";
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
                                editor3.putString("scorechem121", str14);
                                editor3.putLong(str12, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str21 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorechem122", str21);
                                    editor3.putLong("date1chem122", l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorechem123", str21);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorechem124", str21);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorechem125", str21);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorechem126", str21);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorechem127", str21);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorechem128", str21);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorechem129", str21);
                                    editor3.putLong(str11, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorechem1210", str21);
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
                            long j18 = defaultSharedPreferences.getLong("datechem1210", 0);
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
                                editor4.putString("iScorechem121", str13);
                                editor4.putLong(str22, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str30 = str13;
                                if (date24.compareTo(date13) == 0) {
                                    editor4.putString("iScorechem122", str30);
                                    editor4.putLong(str23, l.longValue());
                                } else if (date24.compareTo(date14) == 0) {
                                    editor4.putString("iScorechem123", str30);
                                    editor4.putLong(str29, l.longValue());
                                } else if (date24.compareTo(date15) == 0) {
                                    editor4.putString("iScorechem124", str30);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date24.compareTo(date16) == 0) {
                                    editor4.putString("iScorechem125", str30);
                                    editor4.putLong(str28, l.longValue());
                                } else if (date24.compareTo(date23) == 0) {
                                    editor4.putString("iScorechem126", str30);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date24.compareTo(date18) == 0) {
                                    editor4.putString("iScorechem127", str30);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date24.compareTo(date20) == 0) {
                                    editor4.putString("iScorechem128", str30);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date24.compareTo(date21) == 0) {
                                    editor4.putString("iScorechem129", str30);
                                    editor4.putLong(str, l.longValue());
                                } else if (date24.compareTo(date22) == 0) {
                                    editor4.putString("iScorechem1210", str30);
                                    editor4.putLong("datechem1210", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            String str31 = "date1chem124";
                            String str32 = "date1chem123";
                            String str33 = str;
                            String str34 = str2;
                            String str35 = str3;
                            String str36 = str5;
                            String str37 = str6;
                            String str38 = str7;
                            String str39 = str8;
                            String str40 = str10;
                            String str41 = str11;
                            String str42 = "date1chem125";
                            String str43 = "date1chem126";
                            String str44 = "date1chem127";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 9000))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j19 = defaultSharedPreferences.getLong("date1chem121", 0);
                            String str45 = "date1chem121";
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
                            String str52 = "date1chem128";
                            long j25 = defaultSharedPreferences.getLong(str52, 0);
                            long j26 = defaultSharedPreferences.getLong(str41, 0);
                            long j27 = defaultSharedPreferences.getLong(str40, 0);
                            Date date25 = new Date(j19);
                            Date date26 = new Date(defaultSharedPreferences.getLong("date1chem122", 0));
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
                                editor2.putString("scorechem121", str47);
                                editor2.putLong(str45, valueOf2.longValue());
                            } else {
                                String str55 = str47;
                                editor2 = editor5;
                                if (date36.compareTo(date26) == 0) {
                                    editor2.putString("scorechem122", str55);
                                    editor2.putLong("date1chem122", valueOf2.longValue());
                                } else if (date36.compareTo(date27) == 0) {
                                    editor2.putString("scorechem123", str55);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date36.compareTo(date28) == 0) {
                                    editor2.putString("scorechem124", str55);
                                    editor2.putLong(str49, valueOf2.longValue());
                                } else if (date36.compareTo(date29) == 0) {
                                    editor2.putString("scorechem125", str55);
                                    editor2.putLong(str50, valueOf2.longValue());
                                } else if (date36.compareTo(date30) == 0) {
                                    editor2.putString("scorechem126", str55);
                                    editor2.putLong(str51, valueOf2.longValue());
                                } else if (date36.compareTo(date31) == 0) {
                                    editor2.putString("scorechem127", str55);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date36.compareTo(date35) == 0) {
                                    editor2.putString("scorechem128", str55);
                                    editor2.putLong(str52, valueOf2.longValue());
                                } else if (date36.compareTo(date33) == 0) {
                                    editor2.putString("scorechem129", str55);
                                    editor2.putLong(str54, valueOf2.longValue());
                                } else if (date36.compareTo(date34) == 0) {
                                    editor2.putString("scorechem1210", str55);
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
                            long j38 = sharedPreferences3.getLong("datechem1210", 0);
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
                                editor.putString("iScorechem121", str46);
                                editor.putLong(str56, valueOf2.longValue());
                            } else {
                                String str69 = str46;
                                editor = editor7;
                                if (date47.compareTo(date38) == 0) {
                                    editor.putString("iScorechem122", str69);
                                    editor.putLong(str59, valueOf2.longValue());
                                } else if (date47.compareTo(date39) == 0) {
                                    editor.putString("iScorechem123", str69);
                                    editor.putLong(str61, valueOf2.longValue());
                                } else if (date47.compareTo(date40) == 0) {
                                    editor.putString("iScorechem124", str69);
                                    editor.putLong(str62, valueOf2.longValue());
                                } else if (date47.compareTo(date41) == 0) {
                                    editor.putString("iScorechem125", str69);
                                    editor.putLong(str64, valueOf2.longValue());
                                } else if (date47.compareTo(date42) == 0) {
                                    editor.putString("iScorechem126", str69);
                                    editor.putLong(str66, valueOf2.longValue());
                                } else if (date47.compareTo(date43) == 0) {
                                    editor.putString("iScorechem127", str69);
                                    editor.putLong(str35, valueOf2.longValue());
                                } else if (date47.compareTo(date44) == 0) {
                                    editor.putString("iScorechem128", str69);
                                    editor.putLong(str34, valueOf2.longValue());
                                } else if (date47.compareTo(date45) == 0) {
                                    editor.putString("iScorechem129", str69);
                                    editor.putLong(str68, valueOf2.longValue());
                                } else if (date47.compareTo(date46) == 0) {
                                    editor.putString("iScorechem1210", str69);
                                    editor.putLong("datechem1210", valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        chemistry2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2012.this.scr.setVisibility(8);
                chemistry2012.this.chr.stop();
                chemistry2012.this.toolbar.setVisibility(8);
                chemistry2012.this.Relative.setBackgroundColor(chemistry2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                chemistry2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2012.this.scr.setVisibility(0);
                chemistry2012.this.toolbar.setVisibility(0);
                chemistry2012.this.telegram_layout.setVisibility(8);
                chemistry2012.this.chr.start();
                chemistry2012.this.Relative.setBackgroundColor(chemistry2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chemistry2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chemistry2012.this.mInterstitialAd = null;
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
                chemistry2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
