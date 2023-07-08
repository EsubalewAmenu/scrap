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

public class bio2010 extends AppCompatActivity {
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
    private Boolean f483b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2010;
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
    private Toolbar f484tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2010);
        this.f483b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following tools is used by a biologist to study the internal anatomy of experimental animals?", 0, 0, 0, 0, 0, "Dissecting kit ", "Hand lens", "Petri dish ", "Microscope ", "Dissecting kit is used to study the internal anatomy of an organism, such as a frog.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("2.", "Which of the following is NOT a characteristic of an enzyme? ", 0, 0, 0, 0, 0, "It is a globular protein ", "It functions as a catalyst ", "It lowers the energy of activation ", "It is converted to products", "Characteristics of an enzyme: it is a globular protein, a biological catalyst, efficient, specific, and lowers activation energy. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("3.", "Who was the first person who believed to have seen moving cells under a microscope? ", 0, 0, 0, 0, 0, "Robert Hooke ", "Rene Dutrochet", "Anton van Leeuwenhoek ", "Theodor Schwann", "Anton van Leeuwenhoek sees living, moving unicellular organisms (protoctistans) in a drop of water. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("4.", "Why do micro-organisms decompose dead organic matters? ", 0, 0, 0, 0, 0, "To release mineral nutrients for the plants ", "To clean up the ecosystem ", "To drive energy for their own use ", "To keep the balance of atmospheric gases ", "Micro-organisms decompose dead organic matters and absorb these products of digestion to drive energy for their own use.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("5.", "The practice of modern agriculture that reduces crop biodiversity is: ", 0, 0, 0, 0, 0, "overgrazing ", "forest clearing ", "growing landraces ", "growing few high yielding varieties ", "The intensive farming of one 'crop (monocultures) year after year greatly reduces crop biodiversity. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("6.", "Which one of the following is the best scientific approach to come to conclusive evidence showing that a given event is caused by a certain factor? ", 0, 0, 0, 0, 0, "Having a strong belief ", "Making a good guess ", "Making a good guess ", "Conducting an experiment", "Make an observation.\nAsk a question.\nForm a hypothesis, or testable explanation.\nMake a prediction based on the hypothesis.\nTest the prediction.\nIterate: use the results to make new hypotheses or predictions.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("7.", "Of the following organic molecules, which one includes a pentose sugar? ", 0, 0, 0, 0, 0, "Glucose ", "Fructose ", "Galactose ", "Deoxyribose ", "A pentose sugar is a five-carbon monosaccharide that is found in a ribose and deoxyribose of RNA and DNA, respectively. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("8.", "What does an enzyme do to a chemical reaction that allows it to proceed optimally? ", 0, 0, 0, 0, 0, "It lowers the required activation energy. ", "It increases the amount of the substrate. ", "It increases the required activation energy. ", "It modifies both the pH and the temperature.", "An enzyme speeds up a reaction by lowering the activation energy required for reactants to enter the transition state. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("9.", "Which of the following is lacking in prokaryotic cells? ", 0, 0, 0, 0, 0, "Cytosol ", "Ribosome ", "DNA strand ", "Cellulose ", "All bacteria do have a cell wall that is made from a substance called peptidoglycan, but not from cellulose. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("10.", "What is the name of a major group of eukaryotic organisms that obtain their nutrition using extracellular digestion? ", 0, 0, 0, 0, 0, "Viruses", "Bacteria ", "Fungi ", "Algae ", "Fungus (plural fungi) is a eukaryotic organism that obtains its nutrition using extracellular digestion. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("11.", "What kind of nutrition do most of the decomposers have in general? ", 0, 0, 0, 0, 0, "Autotrophic nutrition ", "Saprobiotic nutrition ", "Endosymbiont nutrition ", "Chemosynthetic nutrition ", "Decomposers, such as fungi and bacteria, feed by a method known, as saprobiotic nutrition. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("12.", "To which genus of primates are the Neanderthal humans classified? ", 0, 0, 0, 0, 0, "The genus Ardipithecus ", "The genus Australopithecus", "The genus Homo", "the genus Synanthropes ", "The human species Homo neanderthalensis belongs to the genus Homo. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("13.", "In which of the following is there a MISMATCH between the type of innate behavior and the resulting action/response? ", 0, 0, 0, 0, 0, "Instinctive Behavior - Imprinting in birds ", "Reflex Action - Blinking of the eyes in humans ", "Instinctive behavior - Nest-building in birds ", "Orientational Movement - Weaving a web in spiders ", "Kineses and taxes of simple animals, such as woodlice are example of orientational behavior. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("14.", "Cells were first seen using the microscope by: ", 0, 0, 0, 0, 0, "Schleiden ", "Robert Hooke ", "Schwann ", "Leeuwenhoek ", "Robert Hooke saw cells of cork using the earliest compound microscopes. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("15.", "The ultimate source of genetic variation is: ", 0, 0, 0, 0, 0, "mutation ", "migration ", "genetic drift ", "selection", "Mutation is a random change in genetic information that results in genetic variation.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("16.", "Which of the following is the first step in starting a research process? ", 0, 0, 0, 0, 0, "Searching sources of information to locate problem. ", "Survey of related literature ", "Identification of problem ", "Searching for solutions to the problem ", "steps in scientific method: problem identification, do background research, construct hypothesis, experiment, analyses results draw conclusion and report ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("17.", "For which of the following purposes is Global Positioning System (GPS) used? ", 0, 0, 0, 0, 0, "Map of an area ", "Theodolite ", "Microwave ", "Satellite signal ", "GPS is used to record positions quickly and accurately. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("18.", "Which of the following statements is INCORRECT with respect to an enzyme's ability to catalyze a reaction? ", 0, 0, 0, 0, 0, "An enzyme provides a reaction surface and a hydrophilic environment for the reaction to take place. ", "An enzyme binds reactants such that they are positioned correctly and can attain their transition-state configurations.", "An Enzyme allows the reaction to go through a more stable transition state than would normally be the case. ", "An enzyme can weaken bonds in reactants through the binding process. ", "An enzyme allow the reaction to enter unstable transition state to break the bond of the complex. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("19.", "The amount of organic matter present at a given time per unit area is called: ", 0, 0, 0, 0, 0, "carbon sequestration ", "standing crop ", "carbon foot print", "productivity ", "The total amount of organic matter synthesized by producers per unit time and per unit area, in the process of photosynthesis is called as gross primary productivity(GPP).", "d", 0, 1, this.f483b));
        arrayList.add(new questions("20.", "In the energy pyramid, which group of organisms has the least amount of energy? ", 0, 0, 0, 0, 0, "Primary producers ", "Tertiary producers ", "Herbivores ", "Animals ", "It follows that the carnivores (secondary consumers) that feed on herbivores and detritivores and those that eat other carnivores (tertiary consumers) have the lowest amount of energy available to them.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("21.", "The sets in which scientists usually conduct two or more sets of the same experiment at the same time is: ", 0, 0, 0, 0, 0, "Experimental group ", "Experimental design", "Replication ", "Control group ", "Experimental group is a group that receives some type of experimental treatment. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("22.", "Which Of the following properties of water makes sweat a good body coolant? ", 0, 0, 0, 0, 0, "Its strong surface tension ", "Its low density in the solid-state ", "Its strong adhesion to a surface ", "Its high heat of vaporization ", "Evaporative cooling effect of water lower the temperature of the body.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("23.", "How many molecules of glycerol and fatty acids, respectively, are needed form 100 molecules of triglyceride fat? ", 0, 0, 0, 0, 0, "50 and 50 ", "100 and 100 ", "100 and 300 ", "150 and 400", "Triglyceride is a form a glycerol and three fatty acids. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("24.", "In a metabolic pathway (A->B->C->D) where each step is catalyzed by separate enzymes, which substance in the pathway serves as an allosteric regulator? ", 0, 0, 0, 0, 0, "Substance A", "Substance B ", "Substance C", "Substance D ", "The end product \"D\" hind to the allosteric site of the first enzyme to stop the pathway.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("25.", "Which of the following organelles settles out last when homogenized cells are centrifuged? ", 0, 0, 0, 0, 0, "Chloroplast ", "Nucleus ", "Mitochondria ", "Ribosome", "Sedimentation order of organelles: nucleus, chloroplast, mitochondria. Ribosomes (last). ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("26.", "At which stage is most of the carbon dioxide released during aerobic respiration? ", 0, 0, 0, 0, 0, "Glycolysis ", "Krebs cycle ", "Electron transport ", "Chemiosmosis ", "Two and four carbon dioxide molecules are produced during link reaction, and the Krebs cycle, respectively. No carbon dioxide molecules are produced during Glycolysis and ETC.  ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("27.", "One of the following groups of plants carry out light dependent and light independent reactions of photosynthesis in separate cells of the leaf. ", 0, 0, 0, 0, 0, "Plants adapted to temperate regions ", "Carbon -3 plants ", "Carbon -4 plants ", "Cacti ", "In C4 plants, the light-independent reaction takes in bundle sheath cells, whereas, light dependent reaction in the mesophyll cells. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("28.", "What is the nutritional mode of those bacteria which decompose dead organic matter and thus recycle nutrients? ", 0, 0, 0, 0, 0, "Autotrophic", "Parasitic ", "Saprobiotic ", "Symbiotic", "Saprophytes are organisms, especially fungi or bacteria, that-obtain food from dead or decaying organic matter. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("29.", "In what main way do retroviruses such as HIV differ from other types of RNA viruses? ", 0, 0, 0, 0, 0, "They require a host cell to reproduce ", "They reversely copy RNA to DNA ", "Their genes are resistant to mutation ", "They are free living viruses ", "HIV is an RNA virus that converts its genetic information from RNA into DNA after it has infected a host. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("30.", "Which of the following is NOT true about the flow of energy in the ecosystem? ", 0, 0, 0, 0, 0, "It is recycled by decomposers. ", "It passes from one trophic level to the next. ", "It enters the ecosystem in the form of light. ", "It leaves the ecosystem in the form of heat.", "Energy never recycles in the ecosystem, but it is transferred as material recycle.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("31.", "Through which of the following processes do all living organisms contribute. to carbon cycle? ", 0, 0, 0, 0, 0, "Photosynthesis ", "Cellular respiration ", "Decomposition ", "Combustion ", "All living things respire. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("32.", "In ecological context which of the following is a population? ", 0, 0, 0, 0, 0, "All living organisms in a habitat ", "All the producers in a habitat ", "All the consumers in a habitat ", "All individuals of same species in a habitat ", "A population is all the individuals of a particular species in a particular habitat at a particular time. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("33.", "During meiosis, which process makes the four chromatids of a homologous pair of chromosomes genetically different from one another? ", 0, 0, 0, 0, 0, "Independent assortment ", "Crossing over ", "Segregation", "Linkage ", "During meiosis, homologous pairs of chromosomes are able to exchange genetic information through crossing over. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("34.", "One of the following is NOT true about protein synthesis in eukaryotes. ", 0, 0, 0, 0, 0, "Translation takes place in the cytoplasm ", "Transcription takes place in the nucleus ", "Both transcription and translation take place in the cytoplasm ", "mRNA is modified after transcription ", "Transcription takes place in the nucleus, whereas translation in the cytoplasm.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("35.", "Which of the following combinations is known as Neo-Darwinism? ", 0, 0, 0, 0, 0, "Natural selection and acquired inheritance ", "Acquired inheritance and Mendelian lays of inheritance ", "Natural selection and Lamarck's theory of evolution ", "Natural selection and Mendelian law of inheritance, ", "Neo-Darwinism combines Darwin's original natural selection theory, genetic theory and ethology.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("36.", "In the process of allopatric speciation, which of the following is the mechanism that prevents populations from exchanging genes? ", 0, 0, 0, 0, 0, "polyploidy ", "Geographic barrier ", "Seasonal isolation ", "Temporal isolation ", "Allopatric speciation occurs when a population from an existing species becomes isolated by geographical barrier. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("37.", "A boy who had seen a snake crossing his way earlier, jumped up violently when grass touched his legs. Which behavior is it?", 0, 0, 0, 0, 0, "Habituation ", "Sensitization ", "Conditioning ", "Imprinting", "Sensitization is an increase in response to a harmless stimulus when it occurs after a harmful (punishing) stimulus.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("38.", "What material do microbiologists use to culture bacteria in the laboratory? ", 0, 0, 0, 0, 0, "Moist soil ", "The royal jelly", "Agar nutrient ", "Mixture of iodine & sugar", "Agar, which is a polysaccharide derived from red seaweed (Rhodophyceae) is preferred because it is an inert, non-nutritive substance. The agar provides a solid growth surface for the bacteria, upon which bacteria reproduce until the distinctive lumps of cells that we call colonies form.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("39.", "Which of the following is usually taken as a signal for the final stage of HIV infection? ", 0, 0, 0, 0, 0, "Signs of the disease Kaposi's sarcoma ", "Outbreak of some genetic diseases ", "Uninfected T -helper cells present ", "No infection by other parasitic diseases ", "Opportunistic infections such as pneumocystis or cancers such as Kaposi’s sarcoma can signal the final stage of HIV infections, AIDS. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("40.", "Through which process can inorganic ions the soil be absorbed into the root hairs? ", 0, 0, 0, 0, 0, "Dehydration ", "Diffusion ", "Active transport", "Osmosis", "Active transport takes the use of energy in active transport to move mineral ions against a concentration gradient.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("41.", "How are organic molecules distinguished from inorganic molecules? Organic molecules always contain: ", 0, 0, 0, 0, 0, "oxygen and hydrogen ", "carbon and oxygen ", "oxygen and nitrogen ", "carbon and hydrogen", "All organic compounds contain carbon and hydrogen both.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("42.", "In which industrial enzyme technology is lactase practically applied to produce lactose-free milk for use by lactose intolerant individuals? ", 0, 0, 0, 0, 0, "Chocolate manufacturing industry ", "Human hormone manufacturing industry ", "Dairy product manufacturing industry ", "Cereal food manufacturing industry ", "Lactase is used in dairy industry to produce lactose-free milk.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("43.", "Which kind of enzyme inhibitors bind to enzymes only weakly and the bond that hold them breaks easily releasing the inhibitor to allow the enzyme to become active again? ", 0, 0, 0, 0, 0, "Irreversible inhibitors ", "Reversible inhibitors ", "Inhibitors that bind strongly to enzymes ", "Inhibitors that permanently alter enzyme structure ", "Reversible inhibitors attach to enzymes with non-covalent interactions such as hydrogen bonds, hydrophobic interactions and ionic bonds. Multiple weak bonds between the inhibitor and the active site combine to produce strong and specific binding. In contrast to irreversible inhibitors, reversible inhibitors generally do not undergo chemical reactions when bound to the enzyme and can be easily removed by dilution or dialysis.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("44.", "Of the following models describing the nature of the cell membrane, which one was proposed before all the others? ", 0, 0, 0, 0, 0, "The sandwich model ", "Fluid mosaic model ", "The unit membrane model ", "Phospholipid bilayer model ", "In 1925, E. Goiter and G. Grendel suggested that the plasma membrane is phospholipid bilayer. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("45.", "Why is it that longer races by athletes must be run slower than shorter races? ", 0, 0, 0, 0, 0, "To give time for lactic acid fermentation in muscle cells ", "To avoid hunger as food is quickly converted to energy ", "To allow aerobic respiration to produce the required ATP ", "To adapt to the weather conditions at the racing place ", "During aerobic cellular respiration, glucose reacts with oxygen, forming ATP that can be used by the cell. Carbon dioxide and water are created as byproducts. The overall equation for aerobic cellular respiration is: In cellular respiration, glucose and oxygen react to form ATP.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("46.", "In which organ of the human body are more bacteria found? ", 0, 0, 0, 0, 0, "Lungs ", "Stomach ", "Small intestine ", "Large intestine ", "The colon which is found in the large intestine contains the highest microbial density recorded in any habitat on Earth, representing between 300 and 1000 different species. However, 99% of gut bacteria come from about 30 or 40 species.", "d", 0, 1, this.f483b));
        arrayList.add(new questions("47.", "From which group of micro-organisms was the first antibiotics produced? ", 0, 0, 0, 0, 0, "Gram-negative bacteria ", "Gram-positive bacteria ", "Fungal organism ", "Viral agents ", "In 1928, Sir Alexander Fleming discovered penicillin from a common mould (fungus) called Penicillium notatum. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("48.", "What is the other name for the primary consumers of the ecosystem? ", 0, 0, 0, 0, 0, "Herbivores", "Carnivores ", "Green plants ", "Predators ", "Primary consumers make up the second trophic level. They are also called herbivores. They eat primary producers—plants or algae—and nothing else.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("49.", "Of the following activities, which one is considered to have an indirect negative effect on biodiversity? ", 0, 0, 0, 0, 0, "Human & livestock population growth ", "Charcoal making and illegal logging ", "Deforestation for cultivation & urbanization ", "Monoculture farming with improved crop varieties ", "Monoculture result in the loss of biodiversity. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("50.", "If two heterozygous tall pea plants are crossed, how many of the offspring would be phenotypically tall plants? ", 0, 0, 0, 0, 0, "0%", "25% ", "50%", "75% ", "Tt heterozygote tall pea plant \nParental genotypes: Tt x Tt \nGametes: Tt x Tt\n", "d", C2719R.C2721drawable.bio2010q50e, 1, this.f483b));
        arrayList.add(new questions("51.", "How can biotechnology be applied to reduce the use of inorganic fertilizers in agriculture? ", 0, 0, 0, 0, 0, "By using the golden rice and producing organic fertilizers from beta carotenes ", "By using thermostable enzymes of genetically engineered bacteria used in washing powders. ", "By selecting and propagating varieties with high growth rates and high productivity. ", "By using enzymes produced by genetically engineered bacteria used in the food industry.", "No Explanation", "c", 0, 1, this.f483b));
        arrayList.add(new questions("52.", "Which of the following features do analogous structures mostly share? ", 0, 0, 0, 0, 0, "Phylogenetic similarity ", "Developmental ", "Ancestral similarity ", "Functional similarity ", "Analogous structures are structures having the same function but different anatomy and different evolutionary origin. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("53.", "In which of the following ways does learned behavior differ from innate behavior? ", 0, 0, 0, 0, 0, "Learned behavior is adaptive in nature. ", "Learned behavior is genetically determined. ", "Learned behavior is modified by new experiences. ", "Learned behavior is functional at the first attempt. ", "Learned behavior is modified by new experiences, not adaptive and developed through trial and error. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("54.", "Current human concerns such as famine, pestilence, and environmental degradation would be solved through the use of: ", 0, 0, 0, 0, 0, "biological principles ", "irrigation", "aquaculture ", "terracing", "Biological principles are important in overproduction, food security; environmental well-being, health care, natural resource conservation and biodiversity.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("55.", "The best way to control HIV/AIDS is: ", 0, 0, 0, 0, 0, "adequate distribution of condoms ", "adequate distribution of antiviral drugs ", "breaking the transmission pathway ", "awareness creation ", "No Explanation", "d", 0, 1, this.f483b));
        arrayList.add(new questions("56.", "What is the possible effect of the weak hydrogen bond among water molecules? ", 0, 0, 0, 0, 0, "It helps water to boil at low temperature ", "It results in the crystal shape of ice ", "Plays a significant role in the interaction of a water molecule with hydrophobic surfaces ", "It speeds up photosynthesis", "Ice has crystalline structure which is highly ordered due to hydrogen bonding. It has hexagonal form at atmospheric pressure and cubic form at low temperature. Each O atom has tetrahedral geometry and is surrounded by 4 oxygen atoms each at a distance of 276 pm.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("57.", "Cell organelles that contain hydrolytic enzymes are called: ", 0, 0, 0, 0, 0, "Peroxisomes ", "Lysosomes ", "Mesosomes", "Ribosomes ", "Lysosomes contain hydrolytic enzymes that digest worn out or damaged organelles as well as engulfed bacteria. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("58.", "Which part of the cell makes necessary changes, packages and secretes proteins? ", 0, 0, 0, 0, 0, "Golgi apparatus ", "Endoplasmic reticulum ", "Mitochondria", "Cell wall ", "The Golgi body modifies proteins and distributes them to the appropriate part of the cell. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("59.", "Which of the following takes place under moral conditions, as electrons flow down the electron transport chain of the mitochondria? ", 0, 0, 0, 0, 0, "NADH and FADH2 are oxidized. ", "The pH of the matrix increases. ", "The electrons. lose free energy ", "An electrochemical gradient is formed. ", "Under normal conditions, as electrons flow down the electron transport chain of the mitochondria: -NADH and FADH2 are oxidized. -the pH of the matrix increases. -the electrons lose free energy.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("60.", "In process of photosynthesis light is necessary to: ", 0, 0, 0, 0, 0, "Split carbon dioxide ", "Release energy", "Combine C02 and 11.0", "Produce ATP & a reducing substance ", "In light dependent, reaction, light is necessary to produce ATP and NADPH. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("61.", "Which of the following is not an industrial use of bacteria? ", 0, 0, 0, 0, 0, "Recycling of minerals through ecosystems ", "Food processing ", "Genetic engineering ", "Waste water treatment ", "Bacteria and fungi are decomposers and play role in recycling of nutrients in the ecosystem. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("62.", "Carbon cycle is important in nature because: ", 0, 0, 0, 0, 0, "The amount of energy before and after a reaction must be the same, ", "It continuously reuse and recycles carbon in the ecosystem. ", "It consumes oxygen and nitrogen in the atmosphere. ", "It is used in energy capture and recapture. ", "Carbon cycle is important in recycling of carbon between living organisms and the environment. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("63.", "Which of the following is essential in order for a virus to replicate? ", 0, 0, 0, 0, 0, "The capsid must enter the host cell cytoplasm. ", "The host cell must be undergoing mitosis. ", "The host cell must lack cell membrane. ", "The genome must be released into the cytoplasm. ", "For virus multiply, it must inject its DNA into host cell. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("64.", "Which one of the following is NOT in situ conservation of Biodiversity? ", 0, 0, 0, 0, 0, "Botanical Garden ", "Sanctuary ", "Biosphere reserves ", "National Parks", "In situ conservation is conservation of resource in its natural or original place. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("65.", "Which one of the following represents the population growth curve of a species with limited resources? ", 0, 0, 0, 0, 0, "Logistic ", "Exponential ", "Lognormal ", "Competitive exclusion ", "When resources are limited, populations exhibit logistic growth. In logistic growth, population expansion decreases as resources become scarce, and it levels off when the carrying capacity of the environment is reached. The logistic growth curve is S-shaped.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("66.", "One goat is heterozygous, long hair (Rr), and its mate carries homozygous short hair (IT). What is the probability of the offspring having short hair? ", 0, 0, 0, 0, 0, "25%", "100% ", "75% ", "50%", "Let Rr = Heterozygous long hair, rr = homozygous short hair\nGametes: Rr  rr\n", "d", C2719R.C2721drawable.bio2010q66e, 1, this.f483b));
        arrayList.add(new questions("67.", "The type of enzyme used in recombinant DNA technology to split a specific sugar phosphate bond in each strand of a DNA double helix is called: ", 0, 0, 0, 0, 0, "esterase ", "restriction enzyme ", "lipase ", "ligase ", "Restriction enzyme is used to split (cut) DNA into segments at precise location. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("68.", "Lamarck's theory of evolution is known as: ", 0, 0, 0, 0, 0, "Natural selection ", "Survival of the fittest ", "Mutation theory ", "Inheritance of acquired characters ", "Lamarck stated that organisms passed on to subsequent generations traits acquired during their lifetime. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("69.", "Habituation and imprinting illustrate that behaviors are made up of: ", 0, 0, 0, 0, 0, "Reversible stimulus - response learning", "Unchanging responses to present stimuli", "Both innate and learned components", "Simple responses to complex stimuli", "No Explanation", "d", 0, 1, this.f483b));
        arrayList.add(new questions("70.", "The evolution of a species which is based upon the sum total adaptation changes could be preserved by:", 0, 0, 0, 0, 0, "Natural selection ", "Speciation ", "Human conservation ", "Isolation", "Natural selection is the process by which individuals are better adapted to their environment survive and reproduce more successfully than less well adapted individuals do. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("71.", "Based on differences in DNA, which of the following animals is closer to human beings? ", 0, 0, 0, 0, 0, "Frog ", "Domestic pig ", "Zebra fish ", "Domestic chicken ", "Like human, domestic pig is mammal. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("72.", "To which group of sugars can the molecule dihydroxyacetone be classified? ", 0, 0, 0, 0, 0, "Hexose sugars ", "Pentose sugars ", "Triose sugars ", "Oligo sugars ", "Dihydroxyacetone is an isomer of glycerate phosphate, which is an intermediate molecule in photosynthesis and respiration. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("73.", "Choose the one in which the human digestive enzyme is incorrectly matched with the substrate that it normally catalyzes. ", 0, 0, 0, 0, 0, "Lipase - fat ", "pepsin — protein", "Trypsin-starch ", "pancreatic amylase-starch", "Trypsin acts on protein. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("74.", "The organelle of the cell which is concerned with the synthesis of lipids in addition to being associated with carbohydrate metabolism and detoxification is: ", 0, 0, 0, 0, 0, "Golgi body/apparatus ", "Thylakoid membrane ", "rough endoplasmic reticulum ", "smooth endoplasmic reticulum ", "Smooth endoplasmic reticulum is involved in various processes including the synthesis of fatty acids and the detoxification of chemicals such as drugs and alcohol. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("75.", "Where is the convergence point for the metabolism of the building blocks of carbohydrates, lipids and proteins? ", 0, 0, 0, 0, 0, "cytoplasm ", "Krebs cycle ", "Calvin cycle ", "Electron transport", "tricarboxylic acid cycle, (TCA cycle), also called Krebs cycle and citric acid cycle, the second stage of cellular respiration, the three-stage process by which living cells break down organic fuel molecules in the presence of oxygen to harvest the energy they need to grow and divide.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("76.", "Among the following crops, which one uses a non-C4 photosynthetic pathways? ", 0, 0, 0, 0, 0, "Maize ", "Sorghum", "Pineapple ", "Sugarcane", "Pineapple uses CAM photosynthesis pathway. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("77.", "Which of the following is responsible for rapid evolution in RNA viruses? ", 0, 0, 0, 0, 0, "High stability of its RNA ", "High mutation rate of its RNA ", "Reverse transcription of its RNA ", "Accurate replication of its RNA ", "The RNA polymerase that copies the virus's genes generally lacks proofreading skills, which makes RNA viruses prone to high mutation rates—up to a million times greater than the DNA-containing cells of their hosts.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("78.", "What major consequence does primary ecological succession involve normally? ", 0, 0, 0, 0, 0, "Complexity of food webs increase ", "Number of species present decreases ", "Abiotic factors become less favorable ", "Habitats become harsher and deteriorate ", "In a primary succession, the pioneer species change the abiotic conditions and allow other species to colonies the area. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("79.", "How quickly a population would increase or decrease in size is probably least influenced by the presence of: ", 0, 0, 0, 0, 0, "adequate supply of oxygen ", "disproportionate human races ", "severe inter-specific competition ", "carnivores and herbivores ", "No Explanation", "b", 0, 1, this.f483b));
        arrayList.add(new questions("80.", "Among the theories about the origin of life, which one better agrees with the concept of change in organisms and their genetic composition over generations being caused by meiosis, hybridization, natural selection or mutation? ", 0, 0, 0, 0, 0, "Cosmozoan theory ", "Biochemical origin theory ", "Special creationism's theory ", "Spontaneous generation theory ", "Biochemical theory suggests that life on Earth originated as a result of a number of biochemical reactions producing organic molecules which associated to form cells. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("81.", "Which of the following is the most accepted theory about the Origin of life on earth? ", 0, 0, 0, 0, 0, "Theory of spontaneous evolution ", "Theory of chemical evolution ", "The cosmic theory ", "Theory of special creation ", "The modern theory of chemical evolution is based on the assumption that on a primitive earth a mixture of simple chemicals assembled into more complex molecular systems, from which, eventually came the first functioning cell(s).", "b", 0, 1, this.f483b));
        arrayList.add(new questions("82.", "What is the possible cause or isolating mechanism for the formation of allopatric species? ", 0, 0, 0, 0, 0, "Seasonal isolation ", "Temporal isolation ", "Behavioral isolation ", "Geographical isolation ", "Because of geographic isolation species do not interbreed. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("83.", "Which of the following statements about instinctive actions is NOT true? ", 0, 0, 0, 0, 0, "are innate. ", "are adaptive ", "require learning ", "have fixed pattern ", "Instinctive behavior is any type of behavior that does not need to be learned. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("84.", "What does a low value for Simpson’s index of diversity normally indicate to the researcher? ", 0, 0, 0, 0, 0, "An area with high number of endemic species", "An area dominated by one or just a few species", "A biodiversity hotspot with abundant species", "An area with plants but no species of animals", "the more species in the community, the more uniform the distribution of various individuals, and the higher the index, indicating a good diversity of the community. The greater the Simpson index, the higher the diversity. The reverse is true if its low.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("85.", "A country with a high youth population but a low old age population and low infant population shows: ", 0, 0, 0, 0, 0, "a population pyramid with bulge in the middle ", "a population with wide base and narrow apex ", "an inverted pyramid ", "a pyramid assuming a rectangular shape ", "There is a population \"bulge\" in the middle of the pyramid representing the so called baby boomers of ages 35 to 50, and another small bulge for ages between 10 and 20 years. The small bulge represents mostly children of baby boomers and is an \"echo\" of the older and larger baby boom generation.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("86.", "Which one of the following is the primary contribution of Darwin to biological theory? ", 0, 0, 0, 0, 0, "An important mechanism of biological evolution is natural selection ", "New alleles arise through mutation. ", "Evolution is the change in gene frequencies over time. ", "Genes are the units of inheritance. ", "Charles Darwin developed theory of evolution by natural selection. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("87.", "Retroviruses are able to reverse transcribe RNA to DNA in order to: ", 0, 0, 0, 0, 0, "Command the host cell in the production of genomes similar to that of the hosts.", "Control the formation of viral protein and RNA that can be assembled into new virus particles. ", "Replicate without interruption ", "Control the formation of viral protein and DNA that can be assembled into new viral particles. ", "", "b", 0, 1, this.f483b));
        arrayList.add(new questions("88.", "Which of the following nucleotide sequences contains four pyrimidine bases? ", 0, 0, 0, 0, 0, "GATCAATGC ", "UAGCGGUAA ", "GCUAGACAA ", "Both B and C ", "Pyrimidine consists of thymine, uracil and cytosine. ", "a", 0, 1, this.f483b));
        arrayList.add(new questions("89.", "Significant changes in pH that can affect an enzyme molecule include: ", 0, 0, 0, 0, 0, "building strong ionic bonds leading to stabilization of enzymes. ", "altering the charges on some substrates making it difficult to bind to enzyme. ", "changing the color and palatability of food items. ", "Increasing the boiling temperature of the substrate. ", "A pH that is too acid or too alkaline will cause charges on the active site to alter and cause the active site to lose its conformation.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("90.", "Which of the following two elements are found in all organic molecules? ", 0, 0, 0, 0, 0, "Carbon and oxygen ", "Carbon and nitrogen ", "Carbon and hydrogen ", "Carbon and phosphorus ", "This means that all organic compounds have in common the presence of carbon atoms and hydrogen atoms. In addition, different organic compounds may contain oxygen, nitrogen, phosphorous, and other elements", "c", 0, 1, this.f483b));
        arrayList.add(new questions("91.", "If two molecules of a six-carbon sugar are condensed to form a disaccharide, which of the following is the correct molecular formula of the disaccharide? ", 0, 0, 0, 0, 0, "C12H24012", "C6H1206", "C12H24012", "C12H22011", "", "d", C2719R.C2721drawable.bio2010q91e, 1, this.f483b));
        arrayList.add(new questions("92.", "Which of the following is a requirement of a molecule to directly diffuse across the cell membrane? ", 0, 0, 0, 0, 0, "Small size ", "Non-polarity ", "Large size and polarity ", "Lipid solubility ", "To pass through the plasma membrane by simple diffusion particles must be small, lipid soluble and non-charged. ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("93.", "Which of the following molecules can provide the cell the least amount of energy per molecule? ", 0, 0, 0, 0, 0, "Glucose ", "Reduced NAD ", "Reduced FAD ", "ATP ", "1 glucose molecule produces 36 ATPs, 1 NADH produces 3 ATPs, and 1 FADH2 produces 2 ATPs. ", "d", 0, 1, this.f483b));
        arrayList.add(new questions("94.", "During photosynthesis, which of the following is the first step in the transduction of light energy to chemical energy? ", 0, 0, 0, 0, 0, "ATP formation ", "Carbon fixation ", "photolysis of water ", "Glucose formation ", "The splitting of water occurs first in the light-dependent reactions of photosynthesis.", "c", 0, 1, this.f483b));
        arrayList.add(new questions("95.", "Which of the following terms specifically refers to an ecological succession that starts in an aquatic environment? ", 0, 0, 0, 0, 0, "Xerosere ", "Hydrosere", "Primary succession ", "Secondary succession ", "Hydrosere is a primary succession occurs in progression from an aquatic community to terrestrial community. ", "b", 0, 1, this.f483b));
        arrayList.add(new questions("96.", "Suppose the age pyramid of a population has a broad base with a narrow top, which of the following is NOT true about the population?", 0, 0, 0, 0, 0, "It is fast growing ", "It has high life expectancy ", "It is dominated by young people ", "It has a high birth rate ", "Expansive population pyramids are used to describe populations that are young and growing. They are often characterized by their typical 'pyramid' shape, which has a broad base and narrow top.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("97.", "What is the reason that Stanley Miller excluded free oxygen from the mixture of the gases that he used for his simulation experiment? ", 0, 0, 0, 0, 0, "Early organic molecules did not contain oxygen. ", "Oxygen cannot react with the rest of the gases. ", "Primitive atmosphere was reducing. ", "The primitive atmosphere was full of oxygen. ", "Earth's early atmosphere lacked oxygen (it is reducing). ", "c", 0, 1, this.f483b));
        arrayList.add(new questions("98.", "Which of the following organic molecules is least informative about the evolutionary relationship between species? ", 0, 0, 0, 0, 0, "Carbohydrates ", "Proteins ", "DNA ", "RNA ", "Nucleic acids (DNA and RNA) and proteins are 'information molecules' in that they retain a record of an organism's evolutionary history.", "a", 0, 1, this.f483b));
        arrayList.add(new questions("99.", "In which of the following ways does mutation contribute most to evolution? ", 0, 0, 0, 0, 0, "It preserves adaptive genes. ", "It creates new alleles. ", "It forms a new gene poll. ", "It helps genes to recombine. ", "Any mutation could produce an allele.", "b", 0, 1, this.f483b));
        arrayList.add(new questions("100.", "A small girl who had observed her mother making a telephone call, one day made a call on her own. Which learning behavior does this exemplify? ", 0, 0, 0, 0, 0, "Insight learning ", "Trial and error ", "Latent learning ", "Sensitization ", "The girl learnt how to make a telephone call from her mother, but her skill remained latent (hidden). Later, she used her skill successfully at the time it is needed. ", "c", 0, 1, this.f483b));
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
        this.f484tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2010.this.timer.setVisibility(0);
                    bio2010.this.timer.setText(format);
                }

                public void onFinish() {
                    bio2010.this.scr.setVisibility(8);
                    bio2010.this.chr.stop();
                    bio2010.this.toolbar.setVisibility(8);
                    bio2010.this.Relative.setBackgroundColor(-7829368);
                    bio2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2010.this.getBaseContext());
                    int unused = bio2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2010.this.highscoreBio2010 = defaultSharedPreferences.getInt("bio2010hs", 0);
                    int access$600 = bio2010.this.part1 + bio2010.this.part2 + bio2010.this.part3 + bio2010.this.part4 + bio2010.this.part5 + bio2010.this.part6 + bio2010.this.part7 + bio2010.this.part8 + bio2010.this.part9;
                    String str = "bio2010hs";
                    int unused11 = bio2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = bio2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = bio2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = bio2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = bio2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = bio2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = bio2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = bio2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = bio2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = bio2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1600 = bio2010.this.answered1 + bio2010.this.answered2 + bio2010.this.answered3 + bio2010.this.answered4 + bio2010.this.answered5 + bio2010.this.answered6 + bio2010.this.answered7 + bio2010.this.answered8 + bio2010.this.answered9;
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    TextView access$2600 = bio2010.this.resultText;
                    access$2600.setText(access$600 + "/100");
                    bio2010.this.progressbar.setProgress(access$600);
                    bio2010.this.progressbar.setMax(100);
                    edit.putInt("ans1", 0);
                    edit.putInt("ans2", 0);
                    edit.putInt("ans3", 0);
                    edit.putInt("ans4", 0);
                    edit.putInt("ans5", 0);
                    edit.putInt("ans6", 0);
                    edit.putInt("ans7", 0);
                    edit.putInt("ans8", 0);
                    edit.putInt("ans9", 0);
                    if (access$600 > bio2010.this.highscoreBio2010) {
                        edit.putInt(str, access$600);
                    }
                    long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2010.this.chr.getBase()) / 1000;
                    if (bio2010.this.mode.booleanValue()) {
                        Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                        int i = (access$600 * 100) / 100;
                        DecimalFormat decimalFormat = new DecimalFormat("##.##");
                        String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                        String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                        long j = defaultSharedPreferences.getLong("date1bio101", 0);
                        long j2 = defaultSharedPreferences.getLong("date1bio102", 0);
                        long j3 = defaultSharedPreferences.getLong("date1bio103", 0);
                        long j4 = defaultSharedPreferences.getLong("date1bio104", 0);
                        Long l = valueOf;
                        String str2 = f2;
                        long j5 = defaultSharedPreferences.getLong("date1bio105", 0);
                        long j6 = defaultSharedPreferences.getLong("date1bio106", 0);
                        long j7 = defaultSharedPreferences.getLong("date1bio107", 0);
                        long j8 = defaultSharedPreferences.getLong("date1bio108", 0);
                        long j9 = defaultSharedPreferences.getLong("date1bio109", 0);
                        long j10 = defaultSharedPreferences.getLong("date1bio1010", 0);
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
                            edit.putString("scorebio101", str2);
                            edit.putLong("date1bio101", l.longValue());
                        } else {
                            String str3 = str2;
                            if (date11.compareTo(date2) == 0) {
                                edit.putString("scorebio102", str3);
                                edit.putLong("date1bio102", l.longValue());
                            } else if (date11.compareTo(date3) == 0) {
                                edit.putString("scorebio103", str3);
                                edit.putLong("date1bio103", l.longValue());
                            } else if (date11.compareTo(date4) == 0) {
                                edit.putString("scorebio104", str3);
                                edit.putLong("date1bio104", l.longValue());
                            } else if (date11.compareTo(date5) == 0) {
                                edit.putString("scorebio105", str3);
                                edit.putLong("date1bio105", l.longValue());
                            } else if (date11.compareTo(date6) == 0) {
                                edit.putString("scorebio106", str3);
                                edit.putLong("date1bio106", l.longValue());
                            } else if (date11.compareTo(date7) == 0) {
                                edit.putString("scorebio107", str3);
                                edit.putLong("date1bio107", l.longValue());
                            } else if (date11.compareTo(date8) == 0) {
                                edit.putString("scorebio108", str3);
                                edit.putLong("date1bio108", l.longValue());
                            } else if (date11.compareTo(date9) == 0) {
                                edit.putString("scorebio109", str3);
                                edit.putLong("date1bio109", l.longValue());
                            } else if (date11.compareTo(date10) == 0) {
                                edit.putString("scorebio1010", str3);
                                edit.putLong("date1bio1010", l.longValue());
                            }
                        }
                        long j11 = defaultSharedPreferences.getLong("datebio101", 0);
                        long j12 = defaultSharedPreferences.getLong("datebio102", 0);
                        long j13 = defaultSharedPreferences.getLong("datebio103", 0);
                        long j14 = defaultSharedPreferences.getLong("datebio104", 0);
                        long j15 = defaultSharedPreferences.getLong("datebio105", 0);
                        long j16 = defaultSharedPreferences.getLong("datebio106", 0);
                        long j17 = defaultSharedPreferences.getLong("datebio107", 0);
                        long j18 = defaultSharedPreferences.getLong("datebio108", 0);
                        long j19 = defaultSharedPreferences.getLong("datebio109", 0);
                        long j20 = defaultSharedPreferences.getLong("datebio1010", 0);
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
                            edit.putString("iScorebio101", f);
                            edit.putLong("datebio101", l.longValue());
                        } else if (date22.compareTo(date13) == 0) {
                            edit.putString("iScorebio102", f);
                            edit.putLong("datebio102", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            edit.putString("iScorebio103", f);
                            edit.putLong("datebio103", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            edit.putString("iScorebio104", f);
                            edit.putLong("datebio104", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            edit.putString("iScorebio105", f);
                            edit.putLong("datebio105", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            edit.putString("iScorebio106", f);
                            edit.putLong("datebio106", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            edit.putString("iScorebio107", f);
                            edit.putLong("datebio107", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            edit.putString("iScorebio108", f);
                            edit.putLong("datebio108", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            edit.putString("iScorebio109", f);
                            edit.putLong("datebio109", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            edit.putString("iScorebio1010", f);
                            edit.putLong("datebio1010", l.longValue());
                        }
                        edit.commit();
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
                        bio2010.this.scr.setVisibility(8);
                        bio2010.this.chr.stop();
                        bio2010.this.toolbar.setVisibility(8);
                        bio2010.this.Relative.setBackgroundColor(-7829368);
                        bio2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2010.this.getBaseContext());
                        int unused = bio2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = bio2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = bio2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = bio2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = bio2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = bio2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = bio2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = bio2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = bio2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = bio2010.this.highscoreBio2010 = defaultSharedPreferences.getInt("bio2010hs", 0);
                        int access$600 = bio2010.this.part1 + bio2010.this.part2 + bio2010.this.part3 + bio2010.this.part4 + bio2010.this.part5 + bio2010.this.part6 + bio2010.this.part7 + bio2010.this.part8 + bio2010.this.part9;
                        int unused11 = bio2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = bio2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = bio2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = bio2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = bio2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = bio2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = bio2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = bio2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = bio2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = bio2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1600 = bio2010.this.answered1 + bio2010.this.answered2 + bio2010.this.answered3 + bio2010.this.answered4 + bio2010.this.answered5 + bio2010.this.answered6 + bio2010.this.answered7 + bio2010.this.answered8 + bio2010.this.answered9;
                        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        TextView access$2600 = bio2010.this.resultText;
                        access$2600.setText(access$600 + "/100");
                        bio2010.this.progressbar.setProgress(access$600);
                        bio2010.this.progressbar.setMax(100);
                        edit.putInt("ans1", 0);
                        edit.putInt("ans2", 0);
                        edit.putInt("ans3", 0);
                        edit.putInt("ans4", 0);
                        edit.putInt("ans5", 0);
                        edit.putInt("ans6", 0);
                        edit.putInt("ans7", 0);
                        edit.putInt("ans8", 0);
                        edit.putInt("ans9", 0);
                        if (access$600 > bio2010.this.highscoreBio2010) {
                            edit.putInt("bio2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2010.this.chr.getBase()) / 1000;
                        String str = "datebio109";
                        String str2 = "datebio108";
                        String str3 = "datebio107";
                        String str4 = "datebio106";
                        String str5 = "datebio105";
                        String str6 = "datebio104";
                        String str7 = "datebio103";
                        String str8 = "datebio102";
                        String str9 = "datebio101";
                        SharedPreferences.Editor editor4 = edit;
                        String str10 = "date1bio109";
                        String str11 = "date1bio108";
                        if (bio2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            float sqrt = (float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))));
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) sqrt)).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1bio101", 0);
                            String str12 = f;
                            String str13 = "date1bio101";
                            long j2 = defaultSharedPreferences.getLong("date1bio102", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1bio103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1bio104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1bio105", 0);
                            String str15 = "date1bio105";
                            String str16 = "date1bio104";
                            String str17 = "date1bio106";
                            long j6 = defaultSharedPreferences.getLong("date1bio106", 0);
                            String str18 = str11;
                            String str19 = "date1bio107";
                            long j7 = defaultSharedPreferences.getLong(str18, 0);
                            String str20 = str10;
                            long j8 = defaultSharedPreferences.getLong(str20, 0);
                            String str21 = str20;
                            String str22 = str18;
                            long j9 = defaultSharedPreferences.getLong("date1bio1010", 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str23 = "date1bio1010";
                            String str24 = "date1bio103";
                            Date date6 = new Date(j6);
                            Date date7 = new Date(defaultSharedPreferences.getLong("date1bio107", 0));
                            String str25 = "date1bio102";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date8 = new Date(j7);
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
                                editor3 = editor4;
                                editor3.putString("scorebio101", str14);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor4;
                                String str26 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorebio102", str26);
                                    editor3.putLong(str25, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorebio103", str26);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorebio104", str26);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorebio105", str26);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorebio106", str26);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorebio107", str26);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorebio108", str26);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorebio109", str26);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorebio1010", str26);
                                    editor3.putLong(str23, l.longValue());
                                }
                            }
                            String str27 = str9;
                            long j10 = sharedPreferences.getLong(str27, 0);
                            long j11 = sharedPreferences.getLong(str8, 0);
                            long j12 = sharedPreferences.getLong(str7, 0);
                            long j13 = sharedPreferences.getLong(str6, 0);
                            long j14 = sharedPreferences.getLong(str5, 0);
                            long j15 = sharedPreferences.getLong(str4, 0);
                            long j16 = sharedPreferences.getLong(str3, 0);
                            long j17 = sharedPreferences.getLong(str2, 0);
                            long j18 = sharedPreferences.getLong(str, 0);
                            long j19 = sharedPreferences.getLong("datebio1010", 0);
                            Date date12 = new Date(j10);
                            Date date13 = new Date(j11);
                            Date date14 = new Date(j12);
                            Date date15 = new Date(j13);
                            Date date16 = new Date(j14);
                            Date date17 = new Date(j15);
                            Date date18 = new Date(j16);
                            Date date19 = new Date(j17);
                            Date date20 = new Date(j18);
                            Date date21 = new Date(j19);
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
                                editor3.putString("iScorebio101", str12);
                                editor3.putLong(str27, l.longValue());
                            } else {
                                String str28 = str12;
                                if (date22.compareTo(date13) == 0) {
                                    editor3.putString("iScorebio102", str28);
                                    editor3.putLong(str8, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor3.putString("iScorebio103", str28);
                                    editor3.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor3.putString("iScorebio104", str28);
                                    editor3.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor3.putString("iScorebio105", str28);
                                    editor3.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor3.putString("iScorebio106", str28);
                                    editor3.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor3.putString("iScorebio107", str28);
                                    editor3.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor3.putString("iScorebio108", str28);
                                    editor3.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor3.putString("iScorebio109", str28);
                                    editor3.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor3.putString("iScorebio1010", str28);
                                    editor3.putLong("datebio1010", l.longValue());
                                }
                            }
                            editor = editor3;
                        } else {
                            String str29 = "date1bio101";
                            String str30 = "date1bio103";
                            String str31 = "date1bio104";
                            String str32 = "date1bio102";
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str33 = "date1bio107";
                            String str34 = "date1bio105";
                            String str35 = str10;
                            String str36 = str11;
                            String str37 = "date1bio106";
                            String str38 = "date1bio1010";
                            String str39 = str35;
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            float sqrt2 = (float) Math.sqrt((double) (((access$1600 * access$1600) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))));
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) sqrt2)).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str40 = str29;
                            String str41 = f4;
                            long j21 = sharedPreferences2.getLong(str32, 0);
                            String str42 = f3;
                            String str43 = str32;
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            long j23 = sharedPreferences2.getLong(str31, 0);
                            String str44 = str31;
                            Long l2 = valueOf2;
                            long j24 = sharedPreferences2.getLong(str34, 0);
                            long j25 = sharedPreferences2.getLong(str37, 0);
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str45 = str37;
                            String str46 = str33;
                            String str47 = str36;
                            long j27 = sharedPreferences2.getLong(str36, 0);
                            long j28 = sharedPreferences2.getLong(str39, 0);
                            long j29 = sharedPreferences2.getLong(str38, 0);
                            Date date23 = new Date(j20);
                            Date date24 = new Date(j21);
                            Date date25 = new Date(j22);
                            Date date26 = new Date(j23);
                            Date date27 = new Date(j24);
                            Date date28 = new Date(j25);
                            Date date29 = new Date(j26);
                            String str48 = str34;
                            Date date30 = new Date(j27);
                            String str49 = str30;
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            Date date31 = new Date(j28);
                            Date date32 = new Date(j29);
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
                                editor2 = editor4;
                                editor2.putString("scorebio101", str41);
                                editor2.putLong(str40, l2.longValue());
                            } else {
                                String str50 = str41;
                                editor2 = editor4;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorebio102", str50);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorebio103", str50);
                                    editor2.putLong(str49, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorebio104", str50);
                                    editor2.putLong(str44, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorebio105", str50);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorebio106", str50);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorebio107", str50);
                                    editor2.putLong(str46, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorebio108", str50);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorebio109", str50);
                                    editor2.putLong(str39, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorebio1010", str50);
                                    editor2.putLong(str38, l2.longValue());
                                }
                            }
                            String str51 = str9;
                            long j30 = sharedPreferences3.getLong(str51, 0);
                            String str52 = str8;
                            long j31 = sharedPreferences3.getLong(str52, 0);
                            long j32 = sharedPreferences3.getLong(str7, 0);
                            long j33 = sharedPreferences3.getLong(str6, 0);
                            SharedPreferences.Editor editor5 = editor2;
                            long j34 = sharedPreferences3.getLong(str5, 0);
                            long j35 = sharedPreferences3.getLong(str4, 0);
                            long j36 = sharedPreferences3.getLong(str3, 0);
                            String str53 = str;
                            long j37 = sharedPreferences3.getLong(str2, 0);
                            long j38 = sharedPreferences3.getLong(str53, 0);
                            String str54 = str53;
                            long j39 = sharedPreferences3.getLong("datebio1010", 0);
                            Date date34 = new Date(j30);
                            Date date35 = new Date(j31);
                            Date date36 = new Date(j32);
                            Date date37 = new Date(j33);
                            Date date38 = new Date(j34);
                            Date date39 = new Date(j35);
                            Date date40 = new Date(j36);
                            Date date41 = new Date(j37);
                            Date date42 = new Date(j38);
                            Date date43 = new Date(j39);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date34);
                            arrayList4.add(date35);
                            arrayList4.add(date36);
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date39);
                            arrayList4.add(date40);
                            arrayList4.add(date41);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            Date date44 = (Date) Collections.min(arrayList4);
                            if (date44.compareTo(date34) == 0) {
                                editor = editor5;
                                editor.putString("iScorebio101", str42);
                                editor.putLong(str51, l2.longValue());
                            } else {
                                editor = editor5;
                                String str55 = str42;
                                if (date44.compareTo(date35) == 0) {
                                    editor.putString("iScorebio102", str55);
                                    editor.putLong(str52, l2.longValue());
                                } else if (date44.compareTo(date36) == 0) {
                                    editor.putString("iScorebio103", str55);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date44.compareTo(date37) == 0) {
                                    editor.putString("iScorebio104", str55);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date44.compareTo(date38) == 0) {
                                    editor.putString("iScorebio105", str55);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date44.compareTo(date39) == 0) {
                                    editor.putString("iScorebio106", str55);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date44.compareTo(date40) == 0) {
                                    editor.putString("iScorebio107", str55);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date44.compareTo(date41) == 0) {
                                    editor.putString("iScorebio108", str55);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date44.compareTo(date42) == 0) {
                                    editor.putString("iScorebio109", str55);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date44.compareTo(date43) == 0) {
                                    editor.putString("iScorebio1010", str55);
                                    editor.putLong("datebio1010", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        bio2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2010.this.scr.setVisibility(8);
                bio2010.this.chr.stop();
                bio2010.this.toolbar.setVisibility(8);
                bio2010.this.Relative.setBackgroundColor(bio2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2010.this.scr.setVisibility(0);
                bio2010.this.toolbar.setVisibility(0);
                bio2010.this.telegram_layout.setVisibility(8);
                bio2010.this.chr.start();
                bio2010.this.Relative.setBackgroundColor(bio2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = bio2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = bio2010.this.mInterstitialAd = null;
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
                bio2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
