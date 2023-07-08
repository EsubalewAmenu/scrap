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

public class bio2011 extends AppCompatActivity {
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
    private Boolean f485b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2011;
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
    private Toolbar f486tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2011);
        this.f485b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is the Greek word for life?", 0, 0, 0, 0, 0, "‘Logos’", "‘Bios’", "‘Cientia’", "'Cell'", "The word biology is derived from two Greek words: bios meaning ‘life’ and logos meaning ‘study’. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("2.", "What is the shape of an enzyme molecule?", 0, 0, 0, 0, 0, "Globular", "Linear", "Branched", "Pleated", "All enzymes are globular proteins. Globular means having the shape of a ball.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("3.", "In which of the following groups of organisms are all the members unicellular?", 0, 0, 0, 0, 0, "Algae", "Fungi ", "Bacteria", "Viruses", "All bacteria are unicellular prokaryotes. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("4.", "Which of the following chromosomal errors creates a cell with an extra chromosome?", 0, 0, 0, 0, 0, "Non-disjunction.", "Inversion", "Deletion", "Duplication", "Non-disjunction results in one of the gametes lack a chromosome and the other having the extra chromosome. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("5.", "What is the type of scientific research that is directly concerned with studies of the way of solving problems related to human needs?", 0, 0, 0, 0, 0, "Basic science", "Applied science", "Space science", "Current science", "Applied science is the use of scientific research to human needs. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("6.", "For which of the following purposes do biologists uses centrifuges?", 0, 0, 0, 0, 0, "Measuring volume", "Magnifying cell parts", "Culturing microorganisms", "Fractionation of cell contents", "Centrifuge is used to fractionate cell components by a method known as ultracentrifugation. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("7.", "What is the function of DNA polymerase?", 0, 0, 0, 0, 0, "It hydrolyzes the DNA molecule.", "It forms DNA by joining nucleotides.", "It converts the DNA molecule to RNA.", "It joins two RNA molecules of form DBA.", "DNA polymerase is an enzyme that join nucleotides to form DNA. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("8.", "Which one of the following is commonly called the code of life?", 0, 0, 0, 0, 0, "Cell", "Organelle", "Nucleus", "DNA", "DNA is a substance that carries organism's genetic information. It is commonly termed the code of life. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("9.", "Which is another name for secondary consumer?", 0, 0, 0, 0, 0, "Producer", "Herbivore", "Carnivore", "Decomposer", "Secondary consumers are also called carnivores. Carnivores are animals that eat herbivores. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("10.", "Which type of chromosome mutation causes the human genetic defect known as trisomy 16?", 0, 0, 0, 0, 0, "Duplication", "Translocation", "Deletion", "Chromosome inversion", "Trisomy 16 has three copies of chromosome 16. It leads to babies being boni with a range of medical disorder. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("11.", "In which geologic period is the evolution of humans mostly probably believed to have happened?", 0, 0, 0, 0, 0, "Tertiary period", "Jurassic period", "Quaternary period", "Cretaceous period", "According to stratigraphy and radiometric dating, evolution of humans is a major event that occurred in quaternary period. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("12.", "Of the following patterns of innate behavior in animals, which one is considered the simplest?", 0, 0, 0, 0, 0, "Instinctive behavior", "Reflex action", "Taxis movement", "Kinesis movement", "Reflex actions- are the simplest of the innate behaviors. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("13.", "The hypothesis which a scientist tries to disprove is called:", 0, 0, 0, 0, 0, "Alternative hypothesis", "Ad hoc hypothesis", "Null hypothesis", "Auxiliary hypothesis", "Hypothesis can be testable by an experiment. It can be accepted or rejected. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("14.", "What are the compounds that have the same chemical composition, but different arrangement of atoms?", 0, 0, 0, 0, 0, "Anomers", "Isomers", "Polymers", "Monomers", "Isomers are molecules with the same chemical composition, but a different arrangement of atoms. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("15.", "Which one of the following conditions is least likely to denature an enzyme?", 0, 0, 0, 0, 0, "A high temperature", "An extreme PH", "Heavy metal ions", "A low temperature", "High temperature causes increased denaturation of enzyme, while a decrease in temperature causes fewer collisions. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("16.", "Respiration is:", 0, 0, 0, 0, 0, "Anabolic and exergonic", "Anabolic and endergonic ", "Catabolic and exergonic", "Catabolic and endergonic", "Respiration is a biochemical process in which chemical energy in organic molecules is released by oxidation. It is catabolic and exergonic (exothermic). ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("17.", "Both photosynthesis and respiration are involved in:", 0, 0, 0, 0, 0, "Nitrogen Cycle", "Photospheres Cycle", "Water Cycle", "Carbon Cycle", "Both photosynthesis and respiration are the main processes of carbon cycle. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("18.", "Which of the following statements best describes the role of bacteria in the nitrogen cycle? Bacteria turn:", 0, 0, 0, 0, 0, "Oxygen into nitrogen for plants to use.", "Nitrogen into a usable form for plant use called ammonia.", "Nitrogen into a usable form in a process called transpiration.", "Carbon dioxide into oxygen during the process of photosynthesis.", "In the nitrogen cycle, ammonifying bacteria turn nitrogen into ammonia. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("19.", "Which one of the following terms best describes the number of different species in the biosphere or in a particular area?", 0, 0, 0, 0, 0, "Biodiversity", "Genetic diversity", "Ecosystem diversity ", "Species diversity ", "Species diversity is a measure of number of different and the success of each species in the ecosystem.  ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("20.", "The daily cycle of activity that occurs over a 14 – hour period of time is called a:", 0, 0, 0, 0, 0, "Stimulus-response", "Kinesis behavior", "Circadian rhythm", "Taxis behavior", "Rhythms with a period of about 24 hours are called circadian rhythms.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("21.", "Within a few weeks after a heavy rain, pools become teemed with tadpoles. What is the source of the tadpoles?", 0, 0, 0, 0, 0, "The rain water", "The eggs laid by frog", "The decaying vegetation of the pond", "The mud on the floor", "The eggs laid by frogs after a heavy rain could be hatched into frog larva called tadpoles. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("22.", "In what way does an antiretroviral drug help AIDS patients? It", 0, 0, 0, 0, 0, "Stops the multiplication of HIV.", "Kills opportunistic infectious agents.", "Stimulates multiplication of T-helper cells.", "Provides immunity.", "Anti-retroviral drugs are drugs that target retroviruses and prevent", "a", 0, 1, this.f485b));
        arrayList.add(new questions("23.", "Of the following four elements, which one is the least abundant in living things?", 0, 0, 0, 0, 0, "Oxygen", "Hydrogen", "Carbon", "Sulfur", "The most common elements in many cells are: hydrogen 59%, oxygen 24%, carbon 11%, nitrogen 4%, ph organelles: nucleus, chloroplast.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("24.", "If a homogenate of eukaryotic cells is spun in a centrifuge, which of the cellular organelles settles out first?", 0, 0, 0, 0, 0, "Nucleus ", "Ribosome", "Chloroplast", "Mitochondria", "Sedimentation order of nucleus, chloroplast, mitochondria, ribosomes.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("25.", "In which part of mitochondria does the Krebs’s cycle take place?", 0, 0, 0, 0, 0, "In the matrix", "On the inner membrane surface", "On the outer membrane surface", "In the inner-membrane space", "Kreb's cycle takes place in the fluid matrix of a mitochondrion.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("26.", "What is the ultimate source of the electrons that replace those lost from the photosynthesis II during photosynthesis?", 0, 0, 0, 0, 0, "Photosystem I", "Chlorophyll II-b", "Chlorophyll", "Water", "The electrons from photolysis of water (2H20 -402 + 411+ + 4e-) replace those lost from chlorophyll molecule of PS 11.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("27.", "Which one of the following human diseases is NOT correctly matched with its mode of transmission?", 0, 0, 0, 0, 0, "Malaria-vector", "Sleeping sickness-physical contact", "Cholera-contaminated water", "Influenza-droplet infection", "Sleep sickness is transmitted through bites of insect (tsetse fly).", "b", 0, 1, this.f485b));
        arrayList.add(new questions("28.", "Which clinical test is routinely performed to diagnose patients for AIDS?", 0, 0, 0, 0, 0, "Cultural opportunistic infectious agents", "Culturing the virus on a special media", "Serological test for anti-HIV antibody", "Determining hemoglobin amount", "The presence of HIV in the blood can be dragonized by detecting the antibodies produced by the T-helper cell targeting any free HIV.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("29.", "Which of the following pairs of processes add CO_2 to the atmosphere?", 0, 0, 0, 0, 0, "Combustion and respiration", "Respiration and photosynthesis", "Photosynthesis and fossilization", "Decomposition and combustion", "Respiration and combustion of 'substances release the atmosphere.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("30.", "Which bacterial genus fixes nitrogen in the nodules of leguminous plants?", 0, 0, 0, 0, 0, "Agrobacterium", "Escherichia", "Rhizobium", "Azetobacter", "Rhizobium is a soil bacterium that forms nodules on the roots of legumes and takes up nitrogen from the atmosphere.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("31.", "One of the following agricultural practices does NOT have a negative effect on biodiversity", 0, 0, 0, 0, 0, "Use of pesticide", "Use of pesticide", "Growing improved varieties", "Growing landraces", "Deforestation and large-scale agricultural practices have negative effect on biodiversity. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("32.", "On which of the following points do Lamarck’s and Darwin’ theories pf evolution agree?", 0, 0, 0, 0, 0, "Evolution produces new species", "Evolution occurs by natural selection", "All living things tend to over reproduce ", "New structures arise by use-and disuse", "Lamarck and Darwin agree on evolution of new species over time.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("33.", "What is the behavior that an animal learns to ignore a trivial stimulus that is repeated many times?", 0, 0, 0, 0, 0, "Sensitization", "Insight learning", "Habituation", "Latent Learning", "In habituation, an animal learns to ignore a frequent, harmless stimulus.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("34.", "One of the following is true about a behavior that has a fixed action pattern.", 0, 0, 0, 0, 0, "It is a learned behavior.", "It is always done in the same way.", "It can be perfected through experience.", "It does not need a stimulus to trigger it.", "In fixed action pattern behavior, the action always occurs the same way.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("35.", "If a chimpanzee piles up boxes and climbs on it to reach a bunch of bananas hanging from a ceiling, which behavior is manifested?", 0, 0, 0, 0, 0, "Operant conditioning", "Trial and error learning", "Insight learning", "Latent learning", "Insight learning involves mental trial and error without actual trial and error to gain experiences.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("36.", "In which of the following is the current state of biology more of promises than realized major contributions?", 0, 0, 0, 0, 0, "Food production by GMO and genetic engineering", "Pest control and understanding about diseases", "Food production and population control", "Understanding of health and biodiversity conservation", "Genetically modified organisms can be used to manufacture specific products and foods to benefit humans.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("37.", "Which of these elements is known to have less than 10% occurrence in many cells?", 0, 0, 0, 0, 0, "Carbon", "Hydrogen", "Nitrogen", "Oxygen", "The most common element in many cells are hydrogen 59%, oxygen 24%, carbon11%, nitrogen 4%, phosphorus & Sulphur 2%.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("38.", "One of the following is non-carbohydrate molecule.", 0, 0, 0, 0, 0, "Starch ", "Cellulose", "Glycogen", "Collagen", "Collagen is a connective protein found in vertebrates.  ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("39.", "The industrial use of enzymes is helpful for the environment as it contributes to reduction of CO_2 emission. In which of the following is there more mass of CO_2 emissions saved per ton of products by using enzyme technology rather than traditional methods?", 0, 0, 0, 0, 0, "Bread making", "Manufacture of cosmetics", "Paper making", "Cheese making", "Carbon dioxide emission reductions: 1-10Kg CO2/ton bread, cheese cs 2/ton paper and 230Kg CO2/ton 190Kg CO2/ton cosmetics, 6-150Kg CO", "d", 0, 1, this.f485b));
        arrayList.add(new questions("40.", "Which model of enzyme action requires that the shape of the substrate molecule is complementary to that of the active site?", 0, 0, 0, 0, 0, "The induced-fit model", "The lock and key model", "The activation energy model ", "The enzyme function model ", "lock and key model proposes that the shapes of the substrate molecules are complementary to that of the active site.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("41.", "If the average diameter of the human red blood cell is 0.0000007m which one is its correct diameter when expressed in a smaller unit?", 0, 0, 0, 0, 0, "0.00007", "0.007", "7mm", "7000nm", "7.0 x 10-4m = 7000mm (1mm = 10-4m).", "b", 0, 1, this.f485b));
        arrayList.add(new questions("42.", "Which procedure allows biologists to separate different cellular organelles and study their structures and compositions separately?", 0, 0, 0, 0, 0, "Dehydrogenation", "Cell fractionation   ", "Phosphorylation", "Polymerization", "Cell fractionation separates the components of a coil by centrifugation.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("43.", "How many ATP molecules are produced during the complete cellular respiration of one glucose molecule?", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "4", "18", "36", "The expected overall ATP production from aerobic respiration of a glucose molecule could be achieved because about 2 molecules of ATP are used to drive the proton pumps. Hence, the actual yield is about 36 molecule of ATP per molecule of glucose.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("44.", "What is the main method of transmission of botulism?", 0, 0, 0, 0, 0, "Direct contact", "Droplet infection", "Eating contaminated food", "Drinking contaminated water ", "Botulinum is a serious form of food poisoning caused by eating preserved rood that has been contaminated. with botulinum organisms. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("45.", "From which group of microorganisms was the first antibiotics produced? ", 0, 0, 0, 0, 0, "Members of viruses", "Members of the fungi", "Gram-negative bacteria", "Gram-positive bacteria", "In 1928, Sir Alexander Fleming discovered the first antibiotics (penicillin) from a fungus called Penicillium notatum. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("46.", "What is a capsid?", 0, 0, 0, 0, 0, "The genetic material of a virus  ", "The DNA of a virus", "The RNA of a virus  ", "The protein shell of a virus", "Capsid is the outer coat of protein that surrounds a virus particle. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("47.", "What is the general name of crop plants that add nitrogen to the soil because of their symbiotic association with certain types of bacterial? ", 0, 0, 0, 0, 0, "Nodules", "Legumes", "Cereals", "Herbs", "Legume is a plant that has pods as fruits and roots that bear nodules containing nitrogen-fixing bacteria. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("48.", "If two parents with genotypes \"Aa\" are cross-bred and that there is no codominance in the inheritance pattern, what proportion of the offspring would have genotypes exactly like that of their parents?", 0, 0, 0, 0, 0, "50% ", "75% ", "100%", "25%", "Parental genotype: Aa x Aa\nGametes: A a x A a \n", "a", C2719R.C2721drawable.bio2011q48e, 1, this.f485b));
        arrayList.add(new questions("49.", "Which of the following is an example of a cell formed by reduction division?", 0, 0, 0, 0, 0, "Nerve cells", "Kidney cells", "Bone cells", "Sperm cells", "Meiosis is sometimes called \"reduction division\" because it reduces the number of chromosomes to half the normal number so that, when fusion of sperm and egg occurs, baby will have the correct number.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("50.", "One of the following sources of evidence provides a more direct support to the process of Charles Darwin's theory of evolution.", 0, 0, 0, 0, 0, "Physiology", "Anatomy", "Genetic", "Geographical distribution", "Paleontology, comparative anatomy, comparative embryology, comparative biochemistry and plant and animal breeding experiments are evidences for evolution. Comparative anatomy provides a more direct support to the process of Charles Darwin's theory of evolution.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("51.", "Which animal behavior Pavlov's dog?   ", 0, 0, 0, 0, 0, "Associative learning", "Latent learning", "Instinctive behavior", "Habituation", "Associative learning is learning in which one object comes to be linked, through experience, with another one. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("52.", "Through which of the following methods can blood be separated into its cellular and fluid parts?", 0, 0, 0, 0, 0, "Separating funnel", "Fractional distillation", "Centrifuging", "Simple distillation", "Ultracentrifuges are a fast centrifuge used to separate cell components of animals and plants. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("53.", "The most abundant inorganic molecule in the atmosphere that traps heat is:", 0, 0, 0, 0, 0, "H2S ", "O2", "H2O", "CO2", "Carbon dioxide is a greenhouse gas that contributes to the warming of the Earth's atmosphere by absorbing radiation from the Earth's surface.  ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("54.", "When glucose molecules are joined by α-linkage which of the following carbohydrate is obtained?", 0, 0, 0, 0, 0, "Lactose", "Starch", "Glycogen", "Cellulose ", "Starch and glycogen are carbohydrates obtained by joining many Alpha-glucose molecules. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("55.", "Which of the following statements is NOT correct about the effect of temperature on enzymes.", 0, 0, 0, 0, 0, "Raising the temperature increases the kinetic energy of molecules", "A ten degree centigrade increase in temperature may increase the activity of most enzymes by 50% to 100%", "Most enzymes are insensitive to temperature at low pH ", "Most enzymes are denatured at 40 Degree Centigrade", "At low temperatures, enzymes work extremely slowly. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("56.", "Organelles in the cytoplasm that are known as 'power house' of the cell are", 0, 0, 0, 0, 0, "Mitochondria", "Chloroplast", "Ribosome", "Cellulose", "Mitochondrion is organelle that responsible for aerobic cellular respiration. It is also called 'power house of a cell'.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("57.", "Which of the following is NOT a function of lysosomes? ", 0, 0, 0, 0, 0, "Autophagy", "Autolysis", "Digestion ", "Synthesis ", "Lysosomes contain hydrolytic enzymes that digest worn out or 0: damaged organelles as well as engulfed. bacteria. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("58.", "The different steps for complete aerobic respiration are:  ", 0, 0, 0, 0, 0, "Glycolysis and oxidative phosphorylation", "Glycolysis and Krebs cycle", "Glycolysis, Krebs cycle and terminal oxidation.", "Krebs cycle and terminal oxidation", "Stages of aerobic respiration of glucose: glycolysis, the link reaction, krebs cycle, and electron transport and chemiosmosis.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("59.", "Which of the following processes indicate the process photosynthesis?", 0, 0, 0, 0, 0, "Reductive, exergonic and catabolic", "Reductive, endogenic and catabolic", "Reductive, exergonic and anabolic", "Reductive, endergonic and anabolic", "Photosynthesis is endothermic endergonic reactions. In these reactions the products have more energy than the reactants. Photosynthesis is also anabolic reactions that require an input of energy for the reaction to take place.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("60.", "The active sludge method Sewage treatment is based on the principle", 0, 0, 0, 0, 0, "Decomposition and removal of organic matter.", "Removal of polluting organic matter through filtration.", "Denitrification.", "Anaerobic respiration", "Activated sludge is aerated sewage containing microorganisms added to untreated sewage to purify it by accelerating its bacterial decomposition.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("61.", "When an organism containing a gene which does NOT belong to it is derived from somewhere else, the organism is said to be: ", 0, 0, 0, 0, 0, "hybrid", "Transgenic", "Mutant", "Clonal", "Transgenic organism js a genetically modified organism that contains a gene or genes transferred from another organism belonging to a different species.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("62.", "When is reverse transcriptase a useful enzyme? When:", 0, 0, 0, 0, 0, "Nutrients are scarce.", "There are no host cells present", "Spikes are forming in the new virus.", "An RNA virus converts its RNA to DNA.", "The reverse transcriptase converts the RNA into DNA using building blocks called nucleotides.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("63.", "If you were to travel from the Arctic Circle to the Equator, sequence of biomes would you most likely pass through?", 0, 0, 0, 0, 0, "Tundra, temperate forest, taiga, tropical rain forest", "Taiga, tundra, temperate forest, tropical rain forest", "Tundra, taiga, temperate forest, tropical rain forest", "Tropical rain forest, temperate forest, taiga, tundra", "The main biomes Arctic Circle to Equator include tundra, boreal forest, temperate forest, and tropical forest.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("64.", "The fact that Ethiopia is a regional center of biological diversity which of the following diversity is expressed?", 0, 0, 0, 0, 0, "The many mountain, valleys, rivers and scenic beauty.", "High number of endemic wild and domestic plant species.", "Wide range of altitude and climate.", "The number of different biomes in the country.", "There are several biomes to be found within Ethiopia.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("65.", "Under ideal conditions and unlimited resources, continuous population growth pattern is known as:", 0, 0, 0, 0, 0, "Density dependent growth", "Logistic growth", "Exponential growth", "Population distribution growth", "Population shows exponential population growth when the organisms are in ideal conditions or when the resources are plentiful.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("66.", "If colour blindness is sex linked and a colour-blind man marries the daughter of a colour-blind person, which of the following is their progeny?", 0, 0, 0, 0, 0, "None of her daughters are color-blind", "All her sons are colour-blind", "All her daughters are colour-blind", "Half of her sons are colour-blind", "Let color blind man has XbY genotype and affected woman has XbX genotype\nGametes:XbY  x  XbX\n", "d", C2719R.C2721drawable.bio2011q66e, 1, this.f485b));
        arrayList.add(new questions("67.", "Transfer of a gene or genes through a virus is called:", 0, 0, 0, 0, 0, "transformation", "transduction", "genetic engineering", "conjugation", "Transduction ls the transfer of genetic material from one bacterium to another using a bacteriophage.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("68.", "Which of the following concept is attributed to Charles Darwin?", 0, 0, 0, 0, 0, "Use and disuse of organs is of great importance in evolution.", "Every cell must come from a pre-existing cell.", "In the struggle for existence, the fittest would survive.", "The gametes will carry only one of pair of contrasting characters.", "Darwin's theory of natural selection stated that \"Those members of a species which are best adapted to their environment will survive and reproduce in greater number than other less well adapted.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("69.", "Occurrence of endemic species in Ethiopia is due to:", 0, 0, 0, 0, 0, "The fact that these species have been extinct from other regions.", "Continental separation", "The fact that there is no terrestrial route to these places.", "Retrogressive evolution.", "Endemic is an organism that is endemic to an area is always present an area. Many species are endemic to Ethiopia.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("70.", "Skinner box\" is used for experiments in:", 0, 0, 0, 0, 0, "operant conditioning", "Classical conditioning", "migration", "taxis", "Skinner studied operant conditioning using Skinner box.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("71.", "Which of the following factors affects enzyme activity without denaturing the enzyme molecule?", 0, 0, 0, 0, 0, "High temperature", "Low temperature", "High pH", "Low pH", "Low temperatures slow enzyme activity but do not denature the enzyme.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("72.", "Which of the following can reverse or reduce an allosteric enzyme inhabitation?", 0, 0, 0, 0, 0, "Adding more substrate", "Adding more end products ", "Depleting the substrate", "depleting the end product", "Since allosteric inhibition is not affected by substrates, its inhibition can be reversed by removing the products.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("73.", "In what way do retro viruses differ from other RNA viruses?", 0, 0, 0, 0, 0, "Their genetic material is RNA ", "they are parasitic", "they copy RNA to DNA ", "they are smaller in size", "Retrovirus 1s an RNA virus that converts its genetic information from RNA into DNA alter it has infected a host.", "c", 0, 1, this.f485b));
        arrayList.add(new questions("74.", "as an ecological succession passes from a lower to a higher seral stage, which of the following will NOT happen?", 0, 0, 0, 0, 0, "The community gets more complex", "Ecological niches increase", "Species get more diverse", "they are smaller in size.", "In any kind of succession:\n•\tThe total biomass of community increases.\n•\tThe species diversity Increase.\n•\tThe number of ecological niches Increases.\n•\tThe complexity of the food web increase.\n•\tThe stability of the community increases and become climax Community.\n", "d", 0, 1, this.f485b));
        arrayList.add(new questions("75.", "What is the population growth phase of the current world population?", 0, 0, 0, 0, 0, "Exponential phase", "Lag phase", "Decline phase", "Static phase", "The current world population growth is exponential phase. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("76.", "If allowed to self-pollinate, which of the following pea genotype would produce progeny with 9:3:3:1 phenotypic ratio?", 0, 0, 0, 0, 0, "RRYY", "RrYY", "RRYY", "RrYy", "F1 self-pollination   RrYy X RrYy \nF1 gametes (n)  RY, Ry, rY, ry (1st parent) RY, Ry, rY ry (2nd parent) ,\n", "d", C2719R.C2721drawable.bio2011q76e, 1, this.f485b));
        arrayList.add(new questions("77.", "How many nucleotides are needed to form codons for a protein that is 100 amino acids long?", 0, 0, 0, 0, 0, "100 nucleotides", "200 nucleotides", "300 nucleotides", "640 nucleotides", "Three nucleotides form one codon that codes for an amino acid, hundred amino acids require 300 nucleotides. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("78.", "Which of the following is the common idea held by all the creationists?", 0, 0, 0, 0, 0, "Life is eternal.", "Life was created by a supernatural being.", "All life was created in six days.", "Life came to earth from elsewhere in the universe.", "Special creationism is a theory claiming that the different forms of life on Earth were created by a supreme being. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("79.", "Among the following, which one had the cranial capacity of about the same size as that of Homo sapiens?", 0, 0, 0, 0, 0, "Homo Habilis", "Homo erectus", "Lucy", "the Neanderthal man", "The cranial capacity of the Neanderthal man is about 1500 cm3.", "d", 0, 1, this.f485b));
        arrayList.add(new questions("80.", "One of the following behavioral patterns of human babies is more or less similar to the imprinting of newly hatched goose?", 0, 0, 0, 0, 0, "Fixed action pattern", "Attachment-formation", "Habituation", "Breast suckling", "Both newly hatched geese and human babies form attachment with care givers. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("81.", "In the human body, which conditions are generally considered optimum for most enzymes?", 0, 0, 0, 0, 0, "37 degree C And pH1.0", "90 degree C and pH7.0", "5 degree C and pH 9.0", "37 degree C and pH 7.0", "In human body, enzymes work best at neutral pH and body temperature. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("82.", "Which of the following has the highest water potential than all the other?", 0, 0, 0, 0, 0, "Animal cells", "Different solutions", "Pure liquid water ", "Different suspensions", "Pure, liquid water has a higher water potential than any other system. It is defined as zero. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("83.", "Which of the four stages in the aerobic respiration of glucose does NOT", 0, 0, 0, 0, 0, "Glycolysis", "The link reaction", "Krebs cycle", "Electron transport and chemiosmosis", "The link reaction does not produce ATP. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("84.", "In an experiment to study photosynthesis, a plant was provided with radioactive carbon dioxide as a metabolic tracer and the radioactive carbon was incorporated first into oxaloacetate. Which one of the following would best characterize this plant?", 0, 0, 0, 0, 0, "C4 plant", "C3 plant", "CAM plant", "Heterotopic plant", "C4 plants produce C4 compound, oxaloacetate, in light-independent reactions. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("85.", "Which of the between a bacterium and a virus? ", 0, 0, 0, 0, 0, "DNA is present in the former, but absent in the latter", "The former is cellular, but the latter is acellular.", "Protein is absent in the former, but present in the latter.", "The former causes malaria, but the latter cause’s cholera.", "Bacterium is a single-celled microorganism without distinct nuclei or organized cell structures. It carries out independent life processes. Virus refers to organic entities consisting simply of genetic material surrounded by a protective coat. It cannot lead independent life. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("86.", "Which of the following statement about transgenic organisms is correct?", 0, 0, 0, 0, 0, "A bacterium that contain genes from another organism.", "A plant that has been cross-pollinated with another plant.", "Any animal that has been reared in isolation in the laboratory.", "Any organism in which a foreign gene is added to its genome.", "Transgenic organism is a genetically modified organism that contains a gene or genes transferred from another organism belonging to a different species. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("87.", "If a radioactive substance that weights 5,600 grams and has a half-life of 100 years is left with 700 grams, for how long has the decaying activity been undergoing?", 0, 0, 0, 0, 0, "100 years ", "200 years", "300 years", "500 years", "", "c", C2719R.C2721drawable.bio2011q87e, 1, this.f485b));
        arrayList.add(new questions("88.", "What is the survival value of a social behavior in which some birds move in large groups? ", 0, 0, 0, 0, 0, "Protection of a territory", "Protection from predators", "Technique for trapping prey", "Displaying courtship activities ", "Birds moving in groups in which the movement of the whole group is coordinated; rapid movements one way and make it more difficult for a predator to attack. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("89.", "What is the biome of the world where succulent plants are commonly found? ", 0, 0, 0, 0, 0, "Hot deserts ", "Thorn forests ", "Deciduous forests ", "Temperate grasslands  ", "Succulent plant, such as cacti are found hot desert. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("90.", "Which of the following statements is NOT correct?", 0, 0, 0, 0, 0, "Employers may not dismiss an employee because of his/her HIV status.", "HIV-positive people are forced by law to disclose their HIV status.", "There is no medication that can reduce your chances of contracting HIV.", "Mothers can give their babies HIV by means of breastfeeding. ", "No law is forcing HIV positive people to make known themselves.", "b", 0, 1, this.f485b));
        arrayList.add(new questions("91.", "Lipids to become sphingolipids must contain:", 0, 0, 0, 0, 0, "Glycerol", "Nitrogen", "Alcohol", "Triglycerides", "Sphingolipids are class of lipids containing nitrogen in addition to carbon, hydrogen and oxygen atoms. ", "b", 0, 1, this.f485b));
        arrayList.add(new questions("92.", "If other conditions were to remain constant, which one of the following changes would explain a reduced rate of activity in an enzyme-controlled reaction? ", 0, 0, 0, 0, 0, "Concentration of end product ", "Substrate concentration ", "Enzyme concentration ", "Temperature towards the optimum ", "If concentration of end product is in excess, rate of enzyme activity would reduce.", "a", 0, 1, this.f485b));
        arrayList.add(new questions("93.", "Which of the following statements best describes an induced fit model?", 0, 0, 0, 0, 0, "An active site alters shape such that it is ready to accept a", "A substrate adopts the correct binding conformation before entering an active site.", "A substrate binds to an active site and alters the shape of the active site.", "An active site alters the shape of the substrate such that it can adopt the necessary active conformation for binding.", "Induced-fit model is the active site and substrate do not complement each other but the binding of substrate molecules produces a change in shape in the active site, allowing the substrate to fit the active site. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("94.", "Which of the following happens if a nucleus is missing in a cell?", 0, 0, 0, 0, 0, "Nuclear pores will be blocked", "Endoplasmic reticulum will be unfolded", "DNA synthesis will be enhanced", "Ribosomal functions will be disrupted", "The function of nucleolus is to synthesis the components of ribosomes. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("95.", "Which one is first inhibited if a cell contains excess of ATP?", 0, 0, 0, 0, 0, "Krebs cycle", "Oxidative phosphorylation", "Glycolysis", "Electron transport", "The first stage of cellular respiration could be inhibited if excessive ATP is present in the cell. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("96.", "Which of the following results in the production of oxygen during photosynthesis?", 0, 0, 0, 0, 0, "Reducing NADP+", "Splitting of the water molecules", "Electron transfer system of photo system I", "Electron transfer system of photo system II", "", "b", C2719R.C2721drawable.bio2011q96e, 1, this.f485b));
        arrayList.add(new questions("97.", "Which one of the following happens during integration of viruses in host cells?", 0, 0, 0, 0, 0, "The virus takes over the host cell machinery.", "The viral DNA enters the host cell.", "The virus attaches to a host cell receptor.", "The viral DNA is inserted into the host DNA.", "Viral DNA can integrate into the chromosomal DNA of the cell. ", "d", 0, 1, this.f485b));
        arrayList.add(new questions("98.", "The following statements are correct regarding ecological succession EXCEPT:", 0, 0, 0, 0, 0, "Ecological succession is a random process.", "The food chain relationship becomes more complex.", "The role of decomposers becomes more and more important.", "Species diversity increases as succession proceeds", "Succession consists of a series consecutive stage is termed seres. ", "a", 0, 1, this.f485b));
        arrayList.add(new questions("99.", "Which one of the following phenomena supports Darwin's concept of", 0, 0, 0, 0, 0, "Development of transgenic animals", "Production of 'Dolly', the sheep by cloning", "Prevalence of pesticide resistant insects", "Development of organs from 'stem cells' for organ transplantation", "Resistance of insects to harmful chemicals is example of natural selection. ", "c", 0, 1, this.f485b));
        arrayList.add(new questions("100.", "One of the following is NOT true about operant conditioning.", 0, 0, 0, 0, 0, "It is based on innate behaviors.", "It is based on reward and punishment.", "It is concerned with learnt behavior.", "It is based on consequences of actions.", "Operant conditioning occurs when animal learns to associate the behavioral response to a stimulus with a reward or a punishment.", "a", 0, 1, this.f485b));
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
        this.f486tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2011.this.timer.setVisibility(0);
                    bio2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    bio2011.this.scr.setVisibility(8);
                    bio2011.this.chr.stop();
                    bio2011.this.toolbar.setVisibility(8);
                    bio2011.this.Relative.setBackgroundColor(-7829368);
                    bio2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2011.this.getBaseContext());
                    int unused = bio2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2011.this.highscoreBio2011 = defaultSharedPreferences.getInt("bio2011hs", 0);
                    int access$600 = bio2011.this.part1 + bio2011.this.part2 + bio2011.this.part3 + bio2011.this.part4 + bio2011.this.part5 + bio2011.this.part6 + bio2011.this.part7 + bio2011.this.part8 + bio2011.this.part9;
                    bio2011.this.resultText.setText(String.valueOf(access$600));
                    bio2011.this.progressbar.setProgress(access$600);
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
                    int unused11 = bio2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = bio2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = bio2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = bio2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = bio2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = bio2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = bio2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = bio2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "bio2011hs";
                    int unused19 = bio2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = bio2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = bio2011.this.answered1 + bio2011.this.answered2 + bio2011.this.answered3 + bio2011.this.answered4 + bio2011.this.answered5 + bio2011.this.answered6 + bio2011.this.answered7 + bio2011.this.answered8 + bio2011.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > bio2011.this.highscoreBio2011) {
                        edit.putInt(str, access$600);
                    }
                    long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2011.this.chr.getBase()) / 1000;
                    if (bio2011.this.mode.booleanValue()) {
                        Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                        int i = (access$600 * 100) / 100;
                        DecimalFormat decimalFormat = new DecimalFormat("##.##");
                        String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                        String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                        long j = defaultSharedPreferences.getLong("date1bio111", 0);
                        long j2 = defaultSharedPreferences.getLong("date1bio112", 0);
                        long j3 = defaultSharedPreferences.getLong("date1bio113", 0);
                        String str2 = f;
                        long j4 = defaultSharedPreferences.getLong("date1bio114", 0);
                        Long l = valueOf;
                        String str3 = f2;
                        long j5 = defaultSharedPreferences.getLong("date1bio115", 0);
                        SharedPreferences.Editor editor3 = edit;
                        String str4 = str2;
                        long j6 = defaultSharedPreferences.getLong("date1bio116", 0);
                        long j7 = defaultSharedPreferences.getLong("date1bio117", 0);
                        long j8 = defaultSharedPreferences.getLong("date1bio118", 0);
                        long j9 = defaultSharedPreferences.getLong("date1bio119", 0);
                        long j10 = defaultSharedPreferences.getLong("date1bio1110", 0);
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
                            editor.putString("scorebio111", str3);
                            editor.putLong("date1bio111", l.longValue());
                        } else {
                            String str5 = str3;
                            editor = editor3;
                            if (date11.compareTo(date2) == 0) {
                                editor.putString("scorebio112", str5);
                                editor.putLong("date1bio112", l.longValue());
                            } else if (date11.compareTo(date3) == 0) {
                                editor.putString("scorebio113", str5);
                                editor.putLong("date1bio113", l.longValue());
                            } else if (date11.compareTo(date4) == 0) {
                                editor.putString("scorebio114", str5);
                                editor.putLong("date1bio114", l.longValue());
                            } else if (date11.compareTo(date5) == 0) {
                                editor.putString("scorebio115", str5);
                                editor.putLong("date1bio115", l.longValue());
                            } else if (date11.compareTo(date6) == 0) {
                                editor.putString("scorebio116", str5);
                                editor.putLong("date1bio116", l.longValue());
                            } else if (date11.compareTo(date7) == 0) {
                                editor.putString("scorebio117", str5);
                                editor.putLong("date1bio117", l.longValue());
                            } else if (date11.compareTo(date8) == 0) {
                                editor.putString("scorebio118", str5);
                                editor.putLong("date1bio118", l.longValue());
                            } else if (date11.compareTo(date9) == 0) {
                                editor.putString("scorebio119", str5);
                                editor.putLong("date1bio119", l.longValue());
                            } else if (date11.compareTo(date10) == 0) {
                                editor.putString("scorebio1110", str5);
                                editor.putLong("date1bio1110", l.longValue());
                            }
                        }
                        long j11 = defaultSharedPreferences.getLong("datebio111", 0);
                        long j12 = defaultSharedPreferences.getLong("datebio112", 0);
                        long j13 = defaultSharedPreferences.getLong("datebio113", 0);
                        long j14 = defaultSharedPreferences.getLong("datebio114", 0);
                        long j15 = defaultSharedPreferences.getLong("datebio115", 0);
                        SharedPreferences.Editor editor4 = editor;
                        long j16 = defaultSharedPreferences.getLong("datebio116", 0);
                        long j17 = defaultSharedPreferences.getLong("datebio117", 0);
                        long j18 = defaultSharedPreferences.getLong("datebio118", 0);
                        long j19 = defaultSharedPreferences.getLong("datebio119", 0);
                        long j20 = defaultSharedPreferences.getLong("datebio1110", 0);
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
                            editor2.putString("iScorebio111", str4);
                            editor2.putLong("datebio111", l.longValue());
                        } else {
                            editor2 = editor4;
                            String str6 = str4;
                            if (date22.compareTo(date13) == 0) {
                                editor2.putString("iScorebio112", str6);
                                editor2.putLong("datebio112", l.longValue());
                            } else if (date22.compareTo(date14) == 0) {
                                editor2.putString("iScorebio113", str6);
                                editor2.putLong("datebio113", l.longValue());
                            } else if (date22.compareTo(date15) == 0) {
                                editor2.putString("iScorebio114", str6);
                                editor2.putLong("datebio114", l.longValue());
                            } else if (date22.compareTo(date16) == 0) {
                                editor2.putString("iScorebio115", str6);
                                editor2.putLong("datebio115", l.longValue());
                            } else if (date22.compareTo(date17) == 0) {
                                editor2.putString("iScorebio116", str6);
                                editor2.putLong("datebio116", l.longValue());
                            } else if (date22.compareTo(date18) == 0) {
                                editor2.putString("iScorebio117", str6);
                                editor2.putLong("datebio117", l.longValue());
                            } else if (date22.compareTo(date19) == 0) {
                                editor2.putString("iScorebio118", str6);
                                editor2.putLong("datebio118", l.longValue());
                            } else if (date22.compareTo(date20) == 0) {
                                editor2.putString("iScorebio119", str6);
                                editor2.putLong("datebio119", l.longValue());
                            } else if (date22.compareTo(date21) == 0) {
                                editor2.putString("iScorebio1110", str6);
                                editor2.putLong("datebio1110", l.longValue());
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
                        bio2011.this.scr.setVisibility(8);
                        bio2011.this.chr.stop();
                        bio2011.this.toolbar.setVisibility(8);
                        bio2011.this.Relative.setBackgroundColor(-7829368);
                        bio2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2011.this.getBaseContext());
                        int unused = bio2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = bio2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = bio2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = bio2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = bio2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = bio2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = bio2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = bio2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = bio2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = bio2011.this.highscoreBio2011 = defaultSharedPreferences.getInt("bio2011hs", 0);
                        int access$600 = bio2011.this.part1 + bio2011.this.part2 + bio2011.this.part3 + bio2011.this.part4 + bio2011.this.part5 + bio2011.this.part6 + bio2011.this.part7 + bio2011.this.part8 + bio2011.this.part9;
                        TextView access$1600 = bio2011.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        bio2011.this.progressbar.setProgress(access$600);
                        bio2011.this.progressbar.setMax(100);
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
                        int unused11 = bio2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = bio2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = bio2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = bio2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = bio2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = bio2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = bio2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = bio2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = bio2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = bio2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = bio2011.this.answered1 + bio2011.this.answered2 + bio2011.this.answered3 + bio2011.this.answered4 + bio2011.this.answered5 + bio2011.this.answered6 + bio2011.this.answered7 + bio2011.this.answered8 + bio2011.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > bio2011.this.highscoreBio2011) {
                            edit.putInt("bio2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2011.this.chr.getBase()) / 1000;
                        defaultSharedPreferences.getFloat("iScorebio11", 0.0f);
                        String str = "datebio119";
                        String str2 = "datebio118";
                        String str3 = "datebio117";
                        String str4 = "datebio116";
                        String str5 = "datebio115";
                        String str6 = "datebio114";
                        String str7 = "datebio113";
                        String str8 = "datebio112";
                        String str9 = "datebio111";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1bio1110";
                        String str11 = "date1bio119";
                        if (bio2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1bio111", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1bio112", 0);
                            long j3 = defaultSharedPreferences.getLong("date1bio113", 0);
                            String str13 = "date1bio113";
                            String str14 = f;
                            String str15 = "date1bio111";
                            long j4 = defaultSharedPreferences.getLong("date1bio115", 0);
                            String str16 = "date1bio115";
                            String str17 = "date1bio114";
                            String str18 = "date1bio116";
                            long j5 = defaultSharedPreferences.getLong("date1bio116", 0);
                            long j6 = defaultSharedPreferences.getLong("date1bio117", 0);
                            String str19 = str11;
                            String str20 = "date1bio118";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1bio112";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1bio114", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1bio117";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1bio118", 0));
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
                                editor3.putString("scorebio111", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorebio112", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorebio113", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorebio114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorebio115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorebio116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorebio117", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorebio118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorebio119", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorebio1110", str25);
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
                            long j18 = sharedPreferences.getLong("datebio1110", 0);
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
                                editor4.putString("iScorebio111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorebio112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorebio113", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorebio114", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorebio115", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorebio116", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorebio117", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorebio118", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorebio119", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorebio1110", str28);
                                    editor4.putLong("datebio1110", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1bio111";
                            String str30 = "date1bio114";
                            String str31 = str11;
                            String str32 = "date1bio112";
                            String str33 = "date1bio117";
                            String str34 = "date1bio115";
                            String str35 = "date1bio116";
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
                            long j21 = sharedPreferences2.getLong("date1bio113", 0);
                            String str40 = str32;
                            String str41 = "date1bio113";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1bio118";
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
                                editor2.putString("scorebio111", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorebio112", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorebio113", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorebio114", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorebio115", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorebio116", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorebio117", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorebio118", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorebio119", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorebio1110", str49);
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
                            long j38 = sharedPreferences3.getLong("datebio1110", 0);
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
                                editor.putString("iScorebio111", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorebio112", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorebio113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorebio114", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorebio115", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorebio116", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorebio117", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorebio118", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorebio119", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorebio1110", str56);
                                    editor.putLong("datebio1110", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        bio2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2011.this.scr.setVisibility(8);
                bio2011.this.chr.stop();
                bio2011.this.toolbar.setVisibility(8);
                bio2011.this.Relative.setBackgroundColor(bio2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2011.this.scr.setVisibility(0);
                bio2011.this.toolbar.setVisibility(0);
                bio2011.this.telegram_layout.setVisibility(8);
                bio2011.this.chr.start();
                bio2011.this.Relative.setBackgroundColor(bio2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = bio2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = bio2011.this.mInterstitialAd = null;
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
                bio2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
