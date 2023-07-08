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

public class civics2012 extends AppCompatActivity {
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
    private Boolean f513b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2012;
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
    private Toolbar f514tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2012);
        this.f513b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Identify the correct statement about the meaning and nature of economic development.", 0, 0, 0, 0, 0, "It is wider than the growth GDP ", "It has no relation with citizens' standers of living. ", "It may lead to low life expectancy ", "It can be achieved without plan and strategy. ", "economic development is the certain of wealth from which community benefits are realized. it is more than a jobs program, it’s an investment in growing your economy and exchanging the prosperity and quality of life for all residents.it is wider than the growth of GDP. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("2.", "Voluntarism is very important with respect to ", 0, 0, 0, 0, 0, "developing a culture of completion among citizens. ", "not compensation shortage of resources. ", "wasting the time of citizens. ", "involving citizens in promoting the national interest of one country. ", "voluntarism is very important with respect to involving citizens in promoting the national interest of the country. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("3.", "A rational and responsible citizen behave as ", 0, 0, 0, 0, 0, "environmentally self-centered ", "legally unpredictable ", "respecting constitutional provision ", "morally egoistic ", "A rational and responsive citizens behave as respecting constitutional provision. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("4.", "The correct way to explain promise could mean?", 0, 0, 0, 0, 0, "A lip service ", "Giving a dependable word and keeping it ", "Not to inter in to any contractual commitment. ", "Occasionally being truthful to one's word. ", "The correct ways to explain promise is occasionally being truthful to one's word. keeping promises is the backbone of any healthy relationships. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("5.", "All citizens 'of any state are morally expected to be ", 0, 0, 0, 0, 0, "denying their elders ", "professionally out dated ", "the worst behavior for children. ", "amassing their own wealth through the legal means.", "All citizens of any state morally expected to be amassing their own wealth through legal means. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("6.", "Developing countries like Ethiopia could be impacted by globalization as it ", 0, 0, 0, 0, 0, "brings fair economic relationship among countries of the world ", "always gives rise to positively development. ", "always results in under development. ", "always had both positive and negative effects ", "The effect of Globalization on Developing countries both positive and negative. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("7.", "Assertiveness summarizes the characteristics of ", 0, 0, 0, 0, 0, "very minimum self-esteem ", "unfounded over confidence", "maintaining reasonable amount of self- respect ", "overlooking others ", "Assertiveness is a skill regularly referred to in social and communication, skills training. Being assertive means begin able to stand up for your own: or other people's rights in a clam and positive way, without being either aggressive, or passively accepting wrongs. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("8.", "The effects of outside interference could best be explained as", 0, 0, 0, 0, 0, "an obstacle to sell-promotion every time. ", "an assistance to self- promotion every time. ", "effects of outside interference cannot be qualified. ", "either constructive or destructive based on the communication. ", "The effect of outside interference could best have explained either constrictive or destructive based on the communication.", "d", 0, 1, this.f513b));
        arrayList.add(new questions("9.", "The decision of a self- reliant person is always founded on ", 0, 0, 0, 0, 0, "reason and information", "rumors", "not taking risks. ", "against flexibility ", "The decision of a self-reliant, person is always founded on reason and information.", "a", 0, 1, this.f513b));
        arrayList.add(new questions("10.", "Individuals could always demonstrate wise decision- making skill when they keep in mind that they should be ", 0, 0, 0, 0, 0, "sufficiently increase uncertainty. ", "blindly follow their natural instincts ", "relay on correct thought process ", "relay on other people's values ", "An individual could always demonstrate wise decision-making skills when they keep in mind rely on correct through process. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("11.", "The impact of prevalence of injustice on citizens could be described through", 0, 0, 0, 0, 0, "avoiding arbitrariness ", "creating conflict ", "relay on correct thought process ", "relay on other people's values ", "The impact of prevalence of injustice on citizen could be describe through creating conflict. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("12.", "The duties of any tax payer could he explained as ", 0, 0, 0, 0, 0, "registering, income and paying tax on time ", "always to budget some money for denotation in addition to taxation ", "to wait for the tax collector to came to company to collect the tax", "disregarding the progressive tax rate system", "The duties of any tax payer is registering income. and paying tax on time. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("13.", "Which one- of the following statements correctly described methods of the assessment in Ethiopia? ", 0, 0, 0, 0, 0, "To promote fairness, Ethiopia uses progressive taxation system. ", "To encourage investment, the richest are taxed less. ", "The country uses a secretive taxation system ", "To protect the economy, non- Ethiopians are taxed more. ", "To promote fairness Ethiopia use progressive tax system. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("14.", "One of the followings contributes to the building of patriotism. ", 0, 0, 0, 0, 0, "Celebrating the country's stories than true history. ", "Considering differences as a threat ", "Always using peaceful means to solve disagreements. ", "Exploiting citizens' rights ", "Always using peaceful menace to solve disagreement contributes to building of patriotism ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("15.", "Responsible citizens are believed to have qualities such as. ", 0, 0, 0, 0, 0, "they are antagonistic to morality.", "they are concerned about the well - being of their private comfort.", "they negatively accept diversity. ", "they keep the secrets of the country ", "Responsible citizens are believed to have the qualities of keeping the secrets of the country. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("16.", "In protecting the environment, a citizen should keep in mind to avoid ", 0, 0, 0, 0, 0, "working on technology to get energy ", "damaging the environment for sell-survival ", "look for efficient ways to save energy. ", "entering into green economy to get more money ", "In protecting the environment, a citizen should keep in mind to 'avoid damaging the environment for self-survival. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("17.", "HIV/ AIDS could transmit from person the person through ", 0, 0, 0, 0, 0, "eating together", "clean hand shaking", "living together ", "contaminated medical equipment ", "HIV/ADIS could transmit from person to person through contaminated, medical equipment. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("18.", "When we say work is the only way of rational and legal means we mean that ", 0, 0, 0, 0, 0, "citizen should violate the provisions of commercial laws. ", "people should follow recommendations of all religious holy hooks.", "people should stand against short cuts to income generation ", "citizen should not be governed labor discipline.", "When we say work is the only way of rational and legal means we mean that people should against shortcut income generation ways.", "c", 0, 1, this.f513b));
        arrayList.add(new questions("19.", "professional duties could be properly fulfilled through ", 0, 0, 0, 0, 0, "following the professional code of conduct. ", "following irrationally the managers order all the time. ", "following arbitrary procedures. ", "following the political atmosphere of the day. ", "Professional duty could be properly fulfilled through following the professional code of conduct. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("20.", "work and creativity are related to one another as ", 0, 0, 0, 0, 0, "work has no relations with creativity. ", "work by increasing happiness and income leads to creativity. ", "creative people can't respect the work ethics. ", "creativity cannot be considered as work ", "Work and creativity are related to one another’s as work by increasing happiness and income leads to creativity. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("21.", "Due to affirmative action, women in Ethiopia are ", 0, 0, 0, 0, 0, "given better access to education ", "given better job opportunities ", "given the chance to redress past discrimination against them. ", "having economic upper hand. ", "Due to affirmative action women in Ethiopia give the chance to redress past discrimination against them, ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("22.", "Violating cultural equality is confirmed to weaken national unity because ", 0, 0, 0, 0, 0, "it creates a sense of belongingness ", "it introduces different people and brings them more closely", "Culture does not relate to the concept of equality. ", "It creates exclusion and then leads to national fragmentation", "violating cultural equality is confirmed to weaken national unity because it creates execution and then leads to national fragmentation. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("23.", "The distinguishing factor between cultural relativism and ethno-centrism is that ", 0, 0, 0, 0, 0, "there is no ideological difference between them", "cultural relativism is more inclusive than ethno-centrism ", "cultural relativism believed to be an enemy for national unity of any country.", "Ethno- centrism is more inclusive than cultural relativism.", "Cultural relativism is the ability to understand a culture on its own terms and not to make judgments using the standards of one's own culture. The goal of this is promote understanding of cultural practice that are not typically part of one's Owen culture. It is more inclusive than ethno-centrism. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("24.", "Equally sharing benefits and burden among Ethiopians could bring ", 0, 0, 0, 0, 0, "conflict and civil war in the country ", "instable political system ", "strong united Ethiopian state. ", "Inequality among Ethiopians ", "Equal sharing benefits and burdens among Ethiopians could bring storing and united Ethiopian state. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("25.", "The judiciary branch of government plays a positive role in sustaining democracy. This is related to the fact that ", 0, 0, 0, 0, 0, "if judiciary is independent, it can peacefully solve political disagreements. ", "The judiciary is the only guardian of the constitution ", "democracy always brings too many cases to the courts. ", "the judiciary is where the people are represented", "The Judiciary branch of the government plays a positive role in sustaining democracy. This related to the fact that if the judiciary is independent, it can peacefully solve political disagreement. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("26.", "Regular saving at a personal and family level could be negatively affected by ", 0, 0, 0, 0, 0, "avoidance of extravagance  ", "lack of access to money", "doing things with planning ", "living within one's own income", "Regular saving at personal and family level could be negatively affect by lack of access to money ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("27.", "In order to promote individual economic interest and investment, our saving perspectives should ", 0, 0, 0, 0, 0, "necessarily change for good ", "continue as it was before ", "only focus on traditional ways of saving ", "only focus on modern ways of saving ", "In order to promote individual economic interest and investment our saving perspective should focused on modern saving ways. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("28.", "One of following statements correctly describes the advantages and disadvantages of traditional and modern institutions of saving respectively ", 0, 0, 0, 0, 0, "urban and rural based.", "intuitional and relatively small in size. ", "It does not exist now and it is present now ", "most often fixed saving and institutional with mostly interest-based saving. ", "Advantage and disadvantage of traditional arid modem institutions of saving perspective is most often fixed saving and institutional with mostly interest-based saving.", "d", 0, 1, this.f513b));
        arrayList.add(new questions("29.", "The relationship between saving and development can be seen through ", 0, 0, 0, 0, 0, "the more saving the more development without investment", "the more saving the more investment and development. ", "the less saving less investment but more development ", "the less saving the more investment but less development.  ", "The directed relationship between saving and development can be seen through the more saving the more investment and Development. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("30.", "The activates or any democratic government could be monitored and influenced by", 0, 0, 0, 0, 0, "the Judiciary branch alone ", "passive community participation ", "the media alone. ", "Active community participation ", "The activities of any democratic government could be monitored and influenced by active community participation. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("31.", "A limited government could be distinguished from and unlimited government by ", 0, 0, 0, 0, 0, "Empowering the selected few", "Being against separation of power.", "Under performing its functions. ", "Exercising power based on the laws of the land. ", "A limited government is one whose legalized force and power is restricted through delegated and enumerated authorities exercising power based on the law of the land. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("32.", "Judicial protection to individuals and groups include. ", 0, 0, 0, 0, 0, "bias towards some religious of political groups ", "treating people innocent until proven guilty. ", "delaying justice. ", "due process of rule of men ", "Judicial protection to individual and groups includes treating people's innocent until proven guilty. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("33.", "Corruption could be rampant with the condition of ", 0, 0, 0, 0, 0, "promoted good government ", "strengthened system of rule of law ", "weak financial controlling mechanisms ", "preventive and curative approaches ", "Corruption could rampant with the condition of weakening financial control mechanism. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("34.", "One is an example of Ethiopians struggle against autocratic governments", 0, 0, 0, 0, 0, "The 17 years armed struggle against the Derg regime", "The battle of Adwa ", "The battle of Maichew", "The Ethiopian fight against had Ziad Barre's Somalian invasion ", "One is example of Ethiopian struggle against autocratic government is the 17 years armed struggle against the Derg regime. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("35.", "The conflicting motion of individual rights and group rights can best be described as ", 0, 0, 0, 0, 0, "only individual right are harmonious with human nature. ", "while individuals look for their interest, they harm the interests of groups ", "individual rights and group rights do not back each other. ", "Only group rights are in good terms with human nature", "The conflicting notation of individual right and group rights can be best described as while individual looks for their right, they harm the interest of groups. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("36.", "While countries of the world cooperate for the common good among themselves; they must always avoid ", 0, 0, 0, 0, 0, "through UNESCO protecting and preserving heritages. ", "joining the United Nations and working for global security ", "focusing on completion rather than cooperation. ", "Work closely and tight the treats. of international terrorism  ", "While countries of the world cooper for the common Goods among themselves, they must always avoid focusing on competition rather than cooperation. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("37.", "When a person properly executes one's responsibility, other could also benefit through ", 0, 0, 0, 0, 0, "having a decreased number of hard-working citizens ", "having and unhealthy society. ", "having a self- sacrificing individual for social progress ", "having less amount of self- accomplished citizens ", "When a person property executes one's responsibility, other could also benefits through having a self-sacrificing individual for social progress. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("38.", "An industrious citizens qualities include ", 0, 0, 0, 0, 0, "an enhanced personal and social development ", "an abnormal social relation ", "money wastage ", "a damaged health statue ", "Industrious citizen's quality includes an enhanced personal and social development.", "a", 0, 1, this.f513b));
        arrayList.add(new questions("39.", "Distinguish the correct democratic principle ", 0, 0, 0, 0, 0, "letting the market decide the economic activities ", "granting freedom of movement in a normal condition ", "popular sovereignty ", "Merging religious and political issues ", "Democracy consists four key elements: a political system for choosing and replacing the government through free and fair elections; the active participation of the people, as citizens, in political and civic life; protection of the human rights of all citizens.", "c", 0, 1, this.f513b));
        arrayList.add(new questions("40.", "Identify the correct statement that explains territorial and linguistic federalism", 0, 0, 0, 0, 0, "Territorial form of federalism is against language freedom. ", "The first form of federalism was language-based federalism. ", "Linguistic federalism is against language freedom ", "While territorial federalism is inclusive, linguistic federalism is not. ", "The correct statement of territorial federalism and linguistic federalism is that the first form of federalism was language-based federalism. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("41.", "Identify how transparency and accountability are implied in the FDRE constitution? ", 0, 0, 0, 0, 0, "It excludes the upper layer of the executive ", "It shall be respected by all stake holders. ", "It includes no one ", "It excludes the lower layer of the executive ", "Transparency and accountability are implied in FDRE constitution if it shall be respected by all stake holders. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("42.", "In which of the following international organization's foundation did Ethiopia played and active role? ", 0, 0, 0, 0, 0, "European Union, NATO and WARSO PACT ", "League of Nations, United Nations and the Arab League ", "The Organization of the American states, WTO and Human Rights Watch", "United Nations OAU and AU ", "Ethiopian played grate role in the foundation of UNS, OAU and AU. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("43.", "Mohammed and kibru live in peace though they differ in religion, ethnicity and wealth. This good behavior demonstrates that they ", 0, 0, 0, 0, 0, "Have a culture or tolerance", "Live in socialism", "Live in a place of religious intolerance ", "Are so carless people ", "Mohamed and kibru live in peace thought they have different religions and ethnics and wealthy these good behaviors demonstrated that they have the culture of tolerance. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("44.", "According to the FDRE constitution, unlike regional governments the federal government has mandate over ", 0, 0, 0, 0, 0, "The executive system", "The judicial system", "the foreign affairs ", "the police force ", "According to FDRE constitution, unlike regional government the federal government has mandate over \n-\tProtect and defined the Constitution \n-\tFormulate and implement the country's  \n-\tAdminister the National Bank \n-\tFormulate and implement foreign policy \n", "c", 0, 1, this.f513b));
        arrayList.add(new questions("45.", "The 1995 Ethiopian constitution grants the government and the people to granted in ", 0, 0, 0, 0, 0, "fully utilize the national resource without considering the next generation. ", "interfere in the decision of the courts", "exercising their own respective legitimate power ", "be dependent on developed nations", "The 1995 Ethiopian constitution grants the government and the people to granted exercising their own legitimate power ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("46.", "Women and the socially discriminated groups in Ethiopia's past", 0, 0, 0, 0, 0, "they had equal access to education as men. ", "they enjoyed equal statues in the society ", "they suffered all rounded social and economic exploitation. ", "they enjoyed the right to affirmative action. ", "women and the socially discriminated group in Ethiopia's past they enjoyed the rights of affirmative actions. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("47.", "If a society acknowledges diversity, then it can positively contribute to", 0, 0, 0, 0, 0, "the prevalence of national unity", "a problem of self- denial and as a result a civil- war", "a change into a nation state", "a chance to have a unitary form of government", "if a society acknowledge diversity, then it can positively have contributed for the prevalence of national unity. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("48.", "Equality of benefits and burden can best be explained as", 0, 0, 0, 0, 0, "all people are entitled to equal burdens but to enjoy varying levels of equality. ", "all people are entitled to equal benefits but to shoulder varying levels of burdens.", "all people are entitled with reasonable amount of equality and burden ", "all people should be entitled to total access to equality without burden.", "Equality of benefits aid burdens can be best defined that all peoples entitled with reasonable amount of equality and burden. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("49.", "One of the following statements correctly describe social services and national resources distribution in Ethiopia", 0, 0, 0, 0, 0, "There was discrimination to some groups and regions ", "It has been all bad in all times and places ", "It is impossible to describe ", "it had been all good in all times and places. ", "In social services and natural resources distribution there was discrimination to some group and regions. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("50.", "The most important difference between conventional courts and traditional justices system is", 0, 0, 0, 0, 0, "only traditional justice syst al. brings justice ", "only the conventional courts bring justices ", "Conventional courts use, written. Documents, the traditional ones do not ", "Neither-of them brings, justice ", "The main difference between conventional court and traditional, justice system is that conventional court uses written documents. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("51.", "One can be classified as part of the principle of accountability and transparency", 0, 0, 0, 0, 0, "Being too secretive to the public ", "Behaving in one's own will ", "Exclusion in providing information", "Behaving according to the law ", "One can have classified as parts of principles of accountability and transparency is behaving according the law. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("52.", "The accountability of the government can best be described as ", 0, 0, 0, 0, 0, "Judges are immune from being accused whatever their circumstance may be.", "Some members of the executive are not obliged to follow the law of the land.", "All branches of the government are expected to obey the law ", "The police are denied to use violence, even in dangerous condition. ", "The accountability of the government can best be described as all branches of the government expected to obey the law. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("53.", "Identify the set that correctly enumerate democratic and human right of citizens. The right to ", 0, 0, 0, 0, 0, "pay tax, defend the constitution and respect the law ", "vote, be elected, and hold public office ", "vote, access to information and the right to life ", "life, the right to privacy and equality before the law ", "Democratic rights, these fundamental or inalienable rights include freedom speech and expression, freedom of religion and conscience. freedom of assembly, and the right to equal protection before the law. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("54.", "The basic difference between direct and indirect democracy lies in.", 0, 0, 0, 0, 0, "Ways of electing officials. ", "Empowering the people.", "Limiting democratic rights. ", "Limiting human rights. ", "Indirect democracy, or representative democracy, is when citizens elect representative to make laws for them. This is, what most modern have today. Direct democracy is where citizens themselves vote for or against specific proposals or laws. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("55.", "According to the FDRE constitution, the power to manage the national armed force is given to", 0, 0, 0, 0, 0, "the federal government", "the regional government", "neither of the governments ", "both local and federal government", "According to FDRE constitution managing the national armed force is given to the federal Government. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("56.", "Knowing and implementing responsibility is very important in order to ", 0, 0, 0, 0, 0, "Deny the privileges of citizens ", "Give a hard time for citizens ", "Treat citizens with double standard ", "Have a stable and prosperous country", "Knowing- and implementing responsibility is very important in order to have a stable and prosperous country. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("57.", "Ethiopia is known in the international stage for being ", 0, 0, 0, 0, 0, "A founder of a socialist ideology ", "A symbol of independence ", "A member of OPEC", "Unfriendly to Arab neighboring states ", "Ethiopia is known in the international stages for being a symbol of independence.", "b", 0, 1, this.f513b));
        arrayList.add(new questions("58.", "Acts of injustice are basically against", 0, 0, 0, 0, 0, "Unnecessarily delaying justice ", "Exercising double jeopardy", "Giving a blind eye when our close friends are involved in corruption", "Securing the principle of equality on benefits and burden", "Act of injustice are basically against is exercising double jeopardy. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("59.", "A hybrid democratic system has one of the following principal features.", 0, 0, 0, 0, 0, "The prime minister has a veto power over the president ", "The president is elected from the parliament ", "The president is directly elected by the people ", "Having a monarch as head of state", "Hybrid regimes combine autocratic features with democratic ones and can simultaneously hold political repressions and regular election. Having a monarch as head of state. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("60.", "Citizens will perpetuate poverty, if they are", 0, 0, 0, 0, 0, "Hard working and dedicated", "Every time complaining and not punctual", "Lovers of knowledge and wisdom ", "People with a culture of saving. ", "Citizens will perpetuate poverty. If they are every time complaining and not punctual.", "b", 0, 1, this.f513b));
        arrayList.add(new questions("61.", "One of the following is result of disregard for established and fair procedures", 0, 0, 0, 0, 0, "Prevalence of instability and Corruption", "Consolidation of national unity ", "Due process of the law ", "Equality among various social groups ", "If there is discharged for the established and fair procedure there is prevalence of instability and corruption", "a", 0, 1, this.f513b));
        arrayList.add(new questions("62.", "Conflicts could be prevented and managed through", 0, 0, 0, 0, 0, "Dealing with the conflict through peaceful way only", "Disregarding the views of the party in conflict ", "The prevalence of rule of law ", "Establishing a dictatorial form of government ", "The prevalence of the of the rule of law through which conflicts could prevent and managed. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("63.", "Which one of the following is related with the fight against corruption? ", 0, 0, 0, 0, 0, "Secrecy", "Transparency ", "Partial courts", "Non- liability", "Transparency is one of the mechanisms that used to fight against corruption ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("64.", "Treating all Ethiopian Nations, Nationalities and peoples with equality is important because, it ", 0, 0, 0, 0, 0, "Leads economic development", "Encourages business men to invest more", "Leads to socialism ", "Completely avoids completion among citizens ", "Treating all Ethiopian nations, nationalities and peoples with equality is important because it lades economic development of country. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("65.", "Individual and public interest could basically be differentiated in ", 0, 0, 0, 0, 0, "The ownership of the interest ", "The type of the interest ", "The scope of the interest ", "The duration of the interest ", "Individual and public interests are the type of interests. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("66.", "Differentiate the correct statement about the Ethiopian check and balance system", 0, 0, 0, 0, 0, "All the three branches work together ", "All the three government branches work in complete separation", "The executive branch is accountable to the judiciary branch ", "Among the branches, the Legislative is the most powerful one ", "In Ethiopia check and balance system the three government branches, the legislative, executive and judiciary branches work together to avoid the monopoly of power by any one of them. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("67.", "One of the following is part of the Ethiopia's foreign policy principles ", 0, 0, 0, 0, 0, "Military solutions to international disputes ", "Surrendering the country's national interest ", "Respect for national sovereignty ", "Isolationist foreign policy ", "Ethiopian Diplomats are guided by the foreign policy objectives of the country. These objectives are stated in the 1995 constitution Among the stated foreign policy objectives are: -\n-\tProtection of national interests \n-\tRespect for the sovereignty of the country. \n-\tThe non- interference in the internal affairs of other states, \n-\tObservance of international agreements \n", "c", 0, 1, this.f513b));
        arrayList.add(new questions("68.", "Foreign relations are taken to be important in", 0, 0, 0, 0, 0, "Facilitating economic interactions among states. ", "Leading to the exploitation of weak states by more strong states. ", "Bringing military dominance among states of the world ", "Creating unfavorable conditions for political relations.", "Foreign relations are its external relation with countries of another world. Foreign relations are conducted between independent countries, international and regional organizations to economic interaction among states", "a", 0, 1, this.f513b));
        arrayList.add(new questions("69.", "The Ethiopian experience of constitutional preparation includes ", 0, 0, 0, 0, 0, "a one-man constitutional ratification process ", "a constitutional drafting committee. ", "An honest public debate", "A religious advising committee ", "The Ethiopian experience of constitutional preparation includes a constitutional drafting committee. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("70.", "Rule of law could serve as an instrument to maintain security and order by ", 0, 0, 0, 0, 0, "Empowering the military alone. ", "Managing and solving conflicts in a peaceful way ", "Creating rule of men ", "Creating a dictatorial administration ", "The Rule of law is a political and legal concept which is closely related to democratic governance used to manage and solve conflicts in a peaceful way. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("71.", "The mandate given to the House of federation excludes", 0, 0, 0, 0, 0, "ratifying the budget distribution formula ", "appointing members of the council of ministers.", "representing all the 10 regional states of Ethiopia ", "representing all the nation, nationalities and peoples of Ethiopia ", "One of the mandates of the House of Federation excluded is appointing member of the council of the minsters. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("72.", "The FDRE House or people's Representatives and House of Federation are distinguished by ", 0, 0, 0, 0, 0, "The year that they were established. ", "The level of their political power ", "The government branch that they are located", "The number of legislative speakers. ", "The FDRE House and The House of Federation are distinguished by the government branch they are locating. The HPR is legislative branch whereas the HF is the judiciary branch.", "c", 0, 1, this.f513b));
        arrayList.add(new questions("73.", "In a presidential system, the principle of check and balance works ", 0, 0, 0, 0, 0, "by granting the biggest power to the legislative. ", "though the federal system only. ", "by electing the president from the legislative. ", "By letting the three branches of government to work separately. ", "In a presidential system of government. the principle of check arid balance works by granting the biggest power to the legislative branch of the government. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("74.", "The function of the House of people's Representatives exclude. ", 0, 0, 0, 0, 0, "ultimately declaring state of emergency ", "following every ministry periodical performance ", "interpreting the national constitution", "appointing ministers. ", "The House of people Representative (HPR) is the Legislative organ of government. The HPR have authority to check the workings of the PM and members of his cabinet. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("75.", "Affirmative action has become a matter of necessity for women because", 0, 0, 0, 0, 0, "Women were carefully unfairly treated in the past. ", "Women are superior in to men. ", "Women have an economic super hand in the economy ", "Women are weaker than men. ", "Affirmative action has become a matter of necessity for Ethiopian women because. women where culturally unfairly treated in the past. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("76.", "The correct distinguishing factors between the myth and truth is. ", 0, 0, 0, 0, 0, "While truth is proven fact, myth is not ", "Myths are proven fact. ", "While truth is a result of cultural inspiration, myth is a foundation for science. ", "In Science, myth and truth are the same ", "Truth can he defined to mean that which is true. You have to learn to discover what is true about things you should uphold the truth because it is the right thing to do. When you speak the truth, you gain the respect of others. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("77.", "An honest constitutional democratic system has its own feature such as, ", 0, 0, 0, 0, 0, "It has no any supreme law of the land.", "It is led by an Absolut monarch", "It stands against separation of power ", "It is ruled by an elected government with a limited term.", "An honest constitutional democratic system has its own feat hers includes it is ruled by an elected government with limited term. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("78.", "The basic difference between parliamentary and presidential democracy lies in", 0, 0, 0, 0, 0, "The level of democracy", "The concept of power check and balance", "the term limit of the president ", "political ideology", "The basic difference between a parliamentary and presidential democracy is the concept of power of check and balance. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("79.", "if a country is ruled by a government with power but not authority, Then the government with power but not authority, then the government", 0, 0, 0, 0, 0, "is a commonest", "is a super power", "is parliamentary ", "lacks legitimacy to rule ", "If a country is ruled by a government with power bur not authority, the government is lacking legitimacy to rule. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("80.", "Rights and obligations are interdependent due to the fact that", 0, 0, 0, 0, 0, "rights and obligations are equal in number. ", "rights cannot be respected unless we fulfill our obligation. ", "obligations alone arc always expected to be represented at all costs. ", "universally declaration of human rights includes both of them. ", "Right and obligations are interdependent due to the fact that they are universal declaration of human rights includes both of them. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("81.", "Identity the correct statement on the deference between job and career.", 0, 0, 0, 0, 0, "Any worker has a guaranteed successfully career, ", "Career is the initial stage for any professional worker. ", "While job is professional, career is skill-oriented. ", "Career is the different upwards stage in any professional workers life, ", "The di Terence between job and career is that career is upward stage in any professional worker's life. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("82.", "The development of patriotic feeling requires ", 0, 0, 0, 0, 0, "creating, a war atmosphere.", "respect for the human and democratic right of citizens", "creating highly inflated economic condition", "dismantling the national armed force. ", "The development of patriotic feeling requires respecting for the human and democratic rights of citizens. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("83.", "Select the one that can be categorized as an aspect of justice.", 0, 0, 0, 0, 0, "Summary execution ", "Double jeopardy ", "taking too much time for reasonably simple case ", "Distributing benefits and burden equally ", "justice means to fair, for instance, the fair distribution of benefits such as education health care service and job opportunities. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("84.", "Judges in Ethiopia are assigned to fulfill the duty of ", 0, 0, 0, 0, 0, "Properly interpreting laws and serve justice. ", "Serving as a politically representative of the people. ", "giving adjudication on the accused person without counselor", "Implementing orders from the executive branch", "Judges in Ethiopia are assigned to fulfill the duty of properly interpreting and serve justice. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("85.", "Countries in the world must cooperate among themselves for the sake of ", 0, 0, 0, 0, 0, "assisting each other for the common good man kind ale over the world.", "expanding their cultural values globally. ", "manufacturing heavy military equipment alone. ", "Only exporting the environment. ", "Countries of the world must cooperate among themselves for the sake of assisting each other for the common goods of mankind all over the world. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("86.", "The important of civic participation can be observed in bringing ", 0, 0, 0, 0, 0, "institutional rigidity ", "legal complication", "efficiency and problem-solving voluntary activity ", "social and security crises ", "Participation in civic participation can observed in brining ci problem solving voluntary activities. ", "c", 0, 1, this.f513b));
        arrayList.add(new questions("87.", "participation in civic societies most importantly can be demonstrated through", 0, 0, 0, 0, 0, "commitment dedication", "being self -centered", "religious affiliation ", "compulsory membership ", "participation in civic societies most importantly can be demonstrated throul.th commitment, dedication as and team spirit. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("88.", "identify the correct explanation for reasoning and objectivity?", 0, 0, 0, 0, 0, "objectivity and reasoning are opposite to each other", "Reasoning and knowledge arc the foundation for objectivity. ", "Knowledge is produced only by objectivity minus reasoning. ", "Objectivity is a process of thought. ", "Reasoning a knowledge are the foundation of objectivity. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("89.", "Select the correct distinction between information and data ", 0, 0, 0, 0, 0, "A collection of information result in meaning full data ", "Information cams be for data ", "Conclusion are synonyms with raw data ", "The conclusion drawn from data may become useful information ", "Information and data are important to develop wisdom. In turn wisdom helps develop the techniques of acquiring knowledge. Information can be knowledge about specific subject or situation. When given information is true, then it becomes knowledge.", "b", 0, 1, this.f513b));
        arrayList.add(new questions("90.", "One of the following action helps in developing a reading habit. Which one?", 0, 0, 0, 0, 0, "Reading for a short period of time ", "Being committed to read and make it a culture ", "Reading loud every where ", "Reading without purpose. ", "Reading is an important means of acquiring knowledge, you gain subjects knowledge from reading text books. But you can read for the purpose of expanding your general knowledge and pleasure. Reading helps you to be a well-rounded person. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("91.", "Select the duties of patriots from the given alternatives. ", 0, 0, 0, 0, 0, "Forwarding criticism when polices are not sound ", "Standing against human and democratic rights ", "Advancing individual centered economic interest ", "Entertaining their own preferable way of thinking. ", "one of the duties of patriotic citizens is forwarding- criticism when policies are not sound. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("92.", "Thinking as a global citizen, patriots can show their commitment to the international community through", 0, 0, 0, 0, 0, "Being an international tourist ", "Taking a strong position against terrorism ", "By taking side between conflicting groups", "Being an advocator of an isolation foreign policy. ", "Thinking- as global citizens' patriots can show their commitment to the international community through taking a Strom, position against terrorism. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("93.", "A citizen can get one of the following benefits from the society when he / she shoulders his /her individual responsibilities properly.", 0, 0, 0, 0, 0, "Contempt in the society", "Social isolation", "social disrespect ", "social respect", "A citizen can get one of the following benefits from the society when he/she shoulders his/ her individual responsibility properly is social respect. ", "d", 0, 1, this.f513b));
        arrayList.add(new questions("94.", "The cost of executing once responsibility may include", 0, 0, 0, 0, 0, "getting job opportunities", "scarfing once valuable life", "amassing social capitals", "running business and securing profits", "The cost of executing once responsibility may include sacrificing once value life. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("95.", "An individual can contribute in maintaining international peace through", 0, 0, 0, 0, 0, "uniting to the common cause for space and prosperity. ", "supporting nuclear proliferation. ", "investing all of a person's time and energy of selfish personal gains. ", "giving a deaf ear to what is going on in the world. ", "an individual can contribute in maintaining international peace through uniting the common cause for peace and prosperity. ", "a", 0, 1, this.f513b));
        arrayList.add(new questions("96.", "All are global crimes except", 0, 0, 0, 0, 0, "war mongering against neigh boring ethnic groups ", "the national defense force ", "armed rebellion against the national government. ", "drug, illegal weapons and human trafficking,", "The global crime is including war mongering against neighboring armed rebellion against national government and drug, illegal weapon and human trafficking. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("97.", "Taxation can serve as a national economy regulating factors through", 0, 0, 0, 0, 0, "Encouraging the upper class by taxing in less.", "Following a progressive taxation system every time.", "Following a working type of taxation system in accordance with the need of the country", "Being a will-fair state and taxing the lower class more ", "Taxation can serve as national economy regulating factor through following a progressive taxation system every time. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("98.", "Which one of the followings can be classified a good quality of patriots?", 0, 0, 0, 0, 0, "Giving up the- secrets of the country. ", "Respecting the democratic and human rights of other. ", "Not to be professionally ethical. ", "Ignoring the law of the land. ", "The Good quality of patriots include respecting democratic and human rights of others. ", "b", 0, 1, this.f513b));
        arrayList.add(new questions("99.", "Ethiopia's contribution to the word excludes ", 0, 0, 0, 0, 0, "serving as a symbol of independence for all oppressed people of the world ", "its participation in United Nations peace missions ", "taking somebody else's resource ", "being a cradle of main kind and civilization ", "Ethiopia’s contribution of the world includes serving as symbol of independence; participation in UNS peace mission and being a creedal of mankind and civilization.", "c", 0, 1, this.f513b));
        arrayList.add(new questions("100.", "These days patriots are broadly expected to be concerned beyond military battles and engage with", 0, 0, 0, 0, 0, "Promoting Euro - American culture ", "Serving the interests of other country ", "Leaving the country when needed at most ", "Working hard to expand Ethiopia's wealth", "These days ‘patriots are broadly expected to be concerned beyond battle and engage with working hard to expand Ethiopia's wealth.", "d", 0, 1, this.f513b));
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
        this.f514tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2012.this.timer.setVisibility(0);
                    civics2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    civics2012.this.scr.setVisibility(8);
                    civics2012.this.chr.stop();
                    civics2012.this.toolbar.setVisibility(8);
                    civics2012.this.Relative.setBackgroundColor(-7829368);
                    civics2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2012.this.getBaseContext());
                    int unused = civics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2012.this.highscoreCivics2012 = defaultSharedPreferences.getInt("civ2012hs", 0);
                    int access$600 = civics2012.this.part1 + civics2012.this.part2 + civics2012.this.part3 + civics2012.this.part4 + civics2012.this.part5 + civics2012.this.part6 + civics2012.this.part7 + civics2012.this.part8 + civics2012.this.part9;
                    civics2012.this.resultText.setText(String.valueOf(access$600));
                    civics2012.this.progressbar.setProgress(access$600);
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
                    int unused11 = civics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = civics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = civics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = civics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = civics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = civics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = civics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = civics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "civ2012hs";
                    int unused19 = civics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = civics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = civics2012.this.answered1 + civics2012.this.answered2 + civics2012.this.answered3 + civics2012.this.answered4 + civics2012.this.answered5 + civics2012.this.answered6 + civics2012.this.answered7 + civics2012.this.answered8 + civics2012.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > civics2012.this.highscoreCivics2012) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - civics2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1civ122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1civ123", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1civ124", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1civ125", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1civ126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1civ127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1civ128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1civ129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1civ1210", 0);
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
                        editor.putString("scoreciv121", str3);
                        editor.putLong("date1civ121", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreciv122", str5);
                            editor.putLong("date1civ122", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreciv123", str5);
                            editor.putLong("date1civ123", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreciv124", str5);
                            editor.putLong("date1civ124", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreciv125", str5);
                            editor.putLong("date1civ125", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreciv126", str5);
                            editor.putLong("date1civ126", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreciv127", str5);
                            editor.putLong("date1civ127", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreciv128", str5);
                            editor.putLong("date1civ128", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreciv129", str5);
                            editor.putLong("date1civ129", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreciv1210", str5);
                            editor.putLong("date1civ1210", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateciv121", 0);
                    long j12 = defaultSharedPreferences.getLong("dateciv122", 0);
                    long j13 = defaultSharedPreferences.getLong("dateciv123", 0);
                    long j14 = defaultSharedPreferences.getLong("dateciv124", 0);
                    long j15 = defaultSharedPreferences.getLong("dateciv125", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateciv126", 0);
                    long j17 = defaultSharedPreferences.getLong("dateciv127", 0);
                    long j18 = defaultSharedPreferences.getLong("dateciv128", 0);
                    long j19 = defaultSharedPreferences.getLong("dateciv129", 0);
                    long j20 = defaultSharedPreferences.getLong("dateciv1210", 0);
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
                        editor2.putString("iScoreciv121", str4);
                        editor2.putLong("dateciv121", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreciv122", str6);
                            editor2.putLong("dateciv122", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreciv123", str6);
                            editor2.putLong("dateciv123", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreciv124", str6);
                            editor2.putLong("dateciv124", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreciv125", str6);
                            editor2.putLong("dateciv125", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreciv126", str6);
                            editor2.putLong("dateciv126", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreciv127", str6);
                            editor2.putLong("dateciv127", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreciv128", str6);
                            editor2.putLong("dateciv128", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreciv129", str6);
                            editor2.putLong("dateciv129", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreciv1210", str6);
                            editor2.putLong("dateciv1210", l.longValue());
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
                        SharedPreferences.Editor editor4;
                        civics2012.this.scr.setVisibility(8);
                        civics2012.this.chr.stop();
                        civics2012.this.toolbar.setVisibility(8);
                        civics2012.this.Relative.setBackgroundColor(-7829368);
                        civics2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2012.this.getBaseContext());
                        int unused = civics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = civics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = civics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = civics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = civics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = civics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = civics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = civics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = civics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = civics2012.this.highscoreCivics2012 = defaultSharedPreferences.getInt("civ2012hs", 0);
                        int access$600 = civics2012.this.part1 + civics2012.this.part2 + civics2012.this.part3 + civics2012.this.part4 + civics2012.this.part5 + civics2012.this.part6 + civics2012.this.part7 + civics2012.this.part8 + civics2012.this.part9;
                        TextView access$1600 = civics2012.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        civics2012.this.progressbar.setProgress(access$600);
                        civics2012.this.progressbar.setMax(100);
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
                        int unused11 = civics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = civics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = civics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = civics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = civics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = civics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = civics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = civics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = civics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = civics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = civics2012.this.answered1 + civics2012.this.answered2 + civics2012.this.answered3 + civics2012.this.answered4 + civics2012.this.answered5 + civics2012.this.answered6 + civics2012.this.answered7 + civics2012.this.answered8 + civics2012.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > civics2012.this.highscoreCivics2012) {
                            edit.putInt("civ2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - civics2012.this.chr.getBase()) / 1000;
                        String str = "dateciv129";
                        String str2 = "dateciv128";
                        String str3 = "dateciv127";
                        String str4 = "dateciv126";
                        String str5 = "dateciv125";
                        String str6 = "dateciv124";
                        String str7 = "dateciv123";
                        String str8 = "dateciv122";
                        String str9 = "dateciv121";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1civ1210";
                        String str11 = "date1civ129";
                        if (civics2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1civ121", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1civ122", 0);
                            long j3 = defaultSharedPreferences.getLong("date1civ123", 0);
                            String str13 = "date1civ123";
                            String str14 = f;
                            String str15 = "date1civ121";
                            long j4 = defaultSharedPreferences.getLong("date1civ125", 0);
                            String str16 = "date1civ125";
                            String str17 = "date1civ124";
                            String str18 = "date1civ126";
                            long j5 = defaultSharedPreferences.getLong("date1civ126", 0);
                            long j6 = defaultSharedPreferences.getLong("date1civ127", 0);
                            String str19 = str11;
                            String str20 = "date1civ128";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1civ122";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1civ124", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1civ127";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1civ128", 0));
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
                                editor3.putString("scoreciv121", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoreciv122", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoreciv123", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoreciv124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoreciv125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoreciv126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoreciv127", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoreciv128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoreciv129", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoreciv1210", str25);
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
                            long j18 = sharedPreferences.getLong("dateciv1210", 0);
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
                                editor4.putString("iScoreciv121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoreciv122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoreciv123", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoreciv124", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoreciv125", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoreciv126", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoreciv127", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoreciv128", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoreciv129", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoreciv1210", str28);
                                    editor4.putLong("dateciv1210", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1civ121";
                            String str30 = "date1civ124";
                            String str31 = str11;
                            String str32 = "date1civ122";
                            String str33 = "date1civ127";
                            String str34 = "date1civ125";
                            String str35 = "date1civ126";
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
                            long j21 = sharedPreferences2.getLong("date1civ123", 0);
                            String str40 = str32;
                            String str41 = "date1civ123";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1civ128";
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
                                editor2.putString("scoreciv121", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoreciv122", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoreciv123", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoreciv124", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoreciv125", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoreciv126", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoreciv127", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoreciv128", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoreciv129", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoreciv1210", str49);
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
                            long j38 = sharedPreferences3.getLong("dateciv1210", 0);
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
                                editor.putString("iScoreciv121", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoreciv122", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoreciv123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoreciv124", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoreciv125", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoreciv126", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoreciv127", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoreciv128", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoreciv129", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoreciv1210", str56);
                                    editor.putLong("dateciv1210", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        civics2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2012.this.scr.setVisibility(8);
                civics2012.this.chr.stop();
                civics2012.this.toolbar.setVisibility(8);
                civics2012.this.Relative.setBackgroundColor(civics2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2012.this.scr.setVisibility(0);
                civics2012.this.toolbar.setVisibility(0);
                civics2012.this.telegram_layout.setVisibility(8);
                civics2012.this.chr.start();
                civics2012.this.Relative.setBackgroundColor(civics2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = civics2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = civics2012.this.mInterstitialAd = null;
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
            showAd();
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                civics2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
