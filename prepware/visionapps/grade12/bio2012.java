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

public class bio2012 extends AppCompatActivity {
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
    private Boolean f487b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2012;
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
    private Toolbar f488tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2012);
        this.f487b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2012);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "suppose 60 divisions on the scale of an eyepiece graticule correspond to 20 small divisions on the stage micrometer. Each small division on the stage micrometer is 15 um. If 6 cells fit across 60 divisions of the eyepiece graticule, what will be the length of each cell? ", 0, 0, 0, 0, 0, "0.005 mm ", "500 um ", "5µm", "0.05 mm. ", "60 division on eyepiece graticule = 20 division on stage \n  = 15 x20 µm = 300 µm \n  = 300 µm = 6 cells \n  =? X = 1 cell \n  = X = 50 µm = 0.05 mm  \n", "d", 0, 1, this.f487b));
        arrayList.add(new questions("2.", "Which one of the following is NOT the function of cells? ", 0, 0, 0, 0, 0, "Repairing damaged cells through meiosis ", "Unit of organization for living organisms ", "Energy flow ", "Cellular respiration ", "Major function of cells: provide structure and support, repair damaged cells through mitosis, cellular respiration and aid in reproduction. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("3.", "Consider the following table which compares prokaryotic and eukaryotic cells. ", C2719R.C2721drawable.bio2012q3, 0, 0, 0, 0, "10-100 um, 70S, 80S, Made from peptidoglycan. ", "1-100 um, 70S, 80S, Made from chitin. ", "1-100 um, 80S, 70S, Made from peptidoglycan. ", "10-100 um, 80S, 70S, Made from peptidoglycan. ", "", "d", C2719R.C2721drawable.bio2012q3e, 1, this.f487b));
        arrayList.add(new questions("4.", "Cellular activities are carried out more efficiently in eukaryotic cells than prokaryotes and this can be explained by the ", 0, 0, 0, 0, 0, "presence of enzymes in the eukaryotic cells. ", "absence of DNA in prokaryotic cells. ", "presence of membrane bounded organelles in eukaryotic cells. ", "absence of cytoplasm in prokaryotic cells. ", "Presence of membrane bounded organelles in eukaryotic cells enhances cellular activities to be carried out more efficiently in eukaryotes than prokaryotes. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("5.", "In the structural arrangement of cell membrane, the organic molecules which serve as the structural backbone and prevent uncontrolled movement of water-soluble materials are ", 0, 0, 0, 0, 0, "cholesterol's.", "peripheral proteins.", "lipid bilayers ", "carbohydrates. ", "The lipid bilayer is structural backbone of a cell membrane that selectively permeable water-soluble substances. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("6.", "What is the chemical composition of bacterial cell wall? ", 0, 0, 0, 0, 0, "Cellulose  ", "Peptidoglycan", "Starch ", "Capsule", "Peptidoglycan is the chemical composition of a bacterial cell wall. It is a complex molecule made from sugars and amino acids. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("7.", "In his biology practical section, a biology student applied a Gram stain to two groups of bacteria named X and Y. At the end, he observed that bacteria X stained purple while bacteria Y-stained pink. Which of the following could be the correct conclusion of his experiment? Bacteria ", 0, 0, 0, 0, 0, "X are Gram positive and Y are Gram negative. ", "Y are Gram positive and X are Gram negative. ", "Y and X are both Gram positive. ", "X and Y are both Gram negative. ", "Gram's staining is a test for classifying bacteria. Bacteria can be classified as Gram-positive or Gram-negative by their response to the Gram stain. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("8.", "As compared to infectious diseases, functional diseases ", 0, 0, 0, 0, 0, "are caused by pathogenic microorganisms. ", "can result from malfunction of organs. ", "can spread through the bites of insects. ", "are passed from person to person through reservoirs. ", "Functional disease is a disease due to malfunction of organ or organ system. For examples, heart disease, and irritable bowel syndrome. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("9.", "Which one of the following products does NOT need the role of bacteria? ", 0, 0, 0, 0, 0, "Insulin", "Enzymes", "Vaccine", "Ethanol ", "Yeast cells produce ethanol (ethyl alcohol) when ferment glucose. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("10.", "Bacteria used in the production of vinegar to ", 0, 0, 0, 0, 0, "produce alcohol in beer. ", "dilute ethanoic acid into vinegar. ", "oxidize alcohol to ethanoic acid. ", "supply oxygen for the fermenter. ", "Vinegar is a dilute solution of ethanoic acid in water. It is produced by fermenting alcohol for a second time using Acetobacter bacteria. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("11.", "By which levels of precipitation, temperature and type of plants is the Taiga biome characterized, respectively? ", 0, 0, 0, 0, 0, "Humid, always warm and ferns ", "Dry, cold and lichens ", "Almost none, cold and succulents ", "Adequate, cool year-round and conifers ", "The taiga is a forest of the cold, subarctic region. It lies between the tundra to the north and temperate forests to the south. It is characterized by adequate precipitation, cool year-round temperature and conifer trees. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("12.", "In which biome are epiphytes common? ", 0, 0, 0, 0, 0, "Temperate forest", "Thorn forest", "Tundra Forest ", "Tropical rainforest ", "Most epiphytes are found in moist tropical areas. An epiphyte is an organism that grows on the surface of a plant. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("13.", "What makes Ethiopia rich in biodiversity which deserves a global attention? ", 0, 0, 0, 0, 0, "Variation in topography and vegetation ", "Narrow range in altitude and climate ", "Uniformity of high lands and low lands ", "Similar terrestrial and aquatic biomes ", "Ethiopia is rich in biodiversity due to wide range in altitude, and climate, and existence of so many different biomes in the country. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("14.", "Why maintaining habitats is the key and fundamental aspect to conserve biodiversity? Because ", 0, 0, 0, 0, 0, "disturbance of habitats makes the habitats well adapted. ", "destruction of habitat is the leading cause of extinction. ", "preserving habitats leads to decreased species richness and abundance. ", "replacing natural habitats by artificial ones increases food security.", "Habitat destruction is the greatest threat to global biodiversity. So maintaining habitat is significant in conserving biodiversity. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("15.", "Which of the following products are formed in anaerobic respiration of one glucose molecule in animal cells? ", 0, 0, 0, 0, 0, "21 actate, 2CO2, 2ATP  ", "2 ethanol, 2CO2, 2ATP", "2 ethanol, 2NAD+, 2ATP ", "2 lactate, 2NAD+, 2ATP ", "In animal cell, anaerobic respiration converts one glucose molecule into two lactate, two ATPs, and 2NAD±. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("16.", "Which stage of cellular respiration is correctly paired with its site? ", 0, 0, 0, 0, 0, "Glycolysis - cristae  ", "Pyruvate oxidation cytoplasm", "Chemiosmosis - outer membrane ", "Krebs cycle - matrix ", "", "d", C2719R.C2721drawable.bio2012q16e, 1, this.f487b));
        arrayList.add(new questions("17.", "The table below compares the two types of competition. ", C2719R.C2721drawable.bio2012q17, 0, 0, 0, 0, "Row 2 and 4 ", "Row 1 and 3 ", "Row 1 and 2 ", "Row 2 and 3 ", "Intra-specific competition is a competition between members of the same species, and inter-specific competition of different species. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("18.", "What happens during the process of electron transport chain? Protons ", 0, 0, 0, 0, 0, "diffuse against concentration gradient through ATP synthase. ", "build up in the matrix than the inter- membrane space. ", "diffuse down concentration gradient to reduce NAD. ", "build up in the inter-membrane space than the matrix. ", "Because of the action of the proton pumps, protons accumulate in the inter-membrane space creating a higher concentration than in the matrix. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("19.", "Identify the correct statement about the role of NAD and FAD during aerobic respiration. They:", 0, 0, 0, 0, 0, "are the terminal electron acceptors of electron transport chain. ", "carry hydrogen atoms that will be split into protons and electrons. ", "oxidize intermediate products of cellular respiration. ", "are electron carriers that pump protons into inter-membrane space.  ", "NAD and FAD are molecules that transfer hydrogen ions from glucose molecule to ATP synthase. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("20.", "Which one of the following options represents the correct catabolic Pathway of the given respiratory substrates? ", 0, 0, 0, 0, 0, "Lipids - fatty acids – acetyl-CoA - TCA ", "Polysaccharide – glucose - acetyl-CoA - pyruvate - TCA ", "Nucleic acids - amino acids – Nucleotide - acetyl-CoA - TCA ", "Proteins – ammonia - amino acid - pyruvate - TCA ", "Catabolism is the set of metabolic pathways that breaks down molecules, such as lipids into smaller units, such as fatty acids. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("21.", "The chromosomal mutation that results Down's syndrome is ", 0, 0, 0, 0, 0, "inversion.  ", "translocation.", "chromosome non-disjunction. ", "insertion. ", "Down's syndrome is the result of an additional copy of all, or a specific part of chromosome 21. This occurs when homologous chromosome do not separate during meiosis. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("22.", "When a piece of one chromosome is transferred to another non-homologous chromosome, such kind of mutation is called  ", 0, 0, 0, 0, 0, "inversion", "translocation", "duplication", "insertion", "Translocation is the transfer of part of a chromosome to another non-homologous chromosome. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("23.", "", C2719R.C2721drawable.bio2012q23, 0, 0, 0, 0, "I", "III", "II", "IV ", "Spirochetes are any of a group of spiral or corkscrew-shaped bacteria. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("24.", "Which of the following diseases have water as their reservoir? ", 0, 0, 0, 0, 0, "Pneumonia and tuberculosis", "Amoeba and cholera", "Trachoma and diphtheria ", "Salmonella and malaria ", "Reservoir of infection is any person, animal, plant, soil, air and water that housed disease causing organisms. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("25.", "A geographic area with specific climate, soil type, plants and animals with similar adaptation is…………………  ", 0, 0, 0, 0, 0, "ecosystem", "habitat", "biome ", "niche", "A biome is a large area characterized by its vegetation, soil, climate, and wildlife.", "c", 0, 1, this.f487b));
        arrayList.add(new questions("26.", "", C2719R.C2721drawable.bio2012q26, 0, 0, 0, 0, "1 and 4", "2 and 3", "3 and 4", "1 and 2", "Viruses are non-living infectious particles, much smaller than a cell, , and lack organelles that found in free living cells. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("27.", "", C2719R.C2721drawable.bio2012q27, 0, 0, 0, 0, "Genetic material ", "Enzyme molecule ", "Central core ", "Antigen ", "Along with the RNA, HIV contains three key enzymes: reverse transcriptase, integrase, and protease.", "b", 0, 1, this.f487b));
        arrayList.add(new questions("28.", "What is the economic impact of AIDS? ", 0, 0, 0, 0, 0, "Increase the resources for public expenditure ", "Enhance the life expectancy and GDP", "Encourage savings for medical treatment ", "Seriously affects the taxable population ", "AIDS-related illnesses and deaths to employees affect a firm by both in increasing expenditures and reducing revenues. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("29.", "As the energy from the sun enters the ecosystem in the form of light, one of the following happens to it. It ", 0, 0, 0, 0, 0, "goes on decreasing along the trophic levels from primary producers to decomposers. ", "depends on the type of the trophic levels and changes at each trophic level irregularly.", "goes on increasing along the trophic levels from primary producers to decomposers. ", "remains much of the time the same but increases as it reaches decomposers. ", "As energy moves through trophic levels in an ecosystem the amount that is available decreases.", "a", 0, 1, this.f487b));
        arrayList.add(new questions("30.", "Suppose a self-fertilizing organism has AaBb genotype, how many different types of gametes would it produce if there is no linkage? ", 0, 0, 0, 0, 0, "12", "4", "16", "8", "F1 self-pollination  AaBb X AaBb\nF1 gametes(n) AB, Ab, aB, ab \n", "b", 0, 1, this.f487b));
        arrayList.add(new questions("31.", "Which one of the following viruses is an RNA virus? ", 0, 0, 0, 0, 0, "Bacteriophage  ", "HIV", "Herpes simplex", "H1N1", "RNA viruses are viruses that have RNA as their genetic material. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("32.", "Which one of the following statements is true regarding the need for recycling nutrients through an ecosystem? ", 0, 0, 0, 0, 0, "It is energy consuming process hence nutrients are constantly created and destroyed.", "It is the key to saving the earth hence nutrients become available. ", "It depletes the resources hence infinite resources become limited by the process. ", "It pollutes the environment hence waste products are accumulated during the process.", "Nutrient cycle recycles valuable nutrients, such as nitrogen, Sulphur, carbon and phosphorus that are important for organisms to exist ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("33.", "What is the impact of humans on the Sulphur cycle? Production of ", 0, 0, 0, 0, 0, "hydrogen Sulphide through the oxidation of Sulphur ", "Sulphur through decomposition of dead matter ", "Sulphur dioxide through combustion of fossil fuels ", "sulphate through weathering and oxidation of rocks ", "The burning of large quantities of fossil fuels releases larger amounts of hydrogen sulfide gas into the atmosphere that can result in acid rain.", "c", 0, 1, this.f487b));
        arrayList.add(new questions("34.", "Answer this question based on the following steps of the nitrogen cycle. \n    W      X      Y      Z\n N2--->NH4--->NO2--->NO3--->N2\nThe bacteria that are represented by the letters W, X, Y and Z are, respectively ", 0, 0, 0, 0, 0, "Azotobacter, Nitrosomonas, Nitrobacter and Pseudomonas. ", "Thiobacillus, Nitrosomonas, Nitrobacter and Pseudomonas. ", "Klebsiella, Nitrobacter, Pseudomonas and Rhizobium. ", "Rhizobium, Pseudomonas, Nitrobacter and Nitrosomonas. ", "Various bacteria involve in the conversion of nitrogen gas. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("35.", "As succession progresses, the bare land turns out to be productive due to the fact that the", 0, 0, 0, 0, 0, "species diversity and richness falls. ", "amount and depth of the soil increases. ", "environment become less stable.", "abiotic conditions remain unchanged. ", "Primary succession turns out to productive due to increment of amount and depth of the soil. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("36.", "What will happen to the population size if the rate of natality is less than the rate of mortality? ", 0, 0, 0, 0, 0, "Unchanged ", "Increase ", "Fluctuate ", "Decrease ", "If birth rate is less than death rate, the population size decreases. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("37.", "Which one of the following statements is correct about the stages of population growth rate curve? ", 0, 0, 0, 0, 0, "Natality exceeds mortality in stationary phase. ", "Nutrient exhausted in decline phase. ", "Toxic excretory products accumulated in log phase. ", "Organisms adapted to the environment in lag phase. ", "In decline phase, nutrients exhausted, a new disease strikes or toxic excretory products accumulate. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("38.", "During meiosis, crossing over is important to increase variation of gametes with regard to alleles that are ", 0, 0, 0, 0, 0, "dominant and heterozygote. ", "independently segregated. ", "recessive and homozygote. ", "linked and not assorted independently. ", "Crossing-over is the exchange of genetic material between homologous chromosomes. When cells divide during meiosis, homologous chromosomes are randomly distributed during anaphase I, separating and segregating independently of each other. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.bio2012q39, 0, 0, 0, 0, "Aa, aa", "AA, Aa", "aa, AA", "Aa, Aa", "", "d", C2719R.C2721drawable.bio2012q39e, 1, this.f487b));
        arrayList.add(new questions("40.", "In which phase of meiosis does pairing of chromosomes and exchange of segments take place? ", 0, 0, 0, 0, 0, "Prophase II", "Prophase I", "Anaphase II", "Anaphase I", "During prophase I, homologous chromosomes pair with each other and exchange genetic material in a process called chromosomal crossover. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("41.", "Among the following statements, which one is correct about mutations? Mutations ", 0, 0, 0, 0, 0, "are accidents that occur spontaneously and randomly during ng DNA ", "that occurs in somatic cells can pass on the next generation. ", "are changes in genetic composition of a population. ", "that occurs in sex cells are completely harmless. ", "A mutation is a change that occurs in DNA sequence, either due to mistakes when the DNA is copied or as the result of mutagens. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("42.", "if the particular triplet of base in the sense strand of DNA is AGT, then the corresponding codon for the transcribed mRNA will be…………… ", 0, 0, 0, 0, 0, "ACV", "UGA", "UCA", "AGU", "In DNA, A corresponds to T and C corresponds to G, the only difference in RNA is that T is replaced with U, so the mRNA sequence that corresponds to the codon AGT would be UCA. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("43.", "What is the theory that states disease is caused by microorganisms? ", 0, 0, 0, 0, 0, "Spontaneous generation", "Biogenesis theory", "Endosymbiotic theory ", "Germ theory ", "The theory that disease can be caused by micro-organisms is called the germ theory.", "d", 0, 1, this.f487b));
        arrayList.add(new questions("44.", "In the bare bottom of a newly formed pond a biologist observed emergence of new algae. The form of succession he observed can be best described as ", 0, 0, 0, 0, 0, "early succession. ", "late succession. ", "secondary succession. ", "primary succession. ", "Where a succession starts from bare or from a newly formed pond with no life, the succession is a primary succession. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("45.", "The extent to which variability exists among living organisms, with in species and even between ecosystem is known as ", 0, 0, 0, 0, 0, "biosphere", "biomass", "bioaccumulation", "biodiversity", "The term biodiversity refers to the variety of life on Earth at all its levels, from genes to ecosystems. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("46.", "Which one of the following is the significance of biodiversity? ", 0, 0, 0, 0, 0, "Worsening of social relationships ", "Increasing vulnerability to environmental stress ", "Reducing the level of material wealth ", "Increasing security of food supply ", "Biodiversity provides functioning ecosystems that supply oxygen, clean air and Water, pollination of plants, pest control, wastewater treatment and many ecosystem services. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("47.", "The carrying capacity of a population can be defined as the ", 0, 0, 0, 0, 0, "minimum population size supported by its habitat. ", "maximum population size supported by its habitat. ", "maximum population growth rate in a habitat. ", "average population size supported by its habitat. ", "Carrying capacity can be defined as a species' average population size in a particular habitat. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("48.", "If pea plants with round yellow heterozygous seeds are self-fertilized and produced 4800 seeds, how many round green seeds will be produced? (Hint: round yellow seed is dominant), ", 0, 0, 0, 0, 0, "2700", "4800 ", "300", "900 ", "", "d", C2719R.C2721drawable.bio2012q48e, 1, this.f487b));
        arrayList.add(new questions("49.", "The nucleotide that builds up the DNA molecule contain the following bases EXCEPT ", 0, 0, 0, 0, 0, "guanine.", "adenine.", "cytosine.", "uracil.", "Uracil is one of the four nucleobases in the nucleic acid RNA that are represented by the letters A, G, C and U. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("50.", "A grade 12 student extracted an insulin gene from insulin producing cells of the pancreases and plasmid from bacteria. Then he transferred the insulin gene into the plasmid and the hybrid plasmid was put back into bacteria, for insulin production. What enzyme did the student used to join the insulin gene and bacteria plasmid? ", 0, 0, 0, 0, 0, "DNA helicase ", "ATP synthase  ", "RNA polymerase ", "DNA ligase ", "DNA ligase is a specific type of enzyme that facilitates the joining of DNA strands together by catalyzing the formation of a phosphodiester bond. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("51.", "Which one of the following options contains the main steps of scientific method in their correct order? ", 0, 0, 0, 0, 0, "Doing background research - asking question - Testing the - hypothesis – Formulating hypothesis - Analyzing the result - Reporting the result background ", "Asking question - Formulating hypothesis – Doing background research - Testing the hypothesis - Analyzing result - Reporting the result ", "Doing background research - Formulating hypothesis - Asking question - Testing the hypothesis - Analyzing the result - Reporting the result ", "Asking question - Doing background research - Formulating hypothesis - Testing the hypothesis - Analyzing the result - Reporting the result ", "Scientific method is the process by which scientists approach their work.", "d", 0, 1, this.f487b));
        arrayList.add(new questions("52.", "Francesco Redi disproves the belief that rotting meat produces flies. He used wide mouth jars containing meat. He left some jars open to the air and others were covered with a piece of gauze. What do you think might have been Red's most plausible hypothesis? ", 0, 0, 0, 0, 0, "Flies would be formed in the covered jars. ", "Only flies could produce more flies. ", "Flies could be produced through spontaneous generation. ", "Flies could be produced from rotting meat. ", "Francesco Redi hypothesized that only flies could produce more flies. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("53.", "Suppose a grade 12 student wants to investigate the need of CO2 for photosynthesis. He detached plants A and B then he placed plant A in a bell jar which has no CO2 in the surrounding air, while plant B in a bell jar which has normal level of CO2. He placed the jars in a place with light for 12 hours and kept other variables constant. Finally, he tested for the presence of starch. Less starch was produced by plant A than plant B. What are the dependent and independent variables of this experiment, respectively? ", 0, 0, 0, 0, 0, "Amount of starch, presence of light ", "Presence of light, amount of starch ", "Amount of starch, presence or absence of CO2 ", "Presence or absence of CO2, amount of starch ", "Independent variable (IV) is the factor that the scientist changes, or manipulates, while dependent variable (DV) is the factor that the scientist measures to see if it changes when the IV is changed.  ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("54.", "Helen was conducting iodine test for starch. She took two different food samples and placed one of the samples in test tube A and the other in test tube B. She added a few drops of iodine solution to both test tubes. Finally, she observed blue-black color in test tube B, but the sample in test tube A remained unchanged. If Helen wants to write the re of this experiment, she should write ", 0, 0, 0, 0, 0, "the importance of starch in the procedure part. ", "Her name in the acknowledgement part", "The sample in test tube B was starch containing as her conclusion.", "the general test for starch is iodine test as her result. ", "A blue-black color results if starch is present. If starch amylose is not 53, present, then the color will stay orange or yellow. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("55.", "A field biologist can measure the slope of an area by using ", 0, 0, 0, 0, 0, "theodolite.", "flow meter.", "scalpels.", "data logger.", "A theodolite is an item of field equipment that measures slope. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("56.", "Which organic molecules in our body have functions as antigens and antibodies of the immune system? ", 0, 0, 0, 0, 0, "Carbohydrates ", "Proteins ", "Nucleic acid", "Lipids ", "Proteins function as antigens and antibodies in immune system.  ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("57.", "If alpha-glucose reacts with fructose molecule in condensation reaction, what will be the chemical formula of disaccharide formed in this reaction? ", 0, 0, 0, 0, 0, "C6H12O6 ", "C12H24O12", "C10H24O10", "C12H22O11", "", "d", C2719R.C2721drawable.bio2012q57e, 1, this.f487b));
        arrayList.add(new questions("58.", "In grade 11 laboratory class, the teacher gave the students a sample of food and asked them to investigate the presence of glucose. What kind of test and result will enable the students to confirm the presence of glucose? ", 0, 0, 0, 0, 0, "Emulsion test and milky white color ", "Iodine test and blue-black color ", "Benedict's test and orange color ", "Biuret test and purple color ", "Benedict's test is used to test for the presence of reducing sugar, such as glucose. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("59.", "A group of grade 12 students carried out four biochemical tests to investigate the composition of four different food samples. The results with respective type of tests are shown in the table below. ", C2719R.C2721drawable.bio2012q59, 0, 0, 0, 0, "Sample A and D ", "Sample B and D", "Sample B and C ", "Sample A and C ", "The emulsion test is a method to determine the presence of lipids while a biuret test is a chemical test used to determine the presence of a peptide bond in a food substance.", "b", 0, 1, this.f487b));
        arrayList.add(new questions("60.", "Identify the correct statement about enzymes. They ", 0, 0, 0, 0, 0, "from an intermediate complex which dissociates into the product and free enzyme. ", "function as organic catalysts by irreversibly combining with the substrate ", "are globular proteins with a multiple shaped active site. ", "function by affecting the nature of the product. ", "The enzyme substrate complex is a temporary molecule formed when an enzyme comes into perfect contact with its substrate. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("61.", "A medical laboratory technologist at Black Lion Hospital placed a solution of stool in a centrifuge to separate the particles quickly for the stool test. Which one of the following will happen when he spins the centrifuge at high speed? ", 0, 0, 0, 0, 0, "The solid particles of the stool will float on the top of the mixture.", "The gravitational forces on the solid particles force the solid particles of the stool to the bottom of the tube. ", "The solid particles of the stool will mix up highly and suspended freely. ", "The liquid particles will evaporate but the solid particles will remain in the centrifuge tube. ", "Large centrifuges are used to simulate high gravity or acceleration environments.", "b", 0, 1, this.f487b));
        arrayList.add(new questions("62.", "The relevance and promise of biology as a field of science can be best explained by its application in ", 0, 0, 0, 0, 0, "agriculture and genetic engineering. ", "sport and culture. ", "oil and mineral production. ", "economic growth and urbanization. ", "Advances in medicine, agriculture, biotechnology, and many other areas of biology have brought improvements in the quality of life. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("63.", "Biologists played a role in the fight against AIDS because they developed ", 0, 0, 0, 0, 0, "anti-retroviral drugs that target and aim to break different stages of the HIV life cycle.", "anti-retroviral drugs that provide lasting immunity against reinfection by HIV, ", "a vaccine from people who have been repeatedly exposed to HIV but never developed AIDS. ", "a vaccine from a monkey that develops a very similar disease to AIDS which is caused by a very similar virus. ", "Antiretroviral treatment is the drugs that treat HIV. It is not a cure for HIV, but it keeps HIV under control. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("64.", "Which one of the following statements shows willingness of participating in a community undertaking against HIV and AIDS? A person who ", 0, 0, 0, 0, 0, "takes volunteer counseling and testing ", "decides to abstain from any relation with the community ", "discriminates HIV positive from HIV negative people ", "isolates himself from HIV infected people ", "Voluntary counseling and testing serve as an entry point for prevention and care strategies. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("65.", "One benefit of water related to its high specific heat capacity is its importance ", 0, 0, 0, 0, 0, "to move particles inside the cell more easily. ", "for the normal functioning of enzymes in living cells. ", "for the transport of blood cells around circulatory system. ", "to support the weight of some insects while they walk on it. ", "High specific heat capacity of is important as the functioning of enzymes in living cells is affected by temperature. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("66.", "Among the parts of the cell, which organelles are bounded with double membrane? ", 0, 0, 0, 0, 0, "Golgi body, chloroplast and lysosome ", "Vacuole, endoplasmic reticulum and ribosome ", "Nucleus, mitochondria and chloroplast ", "Lysosome, vacuole and nucleus ", "Generally, eukaryotic cells have double-membrane-bounded organelles, such as the nucleus, mitochondria, and chloroplasts. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("67.", "Why are cells that secret hormones and enzymes rich in rough endoplasmic reticulum? Because they produce more ", 0, 0, 0, 0, 0, "lipids", "carbohydrates", "ATP", "proteins. ", "Ribosomes on the rough endoplasmic reticulum are called membrane bound' and are responsible for the assembly of many proteins. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("68.", "What is the role of cholesterol in the cell membrane? To ", 0, 0, 0, 0, 0, "anchor integral proteins with the membrane ", "maintain the membrane fluidity ", "make the membrane selectively permeable ", "serve as signals to other membrane of cells ", "The main function of cholesterol is to maintain integrity and fluidity of cell membrane. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("69.", "If potato cells immersed in a hypertonic solution, they will ", 0, 0, 0, 0, 0, "lose water and plasmolyzed", "gain water and hemolyzed", "lose water and become turgid", "gain water and become larger", "In the hypertonic solution, the cells lose water by osmosis and shrink. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("70.", "Which molecule of the plasma membrane contains carbohydrate chains and allows identification of cell by the immune system? ", 0, 0, 0, 0, 0, "Integral protein ", "Peripheral protein", "Channel protein ", "Glycoproteins", "Glycoproteins are molecules that comprise protein and carbohydrate chains that are involved in many physiological functions including immunity. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("71.", "Which one of the following options contains only a group of organic biochemical molecules? ", 0, 0, 0, 0, 0, "Ribose, methane, fatty acid, lactose and sodium chloride ", "ATP, deoxyribose, sulfuric acid, lactic acid and amino acid ", "Fatty acid, glycine, DNA, maltose and triglyceride ", "Lactic acid, hydrochloric acid, sucrose, water and ATP ", "Carbohydrates, lipids, proteins, and nucleic acids are the four major classes of biological macromolecules. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("72.", "Unbalanced hydrogen bonding at the surface of the water is responsible for high ", 0, 0, 0, 0, 0, "surface tension of water. ", "latent heat of vaporization of water. ", "density of water its liquid form. ", "specific heat capacity of water. ", "Water has a high surface tension because the water molecules on the surface are pulled together by strong hydrogen bonds. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("73.", "In a structure of amylose molecule that contains one hundred alpha-glucose monomers, how many alpha-1, 4-glycosidic bonds are formed? ", 0, 0, 0, 0, 0, "99", "100", "50", "200", "A glycosidic bond or glycosidic linkage is a type of covalent bond that joins a carbohydrate (sugar) molecule to another group. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("74.", "Which part of phospholipids is considered as hydrophobic region? ", 0, 0, 0, 0, 0, "Phosphate group", "Hydrocarbon tails", "Carboxyl group", "Glycerol head ", "The phosphate group is the negatively-charged polar head, which is hydrophilic. The fatty acid chains are the uncharged, nonpolar tails, which are hydrophobic. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("75.", "Identify the organic molecule which is correctly paired with its function. ", 0, 0, 0, 0, 0, "Glycogen - formation of microfibrils ", "Phospholipids - control metabolism ", "Triglycerides - respiratory substrate ", "Cellulose - component of cell membrane ", "", "c", C2719R.C2721drawable.bio2012q75e, 1, this.f487b));
        arrayList.add(new questions("76.", "Where does the production of ATP and reduced NADP take place? ", 0, 0, 0, 0, 0, "Cytoplasm", "Thylakoid membrane", "Fluid matrix", "Stroma", "In plants, the production of ATP and NADPI I take place in the thy thylakoid membranes of chloroplasts ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("77.", "The biochemical mechanism by which chlorophyll absorbs light energy is efficient because ", 0, 0, 0, 0, 0, "the molecules of the photosystems and ETCs are floating around in a solution. ", "the same pigment molecules in the antenna complex absorb different. wave length of light. ", "the molecules of photosystems and ETCs are fixed in the membranes of thylakoid. ", "the different pigment molecules in the antenna complex absorb the same wave length of light. ", "The biochemical mechanism by which chlorophyll absorbs light energy is efficient due to the molecules of photosystems and ETCs are fixed in the membranes of thylakoid.", "c", 0, 1, this.f487b));
        arrayList.add(new questions("78.", "The leaves of C3 plants in the tropics close their stomata to minimize water loss as a result concentration of CO2, in the leaves falls. When C3, plants face such problem, ribulose bisphosphate reacts oxygen and reduce ", 0, 0, 0, 0, 0, "hydrogen peroxide and CO2 in the mitochondrion. ", "glycerate phosphate and phosphoglycerate in the chloroplast. ", "triose phosphate and sugar in the mitochondrion. ", "oxaloacetate and water in the peroxisome. ", "When C3 plants face deficiency of CO2, ribulose bisphosphate reacts oxygen and reduce glycerate phosphate and phosphoglycerate in the chloroplast. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("79.", "An enzyme. which is designated as EC 2.7.1.2 can be grouped to which class of enzyme?", 0, 0, 0, 0, 0, "Isomerases", "Transferases", "Oxidoreductases", "Ligases ", "Enzymes are generally classified on the basis of the type of reactions that they catalyze. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("80.", "Sorghum and wheat are C4 plants which are well adapted to photosynthesize efficiently in hot bright days. Peas and carrots would not photosynthesize efficiently in such conditions because they are C3 plants. In which of the following features does those plants are similar? The ", 0, 0, 0, 0, 0, "enzyme used to fix carbon dioxide ", "cells where the Calvin cycle takes place ", "presence of chloroplast in the bundle sheath cells ", "cells where carbon dioxide fixation take place ", "In C3 and C4 plants, CO2 fixation-take place in mesophyll cells. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("81.", "Plants that follow CAM photosynthetic pathway carry out the two stages of photosynthesis at different times. Which of the following products are formed during the night? ", 0, 0, 0, 0, 0, "Malate and sugar", "Oxaloacetate and malate", "ATP and NADPH", "CO2 and sugar", "In CAM plant, the stomata are opened at night and allow CO2 reacts with PEP in mesophyll cells to form oxaloacetate and then malate. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("82.", "Using enzyme technology in industrial production helps to reduce global warming. This is because enzymes ", 0, 0, 0, 0, 0, "absorbs much carbon dioxide from the environment. ", "allow reaction to be carried out at much lower temperature. ", "increase the heat required for reactants. ", "give high energy for industrial reactants. ", "Enzymes help to reduce global warming in industrial production for they allow reaction to be carried out at much lower temperature. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("83.", "How do enzymes lower the activation energy of substrate molecules according to the induced-fit model? By ", 0, 0, 0, 0, 0, "increasing the kinetic energy and probability of collusion", "providing extra energy for the conversion of reactants into a product. ", "creating a tension in the bond of substrate molecules. ", "forming strongly bonded enzyme-substrate complex. ", "According to the induced-fit model of enzyme action, reacting molecules enter a transition state in which bonds in reacting molecules are put under tension. Accordingly, the activation energy is lowered. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("84.", "If an enzyme depends on a cofactor for its activity, then the enzyme becomes active and functional when it is found in the form of ", 0, 0, 0, 0, 0, "mineral ion", "apoenzyme", "holoenzyme", "coenzyme", "The cofactor combines with an apoenzyme to produce an active enzyme called holoenzyme. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("85.", "Which one of the following enzymes requires copper ions for its catalytic activity? ", 0, 0, 0, 0, 0, "Flavin adenine dinucleotide", "Nicotinamide adenine dinucleotide", "Alcohol dehydrogenase", "Cytochrome oxidase ", "The mineral ion in Cytochrome oxidase is copper ions. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("86.", "A change in temperature can affect the rate of enzymes-controlled reaction by ", 0, 0, 0, 0, 0, "increasing or decreasing the probability of collusion. ", "altering the charge amino acids that form the active site. ", "changing the shape of substrate and enzyme molecules. ", "decrease the turnover rate of enzymes. ", "The rate of an enzyme catalyzed reaction increases as the temperature increases and vice versa. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("87.", "If the amount of enzyme is kept constant and the substrate concentration is gradually increased, what will happen to the rate of the reaction? The reaction velocity ", 0, 0, 0, 0, 0, "decreases first but increases after the active sites are occupied with the substrate.", "increases until all the available enzyme active sites become saturated.", "increases further as the substrate concentration increases further.", "remains unchanged; hence it isn't influenced by substrate concentration. ", "Increasing substrate concentration increase enzymatic reaction until it reaches maximum velocity. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("88.", "", C2719R.C2721drawable.bio2012q88, 0, 0, 0, 0, "The reaction will take place in the reverse direction. ", "Substance Z will inhibit E1 and switch off the pathway. ", "E3 will convert substance Y into another substance rather than substrate Z. ", "El and E2 will be inactive until substance Z equals to the normal concentration. ", "End-product inhibition is a form of negative feedback by which metabolic pathways can be controlled. In end-product inhibition, the final product in a series of reactions (Z) inhibits an enzyme from an earlier step (El) in the sequence. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("89.", "How is the process of end-product inhibition triggered? By ", 0, 0, 0, 0, 0, "low concentration of the end product ", "inhibition of the last enzyme", "excess production of the last product ", "change of the active site of the enzyme ", "The end-product inhibition is triggered by excess production of last product.", "b", 0, 1, this.f487b));
        arrayList.add(new questions("90.", "Identify the WRONG statement about the modern cell theory. ", 0, 0, 0, 0, 0, "Cells arise only from other pre-existing cells by division. ", "The process of metabolism and heredity occur within cells. ", "Cell is the basic unit of organization of all organisms. ", "All cells have basically different chemical composition. ", "In general, the modern cell theory includes: \n1) all living organisms are composed of one or more cells. \n2) the cell is a unit of structure and function of all living organisms. \n3) all cells come from pre-existing cells by cell division. \n4) cells carry hereditary materials that can pass to daughter cells during cellular division. 5)all cells have essentially the same chemical composition. \n6) all energy flow (metabolism and biochemistry) occurs within the cells.\n", "c", 0, 1, this.f487b));
        arrayList.add(new questions("91.", "During practice of genetic engineering, bacteria are important to ", 0, 0, 0, 0, 0, "provide plasmids.", "produce restriction endonucleases. ", "breakdown the recombinant DNA molecule. ", "produce ligase enzymes.", "Plasmids are important tools used in genetic engineering. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("92.", "Consider the following diagram of a bacteriophage. \nIn the above diagram, the viral capsid is represented by number ______\n", C2719R.C2721drawable.bio2012q92, 0, 0, 0, 0, "5", ExifInterface.GPS_MEASUREMENT_2D, "1", "4", "Viral capsid is an outer protein coat a virus. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("93.", "Which one of the following steps of HIV life cycle comes first? ", 0, 0, 0, 0, 0, "The viral DNA is transcribed into RNA and produces viral proteins including reverse transcriptase. ", "The RNA, proteins and reverse transcriptase molecules assembled and bud out of the host cell to infect a new cell. ", "The HIV virus attached to the plasma membrane of the T-helper. ", "The reverse transcriptase converts RNA into DNA and incorporates into the DNA of the host cells. ", "The major stages of HIV life cycle include fusion, entry, transcription of RNA to DNTA, integration of 'viral DNA to host DNA, transcription of DNA to RNA, assemblage of virions, infection of other T cells. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("94.", "Which of the following antiretroviral drugs prevents the assembly of new virus particles?", 0, 0, 0, 0, 0, "Protease inhibitors ", "Entry inhibitors ", "Non-nucleotide reverse transcriptase inhibitors ", "Nucleotide reverse transcriptase inhibitors ", "Protease enzyme of HIV is useful for assembling the viral particles. ", "c", 0, 1, this.f487b));
        arrayList.add(new questions("95.", "Which of the following statements is correct about the reproductive cycles of lytic and lysogenic viruses? ", 0, 0, 0, 0, 0, "The DNA of lysogenic viruses duplicates as the cell divides. ", "Only lytic viruses require the host DNA for their replication. ", "Lytic viruses are released by exocytosis. ", "Lysogenic viruses do not form a protein coat. ", "In lysogenic life cycle, infection causes the virus to enter a latent state where its DNA is reproduced with the host DNA, but no new viruses are formed. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("96.", "Red-green color blindness is due to X-linked gene and determined by the recessive alleles. Which one of the following is true about this condition? ", 0, 0, 0, 0, 0, "It affects male due to alleles inherited from the father. ", "It is much more common in females. ", "Expressed in both sexes equally if the parents are carriers. ", "Females inherit one allele from each parent and becomes affected ", "Red-green color blindness is X-linked and recessive alleles. It affects female that inherit one allele from each parent. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("97.", "Which one of the following statements is true about a chromosome? It is ", 0, 0, 0, 0, 0, "clearly visible in the nucleus when the cell is not dividing. ", "made up of DNA which is tightly coiled many times around histones. ", "loosely organized throughout the nucleus when the cell is dividing. ", "divided into two equal sections by the centromere. ", "Chromosome is a long strand of DNA that bounds with histone proteins. ", "d", 0, 1, this.f487b));
        arrayList.add(new questions("98.", "What is the complementary strand for a DNA strand having the following sequence of bases? 5'-AGGTTACTGAGCT-3'", 0, 0, 0, 0, 0, "3'-TCCAATGACTCGA-5'", "3'-TCCAATGACTCGA-3'", "3'-UCCAAUGACUCGA-5'", "5'-UCCAAUGACUCGA-3'", "DNA base sequence pairing rule: A-T, G-C. The DNA molecule is a double helix in which the base sequence on the sense strand is complementary to the base sequence on the antisense strand. ", "b", 0, 1, this.f487b));
        arrayList.add(new questions("99.", "98.\tConsider the following disordered events, of transcription. \nI.\tRNA polymerase crosses a stop sequence in the gene. \nII.\tRNA polymerase reads the antisense DNA strand and builds mRNA. \nIII.\tmRNA molecule detaches from DNA and DNA rejoin. IV. RNA polymerase binds to promoter which signals the DNA to unwind. \n", 0, 0, 0, 0, 0, "I – IV – III – II ", "IV – II – I – III ", "IV – I – II – III ", "I – IV – II – III ", "Transcription is the process that converts genetic information from a DNA code into an mRNA code. ", "a", 0, 1, this.f487b));
        arrayList.add(new questions("100.", "Which of the following bases are the triplets of codes in the mRNA that cease translation and the ribosome fold the polypeptide into its final structure? ", 0, 0, 0, 0, 0, "ATT, ATC and ACT", "CCC, UUA and GUU ", "UAA, UAG and UGA", "TAA, TAG and TGA", "Three triplets (TAA, TAG and TGA) do not code for any amino acid because they are 'stop' codes.", "b", 0, 1, this.f487b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f488tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2012.this.timer.setVisibility(0);
                    bio2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    bio2012.this.scr.setVisibility(8);
                    bio2012.this.chr.stop();
                    bio2012.this.toolbar.setVisibility(8);
                    bio2012.this.Relative.setBackgroundColor(-7829368);
                    bio2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2012.this.getBaseContext());
                    int unused = bio2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2012.this.highscoreBio2012 = defaultSharedPreferences.getInt("bio2012hs", 0);
                    int access$600 = bio2012.this.part1 + bio2012.this.part2 + bio2012.this.part3 + bio2012.this.part4 + bio2012.this.part5 + bio2012.this.part6 + bio2012.this.part7 + bio2012.this.part8 + bio2012.this.part9;
                    bio2012.this.resultText.setText(String.valueOf(access$600));
                    bio2012.this.progressbar.setProgress(access$600);
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
                    int unused11 = bio2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = bio2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = bio2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = bio2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = bio2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = bio2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = bio2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = bio2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "bio2012hs";
                    int unused19 = bio2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = bio2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = bio2012.this.answered1 + bio2012.this.answered2 + bio2012.this.answered3 + bio2012.this.answered4 + bio2012.this.answered5 + bio2012.this.answered6 + bio2012.this.answered7 + bio2012.this.answered8 + bio2012.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > bio2012.this.highscoreBio2012) {
                        edit.putInt(str, access$600);
                    }
                    long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2012.this.chr.getBase()) / 1000;
                    if (bio2012.this.mode.booleanValue()) {
                        Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                        int i = (access$600 * 100) / 100;
                        DecimalFormat decimalFormat = new DecimalFormat("##.##");
                        String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                        String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                        long j = defaultSharedPreferences.getLong("date1bio121", 0);
                        long j2 = defaultSharedPreferences.getLong("date1bio122", 0);
                        long j3 = defaultSharedPreferences.getLong("date1bio123", 0);
                        String str2 = f;
                        long j4 = defaultSharedPreferences.getLong("date1bio124", 0);
                        Long l = valueOf;
                        String str3 = f2;
                        long j5 = defaultSharedPreferences.getLong("date1bio125", 0);
                        SharedPreferences.Editor editor3 = edit;
                        String str4 = str2;
                        long j6 = defaultSharedPreferences.getLong("date1bio126", 0);
                        long j7 = defaultSharedPreferences.getLong("date1bio127", 0);
                        long j8 = defaultSharedPreferences.getLong("date1bio128", 0);
                        long j9 = defaultSharedPreferences.getLong("date1bio129", 0);
                        long j10 = defaultSharedPreferences.getLong("date1bio1210", 0);
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
                            editor.putString("scorebio121", str3);
                            editor.putLong("date1bio121", l.longValue());
                        } else {
                            String str5 = str3;
                            editor = editor3;
                            if (date11.compareTo(date2) == 0) {
                                editor.putString("scorebio122", str5);
                                editor.putLong("date1bio122", l.longValue());
                            } else if (date11.compareTo(date3) == 0) {
                                editor.putString("scorebio123", str5);
                                editor.putLong("date1bio123", l.longValue());
                            } else if (date11.compareTo(date4) == 0) {
                                editor.putString("scorebio124", str5);
                                editor.putLong("date1bio124", l.longValue());
                            } else if (date11.compareTo(date5) == 0) {
                                editor.putString("scorebio125", str5);
                                editor.putLong("date1bio125", l.longValue());
                            } else if (date11.compareTo(date6) == 0) {
                                editor.putString("scorebio126", str5);
                                editor.putLong("date1bio126", l.longValue());
                            } else if (date11.compareTo(date7) == 0) {
                                editor.putString("scorebio127", str5);
                                editor.putLong("date1bio127", l.longValue());
                            } else if (date11.compareTo(date8) == 0) {
                                editor.putString("scorebio128", str5);
                                editor.putLong("date1bio128", l.longValue());
                            } else if (date11.compareTo(date9) == 0) {
                                editor.putString("scorebio129", str5);
                                editor.putLong("date1bio129", l.longValue());
                            } else if (date11.compareTo(date10) == 0) {
                                editor.putString("scorebio1210", str5);
                                editor.putLong("date1bio1210", l.longValue());
                            }
                        }
                        long j11 = defaultSharedPreferences.getLong("datebio121", 0);
                        long j12 = defaultSharedPreferences.getLong("datebio122", 0);
                        long j13 = defaultSharedPreferences.getLong("datebio123", 0);
                        long j14 = defaultSharedPreferences.getLong("datebio124", 0);
                        long j15 = defaultSharedPreferences.getLong("datebio125", 0);
                        SharedPreferences.Editor editor4 = editor;
                        long j16 = defaultSharedPreferences.getLong("datebio126", 0);
                        long j17 = defaultSharedPreferences.getLong("datebio127", 0);
                        long j18 = defaultSharedPreferences.getLong("datebio128", 0);
                        long j19 = defaultSharedPreferences.getLong("datebio129", 0);
                        long j20 = defaultSharedPreferences.getLong("datebio1210", 0);
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
                            editor2.putString("iScorebio121", str4);
                            editor2.putLong("datebio121", l.longValue());
                        } else {
                            editor2 = editor4;
                            String str6 = str4;
                            if (date22.compareTo(date13) == 0) {
                                editor2.putString("iScorebio122", str6);
                                editor2.putLong("datebio122", l.longValue());
                            } else if (date22.compareTo(date14) == 0) {
                                editor2.putString("iScorebio123", str6);
                                editor2.putLong("datebio123", l.longValue());
                            } else if (date22.compareTo(date15) == 0) {
                                editor2.putString("iScorebio124", str6);
                                editor2.putLong("datebio124", l.longValue());
                            } else if (date22.compareTo(date16) == 0) {
                                editor2.putString("iScorebio125", str6);
                                editor2.putLong("datebio125", l.longValue());
                            } else if (date22.compareTo(date17) == 0) {
                                editor2.putString("iScorebio126", str6);
                                editor2.putLong("datebio126", l.longValue());
                            } else if (date22.compareTo(date18) == 0) {
                                editor2.putString("iScorebio127", str6);
                                editor2.putLong("datebio127", l.longValue());
                            } else if (date22.compareTo(date19) == 0) {
                                editor2.putString("iScorebio128", str6);
                                editor2.putLong("datebio128", l.longValue());
                            } else if (date22.compareTo(date20) == 0) {
                                editor2.putString("iScorebio129", str6);
                                editor2.putLong("datebio129", l.longValue());
                            } else if (date22.compareTo(date21) == 0) {
                                editor2.putString("iScorebio1210", str6);
                                editor2.putLong("datebio1210", l.longValue());
                            }
                        }
                        editor2.commit();
                    }
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
                        bio2012.this.scr.setVisibility(8);
                        bio2012.this.chr.stop();
                        bio2012.this.toolbar.setVisibility(8);
                        bio2012.this.Relative.setBackgroundColor(-7829368);
                        bio2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2012.this.getBaseContext());
                        int unused = bio2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = bio2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = bio2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = bio2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = bio2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = bio2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = bio2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = bio2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = bio2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = bio2012.this.highscoreBio2012 = defaultSharedPreferences.getInt("bio2012hs", 0);
                        int access$600 = bio2012.this.part1 + bio2012.this.part2 + bio2012.this.part3 + bio2012.this.part4 + bio2012.this.part5 + bio2012.this.part6 + bio2012.this.part7 + bio2012.this.part8 + bio2012.this.part9;
                        TextView access$1600 = bio2012.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        bio2012.this.progressbar.setProgress(access$600);
                        bio2012.this.progressbar.setMax(100);
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
                        int unused11 = bio2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = bio2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = bio2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = bio2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = bio2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = bio2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = bio2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = bio2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = bio2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = bio2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = bio2012.this.answered1 + bio2012.this.answered2 + bio2012.this.answered3 + bio2012.this.answered4 + bio2012.this.answered5 + bio2012.this.answered6 + bio2012.this.answered7 + bio2012.this.answered8 + bio2012.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > bio2012.this.highscoreBio2012) {
                            edit.putInt("bio2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2012.this.chr.getBase()) / 1000;
                        defaultSharedPreferences.getFloat("iScorebio12", 0.0f);
                        String str = "datebio129";
                        String str2 = "datebio128";
                        String str3 = "datebio127";
                        String str4 = "datebio126";
                        String str5 = "datebio125";
                        String str6 = "datebio124";
                        String str7 = "datebio123";
                        String str8 = "datebio122";
                        String str9 = "datebio121";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1bio1210";
                        String str11 = "date1bio129";
                        if (bio2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1bio121", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1bio122", 0);
                            long j3 = defaultSharedPreferences.getLong("date1bio123", 0);
                            String str13 = "date1bio123";
                            String str14 = f;
                            String str15 = "date1bio121";
                            long j4 = defaultSharedPreferences.getLong("date1bio125", 0);
                            String str16 = "date1bio125";
                            String str17 = "date1bio124";
                            String str18 = "date1bio126";
                            long j5 = defaultSharedPreferences.getLong("date1bio126", 0);
                            long j6 = defaultSharedPreferences.getLong("date1bio127", 0);
                            String str19 = str11;
                            String str20 = "date1bio128";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1bio122";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1bio124", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1bio127";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1bio128", 0));
                            Date date9 = new Date(j7);
                            Date date10 = new Date(j8);
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
                                editor3.putString("scorebio121", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorebio122", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorebio123", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorebio124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorebio125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorebio126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorebio127", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorebio128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorebio129", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorebio1210", str25);
                                    editor3.putLong(str21, l.longValue());
                                }
                            }
                            String str26 = str9;
                            long j9 = sharedPreferences.getLong(str26, 0);
                            String str27 = str8;
                            long j10 = sharedPreferences.getLong(str27, 0);
                            long j11 = sharedPreferences.getLong(str7, 0);
                            SharedPreferences.Editor editor6 = editor3;
                            long j12 = sharedPreferences.getLong(str6, 0);
                            long j13 = sharedPreferences.getLong(str5, 0);
                            long j14 = sharedPreferences.getLong(str4, 0);
                            long j15 = sharedPreferences.getLong(str3, 0);
                            long j16 = sharedPreferences.getLong(str2, 0);
                            long j17 = sharedPreferences.getLong(str, 0);
                            long j18 = sharedPreferences.getLong("datebio1210", 0);
                            Date date12 = new Date(j9);
                            Date date13 = new Date(j10);
                            Date date14 = new Date(j11);
                            Date date15 = new Date(j12);
                            Date date16 = new Date(j13);
                            Date date17 = new Date(j14);
                            Date date18 = new Date(j15);
                            Date date19 = new Date(j16);
                            Date date20 = new Date(j17);
                            Date date21 = new Date(j18);
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
                                editor4 = editor6;
                                editor4.putString("iScorebio121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorebio122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorebio123", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorebio124", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorebio125", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorebio126", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorebio127", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorebio128", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorebio129", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorebio1210", str28);
                                    editor4.putLong("datebio1210", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1bio121";
                            String str30 = "date1bio124";
                            String str31 = str11;
                            String str32 = "date1bio122";
                            String str33 = "date1bio127";
                            String str34 = "date1bio125";
                            String str35 = "date1bio126";
                            String str36 = str10;
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            String str37 = f3;
                            long j19 = sharedPreferences2.getLong(str29, 0);
                            String str38 = str29;
                            String str39 = f4;
                            long j20 = sharedPreferences2.getLong(str32, 0);
                            long j21 = sharedPreferences2.getLong("date1bio123", 0);
                            String str40 = str32;
                            String str41 = "date1bio123";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1bio128";
                            long j26 = sharedPreferences2.getLong(str46, 0);
                            String str47 = str31;
                            long j27 = sharedPreferences2.getLong(str31, 0);
                            long j28 = sharedPreferences2.getLong(str10, 0);
                            Date date23 = new Date(j19);
                            String str48 = str46;
                            Date date24 = new Date(j20);
                            Date date25 = new Date(j21);
                            Date date26 = new Date(j22);
                            Date date27 = new Date(j23);
                            Date date28 = new Date(j24);
                            Date date29 = new Date(j25);
                            Date date30 = new Date(j26);
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            Date date31 = new Date(j27);
                            Date date32 = new Date(j28);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(date23);
                            arrayList3.add(date24);
                            arrayList3.add(date25);
                            arrayList3.add(date26);
                            arrayList3.add(date27);
                            arrayList3.add(date28);
                            arrayList3.add(date29);
                            arrayList3.add(date30);
                            arrayList3.add(date31);
                            arrayList3.add(date32);
                            Date date33 = (Date) Collections.min(arrayList3);
                            if (date33.compareTo(date23) == 0) {
                                editor2 = editor5;
                                editor2.putString("scorebio121", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorebio122", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorebio123", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorebio124", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorebio125", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorebio126", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorebio127", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorebio128", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorebio129", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorebio1210", str49);
                                    editor2.putLong(str10, l2.longValue());
                                }
                            }
                            String str50 = str9;
                            long j29 = sharedPreferences3.getLong(str50, 0);
                            String str51 = str8;
                            long j30 = sharedPreferences3.getLong(str51, 0);
                            String str52 = str7;
                            long j31 = sharedPreferences3.getLong(str52, 0);
                            long j32 = sharedPreferences3.getLong(str6, 0);
                            long j33 = sharedPreferences3.getLong(str5, 0);
                            long j34 = sharedPreferences3.getLong(str4, 0);
                            long j35 = sharedPreferences3.getLong(str3, 0);
                            String str53 = str;
                            long j36 = sharedPreferences3.getLong(str2, 0);
                            long j37 = sharedPreferences3.getLong(str53, 0);
                            String str54 = str53;
                            long j38 = sharedPreferences3.getLong("datebio1210", 0);
                            Date date34 = new Date(j29);
                            Date date35 = new Date(j30);
                            Date date36 = new Date(j31);
                            Date date37 = new Date(j32);
                            Date date38 = new Date(j33);
                            SharedPreferences.Editor editor7 = editor2;
                            Date date39 = new Date(j34);
                            Date date40 = new Date(j35);
                            String str55 = str52;
                            Date date41 = date39;
                            Date date42 = new Date(j36);
                            Date date43 = new Date(j37);
                            Date date44 = new Date(j38);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date34);
                            arrayList4.add(date35);
                            arrayList4.add(date36);
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date41);
                            arrayList4.add(date40);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            arrayList4.add(date44);
                            Date date45 = (Date) Collections.min(arrayList4);
                            if (date45.compareTo(date34) == 0) {
                                editor = editor7;
                                editor.putString("iScorebio121", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorebio122", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorebio123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorebio124", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorebio125", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorebio126", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorebio127", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorebio128", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorebio129", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorebio1210", str56);
                                    editor.putLong("datebio1210", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        bio2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2012.this.scr.setVisibility(8);
                bio2012.this.chr.stop();
                bio2012.this.toolbar.setVisibility(8);
                bio2012.this.Relative.setBackgroundColor(bio2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2012.this.scr.setVisibility(0);
                bio2012.this.toolbar.setVisibility(0);
                bio2012.this.telegram_layout.setVisibility(8);
                bio2012.this.chr.start();
                bio2012.this.Relative.setBackgroundColor(bio2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = bio2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = bio2012.this.mInterstitialAd = null;
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
                bio2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
