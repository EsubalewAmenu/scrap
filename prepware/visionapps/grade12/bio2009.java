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

public class bio2009 extends AppCompatActivity {
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
    private Boolean f481b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2009;
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
    private Toolbar f482tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2009);
        this.f481b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The word science comes from the Latin word \"Scientia”  meaning what?", 0, 0, 0, 0, 0, "Study", "Experiment", "Life", "Knowledge ", "The word science comes from the Latin word Scientia, which means Knowledge. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("2.", "Which of the following substances can be used over and over again in an enzyme catalysed reaction?", 0, 0, 0, 0, 0, "Enzyme- substrate complex ", "Substrate ", "Enzyme ", "Reaction product ", "Enzymes are biological catalysts that speed up a reaction without being used up, so they can be used up repeatedly.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("3.", "What is the intermediate compound that is formed during an enzyme catalysed reaction?", 0, 0, 0, 0, 0, "Reactant", "Substrate ", "Product ", "Enzyme-substrate complex", "Enzyme-substrate complex is the intermediate molecule formed during an enzyme-catalyzed reaction.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("4.", "Which of the following microorganisms are prokaryotic? ", 0, 0, 0, 0, 0, "Bacteria", "Protozoa ", "Yeast ", "Algae", "Bacterium is a prokaryotic organism whose DNA is not contained within a nucleus.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("5.", "Which of the following laboratory tools is LEAST accurate to measure 1 ml of liquid?", 0, 0, 0, 0, 0, "Pipette", "Measuring cylinder ", "Burette ", "Beaker", "1 ml of liquid is too small to be accurately measured using beaker.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("6.", "From which of the following diseases can one be protected by sleeping under the cover of a mosquito net?", 0, 0, 0, 0, 0, "Sleeping sickness ", "AIDS ", "Malaria ", "Athlete's foot ", "Malaria can be controlled by protecting the mosquitoes using mosquito repellents, sleeping under the cover of a mosquito net, removing mosquito breeding sites and biological control.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("7.", "Which of the following parts of the flower did Mendel remove from young flowers to prevent self-pollution? ", 0, 0, 0, 0, 0, "Stamens ", "Sepals ", "Petals ", "Ovaries ", "Mendel removed stamens from the flowers of the pea plant so that these flowers could not pollinate themselves.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("8.", "What do we call the place where organisms live in their ecosystem?", 0, 0, 0, 0, 0, "Abiotic ", "Biotic ", "Habitat ", "Niche ", "Habitat is the part of an ecosystem where members of a particular species live.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("9.", "Which of the following is the sex chromosome constitution of human males?", 0, 0, 0, 0, 0, "XX ", "XY ", "ZZ ", "ZW ", "XY is the sex chromosome that is constitute of human males.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("10.", "Which of the following plants use CAM photosynthesis?", 0, 0, 0, 0, 0, "Sugarcane ", "Sorghum ", "Maize ", "Cactus ", "CAM photosynthesis is effective in desert plants, such as cactus, pineapple because it separates the light-dependent and light-independent stages in time.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("11.", "Which of the following bases is NOT found in RNA?", 0, 0, 0, 0, 0, "Adenine ", "Guanine ", "Cytosine ", "Thymine ", "In RNA, the base thymine is replaced by uracil.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("12.", "In a report of scientific experiment, description of which of the following comes before all the others?", 0, 0, 0, 0, 0, "Procedure ", "Results ", "Hypothesis ", "Conclusion ", "The main steps of scientific methods are asking questions, do background research, construct hypothesis, test with an experiment (procedure), analyze results and draw conclusion.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("13.", "Which one of the following is different from the other three? ", 0, 0, 0, 0, 0, "Starch ", "Glycogen", "Cellulose", "Maltose ", "Maltose is a disaccharide molecule whereas starch, glycogen and cellulose are polysaccharides.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("14.", "What happens when a plant cell absorbs in more water? ", 0, 0, 0, 0, 0, "It shrinks. ", "It becomes turgid. ", "It becomes wilted. ", "It swells and bursts.", "When plant cells absorb a lot of water, they swell until their cellulose cell wall will not let them swell any more. This condition is called turgid.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("15.", "Which level of protein structural organization involves two or more polypeptide?", 0, 0, 0, 0, 0, "Primary structure", "Secondary structure ", "Tertiary structure", "Quaternary structure ", "Quaternary structure of protein is formed when two or more polypeptide chains become associated in the final structure of the protein.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("16.", "Which of the following do biologists consider ancestral to the higher organisms of today?", 0, 0, 0, 0, 0, "Plantae ", "Animalia ", "Fungi ", "Protista", "since protists (or Protoctista) are singled celled or relatively simple multicellular organisms with simple body structures, they could be ancestor to the higher organisms.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("17.", "Which type of fatty acid is healthier when used as a human food source", 0, 0, 0, 0, 0, "Saturated fatty acid", "Monounsaturated fatty acid ", "Polyunsaturated fatty acid", "Fatty acids in animal products ", "Polyunsaturated fatty acids help to prevent cholesterol being laid down in the lining of arteries and so help to prevent heart disease.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("18.", "Which of the following is NOT recycled in the ecosystem?", 0, 0, 0, 0, 0, "Sulphur ", "Energy ", "Carbon ", "Phosphorus ", "energy is not recycled but it flows along unidirectional pathways in the ecosystem.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("19.", "What kind of cross is performed to determine whether the parent is homozygous or heterozygous?", 0, 0, 0, 0, 0, "Monohybrid cross", "Dihybrid cross ", "Back cross ", "Double cross", "Back cross/test cross allows determination of whether the original organism showing dominant trait was homozygous or heterozygous.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("20.", "Which type of animal behaviour happens without learning?", 0, 0, 0, 0, 0, "Innate ", "Latent ", "Insight ", "Conditioned ", "Innate behavior presents from birth but not established by learning. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("21.", "When a drop of iodine solution is added to a solution of a foodstuff and the foodstuff turns dark blue, what does the foodstuff contain?", 0, 0, 0, 0, 0, "Reducing sugar", "Disaccharide ", "Glucose", "Starch ", "The reddish-brown iodine, solution turns dark blue upon addition of iodine on a foodstuff shows presence of starch in the food.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("22.", "Which of the following has the highest risk of HIV transmission?", 0, 0, 0, 0, 0, "Hand shaking", "Needle sharing ", "Towel sharing", "Toilet sharing", "Unprotected sex, sharing infected needles, and transfusion of infected blood are some routs of HIV transmission. ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("23.", "Which of the following elements is the most abundant in living things?", 0, 0, 0, 0, 0, "Nitrogen ", "Carbon ", "Hydrogen ", "Oxygen ", "The elements hydrogen (59 %), oxygen (24%), carbon (11%), and nitrogen (4%) are major components of biological molecules. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("24.", "Which of the following organelles is common to both plant and animal cells?", 0, 0, 0, 0, 0, "Cell wall ", "Chloroplast ", "Mitochondria ", "Central vacuole", "Mitochondria are common to both plant and animal cells.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("25.", "Among the following organic molecules, identify the one that does not contain nitrogen.", 0, 0, 0, 0, 0, "Starch ", "Protein ", "DNA ", "RNA ", "Starch is made from carbon, hydrogen, and oxygen atoms but not nitrogen. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("26.", "If a cell fails to form 1ysosomes, which of the following cellular functions will get disturbed first?", 0, 0, 0, 0, 0, "Protein synthesis", "Chromosome replication ", "Removal of cellular debris", "Transport across cell membrane", "Lysosome contains: enzymes that are responsible for degrading and recycling molecules.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("27.", "Most co-enzymes are the derivatives of which of the following enzymes would one use?", 0, 0, 0, 0, 0, "Proteins", "Vitamins ", "Carbohydrates ", "Fats ", "Coenzymes art a non-protein part of enzyme most derived from vitamins.  ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("28.", "To produce glucose from starch, which of the following enzymes would one use? ", 0, 0, 0, 0, 0, "Isomerases ", "Lyases ", "Hydrolases ", "Ligases ", "Hydrolase is an enzyme that controls hydrolysis.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("29.", "Which class of enzyme inhibitors has similar shape as that of the normal substrate?", 0, 0, 0, 0, 0, "Allosteric ", "Competitive ", "Denaturing ", "Irreversible ", "Competitive inhibitor has similar shape with the normal substrate. It inhibits enzyme activity by competing with the substrate for the active site.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("30.", "For a substance to easily pass across the cell membrane by simple diffusion which of the following properties should it possess? ", 0, 0, 0, 0, 0, "Large size", "Ability to dissolve in lipid ", "Positive charge ", "Negative charge ", "Lipid soluble and small-uncharged molecules are transported across the membrane by simple diffusion.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("31.", "Among the following factors that affect enzyme activity, which one does NOT cause enzyme denaturation?", 0, 0, 0, 0, 0, "High pH", "Low pH ", "High temperature", "Competitive inhibitor", "High temperature, high pH and low pH cause enzyme denaturation. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("32.", "Which of the following is a type of ecological succession that starts from a cleared forest area?", 0, 0, 0, 0, 0, "Hydrosere", "primary ", "Secondary ", "Pioneer ", "Secondary succession begins when communities are destroyed by fire or other human activities.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("33.", "Which of the following stages of photosynthesis can take place in the dark?", 0, 0, 0, 0, 0, "Photolysis of water", "Photosystem I", "Photosystem II", "Calvin cycle", "Calvin cycle can take place both, in the presence and absence of light.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("34.", "Which of the following is the major role-played by bacteria and fungi in the eco system?", 0, 0, 0, 0, 0, "Causing diseases", "Nutrient recycling", "Fixing carbon dioxide", "Producing antibiotics", "Bacteria and fungi are the key in recycling nutrients to ecosystem. ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("35.", "If a heterozygous tall pea plant (Tt) is crossed with a short pea plant (tt), what percentage of the progeny is expected to be short?", 0, 0, 0, 0, 0, "100% ", "75% ", "50% ", "25% ", "Progeny genotype ratio: 50% Tt: 50% tt                            ", "c", C2719R.C2721drawable.bio2009q35e, 1, this.f481b));
        arrayList.add(new questions("36.", "Which of the following human cell types is attacked by HIV?", 0, 0, 0, 0, 0, "Red blood cells ", "White blood cells", "T-lymphocytes", "Leukocytes ", "T-lymphocytes are major target of HIV for they contain CD4 protein. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("37.", "Which of the following processes is most important to release nutrients from dead organic matter into the soil?", 0, 0, 0, 0, 0, "Fixation ", "Decomposition ", "Excretion", "Respiration ", "Decomposition is the process of decay caused by bacteria or fungal action.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("38.", "Which of the following biomes supports the highest diversity of plant and animal life? ", 0, 0, 0, 0, 0, "Tropical rainforest", "Deciduous Forest", "Grassland ", "African savannah ", "Tropical rainforest supports the highest diversity of plant and animal life.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("39.", "Which of the following demographic factors can increase the size of the World population?", 0, 0, 0, 0, 0, "Natality ", "Migration ", "Emigration", "Immigration ", "Natality is number, children born per year. It increases the size of world population.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("40.", "When Mendel crossed a tall pea plant with a short plant, the F1 progeny where all tall. What F1 did he obtain when he made the reciprocal cross?", 0, 0, 0, 0, 0, "Short plants", "Tall plants ", "Extra-tall plants", "Plants of average height ", "Mendel obtained the: same result (tall plants) from the reciprocal cross.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("41.", "Among the following ABO blood group genotype, which one produces two types of antigens?", 0, 0, 0, 0, 0, "IAIO ", "IBIO ", "IAIB ", "IBIB", "1^A 1^B produces antigen A and B on the surface of red blood cells. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("42.", "Which of the following methods do animal breeders use to domestic animals with hybrid vigour?", 0, 0, 0, 0, 0, "Feeding with nutritive food ", "Mating together related animals ", "Giving proper veterinary care ", "Crossbreeding their animals ", "Hybrid vigour is the increased vigour or productivity of organisms resulting from crossbreeding different varieties of the same species. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("43.", "Which of the following groups are believed to be the first photosynthesis organisms to evolve on Earth?", 0, 0, 0, 0, 0, "Green plants", "Green algae ", "Blue green algae", "Lichens", "Blue green algae (or cyanobacteria) had been producing oxygen by photosynthesis from about 15 billion years ago.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("44.", "Which of the following factors brings about changes during both evolution and breeding of plants and animals?", 0, 0, 0, 0, 0, "Limited resources", "Production of excess progeny", "Selection ", "Competition", "Selection may take place naturally, natural selection or as the result of breeding for specific characteristics, artificial selection. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("45.", "Among the following, which one is held most responsible for the present fast depletion of the world biodiversity?", 0, 0, 0, 0, 0, "Herbivores ", "Carnivores ", "Grazers ", "Humans", "An anthropogenic activity greatly affects the natural world. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("46.", "Which of the following reproductive isolating mechanisms keeps the horse and donkey as two independent species?", 0, 0, 0, 0, 0, "Hybrid in viability", "Hybrid infertility ", "Ecological isolation", "Habitat isolation", "Horse and donkey produce infertile offspring (mule).", "b", 0, 1, this.f481b));
        arrayList.add(new questions("47.", "Which of the following activities of an organism do we call a behaviour?", 0, 0, 0, 0, 0, "Reception of external stimulus", "Responding of internal stimulus", "Responding to stimulus", "Lack of receptors to receive stimulus", "Behavior is the coordinated response of an organism to an internal or external stimulus.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("48.", "A reflex that involves internal organs such as the heart is referred to as:", 0, 0, 0, 0, 0, "Somatic reflex ", "External reflex ", "Spinal reflex", "Autonomic reflex ", "Autonomic reflex involves sensors in internal organs and produces responses in internal organs. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("49.", "At which of the following generations of crosses between dominant and recessive homozygote parents are all the progeny heterozygote?", 0, 0, 0, 0, 0, "P1 generation", "F1 generation", "F2 generation ", "F3 generation", "In F1 generation, all of the progeny are heterozygote. ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("50.", "Which of the following organs serves as a coordinating system in a reflex action? ", 0, 0, 0, 0, 0, "Spinal cord ", "Dehydrogenase", "Nerve cells ", "Oxidoreductase ", "Many reflexes involve the spinal cord while others involve the brain. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("51.", "Which type of enzyme catalyzes the joining of two molecules by the formation of new bonds? ", 0, 0, 0, 0, 0, "Decarboxylase ", "Dehydrogenase", "Ligase", "Oxidoreductase ", "Ligase catalyzes the binding of two molecules. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("52.", "Which of the following statements about enzyme is NOT Correct?", 0, 0, 0, 0, 0, "Enzymes speed up a chemical reaction", "Enzymes are very specific in their reaction", "The presence of an enzyme will change the outcome of a reaction", "Enzymes lower the energy of activation for a reaction to occur", "An enzyme speeds up a chemical reaction without overall change of nature of products, energy during reaction and the catalyst itself. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("53.", "Glycolysis occurs in the _________", 0, 0, 0, 0, 0, "Cytoplasm ", "Mitochondrion ", "Nucleus ", "Chloroplast ", "Glycolysis takes place in the cytoplasm. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("54.", "Anaerobic metabolism refers to the generation of ATP:", 0, 0, 0, 0, 0, "without the involvement of ADP ", "without the use of glycogen", "without the use of oxygen", "by the conversion of pyruvate to lactate ", "Anaerobic respiration is the production of energy in the form of ATP without oxygen. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("55.", "The conversion of one molecule of glucose to two molecules of pyruvate results in the net formation of: ", 0, 0, 0, 0, 0, "two molecules of ATP ", "six molecules of water", "three molecules of ATP ", "thirty-eight molecules of ATP", "Glycolysis is a process of breaking down of a glucose molecule into simple molecule with a net release of two ATP molecules. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("56.", "During alcohol fermentation, pyruvic acid in the presence of pyruvate decarboxylase is first converted to __________", 0, 0, 0, 0, 0, "glucose ", "lactose ", "lactic acid ", "acetaldehyde ", "Pyruvate is converted to acetaldehyde (ethanal) in the presence of pyruvate decarboxylase. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("57.", "The total amount of living tissue within a given trophic level is called: ", 0, 0, 0, 0, 0, "organic mass ", "energy mass ", "trophic mass", "biomass ", "Biomass is the total mass of living matter in a given area. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("58.", "Biomes where trees are predominant are called ______________", 0, 0, 0, 0, 0, "polar biomes", "desert biomes ", "forest biomes ", "grassland biomes ", "Biomes where trees are predominant are called forest biomes", "c", 0, 1, this.f481b));
        arrayList.add(new questions("59.", "The goals of biodiversity conservation include all of the following EXCEPT", 0, 0, 0, 0, 0, "protecting individual species", "introducing exotic species into new environments", "preserving habitats and ecosystems", "making sure local people benefit from conservation efforts", "Exotic species are introduced individuals from another place. These species reproduce and grow rapidly that they cause major ecological changes and driving several native species to extinction.  ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("60.", "The maximum population growth rate characteristic of a species is called ", 0, 0, 0, 0, 0, "limiting factor ", "biotic potential", "carrying capacity", "exponential growth pattern ", "Biotic potential is the ability of a population of living species increase under ideal conditions, such as sufficient food supply, no predators, and a lack of disease.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("61.", "From among the following choice the field which is a branch or a part of biotechnology is?", 0, 0, 0, 0, 0, "Parasitology", "Immunology ", "Psychology", "Genetic engineering", "Genetic engineering is the alteration and recombination of genetic material by technological means, resulting in transgenic organisms. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("62.", "Which of the following is publicly an UNDESIRED research activity?", 0, 0, 0, 0, 0, "Breeding a new crop variety", "Synthesis of a new vaccine ", "Manufacture of a new effective medicine ", "Breeding a new pathogenic microorganism", "Pathogens are disease-causing organisms, so breeding new pathogens is undesired research activity.", "d", 0, 1, this.f481b));
        arrayList.add(new questions("63.", "Which of the following alternatives contains ONLY organic molecules? ", 0, 0, 0, 0, 0, "Calcium carbonate, glucose, methane", "Carbon dioxide, sodium chloride, lysine", "Linoleic acid, glycine, methane", "Water, carbon dioxide, calcium carbonate", "Organic molecules always contain both carbon and hydrogen but inorganic molecules may contain one or the other (or neither), but not both. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("64.", "Which test is suitable for checking the presence of lipids in food stuff ", 0, 0, 0, 0, 0, "Biuret test ", "Benedict’s test ", "Emulsion test", "Iodine test ", "", "c", C2719R.C2721drawable.bio2009q64e, 1, this.f481b));
        arrayList.add(new questions("65.", "How do heavy metal ions reduce the reaction rate of enzymes?", 0, 0, 0, 0, 0, "By destroying the 3-dimensional shape of the enzyme's active site ", "By raising the temperature above the optimum level for the enzyme ", "By dropping the pH well below the optimum level for the enzyme", "By inducing mutations that disrupt the functioning of the enzyme", "Heavy metal such as mercury destroys the 3-dimensional shape of the active site of an enzyme thus no formation of enzyme-substrate. complex. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("66.", "What happens when enzymes become denatured?", 0, 0, 0, 0, 0, "They can normally catalyse the reactions", "Their active sites are changed ", "Rate of the reaction increases ", "Bonds holding amino acids are unaffected", "Denaturation of enzyme is the alteration of the tertiary structure of a protein in living cells and changes the shape of the active site.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("67.", "What happens when human red blood cells are kept in a hypertonic solution? ", 0, 0, 0, 0, 0, "The same net gain and loss of water", "More water gets into the cell than leaving it", "More water goes out of the cell than getting in", "The cells prevent water from getting in or leaving out", "Hypertonic solution is a solution having lower water potential than the cell. Thus, the red blood cell in this solution loss water and become shrink. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("68.", "Among the following which one best describes the cells of bacteria?", 0, 0, 0, 0, 0, "Eukaryotic", "Prokaryotic", "Both eukaryotic and prokaryotic", "Neither prokaryotic nor eukaryotic", "Bacterium is a single-celled microorganism without distinct nuclei or organized cell structures. ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("69.", "Which of the following nitrogenous bases of nucleic acids is a purine base?", 0, 0, 0, 0, 0, "Adenine ", "Cytosine ", "Thymine ", "Uracil ", "", "a", C2719R.C2721drawable.bio2009q69e, 1, this.f481b));
        arrayList.add(new questions("70.", "Which of the plants with the following genotypes is heterozygous?", 0, 0, 0, 0, 0, "BBYY", "BbYb ", "bbyy ", "YYBB", "An organism is heterozygous for a particular gene if it has different alleles for that gene on each of the chromosomes in the relevant homologous pair.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("71.", "Which of the following groups of viruses copy their RNA to DNA?", 0, 0, 0, 0, 0, "Bacteriophages ", "DNA viruses", "RNA viruses ", "Retroviruses", "Retrovirus is an RNA virus that converts its genetic information from RNA into DNA after it has infected a host. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("72.", "Which of the following can reverse an enzyme inhibition that is caused by an allosteric inhibitor? ", 0, 0, 0, 0, 0, "Adding more substrate", "Adding more end product ", "Depleting the end product", "Depleting the substrate", "Allosteric inhibitors, such as the final product of a series of reactions bind to a region away from the active site, producing a conformational change in the enzyme that prevents the substrate from binding.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("73.", "During the Krebs cycle, to which of the following molecules is most of the energy released from food transferred? ", 0, 0, 0, 0, 0, "ATP", "NAD ", "ADP ", "AMP ", "NAD is a coenzyme that plays a role in taking most of the energy released from food. ", "b", 0, 1, this.f481b));
        arrayList.add(new questions("74.", "If in a DNA molecule consisting of 1000 base pairs, there are 300 adenines, how many guanine bases will be present? ", 0, 0, 0, 0, 0, "200 ", "400 ", "600 ", "700", "According to base-pairing rule: A = T and G = C; A + T = 600; G + C =. 1000 - 600 = 400. So, G = C = 400/2 = 200 ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("75.", "During which stage of aerobic respiration does oxidative phosphorylation occur? ", 0, 0, 0, 0, 0, "Glycolysis", "Krebs cycle ", "Link reaction ", "Chemiosmosis", "The electron transport chain and chemiosmosis together make up the process of oxidative phosphorylation. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("76.", "What mode of feeding do soil organisms that release nutrients from dead soil organic matter into the soil have? ", 0, 0, 0, 0, 0, "Photoautotrophic", "Saprophytic ", "Chemoautotrophic", "Parasitic", "Saprophyte is an organism, especially a fungus and bacterium, that obtain food from dead or decaying organic matter.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("77.", "When farmers are using fewer and fewer number of crop verities, what would happen to the genetic diversity of our crop plants?", 0, 0, 0, 0, 0, "It would get eroded", "It would be more conserved ", "It would be more diverse", "Nothing would happen to it", "The practice of growing a single crop in a field would results in declining the genetic diversity of the crop plants. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("78.", "During anaerobic respiration, what is the gross number of ATP molecules that are produced per glucose molecule?", 0, 0, 0, 0, 0, "Two", "Three", "Four ", "Six ", "During anaerobic respiration of glucose, four ATP molecules are produced per glucose molecule. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("79.", "Among the following four processes, identify the one that probably evolved before all the other three", 0, 0, 0, 0, 0, "Aerobic respiration", "Anaerobic respiration ", "Oxidizing atmosphere", "Photosynthesis", "The one that evolved among all the others are anaerobic respiration", "b", 0, 1, this.f481b));
        arrayList.add(new questions("80.", "Which of the following is NOT a learned behaviour? ", 0, 0, 0, 0, 0, "Imprinting", "Habituation", "Conditioning", "Trial and error", "Imprinting is an instinctive behavior in newly born (or hatched) organisms to attach themselves to first object they see after birth and thereafter follow that object.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("81.", "If an actively growing seedling is kept horizontally, which of the following would eventually happen to the seedling?", 0, 0, 0, 0, 0, "The shoot would bend upward", "The root would bend upward", "The seedling would stop growing", "The seedling would grow horizontally", "When actively growing seedling is kept horizontally, the roots grow downwards and the shoots grow upwards.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("82.", "Which of the following was the most possible mode of evolution by which the many species of Darwin's finches evolved on the Galapagos Islands?", 0, 0, 0, 0, 0, "Phyletic evolution", "Divergent evolution", "Convergent evolution", "Sympatric evolution", "Through divergent evolution, Darwin's finches diverge along different lines because of different selection pressures different environments.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("83.", "For which of the following processes is ATP NOT required?", 0, 0, 0, 0, 0, "Diffusion of oxygen into cells", "Synthesis of molecules", "Active transport of molecules from one site to another", "Muscle contraction ", "Oxygen, lipid soluble molecules, and small-uncharged molecules diffuse into cells without the requirement of ATP.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("84.", "Mutation may be described as:", 0, 0, 0, 0, 0, "phenotypic change ", "change in gene structure", "continuous variation ", "change due to hybridization ", "Mutation is change in genetic material of an organism.", "b", 0, 1, this.f481b));
        arrayList.add(new questions("85.", "Which of the following is the most UNLIKELY action that would be expected from Ethiopians who have been given adequate biological literacy?", 0, 0, 0, 0, 0, "Engagement in activities resulting in biodiversity loss", "Supporting activities concerned with food security ", "Awareness about climate change and its problem ", "Engagement in biological resource conservation", "No explanation", "a", 0, 1, this.f481b));
        arrayList.add(new questions("86.", "Which form of mutation is responsible for the disease known as leukaemia?", 0, 0, 0, 0, 0, "Duplication ", "Insertion ", "Inversion ", "Deletion ", "An inversion on chromosome 16 can cause leukemia. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("87.", "Which of the following characteristics can show the evolutionary relationships among organisms?", 0, 0, 0, 0, 0, "Structures having similar functions", "Presence of analogous structures", "Presence of homologous structures", "Structures having different origins", "Homologous structures are structures with the same basic anatomy and a common evolutionary origin but having a different function.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("88.", "Which of the following species isolating processes could lead to the eye of a new species by the mechanism known as sympatric speciation?", 0, 0, 0, 0, 0, "A river that changed its course for many years", "A new mountain range that was created many years ago", "Populations of a species having different breeding seasons", "A land mass that separated two water bodies for many years", "Sympatric speciation occurs when a population from an existing species develops into a new species without becoming geographically isolated from other members of the original species. ", "c", 0, 1, this.f481b));
        arrayList.add(new questions("89.", "What is an apoenzyme?", 0, 0, 0, 0, 0, "A protein molecule", "An active enzyme", "A non-protein molecule", "A non-protein cofactor", "Apoenzyme is the inactive protein component of an enzyme that has no physiological effect without attachment of a specific molecule coenzyme. ", "a", 0, 1, this.f481b));
        arrayList.add(new questions("90.", "For which of the following can divergent evolution be taken as alternative name? ", 0, 0, 0, 0, 0, "Allopatric speciation ", "Adaptive radiation", "Sympatric speciation", "A non-protein cofactor ", "An alternative name for adaptive radiation is divergent evolution", "b", 0, 1, this.f481b));
        arrayList.add(new questions("91.", "Which one of the following is the result of the similarity observed between the wings of a bird and a pterodactyl?", 0, 0, 0, 0, 0, "Convergent evolution", "Directional selection ", "Stabilizing selection", "Divergent evolution ", "Convergent evolution is the process by which unrelated organisms evolve similar structures, adapted for the same function.", "a", 0, 1, this.f481b));
        arrayList.add(new questions("92.", "Which of the following played an important role in the evolution of human being?", 0, 0, 0, 0, 0, "Emergency of wings in addition to limbs", "Development of even toes in the forearms", "Development of feathers and hallow bones", "Development of opposable thumb to grasp", "Opposable thumbs and bimetallism beside large brain characterize humans. ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("93.", "In which one of the following do we use genetically modified bacteria for purpose other than human health?", 0, 0, 0, 0, 0, "Production of insulin ", "Production of antibiotics ", "Production of herbicides ", "Production of vaccines", "Genetically modified bacteria is used for the production of herbicides", "c", 0, 1, this.f481b));
        arrayList.add(new questions("94.", "Which knowledge about cell biology did scientists discover after all the others", 0, 0, 0, 0, 0, "The first understanding that all living things are made of cells", "Knowledge about how chromosomes behave during mitosis ", "First understanding about the double helix structure of DNA", "First understanding about the DNA sequence in human genome", "", "d", C2719R.C2721drawable.bio2009q94e, 1, this.f481b));
        arrayList.add(new questions("95.", "Which of the following statements can be considered as the better definition of the biological concept of behaviour?", 0, 0, 0, 0, 0, "The reaction of a person or an animal in response to an external or internal stimulus", "The responses or reactions or movements that a living plant makes in any situation", "A system of coordinated response by an organism to an external or internal stimulus", "A receptor of some kind of Stimulus that an organism has which produces a response", "Behavior is the coordinated response of an organism to an internal or external stimulus.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("96.", "To which category of behaviour does the human behaviour that involves the Strengthening of existing responses or the formation of new responses to existing stimuli that occur because of practice or repetition belong?", 0, 0, 0, 0, 0, "Learned behaviour ", "Instinctive behaviour ", "Innate behaviour ", "Inborn behaviour ", "The human behaviour that involves the Strengthening of existing responses or the formation of new responses to existing stimuli that occur because of practice or repetition belong to Learned Behaviour", "a", 0, 1, this.f481b));
        arrayList.add(new questions("97.", "Which of the following is NOT grouped under genetically pre-programmed pattern of behaviour?", 0, 0, 0, 0, 0, "Reflex actions in humans ", "Orientation behaviour ", "Conditioned behaviour ", "Instinctive behaviours ", "Conditioned behavior is learned behavior that does not involve a genetically programmed pattern of behavior.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("98.", "Which group of bacteria reduces nitrate to nitrogen gas in the nitrogen cycle? ", 0, 0, 0, 0, 0, "Nitrogen fixing bacteria ", "Ammonium ion forming bacteria", "Denitrifying bacteria ", "Photosynthetic bacteria", "Denitrifying bacteria reduces nitrate to nitrogen gas thus reducing the amount of nitrogen in the soil.", "c", 0, 1, this.f481b));
        arrayList.add(new questions("99.", "The main factors that determine the types of terrestrial biomes in a certain geographical area are: ", 0, 0, 0, 0, 0, "Soil and vegetation ", "Soil and biological diversity", "Complexity in ecological succession ", "Precipitation & temperature ", "Temperature and precipitation (rainfall) are the most significant climatic factors in determining biome type.                        ", "d", 0, 1, this.f481b));
        arrayList.add(new questions("100.", "In which parts of Ethiopian community are lions, elephants & giraffes found more?", 0, 0, 0, 0, 0, "In the Afroalpine and sub Afroalpine zones ", "In the highland areas of northern Ethiopia ", "In the grasslands of southwestern Ethiopia ", "In central and northern parts of the rift valley", "The grassland of southwestern Ethiopia is characterized by having wild mammals, such as lions, elephants, and giraffe.", "c", 0, 1, this.f481b));
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
        this.f482tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2009.this.timer.setVisibility(0);
                    bio2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    bio2009.this.scr.setVisibility(8);
                    bio2009.this.chr.stop();
                    bio2009.this.toolbar.setVisibility(8);
                    bio2009.this.Relative.setBackgroundColor(-7829368);
                    bio2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2009.this.getBaseContext());
                    int unused = bio2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2009.this.highscoreBio2009 = defaultSharedPreferences.getInt("bio2009hs", 0);
                    int access$600 = bio2009.this.part1 + bio2009.this.part2 + bio2009.this.part3 + bio2009.this.part4 + bio2009.this.part5 + bio2009.this.part6 + bio2009.this.part7 + bio2009.this.part8 + bio2009.this.part9;
                    String str = "bio2009hs";
                    int unused11 = bio2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = bio2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = bio2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = bio2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = bio2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = bio2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = bio2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = bio2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = bio2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = bio2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1600 = bio2009.this.answered1 + bio2009.this.answered2 + bio2009.this.answered3 + bio2009.this.answered4 + bio2009.this.answered5 + bio2009.this.answered6 + bio2009.this.answered7 + bio2009.this.answered8 + bio2009.this.answered9;
                    bio2009.this.resultText.setText(String.valueOf(access$600));
                    bio2009.this.progressbar.setProgress(access$600);
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
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > bio2009.this.highscoreBio2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 100) * (access$1600 * access$1600)) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - bio2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) (access$1600 * access$600 * 100)))).floatValue());
                    long j = defaultSharedPreferences.getLong("date1bio091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1bio092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1bio093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1bio094", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1bio095", 0);
                    long j6 = defaultSharedPreferences.getLong("date1bio096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1bio097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1bio098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1bio099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1bio0910", 0);
                    Date date = new Date(j);
                    Date date2 = new Date(j2);
                    Date date3 = new Date(j3);
                    Date date4 = new Date(j4);
                    Date date5 = new Date(j5);
                    Date date6 = new Date(j6);
                    Date date7 = new Date(j7);
                    Date date8 = new Date(j8);
                    String str4 = str2;
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
                        editor.putString("scorebio091", str3);
                        editor.putLong("date1bio091", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str5 = str3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorebio092", str5);
                            editor.putLong("date1bio092", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorebio093", str5);
                            editor.putLong("date1bio093", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorebio094", str5);
                            editor.putLong("date1bio094", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorebio095", str5);
                            editor.putLong("date1bio095", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorebio096", str5);
                            editor.putLong("date1bio096", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorebio097", str5);
                            editor.putLong("date1bio097", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorebio098", str5);
                            editor.putLong("date1bio098", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorebio099", str5);
                            editor.putLong("date1bio099", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorebio0910", str5);
                            editor.putLong("date1bio0910", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datebio091", 0);
                    long j12 = defaultSharedPreferences.getLong("datebio092", 0);
                    long j13 = defaultSharedPreferences.getLong("datebio093", 0);
                    String str6 = str4;
                    long j14 = defaultSharedPreferences.getLong("datebio094", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datebio095", 0);
                    long j16 = defaultSharedPreferences.getLong("datebio096", 0);
                    long j17 = defaultSharedPreferences.getLong("datebio097", 0);
                    long j18 = defaultSharedPreferences.getLong("datebio098", 0);
                    long j19 = defaultSharedPreferences.getLong("datebio099", 0);
                    long j20 = defaultSharedPreferences.getLong("datebio0910", 0);
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
                        editor2.putString("iScorebio091", str6);
                        editor2.putLong("datebio091", valueOf.longValue());
                    } else {
                        String str7 = str6;
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorebio092", str7);
                            editor2.putLong("datebio092", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorebio093", str7);
                            editor2.putLong("datebio093", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorebio094", str7);
                            editor2.putLong("datebio094", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorebio095", str7);
                            editor2.putLong("datebio095", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorebio096", str7);
                            editor2.putLong("datebio096", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorebio097", str7);
                            editor2.putLong("datebio097", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorebio098", str7);
                            editor2.putLong("datebio098", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorebio099", str7);
                            editor2.putLong("datebio099", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorebio0910", str7);
                            editor2.putLong("datebio0910", valueOf.longValue());
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
                        bio2009.this.scr.setVisibility(8);
                        bio2009.this.chr.stop();
                        bio2009.this.toolbar.setVisibility(8);
                        bio2009.this.Relative.setBackgroundColor(-7829368);
                        bio2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2009.this.getBaseContext());
                        int unused = bio2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = bio2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = bio2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = bio2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = bio2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = bio2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = bio2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = bio2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = bio2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = bio2009.this.highscoreBio2009 = defaultSharedPreferences.getInt("bio2009hs", 0);
                        int access$600 = bio2009.this.part1 + bio2009.this.part2 + bio2009.this.part3 + bio2009.this.part4 + bio2009.this.part5 + bio2009.this.part6 + bio2009.this.part7 + bio2009.this.part8 + bio2009.this.part9;
                        int unused11 = bio2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = bio2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = bio2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = bio2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = bio2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = bio2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = bio2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = bio2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = bio2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = bio2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1600 = bio2009.this.answered1 + bio2009.this.answered2 + bio2009.this.answered3 + bio2009.this.answered4 + bio2009.this.answered5 + bio2009.this.answered6 + bio2009.this.answered7 + bio2009.this.answered8 + bio2009.this.answered9;
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
                        TextView access$2600 = bio2009.this.resultText;
                        access$2600.setText(access$600 + "/100");
                        bio2009.this.progressbar.setProgress(access$600);
                        bio2009.this.progressbar.setMax(100);
                        edit.putInt("ans1", 0);
                        edit.putInt("ans2", 0);
                        edit.putInt("ans3", 0);
                        edit.putInt("ans4", 0);
                        edit.putInt("ans5", 0);
                        edit.putInt("ans6", 0);
                        edit.putInt("ans7", 0);
                        edit.putInt("ans8", 0);
                        edit.putInt("ans9", 0);
                        if (access$600 > bio2009.this.highscoreBio2009) {
                            edit.putInt("bio2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2009.this.chr.getBase()) / 1000;
                        String str = "datebio099";
                        String str2 = "datebio098";
                        String str3 = "datebio097";
                        String str4 = "datebio096";
                        String str5 = "datebio095";
                        String str6 = "datebio094";
                        String str7 = "datebio093";
                        String str8 = "datebio092";
                        String str9 = "datebio091";
                        SharedPreferences.Editor editor4 = edit;
                        String str10 = "date1bio099";
                        String str11 = "date1bio098";
                        if (bio2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            float sqrt = (float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))));
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) sqrt)).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1bio091", 0);
                            String str12 = f;
                            String str13 = "date1bio091";
                            long j2 = defaultSharedPreferences.getLong("date1bio092", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1bio093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1bio094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1bio095", 0);
                            String str15 = "date1bio095";
                            String str16 = "date1bio094";
                            String str17 = "date1bio096";
                            long j6 = defaultSharedPreferences.getLong("date1bio096", 0);
                            String str18 = str11;
                            String str19 = "date1bio097";
                            long j7 = defaultSharedPreferences.getLong(str18, 0);
                            String str20 = str10;
                            long j8 = defaultSharedPreferences.getLong(str20, 0);
                            String str21 = str20;
                            String str22 = str18;
                            long j9 = defaultSharedPreferences.getLong("date1bio0910", 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str23 = "date1bio0910";
                            String str24 = "date1bio093";
                            Date date6 = new Date(j6);
                            Date date7 = new Date(defaultSharedPreferences.getLong("date1bio097", 0));
                            String str25 = "date1bio092";
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
                                editor3.putString("scorebio091", str14);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor4;
                                String str26 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorebio092", str26);
                                    editor3.putLong(str25, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorebio093", str26);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorebio094", str26);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorebio095", str26);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorebio096", str26);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorebio097", str26);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorebio098", str26);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorebio099", str26);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorebio0910", str26);
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
                            long j19 = sharedPreferences.getLong("datebio0910", 0);
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
                                editor3.putString("iScorebio091", str12);
                                editor3.putLong(str27, l.longValue());
                            } else {
                                String str28 = str12;
                                if (date22.compareTo(date13) == 0) {
                                    editor3.putString("iScorebio092", str28);
                                    editor3.putLong(str8, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor3.putString("iScorebio093", str28);
                                    editor3.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor3.putString("iScorebio094", str28);
                                    editor3.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor3.putString("iScorebio095", str28);
                                    editor3.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor3.putString("iScorebio096", str28);
                                    editor3.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor3.putString("iScorebio097", str28);
                                    editor3.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor3.putString("iScorebio098", str28);
                                    editor3.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor3.putString("iScorebio099", str28);
                                    editor3.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor3.putString("iScorebio0910", str28);
                                    editor3.putLong("datebio0910", l.longValue());
                                }
                            }
                            editor = editor3;
                        } else {
                            String str29 = "date1bio091";
                            String str30 = "date1bio093";
                            String str31 = "date1bio094";
                            String str32 = "date1bio092";
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str33 = "date1bio097";
                            String str34 = "date1bio095";
                            String str35 = str10;
                            String str36 = str11;
                            String str37 = "date1bio096";
                            String str38 = "date1bio0910";
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
                                editor2.putString("scorebio091", str41);
                                editor2.putLong(str40, l2.longValue());
                            } else {
                                String str50 = str41;
                                editor2 = editor4;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorebio092", str50);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorebio093", str50);
                                    editor2.putLong(str49, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorebio094", str50);
                                    editor2.putLong(str44, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorebio095", str50);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorebio096", str50);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorebio097", str50);
                                    editor2.putLong(str46, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorebio098", str50);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorebio099", str50);
                                    editor2.putLong(str39, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorebio0910", str50);
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
                            long j39 = sharedPreferences3.getLong("datebio0910", 0);
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
                                editor.putString("iScorebio091", str42);
                                editor.putLong(str51, l2.longValue());
                            } else {
                                editor = editor5;
                                String str55 = str42;
                                if (date44.compareTo(date35) == 0) {
                                    editor.putString("iScorebio092", str55);
                                    editor.putLong(str52, l2.longValue());
                                } else if (date44.compareTo(date36) == 0) {
                                    editor.putString("iScorebio093", str55);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date44.compareTo(date37) == 0) {
                                    editor.putString("iScorebio094", str55);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date44.compareTo(date38) == 0) {
                                    editor.putString("iScorebio095", str55);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date44.compareTo(date39) == 0) {
                                    editor.putString("iScorebio096", str55);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date44.compareTo(date40) == 0) {
                                    editor.putString("iScorebio097", str55);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date44.compareTo(date41) == 0) {
                                    editor.putString("iScorebio098", str55);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date44.compareTo(date42) == 0) {
                                    editor.putString("iScorebio099", str55);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date44.compareTo(date43) == 0) {
                                    editor.putString("iScorebio0910", str55);
                                    editor.putLong("datebio0910", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        bio2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2009.this.scr.setVisibility(8);
                bio2009.this.chr.stop();
                bio2009.this.toolbar.setVisibility(8);
                bio2009.this.Relative.setBackgroundColor(bio2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2009.this.scr.setVisibility(0);
                bio2009.this.toolbar.setVisibility(0);
                bio2009.this.telegram_layout.setVisibility(8);
                bio2009.this.chr.start();
                bio2009.this.Relative.setBackgroundColor(bio2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = bio2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = bio2009.this.mInterstitialAd = null;
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
                bio2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
