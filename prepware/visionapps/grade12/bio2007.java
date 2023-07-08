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

public class bio2007 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f479b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2007;
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
    private Toolbar f480tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2007);
        this.f479b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2007);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2007);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following units of measurement is more convenient to express the size of cellular organelles? ", 0, 0, 0, 0, 0, "Meter ", "Centimeter", "Millimeter", "Micrometre", "Micrometers (um) = 1/1000 of mm and 1/1,000,000 meters. ", "d", 0, 1, this.f479b));
        arrayList.add(new questions("2.", "Which of the following step of the scientific method comes before all the rest?", 0, 0, 0, 0, 0, "Hypothesis", "Experiment", "Conclusion", "Reporting the result", "A hypothesis is a tentative or potential suggested explanation of certain observed phenomena based on observations and gathered information.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("3.", "What do we call a scientist who specializes in studying insects?", 0, 0, 0, 0, 0, "An ecologist", "A paleontologist", "An entomologist", "A microbiologist", "Entomology is the science that studies about insects. ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("4.", "To which one of the following organic molecules do enzymes belong?", 0, 0, 0, 0, 0, "Carbohydrates ", "Amino acids", "Proteins ", "Lipids", "Enzymes are globular protein molecules produced by cells.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("5.", "Which of the following is a coenzyme ", 0, 0, 0, 0, 0, "NAD", "Carbohydrate", "Water molecule", "Protein", "", "", 0, 1, this.f479b));
        arrayList.add(new questions("6.", "Which of the following behavioral biologists is known for his study about imprinting behavior in animals?", 0, 0, 0, 0, 0, "W. Kohler", "B.F Skinner", "Ivan Pavlov", "Konrad Lorenz", "Coenzymes are non-protein heat stable and a dialyzable compounds usually derived from the vitamin and usually have a nucleotide structure.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("7.", "Which tool of the biologist is more frequently used to study cell structure in the laboratory? ", 0, 0, 0, 0, 0, "Dissecting kit", "Centrifuge", "Petri-dish", "Microscope", "In a famous experiment Konrad Lorenz split a batch of goose eggs in two batches. One batch was hatched normally by the geese. The other batch was hatched by Lorenz in an incubator. He was the first moving thing they saw.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("8.", "What color do gram-positive bacteria stain with Gram's stain?", 0, 0, 0, 0, 0, "Red", "Pink", "Purple", "White", "Petri-dish is made of glass it uses to culture and growth of micro-organism ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("9.", "Which group of organisms in the ecosystem release nutrients locked up in dead bodies of organisms?", 0, 0, 0, 0, 0, "Parasites", "Decomposers ", "Autotrophs", "Carnivores", "Gram positive bacteria are stained purple by gram's stain", "c", 0, 1, this.f479b));
        arrayList.add(new questions("10.", "Which of the following are the two major constituents of eukaryotic chromosomes?", 0, 0, 0, 0, 0, "DNA and RNA", "DNA and protein", "DNA and carbohydrate", "RNA and lipid", "Decomposers which are releases mineral ions contained in organic molecules in the dead matter. By a method known a Saprobiotic nutrition.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("11.", "Which one of the following crops has its center of origin and diversity in Ethiopia has become a leading international commodity of commerce? ", 0, 0, 0, 0, 0, "Teff", "Enset", "Coffee", "Anchote", "Eukaryotic chromosomes are made from DNA and histones (asset of globular proteins) ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("12.", "Which group of animals has the highest numbers of total and endemic species in Ethiopia? ", 0, 0, 0, 0, 0, "Amphibians", "Birds", "Mammals", "Reptiles", "There are 11 cultivated crops, have their center of genetic diversity in Ethiopia from these the one is coffee Arabica (coffee).", "c", 0, 1, this.f479b));
        arrayList.add(new questions("13.", "What is the molecule that supplies the quickest and suitable source of energy to cells? ", 0, 0, 0, 0, 0, "Lactose", "Sucrose", "ATP", "Lipid", "Amphibians = 17 endemic to Ethiopia \nBirds 27 endemic to Ethiopia\nMammals = 22 endemic to Ethiopia\nReptiles = 3 endemic to Ethiopia\n", "b", 0, 1, this.f479b));
        arrayList.add(new questions("14.", "A carbohydrate compound is known to have 12 carbon atoms in the whole molecule. What could this compound be? ", 0, 0, 0, 0, 0, "A Polypeptide", "A disaccharide", "A monosaccharide", "A polysaccharide", "ATP releases energy in a single - step hydrolysis reaction, so the energy can be released quickly.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("15.", "Among the following organisms, which one belongs to the prokaryotes?", 0, 0, 0, 0, 0, "Paramecium ", "Streptococcus", "Spirogyra ", "Tapeworm", "Disaccharide carbohydrate molecules are made by two monosaccharide molecules joining together. For example, C12H22011", "b", 0, 1, this.f479b));
        arrayList.add(new questions("16.", "Which of the following is consistent with the understanding of human evolution?", 0, 0, 0, 0, 0, "Bipedalism was never important in human evolution. ", "Larger brain size had no contribution to the evolution of the human species.", "Human ancestry had no relation whatsoever with that of chimpanzees ", "Fossils of Lucy and Ardi provided evidence for human origin.", "Streptococcus are a bacteria by lacking distinct nucleus and cytoplasmic organelles", "b", 0, 1, this.f479b));
        arrayList.add(new questions("17.", "Baby ostriches tend to follow the first moving object that they see as they hatch out of the eggs. What kind of animal behavior does this demonstrate? ", 0, 0, 0, 0, 0, "Positive taxis", "Innate behavior", "Positive kinesis", "Learned behavior", "Ardi is the nearest fossil to the \"common ancestor\" of human and chimpanzees that has so far been found. This find finally proves that the common ancestor of humans an chimpanzees could not have resembled a chimpanzee.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("18.", "Which of the following is true about mutations that occur in normal body cells?", 0, 0, 0, 0, 0, "They never lead to cancerous cells. ", "They never pass to the next generation.", "They never damage the affected cells.", "There is no way that they kill the affected cells.", "Many species of birds -swans, chickens etc. will follow the first moving object they see after hatching & will continue to show this following response as they mature. The phenomenon is known as imprinting", "d", 0, 1, this.f479b));
        arrayList.add(new questions("19.", "What is the process called when two bacteria directly contact cell to cell and exchange their genetic information? ", 0, 0, 0, 0, 0, "Conjugation", "Transformation", "Co-transformation", "Transduction ", "Mutations that occur in normal body cells they never pass to the next generation. But it occurs on the sex cells it passes from generation to generation.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("20.", "Why is it that mutations are considered as one of the raw materials of evolution?", 0, 0, 0, 0, 0, "They contribute to new variations in organisms. ", "They are usually related to the environment in which they appear.", "They are mostly beneficial to the organism in which they appear. ", "They usually become the causes for species extinction. ", "Conjugation is the plasmid passes through a special 'conjugation' tube from one bacterium to another. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("21.", "Which of the following is formulated as a possible outcome of an experiment?", 0, 0, 0, 0, 0, "Hypothesis", "Prediction", "Data analysis", "Recording the data ", "Mutations produce harmful effects but mutations are the raw material of evolution. It is the only process that creates new genes.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("22.", "If certain food stuff gave a positive result with Benedict's test only after it was hydrolyzed with hydrochloric acid, which of the following substances could it be?", 0, 0, 0, 0, 0, "Non-reducing sugar", "Nucleic acid", "Lipid", "Protein", "Interpreting data, drawn conclusion, formulating a theory, principal law ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("23.", "In scientific method, what is the importance of a background research for a given problem?", 0, 0, 0, 0, 0, "To formulate a hypothesis ", "To make a prediction", "To prepare report of the result", "To make a conclusion ", "Sucrose does not reduce cu² to cu, However, it is hydrolyzed to produce glucose and fructose, than the hydrolyzed solutions gives a positive benedict and test.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("24.", "Which of the following is NOT true about mitochondria and chloroplasts? ", 0, 0, 0, 0, 0, "Both contain chlorophyll", "Both contain nucleic acid", "Both have double membrane", "Both transduce energy", "The importance of a back ground research for a given problem it supports wither any scientist done on this experiment and use to formulate a hypotheses ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("25.", "Which of the following molecules is NOT a polymer?", 0, 0, 0, 0, 0, "Protein ", "Lipid", "RNA", "Starch", "Mitochondria have double membrane and transduce energy but does not contain chlorophyll", "a", 0, 1, this.f479b));
        arrayList.add(new questions("26.", "What does it mean when biologists express the cell membrane as a unit membrane?", 0, 0, 0, 0, 0, "A cell is covered by a single membrane. ", "A membrane is only one lipid layer thick.", "All cells have essentially similar membrane.", "A membrane is covered by a single layer of protein. ", "RNA is smaller, single stranded, contain ribose and uracil", "c", 0, 1, this.f479b));
        arrayList.add(new questions("27.", "Which of the following classes of molecules CANNOT pass easily across the cell membrane by simple diffusion? ", 0, 0, 0, 0, 0, "Small non-polar molecules", "Lipid soluble molecules", "Non-polar molecules", "Polar molecules", "J.D Robertson proposes the unit membrane model, he suggests that all membranes are essentially the same ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("28.", "Which of the following substances has a shape which is similar to that of the substrate of an enzyme?", 0, 0, 0, 0, 0, "The reaction product", "A competitive inhibitor", "A cofactor ", "An allosteric inhibitor ", "Types of particles moved through the cell membrane by simple diffusion is lipid soluble, small non polar molecules. ", "d", 0, 1, this.f479b));
        arrayList.add(new questions("29.", "At which level structural organization do proteins have the alpha helix shape?", 0, 0, 0, 0, 0, "Primary structure", "Secondary structure", "Tertiary structure", "Quaternary structure", "Both the enzyme inhibitor and the substrate are identical in structure thus, they compete together for the enzymes ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("30.", "Among the following scientists who contributed to the cell theory, identify the one who stated that a cell can arise only from another cell like it.", 0, 0, 0, 0, 0, "Robert Hooke", "Theodor Schwann", "Matthias Schleiden", "Rudolf Virchow ", "The secondary structure represents individual polypeptides forming repeating patterns such as the alpha helix as seen in DNA ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("31.", "Which of the following modes of transport is used by cells to move substances against their concentration gradients?", 0, 0, 0, 0, 0, "Osmosis", "Simple diffusion", "Facilitated diffusion", "Active transport", "Rudolf Virchow declare that: 'Omnis cellular’ which means that a cell can only arise from another cell like it.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("32.", "Which of the following features makes human T-lymphocyte cells more vulnerable to HIV attack? Presence of: ", 0, 0, 0, 0, 0, "Cell membrane.", "DNA on the chromosomes.", "CD4 on the membrane surface. ", "Pores in the cell membrane.", "Sometimes, substances must be moved against a concentration gradient from a low concentration to a higher concentration by the active transport.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("33.", "Which one of the following terms refers to how fast an enzyme acts on its substrate?", 0, 0, 0, 0, 0, "Turn over number", "Substrate number", "Enzyme number", "Product number", "HIV targets cells that form part of the immune system. Its main target is a type of cell called a CD4 T – lymphocyte.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("34.", "Which of the following factors determines the rate out of cell homogenate if spun in a centrifuge?", 0, 0, 0, 0, 0, "Mass of the organelle ", "Function of the organelle in the cell. ", "Location of the organelle in the cell.", "Thickness of the membrane covering the organelle.", "The number of molecules of reactants that form enzyme. Substrate complexes with each molecule of an enzyme, per second called turnover rate.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("35.", "Which of the following classes of organic molecules is the least important source of energy for cellular respiration?", 0, 0, 0, 0, 0, "Nucleic acids ", "Lipids", "Carbohydrates", "Proteins", "When a mixture of organelles is spun in a centrifuge, the various types settle out at different speeds of spinning based on the masses of the organelles vary and depend on their size.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("36.", "Which one of the following processes has a decreasing effect on the concentration of atmospheric carbon dioxide? ", 0, 0, 0, 0, 0, "Cellular respiration", "Combustion of fossil fuels", "Decomposition of dead organisms", "Photosynthesis.", "Nucleic acids are two kind DNA and RNA \n✓ DNA use for carrying hereditary information\n✓ RNA use for protein synthesis\n", "a", 0, 1, this.f479b));
        arrayList.add(new questions("37.", "Which of the following is NOT true about instinctive behavior?", 0, 0, 0, 0, 0, "It can be developed further through learning ", "It is triggered by a key stimulus.", "It has a fixed action pattern.", "It is adaptive for the species. ", "During the day time plants take of CO₂ and has a decreasing effect on the concentration of atmospheric CO₂", "d", 0, 1, this.f479b));
        arrayList.add(new questions("38.", "In which of the following ways do retroviruses differ from other RNA viruses?", 0, 0, 0, 0, 0, "Their genetic material is DNA.", "Their genetic material is RNA. ", "They copy RNA to DNA molecule.", "They copy RNA from DNA molecule. ", "Instinctive behaviors have the pattern to be complex, involving nervous & muscular controls & it does not happen randomly. Answer: A 39. Retrovirus when they insect cells, they release in to the cells their RNA and an enzyme that causes it to be 'reverse-transcribed' in to DNA.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("39.", "Which of the following groups of micro- organisms does not contain parasitic members? ", 0, 0, 0, 0, 0, "Bacteria", "Algae", "Fungi", "Protozoa of tropical", "", "", 0, 1, this.f479b));
        arrayList.add(new questions("40.", "Which of the following is NOT the correct characteristic rainforests? ", 0, 0, 0, 0, 0, "Low biodiversity", "High temperature", "Heavy precipitation", "Trees of different heights", "Algae are non-cellular cell wall. Unicellular algae are part of the plankton use as a source of food zooplankton.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("41.", "From evolutionary point of view, which of the following animals is expected to have hemoglobin proteins that are least similar to that of human?", 0, 0, 0, 0, 0, "Ape", "Cow", "Chicken", "Frog", "Tropical rain forest is one of the most complex and species - rich ecosystem in the world which contains 25% of the known species. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("42.", "For what purpose do molecular biologists use the technology known as polymerase chain reaction or PCR?", 0, 0, 0, 0, 0, "To insert DNA into plasmids.", "To insert plasmid into bacteria.", "To multiply copies of DNA molecule. ", "To produce DNA from RNA.", "Frog is 67 number of amino acid differences the hemoglobin and a human one.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("43.", "What is the long-term primary effect of the current tree planting activities. that Ethiopia is undertaking? ", 0, 0, 0, 0, 0, "It will protect from harmful solar rays.", "It will increase the global temperature.", "It will reduce the atmospheric CO₂.", "It will mend the holes in the ozone layer. ", "During the in vitro cloning the DNA is copied many times over using the polymerase chain reaction (PCR).", "c", 0, 1, this.f479b));
        arrayList.add(new questions("44.", "Suppose when you first enter a room you notice an unpleasant smell which you eventually forget about its presence, what is this behavior called? ", 0, 0, 0, 0, 0, "Latent learning", "Insight learning", "Habituation", "Operant conditioning", "The long-term primary effect of the current tree planting activities to reduce the atmospheric CO₂ that causes the global warming. ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("45.", "Which of the following is an evolutionary requirement for two sub populations of a species to evolve in to independent species? ", 0, 0, 0, 0, 0, "Free exchange of genes", "Geographic isolation", "Free migration between populations", "Absence of natural selection ", "The behavior is called Habituation", "c", 0, 1, this.f479b));
        arrayList.add(new questions("46.", "What does a restriction enzyme do?", 0, 0, 0, 0, 0, "Restricts transcription", "Cuts DNA at specific sites ", "Prevents DNA from replicating", "Hydrolyses the DNA molecule ", "Geographic isolation are cause for the species become isolated by some physical feature such as a river changing course, a mountain range being created and a land mass separating two bodies of water. ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("47.", "Which element is found in nucleic acids?", 0, 0, 0, 0, 0, "Calcium", "Iron", "Magnesium ", "Phosphorus", "In genetic engineering, a section of DNA is removed from a DNA molecule using by restriction enzymes. ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("48.", "From where do plants get most of their nutrients?", 0, 0, 0, 0, 0, "Chlorophyll", "Soil", "Light", "Atmosphere", "Nucleoside + Phosphate group = Nucleotide, Nucleotide is the basic units of nucleic acids", "d", 0, 1, this.f479b));
        arrayList.add(new questions("49.", "What do you call a group of genetically identical plants produced by vegetative reproduction?", 0, 0, 0, 0, 0, "Family", "Clone", "Hybrid", "Genus ", "Soil is an important natural resource in many ways to land organisms. Soil is the substrate upon which upon which any animals move, on which plants grow and in which many organisms live. ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("50.", "What is the base found in RNA in place of thymine of DNA?", 0, 0, 0, 0, 0, "Cytosine", "Guanine", "Thymine", "Uracil", "Cloning plants is the technique of micro propagation made it possible to produce a clone of thousands of identical plants from just one parent plant.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("51.", "The most complex structure of proteins is called", 0, 0, 0, 0, 0, "Primary structure ", "Secondary structure", "Tertiary structure", "Quaternary structure", "RNA contain Adenine, Cytosine, Guanine and Uracil DNA Contain Adenine, Cytosine, Thymine and Guanine ", "d", 0, 1, this.f479b));
        arrayList.add(new questions("52.", "Which one of the following is the smallest of all?", 0, 0, 0, 0, 0, "A red blood cell ", "A virus", "A bacterium", "An Amoeba", "The quaternary structure of proteins exists when polypeptide chains are combined to form a more complex unit.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("53.", "What is the ultimate source of all scientific knowledge?", 0, 0, 0, 0, 0, "Observation", "Guessing", "Trial and error", "observation and experimentation", "Viruses are about 50 times smaller than bacteria and rang in size from 20 to 300 nanometer", "b", 0, 1, this.f479b));
        arrayList.add(new questions("54.", "The optimum temperature of enzymes found in thermophilic bacteria is:", 0, 0, 0, 0, 0, "Lower than for enzymes in the human body.", "Higher than enzymes in the human body. ", "The same as enzymes found in human body.", "Lower than enzymes found in warm blooded animals. ", "Observation is the process by which perceptions of objects or events are selected, interpreted and their significance judged.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("55.", "A cow was found to yield much higher than any of the breeds of the parental cattle. What could be the most probable reason for this? ", 0, 0, 0, 0, 0, "Dominant genes", "Hybrid vigour", "Recessive genes", "Co- dominance genes", "The optimum temperature of enzymes in thermophilic bacteria is the same as enzyme found in human body.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("56.", "In the formation of a macromolecule, what type of reaction would join two subunits together?", 0, 0, 0, 0, 0, "Hydrolysis reaction ", "Dehydration reaction", "Denaturation reaction", "Hydrophobic reaction", "Cross-breeding results in hybrid vigor (heterosis) and can be used to combine desirable traits in one variety to yield much higher milk.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("57.", "Which are the four most abundant elements in living cells?", 0, 0, 0, 0, 0, "Carbon, oxygen, Sulphur, phosphorus. ", "Carbon, oxygen, hydrogen, nitrogen.", "Carbon, oxygen, nitrogen, Sulphur. ", "Carbon, oxygen, Sulphur, magnesium.", "Condensation is the process in which two molecules combine to form a larger molecule, producing a smaller molecule as a by-product.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("58.", "When the F1 hybrid of a monohybrid cross is back crossed with the homozygous recessive parent, what percentage of the offspring would be homozygous recessive?", 0, 0, 0, 0, 0, "0%", "25%", "50%", "75%", "Carbon, Oxygen, hydrogen, Nitrogen are the four most abundant element in living cells.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("59.", "Which of the following is an inorganic molecule?", 0, 0, 0, 0, 0, "CaCO3", "CH4", "C₂H22011", "C18H3602", "", "c", C2719R.C2721drawable.annotation_2021_12_10_075334, 1, this.f479b));
        arrayList.add(new questions("60.", "Which of the following expression is more related to the phrase \"survival of the fittest\"?", 0, 0, 0, 0, 0, "Natural selection", "Mendelian inheritance", "Gene mutation", "Inheritance of acquired characteristics", "Different Inorganic molecules doesn't contain different combinations of carbon and hydrogen. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("61.", "To which group of organic compounds do the triglycerides and waxes belong?", 0, 0, 0, 0, 0, "Carbohydrates", "Proteins", "Lipids", "Vitamins", "Darwin's theory of natural selection that those members of a species which are best adapted to their environment will survive and reproduce in greater numbers than others less well developed. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("62.", "What did Francesco Redi prove through his scientific experiment? ", 0, 0, 0, 0, 0, "Maggots appear spontaneously on foods placed anywhere.", "Maggots do not appear in foods kept in jars that are protected with a cover.", "Maggots do not appear in foods kept in open jars.", "Flies appear spontaneously on rotting meat kept in closed or open alike.", "The important lipid groups found in the body are fats (triply cerides) Phospholipids, Prostaglandins, steroids and waxes", "c", 0, 1, this.f479b));
        arrayList.add(new questions("63.", "Which one of the following shows the feeding methods of decomposers?", 0, 0, 0, 0, 0, "Saprobiotic nutrition", "Autotrophic nutrition ", "Parasitic nutrition", "Intracellular digestion", "The work of Francisco Redito disprove the idea of rotting meat producing flies which flies only appeared in the jars where flies had access in the first place.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("64.", "What happens when the carrying capacity of an ecosystem is reached?", 0, 0, 0, 0, 0, "Excretory product accumulates and population numbers increase.", "Population numbers decline rapidly.", "Population numbers remain more or less constant. ", "Resources are plentiful and populations shoot up. ", "One way of feeding mechanism of decomposers are Saprobiotic nutrition that depends on the dead body of the organism. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("65.", "In which industrial products is pyruvate fermentation by yeast practically applied?", 0, 0, 0, 0, 0, "Brewing beer ", "Swiss cheese making", "Production of vinegar", "Yoghurt making ", "During stationary phase the numbers of population remain fairly constant they fluctuate about a 'mean' level.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("66.", "If a substance that weighs 2,000 grams and has a half-life of 100 years is left with only 250 grams, for how long has the radioactive decaying activity been undergoing?", 0, 0, 0, 0, 0, "200 years ", "250 years", "300 years ", "500 years", "Anaerobic respiration yeast cells the fermentation products will be ethanol and CO₂.", "a", 0, 1, this.f479b));
        arrayList.add(new questions("67.", "What does an ethnologist study?", 0, 0, 0, 0, 0, "Insect diets", "Soil types", "Fossil fuel", "Animal behavior", "", "c", C2719R.C2721drawable._0210923_115637, 1, this.f479b));
        arrayList.add(new questions("68.", "Which one of the following is a biotic factor operating within an ecosystem?", 0, 0, 0, 0, 0, "The amount of helium gas in the air", "The rate of flow of water in a river ", "The carnivores that consume other animals", "The type of climate in a given region", "Neo- Darwinism encompasses the genetics and our standing of animal behavior sometimes referred to as ethology. ", "d", 0, 1, this.f479b));
        arrayList.add(new questions("69.", "When athletes take part in short distance running. how do the cells generate most of the energy that is quickly needed?", 0, 0, 0, 0, 0, "Aerobic respiration in muscle cells.", "Mitochondrial respiration in any cell.", "Anaerobic respiration in muscle cells. ", "Yeast fermentation in the stomach.", "Biotic factor is the effects of other organisms of the same species or of a different species.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("70.", "What do you call the reasoning technique in science where general principles are used to analyze specific cases? ", 0, 0, 0, 0, 0, "Induction", "Deduction", "Pseudo-deduction.", "Pseudo- induction", "Sometimes, aerobic respiration is in sufficient to meets the energy demand of muscles cells so fermentation of glucose supplies the extra energy.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("71.", "If the rate of an enzyme catalysed reaction remains constant even when more substrate is added to the reaction, which of the following might be the reason?", 0, 0, 0, 0, 0, "Saturation of the enzyme", "Inactivation of the enzyme", "Inhibition of enzyme- substrate complex formation ", "Loss of substrate specificity by the enzyme", "Deductive Reasoning proceeds by constructing and using general principles to analyse specific cases.", "b", 0, 1, this.f479b));
        arrayList.add(new questions("72.", "Which of the following will primarily happen if the enzymes in the lysosomes of a cell are defective? ", 0, 0, 0, 0, 0, "Cellular debris will not be removed", "Chromosome replication will cease ", "ATP production will stop", "Diffusion process will stop", "The end product inhibition causes the formation of a product inhibits an earlier reaction in the sequence", "c", 0, 1, this.f479b));
        arrayList.add(new questions("73.", "Which of the following is true about all proteins?", 0, 0, 0, 0, 0, "They are twenty amino acids long.", "They are globular in shape.", "They perform the same function. ", "The monomers are held together by peptide bonds.", "The enzyme from the lysosomes digest foreign cells that have been engulfed. ", "a", 0, 1, this.f479b));
        arrayList.add(new questions("74.", "Which of the properties of water allows mosquito larvae to hung themselves dawn into the water from the water surface?", 0, 0, 0, 0, 0, "Its high specific heat capacity ", "Its high latent heat of vaporization", "Its high surface tension", "Its low density in solid state", "Proteins consist of large chains of amino acids that are joined together by bonds that are referred to as peptide bonds.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("75.", "Which of the following properties of enzymes makes it possible that a single enzyme molecule can act on many substrate molecules?", 0, 0, 0, 0, 0, "Enzymes are proteins", "Enzymes lower the energy of activation ", "Enzymes are reused over and over again", "Enzymes are substrate specific", "The mosquito larvae hang from the surface of the water by their breathing tubes. The surface tension is sufficiently strong to hold their weight.", "c", 0, 1, this.f479b));
        arrayList.add(new questions("76.", "The T-lymphocyte cells of AIDS patients are destroyed by:", 0, 0, 0, 0, 0, "Multiplication of HIV inside the cell", "Infection of opportunistic organisms ", "The immune system of the host organism itself", "The CD, receptors on the cell surface ", "Enzymes are not used up during the reaction they catalyze. So, enzymes are reused several times. ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("77.", "Which stage in the life cycle of HIV is disrupted if AIDS patients are treated with a drug that has a protease in habiting activity? ", 0, 0, 0, 0, 0, "Entry of the virus into the host.", "Conversion of viral RNA to DNA. ", "Integration of viral DNA into host DNA.", "Assembly of viral parts into whole virus. ", "Some HIV protein remain on the surface of the infected CD, cells and are recognized by the immune system-these cells are destroyed. ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("78.", "Of the following four cells whose surface area to volume ratio is given, which cell can more efficiently transport its needs of materials across the cell surface?", 0, 0, 0, 0, 0, "24:8 ratio ", "54:27 ratio", "96:64 ratio ", "150: 125 ratio", "Protease cuts protein chain into parts of a new HIV particle which can bud from cell and infect other cells.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("79.", "Cells immediately use the energy that electrons lose as they pass along the chain of electron carriers to: ", 0, 0, 0, 0, 0, "Produce ATP", "Pump protons", "Spin the rotor of ATP synthase", "reduce NAD", "Area = surface area / volume ratio = the smaller an object the greater or higher its surface area to volume:", "d", 0, 1, this.f479b));
        arrayList.add(new questions("80.", "Which of the following is a routine method used by clinics to test people for HIV infection?", 0, 0, 0, 0, 0, "Microscopic examination for the virus.", "Counting the number of white blood cells. ", "Testing for human anti - HIV antibody.", "Measuring the amount of hemoglobin.", "When the electron is transferred through the electron carries (proton pumps) the energy they lose powers the pumps which move the protons into the inter-membranes space. ", "b", 0, 1, this.f479b));
        arrayList.add(new questions("81.", "Which of the following is NOT true about the nature of the first form of organisms on earth? They were:", 0, 0, 0, 0, 0, "Prokaryotic ", "Unicellular ", "aerobic ", "anaerobic", "The routine method used by clinics to test people for HIV infection testing for human anti-HIV anti body. ", "c", 0, 1, this.f479b));
        arrayList.add(new questions("82.", "Suppose a fossil initially contains 100.000 atoms of a certain radioactive element whose half-life is 10,000 years, after how many years would the number of the atoms be 12500?", 0, 0, 0, 0, 0, "Ten thousand years.", "Thirty thousand years", "Twenty thousand years", "Forty thousand years", "The primitive atmosphere of the earth was a reducing atmosphere with no free oxygen.", "c", C2719R.C2721drawable._0210923_115643, 1, this.f479b));
        arrayList.add(new questions("83.", "The following are Simpson's Index of species diversity calculated for four areas containing the same types of species. Which index value is from the area dominated relatively by a fewer number of species?", 0, 0, 0, 0, 0, "8.00", "6.00", "3.5", "2.5", "A low value for the index of diversity, suggesting only a few successful species could be the result of a hostile environment with only a few organisms being really well adapted to the environment.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("84.", "Which of the following happens in both cyclic and non-cyclic photophosphorylation?", 0, 0, 0, 0, 0, "ATP is formed", "Oxygen is generated ", "NADP is reduced", "Water molecule splits", "Non cyclic photo phosphorylation \n- Formation of ATP     \n- Cyclic photo phosphorylation\n- Electron not recycled    \n- Formation of ATP\n- No oxygen and no reduced NADP are formed\n", "a", 0, 1, this.f479b));
        arrayList.add(new questions("85.", "Which of the following is NOT a true characteristic of the populations of most of the developing countries of the world?", 0, 0, 0, 0, 0, "High fertility rate", "Increasing population size", "More number of old people than young people ", "Birth rate greater than mortality rate", "", "c", 0, 1, this.f479b));
        arrayList.add(new questions("86.", "Which of the following came first in the course of organic evolution?", 0, 0, 0, 0, 0, "Photosynthetic organisms", "Free oxygen in the atmosphere", "Land plants", "Multicellular organisms", "", "b", 0, 1, this.f479b));
        arrayList.add(new questions("87.", "Choose the step that comes at the last step in the scientific method.", 0, 0, 0, 0, 0, "Proposing the research hypothesis", "Formulation of a scientific theory", "Conducting experiments", "Making predictions", "", "b", 0, 1, this.f479b));
        arrayList.add(new questions("88.", "Which of the following is NOT true about C4 plants such as tef (Eragrostistet)?", 0, 0, 0, 0, 0, "CO2, is harvested during the night time.", "The bundle sheath cells contain chloroplasts. ", "Light-dependent reaction occurs in mesophyll cells.", "Chloroplasts of bundle sheath cells lack thylakoids. ", "", "a", 0, 1, this.f479b));
        arrayList.add(new questions("89.", "What is the reason that plants do not use nitrogen directly from the atmosphere? ", 0, 0, 0, 0, 0, "Nitrogen concentration is low in the atmosphere.", "The molecular size of nitrogen is too large to pass through the stomata", "Nitrogen can enter plants only through the root hairs.", "Plants lack the necessary process to use elementary nitrogen. ", "", "c", 0, 1, this.f479b));
        arrayList.add(new questions("90.", "What does the fermentation of glucose by yeast normally yield?", 0, 0, 0, 0, 0, "Lactic acid, CO2, and 2 ATP", "CO₂, H₂O, and 36 ATP", "Alcohol, CO₂, and 2 ATP. ", "Alcohol, CO₂, and 36 ATP", "", "c", 0, 1, this.f479b));
        arrayList.add(new questions("91.", "Which hormone promotes human sleepfulness in darkness and controls the sleep-wake cycle?", 0, 0, 0, 0, 0, "Insulin", "Adrenaline", "Melatonin", "Thyroxin", "", "c", 0, 1, this.f479b));
        arrayList.add(new questions("92.", "Which two nitrogenous bases belong to the purines? ", 0, 0, 0, 0, 0, "Adenine and thymine", "Adenine and guanine", "Guanine and cytosine", "Thymine and uracil", "", "b", 0, 1, this.f479b));
        arrayList.add(new questions("93.", "Which of the following is true?", 0, 0, 0, 0, 0, "Recessive alleles are only expressed in the homozygote.", "Dominant alleles are expressed only in the heterozygote.", "Recessive alleles are expressed in the heterozygote.", "Genetically modified organisms are never used to manufacture vaccines", "", "a", 0, 1, this.f479b));
        arrayList.add(new questions("94.", "Which one of the following is a functional group of a fatty acid? ", 0, 0, 0, 0, 0, "A ketone group", "An amino group", "An aldehyde group", "A carboxyl group.", "", "d", 0, 1, this.f479b));
        arrayList.add(new questions("95.", "Which one of the following is an example of an orientational innate behavior?", 0, 0, 0, 0, 0, "Kinases in woodlice", "Blinking of the eyes", "Sudden withdrawal of limbs from hot object", "Nest building by weaver birds", "", "a", 0, 1, this.f479b));
        arrayList.add(new questions("96.", "One of the following is true about bacteriophages that have lysogenic life cycle.", 0, 0, 0, 0, 0, "They are RNA viruses", "They integrate their nucleic acid in to that of the host ", "They multiply in the host immediately after infection", "Progeny viruses are released by chronic release method ", "The virus's DNA becomes incorporated in to the DNA of the host cell. Each time the cell divides, the DNA is replicated, and each daughter cell gets a copy of the cell's DNA. This can continue for many generations.\nThis type of life cycle is called a lysogenic cycle. \n", "b", 0, 1, this.f479b));
        arrayList.add(new questions("97.", "In Pavlov's experiment on the classical conditioning of dogs, what does the reaction of the dogs to the sound of the hell represent? ", 0, 0, 0, 0, 0, "The conditioned stimulus", "The conditioned response", "The unconditioned stimulus ", "The unconditioned response", "CS is neutral stimulus does not initially produce the unconditioned response.\nCR - is the response to the previously neutral stimulus.\n", "b", 0, 1, this.f479b));
        arrayList.add(new questions("98.", "What is the purpose of the in folding of the inner- membrane of the mitochondrion? ", 0, 0, 0, 0, 0, "Increasing the photosynthetic capacity of the cell.", "Speeding up the loss of CO, during fermentation. ", "Speeding up the process of glycolysis.", "Increasing the surface area for ATP production.", "The inner membrane of mitochondria is folded in to cristae to increase the available surface area.", "d", 0, 1, this.f479b));
        arrayList.add(new questions("99.", "Which of the following is a worthwhile biological problem for scientific investigation?", 0, 0, 0, 0, 0, "Estimation of the amount of carbon in a forest ecosystem. ", "How a crying dog can tell who among elders of the village is going to die next", "How witchcrafts inflict bad health by cursing a healthy person ", "How the traditional medicine men/women cure a possessed person.", "The amount of the traditional medicine is not scientifically limited so the overdose of medicine is a cause of death it is a biological problem for scientific investigation. ", "d", 0, 1, this.f479b));
        arrayList.add(new questions("100.", "Which of the following biomes of the Earth has the greatest diversity of species? ", 0, 0, 0, 0, 0, "Deciduous forest", "Tropical rain forest", "Desert", "Tundra", "Tropical rain forest have many plants, many animals and epiphytes plants.", "b", 0, 1, this.f479b));
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
        this.f480tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2007.this.timer.setVisibility(0);
                    bio2007.this.timer.setText(format);
                }

                public void onFinish() {
                    bio2007.this.scr.setVisibility(8);
                    bio2007.this.chr.stop();
                    bio2007.this.toolbar.setVisibility(8);
                    bio2007.this.Relative.setBackgroundColor(-7829368);
                    bio2007.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2007.this.getBaseContext());
                    int unused = bio2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2007.this.highscoreBio2007 = defaultSharedPreferences.getInt("bio2007hs", 0);
                    int access$600 = bio2007.this.part1 + bio2007.this.part2 + bio2007.this.part3 + bio2007.this.part4 + bio2007.this.part5 + bio2007.this.part6 + bio2007.this.part7 + bio2007.this.part8 + bio2007.this.part9;
                    bio2007.this.resultText.setText(String.valueOf(access$600));
                    bio2007.this.progressbar.setProgress(access$600);
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
                    if (access$600 > bio2007.this.highscoreBio2007) {
                        edit.putInt("bio2007hs", access$600);
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
                bio2007.this.scr.setVisibility(8);
                bio2007.this.chr.stop();
                bio2007.this.toolbar.setVisibility(8);
                bio2007.this.Relative.setBackgroundColor(-7829368);
                bio2007.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2007.this.getBaseContext());
                int unused = bio2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = bio2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = bio2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = bio2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = bio2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = bio2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = bio2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = bio2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = bio2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = bio2007.this.highscoreBio2007 = defaultSharedPreferences.getInt("bio2007hs", 0);
                int access$600 = bio2007.this.part1 + bio2007.this.part2 + bio2007.this.part3 + bio2007.this.part4 + bio2007.this.part5 + bio2007.this.part6 + bio2007.this.part7 + bio2007.this.part8 + bio2007.this.part9;
                bio2007.this.resultText.setText(String.valueOf(access$600));
                bio2007.this.progressbar.setProgress(access$600);
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
                if (access$600 > bio2007.this.highscoreBio2007) {
                    edit.putInt("bio2007hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2007.this.scr.setVisibility(8);
                bio2007.this.chr.stop();
                bio2007.this.toolbar.setVisibility(8);
                bio2007.this.Relative.setBackgroundColor(bio2007.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2007.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2007.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2007.this.scr.setVisibility(0);
                bio2007.this.toolbar.setVisibility(0);
                bio2007.this.telegram_layout.setVisibility(8);
                bio2007.this.chr.start();
                bio2007.this.Relative.setBackgroundColor(bio2007.this.getResources().getColor(C2719R.C2720color.white));
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
                bio2007.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
