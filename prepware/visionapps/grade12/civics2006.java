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

public class civics2006 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f501b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2006;
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
    private Toolbar f502tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2006);
        this.f501b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2006);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2006);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which countries benefit most from the new world order of globalization? ", 0, 0, 0, 0, 0, "Developing countries", "Developed countries ", "Under developed countries ", "Less developed countries", "Developed Countries of the world are the most benefited from the new world order of globalization. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("2.", "What is the principle of constitutional law that protects the life, liberty and property of a person? ", 0, 0, 0, 0, 0, "Criminal law ", "Civil law ", "Due process of law", "Procedural law ", "Due process of Law is the principle of constitution which provides No person shall be deprived of life, Liberty or property without due process of the law.", "c", 0, 1, this.f501b));
        arrayList.add(new questions("3.", "Which of the following is a name given to human needs for food, Shelter and security? ", 0, 0, 0, 0, 0, "Maintenance needs ", "Transformational needs ", "Societal needs ", "Actualization needs ", "Societal needs are name given to human needs for shelter and security ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("4.", "An amendment to a constitution is ", 0, 0, 0, 0, 0, "Replacing old constitution by a new one. ", "Additional article to a constitution. ", "Declaring a constitution null and void. ", "Emphasizing an article of a constitution. ", "An amendment to a constitution is additional article to a constitution ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("5.", "A person who refuses to give military service on grounds of religion or other belief is ", 0, 0, 0, 0, 0, "Conscientious objector ", "Whistle blower ", "Unpatriotic citizen ", "Secret intelligence officer ", "A Conscientious Objector is an individual who has claimed the right to refuse to perform military service on the ground of freedom of thought, conscience and religious objector states only considered in the context of military conscription and is not applicable to volunteer military forces ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("6.", "Who was the American Civil Rights Activist sent to prison for refusing to give up her seat in a bus for a white man? ", 0, 0, 0, 0, 0, "Rosa Luxemburg ", "Patricia Goldman ", "Clara Zeitkin", "Rosa Parks ", "Rosa Louis McCauley Parks was Afro- American civil right activist, whom the USA Congress called the first lady of civil rights and mother of freedom movement. She refused to obey bus drivers order that she giving her seat to the white passenger. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("7.", "The ability to hear with unpleasant and annoying situation is known as ", 0, 0, 0, 0, 0, "Assertiveness ", "Arrogance ", "Lenience", "Tolerance ", "The ability to bear unpleasant and annoying situation is known as Arrogance ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("8.", "Which of the following is one of the key institutions that fashioned globalization? ", 0, 0, 0, 0, 0, "Amnesty International. ", "Transparency International. ", "International Labor Organization. ", "International Monetary Fund.", "International Monetary Fund (IMF) and world Bank (WB) are the key institution that fashioned Globalization ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("9.", "Which of the following traits is expected from judges for justice to prevail? ", 0, 0, 0, 0, 0, "Compassion ", "Sympathy ", "Kindness ", "Impartiality ", "Impartiality is one of the traits expected force judge for justice to prevail ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("10.", "Which of the following characteristics could be a guarantee for individual freedom? ", 0, 0, 0, 0, 0, "Rule of law ", "Right to trial ", "Trial by jury ", "Human rights ", "Human right could be a guarantee for the individual freedom, ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("11.", "Who presents a nominee for the post of Prime Minister of the FDRE?", 0, 0, 0, 0, 0, "The speaker of the House of Peoples' Representatives. ", "The speaker of the House of Federation. ", "The Opposition in the House of Peoples' Representatives. ", "The majority party in the House of People's Representatives. ", "The majority party in the House of People Representatives are presents a nominee for the post of Prime Minister of EDRE. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("12.", "Which of the following is true? ", 0, 0, 0, 0, 0, "There is no relationship between saving and development. ", "Idir and Iqub are backward saving mechanisms that do not help Individuals improve their lives. ", "Saving plays a crucial role in the development endeavors of countries like Ethiopia. ", "World Bank is the only global monetary organization. ", "Saving play a crucial role in the development endeavors of the countries like Ethiopia. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("13.", "Which of the following Was the most negative experience in the period of the derg? ", 0, 0, 0, 0, 0, "\"Qey Shibir\" ", "\"Meret Le arashu!\" ", "\"Idget Behibret\" ", "\"Meserete Timihrt\" ", "Qeyshibir (Red Terror) was the most negative experience during the period of Derg. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("14.", "In the FDRE, interpreting law is the responsibility of the judiciary organ, whereas interpreting the constitution is the responsibility of: ", 0, 0, 0, 0, 0, "The Executive Organ ", "The Legislative Organ ", "The House of People Representatives ", "The House of Federation ", "In the Federal Democratic Republic of Ethiopia, interpreting law is the responsibility of the judiciary organ, whereas the House of Federation interpreting the Constitution of the FDRE. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("15.", "The American Foreign Secretary, John Kerry facilitated a peace talk between Israel and Palestine recently. What was the role of Mr. Kerry?", 0, 0, 0, 0, 0, "Arbitration ", "Negotiation ", "Mediation ", "Resolution ", "The term mediation broadly refers to any instance in which a third party help other to reach agreement of foreign secretary John Kerry mediate a peace take between Israel and Palestine recently. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("16.", "Which of the following is the correct order that should be followed while formulating a democratic constitution? ", 0, 0, 0, 0, 0, "Drafting ---Ratification ---Discussion ", "Drafting ---Discussion --- Ratification ", "Ratification --- Discussion---Drafting.", "Discussion --- Drafting --- Ratification. ", "The correct order of formulating a democratic constitution is first discussion then drafting and finally ratification (discussion -> drafting-> ratification) ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("17.", "Which of the following is an inclusive term? ", 0, 0, 0, 0, 0, "Good governance ", "Transparency ", "Accountability", "Responsibility ", "Good governance is inclusive terms because it includes the rule of law, transparency, accountability, Responsibility, effectiveness, Participatory and others. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("18.", "Which of the following countries combine both presidential and parliamentary government systems? ", 0, 0, 0, 0, 0, "USA and England ", "Ethiopia and USA ", "Russia and South Africa", "South Africa and USA ", "Russia and South Africa are the countries that who combine both Presidential and Parliamentary government system in the world. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("19.", "Which one of the following government system differs from others? ", 0, 0, 0, 0, 0, "Unlimited government ", "Totalitarian government ", "Unitary government ", "Federal government ", "The unlimited type of government system includes totalitarian and unitary governments.", "c", 0, 1, this.f501b));
        arrayList.add(new questions("20.", "Which of the following is correct according to article 10 of the FDRE constitution? ", 0, 0, 0, 0, 0, "Human rights are inviolable and inalienable. ", "Human rights do not emanate from the nature of mankind. ", "Human rights emanate from the good will of governments. ", "Human rights do not have any relation with democratic rights. ", "According to Article 10 of the FDRE constitution human rights are inviolable and inalienable. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("21.", "Which one of the following is correct? ", 0, 0, 0, 0, 0, "Constitution and specific laws have equal weight. ", "Constitution and specific laws do not have any relation. ", "Constitution is a mother law from which specific law can be derived. ", "Constitution is a mother law that emanates from specific laws. ", "Constitution is a mother law from which specific laws can be derived. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("22.", "What was the name of the corruption in which president Nixon had been involved during his presidency? ", 0, 0, 0, 0, 0, "The Watergate Scandal ", "The Communist Scandal ", "The Great Depression ", "The American Scandal ", "The Watergate Scandal was the major political scandal that occurred in the US in 1970s a result in the break in the democrat National Committee ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("23.", "Which of the following is correct about budget allocation for different regions of Ethiopia?", 0, 0, 0, 0, 0, "The federal government allocates and distributes money reasonably based on the specific situations of different regions.", "The federal government allocates equal amount of money to all Nations, Nationalities and peoples of Ethiopia. ", "The federal government allocates less amount of money to less developed regions. ", "The federal government allocates large amount of money to better developed regions. ", "The Federal Government allocates and distributes money reasonably based on the specific situation of different regions.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("24.", "Which one of the following personalities is different from others?", 0, 0, 0, 0, 0, "Nyerere ", "Mengistu ", "Mobutu ", "Idi Amin", "Mengistu Hailemariam of Ethiopia Mabutu seseko of Kongo and Idim Amin of Uganda are all military dictatorship in Africa, where as Nyerere of Tanzania was a democratic leader.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("25.", "Which one of the following women was famous for her political career in the modern history of Ethiopia? ", 0, 0, 0, 0, 0, "Empress Zewditu ", "Empress Menene ", "Empress Taitu", "Yodit Gudit ", "Empress Taitu (wife of Emperor Menilik ll) was very famous woman for her political career in the modern history of Ethiopia. who made a series of political Shum shir during the last Period of Menilik ll (1906-1913)? ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("26.", "One of the following Ethiopian rivers is different from others: ", 0, 0, 0, 0, 0, "Abay", "Awash ", "Tekeze ", "Baro ", "Awash river is the only inland drainage river in Ethiopia which starts and ends in Ethiopia whereas the others are class boundary rives or cross an international boundary. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("27.", "Which one of the following is true based on article 61 of the FDRE constitution? ", 0, 0, 0, 0, 0, "The House of Federation is the supreme authority in the country. ", "The House of Federation consist of only one representative for each one people of the contrary. ", "The house of federation shall have members elected by the state council. ", "The house of federation consists of representatives of the major ethnic groups in the country. ", "According to Article 61 of the FDRE Constitution the House of Federation shall have members elected by the state councils. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("28.", "Which one of the following is INCORRECT about conflict resolution in Ethiopia? ", 0, 0, 0, 0, 0, "All Ethiopians peoples have indigenous conflict resolution mechanisms. ", "Elders/ shimagles are highly respected in the indigenous conflict resolution process. ", "Elders/shimagles cannot resolve conflicts that involve homicide. ", "Arbitration and mediation are employed to resolve conflicts. ", "All Ethiopian Peoples have indigenous conflict resolution mechanism. For example, Elders/Shimagles are highly respected in the society and arbitration and mediation are employed to solve conflicts. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("29.", "Which of the following gives ultimate decisions according to the Ethiopian law? ", 0, 0, 0, 0, 0, "The Federal Supreme Court ", "The Federal High court ", "The State Supreme Court ", "The State High Court ", "The Federal Supreme Court gives ultimate decision according to the Ethiopian law. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("30.", "Which of the following countries is a unique example in the world that does not have a written constitution? ", 0, 0, 0, 0, 0, "China ", "France", "Netherlands ", "England ", "England is a unique example in the world that does not have written constitution. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("31.", "Which of the following is the mandate of the federal government of Ethiopia under the current constitutional provision? ", 0, 0, 0, 0, 0, "Establishing the regional police force. ", "Establishing the foreign relations. ", "Writing constitutions for all regional governments. ", "Organizing cultural events in the regions. ", "The mandate of the Federal government of Ethiopia under the current Constitutional provisions are:\n-> Protecting the Constitution \n-> Prepare the overall economic, social and development plan \n-> Establishing foreign relation \n-> Control the national Banks and issue currency \n", "b", 0, 1, this.f501b));
        arrayList.add(new questions("32.", "Which of the following groups were the most undermined ones in the long history of Ethiopia? ", 0, 0, 0, 0, 0, "Potters ", "Peasants ", "Merchants ", "Women ", "Potters were the most undermined ones in the long history of Ethiopia.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("33.", "Which one of the following is true about illegal human migration in the current Ethiopian context? ", 0, 0, 0, 0, 0, "All illegal migrants are from Southern Ethiopia ", "The major destination of women migrants is South Africa. ", "Illegal migration has become the major socio-cultural problem. ", "Illegal migration is assisted by government agencies. ", "Illegal immigration has become the major socio-cultural problem in the current Ethiopia context. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("34.", "Which of the following is true about benefits and burdens? ", 0, 0, 0, 0, 0, "Benefits and burdens must be shared equally among all peoples in a society.", "Benefits and Burdens must be shared on the education level of individuals.", "Individuals who carry more burden should get less benefits.", "Individuals who carry less burden must not enjoy their political rights. ", "Benefits and burdens must be shared equally among all people in the society. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("35.", "Which of the following is a negative impact of globalization? ", 0, 0, 0, 0, 0, "Transfer of global information and knowledge. ", "Dependence of economically weak nations on the developed ones. ", "Market competition between economically weak and strong nations. ", "Advancement of technology. ", "The negative impact of globalization is the dependence of economically weak nations on the developed ones.", "b", 0, 1, this.f501b));
        arrayList.add(new questions("36.", "In what way did Ethiopia protect her independence from foreign aggression in the past few centuries?", 0, 0, 0, 0, 0, "Through diplomatic negotiations. ", "Through patriotic resistance struggle. ", "Through peaceful submission. ", "Through the support of Western Great powers. ", "Ethiopia is the only African country in Africa that protected her independence from foreign aggressions in the 19th century against Egyptian and Italians. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("37.", "One of the following problems was the most serious one that aggravated socio-economic problems and consequent oppositions against the imperial regime of Ethiopia and brought about its downfall: ", 0, 0, 0, 0, 0, "The war with Eritrean rebel groups ", "Land problem ", "The question of Nationalities ", "Marginalization of Occupational groups ", "The Question of nationalities was the most serious problem that aggravated the Socio-economic problems and consequently opposition against the imperial region of Ethiopia and brought about its dawn fall ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("38.", "In what possible ways can student like you protect themselves from peer influence? ", 0, 0, 0, 0, 0, "By avoiding relations with peer groups. ", "By studying hard always. ", "By making planned activities ", "By staying at home after school. ", "By making planned activities is one way of protecting our self from peer influences ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("39.", "Which one of the following is NOT among the peoples of Southern Ethiopia? ", 0, 0, 0, 0, 0, "Ari ", "Hammer ", "Nuer ", "Surma", "The peoples in SNNP includes mainly the Omotic speaking and some Kushitic language Speakers includes Ari, Hamar, Surma were as the Nuer and the Speakers in the Nilo-sahara Language found in the Gambella National States", "c", 0, 1, this.f501b));
        arrayList.add(new questions("40.", "Which one of the following social groups is the most disadvantaged group in Ethiopia? ", 0, 0, 0, 0, 0, "Artisans ", "Women ", "Children ", "Persons with Disabilities. ", "Even today and in the past persons with disabilities are the most disadvantaged group in Ethiopia.", "d", 0, 1, this.f501b));
        arrayList.add(new questions("41.", "In democratic countries obligations of citizens arise from their", 0, 0, 0, 0, 0, "Rights that they enjoy ", "Duties and responsibilities", "Gender identity ", "Position in society ", "In democratic countries obligation of the citizens arise from their duties and responsibilities.", "b", 0, 1, this.f501b));
        arrayList.add(new questions("42.", "Why are elected officials accountable to their electorate? It is because ", 0, 0, 0, 0, 0, "They should listen to the grievance of the electorate. ", "The electorate is the source of their political power. ", "They need to have constant contact with their electors. ", "The electorate can replace them with another if anytime. ", "The elected officials are accountable to their electorate, because the electorate is the source of their political power.", "b", 0, 1, this.f501b));
        arrayList.add(new questions("43.", "The table Above shows a comparison of two different systems of government. Which information completes the above table? ", C2719R.C2721drawable.civicstable1, 0, 0, 0, 0, "Role of government limited/ Role of government expanded. ", "Rule by a democracy/ Rule by a monarchy. ", "Power divided among the branches/ Power held by one branch. ", "Power shared / Power delegated. ", "In unitary system of government, the central government gives power to sub-national government (Provinces) or power is delegated where as in Federal system of government the local of regional government share the power ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("44.", "One of the following Declarations was promulgated following the humanitarian crisis of Second World War: ", 0, 0, 0, 0, 0, "Universal Declaration of Human Rights ", "World Health Day ", "Declaration of Environment Protection ", "March Against HIV/AIDS", "The universal Declaration of Human rights was promulgated on Dec.1948 following the Humanitarian Crisis during WWII ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("45.", "What was the greatest gain of the Women's Suffrage Movement? ", 0, 0, 0, 0, 0, "Holding citizenship rights. ", "Holding public office. ", "Vote in national elections. ", "Gain employment rights. ", "The greatest gain of the women's suffrage movement was Voting in National Election and the stand for election office. Voting right gained by women in Sweden, Finland in Some USA states in the Late 19th Century ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("46.", "Identify the Incorrect Statement from the given alternatives: ", 0, 0, 0, 0, 0, "Industriousness leads to Self-reliance. ", "Self-Reliance leads to Self- confidence ", "Addictions could affect the working habits of the youth. ", "Male-oriented jobs make individuals more industrious. ", "Addiction could affect the working habit of youth self-reliance leads to self-confidence and industriousness leads to self-reliance. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("47.", "Assertive behavior includes all of the following, except: ", 0, 0, 0, 0, 0, "Questioning ", "Positive Thinking ", "Critical arguments ", "Hasty generalization ", "Assertiveness behavior is a key communication skill. It allows you to pursue your own objectives and stand up for your own right, values and beliefs all while respecting the right, values and beliefs of other. It is the ultimate win- win behavior. It allows you to seek best possible result It also helps to maintain a positive and friendly relationship. It also includes a questioning mind, positive thinking and critical arguments.", "d", 0, 1, this.f501b));
        arrayList.add(new questions("48.", "Who is the Author of famous Ethiopian Novel, \"Oromay\"? ", 0, 0, 0, 0, 0, "Kebede Mikael ", "Be'alu Girma ", "Haddis Alemayehu ", "Mamo Wudneh ", "Be'alu Girma, was the author of the Famous Ethiopian Novel \"Oromay\" ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("49.", "What do an absolute monarchy and an autocracy have in common? ", 0, 0, 0, 0, 0, "Supremacy of a single ruler. ", "Absence of written constitution. ", "Strong national court system. ", "Single legislative house. ", "The common characteristics of both an absolute monarchy and an autocracy is that the supremacy of a single power. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("50.", "Which of the following is true about foreign aid in Ethiopia? ", 0, 0, 0, 0, 0, "Ethiopia is fully dependent on foreign aid. ", "Foreign aid is the base of Ethiopian economy. ", "Ethiopia's goal is to be self— reliant in the future. ", "Ethiopia is the major beneficiary foreign aid in Africa ", "Ethiopia's goal is to be self-reliant in the near future. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("51.", "One similarity between parliamentary and presidential democracies is that in both cases: ", 0, 0, 0, 0, 0, "The head of state elected by the members of parliament. ", "The head of state is elected directly by popular vote. ", "There is a smooth and peaceful transition of state power. ", "Government is formed most of the time by coalition of parties. ", "One similarity between Parliamentary and Presidential democracies is that in both cases there is a smooth and peaceful transition of state power. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("52.", "Which of the following statements is true about progressive taxation?", 0, 0, 0, 0, 0, "Varying tax rates are levied on people who earn equal income. ", "People are expected to pay tax at a rate proportionate to their income. ", "People who earn more pay equal tax with those who earn less. ", "Rich people are taxed more while the poor are exempted from it. ", "Progressive taxation is the taxing mechanism in which the taxing authority charge more taxes as the income of the tax payer increases ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("53.", "Civic minded citizens serve their community wholeheartedly mainly to get ", 0, 0, 0, 0, 0, "Fame and recognition ", "Monetary reward ", "Appointment to public office ", "Personal satisfaction. ", "Civic minded citizens serve their community whole heartedly mainly to get personal Satisfaction ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("54.", "What was the objective of the non-aligned movement? ", 0, 0, 0, 0, 0, "To become an alternative force for the East and West in the Cold War, ", "To promote economic cooperation between developing countries. ", "To advocate solutions to global social and political problems. ", "To be neutral in the East and West confrontation of the Cold War, ", "The aim of Non-Aligned movement is to stabilization of world peace respect the Human Rights, peaceful coexistence between nations opposition of military alliance preservation of independence, Condemnation of racial discrimination. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("55.", "Which of the following is a characteristic feature of the demography of developing nations? ", 0, 0, 0, 0, 0, "High birth rate and High death rate. ", "High birth rate and low death rate. ", "Low birth rate and High death rate. ", "Low birth rate and low death rate. ", "The demographic characteristics of developing countries high birth rate and high death rate, low life expectancy, high number of youth and low number older age. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("56.", "What is ethics? It is a ", 0, 0, 0, 0, 0, "Collection of moral standards accepted by society. ", "Part of philosophy that studies moral standards. ", "Set of rules and regulations issued by democratic states. ", "Reference material on moral standards issued by UNO. ", "Ethics is the collection of moral standards accepted by the society. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("57.", "An altruist is identified by his/her readiness to ", 0, 0, 0, 0, 0, "Initiates action for constitutional amendment. ", "Considered to be revolutionary. ", "Automatically made null and void. ", "Replaces some articles in the constitution. ", "Any law that contradicts a constitution of a country is automatically made null and void. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("58.", "An altruist is identified by his/her readiness to ", 0, 0, 0, 0, 0, "Lead people in protests against injustice. ", "Oppose any form of dictatorship and tyranny. ", "Sacrifice one’s happiness and welfare for others. ", "Use any means to gain power and respect. ", "An altruist is who set up a charity to help marginalized, communities, while battling to earn a living herself has won our Bounquet of the week. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("59.", "Concerning Human Rights what governments are required to do is ", 0, 0, 0, 0, 0, "Ensure that they are not violated by anyone. ", "Introduce new types of rights for their people. ", "Coordinate their use with social development. ", "Use any means to gain power and respect. ", "Concerning human right the governments are required to ensure that they are not violated by anyone. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("60.", "In democratic countries officials are expected to be non-partisan while performing their duties. This means? ", 0, 0, 0, 0, 0, "They should not be prejudiced in any way. ", "They should not be party members. ", "They should not belong to an ethnic group. ", "They should not belong to a religious group. ", "In democratic countries officials expected to be non- partisans, while performing their duties. This means they should not be prejudiced in any way. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("61.", "Which of the following is an attribute of a person who is self-confident? ", 0, 0, 0, 0, 0, "Readiness to accept criticism. ", "Determination to help other people. ", "Reluctance to take on challenges. ", "Having personal role models. ", "One of the attributes of a person who is self-confident is readiness to accept criticism.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("62.", "Ten countries are elected for a period of two years to serve in the Security Council taking into consideration their ", 0, 0, 0, 0, 0, "Acceptance by other members. ", "Economic development.", "Geographical location. ", "Willingness to serve", "The Security Council shall consist of 15 members of the UN 5 countries, USA, Russia, China, Britain and France had permanent member or Veto power whereas the other 10 members on non- permanent shall be elected by the General Assembly of the UNO on the bases of contribution of member of UN to maintain international Peace and Security based equitable geographical distribution.", "c", 0, 1, this.f501b));
        arrayList.add(new questions("63.", "For citizens to understand their rights and duties properly laws and rules should be ", 0, 0, 0, 0, 0, "Willingly agreed to by citizens. ", "Attractive enough in design. ", "Amended periodically. ", "Clear, easy and well designed. ", "For citizens to understand their rights and duties properly laws and rules should be clear, easy and well designed. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("64.", "In Ethiopia it possible to get rid of many off the communicable diseases by: ", 0, 0, 0, 0, 0, "Teaching the people to keep personal hygiene. ", "Distributing medicines in the disease prone areas. ", "Increasing the number of health professionals. ", "Building health centers and make them accessible. ", "In Ethiopia it is possible to get rid of many of the communicable diseases by teaching the people to keep personal hygiene. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("65.", "What does domesticating of international laws and norms mean? ", 0, 0, 0, 0, 0, "Fashioning domestic laws and norms with the international ones. ", "Changing the international ones to suit the conditions of the land. ", "Including some domestic provisions to the international ones. ", "Making the international laws and norms part of the law of the land. ", "Domesticating international laws and norms means changing the international ones to suit the condition of the land. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("66.", "Which of the following functions is exclusively given to the Federal Government of Ethiopia by the Constitution?", 0, 0, 0, 0, 0, "Administration of secondary education. ", "Administration of taxes. ", "Establishing-a police force.", "Formulation of foreign policy. ", "The functions that exclusively given to the Federal government Ethiopia by the constitution includes:\n-> Formulating foreign policy \n-> Administrating air, railway, sea transport, postal and telecommunication service \n-> Administrate the national Bank and prepare the National economic, social and development policy, Strategies \n-> Organize the army and federal police \n", "d", 0, 1, this.f501b));
        arrayList.add(new questions("67.", "Any Place where the Ethiopian flag is flown, be it in an Embassy or on a ship, it is considered as: ", 0, 0, 0, 0, 0, "Part of Ethiopian sovereign territory. ", "Territory free from any international obligations. ", "Free transit area for Ethiopian trade with others. ", "An integral part of the host country or area. ", "Any places where the Ethiopian flag is flown, be it in embassy or ship is considered as an integral part of the host country or area.", "d", 0, 1, this.f501b));
        arrayList.add(new questions("68.", "During state of emergency the Ethiopian government could take action that could ", 0, 0, 0, 0, 0, "Dismantle all articles of the constitution. ", "Limit the democratic rights of citizens. ", "Breakup the federal arrangement. ", "Reinforce commitment for human rights. ", "During the state of emergency the Ethiopian government could take action that could limit the democratic rights of citizens. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("69.", "What does wise saving mean? ", 0, 0, 0, 0, 0, "Saving money even before satisfying your basic needs.", "Saving money after satisfying all your personal wants. ", "Saving money after satisfying your basic needs. ", "Saving money by reducing from your basic needs. ", "Wise saving is saving money after satisfying your basic needs. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("70.", "Accountability of state requires a government to: ", 0, 0, 0, 0, 0, "Consult elected representatives before making any decision. ", "Settle its accounts and make them for auditing on time. ", "Take responsibility for all its decisions and functions. ", "Build modern and trustworthy financial system. ", "Accountability of state requires a government to take responsibility for all its decisions and functions.", "c", 0, 1, this.f501b));
        arrayList.add(new questions("71.", "What could be a basic possible reason that leads people to corruption? ", 0, 0, 0, 0, 0, "Greediness and selfishness. ", "Poverty", "Lack of self- confidence ", "Lack of civic education ", "The basic possible reason that lead people to corruption is greediness and selfishness. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("72.", "Which of the following was the common feature of the Ethiopian peasant rebellions that took place during the imperial regime at different places? ", 0, 0, 0, 0, 0, "Participation of women as solders. ", "The fact that all rebellions were attached to land questions. ", "The fact that all rebellions were suppressed by military action supported by air force. ", "The fact that all rebellions took place in northern Ethiopia. ", "One of the common features of the Ethiopian peasant rebellions that took place during the imperial regime in 1960s and 1970s at different places were the fact that all rebellion in the North and South were attached to the land questions. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("73.", "How do we ensure equality between men and women in a democratic system? ", 0, 0, 0, 0, 0, "By assigning women to all key positions in the government. ", "By creating equal chance and opportunities for both men and women. ", "By increasing the number of women politicians. ", "By providing free chance of education for women. ", "We ensure equality between men and women in democratic system by creating equal chances and opportunities for both men and women, ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("74.", "Article 20/2 of the FDRE constitution provides for accused persons to be given the charges against them in order to ", 0, 0, 0, 0, 0, "Help them remember how and where the crime is done. ", "Prove that the legal system works in transparent manner. ", "Enable them Gather evidence to prepare their defense. ", "ReinfoArticle 2012 of the FDRE constitution provides for accused person to be given the charge against them in order to enable them gather evidences to prepare their defenserce popular confidence in legal system of the nation. ", "", "c", 0, 1, this.f501b));
        arrayList.add(new questions("75.", "Which of the following African country is associated to a fairly recent phenomenon of genocide? ", 0, 0, 0, 0, 0, "Rwanda ", "Burundi ", "South Africa ", "Democratic Republic of Congo ", "Beginning from April 1994 Hutus began slaughtering the Tutsis in the Rwanda. As the brutal killing continued the world stood idly by and Just watched the slaughter lasting 100 day, the Rwanda Genocide left approximately 800,000 Tutsis and Hutu sympathizer dead.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("76.", "Which of the following statements about the African continent is not correct; ", 0, 0, 0, 0, 0, "It is the most utilized river in Ethiopia. ", "It is the bond that links Ethiopia, Egypt and Sudan. ", "It is the only cross boundary river in Ethiopia. ", "It is the only river that has never attracted the attention of the Europeans. ", "Abay River, is the bond that link Ethiopia, Egypt and Sudan. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("77.", "One of the following personalities is associated to the 1st written constitution of Ethiopia: ", 0, 0, 0, 0, 0, "Bejrond Teklehawariat Tekeleamriam. ", "Dejazzmach Kebede Tesema ", "Ras Desta Damtew ", "Ras Abebe Aragay. ", "The first written constitution of Ethiopia was drafted by Bejround Tekelehawariat Teklemariam in 1931 and later revised in 1955.", "a", 0, 1, this.f501b));
        arrayList.add(new questions("78.", "Which of the following National Holidays is associated to the identities and cultures of Ethiopian people? ", 0, 0, 0, 0, 0, "National Flag Day ", "Nations and Nationalities Day ", "National Day of Unity. ", "National Day of Ethiopian Workers. ", "Nations and Nationalities day which celebrate in Hider 29 is associated to the identities and cultures of Ethiopian peoples. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("79.", "Ethiopian Students like you come from different social, economic, cultural and linguistic backgrounds. Which of the following is the most essential virtue that you need to live in harmony in such a situation? ", 0, 0, 0, 0, 0, "Civility", "Tolerance", "Open mindedness ", "Civic mindedness ", "Ethiopian students like you come from different social, economic, cultural and linguistic background, essential to have tolerance to live in harmony in such a situation.", "b", 0, 1, this.f501b));
        arrayList.add(new questions("80.", "Who is the Commander in Chief of the FDRE armed forces? ", 0, 0, 0, 0, 0, "The President ", "The Minister of Defense ", "The Prime Minister ", "The Chief of Staff of the army ", "The Prime Minister in the commander in chief of the FDRE armed force, according to the constitution. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("81.", "What makes the governments of Nazi party of Germany, Fascist party of Italy and National Party of South Africa similar?", 0, 0, 0, 0, 0, "Rule by minority racial group. ", "Segregation of colored group. ", "Absence of rule of law. ", "Gender inequality and oppression. ", "The governments of Nazi party of Germany, Fascist party of Italy and national part of South Africa were similar in that there was absence of the rule of law. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("82.", "The fight against corruption could bear fruit if the government in power ", 0, 0, 0, 0, 0, "Pays high salaries for its officials to deter them from taking bribe.", "Manages to make all its officials honest and truthful. ", "Is fully committed to root out corrupt practices in the country. ", "Works with international anti-corruption organizations. ", "The fight against corruption could bear fruit if the government in power manage to make all its official honest and truthful, ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("83.", "Read the above data carefully and answer the following question. From the table above it can be safely concluded that ", C2719R.C2721drawable.civicstable2, 0, 0, 0, 0, "Literacy rate has positive relation with infant mortality. ", "Literacy rate has positive relation with life expectancy. ", "Infant mortality has positive relation with life expectancy. ", "Infant mortality rate has positive relation with GDP growth. ", "A country with high literacy rate has high life expectancy. So, they have positive relationship. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("84.", "Identify the correct statement concerning HIV/AIDS from the given alternatives ", 0, 0, 0, 0, 0, "HIV/AIDS has become a great obstacle against socio-economic development among societies. ", "The victims of HIV/AIDS can no longer contribute to the development endeavors of their respective nations. ", "Globalization and human mobility played their part in the expansion of HIV/AIDS. ", "HIV/AIDS is the only incurable disease. ", "Especially in developing country HIV/AIDS has become a great obstacle against socio-economic development among societies. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("85.", "Which of the following statements is correct regarding the prevalence or rule of law? ", 0, 0, 0, 0, 0, "It forms a state dominated and ruled by judges. ", "It hinders the smooth functioning of courts. ", "It establishes rule by law courts and judges. ", "It guarantees the safety and security of citizens. ", "The prevalence of the rule of law in a country result in Security of private property right and it Guarantees the safety and security of citizens ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("86.", "Which of the following is NOT among the moral values of Ethiopian societies? ", 0, 0, 0, 0, 0, "Supporting the poor ", "Respect for elderly people. ", "Conflict resolution through indigenous mechanisms ", "Ethnic based violence ", "The moral value of Ethiopian societies includes: \n-> Supporting the poor and disabled person \n-> Respecting the elderly people \n-> Conflict resolution through indigenous mechanism \n", "d", 0, 1, this.f501b));
        arrayList.add(new questions("87.", "Which of the following factors essentially necessitated the revision of 1931 constitution in 1955? ", 0, 0, 0, 0, 0, "The promulgation of Universal Declaration of Human Rights. ", "The Federation of Eritrea with Ethiopia. ", "The outbreak of peasant rebellions.", "The expansion of modern education. ", "The Federation of Eritrea with Ethiopia was one of the factor that necessitated the revision of the first written Constitution of Ethiopia in 1955. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("88.", "What could be the essential base for Ethiopia's development endeavors? ", 0, 0, 0, 0, 0, "Better education and fostering socio-cultural values. ", "The Grand Millennium Dam which is under constructions. ", "The expansion of global information centers. ", "Opening new legal migraci01i opportunities to citizens. ", "Better education and fostering socio cultural values are essential bases for Ethiopians development endeavors. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("89.", "Which of the following is INCORRECT? ", 0, 0, 0, 0, 0, "Ethiopian is the seat of many international organizations. ", "Ethiopia is a member of many international organizations. ", "Ethiopia is the seat of ECOWAS ", "Ethiopia is a founding member of OAU. ", "Ethiopia is a seat of many international organization and member of many international organization and it also the founding member of OAU in 1963. ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("90.", "What could be one of the results of the constitutional protection of free speech? ", 0, 0, 0, 0, 0, "Expansion of public radio. ", "More informed society", "Growth of unbiased media. ", "Reliable election results. ", "One of the long-term results of the constitutional protection of free speech having well informed society.", "b", 0, 1, this.f501b));
        arrayList.add(new questions("91.", "Great Scientists and thinkers of all times contributed great things driven primarily by their desire to ", 0, 0, 0, 0, 0, "Attain self-fulfillment through knowledge. ", "Eradicate poverty and injustice. ", "Transform their country and world. ", "Earn respect for their creations and thoughts. ", "Great scientists and thinkers of all time contributed great things driver primarily by their desire to attain self-fulfillment through knowledge. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("92.", "A self- reliant person is one who is ", 0, 0, 0, 0, 0, "Self-sufficient in everything and requires no help from others. ", "Dependable to find solutions for serious social problems. ", "Refuses to accept the opinion of others at any time. ", "Aware of her/his own strengths and weaknesses. ", "A self-reliant person is one who is aware of his/her own strength and weakness. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("93.", "Ethnocentrism is a belief that one's own ethnic group is superior in everything to others. Therefore it", 0, 0, 0, 0, 0, "Insures respect by other ethnic groups. ", "Demands the loyalty of other ethnic groups. ", "Deserves recognition by other ethnic groups. ", "Hinders interaction with other ethnic groups. ", "Ethnocentrism is a belief that one's own ethnic group is superior in everything to other. Therefore, it hinders interactions with other ethnic group. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("94.", "If a government truly respects rule of law in any country then ", 0, 0, 0, 0, 0, "There will be a democratic constitution. ", "There is no need to hold periodic elections. ", "It is not necessary to have courts and prisons. ", "Most certainly justice will prevail. ", "If a government truly respects rule of law in any country than most certainly justice will prevail. ", "d", 0, 1, this.f501b));
        arrayList.add(new questions("95.", "League of Nations has indirectly encouraged the 1935 Italian invasion of Ethiopian by: ", 0, 0, 0, 0, 0, "Forbidding Russia to come to the support of Ethiopia.", "Impeding British and French support to Ethiopia ", "Passing arms embargo on both Ethiopia and Italy. ", "Refusing to send peace keeping troops to Ethiopia. ", "LNs has indirectly engaged the 1935 Italian invasion of Ethiopia by passing arms embargo on both Ethiopia and Italy, ", "c", 0, 1, this.f501b));
        arrayList.add(new questions("96.", "Article 20/7 of the FDRE constitution stipulates that an accused person has a right to: ", 0, 0, 0, 0, 0, "Be tried in a court that uses language of the accused. ", "Request for assistance of an interpreter at government expense. ", "Keep silent and refuse to give testimony against oneself. ", "Not to appear in court and not be accused of contempt of court. ", "Article 20/7 of the FDRE constitution stipulate that an accused person has a right to request for assistance of interpreter at government expense. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("97.", "The Universal Declaration of Human Rights is incorporated in the FDRE constitution. This is significant because it: ", 0, 0, 0, 0, 0, "Guarantees full respect of the stated right for the peoples of Ethiopia. ", "Compel future governments to respect them for the people of Ethiopia. ", "Will serve as a standard for respect of human rights in the country. ", "Enables the UN to take action against a government that abuses them, ", "The Universal Declaration of Human Rights is incorporated in the FDRE, because it will serve as the standard for respect of Human Rights in the country. ", "b", 0, 1, this.f501b));
        arrayList.add(new questions("98.", "Unlike previous times the Nations, Nationalities, and Peoples of Ethiopia have the right to:", 0, 0, 0, 0, 0, "Promote and the develop their language and culture. ", "Move and settle anywhere in the country. ", "Join the various ranks of the country's civil service. ", "Marry in to and live together with other ethnic groups. ", "Unlike previous times the Nations, Nationalizes and Peoples of Ethiopia have the right to promote and develop their language and culture. ", "a", 0, 1, this.f501b));
        arrayList.add(new questions("99.", "“In theory, markets in free market economies are regulated by the relationship between demand & supply”. What does this statement imply?  ", 0, 0, 0, 0, 0, "There could be other practical factors that regulate free market economy. ", "Demand and supply exist only in the markets of free market economy. ", "Others types of economies do not have a theory that regulates them. ", "Free market economy is healthy because Demand and Supply grow equally. ", "In theory, market is free market economies are regulated by the relationship between supply and demand. This implies that free market economy is health because demand and supply grow equally. ", "", 0, 1, this.f501b));
        arrayList.add(new questions("100.", "Identifying the commonly shared valued, interests and goals of the Ethiopian Nations, Nationalities and Peoples and respecting them is important to: ", 0, 0, 0, 0, 0, "Facilitate national assimilation. ", "Bring national consensus.", "Celebrate festivals together. ", "Appreciate the disparity among them. ", "Commonly shared values interests and goals of the Ethiopian Nations, Nationalities and Peoples and respecting them is important to bring national consensus.", "b", 0, 1, this.f501b));
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
        this.f502tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2006.this.timer.setVisibility(0);
                    civics2006.this.timer.setText(format);
                }

                public void onFinish() {
                    civics2006.this.scr.setVisibility(8);
                    civics2006.this.chr.stop();
                    civics2006.this.toolbar.setVisibility(8);
                    civics2006.this.Relative.setBackgroundColor(-7829368);
                    civics2006.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2006.this.getBaseContext());
                    int unused = civics2006.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2006.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2006.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2006.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2006.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2006.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2006.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2006.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2006.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2006.this.highscoreCivics2006 = defaultSharedPreferences.getInt("Civics2067hs", 0);
                    int access$600 = civics2006.this.part1 + civics2006.this.part2 + civics2006.this.part3 + civics2006.this.part4 + civics2006.this.part5 + civics2006.this.part6 + civics2006.this.part7 + civics2006.this.part8 + civics2006.this.part9;
                    civics2006.this.resultText.setText(String.valueOf(access$600));
                    civics2006.this.progressbar.setProgress(access$600);
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
                    if (access$600 > civics2006.this.highscoreCivics2006) {
                        edit.putInt("Civics2006hs", access$600);
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
                civics2006.this.scr.setVisibility(8);
                civics2006.this.chr.stop();
                civics2006.this.toolbar.setVisibility(8);
                civics2006.this.Relative.setBackgroundColor(-7829368);
                civics2006.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2006.this.getBaseContext());
                int unused = civics2006.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = civics2006.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = civics2006.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = civics2006.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = civics2006.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = civics2006.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = civics2006.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = civics2006.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = civics2006.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = civics2006.this.highscoreCivics2006 = defaultSharedPreferences.getInt("Civics2006hs", 0);
                int access$600 = civics2006.this.part1 + civics2006.this.part2 + civics2006.this.part3 + civics2006.this.part4 + civics2006.this.part5 + civics2006.this.part6 + civics2006.this.part7 + civics2006.this.part8 + civics2006.this.part9;
                civics2006.this.resultText.setText(String.valueOf(access$600));
                civics2006.this.progressbar.setProgress(access$600);
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
                if (access$600 > civics2006.this.highscoreCivics2006) {
                    edit.putInt("Civics2006hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2006.this.scr.setVisibility(8);
                civics2006.this.chr.stop();
                civics2006.this.toolbar.setVisibility(8);
                civics2006.this.Relative.setBackgroundColor(civics2006.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2006.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2006.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2006.this.scr.setVisibility(0);
                civics2006.this.toolbar.setVisibility(0);
                civics2006.this.telegram_layout.setVisibility(8);
                civics2006.this.chr.start();
                civics2006.this.Relative.setBackgroundColor(civics2006.this.getResources().getColor(C2719R.C2720color.white));
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
                civics2006.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
