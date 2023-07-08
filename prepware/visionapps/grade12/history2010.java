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

public class history2010 extends AppCompatActivity {
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
    private Boolean f588b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreHistory2010;
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
    private Toolbar f589tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_history2010);
        this.f588b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextHistory2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_history2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "what was the \"Mandate of Heaven\" in Chinese history?", 0, 0, 0, 0, 0, "Trust in the just nature of administration by Confucian bureaucrats.", "Belief that China should be ruled only by the Han.", "Belief that it is only Kings who had the support of the gods that ruled.", "A classical masterpiece of Chinese literature.", "The Ancient Chinese created the ideas of the Mandate of Heaven that there could be only one legitimate ruler of China at a time, and that this ruler had the blessing of the gods. They used this Mandate to just' their overthrow of the Shang, and their subsequent rule.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("2.", "An objective proof that the Congress of Vienna was an achievement for global peace was that it", 0, 0, 0, 0, 0, "Helped to get rid of Napoleon Bonaparte, an invader and enemy of peace.", "Restored all peace-loving monarchs of Europe back on their thrones.", "Settled for a Dutch republic under the United Kingdom of the Netherlands.", "Helped the continent of Europe to avoid a major war for the coming 100 years.", "The objective of the Congress of Vienna was to provide a long-term peace plan for Europe by settling critical issues arising from the French Revolutionary Wars and the Napoleonic Wars. The goal was not simple to restore old boundaries but to resize the main powers so they could balance each other and remain at peace.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("3.", "There was the official declaration about the establishment of the United German Empire made?", 0, 0, 0, 0, 0, "The French palace at Versailles. ", "A medieval castle in Prussia.", "A palace near the Brandenburg gate. ", "The historic Church of Wittenberg.", "The unification of Germany into a politically and administrative integrated nation state officially occurred on 18 January 1871, in the Hall of Mirrors at the Palace in French palace at Versailles.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("4.", "what was the impact' of the story of the \"Prester John of the Indies” on Ethiop's foreign relations of the 15th century?", 0, 0, 0, 0, 0, "It attracted the Portuguese to establish closer relations with Ethiopia. ", "It attracted the Turks to establish closer relation with Ethiopia. ", "It increased Turkish hatred and animosity towards Ethiopia.", "It shaped the religious policy of the Portuguese towards Ethiopia.", "The history of the Prester Jhon of Indies on the Ethiopian foreign relation of the 15th century was that it attracted Portuguese to establish closer relations with Ethiopia.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("5.", "Sub-field of history is the most studied in Ethiopian historiography?", 0, 0, 0, 0, 0, "Environmental history", "Economic history", "Social history", "Political history", "Political history is the narrative and analysis of political events, id movements,   organs of government, voters, parties and leaders. It interrelated to other fields of history, especially diplomatic history, well as constitutional history and public history.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("6.", "which text inspired Kassa Haylu to take the throne name of Tewodros?", 0, 0, 0, 0, 0, "Fikare lyesus.", "The Confessions of Gelawedewos.", "Mesehafe Henok.", "The Glorious Victories of Amde Siyon.", "The Fikare Iyasu inspired Kassa Hailu to take the throne name Tewodros ll.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("7.", "Napoleon Bonaparte's \"Continental System\" was aimed at", 0, 0, 0, 0, 0, "Forming a common front with allies such as Russia and Prussia. ", "Spreading the ideas of equality and the rule of law in Europe.", "Breaking British resistance against Napoleonic Empire.", "Promoting the ideas of free trade throughout Europe & North America.", "Continental System, in the Napoleonic wars, the blockade designed by Napoleon to paralyze Great Britain through the destruction of British commerce.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("8.", "which one of the following countries was a leading slave trading nation in the 18th century, but took the early initiative in the abolitionist movement of the 19th century?", 0, 0, 0, 0, 0, "Portugal ", "Great Britain", "The Netherlands", "Spain", "The trade. All the major European powers were involved in enterprise, but by the early 18th century, Britain became the world leading slave trading power. It's estimated that British ships w responsible for the forced transportation of at least 2-3 million African in that century.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("9.", "why did the Italians invest heavily in road building during their Occupation of Ethiopia? Because they wanted to", 0, 0, 0, 0, 0, "Improve the living standards of the people.", "Encourage the flow of tourists.", "Encourage rural urban migration", "Facilitate the movement of troops.", "The Italian invested heavily in road construction during their occupation of Ethiopia to facilitate the movement of their troops.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("10.", "what was the most important transformation mankind achieved during the Neolithic Revolution?", 0, 0, 0, 0, 0, "The beginning of producing cloths.", "The beginning of food production.", "The use of stone tools for the first time.", "The introduction of iron works.", "Neolithic Period, also called New Stone Age, final stage of cultural evolution or technological development and domestication of p animals leads to food production.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("11.", "who were the people involved in the making of the famous mortar Sevastopol?", 0, 0, 0, 0, 0, "They were all professional craftsmen who came from Europe. ", "All of them were local craftsmen paid by Emperor Tewodros.", "They were artisans formerly involved in the construction of the Suez Canal", "Some of them were missionaries who originally came to teach the Gospel.", "European missionaries who originally came to teach the Gospel were the peoples forced by Emperor Tewodros to involve in making of famous mortar called Sevastopol at Gafat, Sothern Gonder.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("12.", "who were the Huguenots?", 0, 0, 0, 0, 0, "British Catholics\t", "French Protestants\t", "Swiss Presbyterians", "Scottish Presbyterians", "Huguenots were an ethno-religious group of French Protestants who follow the reformed. The Huguenots against Catholics was later in 29 September 1567", "b", 0, 1, this.f588b));
        arrayList.add(new questions("13.", "How did the increasing use of the clock symbolize the emergence of capitalistic culture in the High Middle Ages?", 0, 0, 0, 0, 0, "By showing that people had developed a taste for luxury items like clocks.", "By suggesting that technology has reached high degree of efficiency.", "By indicating the growing importance of the idea of a rational use of time.", "By showing that- people had accumulated money to buy high value goods.", "The increasing use of the clock symbolize the emergence of capitalist culture in the high Middle Age by indicating the growing importance of the rational use of time.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("14.", "Under which of the following leaders did the Sultanate of Adal start a military campaign against the Christian Kingdom at the end of the 15th century?", 0, 0, 0, 0, 0, "Ahmed ibn Ibrahim", "Nur ibn Ibrahim", "Mahfuz", "Muhammad ibn Badley", "Under the leadership of Muhammed Ibn Badley the sultanate of Adal started military camping against the Christian highland kingdom of Ethiopian in the end of the 15th century.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("15.", "why do linguists engage in classifying and reclassifying languages?", 0, 0, 0, 0, 0, "To show both differences and commonalities between languages ", "To show differences between languages.", "To demonstrate that languages know no boundaries.", "To prove that some languages are more developed than others 16, The First fascist leader to come to power in the period between the two world wars was", "Languages are classified into language families on the basis of a common origin. What is meant by ''common origin\" is called genetic classification", "b", 0, 1, this.f588b));
        arrayList.add(new questions("16.", "The first fascist leader to come to power in the period between the two world wars was", 0, 0, 0, 0, 0, "Adolf Hitler of Germany", "General Franco of Spain", "Benito Mussolini of Italy ", "The Militarists of Japan", "Italy (1922—1943) the first fascist country, Italy, was ruled by Benito Mussolini (Il Duce) until he was dismissed and arrested on 25 July 1943. ", "c", 0, 1, this.f588b));
        arrayList.add(new questions("17.", "what was the role of the Ras-Bitweded during the Zemene Mesafint? ", 0, 0, 0, 0, 0, "Advising and influencing the kings.", "Ensuring proper tax collection.", "Commanding the armies of the kings. ", "Ensuring law and order.", "The roles of Ras Bitweded during the Zemene Mesafint was advising and influencing the kings.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("18.", "which of the following ministries proved to be the most influential and powerful in the early years of post-liberation Ethiopia?", 0, 0, 0, 0, 0, "The Ministry of War\t", "The Ministry of Finance", "The Ministry of Pen", "The Ministry of Education ", "Until the end of the Ethiopian monarchy in 1974, Minister of the Pen\") was the most powerful post at the Imperial court.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("19.", "who was the local ruler whom Tewodros defeated just before he was crowned Emperor in 1855?", 0, 0, 0, 0, 0, "Wube of Semen and Tigray", "Haile Melekot of Shoa", "Ali of Begemidir", "Goshu of Goiiam", "In February 1855 Kassa Hailu defeated Dejazmach Wube of Semen and Tigray at the battle of Dressage and he crowned himself by the name of Tewodros Il.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("20.", "what distinguishes Homo erectus from Homo habilis is that the former ", 0, 0, 0, 0, 0, "Lived only in Africa while the latter emerged in Europe. ", "Walked upright while the latter did not.", "Used stone tools while the latter utilized bronze tools.", "Had a brain size smaller than the latter.", "Homo erectus is upright walking man and appeared by about I million years ago.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("21.", "why was the Soviet government under Stalin very unpopular with Russian peasantry? ", 0, 0, 0, 0, 0, "Because Stalin was not Russian.", "Because the regime imposed a policy of agricultural collectivization ", "Because the endless wars meant forced of peasants for the military.", "Because the regime failed to provide relief for hungry peasants.", "Under Soviet rule, the Russia peasants under Stalin unpopular because the regime imposed policy of agricultural collectivism.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("22.", "which of the following Omotic states were ruled by kings who were referred as Tato?", 0, 0, 0, 0, 0, "Welayita and Kaffa", "Kambata and Sheka", "Hadiya and Kaffa", "Kaffa and Sheka", "The royal title of the kingdom of Kaffa and Sheka was called Tato.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("23.", "which one of the following ideas has come to be shared by Sunnis and Shiites?", 0, 0, 0, 0, 0, "Belief in the future coming of a Mahdi.", "Belief in the need tolerate different versions of Islam.", "Belief that leadership of the Caliphate should be elective.", "Belief in the mediation role of holy men and women.", "Shared beliefs. Both Sunnis and Shias venerate the Koran as their shared sacred scripture. They believe it to be the literal word of God as revealed to the Prophet Muhammad.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("24.", "How did the Ottoman Turks involve in Ethiopian politics in the late century?", 0, 0, 0, 0, 0, "By supporting the rebellion of local notables like Bahir Negash Yishaq. ", "By hindering the import of firearms to the kings of the Christian kingdom", "By their alliance with the rebellious Falasha people.", "By preventing the emperors from corresponding with Europe.", "The Ottoman Turkey involve in the Ethiopian politics in the late 15th century by hindering the import of fire arms to the Christian highland kingdom", "b", 0, 1, this.f588b));
        arrayList.add(new questions("25.", "which one of the following was not a consequence of the Oromo Population movement?", 0, 0, 0, 0, 0, "Intensification of cultural exchange between Oromo- and other populations of the region.", "The democratization of the Gada system through borrowings from Islam and other local religions.", "The transformation of the Oromo groups from pastoralists into Sedentary agriculturalists.", "The assimilation and loss of ethnic identity of many ethnic groups in the region.", "Consequences of the Oromo Movement include Oromo occupied and settled on lands as far north as southern Tigray, southeastern Gondar and arts Of Gojjam. They gave Oromo names to most of the new places they occupied. Outside Ethiopia, the Oromo settled in Somalia, and in Kenya. Ethnic and cultural inter—mixing took place between the Oromo and other peoples of the region. The Christian kingdom was greatly disturbed by the Oromo population movement. The territorial and financial strengths of the kingdom were highly weakened.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("26.", "which one of the following was a consequence of the Trans-Atlantic Slave trade?", 0, 0, 0, 0, 0, "The shift of the regional balance of power from West to South Africa.", "The intensification of conflict and among African rulers.", "The growth of a manufacturing economy along the coastal parts of West Africa.", "The large scale conversion of Africans in to Islam.", "One of the consequences of Trans-Atlantic Slave Trade had on West Africa was a decrease in their population. Statistics, gathered from Western Civilization and intensification of conflict and warfare in among African rulers.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("27.", "The residents of Paris attacked the Bastille July 1789 because", 0, 0, 0, 0, 0, "It contained a large number of prisoners who were arrested without cause", "They believed that it was being used as a base to launch attacks against the common people.", "It symbolized the oppressive and unjust features of the ancient regime.", "They received information that it contained flour for making bread.", "The Storming of the Bastille took place in Paris, France on July 14 1789. This violent attack on the government by the people of France symbolized the start of the French Revolution. The Bastille was a fortress built in the late 1300s to protect Paris during the Hundred Years' War.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("28.", "what was the major factor for the decline of the Kingdom of Mali? ", 0, 0, 0, 0, 0, "The failure to govern the outlying provinces in an effective way. ", "Power struggle between the descendants of Sundiata & Sumanguru.", "The decline of productivity following the expansion of the Sahara.", "Financial bankruptcy because of Mansa Musa's wasteful pilgrimage to Mecca.", "After the death of the amazing military and political leader Mansa Musa, his descendants argued over who would be the next ruler or Power struggle between descendent. This caused the empire to weaken greatly. ", "b", 0, 1, this.f588b));
        arrayList.add(new questions("29.", "How did the Aksumite civilization emerge?", 0, 0, 0, 0, 0, "As a result of the migration of the Habeshan from South Arabia.", "As a consequence of the borrowing of institutions from Yemen.", "As a reaction to the development of a strong Sabean kingdom in Arabia ", "From transformation of indigenous northern Ethiopian Society.", "The Aksumite civilization emerged from the transformation of indigenous northern Ethiopian society.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("30.", "How was the Portuguese colonial empire different from its Spanish counterpart?", 0, 0, 0, 0, 0, "The former crated slave plantation in their colonies while the latter did not.", "The former was largely a trading empire while the latter was a land empire.", "The former colonized Asian territory while the latter focused on Africa and Americas.", "The former raised sugarcane in their colonies while the latter focused on tobacco.", "Portugal was one of the, if not the only, technological and economic geniuses of the fifteenth century. As a result of their genius, Portugal was able to build one of the first caravels and sail around the coast of Africa in an attempt to find a sea route to India.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("31.", "which one of the following facilitated the emergence of a state among the Gibe Oromo?", 0, 0, 0, 0, 0, "The threat of conquest by the expanding Christian state.", "The diffusion of ideas about kingship from the Christian kingdom", "The migration and settlement of Sudanese Muslim clerics", "The frequent wars and power struggle among different Abba Dulas.", "The Gibe Oromo states emerged as the result of the frequent wars and powers struggle among different war leaders/ Abba Dulas", "d", 0, 1, this.f588b));
        arrayList.add(new questions("32.", "Imam Ahmed's policy towards the Christian kingdom was different from his predecessors because ", 0, 0, 0, 0, 0, "He a navy that limited Christian contact with Portugal before launching his attacks.", "He succeeded in establishing an alliance with Yemen before launching his attacks.", "Rather than limit himself to frontier raids he aimed to conquer the Christian state.", "He gained the support of the Muslims within the Christian kingdom before the beginning of his attacks.", "Following Mahafuz's death his son in — law called Ahmed Ibn Ibrahim al. Ghazi (Ahmed Gragn) the husband of Bati Dilwobera led a fresh offensives against the Christians and He was supported by the Arabs and Turks. He killed Christians and burnt churches from 1527 — 1543).", "b", 0, 1, this.f588b));
        arrayList.add(new questions("33.", "which one of the following was an argument made by Karl Marx?", 0, 0, 0, 0, 0, "Poor people are poor because they are not hard working.", "The condition of the working classes could only be improved through cooperatives", "The establishment of a class-less society is a utopian ideal.", "Class struggle is the fundamental cause of political and social change.", "Karl Marx was a German philosopher, economist, historian, political theorist, and sociologist. Marx actively pressed for its implementation, arguing that the working class should carry theory that he was espousing—scientific socialism—needed to be built on the base of a thoroughly developed materialistic view of the world.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("34.", "which one of the following was a consequence of \"The Great Leap Forward\" China?", 0, 0, 0, 0, 0, "The transformation of China from a liberal to a communist state.", "The weakening of Mo's personality cult.", "The outbreak of terrible famine cross China ", "The development of a conflict between the China and the USSR", "The Great Leap forward was an effort made by the Communist Party of China (CPC) under the leadership of Mao Zedong, also known as Mao Tse-tung, to transform China into a society capable of competing with other Western industrialized nations, within a short time period.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("35.", "what was it that attracted most North Africans to the Kharijites doctrine of Islam starting from the 7th century?", 0, 0, 0, 0, 0, "The principle of an elected Imam for the Muslim empire.", "The principle of rule by consensus.", "The principle that the Imamate should be ruled by descendants of the prophet", "The issue that the center of the Caliphate should no longer be Arabia. ", "Though he Kharijites formed a more puritanical and democratic sect they were not supported by majority of Muslims because of their intolerance toward other Muslims", "c", 0, 1, this.f588b));
        arrayList.add(new questions("36.", "what strategy did the Germans use in defeating the Polish anny in 1939?", 0, 0, 0, 0, 0, "Coordinated attack by sea and air.", "A coordinated rapid attack by ground and air forces. ", "An internal uprising by German patriots and air strikes.", "A surprise attack through the Baltic countries.", "The word, meaning \"lightning war\" or \"lightning attack\" in its strategic sense describes a series of quick and decisive short battles to deliver a knockout blow to an enemy state before it could fully mobilize.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("37.", "which one of the following is correct about Angola's national liberation?", 0, 0, 0, 0, 0, "It primarily secured independence through peaceful methods. ", "It was led by rival Marxist organizations operating in the country. ", "It succeeded in negotiating a smooth transfer of power.", "It was organized by mutineers from the Portuguese army.", "The National Front for the Liberation of Angola is a political party and former militant organization that fought for Angolan independence from Portugal in the war", "d", 0, 1, this.f588b));
        arrayList.add(new questions("38.", "what was the most serious challenge to caravan traders in 19th century Ethiopia?", 0, 0, 0, 0, 0, "Negotiating physical and environmental risks along the routes. ", "The absence of hospitable hotels along the trade routes.", "Transporting the heavy Maria Theresa thaler from one market to another.", "Learning local languages to get better deals from their partners.", "The most serious challenges to caravan traders in the 19th century Ethiopia was negotiating physical and environmental risks along the routes.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("39.", "why did Japan decide to go to war during WWII?", 0, 0, 0, 0, 0, "It felt threatened by American expansionism in Asia.", "It planned to stop the expansionism of communists in Asia.", "It was pressured to do so by its treaty of alliance with Germany and Italy.", "It wanted to create a great Japanese empire through war.", "Japan decided to go to war with the United States because: The Japanese believed the United states would never allow Japan to extend its control over the vital areas of Malaysia and the Dutch East Indies.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("40.", "why did the USA give support to France against the Vietnamese in the Indo-China War?", 0, 0, 0, 0, 0, "It believed that rapid independence for Asia was detrimental to its interests.", "It wanted to get a revenge for its defeat in the hands of the nationalists", "It wanted to a member of NATO alliance which was in difficulty.", "It believed that the spread of communism would threaten US interest in the region.", "China's fall to communism and the outbreak of the Korean War helped convince the US to aid France. US was afraid how did American involvement in Vietnam change during the Kennedy and Johnson administrations", "d", 0, 1, this.f588b));
        arrayList.add(new questions("41.", "which one of the following is related to the capitalist principle of", 0, 0, 0, 0, 0, "Private ownership of land", "Labor is a commodity ", "Hoarding money is a wisdom  ", "Special Pan-African capitalists", "Free-market economy. Free-market economy refers to an economic system where prices for goods and services are set freely by the forces of supply and demand and are allowed to reach their point of equilibrium without intervention by government policy.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("42.", "which one of the following is correct about Pan – Africanism?", 0, 0, 0, 0, 0, "It ended with the collapse of Marcus Gravy’s Back to Africa movement", "The original founders of the movement were Marcus Garvey Kwame Nkrumah.", "It failed to achieve anyone of the major ideas articulated by its founders.", "Its ideas were first articulated by members of the African Diasporas in the USA and the Caribbean.", "Historically, Pan-Africanism has often taken the shape of a political or cultural movement. There are many varieties of Pan-Africanism. In its narrowest political manifestation, Pan-Africanists envision a unified African nation where all people of the African diaspora can live.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("43.", "which of the following pairs of languages have the closest affiliation to languages spoken in northern Ethiopia?", 0, 0, 0, 0, 0, "Sotho and Tsonga", "Aryan and Greek", "Shona and Xhosa", "Hebrew and Arabic", "Hebrew, Arabic and Aramaic languages were accepted by Jewish and Islamic scholars since medieval times. Hebrew and Arabic come from a similar background:   both belong to the family of Semitic languages", "d", 0, 1, this.f588b));
        arrayList.add(new questions("44.", "How does the discipline of history help positively influence the future? ", 0, 0, 0, 0, 0, "By providing models from the past that can be copied.", "By enabling us all to be objective.", "By enabling us learn from the past and avoid repeating mistakes. ", "By teaching us about our past glories and making us proud", "As a discipline, history is the study of the past. In other words, historians study and interpret the past by enabling us to form the past and avoid repeating mistakes.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("45.", "what was the practice in the Catholic Church known as \"indulgence\" which Martin Luther harshly criticized?", 0, 0, 0, 0, 0, "Excommunication of those who believed in salvation through deeds.", "Giving priority to members of the church Leadership in buying land rights.", "Collecting payment from believers who seek to be pardoned for their sins.", "Giving permission for monastic life only to believers who can afford to pay.", "The Catechism of the Catholic. Church describes an indulgence as \"a remission before God of the temporal punishment due to sins whose guilt has already been forgiven, which the faithful Christian who is duly disposed gains under certain prescribed conditions through the action of the Church.  ", "c", 0, 1, this.f588b));
        arrayList.add(new questions("46.", "The body of the United Nations authorized to take military action against an aggressor is", 0, 0, 0, 0, 0, "The General Assembly", "International Court of Justice", "The Security Council", "The Mandate Commission", "Functions and Powers. Under the United Nations Charter, the functions and powers of the Security Council are: to maintain international peace and security.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("47.", "The Treaty of Versailles, signed at the end of WWI, was believed to have planted the seeds of another war, because it", 0, 0, 0, 0, 0, "Visibly failed to address the root causes of the First World War despite the destruction it caused.", "Recognized the sovereignty and territorial integrity Of Germany which refused to pay the cost of the war.", "Dismembered the former Austro-Hungarian Empire into competing", "Treated 'the defeated powers harshly to a degree that made them anticipate revenge", "The Treaty of Versailles was a peace treaty officially signed in the ear of 1919, as an end to the First World War. It believe that the harsh les of the treaty planted the seeds of World War 11, as the German citizens were angry and wanted to seek revenge upon the other nations or what they had done to their country.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("48.", "what made the so called the \"Eastern Question\" very critical at the end of the First World War?", 0, 0, 0, 0, 0, "The conflicting interests of European powers over ottoman territories in Balkan Peninsula", "The need to address the injustice that ethnic minorities in the Balkans suffered in the past.", "The revival of Ottoman Turkey with an ever increasing interest to restore its hegemony in the Balkans.", "The civil war among the several nationalities of the Peninsula following the breakdown of the Ottoman Empire.", "diplomatic history, the \"Eastern Question\" refers to the strategic competition and political considerations of the European Great Powers In light of the political and economic instability in the Ottoman Empire the late 18th to early 20th centuries.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("49.", "where was the ancient kingdom of Ghana located geographically?", 0, 0, 0, 0, 0, "At the Present site of the modern state of Ghana.", "At the present site of Mali and Mauritania. ", "On the southern edge of the Sahara Desert.", "Between the present states of Nigeria and Cameroon.", "Ghana was a kingdom in Africa that lasted from the 6th to the 13th century CE, located south of the Sahara desert and northwest of the Niger River in modern day Mauritania and Mali.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("50.", "why did Britain and France agree to sacrifice Ethiopia to Italy in the so-called Hoare-Laval Plan, signed in 1932?", 0, 0, 0, 0, 0, "To compensate for what Italy lost in the European front. ", "To prevent Italy from joining Nazi Germany's camp.", "To allow Italy get its legitimate-share of African territories. ", "To fulfill the terms of the Tripartite Agreement of 1906.", "The  Hoare—Laval Pact or plan was an initially secret December 1935 by British Foreign Secretary and French Prime Minister Laval tor ending the Second Italo-Abyssinian War. Italy to seize the independent nation of Abyssinia (Ethiopia) as part of its Italian Empire and also avenge the 1896 Battle of Adwa, a humiliating defeat. The Pact offered to partition Abyssinia and achieved Italian dictator goal of making the independent nation of Abyssinia into an Italian colony.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("51.", "which of the following is true about the study of the past by professional historians?\t ", 0, 0, 0, 0, 0, "It focuses entirely on political issues.", "It works with, primary sources only.", "It is carried out on the basis of critical examination of the sources. ", "It produces accounts of the past that are acceptable to everybody.", "Historian is a person who studies and writes about the past, and is as an authority on it. Historians are concerned with the continuous, methodical narrative and research of past events as relating to the human race; as well as the study of all history in time.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("52.", "what was the hidden motive of the \"Antinori Mission\" to Shoa in 1876?", 0, 0, 0, 0, 0, "Preparing the ground for European assistance to Africa. ", "Opening up new areas for preaching the Gospel.", "Collecting information in the name of science and technology.", "Exploring new territories unknown to Europeans.", "The hidden motive of the leader of Italian geographic society Antenor Mission to Shoa in 1876 was collecting information in the name of science and technology.\t ", "c", 0, 1, this.f588b));
        arrayList.add(new questions("53.", "what did student activists accuse Haile Selassie's government of regarding the famine of 1972-1974?", 0, 0, 0, 0, 0, "That it used food aid for military and political purposes.", "That it heavily relied on foreign relief assistance by undermining local resources.", "That it used the as a means of generating hard currency.", "That it tried to hide the famine at the expense of people's lives.", "Student activities accused emperor Haile Selassie’s government of regarding the famine of 1972-1974 was the emperor tried to hide the famine at the expense of the people lives.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("54.", "which one of the following Arab-Israeli wars brought more territorial gains to the state or Israel?", 0, 0, 0, 0, 0, "The First Arab-Israeli War ", "The Suez War ", "The Yom Kippur War", "The Six Days War", "During Third Arab-Israel War (1967) the Six Day War: Israel occupied the entire Sinai Peninsula, advanced the Suez Canal and captured the Gaza strip. The whole of Jerusalem came under her control and she also the whole of Jordan.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("55.", "which of the following was a rallying cry that was used as a propaganda material by the coup makers of December 1960?", 0, 0, 0, 0, 0, "The call for land for the tillers.", "The Backwardness of Ethiopia", "Call for the restoration of Eritrea to Ethiopia.", "The ravaging famine in northern Ethiopia.", "The coup makers of 1960swas rallying cry that was used as propaganda was the backwardness of Ethiopia.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("56.", "what did all the five Oromo-speaking states of the Gibe region have in common?", 0, 0, 0, 0, 0, "They were all ruled by members of the same family. ", "Their rulers combined religious and political leadership. ", "They were all deeply involved in long – distance trade.", "They maintained the Gada system even though they had become states. ", "Haile Selassie efforts to achieve a measure of change without jeopardizing his own power stimulated rising expectations, some of which he was unwilling or unable to satisfy. Impatient with the rate or form of social and political change, several groups conspired to launch a coup d’état on December 13, 1960, while the emperor was abroad on one of his frequent trips.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("57.", "which one of the following paved the way for the Wollo Oromo to play an active role in the Gonderian court?", 0, 0, 0, 0, 0, "Emperor Iyasu Il's marriage to Bersabeh.", "Shoa's isolation and growing autonomy from Gonderian rule.", "Emperor Bakaffa’s marriage to Mentwab.", "Ras Wolde Leul's promotion to the rank of Ras-Bitweded", "Emperor Bakaffa's marriage to Mentwab was paved the way for Wollo Oromo to play an active role in the Gonderian Court.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("58.", "what accounted for the rapid expansion of Muslim Arabs under the first four Caliphs?", 0, 0, 0, 0, 0, "Superior armaments", "Internal weaknesses of their enemies. ", "Numerical superiority over their enemies.", "Convenient geography.", "Arabs began their expansion outside Arabia under the first four caliphs. Muslim Arabs motivated by economic and political objectives won a series of victories over the armies of the two great powers of the period the Byzantine and the Persian empires. The campaign against the Byzantine in Syria took place between 634 and 636. The rapid success of the Muslims was due to the financial and military exhaustion of Byzantine and Persian Empires, moreover the Byzantine were hated by their subjects because of the oppressive taxation.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("59.", "what was the motive for European partition of Africa at the close of the 19th century?", 0, 0, 0, 0, 0, "Rivalry for superpower status.", "Desire to spread Christianity and European culture.", "Competition for raw materials and markets. ", "The opening of the Suez Canal.", "Scramble for Africa was the occupation, division, and colonization of African territory by European powers during the period of new imperialism, between 1881 and 1914. It is also called the Partition of Africa and by some the Conquest of Africa. The partition was the competition for raw materials and market for the industrial products.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("60.", "which one of the following elements is likely to have led to the emergence of the state among early human societies?", 0, 0, 0, 0, 0, "Warfare", "Domestication of animals", "Language", "Topography", "Factors that led to the Rise of an Ancient stale. There is a byproduct of farming, of early agriculture 'that gets astonishingly little notice after the domestication of plants and animals.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("61.", "what is the difference between our knowledge of the ancient state of Punt and that Damat?", 0, 0, 0, 0, 0, "The former is based on more concrete evidence than the latter.", "The former is based on written sources while the latter is based on oral sources.", "The former is supported by archeological evidence while the latter is not.", "The former is based mainly on foreign sources while the latter is based on local source.", "The difference between our knowledge of the ancient state of Punt and that of Damat was the Historical evidence about the existence of Punt was found in the Egyptian writing system called Hieroglyphics, whereas Damat existed just before the rise of Aksum. Its center was little to the south of the town of Aksum. Information about this state comes from local archeological Sources.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("62.", "what was the stone structure of Zimbabwe erected for?", 0, 0, 0, 0, 0, "To serve as military barracks. ", "The residence of royalty.", "Use is warehouses for trade items.", "As Shrines for dead ancestors.", "Great Zimbabwe is a medieval city in the south-eastern hills of Zimbabwe near Lake Mutirikwe  the structure was erected for the use of war house for trade items.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("63.", "what was the Renaissance? ", 0, 0, 0, 0, 0, "A movement to eradicate opponents of the Catholic Church.", "The rediscovery of classical writings. ", "The triumph of tradition over science. ", "The rebirth of Greek independence.", "Renaissance was series of literary and cultural movements in the 14th, 15th, and 16th centuries. These movements began in Italy and eventually expanded into Germany, France, England, and other parts of Europe. Participants studied the great civilizations of ancient Greece and Rome and came to the conclusion that their own cultural achievements rivaled those of antiquity.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("64.", "what were the three ‘estates' represented in Estates —General of pre-revolutionary France?", 0, 0, 0, 0, 0, "The Nobility, the Royalty and the Bourgeoisie. ", "The Clergy, The Nobility and the ordinary people.", "The Bourgeoisie, the Petit-bourgeoisie and the Peasantry.", "The clergy, the Bourgeoisie and the workers", "Estates-General, also called States General, French in France of the pre-Revolutionary monarchy, the representative assembly of the three \"estates,\" or orders of the realm: the clergy and nobility—which were privileged minorities and a Third Estate, which represented the majority of the people.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("65.", "what was the central idea behind Calvinism?", 0, 0, 0, 0, 0, "Purity of heart and mind", "Justification by faith ", "Predestination", "Separation of Church and State ", "A French Reformer John Calvin, fled from Catholic France to safety in Geneva, he taught the doctrine of predestination, that only those elected beforehand by God would achieve salvation.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("66.", "Why is the 1935 Italian aggression \"Fascist aggression\"?", 0, 0, 0, 0, 0, "Because Mussolini had secretly allied Hitler.", "Because the aggressors were extremely well. ", "Because the invaders were racists.", "Because Italy was at the time a Fascist State.", "The 1935 Italian aggression of Ethiopian was called Fascist Aggression because Italy was at the time a fascist state.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("67.", "which one of the following was a cause of conflict between Charles I and Parliament in the English Revolution?", 0, 0, 0, 0, 0, "The antagonism created by the demands of the Levelers for the abolition of the monarchy.", "Parliament's opposition to the King granting extensive lands to Queen that was exempt from taxes.", "The uncovering of Charles's plan to convert England into a Catholic country.", "Charles's practice of collecting taxes without parliamentary approve which was seen as illegal.", "The causes of the conflict between Charles I and the parliament was that the king practice of collecting taxes-without parliamentary approach was not as illegal.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("68.", "The American Revolutionary War can be called not only a war of independence but also a civil war. Why?", 0, 0, 0, 0, 0, "Because it sought not to gain independence from the British but also to end the cruel institution of slavery.", "Because it was a war that was fought only by professional soldiers but also by a large number of civilians.", "Because American society was not \tand some sections of the population fought in support of-the British cause.", "Because the civilian causalities were much higher than those of the military.", "The American Revolution was not  only war of independence but also a civil war  because American societies was not unified and some sections of population fought in support of the British causes.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("69.", "why were scholars like Erasmus called Christian Humanists? Because they", 0, 0, 0, 0, 0, "Saw the Old Testament as unreliable the teachings of the New Testament.", "Were primary religious leaders who sought to enhance the influe1Ee o the Church over philosophers.", "Sought to use the critical methods of the renaissance to advance interest of religion ", "Advocated the teaching of the liberal arts in local languages rather than the Church’s language, Latin", "The Renaissance scholars The Dutch Humanistic Desiderius Erasmus (1476-1538) and an English Sir —Thomas More (1476-1578) was the leading Christian Humanistic because they interested as the Italian studying classical literature. Instead they sought to apply humanistic method the study of Christianity.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("70.", "what was the so-called Truman Doctrine?", 0, 0, 0, 0, 0, "A statement of a doctrine that guaranteed US support for Japan.", "A declaration that the USSR was an adversary of the US.", "A doctrine that declares the US pre-eminent in the Americas.", "A doctrine that preached the prohibit ion of the Communist party in the US.", "The Truman Doctrine was an American foreign policy whose stated Purpose was-to counter Soviet geopolitical expansion during the Cold War. It was first announced to Congress by President Harry S. Truman on March 12, 1947, and further developed on July 12, 1948, when he pledged to contain threats to Greece and Turkey.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("71.", "In what way did geographical location help Shoa emerge as the most dominant state in Ethiopia in the nineteenth century? ", 0, 0, 0, 0, 0, "By making-it agriculturally productive.", "By making it easily accessible to Europeans.", "By making it mountainous and easy to defend.", "By making it close to the coast and further away from the politics of Gondar. ", "The geographical location of helped Shoa emerged as the most dominant states in Ethiopia in the 19th century by making its easily accessible to European.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("72.", "In which Asian country was independence preceded by a “unity” government between the former colony and the colonial power? ", 0, 0, 0, 0, 0, "Hong-Kong ", "Manchuria ", "Korea ", "Indonesia", "Hong Kong is Asian country unity government formed by former colony and colonial power.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("73.", "which one of the following is correct about the role of long- distance trade in Medieval Ethiopia?", 0, 0, 0, 0, 0, "It weakened the Christian and Muslim states since it became a source of conflict between the two.", "It facilitated economic interdependence.", "It encouraged the development of a feudal mode of production by encouraging the commercialization of land.", "It encouraged the spread of Christianity since the caravan traders also served as part-time evangelizers.", "One of the effects of the long-distance trade in Medieval Ethiopia was it facilitates economic interdependence among different states in the region.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("74.", "which one of the following describes Confucianism better?", 0, 0, 0, 0, 0, "It gave primacy to heaven and divine authority over reason and ethics. ", "It taught 'middle way' or moderation as a guiding principle in life. ", "It taught the way forward than focusing on past glory and achievements.", "It was a secular philosophy aimed at cultivating responsible citizens. ", "Confucianism, which steered Chinese society for more than 2,000 years, is having a revival in China and attracting interest from around the world. Confucius believed that the source of good government was in the maintenance of tradition; tradition, in turn, was maintained by personal standards of virtue. These included respect for the patriarchal family (filial piety) and veneration of one's ancestors- Confucius also believed that governmental stability depended on well-educated officials.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("75.", "In which of the following African countries did the presence of White settlers complicate the liberation struggle?", 0, 0, 0, 0, 0, "Algeria", "Nigeria ", "Gabon ", "Ghana", "Algeria was one Africa countries that the presence of white settlers complicated the liberation struggle against colonizer.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("76.", "The ground work for the early penetration and spread or Islam into south and central Ethiopia was laid down by", 0, 0, 0, 0, 0, "The activities of Shiite exiles from Persia and Arabia. ", "Wars conducted by the Sultanate of Adal.", "The organized missionary activities or Yemeni sheikhs. ", "Muslim merchants from Arabia.", "The ground work for the early penetration and spread of Islam into the south and central Ethiopia was laid down by Muslim merchants from Arabia.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("77.", "what was the most important factor for the ultimate victory Of France in “The Hundred Years War\"?", 0, 0, 0, 0, 0, "Peasant revolts and Black Death in England. ", "Bad harvest and financial crisis that hit England.", "Rivalry for power in the English Royal family.", "Military support France got from Prussia and Austria. ", "The major factor for the victory of France in the Hundred years war these included peasant's rebellions, pillaging in France by unemployed soldiers, the Black Death (a form of bubonic plagues) in two countries and peasant revolt in England in 1381.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("78.", "which one of the following was not a view advocated by writers called Christian Humanists?", 0, 0, 0, 0, 0, "Freedom to criticize ideas", "The separation of church and state", "A state free from war and poverty.", "The necessity of justice and freedom.", "The most important people from the Renaissance believed in something called humanism. The Christian humanist advocated freedom to criticize ideas, separation of church and state and necessity of justice and freedom", "c", 0, 1, this.f588b));
        arrayList.add(new questions("79.", "Why did the Derg's 'Red Star Campaign' against the' Eritrean insurgents fail?", 0, 0, 0, 0, 0, "Because the rebels succeeded in mobilizing the diplomatic support of the Arab League which imposed an oil embargo on Ethiopia.", "Because the insurgents received critical help from the TPLF at critical junctures of the war.", "Because the USSR failed to fully commit its resources behind the Derg due to differences over strategy.", "Because the Derg was forced to send part of the Second Division to fight against Somalia in the East.", "The Derg's Red star camping against the Eritrean insurgents fail because the rebels succeeded in mobilizing diplomatic support of the. Arab League which imposed an oil embargo on Ethiopia.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("80.", "which one of the following is correct about the consequences of World War", 0, 0, 0, 0, 0, "If facilitated the establishment of democratic governments across Eastern Europe and Asia.", "It horrific excesses created a determination that genocide did not happen again.", "It led to dominance of non-European powers in international relations after the war.", "It weakened national liberation movements in Africa and delayed the independence of African countries.", "By the end of World War Il, Europe lay in ruins. Close to 40 million Europeans had died two-thirds of them civilians. Constant bombing and shelling had reduced hundreds of cities to rubble. The ground war had destroyed much of the countryside. Displaced persons from man nations were left homeless. Its horrific excesses created determination that genocide did not happen again.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("81.", "what was the role of Giuseppe Garibaldi in the unification of Italy?", 0, 0, 0, 0, 0, "He organized and led a volunteer force that succeeded in liberating southern Italy from its oppressive rulers.", "He was instrumental in securing the diplomatic and military support of Napoleon Ill to the Italian cause.", "He inspired Italian nationalist sentiment trough his patriotic speeches and writings.", "He convinced the leaders of Piedmont-Sardinia to support and lead Italian nationalist movement.", "Giuseppe Garibaldi (Italian: 4 July 1807 2 June 1882) was an Italia general, politician and nationalist. He personally commanded and fought in many military campaigns that led eventually to the Italian unification. He organized and led a volunteer force that succeeded in liberating South Italy from its oppressive rulers.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("82.", "which one of the following is correct about the Battle of Dogali?", 0, 0, 0, 0, 0, "It forced Britain to realize that the Italians were not worthy allies and end encouraged them to enter into closer relationship with the French", "It led Italy to abandon its policy of annexing Ethiopia and rather focus on being good neighbors with country", "It forced Menelik to realize what the real intention of the Italians was and led to diplomatic fallout between the two former friends", "It forced Italy to vigorously intensify its diplomatic and military preparations to undermine Emperor Yohannes", "The Dogali' Incident was the first attack against Italians and provoked Italian desire for revenge at the time when Italy was prepared to take revenge Britain intervened as peace maker.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("83.", "The birth of the militant state of Adal was the immediate result of ", 0, 0, 0, 0, 0, "Demographic pressure from the neighboring Afar and Somali", "The breakup if Ifat and the division within the Walasma ruling house", "Turkish military support to Ifat in a bid to counter Portuguese influence", "Pressure from the vigorously expanding Oromo in that direction", "The sultanate of Adal was established on the Harar plateau by the descendants of the Walasma ruling family of Ifat as the result of the breakup of Ifat and the division within the Walasma ruling house", "b", 0, 1, this.f588b));
        arrayList.add(new questions("84.", "According to the charter of the United Nations the principal objective of the organization was", 0, 0, 0, 0, 0, "Promoting collective security throughout the world", "Ensuring equal opportunity to all member states", "Reducing the ongoing rivalry and arms race among the world powers", "Saving the world from the threats of future war", "Aims of or objectives of the United Nations, according to its Charter, are: (I) to maintain international peace and security. (2) To develop friendly relations • among nations on the basis of equality and the principle", "a", 0, 1, this.f588b));
        arrayList.add(new questions("85.", "what was the role of the Abba Bokku in the Gada system of Government", 0, 0, 0, 0, 0, "Spokesmen of the Gada in power", "Chief Judge", "Commander of the warriors", "Chief priest", "The Gada system was quite egalitarian and the head of the Chaffe or the spokesperson of the Gada in power was elected democratically from among the Gada age-grade- He had the title of Abba Bokku or Abba Gada-", "a", 0, 1, this.f588b));
        arrayList.add(new questions("86.", "which of the following is true about the Christian – Muslim conflicts in Ethiopia and the Horn between the 14th and 16th centuries?", 0, 0, 0, 0, 0, "Religion served as ideology for an essentially economic conflict", "The Moslems where always armed and encouraged by outsiders", "The Christians were always on the offensive", "Advocated the teaching of the liberal arts in local languages rather than the Church’s language, Latin", "The Christian —Muslim conflicts in t Ethiopian and the Horn of Africa between the 14th and 16th centuries, religion served as ideology for an essential economic conflict.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("87.", "what was the role of Christianity in the ancient Roman Empire?", 0, 0, 0, 0, 0, "It opposed the rulers and brought about the decline of the Empire", "It kept itself out of politics totally", "It kept the state together culturally even after it declined politically ", "It attacked secular education and promoted theology. ", "The history of late ancient Christianity traces Christianity during the Christian Roman Empire. Its role includes kept the state together culturally even after it decline politically.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("88.", "A major area where post – independent African states could be said to have achieved very little success to this day has been", 0, 0, 0, 0, 0, "The struggle to build democracy", "The anti – apartheid democracy", "The anti – colonial struggle", "Resolving border disputes", "The one of the major problem of African faced in post-independence period has been the struggle to build democracy.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("89.", "An important factor for the emergence of the Sheikdoms along the Ethio – Sudanese border during the 19th century was", 0, 0, 0, 0, 0, "Inequality of wealth between the rich and the poor", "The need to resist the Mahdist threat from the Sudan", "The expansion of Islam accompanied with the growth of trade ", "The culture of age-sets that encouraged military training of the youth. ", "An important factor for the emergence of the Sheikdom along the Ethio-Sudanese border during the 19th century was the expansion of Islam accompanied with the growth of border trade.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("90.", "why did France support the cause of the 13 British colonies of America during the revolutionary period?", 0, 0, 0, 0, 0, "Because of the ideological commitment of French revolutionaries against British tyrants.", "Because of the anti-colonial stance of the French government of the time.", "Because the French wanted to replace Britain as a new colonial master of the Continent.", "Because of the age-long rivalry between Great Britain and France.", "American Revolution began after Great Britain passed a series of new taxes designed to generate revenue from the colonies in 1763 to help pay Off its war debt. France support the 13 colonies of American during the revolutionary war to seek revenge against Great Britain and the 1763 Treaty of Paris.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("91.", "After suppressing the growing opposition against Mentwab and her faction for which he was called to Gondar in 1767, Ras Michael Schul;", 0, 0, 0, 0, 0, "Returned to Tigray immediately.", "Marched to Shoa to subdue the rebellious rulers ", "Stayed in Gondar married to Mentwab but disengaged from politics.", "Stayed in Gondar deeply involved in the struggle for power.", "In 1768 Ras Michael Sehul of Tigray was invited to Gondar by Mentwab and soon restored peace and order in Gondar.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("92.", "what does Jon Lock's theory of social contract recommend in the face of tyranny and misrule?", 0, 0, 0, 0, 0, "Uprising and revolution", "Compromise and arbitration", "Repentance and tolerance", "Submission and loyalty", "According to other social contract theorists, when the government fails to secure their natural rights (Locke) or satisfy the- best interests of society (called the \"general will\" in Rousseau), citizens can withdraw their obligation to obey, or change the leadership through elections or Other means by +uprising and revolution.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("93.", "which of the following is true about the 18th century European - Enlightenment?", 0, 0, 0, 0, 0, "It advocated the strengthening of religion. ", "It advocated radical political change.", "It preached reason and betterment of humanity.", "It supported and advanced equality of men and women.", "Enlightenment, French (literally century of the Enlightened, a European intellectual movement of the 17th and 18th centuries, it preaches reason and betterment of humanity.", "c", 0, 1, this.f588b));
        arrayList.add(new questions("94.", "what did demonstrators in major Italian cities ask for following Italian defeat at Adwa? ", 0, 0, 0, 0, 0, "Immediate revenge on Ethiopia.", "The total withdrawal of Italy from Africa.", "The release of Ethiopian prisoners of war.", "Menelik be brought to trial for war crimes.", "Following 'the defeat of Italian at the battle of Adowa in 1896 by Ethiopian one of the slogans used by the demonstrators in Italian cities was the total withdrawal of Italy from Africa.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("95.", "what was it that made the sheikhdoms of Benishangul, Asosa and Komosha important in the eyes of the Egyptians, the Mahdists as well as Menelik's Shoa in the nineteenth century?", 0, 0, 0, 0, 0, "Their agricultural potential", "Their wealth in natural products like gold.", "Their location along the Blue Nile.", "Their geographical location that made them easy accessible from all directions. ", "The Sheikdoms of Asosa, Benishangul and Komosha important for Egyptians, the Mahdists as well as Menelik of Shoa in the 19th century because they are the spring board or geographical location that made them easy accessible from all directions.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("96.", "what was the immediate trigger for the American Civil war of 1861-65?", 0, 0, 0, 0, 0, "Abram Lincoln's election", "The secession of a number of Southern states from the union.", "Disagreements on the issue of slavery.", "Disagreements over the respective powers of the Federal and local governments", "The underlying causes of the war were more complex, but can be traced to the divisive issue of slavery, but the immediate cause was secession of a number of Southern states from the union.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("97.", "what ways are World War Il and the end of colonialism in Africa and Asia related?", 0, 0, 0, 0, 0, "The war made it clear to the colonial powers that colonialism was unjust.", "The war helped accelerate the struggle for independence in the colonies. ", "The colonial powers decided to abandon their colonies because the War had weakened them financially.", "Europeans had previously promised Africans and Asian that they would be granted independence at the end of the War.", "The Second World War brought into focus the illegality of colonialism in Africa.   It is true that most African nations became related after the war in the attempt to regain their lost sovereignty. The effect of the Second World War on Africa situation especially in the area of self-government and self-determination was very vital, it contributed more to a new political climate, the rise of nationalism and the waging of independence campaigns in various colonies as well as the new domestic priorities in the post-war period for colonial rulers.", "b", 0, 1, this.f588b));
        arrayList.add(new questions("98.", "why is Ethiopian victory at Adwa regarded as the victory of all Africans over colonialists", 0, 0, 0, 0, 0, "Because it boosted the anti-colonial struggle in the rest of Africa.", "Because it was the first and the only victory of Africans over Europeans. ", "Because the Europeans learnt that their colonization of Africa would not be forever.", "Because many African participated in the Battle on the side of Ethiopia. ", "The Battle of Adwa (1896) runs across the-annals of both Ethiopian and African history as the first battle of black Africa against an European colonial   rule because it boosted the anti-colonial struggle in the rest of Africa.", "a", 0, 1, this.f588b));
        arrayList.add(new questions("99.", "why does the Italian occupation of Ethiopia not qualify as successful colonization of the country?", 0, 0, 0, 0, 0, "The Italians stayed in the country only for five years. ", "Italian occupation was never recognized internationally.", "Haile Selassie successfully avoided capture by the Italians.", "Ethiopians never surrendered or stopped active resistance against the occupier.", "The Italian occupation of Ethiopian not qualify as successful colonization of the country because the Ethiopian never surrendered or stopped active resistance against the occupiers.", "d", 0, 1, this.f588b));
        arrayList.add(new questions("100.", "How did the unification of Italy come about at the beginning of the 1870s?", 0, 0, 0, 0, 0, "Through popular revolution all over the country", "Through war and conquest.", "Through war and diplomacy", "Through popular referendum", "A series of political (diplomacy) and military (wars) events that resulted in a unified kingdom of Italy in 1870s.", "c", 0, 1, this.f588b));
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
        this.f589tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    history2010.this.timer.setVisibility(0);
                    history2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    history2010.this.scr.setVisibility(8);
                    history2010.this.chr.stop();
                    history2010.this.toolbar.setVisibility(8);
                    history2010.this.Relative.setBackgroundColor(-7829368);
                    history2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2010.this.getBaseContext());
                    int unused = history2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = history2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = history2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = history2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = history2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = history2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = history2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = history2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = history2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = history2010.this.highscoreHistory2010 = defaultSharedPreferences.getInt("hist2010hs", 0);
                    int access$600 = history2010.this.part1 + history2010.this.part2 + history2010.this.part3 + history2010.this.part4 + history2010.this.part5 + history2010.this.part6 + history2010.this.part7 + history2010.this.part8 + history2010.this.part9;
                    history2010.this.resultText.setText(String.valueOf(access$600));
                    history2010.this.progressbar.setProgress(access$600);
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
                    int unused11 = history2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = history2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = history2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = history2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = history2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = history2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = history2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = history2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "hist2010hs";
                    int unused19 = history2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = history2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = history2010.this.answered1 + history2010.this.answered2 + history2010.this.answered3 + history2010.this.answered4 + history2010.this.answered5 + history2010.this.answered6 + history2010.this.answered7 + history2010.this.answered8 + history2010.this.answered9 + history2010.this.answered10;
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
                    if (access$600 > history2010.this.highscoreHistory2010) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - history2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1hist101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1hist102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1hist103", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1hist104", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1hist105", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1hist106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1hist107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1hist108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1hist109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1hist1010", 0);
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
                        editor.putString("scorehist101", str3);
                        editor.putLong("date1hist101", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorehist102", str5);
                            editor.putLong("date1hist102", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorehist103", str5);
                            editor.putLong("date1hist103", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorehist104", str5);
                            editor.putLong("date1hist104", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorehist105", str5);
                            editor.putLong("date1hist105", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorehist106", str5);
                            editor.putLong("date1hist106", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorehist107", str5);
                            editor.putLong("date1hist107", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorehist108", str5);
                            editor.putLong("date1hist108", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorehist109", str5);
                            editor.putLong("date1hist109", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorehist1010", str5);
                            editor.putLong("date1hist1010", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datehist101", 0);
                    long j12 = defaultSharedPreferences.getLong("datehist102", 0);
                    long j13 = defaultSharedPreferences.getLong("datehist103", 0);
                    long j14 = defaultSharedPreferences.getLong("datehist104", 0);
                    long j15 = defaultSharedPreferences.getLong("datehist105", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datehist106", 0);
                    long j17 = defaultSharedPreferences.getLong("datehist107", 0);
                    long j18 = defaultSharedPreferences.getLong("datehist108", 0);
                    long j19 = defaultSharedPreferences.getLong("datehist109", 0);
                    long j20 = defaultSharedPreferences.getLong("datehist1010", 0);
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
                        editor2.putString("iScorehist101", str4);
                        editor2.putLong("datehist101", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorehist102", str6);
                            editor2.putLong("datehist102", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorehist103", str6);
                            editor2.putLong("datehist103", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorehist104", str6);
                            editor2.putLong("datehist104", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorehist105", str6);
                            editor2.putLong("datehist105", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorehist106", str6);
                            editor2.putLong("datehist106", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorehist107", str6);
                            editor2.putLong("datehist107", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorehist108", str6);
                            editor2.putLong("datehist108", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorehist109", str6);
                            editor2.putLong("datehist109", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorehist1010", str6);
                            editor2.putLong("datehist1010", l.longValue());
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
                        history2010.this.scr.setVisibility(8);
                        history2010.this.chr.stop();
                        history2010.this.toolbar.setVisibility(8);
                        history2010.this.Relative.setBackgroundColor(-7829368);
                        history2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2010.this.getBaseContext());
                        int unused = history2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = history2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = history2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = history2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = history2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = history2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = history2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = history2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = history2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = history2010.this.highscoreHistory2010 = defaultSharedPreferences.getInt("hist2010hs", 0);
                        int access$600 = history2010.this.part1 + history2010.this.part2 + history2010.this.part3 + history2010.this.part4 + history2010.this.part5 + history2010.this.part6 + history2010.this.part7 + history2010.this.part8 + history2010.this.part9;
                        TextView access$1600 = history2010.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        history2010.this.progressbar.setProgress(access$600);
                        history2010.this.progressbar.setMax(100);
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
                        int unused11 = history2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = history2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = history2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = history2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = history2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = history2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = history2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = history2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = history2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = history2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = history2010.this.answered1 + history2010.this.answered2 + history2010.this.answered3 + history2010.this.answered4 + history2010.this.answered5 + history2010.this.answered6 + history2010.this.answered7 + history2010.this.answered8 + history2010.this.answered9 + history2010.this.answered10;
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
                        if (access$600 > history2010.this.highscoreHistory2010) {
                            edit.putInt("hist2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - history2010.this.chr.getBase()) / 1000;
                        SharedPreferences.Editor editor3 = edit;
                        String str = "datehist1010";
                        String str2 = "datehist109";
                        if (history2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 100) * (access$1800 * access$1800)) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            long j = defaultSharedPreferences.getLong("datehist101", 0);
                            Long l = valueOf;
                            String str3 = f;
                            long j2 = defaultSharedPreferences.getLong("datehist102", 0);
                            long j3 = defaultSharedPreferences.getLong("datehist103", 0);
                            long j4 = defaultSharedPreferences.getLong("datehist104", 0);
                            String str4 = "datehist104";
                            String str5 = "datehist103";
                            long j5 = defaultSharedPreferences.getLong("datehist105", 0);
                            String str6 = "datehist101";
                            String str7 = "datehist105";
                            long j6 = defaultSharedPreferences.getLong("datehist106", 0);
                            long j7 = defaultSharedPreferences.getLong("datehist107", 0);
                            String str8 = "datehist107";
                            String str9 = "datehist106";
                            String str10 = "datehist108";
                            long j8 = defaultSharedPreferences.getLong("datehist108", 0);
                            long j9 = defaultSharedPreferences.getLong(str2, 0);
                            String str11 = str;
                            long j10 = defaultSharedPreferences.getLong(str11, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            String str12 = "datehist102";
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(j6);
                            Date date7 = new Date(j7);
                            Date date8 = new Date(j8);
                            Date date9 = new Date(j9);
                            Date date10 = new Date(j10);
                            ArrayList arrayList = new ArrayList();
                            Date date11 = date;
                            arrayList.add(date11);
                            arrayList.add(date2);
                            arrayList.add(date3);
                            arrayList.add(date4);
                            arrayList.add(date5);
                            arrayList.add(date6);
                            arrayList.add(date7);
                            arrayList.add(date8);
                            arrayList.add(date9);
                            arrayList.add(date10);
                            Date date12 = (Date) Collections.min(arrayList);
                            if (date12.compareTo(date11) == 0) {
                                editor2 = editor3;
                                editor2.putString("iScorehist101", str3);
                                editor2.putLong(str6, l.longValue());
                            } else {
                                editor2 = editor3;
                                if (date12.compareTo(date2) == 0) {
                                    editor2.putString("iScorehist102", str3);
                                    editor2.putLong(str12, l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor2.putString("iScorehist103", str3);
                                    editor2.putLong(str5, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor2.putString("iScorehist104", str3);
                                    editor2.putLong(str4, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor2.putString("iScorehist105", str3);
                                    editor2.putLong(str7, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor2.putString("iScorehist106", str3);
                                    editor2.putLong(str9, l.longValue());
                                } else if (date12.compareTo(date7) == 0) {
                                    editor2.putString("iScorehist107", str3);
                                    editor2.putLong(str8, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor2.putString("iScorehist108", str3);
                                    editor2.putLong(str10, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor2.putString("iScorehist109", str3);
                                    editor2.putLong(str2, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor2.putString("iScorehist1010", str3);
                                    editor2.putLong(str11, l.longValue());
                                }
                            }
                            editor = editor2;
                        } else {
                            String str13 = "datehist104";
                            String str14 = "datehist101";
                            String str15 = "datehist105";
                            String str16 = "datehist106";
                            String str17 = "datehist102";
                            String str18 = "datehist108";
                            String str19 = str;
                            String str20 = str2;
                            String str21 = "datehist107";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f2 = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 100) * (access$1800 * access$1800)) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            long j11 = defaultSharedPreferences.getLong(str14, 0);
                            String str22 = str14;
                            long j12 = defaultSharedPreferences.getLong(str17, 0);
                            String str23 = f2;
                            String str24 = str17;
                            long j13 = defaultSharedPreferences.getLong("datehist103", 0);
                            long j14 = defaultSharedPreferences.getLong(str13, 0);
                            String str25 = "datehist103";
                            String str26 = str13;
                            long j15 = defaultSharedPreferences.getLong(str15, 0);
                            long j16 = defaultSharedPreferences.getLong(str16, 0);
                            String str27 = str16;
                            long j17 = defaultSharedPreferences.getLong(str21, 0);
                            String str28 = str15;
                            long j18 = defaultSharedPreferences.getLong(str18, 0);
                            long j19 = defaultSharedPreferences.getLong(str20, 0);
                            String str29 = str20;
                            String str30 = str;
                            long j20 = defaultSharedPreferences.getLong(str30, 0);
                            Date date13 = new Date(j11);
                            Date date14 = new Date(j12);
                            String str31 = str18;
                            Date date15 = new Date(j13);
                            Date date16 = new Date(j14);
                            Date date17 = new Date(j15);
                            Date date18 = date16;
                            Date date19 = new Date(j16);
                            Date date20 = new Date(j17);
                            Date date21 = new Date(j18);
                            Date date22 = new Date(j19);
                            Date date23 = new Date(j20);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            Date date24 = date18;
                            arrayList2.add(date24);
                            Date date25 = date17;
                            arrayList2.add(date25);
                            arrayList2.add(date19);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            arrayList2.add(date23);
                            Date date26 = (Date) Collections.min(arrayList2);
                            if (date26.compareTo(date13) == 0) {
                                editor = editor3;
                                editor.putString("iScorehist101", str23);
                                editor.putLong(str22, valueOf2.longValue());
                            } else {
                                String str32 = str23;
                                editor = editor3;
                                if (date26.compareTo(date14) == 0) {
                                    editor.putString("iScorehist102", str32);
                                    editor.putLong(str24, valueOf2.longValue());
                                } else if (date26.compareTo(date15) == 0) {
                                    editor.putString("iScorehist103", str32);
                                    editor.putLong(str25, valueOf2.longValue());
                                } else if (date26.compareTo(date24) == 0) {
                                    editor.putString("iScorehist104", str32);
                                    editor.putLong(str26, valueOf2.longValue());
                                } else if (date26.compareTo(date25) == 0) {
                                    editor.putString("iScorehist105", str32);
                                    editor.putLong(str28, valueOf2.longValue());
                                } else if (date26.compareTo(date19) == 0) {
                                    editor.putString("iScorehist106", str32);
                                    editor.putLong(str27, valueOf2.longValue());
                                } else if (date26.compareTo(date20) == 0) {
                                    editor.putString("iScorehist107", str32);
                                    editor.putLong(str21, valueOf2.longValue());
                                } else if (date26.compareTo(date21) == 0) {
                                    editor.putString("iScorehist108", str32);
                                    editor.putLong(str31, valueOf2.longValue());
                                } else if (date26.compareTo(date22) == 0) {
                                    editor.putString("iScorehist109", str32);
                                    editor.putLong(str29, valueOf2.longValue());
                                } else if (date26.compareTo(date23) == 0) {
                                    editor.putString("iScorehist1010", str32);
                                    editor.putLong(str30, valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        history2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2010.this.scr.setVisibility(8);
                history2010.this.chr.stop();
                history2010.this.toolbar.setVisibility(8);
                history2010.this.Relative.setBackgroundColor(history2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                history2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2010.this.scr.setVisibility(0);
                history2010.this.toolbar.setVisibility(0);
                history2010.this.telegram_layout.setVisibility(8);
                history2010.this.chr.start();
                history2010.this.Relative.setBackgroundColor(history2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = history2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = history2010.this.mInterstitialAd = null;
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
                history2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
