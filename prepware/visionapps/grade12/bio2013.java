package com.visionapps.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class bio2013 extends AppCompatActivity {
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
    private Boolean f489b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreBio2013;
    /* access modifiers changed from: private */
    public View layout;
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
    private Toolbar f490tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bio2013);
        this.f489b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextBio2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_bio2013);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The step of scientific method which comes after analyzing results and draw conclusion is:", 0, 0, 0, 0, 0, "Constructing hypothesis", "Doing background research", "Accepting or rejecting the hypothesis", "Designing and carrying out experiment", "Here is the correct order of scientific method: \n\n• Ask question \n\n• Do Background research \n\n• Construct Hypothesis \n\n• Design and Carryout experiment \n\n• Analyze result and Draw Conclusion \n\n• Accept or Reject the Hypothesis \n\n• Report Result \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("2.", "In a group of individuals in which group A was a control and group B was an experimental group, a student gave a placebo to the control group, and an unknown drug to the experimental group. At the end, the experimental group got better. Which one of the following is true about the result? \n", 0, 0, 0, 0, 0, "Placebo has better effect", "The drug has an effect", "Conclusion cannot be reached", "The experiment was wrong", "Definition: Placebo is anything that looks like real medicine but without any effect. By comparing the experimental group to the control group, we can understand that the drug positively affects getting patients better. ", "b", 0, 1, this.f489b));
        arrayList.add(new questions("3.", "A biologist conducted simple experiment to investigate the effect of pH on salivary amylase. She added 5cm3 amylase solution into 5cm3 starch suspension with a neutral pH in a test tube. After ten minutes, she tested it with iodine reagent and the solution turned into blue-black color. What is the dependent variable of this experiment?", 0, 0, 0, 0, 0, "pH of the solution ", "Applying iodine treatment ", "Formation of blue-black color", "Adding salivary amylase ", "Definition: \n• Independent Variable is the variable that is changed during an experiment \n• Dependent Variable is the variable that is measured during an experiment in response to the change in Independent Variable. \n• Controlled Variable is the variable that is kept the same during an experiment. From this definition \n• Adding salivary amylase is the independent variable. \n• pH of the solution is the dependent variable.", "a", 0, 1, this.f489b));
        arrayList.add(new questions("4.", "Which one of the following pairs of biological tools and their functions is FALSE?\n", 0, 0, 0, 0, 0, "Balances - used for measuring mass", "Petri dish - used for culturing microorganisms", "Optical microscope - use beam of light to produce magnified image ", "Quadrate - to separate solids from liquids ", "", "d", 0, 1, this.f489b));
        arrayList.add(new questions("5.", "Grade 12 students went to a field and collected plant specimens for identification in the laboratory. They wanted to preserve the plant parts for sometimes and specimens can be analyzed later. Which one of the following biological tools is used for their activities? \n", 0, 0, 0, 0, 0, "Pitfall traps ", "Plant press ", "Quadrat", "Theodolite", "", "b", 0, 1, this.f489b));
        arrayList.add(new questions("6.", "The relevance and promise of biological sciences can be demonstrated by their contribution in \n", 0, 0, 0, 0, 0, "Finding solutions to ethnic conflicts", "Finding mechanisms to feed the growing human population", "Advancement of aviation technology", "Development of housing and construction sectors", "Biological science can contribute to feed the growing human population, by producing: \n• high yield crops. \n• drought and disease resistant crops \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("7.", "All are the roles of biology to combat the spread of HIV/AIDS EXCEPT \n", 0, 0, 0, 0, 0, "Breaking the transmission pathway. ", "Producing drugs that can stop the virus from reproducing.", "Producing a vaccine against the virus.", "Raising fund for infected people.", "Raising funds for patients is not the role of Biology. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("8.", "Which one of the following statements is INCORRECT about AIDS? The rate of transmission of AIDS will reduce when Promiscuous sexual intercourse is\n", 0, 0, 0, 0, 0, "reduced", "The transmission pathways is broken", "Men and women are circumcised", "The number of sexual partners is restricted", "• Promiscuous means having many sexual partners, reducing this will reduce the rate of transmission of AIDS. \n• Breaking the transmission pathway such as by stopping unprotected sex, sharing needles, syringes will reduce the rate of transmission of AIDS. \n• While male circumcision has health benefits, female circumcision is considered a harmful practice and doesn't reduce the rate of transmission. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("9.", "Suppose there are two communities in a village. Community A is actively participate in HIV/AIDS awareness creation, HIV prevention and got blood test for HIV where as community B is frequently request for food aid, participate only in afforestation activities and HIV positive individuals keep the secret to themselves. In which community do you think that the incidence of HIV/AIDS most probably high?\n", 0, 0, 0, 0, 0, "In community B ", "In both communities ", "In community A ", "Impossible to decide ", "A community that doesn't have a good awareness about HIV and its prevention, usually have a high incidence of the virus compared to community that have good awareness about the virus.\n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("10.", "Which property of water is useful for life that it continues in relatively warm water underneath through the cold weather? \n", 0, 0, 0, 0, 0, "High density in its solid form than its liquid form", "High specific heat capacity", "High latent heat of vaporization ", "High surface tension ", "Water has a high specific heat capacity. It requires a lot of energy to increase or decrease its temperature compared to other substances. It is resistant to changes in temperature. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.bio1411q, 0, 0, 0, 0, "1 and 2 ", "2 and 3 ", "1 and 3", "3 and 4 ", "", "c", C2719R.C2721drawable.bio1411e, 1, this.f489b));
        arrayList.add(new questions("12.", "Which one of the following statements explain the property of water? It \n", 0, 0, 0, 0, 0, "Has the lowest latent heat of vaporization ", "Takes less energy to heat water up ", "Is highly viscous substance ", "Is a transparent molecule", "Properties of water: \n• It has a high latent heat of vaporization, meaning it takes a lot of energy to turn liquid water into water vapor. \n• it has a high specific heat capacity, meaning it takes a lot of energy to heat water up \n• it has a low viscosity. Definition: Viscous is something that is sluggish and sticky. E.g., honey, \n• It is transparent, light can pass through it. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("13.", "Cellulose is", 0, 0, 0, 0, 0, "A polymer of ß-glucose molecule ", "A mixture of amylose and amylopectin ", "A polymer of a-glucose molecule ", "A non-reducing monosaccharide sugar", "• Cellulose is a polymer of ß-glucose molecule joined by ß-l ,4-glycosidic bond. \n• Starch is a mixture of amylose and amylopectin. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("14.", "Which organic molecules are formed when two fatty acid molecules are bounded to the glycerol and the place of the third is taken by a phosphate group? \n", 0, 0, 0, 0, 0, "Glycolipids ", "Waxes", "Phospholipids ", "Triglycerides", "• Glycolipids are formed from lipids and carbohydrates. \n• Waxes are formed from fatty acids and long-chain alcohols. \n• Phospholipids are formed from glycerol, two fatty acids and a phosphate group. \n• Triglycerides are formed from glycerol and three fatty acids. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("15.", "All are the function of lipids EXCEPT", 0, 0, 0, 0, 0, "Water proofing ", "Thermal insulation", "Determines a particular feature ", "Respiratory substrates ", "Some functions of lipids: \n• Waterproofing: since lipids are hydrophobic, they can form a coat that repels water. \n• Thermal insulation: lipids act as an insulator under the skin of animals and prevent heat from escaping out of the body. \n• Respiratory substrate: lipids yield a high amount of energy (ATP) during oxidation. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("16.", "Which one of the following organic molecules is used to make hemoglobin?\n", 0, 0, 0, 0, 0, "Lipids", "Glycogen", "Nucleic acids ", "Proteins", "Hemoglobin is a protein in red blood cells that carries oxygen. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("17.", "Which one of the following is the correct formula of maltose? \n", 0, 0, 0, 0, 0, "C12 H24 O12", "C6 H12 O6", "C12 H22 O11", "C5 H10 O5", "Maltose is a disaccharide with a chemical formula of C12 H22 O11. \n• When two glucose molecules (C6 H12 O6) combine they form Maltose (C12 H22 O11) and a water molecule (H2O). \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("18.", "A grade 11 student added Benedict's reagent on food sample and heated the mixture for 5 minutes. Then he observed a color change. Which one of the following is FALSE about the result? \n", 0, 0, 0, 0, 0, "A yellow color shows that a reducing sugar is present", "An orange color shows a reducing sugar is present", "A red color shows that a reducing sugar is present", "An orange color shows that a non-reducing sugar is present", "In Benedict's test, \n• For reducing sugar, it shows yellow/orange/ red color. \n• For non-reducing sugar, it doesn't react with benedict reagent unless it is hydrolyzed with hydrochloric acid. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("19.", "In a Benedict's test for sucrose, why does the test sample first boil with hydrochloric acid? \n", 0, 0, 0, 0, 0, "To neutralize the solution", "To reduce Benedict's solution ", "To rest the mixture with Benedict's solution ", "To hydrolyze non-reducing sugar. ", "Sucrose is a non-reducing sugar; it doesn't react with benedict reagent by itself unless it is first hydrolyzed with hydrochloric acid.\n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("20.", "Which one of the following statements explains the specificity of enzymes? Enzymes \n", 0, 0, 0, 0, 0, "Speed up a reaction without being used up ", "Catalyze one reaction only.", "Can be used over and over again. ", "Can be destroyed by excessive heat.", "The specificity of the enzyme means enzymes are specific, they can only catalyze a certain substrate because of their different shaped active sites.\n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("21.", "Consider the following chemical reaction below \nRH2 + A -E-> R + AH2 \nBased on the above chemical reaction, in which classes of enzymes does enzyme \"E\" can be grouped?\n", 0, 0, 0, 0, 0, "Hydrolases", "Transferases ", "Oxidoreductases", "Isomerases", "In the above reaction, there is a transfer of hydrogen atom from RH2 to AH Oxidoreductases enzyme catalyzes the transfer of electrons such as hydrogen, oxygen atoms. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("22.", "Which one of the following enzymes is used as washing powders? \n", 0, 0, 0, 0, 0, "Lipases ", "Biochymosin", "Pectinase", "Cellulase", "Enzymes such as Protease, Lipase, and Amylase are used as washing powder. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("23.", "Which one of the following statements explains how an enzyme lowers the activation energy of a reaction? By\n", 0, 0, 0, 0, 0, "Making the individual substrate molecules more reactive", "Enabling the reaction to occur at lower physiological temperature", "Changing its tertiary structure into secondary protein structure ", "Lowering the kinetic energy of the reacting molecules", "Enzymes generally lower activation energy by reducing the energy needed for reactants to come together and react, it makes the reactants more reactive. It enables the reaction to occur at a lower temperature. \nNote: It doesn't lower the kinetic energy of the reacting molecules, it only lowers the energy needed for the reaction. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("24.", "What happens when the substrate molecule binds to the active site of an enzyme?", 0, 0, 0, 0, 0, "They form a stable intermediate substance", "The substrate and the enzyme will bond permanently", "The chemical bonds of the substrate distorted", "The amino acids in the active site becomes unreactive", "In the induced-fit model, the binding of a substrate produces a conformational change in the active site. This conformational change puts the substrate molecule into a transition state. The transition state is also called enzyme/substrate complex, it is an unstable substance. In the transition state the bond break and rejoins with other bonds to form products.", "c", 0, 1, this.f489b));
        arrayList.add(new questions("25.", "Which of the following vitamins is used as a component of cofactor? \n", 0, 0, 0, 0, 0, "Riboflavin", "Thiamin ", "Retinol ", "Ascorbic acid", "Cofactors can be coenzymes or mineral ions. Coenzymes are organic molecules that are vitamins or derived vitamins. \n• Flavin adenine dinucleotide (FAD) is a cofactor that is derived from Riboflavin vitamin. \n• Thiamin pyrophosphate (TPP) is a cofactorthat is derived from Thiamin vitamin. \n• Ascorbic acid is a cofactor. \nThe correct answer is A, B and D. Since, we have to pick only one answer just like exam, we picked choice A. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("26.", "Identify the statement that correctly explains the factors of an enzyme activity.\n", 0, 0, 0, 0, 0, "Hydrogen ion concentration affects the ionic bonds of an enzyme. ", "Excessive heat breaks the ionic bonds that hold the tertiary structure of the enzyme protein.", "Inhibitors increase enzyme activity by increasing their turnover rate.", "Increasing concentration of substrates does not affect enzyme activity.", "Here is the correct statement of each choice: \n• The PH(hydrogen ion concentration) affect the ionic bonds of an enzyme. \n• Excessive heat changes the shape of the enzyme, the enzyme begins to lose its tertiary structure and become denatured. \n• Inhibitors decrease enzyme activity rate. \n• Increasing the concentration of substrates increases the enzyme activity until it reaches the maximum turnover. \nThe correct answer is A and B. But since we have to pick one answer just like the exam, we picked choice A. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("27.", "Which one of the following is true about allosteric regulation? \n", 0, 0, 0, 0, 0, "Inhibition by competitive inhibitors when it interacts on the allosteric site. ", "Enzymes are activated when activators attached on the active site.", "Allosteric inhibition is occurred when inhibitors attached on the active", "Activation by activators when it interacts on the allosteric site.", "Allosteric inhibitor is a non-competitive inhibitor that binds to the allosteric site of the enzyme. Upon binding, the enzyme changes its shape and can no longer bind with the substrate. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("28.", "If an enzyme from thermophilic bacteria, which catalyzes glucose 6-phosphate into fructose 6-phosphate in the process of glycolysis, is subjected to below the optimum temperature, the rate of reaction will be decreased. This is because \n", 0, 0, 0, 0, 0, "The enzyme is denatured", "The particles have more kinetic energy", "Less enzyme-glucose 6-phosphate comlpexes formed", "More collisions between enzyme and glucose 6-phosphate occurred. ", "Definition: Thermophilic bacteria is a type of bacteria that live in a very hot temperature. Decreasing the temperature below the optimum level, decrease the rate of reaction, because the particles have less kinetic energy, which means there will be less collision between the enzyme and the substrate, resulting in less intermediate-complex formation. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("29.", "Cyclooxygenase-2 is an enzyme that catalyzes the conversion of arachidonic acid to prostaglandins, which promote pain and fever in our body. The pain killer ibuprofen, act as non-competitive inhibitor of cyclooxygenase-2, reduces the production of prostaglandins. \nWhat would happen if the concentration of the ibuprofen increased? \n", 0, 0, 0, 0, 0, "Production of prostaglandin is increased", "Pain of the body is decreased", "Substrate affinity of cyclooxygenase-2 is hi her", "Concentration of arachidonic acid is decreased", "Adding the concentration of the drug decreases the production of prostaglandin, which then decreases the pain and fever in our body. \n• Note: In a non-competitive reaction, the affinity of the enzyme for its substrate remains unchanged, as the active site is not competed by the inhibitor. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("30.", "Some amino acids are synthesized using transamination process in the cell. This activity more describes the cell's \n", 0, 0, 0, 0, 0, "Catabolism", "Replication", "Anabolism", "Energy production", "Definition: \n• Anabolism involves the synthesis of complex molecules from smaller molecules. \n• Catabolism involves the breakdown of complex molecules into smaller molecules. Transamination involves catabolism when degrading amino acids, and anabolism when synthesizing amino acids. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("31.", "One of the differences of prokaryotic and eukaryotic cells is their cell wall. This is because cell wall of prokaryotic cell is \n", 0, 0, 0, 0, 0, "Impermeable", "The site of energy production", "Made from sugar and amino acid", "Stronger than eukaryotic cells", "• The cell wall of a prokaryotic cell is made from peptidoglycan. Peptidoglycan consists of sugar and amino acids. \n• The cell wall of a plant cell is made from cellulose. Cellulose is a polysaccharide. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("32.", "Consider the following key events in the study of cell biology. \nI. Hooke describes 'cells' in a cork. \nII. Leeuwenhoek discovers protozoa. \nIII. Schleiden and Schwann propose a cell theory. \nIV. Jansen builds the first compound microscope \nWhich one of the following represents the correct order from ancient to the recent?\n", 0, 0, 0, 0, 0, "IV, I, II and III ", "II, III and IV ", "II, III, IV and I ", "III, II, I and IV ", "• In 1 595, Jansen invented the first compound microscope. \n• In 1 665, Robert Hooke makes drawings of cork which he called cells. He was the first person to discover the presence of a cell, even though the cell he saw was a dead cell. \n• In 1 674, Anton Van Leeuwenhoek discovers the first living, unicellular organism(protozoa). \n• In 1839, Matthias Schleiden and Theodor Schwann propose the first cell theory. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("33.", "Consider the following features of cells. \nI. have pili \nII. have chromosome \nIII. have circular DNA \nIV. have larger ribosomes \nWhich of the above features of cells can be included in eukaryotic cells?\n", 0, 0, 0, 0, 0, "I and II ", "II and III ", "I and III", "II and II ", "Eukaryotic cell \n• doesn't have pili, a hair like structure that is found in prokaryotic cell \n• they have linear DNA in chromosome \n• they have a large (80S) ribosome. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("34.", "Which of the following is correct about the structure of the cell membrane?\n", 0, 0, 0, 0, 0, "Protein molecules form a double layer", "Phospholipid molecules form a transport channel", "Proteins form the outer layer while phospholipids form the inner layer", "The membrane has a fluid nature that is regulated cholesterol", "The following statement is correct about the structure of the cell membrane: \n• The cell membrane is composed double layer of phospholipid. \n• Integral Proteins: plays an important role in transporting substances across the membrane \n• Phospholipids form the outer layer. \n• Fatty acids and cholesterol regulate the fluidity of the membrane \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("35.", "Which of the following is a correct match of cellular organelles and their corresponding function? \n", 0, 0, 0, 0, 0, "Mitochondria - ATP synthesis ", "Vacuole - strength and elasticity", "Golgi body - digesting foreign cells ", "Lysosome - modification of proteins", "Here is the correct match of cellular organelles with their corresponding function \n• Mitochondria: ATP synthesis. \n• Vacuole: in a plant cell, maintains the turgor pressure of a cell. \n• Golgi Body: process, package and distribute proteins into part of the cell. \n• Lysosome: digest excess or worn-out organelles.\n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("36.", "According to the fluid-mosaic model of the plasma membrane \n", 0, 0, 0, 0, 0, "Glycoproteins form a double layer", "The membrane has uniform composition of proteins", "Peripheral proteins are tightly attached on the membrane", "Phospholipid bilayer forms the basic structure of the membrane", "According to the fluid-mosaic model of the plasma membrane: \n• The cell membrane is composed double layer of phospholipid. \n• Phospholipid bilayer form the basic structure of the membrane \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("37.", "Three different cells are in the process of transporting materials across the cell membrane as indicated below: \nCell 1 = water from high concentration to low concentration \nCell 2 = Na+ from high concentration to low concentration \nCell 3 = glucose form low concentration to high concentration \nWhich types of transport mechanism do the above cell use, respectively?\n", 0, 0, 0, 0, 0, "Osmosis, active transport, facilitated diffusion", "Osmosis, facilitated diffusion, active transport ", "Facilitated diffusion, active transport, osmosis ", "Facilitated diffusion, osmosis, active transport", "• Osmosis is the transfer of water molecule from high water potential to low water potential. \n• Simple diffusion is the transfer of molecules from high concentration to low concentration. \n• Facilitated Diffusion is the transfer of molecules from high concentration to low concentration through an ion or carrier protein. \n• Active transport is the transfer of molecules from low concentration to high concentration using a carrier protein \nCell 1 uses osmosis \nCell 2 uses Facilitated diffusion \nCell 3 uses Transport \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("38.", "Suppose you took a container and divided it into two halves by a membrane which is permeable to water and labeled the two halves as A and B. Finally, you added hypertonic solution in A and hypotonic solution in B. What will be the expected result of this experiment? \n", 0, 0, 0, 0, 0, "Rise of the water level in B ", "Rise of the water level in both halves", "No change in both halves", "Rise of the water level in A ", "• Hypertonic solution: has lower water concentration than the cell. It has more solute concentration than the cell. \n• Hypotonic solution: has a higher water concentration than the cell. It has less solute concentration than the cell. \nIf the two solutions are placed together, water moves from the hypotonic solution (container B) to the hypertonic solution (container A) There will be a rise in the water level in container A.\n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("39.", "A class of grade 11 students were given two solutions A and B of unknown concentration separated by a semi permeable membrane. The teacher instructed them to observe any changes in the water levels of the two solutions. After few minutes, the students observed the water level in solution A has decreased. What could the students conclude from their observation?\n", 0, 0, 0, 0, 0, "Solution A had higher water potential", "Solution B had positive water potential", "Solution A was hypertonic", "The two solutions were isotonic", "Water moves from higher water potential to lower potential. If the water level in solution A has decreased it means solution A had higher water potential.\n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("40.", "A student did an experiment and found out that catabolism of amino acid produces toxic ammonia in the liver cells which gradually get converted into urea and excreted through urine. \nWhat would be the result of the experiment if osmosis was blocked? The liver cells \n", 0, 0, 0, 0, 0, "Excrete more ammonia and urea", "Gain water and become turgid", "Become damaged and lose functionality", "Become over active and produce more energy", "The liver cell is placed in a hypertonic solution (a solution that has a higher solute concentration than the cell). \n• With osmosis, the cell loses water and began to shrink. \n• Without osmosis, the cell become damaged and lose functionality. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("41.", "Which event of cellular respiration takes place in the cytoplasm of eukaryotic cells? \n", 0, 0, 0, 0, 0, "Reaction of acetyl COA with oxaloacetate ", "Production of pyruvate from glucose ", "Reaction of pyruvate with coenzyme A", "Production of ATP through chemiosmosis", "The first stage in cellular respiration, Glycolysis takes place in the cytoplasm of a cell. It involves breaking down glucose to produce pyruvate. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("42.", "Suppose two moles of glucose is burned aerobically. How many moles of ATP can be produced by substrate level phosphorylation in Krebs cycle? \n", 0, 0, 0, 0, 0, "6", "4", "8", "10", "Two moles of ATP are produced by substrate level phosphorylation in the Krebs cycle per one mole of glucose oxidized. \n• Hence, four moles of ATP are produced by substrate level phosphorylation in the Krebs cycle if two moles of glucose are burned aerobically. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("43.", "During alcoholic fermentation, C02 is released when \n", 0, 0, 0, 0, 0, "Pyruvate is oxidized", "Acetaldehyde is reduced", "Ethanol is oxidized", "Pyruvate is decarboxylated", "During alcoholic fermentation, C02 is released when pyruvate is converted into ethanol. In this process pyruvate is decarboxylated, meaning C02 is released from pyruvate. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("44.", "During anaerobic respiration, reduced NAD is required to \n", 0, 0, 0, 0, 0, "Reduce pyruvate to lactate", "Split pyruvate to C02 and acetaldehyde", "Reduce pyruvate to acetyl COA", "Convert lactate into pyruvate", "During anaerobic respiration, reduced NAD is required to \n• reduce pyruvate to lactate in an animal cell \n• reduce pyruvate to ethanol in a plant cell.\n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("45.", "Why do we get tired and fatigued during heavy exercise such as long distance running? It is due to \n", 0, 0, 0, 0, 0, "Accumulation of lactic acid", "Accumulation of C02", "Shortage of glucose", "High rate of aerobic respiration", "During exercise, we get tired because of the accumulation of lactic acid. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("46.", "What structural arrangements make chlorophyll suit for its function? \n", 0, 0, 0, 0, 0, "The fixing of the photosystems and the electron transport chain on thylakoid membrane.", "The floating of the photosystems and the electron transport chain in the cytosol", "The long distance between photosystem I and photosystem II", "The structural differences between photosystem I and photosystem II", "Chlorophyll is suited for its function because the molecules of photosystems and electron transport chains are fixed in the thylakoid membrane. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.bio1447q, 0, 0, 0, 0, "C and E ", "D and F ", "F and E ", "B and A ", "", "d", C2719R.C2721drawable.bio1447e, 1, this.f489b));
        arrayList.add(new questions("48.", "Why does photo-respiration take place in a hot environment? Because plants close their stomata and face:", 0, 0, 0, 0, 0, "C02 shortage", "H2O shortage", "O2 shortage", "O2 accumulation", "In a hot environment, plants often close their stomata to prevent water loss. This prevents C02 from entering the leaf, as a result the plants face C02 shortage. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("49.", "Which of the following is correct about the process of glucose production in the light-independent reactions of photosynthesis? \n", 0, 0, 0, 0, 0, "C02 reacts with GP to form RuBP", "A total of 9 ATP molecules are synthesized", "GP is reduced to TP by reduced NADP", "One TP is directly converted to one glucose molecule", "The following process happens in the light-independent reaction: \n• C02 reacts with RuBP (ribulose bisphosphate) in the presence of Rubisco enzyme to form two molecules of GP (glycerate phosphate). \n• GP is reduced to TP (triose phosphate) by reduced NAD. \n• Some of the TP formed is used to regenerate RuBP and some form glucose. To form one glucose molecule, two molecules of TP are required. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("50.", "Which of the following is a correct description of the CAM pathway of photosynthesis? \n", 0, 0, 0, 0, 0, "The Calvin cycle take place during the night", "C02 is stored in the form of malate during the night", "C02 is stored in the bundle sheath cells during the night", "The Calvin cycle takes place in the bundle sheath cells during the day", "The following process takes place in CAMphotosynthesis: \n• At night, CAM plants open their stomata to prevent water loss, C02 then enters the cell and combines with PEP in mesophyll cells to form oxaloacetate and eventually malate. \n• Malate is then stored in the vacuole until the next day \n• In the daytime, the light dependent generates ATP and reduced NADP, so that the Calvin cycle can continue. \n• Malate is released from the vacuoles releasing carbon dioxide for the reaction of the Calvin cycle. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("51.", "Which one of the following features is unique to bacteria? \n", 0, 0, 0, 0, 0, "Being unicellular ", "Presence of permeable membrane ", "Having flagella for locomotion ", "Absence of nuclear membrane", "Prokaryote (Bacteria) lacks a distinct nucleus and other membrane-bound organelles. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("52.", "", C2719R.C2721drawable.bio1452q, 0, 0, 0, 0, "Sphere, rod, spirochaete ", "Rod, spirochaete, sphere ", "Spirochaete, sphere, rod ", "Flagellated bacilli, clusters, spiralla ", "• Spirochetes (A): spiral shaped bacteria \n• Cocci (B): spherical bacteria \n• Bacilli (C): rod-shaped bacteria \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("53.", "It is possible to produce human insulin in a bacterial strain. The insulin gene should be inserted in a plasmid and the recombinant DNA plasmid should be inserted into a bacterium. \nWhat is the role of the bacterium in this process? \n", 0, 0, 0, 0, 0, "The source of plasmid and insulin production ", "The source of insulin and modification ", "Joining the gene of insulin with the gene of plasmid ", "Multiplying the recombinant DNA molecule", "In the production of human insulin using bacteria, it involves the following step. \n1 . Bacteria plasmids are removed and opened \n2. The gene, that controls the production of human insulin is cut from the donor DNA \n3. The gene will be transferred to the bacteria plasmid \n4. The bacteria will take up the modified plasmid \n5. The bacteria will start to produce insulin. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("54.", "Bacteria can cause disease in all of the following mechanisms EXCEPT  \n", 0, 0, 0, 0, 0, "Entering living cells and disrupting metabolic systems.", "Changing the genetic structure of host cells", "Invading and growing on the tissues of organs", "Releasing toxins as they multiply", "Bacteria cause disease by: \n• releasing toxins as they multiply. \n• invading and growing on the tissues of organs. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("55.", "Functional diseases differ from infectious disease in that they \n", 0, 0, 0, 0, 0, "Occur in the brain and heart", "Are caused by microorganisms", "Show no signs of damage on the organ", "Are common in females than males", "A functional disease is a disease in which there is an abnormal change in the function of an organ, but no structural damage or signs of damage in the tissues/organ involved.\n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("56.", "", C2719R.C2721drawable.bio1456q, 0, 0, 0, 0, "1 and 3 ", "2 and 3 ", "2 and 1 ", "1 and 2 ", "• Arrow 1 represents DNA \n• Arrow 2 represents Protein Coat \n• Arrow 3 represents Tail Fibers \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("57.", "The social impact of AIDS can be mainly revealed by \n", 0, 0, 0, 0, 0, "Loss of appetite ", "Fear of stigmatization ", "Loss of body weight ", "Reduced labor force", "The social impact of AIDS includes fear of isolation, stigmatization and discrimination. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("58.", "Which one of the following is a DNA virus?", 0, 0, 0, 0, 0, "HIV", "Herpes complex", "H1N1", "Hepatitis C", "• HIV is a retrovirus \n• Herpes Simplex is a DNA Virus \nH1N1 is an RNA Virus \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("59.", "Which one of the following is a correct comparison of lytic and lysogenic cycles of virus multiplication?\n", 0, 0, 0, 0, 0, "Lytic cycle involves incorporation of viral DNA into the host DNA", "Lysogenic cycle releases new viruses using only chronic cycle", "Both cycles damage the host cell DNA following infection", "Lytic cycle releases new viruses only by splitting the host cell", "• In Lytic cycle, after infection the virus's lysis (burst out) of the cell. \n• In Lysogenic cycle, the virus incorporates its viral DNA into a host cell to manufacture more viruses. When the cell divides, the virus genetic material is passed to the daughter cell. Finally, the virus leaves out through lysis (burst out) of the cell or chronic(ongoing) exocytosis.\n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("60.", "In an HIV/AIDS community screening, students were asked to take part in voluntary testing. The following discussion presents the views of four grade 12 students named A, B, C and D towards HIV testing. \nStudent A: I should not take the testing; it is simply boring. \nStudent B: we should take the testing, since we are educated; we should be exemplary. \nStudent C: if we get tested and got positive, what should we do? So, let us not get tested. \nStudent D: you know, this HIV/AIDS testing is simply a business. We should not be cheated. \nWhich student do you think is correct? \n", 0, 0, 0, 0, 0, "Student A", "Student B", "Student C ", "Student D", "HIV testing is essential for slowing the spread of HIV. \n• If a person tested negative, they will continue their preventative measures. \n• If a person tested positive, the person could start treatment right away and take precautions to help prevent spreading the virus to others. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("61.", "What is the major difference that viruses have with free living cells? Viruses \n", 0, 0, 0, 0, 0, "Lack genetic material of their own", "Reproduce only asexually", "Lack locomotory structure", "Do not function outside of a living cell", "Since viruses lack major organelles found in living cells, they need a host (living cell) to survive. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("62.", "Why is nutrient recycling important in an environment? Because \n", 0, 0, 0, 0, 0, "It adds new types of molecules into the environment", "The amount of nutrients in the environment is limited", "Nutrients should be exchanged between the earth and other planets", "Nutrients in an environment will be depleted if recycled", "Nutrient recycling is important because the amount of nutrients in the environment is limited. Without recycling, nutrients in the environment will be depleted. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("63.", "Which one of the following orders of life processes correctly illustrates occurrence of the nutrient cycle? \n", 0, 0, 0, 0, 0, "Feeding -> excretion-> respiration and breathing -> death and decomposition ", "Feeding -> death and decomposition -> excretion -> respiration and breathing ", "Respiration and breathing -> feeding ->excretion -> death and decomposition ", "Death and decomposition -> feeding -> excretion -> respiration and breathing ", "Let's see each option one by one: \nA. Illustrates the correct order of life process. \nB. There is no respiration and breathing after death and decomposition. So, B can't be an answer \nC. Energy from food is needed for respiration and breathing. Respiration and breathing come after Feeding. So, C can't be an answer \nD. Similar to B, there is no respiration and breathing after death and decomposition. So, D can't be an answer \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("64.", "Which of the following processes in the phosphate cycle DOES NOT return phosphate ions to the soil? \n", 0, 0, 0, 0, 0, "Use of fertilizers ", "Weathering of rocks ", "Cellular respiration ", "Decomposition of dead animals ", "Cellular respiration returns phosphate ions to the air, not soil. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("65.", "A previously bare land was gradually occupied by lichen and mosses, annual herbs, perennial herbs, shrubs and finally by forests. Which one of the following best describes the process indicated above? \n", 0, 0, 0, 0, 0, "Succession", "Afforestation", "Natural selection ", "Climax community ", "• Succession is the process of change in the species structure of the ecological community over time. \n• Afforestation is when new trees are planted in an area where there were no trees before. \n• Natural Selection is a process in which an organism adapts to its environment through selectively reproducing. \n• Climax community is the stable final stage of succession, in which populations of plants and animals exist in balance with each other and their environment. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("66.", "The terrestrial biome characterized by cold temperature, dry precipitation, frozen soil and inhabited by migrating birds is\n", 0, 0, 0, 0, 0, "Deserts", "Boreal forests", "Tundra", "Tropical montane forests", "Characteristics of the following terrestrial biomes: \n• Desert(hot): hot temperature, almost no precipitation, poor soil and inhabited by insects, reptiles and birds. \n• Desert(cold): cold temperature, almost no precipitation, poor soil and inhabited by insects, reptiles and birds. \n• Boreal forest: cool temperature, adequate precipitation, poor soil and inhabited by mammals, birds, insects, arachnids, etc... \n• Tundra: cold temperature, dry precipitation, frozen soil and inhabited by migrating animals \n• Tropical montane forest: warm temperature, high precipitation, fertile soil and inhabited by many animals\n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("67.", "", C2719R.C2721drawable.bio1467q, 0, 0, 0, 0, "Poor, sparse, fertile, many animals", "Fertile, many animals, poor, few animals ", "Medium, ants and spiders, poor, polar bears", "Fertile, migratory animals, poor, drought and fire adapting animals ", "Characteristics of Desert(hot) biome: \n• Temperature: hot temperature \n• Precipitation: almost none \n• Soil(L): poor soil \n• Animals(M): inhabited by insects, reptiles and birds. \nCharacteristics of Tropical montane forest: \n• Temperature: warm temperature \n• Precipitation: high precipitation \n• Soil(N): fertile soil \n• Animals(O): inhabited by many animals \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("68.", "Which one of the following explains biodiversity? \n", 0, 0, 0, 0, 0, "The large number of human races in the world", "The variability among living organisms, within species, and of ecosystem", "Large number of organisms in the same ecosystem", "The similarity and difference of organisms which live in different ecosystems", "Biodiversity is the variability of living organisms in a habitat or ecosystem. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("69.", "", C2719R.C2721drawable.bio1469q, 0, 0, 0, 0, "Area 1", "Area 2", "Area 1 and 3 ", "Area 1 and 2 ", "For a quick solution, just by looking at the table, we can deduce that: \n• Area 2 is where the number of species is almost equal which means they are almost equally successful. \n• Area 1 is where species A is way higher than the other species, meaning it is dominated by one species.\n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("70.", "A major factor in controlling the population size that helps to minimize predators and recover preys number is \n", 0, 0, 0, 0, 0, "Predation", "Disease causing organisms", "Intra-specific competition", "Inter-specific competition", "Definition: \n• Prey: An animal that is hunted and killed by another for food. \n• Predator: An animal that hunts and kills another animal. \n• Intraspecific competition is a competition between individuals from the same species. \nIn a predator-prey relationship, when the same species predators compete against each other, it leads to a decrease in the number of predators which eventually increases the preys number.\n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("71.", "", C2719R.C2721drawable.bio1471q, 0, 0, 0, 0, "Increase, decrease, remain the same", "Decrease, increase, remain the same", "Remain the same, increase, decrease", "Decrease, remains the same, increase", "Definition: \n• Natality is a birth rate of a population. \n• Mortality is a death rate of a population. \n• When natality exceeds mortality, the population number increases \n• when mortality exceeds natality, the population decreases \n• when mortality equals natality, the population remains the same. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("72.", "Suppose a heterozygous brown eye father is married with a blue eye mother. What would be the proportion of homozygous children for eye color? (Hint: brown is dominant over blue) \n", 0, 0, 0, 0, 0, "100%", "50%", "25% ", "75% ", "", "b", C2719R.C2721drawable.bio1472e, 1, this.f489b));
        arrayList.add(new questions("73.", "", C2719R.C2721drawable.bio1473q, 0, 0, 0, 0, "X and Y cannot be compared because each of them grows differently with incomparable proportion", "X is exponential growth because the numbers increase by the same fixed amount in each time period and Y is arithmetic growth because the population doubles in each time period", "Both X and Y are exponential growth since each of them increase regularly without interruption", "X is arithmetic growth because the numbers increase by the same fixed amount in each time period and Y is exponential growth because the population doubles in each time period", "• In arithmetic growth, a constant amount is being added. E.g., In population X, 5 is added in each time period. \n• In exponential growth, the amount increases by a constant rate. E.g., In population Y, the population is doubled in each time period. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("74.", "Drosophila melanogaster are convenient experimental animals in genetics. Because they \n", 0, 0, 0, 0, 0, "Are small animals with a short life cycle", "Have 23 pairs of chromosomes per cell", "Have chromosomes that can't be easily detected", "Are too cheap to breed in large numbers", "Drosophila melanogaster is a species of fly. They are convenient experimental animals in genetics. Because they \n• are small animals with a short life cycle (2 weeks). \n• have 4 pairs of chromosomes per cell \n• have chromosomes that are large and easily observed. \n• are cheap, easy to breed and keep in large numbers. \nThe correct answer is A and D. But since we have to pick one answer just like the exam, we picked choice A. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("75.", "How does crossing over during meiosis bring variation in species? By \n", 0, 0, 0, 0, 0, "Combination of genes in the gametes that are not found in either parent", "Increasing the amount of genes in one of the parents during meiosis", "Creating genes that are not found in both parents due to meiosis ", "Combining sex and somatic cell chromosomes ", "In meiosis, a different combination of maternal and paternal chromosome results in a genetic variation which are not found in either parent. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("76.", "", C2719R.C2721drawable.bio1476q, 0, 0, 0, 0, "X involves inbreeding and Z involves cross breeding", "X involves cross breeding and Z involves inbreeding", "Both X and Z represent inbreeding", "X represents natural selection and Z represents artificial selection", "X involves inbreeding \nY involves cross breeding, it is an in-bred animal \nZ involves cross breeding, it is a cross-bred animal \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("77.", "Consider the DNA molecule containing: \nStrand 1: TAC G TA \nStrand 2: AT G CA T \nWhat will be the sequence of the new DNA if the DNA replicates semi-conservatively? \n", 0, 0, 0, 0, 0, "TACGTA \nATGCAU ", "ATGCAT \nUACGUA ", "TACGTA \nATGCAT ", "ATGCAT \nATGCAT ", "The new formed DNA will be identical to the original molecule and the strands are complementary to each other meaning: \n• Adenine(A) pairs with thymine(T) \n• Cytosine(C) pairs with guanine(G) \nSo, the correct answer is: \nTACGTA \nATGCAT \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("78.", "How does our body synthesize some of the amino acids in our body? From \n", 0, 0, 0, 0, 0, "Intermediate molecules of different pathways", "Fatty acids we consume ", "Biological breakdown of our own cells", "Breaking down of pre-existing proteins", "Some proteins are made in our body by a process called Transamination. In this process, an amino group is transferred from amino acids to form new amino acids. i.e., by breaking down pre-existing proteins to form new proteins (amino acids). \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("79.", "This item is based on the following list of events during cloning of an insulin gene into plasmid. \nI. Obtaining insulin producing cells and plasmid from organisms \nII. Cutting the insulin gene and plasmid \nIII. X \nIV. Inserting the recombinant plasmid into bacteria \nV. production of insulin by bacteria \nWhich one of the following best represents the steps listed as \"X\"? \n", 0, 0, 0, 0, 0, "Inserting the insulin gene into a bacterium", "Inserting the open plasmid into a bacterium", "Combining the insulin gene into the opened plasmid ", "Fusing the insulin and plasmid genes to the cell wall of bacteria ", "In the production of human insulin using bacteria, it involves the following step in order: \n1. Bacteria plasmids are removed and opened \n2. The gene, that controls the production of human insulin is cut from the donor DNA \n3. The gene will be transferred to the bacteria plasmid \n4. The bacteria will take up the modified plasmid \n5. The bacteria will start to produce insulin. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("80.", "During translation the ", 0, 0, 0, 0, 0, "Ribosome moves forward over two codons at a time", "tRNA serves as a template of the DNA molecule", "tRNA with complementary anticodon binds on the codon of mRNA", "mRNA brings amino acids into the ribosomes", "The ribosome reads the mRNA(messenger RNA) code and assembles the amino acids carried by tRNA(transfer RNA) into a protein; this is called translation. In translation, the anticodon on a tRNA molecule binds to the complementary sequence of mRNA. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("81.", "If one base in the six triplets of the gene coding for one of the four polypeptides in the hemoglobin molecule alters the triplet from GAG to GTG, which one of the following biological terms best describes the above phenomenon? \n", 0, 0, 0, 0, 0, "Cloning", "Mutation ", "Transcription ", "Translation ", "The above describes a substitution mutation, it is a type of mutation where one base pair is replaced by a different base pair. In this case, GAG is replaced by GTG. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("82.", "Which one of the following is the basic characteristic of mutation? It is \n", 0, 0, 0, 0, 0, "Planned", "Spontaneous", "Expected", "Regular", "A mutation is a change in the genetic material of a cell. It is a spontaneous random accident during DNA replication. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("83.", "The theory that suggests \"life can evolve autonomously from non-living objects\" is known as \n", 0, 0, 0, 0, 0, "Spontaneous generation theory", "Cosmozoan theory", "Eternity theory", "Biochemical theory", "• Spontaneous generation theory states that living things could arise from non-living things. \n• Cosmozoan theory states that life was brought to the earth from other universal bodies such as meteorites. \n• Eternity of life theory states that living things have always existed on earth and shall continue to exist forever. \n• Biochemical theory states that life could have arisen through a chemical reaction that produced organic molecules, which in turn organized to form the first living system or cell. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("84.", "Which one of the following is true about neo-Darwinian theory? \n", 0, 0, 0, 0, 0, "All species tend to produce more offspring that can possibly survive", "There is a natural variation in features and variations which are heritable", "Development of new feature is important for survival", "It takes into account genetics and animal behavior to understand evolution", "Neo-Darwinism is the modern version of Charles Darwin's theory of evolution by natural selection and incorporates Gregor Mendel's laws of genetics. It states that: \n• individuals with advantageous alleles will survive in great numbers compared to others. \n• mutations are important in making variations into populations. They can be advantageous, neutral and disadvantages. \n• In addition to genetics, it also accounts animal behavior to understand evolution. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("85.", "Which one of the following statements describes the evolutionary theory of Lamarck? ", 0, 0, 0, 0, 0, "Structures commonly used become more developed", "Acquired characteristics cannot be inherited", "Species started complex and gradually become simple", "Origin of species happens only through natural selection", "Lamarckism states \"Use and disuse\" meaning individuals lose characteristics they do not use and develop characteristics they often use. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("86.", "If organisms share very similar molecules such as DNA, then they must be closely related evolutionarily. Which evidence of evolution supports the above information? \n", 0, 0, 0, 0, 0, "Comparative anatomy ", "Comparative embryology ", "Comparative biochemistry ", "Comparative physiology ", "• Comparative anatomy states that organisms with similar anatomical features are closely related evolutionary. \n• Comparative embryology compares and contrasts species embryos in relation to how related they are. \n• Comparative biochemistry states that organisms with similar molecules such as DNA are closely related evolutionary. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("87.", "Which one of the following CANNOT be used as evidence of evolution through paleontology? \n", 0, 0, 0, 0, 0, "Teeth ", "Stomach ", "Bones ", "Hair ", "Paleontology is the study of ancient life that involves the analysis of plant and animal fossils. Bones, teeth, hair, hardened shell, impressions of animals or plants serve as evidence of Paleontology. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("88.", "The process in which individuals with a particular heritable trait survive better than the other is \n", 0, 0, 0, 0, 0, "Evolution", "Adaptation", "Natural selection", "Selective breeding", "Natural selection is the process whereby organisms better adapted to their environment tend to survive and produce more offspring. \n• It states organisms that possess heritable traits that enable them to better adapt to their environment will be more likely to survive, reproduce, and pass more of their genes on to the next generation than others.\n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("89.", "Which type of selection favors individuals at both extremes of a range to have some advantage over those displaying the mean value? \n", 0, 0, 0, 0, 0, "Directional selection", "Stabilizing selection ", "Disruptive selection", "Natural selection ", "• Directional selection occurs when individuals at one extreme could have an advantage whereas those at the other extreme have a disadvantage. \n• Stabilizing selection occurs when individuals at both extreme ends have disadvantages over those at a mean value \n• Disruptive selection occurs when individuals at both extreme ends have advantages over those at mean value. It is the opposite of stabilizing selection.\n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("90.", "Which one of the following is true about the human evolution? \n", 0, 0, 0, 0, 0, "Humans evolved from chimpanzees", "Humans and chimpanzees both evolved from a common ancestor", "Humans evolved from great apes", "Humans evolved from different line of evolution than great apes", "According to human evolution, human and chimpanzee both evolved from a common ancestor, that lived about 6 million years ago. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("91.", "Which one of the following is true about the importance of Lucy in resolving debates about human evolution? \n", 0, 0, 0, 0, 0, "Lucy had a brain size of 1.8% of her body mass", "Big brains came before bipedalism", "Lucy was partially an arboreal primate", "Bipedalism came before big brains", "Lucy was bipedal and had the same brain size as a chimpanzee (small brain size). This implies bipedalism came before big brains. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("92.", "Which one of the following can best explain behavior? It is\n", 0, 0, 0, 0, 0, "The tendency for parts of plants to grow towards light", "The coordinated response of an organism to an internal or external stimuli\n", "A cell or group of cells that receives and processes stimuli\n", "The actions or reactions of a person or animal in response to external or internal stimuli", "Behavior is the coordinated response of a living organism to internal and external stimuli. E.g. \n• The tendency for parts of plants to grow towards light \n• The actions or reactions of a person or animal in response to stimuli. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("93.", "The quick withdrawal of your hand from a hotplate is an example of \n", 0, 0, 0, 0, 0, "Innate behavior", "Fixed action pattern", "Key stimulus", "Biological clock", "The quick withdrawal of your hand from a hot surface is an example of reflex action, which is an innate behavior. \n", "a", 0, 1, this.f489b));
        arrayList.add(new questions("94.", "Which one of the following processes describes a biological clock? \n", 0, 0, 0, 0, 0, "The growing of plants towards light", "Removal of one's thumb from hot objects quickly", "Kinesis and taxes of woodlice and other simple animals", "Circannual migration of birds from temperate to tropical areas", "A biological clock is an innate mechanism of an organism that regulates rhythmic and periodic cycles. Living organisms show daily, monthly and yearly cyclical changes. E.g. \n• sleep-wake cycle on a daily basis \n• migration of birds from temperate to tropical areas on an annual basis. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("95.", "Identify learned behavior from the following:", 0, 0, 0, 0, 0, "Honey bee making honey", "Dog trained to hunt", "Ants making nests", "Child withdraws hand from hot things", "A learned behavior is a behavior that an organism develops as a result of experience. \nE.g., A dog trained to hunt \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("96.", "The behavior which trainers look, if modified, could lead to the desired behavior and reward such a behavior is \n", 0, 0, 0, 0, 0, "Instinct", "Innate", "Operant", "Reflex", "Operant conditioning is a process of changing behavior by rewarding or punishing a subject, each time an action is performed until the subject associates the action with pleasure or distress. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("97.", "Which one of the following examples of behavior describes when an animal stops responding to stimulus or cue after a period of repeated exposure? \n", 0, 0, 0, 0, 0, "Reflex ", "Imprinting ", "Conditioning ", "Habituation ", "Habituation is a form of learning in which an organism decreases or ceases its responses to a stimulus after being repeated many times. \n", "d", 0, 1, this.f489b));
        arrayList.add(new questions("98.", "A police man trained a dog on how to find explosive materials through sniffing; on another instant the same police man observed a week old puppy following him on the roadside. Which one of the following is correct about the behaviors of the animals in the observation? \n", 0, 0, 0, 0, 0, "Both of the cases indicate natural behavior of the animals", "The first case is genetically encoded and the second is adaptive", "The first cases develop through trial and the second genetically coded", "Both of the cases indicate learned behavior of the animals", "• A trained dog sniffing explosive materials is a learned behavior. Learned through trial and error. \n• A week-old puppy following what it sees is likely an innate behavior, which is genetically coded. \n", "c", 0, 1, this.f489b));
        arrayList.add(new questions("99.", "Which one of the following behaviors is a courtship behavior? \n", 0, 0, 0, 0, 0, "Scent marking", "Touch ", "Defending a den ", "Ritual fighting ", "Courtship behavior is an activity in which an animal attempts to attract a mate that results in mating and eventual reproduction. E.g. \n• The use of pheromone (sex pheromone) by some insects to attract mating partners. \n• The use of touch by painted turtles. \n", "b", 0, 1, this.f489b));
        arrayList.add(new questions("100.", "The Ethiopian wolf (Canis simensis) lives and hunt in packs. During patrolling their habitat, both male and female wolves of the group maintain their area with urine containing pheromone. This pattern of behavior best exemplifies. \n", 0, 0, 0, 0, 0, "Territorial behavior", "Courtship behavior", "Learned behavior", "Operant behavior", "Territorial behavior is a method in which animals protects their territory. E.g. \n• An Ethiopian wolf marking their territory with urine containing pheromone (territorial pheromone). \n• Loud calls of monkeys \n", "a", 0, 1, this.f489b));
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
        this.f490tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    bio2013.this.timer.setVisibility(0);
                    bio2013.this.timer.setText(format);
                }

                public void onFinish() {
                    bio2013.this.scr.setVisibility(8);
                    bio2013.this.chr.stop();
                    bio2013.this.toolbar.setVisibility(8);
                    bio2013.this.Relative.setBackgroundColor(-7829368);
                    bio2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2013.this.getBaseContext());
                    int unused = bio2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = bio2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = bio2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = bio2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = bio2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = bio2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = bio2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = bio2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = bio2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = bio2013.this.highscoreBio2013 = defaultSharedPreferences.getInt("bio2013hs", 0);
                    int access$600 = bio2013.this.part1 + bio2013.this.part2 + bio2013.this.part3 + bio2013.this.part4 + bio2013.this.part5 + bio2013.this.part6 + bio2013.this.part7 + bio2013.this.part8 + bio2013.this.part9;
                    String str = "bio2013hs";
                    int unused11 = bio2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = bio2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = bio2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = bio2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = bio2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = bio2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = bio2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = bio2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = bio2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = bio2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1600 = bio2013.this.answered1 + bio2013.this.answered2 + bio2013.this.answered3 + bio2013.this.answered4 + bio2013.this.answered5 + bio2013.this.answered6 + bio2013.this.answered7 + bio2013.this.answered8 + bio2013.this.answered9;
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
                    TextView access$2600 = bio2013.this.resultText;
                    access$2600.setText(access$600 + "/100");
                    bio2013.this.progressbar.setProgress(access$600);
                    bio2013.this.progressbar.setMax(100);
                    edit.putInt("ans1", 0);
                    edit.putInt("ans2", 0);
                    edit.putInt("ans3", 0);
                    edit.putInt("ans4", 0);
                    edit.putInt("ans5", 0);
                    edit.putInt("ans6", 0);
                    edit.putInt("ans7", 0);
                    edit.putInt("ans8", 0);
                    edit.putInt("ans9", 0);
                    if (access$600 > bio2013.this.highscoreBio2013) {
                        edit.putInt(str, access$600);
                    }
                    long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2013.this.chr.getBase()) / 1000;
                    if (bio2013.this.mode.booleanValue()) {
                        Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                        int i = (access$600 * 100) / 100;
                        DecimalFormat decimalFormat = new DecimalFormat("##.##");
                        String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                        String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                        long j = defaultSharedPreferences.getLong("date1bio131", 0);
                        long j2 = defaultSharedPreferences.getLong("date1bio132", 0);
                        long j3 = defaultSharedPreferences.getLong("date1bio133", 0);
                        long j4 = defaultSharedPreferences.getLong("date1bio134", 0);
                        Long l = valueOf;
                        String str2 = f2;
                        long j5 = defaultSharedPreferences.getLong("date1bio135", 0);
                        long j6 = defaultSharedPreferences.getLong("date1bio136", 0);
                        long j7 = defaultSharedPreferences.getLong("date1bio137", 0);
                        long j8 = defaultSharedPreferences.getLong("date1bio138", 0);
                        long j9 = defaultSharedPreferences.getLong("date1bio139", 0);
                        long j10 = defaultSharedPreferences.getLong("date1bio1310", 0);
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
                            edit.putString("scorebio131", str2);
                            edit.putLong("date1bio131", l.longValue());
                        } else {
                            String str3 = str2;
                            if (date11.compareTo(date2) == 0) {
                                edit.putString("scorebio132", str3);
                                edit.putLong("date1bio132", l.longValue());
                            } else if (date11.compareTo(date3) == 0) {
                                edit.putString("scorebio133", str3);
                                edit.putLong("date1bio133", l.longValue());
                            } else if (date11.compareTo(date4) == 0) {
                                edit.putString("scorebio134", str3);
                                edit.putLong("date1bio134", l.longValue());
                            } else if (date11.compareTo(date5) == 0) {
                                edit.putString("scorebio135", str3);
                                edit.putLong("date1bio135", l.longValue());
                            } else if (date11.compareTo(date6) == 0) {
                                edit.putString("scorebio136", str3);
                                edit.putLong("date1bio136", l.longValue());
                            } else if (date11.compareTo(date7) == 0) {
                                edit.putString("scorebio137", str3);
                                edit.putLong("date1bio137", l.longValue());
                            } else if (date11.compareTo(date8) == 0) {
                                edit.putString("scorebio138", str3);
                                edit.putLong("date1bio138", l.longValue());
                            } else if (date11.compareTo(date9) == 0) {
                                edit.putString("scorebio139", str3);
                                edit.putLong("date1bio139", l.longValue());
                            } else if (date11.compareTo(date10) == 0) {
                                edit.putString("scorebio1310", str3);
                                edit.putLong("date1bio1310", l.longValue());
                            }
                        }
                        long j11 = defaultSharedPreferences.getLong("datebio131", 0);
                        long j12 = defaultSharedPreferences.getLong("datebio132", 0);
                        long j13 = defaultSharedPreferences.getLong("datebio133", 0);
                        long j14 = defaultSharedPreferences.getLong("datebio134", 0);
                        long j15 = defaultSharedPreferences.getLong("datebio135", 0);
                        long j16 = defaultSharedPreferences.getLong("datebio136", 0);
                        long j17 = defaultSharedPreferences.getLong("datebio137", 0);
                        long j18 = defaultSharedPreferences.getLong("datebio138", 0);
                        long j19 = defaultSharedPreferences.getLong("datebio139", 0);
                        long j20 = defaultSharedPreferences.getLong("datebio1310", 0);
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
                            edit.putString("iScorebio131", f);
                            edit.putLong("datebio131", l.longValue());
                        } else if (date22.compareTo(date13) == 0) {
                            edit.putString("iScorebio132", f);
                            edit.putLong("datebio132", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            edit.putString("iScorebio133", f);
                            edit.putLong("datebio133", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            edit.putString("iScorebio134", f);
                            edit.putLong("datebio134", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            edit.putString("iScorebio135", f);
                            edit.putLong("datebio135", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            edit.putString("iScorebio136", f);
                            edit.putLong("datebio136", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            edit.putString("iScorebio137", f);
                            edit.putLong("datebio137", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            edit.putString("iScorebio138", f);
                            edit.putLong("datebio138", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            edit.putString("iScorebio139", f);
                            edit.putLong("datebio139", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            edit.putString("iScorebio1310", f);
                            edit.putLong("datebio1310", l.longValue());
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
                SharedPreferences.Editor editor;
                SharedPreferences.Editor editor2;
                SharedPreferences.Editor editor3;
                SharedPreferences.Editor editor4;
                bio2013.this.scr.setVisibility(8);
                bio2013.this.chr.stop();
                bio2013.this.toolbar.setVisibility(8);
                bio2013.this.Relative.setBackgroundColor(-7829368);
                bio2013.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(bio2013.this.getBaseContext());
                int unused = bio2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = bio2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = bio2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = bio2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = bio2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = bio2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = bio2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = bio2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = bio2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = bio2013.this.highscoreBio2013 = defaultSharedPreferences.getInt("bio2013hs", 0);
                int access$600 = bio2013.this.part1 + bio2013.this.part2 + bio2013.this.part3 + bio2013.this.part4 + bio2013.this.part5 + bio2013.this.part6 + bio2013.this.part7 + bio2013.this.part8 + bio2013.this.part9;
                bio2013.this.resultText.setText(String.valueOf(access$600));
                bio2013.this.progressbar.setProgress(access$600);
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
                int unused11 = bio2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                int unused12 = bio2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                int unused13 = bio2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                int unused14 = bio2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                int unused15 = bio2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                int unused16 = bio2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                int unused17 = bio2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                int unused18 = bio2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                int unused19 = bio2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                int unused20 = bio2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                int access$1600 = bio2013.this.answered1 + bio2013.this.answered2 + bio2013.this.answered3 + bio2013.this.answered4 + bio2013.this.answered5 + bio2013.this.answered6 + bio2013.this.answered7 + bio2013.this.answered8 + bio2013.this.answered9;
                edit.putInt("answered1", 0);
                edit.putInt("answered2", 0);
                edit.putInt("answered3", 0);
                edit.putInt("answered4", 0);
                edit.putInt("answered5", 0);
                edit.putInt("answered6", 0);
                edit.putInt("answered7", 0);
                edit.putInt("answered8", 0);
                edit.putInt("answered9", 0);
                if (access$600 > bio2013.this.highscoreBio2013) {
                    edit.putInt("bio2013hs", access$600);
                }
                long elapsedRealtime = (SystemClock.elapsedRealtime() - bio2013.this.chr.getBase()) / 1000;
                defaultSharedPreferences.getFloat("iScorebio13", 0.0f);
                String str = "datebio139";
                String str2 = "datebio138";
                String str3 = "datebio137";
                String str4 = "datebio136";
                String str5 = "datebio135";
                String str6 = "datebio134";
                String str7 = "datebio133";
                String str8 = "datebio132";
                String str9 = "datebio131";
                SharedPreferences.Editor editor5 = edit;
                String str10 = "date1bio1310";
                String str11 = "date1bio139";
                if (bio2013.this.mode.booleanValue()) {
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1bio131", 0);
                    String str12 = "date1bio131";
                    String str13 = f;
                    long j2 = defaultSharedPreferences.getLong("date1bio132", 0);
                    Long l = valueOf;
                    String str14 = f2;
                    long j3 = defaultSharedPreferences.getLong("date1bio133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1bio134", 0);
                    String str15 = "date1bio134";
                    String str16 = "date1bio133";
                    String str17 = "date1bio135";
                    long j5 = defaultSharedPreferences.getLong("date1bio135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1bio137", 0);
                    String str18 = "date1bio136";
                    String str19 = "date1bio138";
                    long j7 = defaultSharedPreferences.getLong("date1bio138", 0);
                    long j8 = defaultSharedPreferences.getLong(str11, 0);
                    long j9 = defaultSharedPreferences.getLong(str10, 0);
                    Date date = new Date(j);
                    Date date2 = new Date(j2);
                    Date date3 = new Date(j3);
                    Date date4 = new Date(j4);
                    Date date5 = new Date(j5);
                    Date date6 = new Date(defaultSharedPreferences.getLong("date1bio136", 0));
                    Date date7 = new Date(j6);
                    Date date8 = new Date(j7);
                    String str20 = "date1bio137";
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
                        editor3.putString("scorebio131", str14);
                        editor3.putLong(str12, l.longValue());
                    } else {
                        editor3 = editor5;
                        String str21 = str14;
                        if (date11.compareTo(date2) == 0) {
                            editor3.putString("scorebio132", str21);
                            editor3.putLong("date1bio132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor3.putString("scorebio133", str21);
                            editor3.putLong(str16, l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor3.putString("scorebio134", str21);
                            editor3.putLong(str15, l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor3.putString("scorebio135", str21);
                            editor3.putLong(str17, l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor3.putString("scorebio136", str21);
                            editor3.putLong(str18, l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor3.putString("scorebio137", str21);
                            editor3.putLong(str20, l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor3.putString("scorebio138", str21);
                            editor3.putLong(str19, l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor3.putString("scorebio139", str21);
                            editor3.putLong(str11, l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor3.putString("scorebio1310", str21);
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
                    long j18 = defaultSharedPreferences.getLong("datebio1310", 0);
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
                        editor4.putString("iScorebio131", str13);
                        editor4.putLong(str22, l.longValue());
                    } else {
                        editor4 = editor6;
                        String str30 = str13;
                        if (date24.compareTo(date13) == 0) {
                            editor4.putString("iScorebio132", str30);
                            editor4.putLong(str23, l.longValue());
                        } else if (date24.compareTo(date14) == 0) {
                            editor4.putString("iScorebio133", str30);
                            editor4.putLong(str29, l.longValue());
                        } else if (date24.compareTo(date15) == 0) {
                            editor4.putString("iScorebio134", str30);
                            editor4.putLong(str6, l.longValue());
                        } else if (date24.compareTo(date16) == 0) {
                            editor4.putString("iScorebio135", str30);
                            editor4.putLong(str28, l.longValue());
                        } else if (date24.compareTo(date23) == 0) {
                            editor4.putString("iScorebio136", str30);
                            editor4.putLong(str27, l.longValue());
                        } else if (date24.compareTo(date18) == 0) {
                            editor4.putString("iScorebio137", str30);
                            editor4.putLong(str3, l.longValue());
                        } else if (date24.compareTo(date20) == 0) {
                            editor4.putString("iScorebio138", str30);
                            editor4.putLong(str2, l.longValue());
                        } else if (date24.compareTo(date21) == 0) {
                            editor4.putString("iScorebio139", str30);
                            editor4.putLong(str, l.longValue());
                        } else if (date24.compareTo(date22) == 0) {
                            editor4.putString("iScorebio1310", str30);
                            editor4.putLong("datebio1310", l.longValue());
                        }
                    }
                    editor = editor4;
                } else {
                    String str31 = str;
                    String str32 = "date1bio134";
                    String str33 = "date1bio133";
                    String str34 = str2;
                    String str35 = str3;
                    String str36 = str5;
                    String str37 = str6;
                    String str38 = str7;
                    String str39 = str8;
                    String str40 = str10;
                    String str41 = str11;
                    String str42 = "date1bio135";
                    String str43 = "date1bio136";
                    String str44 = "date1bio137";
                    Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i2 = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                    String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                    String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                    long j19 = defaultSharedPreferences.getLong("date1bio131", 0);
                    String str45 = "date1bio131";
                    String str46 = f3;
                    String str47 = f4;
                    long j20 = defaultSharedPreferences.getLong(str33, 0);
                    long j21 = defaultSharedPreferences.getLong(str32, 0);
                    String str48 = str33;
                    String str49 = str32;
                    long j22 = defaultSharedPreferences.getLong(str42, 0);
                    long j23 = defaultSharedPreferences.getLong(str43, 0);
                    String str50 = str42;
                    String str51 = str43;
                    long j24 = defaultSharedPreferences.getLong(str44, 0);
                    String str52 = "date1bio138";
                    long j25 = defaultSharedPreferences.getLong(str52, 0);
                    long j26 = defaultSharedPreferences.getLong(str41, 0);
                    long j27 = defaultSharedPreferences.getLong(str40, 0);
                    Date date25 = new Date(j19);
                    Date date26 = new Date(defaultSharedPreferences.getLong("date1bio132", 0));
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
                        editor2.putString("scorebio131", str47);
                        editor2.putLong(str45, valueOf2.longValue());
                    } else {
                        String str55 = str47;
                        editor2 = editor5;
                        if (date36.compareTo(date26) == 0) {
                            editor2.putString("scorebio132", str55);
                            editor2.putLong("date1bio132", valueOf2.longValue());
                        } else if (date36.compareTo(date27) == 0) {
                            editor2.putString("scorebio133", str55);
                            editor2.putLong(str48, valueOf2.longValue());
                        } else if (date36.compareTo(date28) == 0) {
                            editor2.putString("scorebio134", str55);
                            editor2.putLong(str49, valueOf2.longValue());
                        } else if (date36.compareTo(date29) == 0) {
                            editor2.putString("scorebio135", str55);
                            editor2.putLong(str50, valueOf2.longValue());
                        } else if (date36.compareTo(date30) == 0) {
                            editor2.putString("scorebio136", str55);
                            editor2.putLong(str51, valueOf2.longValue());
                        } else if (date36.compareTo(date31) == 0) {
                            editor2.putString("scorebio137", str55);
                            editor2.putLong(str44, valueOf2.longValue());
                        } else if (date36.compareTo(date35) == 0) {
                            editor2.putString("scorebio138", str55);
                            editor2.putLong(str52, valueOf2.longValue());
                        } else if (date36.compareTo(date33) == 0) {
                            editor2.putString("scorebio139", str55);
                            editor2.putLong(str54, valueOf2.longValue());
                        } else if (date36.compareTo(date34) == 0) {
                            editor2.putString("scorebio1310", str55);
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
                    long j33 = sharedPreferences3.getLong(str4, 0);
                    long j34 = sharedPreferences3.getLong(str35, 0);
                    long j35 = sharedPreferences3.getLong(str34, 0);
                    long j36 = sharedPreferences3.getLong(str31, 0);
                    long j37 = sharedPreferences3.getLong("datebio1310", 0);
                    Date date37 = new Date(j28);
                    Date date38 = new Date(j29);
                    Date date39 = new Date(j30);
                    Date date40 = new Date(j31);
                    Date date41 = new Date(j32);
                    Date date42 = new Date(j33);
                    Date date43 = new Date(j34);
                    Date date44 = new Date(j35);
                    Date date45 = new Date(j36);
                    Date date46 = new Date(j37);
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
                        editor.putString("iScorebio131", str46);
                        editor.putLong(str56, valueOf2.longValue());
                    } else {
                        String str65 = str46;
                        editor = editor7;
                        if (date47.compareTo(date38) == 0) {
                            editor.putString("iScorebio132", str65);
                            editor.putLong(str59, valueOf2.longValue());
                        } else if (date47.compareTo(date39) == 0) {
                            editor.putString("iScorebio133", str65);
                            editor.putLong(str61, valueOf2.longValue());
                        } else if (date47.compareTo(date40) == 0) {
                            editor.putString("iScorebio134", str65);
                            editor.putLong(str62, valueOf2.longValue());
                        } else if (date47.compareTo(date41) == 0) {
                            editor.putString("iScorebio135", str65);
                            editor.putLong(str64, valueOf2.longValue());
                        } else if (date47.compareTo(date42) == 0) {
                            editor.putString("iScorebio136", str65);
                            editor.putLong(str4, valueOf2.longValue());
                        } else if (date47.compareTo(date43) == 0) {
                            editor.putString("iScorebio137", str65);
                            editor.putLong(str35, valueOf2.longValue());
                        } else if (date47.compareTo(date44) == 0) {
                            editor.putString("iScorebio138", str65);
                            editor.putLong(str34, valueOf2.longValue());
                        } else if (date47.compareTo(date45) == 0) {
                            editor.putString("iScorebio139", str65);
                            editor.putLong(str31, valueOf2.longValue());
                        } else if (date47.compareTo(date46) == 0) {
                            editor.putString("iScorebio1310", str65);
                            editor.putLong("datebio1310", valueOf2.longValue());
                        }
                    }
                }
                editor.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2013.this.scr.setVisibility(8);
                bio2013.this.chr.stop();
                bio2013.this.toolbar.setVisibility(8);
                bio2013.this.Relative.setBackgroundColor(bio2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                bio2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bio2013.this.scr.setVisibility(0);
                bio2013.this.toolbar.setVisibility(0);
                bio2013.this.telegram_layout.setVisibility(8);
                bio2013.this.chr.start();
                bio2013.this.Relative.setBackgroundColor(bio2013.this.getResources().getColor(C2719R.C2720color.white));
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
                bio2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
