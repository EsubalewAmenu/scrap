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

public class history2011 extends AppCompatActivity {
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
    private Boolean f590b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreHistory2011;
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
    private Toolbar f591tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_history2011);
        this.f590b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextHistory2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_history2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The messenger sent to Portugal by Atse Libine Dingil to bring help against Imam Ahmed was", 0, 0, 0, 0, 0, "Pero Paez ", "John Bermudez ", "Alphonso Mendez", "Christopher da Gama", "The messenger sent to Portugal by Atse Lebna Dengel, to bring help against Imam Ahmed was John Bermudez. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("2.", "The battle that led to the completion of German unification in 1871 was", 0, 0, 0, 0, 0, "Versailles", "Sadowa", "Waterloo", "Sedan", "The Battle of Sedan was fought during the Franco-Prussian War from 1 to 2 September 1870. It resulted in the capture of Emperor Napoleon III and concluded the unification of Germany.", "", 0, 1, this.f590b));
        arrayList.add(new questions("3.", "Which of the following states was a serious obstacle to the establishment of a viable relation between the Ethiopian Christian kingdom and Portugal during the medieval period?", 0, 0, 0, 0, 0, "Mamluk Egypt ", "The western Roman Empire", "Muslim Arabia ", "Ottoman Turkey", "The Ottoman Turks are serious obstacle to the establishment of a viable relationship between Ethiopian Christian kingdom and Portugal during the medieval period. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("4.", "Which continents were connected to each other in the Triangular Trade?", 0, 0, 0, 0, 0, "Africa, Europe and the Americas ", "The Americas, and Asia ", "Asia, Europe and Africa", "The Americas, Asia and Europe", "The contents of Africa, Europe and America were connected to each other in the Triangular trade during the slave trade", "", 0, 1, this.f590b));
        arrayList.add(new questions("5.", "Who was responsible for introducing the seclusion policy in Japan in the 17century?", 0, 0, 0, 0, 0, "Franciscan Missionaries ", "Christian Daimyos", "The Tokugawa Shoguns", "The Dutch East India Company", "The Tokugawa Shogunate, also known as the Tokugawa was the last feudal Japanese military government, which existed between 1603 and 1867. Who was responsible for introducing the seclusion policy in Japan in the 17th century? ", "", 0, 1, this.f590b));
        arrayList.add(new questions("6.", "Which of the following combinations of an Omotic state and its ruling dynasty is correct? ", 0, 0, 0, 0, 0, "Kaffa-Tato", "Wolayita-Motolami", "Yem- mowa", "Sheka-Tigre", "The correct combination of Omotic state and their ruling dynasty The royal title of the kings of Kaffa was Tato. The kings of Walayta had the title of Kawo ", "", 0, 1, this.f590b));
        arrayList.add(new questions("7.", "In ancient Japan of the 12th and the 13 centuries, real government power was in the hands of ", 0, 0, 0, 0, 0, "army generals called Shogun.", "feudal warriors called Samurai.", "emperors from Tokugawa royal house. ", "Buddhist clergy of the monitories.", "In the ancient Japan of the 12th and 13th centuries real government power was in the hands of army general called Shogun.", "", 0, 1, this.f590b));
        arrayList.add(new questions("8.", "Which of the following Christian teachings was very central to Martin Luther's Ninety-Five These?", 0, 0, 0, 0, 0, "Supreme authority of the Pope over the church. ", "Salvation of the individual is determined by one's good deeds. ", "The practice of \"indulgence\" should be introduced into Germany. ", "Faith alone ensures the salvation of the individual believer.", "October 31, 1517 Luther defiantly nailed a copy of his 95 Theses to the door of the Wittenberg Castle church. ... The 95 Theses, which would later become the foundation of the Protestant Reformation, were written in a remarkably humble and academic tone, e centeral of teaching of Martin Luther in 95 theses was faith alone ensure the salivation of individual believer.", "", 0, 1, this.f590b));
        arrayList.add(new questions("9.", "What was the responsibility of the Tato Kisho in the Kingdom of Kaffa in the 19th century?", 0, 0, 0, 0, 0, "Advising the king ", "Arranging royal succession", "Provincial administration ", "Tax collection for the king", "The state of the kingdom of Kaffa was highly organized. A council of advisers known as the Mikrecho used to control the political authority of the Tato. Tato Kisho were responsible for tax collection for the Tato in Kaffa kingdom in the 19th century. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("10.", "Which of the following is correct about Louis Napoleon?", 0, 0, 0, 0, 0, "He ruled France jointly with the Estates- General. ", "He was the President of the Second French Republic.", "He was a very authoritarian emperor of France.\t ", "He was a constitutional monarch with limited power. ", "Louis Napoléon Bonaparte; 20 April 1808 - 9 January 1873), the nephew of Napoleon I, was the first elected President of France from 1848 to 1852. When he could not constitutionally be re-elected, he seized power in 1851 and became the Emperor of the French from 1852 to 1870.", "", 0, 1, this.f590b));
        arrayList.add(new questions("11.", "The Congress of Vienna of 1815 is usually associated with", 0, 0, 0, 0, 0, "Conservatism ", "Liberalism", "Republicanism ", "Self- determination ", "The Congress of Vienna was a meeting of ambassadors of European states chaired by Austrian statesman Klemens von Metternich, and held in Vienna from November 1814 to June 1815, though the delegates had arrived was usually associated by liberalism.", "", 0, 1, this.f590b));
        arrayList.add(new questions("12.", "During its Monopolistic phase, the business of the Trans-Atlantic slave trade was dominated by ", 0, 0, 0, 0, 0, "African Chiefs", "Chartered companies", "American planters ", "Private shippers", "The 2ndPhase of slave trade was known as the monopolistic slave trade Began in 1580s. Trade conducted by monopolistic slave trading companies, supported by theirs government or by armed forces", "", 0, 1, this.f590b));
        arrayList.add(new questions("13.", "Napoleon's rise to power can be explained by his ", 0, 0, 0, 0, 0, "royal background", "liberal education.", "military skills ", "family's wealth", "Napoleon rapidly rose through the ranks of the military during the French Revolution (1789-1799). After seizing political power in France in a 1799 coup d'état, he crowned himself emperor in 1804.", "", 0, 1, this.f590b));
        arrayList.add(new questions("14.", "What was the most important achievement of the duke of Wellington, at the Battle of Waterloo?", 0, 0, 0, 0, 0, "Signed a peace treaty with Belgium.", "Dealt the final blow to Napoleon I's army. ", "Negotiated a peace treaty with Russia.", "Restored Napoleon I to power in France.", "A battle fought on June 18, 1815 near Waterloo in present-day Belgium, then part of the United Kingdom of the Netherlands. A French army under the command of Napoleon Bonaparte was defeated by two of the armies of the Seventh Coalition: an Anglo-led Allied army under the command of the Duke of Wellington, and a Prussian army under the command of Gebhard Leberecht von Blücher.", "", 0, 1, this.f590b));
        arrayList.add(new questions("15.", "What was\" Justification by faith\" according to Martin Luther (1483-1546)? ", 0, 0, 0, 0, 0, "That the Catholic Church has to Justify its practices to the faithful.", "That faithfulness in marriage is a mark of a good Christian ", "That faith is more important than collective worship for Christians", "That salvation comes only from faith ", "Justification by Faith for the Lutheran tradition, the doctrine of salvation by grace alone through faith alone in Christ alone is the material principle upon which all other teachings rest.", "", 0, 1, this.f590b));
        arrayList.add(new questions("16.", "What was the most important innovation that made the Industrial Revolution possible?", 0, 0, 0, 0, 0, "The massive production of coal", "Hydro power", "Wind power", "Steam power", "Innovations like the spinning jenny, water frame and power loom transformed the cotton industry, which was the biggest driver of the revolution; James Watts' steam engine powered locomotives and ships to revolutionize transportation.", "", 0, 1, this.f590b));
        arrayList.add(new questions("17.", "Which one of the following is a correct definition for the discipline of history? ", 0, 0, 0, 0, 0, "The study of the past, present and future actions of men and women.", "The systematic stud of past human actions and thoughts. ", "The study of the cultural system of literate societies.", "The study of the origin and evolution of humans from ape like species.", "history is a branch of social science that deals with what human beings did in the past. It studies changes in the development of societies. It also studies the political, economic, social and cultural life of past societies. ", "a", 0, 1, this.f590b));
        arrayList.add(new questions("18.", "What were the three European states that Prussia had to fight to bring about German unification?", 0, 0, 0, 0, 0, "Denmark, Austria, France ", "Sweden, Austria, France", "Sweden, France, Denmark", "Austria. Italy, England", "Denmark, Austria and France were the three states that Prussia had to fight to bring about the unification of Germany.", "", 0, 1, this.f590b));
        arrayList.add(new questions("19.", "Which of the following pair of European countries pioneered overseas expansion?", 0, 0, 0, 0, 0, "Spain and Portugal", "Portugal and England", "Holland and Spain ", "Holland and England.", "European countries pioneered overseas expansion in the Fifteenth and Sixteenth Centuries were led Spain and Portugal. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("20.", "What is the central idea of the theory of \"Oriental Despotism\" regarding state formation?", 0, 0, 0, 0, 0, "That states emerged from control of elite goods such as gold and silver. ", "That states were created by warriors who also exercised religious functions.", "That states emerged from the need to control irrigation systems. ", "That states emerge among peoples that first domesticated plants & animals ", "Central ideas of theory of oriental despotism in State formation states emerged from the need to control irrigation system.", "", 0, 1, this.f590b));
        arrayList.add(new questions("21.", "Which European country was the first to start trading in African slaves?", 0, 0, 0, 0, 0, "Britain", "Portugal", "France ", "Netherlands ", "The transatlantic slave trade began during the 15th century when Portugal, and subsequently other European kingdoms, were finally able to expand overseas and reach Africa. The Portuguese first began to kidnap people from the west coast of Africa and to take those they enslaved back to Europe.", "", 0, 1, this.f590b));
        arrayList.add(new questions("22.", "What was \"the Mandate of Heaven\" in Chinese political culture?", 0, 0, 0, 0, 0, "That social harmony is mandated by heaven. ", "The idea that rulers become rulers because they have supernatural permission.", "That it is acceptable for men to rule over women", "That selfishness and greed are disapproved by God ", "The Mandate of Heaven: the idea that there could be only one legitimate ruler of China at a time, and that this ruler had the blessing of the gods.", "", 0, 1, this.f590b));
        arrayList.add(new questions("23.", "What accounts for Luther's victory in his struggle with the Catholic Church? ", 0, 0, 0, 0, 0, "The overwhelming support he got from German peasants. ", "The division between the Pope and the Emperor on how to deal with him.", "The protection he received from nationalistic German rulers. ", "The Church's recognition that some of Luther's criticisms were correct.", "Luthers's victory in his struggle with Catholic church favored or received protection from nationalistic German rulers,", "", 0, 1, this.f590b));
        arrayList.add(new questions("24.", "Which one of the following criteria do linguists use in classifying languages?", 0, 0, 0, 0, 0, "The culture of the people who speak the languages.", "The key vocabulary used by speakers of the languages ", "The physical features of speakers of the languages ", "The economic organization of the people who speak the languages ", "There are two kinds of classification of languages practiced in linguistics: genetic (or genealogical) and typological. The purpose of genetic classification is to group languages into families according to their degree of diachronic relatedness", "", 0, 1, this.f590b));
        arrayList.add(new questions("25.", "What was the origin of the division between Sunnis and Shias in Islam?", 0, 0, 0, 0, 0, "The issue of when to undertake a Jihad.", "The issue of where to locate Islam's capital. ", "The question of relationship with other religions", "The issue of succession to the Caliphate.", "The division between Islam's Shiite minority and the Sunni majority is deepening across the Middle East. The split occurred soon after the death of the Prophet Muhammad, nearly 1,400 years ago on the issues of succession to the Caliphate.", "", 0, 1, this.f590b));
        arrayList.add(new questions("26.", "Which one of the following is correct about town administration in Medieval Europe? ", 0, 0, 0, 0, 0, "It was democratic since it was controlled by all its residents.", "It lacked autonomy since it was controlled by the feudal lords. ", "It was under the control of the clergy of the big monasteries around the city.", "It was led by elite members of society especially the merchants.", "In Western Europe, were revived as commercial centers in the 10th-the 11th centuries. It was led by elites crafts centers and members of the societies especially by the merchants.", "", 0, 1, this.f590b));
        arrayList.add(new questions("27.", "What was the distinctive feature of Renaissance literature? ", 0, 0, 0, 0, 0, "Its dependence on Biblical style and stories.", "Its focus on issues related to everyday life ", "Its emphasis on the over exploitation of the peasantry ", "Its exclusive dependence on classical Latin and Greek ", "The main characteristic of Renaissance English literature is that it was influenced by the ideas of the Renaissance related to art, religion and politics. It exclusively depends on the classical Latin and Greek. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("28.", "What factor led the Aksumites to send expeditions South Arabia in the 3rd century?", 0, 0, 0, 0, 0, "The desire to protect the Christian community from Jewish persecution. ", "The desire of Aksumite ruling class to spread Christianity. ", "The desire to avenge the death of Ethiopian pilgrims killed by the Arabs. ", "The desire to control the Red Sea trade by the ruling", "The major factor that led the Aksumite to send expedition to south Arabia in the 3th century was the desire to control the Red Sea trade by the ruling class.", "", 0, 1, this.f590b));
        arrayList.add(new questions("29.", "What was a manor in medieval Europe? ", 0, 0, 0, 0, 0, "A large self-sufficient estate owned by a feudal lord class.", "Peasants who did not have a land of their own to cultivate ", "A large castle built for defensive purposes", "Knights who owned loyalty to kings ", "A manor was the district over which a lord had domain and could exercise certain rights and privileges in medieval England. A typical manor would include a Manor House which was built apart from the village where the peasants lived.", "", 0, 1, this.f590b));
        arrayList.add(new questions("30.", "What was the significance of the Battle of Plassey for India?", 0, 0, 0, 0, 0, "It led to the replacement of Muslim dominance by Hindu dominance in Indian politics.", "It helped Britain emerge as the prominent colonial power in India. ", "It led to the transfer of control of India from France to Britain.", "It led to the division of India between British and French spheres of influence.", "The Battle of Plassey was a decisive victory of the British East India Company over the Nawab of Bengal and his French allies on 23 June 1757, under the leadership of Robert Clive.It helped the British emerged as the dominant colonial power in India.", "", 0, 1, this.f590b));
        arrayList.add(new questions("31.", "What was the role of the Solomonic monarchs during the Zemene Mesafini?", 0, 0, 0, 0, 0, "Oversee civil and judicial affairs in the kingdom.", "Reign as nominal rulers of the kingdom.", "Serve as negotiators with Ethiopia's external contacts. ", "Undertake military expeditions whenever called on by the ras-bitweded.", "the roles of the solomonic dynasty monarchy durin the ZemeneMesafint was reign as nominal rulers of the kingdom. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("32.", "What forced Louis XVI to call the Estates General in 1789?", 0, 0, 0, 0, 0, "Widespread rural rebellion that France experienced at the time. ", "Threat of an invasion by a European coalition army. ", "Disturbances created by Frenchmen who took part in the American War of Independence", "Financial crisis that the monarchy faced at the time.", "In 1789, the King Louis XVI called a meeting of the Estates General. It was the first meeting of the Estates General called since 1614. He called the meeting because the French government was having financial", "", 0, 1, this.f590b));
        arrayList.add(new questions("33.", "Which one of the following initiatives of Emperor Gelawdewos was successful?", 0, 0, 0, 0, 0, "Effectively ending the threat from the Sultanate of Adal. ", "Restoring the power of the monarchy in the northern provinces. ", "Expelling the Ottoman Turks from Massawa. ", "Limiting the Oromo movement to southern and central Ethiopia.", "Among these kings Golawdows (r.1540-1559), confronted the raids of Adal and Oromo. Herstored the power of the monarchy in the Northern provinces.", "", 0, 1, this.f590b));
        arrayList.add(new questions("34.", "Which one of the following is correct about the Kingdom of Damot? ", 0, 0, 0, 0, 0, "Its political center was in present day Wolayita. ", "It became part of the Christian kingdom under the Zagwe rulers. ", "Its core population were settlers from the district of the same name in Gojjam.", "It had histories of peaceful interaction and conflict with the Christian ", "The Kingdom of Damot was probably the carliest of these states. It seems to have existed as early as the Aksumite period over an extensive territory. On the arrival of the Mecha Oromo parts of the population of Damot fled across the Abay to South Gojjam.the district they settled still called Damot.", "", 0, 1, this.f590b));
        arrayList.add(new questions("35.", "Which one of the following is correct about traditional Oromo religion? ", 0, 0, 0, 0, 0, "The pilgrimage to the Abba Muda formed an important feature of the religion.", "It is polytheistic since it believed in the existence of many gods.", "Its religious experts did not have influence over political matters. ", "Its religious experts called Qallu were recruited from the gada class in power ", "Oromo followed a traditional religion of their own in which they worshipped one chief god called Waqa. In this religion the Qallus served as high priests or links between the Oromo people and the Waqa ", "", 0, 1, this.f590b));
        arrayList.add(new questions("36.", "What was common to the Muslim Sultanates that emerged in southeast Ethiopia during the medieval period?", 0, 0, 0, 0, 0, "Their ruler enjoyed both political and religious power. ", "Their economy was dependent on pastoralism", "Their political institutions were copied from the Christian state.", "Their ruling classes were descendants of Arabs from Yemen. ", "The Muslim states or the sultanates emerged in the south east Ethiopia during the medieval period were what makes them similar were that all of them ruled by the leader who had both the political and religious power.", "", 0, 1, this.f590b));
        arrayList.add(new questions("37.", "The Industrial Revolution appeared first in Britain because", 0, 0, 0, 0, 0, "Britain had easy access to cheap slave labor in Africa", "Britain had a strong state that led the industrialization project ", "Britain had a large number of coal mines and iron deposits.", "Britain had a large number of university graduates in engineering", "The Industrial Revolution began in Great Britain because Britain had problems. large numbers of coal and iron deposites", "", 0, 1, this.f590b));
        arrayList.add(new questions("38.", "Which one of the following is true about role Great Britain played in the Trans-Atlantic Slave Trade?", 0, 0, 0, 0, 0, "Britain had never been involved in the Atlantic Slave Trade; rather it was at the forefront of the movement to abolish it.", "Britain was opposed to the interception of slave ships with cargos of salves on the grounds of human rights.", "Portuguese monopoly over the business of the slave trade had been taken  over by Britain since the early 19th", "Britain was actively involved in the slave trade particularly in the 18th century.", "British was actively involved in the Slave trade particularly in the 18th century but, it was the one of the earliest to declare the slave trade is was illegal.", "", 0, 1, this.f590b));
        arrayList.add(new questions("39.", "Who were the Rozwi in 17th century Zimbabwe? They were the ", 0, 0, 0, 0, 0, "founders of the Changamire state in Zimbabwe.", "builders of the great stone walls of Zimbabwe. ", "first Shona immigrants who settled in Zimbabwe.", "Collaborators who welcomed the Portuguese into Zimbabwe. ", "Rozwi, former KarangaEmpire in southern Africa. The empire was probably established by Changamire who conquered some of the most fertile and mineral-rich areas and drove the Portuguese from their marketplaces in the Zambezi River valley in the 1690s.", "", 0, 1, this.f590b));
        arrayList.add(new questions("40.", "Which of the following is correct about provincial governors in the kingdom of Shawa during the 19th century? ", 0, 0, 0, 0, 0, "They were autonomous to the extent of conducting independent foreign dealings.", "They were chosen and appointed by the Shawan king and were answerable to him. ", "They had to be recognized warriors and have noble origin to assume that position.", "They had to be elected by peoples of the provinces where they would be assigned. ", "The provincial governor of the kingdom of Shawa in the 19th century were autonomous to the extent of conducting independent foreign relationship. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("41.", "What was the consequence of the British occupation of Egypt (1882) on the pace of colonization in the continent of Africa?", 0, 0, 0, 0, 0, "The French intensified their own colonial conquest in other parts of Africa.", "It motivated the British to add more territories in other parts of Africa.", "It provided a model on how to colonize more territories in Africa peacefully.", "It provoked the newly unified states of Germany and Italy to react against British colonialism. ", "The British Occupation of Egypt in 1882 on the pace of colonization in the continent of Africa lead to the intensification French colonial conquest in other part of Africa.", "", 0, 1, this.f590b));
        arrayList.add(new questions("42.", "The collapse of the kingdoms of Ghana and Songhay came about as a result of", 0, 0, 0, 0, 0, "rivalry between Muslims and indigenous religious follower. ", "invasions by external powers", "decline in rainfall and agriculture ", "internal succession struggle", "The collapse of the kingdoms of Gahanna nad Songhai came as a result of invasion of external powers.", "", 0, 1, this.f590b));
        arrayList.add(new questions("43.", "Which of the following was among basic causes of the First World War?", 0, 0, 0, 0, 0, "The completion of the Unification of ", "The murder of the Austrian Crown Prince Germany", "The global rivalry among imperialist powers ", "Serbia's occupation of Bosnia-Herzegovina", "The basic cases of WWI was the global rivalry among imperialist powers.", "", 0, 1, this.f590b));
        arrayList.add(new questions("44.", "The Hewet Treaty of 1884 provided that Massawa shall be ", 0, 0, 0, 0, 0, "open and free for Ethiopia", "restored to Ethiopia", "handed over to Mahdist Sudan ", "Placed under Italian protection", "On June 3, 1884 Yohannis signed treaty of Hewett at Adwa. It had seven articles. Among these articles, the first three articles were significant articles which stated to be done on both sides. Article 1 Egypt would give a free transit of Massawa to the government of Ethiopia.", "", 0, 1, this.f590b));
        arrayList.add(new questions("45.", "What did Hitler hope to get from signing the Nazi-Soviet Non- Aggression Pact of 1939?", 0, 0, 0, 0, 0, "Avoid fighting on two fronts in cases the conflict developed into a full-scale war.", "Using Russian naval bases in any future confrontation with Britain. ", "Frightening Mussolini so that he remains faithful to him all along. ", "Secure Russia's intervention in case Germany is attacked by France", "Hitler hope to signing the Nazi-Soviet Non-aggression pact in 1939 to avoid fighting on two fronts in the cases of the conflict developed into a full scale war.", "", 0, 1, this.f590b));
        arrayList.add(new questions("46.", "Which of the following was NOT among the major demands of nationalist movements that had spread across the African continent in the period between the two world wars?", 0, 0, 0, 0, 0, "An end to land alienation", "Better representation in government ", "Equal opportunities in business", "An end to colonialism and colonial rule", "the major demand of the nationalist movements that spread across the African contents in the period between the two world wars are an end of land alienation; better representation in the government and equal opportunities in the business.", "", 0, 1, this.f590b));
        arrayList.add(new questions("47.", "During the Battle of Britain, the major target of German military strike was ", 0, 0, 0, 0, 0, "British navy and its submarines", "British ground forces and their camps ", "British planes and airfields", "British commandos and the Special Force ", "During the battle of Britain the major target of Germany military strike was the British naves and submarines.", "", 0, 1, this.f590b));
        arrayList.add(new questions("48.", "How did rulers such as Kumsa Moroda of Leqa Naqamte and Aba Jiffar II of Jimma successfully maintain their local autonomy in the aftermath of Shoan expansion to the south?", 0, 0, 0, 0, 0, "By showing their military muscle through firm resistance ", "Through the treaties of friendship they signed with European powers.", "Through the intervention of missionaries operating in those regions. ", "Through peaceful submission rather than going to destructive wars ", "the rulers such as KumssaMoroda of LeqaNaqamte and Abba Jiffar II of Jimma successfully maintained their local autonomy in the aftermath of the Shoan expansion to the south were through peaceful submission rather than going to destructive wars.", "", 0, 1, this.f590b));
        arrayList.add(new questions("49.", "Which of the following is NOT true about independent Indonesia under the rule of President Sokamo?", 0, 0, 0, 0, 0, "It was a member of the Non- Aligned Movement.", "It was a member of NATO military alliance. ", "It was predominantly inhabited by Muslims.", "The republic was largely against western Imperialism ", "Indonesia, in the Pacific region of Spice Islands a colony of Netherlands. It was a member of non-Aligned Movement, it was inhabited by Muslim it was also anti-western imperialism. predominately", "", 0, 1, this.f590b));
        arrayList.add(new questions("50.", "What did the state of Israel achieve in the Camp David Agreement of September 1978?", 0, 0, 0, 0, 0, "It reduced one militant enemy from the anti-Israel Arab alliance. ", "It gained sovereignty over both East and West Jerusalem for the first time.", "It got the PLO outlawed & denied representation in Arab countries.", "It gained access to the Gulf Aqaba and the territory of the West Bank. ", "The Camp David Accord was signed on September 18, 1978, between Egypt and Israel and a Treaty was signed between them on March 26,1979; it reduced one military enemy (Egypt) from the anti-Israeli Arab Alliance.", "a", 0, 1, this.f590b));
        arrayList.add(new questions("51.", "How did Haile Selassie's government react to the famine that afflicted northern Ethiopia in the 1970s?", 0, 0, 0, 0, 0, "It tried the best it could to control the famine.", "It appealed to the international community for aid. ", "It introduced resettlement of peasants as a solution.", "It kept the matter secret as much as possible. ", "The government of Haileselassie reacted to the famine that affected the Northern Ethiopia in 1970 by keeping the matter secret as much as possible. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("52.", "Which of the following is the first measure supposed to be taken by the UN security Council in the event of aggression of one country by another?", 0, 0, 0, 0, 0, "Taking military action against the aggressor ", "Taking the matter to the international court of Justice", "Calling upon the permanent members of the council to do anything in their power", "Imposing economic sanctions of the aggressor ", "The first measure supposed to be taken by the UN Security Council in the event of aggression of one country by another is imposing economic sanctions on aggressors.", "", 0, 1, this.f590b));
        arrayList.add(new questions("53.", "Which one of the following was the immediate cause of the formation of a Kuomintang/ KMT government on the Island of Formosa? ", 0, 0, 0, 0, 0, "The military defeat the KMT suffered at the end of the Chinese Civil War.", "Japanese invasion of the Chinese territory of Manchuria. ", "The breakup of the joint Front between the CCP and the KMT.", "The Russian intervention in the Chinese Civil war in support of Communists.", "the immediate causes of the formation of a Komintang /KMT government on the island of Formosa was the military defeat the KMT suffered at the end of the Chinese civil war.", "", 0, 1, this.f590b));
        arrayList.add(new questions("54.", "In the November 1969 issue of the student paper\" struggle,\" the student activist Walelign Makonnen called for an end to:", 0, 0, 0, 0, 0, "exploitation by landlords ", "absolute monarchy", "the melkegna- gebbar system ", "national oppression", "in the Nov, 1969 issues of the student paper Struggle the student activist Walelign Mokennen called for an end to absolute monarchy.", "", 0, 1, this.f590b));
        arrayList.add(new questions("55.", "In which of the following battle fields did Ethiopian forces achieve victory over Italian forces immediately before Adwa? ", 0, 0, 0, 0, 0, "sa'ati and Dogali ", "Amba Alage and Mekelle", "Amba Alage and Maichew ", "Dogali and Adigrat", "At the battles of Saatii and Dogali the Ethiopian forces achieved victory over Italian forces immediately before the battle of Adwa.", "", 0, 1, this.f590b));
        arrayList.add(new questions("56.", "What was DuBioi's vision regarding the future of black Africans living outside the continent of Africa?", 0, 0, 0, 0, 0, "Blacks should continue struggling for their rights wherever they live.", "Blacks should return to mother Africa so as to live in peace and fraternity.", "Blacks should start a war to fight racial discrimination. ", "Black organizations should demand that Westem governments support the anti-colonial struggle. ", "Du Bois vision regarding the future of Black African living outside Africa was that it should return to mother Africa so as to live in peace and fraternity.", "", 0, 1, this.f590b));
        arrayList.add(new questions("57.", "Which of the following is true about the use of currency in long- distance trade in nineteenth-century Ethiopia? ", 0, 0, 0, 0, 0, "Amole (salt) bars were the only acceptable currency", "Amole was used for import trade and maria Theresa dollars for export trade", "The currency in use varied from place to place", "Currencies were not important because trade was mostly conducted through bartering ", "In the 19th C there no uniform use of a single medium of exchange. The barter, complemented with the use of currency or other medium of exchange, such as salt bar (amole). Maria Theresa currency, first introduced in the late 18th C.", "", 0, 1, this.f590b));
        arrayList.add(new questions("58.", "In which of the following regions did Menelik negotiate peaceful submission successfully? ", 0, 0, 0, 0, 0, "Leqa-Naqamte", "Kaffa", "Harar ", "Wolayta", "Among the Oromo states The LeqaNeqemte was peacefully submitted to the Menilik army by the end of 19th century.", "", 0, 1, this.f590b));
        arrayList.add(new questions("59.", "Why did Britain and France stand on the side of Turkey in the Crimean War of 1854-55 ", 0, 0, 0, 0, 0, "Because of the friendship of the rulers of the two countries with the Turkish ruler", "Due to fear of Russian expansionism", "To support a weak country against a powerful enemy", "In order to build a Catholic, Protestant and Muslim alliance against Orthodox Christianity a basic cause of the First", "the Britain and French stand on the side of Turkey in the Crimean war of 1854-1855 due to fear of Russian expansion. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("60.", "Which of the following CAN NOT be t World War (1914-1918)? ", 0, 0, 0, 0, 0, "Imperialism ", "Nationalism", "Militarism", "Racism", "The basic causes of WWI(1914-1918) were militarism, imperialism an nationalism in Europe. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("61.", "Which of the following was characteristic of both fascism in Italy and Nazism in Germany?", 0, 0, 0, 0, 0, "Strong government ", "Preference for religion over science", "Concern for ordinary people ", "Extreme nationalism", "There are many definitions of fascism and Nazism they are authoritarian and promotes nationalism at all costs, and extreme nationalism. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("62.", "Why did the Chinese Communist Part (CPC) launch what is called \"The Lone March\" in 1927?", 0, 0, 0, 0, 0, "To protest the coming to power of Chiang Kai-shek ", "To link up with Russian revolutionaries from northern China", "To find a good base for a nationalist fight against the Japanese ", "Because communists were attacked by the Kuomintang ", "Mao led his troops for 6,000 miles to northwestern China and reached the last surviving Communist base. This march became known as the Long March. The Long March took one year. The march was to escape from the attack of the KMT. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("63.", "In what ways did African resistance to colonialism manifest itself prior to WWII?", 0, 0, 0, 0, 0, "Through peaceful petitioning for justice and equality", "In the form of armed liberation movements ", "Through a combination of force and peaceful petitioning", "Through withdrawal and refusal to engage colonial governments. ", "Africa resistance prior WWII manifested through both the combinations of forces and peaceful petitioning. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("64.", "Where and on what date was the establishment of the UNO agreed upon in principle?", 0, 0, 0, 0, 0, "In London, in 1941", "In Washington, in 1944", "In Tehran, in 1943", "In Yalta, in 1945", "In October 1944, a scheme for the establishment of an international security organization was discussed at Dumbarton Oaks Conference held in Washington. The next step in this direction was the Yalta Conference held in 1945 in which the U.S. President Roosevelt, the British Prime Minister Churchill and the Soviet Prime Minister Stalin", "", 0, 1, this.f590b));
        arrayList.add(new questions("65.", "What was the principal strategy which Zionism used to create a Jewish state in Palestine?", 0, 0, 0, 0, 0, "Increase the size of the Jewish population through immigration ", "Organize armed insurgency to end foreign rule", "Obtain legal status for Jews in Palestine through the UN ", "Convert the Arab population of Palestine to Judaism", "Zionism was established with the political goal of creating a Jewish state in order to create a nation where Jews could be the majority, rather than the minority which they were in a variety of nations in the diaspora.", "", 0, 1, this.f590b));
        arrayList.add(new questions("66.", "What was the US initiative to rebuild the economies of post-war Europe called?", 0, 0, 0, 0, 0, "The Marshall Plan ", "The Cold War", "The Truman Doctrine", "Détente", "The Marshall Plan (officially the European Recovery Program, ERP) met to resolve to call for a session of the United Nations. was an American initiative passed in 1948 to aid Western Europe, in which the United States gave over $12 billion (nearly $100 billion in2018 US dollars) in economic assistance to help rebuild Westem European economies after the end of World War II. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("67.", "What was the difference between \"The First\" and \"The Second\" Russian Revolutions?", 0, 0, 0, 0, 0, "The former was revolutionary while the latter was reformist ", "The former was led by foreign born revolutionaries while the latter was led by Russian born activists ", "The former was a bourgeois revolution while the later was a working-class revolution. ", "The former was socialist while the latter was communist in nature.", "The differences between the first and second Russian Revolution of 1917, the first of which, in February (March, New Style), overthrew the imperial government and the second of which, in October (November), placed the Bolsheviks in power.", "", 0, 1, this.f590b));
        arrayList.add(new questions("68.", "Which of the following issues did the makers of the 1960 coup attempt highlight in their criticism of Haile Selasse's government? ", 0, 0, 0, 0, 0, "The oppression of nationalities", "The lack of democratic reforms ", "The backwardness of the country", "The Emperor's domination of government ", "Impatient with the rate or form of social and political change, several groups conspired to launch a coup d'état on December 13, 1960, while the emperor Haile Selassie was abroad on one of his frequent trips.", "", 0, 1, this.f590b));
        arrayList.add(new questions("69.", "Which one of the following best explains the downfall of the Zagwe dynasty?", 0, 0, 0, 0, 0, "Internal power struggle within the dynasty. ", "The loss of revenue from international trade", "The shortage of money due to large scale building of churches. ", "Decline in agricultural productivity due to over cultivation of the", "Many reasons contributed to the downfall of the Zagwe dynasty. The first one was problem of succession to the throne among the Zagweprinces. Most of the time they settled this issue by force of arms. They could not be able to arrange a smooth succession to the throne. Secondly, there had been strong opposition to the Zagwe kings throughout their rule. This opposition was from the regions of Tigray and Amhara.", "", 0, 1, this.f590b));
        arrayList.add(new questions("70.", "Which of the following is correct about the Omotic languages? soil. ", 0, 0, 0, 0, 0, "The presence of languages such as Shinasha in Gojjam demonstrates that northwestern Ethiopia was the original home of proto-Omotic ", "Their name comes from the fact a large number of these languages are spoken in the Omo valley.", "The speakers of this language tend to have greater internal differentiation compared to the Semitic and Cushitic groups.", "The fact that some of them are spoken by as few as 500 people shows the limited interaction among speakers of these languages. ", "The speakers of Omotic language are mainly found in the Omo river valley in the South part of Ethiopia. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("71.", "Which one of the following correct about early Christianity? ", 0, 0, 0, 0, 0, "Its greatest strength was the absence of theological divisions within its members.", "Its slow growth was due to its inability to develop an efficient organization.", "Its early followers were Jews from Palestine and Syria ", "Its success can be explained by the support that it received from the Roman Senate and monarchs", "The earliest followers of Jesus were composed principally from apocalyptic Jewish sects during the late Second Temple period of the 1st century. They were Jewish Christians, who strictly adhered to the Jewish from Palestine and Syria.", "", 0, 1, this.f590b));
        arrayList.add(new questions("72.", "Where did pan- Africanism originate as an idea? ", 0, 0, 0, 0, 0, "In various places in Africa among African nationalists", "In Europe among African students and exiles", "In America and the Caribbean among the African Diaspora ", "In both Africa and Europe at about the same time", "Pan Africanism emerged as a distinct political movement initially formed and led by people from the Diaspora.Du Bois who convened the first Pan African Congress in 1919, in Paris, France.", "", 0, 1, this.f590b));
        arrayList.add(new questions("73.", "The Indus Valley Civilization collapsed because of", 0, 0, 0, 0, 0, "The destructions brought by the invading Indo-Aryan peoples.", "The combination of internal peasant rebellion and Dravidian invasions.", "The cultural decline that followed the replacement of Buddhism by Hinduism.", "The decline in the agricultural potential of the region due to resource degradation. ", "The collapse of the Indus Valley Civilization was caused by climate change, was the main cause for climate change, while others conclude that a great flood struck the area.", "", 0, 1, this.f590b));
        arrayList.add(new questions("74.", "What difference existed between Renaissance scholars in Italy and those in Northern Europe? ", 0, 0, 0, 0, 0, "The former criticized the superstitions and ignorance they saw in the church while the latter ignored it.", "The former received patronage from the Italian Princes while the latter were supported by their churches. ", "The former where devoted to the study of classical literature while the latter emphasized critical study of the Bible.", "The former concerned themselves with finding ways of addressing injustice and poverty while latter focused on the issue of salvation. ", "The Northern Renaissance was similar to the Italian Renaissance. It also was interested in the ancient past and believed that it was a guide to the present day. However, the Northern Europe Renaissance was much more religious in its nature than the Italian Renaissance.", "", 0, 1, this.f590b));
        arrayList.add(new questions("75.", "What was the systemic contradiction that led to the outbreak of the American Civil War (1861-1865)?", 0, 0, 0, 0, 0, "The election of Abraham Lincoln as President of the United States of America", "The election of Colonel Jefferson Davis as president of the Confederacy", "The existence of slave ownership within a democratic state", "The ideological conflict between the Democratic and Republican parties ", "The a systematic causes that lead to the outbreak of American Civil War was fought over the moral issue of slavery. In fact, it was the economics of slavery and political control of that system that was central to the conflict. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("76.", "What the main source of threat to the political autonomy of the states of Bela Shangul in the 19th century?", 0, 0, 0, 0, 0, "The out migration of their population to adjoining territories which threatened the very survival of the states", "The abundance of natural resources such as gold which attracted the unwanted attention of foreign powers. ", "The presence of malaria and livestock disease which limited population density and the production of surplus.", "The spread of Islam from the Sudan which resulted in a growing confrontation between the majority tradition religion followers and the Muslims.", "The main source of threat to the political autonomy of the states of Benishangul in the 19th century was the abundance of natural resource which attracted the foreign forces.", "b", 0, 1, this.f590b));
        arrayList.add(new questions("77.", "What is the \"Social contract\" that John Locke wrote about in his book?", 0, 0, 0, 0, 0, "The mandate that a people give their governments to protect their spiritual life.", "The duties of a government to establish universal education to all people to make them progressive citizens. ", "The duties of a government to protect the life and property of a population in return for allowing it to govern. ", "A written constitution that should be legislated by elected representatives of the people.", "Locke's political theory was founded on social contract theory. He Locke believed that human nature is characterised by reason and tolerance. Like Hobbes, Locke believed that human nature allowed people to be selfish. central assertion that social contract theory approaches is that law and political order are not natural, but human creations. The social contract and the political order it creates are simply the means towards an end the benefit of the individuals involved-and legitimate only to the extent that they fulfill their part of the agreement", "", 0, 1, this.f590b));
        arrayList.add(new questions("78.", "What kind of conflict emerged within the ruling elite of the Muslim states following their conquest by Made- Tsion?", 0, 0, 0, 0, 0, "Differences on whether or not to push against the lowland pastoralists ", "Conflicts between moderates and militants over the issue of loyalty to the Christian state.", "Conflicts on the issue of whether or not to form an alliance with the Yemenese ruling class. ", "Differences on whether or not to accept complete assimilation to the Christian state.", "the conflict emerged within the ruling elites of the Muslim states following their conquest by Made Tsion difference on whether or not accept complete assimilation to Christian ruling class.", "b", 0, 1, this.f590b));
        arrayList.add(new questions("79.", "Which of the following was an immediate outcome of the expansion of Menilik 1l to the south? ", 0, 0, 0, 0, 0, "Menilik's submission to Yohannis IV", "The establishment of Neftegna- Gebbar relations ", "The fixing of Ethiopia's borders with Mahdist Sudan", "Ethiopia's access to the sea", "The immediate outcome of the expansion of Minilik II to the south was the establishment of the Neftegna-Gebbar relationships. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("80.", "Which one of the following best describes the nature and consequences of interaction between the Oromo and other Ethiopian populations during their movement? ", 0, 0, 0, 0, 0, "The interaction was primarily one-way with the Oromo assimilating all the societies they came into contact with. ", "The interaction was reciprocal with the Oromo and the people they came into contact with influencing each other's cultures.", "The interaction was peaceful with the Omotic- speaking peoples while it continued to be hostile with the Semitic-speaking groups.", "The interactions weakened Oromo pastoral values and the gada system and led to the erosion of their culture. ", "As a result of the movement and expansion the Oromo were able to settle in new areas both within the Ethiopian region and elsewhere outside the interaction was reciprocal with Oromo and other they came to contact.", "", 0, 1, this.f590b));
        arrayList.add(new questions("81.", "Which one of the following is correct about the Absolutist stat in Russia under Peter the Great?", 0, 0, 0, 0, 0, "It was strengthened by the absence of power struggle within the dynasty. ", "It saw the improvement of the condition of the peasants through the introduction of a rational administrative system. ", "It was much weaker than the other absolutist states in Europe due to the strength of the local bourgeoisie.", "It was characterized by the consolidation of the poser of the monarchy over the nobility.", "Peter the Great was a Russian czar in the late 17th century who is best known for his extensive reforms in administrative system an attempt to establish Russia as a great nation. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("82.", "Which one of the following was common to the states of Wolayita and Yem?", 0, 0, 0, 0, 0, "In both cases the ruling dynasty claimed descent from the old Omotic state of Enariya.", "They paid tribute to the Christian state with horses.", "They were both highly centralized states.", "Their economy depended on pastoralist in the lowlands and in the highlands agriculture", "Both Walaytaand Yemwas mentioned as one of the areas paying tribute to the Christian king Yeshaq (r. 1413-1430).They paid tribute in house", "", 0, 1, this.f590b));
        arrayList.add(new questions("83.", "An important lesson world powers had drawn from the First World War was the need for", 0, 0, 0, 0, 0, "a customs union to enhance economic cooperation in Europe ", "a global organization to support the poor nations of the world", "establishing military organizations to safeguard world peace ", "a global organization to promote the rule of law and world peace", "the most important lesson world had drown from WWI W was the need for establishment of global organization to prompt the rule of law and world peace. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("84.", "The argument the British used to stay in control of Ethiopia's finance, military and foreign relations in the First Anglo-Ethiopian Agreement of 1942 was", 0, 0, 0, 0, 0, "Ethiopia should be incorporated into the British Commonwealth.", "Somali nationalism in the South is still a threat to Allied military success. ", "There was a threat of communist expansion to the Horn.", "WWII was not yet over and Djibouti is still under the Vichy government of France.", "In 1942 the first Anglo- Ethiopian Treaty was allowed British to Korea, and Vietnam. exercise considerable authority in Ethiopia and made Ethiopia dependent. British took the position of administrative hierarchy, advisory, controlled the financial system. The second world war was not still end and France also occupied Djibouti.", "", 0, 1, this.f590b));
        arrayList.add(new questions("85.", "The official justification of President Harry S. Truman of the United States for dropping Atomic bombs on Japanese cities in August 1945 was that", 0, 0, 0, 0, 0, "the bombs would hasten the final surrender of Japan ", "America must show its military muscles to the USSR", "the bombs would lay the groundwork for American hegemony in the east.", "a possible trade war with Japan and China could be avoided through a show of force.", "The official justification of president H.S. Truman of USA for dropping atomic bombs on Japanese cities in August 1945 was that American must show its military muscles to the USSR.", "", 0, 1, this.f590b));
        arrayList.add(new questions("86.", "Which of the following is correct about the British anti-Fascist force under General Plat? ", 0, 0, 0, 0, 0, "It faced the strongest resistance from the Italian troops camped at Asmara. ", "It faced the strongest resistance from the Italian stronghold of Keren.", "It faced the strongest resistance from the Patriotic forces in Gojam and Gondar.", "It started military advance from Kenya and marched all the way through Addis Ababa.", "The British brigades led by General Platt made an offensive against fascist force in Eretria (Asmara). ", "", 0, 1, this.f590b));
        arrayList.add(new questions("87.", "The American policy of \"containment\" in the post WWII period was aimed at", 0, 0, 0, 0, 0, "providing financial assistance to communist countries. ", "blocking the expansion of communism to the west.", "providing financial assistance to Western Europe.", "protecting Israel from a possible Arab aggression.", "Containment was a United States policy using numerous strategies to prevent the spread of communism abroad. A component of the Cold War, this policy was a response to a series of moves by the Soviet Union to enlarge its communist sphere of influence in Eastern Europe, China.", "", 0, 1, this.f590b));
        arrayList.add(new questions("88.", "Which of the following came as a setback to the divisive activity’s colonialists in Eritrea in the 1890s? The fact that of Italian", 0, 0, 0, 0, 0, "Ras Alula got back his governorship of Massawa and the Red sea coast. ", "Ras Mengesha signed the so called Mereb Convention with the Italians. ", "Dej Bahta Hagos started a peasant rebellion against the Italians.", "Ras Mekonen refused to go to Rome for the ratification of the Treaty of Wuchale.", "Dejach Bahata Hagos of AkaluGazay against Italians was another challenge for the Italians or came as setback to the divisive activities of Italian colonialist in Ertrea in 1890s.", "", 0, 1, this.f590b));
        arrayList.add(new questions("89.", "A major reason why donor/aid money did not bring about meaningful and sustainable development for Africa so far is that", 0, 0, 0, 0, 0, "most of the aid money has been spent in towns and political headquarters. ", "most of the aid money was budgeted for salaries to be paid for foreign staff. ", "most of the aid money went to the individual pockets of African dictators.", "organizations with aid money gave very little attention to political stability. ", "Major reason why donors/ aid money did not bring about meaningful and sustainable development for African so far is that most of the aids money went to individual pockets of African dictators.", "", 0, 1, this.f590b));
        arrayList.add(new questions("90.", "How was the issue of slavery a crucial factor in the American Civil War (1861-1865)? ", 0, 0, 0, 0, 0, "By causing the war", "By strengthening the Unionist army ", "By discrediting the Confederate forces in the south ", "By creating divisions both among the Unionist and Confederate forces", "the issue of Slavery played the central role during the American Civil War. The primary catalyst for secession was slavery, especially Southern political leaders' resistance to attempts by Northern antislavery political forces to block the expansion of slavery into the western territories. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("91.", "What was the role of the Papacy in Rome in the Unification of Italy? ", 0, 0, 0, 0, 0, "That of neutrality on the issue ", "That of opposition to unification", "That of active support for unification ", "That of frequent shift of stand on the question", "Italian forces took over the last part of a territory known as the Papal States who opposed the unification of Italy. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("92.", "What was the role of the Papacy in Rome in the Unification of Italy? ", 0, 0, 0, 0, 0, "That of neutrality on the issue", "That of opposition to unification ", "That of active support for unification", "That of frequent shift of stand on the question ", "Italian forces took over the last part of a territory known as the Papal States who opposed the unification of Italy. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("93.", "What was it that strengthened Selti resistance against Shoan expansion under Hassan Enjamo? ", 0, 0, 0, 0, 0, "It did not have enough financial resources ", "It was an organization set up by and for the powerful, not the weak.", "America wanted to use it to advance its foreign policy ", "It did not have offices in America and the major European countries", "Religious revivalism strengthen the Seletresistance against the Shoa expansion under HaasenEnjamo.", "", 0, 1, this.f590b));
        arrayList.add(new questions("94.", "What is the difference between an Absolutist state and a Nation State? ", 0, 0, 0, 0, 0, "The former is culturally diverse while the latter is not", "The former is based on force while the latter is not ", "The former is personal rule while the later is not", "The former is territorially larger than the latter ", "Nation stateis a state in which the great majority shares the same culture and is conscious of it. Absolute state not restricted by any written laws, legislature, or customs. These are often hereditary monarchies. ", "", 0, 1, this.f590b));
        arrayList.add(new questions("95.", "Why is it justified to call the Victory of Adwa (1896) a victory of all black people?", 0, 0, 0, 0, 0, "Because many black people from around the world participated in it", "Because it was the only victory that black people achieved before and after", "Because it showed how black people are actually stronger than white people", "Because it inspired and strengthened the struggle of black people for freedom", "the justification to call the victory of Adawa in1896 a victory of all black people because it inspired and strengthen the struggle of black people for freedom.", "", 0, 1, this.f590b));
        arrayList.add(new questions("96.", "Which of the following did Haile Selasse undertake on his return from exile in 1941?", 0, 0, 0, 0, 0, "Isolate and attack the patriots ", "Pardon and accommodate former collaborators", "Encourage anti British nationalism", "Demand immediate re-union of Eritrea with Ethiopia ", "After Haile Selassie returned to the throne in 1941, Requests for the annexation of Eritrea, which the Ethiopians claimed to be racially, culturally, and economically inseparable from Ethiopia, were received with awareness on the part of the British a growing Eritrean sense of separate political identity ", "", 0, 1, this.f590b));
        arrayList.add(new questions("97.", "What was the main reason for the conflict and bloodshed during the Ethiopian Revolution of 1974-84? ", 0, 0, 0, 0, 0, "Power struggle and lack of the culture of dialogue and compromise", "The cruelty and dictatorial inclinations of Mengistu ", "The ideological difference between the Derg and its revials", "Conspiracy by Ethiopia's traditional enemies ", "The main reason for the conflict and bloodshed between the Derg and its rivals was power struggle and lack of culture of dialogue and compromise.", "", 0, 1, this.f590b));
        arrayList.add(new questions("98.", "Which of the following is true about the patriotic resistance against the Fascist occupation of Ethiopia?", 0, 0, 0, 0, 0, "Ethiopians from all walks of life participated in it", "It look place only in few places in Ethiopia ", "Mostly it operated secretly", "It was led by Emperor Haile Selasse from exile ", "Since fascist occupation national liberation struggle the patriotic resistance was operate mostly in the secret ways.", "", 0, 1, this.f590b));
        arrayList.add(new questions("99.", "What was the primary cause of the Bale Peasant Rebellion in the second half of the 1960s?", 0, 0, 0, 0, 0, "Haile Selasse's autocracy", "Lack of local investment ", "Somali agitation", "Maladministration and injustice", "Bale Peasant Rebellion had deep rooted social and political causes such as grievances stemming from maladministration ", "", 0, 1, this.f590b));
        arrayList.add(new questions("100.", "What was the major outcome of WWII in terms of global distribution of power?", 0, 0, 0, 0, 0, "The emergence of the UN as an independent arbiter of peace", "The end of Japanese rule over Southeast Asia", "The undisputed emergence of the US and the USSR as superpowers", "The independence of European colonics in Asia and Africa.", "The major outcome of WWII in terms of Global pwer distribution the undisputed emergency of USA and USSR as superpower. ", "", 0, 1, this.f590b));
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
        this.f591tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    history2011.this.timer.setVisibility(0);
                    history2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    history2011.this.scr.setVisibility(8);
                    history2011.this.chr.stop();
                    history2011.this.toolbar.setVisibility(8);
                    history2011.this.Relative.setBackgroundColor(-7829368);
                    history2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2011.this.getBaseContext());
                    int unused = history2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = history2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = history2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = history2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = history2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = history2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = history2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = history2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = history2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = history2011.this.highscoreHistory2011 = defaultSharedPreferences.getInt("hist2011hs", 0);
                    int access$600 = history2011.this.part1 + history2011.this.part2 + history2011.this.part3 + history2011.this.part4 + history2011.this.part5 + history2011.this.part6 + history2011.this.part7 + history2011.this.part8 + history2011.this.part9;
                    history2011.this.resultText.setText(String.valueOf(access$600));
                    history2011.this.progressbar.setProgress(access$600);
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
                    int unused11 = history2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = history2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = history2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = history2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = history2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = history2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = history2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = history2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "hist2011hs";
                    int unused19 = history2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = history2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = history2011.this.answered1 + history2011.this.answered2 + history2011.this.answered3 + history2011.this.answered4 + history2011.this.answered5 + history2011.this.answered6 + history2011.this.answered7 + history2011.this.answered8 + history2011.this.answered9 + history2011.this.answered10;
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
                    if (access$600 > history2011.this.highscoreHistory2011) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - history2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1hist111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1hist112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1hist113", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1hist114", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1hist115", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1hist116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1hist117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1hist118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1hist119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1hist1110", 0);
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
                        editor.putString("scorehist111", str3);
                        editor.putLong("date1hist111", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorehist112", str5);
                            editor.putLong("date1hist112", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorehist113", str5);
                            editor.putLong("date1hist113", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorehist114", str5);
                            editor.putLong("date1hist114", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorehist115", str5);
                            editor.putLong("date1hist115", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorehist116", str5);
                            editor.putLong("date1hist116", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorehist117", str5);
                            editor.putLong("date1hist117", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorehist118", str5);
                            editor.putLong("date1hist118", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorehist119", str5);
                            editor.putLong("date1hist119", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorehist1110", str5);
                            editor.putLong("date1hist1110", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datehist111", 0);
                    long j12 = defaultSharedPreferences.getLong("datehist112", 0);
                    long j13 = defaultSharedPreferences.getLong("datehist113", 0);
                    long j14 = defaultSharedPreferences.getLong("datehist114", 0);
                    long j15 = defaultSharedPreferences.getLong("datehist115", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datehist116", 0);
                    long j17 = defaultSharedPreferences.getLong("datehist117", 0);
                    long j18 = defaultSharedPreferences.getLong("datehist118", 0);
                    long j19 = defaultSharedPreferences.getLong("datehist119", 0);
                    long j20 = defaultSharedPreferences.getLong("datehist1110", 0);
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
                        editor2.putString("iScorehist111", str4);
                        editor2.putLong("datehist111", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorehist112", str6);
                            editor2.putLong("datehist112", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorehist113", str6);
                            editor2.putLong("datehist113", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorehist114", str6);
                            editor2.putLong("datehist114", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorehist115", str6);
                            editor2.putLong("datehist115", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorehist116", str6);
                            editor2.putLong("datehist116", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorehist117", str6);
                            editor2.putLong("datehist117", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorehist118", str6);
                            editor2.putLong("datehist118", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorehist119", str6);
                            editor2.putLong("datehist119", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorehist1110", str6);
                            editor2.putLong("datehist1110", l.longValue());
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
                        history2011.this.scr.setVisibility(8);
                        history2011.this.chr.stop();
                        history2011.this.toolbar.setVisibility(8);
                        history2011.this.Relative.setBackgroundColor(-7829368);
                        history2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(history2011.this.getBaseContext());
                        int unused = history2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = history2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = history2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = history2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = history2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = history2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = history2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = history2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = history2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = history2011.this.highscoreHistory2011 = defaultSharedPreferences.getInt("hist2011hs", 0);
                        int access$600 = history2011.this.part1 + history2011.this.part2 + history2011.this.part3 + history2011.this.part4 + history2011.this.part5 + history2011.this.part6 + history2011.this.part7 + history2011.this.part8 + history2011.this.part9;
                        TextView access$1600 = history2011.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        history2011.this.progressbar.setProgress(access$600);
                        history2011.this.progressbar.setMax(100);
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
                        int unused11 = history2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = history2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = history2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = history2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = history2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = history2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = history2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = history2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = history2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = history2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = history2011.this.answered1 + history2011.this.answered2 + history2011.this.answered3 + history2011.this.answered4 + history2011.this.answered5 + history2011.this.answered6 + history2011.this.answered7 + history2011.this.answered8 + history2011.this.answered9 + history2011.this.answered10;
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
                        if (access$600 > history2011.this.highscoreHistory2011) {
                            edit.putInt("hist2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - history2011.this.chr.getBase()) / 1000;
                        String str = "datehist119";
                        String str2 = "datehist118";
                        String str3 = "datehist117";
                        String str4 = "datehist116";
                        String str5 = "datehist115";
                        String str6 = "datehist114";
                        String str7 = "datehist113";
                        String str8 = "datehist112";
                        String str9 = "datehist111";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1hist1110";
                        String str11 = "date1hist119";
                        if (history2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1hist111", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1hist112", 0);
                            long j3 = defaultSharedPreferences.getLong("date1hist113", 0);
                            String str13 = "date1hist113";
                            String str14 = f;
                            String str15 = "date1hist111";
                            long j4 = defaultSharedPreferences.getLong("date1hist115", 0);
                            String str16 = "date1hist115";
                            String str17 = "date1hist114";
                            String str18 = "date1hist116";
                            long j5 = defaultSharedPreferences.getLong("date1hist116", 0);
                            long j6 = defaultSharedPreferences.getLong("date1hist117", 0);
                            String str19 = str11;
                            String str20 = "date1hist118";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1hist112";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1hist114", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1hist117";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1hist118", 0));
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
                                editor3.putString("scorehist111", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scorehist112", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scorehist113", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scorehist114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scorehist115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scorehist116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scorehist117", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scorehist118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scorehist119", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scorehist1110", str25);
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
                            long j18 = sharedPreferences.getLong("datehist1110", 0);
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
                                editor4.putString("iScorehist111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScorehist112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScorehist113", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScorehist114", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScorehist115", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScorehist116", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScorehist117", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScorehist118", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScorehist119", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScorehist1110", str28);
                                    editor4.putLong("datehist1110", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1hist111";
                            String str30 = "date1hist114";
                            String str31 = str11;
                            String str32 = "date1hist112";
                            String str33 = "date1hist117";
                            String str34 = "date1hist115";
                            String str35 = "date1hist116";
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
                            long j21 = sharedPreferences2.getLong("date1hist113", 0);
                            String str40 = str32;
                            String str41 = "date1hist113";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1hist118";
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
                                editor2.putString("scorehist111", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scorehist112", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scorehist113", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scorehist114", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scorehist115", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scorehist116", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scorehist117", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scorehist118", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scorehist119", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scorehist1110", str49);
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
                            long j38 = sharedPreferences3.getLong("datehist1110", 0);
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
                                editor.putString("iScorehist111", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScorehist112", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScorehist113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScorehist114", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScorehist115", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScorehist116", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScorehist117", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScorehist118", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScorehist119", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScorehist1110", str56);
                                    editor.putLong("datehist1110", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        history2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2011.this.scr.setVisibility(8);
                history2011.this.chr.stop();
                history2011.this.toolbar.setVisibility(8);
                history2011.this.Relative.setBackgroundColor(history2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                history2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                history2011.this.scr.setVisibility(0);
                history2011.this.toolbar.setVisibility(0);
                history2011.this.telegram_layout.setVisibility(8);
                history2011.this.chr.start();
                history2011.this.Relative.setBackgroundColor(history2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = history2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = history2011.this.mInterstitialAd = null;
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
                history2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
