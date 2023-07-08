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

public class history2009 extends AppCompatActivity {
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
    private Boolean f586b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreHistory2009;
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
    private Toolbar f587tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_history2009);
        this.f586b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextHistory2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_history2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "what was the Confessions of Gelawedewos?", 0, 0, 0, 0, 0, "A book on the campaigns of Imam Ahmed.", "A chronicle of Emperor Gelawedewos.", "A work defending Orthodox Christian particles.", "An account about Ethiopia’s conversion to Catholicism.", "The Confessions of Gelawedewos a work of defending orthodox Christian practices and the attempt to convert Gelawedewos to Catholicism was unsuccessful.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("2.", "Where do most Nilo – Saharan speakers live in present day Ethiopia?", 0, 0, 0, 0, 0, "In the omo valley.", "In the lowlands along the Awash River.", "Along the Ethio – Somali border.", "Along the Ethio – Sudanese border.", "Nilo-Saharan super-families are found in the northern, north-eastern and central Africa, in the Sahara desert and the upper Nile valley, and in the Horn of Africa. ", "d", 0, 1, this.f586b));
        arrayList.add(new questions("3.", "what was the basic reason for the conflict between ottoman Turkey and Portugal in the Horn region during 16th century?", 0, 0, 0, 0, 0, "Control of the main route to the holy land.", "Dominance over their respective religions in the area.", "Territorial annexation and expansion into the interior.", "Control over trade and trade routes in the region.", "The basic reason for the conflict between Ottoman Turkey and Portugal in the Horn of Africa region during the 1st century was to dominate the above regions. For that purpose they wanted the friendship of the two rival states of the Horn of Africa.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("4.", "A proper understanding of the past trough the study of history helps humanity to", 0, 0, 0, 0, 0, "Recount its adventures and patriotism", "Avoid repeating past mistakes.", "Forget the past and move forward.", "Recognize the value of oral traditions.", "History helps us to know about the past, to understand the present and for see the future developments. It also helps us to have abroad understanding of national and international issues including democratic principles and nationalism. History can also help us to develop the necessary skills for collecting and analyzing information to reach at conclusions.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("5.", "what was Martin Luther’s first work that challenged the major teachings of the Catholic Church?", 0, 0, 0, 0, 0, "Utopia", "The divine Comedy", "The pilgrim’s Progress", "The Ninety-Five Theses", "The actual reformation movement was started by a German Martin Luther (1483 - 1546). He condemned the sale of what was known as indulgences. In 1517 he nailed the door of the Church at Wittenberg a statement of his religious belied, the Ninety – Five Theses, which aroused tremendous popular support.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("6.", "How did the Chinese landlords and the educated class understand the “mandate of Heaven” in the 17th century?", 0, 0, 0, 0, 0, "God given authority to the rule", "Divine blessing to cure disease", "Special blessing to own lands", "Special privilege to be a judge", "The Chinese landlords and educated classes understand the Mandate of Heaven in the 17th century as God given the authority to the ruler to rule.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("7.", "Who was Queen Elleni’s messenger to the Portuguese court in the early 16th century?", 0, 0, 0, 0, 0, "Pedro de Covilaho", "Echege Imbaqom", "John Bermudez", "Mathew the Armenian", "Queen Ellini, wife of Emperor Zara Yacob, sent a letter to Portugal in 1512. In response, the Portuguese government sent an official delegation to the Christian kingdom in 1520.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("8.", "which one of the following was a demonstration of Chinese power during the Ming dynasty?", 0, 0, 0, 0, 0, "The building of the Great Wall of China", "The launching of voyages of exploration", "The conquest of Korea and Japan", "The defeat of Russian expansionism along its eastern boarders", "Between 1405 and 1423, the Ming dynasty, under the leadership of Zheng He, engaged in several major expeditions of exploration and trade.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("9.", "A leader and military General of Adal whose Attacks severely threatened the Christian highland kingdom towards the end of the 15th century was", 0, 0, 0, 0, 0, "Imam Sabradin", "Wazir Ibn Muzahid", "Imam Mahfuz", "Garad Abun", "A leader and general of Adal whose attacks severely threatened the Christian highland kingdom toward the end of the 1st century was Imam Mahfuz. After the defeat and death of Mahfuz, Ahmed Ibrahim became the Imam or leader of the Sultanate of Adal.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("10.", "The Catholic bishop who was able to convert king Susenyos to Catholicism was", 0, 0, 0, 0, 0, "Alfonso Mendez", "Pedro Paez", "Andre de Oviedo", "Jao Bermudez", "Catholic Bishop who was able to convert king Susenyos to Catholicism was Alfoso Mendez", "a", 0, 1, this.f586b));
        arrayList.add(new questions("11.", "which one of the following served as Imam Ahmed’s political center during his rule of Ethiopia?", 0, 0, 0, 0, 0, "Hadya", "Gojjam", "Fetegar", "Dembiya", "By 1535 Imam Ahmed was able to conquer the whole Christian kingdom and ruled over the vast territory in the Horn of Africa. He appointed his own Muslim governors over the newly conquered regions. Imam Ahmed’s political center during his rule of the Christian Highland Kingdom was Dembiya.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("12.", "Napoleon’s failure to defeat Britain can be linked to", 0, 0, 0, 0, 0, "The strong capacity of the Royal Navy", "The large size of the British army", "British use of better canons and muskets", "The efficient organization of the British army", "Napoleon's failure to defeat Britain can be linked to his army was pinned down in Egypt, and the British Admiral Horatio Nelson defeated his naval forces.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("13.", "The source that became an acceptable material for the study of Ethiopia’s history beginning in the 1960s was", 0, 0, 0, 0, 0, "Archaeological artifacts", "Oral traditions", "Chronicles", "Church records", "Oral traditions are information's transmitted by word of mouth from generation to generation. It is also one of the main sources for the study of Ethiopian history until 1960s. It could be taken as both primary and secondary sources.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("14.", "What did the “protestant ethic” strongly support?", 0, 0, 0, 0, 0, "Thrift and industriousness", "Noninvolvement of politics", "Hermitage and monk life", "Avoiding material enrichment", "Protestant leaders' also emphasized education and stress on the holiness of a person’s daily life encouraged industriousness, thrifty living and careful management of materials things. These attitudes become known as the protestant ethic.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("15.", "Which one of the following was a future of the feudal economy in medieval Europe?", 0, 0, 0, 0, 0, "Organization of agriculture using free peasant labor.", "Self-sufficiency of the manors", "Production for the market then for subsistence use.", "Production by the large estates using slave labor", "The features of feudal economy in Medieval Europe were operated as follow: A lord had a Manor, on the manor leaved peasants (serfs), peasants cultivated the land. The peasant belonged to the lord.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("16.", "To which of the following language families does the shinasha language belong?", 0, 0, 0, 0, 0, "West Cushitic", "East Cushitic", "Omotic", "Nilo Saharan", "Omotic Language Family speakers include mainly peoples living in the Southern Nation, Nationalities and Peoples' regional state. Most of them live in and around the Omo river basin. The Shinasha and Anfillo, who are living far away from the Omo basin in Gojjam (currently in Benishangul-Gumuz region) and Wallaga respectively, are exceptional.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("17.", "which one of the following is a distinguishing feature of Homo erectus?", 0, 0, 0, 0, 0, "Its migration from Africa to the Asian and European continents.", "Its ability to make stone tools for the first time in human history", "The discovery of fire", "Its ability to communicate for the first time in writing", "Homo erectus people used intelligence to develop technology ways of applying knowledge, tools, and inventions to meet their needs.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("18.", "which one of the following issues is a subject of historical studies?", 0, 0, 0, 0, 0, "The interaction of humans with their natural environment.", "The geological processes that led to the formation of the earth’s surface.", "The ecological interaction between different plant species", "The physical and cultural evolution of different hominid species", "History is a branch of social science that deals with what human beings did in the past. It studies changes in the development of societies. It also studies the political, economic, social and cultural life of past societies.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("19.", "why did the Muslim Arabs establish their rule over the territories of the Byzantines and Persians easily? Because", 0, 0, 0, 0, 0, "They had larger armies than the Byzantine and Persian states.", "Byzantine & Persian subject populations hate their rulers.", "They used better muskets & cannons than their opponents.", "They used guerrilla tactics than conventional fighting style in war", "The rapid success of the Muslims was due to the financial and military exhaustion of Byzantine and Persian Empires, moreover the Byzantine Were hated by their subjects because of the oppressive taxation.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("20.", "The “Directory” with Napoleon as its “First Consul” in effect was a government that looked like a ", 0, 0, 0, 0, 0, "Military dictatorships", "Parliamentary democracy", "Constitutional monarchy", "Developmental state", "Napoleon quickly took the title of first consul and assumed the powers of a dictator. At the time of Napoleon's coup, France was still at war.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("21.", "what was the major reason for the conversion Emperor Susenyos to Catholicism?", 0, 0, 0, 0, 0, "To begin with, his loyalty to the church was weak because he did not grow up under its influence.", "He hoped to get the support of Catholic Europe against internal challengers.", "He was influenced by members of his family who had converted before", "He was convinced of the superior theology of the Catholic Church.", "The major reason for the conversion of Emperor Susenyos to Catholics was his hope to get the support of catholic European against internal challenge to his imperial power.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("22.", "which of the following states of Southern Ethiopia was able to successfully resist the forces of Adal early in the 16th century and remain independent?", 0, 0, 0, 0, 0, "Enarya", "Damot", "Welayita", "Hadya", "The kingdom of Welayita was on of the medieval kingdom that successfully resisted Oromo pressure and began to expand its influence among the Omotic and Cushitic peoples of the south.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("23.", "who were the two kings of the Christian Highland Kingdom who sent military expeditions against the Funj Sultanate?", 0, 0, 0, 0, 0, "Minas and Gelawedewos", "Sertse Dengel and Fasiledes", "Susenyos and Iyasu II", "Tewodros and Yohannis I", "The Funj sultanate emerged in 1505 in Nubia. In 1620 King Susenyos destroyed and looted the Funji, and in 1730s king Iyasu Il ended up with defeat of the Christian.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("24.", "with which of the following process was the term “civilization” associated for a long time?", 0, 0, 0, 0, 0, "Agrarian states that had kings but without priestly class", "States that were administered in a fair way by democratically elected administrators", "Populations that lived in urban centers and developed writing and monuments.", "Populations that had not yet developed state structures.", "Civilization is the type of culture and society developed by a particular nation or region or in a particular epoch: The ways in which people organize themselves. They lived in towns and developed writing and monuments.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("25.", "which of the following rulers of the Gondar Era tried to carry out an extensive reform of land tenure and taxation?", 0, 0, 0, 0, 0, "Fasiledes", "Bakafa", "Iyasu I", "Yohannis I", "Gondar became known for its architectural achievements and building technology. Several kings who ruled from Gondar built very beautiful castles as palaces. Churches, bridges and swimming pools were constructed. Particularly, during the reigns of its three successive kings: Fasiledes (r. 1632- 1667), Yohannes I (r. 1667- 1682) and Iyasu I (1682| 706).", "a", 0, 1, this.f586b));
        arrayList.add(new questions("26.", "In what ways did the rivalry between the Portuguese and the Ottoman Turks affect the conflict between Christian and Muslim forces in the Horn?", 0, 0, 0, 0, 0, "Directly by participating in the wars.", "Indirectly through supplying arms and ammunition", "Indirectly through political and moral support", "Indirectly by imposing a naval blockade on the side that they opposed.", "The rival between the Portuguese and the Ottoman Turks affected the conflict between Christian and Muslim forces in the Horn of Africa directly by participating in the war.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("27.", "what led European imposition of “unequal treaties” on China early in the 19th century?", 0, 0, 0, 0, 0, "Weak and ineffective rulers and decline of military strength", "The failure of Ching rulers to discover the hidden meanings of the treaty articles", "The belief of the Chinese that whatever is written on paper does not really matter.", "The hope that signing treaties with several foreign powers will increase competition and conflict among them.", "The hope that singing treaties with several foreign powers will increase competition and conflict among them led Europeans imposition of unequal treaties on China early in the 19th century.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("28.", "what was the Renaissance scientist Nicolas Copernicus best known for?", 0, 0, 0, 0, 0, "His criticism of the Church, its dogma, and its Christian tests.", "His discovery of the law of gases instrumental in modern chemistry.", "His ridiculing of superstition and narrow mindedness through his writings.", "His assertion that the sum is the center of our solar system.", "The Renaissance scientist Nicolas Copernicus'(1473-1543) a Polish astronomer developed the telescope and produced evidence to support theory that the Earth revolves around the sun.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("29.", "what was the new finding about winds that had an impact on overseas explorations of the 15th and 16th century?", 0, 0, 0, 0, 0, "The knowledge that global winds naturally blow in the direction of big vessels.", "The discovery that global winds change direction seasonally in a regular pattern", "The knowledge that global winds have no impact on the direction of sailing ships.", "The discovery of trade winds to be used as a counter balance to monsoon winds.", "The Factors that encouraged explorations and discoveries overseas voyages the 15th and 16th centuries were:\n-Better maps, follow coasts at first, used compass.\n-Better shift square sails and new hull design, heavy enough to carry canon.\n-Use of astrolabe — Magnetic compass sail by stars \n-Knowledge of a wind patterns.\n", "b", 0, 1, this.f586b));
        arrayList.add(new questions("30.", "what was a royal colony in the Americas?", 0, 0, 0, 0, 0, "A colony under the direct control of a king", "A colony established by a trading company", "A colony put under the administration of the Royal Navy", "A colony set up by an individual through a grant by the king.", "The Royal colonies in America were the colony under the direct control of King of England", "a", 0, 1, this.f586b));
        arrayList.add(new questions("31.", "who run the activities of early Universities that emerged in Europe during the Middle Ages?", 0, 0, 0, 0, 0, "The learned men of the Church ", "Foreign educated noblemen", "Guilds of the landed nobility", "Teachers organized into corporations.", "The church played an important part in shaping European formal education during the Middle Ages. Students studied such subjects as church music, theology and Latin language. The largest university was opened in Paris in the 13th century.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("32.", "which one of the following is correct about the Aksumite civilization?", 0, 0, 0, 0, 0, "It was developed by Habershan and Agazian immigrants from South Arabia.", "Its origin can be traced to Punt from whom it inherited its key institutions", "Its development can be related to surplus production from agriculture & trade.", "Its rise to prominence can be dated to the 10th century BC when it defeated Meroc.", "The state of Aksum was not the first state in Ethiopia. There were pre-Aksumite states like Punt and Damat and several other ancient sites in Northern part of Ethiopia. Aksumitc civilization its development can be related to the surplus production from agriculture and trade.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("33.", "which of the following is true about the Zemene Mesafint?", 0, 0, 0, 0, 0, "Ethiopia as a country was dismembered.", "All the Mesafint accepted and obeyed the authority of the kings.", "A family of lords from the province of Yeju dominated politics", "The Orthodox Church acted as the only unifying force.", "The Zemene Mesafint (Era of Princess was mainly dominated by Muslim Oromo family of Lords from the province of Yeju dominated politics) ", "a", 0, 1, this.f586b));
        arrayList.add(new questions("34.", "why did the Quraysh ruling class feel threatened by the rise of the Prophet Mohammed and the spread of his teachings?", 0, 0, 0, 0, 0, "Most tribute paying traders turned to become devout Muslims which affected the income of the chiefs.", "Most farmers disregarded their daily livelihood to attend gatherings where the Prophet preached his messages.", "The income of chiefs significantly declined as the number of Arabs visiting the Ka’ba declined progressively", "Arab Chiefs where made to lose their privilege of collecting taxes and tributes by the orders of the prophet.", "The Quraysh ruling class in Mecca considered the teaching of Prophet Mohammed as a threat to their privilege. There was also the fear the Mecca might lose its importance because of message. The annual pilgrimage to the Kaba in Mecca visited by thousands of Arabs from the whole Peninsula was source of considerable income for Mecca", "d", 0, 1, this.f586b));
        arrayList.add(new questions("35.", "All the following were factors in the decline of the Gada institution among the Oromo Except one", 0, 0, 0, 0, 0, "The negative role of powerful war leaders vis a vis the Gada class.", "The influence of Islamic teachings regarding rulers & power.", "The influence of Islamic teachings regarding rulers and power.", "The shift of their livelihood strategy from agriculture to pastoralism.", "The Oromo had their own political, economic, social and religious institutions. For political, economic and social purposes, the Oro were organized into the Gada system. The Gada system is a system in which Gada classes succeed each other every eight years in providing military, political, social and ritual Leaderships for the Oromo nation. ", "b", 0, 1, this.f586b));
        arrayList.add(new questions("36.", "what influence did Thomas Paine’s work, Common Sense have on the American War of Independence?", 0, 0, 0, 0, 0, "It was instrumental in radicalizing different sections of the American population.", "It succeeded in delaying the break between Britain and the Colonists.", "It laid out the basic principles of American federal structure which were adopted later.", "It widely popularized British crimes & hence encouraged Europeans to support the colonists.", "The influence Thomas Paine's common sense have on the American War of Independence was widely popularized British crimes and Hence encouraged European to support the colonialist.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("37.", "what was the reason, other than the religious one, for which North German princes gave support and protection to Martin Luther?", 0, 0, 0, 0, 0, "Their desire to punish the Catholic Church for its persecution of German peasants.", "Their aspiration to replace the supremacy of the Italian nobility in the institutions of the Church.", "Their ambition to weaken the Holy Roman Emperor and take over ownership of Church properties.", "The expectation that Martin Luther would become heir to the throne of the Holy Roman Empire.", "The powerful North German rulers favored Luther, they protected Lather and they accepted Luther's ideas as a new religion, and their ambition to weaken the power of the Holy Roman Empire. Lutheranism; soon expanded to Scandinavian Countries (Norway, Denmark and Sweden) were converted to Lutheranism and established it as an official states religion.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("38.", "The Renaissance was different from the art of preceding period by its:", 0, 0, 0, 0, 0, "Concern with depicting everyday life in a realistic manner", "Emphasis on building gigantic cathedrals with spires and palaces.", "Exclusive focus on religious themes in paintings & literature.", "Adoption of the baroque and gothic styles in paintings.", "Renaissance painters and sculptors wanted to portray people everyday life natural and realistically.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("39.", "which one of the following set of languages belong to the sub branch of Ethiopian languages called Highland East Cushitic?", 0, 0, 0, 0, 0, "Hadya, Kambata and Sidama", "Welayita, Gamo and Dawro", "Bilen, Agaw and Qimant.", "Gafat, Argoba and Selti.", "Eastern Cushitic divided into Lowland and highland east Cushitic. Highland East Cushitic speakers included: Hadiya, Kambata, Gedeo, Alaba, Burji and Libido.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("40.", "The fossil remains of Homo erectus discovered in Lower Omo basin can be differentiated from the remains of Homo Sapiens discovered elsewhere by:", 0, 0, 0, 0, 0, "Smaller size of its brain and its larger teeth", "Smaller jaws and the four legs it has.", "Larger brain and the smaller teeth it has.", "Its bigger skull and large sized pelvic bone.", "Homo erectus emerged about 1.7-1.8 million years ago. it believed Homo erectus was a more intelligent and adaptable species than Homo Habilis. Homo erectus people used intelligence to develop technology ways of applying knowledge, Tools, and inventions to meet their needs.it different from Homo sapiens by its bigger skull and large sized Pelvic bone.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("41.", "which one of the following was a characteristic of the state of the State of Kaffa?", 0, 0, 0, 0, 0, "Its democratic administration system based on the Mikrecho", "Its organization of an effective defense structure.", "Its organization of the economy on slave cultivated plantations.", "Its endurance for a long time as a result of political alliance with the Oromo.", "Kaffa had an old tradition of digging trenches and ditches to defend itself from foreign attack. It was this strong internal political organization and defense system that enabled the kingdom to maintain its independence for long period", "b", 0, 1, this.f586b));
        arrayList.add(new questions("42.", "why did Nur Ibn Mujahidin fail to continue with conquest of the Christian Kingdom after defeating Emperor Gelawedewos?", 0, 0, 0, 0, 0, "He had run out of provisions for his army", "His base territory was threatened by invasion of the Oromo", "His lowland followers refused to fight in the cold highlands.", "There was a rebellion directed against him in Harari.", "Imam Nur Ibn Mujahidin fail to continue with the conquest of the Christian kingdom after defeating the Emperor Gelawedewos was he had run out of provisions for his army.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("43.", "Emperor Tekle Giyorgis was known as “Fetsame Mengist” because", 0, 0, 0, 0, 0, "He was crowned & removed from the throne several times.", "His reign witnessed hitherto unseen devastating civil war.", "He was responsible for transferring power peacefully to the Yejju dynasty.", "His reforms led to the disintegration of the power of the central government.", "Following the death of Emperor Tewodros in 1869 and the withdrawal of the British forces from Maqdalla, Wagshum Gobezze proclaimed himself Emperor of Ethiopia with the throne name of Tekle Giorgis Il he was also known as the Fetsame Mengist because his reign witnessed hitherto unseen devastating civil war.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("44.", "why did Louis XVI convene the Estates General in 1788?", 0, 0, 0, 0, 0, "To design strategies on how to deal with British invasion of France.", "To discuss the issue of voting new taxes for the government.", "To discuss reforms on land tenure and peasant conditions.", "To develop mechanism to address the bad harvest of 1788", "Louis XVI summons Estate General forced him to call a meeting of the Estates-General an assembly of representatives from all three estates to approve this new tax. The meeting, the first in 175 years, was held on May 5, 1789, at Versailles.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("45.", "what did the phrase, “city air is free air” mean in reference to the European Middle Ages?", 0, 0, 0, 0, 0, "That cities were hygienic places to lice compared to their rural countryside.", "That cities granted greater personal rights to residents than the countryside.", "That cities offered different kinds of social services unavailable in the countryside.", "Those cities offered residents different kinds of entertainment that the countryside.", "City air is free air means in reference to the European Middle Ages that cities granted greater personal rights to the resident than the courtside", "b", 0, 1, this.f586b));
        arrayList.add(new questions("46.", "what is at the basis of the differences between the various legal schools in Islam?", 0, 0, 0, 0, 0, "The primacy of the Quran over the Hadith as a source.", "The priority between analogy and consensus as sources", "The role of the state in implementing the law.", "The role of Islamic scholars interpreting the law.", "Between the 8th and 9th centuries Muslim scholars codified the whole Islamic law into a coherent system and eventually emerged four legal schools. While they agreed on Quran and Hadith as the source of the sharia but they give priority to one or another. The two source of law that us analogy and consensus", "b", 0, 1, this.f586b));
        arrayList.add(new questions("47.", "which of the following is a significant factor both for the rise and decline of the Aksumite Empire?", 0, 0, 0, 0, 0, "Long distance trade", "Military technology", "Leadership", "Agriculture", "The prosperity and growth of Aksum was directly related to its control of the Red Sea trade- Similarly, the Aksumite state and civilization began to decline when its Red sea trade faced serious competition from South Arabians.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("48.", "which of the following accounts for the military success of Imam Ahmed over the Christian army under Lebne Dengel?", 0, 0, 0, 0, 0, "Gragn’s ability to mobilize pastoralists of the lowlands for a jihad.", "The withdrawal of Portuguese military support from the Christian kingdom.", "The rebellion of Muslims living in the Christian Highland kingdom.", "The hostility between the Christian highland kingdom and the Turks.", "The military success of Imam Ahmed over the Christian army in the 16th century under Lebne Dengle was his ability to mobilized the Muslims pastoralist of the lowland of Adal against the Christian kingdom", "a", 0, 1, this.f586b));
        arrayList.add(new questions("49.", "which of the following was central in the process of generating power at the early stage of the industrial revolution?", 0, 0, 0, 0, 0, "Wind", "Coal", "Palm Oil", "Petroleum", "Coal was the main source of power during the early stage of Industrial Revolution", "b", 0, 1, this.f586b));
        arrayList.add(new questions("50.", "It was said that Capitalism in Western Europe was nurtured in the womb of Feudalism, the reason was:", 0, 0, 0, 0, 0, "Naturally capitalism came after feudalism", "European feudalism was unique in recognizing absolute private property in land.", "Agricultural productivity under feudalism was key for the emergence of capitalism", "Trade and crafts flourished in many towns and cities under feudal lords.", "Capitalism in west Europe was nurtured in the womb of the reason for agricultural productivity under feudalism was the key for the emergence of capitalism.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("51.", "which one of the following factors greatly contributed to the spiritual material prosperity of Western Sudanic states during the medieval period?", 0, 0, 0, 0, 0, "Christian missionaries and the expansion of mining", "Islam and trans-Saharan trade.", "Pilgrimage and the trans-Atlantic trade", "Jihads and “Legitimate Trade”.", "Islam and Trans Saharan Trade was the main factors greatly contributed to the spiritual and material prosperity of the Western Sudanic states   during the medieval period.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("52.", "The locality in eastern Gojjam that briefly served as a political center to Emperor minas (r. 1559-1563) Was", 0, 0, 0, 0, 0, "Jan Amora", "Debre zeit", "Mengiste Semayat", "Denqeze", "The locality in the Eastern Gojjam that briefly served as the political   center to the emperor Minas (1559-1563) was Denqeze.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("53.", "The birth of the militant states of Adal was the immediate    result of the", 0, 0, 0, 0, 0, "Demographic pressure from the neighboring Afar & Somali.", "Threat from the vigorously expending Oromo.", "Internal division with in the Walasma ruling house of Ifat.", "Military and diplomatic support from ottoman Turkey", "The main reason of the birth of the militant state of Adal was the immediate result of the internal division within the Walasma ruling house of Ifat.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("54.", "The decision of Fasiledes to move to Gondar to make it the capital of his kingdom as of 1636 is said to have been influenced by", 0, 0, 0, 0, 0, "Economic considerations related to the desire to collect ample revenue from traders.", "Religious considerations related to his desire to restore the traditional Orthodox faith", "Strategic considerations related to the geographic location of Gondar at the center of his kingdom.", "His long term plan to make the town a regional center for religious learning.", "As king Fasiledes (r. 1632 — 1667) took power and followed anti  Portuguese and anti — Catholic policy. How restored the Orthodox faith. He made Gondar his fixed capital in 1636 because its strategic consideration related to the geographic location of Gondar at the center of his kingdom.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("55.", "which of the following is correct about the relationship between the Gada system and the Qallu institution?", 0, 0, 0, 0, 0, "Both were concerned with the spiritual life of Oromo communities", "Both were concerned with political and administrative matters among the Oromo.", "There was interdependence between them in preserving and reinforcing social morality.", "Division between the supporters of the two institutions gave rise to ravaging wars", "The Gada system is system which Gada classes succeeds each other every 8 years through a number of age — grades. The Oromo followed traditional religion called Waqa - and served by high priest called Qallus.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("56.", "what is primary reason for which linguists classify languages?", 0, 0, 0, 0, 0, "To trace and explain what they share", "To emphasize and highlight there difference", "To document their relative richness and development", "To demonstrate the relationship between race & languages", "The primary reason for which linguistics classified languages based o trace and explain what they share.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("57.", "which of the following is true about Ancient Egypt?", 0, 0, 0, 0, 0, "It was always ruled by indigenous rulers", "It controlled and dominated all the Nile Valley", "Its civilization is older than those of Greece or Rome.", "Its rulers controlled their domain from a single center", "Ancient Egypt was a civilization of ancient Northeastern Africa concentrated along the lower reaches of the Nile River in the place that is now the country Egypt. It was older than the ancient Greek and Roman.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("58.", "According to the new Constitution of 1791, “Active Citizens” in France were those who", 0, 0, 0, 0, 0, "Were emancipated from slavery", "Were members of the Legislative Assembly", "Enjoyed the right to vote and be elected", "Came back home after participating in the American war", "According to the new constitution of 1791 Passive Citizens had n Property or voting rights. They were protected by the law but had no… Active citizens were literate adults who had been resident In France for a certain period of time.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("59.", "medieval society in Europe was characterized but almost continuous warfare due to:", 0, 0, 0, 0, 0, "Conflict over land and prestige among the lords.", "Differences of region and religion", "The weakness of the kings", "Conflict over trade routes among the lords", "One of the most important causes of warfare in medieval Europe was the question of succession, or who was the rightful king of a country. Or the conflict overland and prestige among the lords.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("60.", "which of the following is a correct definition of history as an academic discipline?", 0, 0, 0, 0, 0, "An account of the past based on certifiable evidence", "An account of the past focused on political events", "A study of the past without any rules about what is proper or improper", "An account of the past accepted by all academics", "The definition of history is a story or tale of what has happened or may have happened in the past based on verifiable evidence.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("61.", "The role of the institution called Mikrecho in the political system of the medieval kingdom of kaffa was", 0, 0, 0, 0, 0, "Supervising provincial administration", "Giving whatever assistance the king needs", "Checking the power and authority of the king", "Monitoring tribute collection", "The state of the kingdom of Kaffa was highly organized. A council of advisers of the kings known as the Mikrecho used to control the political authority of the (kings) Tato.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("62.", "which one of the following measures led to the outbreak of rebellions by the 13 British colonies of North America?", 0, 0, 0, 0, 0, "The Boston Tea Party", "The Stamp Act", "The Declaration of Independence", "The Bill of Taxes", "In March 1775 Britain imposed what was known as the Stamp Act. This act required tax stamps. The American publicized, a slogan entitled \"Taxation without representation is a tyranny' The American opposed to the British   rule. The fighting started in largest cities and trading ports in 1775. In 1776 representatives from the 13 colonies met in Philadelphia to declared themselves independent.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("63.", "The council of Nicea in 325A.D was an important land mark in the history of the Christian Church because it", 0, 0, 0, 0, 0, "For the first time proclaimed Christianity as the official religion of Rome", "Consolidated the Christian Church by laying down its administrative structures", "Planted the seeds of an enduring doctrinal division in the Christian Church", "Established the separation of church and the Roman state as a guiding principle", "The Council of Nicea in 325A.D overwhelmingly affirmed the deity and eternality of Jesus Christ and defined the relationship between the Father and   the Son as \"of one substance.\" It also affirmed the Trinity— the Father, Son, and Holy Spirit were listed as three co-equal and co-eternal Persons.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("64.", "what was the relationship between the medieval state of Damot and Welayita?", 0, 0, 0, 0, 0, "Both states emerged in the same geographical area but in different historical periods", "Welayita tradition claims that one of its dynasties has links with Damot.", "The ruling dynasty of Welayita was established by refugees from Damot following its conquest by the Oromo", "The political institutions of Welayita were exact reproductions of political institutions of Damot.", "The relationship between the medieval state of Damot and Welayita was the ruling dynasty of Welayita was established by the refugees from Damot was Motolomi.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("65.", "which of the following was included in the English Bill of Rights of 1689?", 0, 0, 0, 0, 0, "The kings may not be able to sign treaties of agreements with other kings without parliamentary approval", "The rulers of England shall not be Catholic", "The kings can have armies of their own", "The kings can levy taxes", "The Bill of Rights 1689 is an iron gall ink manuscript on parchment. It is an original Act of the English Parliament and has been in the custody of Parliament since its creation. The Bill firmly established the principles of frequent parliaments, free elections and freedom of speech within Parliament — known today as Parliamentary Privilege.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("66.", "with which one of the following was the Renaissance associated?", 0, 0, 0, 0, 0, "A deep concern with what happen to the human soul in the hereafter.", "A fascination with the literature and histories of the classical world.", "Discovering ways of reconciling the material and spiritual worlds", "Synthesizing the political philosophies of the West with the East.", "Renaissance was the period of European history at the close of the Middle Ages and the rise of the modern world; a cultural rebirth from the 14th through the middle of the 17th centuries; the revival of learning and culture of the classical world.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("67.", "what was the cause for the political crisis that developed in the Gonderian Kingdom in the late 1760s?", 0, 0, 0, 0, 0, "The decline in revenue drawn from the Mattama trade which made the monarchy unable to a pay its troops", "The deepening of religious divisions within the Church between the Qibat and Ye-Sega Lij factions", "The intensification of rivalry between the monarchy and the provincial nobility over power and resources.", "The threat of invasion of Gondar by the Funj sultanate & the widespread fear that generated among the population.", "The cause for the political crisis that develop in the Gonderian kingdom in the late 1760s was the intensification of rivalry between monarchy and the provincial nobility over power and resources.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("68.", "what accounts for the defeat of the radical ideas entertained by the Levelers during the 17th century English Revolution?", 0, 0, 0, 0, 0, "The absence of support for such ideas among the governing elite and especially among the leadership of the New Model Army", "The division of the movement between supporters of Parliament and Stuart king", "The division of the country by Scottish rebels which forced them to postpone their demands in the name of unity of the nation", "The decision by John Lebrun to abandon the cause by sliding with the royalists.", "The Levelers were arguably the first organized political party in modern history of England during the civil war and the first democratic party contain division of the movement between supporter of the parliament and the king.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("69.", "what were the major languages of Renaissance scholarship?", 0, 0, 0, 0, 0, "English and French", "Latin and Greek", "German and Italian", "Italian and Greek", "The two major languages of Renaissance scholarship were the Latin and Greek", "b", 0, 1, this.f586b));
        arrayList.add(new questions("70.", "which of the following factors was the most significant for the victory of Adal forces over those of the Christian state in the 1520s?", 0, 0, 0, 0, 0, "Superior weapons", "The success of Imam Ahmed in unifying Afar, Somali and Harari forces", "Defection of Christians who opposed Lebne Dengel.", "Turkish military and political support", "The main factor the most significant for the victory ofAda1i forces over those of the Christian state in the 1520 was the success of Imam Ahmed in unifying Afar, Somali and Harari forces.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("71.", "which one of the following is a central factor behind the emergence of the Zagwe dynasty?", 0, 0, 0, 0, 0, "The imperative of defending the northern highlands from Arab attacks subsequent to the decline of Aksum", "The oppression and marginalization of the Cushitic Agaw at the hands of the Semitic rulers of Aksum", "The desire of the Agaw elite to acquire new agricultural lands to resettle kinsmen whose land has become impoverished", "The intensification of interaction between Aksumite and Agaw elites following the movement of the capital southwards", "The central factor behind the emergence of the Zagwe Dynasty was the intensification of the interaction between Aksumite and the Agaw elites following the movement of the capital south wards.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("72.", "Why did the Oromo succeed in taking land from their opponents within relatively short period?", 0, 0, 0, 0, 0, "They moralized dedicated warriors whose lands has been taken from them by other pastoralists", "They used better muskets and horses which were imported through the port of Mombasa", "They were able to divide the Christians and Muslims through a successful strategy", "They were served well by the Gada system which allowed them to mobilize their resources in an efficient way", "Causes for the success of the expansion of Oromo within relatively short period of time were: one the Gada system provided training and military organization", "d", 0, 1, this.f586b));
        arrayList.add(new questions("73.", "How did the barbarian invasions contribute the emergence of feudalism in Europe?", 0, 0, 0, 0, 0, "They introduced the tradition of building castles which made it difficult for anyone ruler to defeat his enemies and centralize power", "They facilitated the collapse of the Roman Empire and subsequently contributed to the fragmentation of political authority.", "They introduced the tradition of tying the peasant to the land permanently thereby introducing the principle of serfdom", "They spread Christianity across the continent and thereby facilitated the rise of powerful feudal lords", "The barbarian invasion contributed to the of feudalism in Europe because it facilitated the collapse of the Roman Empire and subsequently contributed to the fragmentation of the political authority", "b", 0, 1, this.f586b));
        arrayList.add(new questions("74.", "what was the final outcome of Reformation?", 0, 0, 0, 0, 0, "Overall decline of religion in Europe", "A permanent division among Christians on theological matters", "An even stronger catholic church", "Stronger bond between church and state everywhere.", "The reformation produced several important outcomes that have greatly influenced the world. The most immediate outcome was the protestant movement and the permanent division among Christianity on theological matters.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("75.", "which one of the following best describes Enlightenment thinkers?", 0, 0, 0, 0, 0, "Their focus on abstract philosophical issues that had little relevance to everyday life.", "Their concern with applying critical thinking to understanding & explaining political problems", "Their agreement on the need to abolish monarchy & replace it with democratic institutions", "Their view of the state as a repressive institution & hence the need to abolish it.", "The Enlightenment thinkers concerns with applied reason, critical thinking to understand and explaining the political problem of the human world, as well as to the rest.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("76.", "which one of the following is correct about the Spanish abolitionist state during the Early Modern Period?", 0, 0, 0, 0, 0, "It emerged primarily in response to the threat that Muslims & Jews posed to the states of Castile and Argon.", "It was consolidated by means of the Inquisition which suppressed dissent across the kingdom.", "It was helped by the acceptance of Protestantism and the spread of literacy across the nation.", "It was weakened by the incorporation of extensive territories in Europe", "Spanish abolitionist an agitation for the abolition of slavery in the colonies, which was consolidated by means of the Inquisition which suppressed dissents across the kingdom.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("77.", "what caused the internal divisions within the Sultanate of Ifat in the second half of the 14th century?", 0, 0, 0, 0, 0, "Differences of opinion on what kind of establishing an alliance with the non-Muslim Damot state against the Christian kingdom", "Differences on the legitimacy of establishing an alliance with the non-Muslim Damot state against the Christian kingdom", "The issue of accepting rejecting the help of the rulers of Yemen to fight against the Christian Kingdom", "On the issue of relocating the political center of Ifat from the Ifat lowlands to the deserts of Awassa ", "One of the causes of internal division of within the sultanate of Ifat in the second half of the 14th century was the difference of opinion to what kinds of to adopt toward the Christian kingdom.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("78.", "The main reason why the early Christians were persecuted by the Roman state was because they", 0, 0, 0, 0, 0, "Refused to pay tribute to the state", "Aligned themselves repeatedly with Rome’s enemies", "Rejected the tradition of offering sacrifices to the emperors", "Were engaged in the hated profession of lending money.", "At the beginning Roman government considered Christianity as a branch of Jewish religion, early Christians were persecuted but later they recognized Christianity as the threat against their unity and reforms and under took to eliminate them.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("79.", "In which of the following pair of religions did one emerge as a reform movement out of the other?", 0, 0, 0, 0, 0, "Shinto and Confucianism", "Buddhism and Hinduism", "Shi’ism and sunnism", "Zoroastrian and Judaism", "The beliefs of the Vedic Age develop into Hinduism and Buddhism. Hinduism is collection of religious beliefs that developed slowly over time emerged as a reform movement from the Buddhism.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("80.", "what did the famous Italian scholar Counti Rossini mean by referring to Ethiopia as “Museum of Peoples”? That the country", 0, 0, 0, 0, 0, "Has preserved languages that are no longer spoken in other parts of Africa", "Contains population that speak languages drawn from the four African language super- families", "Has populations that spoke diverse languages and have varied cultures", "Contains populations whose languages have not changed through millennia ", "The famous Italian schools Conti Rossini referred Ethiopia as the  Museum Peoples that Ethiopia has populations that speaks diverse languages and have varied colures.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("81.", "what is the justification for referring to the Oromo population movement of the 16th and 17th centuries as a unifying phenomenon in Ethiopian history?", 0, 0, 0, 0, 0, "That the Oromo did not oppress non-Oromo groups whom they defeated", "That the Oromo practice a system of adoption of children called Gudifacha", "That the movement reduced the number of linguistic and cultural entities in southern Ethiopia", "That the Oromo brought the Muslim Christian wars of the 16th century to an end.", "The process of adaptation called Mogassa (Gudifacha) was one of the unifying phenomenon in Ethiopian history during the expansion of Oromo population in the 16th and 17th centuries", "b", 0, 1, this.f586b));
        arrayList.add(new questions("82.", "which of the following is true about the heroic deeds of Joan of Arc (1412-1431)?", 0, 0, 0, 0, 0, "She led the French army in the fight to lift the English siege on the City of the Orleans", "She was a commander of the French army which successfully broke English naval blockade in the British canal", "She was canonized by the Russian Orthodox Church for her death for the cause of the church ", "She became famous for her participation in the Hundred Years War as head of the French Catholic Church", "Joan of Arc (1412-1431). Peasant girl living in Medieval France, believed that God chosen her 10 lead France to victory in its long-running war with England.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("83.", "which of the following is true about the Oromo Gada system?", 0, 0, 0, 0, 0, "Political power was peacefully transferred from one group to the other every eight years", "It operated through competitive election of officers irrespective of age or grade", "It accorded equal rights to women and men", "It clearly distinguished and separated religion from politics", "The Gada system is system which Gada classes succeeds each other every 8 years number of age --- grades. Each grade lasted for a period 8 years. The six age grade (41 - 48 years) in is called Discourse Gada. ", "b", 0, 1, this.f586b));
        arrayList.add(new questions("84.", "At the root of Rousseau’s economic idea sympathizing with small property owners was his principle that", 0, 0, 0, 0, 0, "Everyone should own property become a capitalist", "A broad economic gap between the rich and the poor should not exist", "All men are equal and their economic equality is an absolute necessity", "The means of production should be put under collective ownership.", "Jean-Jacques Rousseau (1712-1778) discusses in the Discourse on Inequality and The Social Contract, the state of nature is the hypothetical, prehistoric place and time where human beings live uncorrupted by society.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("85.", "An important achievement of the “Glorious Revolution” of 17th century England was the fact that it for the first time", 0, 0, 0, 0, 0, "Introduced the so-called “Magma Carta”", "Made the role of parliament insignificant", "Introduced the so-called Bill of Rights", "Restored the British monarchy of the Stuarts", "The bloodless change of the regime came to be known as the \"Glorious Revolution\" took place between 1888 and 1689. This marked the victory of parliament and the final defeat of the English autocracy. As the result Bill of Rights, formally An Act Declaring the Rights and Liberties of the Subject and Settling the Succession of the Crown (1689), one of the basic instruments of the British constitution, the result of the long 17th-century struggle between the Stuart\" kings and the English people and Parliament introduced.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("86.", "At what level are the Semitic, Cushitic and Omotic languages of Ethiopia related?", 0, 0, 0, 0, 0, "At super family level", "At family level", "At region level", "At dialect level", "The Semitic, Cushitic and Omotic languages of Ethiopia are the language family level going to The Afro-Asiatic super family of language.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("87.", "which of the following two medieval states in southern Ethiopia were conquered & subjugated by the advancing Mecha Oromo?", 0, 0, 0, 0, 0, "Enarya and Damot", "Welayita and Kaffa", "Shewa and Ifat", "Adal and Hadiya", "Enarya and Damot are the medieval states in the southern Ethiopian Region conquered and subjugated by the advancing Mecha Oromo.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("88.", "what was the relationship between the state and the Christian Church in the ancient Roman Empire?", 0, 0, 0, 0, 0, "It was always peaceful and friendly", "It was always violent and full of conflict", "It started with conflict and became friendly later", "There was no significant relationship of any kind", "The relationship between the states and the Christian church in Ancient Roman empire was always violent and fill of conflict.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("89.", "which one of the following is true about the Zagwe architectural tradition?", 0, 0, 0, 0, 0, "It was a complete break from the past in that it introduced the technology of Rock Hewan Churches", "It was a continuation of the architectural tradition of Aksum as manifested in the monolithic churches of Lalibela", "It has used funds obtained from the Coptic church of Egypt for local construction projects", "Slave labor was instrumental in the production of bricks for huge construction projects", "Zagwe rulers, king Lalibela was dedicated Christian who had encouraged for the construction of eleven rock hewn churches in Lalibela /Roha/ from a single rock. Lalibela aspired to establish another holy land or second Jerusalem in Ethiopia.", "a", 0, 1, this.f586b));
        arrayList.add(new questions("90.", "which of the following personalities rose to prominence as a result of political marriage?", 0, 0, 0, 0, 0, "Etege Mentwab", "Queen Illeni", "Queen of Sheba", "Bati Del Wembera", "Queen Illeni was the personality rose to prominent position as result of political marriage to Zara Yaqob (r. 1434—1468) from Sultanate of Hadiya. She played a significant role in the government of Ethiopia during her lifetime.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("91.", "which of the following falls under the category of intangible cultural heritage?", 0, 0, 0, 0, 0, "Buildings and monuments", "Written materials", "Rituals and festivities", "Fossils and tombstone", "UNESCO texts define the Intangible Cultural Heritage means the practices, representations, expressions, knowledge, skills —as well as the instruments, objects, artifacts and cultural spaces associated therewith that communities, groups and, in some cases, individuals recognize as part of their cultural heritage.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("92.", "which one of the following is a lasting achievement of King Fasiledes?", 0, 0, 0, 0, 0, "His success in bringing about reconciliation between Catholic and Orthodox clergy", "His determination to protect Ethiopian converts to Catholicism", "His success in forcing the reconversion of all Catholic Ethiopians to Orthodoxy", "His choice of Gondar as an imperial capital", "The lasting achievement of King Fasiledes was his success in forcing the reconversion fall catholic Ethiopians to Orthodox.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("93.", "Why is the year 1270, regarded as a historic landmark in the history of medieval Ethiopia? Because it marked the", 0, 0, 0, 0, 0, "End of the tradition of mobile capitals and the restoration of the old tradition of permanent capital", "End of the Aksumite dynasty and the beginning of the rule of monarchs from the Zagwe dynasty", "Ascension of Yemrhane Kirstos to the throne and the restoration of “Solomonic” rule in Ethiopia", "Ascension of Yekuno Amlak to the throne and the restoration of “Solomonic” rule in Ethiopia", "The year 1270 regarded as the historic landmark in the Ethiopian history because Amha Yesus took the throne name Yekuno - Amlak and ruled the Christian Kingdom from 1270 — 1285. He was accepted as the legitimate ruler of the kingdom so referred as the restorer of the Solomonic dynasty.", "d", 0, 1, this.f586b));
        arrayList.add(new questions("94.", "what was the common feature in the works of Renaissance scholars and writers?", 0, 0, 0, 0, 0, "Their call for a reform of existing religious particles", "Their challenge to authority and “established” thinking", "Their greater concern for religious matters than human problems", "Their undermining of classical learning of ancient Greece and Rome", "The common features in the works of renaissance scholars and writers their challenge to the authority and established thinking.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("95.", "which of the following is true about the periodization of the European Middle Ages?", 0, 0, 0, 0, 0, "when it started is more precisely known than when it ended", "Its beginning as well as the end is not precisely known.", "Its end is more precisely known than its beginning", "Both the beginning and the end are precisely known", "The Periodization of European Middle Age is precisely from the fall of the west roman empire but the end of the Middle Age not precisely Known.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("96.", "Which one of the following is true about the Roman Catholic Church in Western Europe during the early Middle Ages?", 0, 0, 0, 0, 0, "It was the bastion of conservation and reaction", "It collected taxes and maintained law and order", "Its powers were confined to spiritual matters alone", "The high-ranking clergy were landless peasants", "During the early Middle Age the only unifying element in Western  Europe was the Catholic Church It collects taxes and maintained laws and order.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("97.", "The emergence of powerful war leaders in the process of expansion led to the gradual decline of the Gada system among the Oromo. This was because:", 0, 0, 0, 0, 0, "Those developments led to the creation of a class of land lords with absolute authority over their people.", "Those successful war leaders accepted Islam which made the religion dominant over any traditional institution", "Those leaders evolved to assume kingship which was inconsistent with the principles of the Gada system", "People lost faith in the Gada system as it failed to stop the raging wars.", "Following their   expansion, the Oromo’s the Gada system declined. With the passage of time they abandoned the Gada system. Powerful war leaders evolved to assume the kingship which is inconsistent with the Principles of the Gada system.", "c", 0, 1, this.f586b));
        arrayList.add(new questions("98.", "what was the common characteristic of absolute monarchies of Europe in the Early Modern period?", 0, 0, 0, 0, 0, "Weak monarchs and strong nobility", "Strong monarchs and weak nobility", "Equally strong monarchs and nobility", "People lost faith in the Gada system as it failed to stop the raging wars", "Absolute monarchies of Europe in the early the middle ages As feudalism declined, the power of kings increased the power of Nobilities decline.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("99.", "what was the difference between Renaissance scholars and Christian Humanists of the 15th century?", 0, 0, 0, 0, 0, "The former focused on science and technology while the latter studied the humanities", "The former sought to recapture ancient literature while the latter studied the bible", "The former were interested in non-human things while the latter studied things related to humanity", "The former was mainly Italian while the latter were mainly Dutch", "The early Italian Renaissance, much of the focus was on translating and studying classic works from Latin and Greek whereas Christian humanism emphasizes the humanity of Jesus, his social teachings and his propensity to synthesize human spirituality and materialism.", "b", 0, 1, this.f586b));
        arrayList.add(new questions("100.", "which of the following was true about the Muslim Sultanates in Ethiopia and the Horn between the 9th and 16th centuries?", 0, 0, 0, 0, 0, "None of them had submitted to the Christian state", "They fought more among themselves then against the Christian state.", "They were all supported and encouraged by outside forces opposed to the Christians", "They controlled & dominate trade with the outside world. ", "The Muslim States (Sultanates) in the Ethiopian region and the Horn of Africa between 9th and 16th centuries they dominate and controlled them with outside world.", "d", 0, 1, this.f586b));
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
        this.f587tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    history2009.this.timer.setVisibility(0);
                    history2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    history2009.this.scr.setVisibility(8);
                    history2009.this.chr.stop();
                    history2009.this.toolbar.setVisibility(8);
                    history2009.this.Relative.setBackgroundColor(-7829368);
                    history2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2009.this.getBaseContext());
                    int unused = history2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = history2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = history2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = history2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = history2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = history2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = history2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = history2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = history2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = history2009.this.highscoreHistory2009 = defaultSharedPreferences.getInt("hist2009hs", 0);
                    int access$600 = history2009.this.part1 + history2009.this.part2 + history2009.this.part3 + history2009.this.part4 + history2009.this.part5 + history2009.this.part6 + history2009.this.part7 + history2009.this.part8 + history2009.this.part9;
                    history2009.this.resultText.setText(String.valueOf(access$600));
                    history2009.this.progressbar.setProgress(access$600);
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
                    int unused11 = history2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = history2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = history2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = history2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = history2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = history2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = history2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = history2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "hist2009hs";
                    int unused19 = history2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = history2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = history2009.this.answered1 + history2009.this.answered2 + history2009.this.answered3 + history2009.this.answered4 + history2009.this.answered5 + history2009.this.answered6 + history2009.this.answered7 + history2009.this.answered8 + history2009.this.answered9 + history2009.this.answered10;
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
                    if (access$600 > history2009.this.highscoreHistory2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - history2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1hist091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1hist092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1hist093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1hist094", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1hist095", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1hist096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1hist097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1hist098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1hist099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1hist0910", 0);
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
                        editor.putString("scorehist091", str3);
                        editor.putLong("date1hist091", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorehist092", str5);
                            editor.putLong("date1hist092", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorehist093", str5);
                            editor.putLong("date1hist093", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorehist094", str5);
                            editor.putLong("date1hist094", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorehist095", str5);
                            editor.putLong("date1hist095", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorehist096", str5);
                            editor.putLong("date1hist096", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorehist097", str5);
                            editor.putLong("date1hist097", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorehist098", str5);
                            editor.putLong("date1hist098", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorehist099", str5);
                            editor.putLong("date1hist099", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorehist0910", str5);
                            editor.putLong("date1hist0910", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datehist091", 0);
                    long j12 = defaultSharedPreferences.getLong("datehist092", 0);
                    long j13 = defaultSharedPreferences.getLong("datehist093", 0);
                    long j14 = defaultSharedPreferences.getLong("datehist094", 0);
                    long j15 = defaultSharedPreferences.getLong("datehist095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datehist096", 0);
                    long j17 = defaultSharedPreferences.getLong("datehist097", 0);
                    long j18 = defaultSharedPreferences.getLong("datehist098", 0);
                    long j19 = defaultSharedPreferences.getLong("datehist099", 0);
                    long j20 = defaultSharedPreferences.getLong("datehist0910", 0);
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
                        editor2.putString("iScorehist091", str4);
                        editor2.putLong("datehist091", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorehist092", str6);
                            editor2.putLong("datehist092", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorehist093", str6);
                            editor2.putLong("datehist093", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorehist094", str6);
                            editor2.putLong("datehist094", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorehist095", str6);
                            editor2.putLong("datehist095", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorehist096", str6);
                            editor2.putLong("datehist096", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorehist097", str6);
                            editor2.putLong("datehist097", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorehist098", str6);
                            editor2.putLong("datehist098", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorehist099", str6);
                            editor2.putLong("datehist099", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorehist0910", str6);
                            editor2.putLong("datehist0910", l.longValue());
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
                        history2009.this.scr.setVisibility(8);
                        history2009.this.chr.stop();
                        history2009.this.toolbar.setVisibility(8);
                        history2009.this.Relative.setBackgroundColor(-7829368);
                        history2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2009.this.getBaseContext());
                        int unused = history2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = history2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = history2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = history2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = history2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = history2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = history2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = history2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = history2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = history2009.this.highscoreHistory2009 = defaultSharedPreferences.getInt("hist2009hs", 0);
                        int access$600 = history2009.this.part1 + history2009.this.part2 + history2009.this.part3 + history2009.this.part4 + history2009.this.part5 + history2009.this.part6 + history2009.this.part7 + history2009.this.part8 + history2009.this.part9;
                        TextView access$1600 = history2009.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        history2009.this.progressbar.setProgress(access$600);
                        history2009.this.progressbar.setMax(100);
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
                        int unused11 = history2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = history2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = history2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = history2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = history2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = history2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = history2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = history2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = history2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = history2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = history2009.this.answered1 + history2009.this.answered2 + history2009.this.answered3 + history2009.this.answered4 + history2009.this.answered5 + history2009.this.answered6 + history2009.this.answered7 + history2009.this.answered8 + history2009.this.answered9 + history2009.this.answered10;
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
                        if (access$600 > history2009.this.highscoreHistory2009) {
                            edit.putInt("hist2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - history2009.this.chr.getBase()) / 1000;
                        String str = "datehist099";
                        String str2 = "datehist098";
                        String str3 = "datehist097";
                        String str4 = "datehist096";
                        String str5 = "datehist095";
                        String str6 = "datehist094";
                        String str7 = "datehist093";
                        String str8 = "datehist092";
                        String str9 = "datehist091";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1hist0910";
                        String str11 = "date1hist099";
                        if (history2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1hist091", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1hist092", 0);
                            long j3 = defaultSharedPreferences.getLong("date1hist093", 0);
                            String str13 = "date1hist093";
                            String str14 = f;
                            String str15 = "date1hist091";
                            long j4 = defaultSharedPreferences.getLong("date1hist095", 0);
                            String str16 = "date1hist095";
                            String str17 = "date1hist094";
                            String str18 = "date1hist096";
                            long j5 = defaultSharedPreferences.getLong("date1hist096", 0);
                            long j6 = defaultSharedPreferences.getLong("date1hist097", 0);
                            String str19 = str11;
                            String str20 = "date1hist098";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1hist092";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1hist094", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1hist097";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1hist098", 0));
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
                                editor3.putString("scorehist091", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorehist092", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorehist093", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorehist094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorehist095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorehist096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorehist097", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorehist098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorehist099", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorehist0910", str25);
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
                            long j18 = sharedPreferences.getLong("datehist0910", 0);
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
                                editor4.putString("iScorehist091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorehist092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorehist093", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorehist094", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorehist095", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorehist096", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorehist097", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorehist098", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorehist099", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorehist0910", str28);
                                    editor4.putLong("datehist0910", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1hist091";
                            String str30 = "date1hist094";
                            String str31 = str11;
                            String str32 = "date1hist092";
                            String str33 = "date1hist097";
                            String str34 = "date1hist095";
                            String str35 = "date1hist096";
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
                            long j21 = sharedPreferences2.getLong("date1hist093", 0);
                            String str40 = str32;
                            String str41 = "date1hist093";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1hist098";
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
                                editor2.putString("scorehist091", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorehist092", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorehist093", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorehist094", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorehist095", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorehist096", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorehist097", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorehist098", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorehist099", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorehist0910", str49);
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
                            long j38 = sharedPreferences3.getLong("datehist0910", 0);
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
                                editor.putString("iScorehist091", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorehist092", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorehist093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorehist094", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorehist095", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorehist096", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorehist097", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorehist098", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorehist099", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorehist0910", str56);
                                    editor.putLong("datehist0910", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        history2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2009.this.scr.setVisibility(8);
                history2009.this.chr.stop();
                history2009.this.toolbar.setVisibility(8);
                history2009.this.Relative.setBackgroundColor(history2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                history2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2009.this.scr.setVisibility(0);
                history2009.this.toolbar.setVisibility(0);
                history2009.this.telegram_layout.setVisibility(8);
                history2009.this.chr.start();
                history2009.this.Relative.setBackgroundColor(history2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = history2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = history2009.this.mInterstitialAd = null;
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
                history2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
