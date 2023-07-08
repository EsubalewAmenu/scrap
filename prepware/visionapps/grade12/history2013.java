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

public class history2013 extends AppCompatActivity {
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
    private Boolean f594b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreHistory2013;
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
    private Toolbar f595tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_history2013);
        this.f594b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextHistory2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_history2013);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following was NOT a motivation for European colonialism in Africa? ", 0, 0, 0, 0, 0, "Protection of African's natural environment. ", "New areas of capital investment. ", "Sources of raw materials and markets. ", "Territories for settlement of surplus population. ", "The European were motivated to colonize Africa by the development of Industrial capitalism - Therefore, they wanted to get cheap labour, Raw material and markets for their finished products. ", "a", 0, 1, this.f594b));
        arrayList.add(new questions("2.", "What was the important principle approved at the Berlin Conference that was designed to facilitate the process of colonization in Africa?", 0, 0, 0, 0, 0, "The principle of peaceful occupation of colonies", "The principle of the The White Man's Burden", "The principle of equitable distribution of colonies", "The principle of effective occupation", "The Berlin conference of 1884/1885 was the meeting of European countries to discuss how peacefully partition of Africa. Finally, they (Sphere of Influence), Notification and Recognition. ", "d", 0, 1, this.f594b));
        arrayList.add(new questions("3.", "Which one of the following was true about African resistance against colonial rule during the inter-war period?", 0, 0, 0, 0, 0, "It was mainly inspired by ideas from the Ethiopian churches.", "mostly aimed at securing better economic and political rights", "organized by Africans who had participated in WWI ", "primarily based in the rural areas and led by chiefs ", "During the inter-war periods (1919-1939) African Resistance to European powers centered around town. African demands of the period were mainly centered around winning more economic and political rights for Africans. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("4.", "What was the most common strategy that the Africans used in expressing their discontent with colonial rule during the inter-war period?", 0, 0, 0, 0, 0, "Guerrilla warfare ", "Boycotting elections", "Writing petitions ", "Violent armed struggle", "Writing petitions", "c", 0, 1, this.f594b));
        arrayList.add(new questions("5.", "What was the major difference between the British and French colonial administration policies in Africa? ", 0, 0, 0, 0, 0, "The British employed non-local Africans in their administration while the French did not.", "The British employed local chiefs in their administration while the French mostly used French officers.", "The British worked to turn Africans into citizens while the French sought to keep them as subjects.", "The British used force while the French depended on persuasion.", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("6.", "Which one of the following was correct about the period of Fascist Occupation in Ethiopia?", 0, 0, 0, 0, 0, "It was a time of investment in the steel and chemical industries", "It saw the establishment of provinces mainly along ethnic lines", "It was characterized by absence of racial distinction and oppression", "It witnessed the spread of literacy among the elite as well as the masses", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("7.", "Which one of the following was strength of anti-fascist resistance in Ethiopia?", 0, 0, 0, 0, 0, "Its mobilization of various sections of the population", "Its capacity to wage conventional war", "Its success in establishment a national organization", "Its concentration in the cities than in the countryside", "The center of anti-Fascist resistance was mainly in the rural areas which lasted from 1937-1941. The resistance mobilized very section of the society irrespective of race, ethnicity, language and religion. ", "a", 0, 1, this.f594b));
        arrayList.add(new questions("8.", "How did the United States help in the consolidation of Haile Selassie's power in the post-liberation period?", 0, 0, 0, 0, 0, "They provided diplomatic support to the emperor which helped him build his image globally.", "They provided military training and subsidies that helped the emperor build a national army loyal to him.", "They helped the emperor build a strong airline that made control of the provinces easier. ", "They provided military help to the emperor to establish control over the rebel provinces of Ogaden and Eritrea. ", "The USA and Ethiopia started to establish relation in 1952 when the \"Qagnaw station\", a communication was built by the Americans. Then, two additional agreements signed known as \"The punt four\" and MAAG (Military advisory and training). ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("9.", "Which one of the following entities established a manufacturing industry in Ethiopia in the 1950s? ", 0, 0, 0, 0, 0, "CADU", "Point Four ", "MIDROC", "HVA", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("10.", "Why did Girmame and Mengistu Neway organize a coup against the emperor in 1960?", 0, 0, 0, 0, 0, "To create a modern army that would withstand the eminent threat from Somalia. ", "To establish a constitutional monarchy that would speed up Ethio-pia's development", "To radically transform Ethiopia's society by adopting an Ethiopian form of Socialism. ", "To punish the emperor for confiscating their family's lands in the south", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("11.", "Who were the founders of Great Zimbabwe? ", 0, 0, 0, 0, 0, "South African Boers", "Shona- speaking peoples", "Shirazi Arabs from Persia", "Traders from Phoenicia", "Zimbabwe is located by now south-central Africa. It is believed that the Bantu people called the Shona had built the civilization of Great Zimbabwe.", "b", 0, 1, this.f594b));
        arrayList.add(new questions("12.", "What was the basis of the economic prosperity for the Hausa states of West Africa? ", 0, 0, 0, 0, 0, "Their strategic location between the Sahel and tropical forests", "success in creating a unified empire ", "adherence to a moderate form of Islam ", "political alliance with the neighboring state of Kanem-Bornu", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("13.", "What is the label given by scholars to the phase of the Trans-Atlantic Slave in which it was dominated by individual merchants and adventures?", 0, 0, 0, 0, 0, "Mercantilist", "Triangular", "Piratic", "Monopolistic", "In Africa, the Slave Trade was conducted for over 300 years. During this period, the slave trade passed through three phases. The first phase was commonly known as the piratic slave trade, the trade was dominated by individual merchants, adventures, navigators or sea Robbers ", "c", 0, 1, this.f594b));
        arrayList.add(new questions("14.", "What did the term \"triangular\" refer to in connection with the Trans-Atlantic Slave Trade? ", 0, 0, 0, 0, 0, "The imbalance that existed in the value of the commodities exchanged between Africa, Europe and the Americans. ", "The linkage between the three continents involved in the trade of the times. ", "The sitting arrangements used inside the ships that carried slaves to the Americans.", "The design of the ships that transported slaves from African to the Americans. ", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("15.", "What was the major objective of the Portuguese explorations of the 15th and 16th centuries?", 0, 0, 0, 0, 0, "The desire to enrich the state by locating new sources of commodities and markets. ", "The desire to secure sources of iron and coal for building the Portuguese navy. ", "The desire to establish buffer zones against the aggressively expanding Ottoman empire ", "The desire to expand the teachings of reformed Catholic Church globally. ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("16.", "Which one of the following was a factor behind the establishment of the Non-Aligned movement?", 0, 0, 0, 0, 0, "The failure of the UN to resolve international conflicts especially in East Asia ", "The refusal of the UN to grant a permanent position at the Security Council to developing countries ", "The desire to receive assistance both from the Communist and Capitalist countries ", "The desire to unify the world through a non- ideological organization ", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("17.", "Why the 1945 Manchester Conference is considered an important landmark in the history of Pan-Africanism?", 0, 0, 0, 0, 0, "Because it called for the end of colonial rule in Africa.", "approved a plan for the political union of African countries. ", "was the first time that such a conference was held in Europe. ", "rejected the use of violent means in achieving independence.", "The year 1945 marked the beginning of a new chapter in the history of the Pan-African movement. In that year, the first Pan-African conference was held in Manchester. This conference was important in two aspects + 1st- participation- for the 1st time Africans from the African continent participated. 2nd - Decision- the conference seriously demanded the independence of Africa. ", "a", 0, 1, this.f594b));
        arrayList.add(new questions("18.", "Which of the following countries achieved independence trough armed struggle?", 0, 0, 0, 0, 0, "Tunisia", "Kenya", "Ghana", "Liberia", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("19.", "Which of the following crisis was the OAU able to mediate success-fully?", 0, 0, 0, 0, 0, "The Morocco- Western Saharan Conflict", "The Ethio-Somalian War", "The Biafran War", "The Congo Crisis", "several border disputes have been settled through the efforts of the OAU. Probably the greatest achievement in the respect was the Nigeria Crisis (The Biafran Crisis) in 1967. ", "c", 0, 1, this.f594b));
        arrayList.add(new questions("20.", "Which of the following is the biggest contemporary threat to African economic development? ", 0, 0, 0, 0, 0, "State failure", "The HIV pandemic ", "Environmental degradation", "The debt crisis", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("21.", "Which of the following Medieval Islamic scholars contributed to the development of the field of medicine? ", 0, 0, 0, 0, 0, "Ibn-shaq", "Ibn-Sina ", "Al-Bakri", "Ibn-Khaldum", "The Islamic civilization which flourished from 800-1200 was not specifically Muslim. The culture of Medival Muslim was multi-Racial. Arabs, Jews, Persians, Turks, Berbers and Spaniards all contributed to its developmet. Al-kindi called \"The philosopher of the Arabs\". Ibn Sina combined philosophy with medicine. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("22.", "What can the Taj Mahal tell us about Medieval Indian civilization? That it ", 0, 0, 0, 0, 0, "had advanced knowledge of the construction of canals.", "was secular despite its claim of being ardently Muslim. ", "borrowed its building traditions from Persia. ", "had major achievements in the field of architecture. ", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("23.", "Which one of the following can be a primary source for writing Ethiopia's economic history during the imperial period", 0, 0, 0, 0, 0, "The various documents of the Five-year Development Plans", "A PhD dissertation on the history of The Bank of Abyssinia ", "Reports of Addis Zemen on the appointment & dismissal of officials", "The memoir of the prominent patriot Ras Abebe Aregay ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("24.", "Which one of the following is correct about the linguistic diversity and unity of the Ethiopian Region?", 0, 0, 0, 0, 0, "The presence of a wide variety of languages spoken in the region indicates that the area was a favorite destination for migrants from Asia. ", "The relatively small number of languages within Omotic family suggests that this was the most recent language to develop in the region", "Despite their wide variety, a large number of the languages share common elements due to people's interactions. ", "The languages of the region expect the Semitic languages originate from one common language Proto - family.", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("25.", "Which of the following areas appears to have been included within the territorial limits of the state of Punt?", 0, 0, 0, 0, 0, "Parts of northern Somalia", "Ethiopia's Omo Valley", "The southern part of the Aksum state", "The delta region of Egypt", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("26.", "Which of the following is a correct comparison of the achievements of the civilizations of Rome and Persia? ", 0, 0, 0, 0, 0, "Both established forest reserves to reduce environment degradation.", "Both developed decentralized state systems that respected local autonomy.", "Both developed religious systems in which the emperors were descendants of gods.", "Both built extensive road networks to control their populations.", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("27.", "What was the distinctive feature of politics during the \"Dark Ages\"?", 0, 0, 0, 0, 0, "Temporary alliance between the nobility and the bourgeoisie against kings", "Persistence of peasant rebellions against absolute monarchs", "Decentralization of power and authority among various elites", "Concentration of power in the hands of autocratic emperors", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("28.", "What was the key feature of politics in the Byzantine Empire?", 0, 0, 0, 0, 0, "The extreme fragmentation of royal authority", "The division of political authority between the Patriarchs & emperors.", "The existence of two political capitals in Constantinople & Rome", "The absolute nature of the power of the emperors ", "In Byzantine Empire, the emperor was the absolute ruler and sole law maker. The government controlled almost every aspect of life and it also had much influence over church officials. ", "d", 0, 1, this.f594b));
        arrayList.add(new questions("29.", "Which one of the following was important in the development of early capitalism in Europe? ", 0, 0, 0, 0, 0, "The Chemical industry", "Long distance trade ", "Slave plantations", "Railways", "In the period between 100-1300, town and cities grew in size and number, and long distance and other trade expanded. Capitalist relations developed most quickly in urban center and in connection with the long-distance trade. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("30.", "What was the most important invention of the Early Modern period that was behind the global spread of knowledge?", 0, 0, 0, 0, 0, "The imposition of English as a global lingua franca", "The adaptation of the Arabic numerals for everyday use", "The invention of the movable printing press ", "The discovery of paper and ink", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("31.", "What do archaeological findings tell us about the distribution of Neolithic cultures in the Ethiopian region? ", 0, 0, 0, 0, 0, "That they originated in the north and then spread to the south ", "That they were found across extensive areas of the region", "That they were first developed in the south and then spread to the north", "That they were limited to the border areas between Ethiopia and Eritrea", "Some elements of the Neolithic tradition together with cultural manifestations can be observed in the Northern and Southern parts of Ethiopia. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("32.", "Which one of the following best characterizes early states?", 0, 0, 0, 0, 0, "They tended to confer political rights to limited sections of society", "They were the main agents for spreading democratic principles", "They were primarily the creations of a priestly class", "They tended to be guided by egalitarian principles than later states", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("33.", "What was the main achievement of the civilization of Meroe?", 0, 0, 0, 0, 0, "Invention of the plough", "Building canals on the Nile", "Smelting of iron ore", "Domestication of the camel", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("34.", "What aspect of the ancient Harappan civilization indicates that they sought to protect the health of their urban populations? ", 0, 0, 0, 0, 0, "The introduction of monthly solid waste clearing programs", "The registration of all mobile traders and craftsmen", "The introduction of quarantine to fight epidemic disease", "The provisions of better sewers system ", "The first Indian civilization was started by the people called Dravindians. Archaeologists have discovered two major cities of this civilization- Mohenjo- davo and Happara. The disappearance of this civilization was due to environmental degradation and epidemic diseases.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("35.", "Which one of the following is a correct contrast of the Egyptian and Sumerian civilization?", 0, 0, 0, 0, 0, "Egyptian pharaohs were semi-divine emperors while Sumerian legals were representatives of a city's god. ", "Egyptian civilization was a literate civilization while Sumerian was a civilization of illiterate bureaucrats. ", "Egyptian civilization was built on the back of peasants while Sumerian was dependent on its craftsmen and trades.", "Egyptian political institutions were autocratic while Sumerian ones were democratic. ", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("36.", "Which one of the following was a major consequence of the 1974 Revolution? ", 0, 0, 0, 0, 0, "The transformation of class relations from an aristocratic - dominated to a working-class dominated system ", "The re-orientation of Ethiopia's foreign policy from a pro-Western a non-aligned position. ", "The transformation of Ethiopia's economy from a command to a free-market economy. ", "The transfer of power from a civilian to a military regime. ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("37.", "Which one of the following states was NOT part of the eastern Bloc? ", 0, 0, 0, 0, 0, "Greece", "Albania", "North Korea ", "East Germany ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("38.", "What strategy did the Indian National Congress Party adopt in securing India's independence? ", 0, 0, 0, 0, 0, "The establishment of a military alliance with the Muslim League", "The use of both violent and non-violent forms of struggle", "The deployment of non-violet forms of resistance", "The organization of guerrilla insurgency in the cities", "The Indian National Congress followed a policy of non- violent form of Struggle. In the 1930's under the leadership of Mahthama Ghandi, Civil disobedience campaigns were carried out against British colonial rule.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("39.", "Which one of the following was a result of the 1967 Arab-Israeli War?", 0, 0, 0, 0, 0, "The shift of Gamal Abdel Nasser's policy from Arab Nationalism to Arab Socialism ", "Israeli occupation of strategic lands from Egypt and Syria ", "Divisions within the Arab states on the question of recognizing Israel", "Egyptian recognition of Israel and abandonment of hostility towards it", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("40.", "Why did the United States go to war against the Northern Vietnamese? ", 0, 0, 0, 0, 0, "Because it disliked the non-aligned path that Vietnam has adopted after its independence from France. ", "feared that the Communist government of Vietnam was going to nationalize US companies in the region.", "believed that the Vietnamese have to be punished for defeating the French.", "feared that Vietnam would become Communist and hence a threat to US interest in South East Asia", "The Vietnam war was caused because of the American policy of \"containment\" and based on this policy the \"Domino Theory\" was applied. By this theory if Vietnam falls to communism, then the other Asian countries will follow.", "d", 0, 1, this.f594b));
        arrayList.add(new questions("41.", "Why did senyos accept licism as a state religion? ", 0, 0, 0, 0, 0, "Because the feared Spanish alliance with his rivals if he did not accept the new religion", "Because he hoped to demonstrate to the West how civilized his country was by spotting a modern religion. ", "Because he truly believed that the teachings of the Ethiopian Orthodox Church were backward. ", "Because he wanted to consolidate royal power with the help of Catholic countries. ", "Susenyos was the first Ethiopian king who officially converted to Catholicism. His convention related to his ambition to create strong army with the support of the Portuguese king. ", "d", 0, 1, this.f594b));
        arrayList.add(new questions("42.", "Which of the following developments illustrates the cultural achievements of the Gonderine period? ", 0, 0, 0, 0, 0, "The building of roads that connected Gonder with Metemma", "The building of several castles inside the palace complex", "The establishment of an everyday market neat the palace", "The establishment of separate living quarters for the Bete Israel", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("43.", "Which one of the following best describes the conditions during The Zemene Mesafint? ", 0, 0, 0, 0, 0, "It was a time when power was dominated by the Yejju lords", "It was a time when peasants enjoyed relief from heavy taxation", "It was a time when urban centers disappeared from the country", "It was a time when there was no king in the country ", "Zemene Mesafint lasted from 1769-1855 mainly characterized by an endless civil war between the war lords to assume the title Ras Bitwadad. But this title was monopolized the Yejju lords throughout Zemene Mesafint.", "a", 0, 1, this.f594b));
        arrayList.add(new questions("44.", "Which one of the following is correct about the socio-political systems of the Omotic states before their conquest in the late 19th century?", 0, 0, 0, 0, 0, "Their political institutions closely resembled the institutions of the Christian state because of heavy borrowing.", "Their political institutions closely resembled the institutions of the Christian state because of heavy borrowing.", "The absolute power of their rulers came from the semi-divine origin of the ruling lineages. ", "They had kings whose power was limited by strong elected councils.", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("45.", "Why did the Tokugawa Shogunate follow a closed- door policy with the outside world since early 17th century? Because", 0, 0, 0, 0, 0, "it saw that large scale import of manufactured goods from the west was a threat to local industry. ", "it believed that the teachings of the west were undermining the warrior spirit of the samurai class.", "it feared that the Opium trade with China and the undermining the Jacobin rule. ", "it viewed the possibility of alliance between Christian daimyos and the Catholic powers a threat to its authority.", "The Tokugawa government followed a policy of speculation meaning isolation from the world outside Japan. Its aim was to pressure feudal Japan and Tokugawa power from any outside influence that might weaken the existing system.", "d", 0, 1, this.f594b));
        arrayList.add(new questions("46.", "What was the fundamental source of conflict between the Christian Highland Kingdom and the Adal Sultanate? ", 0, 0, 0, 0, 0, "The ideological difference between militant Islam and the evangelizing Christianity", "The deep resentment on the Christian kingdom that emanated from a control feeling of encirclement by Adal", "The deep resentment on the Christian kingdom that emanated from a control feeling of encirclement by Adal", "The fundamental difference in policy regarding access and utilization of lowland pasture grounds", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("47.", "What was the major factor behind the involvement of the Portuguese and Ottoman Turks in the conflict in the Ethiopian region? ", 0, 0, 0, 0, 0, "The desire to enhance their global images by supporting the cause of their religious allies ", "The desire to secure better rights for their subjects in the lucrative markets of the region", "The desire to expand their respective influence through their coreligionists", "The desire to expand their respective religious through their local supports ", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("48.", "What was the Abba Muda in the traditional Oromo socio-political system? ", 0, 0, 0, 0, 0, "Chief anointer ", "Chief Judge ", "War leader", "Gada grade leader", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("49.", "Which one of the following was a consequence of the Oromo population movement?", 0, 0, 0, 0, 0, "The introduction of a centralized gada center for all Oromo groups", "The end of the foreign of the Christian state with Europe", "The transformation of the socio-political system of some Oromo groups", "The disappearance of Islam and Islamic states from across the region", "The Oromo pollution movement had many consequences in the Ethiopian politics: It increased the interaction between the Oromos and the people whom they came into contact, changes in the economic life of the Oromos, socio-political transformation in the Oromo community, etc. ", "c", 0, 1, this.f594b));
        arrayList.add(new questions("50.", "Why did Minas relocate his political center from Shewa to Gojjam?", 0, 0, 0, 0, 0, "Because he wanted to monitor closely the emerging lucrative trade that connected the Ethiopian region with the Sudan.", "believed that he would be unable to withstand the march of the victorious armies of Adal in Shewa.", "wanted to crush the threat to the throne that came from the alliance of Bahr Negash Yishaq and the Ottomans. ", "believed that Gojjam offered better resources to consolidate the weakened Christian state", "Minas, the successor of Gelawdewos moved his capital north of Abay. This shift of capital was because Minas feared the Oromo expansionists and the revival of Adal threat to his kingdom.", "b", 0, 1, this.f594b));
        arrayList.add(new questions("51.", "Which one of the following was a characteristic feature of Ethiopia's Muslim states of the medieval period? ", 0, 0, 0, 0, 0, "They were limited to the narrow coastal areas of Eastern Ethiopia", "Their rulers had both secular and religious authority", "Their economy was dependent on raiding slaves from the highlands", "They were established by Islamic conquerors from Arabia", "The Muslim sultanates that emerged along the Zeila trade had the following features. All were made up of Muslim community, their rulers had both religious and political authority, their income depended on trade, Islam and trade were the factors for their emergence. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("52.", "How was Islam introduced to the Ethiopian region? ", 0, 0, 0, 0, 0, "Through the activities of missionaries from the Sudan ", "Through conquest by pastoralists from Arabia", "Through the agency of Islamic traders and cleries", "Through the activities of refugees from Mecca", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("53.", "Which of the following is correct about the Kingdom of Enarya?", 0, 0, 0, 0, 0, "The major export of the state was gold ", "The rulers were immigrants that came from northern Ethiopia ", "Its power declined following the consolidation of the Kaffan state", "Its origin can be traced to the early years of the Aksumite kingdom", "The kingdom of Enarya mentioned first in the documents of the Christian kings towards the end of the Aksumite period. Enarya was main source of trade items like gold. Pure gold from Enarya was exported to the countries as far as Egypt, Greece and Rome. ", "a", 0, 1, this.f594b));
        arrayList.add(new questions("54.", "Why was the Kingdom of Damot important both for the Christian kingdom and the Muslim states during the medieval period? Because ", 0, 0, 0, 0, 0, "it was a major source of the amole which served as a medium of exchange across the region. ", "it offered an important service of helping them expand. ", "it served as an important counter balance to them. ", "it was the source of export items for their traders. ", "The dominance of Damot in the Ethiopian region continued during the Zagwe period. During this period, Muslim and Christian trading communities depended on the kingdom of Damot for the sources of export trade items.", "d", 0, 1, this.f594b));
        arrayList.add(new questions("55.", "Which one of the following was NOT a motive behind the expansion of the Christian Kingdom in the period 13th-16th centuries? ", 0, 0, 0, 0, 0, "The acquisition of territories to settle its surplus population", "The expansion of its revenue base ", "The control of sources of export trade items ", "The control of new lucrative trade routes ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("56.", "What was the feature of the \"Blitzkrieg\" strategy Germany used against Poland during WWII? ", 0, 0, 0, 0, 0, "The imposition of a blockade against Poland's ports like Danzing", "The rapid and coordinated deployment of the Luftwaffe and ground forces", "The weakening of the Polish army by bombarding its supply lines ", "The weakening of the Polish army's morale through intensive propaganda", "The key principle \"Blitzkrieg\" was to win a quick and decisive victory through the coordinated attacks of the German air force and fast moving ground forces.", "b", 0, 1, this.f594b));
        arrayList.add(new questions("57.", "Which of the following was NOT a consequence of WWII? ", 0, 0, 0, 0, 0, "The emergence of Europe as a major global super power ", "The spread of anti-colonial movements across the world", "The destruction of European cities and their infrastructure", "The death of over 50 million people across the globe ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("58.", "What was the central objective behind the establishment of the UN? ", 0, 0, 0, 0, 0, "Creating an organization that would punish the Axis Powers", "Facilitating the transition of colonized countries to independent statehood", "Consolidating the political gains the Allied Powers made during the war", "Avoiding war by resolving conflicts through diplomacy", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("59.", "Which of the following suggests that Italy had plans to invade Ethiopia despite signing a Treaty of Friendship in 1928?", 0, 0, 0, 0, 0, "Its signing of a secret treaty with the other neighboring colonial powers that divided the country into spheres of influence", "Its strategy of creating disaffection among some of the prominent provincial lords", "Its subtle opposition to Ethiopia becoming a member of the League of Nations", "Its refusal to allow Ethiopia builds a major road from Dessie to the Port of Assab ", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("60.", "What was the significance of the Battle of Maychew for the course of the Ethio-ltalian war?", 0, 0, 0, 0, 0, "It marked the end of conventional war on the northern front", "It forced Mussolini to replace the brutal De Bono with Badoglio", "It forced the Italians to abandon the use of mustard gas", "It demonstrated the weakness of the emperor as a military leader", "The battle of Maychew was last and decisive battle in the northern front. It was fought on 31 March 1936. The Ethiopian army was commanded by Emperor Haile Selassie I. It was a destructive defeat of the Ethiopian and it marked the end of conventional war.", "a", 0, 1, this.f594b));
        arrayList.add(new questions("61.", "What was the source of the power struggle in the Ethiopian court in the period between 1908 and 1913? ", 0, 0, 0, 0, 0, "The difference within the Shewan nobility on what kind of court in the should follow with regard of Lij eyasu. ", "The attempt by the provincial nobility to regain some of the power they lost Menelik at the height of his power.", "The incompatible visions on the pace of Ethiopia's modernization between the conservatives and progressives.", "The difference between Tayitu and the pro-Iyasu faction on who should exercise power at the national level.", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("62.", "Why did Lij eyasu earn the enmity of the colonial powers in the Horn of Africa? ", 0, 0, 0, 0, 0, "Because he planned to nationalize important foreign financed projects like the railway and the Bank of Abyssinia.", "Because he made a habit of disrespecting their diplomatic representatives. ", "Because he threatened their position in the colonies adjoining Ethiopia.", "Because he dreamt of creating a larger Hom of African State which was seen as a threat to their interest.", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("63.", "Which of the following best characterizes the period of the Diarchy? ", 0, 0, 0, 0, 0, "Intensive power struggle that made the adoption of any reform in government impossible.", "Rejection of various efforts to modernize national and local institutions.", "The gradual erosion of the power of the conservative group.", "The capture and exercise of power by a woman ruler without any hindrance", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("64.", "How did the 1931 Constitution help Emperor Haile Selassie lay the foundation for an autocratic state? ", 0, 0, 0, 0, 0, "It provided him with a legal basis to change the boundaries of the provinces that he considered were a threat to his power.", "It helped him legalize the existing tradition of appointing and removing officials without any consultation.", "It made his rule divinely sanctioned and hence uncontestable.", "It gave him legal permission to negotiate with foreign powers without consulting Parliament.", "The 1931 Constitution laid a legal basis for the absolute state. It had an objective of brining political modernity, stopping the traditional problem of succession and building national integration. The constitution in general confirmed the emperor’s divine right to rule as well as the right to issue laws for his people by his own will.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("65.", "Which one of the following features of fascism contributed to the outbreak of the Second World War? ", 0, 0, 0, 0, 0, "Its strong beliefs in the use of force in securing national interest.", "Its glorification of the superiority of men over women.", "It principle of making all social groups in the nation loyal to the state.", "Its beliefs in the superiority of the Caucasian race over other races.", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("66.", "What was the motive behind the signing of the Tripartite Treaty in 1906? ", 0, 0, 0, 0, 0, "Avoiding inter-European rivalry over Ethiopia in the event of succession struggle in the country. ", "Preventing the expansion of German and Ottoman economic and political interest in the region. ", "Supporting the Shewan ruling class in its efforts to find a viable successor to Menelik.", "Weakling Ethiopia by encouraging rebellions in the areas bordering their colonial possessions. ", "In 1906, the Tripartite treaty was treaty was to signed between Britain, France and Italy. The main objective of this avoid a possible conflict of interest among the signatory powers in case of a crisis situation set in and shut off others rivals such as Germany from economic activities in Ethiopia.", "a", 0, 1, this.f594b));
        arrayList.add(new questions("67.", "What was the immediate cause of the First World War?", 0, 0, 0, 0, 0, "Britain's decision to expand her navy in the Atlantic", "The murder of the heir to the throne of the Austro-Hungarian Empire", "German decision to side with Austria-Hungary in the Agadir Crisis", "Clash between Serbian and Austro-Hungarian forces in Bosnia", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("68.", "What was the fundamental principle that lay behind the establishment of The League of Nations?", 0, 0, 0, 0, 0, "Avoid destructive wars using peaceful means", "Help Third World countries modernize rapidly.", "Prevent the emergence of a hegemonic superpower", "Facilitate decolonization through the Mandate System", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("69.", "Which one of the following is correct about the consequences of the October 1917 Revolution in Russia?", 0, 0, 0, 0, 0, "It encourages the Bolsheviks to regain legitimacy and thus the end more radical policies.", "It gained the Soviet regime international recognition and thus the end of foreign intervention.", "It pushed the Mensheviks to reconcile their differences with the Bolsheviks and rule the country.", "It brought to power a government that took radial measures on issues of land and war. ", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("70.", "Which one of the following resistances did NOT have had a religious dimension?", 0, 0, 0, 0, 0, "Urabi Pasha's Revolt", "John Chilembwe's Revoltements", "The Mji-Maji Rebellion", "The Mehdists Rebellion", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("71.", "What was the fundamental factor that led to the downfall of Tewodros II?", 0, 0, 0, 0, 0, "The defection of most of his able men to the side of his opponents ", "Failure to gain support for his policies from Europeans", "The attempt to highly centralize power in the hands of the monarch", "The revenue shortfall that resulted from recurrent wars and epidemics", "Two factors were responsible to the downfall of Tewodros. The first factor war his conflict with the Ethiopian Orthodox church and his conflict with the regional lords. The external (Immediate factor) factor was his conflict with the British government on the question of detained Europeans by Tewodros. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("72.", "Which of the following is correct about Yohannes' administrative policies?", 0, 0, 0, 0, 0, "He sought to gain loyalty in exchange for administration autonomy", "He worked hard to replace secular administrators with religious leaders", "He increased administrative efficiency by building road networks", "He increased the state's revenue by introducing the asrat system", "Yohannes's policy of Empire formation was known as \"Federal Approach\" in which he prepares to share power with the regional lords as far as they remain loyal to him. ", "a", 0, 1, this.f594b));
        arrayList.add(new questions("73.", "What was the outcome of the battle of Embabo for Negus Menelik?", 0, 0, 0, 0, 0, "It marked the end of Menelik's expansion to the Gibe region", "It marked the end of the use of force to conquer territories in the south", "It opened up the door for his expansion to the southwest", "It re-directed his expansion from the east to the west", "The battle of Embabo was fought in 1882 between Menelik (the shewan king) and Teklehaimanot (The king of Gojjam). The war ended Menelik's victory. The battle facilitated Menelik's expansion to the western Ethiopia.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("74.", "What did the Italians seek to achieve in the Convention of Neutrality which they signed with Menelik in 1887?", 0, 0, 0, 0, 0, "Assure Menelik of their neutrality in the event of war between Menelik and Yohannes.", "Prevent Menelik from coming to the aid of Yohannes in the event of war with Italians ", "Transfer control of the port of Massawa to Menelik if and when they decided to abandon it ", "To provide military help to Menelik in the event of attach by Yohannes.", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("75.", "Which of the following was a consequence of the Battle of Adwa?", 0, 0, 0, 0, 0, "It encouraged an anti-colonial resistance in east Africa. ", "It gave birth to a strong pro Ethiopian movement among Europeans. ", "It stimulated British conquest of the Anglo- Egyptian Sudan.", "It brought General Barateri great respect and honor in Italy.", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("76.", "Which of the following combinations of a European colonizer and its African possession is correct?", 0, 0, 0, 0, 0, "The Cape Peninsula --- Germany ", "The Sahel---Spain ", "The Nile Valley---France. ", "The Congo Basin---Belgium", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("77.", "Which one of the following was a factor for the revival of trade in Ethiopia in the 19th century?", 0, 0, 0, 0, 0, "The opening of new ports in northern and eastern Ethiopia", "The introduction of the Maria Theresa thaler as a new medium of exchange", "The political stability in the Red Sea basin and Arabia. ", "The competition among various Ethiopian lords over control of trade", "In the 19th, the Ethiopian LDT Revived because of different factors.) The political and economic stability of the region with the rise of Mohammed Ali in Egypt) The revival of European interest towards the horn of Africa and the region. ", "c", 0, 1, this.f594b));
        arrayList.add(new questions("78.", "Which one of the following is correct about long- distance trade in 19th century Ethiopia?", 0, 0, 0, 0, 0, "The southwest Ethiopian region served as the main source of trade goods", "The major northern trade routes were dominated by the Afkala and Safara", "The major mechanism for transporting goods were human porters", "The main export items from the region were spices and grains", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("79.", "Which of the following spread with long distance trade in 19th century Ethiopia?", 0, 0, 0, 0, 0, "Wageffana (Oromo traditional religion)", "Catholicism", "Islam", "Protestant Christianity", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("80.", "Which one of the following was a major focus of Tewodro's reform efforts?", 0, 0, 0, 0, 0, "The abolition of class, ethnic and gender imbalance", "The spread of literacy among the Orthodox clergy ", "The decentralization of power among the provincial nobles", "Increasing the tax base of the state to establish an orderly government", "The reforms of Ethiopia was on the administrative and Military areas. The administrative reform was based on appointment on regional basis and the military reform based on the lesson that he learned from his defeat at the battle of Debarki in 1848. ", "d", 0, 1, this.f594b));
        arrayList.add(new questions("81.", "What does the discipline of history study?", 0, 0, 0, 0, 0, "Origin of hominids", "Past human actions", "Contemporary cultures", "Future politic", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("82.", "Why do we study history?", 0, 0, 0, 0, 0, "To show how the past was not different from the present ", "To glorify the activities of our forefathers", "To better understand contemporary societies", "To advance the interest of our nation at the expense of others", "We study history to know the past to understand the present and to forecast the future.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("83.", "Which of the following is an essential principle of historical methodology? ", 0, 0, 0, 0, 0, "Establishing the authenticity of historical documents", "Corroborating primary sources with secondary sources", "Disregarding all sources that have bias in them", "Giving primacy to secondary than primary sources", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("84.", "In which of the following does a date correctly correspond with a century? ", 0, 0, 0, 0, 0, "630A.H ----1st century AD ", "20BC----2nd century BC ", "1517----The 15th century ", "1999---20th century ", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("85.", "Which one of the following species of Homo developed earliest? ", 0, 0, 0, 0, 0, "Homo africanus ", "Homo sapiens ", "Homo habilis ", "Homo erectus", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("86.", "Which one of the following was NOT a factor in the unification of Italy? ", 0, 0, 0, 0, 0, "The diplomatic skills of Count Cavour ", "The rivalry among the great powers", "The support of the Austrian government ", "The support of Napoleon II ", "The unification Italy became possible through the method of Diplomacy, popular uprising and military activity. In the process of unification, cavour used diplomatic approach to bring his enemies on his side like France. ", "c", 0, 1, this.f594b));
        arrayList.add(new questions("87.", "Which one of the following events removed the last obstacle to the German Unification?", 0, 0, 0, 0, 0, "The dismissal of Otto Von Bismarck as Chancellor ", "The Annexation of Schlesinger-Holstein by Prussia ", "The establishment of the Zollverein (Customs Union) ", "The decisive Prussian victory over France at Sedan ", "The unification of Germany become possible after three wars. The last decisive battle was the Franc- prussia war of Franco - prussian 1870-71. In this war, the prussian army crushed the French army at the battle of Sedan. ", "d", 0, 1, this.f594b));
        arrayList.add(new questions("88.", "What was the fundamental cause of the American Civil War? ", 0, 0, 0, 0, 0, "The resentment of the southern states regarding budget allocation by the federal government ", "The suspicion of the southern states that the Republicans intended to end slavery across the nation ", "The decision of the new government under Lincoln to end slavery in America", "The personal antagonism between the Republican Abraham Lincoln and the Democrat Jefferson Davis", "The American civil war was fought between the 11 southern (states) provinces and 22 northern states. The fundamental cause of the war was the question of slavery and the election of Abraham Lincoln as the president of the USA in 1961. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("89.", "What was the reason behind the political crises in the Balkan region during the 19th and early 20th centuries?", 0, 0, 0, 0, 0, "The economic decline of the region that resulted from the expansion of cheap manufactured goods from Europe", "The power struggle between the British and the Russians to gain local supporters for their strategic aims", "The attempt by the Ottoman Empire to impose Turkish rule over the Slavic speaking populations of the region", "The incompatibility between the aspirations of Balkan nationalism and the Ottoman and Hapsburg multi-ethnic empires", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("90.", "Why did the European countries acquire coastal lands in Africa in the pre-industrial era? ", 0, 0, 0, 0, 0, "To recruit soldiers to fight pirates and local rivals ", "To introduce locals to the benefits of Christianity and commerce", "To use them as bases for their overseas trade ", "To turn them into colonial settlements in the future", "", "c", 0, 1, this.f594b));
        arrayList.add(new questions("91.", "What was the main characteristic of the French Revolution during the period of Jacobin rule? ", 0, 0, 0, 0, 0, "The establishment of a very radical government which centralized power in the hands of a committee of selected men.", "The establishment of a reactionary government that reversed the gains made by the Revolution between 1789 and 1791. ", "To establishment of a grand alliance with Britain to spread the ideas of the Revolution across Europe. ", "To enactment of several legislations that turned France into one of the most democratic nations in the world at the time. ", "In 1792, the Assembly known as the convention met. The convention was characterized by struggle between two rival parties\nThe Jacobin and the Givondins. The Jacobin were extreme and more radical political party and dominate the convention. They introduced a new, very democratic constitution, to stabilise the economy the law of the maximum introduced. The reign of terror used to crush counter-revolution. The Jacobins ruled through a committee of public safety. \n", "a", 0, 1, this.f594b));
        arrayList.add(new questions("92.", "Which one of the following is a major idea connected with the Enlightenment? ", 0, 0, 0, 0, 0, "The idea that all evil in human societies was a product of private property. ", "The idea that gender inequality in societies was a product of culture and not something related to biology.", "The idea that religion was a tool for the ruling classes to oppress the masses.", "The idea that human beings have the capacity to improve their conditions through the application of reason and knowledge.", "", "d", 0, 1, this.f594b));
        arrayList.add(new questions("93.", "What was the fundamental cause of the American Revolution?", 0, 0, 0, 0, 0, "The growth of a distinctive American identity that was opposed the hierarchical values of British society.", "The perception by the colonists that the British administration was working to reduce their internal autonomy. ", "The refusal of the American colonists to involve in Britain's colonial wars against France. ", "The decision of the British to prohibit the expansion of slavery to the western parts of their colony. ", "The American Revolution (the American war of Independence was the liberation struggle of the 13 British colonies from the British colonialists. The Revolution (struggle) had started when the British government took away the autonomous status of the colonies after 1763. ", "b", 0, 1, this.f594b));
        arrayList.add(new questions("94.", "Which one of the following is correct about the First Industrial Revolution in Europe? ", 0, 0, 0, 0, 0, "It saw the transformation of production and distribution through the use of power-driven machines and railways. ", "It came about through major inventions in the chemical and motor industries. ", "It was led by merchant capitalists who organized production under the putting out system. ", "It originated first in Germany because it had invested in science and technology universities. ", "", "a", 0, 1, this.f594b));
        arrayList.add(new questions("95.", "Which one of the following is correct about the 1848 Revolutions in Europe? ", 0, 0, 0, 0, 0, "They were directed by a continent-wide organization based in revolutionary France. ", "all inspired by the successes of Latin American liberation movements.", "all total failures since none of the demands of the revolutionaries were met by the conservative European regimes ", "essential demands for political liberty inspired by the French Revolution.", "The news of the downfall of Louis philippe (France) spread rapidly through Europe, and within a few week people in Italy, Germany and Austria were in open rebellion against autocratic governments. These revolutions all by the desire for political inspired liberty. The revolution demanded the establishment of a constitution, by mean of which the people should be given a share in government.", "d", 0, 1, this.f594b));
        arrayList.add(new questions("96.", "Which one of the following was a major achievement of the Aksumite civilization?", 0, 0, 0, 0, 0, "The provision of better support to local craft industries", "The development of an igneous art and architectural style ", "The invention and spread of the use of the plough among the Cushitic peoples", "The spread of a more humane culture through Christian evangelization", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("97.", "What was the basic factor led to the emergence of the Zagwe dynasty?", 0, 0, 0, 0, 0, "The control the Agaw elite established over the gold trade to the Sasu region. ", "The social and economic disruption caused by the rebellions of Oueen Yodit.", "The strategic advantage the Agaw gained from the gradual shift of political center to the Agaw heartlands. ", "The economic weakness of the Aksumite ruling class following the re-orientation of the Red Sea trade. ", "Beginning from the 9thc.A.d., onwards, the Aksumite empire was reduced to a tiny state. It was during this time that the gradual shift of the political centre of the Aksumite state began. Using such advantage, the Agaw people took power from the Aksumite.", "c", 0, 1, this.f594b));
        arrayList.add(new questions("98.", "What makes the historic churches of Lalibela a major cultural achievement?", 0, 0, 0, 0, 0, "Their construction by experts from Egypt and Syria", "The fact that each of them is hewn out of a single rock ", "Their distinctive architectural style different from the Aksumites", "Their construction over a relatively short of period of time", "", "b", 0, 1, this.f594b));
        arrayList.add(new questions("99.", "What was the factor that helped the \"restoration\" of the Solomonic Dynasty under YekunoAmlak?", 0, 0, 0, 0, 0, "The growing decline in the legitimacy of the Zagwe rulers with the spread of the ideas of the Kibre Negest ", "The inability of the Zagwe rulers to protect the highland populations from attack by lowland migratory pastoralists", "The decline in agricultural productivity and state revenue from recurrent drought and locust invasions", "The success of a military coalition formed by the opponents of the Zagwe", "YekunoAmlak's success over the Zagwe had economic and military reason. He monopolized the profit from the trade. He also maintained friendly relations with the Christian rulers. This means that he had a strong economic and political position in the region.", "d", 0, 1, this.f594b));
        arrayList.add(new questions("100.", "What strategy did the medieval \"Solomonic\" rulers use in addressing the problem of succession? ", 0, 0, 0, 0, 0, "Setting an age limit for possible claimants to the throne ", "Strengthening the office of the Queen Mother", "Building a royal prison at Amba Cishen", "Establishing the principle of primogeniture", "One of the most serious problems of the Christian state after 1285 was the problem of succession. This problem was solved by establishing a royal prison at Amba Gishen where all male descendants of YekunoAmlak were detained. ", "c", 0, 1, this.f594b));
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
        this.f595tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    history2013.this.timer.setVisibility(0);
                    history2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    history2013.this.scr.setVisibility(8);
                    history2013.this.chr.stop();
                    history2013.this.toolbar.setVisibility(8);
                    history2013.this.Relative.setBackgroundColor(-7829368);
                    history2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2013.this.getBaseContext());
                    int unused = history2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = history2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = history2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = history2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = history2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = history2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = history2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = history2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = history2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = history2013.this.highscoreHistory2013 = defaultSharedPreferences.getInt("hist2013hs", 0);
                    int access$600 = history2013.this.part1 + history2013.this.part2 + history2013.this.part3 + history2013.this.part4 + history2013.this.part5 + history2013.this.part6 + history2013.this.part7 + history2013.this.part8 + history2013.this.part9;
                    history2013.this.resultText.setText(String.valueOf(access$600));
                    history2013.this.progressbar.setProgress(access$600);
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
                    int unused11 = history2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = history2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = history2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = history2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = history2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = history2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = history2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = history2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "hist2013hs";
                    int unused19 = history2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = history2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = history2013.this.answered1 + history2013.this.answered2 + history2013.this.answered3 + history2013.this.answered4 + history2013.this.answered5 + history2013.this.answered6 + history2013.this.answered7 + history2013.this.answered8 + history2013.this.answered9 + history2013.this.answered10;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    edit.putInt("answered10", 0);
                    if (access$600 > history2013.this.highscoreHistory2013) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - history2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1hist131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1hist132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1hist133", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1hist134", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1hist135", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1hist136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1hist137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1hist138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1hist139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1hist1310", 0);
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
                        editor.putString("scorehist131", str3);
                        editor.putLong("date1hist131", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorehist132", str5);
                            editor.putLong("date1hist132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorehist133", str5);
                            editor.putLong("date1hist133", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorehist134", str5);
                            editor.putLong("date1hist134", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorehist135", str5);
                            editor.putLong("date1hist135", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorehist136", str5);
                            editor.putLong("date1hist136", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorehist137", str5);
                            editor.putLong("date1hist137", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorehist138", str5);
                            editor.putLong("date1hist138", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorehist139", str5);
                            editor.putLong("date1hist139", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorehist1310", str5);
                            editor.putLong("date1hist1310", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datehist131", 0);
                    long j12 = defaultSharedPreferences.getLong("datehist132", 0);
                    long j13 = defaultSharedPreferences.getLong("datehist133", 0);
                    long j14 = defaultSharedPreferences.getLong("datehist134", 0);
                    long j15 = defaultSharedPreferences.getLong("datehist135", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datehist136", 0);
                    long j17 = defaultSharedPreferences.getLong("datehist137", 0);
                    long j18 = defaultSharedPreferences.getLong("datehist138", 0);
                    long j19 = defaultSharedPreferences.getLong("datehist139", 0);
                    long j20 = defaultSharedPreferences.getLong("datehist1310", 0);
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
                        editor2.putString("iScorehist131", str4);
                        editor2.putLong("datehist131", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorehist132", str6);
                            editor2.putLong("datehist132", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorehist133", str6);
                            editor2.putLong("datehist133", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorehist134", str6);
                            editor2.putLong("datehist134", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorehist135", str6);
                            editor2.putLong("datehist135", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorehist136", str6);
                            editor2.putLong("datehist136", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorehist137", str6);
                            editor2.putLong("datehist137", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorehist138", str6);
                            editor2.putLong("datehist138", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorehist139", str6);
                            editor2.putLong("datehist139", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorehist1310", str6);
                            editor2.putLong("datehist1310", l.longValue());
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
                        history2013.this.scr.setVisibility(8);
                        history2013.this.chr.stop();
                        history2013.this.toolbar.setVisibility(8);
                        history2013.this.Relative.setBackgroundColor(-7829368);
                        history2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2013.this.getBaseContext());
                        int unused = history2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = history2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = history2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = history2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = history2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = history2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = history2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = history2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = history2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = history2013.this.highscoreHistory2013 = defaultSharedPreferences.getInt("hist2013hs", 0);
                        int access$600 = history2013.this.part1 + history2013.this.part2 + history2013.this.part3 + history2013.this.part4 + history2013.this.part5 + history2013.this.part6 + history2013.this.part7 + history2013.this.part8 + history2013.this.part9;
                        TextView access$1600 = history2013.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        history2013.this.progressbar.setProgress(access$600);
                        history2013.this.progressbar.setMax(100);
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
                        int unused11 = history2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = history2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = history2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = history2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = history2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = history2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = history2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = history2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = history2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = history2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = history2013.this.answered1 + history2013.this.answered2 + history2013.this.answered3 + history2013.this.answered4 + history2013.this.answered5 + history2013.this.answered6 + history2013.this.answered7 + history2013.this.answered8 + history2013.this.answered9 + history2013.this.answered10;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        edit.putInt("answered10", 0);
                        if (access$600 > history2013.this.highscoreHistory2013) {
                            edit.putInt("hist2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - history2013.this.chr.getBase()) / 1000;
                        String str = "datehist139";
                        String str2 = "datehist138";
                        String str3 = "datehist137";
                        String str4 = "datehist136";
                        String str5 = "datehist135";
                        String str6 = "datehist134";
                        String str7 = "datehist133";
                        String str8 = "datehist132";
                        String str9 = "datehist131";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1hist1310";
                        String str11 = "date1hist139";
                        if (history2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1hist131", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1hist132", 0);
                            long j3 = defaultSharedPreferences.getLong("date1hist133", 0);
                            String str13 = "date1hist133";
                            String str14 = f;
                            String str15 = "date1hist131";
                            long j4 = defaultSharedPreferences.getLong("date1hist135", 0);
                            String str16 = "date1hist135";
                            String str17 = "date1hist134";
                            String str18 = "date1hist136";
                            long j5 = defaultSharedPreferences.getLong("date1hist136", 0);
                            long j6 = defaultSharedPreferences.getLong("date1hist137", 0);
                            String str19 = str11;
                            String str20 = "date1hist138";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1hist132";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1hist134", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1hist137";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1hist138", 0));
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
                                editor3.putString("scorehist131", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorehist132", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorehist133", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorehist134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorehist135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorehist136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorehist137", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorehist138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorehist139", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorehist1310", str25);
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
                            long j18 = sharedPreferences.getLong("datehist1310", 0);
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
                                editor4.putString("iScorehist131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorehist132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorehist133", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorehist134", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorehist135", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorehist136", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorehist137", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorehist138", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorehist139", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorehist1310", str28);
                                    editor4.putLong("datehist1310", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1hist131";
                            String str30 = "date1hist134";
                            String str31 = str11;
                            String str32 = "date1hist132";
                            String str33 = "date1hist137";
                            String str34 = "date1hist135";
                            String str35 = "date1hist136";
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
                            long j21 = sharedPreferences2.getLong("date1hist133", 0);
                            String str40 = str32;
                            String str41 = "date1hist133";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1hist138";
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
                                editor2.putString("scorehist131", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorehist132", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorehist133", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorehist134", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorehist135", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorehist136", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorehist137", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorehist138", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorehist139", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorehist1310", str49);
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
                            long j38 = sharedPreferences3.getLong("datehist1310", 0);
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
                                editor.putString("iScorehist131", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorehist132", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorehist133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorehist134", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorehist135", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorehist136", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorehist137", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorehist138", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorehist139", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorehist1310", str56);
                                    editor.putLong("datehist1310", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        history2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2013.this.scr.setVisibility(8);
                history2013.this.chr.stop();
                history2013.this.toolbar.setVisibility(8);
                history2013.this.Relative.setBackgroundColor(history2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                history2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2013.this.scr.setVisibility(0);
                history2013.this.toolbar.setVisibility(0);
                history2013.this.telegram_layout.setVisibility(8);
                history2013.this.chr.start();
                history2013.this.Relative.setBackgroundColor(history2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = history2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = history2013.this.mInterstitialAd = null;
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
                history2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
