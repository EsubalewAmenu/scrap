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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Bio2008 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f437b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2008;
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
    private TextView report;
    /* access modifiers changed from: private */
    public TextView resultText;
    /* access modifiers changed from: private */
    public ScrollView scr;

    /* renamed from: tb */
    private Toolbar f438tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2008);
        this.f437b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2008);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2008);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following food types would most likely give a negative result upon addition of iodine solution?", 0, 0, 0, 0, 0, "Bread", "Butter", "Biscuit", "Potato", "Bread, biscuit, and potato are carbohydrates. They give a positive result upon addition of iodine solution. Butter is fat. It would most likely give a negative result upon addition of iodine solution. ", "b", 0, 1, this.f437b));
        arrayList.add(new questions("2.", "Which process produces mRNA during protein synthesis?", 0, 0, 0, 0, 0, "Translation", "Replication", "Mutation ", "Transcription", "Transcription is the transfer of genetic code from DNA to molecules of messenger RNA, which subsequently directs protein manufacture.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("3.", "What is the molecule in plant cells that first captures the radiant energy from the sun light?", 0, 0, 0, 0, 0, "ATP", "DNA ", "Chlorophyll ", "Carbon dioxide", "Chlorophyll is the green plant pigment that captures the energy required for photosynthesis. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("4.", "Of the following functions, which one do triglycerides accomplish in cells?", 0, 0, 0, 0, 0, "Increase density of tissues and cells ", "Increase thermal insulation of cells", "Yield limited amount of ATP for cells", "Facilitate entry of excess water into cells", "Function light of triglyceride: respiratory substrate, thermal Insulation and protection, buoyancy, waterproofing, structural component of cell membrane, and electrical insulation by myelin sheath", "b", 0, 1, this.f437b));
        arrayList.add(new questions("5.", "Which of the following laboratory glassware is used for culturing bacteria? ", 0, 0, 0, 0, 0, "Petri dish", "Test tube.", "Filter Paper", "Measuring cylinder", "A Petri dish is a shallow dish used to culture bacteria in the laboratory", "a", 0, 1, this.f437b));
        arrayList.add(new questions("6.", "Of the following, which one is the main source from which plants get the nutrients necessary for their growth and development?", 0, 0, 0, 0, 0, "Light", "Chlorophyll", "Atmosphere", "Soil", "Soil is a mixture of mineral, water, air and different types of living things and dead matters. It contains the nutrients necessary for plants to survive.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("7.", "Which of the following is the correct sequence of the steps in scientific research?", 0, 0, 0, 0, 0, "Hypothesis → formulation → conclusion → experiment → question ", "Question → hypothesis formulation experiment → conclusion", "Hypothesis formulation question experiment → conclusion ", "Question → hypothesis → formulation → conclusion → experiment", "The scientific method: \nA. Ask question, \nB. Do background research, \nC. State hypothesis, \nD. Test with an experiment,\nE. Analyze results and draw conclusion,\nF. Report results\n", "b", 0, 1, this.f437b));
        arrayList.add(new questions("8.", "Which of the following types of cancer is known to mostly develop in AIDS patients?", 0, 0, 0, 0, 0, "Cervical cancer", "Stomach cancer", "Kaposi's sarcoma", "Breast cancer", "Kaposi's sarcoma is a sarcoma that starts with purplish spots on the skin and spreads to lymph nodes and internal organs. It is a common manifestation of AIDS.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("9.", "How many fatty acids would a cell need to form a molecule of triglyceride? ", 0, 0, 0, 0, 0, "Two", "Four", "Five", "Three", "Triglyceride is an ester formed from a molecule of glycerol and three molecules of fatty acids bound together in a single large molecule. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("10.", "Which part of the human elementary canal contains digestive enzymes that function at acidic pH?", 0, 0, 0, 0, 0, "Stomach", "Mouth", "Esophagus", "Small intestine", "In the stomach, the enzyme pepsin works best at pH values less than 2.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("11.", "Which of the following is the correct constitution of the sex chromosome of a normal woman?", 0, 0, 0, 0, 0, "XY", "XX", "XO", "XXY", "In each cell nucleus, a female has two X chromosomes; a male has one X and Y chromosome.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("12.", "From which of the following does the O₂ released during the process of photosynthesis originate?", 0, 0, 0, 0, 0, "Pyruvic acid ", "CO₂", "Sugar", "Water", "The photolysis of water produces 0₂ that is released to the atmosphere.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("13.", "What is the best term that expresses the movement of substances in cells against their concentration gradient?", 0, 0, 0, 0, 0, "Active transport ", "Passive transport", "Osmosis", "Water", "Active transport is movement of a substance across a cell membrane against the concentration gradient with the expenditure of energy. ", "a", 0, 1, this.f437b));
        arrayList.add(new questions("14.", "In cell division, what is the phase that comes following the metaphase called? ", 0, 0, 0, 0, 0, "Extra phase ", "Prophase", "Anaphase", "Telophase around when", "Stages of cell division: Interphase, prophase, metaphase, anaphase, and telophase. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("15.", "Who was the person that first observed living cells moving examined drops of water under the microscope?", 0, 0, 0, 0, 0, "Robert Brown ", "Robert Hook", "Anton van Leeuwenhoek", "Theodor Schwann", "Anton van Leeuwenhoek was the first biologist that observed living cells (Protoctista) in a drop of water. He called them 'animalcules'. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("16.", "Which of the following is true about gene mutation?", 0, 0, 0, 0, 0, "Altering the DNA sequence of a gene", "Change in the position of a block of genes ", "Addition of genes to a chromosome", "Loss of genes from a chromosome", "A gene mutation or point mutation is a mutation that affects a single base of DNA. It alters the DNA sequence of a gene.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("17.", "What is the circumstance that causes the health condition known as sickle cell anemia? ", 0, 0, 0, 0, 0, "DNA denaturation", "Hemoglobin mutation", "RNA mutation and decay", "Phosphate mutagenesis", "A defective gene that produces an abnormal form of hemoglobin causes sickle-cell anemia. When amino acid valine substitutes glutamic acid, the hemoglobin becomes abnormal.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("18.", "Based on similarity in number of amino acids found in hemoglobin, which one of the following animals has closer phylogenetic relations to human beings?", 0, 0, 0, 0, 0, "Chicken", "Horse", "Frog", "Gibbon", "Species that are closely related have very similar amino acid sequence. Human and apes, such as Gibbon belong to order primates. So, they are closely related compared to others, which belong to different order.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("19.", "In which of the following groups of living organisms do the cells lack organized nuclei?", 0, 0, 0, 0, 0, "Fungi", "Protozoa", "Bacteria", "Algae", "", "c", 0, 1, this.f437b));
        arrayList.add(new questions("20.", "Which one of the following terms refers to the failure of sister chromatids to separate from one another during anaphase?", 0, 0, 0, 0, 0, "Non-disjunction", "Replication", "Deletion", "Double inversion", "", "a", 0, 1, this.f437b));
        arrayList.add(new questions("21.", "If two species are known to belong to the same order, they must also belong to the same which taxonomic categories?", 0, 0, 0, 0, 0, "Class", "Family", "Species", "Genus", "", "a", 0, 1, this.f437b));
        arrayList.add(new questions("22.", "What happens in first reaction of the Krebs cycle during energy transformation?", 0, 0, 0, 0, 0, "A 2-C compound is produced. ", "A 6-C compound is produced.", "A 4-C compound is produced ", "A 5-C compound is produced.", "", "b", 0, 1, this.f437b));
        arrayList.add(new questions("23.", "What do you call structures that have the same evolutionary origin even though they may now have different structural make-ups or functions?", 0, 0, 0, 0, 0, "Endemic ", "Analogous ", "Homologous ", "Indigenous", "Homologous structures are structures that share a common origin and the same basic anatomy. However, they may serve different functions.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("24.", "For what purpose do biologists use the GPS receiver?", 0, 0, 0, 0, 0, "To produce area maps", "To measure tree height ", "To estimate tree ages ", "To count tree rings", "GPS (Global Positioning System) is a navigation system that uses information received from satellites to record position accurately.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("25.", "Which of the following organisms usually forms the pioneer community in the primary biological succession?", 0, 0, 0, 0, 0, "Annual herbs", "Lichens", "Trees", "Ferns", "In the primary biological succession, lichens are usually pioneer organisms on newly created sites, such as a field of cooled lava or volcanic debris.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("26.", "In an experiment designed to study the effect of temperature on the rate of seed germination, which of the following should the experiment vary?", 0, 0, 0, 0, 0, "Seed number", "Water quality ", "Temperature", "Seed size ", "Temperature is independent variable. Independent variable is at variable that a scientist changes or manipulates.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("27.", "In the carbon cycle, which of the following processes dioxide from the atmosphere?", 0, 0, 0, 0, 0, "Respiration", "Decomposition", "Combustion", "Photosynthesis ", "Photosynthesis is a process by which green plants and other organisms turn CO2 and H₂O into carbohydrates and oxygen. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("28.", "Which of the following sequences represents the correct change in number of chromosomes during fertilization?", 0, 0, 0, 0, 0, "n + n → 2n", "2n → 2n", "n → n", "2n → n + n", "Fertilization is union of male and female cells to form a fertilized reproductive cell zygote.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("29.", "\"Rats can be produced by keeping rags and grains at a corner of a room”. Which of the following thinking supports this statement?", 0, 0, 0, 0, 0, "Darwinian evolution", "Spontaneous generation", "Alternation of generation", "Sexual reproduction", "Spontaneous generation is a hypothesis that life comes from inanimate matter.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("30.", "What is the specific name of biological scientists who do research that tries to find evidence of life on other planets in the Solar System?", 0, 0, 0, 0, 0, "Neurobiologists", "Paleontologists", "Astrobiologists", "Biogeographers", "Astrobiology is a branch of biology concerned with the possibility of extraterrestrial life and with the problems of adapting the Earth's life forms to alien environments.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("31.", "Which of the following industries can reduce more CO₂ emission by shifting to the use of enzyme in the manufacturing process?", 0, 0, 0, 0, 0, "Bread-making", "Cheese making", "Leather making", "Manufacturing cosmetics", "", "b", C2719R.C2721drawable.annotation_2021_12_10_081544, 1, this.f437b));
        arrayList.add(new questions("32.", "Which of the following is made of globular proteins? ", 0, 0, 0, 0, 0, "Enzyme ", "Keratin", "Collagen", "Glycogen", "Enzyme is made of globular proteins having tertiary structure that resemble a globule or ball.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("33.", "Which of the following events happened before all the others?", 0, 0, 0, 0, 0, "The cell theory was proposed. ", "The protozoa were discovered.", "The compound microscope was invented. ", "The structure of DNA was discovered.", "", "c", C2719R.C2721drawable.annotation_2021_12_10_081648, 1, this.f437b));
        arrayList.add(new questions("34.", "Under what conditions do C4 plants have more photosynthetic efficiency than C4 plants?", 0, 0, 0, 0, 0, "Low water supply", "Low temperature", "Low light intensity", "Low CO₂ concentration", "C4 plants have high photosynthetic efficiency in condition of low CO₂ concentration, high light intensity, and high temperature. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("35.", "Which of the following is NOT a universal property of all living things?", 0, 0, 0, 0, 0, "Heritable characters", "Reproduction", "Photosynthesis", "Growth and development", "Photosynthesis is restricted to green plants, algae and some bacteria. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("36.", "In which area of enzyme application is invertase injected to sucrose paste in order to produce liquid chocolates?", 0, 0, 0, 0, 0, "Detergent making industry ", "Pulp and paper industry", "Pharmaceutical industry", "Food processing industry", "In food processing industry, invertase enzyme is useful to produce liquid center chocolate. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("37.", "Which of the following functions best at higher optimum pH than all the rest?", 0, 0, 0, 0, 0, "Pepsin", "Salivary amylase", "Trypsin", "Enzymes in the stomach", "Trypsin is an enzyme found in small intestine with pH values of 7.8 to 8.7. The rest of the enzymes have lower optimum pH value compared to trypsin. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("38.", "Which class of enzymes joins to molecules together by formation of new bonds?", 0, 0, 0, 0, 0, "Ligase", "Isomerase", "Lyase", "Hydrolase", "Ligases (synthases) catalyze the joining of two molecules by the formation of new bonds.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("39.", "Which of the following has a bigger size than all the others? ", 0, 0, 0, 0, 0, "A ribosome taken from animal cell", "A mitochondrion take from plant cell", "A nerve cell taken from a human brain ", "A glucose molecule taken from a plant cell", "The length of some nerve and muscle cells measures up to 10 to 100 cm. The size of glucose molecule, ribosome, and mitochondria is smaller than the nerve cell size.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("40.", "How does a simple microscope differ from a compound microscope", 0, 0, 0, 0, 0, "A simple microscope has no lens.", "A simple microscope has got two lenses. ", "A simple microscope uses mirror as lens.", "A simple microscope has only one lens. ", "A simple microscope has only one lens, while a compound microscope has two lenses. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("41.", "Which of the following molecules can serve as a raw material for industries. that produce glucose?", 0, 0, 0, 0, 0, "Nucleic acids ", "Proteins", "Lipids", "Starch", "Starch is polymer of a-glucose molecules that can easily be hydrolyzed back into glucose molecules.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("42.", "In enzymes that contain non-protein organic molecules, in addition to the protein component, what is the protein component called?", 0, 0, 0, 0, 0, "Apoenzyme", "Coenzyme ", "Holoenzyme", "Cofactor", "Apoenzyme is a protein that combines with a coenzyme to form an active enzyme. ", "a", 0, 1, this.f437b));
        arrayList.add(new questions("43.", "Which of the following should be done in order to remove an enzyme inhibition caused by a competitive inhibitor?", 0, 0, 0, 0, 0, "Remove affected enzyme molecules ", "Add more substrate to the enzyme", "Remove the end product of the reaction", "Add more inhibitor to the system", "Increasing substrate concentration effectively 'dilutes' the effect of competitive inhibitor.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("44.", "Which of the following parts of the plant cell is NOT a living component of the cell?", 0, 0, 0, 0, 0, "Cell membrane", "Cell wall", "Cytoplasm", "Nucleus ", "Cell wall is outer dead layer of polysaccharide enclosing the membrane of plant cell. It maintains the shape of the cell and provides a supportive framework.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("45.", "What are the possible consequences of deforestation of the tropic rain forest?", 0, 0, 0, 0, 0, "An increase in existing ecological niches", "Reduction in species diversity of an area ", "Increased removal of CO₂ from the atmosphere", "An increase in the amount of nitrogen in the soil ", "Deforestation results in habitat destruction and species extinction, erosion, and affection of arboreal animals. ", "b", 0, 1, this.f437b));
        arrayList.add(new questions("46.", "Which of the following processes releases CO₂ into the atmosphere? ", 0, 0, 0, 0, 0, "Respiration ", "Assimilation", "Feeding ", "Photosynthesis", "Respiration is the chemical and physical process in which oxygen is delivered to tissue or cells in an organism and CO₂ and H₂0 are given off.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("47.", "If an area is dominated by just one species having very many individuals, what would be its index of diversity? ", 0, 0, 0, 0, 0, "Fluctuating ", "High", "Low", "Unpredictable", "A low index of diversity suggests an area is dominated by one or a few species.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("48.", "Which of the following is true about sex determination in birds? ", 0, 0, 0, 0, 0, "They have heterozygotic X and Y chromosomes.", "Males have heterozygotic W and Z chromosomes.", "Females have the homozygotic W and Z chromosomes. ", "They have the heterozygotic W and Z chromosomes. ", "In birds, females are heterogametic with 76 autosomes, W and Z sex chromosomes, while males are homogametic with 76 autosomes, and ZZ sex chromosomes per cell.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("49.", "How many amino acids are there in all known proteins?", 0, 0, 0, 0, 0, "About 10", "About 35", "About 20", "About 46", "Twenty different amino acids used to make all different proteins.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("50.", "Which of the following is the major mechanism by which AIDS is transmitted?", 0, 0, 0, 0, 0, "Mother to fetal transmission ", "Heterosexual intercourse", "Homosexual intercourse", "Contaminated blood transfusion ", "The high-risk groups to HIV/AIDS are homosexual men intravenous drug users, and sex workers. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("51.", "What percentage of the F, progeny of a monohybrid cross is expected to have the recessive phenotype?", 0, 0, 0, 0, 0, "100%", "75%", "25%", "50%", "In monohybrid cross, 75% of progenies have dominant phenotypes, and 25% with recessive phenotypes. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("52.", "Which of the following is NOT true about innate behaviors?", 0, 0, 0, 0, 0, "Can be improved by trial and error ", "Common to all members of the species", "Present at birth or on hatching", "Do not have to be learned", "Innate behavior is behavior that presents (potentially) at birth or hatching. It does not need to be learned.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("53.", "To which one of the following classes of stimuli do pheromones belong?", 0, 0, 0, 0, 0, "Auditory ", "Smell", "Visual", "Touch", "Pheromone is a chemical compound, produced and secreted by an animal that influences the behavior of other members of the same species.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("54.", "Which of the following types of microscopes is most suitable for a detailed study of the surface structure of an object?", 0, 0, 0, 0, 0, "Field microscope", "Optical microscope", "Scanning electron microscope ", "Dissecting microscope", "Scanning electron microscopes produce images of surface sample by scanning it with a high beam of electrons, but not see 'into' cells.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("55.", "According to the fluid-mosaic model of the plasma membrane, what does the word 'mosaic' refer to?", 0, 0, 0, 0, 0, "The hydrophobic property of fatty acids ", "The bilayer nature of the membrane", "The arrangement of the proteins", "The movement of the phospholipids ", "Mosaic is a patchwork appearance of proteins and cholesterol molecules imbedded in the phospholipid bi layer.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("56.", "Which of the following diseases is correctly matched with its causative agent?", 0, 0, 0, 0, 0, "Malaria - fungus ", "AIDS - virus", "Ringworm - protozoa", "Syphilis-worm", "", "b", C2719R.C2721drawable.annotation_2021_12_10_081744, 1, this.f437b));
        arrayList.add(new questions("57.", "Which of the following organic compounds would release both nitrogen and Sulphur to the ecosystem when decomposed? ", 0, 0, 0, 0, 0, "Polysaccharides", "Sucrose", "Proteins", "Lipids", "Proteins are built from amino acids in which the amino acids are composed of the same fundamental structures: hydrogen atom, an amino group, a carboxyl group and the R-group. Some amino acid, such as cysteine and methionine consist of Sulphur atom. When decomposed, the protein would release both nitrogen and Sulphur to the atmosphere.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("58.", "Among the vertebrate found in Ethiopia, which class has the highest percentage of endemic species? ", 0, 0, 0, 0, 0, "Amphibians", "Reptiles", "Birds", "Mammals ", "", "a", C2719R.C2721drawable.annotation_2021_12_10_081826, 1, this.f437b));
        arrayList.add(new questions("59.", "Which of the following terms refers to the movement of individuals out of a population?", 0, 0, 0, 0, 0, "Mortality ", "Immigration ", "Emigration", "Natality", "Emigration is the permanent movement of individuals of the same species out of the local population.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("60.", "Which of the following crosses will produce progeny with phenotypic ratio of 3: 1?", 0, 0, 0, 0, 0, "Crossing the F, to the dominant parent ", "Crossing two homozygote individuals ", "Crossing the F₁ to the recessive parent", "Crossing two heterozygote individuals ", "The crossing of two F₁ (or heterozygote) monohybrid individuals will produce progeny with phenotypic ratio of 3:1.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("61.", "Which of the following changes that happened during human evolution had the most contribution to the evolutionary success of Homo sapience?", 0, 0, 0, 0, 0, "Proportionately big brain size to body mass", "Big body parts and big overall body mass", "Long legs, arms and more upright body posture", "Fast running ability and overall physical strength ", "In human evolution, bipedalism and big brain size proportionally to body mass had the most contribution to the evolutionary success of Homo sapience. ", "a", 0, 1, this.f437b));
        arrayList.add(new questions("62.", "Woodlice are observed avoiding light and heat by quickly moving to moist and darker areas. Which behavior of these animals helps them to detect differences in light intensity and move to the darker and moist part of the habitat?", 0, 0, 0, 0, 0, "Instinctive learning ", "Negative phototaxis", "Positive phototaxis", "Insight learning ", "", "", 0, 1, this.f437b));
        arrayList.add(new questions("63.", "In Ethiopia animal diversity, which group is presented by the highest number of orders, families, genera and species? ", 0, 0, 0, 0, 0, "Birds", "Amphibians ", "Fish", "Mammals", "", "a", C2719R.C2721drawable.annotation_2021_12_10_081905, 1, this.f437b));
        arrayList.add(new questions("64.", "Why mutations are important in evolution? ", 0, 0, 0, 0, 0, "They are related to the environment.", "They contribute to new variation in organisms. ", "They are always beneficial to the organism.", "They become causes for species migrations.", "A mutation is any spontaneous changes that affect genetic of an organism. It contributes new variation in organisms.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("65.", "Which of the following processes involved in the water cycle is carried out by green plants? ", 0, 0, 0, 0, 0, "Evaporation ", "Precipitation ", "Condensation ", "Transpiration", "Transpiration is the loss of water vapor from plant surface.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("66.", "Deficiency of which of the following nutrients in human diet is likely to result in deficiency of some co-enzyme like FAD? ", 0, 0, 0, 0, 0, "Essential amino acids", "Vitamins", "Carbohydrates", "Saturated fatty acids", "The coenzyme NAD and FAD consists of vitamin niacin and riboflavin in that order. They combine with apoenzyme to form active enzyme.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("67.", "If someone suddenly removes his/her hand from a very hot object, which of the following types of behavior is manifested? ", 0, 0, 0, 0, 0, "Reflex action", "Imprinting", " Learned behavior", "Sensitization", "A reflex action is an involuntary and automatic response to a stimulus.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("68.", "Which steps in the HIV life cycle is disrupted by antiretroviral drug that competitively inhibits the reverse transcriptase enzyme?", 0, 0, 0, 0, 0, "Entry into the host cell", "Assembly of viral parts into a virus ", "Formation of DNA from RNA", "Integration of viral DNA into host DNA ", "The antiretroviral drugs called nucleotide reverse transcriptase inhibitors inhibit the formation of DNA from RNA.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("69.", "During which of the following processes in cellular respiration are most of the ATPs formed?", 0, 0, 0, 0, 0, "Glycolysis", "Chemiosmosis", "Link reaction", "Krebs cycle", "Chemiosmosis (or oxidative phosphorylation) generates about 90% of ATPs from a glucose molecule.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("70.", "Which of the following pairs are ANALOGOUS structures? ", 0, 0, 0, 0, 0, "The human arm and the front leg of a mule", "The front leg of a frog and the wing of a bat", "The wing of a bird and the wing of a butterfly ", "The wing of a bat and the wing of a bird", "Analogous structures are structures having the same function but different anatomy and morphology.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("71.", "Which of the following involves trial and error learning?", 0, 0, 0, 0, 0, "Operant conditioning", "Habituation", "Sensitization", "Classical conditioning", "Operant conditioning is a type of learning through trial and error or through a reward or punishment.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("72.", "Which of the following is the adaptation by C4 plants that helps them to avoid photorespiration?", 0, 0, 0, 0, 0, "Harvesting of carbon dioxide at night", "Using separate cells for light and dark reactions.", "Storing carbon dioxide in the vacuole", "Keeping the stomata closed during the day ", "The light dependent reactions of C4 plants take place in mesophyll cells, while the Calvin cycle in the bundle sheath cells.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("73.", "If a codon on a messenger RNA is UUU, what is the complementary anticodon on the transfer RNA?", 0, 0, 0, 0, 0, "UUU", "GGG", "CCC", "AAA", "Base pairing rule: A = T (DNA) or U (RNA). Thus, the UUU mRNA codon is complement with AAA tRNA anticodon. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("74.", "If a clone is produced by transferring a nucleus of animal A to an enucleated egg of animal B and the egg is then implanted in the uterus of animal C, which animal would the clone resemble most?", 0, 0, 0, 0, 0, "Animal C ", "Animal B", "Animal A", "Other animal", "'A' is nuclear donor, 'B' egg cytoplasm provider, & 'C' surrogate mother. The clone resembles the genetic material provider (animal A).", "c", 0, 1, this.f437b));
        arrayList.add(new questions("75.", "Which of the following classes of fatty acids is without carbon-carbon double bond?", 0, 0, 0, 0, 0, "Monosaturated fatty acids", "Unsaturated fatty acids", "Saturated fatty acids", "Polyunsaturated fatty acids", "Saturated fatty acids are a fatty acid whose carbon chain lacks the double bond.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("76.", "Choose the one that had the LEAST contribution to human evolution? ", 0, 0, 0, 0, 0, "Development of bipedalism", "Adaptation to flight", "Attaining opposable thumb", "Increasing brain size", "Things contribute to human evolution: bipedalism, increasing brain size, longer appendages, opposable thumbs & straighten spine.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("77.", "In which biome are epiphytes typically present as a characteristic element?", 0, 0, 0, 0, 0, "Tropical montane forests ", "Cold desert woodlands", "The Tundra environment", "Boreal deciduous forests", "Epiphytes (plants grow on another) are commonly found in tropical montane forests, tropical rain forests, and temperate rain forests.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("78.", "If it is known that the total amount of DNA in a cell is 300 units and that adenine alone contributes 70 of these units, how many units go to cytosine?", 0, 0, 0, 0, 0, "40 units", "70 units", "80 units", "35 units", "According to base-pairing rule: A = T, and G =C₁ A = 70=T, A+T= 70+70 = 140\nC+G=300-140-160, C G = 160/2 = 80\n", "c", 0, 1, this.f437b));
        arrayList.add(new questions("79.", "What is the substance that helps to keep the biological membrane in a fluid state?", 0, 0, 0, 0, 0, "Waxes", "Water", "Cholesterol ", "Phospholipids", "The fluidity of membrane is mainly due to phospholipids that can move and change position in a lateral and flip-flop movement.", "d", 0, 1, this.f437b));
        arrayList.add(new questions("80.", "Which of the following substances is NOT formed when yeasts ferment glucose? ", 0, 0, 0, 0, 0, "Alcohol ", "ATP", "Lactic acid", "Carbon dioxide", "Alcoholic fermentation of yeast results in energy as main products, and alcohol and CO₂ as waste products.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("81.", "Which phosphate bond of the ATP is broken when the energy it contains is needed for cellular activity?", 0, 0, 0, 0, 0, "The first bond", "The C bonds", "The second bond", "The third bond", "When the third bond holding phosphate of ATP is split, energy is released, and Adenosine Diphosphate (ADP) is formed. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("82.", "What is the advantage that a photosystem containing molecules of different types of light sensitive pigments have?", 0, 0, 0, 0, 0, "To absorb light of different wavelengths ", "To increase the size of photosystem", "To increase the complexity of the photosystem", "To increase the surface area for the light absorption", "Photosystems are biochemical mechanism by which chlorophyll absorbs light of different wavelengths. Photosystem I proceeding best with longer wavelength, photosystem II with shorter wavelengths.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("83.", "How many years have passed since Darwin's book on the theory of evolution was published?", 0, 0, 0, 0, 0, "About 50 years", "About 160 years", "About 120 years", "About 100 years", "Darwin developed Darwinism theory in 1858, about 160 years back. ", "b", 0, 1, this.f437b));
        arrayList.add(new questions("84.", "Which of the following can be understood about living things from the study of how breeders improve domesticated plants and animals?", 0, 0, 0, 0, 0, "Living things tend to over-reproduce ", "Natural resources are of limited supply", "Living things can be improved through selection", "Individuals compete for resources", "Breeding is the development of new types of organisms with improved characteristics through selection. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("85.", "Which of the following is responsible for the bending of a young plant towards a unidirectional source of light?", 0, 0, 0, 0, 0, "Reduced photosynthesis on dark side", "Faster growth rate on the dark side ", "Reduced auxin concentration on dark side", "Increased rate of cell division on the light side", "The dark side of a shoot contains more growth hormone. Hence, it will grow faster than the illuminated side. As a result, the shoot bends towards a unidirectional source of light.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("86.", "In what way would AIDS patients benefit from the treatment with anti-retroviral drugs?", 0, 0, 0, 0, 0, "Reduction of HIV replication", "Provision of cure for AIDS", "Immunizing against HIV", "Killing of opportunistic infections agents", "Antiretroviral drugs reduce rate of HIV replication in the patient. ", "a", 0, 1, this.f437b));
        arrayList.add(new questions("87.", "If a country has a large number of young people relative to the number of old people, to which category of countries does it belong?", 0, 0, 0, 0, 0, "Industrial", "Hunter-gatherer", "Post-industrial", "Developing ", "Pyramid of developing countries is broader at the base (a large number of young people) and narrower at the tip (a small number old people).", "d", 0, 1, this.f437b));
        arrayList.add(new questions("88.", "Which of the following is the best collective name for all bacteria with spherical shape? ", 0, 0, 0, 0, 0, "Spirochaetes", "Bacilli", "Cocci", "Streptococci", "Cocci are any spherical or nearly spherical bacteria.", "c", 0, 1, this.f437b));
        arrayList.add(new questions("89.", "Suppose two heterozygous round yellow (RrYy x RrYy) pea plants were crossed and 128 seeds were produced, how many of the seeds are expected to be heterozygous round yellow?", 0, 0, 0, 0, 0, "64 seeds", "32 seeds", "96 seeds", "128 seeds", "", "b", 0, 1, this.f437b));
        arrayList.add(new questions("90.", "Which of the following way is an important way by which green plants mitigate the greenhouse effect?", 0, 0, 0, 0, 0, "Use of fire wood to replace coal", "Removing CO₂ from the atmosphere ", "Releasing water to the atmosphere", "Releasing oxygen to the atmosphere ", "", "", 0, 1, this.f437b));
        arrayList.add(new questions("91.", "What causes tomato fruits to ripen much more slowly when kept in a refrigerator than if left on a table at room temperature?", 0, 0, 0, 0, 0, "Low temperature slows the normal action of ripening enzymes", "Enzymes produced by bacteria normally inhibit ripening.", "Humidity accelerates enzyme activity and ripening process.", "Normal temperature arrests the action of ripening enzymes.", "", "", 0, 1, this.f437b));
        arrayList.add(new questions("92.", "Which characteristic of RNA makes it suitable for moving out of the nucleus?", 0, 0, 0, 0, 0, "Inability to replicate ", "Absence of thymine", "Its unstable nature", "Smallness of its size", "Unlike DNA, RNA is single-stranded very small molecule that can easily be transported out of the nucleus to the cytoplasm. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("93.", "Why does sucrose give a negative result when mixed and heated with Benedict's solution?", 0, 0, 0, 0, 0, "Because it is not a sugar molecule.", "Because it is a reducing sugar.", "Because it is a non-reducing sugar. ", "Because it is not a monosaccharide.", "Sucrose is the most common non-reducing sugar. A non-reducing sugar is a sugar that cannot donate electrons to other molecules and thus, gives negative result with Benedict's solution. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("94.", "What does an evolutionary selective pressure that acts around the mean do?", 0, 0, 0, 0, 0, "It stabilizes.", "It terminates.", "It converges.", "It disrupts.", "Stabilizing selection works around mean values and acts against both extremes.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("95.", "Which of the following is consistent with science? ", 0, 0, 0, 0, 0, "Proof by investigation of the causes of a phenomenon", "Proof by reference to a respected leader ", "Proof by reference to an unknown object", "Proof based on lessons from a personal believe", "Science is the investigation of physical and natural phenomena using observations and experimentations.", "a", 0, 1, this.f437b));
        arrayList.add(new questions("96.", "In his theory of evolution, the cause of which of the following MISSING in Darwin's explanation? ", 0, 0, 0, 0, 0, "Over-reproduction", "Struggle for survival", "Hereditary variation", "Survival of the fittest", "When developing his theory, Darwin had no idea of genetics. ", "c", 0, 1, this.f437b));
        arrayList.add(new questions("97.", "Which of the following is a learned behavior? ", 0, 0, 0, 0, 0, "Sucking of the newborn at mother's breasts", "Salivation by conditioned dogs at the sound of a bell", "Withdrawal of hands suddenly from hot objects ", "Blinking the eyes when something gets into them", "Learned behavior is a behavior that acquire through experiences. Salvation by conditioned dogs at the sound of a bell is an example of such behavior.", "b", 0, 1, this.f437b));
        arrayList.add(new questions("98.", "Which of the following diseases is transmitted by mosquitoes?", 0, 0, 0, 0, 0, "Diabetes mellitus", "Rabies", "Kaposi's cancer", "Malaria", "Malaria is an infectious disease caused by a parasite that is transmitted by the bite of infected mosquitoes. ", "d", 0, 1, this.f437b));
        arrayList.add(new questions("99.", "In which of the following are all the tools mainly used in the laboratory rather than in the field situation?", 0, 0, 0, 0, 0, "Centrifuge, microscopes, measuring cylinder, Petri dishes", "Flow meters, centrifuge, theodolites, microscopes ", "Centrifuges, plant presses, flow meters, microscopes", "Theodolites, Petri dishes, GPS receivers, measuring cylinders", "Biologists can use laboratory apparatus, such as centrifuge, microscope, measuring cylinder, and Petri dishes, or field apparatus such as, theodolites, flow meter, and GPS to carry out biological studies. ", "a", 0, 1, this.f437b));
        arrayList.add(new questions("100.", "Which aspect of biotechnology is considered strictly genetic engineering?", 0, 0, 0, 0, 0, "Providing gene therapy", "Production of new types of plants", "Monoculture antibodies", "Mapping of the human genome", "Genetic engineering is the alteration of genetic material of an organism by technological means and results in transgenic organism, such as new types of plants.", "b", 0, 1, this.f437b));
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
        this.f438tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    Bio2008.this.timer.setVisibility(0);
                    Bio2008.this.timer.setText(format);
                }

                public void onFinish() {
                    Bio2008.this.scr.setVisibility(8);
                    Bio2008.this.chr.stop();
                    Bio2008.this.toolbar.setVisibility(8);
                    Bio2008.this.Relative.setBackgroundColor(-7829368);
                    Bio2008.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Bio2008.this.getBaseContext());
                    int unused = Bio2008.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = Bio2008.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = Bio2008.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = Bio2008.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = Bio2008.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = Bio2008.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = Bio2008.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = Bio2008.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = Bio2008.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = Bio2008.this.highscoreBio2008 = defaultSharedPreferences.getInt("bio2008hs", 0);
                    int access$600 = Bio2008.this.part1 + Bio2008.this.part2 + Bio2008.this.part3 + Bio2008.this.part4 + Bio2008.this.part5 + Bio2008.this.part6 + Bio2008.this.part7 + Bio2008.this.part8 + Bio2008.this.part9;
                    Bio2008.this.resultText.setText(String.valueOf(access$600));
                    Bio2008.this.progressbar.setProgress(access$600);
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
                    if (access$600 > Bio2008.this.highscoreBio2008) {
                        edit.putInt("bio2008hs", access$600);
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
                Bio2008.this.scr.setVisibility(8);
                Bio2008.this.chr.stop();
                Bio2008.this.toolbar.setVisibility(8);
                Bio2008.this.Relative.setBackgroundColor(-7829368);
                Bio2008.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Bio2008.this.getBaseContext());
                int unused = Bio2008.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = Bio2008.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = Bio2008.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = Bio2008.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = Bio2008.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = Bio2008.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = Bio2008.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = Bio2008.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = Bio2008.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = Bio2008.this.highscoreBio2008 = defaultSharedPreferences.getInt("bio2008hs", 0);
                int access$600 = Bio2008.this.part1 + Bio2008.this.part2 + Bio2008.this.part3 + Bio2008.this.part4 + Bio2008.this.part5 + Bio2008.this.part6 + Bio2008.this.part7 + Bio2008.this.part8 + Bio2008.this.part9;
                Bio2008.this.resultText.setText(String.valueOf(access$600));
                Bio2008.this.progressbar.setProgress(access$600);
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
                if (access$600 > Bio2008.this.highscoreBio2008) {
                    edit.putInt("bio2008hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bio2008.this.scr.setVisibility(8);
                Bio2008.this.chr.stop();
                Bio2008.this.toolbar.setVisibility(8);
                Bio2008.this.Relative.setBackgroundColor(Bio2008.this.getResources().getColor(C2719R.C2720color.transparent_black));
                Bio2008.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bio2008.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Bio2008.this.scr.setVisibility(0);
                Bio2008.this.toolbar.setVisibility(0);
                Bio2008.this.telegram_layout.setVisibility(8);
                Bio2008.this.chr.start();
                Bio2008.this.Relative.setBackgroundColor(Bio2008.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            startActivity(new Intent(this, Naturalscience.class));
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Bio2008.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
