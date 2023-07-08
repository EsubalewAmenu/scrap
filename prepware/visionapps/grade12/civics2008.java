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

public class civics2008 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f505b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2008;
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
    private Toolbar f506tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2008);
        this.f505b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2008);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2008);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is true about Ethiopia? ", 0, 0, 0, 0, 0, "It was one of the following members of the world trade organization.", "It joined the League of Nations when most of the African countries were under colon. ", "It sent peacekeeping force to South Korea immediately after the First World War. ", "It becomes the member of the United Nations before the Second World War. ", "Ethiopia is one of the founding members of the United League when most of African countries under colonial rule. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("2.", "Which of the following is correct about the council of constitutional inquiry? ", 0, 0, 0, 0, 0, "It examines constitutional disputes and submits recommendations to the house of the federation. ", "It has the power to make decisions on matters of constitutional dispute.", "It is established by a law enacted by the house of the federation. ", "It undertakes its activities under the supervision of the council of ministers ", "", "", 0, 1, this.f505b));
        arrayList.add(new questions("3.", "Which of the following country is considered as a model parliamentary democracy? ", 0, 0, 0, 0, 0, "United Kingdom. ", "South Korea ", "Russia Federation ", "United states of America ", "democratic system runs in three ways - Parliamentary, presidential and Combined. Parliamentary and Presidential Britain is a good example of Parliamentary Democracy. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("4.", "Which of the following is a democratic right? ", 0, 0, 0, 0, 0, "Rights to life and liberty. ", "Freedom of religion and belief ", "Rights of assembly and demonstration. ", "The right to the security of person.", "The Democratic Rights are fundamental rights of individuals and peoples in a democratic society that are protected by the law and those rights mainly reserved for citizens of a democratic nation.\nDemocratic rights include: Citizens in a democracy have many democratic rights to enjoy These include \n-\tThe rights of thought                \n-\tFreedom of Movement\n-\tFreedom of association \n-\tThe rights of opinion and \n-\tThe rights of expression. \n", "c", 0, 1, this.f505b));
        arrayList.add(new questions("5.", "One of the following indicates the importance of a democratic system which one is it? ", 0, 0, 0, 0, 0, "Upholds absolute equality among citizens. ", "It gives people's representatives unlimited political power. ", "It allows citizen to have a little participation in policy debate. ", "It promotes economic, cultural and political equality. ", "One of the importance of democracy is it promotes economic. Social culture, and political equalities of citizens. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("6.", "Direct democracy can be: ", 0, 0, 0, 0, 0, "Used to pass proclamation in a parliamentary system. ", "Practiced to make important decisions through a referendum. ", "Considered as a modern from of democracy widely practiced all over the world.", "Easily practiced in small countries in the process of policy making. ", "direct democracy is the ancient form which still works among communities of a small size. Today, it can be practiced when a referendum is requested by political groups or a community. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("7.", "Which of the following is correct in the current Ethiopian context? ", 0, 0, 0, 0, 0, "Both direct democracy and indirect democracy are exercised in today's Ethiopia. ", "There is no opportunity to exercise direct democracy in the country, ", "The country exercises parliamentary and presidential democracies.", "As compared to group rights, the country gives priority to individual rights. ", "Both direct democracy and in direct democracy exercised in currents Ethiopian, ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("8.", "Which of the following is correct in a democratic system? ", 0, 0, 0, 0, 0, "Elected representatives are not accountable for failures in official duties. ", "Government officials are protected from legal scrutiny during their term of office. ", "Diversity of political views are appreciated and managed in civil manner ", "High government official shall inform the people about military strategies of the country. ", "Democracy is further defined as (a:) \"government by the people; especially: rule of the majority (b:) \"a government in which the supreme power is vested in the people and exercised by them directly or indirectly through a system of representation usually involving periodically held free elections.\" ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("9.", "Which of the following is correct about the Ethiopia federal system? ", 0, 0, 0, 0, 0, "Devolution of power to the regional states moderates the power of the federal state. ", "Members of the house of the federation are directly elected by the people. ", "Collection of revenue and tax is the exclusive power of the federal state. ", "The federal state monopolizes power by controlling foreign, national and local affairs, ", "In democratic republic of Ethiopia Federalism is the principle that promotes the division of power between central (federal) and regional governments. Federalism coordinates the central and regional authorities so that they work together for a common goal.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("10.", "An international climate change convention adopted in 2015 is: ", 0, 0, 0, 0, 0, "The Oslo protocol ", "The Vienna agreement ", "The Beijing declaration", "The Paris agreement ", "the Paris climate conference (COP21) in December 2015, 195 countries adopted the first-ever universal, legally binding global climate deal. The agreement sets out a global action plan to put the world on track to avoid dangerous climate change by limiting global warming to well below 2 degrees Celsius. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("11.", "The sovereignty of the Ethiopian constitution is expressed by the: ", 0, 0, 0, 0, 0, "Power of the council of ministers.", "Existence of several opposition parties. ", "Parliament with elected representatives. ", "Country's rapid economic development.", "In the same vein Rousseau also had written about popular Sovereignty. In his case, however, power resides in the community Paraphrasing Rousseau’s argument Nelson said: “....the members of the community will turn over their natural rights to every other individual...the focus of sovereignty remains within the whole community of which each individual is a part… at the same time all share a portion of that power in their capacity as citizens, If, for example, the state is composed of ten thousand citizens ...each has...a ten-thousandth part of the sovereign authority, though he is entirely subjected to it.\" (Brian Nelson, 231). ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("12.", "The author of the declaration of independence is: ", 0, 0, 0, 0, 0, "Abraham Lincoln. ", "George Washington. ", "John F Kennedy ", "Thomas Jefferson. ", "Thomas Jefferson, a spokesman for democracy, was an American Founding Father, the principal author of the Declaration of Independence (1776), and the third President of the United States (1801-1809). ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("13.", "An international organization established after the second world war to assist the reconstruction of Europe is: ", 0, 0, 0, 0, 0, "World bank ", "World trade organization. ", "Intergovernmental development authority ", "International monetary fund, ", "The World Bank was created at the 1944 Bretton Woods Conference, along with three other institutions, including the International Monetary Fund (IMF). The president of the World Bank is, traditionally, an American. The World Bank and the IMF are both based in Washington, D.C, and work closely with each other. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("14.", "Which of the following is correct about the democratic system exercised in Ethiopia? ", 0, 0, 0, 0, 0, "The system of checks and balances of Ethiopia and the United States is quite similar. ", "The country has begun developing the culture of democracy in the recent decades. ", "The country exercises a democratic system similar to the French political system.", "The country's president can cancel bills approved by the House of Representatives. ", "The democratic system in Ethiopia has begun developing the culture of democracy over the last two decades. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("15.", "Which of the following is correct about the League of Nations? ", 0, 0, 0, 0, 0, "It accepted most of the Africa countries as its members. ", "It accepted Ethiopia as its member without any opposition. ", "It failed to protect Ethiopia from the Italian invasion. ", "It was a global organization established before World War I. ", "The League of Nations could not stop powerful nations (e.g, in 1923, when France invaded the Ruhr, and Italy occupied Corfu and Italy invaded Ethiopia). ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("16.", "Which of the following true about the organization of Africa unity (OAU)? ", 0, 0, 0, 0, 0, "Its headquarter was changed three times. ", "It was founded by independent Africa countries. ", "Its first headquarter was in Dakar, Senegal. ", "It was established by former British colonies. ", "the Union of African States, an early confederation that was established by Haile Selassie and Kwame Nkrumah in the 1960s, as well as subsequent attempts to unite Africa, including the Organization of African Unity (OAU), which was established on May 25, 1969 and the African Economic Community in 1981. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("17.", "One of the following is correct about the federal system of Ethiopia. Which one is it? ", 0, 0, 0, 0, 0, "It allows the federal system to interfere in every aspect of regional affairs. ", "Its strengths the authority of the center by weakening the power to regional states. ", "It gives the federal state an exclusive power to control economic matters in the regional states. ", "It allows regional stats to develop and implement their own development programs. ", "According to the principle of federalism, each government function should be performed by the lowest level of government that is capable of performing that function effectively. To formulate and execute economic, social and development policies, strategies and plans of the State ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("18.", "Which of the following is correct about the hybrid democratic system practiced in countries like France? ", 0, 0, 0, 0, 0, "The president is assigned as a powerful head of the government. ", "The prime minister leads the government under a close supervision of the president ", "The president serves as the head of the state with a normal political power ", "The prime minister is elected by a popular vote through a separate electoral ", "Hybrid of the first Parliamentary and Presidential democracy. \n\n-\tThe people elect the President in this system. \n\n-\tThe members of the legislature are elected by another process. \n\n-\tThe Prime Minister is elected from the winning party. \n\n-\tPresident is head of state with defined power and authority. \n\n-\tThe Prime Minister is head of government.\n\n-\tFrance exemplifies the hybrid system of democracy. \n", "a", 0, 1, this.f505b));
        arrayList.add(new questions("19.", "Which Of the following is correct about the nature of a modern democratic constitution? ", 0, 0, 0, 0, 0, "It requires a permanent constitutional assembly to draft relevant amendments. ", "The responsibility of drawing up a constitution is given to the parliament. ", "It is subject to amendments to accommodate rapidly changing circumstances. ", "The existence of constitutional law guarantees the prevalence of the rule of law. ", "modern constitutional democracy is representative democracy and relates to (1) who holds and exercises political authority, (2) how political authority is acquired and retained, and (3) the significance of the latter as regards popular control and public accountability of those persons who hold and exercise political authority ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("20.", "Which of the following is INCORRECT about globalization? ", 0, 0, 0, 0, 0, "It strengthens the interconnectedness of countries around the world. ", "It affects developed and developing countries in a similar way. ", "It has economic, political and cultural implications for world countries. ", "It brings opportunities as well as challenges for developing countries. ", "Financial and industrial globalization is, increasing substantially and new both industrialized and developing countries: The largest impact has been on developing, Countries who are able to attract foreign investors and foreign capital. This has led to both positive and negative effect for those countries. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("21.", "Which of the following is correct about the rule of law? ", 0, 0, 0, 0, 0, "It manifests itself in all forms of government and political system. ", "Its existence bas on connection with the prevalence of democracy.", "It establishes restrictions on government officials to protect the rights of citizens. ", "It sets citizens free to enjoy their rights without legal restrictions. ", "The rule of law is the legal principle that law should govern a nation, as opposed to being governed by arbitrary decisions of individual government officials. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("22.", "The best way of fighting against corruption is: ", 0, 0, 0, 0, 0, "Waiting for the good will of government officials. ", "Accepting corruption as a problem existing everywhere. ", "Adapting to the situation and tolerating corrupt officials. ", "Mobilizing active and informed public movements. ", "the best way fighting corruption: citizens have to respect the constitution, be honest and truthful in their daily activities and be ready to combat corruption in every way possible.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("23.", "Which of the following is correct about constitutionalism? ", 0, 0, 0, 0, 0, "It shows the prevalence of the parliamentary. ", "It shows that actions of citizens and government are governed by the supreme law. ", "It indicates the existence of a modern written constitution. ", "It prevails in all forms of political system in the modern world. ", "constitutionalism is the idea, often associated with the political theories of John Locke and the founders of the American republic, that government can & should be legally limited in its powers, & that its authority or legitimacy depends on it observing these limitations. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("24.", "Which of the following is INCORRECT about corruption? ", 0, 0, 0, 0, 0, "It erodes public confidence in government offices. ", "It hinders the development process of a country. ", "It discourages domestic and international investment. ", "It includes all sorts of illegal and criminal activities.", "Corruption \n\n-\tIs an act or acts undertaken with the deliberate intent to extract personal and/or private rewards at the expense of others. \n\n-\tIs morally wrong and one of the ways of breaking rule of law. it is a serious problem that countries are suffering from and a setback to the development efforts of a nation. \n", "d", 0, 1, this.f505b));
        arrayList.add(new questions("25.", "Which if the following is correct about corruption? ", 0, 0, 0, 0, 0, "It is an abuse of public office for private gains. ", "It is a problem of some developing countries. ", "It can be eradicated through harsh penalties, ", "It has been eliminated from developed nations. ", "The fight against corruption requires the active and full participation of the public and the unreserved commitment of, among others, each and every government institution. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("26.", "Which of the following is correct about Ethiopia during the period of emperor Hailesilassie? ", 0, 0, 0, 0, 0, "Ethiopia defeated the Italian army at the battle of Adwa. ", "Ethiopia was invaded by a two western colonial power: Italy and Germany. ", "Ethiopia became a member of the League of Nations and the United Nations. ", "Ethiopia had a strong relationship with socialist countries of the time. ", "During the period Emperor Haile Selassie Ethiopia become the member of league of Nations. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("27.", "One of the following contradicts the rule of law and procedural justice in relation to accused persons. Which one is it? ", 0, 0, 0, 0, 0, "Allowing accused persons to have access to any evidence presented against them. ", "Arresting accused persons without informing the charges against them. ", "Giving the charges against them in writing with sufficient particulars. ", "Informing the charges against them in the language they understand well.", "No person who is arrested shall be detained in custody without being informed; as soon as may be, of the grounds for such arrests nor shall he be denied the right to consult, and to be defended by, a legal practitioner of his Choice. it confers four following fundamental rights upon a person who has been arrested: \n\n-\tRight to be informed, as soon as may be, of the grounds for such arrest. \n\n-\tRight to consult and to be defended by a legal practitioner of his choice. \n\n-\tRight to be produced before the nearest magistrate within twenty-four hours of his arrest excluding the time necessary for the journey from the place of arrest to the Court of Magistrate. \n\n-\tRight not to be detained in custody beyond the period of twenty-four hours without the authority of the Magistrate \n", "b", 0, 1, this.f505b));
        arrayList.add(new questions("28.", "Which of the following is incorrect about legal provisions? ", 0, 0, 0, 0, 0, "They must be impartial and free of bias. ", "They must be free from ambiguous jargons. ", "They shall not contradict constitutional laws. ", "They shall be complex and abstract. ", "The provision /making law Laws cannot be challenged except where they are in conflict with constitutional rules. Rules cannot contradict ordinary laws or a proclamation. There are also rules made by associations that govern the behavior of their members. Understanding the law-making process helps us to identify whether a law is fair, clear, and easy to follow without contradicting the rule of law and social values. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("29.", "Which of the following is correct about the protection against double jeopardy? ", 0, 0, 0, 0, 0, "A person convicted for an offence shall not be convicted again for the same offence. ", "A person charged for a crime has the right to a quick public trial. ", "An accused person has the right to be represented by a legal counsel. ", "A person charged for an offence has no burden to prove his /her innocence.", "double jeopardy is the prosecution or punishment of a person twice for the same offence. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("30.", "Which of the following is true based on due process of law? ", 0, 0, 0, 0, 0, "Judges in the court of law are expected to support the defendant ", "Arrested persons can appeal for habeas corpus after forty-eight hours. ", "", "", "Due process of law: means, the conduct of legal proceedings according to established rules and principles for the protection and enforcement of private rights, including notice and the right to a fair hearing before a tribunal with the power to decide the case. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("31.", "", 0, 0, 0, 0, 0, "", "", "", "", "citizens Right to a prompt, fair trial by jury. Right to vote in elections for public officials, right to apply for federal employment requiring Ethiopian citizenship. Freedom to pursue \"life, liberty, and the pursuit of happiness.\" ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("32.", "", 0, 0, 0, 0, 0, "", "", "", "", "The first Woyane movement took place in Tigray immediately after the liberation of Ethiopia from the Italian occupation (1941). The major causes were: \n\n-\tAdministrative inefficiency, \n\n-\tCorruption and \n\n-\tGreediness of the army stationed in Raya and Azabo \n\n-\tFeudalistic conflicts of interests \n", "d", 0, 1, this.f505b));
        arrayList.add(new questions("33.", "", 0, 0, 0, 0, 0, "", "", "", "", "governments abiding by the rule of law is that application of the principle of no man is above the law. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("34.", "", 0, 0, 0, 0, 0, "", "", "", "", "The federal and the regional constitutions define the relationship and the power division existing between the federal and regional governments. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("35.", "", 0, 0, 0, 0, 0, "", "", "", "", "The federal state shall have the single constitution that governs the federal and regional states. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("36.", "", 0, 0, 0, 0, 0, "", "", "", "", "the main purpose of having the three organs of government is maintaining the system of checks and balances. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("37.", "A belief in the superiority of one's cultural groups refers to ", 0, 0, 0, 0, 0, "Ethnocentrism ", "Prejudice ", "Cultural relativism ", "Cultural universalism", "ethnocentrism is belief in the intrinsic superiority of the nation, culture, or group to which one belongs, often accompanied by feelings of dislike for other groups ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("38.", "The major purpose of interest groups is ", 0, 0, 0, 0, 0, "Taking political power. ", "Supporting the ruling party. ", "Struggling against government ", "Influencing ", "Interest groups can be either public or private. A public interest group attempts to attain benefits for society as whole, these groups are usually related to causes like the environment, animal rights, or civil rights ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("39.", "Which of the following is true about the Derg period? ", 0, 0, 0, 0, 0, "“Land of the Tiller\" was declared. ", "Multi-party system was encouraged, ", "A democratic system was promoted. ", "A civilian government ruled the country. ", "immediately after claiming power, the Derg regime declared “land to the tiller\" ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("40.", "Which of the following has a negative implication for gender equality in Ethiopia? ", 0, 0, 0, 0, 0, "Current legal provisions on property rights. ", "Customs that force women to undergo female genital cutting.", "Affirmative actions aimed at empowering girls and women. ", "Legal provisions against harmful traditional practices.", "Affirmative action is a two-pronged effort that includes \"the right of all persons to be … to defend the policy in proportion to its exclusionary effect (Lovell 1974) … Stereotypes are notorious for stressing the negative qualities of a given group, Racial minorities and women have been consistently discriminated again. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("41.", "Which of the following true about the purpose of civic knowledge? ", 0, 0, 0, 0, 0, "Making citizen politically motivated. ", "Empowering citizens to make an informed decision. ", "Promoting abstract and theoretical knowledge. ", "Encouraging people to be extremely religious. ", "the purpose civic knowledge is for empowering citizens to make informed decision. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("42.", "The consequence of unfair distribution of benefits and burdens can be manifested in: ", 0, 0, 0, 0, 0, "Strengthening cooperative attitude. ", "Encouraging hard working people. ", "Spreading violence and conflict. ", "Accelerating the development process. ", "The consequences of unfair distribution of benefits and burdens can be manifested in spreading violence and conflict. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("43.", "Which of the following is correct about affirmative action? ", 0, 0, 0, 0, 0, "It is a practice widely implemented by poor countries. ", "It gives excessive advantage to one group against another. ", "Some people consider it as another form of discrimination. ", "It is criticized for giving an enormous power to rich people. ", "There are people who argue that affirmative action’s go against the principle of equality. Some people consider affirmative action as reverse discrimination and, therefore, Women have historically ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("44.", "One of the following is correct about equity of benefits and burdens Which one is it? ", 0, 0, 0, 0, 0, "Minority groups are entitled to fewer benefits. ", "Those who shoulder heavy burden should gain more benefit.", "Burdens, not benefits, should be distributed equally. ", "Those who work less should be generously subsidized. ", "equity of benefits and burdens means those who shoulder heavy burden should gain more benefits. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("45.", "Which of the following is correct about equality? ", 0, 0, 0, 0, 0, "Equality refers to the provision of equal opportunity for all concerned", "Remedial actions for past injustices contradicts the principle of equality. ", "In exercising equality the use of rights cannot be conditioned by obligations", "Providing equal opportunity can be considered as an affirmative action.", "equality is the right not to be treated differently because of age, race, sex, ability, political views or any other status; it means being treated the same as others. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("46.", "Which of the following is correct about gender issues in Ethiopia? ", 0, 0, 0, 0, 0, "The current regime is the first to raise the question of gender equality. ", "Gender equality has been respected throughout the history of the country. ", "Currently Ethiopian women are benefiting from affirmative actions. ", "Women were exclusively removed from political power in the history of Ethiopia. ", "The history of human society for the most part, is marked by unfair treatment for women. Women in Ethiopia are often denied the same rights that men enjoy but through affirmative action, today women in Ethiopia are enjoying many advantages. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("47.", "In most countries the term \"government benefits\" are related to, ", 0, 0, 0, 0, 0, "Payment of wages", "Collection of taxes. ", "Protection of public properties. ", "Social welfare provisions. ", "Welfare is the provision of a minimal level of well-being and social support for all citizens, sometimes referred to as public aid. In most developed countries, welfare is largely provided by the government. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("48.", "The principle that says people darning the same amount of income should pay the same amount of tax is called ", 0, 0, 0, 0, 0, "ability to pay ", "democratic taxation ", "horizontal equality ", "progressive taxation", "this principle claims that there is \"equal treatment of equals.\" In other words; individuals who have the same wealth, or are in the same income bracket, should face the same tax rate. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("49.", "In terms of morality, which of the following is the best way of earning a better income? ", 0, 0, 0, 0, 0, "Disregarding some professions. ", "Looking for easy ways of making money. ", "Working hard in the area of one's profession. ", "Creating friendship with wealthy persons. ", "the best way of earning a better income is working hard in the area of one's profession. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("50.", "Which of the following is quite different from all others? ", 0, 0, 0, 0, 0, "Racial discrimination ", "Affirmative action", "Reverse discrimination ", "Positive discrimination", "affirmative action/ positive discrimination is the policy of favoring member of a disadvantaged group.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("51.", "Which of the following was a civil rights activist struggled against racial discrimination in the United States of America? ", 0, 0, 0, 0, 0, "Martin Luther King Junior ", "Nelson Mandela. ", "Mohandas Gandhi. ", "Thomas Jefferson", "Martin Luther King, Jr, (January 15, 1929 - April 4, 1968) was an American Baptist minister and activist who was a leader in the African-American Civil Rights Movement. He is best known for his role in the advancement of civil rights using nonviolent civil dis obedience based on his Christian beliefs. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("52.", "Tolerance of diversity contradicts ", 0, 0, 0, 0, 0, "Respecting different viewpoints.", "Appreciating religious pluralism. ", "Respecting the rights of cultural groups. ", "Promoting a single political identity. ", "tolerance & diversity contradict with appreciating religious pluralism. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("53.", "Collecting different amount of tax from different amount of income is reflected in ", 0, 0, 0, 0, 0, "Circular equity ", "Vertical equity ", "parallel equity", "generalized equity ", "This principle claims that wealthier people, or those with access to more resources, should pay higher taxes. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("54.", "Which of the following is true about professional ethics? ", 0, 0, 0, 0, 0, "Principles that guide persons in performing their job. ", "Guiding standards motivated by political ideology. ", "Behaving based on religious principles and doctrines. ", "Guiding values of personal conduct in ever day life situation. ", "Professional Ethics to guide the professional and personal conduct of members of the association and/or its certification holders in performing his/her jobs. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("55.", "Which of the following is an indication of poverty? ", 0, 0, 0, 0, 0, "Low mortality rate. ", "High level of literacy. ", "Income below one dollar per day. ", "High average life expectancy. ", "lack of income and productive resources to ensure sustainable livelihoods; hunger and malnutrition; ill health; limited or lack of access to education and other basic services; increased morbidity and mortality from illness; homelessness and inadequate housing, unsafe environments and social media. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("56.", "Which of the Regional States of the FDRE uses a camel as an emblem of its flag? ", 0, 0, 0, 0, 0, "The State of Afar. ", "The State of Benishangul /Gumuz. ", "The State of the Gambela Peoples. ", "The State of Somale. ", "an emblem of the flag of the regional state of Somalia is camel. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("57.", "One of the following is true about voluntary organizations. Which one is it?", 0, 0, 0, 0, 0, "Controlled by government authorities. ", "Focus on social, economic or environmental issues. ", "Mainly interested in political activities. ", "Aim at a maximizing the economic benefits of their founders. ", "Voluntary organization are the most important community organizations have.\" The ability of people to resource willingly together for the betterment of their community (focused on work social; economic, and environmental issues).", "b", 0, 1, this.f505b));
        arrayList.add(new questions("58.", "Secondary sources of history include: ", 0, 0, 0, 0, 0, "Ancient buildings ", "Diaries and coins. ", "Inscriptions and monuments. ", "History books. ", "In the study of history as an academic discipline, a primary can include an artifact, diary, manuscript. whereas the secondary sources are history books", "d", 0, 1, this.f505b));
        arrayList.add(new questions("59.", "Which of the following is Incorrect about tolerance? ", 0, 0, 0, 0, 0, "Accepting and valuing cultural diversity. ", "Appreciating diversity of beliefs and views. ", "Promoting extreme locality to one's own culture. ", "Rejecting stereotypes about cultural groups. ", "tolerance is willingness to accept feelings, habits, or beliefs are different from your own, The ability to accept, experience, survive something harmful or unpleasant.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("60.", "The traditional meaning of patriotism is: ", 0, 0, 0, 0, 0, "Fighting for the territorial integrity of one's country. ", "Serving communities to promote the common good. ", "Respecting the law and upholding constitutional values. ", "Promoting the development of democracy and peaceful co- existence", "The traditional meaning of patriotism focuses on defending your country in times of war.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("61.", "The Obligations of citizens include: ", 0, 0, 0, 0, 0, "Building a democratic culture. ", "Paying tax regardless of age. ", "Creating a conflict free society. ", "Developing a homogeneous world view", "One the obligation of good citizen is paying tax regardless of ages.", "b", 0, 1, this.f505b));
        arrayList.add(new questions("62.", "Which of the following is true about morality? ", 0, 0, 0, 0, 0, "It is also called ethos and moral philosophy ", "It is a system of principles that guides human conducts ", "It is the philosophical study of human behavior. ", "It studies how moral standards affect human behavior ", "Morality speaks of a system of behavior in regards to standards of right or wrong behavior", "b", 0, 1, this.f505b));
        arrayList.add(new questions("63.", "Which of the following is Incorrect about cultural relativism? ", 0, 0, 0, 0, 0, "It encourages people to appreciate cultural diversity. ", "It encourages ethnocentric feelings and practices. ", "It minimizes conflicts among different cultural groups. ", "It helps us to understand cultural values in their context. ", "Cultural relativism is widely accepted in modern anthropology, Cultural relativists believe that all cultures are worthy in their own right and are of equal value.", "b", 0, 1, this.f505b));
        arrayList.add(new questions("64.", "Which of the following is Incorrect about Ethiopia? ", 0, 0, 0, 0, 0, "It became a member of the League of Nations in 1923. ", "It became a member of the United Nations in 1945. ", "It sent a peacekeeping force to North Korea in 1945. ", "It contributed a lot to the foundation of the OAU in 1963. ", "Ethiopia as an independent and sovereign state. Consequently, other European countries- followed suit in recognizing Ethiopia's independence. Diplomatic legations were established in Addis Ababa, Ethiopia joined the League of Nations in 1923, three years after its establishment and it contributed a lot to the foundation of OAU.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("65.", "Duties of a patriotic citizen include: ", 0, 0, 0, 0, 0, "Refraining from criticizing government policies and strategies. ", "Being skeptical about the symbolic importance of the national flag. ", "Striving to promote individual interests at the expense of the public good. ", "Fighting against enemies to defend the national security. ", "The traditional meaning of patriotism focuses on defending your country in times of war.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("66.", "Which of the following is correct about national security and international community? ", 0, 0, 0, 0, 0, "Rich countries reduced development aid to poor countries to deal with security matters related to terrorism. ", "Terrorist activities attacking the USA do not pose a threat to African countries. ", "National security can be achieved in absence of international security ", "Absence of security in Ethiopia would not affect the Horn of Africa and the Middle East. ", "national security is a concept that a government, along with its parliaments, should protect the state and its citizens & against all kind of \"national\" crises affect the support of developed countries to the developing ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("67.", "Which of the following is correct about global relations and concerns? ", 0, 0, 0, 0, 0, "Issues like poverty are concerns of a few countries of the world ", "The world is increasingly becoming bigger enabling countries to ignore globalization. ", "Competition between countries has to be supported by cooperation to ease tension. ", "Possession of nuclear weapons by several countries is a guarantee for global peace. ", "In global relation competition between countries has to be supported by cooperation’s to ease the tension.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("68.", "Which of the following is Incorrect about labor discipline? ", 0, 0, 0, 0, 0, "Proper dressing style. ", "Practicing religion in the work place, ", "Respecting working hours. ", "Building good working relationship. ", "Labor discipline includes proper dressing style, respecting working hours and building good working relationships. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("69.", "Economic policy is: ", 0, 0, 0, 0, 0, "A perspective derived from academic research. ", "An annual plan of action of a particular project. ", "A specific guideline for a day-today economic activity. ", "A general direction for the economy of a country. ", "Economic policy refers to the actions that governments take in the economic field. It covers the systems for setting levels of taxation, government budgets, the money supply and interest rates as well as the labor market, national ownership, and many other areas of in to the economy. ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("70.", "Which of the following is Incorrect about a genuine source of job satisfaction? ", 0, 0, 0, 0, 0, "Gaining social recognition as a result of a good work. ", "Achieving success through collaboration with colleagues. ", "Maximizing economic benefits using public resources. ", "Achieving top performances and getting career development. ", "job satisfaction as “a pleasurable or positive emotional state” resulting from the appraisal of one's Job or job experience.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("71.", "The character of an assertive person is manifested in: ", 0, 0, 0, 0, 0, "Little or no expression during discussions. ", "An unfair demands and biased point of views ", "A good eye contact during conversation. ", "Moving away from group discussions and deliberation. ", "Assertive behavior includes being an active listener; behavior which includes good eye contact, not interrupting when the other person speaks. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("72.", "Which of the following is Incorrect about the behavior of aggressive persons? ", 0, 0, 0, 0, 0, "Speaking too loudly and string at others. ", "Standing rigidly and invading personal boundaries. ", "Forwarding treating expressions and looking down others. ", "Having an open and polite expression. ", "Characteristics on aggressive behavior include expressing your feelings, needs, and ideas at the expense of Others. Aggressive persons Stand up for their rights, but ignore the rights of others; they may dominate or humiliate other people, while this behavior is expressive, it is also defensive, hostile, and self-defeating.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("73.", "The protection and preservation of the environment includes: ", 0, 0, 0, 0, 0, "Clearing the existing forest areas to expand mechanized farming. ", "Replacing small-holder's farming by mechanized and large-scale farming. ", "Enhancing environment-friendly development plans and activities. ", "Expanding agricultural practices that use a large amount of chemical fertilizers. ", "Preserving and protecting our environment is one of the goals of the government of every country in the world by enhancing environmental friendly developments plans and activities. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("74.", "Which of the following is ethically correct in providing services in the medical profession? ", 0, 0, 0, 0, 0, "Giving priority to people from the upper economic class. ", "Giving priority to one's relatives, friends and colleagues. ", "Disclosing medical statuses and private matters of patients. ", "Giving priority Co patients who are in a critical situation. ", "the medical profession has always been held in the highest esteem by the public, who look to their doctors for the relief of suffering and ailments. This includes giving priority to the patients who are in critical situations ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("75.", "Which of the following assertion correct about dependency", 0, 0, 0, 0, 0, "Wise economic policies and effective utilization of resources are essential to overcome dependency. ", "Dependency at the individual level cannot affect the economy of a nation. ", "Dependent persons have ample opportunities to socialize and gain prestige in society. ", "The current world order does not allow poor countries to minimize their level of dependency. ", "In the long run, sustainable development can only happen when a developing country leads the process itself. Having a strong national development strategy with clear policies and results-oriented goals and indicators, is an important factor contributing to reduced aid dependence.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("76.", "Micro economics deals with: ", 0, 0, 0, 0, 0, "Average pre-capita income ", "The behavior of consumers. ", "Gross domestic product of a nation. ", "Rate of inflation in a given country. ", "Microeconomics is the branch of economics that analyzes the market behavior of individual consumers and firms in an attempt to understand the decision-making process of firms and households. It is concerned with the interaction between individual buyers and sellers and the factors that influence the choices made by buyers and sellers. In particular, microeconomics focuses on patterns of supply and demand and the determination of price and output in individual markets (e.g. coffee industry).", "b", 0, 1, this.f505b));
        arrayList.add(new questions("77.", "The habit of saving can be improved by: ", 0, 0, 0, 0, 0, "Worrying much about the present time than the future. ", "Increasing the amount of saving by cutting expenses for basic needs. ", "Limiting desires and purchases to the level of one's income. ", "Borrowing money to satisfy the desire of spontaneous purchases.", "the saving habit can be improved by limiting desires and purchase to the level of one’s income. if you have tea from outside thrice a day, bring it down to once or twice. Packing a meal for work can also be an option.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("78.", "Which of the following is less important to promote a sustainable development in developing countries? ", 0, 0, 0, 0, 0, "Relying on Western innovation and technology. ", "Promoting the culture of hardworking. ", "Investing on human resource development. ", "Developing effective policies and strategies. ", "to ensure sustainable development by promoting the culture of hardworking, investing on human resource development and developing effective polices and strategies.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("79.", "Self-awareness can be improved by: ", 0, 0, 0, 0, 0, "Developing an attitude of superiority. ", "Evaluating our strengths and weaknesses ", "Imitating the behaviors of other people. ", "Focusing on our strengths and good qualities ", "Self-awareness is really just about being aware of who we are. It Can relate to knowing your own values; your beliefs; personal and tendencies preferences by evaluating our strength and weakness. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("80.", "The behavior of a passive person can be observed in his/her: ", 0, 0, 0, 0, 0, "Listening to others without challenging their biased arguments. ", "Playing an active role in public debates and contributing ideas. ", "Sharing opinion without disregarding the views of other people.", "Challenging practices that violate the right and dignity of people. ", "A Person with a passive personality is someone who tries to avoid conflict at all cost. The individual tends to accept things as they are, even if they are not happy, in order to avoid upsetting others. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("81.", "Which of the following is true about saving and saving institutions in Ethiopia?", 0, 0, 0, 0, 0, "Modern banks are the best. options of saving for the majority of the people in most parts of Ethiopia.", "The majority of the people in Ethiopia use Iddir as a of getting credit to start small businesses. ", "Traditional institutions of saving do not help people accumulate initial capital to start a new business. ", "Equb is considered as a means of forced saving because persons involved in it cannot quit easily. ", "Institutions of saving are divided into two: traditional and modern. In Ethiopia there are both traditional and modern institutions for saving and people use both. ", "", 0, 1, this.f505b));
        arrayList.add(new questions("82.", "Which of the following is true about saving? ", 0, 0, 0, 0, 0, "Saving does not require short-term and long-term planning.", "Careful evaluation of one's income and expenses is essential to make decisions regarding saving. ", "We need to avoid spending on vacation and holidays in order to save. ", "Thinking about saving is not essential for people who do not aspire to be rich. ", "Saving is income not spent, or deferred consumption. Methods of saving include putting money aside in, for example, a deposit account, a pension account, an investment fund, or as cash. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("83.", "Which of the following is a negative impact of globalization? ", 0, 0, 0, 0, 0, "Availability of cheaper goods and products. ", "Weakening the sovereignty of developing countries. ", "Easy transfer of knowledge and technology. ", "Better access to communication technologies. ", "globalization has many economy and trade advantages in the developing countries, we must also note the many disadvantages that globalization has created for the poor countries. One reason globalization increases the inequality between the rich and poor, the benefits globalization is not universal; the richer are getting rich and the poor are becoming poorer. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("84.", "The following require moral sensitivity in the medical profession Except ", 0, 0, 0, 0, 0, "Choosing an area of specialization. ", "Making decision related to abortion. ", "Facilitating medically assisted death. ", "Communicating HIV status of a client. ", "medical ethical sensitivity as a type of practical Wisdom that pursues client comfort & professional satisfaction with care delivery ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("85.", "Which of the following is true about self-reliance? ", 0, 0, 0, 0, 0, "Self-reliant person’s reject any kind of support from other people. ", "Self-reliant persons have limited interactions within the society. ", "Building self-confidence is essential to lead a self-reliant life. ", "Self-reliant persons do not consider the comments of other persons. ", "building self-confidence is essential to lead a self— reliance. ", "b", 0, 1, this.f505b));
        arrayList.add(new questions("86.", "The most difficult activity in the process of decision-making is: ", 0, 0, 0, 0, 0, "Looking into alternative options. ", "Showing certain level of flexibility. ", "Gathering information about the issue ", "Avoiding risks and uncertainties. ", "One of most difficult activity in the process of decision making is avoiding risks and uncertainty.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("87.", "Which of the following is Incorrect about International Monetary Fund (IMF)? ", 0, 0, 0, 0, 0, "It is established by rich countries of the Western world. ", "supports developing countries to promote command economy. ", "It requests developing countries to privatize state enterprises. ", "It influences developing countries to liberalize their economy. ", "the International Monetary Fund (IMF) was established by rich countries of the western world; it influences developing countries to liberalize their economy by requesting the developing countries to privatize states enterprises.", "b", 0, 1, this.f505b));
        arrayList.add(new questions("88.", "Which of the following is the least important to address dependency at a county level? ", 0, 0, 0, 0, 0, "Relying on domestic resources and institutions. ", "Developing indigenous knowledge and wisdom. ", "Detaching the country from international trade. ", "Encouraging local innovations and technologies. ", "To address the dependency at a country level are includes: relaying on domestic resources and institutions, developing indigenous knowledge and wisdom and encouraging local innovation and technologies.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("89.", "The advantage of using quality foods produced locally: ", 0, 0, 0, 0, 0, "Encourages the development of domestic factories. ", "Promotes imbalance between import-export trades. ", "Alienates domestic producers from an international trade. ", "Allows domestic factories to produce poor quality goods. ", "one of the advantages of using quality goods produced locally encourages the development of domestic factories.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("90.", "Saving habit can be improved by: ", 0, 0, 0, 0, 0, "Increasing savings during old ages. ", "Increasing saving as income decreases. ", "Avoiding extravagant behavior. ", "Decreasing saving when income increase. ", "Saving habits can be improved by avoiding extravagant behavior.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("91.", "Which of the following matches the pragmatic theory of truth? ", 0, 0, 0, 0, 0, "Truth is measured based on its usefulness for a person or a group of people. ", "What is true at one time may not remain the same at other times. ", "What is true in a given society may not be true in other societies. ", "Truth depends upon objective facts that remain the same in space and time. ", "The second theory of truth is called the pragmatic theory of truth where truth is measured by its usefulness or utility. What is true is that which is useful for a person, group or even a country.", "a", 0, 1, this.f505b));
        arrayList.add(new questions("92.", "Which of the following is correct about the relativity of truth? ", 0, 0, 0, 0, 0, "Truth depends on objective facts. ", "Truth is a universally accepted truth. ", "Truth depends in time and space. ", "Truth is measured based on its utility. ", "One of the philosophical approaches to truth states that true is relative to space and time.", "c", 0, 1, this.f505b));
        arrayList.add(new questions("93.", "The saving of a nation can be enhanced by: ", 0, 0, 0, 0, 0, "Increasing the country's Gross Domestic Product. ", "Increasing the level of domestic consumption. ", "Encouraging the consumption of imported goods. ", "Discouraging the use of locally available products. ", "The saving of a nation can be enhanced by increasing the level of domestic consumptions.", "", 0, 1, this.f505b));
        arrayList.add(new questions("94.", "The power and functions of the FDRE President include: ", 0, 0, 0, 0, 0, "Supervising the implementation of the country's domestic and foreign policies. ", "Leading and coordinating the activities of the Council of Ministers.", "Ensuring the implementation of policies adopted by the House of Representatives ", "Granting pardon based on the conditions and procedures established by law ", "The President of the Federal Democratic Republic of Ethiopia is the Head of State granting pardon based on the conditions and procedures established by law.", "d", 0, 1, this.f505b));
        arrayList.add(new questions("95.", "Which of the following is an ethical conduct essential to build the image of a business company? ", 0, 0, 0, 0, 0, "Using seductive dressing style in the working place. ", "Serving every customer politely and effectively, ", "Giving the best services to rich and powerful customers. ", "Attending social and cultural events during working hours. ", "an ethical conduct is essential in building the image of business company which is serving every customer politely and effectively.", "b", 0, 1, this.f505b));
        arrayList.add(new questions("96.", "Which of the following is true about the command economy? ", 0, 0, 0, 0, 0, "Government plays an important role in controlling market transactions. ", "Market forces play the major role in determining market prices. ", "Producers and consumers have freedom of economic decision making. ", "Economic principles uphold free trade and the removal of trade barriers. ", "In command economy government plays an important role in controlling market transactions. ", "a", 0, 1, this.f505b));
        arrayList.add(new questions("97.", "Which of the following is Incorrect about the benefits of active community participation? ", 0, 0, 0, 0, 0, "Empowering communities to solve their problems. ", "Creating a bridge between government and people. ", "Promoting the interest of opposition political parties. ", "Engaging citizens to promote a holistic development. ", "Active participation of the members in their civic organization enables the attainment of individual and collective goals. Usually, the members of associations have the following characteristics \n-\tthey define themselves as members; \n-\tthey share common goals;\n-\tthey engage in different activities.\n", "c", 0, 1, this.f505b));
        arrayList.add(new questions("98.", "Which of the following is correct about myths? ", 0, 0, 0, 0, 0, "They are facts transmitted from generation to generation ", "They may serve the purpose of enhancing social unity. ", "They do not have social. Cultural and historical significance. ", "They should be dismissed as they have no practical importance ", "Myths are unscientific stories that people would like to tell and believe. They may be used for social unity and to help give an understanding of how society works ", "d", 0, 1, this.f505b));
        arrayList.add(new questions("99.", "An assumption that serves as the basis of research is known as a, ", 0, 0, 0, 0, 0, "Paradigm ", "Perspective ", "Hypothesis ", "Philosophy ", "Hypothesis is an assumption that serves as the basis of research. ", "c", 0, 1, this.f505b));
        arrayList.add(new questions("100.", "The focus of academic reading is: ", 0, 0, 0, 0, 0, "Getting pleasure ", "Developing a hobby ", "Enjoying creative works ", "Acquiring knowledge. ", "The focus of academic reading is acquiring knowledge. ", "d", 0, 1, this.f505b));
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
        this.f506tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2008.this.timer.setVisibility(0);
                    civics2008.this.timer.setText(format);
                }

                public void onFinish() {
                    civics2008.this.scr.setVisibility(8);
                    civics2008.this.chr.stop();
                    civics2008.this.toolbar.setVisibility(8);
                    civics2008.this.Relative.setBackgroundColor(-7829368);
                    civics2008.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2008.this.getBaseContext());
                    int unused = civics2008.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2008.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2008.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2008.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2008.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2008.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2008.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2008.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2008.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2008.this.highscoreCivics2008 = defaultSharedPreferences.getInt("Civics2008hs", 0);
                    int access$600 = civics2008.this.part1 + civics2008.this.part2 + civics2008.this.part3 + civics2008.this.part4 + civics2008.this.part5 + civics2008.this.part6 + civics2008.this.part7 + civics2008.this.part8 + civics2008.this.part9;
                    civics2008.this.resultText.setText(String.valueOf(access$600));
                    civics2008.this.progressbar.setProgress(access$600);
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
                    if (access$600 > civics2008.this.highscoreCivics2008) {
                        edit.putInt("Civics2008hs", access$600);
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
                civics2008.this.scr.setVisibility(8);
                civics2008.this.chr.stop();
                civics2008.this.toolbar.setVisibility(8);
                civics2008.this.Relative.setBackgroundColor(-7829368);
                civics2008.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2008.this.getBaseContext());
                int unused = civics2008.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = civics2008.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = civics2008.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = civics2008.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = civics2008.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = civics2008.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = civics2008.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = civics2008.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = civics2008.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = civics2008.this.highscoreCivics2008 = defaultSharedPreferences.getInt("Civics2008hs", 0);
                int access$600 = civics2008.this.part1 + civics2008.this.part2 + civics2008.this.part3 + civics2008.this.part4 + civics2008.this.part5 + civics2008.this.part6 + civics2008.this.part7 + civics2008.this.part8 + civics2008.this.part9;
                civics2008.this.resultText.setText(String.valueOf(access$600));
                civics2008.this.progressbar.setProgress(access$600);
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
                if (access$600 > civics2008.this.highscoreCivics2008) {
                    edit.putInt("Civics2008hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2008.this.scr.setVisibility(8);
                civics2008.this.chr.stop();
                civics2008.this.toolbar.setVisibility(8);
                civics2008.this.Relative.setBackgroundColor(civics2008.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2008.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2008.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2008.this.scr.setVisibility(0);
                civics2008.this.toolbar.setVisibility(0);
                civics2008.this.telegram_layout.setVisibility(8);
                civics2008.this.chr.start();
                civics2008.this.Relative.setBackgroundColor(civics2008.this.getResources().getColor(C2719R.C2720color.white));
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
                civics2008.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
