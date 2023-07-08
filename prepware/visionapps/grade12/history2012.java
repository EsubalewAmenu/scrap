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

public class history2012 extends AppCompatActivity {
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
    private Boolean f592b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreHistory2012;
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
    private Toolbar f593tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_history2012);
        this.f592b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextHistory2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_history2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which statement is true about the introduction and expansion of Islam in Ethiopian and the Horn?", 0, 0, 0, 0, 0, "The port of Mettama was the main gateway of Islam. ", "The earliest area of entry was the port of Bebera. ", "The agents were Muslim clerics and merchants.", "The jihad along the trade routes played a role.", "The introduction and expansion of Islam in Ethiopia and the Horn of Africa through the against of Muslim clerics and merchants. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("2.", "Which one of the following best describes the main feature of the Omotic state in the Ethiopian region and the Horn? ", 0, 0, 0, 0, 0, "The population and states drive their names for their relation.", "The founders of the state were migrants from Northern Ethiopia. ", "Their communities mainly followed the religion of Judaism.", "The large-scale cultivation of teff was a basis of their agriculture. ", "Omotic state in Ethiopia and the Horn of Africa are populations and states drive their names for their location. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("3.", "Which of the following is true about the relationship between the Christian Highland Kingdom and the Omotic state during the medieval period.", 0, 0, 0, 0, 0, "There were a series of agreements between them. ", "There was interaction between the two peoples.", "There was strong understanding between them.", "The Christian highland Kingdom payed tribute to omotic state.", "The relationship between the Christian Highland kingdom and the Omotic state during the medieval period characterized by interactions between the two peoples. ", "b", 0, 1, this.f592b));
        arrayList.add(new questions("4.", "Which one of the following was the main cause for the expansion of the Christian highland kingdom in the medical period?", 0, 0, 0, 0, 0, "The maintenance of strong army and economic strength.", "The existence of peaceful relation with all its neighbors. ", "The restoration of the territories of the Aksumite empire.", "The alliance between the Christian Kingdom and Europe ", "The main causes for the expansion Christian Highland kingdom in the medieval period was to maintain the strong army and economic strength, ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("5.", "Why did Portugal and ottoman Turkey take part in the conflict between Christian and Muslim of Ethiopian in the 16th century? it was to", 0, 0, 0, 0, 0, "Colonize Ethiopian region and the horn of Africa.", "Advance their own economic and political interests.", "Participate in the slave trade of the Red sea region ", "Facilitate the spared of their respective religions.", "The Portugal and Ottoman Turkey take part in the conflict between Christian Muslim of Ethiopia in the 16th century was to advance their own economic and political interest.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("6.", "Why did Emperor Susenyos make Catholicism a state religion? To:", 0, 0, 0, 0, 0, "Secure the friend ship of Portugal against the Turks. ", "Strength imperial power with Portuguese military help.", "Introduce European knowledge in to the kingdom ", "Satisfy the desire of his people for a change in religion.", "The main reason that Emperor Susenyous to make Catholicism a state religion to strength imperial power with Portuguese military help. ", "b", 0, 1, this.f592b));
        arrayList.add(new questions("7.", "Who was the founder of the kingdom of Shewa?", 0, 0, 0, 0, 0, "Haile Melekot ", "Menilik the II", "Negasi kristos ", "Sahle Selassie", "The founder of the Shona dynasty was Nagasi Kristos, among the rulers Sahle Selassie (r 1813-1847) was strong. He achieved the title Negus instead of the traditional title called Meridazmach.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("8.", "What was the main factor of the rise of Muslim State along the Etho Sudan border?", 0, 0, 0, 0, 0, "The territorial expansion of Menilik II ", "The expansion of the Mahdists to the era", "The political stability in the era.", "The influence of cross-border trade", "Small Muslim shikdoms were formed the Ethio- Sudanese border. These states were formed as a result of interaction, between the local peoples and the Arabic speaking merchants from Sudan.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("9.", "The Mandate of heaven was important to the rulers of ancient ", 0, 0, 0, 0, 0, "Assyrian", "China", "India", "Greece", "The \"Mandate of Heavana\" was important to the rule of ancient China. ", "b", 0, 1, this.f592b));
        arrayList.add(new questions("10.", "What was the main cause of the Latin America Revolution in the early 19th century?", 0, 0, 0, 0, 0, "The influence of the ideas of the French Revolution.", "The economic decline of Portugal and Spain ", "The British colonization of Latin America people", "The French colonization of Latin America people", "The main cause of Latin American Revolution in the early 19th century was the influenced of ideas of the French revolution in the 18th century.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("11.", "Which of the following best describe the major features of the Axumite state?", 0, 0, 0, 0, 0, "Aksum expanded its territory as far as the Mediterranean Sea.", "The Aksumite kings owned large plantation farmed by slaves. ", "The Aksumite state structure was more or less monarchal.", "For over half a millennium Aksum had control over South Arabia. ", "first Aksume dominated by landowners derived much of their income from agriculture and later from red sea trade on Adulis. Adualis served render shipping service for which merchants to have pay.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("12.", "Which cultural elements showed that the zagwe period had country with Aksumite tradition?", 0, 0, 0, 0, 0, "The use of gold and amole for trade purpose", "The use of Geez as the language writing ", "The prevalence of ship building technology", "The development of crafts and literatures", "The zagwe maintained the cultural traditions of the Aksumite state. Geez was maintained as the language of the church and writing and continued relation with Muslim ruler of Egypt.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("13.", "What head to the established of the prison of Amba Geshen during the medieval period was", 0, 0, 0, 0, 0, "The growing ambition of the nobility to ascend to the throne.", "Theft and robbery that reached the highest point in the 14th century. ", "The power rivalry and civil war that disturbed the zagwe state.", "The succession problem that ravaged the highland Christian state.", "The succession problem that ravaged the highland Christian state led to the establishment the prison of Amba Geshen during the medieval period.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("14.", "What was the main factors that led to the resolution of the \"Solomonic\" Dynasty in 12 70 A.D?", 0, 0, 0, 0, 0, "strong economic and political position of Yekuno-Amlak", "Yekuno-Amlak's kingship ties with the last Aksumite ruler. ", "The spared of the legend of Queen Shaba and king solomon", "Military alliance between the Tigrean and Amhara regions ", "Amha Yesustook the throne name Yekuno- Amlak and ruled the Christian kingdom from 1270-1285. He was accepted as the legitimate rule of the kingdom so referred as the restorer of the Solomonic dynasty,", "c", 0, 1, this.f592b));
        arrayList.add(new questions("15.", "Which one of the following was the main future of the Muslim state of Ethiopian and the horn?", 0, 0, 0, 0, 0, "Their emergency was related to support from ottomans", "Their economic activity mainly depended on agriculture. ", "There were Muslim and Christian communities.", "Their rulers exercised both religious and political power ", "The main features of Muslim states of the Ethiopia and the Horn was Sultans (rulers) had both religious and political powers.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("16.", "What characterized the Christian Highland kingdom during the medieval period?", 0, 0, 0, 0, 0, "Decline of power of the monarchs ", "Expansion for Islam in Christian areas", "permanent royal court system", "Large scale territorial expansion", "Between 1270 and 1529, medieval period different linguistic, ethnic and religious community were conquered by the Christian highland state through large scale conquests and territorial expansion in the 14 and 15% century's. during this region of Amde Tsion different state and communities become tributaries to the Christian Kingdome.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("17.", "Which one of the following was a factor for the 16th century Oromo population movement?", 0, 0, 0, 0, 0, "The rise in environmental degradation ", "The increase in human and livestock population", "The desire to control trade routes", "The desire to expand their religion", "Afars and Somali population had already begun earlier than the Oromo's which started about 1522A.D. The movement Oromo population was caused by drought, famine and land pressures.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("18.", "Which of the following was a major consequence of the Muslim-Christian conflict of the 16th century?", 0, 0, 0, 0, 0, "The emergency of Harar as center of trade", "Cooperation between the monarchy and the nobility reached a new height", "The intermixing of population of the region ", "The flourishing of trade in the region", "The major consequences of the Muslim and Christian conflict of the 16 century(1527-1542 were:\n•\tMany Christians were slaughtered\n•\tChurches and monasteries were burned to the ground and looted. \n•\tManuscripts and religion books destroyed.\n•\tSome Christians were forced to cover to Islam to save their lives\n•\tIntermingling of the Christians and Muslims.\n•\tIt exhausted both the Christian and Muslim state\n", "c", 0, 1, this.f592b));
        arrayList.add(new questions("19.", "Zemen Mesafint was characterized by", 0, 0, 0, 0, 0, "religious controversy ", "economic progress", "civilian optimism", "political stability", "The Zemane Mesfint (Era of the War Lords was a period which coves roughly from 1769- 1855 in Ethiopian history. The major characteristics of this period were.\n•\tDecline of the imperial power\n•\tDisintegration of the Christian kingdom in to several semi-independence states. \n•\tLaw and order were broken and violated and trade was disrupted.\n•\tReligion’s controversies endangered the kingdom's unity\n", "a", 0, 1, this.f592b));
        arrayList.add(new questions("20.", "which one of the following rulers acted as a king maker during zemene Mesafint?", 0, 0, 0, 0, 0, "Intege Taytu", "Ras Wolle", "Ras Welde leul", "Ras Mikeal Sehul", "Between 1769-1771 Michael Schul become king maker. But the was opposed by regional lords and defeated at the battle of Sabrakussa in 1771 and forced him to go back to Tigray. and ruled Tigray up to his death in 1780. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("21.", "Tewodros the II faced opposition from the clergy because of his ", 0, 0, 0, 0, 0, "declaration of the orthodox Tewahdo as official faith", "attempt to tax church land without exception.", "attempt to put an end to the slave trade.", "encouragement of protestant missionaries", "Tewodros the II entered in to conflict with the clergy due to his plan of redistributing church lands. reduced the number of priests and deacons in each church to two and three respectively and they cultivated their own land and pay due tribute to the state. The clergy reacted strongly and enticed the mass against him. The anti-Tewodros propaganda of the clergy become more effective among the masses.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("22.", "which of the following event led to the Battle of Adwa?", 0, 0, 0, 0, 0, "The abrogation of Neutrality Treat ", "Ethiopia's rejection of the Addis Ababa Treaty.", "The abrogation of the Wuchale Treaty ", "The signing of the Neutrality Treat", "Menilk abrogated the Wuchale Treaty in February 1893, but Italians were unwilling to abrogate the treaty and to renounce their colonial ambition, Menilik wife Empress Taytu preferred war than surrender.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("23.", "The 1911 confrontation between Germany and France on the issue of the colonization of Morocco is called", 0, 0, 0, 0, 0, "The kruger War", "The Algiers crisis", "The Fashoda Incident", "The Agadir crisis", "The 1911 confrontation between Germany and France on the issues of the colonization of Morocco is called the Agadir Crisis. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("24.", "The formation of the Leagues of nation was the result of ", 0, 0, 0, 0, 0, "the Truman Doctrine to support government of Central and Eastern Europe.", "the unreserved support of president Harry Truman of USA and his policy of containment.", "the tireless effort of president Wilson of the USA and his famous 14 points ", "the USA Senate ratification of America's membership in to the League", "The formation of the LNS was the result of the America -president W Wilson had forward \"24 points\" served as a guide line at the peace settlement including right of self- determination of nation.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("25.", "the peace treaty that Russia signed with Germany to stop the First world War is known as ", 0, 0, 0, 0, 0, "the Paris peace treaty.", "The Nazi-Soviet Non-aggression Pact", "The Versailles peace treaty. ", "The Brest-Litovsk peace treaty", "The peace treaty that Russia signed with Germany to stop the WWI is known as the Brest Litovsk peace treaty. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("26.", "Which of the following statement is true about the effect of English Bourgeois Revolution?", 0, 0, 0, 0, 0, "It established parliamentary democratic system. ", "It spared reactionary ideas throughout Europe.", "The monarchy became a constitutional monarchy.", "It consolidated absolute monarchal ", "The effect of English revolution was a constitution that limited the power of monarchy. With this victory of the parliament political parties received majority votes in the election ruled the country. The monarchy become a constitutional monarchy.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("27.", "Which of the following social classes appeared with the industrial Revolution?", 0, 0, 0, 0, 0, "The peasant", "the merchant ", "the serf", "the proletariat", "The proletariat is new working class emerged with industrial revolution.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("28.", "Who was George Stephenson? ", 0, 0, 0, 0, 0, "The first developer of a railway locomotive", "The first inventor of electricity", "The first inventor of steam locomotive", "The builder of improved steam ", "railway and steamships dominant menace of transportation. Railroad building had been increased tremendously during the 19th century. In 1825 the first rail way was built in England. It was driven by George Stephenson. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("29.", "Among the Enlightenment thinkers who advocated a free trade economic policy?", 0, 0, 0, 0, 0, "Montesquieu ", "A. Adam Smith ", "Voltaire ", "Rousseau ", "The Enlightenment thinkers Adam Smith advocated a free economic policy.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("30.", "Which of the following explain the main future of 1830s and 1848 Revolution in Europe?", 0, 0, 0, 0, 0, "The liberal argued for protection of traditional monarchies. ", "The conservative wanted to give more powers to the parliaments.", "The liberals called for strict censorship of the press.", "The workers favored a monarchial form of the government. ", "Between 1830s the revolution in Europe. Revolutionary zeal swept across Europe. Liberals and nationalist throughout Europe were openly revolting against conservative governments.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("31.", "The Maria Theresa coins served as medium of exchange were introduced in Ethiopia region at the ends of", 0, 0, 0, 0, 0, "The 19th century ", "The 20th century", "The 17th century", "The 18th century ", "In the 19th century there was no uniform use of a single medium of exchange. The barter, complemented with the use of currency or other medium of exchange, such as salt bar (amole). Maria Theresa currency, first introduced in the late 18th century, it was silver coin of Austria.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("32.", "Which one of the following is correct about the impact of long-distance trade on Ethiopia society?", 0, 0, 0, 0, 0, "It hastened the formation of republic states. ", "It led to the spared of Protestantism in the south west.", "It was major source of income to all peoples. ", "It served as major means of economic", "The LDT of the 19th century affected the Ethiopian region societies in different way:\nServed as a major means of economic ties and interdependences among different peoples. States. It was major source of income for rulers.\nIt contributed to the political and religious transformation among the Gibe oromo states.\nIntroduction of money resulted increase of states income \nIt was the main driving forces behind the south expansion of the central Christian state in the last quarter of 19th century was the search land, tribute trade commodities and control of trade routes \nControl of trade routes and resourceful region become major sources of rivalries and bone of contention among rulers\n", "d", 0, 1, this.f592b));
        arrayList.add(new questions("33.", "One of the following is true about the rise of Kasa Hailu to power", 0, 0, 0, 0, 0, "He was victories at the battle of Debarqi.", "He utilized the prophecy of Fekare Iyasus. ", "He came to power after a series of battles. ", "He was crowned as Emperor at Ayshal.", "The crises came to an end with the rise of Tewodros (Kassa Hailu of Quara), he was not born to a loyal family and he fought a series of battles in his way to power from 1852-1855.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("34.", "Which one of the following regions peacefully submitted to Menelik of Shoa? ", 0, 0, 0, 0, 0, "Jimma", "Harar", "Muslem Gurage", "Arsi", "During the years from 1875-1889 Menelik succeeded in subdividing and incorporating the region of Gurage. Illubabor, Wollega, Giba states, Arsi and Harar. Most of the Oromo of western Ethiopia and Christian Gurage incorporated through peaceful submission on the country; the Muslim Gurage, Arsi and Harar were subjugated after bloody wars with army of Menilik.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("35.", "Which of the following statements is correct about Ethiopian army at the battle of Adwa? ", 0, 0, 0, 0, 0, "There were well trained troops among the different brigades. ", "There was effective provision for the army of the region", "There were Ethiopian collaborates with in the Italian army ", "There was efficient co-ordination among the different armies", "The Ethiopian army at the battle of Adwa was characterized by efficient coordination among different armies.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("36.", "Britain and France showed a pro- Italian stand in the dispute between Ethiopian and Italy following the wal-wal incident manly to ", 0, 0, 0, 0, 0, "Avoid the possibility of Italy becoming an ally of Germany.", "To respect the charter of the League of Nation. ", "Satisfy the wishes of their peoples which was pro - Italian.", "Keep the promise they mead to Italy in the Tripartite Treaty", "Britain and France showed a pro- Italian stand in the dispute between Ethiopian and Italy following the Wal- Wal incident mainly keeping the promise they made to Italy in Tripartite Treaty.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("37.", "Which one of the following describes best the Ethio- Italian relations be for 1935?", 0, 0, 0, 0, 0, "The Addis Ababa Treaty ended sign of Italian colonial interest in Ethiopia. ", "The Italian government adopt a policy of \"friendly\" relation with Ethiopian ", "They both adopted a hostile relation in the areas of international relations", "Italy opposed Ethiopia's membership to the League of nations in 1923 ", "Following the battle of Adwa, international and domestic crisis forced Italy to adopt a policy of friendly relationships with Ethiopia. But there was sign of revival of Italian colonial interest in Ethiopia.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("38.", "During the years of Italian occupation (1936-1941), fascist authority largely was limited to the urban centers. This was because", 0, 0, 0, 0, 0, "The rural areas had high infrastructure than the urban centers. ", "The towns were inhabited by pro-Italian collaborated and bands", "There was strong and wide spread guerilla movement in the urban area ", "The rural area was home to a strong guerilla movement.", "Fascist occupation was a military rule characterized by racist, violent and highly centralized. Its officials were highly corrupt inefficient and irresponsible. Their effective control limited to towns. Due to wide spread patriotic resistance. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("39.", "Among the omotic States the dynasty name of Matto and Minjo as well as the name of king (tato) belonged to the kingdom of", 0, 0, 0, 0, 0, "Kaffa", "Walayita", "Sheka", "Yem", "Kaffa was emerged in the 14th century probably north of Gojab River until 1897, it existed as independent kingdom. The royal title of the kingdom was Tato. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("40.", "In Japan the landlords fought against each other with their feudal warriors known as:", 0, 0, 0, 0, 0, "The daimyos", "the shogun", "the samurai", "the han.", "In Japan the land lords fought each other with their feudal warriors known as Samurai.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("41.", "Which of the following is NOT among the known distinguishing characteristics of the \"civilized states\" of the ancient world? ", 0, 0, 0, 0, 0, "the existence of democracy and federal government. ", "having one form of cities and some degree of literacy. ", "The existence of religion and some sort of secular philosophy.", "The availability of wealth and some degree of technology ", "The distinguished characteristics of the civilized state in ancient world includes having one form of cities and some degree of literacy; existence of religion and some secular philosophy and availability of some wealth. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("42.", "Which one of the following combinations of an ancient civilization and its achievement is correct?", 0, 0, 0, 0, 0, "Egypt----------------logographic ", "Sumerian ---------Cuneiform", "China---------------Hieroglyphics", "India ---------------Confucianism", "The correct combination of ancient civilizations achievements is\nMesopotamia----------Cuneiform\nChina------------------Confucianism\nEgypt------------------Hieroglyphics \n", "b", 0, 1, this.f592b));
        arrayList.add(new questions("43.", "Where did most ancient civilization emerged? They emerged in ", 0, 0, 0, 0, 0, "rain forests. ", "mountains", "savannas ", "river value", "Most of ancient civilization of the world emerged in river valleys. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("44.", "which one of the following has connection with ancient Asia civilization\"", 0, 0, 0, 0, 0, "Latin alphabet", "Democracy", "Symbol for zero", "Olympic", "Symbol of zero has more connections with ancient Asian Civilizations. Zero and its operation are first defined by (Hindu astronomer and mathematician) Brahmagupta in 628 said Gobbets. He develops a symbol for zero: a dot underneath numbers.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("45.", "Which one of the following doses NOT describe the main future of the Byzantine emperor?", 0, 0, 0, 0, 0, "Latin language was largely used instead of Greece ", "It was a feudal emperor ruled by an autocratic emperor.", "Tits economy was dependent on export of spices", "astern orthodox churches was its national churches ", "The Byzantine Empire was shrived after the down fall of western Roman Empire (330 -1453) its capital was Constantinople. The Byzantine Orthodox Church was officially separated from the Catholic. Used Greek languages", "a", 0, 1, this.f592b));
        arrayList.add(new questions("46.", "Which one of the following was the main achievements of China, idea and Japan in the medieval period, respectively?", 0, 0, 0, 0, 0, "Introduction of democracy, innovation of Hieroglyphic, and construction of Hanging Gardens", "Development of landscape painting, writing of great literature and land distribution program.", "Construction of great pyramids, drainage system and introduction of seclusion policy ", "Construction of churches, advancement of conflict philosophy and introduction of civil service examination.", "The main achievements of China, India and Japan in the Medieval period includes construction of great pyramids, drainage system and seclusion policy.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("47.", "Which statement best describes limitations in Ethiopia historiography? ", 0, 0, 0, 0, 0, "Because of an imbalance of source money writers attracted to the to the study of the northern parts of the economy.", "Most studies focus on political, economic, social and cultural histories of the country's past.", "Scholars' sufficient knowledge on various aspects of the country lead to the availability of relabeled historical sources ", "The balance of sources in different parts of the country enabled scholars to present the facts of the country", "The limitation of Ethiopian historiography are: An imbalance of sources Lack of comprehensiveness. It only focused on politics Lack of objectivity. It based toward kings. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("48.", "Which of the following events show the main future of the Neolithic Revolution in Ethiopian and the Horn?", 0, 0, 0, 0, 0, "The beginning of writing and recording of past events ", "The discovery of fire was a major achievement", "The culture of Neolithic Revolution is clearly known", "The communities evidently started sedentary life ", "Neolithic Age, or new stone Age, which begin about 8000 B.C. and lasted until about 4000 B.C. Historians call the changes in the Neolithic Age the agricultural revolution. The communities evidently started sedentary life. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("49.", "Which of the following is NOT true about the language of Ethiopian and the horn?", 0, 0, 0, 0, 0, "The majority of the peoples and the horn are speakers of the Semitic family.", "Ethiopian and the horn consist of peoples who are ethnically and linguistically diversified", "Language spoken in the region, more than any other cultural aspects determines people’s identity.", "The variety of language spoken by peoples in the region descended from two super-families.", "The majority of the peoples of the Ethiopian and the Horn of Africa the speaker of Cushitic languages family ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("50.", "The first focal known per-Axumite state in the Ethiopian region was ", 0, 0, 0, 0, 0, "Adal", "Damat", "punt", "Aksum", "Damat was first locally known per- aksumite state in the Ethiopian region.\n\tIt was existed just before the rise of Aksum. \n\tIts center was little south of Aksum.\n", "b", 0, 1, this.f592b));
        arrayList.add(new questions("51.", "Which one of the following is best describe history? it ", 0, 0, 0, 0, 0, "is the study of events be for the beginning of writing ", "is the study of societies with writing. ", "Studies and interprets what people did in the past", "The study of human culture prior to written records. ", "History is a branch of social science that deals with human beings did in the past. It studys changes in the development of societies. It also studies the political, economic, social and cultural life of past societies. History helps us to know about the past, to understand the present and for see the future developments.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("52.", "The availability of one of the following is irreplaceable or a mandatory requirement in academic history. which one?", 0, 0, 0, 0, 0, "Oral traditions ", "Quantitative data", "written source", "correct evidence", "Availability correct evidence is irreplaceable requirement in academic history.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("53.", "Experts of the field agree that the periodization Known as \"pre-historic period\" coincides with one of the following. Which one? ", 0, 0, 0, 0, 0, "Iron age", "Stone age", "Copper age", "Bronze age", "There are different approaches in the periodization of history if the one that divides the whole history of mankind in to different periods. Known as the \"pre-historic period\" was coincided Stone Age.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("54.", "Where did the earliest agricultural population who started food production in human history live during the Neolithic period?", 0, 0, 0, 0, 0, "The Nile valley ", "The Balkan region", "The Fertile Crescent ", "The Indus valley", "The earliest agricultural population who started food production in human history live during the Neolithic period was the Fertile crescent of the Middle East. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("55.", "Which one of the following is true about early states? They ", 0, 0, 0, 0, 0, "had people with specialized skill and differentiation in to classes.", "had mechanism of representative government and rule of law. ", "Had similar size, power and level of technology.", "Had institution like constitutions and parliament", "Human societies lived in some forms of organization in that had.\n\tDefined territorial areas\n\tLarge group of people\n\tA government that can use forces to make people obey\n", "a", 0, 1, this.f592b));
        arrayList.add(new questions("56.", "Although there were several instances of African resistances against colonial imposition, the only country to successfully replace a European colonial invasion was", 0, 0, 0, 0, 0, "Ethiopia at Adwa ", "Sudan under the Mahadists ", "Tanzania in Maji -Maji", "west Africa under samori Toure. ", "At the battle of Adwa Ethiopians the only country that resisted against colonial imposition repulsed a European colonial invasion.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("57.", "The main reason why emperor Halie selassie I was forced to think about revising the Ethiopian constitution in 1955 was ", 0, 0, 0, 0, 0, "The death of his son and successor Leul Mekonen.", "The federation of Eritrea with Ethiopia.", "The beginning of diplomatic relation with the USA. ", "The establishment of the OAU.", "The main reason why Emperor Hail Selassie I was forced to think about revising the Ethiopian constitution in 1955 the federation of Eritrea with Ethiopia.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("58.", "What was the contribution of the German historian, Job Ludolf, to the study of Ethiopian", 0, 0, 0, 0, 0, "He was writer and publisher the first modern history of Ethiopia. ", "He was the first Chairman of the department of history at AAU.", "He was the founder of the Institute of Ethiopian studies.", "He was the first Doctor of the Institute of Ethiopian studies.", "The first modern Ethiopian history is written by German historian Called Job Ludolf (1624-1704) in 1684. His source was Abba Gorgoris, an Ethiopian monk who was in Germany by the time.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("59.", "Which one of the following was a major challenge to long distance traders in 19th century in Ethiopia?", 0, 0, 0, 0, 0, "Government intervention ", "Shortage of trading items", "Heavy taxation", "Too many kellas", "The major challenges the long-distance trade in Ethiopia in the 19th century the trade routes passed through different environments and too many kellas.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("60.", "A very good opportunities which helped the early zagwe rules to take over power from the last Aksumite kings was the fast that they", 0, 0, 0, 0, 0, "Had control over trade and other importance resource of Aksum.", "Won the recognition and support of the church.", "Were already integrated with Aksumite courts and bureaucracy. ", "Were dominate elements in the Aksumite army.", "with the decline of Aksum a new dynasty called the zagewe dynasty emerged in the mid of 12th century and lasted up to 1270 A.D. the last Aksumite king Dil Naod was removed from his power about 1150A.d by the founder of the zagewe dynasty was called MaraTekle Haymanot from Bugna in Lasta. The zagewe already integrated with in the Aksumite court and bureaucracy.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("61.", "Which of the following was NOT the major characteristics of the 'Dark Age?\"", 0, 0, 0, 0, 0, "Greco- Roman civilization declined ", "Early capitalism emerged", "societies became urban centered", "Feudalism flourished", "The Dark Age was from 500 to 1000A.D decline of ancient European civilization characterized by: \n•\tInternal problems \n•\tForeign invasions, Muslim invasion, Anglo-Saxon of German tribes and Magyars Asiatic tribes. \n•\tDecline of the population and wealth of towns and cities. \n•\tCreation of small political units\n•\tRise of feudalism\n", "c", 0, 1, this.f592b));
        arrayList.add(new questions("62.", "The major economic activity in the early capitalism in Europe was", 0, 0, 0, 0, 0, "Manorialism ", "vassalage ", "serfdom", "investment", "The major economic activity of capitalism in Europe was investment. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("63.", "Which of the following best describe political, economical, and cultural the conditions in Midvale Europe?", 0, 0, 0, 0, 0, "Consolidation of capitalism", "Spilt of the roman catholic church.", "Development of feudalism.", "Exaction of the factory system ", "The development of Feudalism is best described as the political, social, economic and cultural condition of the medieval Europe. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("64.", "Which of the following was the major development of the among Renaissance period?", 0, 0, 0, 0, 0, "The use of reason and questioning attitude.", "The granting of full freedom of religion", "The birth of feudalism", "The decline in wealth of towns and cites", "the Renaissance was the intellectual movement that led to the revival of the learning of the ancient Greeks and Romans It began by the end of the Middle Ages (14c) and continued into the 17th c. It started in Italy and spread to France, Netherlands Spain and England Characteristics of the Renaissance were\n•\tStudying ancient Greco-Roman literature\n•\tUse of reason in advancing knowledge \n•\tInvention and use of printing press\n•\tUse of vernacular languages \n•\tStudy of the origin of man \n•\tSupport freedom of thought and action\n", "a", 0, 1, this.f592b));
        arrayList.add(new questions("65.", "Which one of the following was an achievement of Muslim Arab civilization.", 0, 0, 0, 0, 0, "Democracy", "use of Latin grammar", "Gothic paintings", "Calligraphy ", "Calligraphy is one of the achievements of Muslim Arab civilization.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("66.", "which one of the following permissive factors did NOT contribute for the colonization of Africa? ", 0, 0, 0, 0, 0, "Voyages and exploration ", "Africans lacked state organization ", "commercial expedition", "military conquest ", "The permissive factors that contribute for colonization of Africa were voyages and expiration, commercial expeditions and military conquest.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("67.", "Why was African resistance against colonialism usually unsuccessful? Because ", 0, 0, 0, 0, 0, "African lacked courage in battles", "African lacked stat organization", "Europeans were a superior race", "Europeans had a superior weapon", "Wrong Question Most of African resistance against colonial powers were not successful because Europeans had modern weapons and trained professional armies unlike Africans and they signed deceptive treaty. Africans’ resistance was not well coordinated. ", "d", 0, 1, this.f592b));
        arrayList.add(new questions("68.", "The African nation that successfully resisted European imperialism was ", 0, 0, 0, 0, 0, "Libya ", "South Africa ", "Ethiopia", "Liberia", "Most of African resistance against colonial powers were not successful the only country that successfully resisted European imperialist was Ethiopia.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("69.", "Which Africa country was colonized by Germen?", 0, 0, 0, 0, 0, "Rwanda", "Botswana", "Nigeria", "Angola", "Between 1880 and 1885 Germany occupied the south western Africa. Bptswana Togoland, Cameron, and East Africa.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("70.", "Which one of the following was an international factor that contributed for the revival of long-distance trade in Ethiopia in the 19th century? ", 0, 0, 0, 0, 0, "The revival of European interest in Ethiopia", "The political stability in the Gibe region ", "The rise of Mohamed Ali of Egypt.", "The conquest of the caused by Russia", "There was a revival of the LDT in the 19th century Ethiopia. This was due to different factors.\n\tThe rising power of the ruler of Egypt, Mohammed Ali, in 1830, resulted in the political stability of the region.\n\tThe conquest of the Caucus by Russian had closed the supply of some goods of high demand and concubine to the ottoman Turks. \n\tIn the 19th century European interest in Ethiopian was revived.\n", "d", 0, 1, this.f592b));
        arrayList.add(new questions("71.", "The Eastern Question in the Balkan region was caused by ", 0, 0, 0, 0, 0, "the occupation of the Danube Bosporus by Russia.", "the defeat of Russia in the criminal war of 1854-1856. ", "the expansion of the ottoman Empire in to the Balkans.", "the decline in power of ottoman Turkey in the Balkans", "The Eastern Question in the Balkan Region was caused by the early 1900s, the  Ottoman Empire, which included the Balkan region. Was in rapid decline.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("72.", "During the Middle Ages, the basic requirement for a chance to qualify for a position in the civil service was", 0, 0, 0, 0, 0, "Leadership experience ", "Passaging the civil service exam", "connection with ruling dynasty", "a university degree", "During the Middle Ages the basic requirement for a Chiness to qualify for the position was passing the civil service examination", "b", 0, 1, this.f592b));
        arrayList.add(new questions("73.", "Who killed and beheaded emperor Gelawdeos in 1559? ", 0, 0, 0, 0, 0, "The Adali army of Emir Nur Mujahid", "His own son who wanted to take over power.", "The vectors army of Gragn Ahemed. ", "The Turkish army that came to assist Gragn ", "Emperor Gelwdowos was killed and beheaded in 1559 by his own son who want to take the power.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("74.", "Which of the following factors promoted the mutual interdependency between the Harar and the surrounding Oromo during the 19th century? ", 0, 0, 0, 0, 0, "Joint resistance that they put up against the expanding army of Emperor Menilik. ", "The wall built surrounding the city of Harar that served as a common", "The common bond built around trading interaction with affinity to the defense. religion of Islam", "The rail way that brought about mutual economic benefit for the two groups", "The common factor that promoted the mutual interdependence between the Harar and the sounding Oromo during the 19th century was the common bond built around trade interactions with affinity and religion of Islam.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("75.", "The peak time of the Atlantic Slave trade, during which the largest number of Africans were exported to the \"New world”, was", 0, 0, 0, 0, 0, "The 19th century ", "The 20th century", "The 17th century", "The 18th century", "the peak time of Atlantic Salve Trade during which the largest number of Africans were exported to the New World was in the 17th century. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("76.", "The main factors that facilitated Italian Unification was", 0, 0, 0, 0, 0, "the development of Italian national filling", "the presence of French garrison. ", "the positive role played by the catholic pope", "the harsh dominated by the Australian state", "The main factor that facilitated the unification of Italian in 1870s the decollement Italian national feeling", "a", 0, 1, this.f592b));
        arrayList.add(new questions("77.", "Which one of the following was true about the American Civil", 0, 0, 0, 0, 0, "It stimulated liberation movement in Latin America.", "It contributed to the outbreak of a revolution in France. ", "It eradicated racial discrimination in the US.", "It resulted in abolishing slavery in the US.", "Consequence of the American Civil War includes:\n\tHigh military causalities on both sides\n\tAgricultural devastation\n\tPolitically the union was preserved \n\tAssassination of the Abraham Lincoln.\n\tThe unity of America was preserved and paved the way for the rise of the USA as a major global power.\n\tSlavery was abolished.\n", "d", 0, 1, this.f592b));
        arrayList.add(new questions("78.", "Which of the following was the main development that paved the way for German Unification?", 0, 0, 0, 0, 0, "The idea of the Congress of Vienna", "The creation of the German confederation ", "The presence foreign power on German soil", "The economic disparity among German states", "The main development that paved the way for German unification was the creation of German confederation.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("79.", "Which of the following was the main factors for conflict and wars in the Balkan region in the 20th century.", 0, 0, 0, 0, 0, "The emergency of five rival independent Balkan states", "The establishment of Russia control of the Straits of the Black Sea ", "The emergency of an aggressive sense of nationalism", "The deep involvement of Russia in the war of 1912-1913", "Balkan wars of 1912 and 1913 and resulted expulsiton of Turkey from Balkan peninsula and the emergence of an aggressive sense of nationalism in the region.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("80.", "Which one of the following events lead to colonel rivalry in Africa.", 0, 0, 0, 0, 0, "The occupation of Egypt by British colonial power in 1882", "The involvement of Spain and Dutch in the colonization of Africa", "The establishment of advanced market centers in Africa", "The establishment of large plantation agriculture in Africa", "The British occupation of Egypt France could not participate in June1882 Britain and he involvement of Germany and Belgium in colonization Germany involved in rivalry between France and Britain", "a", 0, 1, this.f592b));
        arrayList.add(new questions("81.", "What was the term garad in the medieval Muslim Sultanate of Hadiya? it was the title of", 0, 0, 0, 0, 0, "the tax collectors ", "the rulers of the state", "the military generals.", "the provincial governors", "the term garad in medieval Muslim sultanate of Hadiya was the ruler of state.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("82.", "How did Ras Tefrei get over the threat of Dej Balcha Safo during the period of Diarchy? He got over him after Balcha ", 0, 0, 0, 0, 0, "was received prison treatment from treason.", "retreated to the lack Tana.", "ultimately surrendered to Teferi. ", "finally died a natural death", "in 1927 Ras Teferi got over the threat of Dejach Balcja Safo unconditional surrender rise Ras Teferi to power ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("83.", "As Ifat was to the walasma, the Sultanate of Shoa was to the", 0, 0, 0, 0, 0, "Mtolomies ", "Makhzumites ", "Mukaribs ", "Karidjites ", "the sultanate of Ifat founded by the Walasma dynasty while the sultanate of Shewa established by Makzumite dynasty.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("84.", "It was a rule that the king of the medieval Kingdom of kafa should belong to the clan called ", 0, 0, 0, 0, 0, "Minjo", "Mwa", "Mikrecho", "Tato", "kaffa got its prominence in the seventeenth century under a clan based ruling family known as the Minjo dynasty. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("85.", "Which of the following if correct about the region king Motalamy in Medieval Damot?", 0, 0, 0, 0, 0, "Damot lost its independent existence. ", "Damot for the first-time conquered Aksum.", "Damot reached the height of its power. ", "Damot was invaded by the zagew army. ", "Kingdom of Damot was the earliest state emerged as early as the aksumite period. It reached the highest stage during its well-known ruler was called Motolomi.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("86.", "Who were founder of the kingdom of Mali?", 0, 0, 0, 0, 0, "The Almoravids ", "The Madinka", "The Soninke ", "The Bakongo", "With to decline of Ghana the kingdom of Mali emerged in the 13th century with its capital Jenne. It founded by malinka or Mandika people.", "b", 0, 1, this.f592b));
        arrayList.add(new questions("87.", "Which of the following took place during the 3rd phase of the Atlantic Slave Trades?", 0, 0, 0, 0, 0, "Slave merchants and companies made enormous profit ", "Expansion of slave- hunting ground all over the continent.", "Visible dominance of monopolistic slave trading companies ", "Fierce competition between individual trades and companies", "The 3rd phase of salve trade it was known as free trade it began in the 1690. Several individual trades joined the slave trade. There was fierce competition between the individual traders and formers companies.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("88.", "Which one of the following best describes the main future of Trans-Atlantic Slave trades?", 0, 0, 0, 0, 0, "Captured Slaves were crammed on airplane and transported to the America", "Enslaved Africans peacefully labored on large scale plantation in the America.", "Europeans exchanged guns and other good with Africans for slaves. ", "American agricultural products and rum were shipped to Africa in exchange for iron. ", "During the Trans-Atlantic Slave Trade European exchanged guns and other goods with African for slave. Then the African slaves were taken across the Atlantic to the America. There slaves were sold to the plantation owners in exchange for sugar, tobacco and other finally these goods were taken back to Europe and sold at high prices.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("89.", "The second phase of the Trans-Atlantic slave trade come to be known as the Triangular trade, because it", 0, 0, 0, 0, 0, "was dominated by three trading companies.", "was commonly known as the robbing slave trade.", "linked Europe, Africa and Asia.", "connected Europe, Africa and America. ", "The 2nd phase of salve trade was known as the monopolistic slave trade Began in 1580s. Trade conducted by monopolistic slave trading companies. Supported by their government or by armed forces. The volume of trade increased and companies collected huge profits. The second phase also known as the Triangular Trade because the trade connected three contents (Europe, African, and America).", "d", 0, 1, this.f592b));
        arrayList.add(new questions("90.", "Why did Europeans come to Africa in large number in the first half of 19th century? They came to", 0, 0, 0, 0, 0, "collect finished African goods for market in Europe. ", "spread fruits of European civilization in Africa.", "find market for European industrial goods ion Africa. ", "introduce new technologies to different part of Africa. ", "Europeans come to Africa in a large number in the first half of the 19th century because to find market for Europeans industrial goods in Africa. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("91.", "In the Nazi-Soviet pact of 1939.Hilter and Stalin agreed to partition", 0, 0, 0, 0, 0, "Hungary", "Estonia ", "Poland", "Finland", "In August 1939, Germany and USSR signed the Nazi- Soviet Non- Aggression pact. Finally, Germany invaded Poland on September 1939. ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("92.", "Before Hitter came to power, the Nazi party futures polices for outlined the book called", 0, 0, 0, 0, 0, "Mein kampf ", "Reichstag", "Social contract", "Capital", "Before Hitler came to power the Nazi party future polices were outlined on the book called Mein kampf. Mein Kampf, (German \"My struggle\") political manifesto written by Adolf Hitler. It was his only complete book, and the work became the bible of National Socialism (Nazism) in Germany's, Third Reich.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("93.", "The formation of the United Nation Organization took its final shape at a conference held at ", 0, 0, 0, 0, 0, "Dumbarton ", "Tehran", "Yalata", "san Francisco", "In June 1945 at San Francisco representatives of 50 Nation as approved the charter of the UNO and formally setup on April 1945.", "d", 0, 1, this.f592b));
        arrayList.add(new questions("94.", "Among the existing agencies of United Nation Organization, the body that took over the function of the League's Mandates commotion was", 0, 0, 0, 0, 0, "the Security Council", "the economic and social council", "the Trusteeship Council", "the International Court of justice ", "The security council of Un agency is taking over the functions of LNs commission. ", "a", 0, 1, this.f592b));
        arrayList.add(new questions("95.", "which one of the following factors contributed for the Italian invention of Ethiopia in 1935? ", 0, 0, 0, 0, 0, "Italy alliance with Germany", "Ethiopian aggression at WalWal ", "The formation of the Young Italy party", "Italian defect at the Battle of Adwa ", "The battle of Adwa was the main factor that contributed for the Italian", "d", 0, 1, this.f592b));
        arrayList.add(new questions("96.", "Which one of the following was an African welfare association that opposed colonial rule.", 0, 0, 0, 0, 0, "The Bataka ", "The Wafdet", "African National Congress ", "The Neo-Destour", "invasion of Ethiopian in 1935 to avenge the defeat of Adwa in 1896. The Bataka Associaiton was one of African welfare association opposed colonial rule in Uganda.", "a", 0, 1, this.f592b));
        arrayList.add(new questions("97.", "Which one of the following events participated a power struggle in Ethiopia?", 0, 0, 0, 0, 0, "The designation of Ras Mekonnen as heir ", "The designation of princes Zweditu as heir", "The death of ras Mekonnen", "The antagonism of Mechal sefari", "The power struggle precipitated in Ethiopia by the beginning of 20th century ", "c", 0, 1, this.f592b));
        arrayList.add(new questions("98.", "Which one of the following posed a major international change to Lej Iyasu? ", 0, 0, 0, 0, 0, "The Tripartite powers", "The Mehal Sefari", "Negadras Haile Giorgis", "Negus Mikael", "The major internal challenge to Liji lyasu was came from Shewan Nobilities by the death of Ras Mokennen who appointed as the regent of Ligi lyasu by emperor Minilik II.", "c", 0, 1, this.f592b));
        arrayList.add(new questions("99.", "Which of the following was true about the Diarchy rule in Ethiopia?", 0, 0, 0, 0, 0, "The state was ruled unusually by three or more people", "The enlightened and educated class supported Zewditu. ", "The power is exercised solely by Zewditu and Teferi", "The political power was exercised by\" enlightened\" feudalists ", "The term diarchy in Ethiopian politics refers to the period of dual rule was led by Negadras Hailegorgis. between 1917 and 1930. Two centers of power existed during this period Zewditu and Teferi worked together. The supporters of Zewditu were the conservative Shoan nobility and bishop also known as the traditionalists (the conservatives). The supporter of Ras Teferi was known as the", "b", 0, 1, this.f592b));
        arrayList.add(new questions("100.", "Where did German and Italian fascists found an ally and collaborator when they set out to conquer the world during the second World War.", 0, 0, 0, 0, 0, "In militaries Japan", "In Nationalist Turks. ", "In Kuomintang China", "In Bolshevik Russia", "During the second world war (WWII) the Nazi German and the Fascist Italy progressive included young educated. Commercial state and some elites. found an ally and collaborator in militarist Japan.", "a", 0, 1, this.f592b));
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
        this.f593tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    history2012.this.timer.setVisibility(0);
                    history2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    history2012.this.scr.setVisibility(8);
                    history2012.this.chr.stop();
                    history2012.this.toolbar.setVisibility(8);
                    history2012.this.Relative.setBackgroundColor(-7829368);
                    history2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2012.this.getBaseContext());
                    int unused = history2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = history2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = history2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = history2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = history2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = history2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = history2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = history2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = history2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = history2012.this.highscoreHistory2012 = defaultSharedPreferences.getInt("hist2012hs", 0);
                    int access$600 = history2012.this.part1 + history2012.this.part2 + history2012.this.part3 + history2012.this.part4 + history2012.this.part5 + history2012.this.part6 + history2012.this.part7 + history2012.this.part8 + history2012.this.part9;
                    history2012.this.resultText.setText(String.valueOf(access$600));
                    history2012.this.progressbar.setProgress(access$600);
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
                    int unused11 = history2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = history2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = history2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = history2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = history2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = history2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = history2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = history2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "hist2012hs";
                    int unused19 = history2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = history2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = history2012.this.answered1 + history2012.this.answered2 + history2012.this.answered3 + history2012.this.answered4 + history2012.this.answered5 + history2012.this.answered6 + history2012.this.answered7 + history2012.this.answered8 + history2012.this.answered9 + history2012.this.answered10;
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
                    if (access$600 > history2012.this.highscoreHistory2012) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - history2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1hist121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1hist122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1hist123", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1hist124", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1hist125", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1hist126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1hist127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1hist128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1hist129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1hist1210", 0);
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
                        editor.putString("scorehist121", str3);
                        editor.putLong("date1hist121", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorehist122", str5);
                            editor.putLong("date1hist122", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorehist123", str5);
                            editor.putLong("date1hist123", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorehist124", str5);
                            editor.putLong("date1hist124", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorehist125", str5);
                            editor.putLong("date1hist125", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorehist126", str5);
                            editor.putLong("date1hist126", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorehist127", str5);
                            editor.putLong("date1hist127", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorehist128", str5);
                            editor.putLong("date1hist128", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorehist129", str5);
                            editor.putLong("date1hist129", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorehist1210", str5);
                            editor.putLong("date1hist1210", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datehist121", 0);
                    long j12 = defaultSharedPreferences.getLong("datehist122", 0);
                    long j13 = defaultSharedPreferences.getLong("datehist123", 0);
                    long j14 = defaultSharedPreferences.getLong("datehist124", 0);
                    long j15 = defaultSharedPreferences.getLong("datehist125", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datehist126", 0);
                    long j17 = defaultSharedPreferences.getLong("datehist127", 0);
                    long j18 = defaultSharedPreferences.getLong("datehist128", 0);
                    long j19 = defaultSharedPreferences.getLong("datehist129", 0);
                    long j20 = defaultSharedPreferences.getLong("datehist1210", 0);
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
                        editor2.putString("iScorehist121", str4);
                        editor2.putLong("datehist121", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorehist122", str6);
                            editor2.putLong("datehist122", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorehist123", str6);
                            editor2.putLong("datehist123", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorehist124", str6);
                            editor2.putLong("datehist124", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorehist125", str6);
                            editor2.putLong("datehist125", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorehist126", str6);
                            editor2.putLong("datehist126", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorehist127", str6);
                            editor2.putLong("datehist127", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorehist128", str6);
                            editor2.putLong("datehist128", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorehist129", str6);
                            editor2.putLong("datehist129", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorehist1210", str6);
                            editor2.putLong("datehist1210", l.longValue());
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
                        history2012.this.scr.setVisibility(8);
                        history2012.this.chr.stop();
                        history2012.this.toolbar.setVisibility(8);
                        history2012.this.Relative.setBackgroundColor(-7829368);
                        history2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2012.this.getBaseContext());
                        int unused = history2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = history2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = history2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = history2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = history2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = history2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = history2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = history2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = history2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = history2012.this.highscoreHistory2012 = defaultSharedPreferences.getInt("hist2012hs", 0);
                        int access$600 = history2012.this.part1 + history2012.this.part2 + history2012.this.part3 + history2012.this.part4 + history2012.this.part5 + history2012.this.part6 + history2012.this.part7 + history2012.this.part8 + history2012.this.part9;
                        TextView access$1600 = history2012.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        history2012.this.progressbar.setProgress(access$600);
                        history2012.this.progressbar.setMax(100);
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
                        int unused11 = history2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = history2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = history2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = history2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = history2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = history2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = history2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = history2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = history2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = history2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = history2012.this.answered1 + history2012.this.answered2 + history2012.this.answered3 + history2012.this.answered4 + history2012.this.answered5 + history2012.this.answered6 + history2012.this.answered7 + history2012.this.answered8 + history2012.this.answered9 + history2012.this.answered10;
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
                        if (access$600 > history2012.this.highscoreHistory2012) {
                            edit.putInt("hist2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - history2012.this.chr.getBase()) / 1000;
                        String str = "datehist129";
                        String str2 = "datehist128";
                        String str3 = "datehist127";
                        String str4 = "datehist126";
                        String str5 = "datehist125";
                        String str6 = "datehist124";
                        String str7 = "datehist123";
                        String str8 = "datehist122";
                        String str9 = "datehist121";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1hist1210";
                        String str11 = "date1hist129";
                        if (history2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1hist121", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1hist122", 0);
                            long j3 = defaultSharedPreferences.getLong("date1hist123", 0);
                            String str13 = "date1hist123";
                            String str14 = f;
                            String str15 = "date1hist121";
                            long j4 = defaultSharedPreferences.getLong("date1hist125", 0);
                            String str16 = "date1hist125";
                            String str17 = "date1hist124";
                            String str18 = "date1hist126";
                            long j5 = defaultSharedPreferences.getLong("date1hist126", 0);
                            long j6 = defaultSharedPreferences.getLong("date1hist127", 0);
                            String str19 = str11;
                            String str20 = "date1hist128";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1hist122";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1hist124", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1hist127";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1hist128", 0));
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
                                editor3.putString("scorehist121", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorehist122", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorehist123", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorehist124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorehist125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorehist126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorehist127", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorehist128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorehist129", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorehist1210", str25);
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
                            long j18 = sharedPreferences.getLong("datehist1210", 0);
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
                                editor4.putString("iScorehist121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorehist122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorehist123", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorehist124", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorehist125", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorehist126", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorehist127", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorehist128", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorehist129", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorehist1210", str28);
                                    editor4.putLong("datehist1210", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1hist121";
                            String str30 = "date1hist124";
                            String str31 = str11;
                            String str32 = "date1hist122";
                            String str33 = "date1hist127";
                            String str34 = "date1hist125";
                            String str35 = "date1hist126";
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
                            long j21 = sharedPreferences2.getLong("date1hist123", 0);
                            String str40 = str32;
                            String str41 = "date1hist123";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1hist128";
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
                                editor2.putString("scorehist121", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorehist122", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorehist123", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorehist124", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorehist125", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorehist126", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorehist127", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorehist128", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorehist129", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorehist1210", str49);
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
                            long j38 = sharedPreferences3.getLong("datehist1210", 0);
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
                                editor.putString("iScorehist121", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorehist122", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorehist123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorehist124", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorehist125", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorehist126", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorehist127", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorehist128", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorehist129", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorehist1210", str56);
                                    editor.putLong("datehist1210", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        history2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2012.this.scr.setVisibility(8);
                history2012.this.chr.stop();
                history2012.this.toolbar.setVisibility(8);
                history2012.this.Relative.setBackgroundColor(history2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                history2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2012.this.scr.setVisibility(0);
                history2012.this.toolbar.setVisibility(0);
                history2012.this.telegram_layout.setVisibility(8);
                history2012.this.chr.start();
                history2012.this.Relative.setBackgroundColor(history2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = history2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = history2012.this.mInterstitialAd = null;
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
                history2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
