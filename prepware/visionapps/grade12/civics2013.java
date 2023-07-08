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

public class civics2013 extends AppCompatActivity {
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
    private Boolean f515b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2013;
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
    private Toolbar f516tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2013);
        this.f515b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2013);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one is a proper way of fighting against the pandemic of COVID-19 at a global level? \n", 0, 0, 0, 0, 0, "Taking home-made remedies ", "Continuing under state of emergency until the pandemic ends ", "Applying preventative measures effectively ", "Quarantining COVID-19 patients ", "Applying preventative measures such as wearing a mask, washing hands properly, covering mouth when coughing/sneezing are some of the proper ways to fight against COVID19.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("2.", "When you are responsible for your actions, you will \n", 0, 0, 0, 0, 0, "be able to develop a sense of reliance ", "disrespect the norms and values of the society ", "sacrifice your fundamental rights ", "be able to utilize your own fundamental rights ", "Being responsible means holding ourselves accountable for our decision and actions. We are responsible for properly guiding us more than anyone else. This develops our sense of reliance.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("3.", "How is work believed to be an instrument for development? ", 0, 0, 0, 0, 0, "In some cases, development may be achieved when you don't have to work. ", "The difference between the poor and rich countries cannot be attributed to work. ", "The human capacity to work has created all our problems. ", "The development we see around is due to the human capacity to change himself and his surroundings. ", "All the inventions and development we see around us, are the result of human capacity to change himself or his surrounding through hard work.", "d", 0, 1, this.f515b));
        arrayList.add(new questions("4.", "Which one of the following statements is correct about work ethics? \n", 0, 0, 0, 0, 0, "Doing things isolated from the other members of the work force maximizes efficiency. ", "Establishing a 'smoking' zone with in the work place is an essential part of labor discipline in work ethics. ", "A proper utilization of equipment and utilities is an essential element of work ethics. ", "Entertaining with co-workers during working hours creates a harmony which in turn increases productivity. ", "Ethics is a moral principle that governs a person's behavior or the conducting of an activity. E.g., proper utilization of equipment.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("5.", "What is the negative effect of dependency of developing countries on the developed countries? \n", 0, 0, 0, 0, 0, "Enables developing countries to sell manufactured goods to developed countries through free market policy principle. ", "Enables developed countries to exercise significant control on the economic development. ", "Inhibits the domestic and self sustained growth of developed countries in favor of developing countries. ", "Creates permanent growth that promotes sustainable development and economic independence of developing countries. ", "When developing countries are economically dependent on developed countries, they are not fully free to design their policies independently. This is because these countries fear developed countries may withdraw their aid if their policies isn't their interest. This enables developed countries to exert significant control over their economic development.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("6.", "Why do we need the separation of state and religion in Ethiopia? Because \n", 0, 0, 0, 0, 0, "the former is for worldly governance and the later for heavenly reward. ", "they are always at war. ", "the two are the same and different at the same time. ", "the state is more important than what religion stands for. ", "Ethiopia upholds secularism principle, meaning it separates the state from religious institutions. Because the two have different missions, objectives and values. One is for worldly governance and the other is for heavenly reward.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("7.", "The concept of professionalism holds that ", 0, 0, 0, 0, 0, "professions of all types offers equal payment. ", "Professions shall be based on scientific principles to help one self and community. ", "all professions produce similar leisure for everyone. ", "all professions are not manual. ", "Professionalism is the competence or skill expected from a professional person. It should be based on principles such as respect, punctuality, commitment, impartiality, confidentiality and others.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("8.", "Respecting labour discipline, punctuality and team work are attributes of \n", 0, 0, 0, 0, 0, "the white human race ", "the top management ", "an in secured person ", "a good ethical work conduct ", "Work conduct is a set of policies and rules on how employees govern themselves in a workplace. Some examples of ethical work conduct are showing respect to coworkers and clients, being punctual and polite, working well as part of a team and others.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("9.", "Ethiopia's huge potential in agricultural and its industrial can be translated into action by increasing productivity and efficiency with the help of \n", 0, 0, 0, 0, 0, "technological development ", "the good will of donor-states ", "NGO's", "loan ", "The advancement of technology improves the productivity of agriculture and industry. For example, when a farmer uses farm vehicles instead of the traditional farming system, they can farm large areas with less time. This increases their productivity and efficiency.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("10.", "The concept of the supremacy of the constitution refers to \n", 0, 0, 0, 0, 0, "the constitution is a set of laws that is derived from all other laws that a country has. ", "the law of the land that is supreme, over all other laws. ", "the absence of hierarchy of laws and the society. ", "Other laws with different competence will not have to comply with the law of the land. ", "The supremacy of the constitution is a principle that states constitution is the supreme law of the land and all other laws must conform to it.", "b", 0, 1, this.f515b));
        arrayList.add(new questions("11.", "Which one is a cardinal element of due process of law? \n", 0, 0, 0, 0, 0, "Right to assembly ", "Right to look for a political alternative ", "Right to counsel ", "Right to demonstration ", "Due process of law is a constitutional guarantee that prevents governments from impacting citizens in an abusive way. Some of its elements are: \n• Habeas Corpus: an arrested person be brought before a court before being imprisoned. \n• Presumption of innocence \n• Fair notice \n• Speedy and public trials \n• right to counsel: the right to have legal counsel. \n• right against self-incrimination: the right to remain silent to police questions \n• protection against double jeopardy: prevents double prosecution/punishment for the same act. \n• right to appeal\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("12.", "Apart from rules, laws are enacted by ", 0, 0, 0, 0, 0, "Parliament ", "associations ", "individuals", "the Council of Ministers ", "Laws are enacted by the legislative branch (parliament).\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("13.", "Which one of the following is different in relation to corruption? \n", 0, 0, 0, 0, 0, "Persons with authority cannot comply with the rule or law to put corruption under control. ", "The primary instrument to control corruption is indeed the rule of law but religious institutions and others do have roles to play on the moral side of social life. ", "Corrupt persons and office holders should face legal retributions for their wrong doings. ", "Schools in general and higher institutions of learning in particular should work to raise social awareness to succeed with the campaign against corruption. ", "All of them help in controlling corruption except choice A.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("14.", "The peasant rebellion which broke out in Gojjam in 1968 against the central authority was mainly caused by \n", 0, 0, 0, 0, 0, "the request for democratic elections ", "external intervention ", "the burden of taxation ", "the demand for autonomy ", "The major cause of the Gojjam peasant rebellion against the feudal government was the government's attempt to increase the tax and forced contribution to erect a statue of the emperor.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("15.", "In 1991, Derg was over thrown due to ", 0, 0, 0, 0, 0, "diplomatic effort ", "Mediation ", "A peaceful transition power ", "An armed struggle ", "Derg was overthrown due to an armed struggle by EPRDF forces in 1991 GC.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("16.", "Identify the correct statement about political parties versus pressure groups. \n", 0, 0, 0, 0, 0, "The latter officially compete in the country's elections for political power. ", "The former is an association of advocacy groups. ", "The latter try to influence government to be more responsive to the wishes of the people. ", "The former reflects always the views of marginalized groups. ", "Pressure group: tries to influence public policy in the interest of a particular cause. E.g., an environmental pressure group. \n• They are also called advocacy groups. Political parties: officially compete in the country's elections for political power.", "c", 0, 1, this.f515b));
        arrayList.add(new questions("17.", "Which one of the following is NOT part of the major sources of knowledge? \n", 0, 0, 0, 0, 0, "experimentation ", "Heredity ", "information ", "understanding nature ", "Knowledge is not passed through heredity.", "b", 0, 1, this.f515b));
        arrayList.add(new questions("18.", "Identify the correct statement about information, knowledge and wisdom \n", 0, 0, 0, 0, 0, "Wisdom always contradicts with social values. ", "Knowledge is the ability to use wisdom. ", "Knowledge helps us to develop information. ", "Knowledge is the ability to use information. ", "The following statements are correct about information, knowledge and wisdom. \n• Information helps us to develop knowledge. \n• Knowledge is the ability to use information. \n• Wisdom is the ability to use knowledge.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("19.", "The information that is collected and analyzed for a specific purpose will help to \n", 0, 0, 0, 0, 0, "avoid generalization. ", "avoid judgment. ", "make knowledge-based decisions. ", "formulate a hypothesis. ", "Knowledge based decision is a decision-making process that uses appropriate data, information and knowledge to ensure the best outcome.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("20.", "Which method explains the skill of using information properly? \n", 0, 0, 0, 0, 0, "Using observation as an ultimate source of information. ", "Reproducing new information using unscientific methods. ", "Identifying, evaluating and managing information. ", "Making a quick decision based on first-hand information ", "no explanation", "c", 0, 1, this.f515b));
        arrayList.add(new questions("21.", "As it was seen from the economic history of developed countries, investment capital could be acquired through \n", 0, 0, 0, 0, 0, "Enduring into an irresponsible level of debt. ", "ignoring the agricultural sector and promoting the service sector. ", "privatizing strategic national assets. ", "Entering hard, getting money and saving. ", "At a country level, foreign investment can be attracted by: \n• Encouraging first time foreign investors \n• Securing domestic conditions and stability of the country \n• Privatizing government owned sectors to the private sectors except those that are strategic assets. \n• Promoting different sectors of the country. \n• Promoting growth by working hard and Saving\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("22.", "The most important international institutions in facilitating the global economy and finance are \n", 0, 0, 0, 0, 0, "World Trade Organization ", "IMF and World Bank ", "Chinese Exim bank ", "African Development Bank ", "• World Trade Organization is an international institution organization that regulates and facilitates international trade between nations. \n• IMF and World Bank are international institutions in facilitating the global economy and finance. \n• Chinese Exim Bank is an export and import bank of China. \n• African Development Bank contributes to poverty reduction and improve living conditions for Africans.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("23.", "An individual must carefully select his/her means of income in order to \n", 0, 0, 0, 0, 0, "save more money at the time of divorce. ", "accumulate private property internationally. ", "Live a legal, long lasting and happy life. ", "hide his/her real income to escape taxation. ", "\"Living within your means\" means spending less on your lifestyle than you earn. It helps to save money, and live a long-lasting happy life.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("24.", "In order to execute their duties properly and fully, governments in the contemporary world need \n", 0, 0, 0, 0, 0, "a continuous monitoring and influencing by citizens. ", "a budget reduction.", "an opposition party to check than daily. ", "to be given an absolute and an unchecked freedom. ", "Citizens should be able to check, examine and monitor government policies and actions to ensure they are carrying out their responsibilities properly.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("25.", "Creating civic societies and strengthening their contributions is very important in \n", 0, 0, 0, 0, 0, "providing better salary for the employees. ", "improving society's living conditions in various was. ", "defending the sovereignty of the country. ", "Helping one's relatives with job opportunities. ", "Civic societies are organizations that promote the interest of a local community and improve their living condition.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("26.", "Genocide is labelled the worst crime against humanity because it\n", 0, 0, 0, 0, 0, "involves enslavement of people. ", "is confiscation of property. ", "is committed against religious community or a group of people. ", "is mass imprisonment of victims rather than killing. ", "Genocide is the deliberate and systematic destruction of a group of people because of their ethnicity, nationality, or religion.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("27.", "In Ethiopia, tax payers need to comply with tax laws and pay tax appropriately mainly because tax payment is \n", 0, 0, 0, 0, 0, "used to purchase luxury items from abroad ", "chiefly used for charitable activities ", "a major source of revenue for government. ", "Mainly a moral obligation. ", "Tax is a major source of revenue for a government. It is a mandatory obligation levied on individuals and corporations.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("28.", "Which one of the following achievements was a major accomplishment of the civil rights movement in the USA in 1950s? \n", 0, 0, 0, 0, 0, "Slavery was abolished ", "Racism was over ", "Women were given the right to vote ", "Segregation laws were dropped ", "In the USA the following major accomplishment took place. \n• In the 1860s, slavery was abolished. \n• In 1920, women were given the right to vote. \n• In the 1960s, Segregation laws were dropped. Notable activists like Martin Luther King Jr. and Rosa Parks played a key role in dropping the segregation laws.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("29.", "Which one of the following ethical behaviors is associated with showing respect to people? \n", 0, 0, 0, 0, 0, "Fairness ", "Civility ", "Courage ", "Truthfulness", "• Fairness is the quality of treating people equally. \n• Civility is a well-mannered behavior toward others. It is associated with showing respect to people. \n• Courage is the ability to do something that is difficult or dangerous. \n• Truthfulness is the quality of being honest.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("30.", "Ethiopia's leading role to the cause of Africa is symbolized by \n", 0, 0, 0, 0, 0, "Ethiopia's transformation as the largest economy in the continent. ", "Ethiopia's being the only African country as a member of the League of Nations. ", "the establishment of the OAU/AU in Addis Ababa. \n", "the opening of legations in Addis Ababa since 1896. ", "Ethiopia's leading role to the cause of Africa is symbolized by the establishment of Organization of African Unity (OAU) which is now named Africa Union (AU) headquartered in Addis Ababa.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("31.", "Justice in the areas of social services should focus on and support for \n", 0, 0, 0, 0, 0, "gender bias ", "sympathy for wealthy ", "fairness in distribution ", "segregation ", "Distributive justice is a type of justice concerned with the fair distribution of burdens and benefits.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("32.", "The duties attached to courts may NOT include one of the following \n", 0, 0, 0, 0, 0, "interpreting law. ", "protection of human rights. ", "pursuing criminals to bring to justice. ", "performing duties independently. ", "Pursuing criminals to bring to justice is usually the role of police forces instead of courts.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("33.", "The rights of tax payers have include ", 0, 0, 0, 0, 0, "evading taxes ", "running business based on established legal systems ", "engaging in illicit trade ", "bribing tax collection officers ", "Some of the rights of taxpayers include: \n• Running a business based on the established legal system \n• The right to a fair and just system \n• The right to appeal tax decisions\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("34.", "Patriotic citizen means ", 0, 0, 0, 0, 0, "to be willing to provide the public what is necessary in times of crisis. ", "not to be concerned with the democratization of society. ", "to promote private interests over the public ones. ", "to be less concerned to keep ethical values of society. ", "A patriotic citizen has the feeling of love, devotion to his/her homeland country. They put the public interest/need over their personal interest/need.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("35.", "Which one of the following could be a reflection of patriotism? \n", 0, 0, 0, 0, 0, "To promote personal interests at the expense of the public. ", "To promote private interest over that of the public. ", "Participation in the affairs that are strictly private. ", "Upholding the Constitution and respect to other laws of the country ", "no explanation", "d", 0, 1, this.f515b));
        arrayList.add(new questions("36.", "Truth is essential for social interaction for all of the following reasons except one. Which one? \n", 0, 0, 0, 0, 0, "Using the instrument of knowledge for interaction. ", "Using scientific methods to realize a sound interaction. ", "A mechanism of interaction based on proof. ", "Creating an interaction on the basis of myth ", "Definition: Myth is a traditional story that tries to explain the natural or social phenomenon without proven fact. \nTruth is based on knowledge and proof. It is not based on myth.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("37.", "Which one of the following is a major feature of rule of law? \n", 0, 0, 0, 0, 0, "Constitutionalism ", "Rule of divine ", "Rule of men ", "Totalitarian rule ", "Constitutionalism is a doctrine that a government's authority is determined by the people and should be limited by the constitution. It is a major feature of rule of law.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("38.", "A type of democracy which is practiced through a referendum is \n", 0, 0, 0, 0, 0, "representative democracy ", "revolutionary democracy ", "direct democracy ", "indirect democracy ", "A referendum is a vote by citizens to decide an important political or social question. It is a type of direct democracy. E.g. 2019 GC Sidama region Referendum, where two million Sidama residents voted in a referendum to decide if they want to become the country's tenth region.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("39.", "Authority differs from power in that, authority ", 0, 0, 0, 0, 0, "is moral power ", "is always illegitimate ", "is legal power ", "forces others to do what the power holder wants to do ", "Power is the ability or potential of a person to influence others. Authority is the legal power and formal right to make decisions and give orders to others.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("40.", "Which one of the following statements is correct about human and democratic rights? \n", 0, 0, 0, 0, 0, "Citizens' rights and duties are not kept interdependent in democratic system. ", "Rights and obligations of citizens are outlined only in international declaration of human rights. ", "There is no correlation between constitutionalism on one hand and rights on the other. ", "Human and democratic rights are ensured by democratic governments. ", "Human rights are rights that belong to an individual simply for being human, they are not granted by any government. While democratic rights are rights that a democratic government grants to its people. Both rights are ensured by democratic governments.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("41.", "Transparency is all about", 0, 0, 0, 0, 0, "allowing others to inspect what an office bearer are doing. ", "to be responsible for consequences of the work done. ", "keeping what officials are doing as secret. ", "to be efficient at work as office holder. ", "• Transparency is the practice of openly disclosing information to the public. \n• Accountability is to be responsible for the consequences of the work done.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("42.", "The importance of political tolerance in Ethiopia could be expressed through \n", 0, 0, 0, 0, 0, "disrespect to the concerns that others are displaying. ", "becoming arrogant to force others to accept the official's position. ", "advancing one's own view points as the best. ", "showing civility and respect for the view points of others. ", "Tolerance is the respect and acceptance of different opinions, behaviors, cultures, beliefs and others.", "d", 0, 1, this.f515b));
        arrayList.add(new questions("43.", "What advantages federalism has to offer for Ethiopia? \n", 0, 0, 0, 0, 0, "To allow nations, nationalities and peoples to think of separation from Ethiopia. ", "Making groups take turn to rule over others. ", "Advances development through genuine self-rule and shared-rule. ", "Making nations, nationalities and peoples believe that their differences are more important than what unite them. ", "Federalism is a type of government in which the power is divided between the central and regional government. It advances the development of self and shared governance.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("44.", "Which one of the following is different regarding federal and regional state constitutions? \n", 0, 0, 0, 0, 0, "The constitutions of FDRE has not brought an end to the unitary form of government. ", "The goal of the federal and regional constitutions is to promote ethnic groups to exercise self-administration. ", "The regional states constitutions are in parity with the federal one. ", "Both the federal and regional constitutions have no clear boundary in their exercise of power. ", "Here is the correct statement regarding the federal and regional state constitution in Ethiopia: \n• The constitution of FDRE replaced the unitary to a federal form of government. \n• The goal of the federal and regional constitution is to promote ethnic groups to exercise self-administration. \n• Always the regional state constitution aligns with the federal constitution. \n• There is a clear boundary between federal and regional constitutions in their power. Some powers like conducting foreign relations, managing defense forces, administering national banks are only limited to the federal government.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("45.", "What role the rule of law has in the democratization of society? \n", 0, 0, 0, 0, 0, "Good hearted officials always do the right thing even in the absence of rule of law. ", "Rule of law gives the governed unlimited right to question officials. ", "Rule of law is instrumental to create limited government and help enhance democracy. ", "Rule of law suppresses the governed than the governing. ", "Rule of law states that all citizens including the government are accountable to the law. This serves as an instrument to create a limited government and help enhance democracy.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("46.", "One of the following is a means of reversing dependency \n", 0, 0, 0, 0, 0, "Increasing imports from developed countries ", "Conducting a socialist revolution ", "Negotiating with developed countries to end unequal relationship ", "Eradicating poverty ", "Some of the means to reverse dependency are: \n• Working hard \n• Eradicating poverty \n• Promoting increased efficiency \n• Increasing production of locally made products instead of importing.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("47.", "Which one of the following is among the strategies to develop self-confidence? \n", 0, 0, 0, 0, 0, "Become more arrogant ", "Know your strengths and weaknesses ", "Don't accept your mistakes ", "Underestimate others ", "Self-confidence is a realistic confidence in one's own judgment, ability and power. Knowing your strength and weakness helps in developing self-confidence.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("48.", "Which one of the following is a personal quality of a self-reliant person? \n", 0, 0, 0, 0, 0, "Extravagant ", "Lacking integrity ", "Making good decisions ", "Pessimistic about prospects ", "Self-reliance is a reliance on one's own powers and resources rather than those of others. A self-reliant have good confidence and makes good decisions.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("49.", "Good decision making requires ", 0, 0, 0, 0, 0, "sensitivity to moral issues. ", "doing the right thing without bothering about the moral nature of the situation. ", "an immediate action without examining the pros and cons of the decision. ", "giving priority to economic benefits without considering moral components. ", "A good decision requires thoughtful thinking after examining the pros and cons of the decision. It is sensitive to moral issues.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("50.", "Abebe is not an extravagant person because he ", 0, 0, 0, 0, 0, "buys things without planning. ", "buys things though he does not need them. ", "spends more money than he can afford. ", "spends his money wisely. ", "Extravagant means spending money excessively. Someone who is not extravagant spends his/her money wisely and with a plan.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("51.", "When citizens are disengaged from their political, economic and social activities, they are exhibiting characteristics of being \n", 0, 0, 0, 0, 0, "passive ", "active ", "legal ", "impartial ", "A passive person tends to go with the flow without actively participating.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("52.", "When an individual frees himself/herself from being dominated by others, this helps to \n", 0, 0, 0, 0, 0, "let others decide on his/her behalf. ", "develop an aggressive character. ", "develop a quiet character and a passive life. ", "save money, be self-reliant and plan the future. ", "no explanation", "d", 0, 1, this.f515b));
        arrayList.add(new questions("53.", "When countries receive financial aid from other countries, they are expected to give away a portion of their sovereignty. This is a typical problem caused by \n", 0, 0, 0, 0, 0, "normal and healthy politics ", "independence ", "Colonialism ", "dependency ", "A foreign dependency is a form of dependency in which weaker countries are economically reliant on stronger countries, allowing the stronger countries to exert significant control over the economic and political behavior of weaker countries.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("54.", "Dawit always weighs among choices available with a sober mind for a best, this shows Dawit is a \n", 0, 0, 0, 0, 0, "self-centered person ", "rational and an informed person ", "time-wasting person ", "self-sacrificing person ", "A rational person is someone who is sensible and makes knowledge-based decisions rather than emotions.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("55.", "In order to avail capital for investment, get an interest and place money in a safe environment, people must deposit their money in \n", 0, 0, 0, 0, 0, "Their own houses ", "Banks ", "Iddir centers ", "Equb stores ", "• Banks are a modern saving institution, where a deposited money is kept in a safe environment and get an interest. \n• Equb is a traditional form of saving. It is an association of people who have a shared goal of contributing money and distributing it among members on a rotating basis. \n• Idir is also a traditional form of saving. It is an association of people who contribute money regularly and used it for expenses in the event of the death of a family member.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("56.", "Unfair treatment of women could be expressed through \n", 0, 0, 0, 0, 0, "allowing them to ascend to queenship to rule society. ", "promoting them to be good fighters in the air force. ", "marriage and the formation of family. ", "they were denied the right to own inherit land. ", "Unfair treatment of women is the unequal treatment of women and denying them their basic rights.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("57.", "What were the reasons for ethno-linguistic groups to be treated unequally in Ethiopia's past? \n", 0, 0, 0, 0, 0, "Looking for the future to take care of their needs and aspirations. ", "Accepting unity in diversity. ", "Government failures to understand multiculturalism more blessing than a curse. ", "Absence of knowledge regarding the existence of different linguistic groups in Ethiopia. ", "In the past, the government was aware of the presence of different linguistic groups in Ethiopia, but they consider it as a challenge/curse rather than a blessing.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("58.", "How do we make justice prevail in society? ", 0, 0, 0, 0, 0, "Promoting industrialization. ", "Through the properly functioning of the judicial system. ", "Through the promotion of development in agriculture. ", "By way of enhancing agro-industry. ", "Justice prevails when impartial courts and the judiciary system exist.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("59.", "What roles do citizens have in the exercise of justice? \n", 0, 0, 0, 0, 0, "To be onlooker when injustice is being made on others. ", "To fail to react when an official violates the exercise of justice. ", "To appreciate officials when doing injustice or other people. ", "Paying tax and do other things that could help enhance justice. ", "• Paying tax is essential in the exercise of justice. It helps in maintaining security by providing salary to law enforcers and judges. \n• In the exercise of justice, citizens should be not just onlookers (spectators) but also, have to report and protest when injustice is being made on others.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("60.", "What is right regarding the traditional justice system in Ethiopia? \n", 0, 0, 0, 0, 0, "Traditional justice system could play the role of complementing the conventional court. ", "Traditional justice systems afford to exist without the conventional courts. ", "Traditional justice systems and conventional courts are the same. ", "Conventional courts and traditional ones are mutually exclusive. ", "In Ethiopia, the traditional system could play the role of complementing the role of the conventional court. They have existed before conventional courts, meaning they could (probably) exist without the conventional court.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("61.", "Which one is a characteristic feature of devolution of power? \n", 0, 0, 0, 0, 0, "Distribution of power from the center to regional government ", "A power share mechanism among politically independent sovereign countries ", "Concentration of power in the center ", "Monopoly of power by the central government ", "Devolution is the distribution of power from the central government to the regional government. The regions have the power to make legislation relevant to them, thus granting them a higher level of autonomy.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("62.", "Ethiopia's foreign policy is based on all of the following principles except \n", 0, 0, 0, 0, 0, "Cooperation ", "People to people diplomacy ", "Co-existence ", "Confrontation", "According to the FDRE constitution, article 86: foreign relations are based on mutual respect for national sovereignty and equality of states and non-interference in the internal affairs of other states. \n• Confrontation or interference is not a principle of Ethiopia's foreign policy.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("63.", "Recently, Ethiopian and south Sudanese elders exchanged visits along the border between the two countries in order to take their overall relation to a higher level. Type of diplomacy is \n", 0, 0, 0, 0, 0, "Public diplomacy ", "Gun-boat diplomacy ", "Shuttle diplomacy ", "Elite diplomacy ", "• Public diplomacy is also called people's diplomacy; it is any of various government-sponsored efforts aimed at communicating directly with foreign publics. \n• Gunboat diplomacy is an aggressive foreign policy applied with the use of highly-visible displays of military usually naval power to imply a threat of warfare as a means of forcing cooperation. \n• Shuttle diplomacy is the action of an outside party in serving as an intermediary between two or more parties in a dispute.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("64.", "Which one of the following is true about the amendment procedure of FDRE constitution? \n", 0, 0, 0, 0, 0, "The power to amend the constitution lays in the hands of the council of ministers. ", "Power of amendment of the constitution belongs to the House of People Representatives. ", "The mandate to amend the constitution belongs to the constituent assembly. ", "The first amendment to the FDRE constitution was made by the Transitional Government. ", "According to the FDRE constitution, article 105: \n1. Constitution can only be amended in the following manner: \n(a) When all State Councils, by a majority vote, approve the proposed amendment; \n(b) When the House of Peoples' Representatives, by a two-thirds majority vote, approves the proposed amendment; and \n(c) When the House of the Federation, by a two-thirds majority vote, approves the proposed amendment.\nThe constituent assembly is a body of representatives that are elected to create or change the constitution.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("65.", "Among the different ways of conflict management, one proceeds with a direct discussion among disputants and, thus, avoids an outside party. Which one? \n", 0, 0, 0, 0, 0, "Negotiation ", "Mediation ", "Arbitration ", "Litigation ", "• Negotiation is a process where two parties in a dispute reach a settlement between themselves by discussion. \n• Mediation is a process in which a neutral third party assists the parties in conflict to reach a solution. \n• Arbitration is a process where the decision is made by a third party. The arbitrator hears the case as presented by the parties in dispute and makes a decision in the same way as a Judge would. \n• Litigation is the process of taking a case to a court of law so that a judgment can be made.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("66.", "Why is saving important for you? It ", 0, 0, 0, 0, 0, "enables you to avoid all kinds of risks in life. ", "helps you to avoid a necessary spending. ", "helps you in the event of a financial emergency. ", "enables you to deposit all of your income. ", "Saving is important in \n• providing financial freedom \n• providing a better future \n• providing financial security in the event of ]financial emergency \n• and many others.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("67.", "Which one of the following statements is correct about traditional saving institutions of Ethiopia? \n", 0, 0, 0, 0, 0, "Both Iquib and Idir are established by the mutual agreement of the community ", "The structures of Iquib and Idir are the same throughout the count ", "Iquib is always a long-term saving association ", "Idir is a temporary saving association ", "• Equb is a form of revolving savings. People voluntarily join a group and make a regular contribution (every week, month). The amount of collected will be given to one person, then to the next person the next in a revolving ]manner. It is somewhat similar to Bank. \n• In Idir people contribute regularly (every week, month) it is used for the expenses in the event of the death of a family member. It is somewhat similar to Insurance. \nBoth Equb and Idir are established by the mutual agreement of the community.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("68.", "Which one of following is NOT the reward of a sound economic system? \n", 0, 0, 0, 0, 0, "Overall economic development ", "Skyrocketing prices ", "Reduction of debt burden ", "Healthy market conditions ", "Skyrocketing prices (High Inflation) is not a reward of a good economic system.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("69.", "Which one of the following factors negatively affects active community participation? \n", 0, 0, 0, 0, 0, "Willingness of members of the community to participate ", "The existence of different outlooks within the community ", "The existence of many effective good leaders ", "Lack of awareness about the benefits of community participation ", "Some of the factors that positively affect active community participation: \n• willingness of members to participate \n• having effective good leaders \n• existence of good team spirit and awareness \n• existence of different outlooks\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("70.", "Which one of the following is a way of manifesting political participation? \n", 0, 0, 0, 0, 0, "Campaigning for or against candidates during election ", "Circulating fake news through the social media ", "Disturbing democratic elections ", "Burning public institutions ", "Political participation describes an action taken by a citizen to influence the outcome of a political issue. It ranges from discussing politics with friends to voting or campaigning in elections.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("71.", "Which one of the following reasons justifies affirmative action for women? \n", 0, 0, 0, 0, 0, "Non-discrimination ", "Discrimination ", "Reverse discrimination ", "Assimilation ", "Affirmative action is the practice or policy of favoring individuals belonging to groups known to have been discriminated against previously. Discrimination of women in the past justifies affirmative action.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("72.", "Which one of the following is true about the FDRE Constitution in terms of Nations, Nationalities and Peoples? The Constitution \n", 0, 0, 0, 0, 0, "places Nations, Nationalities and peoples under a single culture. ", "addresses the issue of nationalities by Noting for a unitary state structure. ", "provides priority for group rights. ", "has no provision for the right to secession. ", "The FDRE constitution states that the sovereign power resides in the nations, nationalities and peoples of Ethiopia. This implies it gives priority to nations and nationality or group rights.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("73.", "The belief that one's culture is superior to others is \n", 0, 0, 0, 0, 0, "multiculturalism ", "multilateralism", "ethnocentrism ", "pluralism ", "• Multiculturalism is a situation in which all the different cultural or racial groups in a society have equal rights and opportunities. \n• Multilateralism is when at least three governments participate in a particular issue to solve a problem or achieve something. \n• Ethnocentrism is the view that one's own culture is better than anyone else's culture. \n• Pluralism is a philosophy that people of different beliefs, backgrounds, and lifestyles can coexist in the same society\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("74.", "The concept of domestication involves ", 0, 0, 0, 0, 0, "merging state and federal laws ", "replacing local laws with international laws ", "using constitutional and ordinary laws mutually ", "incorporating international treaties in to local laws of the country ", "Domestication is a process through which a country officially recognizes certain international principles as a country's legal system.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("75.", "In a democratic system, the judiciary ", 0, 0, 0, 0, 0, "is handled by prime minister ", "formulates the foreign policy of the country ", "safeguards the constitution ", "has seats in parliament ", "The judiciary safeguards the constitution by: \n• interpreting laws \n• settling legal disputes \n• punishing violators of the law. \n• protecting rights\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("76.", "According to the FDRE Constitution, sovereignty resides in the \n", 0, 0, 0, 0, 0, "nations, nationalities and peoples", "communities", "Religious groups. ", "Professional associations. ", "According to the FDRE constitution, article 8: \n• All sovereign power resides in the nations, nationalities and peoples of Ethiopia.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("77.", "The separation of power is expressed through ", 0, 0, 0, 0, 0, "the exercise of professionalism among journalists. ", "the workings of the organs of government based on checks and balances. ", "the commitment leaders show for the principles of democracy. ", "the willingness of ministers to do what is right and proper. ", "The separation of power is expressed through the different branches of government based on check and balances to prevent abuse of power.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("78.", "Which one of the following rights differs with regard to the domain of human rights? \n", 0, 0, 0, 0, 0, "The right to property. ", "The right to privacy. ", "The right to life. ", "The right to liberty. ", "Human rights are rights that belong to an individual simply for being human, they are not granted by any government. \n• The right to life, liberty, equality and privacy are some of the examples of human rights. \nDemocratic rights are rights that a democratic government grants to its people. \n• The right to demonstration, movement, property and development are some of the examples of democratic rights.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("79.", "What are the ways for people to participate in the decision-making process at the level of kebeles? \n", 0, 0, 0, 0, 0, "Actively participating in matters that affect members of kebele ", "Thinking for personal gains than what advances the interest of community. ", "Showing respect to those working there. ", "Regularly attending meetings when officials of kebeles ask for.", "Actively participation helps the community in the decision-making process at the level of Kebele.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("80.", "The exclusive power that the federal government holds manifests through \n", 0, 0, 0, 0, 0, "the rights that it shares with regional states. ", "educational and health under takings. ", "the collection of taxes. ", "foreign policies, defense and finance. ", "Some of the power only limited to the Federal government according to the FDRE constitution are: \n• Protecting and Defending the Federal Constitution \n• Conducting Foreign Policy \n• Administering the national defense force \n• Preparing and implementing the country's policies and strategies. \n• Administering the national bank, regulating foreign exchange \n• Protecting and Defending the Federal Constitution \n• Regulating interstate and foreign commerce \n• Determining matters related to nationality\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("81.", "Which one of the following is true about duties and rights of citizens in a democracy? \n", 0, 0, 0, 0, 0, "Citizens enjoy their rights to the maximum only when they accomplish their duties. ", "Protecting a country's border against external aggression belongs to citizens' rights. ", "Constitutional obligations and constitutional rights are mutually exclusive. ", "Citizens are entitled to their rights without any consideration of obligations. ", "A right is an entitlement to have or do something, while duty is something that one must do because of a law or obligation. They are interdependent because rights cannot be respected unless we fulfill our obligation/duty. \n• For example, a person has the right to work but that can be respected, only if he/she fulfill their duty by having the necessary license or paying their fair tax.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("82.", "Mohammed always thinks twice before making a decision or an action once. This characteristic shows his dedication to rely on \n", 0, 0, 0, 0, 0, "a risk-free decision making ", "an unnecessarily fast decision-making method ", "a reasonable decision making ", "a slow decision-making procedure ", "Reasonable means something that is sensible and fair. Hence, Reasonable decision making means sensible and fair decision making that is thought more than once.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("83.", "In order to undertake scientific research, accumulate knowledge and make good policies, we need to \n", 0, 0, 0, 0, 0, "do a verified data analysis ", "use an artificially created data ", "Copy it from other places ", "arbitrarily analyze data ", "Knowledge should be accumulated on data that is verified and correct.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("84.", "One of the best and appropriate ways of developing a reading habit is \n", 0, 0, 0, 0, 0, "always reading fictional books ", "always reading non fictional books ", "giving more time to audio-books ", "start with simple reading materials and making a progress ", "Some of the ways to develop a reading habit are: \n• setting a goal \n• starting with simple reading and making progress \n• eliminating distraction \n• having a reading hour\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("85.", "To be accepted as a responsible member of a society and enjoy a successful social life, one has to be \n", 0, 0, 0, 0, 0, "a politician in the African context ", "an honest person ", "a businessman only seeking profit ", "a broker only maximizing his/her gain ", "Honesty is the quality of being truthful. When a person is honest, society will have confidence in the person and be accepted as a responsible member of the society.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("86.", "When should we have to give rational criticism on government policies and strategies? When \n", 0, 0, 0, 0, 0, "strategies aim at benefiting the great majority of citizens. ", "strategies are appropriate to solve socio-economic problems of the nation. ", "policies do not consider our own personal interests. ", "policies are not keeping with the national interests. ", "Citizens should criticize the government when policies are inconsistent with the country's national interests. For instance, when government policies are weak on national sovereignty and territorial integrity, citizens should rationally criticize the government.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("87.", "Ethiopia contributed to global peace and stability by \n", 0, 0, 0, 0, 0, "intervening in the internal affairs of politically unstable neighboring countries. ", "training and supporting some armed groups. ", "sending peace-keeping forces. ", "allowing its soldiers to be employed as mercenaries. ", "Ethiopia played a vital role in global peace and stability by sending peace-keeping forces to different countries such as South Korea, Congo, Sudan, Somalia and other countries.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("88.", "What is meant by shouldering responsibility? ", 0, 0, 0, 0, 0, "Enjoying and exercising individual rights ", "Fulfilling the duties expected from us ", "Living for the enjoyment of others only ", "Be hard working to achieve personal goals ", "Shouldering a responsibility means to take responsibility.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("89.", "One of the following statements explains the duty of a good citizen \n", 0, 0, 0, 0, 0, "Paying taxes ", "Running for political positions ", "Freedom of speech ", "Joining in a professional organization ", "Paying tax is a responsibility/duty of a citizen. \nThe remaining ones are the rights of a citizen.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("90.", "To carry out your responsibilities, you should ", 0, 0, 0, 0, 0, "avoid your social life ", "liberate yourself from the domination of a community spirit ", "compromise the rights of others ", "sacrifice some of your private interests ", "For instance, when a person is doing his work, he may sacrifice his entertainment time.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("91.", "When an organization is founded and operated by individuals that dispense their knowledge, time and energy free of charge, then the organization can be considered as \n", 0, 0, 0, 0, 0, "a voluntary organization. ", "a share company. ", "a religious organization. ", "a multi-national corporation. ", "A voluntary organization is a non-profit organization formed by a group of people(volunteers) aiming at a common good.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("92.", "Members of a state who fulfill their respective duties effectively are best described as \n", 0, 0, 0, 0, 0, "religious leaders ", "political leaders ", "responsible citizens ", "senior citizens ", "A responsible citizen is a citizen of a country that abides by the law and fulfills their obligation. \nNote: Member of a state of means member(citizen) of a country does not necessarily mean members of a government.\n", "c", 0, 1, this.f515b));
        arrayList.add(new questions("93.", "Fulfilling one's responsibility legally and politically results \n", 0, 0, 0, 0, 0, "rewarding consequences ", "a Parochial political culture ", "a one side political culture ", "punishing consequences ", "Fulfilling one's responsibility results in a rewarding consequence. For example, a government officer who fulfills his/her responsibility properly will be rewarded by getting re-elected or getting promoted to a higher level.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("94.", "Paying fair tax, respecting the laws of the land and respecting the rights of others is considered as \n", 0, 0, 0, 0, 0, "commercial obligations. ", "social obligations. ", "moral obligations. ", "legal obligations. ", "• Legal obligation: an obligation that is enforced by law. E.g., paying fair tax, respecting the right of others, respecting the law of the land. \n• Moral obligation: obligation arising out of consideration of right and wrong. E.g., an obligation to help your friend or to support your parent in old age. \n• Social obligation: obligation of individuals and companies to act for the benefit of the community. E.g., charitable act \n• Commercial obligation: an obligation that arises when conducting business. E.g., paying fair tax, working within the scope of the business license.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("95.", "When people learn to protect natural vegetations and engage in re-afforestation, this shows an awareness of people with their \n", 0, 0, 0, 0, 0, "economic benefits. ", "environment. ", "social independence. ", "political interest. ", "Reforestation is the process of replanting trees that have been cleared/removed. Engaging in such activity benefits the environment.\n", "b", 0, 1, this.f515b));
        arrayList.add(new questions("96.", "Why do we need to have established and fair procedures in the governance of society? \n", 0, 0, 0, 0, 0, "To enhance the awareness of citizens regarding rule of law and its predictability. ", "To make people feel their freedom may be constrained. ", "To deny the federal government manage its day-to-day activities.", "To help and comfort regional governments in their daily routines. ", "The rule of law protects basic individual rights by requiring the government to act in accordance with pre-established and clear rules that are enforced by impartial courts with fair procedures.\n", "a", 0, 1, this.f515b));
        arrayList.add(new questions("97.", "The absence of rule of law could cause \n", 0, 0, 0, 0, 0, "make people believe to live even without the existence of the state. ", "the possible replacement of the state with individual cooperation's. ", "no major problem in social life. ", "anarchy, crisis, dictatorship and could even leads to state collapse. ", "Rule of law states that all citizens including the government are accountable to the law. The absence of rule of law causes arbitrary use of power. This leads to anarchy, crisis, dictatorship and even the possibility of state collapse.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("98.", "What roles do individuals and institutions have in combating corruption? \n", 0, 0, 0, 0, 0, "When the public assigns the task as purely a government engagement. ", "When government believes that it is its exclusive domain to combat it. ", "When they act separately to check it. ", "When individuals demonstrate civility, and institutions demonstrate transparency and accountability to combat it ", "Both individuals and institutions have role in combating corruption. Individuals have to be honest and report corruption cases when they happen. Government institution on the other side, have to be transparent and accountable.\n", "d", 0, 1, this.f515b));
        arrayList.add(new questions("99.", "How do we explain the equality and burdens that nations, nationalities and peoples have in Ethiopia? \n", 0, 0, 0, 0, 0, "Equality and burdens of the three group is determined by the size of their population and territory. ", "The three groups are equal and their interaction generates mutual burdens the have to shoulder. ", "Nations are more equal than others. ", "Nationalities could be justified to think to have more rights than peoples. ", "no explanation", "b", 0, 1, this.f515b));
        arrayList.add(new questions("100.", "Public desire means the promotion of the interest of \n", 0, 0, 0, 0, 0, "the general public in a country. ", "distinguished personalities. ", "people living control the power of government only. ", "groups workings against the society. ", "Public desire means the interest of the general public. It can be anything that affects the well-being, rights, or finances of the public at large.\n", "a", 0, 1, this.f515b));
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
        this.f516tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2013.this.timer.setVisibility(0);
                    civics2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    civics2013.this.scr.setVisibility(8);
                    civics2013.this.chr.stop();
                    civics2013.this.toolbar.setVisibility(8);
                    civics2013.this.Relative.setBackgroundColor(-7829368);
                    civics2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2013.this.getBaseContext());
                    int unused = civics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2013.this.highscoreCivics2013 = defaultSharedPreferences.getInt("civ2013hs", 0);
                    int access$600 = civics2013.this.part1 + civics2013.this.part2 + civics2013.this.part3 + civics2013.this.part4 + civics2013.this.part5 + civics2013.this.part6 + civics2013.this.part7 + civics2013.this.part8 + civics2013.this.part9;
                    civics2013.this.resultText.setText(String.valueOf(access$600));
                    civics2013.this.progressbar.setProgress(access$600);
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
                    int unused11 = civics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = civics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = civics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = civics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = civics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = civics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = civics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = civics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "civ2013hs";
                    int unused19 = civics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = civics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = civics2013.this.answered1 + civics2013.this.answered2 + civics2013.this.answered3 + civics2013.this.answered4 + civics2013.this.answered5 + civics2013.this.answered6 + civics2013.this.answered7 + civics2013.this.answered8 + civics2013.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > civics2013.this.highscoreCivics2013) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - civics2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1civ132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1civ133", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1civ134", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1civ135", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1civ136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1civ137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1civ138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1civ139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1civ1310", 0);
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
                        editor.putString("scoreciv131", str3);
                        editor.putLong("date1civ131", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreciv132", str5);
                            editor.putLong("date1civ132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreciv133", str5);
                            editor.putLong("date1civ133", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreciv134", str5);
                            editor.putLong("date1civ134", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreciv135", str5);
                            editor.putLong("date1civ135", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreciv136", str5);
                            editor.putLong("date1civ136", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreciv137", str5);
                            editor.putLong("date1civ137", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreciv138", str5);
                            editor.putLong("date1civ138", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreciv139", str5);
                            editor.putLong("date1civ139", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreciv1310", str5);
                            editor.putLong("date1civ1310", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateciv131", 0);
                    long j12 = defaultSharedPreferences.getLong("dateciv132", 0);
                    long j13 = defaultSharedPreferences.getLong("dateciv133", 0);
                    long j14 = defaultSharedPreferences.getLong("dateciv134", 0);
                    long j15 = defaultSharedPreferences.getLong("dateciv135", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateciv136", 0);
                    long j17 = defaultSharedPreferences.getLong("dateciv137", 0);
                    long j18 = defaultSharedPreferences.getLong("dateciv138", 0);
                    long j19 = defaultSharedPreferences.getLong("dateciv139", 0);
                    long j20 = defaultSharedPreferences.getLong("dateciv1310", 0);
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
                        editor2.putString("iScoreciv131", str4);
                        editor2.putLong("dateciv131", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreciv132", str6);
                            editor2.putLong("dateciv132", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreciv133", str6);
                            editor2.putLong("dateciv133", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreciv134", str6);
                            editor2.putLong("dateciv134", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreciv135", str6);
                            editor2.putLong("dateciv135", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreciv136", str6);
                            editor2.putLong("dateciv136", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreciv137", str6);
                            editor2.putLong("dateciv137", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreciv138", str6);
                            editor2.putLong("dateciv138", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreciv139", str6);
                            editor2.putLong("dateciv139", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreciv1310", str6);
                            editor2.putLong("dateciv1310", l.longValue());
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
                SharedPreferences.Editor editor;
                SharedPreferences.Editor editor2;
                SharedPreferences.Editor editor3;
                SharedPreferences.Editor editor4;
                civics2013.this.scr.setVisibility(8);
                civics2013.this.chr.stop();
                civics2013.this.toolbar.setVisibility(8);
                civics2013.this.Relative.setBackgroundColor(-7829368);
                civics2013.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2013.this.getBaseContext());
                int unused = civics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = civics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = civics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = civics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = civics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = civics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = civics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = civics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = civics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = civics2013.this.highscoreCivics2013 = defaultSharedPreferences.getInt("civ2013hs", 0);
                int access$600 = civics2013.this.part1 + civics2013.this.part2 + civics2013.this.part3 + civics2013.this.part4 + civics2013.this.part5 + civics2013.this.part6 + civics2013.this.part7 + civics2013.this.part8 + civics2013.this.part9;
                civics2013.this.resultText.setText(String.valueOf(access$600));
                civics2013.this.progressbar.setProgress(access$600);
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
                int unused11 = civics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                int unused12 = civics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                int unused13 = civics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                int unused14 = civics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                int unused15 = civics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                int unused16 = civics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                int unused17 = civics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                int unused18 = civics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                int unused19 = civics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                int unused20 = civics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                int access$1800 = civics2013.this.answered1 + civics2013.this.answered2 + civics2013.this.answered3 + civics2013.this.answered4 + civics2013.this.answered5 + civics2013.this.answered6 + civics2013.this.answered7 + civics2013.this.answered8 + civics2013.this.answered9;
                edit.putInt("answered1", 0);
                edit.putInt("answered2", 0);
                edit.putInt("answered3", 0);
                edit.putInt("answered4", 0);
                edit.putInt("answered5", 0);
                edit.putInt("answered6", 0);
                edit.putInt("answered7", 0);
                edit.putInt("answered8", 0);
                edit.putInt("answered9", 0);
                if (access$600 > civics2013.this.highscoreCivics2013) {
                    edit.putInt("civ2013hs", access$600);
                }
                long elapsedRealtime = (SystemClock.elapsedRealtime() - civics2013.this.chr.getBase()) / 1000;
                String str = "dateciv139";
                String str2 = "dateciv138";
                String str3 = "dateciv137";
                String str4 = "dateciv136";
                String str5 = "dateciv135";
                String str6 = "dateciv134";
                String str7 = "dateciv133";
                String str8 = "dateciv132";
                String str9 = "dateciv131";
                SharedPreferences.Editor editor5 = edit;
                String str10 = "date1civ1310";
                String str11 = "date1civ139";
                if (civics2013.this.mode.booleanValue()) {
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ131", 0);
                    String str12 = "date1civ131";
                    String str13 = f;
                    long j2 = defaultSharedPreferences.getLong("date1civ132", 0);
                    Long l = valueOf;
                    String str14 = f2;
                    long j3 = defaultSharedPreferences.getLong("date1civ133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1civ134", 0);
                    String str15 = "date1civ134";
                    String str16 = "date1civ133";
                    String str17 = "date1civ135";
                    long j5 = defaultSharedPreferences.getLong("date1civ135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1civ137", 0);
                    String str18 = "date1civ136";
                    String str19 = "date1civ138";
                    long j7 = defaultSharedPreferences.getLong("date1civ138", 0);
                    long j8 = defaultSharedPreferences.getLong(str11, 0);
                    long j9 = defaultSharedPreferences.getLong(str10, 0);
                    Date date = new Date(j);
                    Date date2 = new Date(j2);
                    Date date3 = new Date(j3);
                    Date date4 = new Date(j4);
                    Date date5 = new Date(j5);
                    Date date6 = new Date(defaultSharedPreferences.getLong("date1civ136", 0));
                    Date date7 = new Date(j6);
                    Date date8 = new Date(j7);
                    String str20 = "date1civ137";
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
                        editor3.putString("scoreciv131", str14);
                        editor3.putLong(str12, l.longValue());
                    } else {
                        editor3 = editor5;
                        String str21 = str14;
                        if (date11.compareTo(date2) == 0) {
                            editor3.putString("scoreciv132", str21);
                            editor3.putLong("date1civ132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor3.putString("scoreciv133", str21);
                            editor3.putLong(str16, l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor3.putString("scoreciv134", str21);
                            editor3.putLong(str15, l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor3.putString("scoreciv135", str21);
                            editor3.putLong(str17, l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor3.putString("scoreciv136", str21);
                            editor3.putLong(str18, l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor3.putString("scoreciv137", str21);
                            editor3.putLong(str20, l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor3.putString("scoreciv138", str21);
                            editor3.putLong(str19, l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor3.putString("scoreciv139", str21);
                            editor3.putLong(str11, l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor3.putString("scoreciv1310", str21);
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
                    long j18 = defaultSharedPreferences.getLong("dateciv1310", 0);
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
                        editor4.putString("iScoreciv131", str13);
                        editor4.putLong(str22, l.longValue());
                    } else {
                        editor4 = editor6;
                        String str30 = str13;
                        if (date24.compareTo(date13) == 0) {
                            editor4.putString("iScoreciv132", str30);
                            editor4.putLong(str23, l.longValue());
                        } else if (date24.compareTo(date14) == 0) {
                            editor4.putString("iScoreciv133", str30);
                            editor4.putLong(str29, l.longValue());
                        } else if (date24.compareTo(date15) == 0) {
                            editor4.putString("iScoreciv134", str30);
                            editor4.putLong(str6, l.longValue());
                        } else if (date24.compareTo(date16) == 0) {
                            editor4.putString("iScoreciv135", str30);
                            editor4.putLong(str28, l.longValue());
                        } else if (date24.compareTo(date23) == 0) {
                            editor4.putString("iScoreciv136", str30);
                            editor4.putLong(str27, l.longValue());
                        } else if (date24.compareTo(date18) == 0) {
                            editor4.putString("iScoreciv137", str30);
                            editor4.putLong(str3, l.longValue());
                        } else if (date24.compareTo(date20) == 0) {
                            editor4.putString("iScoreciv138", str30);
                            editor4.putLong(str2, l.longValue());
                        } else if (date24.compareTo(date21) == 0) {
                            editor4.putString("iScoreciv139", str30);
                            editor4.putLong(str, l.longValue());
                        } else if (date24.compareTo(date22) == 0) {
                            editor4.putString("iScoreciv1310", str30);
                            editor4.putLong("dateciv1310", l.longValue());
                        }
                    }
                    editor = editor4;
                } else {
                    String str31 = str;
                    String str32 = "date1civ134";
                    String str33 = "date1civ133";
                    String str34 = str2;
                    String str35 = str3;
                    String str36 = str5;
                    String str37 = str6;
                    String str38 = str7;
                    String str39 = str8;
                    String str40 = str10;
                    String str41 = str11;
                    String str42 = "date1civ135";
                    String str43 = "date1civ136";
                    String str44 = "date1civ137";
                    Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i2 = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                    String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                    String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                    long j19 = defaultSharedPreferences.getLong("date1civ131", 0);
                    String str45 = "date1civ131";
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
                    String str52 = "date1civ138";
                    long j25 = defaultSharedPreferences.getLong(str52, 0);
                    long j26 = defaultSharedPreferences.getLong(str41, 0);
                    long j27 = defaultSharedPreferences.getLong(str40, 0);
                    Date date25 = new Date(j19);
                    Date date26 = new Date(defaultSharedPreferences.getLong("date1civ132", 0));
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
                        editor2.putString("scoreciv131", str47);
                        editor2.putLong(str45, valueOf2.longValue());
                    } else {
                        String str55 = str47;
                        editor2 = editor5;
                        if (date36.compareTo(date26) == 0) {
                            editor2.putString("scoreciv132", str55);
                            editor2.putLong("date1civ132", valueOf2.longValue());
                        } else if (date36.compareTo(date27) == 0) {
                            editor2.putString("scoreciv133", str55);
                            editor2.putLong(str48, valueOf2.longValue());
                        } else if (date36.compareTo(date28) == 0) {
                            editor2.putString("scoreciv134", str55);
                            editor2.putLong(str49, valueOf2.longValue());
                        } else if (date36.compareTo(date29) == 0) {
                            editor2.putString("scoreciv135", str55);
                            editor2.putLong(str50, valueOf2.longValue());
                        } else if (date36.compareTo(date30) == 0) {
                            editor2.putString("scoreciv136", str55);
                            editor2.putLong(str51, valueOf2.longValue());
                        } else if (date36.compareTo(date31) == 0) {
                            editor2.putString("scoreciv137", str55);
                            editor2.putLong(str44, valueOf2.longValue());
                        } else if (date36.compareTo(date35) == 0) {
                            editor2.putString("scoreciv138", str55);
                            editor2.putLong(str52, valueOf2.longValue());
                        } else if (date36.compareTo(date33) == 0) {
                            editor2.putString("scoreciv139", str55);
                            editor2.putLong(str54, valueOf2.longValue());
                        } else if (date36.compareTo(date34) == 0) {
                            editor2.putString("scoreciv1310", str55);
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
                    long j37 = sharedPreferences3.getLong("dateciv1310", 0);
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
                        editor.putString("iScoreciv131", str46);
                        editor.putLong(str56, valueOf2.longValue());
                    } else {
                        String str65 = str46;
                        editor = editor7;
                        if (date47.compareTo(date38) == 0) {
                            editor.putString("iScoreciv132", str65);
                            editor.putLong(str59, valueOf2.longValue());
                        } else if (date47.compareTo(date39) == 0) {
                            editor.putString("iScoreciv133", str65);
                            editor.putLong(str61, valueOf2.longValue());
                        } else if (date47.compareTo(date40) == 0) {
                            editor.putString("iScoreciv134", str65);
                            editor.putLong(str62, valueOf2.longValue());
                        } else if (date47.compareTo(date41) == 0) {
                            editor.putString("iScoreciv135", str65);
                            editor.putLong(str64, valueOf2.longValue());
                        } else if (date47.compareTo(date42) == 0) {
                            editor.putString("iScoreciv136", str65);
                            editor.putLong(str4, valueOf2.longValue());
                        } else if (date47.compareTo(date43) == 0) {
                            editor.putString("iScoreciv137", str65);
                            editor.putLong(str35, valueOf2.longValue());
                        } else if (date47.compareTo(date44) == 0) {
                            editor.putString("iScoreciv138", str65);
                            editor.putLong(str34, valueOf2.longValue());
                        } else if (date47.compareTo(date45) == 0) {
                            editor.putString("iScoreciv139", str65);
                            editor.putLong(str31, valueOf2.longValue());
                        } else if (date47.compareTo(date46) == 0) {
                            editor.putString("iScoreciv1310", str65);
                            editor.putLong("dateciv1310", valueOf2.longValue());
                        }
                    }
                }
                editor.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2013.this.scr.setVisibility(8);
                civics2013.this.chr.stop();
                civics2013.this.toolbar.setVisibility(8);
                civics2013.this.Relative.setBackgroundColor(civics2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2013.this.scr.setVisibility(0);
                civics2013.this.toolbar.setVisibility(0);
                civics2013.this.telegram_layout.setVisibility(8);
                civics2013.this.chr.start();
                civics2013.this.Relative.setBackgroundColor(civics2013.this.getResources().getColor(C2719R.C2720color.white));
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
                civics2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
