package com.visionapps.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
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
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class bio2006 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f477b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2006;
    /* access modifiers changed from: private */
    public View layout;
    private Boolean mode;
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
    private Button report;
    /* access modifiers changed from: private */
    public TextView resultText;
    /* access modifiers changed from: private */
    public ScrollView scr;

    /* renamed from: tb */
    private Toolbar f478tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2006);
        this.f477b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.resultBio2006);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2006);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Pb);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following do viruses share with cells? ", 0, 0, 0, 0, 0, "Cell wall ", "Cytoplasm", "Nucleic acid", "Protoplasm", "Viruses are considered entities that lie between living and non-living matter. They are made up of genetic core made of nucleic acid covered by protein coat the feature which they share with cell ", "c", 0, 1, this.f477b));
        arrayList.add(new questions("2.", "Which one of the following cellular forms did Robert Hooke observe under his crude microscope? ", 0, 0, 0, 0, 0, "Bacteria ", "Protozoa ", "Yeast", "Empty cell wall", "Robert Hooke, with one of the earliest compound microscopes, makes drawings of cork and sees tiny structures that he calls \"cells\". It was the cell wall of dead plant cells.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("3.", "In the case of enzymatic chemical reactions, what do you call the substance that is acted up on by an enzyme?", 0, 0, 0, 0, 0, "Polypeptide ", "Coenzyme", "Vitamin", "Substrate", "Substrate is any substance that can be acted up on by enzyme to be either made or degrade.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("4.", "Choose the organisms that belong to the eukaryotes?", 0, 0, 0, 0, 0, "Bacteria", "Blue-green algae", "Amoeba", "Virus", "Living organisms broadly classified as Prokaryotes and Eukaryotes. Prokaryotes include Bacteria and blue-green algae under kingdom monera. The rest of four kingdoms namely: Protista, Fungi, Plantae and Animalia are eukaryotes possessing true nucleus.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("5.", "While conducting research, which of the following should a biologist do first?", 0, 0, 0, 0, 0, "Generate a hypothesis", "Conduct experiments", "Communicate the results", "Identify a research question/problem", "The scientific method follows the following basic steps:\n1. Observation. A scientific study begins with observations of objects\n2. Identifying the problem. Scientists ask questions from what they observe.\n3. Forming a hypothesis. Observations lead to the formulation of hypothesis. The hypothesis is a tentative theory or an intelligent guess. It can be supported or disproved after the experiment.\n4. Making predictions. A prediction is a logical deduction from a hypothesis, without any kind of experimentation. \n5. Conducting an experiment. Hypotheses are often tested by experimentation. After the experiment the hypothesis can be rejected or accepted.\n6. Drawing a conclusion from the experiment. If the hypothesis is supported by an experiment, it becomes a theory. \n", "d", 0, 1, this.f477b));
        arrayList.add(new questions("6.", "Which of the following structures is NOT present in animal cells?", 0, 0, 0, 0, 0, "Cell wall", "Nucleus", "Protoplasm ", "Nucleic acid", "Animal cells can change shape due to the lack of a cell wall and are usually rounded whereas plant cells have a fixed shape kept by the presence of the cell wall.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("7.", "An experimental animal stopped responding to a stimulus that has been repeated so many times. What type of learned behavior is this?", 0, 0, 0, 0, 0, "Latent learning", "Habituation", "Imprinting", "Operant conditioning", "Habituation is an extremely simple form of learning, in which an animal, after a period of exposure to a repeated presentation (stimulus), stops responding.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("8.", "Behavior that is repeated on a daily basis is referred to as:", 0, 0, 0, 0, 0, "Nucleic acid", "Circadian", "Circannual", "Seasonal", "Circadian rhythms are patterns that are repeated daily. Example: Sleep/wake cycles in animals and plants. Circadian rhythms appear to be timed by an internal biological clock.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("9.", "Which molecule in the cell is the constituent of the gene?", 0, 0, 0, 0, 0, "Lunar", "Protein", "Lipid", "Carbohydrate", "Gene is a small piece of the genome. It is the fundamental unit of heredity. Genes are found on chromosomes and are made of DNA which is a nucleic acid. Different genes determine the different characteristics, or traits, of an organism.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("10.", "What is the branch of biology that studies about the origin and gradual changes of living things?", 0, 0, 0, 0, 0, "Microbiology", "Evolution ", "Mutation", "Reproduction ", "Evolution is the study of genetic change in a population from one generation to another or changes in the gene pool of a population from generation to generation by such processes as mutation. natural selection, and genetic drift.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("11.", "What is the general term for the part of the protoplasm that lies outside the nucleus?What is the general term for the part of the protoplasm that lies outside the nucleus?", 0, 0, 0, 0, 0, "Cytosol", "Cytoplasm", "Central vacuole", "Plasma membrane", "The part of protoplasm that lies inside the nucleus is known as nucleoplasm while the part outside of the nucleus is known as cytoplasm.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("12.", "How many net ATP molecules are generated through anaerobic respiration, when a single glucose molecule is changed to pyruvate in the human body?", 0, 0, 0, 0, 0, "Two", "Three", "Four", "Six", "Glycolysis is the first stage of splitting glucose. The net result of glycolysis is a gain of 2: ATP, an \"investment into 2 NADHS, and the breaking apart of glucose into two pyruvate molecules. ", "a", 0, 1, this.f477b));
        arrayList.add(new questions("13.", "Which of the following groups of bacteria consists of rod-shaped cells? ", 0, 0, 0, 0, 0, "Gram-positive", "Bacilli", "Cocci", "Spirilla", "Bacilli are the group of bacteria categorized based on their rod shape.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("14.", "How many carbon and oxygen atoms are there in a molecule of maltose?", 0, 0, 0, 0, 0, "6 carbon and 6 oxygen", "12 carbon and 11 oxygen", "11 carbon and 12 oxygen", "24 carbon and 12 oxygen ", "Disaccharide molecule like maltose, lactose and sucrose are made by condensation reaction between two hexose sugars. A molecule of water (H₂0) is formed from a hydroxyl group from one monosaccharide and a hydrogen atom from the other. This allows a bond to be formed between the two monosaccharide units to make a disaccharide. The formula is C_12 H_22 O_11.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("15.", "On which of the following organelles of the eukaryotic cell does protein synthesis take place?", 0, 0, 0, 0, 0, "The nucleus ", "The ribosome", "The chloroplast", "The mitochondrion ", "They are special organelles that are directly involved in protein synthesis. They are non-membranous organelles. They are made of RNA (ribonucleic acid) and protein and are manufactured in the nucleus (from a DNA template), then go out into the cytoplasm to function.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("16.", "Which of the following parts of plant roots is harboring nitrogen fixing bacteria?", 0, 0, 0, 0, 0, "Root nodule", "Root hair", "Root tip", "Root cap", "An important defining characteristic of legumes is the fact that they form a symbiotic relationship with bacteria of the genus Rhizobium. In this relationship, the Rhizobium bacteria colonize plants roots causing the formation of nodules. From inside these nodules, the bacteria absorb nitrogen gas (N₂) from the atmosphere and then transform it into forms of nitrogen (nitrate: NO3- or ammonia: NH3) that are usable by itself and the host plant.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("17.", "Which of the following is true about protozoa? ", 0, 0, 0, 0, 0, "They are a group of bacteria", "They are one-celled organisms", "They represent both plant and animals ", "They are unicellular animals", "Protozoa is a collective name for animal-like, single-celled organisms, some of which may form colonies. In the classification, the protozoa are placed in the kingdom Protista with other single-celled organisms that have membrane-enclosed nuclei.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("18.", "Which of the following is a distinguishing feature of amino acids that is not found in carbohydrates?", 0, 0, 0, 0, 0, "Carbon", "Oxygen", "Hydrogen ", "Nitrogen", "Amino acids are made of the four elements C H O N and some may have S. Carbohydrates are made up of elements called C, H, and O only.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("19.", "Which of the following statements is true about matter and energy in the ecosystem?", 0, 0, 0, 0, 0, "Both matter and energy are recycled ", "Matter is not recycled; energy is recycled", "Matter is recycled; energy is not recycled", "Energy is recycled more than matter does", "The energy is passed on from trophic level to trophic level while nutrients are continuously recycled between biotic and abiotic components of the ecosystem.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("20.", "Which one of the following molecules in living things is not an organic molecule?", 0, 0, 0, 0, 0, "Sugar", "Nucleotide ", "Amino acid", "Water", "Water is a very important biological molecule - it is found in large percentages in all living forms. Water is the most abundant component of protoplasm (60 80), followed by protein (9%), carbohydrates (2-3%) and lipids (1.5-2). Water is an inorganic molecule made up of hydrogen and oxygen.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("21.", "At which stage is most of the ATP generated in aerobic respiration?", 0, 0, 0, 0, 0, "Glycolysis", "Link reaction", "Krebs cycle ", "Electron transport", "", "d", 0, 1, this.f477b));
        arrayList.add(new questions("22.", "Which of the following is the common characteristic of all enzymes? ", 0, 0, 0, 0, 0, "They act inside cells only ", "They are proteins", "They require cofactors", "They operate at any PH", "", "b", 0, 1, this.f477b));
        arrayList.add(new questions("23.", "In a cross between round green pea of RRyy genotype wrinkled yellow pea of rrYY genotype, what is the expected genotype of the F1?", 0, 0, 0, 0, 0, "RRyy", "rrYY", "RRYY", "RrYy", "", "d", C2719R.C2721drawable.annotation_2021_12_08_131222, 1, this.f477b));
        arrayList.add(new questions("24.", "Which of the following cellular structures is possessed by all cells?", 0, 0, 0, 0, 0, "Cell membrane", "Cell wall", "Nucleus", "Golgi apparatus", "All cells are composed of nuclear material, cytoplasm and cell membrane. ", "a", 0, 1, this.f477b));
        arrayList.add(new questions("25.", "During the Krebs cycle, which of the following molecules temporary stores most of the energy released from food molecule?", 0, 0, 0, 0, 0, "ADP", "ATP", "NADH", "FADH", "Most of the energy released from glucose is stored temporarily in the form of NADH a coenzyme that further release energy during electron transport system.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("26.", "Which of the following carbohydrate has structural function?", 0, 0, 0, 0, 0, "Cellulose ", "Glycogen", "Starch", "Sucrose", "Cellulose is homopolysaccharide of ß-glucose joined by B-1, 4 glycosidic bonds, formed by condensation reaction. Have chains of cellulose molecules linked by hydrogen bonds both intermolecular and intra molecular. This results in the formation of cellulose micro fibrils. It forms a structural component of cell wall in plants.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("27.", "Which of the following forms of nitrogen are readily utilizable by green plants?", 0, 0, 0, 0, 0, "Atmospheric nitrogen", "Nitrite", "Ammonium ion", "Nitrate", "Most plants obtain the nitrogen they need as inorganic nitrate from the soil solution. Ammonium is used less by plants for uptake because in large concentrations it is extremely toxic.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("28.", "In some crosses of maize, the progeny produces better yield than the parents. What is this phenomenon known as?", 0, 0, 0, 0, 0, "Dominance", "Heterozygosity ", "Hybrid vigor", "Inbreeding depression ", "Hybrid vigor-occurs when unrelated breeds or lines are cross breed. Because it is the result of increased heterozygosity, the term hybrid vigor is sometimes replaced by heterosis. In many cases the offspring from these crosses are more productive (higher milk yields, more beef per carcass) than the average of their parent breeds.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("29.", "Which of the following techniques is used to separate DNA fragments according to their size on a gel?", 0, 0, 0, 0, 0, "Southern blotting ", "Electrophoresis", "Radioactive labeling", "Digestion by restriction enzyme", "Electrophoresis is techniques used to separate DNA fragments according to their size on a gel. This technique is the biotechnology equivalent of screening sand through progressively finer mesh screens to determine particle sizes ", "b", 0, 1, this.f477b));
        arrayList.add(new questions("30.", "Which of the following groups of animals have males with ZZ. and females with ZW sex chromosome constitution?", 0, 0, 0, 0, 0, "Grasshoppers", "Birds", "Mammals ", "Honey bee", "Sex is determined in birds by female. It is females who are the heterogametic sex (ZW) and males the homogametic sex (ZZ). ", "b", 0, 1, this.f477b));
        arrayList.add(new questions("31.", "The molecules of which pigment is located at the reaction center of a photosystem?", 0, 0, 0, 0, 0, "Chlorophyll a", "Carotenoid", "Chlorophyll b", "Accessory pigments", "A photosystem consists of a number of pigment molecules all clustered around one particular chlorophyll molecule called reaction center molecule where light-dependent reactions begin. The reaction center molecule is always chlorophyll 'a'.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("32.", "According to Lamarck's theory of evolution, what is the mechanism by which evolving organisms acquire new structures?", 0, 0, 0, 0, 0, "Mutation", "Hereditary variation", "Use-and-disuse of parts of the body", "Recombination of ancestral genes", "According to Lamarck, changes in the environment may lead to changed patterns of behavior which can necessitate new or increased use or disuse of certain organs or structures. The constant use of an organ increases its efficiency and size and leads to its better development. On the contrary, if an organ is not used for a long time it leads to the reduction in efficiency and size and ultimately leads to its degeneration.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("33.", "In which of the activities of the honey bee colony are worker bees involved?", 0, 0, 0, 0, 0, "Laying eggs", "Serving as queens", "Reproductive functions", "Taking care of the larvae", "Worker bees do all the different tasks needed to maintain and operate the hive. They work in and outside the hive doing comb construction, brood rearing, tending the queen and drones, cleaning, temperature regulation and defending the hive.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("34.", "In which one of the following ways the Tundra biome differs from desert biome?", 0, 0, 0, 0, 0, "It is a treeless biome ", "It has little biodiversity", "It receives little precipitation", "It has permanently frozen subzone", "Tundra is largely frozen treeless area with a short growing season. It receives very little rainfall 200mm / year. It is referred. to as cold desert due to very low vegetation (sparse vegetation) and plants possess xerophytic characteristics.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("35.", "Which one of the following is the mechanism by which two genes located on the same chromosome are separated?", 0, 0, 0, 0, 0, "Independent assortment", "Segregation", "Linkage", "crossing over", "Crossing over occurs between the paired DNA strands, creating the chromosomal configurations known as chiasmata. This enables genes on the same chromosome to separate during meiosis.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("36.", "It present in the fermentation system, which one of the following would negatively affect alcohol production by yeasts?", 0, 0, 0, 0, 0, "Water", "Oxygen", "Glucose", "Fermentation enzyme", "Yeast undergoes alcoholic fermentation in the absence of oxygen. If oxygen availability is there, they shift their mode to aerobic respiration.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("37.", "Which of the following can be taken as case for evidence of evolution from the field of plant & animal breeding? ", 0, 0, 0, 0, 0, "Artificial breeding always creates new species", "Artificial breeding only produces new organisms with higher yield. ", "Artificial breeding shows that natural selection can produce variations ", "Artificial breeding can produce new variations in organisms", "Selective breeding experiments have shown that genetic and physical modification of species is possible and so should be possible as a result of natural selection (rather than human selection). ", "c", 0, 1, this.f477b));
        arrayList.add(new questions("38.", "Which of the following mechanisms moves digested amino acids and glucose across the plasma membrane of the cells lining the wall of the small intestine?", 0, 0, 0, 0, 0, "Osmosis", "Simple diffusion", "Facilitated diffusion", "Active transport", "Soluble digested food molecules are absorbed by the lining of the plasma membrane through endocytosis (Active transport). ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("39.", "Where exactly in the cell does the Krebs cycle take place?", 0, 0, 0, 0, 0, "Mitochondrial matrix", "Inner mitochondrial membrane", "Cytoplasmic fluid", "Outer mitochondrial membrane:", "Krebs cycle takes place inside the matrix of mitochondrion whereas ETC occurs on the inner membrane of mitochondrion.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("40.", "What is the ultimate source of energy for all organisms living on the earth?", 0, 0, 0, 0, 0, "Water ", "Oxygen", "Nitrogen", "The sun", "The sun is an ultimate source of energy for living organism in that it provides solar energy for green plants which in turn prepares their own food and transfer chemical energy for the rest of organisms.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("41.", "Which of the following substances is NOT necessary for photosynthesis to take place?", 0, 0, 0, 0, 0, "Chlorophyll", "Carbon dioxide", "oxygen", "water", "The necessary materials for photosynthesis to take place in green plants include Water, Carbon dioxide sun light & Chlorophyll.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("42.", "Which group of organic compounds includes the enzymes? ", 0, 0, 0, 0, 0, "Proteins", "Lipids ", "starches ", "carbohydrates", "All enzymes are globular proteins.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("43.", "Into which of the following organic compounds can lipase, maltase and sucrase be grouped?", 0, 0, 0, 0, 0, "Hormones ", "Carbohydrates ", "Nucleic acids ", "Enzymes", "Enzymes are globular proteins which can be named based on the substrate they act on. For example: Lipase act on lipids, Maltase act on maltose and sucrase (invertase) act on sucrose.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("44.", "Choose the characteristics that viruses share with living things.", 0, 0, 0, 0, 0, "They are made up of many specialized cells ", "They contain genetic material", "They reproduce by mitosis ", "They contain chlorophyll", "Virus is made up of genetic material surrounded by a protein coat. Having genetic material, they show certain resemblance with living things.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("45.", "Which one of the following eukaryotic cell organelles was a free-living cell before eukaryotic cells evolved? ", 0, 0, 0, 0, 0, "Nucleus ", "Ribosome", "Chloroplast", "Nucleolus ", "Endosymbiosis theory suggests that Chloroplast and mitochondria which are a eukaryotic organelle by now were free living prokaryotes.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("46.", "If a radioactive substance that weighs one kilogram has a half-life of 100 years, what would be the percentage of the substance left after 300 years?", 0, 0, 0, 0, 0, "50", "30", "25", "12.5", "After 300 years or three half-life's there could be only 12.5 Kg radioactive substance is left. ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("47.", "Which of the following is more true about the male of the honey bee?", 0, 0, 0, 0, 0, "It has no father ", "It is sterile", "It is diploid", "It regulates the colony", "Drones (males of the honey bee) are sterile because they are developed parthenogenetically. So, they are haploid organism.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("48.", "Which of the following PH values represents the strongest base?", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "7", "13", "15", "PH value ranges from 0-14 and inversely proportional to POH which measures the strength of bases. So, the higher the PH value the stronger the bases are. ", "c", 0, 1, this.f477b));
        arrayList.add(new questions("49.", "In Ethiopia, which one of the following vertebrate groups has the largest number of genera?", 0, 0, 0, 0, 0, "Mammals", "Birds", "Reptiles", "Amphibians", "In terms of the biodiversity of it savifauna (birds), Ethiopia is one of the most significant countries in mainland Africa. It is also characterized by having the largest number of genera (306) among vertebrates.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("50.", "Which of the following is an accurate representation of the relationships between the term’s metabolism, anabolism and catabolism?", 0, 0, 0, 0, 0, "Anabolism = Catabolism", "Metabolism = Catabolism", "Anabolism = Catabolism + Metabolism", "Metabolism = Catabolism +Anabolism", "The sum total of all chemical reactions taking place in living organism is called metabolism. The reactions which build up products are known as anabolic reactions whereas the reactions that break down substances are known as catabolic reactions. ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("51.", "What do you call structures that have the same evolutionary origin but now are different in structure or have different functions?", 0, 0, 0, 0, 0, "Endemic", "Analogous", "Homologous", "Indigenous", "Homologous structures are structures that share a common. developmental (evolutionary) origin but may serve different functions in modern species.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("52.", "Which term describes the process by which water is lost by evaporating through the stomata of leaves?", 0, 0, 0, 0, 0, "Transport", "Transpiration", "Anchorage", "Adhesion", "Transpiration is an ultimate loss of water from the surface of leaves of a plant.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("53.", "Which of the following is true about saturated fatty acids? ", 0, 0, 0, 0, 0, "They have single bonds between carbon atoms", "They are the same as polyunsaturated fatty acids ", "They are the same as monounsaturated fatty acids", "They have double bonds between the carbon atoms", "Saturated fatty acids have only single bonds between carbon atoms. Hence they contain the maximum number of hydrogen atoms possible.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("54.", "For a biological detergent to effectively remove oily and greasy dirt. which of the following enzymes should it contain?", 0, 0, 0, 0, 0, "Cellulase", "Protease ", "amylase ", "lipase", "Oily and greasy dirt is most effectively be removed by detergent containing lipase which act on lipids. ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("55.", "In which kingdom of life is it most likely to find many examples of organisms that can undergo metamorphosis?", 0, 0, 0, 0, 0, "Monera", "Fungi", "Plantae", "Animals", "Metamorphosis is a gradual change of the body and periodic shading of their skin in some animals like insect and snake.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("56.", "During protein synthesis, where in the cell does transcription take place?", 0, 0, 0, 0, 0, "Ribosome", "Nucleus", "Endoplasmic reticulum ", "Golgi apparatus", "During protein synthesis, two important and related processes are taken place. Transcription which is copying genetic information from DNA to mRNA takes place inside nucleus. Following this translation or transferring genetic messages to protein synthesis takes place in the cytoplasm. ", "b", 0, 1, this.f477b));
        arrayList.add(new questions("57.", "What is a perfect flower? ", 0, 0, 0, 0, 0, "A flower with petals and pistil", "A flower with stamens and sepals", "A flower with stamens and pistil ", "A flower with sepals and petals", "Perfect flower is the one that contains both male (stamen) and female (pistil) reproductive structures.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("58.", "Which molecules carry the instructions for protein synthesis? ", 0, 0, 0, 0, 0, "Carbohydrates & lipids", "Amino acids", "DNA & RNA", "Enzymes", "Refer Question No 56.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("59.", "Which region of the human digestive tract contains enzymes that perform well at low PH?", 0, 0, 0, 0, 0, "Mouth", "Stomach", "Small intestine", "Large intestinal", "Enzymes in our mouth works best at around neutral pH while those in our stomach works best at relatively high PH. Those in our small intestine work best at low PH.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("60.", "Which of the following resources is needed by an ecosystem from outside in order to sustain itself?", 0, 0, 0, 0, 0, "Producers", "Macronutrients", "Micronutrients", "Sunlight", "Ecosystem is self-sufficient environment except the need for sun light from outside.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("61.", "Which of the following is true about the substance represented by the chemical formula \"C₂H5NO₂\"?", 0, 0, 0, 0, 0, "Simple sugar", "Inorganic substance", "Fatty acid", "Amino acid", "The substance shown by the chemical formula above would be represented by the molecular formula shown below. R group is replaced by H if the amino acid is the simplest one.", "d", C2719R.C2721drawable.annotation_2021_12_08_132952, 1, this.f477b));
        arrayList.add(new questions("62.", "Which one of the following characteristics is UNNECESSARY of an object to be considered a living thing?", 0, 0, 0, 0, 0, "Ability to respond to stimuli ", "Ability to reproduce.", "Ability to grow", "Ability to move", "An object may move from place to place or back and forth with an external force which is unnecessary to define life.", "d ", 0, 1, this.f477b));
        arrayList.add(new questions("63.", "Which field studies the way in which individual traits of organisms are transmitted from one generation to the next?", 0, 0, 0, 0, 0, "Genetics", "Ecology", "Evolution ", "Morphology", "Genetics is the branch of biology that deals with heredity. especially the mechanisms of hereditary transmission and the variation of inherited characteristics among similar or related organisms", "a", 0, 1, this.f477b));
        arrayList.add(new questions("64.", "In which of the following ways is the carbon dioxide of the atmosphere fixed into the carbon found in organic molecules?", 0, 0, 0, 0, 0, "In the breathing processes of all animals", "In the decomposition of organic molecules ", "In the process of photosynthesis by green plants", "In all the cellular respiration processes of organisms ", "Carbon is the basic building of the carbohydrates, fats, proteins, nucleic acids such as DNA and RNA, and other organic compounds necessary for life. Producers absorb CO2 from the atmosphere or water and use photosynthesis to convert it into complex carbohydrates.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("65.", "Which of the following is NOT a term used to describe organisms that have had foreign genes added to them?", 0, 0, 0, 0, 0, "Genetically modified organisms", "Transgenic organisms ", "Genetically engineered organisms", "Pathogenic organisms", "Pathogenic organisms are organisms that cause disease. The other three refers to the same thing to mean organisms whose genetic material is altered.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("66.", "Which of the following is prevented from taking place if populations are separated by a geographic barrier?", 0, 0, 0, 0, 0, "Mutation ", "Evolution", "Gene flow", "Natural selection", "Physical barrier s like Continental split, rise in sea level, formation of mountain range, advance of glacier and change in habitat prevents gene flow between populations of a species.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("67.", "In protein synthesis, what is produced during transcription?", 0, 0, 0, 0, 0, "Protein", "mRNA ", "DNA", "polypeptide", "Transcription is the process that converts genetic information from a DNA code into an mRNA code.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("68.", "If a cell fails to clear its cellular debris, which one of its organelles is most likely NOT functioning?", 0, 0, 0, 0, 0, "Nucleus", "Mitochondria", "Endoplasmic reticulum", "Ribosomes", "Endoplasmic reticulum is responsible for removing cellular debris by forming vesicles. ", "c", 0, 1, this.f477b));
        arrayList.add(new questions("69.", "Which of the following applies to the tropical rainforest?", 0, 0, 0, 0, 0, "Low rainfall and high temperature", "Low rainfall and low temperature", "High rainfall and high temperature", "High rainfall and low temperature ", "Tropical rainforest is characterized by high rain fall and high temperature.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("70.", "Which stage in the life cycle of HIV is inhibited by the antiretroviral drug known as integrase-inhibitor?", 0, 0, 0, 0, 0, "Conversion of viral RNA to DNA", "Replication of the viral genome ", "Insertion of the viral genome into host genome", "Release of the viral progeny from the cell ", "Non-nucleotide reverse transcriptase inhibitors (NATT's) attach to HIV's enzyme preventing it from converting RNA to DNA.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("71.", "Which of the following groups of plants carry out light dependent and light independent reactions of photosynthesis in separate cells?", 0, 0, 0, 0, 0, "C-3 plants", "C-4 plants.", "CAM plants", "Plants without chlorophyll", "In C4 plants, CO₂ is taken up in mesophyll cells and malate, a reduced form of oxaloacetate, is pumped into the bundle-sheath cells; here CO₂ enters Calvin cycle. Ca plants have advantage over C3 plants in hot and dry weather because photorespiration does not occur.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("72.", "Among the following identify the organelle in which nucleic acid is NOT found?", 0, 0, 0, 0, 0, "Mitochondria", "Chloroplast", "Ribosome", "Golgi apparatus", "Mitochondria and chloroplast are semi-autonomous organelles capable of duplicating themselves. They have their own smaller DNAS, Ribosomes also are made of protein and RNA components ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("73.", "Which of the following can create strong inter-specific competition if shared by two or more species?", 0, 0, 0, 0, 0, "Habitat", "Ecosystem", "Niche", "predator", "When two different species compete for the same resource in same habitat, inter specific competition becomes strong. ", "a", 0, 1, this.f477b));
        arrayList.add(new questions("74.", "The half-life of carbon -14 is about 5730 years. If a fossil is 17200 years old, about what percent of its original carbon-14 is still present in the fossil?", 0, 0, 0, 0, 0, "75%", "50%", "25%", "12%", "Half-life refers to the time taken for the radioactive isotope to fall by half. Thus, if a half-life of carbon 14 of a certain fossil is 5730 years \n✓ 50% of the original amount of carbon 14 remains after 5730 years\n✓12.5% of the original amount of carbon 14 remains after 11460 years \n✓25% of the original amount of carbon 14 remains after 17200 years\n", "d", 0, 1, this.f477b));
        arrayList.add(new questions("75.", "Which of the following pairs of individuals have identical DNA fingerprints?", 0, 0, 0, 0, 0, "Father and son", "Mother and daughter", "Brother and sister", "Monozygotic twins", "With the exception identical twins (monozygotic twins); an individual’s finger prints are unique. They do not change throughout life. Genetic finger printing is a technique for comparing the DNA of different people.", "d ", 0, 1, this.f477b));
        arrayList.add(new questions("76.", "Among the following which one has little or no contribution to the loss of biodiversity?", 0, 0, 0, 0, 0, "Overgrazing by domestic animals ", "Clearing forests to grow crops", "Growing crops of improved verities ", "Growing crops of land", "Growing crops of land contribute less for biodiversity loss. ", "d", 0, 1, this.f477b));
        arrayList.add(new questions("77.", "Suppose sites A, B, C and D have Simpson's Index of Diversity (d) values of 20,8,16 and 3, respectively, which site is dominated by one or just a few species? ", 0, 0, 0, 0, 0, "Site A", "Site B", "Site C", "Site D", "Allow value for the index of diversity, suggesting only a few successful species, could be the rest of a hostile environment with only a few organisms being really well adapted to that environment", "d", 0, 1, this.f477b));
        arrayList.add(new questions("78.", "Which of the following types of chromosome mutations gives rise to an extra chromosome?", 0, 0, 0, 0, 0, "Inversion", "Translocation", "Deletion", "Non-disjunction", "Nondisjunction (\"not coming apart\") is the failure of chromosome pairs to separate properly during meiosis stage I or the failure of sister chromatids to separate during meiosis II. The result of this error is a cell with an imbalance of chromosomes. Such a cell is said to be aneuploid-Cell that has extra chromosomes or chromosomes missing.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("79.", "Suppose a hypothetical cube-shaped cell has sides of 10 micrometers, what is the surface area to volume ratio of this cell?", 0, 0, 0, 0, 0, "6:10", "10:10", "3:6", "4:8", "The total surface area of this cell is calculated by the equation: height x width x number of sides which is 10*10*6=600 whereas the total volume of this cell is calculated by the equation: height * width x Length which is 10*10*10=1000. So, the surface area to volume ratio of this cell is 6:10.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("80.", "Which of the following pairs are analogous structures? ", 0, 0, 0, 0, 0, "Wing of a bird & wing of a butterfly.", "Front leg of a horse & a human arm", "Wing of a bird & wing of a bat ", "Front leg of a frog & wing of a bat", "Analogous structures are a contrast to homologous structures. They serve the same function between organisms but are different in internal anatomy.\n✓ Such as the wings of birds and butterflies or the eyes of lobsters and fish. These structures are of no use in classifying organisms of in working out their evolutionary relationships with each other.\n", "a", 0, 1, this.f477b));
        arrayList.add(new questions("81.", "How are unsaturated fats distinguished? ", 0, 0, 0, 0, 0, "They are made up of glucose & fructose", "They are made up of amino acids & glycerol ", "They have double bonds in their carbon chains", "They have only single bonds at the points of attachment", "The difference between hydrocarbon chains in fatty acids is because of the nature of the bonding between the carbon atoms.\n✓If all the carbon-carbon bonds in the hydrocarbon chain are single bonds, the fatty acid is a saturated fatty acid. \n✓If one of the carbon - carbon bonds is a double bond, then it is a monounsaturated fatty acid. \n✓If more than one carbon - carbon bond is a double bond, then the fatty acid is a polyunsaturated. \n", "c", 0, 1, this.f477b));
        arrayList.add(new questions("82.", "Which of the following mating produces children all having the same ABO blood phenotypes?", 0, 0, 0, 0, 0, "AO X AB ", "BB x 00", "AO x BO", "AA x BO", "Mating between BB and 00 produces offspring with only BO (B blood groups).", "b", 0, 1, this.f477b));
        arrayList.add(new questions("83.", "83. Which of the following is the largest ecological unit?", 0, 0, 0, 0, 0, "A community", "A biome", "A population", "An ecosystem", "Ecosystem is a wider concept consisting of the living components plus the non-living factors of the environment.", "d", 0, 1, this.f477b));
        arrayList.add(new questions("84.", "Among the following fossil hominid species, which one is the oldest of all?", 0, 0, 0, 0, 0, "Homo erectus", "Ardipithecus ramidus ", "Australopithecus afarensis", "Australopithecus africanus", "The oldest hominid fossil is Australopithecus (Australopithecus afarensis (Lucy) She had a structure - ape like above the waist and human like below waist. She was bipedalism and she lived in Africa - Ethiopia 3.2 MYA. ", "c", 0, 1, this.f477b));
        arrayList.add(new questions("85.", "During aerobic respiration, what is the route through which protons return from the mitochondrial inter-membrane space back to its matrix?", 0, 0, 0, 0, 0, "Proton pump", "ATP synthase", "Ion channel", "Membrane lipid", "ATP synthase is an enzymatic protein that traverses the inner membrane of mitochondria so that protons (H) are moved through back to matrix to generate ATP.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("86.", "From which of the processes of cellular respiration is the majority of the ATP generated?", 0, 0, 0, 0, 0, "Anaerobic fermentation", "Glycolysis & link reaction.", "Electron transport & chemiosmosis ", "Krebs cycle & glycolysis", "About 90% of the ATP generated during aerobic respiration is generated by electron transport & chemiosmosis.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("87.", "Choose the one that represents a chemical formula of an organic compound?", 0, 0, 0, 0, 0, "C₁2H₂2011", "Mg(OH)2", "NH3", "NaCl", "C12H22011is a formula for disaccharide molecules like sucrose & maltose which are groups of organic molecules called carbohydrates.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("88.", "In which of the following solutions does an animal cell undergo hemolysis?", 0, 0, 0, 0, 0, "In hypotonic solution.", "In hypertonic solution", "In isotonic solution.", "In both hypotonic & hypertonic solutions", "Animal cells in the hypertonic solution, the cells lose water and shrink. In the hypotonic solution, the cells gain water and swell. The pressure will eventually burst the weak plasma membrane. This is called hemolysis. In the isotonic solution, there is no change.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("89.", "On which of the following does the rate of algal photosynthesis in a lake depend?", 0, 0, 0, 0, 0, "The oxygen content of the water", "The nitrogen content of the water ", "The elevation where the lake is found", "The amount of light that penetrates the lake water ", "The rate of photosynthesis in the water body depends on the amount of light entering or passing through the water body.", "a", 0, 1, this.f477b));
        arrayList.add(new questions("90.", "What does the absence of chloroplasts in a unicellular organism indicate?", 0, 0, 0, 0, 0, "Reproduction by sexual means ", "Autotrophic nutrition", "Heterotrophic nutrition", "Complete lack of metabolic processes", "Chloroplast is an organelle used in a cell to manufacture food. If this critical organelle is lacking in a cell, it (the cell) is having heterotrophic nutrition.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("91.", "Which of the following did the early heterotrophs do that probably assisted the origin of autotrophs?", 0, 0, 0, 0, 0, "They added oxygen and chlorophyll to the environment", "They added carbon dioxide to the environment", "They stored energy in the bonds of inorganic compounds", "They manufactured food from carbon dioxide and oxygen", "Early heterotrophs probably added carbon dioxide to the atmosphere which causes the depletion of oxygen. This in turn causes the origin of autotrophs. ", "b", 0, 1, this.f477b));
        arrayList.add(new questions("92.", "If DNA contains 10% thymine, what is the percentage of cytosine in the DNA?", 0, 0, 0, 0, 0, "10%", "30%", "40%", "90%", "The percentage of Thymine and Adenosine is equal so that they account about 20% and the rest of the bases account for 80% of the total from which Cytosine contains 40%.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("93.", "Which of the following conclusions can be drawn from the structural similarities observed between the flippers of whales and the arms of humans?", 0, 0, 0, 0, 0, "The human species began life in the ocean ", "The human species and whales share a common ancestry", "Whales are older than the human species", "Whales have evolved from early humans that went back to the ocean ", "Homologous structures are structures that share a common developmental origin but may serve different functions in modern species. These structures are evidence that organisms with similar structure evolved from a common ancestor.\nExamples: the forelimbs of a variety of mammals such as human, cat, whale and bat.\n", "b", 0, 1, this.f477b));
        arrayList.add(new questions("94.", "Which of the following will happen if a plant cell is kept in a solution that is stronger than its protoplasm? ", 0, 0, 0, 0, 0, "The cell will become turgid ", "The central vacuole will expand", "The protoplasm will get plasmolyzed ", "The cell will swell and burst", "In the hypertonic solution, the cytoplasm of plant cells loses water and shrinks. The cell is said to be flaccid. If cytoplasm shrinks too much, it loses contact with the cell wall and we say cell has been plasmolyzed.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("95.", "Which of the following is produced when a lipid molecule is hydrolyzed?", 0, 0, 0, 0, 0, "Amino acids & water ", "Amino acids & glucose", "Fatty acids & glycerol", "Glucose & glycerol", "The commonest lipid called triglycerides is hydrolyzed in to fatty acids and glycerol.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("96.", "What is the ecological succession in which plant communities establish after an area has been completely demolished by fire?", 0, 0, 0, 0, 0, "Tree succession", "Secondary succession", "primary succession", "Bare rock succession", "Successions that occur on soils that have already been formed, but have suddenly lost their community are referred to as secondary successions.", "b", 0, 1, this.f477b));
        arrayList.add(new questions("97.", "What is the difference between HIV and AIDS?", 0, 0, 0, 0, 0, "AIDS is the virus and HIV is the disease", "Both AIDS and HIV refer to the disease", "AIDS is the disease and HIV is the virus", "Both AIDS and HIV refer to the virus", "The abbreviation HIV stands for the Human Immunodeficiency Virus, which is the name of the organism that causes this disease and the abbreviation AIDS stands for the Acquired Immune Deficiency Syndrome, which is the name of the set of symptoms that characterize this condition.", "c", 0, 1, this.f477b));
        arrayList.add(new questions("98.", "From which organism is the first antibiotic used in medicine produced?", 0, 0, 0, 0, 0, "Gram negative bacterial ", "Members of the fungi", "Genetically modified protozoa", "Higher plants", "The first antibiotic made were penicillin from the fungi called penicillium by Alexander Fleming. ", "b", 0, 1, this.f477b));
        arrayList.add(new questions("99.", "Biotechnology can be applied in environmental remediation. To which of the major application areas of biotechnology is this most related? ", 0, 0, 0, 0, 0, "Medicine and nutrition ", "Medicine and industry ", "Biodiversity and industry", "Agriculture and environment", "The use of organism to remove pollutants from water, air, and soil is called bioremediation. Bacteria are also effective in cleaning up harmful wastes through bioremediation. In this process\nbacteria and other microorganisms convert toxic or otherwise objectionable wastes, such as pesticides and oil spills, to harmless or even useful products.\n", "d", 0, 1, this.f477b));
        arrayList.add(new questions("100.", "Suppose in an experiment conducted to test a new drug, 20 people were given the drug and 20 people a placebo. What is the control of the experiment?", 0, 0, 0, 0, 0, "People who received the placebo ", "People who received the new drug", "The new drug itself", "The new drug and the placebo.", "A control group acts as a standard' for comparison. It is used to 'isolate the factor we are investigating and show that changes are due to this factor.", "a", 0, 1, this.f477b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (Button) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f478tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2006.this.timer.setVisibility(0);
                    bio2006.this.timer.setText(format);
                }

                public void onFinish() {
                    bio2006.this.scr.setVisibility(8);
                    bio2006.this.toolbar.setVisibility(8);
                    bio2006.this.Relative.setBackgroundColor(-7829368);
                    bio2006.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2006.this.getBaseContext());
                    int unused = bio2006.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2006.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2006.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2006.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2006.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2006.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2006.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2006.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2006.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2006.this.highscoreBio2006 = defaultSharedPreferences.getInt("bio2006hs", 0);
                    int access$500 = bio2006.this.part1 + bio2006.this.part2 + bio2006.this.part3 + bio2006.this.part4 + bio2006.this.part5 + bio2006.this.part6 + bio2006.this.part7 + bio2006.this.part8 + bio2006.this.part9;
                    bio2006.this.resultText.setText(String.valueOf(access$500));
                    bio2006.this.progressbar.setProgress(access$500);
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
                    if (access$500 > bio2006.this.highscoreBio2006) {
                        edit.putInt("bio2006hs", access$500);
                    }
                    edit.commit();
                }
            }.start();
        } else {
            this.chr.setVisibility(0);
            this.chr.start();
        }
        this.finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2006.this.scr.setVisibility(8);
                bio2006.this.chr.stop();
                bio2006.this.toolbar.setVisibility(8);
                bio2006.this.Relative.setBackgroundColor(-7829368);
                bio2006.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2006.this.getBaseContext());
                int unused = bio2006.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = bio2006.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = bio2006.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = bio2006.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = bio2006.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = bio2006.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = bio2006.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = bio2006.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = bio2006.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = bio2006.this.highscoreBio2006 = defaultSharedPreferences.getInt("bio2006hs", 0);
                int access$500 = bio2006.this.part1 + bio2006.this.part2 + bio2006.this.part3 + bio2006.this.part4 + bio2006.this.part5 + bio2006.this.part6 + bio2006.this.part7 + bio2006.this.part8 + bio2006.this.part9;
                TextView access$1500 = bio2006.this.resultText;
                access$1500.setText(access$500 + " /100");
                bio2006.this.progressbar.setProgress(access$500);
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
                if (access$500 > bio2006.this.highscoreBio2006) {
                    edit.putInt("bio2006hs", access$500);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2006.this.scr.setVisibility(8);
                bio2006.this.chr.stop();
                bio2006.this.toolbar.setVisibility(8);
                bio2006.this.Relative.setBackgroundColor(bio2006.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2006.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2006.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2006.this.scr.setVisibility(0);
                bio2006.this.toolbar.setVisibility(0);
                bio2006.this.telegram_layout.setVisibility(8);
                bio2006.this.chr.start();
                bio2006.this.Relative.setBackgroundColor(bio2006.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                bio2006.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
