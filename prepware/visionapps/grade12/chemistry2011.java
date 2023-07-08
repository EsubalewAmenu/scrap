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

public class chemistry2011 extends AppCompatActivity {
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
    private Boolean f495b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreChemistry2011;
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
    private Toolbar f496tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_chemistry2011);
        this.f495b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextChemistry2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_chemistry2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.c2011q1, C2719R.C2721drawable.c2011q1a, C2719R.C2721drawable.c2011q1b, C2719R.C2721drawable.c2011q1c, C2719R.C2721drawable.c2011q1d, "", "", "", "", "", "c", C2719R.C2721drawable.chem111e, 1, this.f495b));
        arrayList.add(new questions("2.", "What makes the phosphorus cycle different from the carbon and nitrogen cycles?", 0, 0, 0, 0, 0, "Carbon and nitrogen are found in the atmosphere in the gaseous state.", "Carbon and nitrogen are released at lower rate compared to phosphate salts.", "Phosphorus salts are released at higher rate compared to carbon and nitrogen cycles.", "Phosphorus is found in the atmosphere in the gaseous state.", "The rate at which phosphate salts are released is extremely slow compared to the nitrogen and carbon cycles. The phosphorus cycle primarily differs from nitrogen and carbon cycles in that phosphorus is not found in the gaseous state in the atmosphere while carbon and nitrogen are found in the gaseous state in the atmosphere.", "a", 0, 1, this.f495b));
        arrayList.add(new questions("3.", "Which of the following can function as both a Bronsted - Lowry acid and Bronsted-Lowry base?", 0, C2719R.C2721drawable.c2011q3a, C2719R.C2721drawable.c2011q3b, C2719R.C2721drawable.c2011q3c, C2719R.C2721drawable.c2011q3d, "", "", "", "", "", "d", C2719R.C2721drawable.chem113e, 1, this.f495b));
        arrayList.add(new questions("4.", "Which of the four colligative properties arises in systems where there is equilibrium between a liquid solution phase and a second liquid phase?", 0, 0, 0, 0, 0, "Vapor pressure lowering", "Osmotic pressure", "Freezing point depression", "Boiling point elevation", "Osmosis is the selective passage of solvent molecules through a porous membrane from the solvent side into the solution side. The pressure required to prevent osmosis is known as osmotic pressure and arises when the system is at equilibrium (the rate of solvent transfer is the same in both directions).", "b", 0, 1, this.f495b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.c2011q5, 0, 0, 0, 0, "Hydroxyl", "hydroxyl and carbonyl", "Carboxyl and ester", "Carboxyl and acetyl", "", "c", C2719R.C2721drawable.chem115e, 1, this.f495b));
        arrayList.add(new questions("6.", "", C2719R.C2721drawable.c2011q6, 0, 0, 0, 0, "X", "O", "Y", "Z", "", "a", C2719R.C2721drawable.chem116e, 1, this.f495b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.c2011q7, 0, 0, 0, 0, "I", "I and III", "I and IV", "II", "s- orbitals are spherical in shape.\n \t \tp - Orbitals are dumb-bell shaped.\n \t \td - Orbitals are double dumb bell shaped.\n \tl=0⇒s - Orbital, l=1⇒p-orbital\nl=2⇒d - Orbital, l=3⇒f-orbital\n", "d", 0, 1, this.f495b));
        arrayList.add(new questions("8.", "What is the first step in a scientific investigation?", 0, 0, 0, 0, 0, "Make observations", "Ask questions", "Do research", "Draw conclusions", "The steps in a scientific method are:-\n \t\tStep 1:- Observations and experiments.\n \t\tStep 2:- Data collection.\n \t\tStep 3:- Find patterns, trends and laws.\n \t\tStep 4:- Formulate and test hypothesis.\n \t\tStep 5:- Theory\n The hypothesis and theory should always be aligned with observations and experiments.\n", "a", 0, 1, this.f495b));
        arrayList.add(new questions("9.", "Which of the following is the SI measurement unit of electric current?", 0, 0, 0, 0, 0, "Watt", "Ampere", "Volt", "Coulomb", "Electric current is the basic physical quantity and its SI unit is ampere (A).", "b", 0, 1, this.f495b));
        arrayList.add(new questions("10.", "Which of the following is not a component of polysaccharides?", 0, 0, 0, 0, 0, "Glucose", "Cellulose", "Sucrose", "Glycogen", "Glucose is a monosaccharide, and cellulose and glycogen are polysaccharides. Sucrose is a disaccharide.", "b", 0, 1, this.f495b));
        arrayList.add(new questions("11.", "Nylon is a/an_____", 0, 0, 0, 0, 0, "Amide", "Peptide", "Polyester", "Polyamide", "Nylon is a synthetic fiber with the generic name polyamide. Nylon 66 is a condensation polymer of hexamethylene diamine and adipic acid. Nylon 6 is made from coprolactam.", "d", 0, 1, this.f495b));
        arrayList.add(new questions("12.", "The metal extracted from limestone, chalk and marble is______", 0, 0, 0, 0, 0, "Calcium", "Sodium", "Zinc", "Chromium", "The chemical formula of limestone, chalk and marble is CaCO_3, that is, it contains calcium.", "a", 0, 1, this.f495b));
        arrayList.add(new questions("13.", "Which one of the following is not a condensation polymer?", 0, 0, 0, 0, 0, "Nylon", "Polyamides", "Polyester", "Neoprene", "Nylon, polyamides and polyester are condensation polymers. Two poly functional molecules produce large polymers by the elimination of small molecules such as water.\nNeoprene is an addition polymer. Addition polymerization occurs when molecules containing multiple bonds polymerize.\n", "d", 0, 1, this.f495b));
        arrayList.add(new questions("14.", "Which of the following compounds does not contain both ionic and covalent bond?", 0, C2719R.C2721drawable.c2011q14a, C2719R.C2721drawable.c2011q14b, C2719R.C2721drawable.c2011q14c, C2719R.C2721drawable.c2011q14d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1114e, 1, this.f495b));
        arrayList.add(new questions("15.", "What aspect of the modern view of atomic structure was proved by Rutherford's gold foil experiment?", 0, 0, 0, 0, 0, "The charge on an alpha particle.", "The charge on an electron.", "The existence of the nucleus.", "The existence of electrons.", "Ernest Rutherford found that the majority of the alpha particles penetrating the gold foil remained undeflected showing that they passed through the empty space of the atom. Some showed slight deflection because they passed near a positive mass since like charges repel each other.\nA direct hit on the positive mass bounced the alpha particles back to their original path with a deflection. From these observations, Rutherford concluded that all the positive charge in the atom is concentrated in the center called the nucleus. Hence, Rutherford discovered the nucleus by the alpha scattering experiment.\n", "c", 0, 1, this.f495b));
        arrayList.add(new questions("16.", "Which of these compounds is Propanoic acid?", 0, C2719R.C2721drawable.c2011q16a, C2719R.C2721drawable.c2011q16b, C2719R.C2721drawable.c2011q16c, C2719R.C2721drawable.c2011q16d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1116e, 1, this.f495b));
        arrayList.add(new questions("17.", "Fats and oils can be classified as", 0, 0, 0, 0, 0, "carbohydrates", "esters", "acids", "alcohols", "Fats and oils are trimesters of glycerol (triglycerides) with three long chain fatty acids (carboxylic acids)", "b", 0, 1, this.f495b));
        arrayList.add(new questions("18.", "What does it mean by ΔH = negative for a given process?", 0, 0, 0, 0, 0, "The process is endothermic", "The process is equithermic", "The process is adiabatic ", "The process is exothermic", "d", "", C2719R.C2721drawable.chem1118e, 1, this.f495b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.c2011q19, 0, 0, 0, 0, "+7", "+3", "+5", "+1", "", "a", C2719R.C2721drawable.chem1119e, 1, this.f495b));
        arrayList.add(new questions("20.", "Which substance is used to lower the melting point of aluminum oxide ore in the electrolytic extraction of aluminum?", 0, 0, 0, 0, 0, "Hematite", "Bauxite", "Cryolite", "Magnetite", "", "c", C2719R.C2721drawable.chem1120e, 1, this.f495b));
        arrayList.add(new questions("21.", "Which one of the following type of bonding exists between atoms with very different electro negativities?", 0, 0, 0, 0, 0, "Metallic bonding", "Hydrogen bonding", "Ionic bonding", "Network covalent bonding", "Ionic bonding occurs between atoms of high ionization energy (nonmetals) and low electron affinity (metals). Moreover, non-metals have high electronegativity & metals have low electronegativity.\nMetallic bonding occurs between metallic cations and free electrons within the metal.\nHydrogen bonding occurs when hydrogen is bonded to the three most electronegative atoms F,O and N.\nNetwork covalent bonding occurs among atoms of the same element. \nFor example: diamond has network covalent bond of carbon atoms.\n", "c", 0, 1, this.f495b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.c2011q22, 0, 0, 0, 0, "Al", ExifInterface.LATITUDE_SOUTH, "P", "Si", "b", "", C2719R.C2721drawable.chem1122e, 1, this.f495b));
        arrayList.add(new questions("23.", "Consider the following two possibilities for electron transfer in a hydrogen atom, given below:\nFirst: The electron drops from the Bohr orbit n=3 to the orbit n=2 Followed by the transition from n=2 to n=1\nSecond: The electron drops from the Bohr orbit n=3 directly to the orbit n=1\nWhich of the following is correct about the energy change of these transitions?\n", 0, 0, 0, 0, 0, "The sum of the energies for the first transitions is less than the energy of transition of the second.", "The sum of the energies for the first transitions is greater than the energy of transition of the second.", "The sum of the energies for the first transitions is equal to the energy of transition of the second.", "The energies of transitions of the first and the energy of transition of the second can't be compared.", "c", "", C2719R.C2721drawable.chem1123e, 1, this.f495b));
        arrayList.add(new questions("24.", "Precision refers to", 0, 0, 0, 0, 0, "How close a measured number is to the true value.", "How close a measured number is to other measured numbers", "How close a measured number is to zero.", "how close a measured number is to the calculated value.", "- Precision is the agreement or closeness among several measurements of the same quantity.\n-\tAccuracy is the extent to which a measured value coincides with the - true value of the quantity measured.\n", "b", 0, 1, this.f495b));
        arrayList.add(new questions("25.", "Which of the following is the correct reaction taking place at the electrodes during the electrolysis of dilute sodium chloride solution?", 0, C2719R.C2721drawable.c2011q25a, C2719R.C2721drawable.c2011q25b, C2719R.C2721drawable.c2011q25c, C2719R.C2721drawable.c2011q25d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1125e, 1, this.f495b));
        arrayList.add(new questions("26.", "When a saturated solution of sodium chloride is heated, it becomes", 0, 0, 0, 0, 0, "Unsaturated", "remains saturated", "Attains equilibrium conditions", "Supersaturated", "A solution is said to be at equilibrium if dissolution and crystallization are at equilibrium.\nBefore equilibrium is reached, the solution is said to be unsaturated. A supersaturated solution can be prepared by heating a saturated solution to a high temperature. \n", "d", 0, 1, this.f495b));
        arrayList.add(new questions("27.", "The pH of a solution prepared by the addition of 100mL 0.002MHCl to 100mL distilled water is closest to:", 0, 0, 0, 0, 0, "1.0", "3.0", "2.0", "1.5", "", "b", C2719R.C2721drawable.chem1127e, 1, this.f495b));
        arrayList.add(new questions("28.", "Hydrolysis of ester leads to the formation of which of the following products in basic medium?", 0, 0, 0, 0, 0, "Ether and alcohol", "Aldehyde and alcohol", "Sodium carboxylate", "Alcohol & sodium carboxylate", "", "d", C2719R.C2721drawable.chem1128e, 1, this.f495b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.c2011q29, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "d", C2719R.C2721drawable.chem1129e, 1, this.f495b));
        arrayList.add(new questions("30.", "", C2719R.C2721drawable.c2011q30, 0, 0, 0, 0, "I", "II", "IV", "III", "", "d", C2719R.C2721drawable.chem1130e, 1, this.f495b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.c2011q31, 0, 0, 0, 0, "There are no resonance structures that involve ionic contributions.", "In each resonance structure, the P atom carries a positive charge.", "Only three resonance structures can be drawn for PF5.", "One resonance structure contains five P.F bonds.", "", "a", C2719R.C2721drawable.chem1131e, 1, this.f495b));
        arrayList.add(new questions("32.", "4L Of 0.02M of aqueous solution of NaCl is diluted with 1L of water. What is the molarity of the solution?", 0, 0, 0, 0, 0, "0.016", "0.008", "0.012", "0.004", "", "a", C2719R.C2721drawable.chem1132e, 1, this.f495b));
        arrayList.add(new questions("33.", "How much water, in liters, must be added to 0.50 liter of 6.0MHCl to make the solution 2.0M ?", 0, 0, 0, 0, 0, "0.50", "1.5", "1.0", "2.0", "", "b", C2719R.C2721drawable.chem1133e, 1, this.f495b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.c2011q34, 0, 0, 0, 0, "2.89", "11.11", "9.24", "4.76", "", "b", C2719R.C2721drawable.chem1134e, 1, this.f495b));
        arrayList.add(new questions("35.", "Which groups in the periodic table form ionic bonds?", 0, 0, 0, 0, 0, "Groups 1(1A) & 17(7A), Groups 2(2A) & 16(6A)", "Groups 1(1A) & 7(7B), Groups 2(2A) & 6(6B)", "Groups 1(1A) & 18(8A), Groups 4(4B) & 14(4A)", "Groups 3(3B) & 5(5B), Groups 4(4B) & 14(4A)", "Ionic bond is formed between atoms of low electron affinity (or\n \t   Low electro negativity) and high ionization energy.\n   \t- Group IA have low electron affinity or electro negativity and Group\n \t   VIIA have high ionization energy and can form ionic bonds. \nExample: NaF\n \t- Group IIA have low electron affinity or electro negativity and Group\n \t   VIA have low ionization energy and can form ionic bonds. \n", "a", 0, 1, this.f495b));
        arrayList.add(new questions("36.", "", C2719R.C2721drawable.c2011q36, 0, 0, 0, 0, "Increasing electronegativity of the central atom.", "Decreasing bond strength.", "Decreasing size of the central atom.", "Increasing number of lone pair electrons.", "", "d", C2719R.C2721drawable.chem1136e, 1, this.f495b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.c2011q37, C2719R.C2721drawable.c2011q37a, C2719R.C2721drawable.c2011q37b, C2719R.C2721drawable.c2011q37c, C2719R.C2721drawable.c2011q37d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1137e, 1, this.f495b));
        arrayList.add(new questions("38.", "The appropriate unit for a first order rate constant are?", 0, 0, 0, 0, C2719R.C2721drawable.c2011q38d, "M/s", "1/Ms", "1/s", "", "", "c", C2719R.C2721drawable.chem1138e, 1, this.f495b));
        arrayList.add(new questions("39.", "The molar equilibrium concentrations for the reaction mixture represented above at 298\" \" K are [X]=4.0M,[Y]=5.0M and[Z]=2.0M. What is the value of the equilibrium constant,K, for the reaction at 298K ?", 0, 0, 0, 0, 0, "0.06", "16.0", "2.50", "62.5", "", "b", C2719R.C2721drawable.chem1139e, 1, this.f495b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.c2011q40, 0, 0, 0, 0, "3-methylpentanoic acid", "2-methylpentanoic acid", "2,2 –dimethyl butanoic acid", "3,3 –dimethyl butanoic acid.", "", "d", C2719R.C2721drawable.chem1140e, 1, this.f495b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.c2011q41, 0, 0, 0, 0, "0.057M", "0.0057M", "0.57M", "5.70M", "", "a", C2719R.C2721drawable.chem1141e, 1, this.f495b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.c2011q42, 0, 0, 0, 0, "4.84g", "4.17g", "6.32g", "11.71g", "", "n", C2719R.C2721drawable.chem1142e, 1, this.f495b));
        arrayList.add(new questions("43.", "In which of the following cases will the dissolution of sugar be the most rapid?", 0, 0, 0, 0, 0, "Sugar crystals in hot water.", "Powdered sugar in cold water.", "Sugar crystals in cold water", "Powdered sugar in hot water.", "The solubility of most solids and liquid substances in a liquid solvent such as water increases with increasing temperature. Powdered sugar is more rapidly dissolved in hot water than sugar crystals because it has larger surface area. An increase in the surface area of the solute (solid) increases the rate of dissolution.", "d", 0, 1, this.f495b));
        arrayList.add(new questions("44.", "Which one of the following statements regarding a dynamic equilibrium false?", 0, 0, 0, 0, 0, "At equilibrium, there is no net change in the system.", "At equilibrium, the rates of the forward and reverse reactions are identical.", "At equilibrium, the forward and reverse reactions cease to occur.", "At equilibrium, the concentration of reactants and products stays the same.", "At dynamic equilibrium,\n-\tThere is no net change in the system (no change in temperature, volume, concentration and pressure with time)\n-\tThe rates of the forward and reverse reactions are equal.\n-\tThere is no net change in the concentration of the reactants and products.\n-\tThe forward and reverse reactions do not stop.\n", "c", 0, 1, this.f495b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.c2011q45, C2719R.C2721drawable.c2011q45a, C2719R.C2721drawable.c2011q45b, C2719R.C2721drawable.c2011q45c, C2719R.C2721drawable.c2011q45d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1145e, 1, this.f495b));
        arrayList.add(new questions("46.", "The minimum energy required for an effective collision is called", 0, 0, 0, 0, 0, "Potential energy", "Free energy", "Activation energy", "Kinetic energy", "The minimum energy required for a reaction to occur and for effective collision of the reacting species is called activation energy.", "c", 0, 1, this.f495b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.c2011q47, C2719R.C2721drawable.c2011q47a, C2719R.C2721drawable.c2011q47b, C2719R.C2721drawable.c2011q47c, C2719R.C2721drawable.c2011q47d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1147e, 1, this.f495b));
        arrayList.add(new questions("48.", "Which of the following statements is correct about nitrosyl chloride (NOCl)?", 0, 0, 0, 0, 0, "It has a bent or angular geometry with O a central atom.", "It has a bent or angular geometry with N a central atom.", "It has a trigonal planar geometry with N a central atom.", "It has a trigonal planar geometry with 0 a central atom.", "", "b", C2719R.C2721drawable.chem1148e, 1, this.f495b));
        arrayList.add(new questions("49.", "Which of the following is not true about the photoelectric effect?", 0, 0, 0, 0, 0, "Most metals require ultraviolet light to emit electrons.", "A bright light causes more electrons to be emitted than a weak light.", "A bright light causes less electrons to be emitted than a weak light.", "Higher frequency light emits electrons with higher kinetic energy.", "Light shining on a clean metallic surface can cause the surface to emit electrons known as the photoelectric effect. The higher the frequency of the light, the greater will be the kinetic energy of the emitted electrons. The more intense the light the greater the number of electrons emitted by the target metal.", "c", 0, 1, this.f495b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.c2011q50, 0, 0, 0, 0, "I only", "I, III", "I, II", "II,IV", "", "c", C2719R.C2721drawable.chem1150e, 1, this.f495b));
        arrayList.add(new questions("51.", "", C2719R.C2721drawable.c2011q51, C2719R.C2721drawable.c2011q51a, C2719R.C2721drawable.c2011q51b, C2719R.C2721drawable.c2011q51c, C2719R.C2721drawable.c2011q51d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1151e, 1, this.f495b));
        arrayList.add(new questions("52.", "The sublevel that can be occupied by a maximum of 10 electrons is identified by the letter", 0, 0, 0, 0, 0, "s", "f", "p", "d", "The maximum number of electrons occupied by the sublevels are:\n  \ts-2 electrons\n \td-10 electrons\n \tp-6 electrons\n \tf - 14 electrons\n", "d", 0, 1, this.f495b));
        arrayList.add(new questions("53.", "", C2719R.C2721drawable.c2011q53, 0, 0, 0, 0, "Square planar", "T-shaped", "Octahedral", "Trigonal bi pyramidal", "", "a", C2719R.C2721drawable.chem1153e, 1, this.f495b));
        arrayList.add(new questions("54.", "", C2719R.C2721drawable.c2011q54, C2719R.C2721drawable.c2011q54a, C2719R.C2721drawable.c2011q54b, C2719R.C2721drawable.c2011q54c, 0, "", "", "", "No hybridization change observed", "", "c", C2719R.C2721drawable.chem1154e, 1, this.f495b));
        arrayList.add(new questions("55.", "A chemist creates a buffer solution by mixing equal volumes of a 0.2 molar HOCl solution and a 0.2 molar KOCl solution. Which of the following will occur when a small amount of KOH is added to the solution?\n\tI. The concentration of undissociated HOCl will increase.\n\tII. The concentration of OCl^-ions will increase.\n\tIII. The concentration of H^+ions will increase.\n", 0, 0, 0, 0, 0, "II only", "I only", "III only", "I & III only", "", "a", C2719R.C2721drawable.chem1155e, 1, this.f495b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.c2011q56, 0, 0, 0, 0, "400KJ", "-200KJ", "200KJ", "-500KJ ", "", "d", C2719R.C2721drawable.chem1156e, 1, this.f495b));
        arrayList.add(new questions("57.", "Features common to both galvanic and electrolytic cells include which of the following?\nI. Oxidation at the anode.\nII. Can perform electrolysis\nIII. Spontaneous\n", 0, 0, 0, 0, 0, "II only", "I only", "III only", "I and II only", "Oxidation always takes place at the anode and reduction always takes place at the cathode in both galvanic and electrolytic cells. Electrolysis occurs in electrolytic cells and the reaction is non-spontaneous. The reaction is spontaneous in galvanic cells. Cathode is negative and anode is positive in electrolytic cells, and cathode is positive and anode is negative in galvanic cells.", "b", 0, 1, this.f495b));
        arrayList.add(new questions("58.", "Which of the following reactions is not involved in the contact process, during the production of sulfuric acid?", 0, C2719R.C2721drawable.c2011q58a, C2719R.C2721drawable.c2011q58b, C2719R.C2721drawable.c2011q58c, C2719R.C2721drawable.c2011q58d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1158e, 1, this.f495b));
        arrayList.add(new questions("59.", "", C2719R.C2721drawable.c2011q59, 0, 0, 0, 0, "X is thermoplastic whereas Y is thermosetting", "X is thermosetting and Y is themoplastic", "X and Y are thermosetting", "X and Y are thermoplastic", "Thermoplastic polymers have linear or branched structure. They have no cross-links. They melt and flow up on heating. Thermosetting polymers have highly cross-linked structures and they are not affected by heat below the temperature at which they decompose. x is thermoplastic and y is thermosetting.", "a", 0, 1, this.f495b));
        arrayList.add(new questions("60.", "The energy of an electron in the first Bohr orbit of hydrogen atom is 13.6eV. The possible value of the excited state for electron in Bohr orbits of hydrogen is_______", 0, 0, 0, 0, 0, "-6.8eV", "-1.51eV", "-4.21eV", "+6.8eV", "As an electron excites, it absorbs energy and the energy of the electron will have a positive value in excited state. ⇒+6.8eV", "d", 0, 1, this.f495b));
        arrayList.add(new questions("61.", "What is the basis for the Scientific-Method?", 0, 0, 0, 0, 0, "To formulate a research problem and disprove the hypothesis.", "To formulate a research problem, test the hypothesis under carefully controlled conditions that challenge the hypothesis.", "To test hypothesis in conditions that are favorable to their success.", "To test hypotheses and if they are disproved, they should be abandoned completely.", "In the scientific method, a research problem is formulated and hypothesis is made based on observations and experiments. A well tested hypothesis becomes a theory.", "b", 0, 1, this.f495b));
        arrayList.add(new questions("62.", "For which of the following half-cells is the reduction potential E independent of the pH of the solution?", 0, C2719R.C2721drawable.c2011q62a, C2719R.C2721drawable.c2011q62b, C2719R.C2721drawable.c2011q62c, C2719R.C2721drawable.c2011q62d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1162e, 1, this.f495b));
        arrayList.add(new questions("63.", "A certain current produces 0.50g of hydrogen gas in 2.0 hrs. What is the amount of copper librated from a solution of copper sulfate by the same current flowing for the same time?", 0, 0, 0, 0, 0, "31.8g", "15.9g", "63.6g", "6.36g", "", "b", C2719R.C2721drawable.chem1163e, 1, this.f495b));
        arrayList.add(new questions("64.", "", C2719R.C2721drawable.c2011q64, 0, 0, 0, 0, "I only", "II and III ", "II only", "I,II,III", "", "b", C2719R.C2721drawable.chem1164e, 1, this.f495b));
        arrayList.add(new questions("65.", "", C2719R.C2721drawable.c2011q65, 0, 0, 0, 0, "1.58g", "3.16g", "2.98g", "3.95g", "", "a", C2719R.C2721drawable.chem1165e, 1, this.f495b));
        arrayList.add(new questions("66.", "", C2719R.C2721drawable.c2011q66, 0, 0, 0, 0, "6.68", "3.34", "10.02", "13.36", "", "n", C2719R.C2721drawable.chem1166e, 1, this.f495b));
        arrayList.add(new questions("67.", "", C2719R.C2721drawable.c2011q67, 0, 0, 0, 0, "Ni", "Cu", "Ag", "Mg", "In electroplating, the plating metal is the anode. The anode is one having less positive reduction potential and hence less tendency of reduction and more tendency of oxidation. Silver (Ag) has high positive reduction potential and hence high tendency of reduction and less tendency of oxidation. Hence, the electrolyte should be a salt solution of the plating metal (AgNO_3 ┤ solution) for silver to be plating metal.", "c", 0, 1, this.f495b));
        arrayList.add(new questions("68.", "", C2719R.C2721drawable.c2011q68, 0, 0, 0, 0, "-1.3 degree Celsius", "-6.5 degree Celsius", "-9.0 degree Celsius", "-13 degree Celsius", "", "n", C2719R.C2721drawable.chem1168e, 1, this.f495b));
        arrayList.add(new questions("69.", "Which of the following compounds is the least soluble in water?", 0, C2719R.C2721drawable.c2011q69a, C2719R.C2721drawable.c2011q69b, C2719R.C2721drawable.c2011q69c, C2719R.C2721drawable.c2011q69d, "", "", "", "", "", "c", C2719R.C2721drawable.chem1169e, 1, this.f495b));
        arrayList.add(new questions("70.", "", C2719R.C2721drawable.c2011q70, C2719R.C2721drawable.c2011q70a, C2719R.C2721drawable.c2011q70b, C2719R.C2721drawable.c2011q70c, C2719R.C2721drawable.c2011q70d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1170e, 1, this.f495b));
        arrayList.add(new questions("71.", "Which of the following molecules has the largest dipole moment?", 0, 0, 0, 0, 0, "CO", "HCN", "HF", "HCl", "", "c", C2719R.C2721drawable.chem1171e, 1, this.f495b));
        arrayList.add(new questions("72.", "Arrange the following molecules in the order of increasing stability.", 0, C2719R.C2721drawable.c2011q72a, C2719R.C2721drawable.c2011q72b, C2719R.C2721drawable.c2011q72c, C2719R.C2721drawable.c2011q72d, "", "", "", "", "", "a", C2719R.C2721drawable.chem1172e, 1, this.f495b));
        arrayList.add(new questions("73.", "", C2719R.C2721drawable.c2011q73, 0, 0, 0, 0, "NO, appears at twice the rate that NOCI disappears.", "NO, appears at the same rate that NOCI disappears.", "NO, appears at half the rate that NOCI disappears.", "Cl2, appears at the same rate that NOCl disappears.", "", "b", C2719R.C2721drawable.chem1173e, 1, this.f495b));
        arrayList.add(new questions("74.", "", C2719R.C2721drawable.c2011q74, 0, 0, 0, 0, "Melting point", "Boiling point", "Triple point", "Vaporization point", "Triple point is the point at which all the three (states (phases) of a substance, that is, solid, liquid and gas coexist in equilibrium at a fixed pressure and temperature.", "c", 0, 1, this.f495b));
        arrayList.add(new questions("75.", "During esterification of carboxylic acid with alcohol which bond of carboxylic acid undergoes cleavage?", 0, 0, 0, 0, 0, "0-H", "C=0", "C-O", "C-C", "", "c", C2719R.C2721drawable.chem1175e, 1, this.f495b));
        arrayList.add(new questions("76.", "If 49 grams of H2SO4 react with 80.0 grams of NaOH, how much reactant will be left over after the reaction is complete?", 0, 0, 0, 0, 0, "24.5 gH2SO4", "20.0 gNaOH", "60.0 gNaOH", "40.0 gNaOH", "", "d", C2719R.C2721drawable.chem1176e, 1, this.f495b));
        arrayList.add(new questions("77.", "What is the change in internal energy of a system that releases 12.4J of heat and does 4.2 J of work on the surroundings", 0, 0, 0, 0, 0, "16.6J", "-16.6J", "8.2J", "-8.2J", "", "b", C2719R.C2721drawable.chem1177e, 1, this.f495b));
        arrayList.add(new questions("78.", "Which one of the following is true?", 0, 0, 0, 0, 0, "Entropy increases when a liquid freezes at its melting point.", "For a spontaneous process ΔG>0.", "For spontaneous process ΔS>0.", "Entropy of the pure crystalline solid is zero at 0 degree C.", "Freezing is changing from liquid to solid and entropy decreases.\n \t \tSolid < liquid < gas in entropy\n \t\tΔG<0 for spontaneous process\n \t\tΔS>0 for spontaneous process\n \t\tΔS=0 and ΔG=0 for equilibrium process.\n", "c", 0, 1, this.f495b));
        arrayList.add(new questions("79.", "Which of the following has the same number of significant figures as the number 1.00310 ?", 0, 0, C2719R.C2721drawable.c2011q79b, 0, 0, "100", "", "5.119", "199.791", "", "d", C2719R.C2721drawable.chem1179e, 1, this.f495b));
        arrayList.add(new questions("80.", "When an electron in a hydrogen atom makes the transition from the n=4 state to the n=2 state, blue light with a wavelength of 434nm is emitteed. Which of the following expressions gives the energy released by the transition?", 0, C2719R.C2721drawable.c2011q80a, C2719R.C2721drawable.c2011q80b, C2719R.C2721drawable.c2011q80c, C2719R.C2721drawable.c2011q80d, "", "", "", "", "", "b", C2719R.C2721drawable.chem1180e, 1, this.f495b));
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
        this.f496tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(150), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    chemistry2011.this.timer.setVisibility(0);
                    chemistry2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    chemistry2011.this.scr.setVisibility(8);
                    chemistry2011.this.chr.stop();
                    chemistry2011.this.toolbar.setVisibility(8);
                    chemistry2011.this.Relative.setBackgroundColor(-7829368);
                    chemistry2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2011.this.getBaseContext());
                    int unused = chemistry2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = chemistry2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = chemistry2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = chemistry2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = chemistry2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = chemistry2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = chemistry2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = chemistry2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = chemistry2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = chemistry2011.this.highscoreChemistry2011 = defaultSharedPreferences.getInt("chem2011hs", 0);
                    int access$600 = chemistry2011.this.part1 + chemistry2011.this.part2 + chemistry2011.this.part3 + chemistry2011.this.part4 + chemistry2011.this.part5 + chemistry2011.this.part6 + chemistry2011.this.part7 + chemistry2011.this.part8 + chemistry2011.this.part9;
                    TextView access$1600 = chemistry2011.this.resultText;
                    access$1600.setText(access$600 + "/80");
                    chemistry2011.this.progressbar.setProgress(access$600);
                    chemistry2011.this.progressbar.setMax(80);
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
                    int unused11 = chemistry2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = chemistry2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = chemistry2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = chemistry2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = chemistry2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = chemistry2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = chemistry2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = chemistry2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "chem2011hs";
                    int unused19 = chemistry2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = chemistry2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = chemistry2011.this.answered1 + chemistry2011.this.answered2 + chemistry2011.this.answered3 + chemistry2011.this.answered4 + chemistry2011.this.answered5 + chemistry2011.this.answered6 + chemistry2011.this.answered7 + chemistry2011.this.answered8 + chemistry2011.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > chemistry2011.this.highscoreChemistry2011) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - ((SystemClock.elapsedRealtime() - chemistry2011.this.chr.getBase()) / 1000)) * 3600) / 9000))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1chem111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1chem112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1chem113", 0);
                    long j4 = defaultSharedPreferences.getLong("date1chem114", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1chem115", 0);
                    long j6 = defaultSharedPreferences.getLong("date1chem116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1chem117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1chem118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1chem119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1chem1110", 0);
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
                        editor.putString("scorechem111", str2);
                        editor.putLong("date1chem111", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorechem112", str3);
                            editor.putLong("date1chem112", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorechem113", str3);
                            editor.putLong("date1chem113", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorechem114", str3);
                            editor.putLong("date1chem114", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorechem115", str3);
                            editor.putLong("date1chem115", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorechem116", str3);
                            editor.putLong("date1chem116", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorechem117", str3);
                            editor.putLong("date1chem117", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorechem118", str3);
                            editor.putLong("date1chem118", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorechem119", str3);
                            editor.putLong("date1chem119", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorechem1110", str3);
                            editor.putLong("date1chem1110", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datechem111", 0);
                    long j12 = defaultSharedPreferences.getLong("datechem112", 0);
                    long j13 = defaultSharedPreferences.getLong("datechem113", 0);
                    long j14 = defaultSharedPreferences.getLong("datechem114", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datechem115", 0);
                    long j16 = defaultSharedPreferences.getLong("datechem116", 0);
                    long j17 = defaultSharedPreferences.getLong("datechem117", 0);
                    long j18 = defaultSharedPreferences.getLong("datechem118", 0);
                    long j19 = defaultSharedPreferences.getLong("datechem119", 0);
                    long j20 = defaultSharedPreferences.getLong("datechem1110", 0);
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
                        editor2.putString("iScorechem111", f);
                        editor2.putLong("datechem111", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorechem112", f);
                            editor2.putLong("datechem112", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorechem113", f);
                            editor2.putLong("datechem113", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorechem114", f);
                            editor2.putLong("datechem114", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorechem115", f);
                            editor2.putLong("datechem115", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorechem116", f);
                            editor2.putLong("datechem116", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorechem117", f);
                            editor2.putLong("datechem117", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorechem118", f);
                            editor2.putLong("datechem118", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorechem119", f);
                            editor2.putLong("datechem119", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorechem1110", f);
                            editor2.putLong("datechem1110", valueOf.longValue());
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
                        chemistry2011.this.scr.setVisibility(8);
                        chemistry2011.this.chr.stop();
                        chemistry2011.this.toolbar.setVisibility(8);
                        chemistry2011.this.Relative.setBackgroundColor(-7829368);
                        chemistry2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(chemistry2011.this.getBaseContext());
                        int unused = chemistry2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = chemistry2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = chemistry2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = chemistry2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = chemistry2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = chemistry2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = chemistry2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = chemistry2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = chemistry2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = chemistry2011.this.highscoreChemistry2011 = defaultSharedPreferences.getInt("chem2011hs", 0);
                        int access$600 = chemistry2011.this.part1 + chemistry2011.this.part2 + chemistry2011.this.part3 + chemistry2011.this.part4 + chemistry2011.this.part5 + chemistry2011.this.part6 + chemistry2011.this.part7 + chemistry2011.this.part8 + chemistry2011.this.part9;
                        TextView access$1600 = chemistry2011.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        chemistry2011.this.progressbar.setProgress(access$600);
                        chemistry2011.this.progressbar.setMax(80);
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
                        int unused11 = chemistry2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = chemistry2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = chemistry2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = chemistry2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = chemistry2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = chemistry2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = chemistry2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = chemistry2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = chemistry2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = chemistry2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = chemistry2011.this.answered1 + chemistry2011.this.answered2 + chemistry2011.this.answered3 + chemistry2011.this.answered4 + chemistry2011.this.answered5 + chemistry2011.this.answered6 + chemistry2011.this.answered7 + chemistry2011.this.answered8 + chemistry2011.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > chemistry2011.this.highscoreChemistry2011) {
                            edit.putInt("chem2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - chemistry2011.this.chr.getBase()) / 1000;
                        String str = "datechem119";
                        String str2 = "datechem118";
                        String str3 = "datechem117";
                        String str4 = "datechem116";
                        String str5 = "datechem115";
                        String str6 = "datechem114";
                        String str7 = "datechem113";
                        String str8 = "datechem112";
                        String str9 = "datechem111";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1chem1110";
                        String str11 = "date1chem119";
                        if (chemistry2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((9000 - elapsedRealtime) * 3600) / 9000))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1chem111", 0);
                            String str12 = "date1chem111";
                            String str13 = f;
                            long j2 = defaultSharedPreferences.getLong("date1chem112", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1chem113", 0);
                            long j4 = defaultSharedPreferences.getLong("date1chem114", 0);
                            String str15 = "date1chem114";
                            String str16 = "date1chem113";
                            String str17 = "date1chem115";
                            long j5 = defaultSharedPreferences.getLong("date1chem115", 0);
                            long j6 = defaultSharedPreferences.getLong("date1chem117", 0);
                            String str18 = "date1chem116";
                            String str19 = "date1chem118";
                            long j7 = defaultSharedPreferences.getLong("date1chem118", 0);
                            long j8 = defaultSharedPreferences.getLong(str11, 0);
                            long j9 = defaultSharedPreferences.getLong(str10, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(defaultSharedPreferences.getLong("date1chem116", 0));
                            Date date7 = new Date(j6);
                            Date date8 = new Date(j7);
                            String str20 = "date1chem117";
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
                                editor3.putString("scorechem111", str14);
                                editor3.putLong(str12, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str21 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorechem112", str21);
                                    editor3.putLong("date1chem112", l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorechem113", str21);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorechem114", str21);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorechem115", str21);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorechem116", str21);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorechem117", str21);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorechem118", str21);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorechem119", str21);
                                    editor3.putLong(str11, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorechem1110", str21);
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
                            long j18 = defaultSharedPreferences.getLong("datechem1110", 0);
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
                                editor4.putString("iScorechem111", str13);
                                editor4.putLong(str22, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str30 = str13;
                                if (date24.compareTo(date13) == 0) {
                                    editor4.putString("iScorechem112", str30);
                                    editor4.putLong(str23, l.longValue());
                                } else if (date24.compareTo(date14) == 0) {
                                    editor4.putString("iScorechem113", str30);
                                    editor4.putLong(str29, l.longValue());
                                } else if (date24.compareTo(date15) == 0) {
                                    editor4.putString("iScorechem114", str30);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date24.compareTo(date16) == 0) {
                                    editor4.putString("iScorechem115", str30);
                                    editor4.putLong(str28, l.longValue());
                                } else if (date24.compareTo(date23) == 0) {
                                    editor4.putString("iScorechem116", str30);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date24.compareTo(date18) == 0) {
                                    editor4.putString("iScorechem117", str30);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date24.compareTo(date20) == 0) {
                                    editor4.putString("iScorechem118", str30);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date24.compareTo(date21) == 0) {
                                    editor4.putString("iScorechem119", str30);
                                    editor4.putLong(str, l.longValue());
                                } else if (date24.compareTo(date22) == 0) {
                                    editor4.putString("iScorechem1110", str30);
                                    editor4.putLong("datechem1110", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            String str31 = "date1chem114";
                            String str32 = "date1chem113";
                            String str33 = str;
                            String str34 = str2;
                            String str35 = str3;
                            String str36 = str5;
                            String str37 = str6;
                            String str38 = str7;
                            String str39 = str8;
                            String str40 = str10;
                            String str41 = str11;
                            String str42 = "date1chem115";
                            String str43 = "date1chem116";
                            String str44 = "date1chem117";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 9000))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j19 = defaultSharedPreferences.getLong("date1chem111", 0);
                            String str45 = "date1chem111";
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
                            String str52 = "date1chem118";
                            long j25 = defaultSharedPreferences.getLong(str52, 0);
                            long j26 = defaultSharedPreferences.getLong(str41, 0);
                            long j27 = defaultSharedPreferences.getLong(str40, 0);
                            Date date25 = new Date(j19);
                            Date date26 = new Date(defaultSharedPreferences.getLong("date1chem112", 0));
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
                                editor2.putString("scorechem111", str47);
                                editor2.putLong(str45, valueOf2.longValue());
                            } else {
                                String str55 = str47;
                                editor2 = editor5;
                                if (date36.compareTo(date26) == 0) {
                                    editor2.putString("scorechem112", str55);
                                    editor2.putLong("date1chem112", valueOf2.longValue());
                                } else if (date36.compareTo(date27) == 0) {
                                    editor2.putString("scorechem113", str55);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date36.compareTo(date28) == 0) {
                                    editor2.putString("scorechem114", str55);
                                    editor2.putLong(str49, valueOf2.longValue());
                                } else if (date36.compareTo(date29) == 0) {
                                    editor2.putString("scorechem115", str55);
                                    editor2.putLong(str50, valueOf2.longValue());
                                } else if (date36.compareTo(date30) == 0) {
                                    editor2.putString("scorechem116", str55);
                                    editor2.putLong(str51, valueOf2.longValue());
                                } else if (date36.compareTo(date31) == 0) {
                                    editor2.putString("scorechem117", str55);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date36.compareTo(date35) == 0) {
                                    editor2.putString("scorechem118", str55);
                                    editor2.putLong(str52, valueOf2.longValue());
                                } else if (date36.compareTo(date33) == 0) {
                                    editor2.putString("scorechem119", str55);
                                    editor2.putLong(str54, valueOf2.longValue());
                                } else if (date36.compareTo(date34) == 0) {
                                    editor2.putString("scorechem1110", str55);
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
                            long j38 = sharedPreferences3.getLong("datechem1110", 0);
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
                                editor.putString("iScorechem111", str46);
                                editor.putLong(str56, valueOf2.longValue());
                            } else {
                                String str69 = str46;
                                editor = editor7;
                                if (date47.compareTo(date38) == 0) {
                                    editor.putString("iScorechem112", str69);
                                    editor.putLong(str59, valueOf2.longValue());
                                } else if (date47.compareTo(date39) == 0) {
                                    editor.putString("iScorechem113", str69);
                                    editor.putLong(str61, valueOf2.longValue());
                                } else if (date47.compareTo(date40) == 0) {
                                    editor.putString("iScorechem114", str69);
                                    editor.putLong(str62, valueOf2.longValue());
                                } else if (date47.compareTo(date41) == 0) {
                                    editor.putString("iScorechem115", str69);
                                    editor.putLong(str64, valueOf2.longValue());
                                } else if (date47.compareTo(date42) == 0) {
                                    editor.putString("iScorechem116", str69);
                                    editor.putLong(str66, valueOf2.longValue());
                                } else if (date47.compareTo(date43) == 0) {
                                    editor.putString("iScorechem117", str69);
                                    editor.putLong(str35, valueOf2.longValue());
                                } else if (date47.compareTo(date44) == 0) {
                                    editor.putString("iScorechem118", str69);
                                    editor.putLong(str34, valueOf2.longValue());
                                } else if (date47.compareTo(date45) == 0) {
                                    editor.putString("iScorechem119", str69);
                                    editor.putLong(str68, valueOf2.longValue());
                                } else if (date47.compareTo(date46) == 0) {
                                    editor.putString("iScorechem1110", str69);
                                    editor.putLong("datechem1110", valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        chemistry2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2011.this.scr.setVisibility(8);
                chemistry2011.this.chr.stop();
                chemistry2011.this.toolbar.setVisibility(8);
                chemistry2011.this.Relative.setBackgroundColor(chemistry2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                chemistry2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                chemistry2011.this.scr.setVisibility(0);
                chemistry2011.this.toolbar.setVisibility(0);
                chemistry2011.this.telegram_layout.setVisibility(8);
                chemistry2011.this.chr.start();
                chemistry2011.this.Relative.setBackgroundColor(chemistry2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = chemistry2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = chemistry2011.this.mInterstitialAd = null;
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
                chemistry2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
