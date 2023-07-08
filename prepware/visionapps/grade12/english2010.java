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
import androidx.exifinterface.media.ExifInterface;
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
import p013io.reactivex.annotations.SchedulerSupport;

public class english2010 extends AppCompatActivity {
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
    private Boolean f556b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscore;
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
    RecyclerView recview10;
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
    private Toolbar f557tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2010);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEnglish2010);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f556b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_english2010);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.recview10 = (RecyclerView) findViewById(C2719R.C2722id.questions10);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "It to wanted you today me do. ", 0, 0, 0, 0, 0, "You wanted me to do it today. ", "Today you wanted it me to do. ", "It wanted me today you to do. ", "Me wanted you to do it today. ", "You wanted me to do it today. ", "a", 0, 1, this.f556b));
        arrayList.add(new questions("2.", "in got has house all money new the her she. ", 0, 0, 0, 0, 0, "She has got her money all in the new house. ", "She has all her new money got in the house.", "She has got all her money in the new house. ", "All her money she has got in the new house. ", "She has got all her money in the new house. ", "c", 0, 1, this.f556b));
        arrayList.add(new questions("3.", "planet could on our how that have beyond implications understanding life go far started Earth.", 0, 0, 0, 0, 0, "Understanding how life. started on Earth could have implications that go far beyond our planet. ", "How life started on our Earth could have implications beyond planet that go far. ", "Earth could have understanding implications that go far beyond how our planet started on life. ", "Our planet could have implications how life go far started beyond that understanding on Earth. ", "Understanding how life started on earth could have implications that go far beyond our planet.", "a", 0, 1, this.f556b));
        arrayList.add(new questions("4.", "that anything me don't to like again say. ", 0, 0, 0, 0, 0, "Don't again say like that anything to me. ", "Don't to me say anything like that again. ", "Don't say anything like that to me again. ", "Don't say anything to me like that again. ", "Don't say anything to me like that again (negative imperative)", "d", 0, 1, this.f556b));
        arrayList.add(new questions("5.", "lung pollution is causes why air obvious cancer. ", 0, 0, 0, 0, 0, "Why lung cancer causes air pollution is obvious. ", "Why air pollution causes lung cancer is obvious. ", "Lung cancer causes why air pollution is obvious. ", "Why causes lung cancer air pollution is obvious. ", "Why air pollution courses lung cancer is obvious. ", "b", 0, 1, this.f556b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("6.", "a. such people do it more for pleasure than necessity \nb. weekend is the best time for those who buy essential things for life. \nc. very few people can avoid shopping at least once a week. \nd. for some people, however, shopping has become a daily routine. \ne. shopping is a necessary part of life. \n", 0, 0, 0, 0, 0, "e d b c a", "c d b a e", "e c d a b", "b d c e a", "Using 'e ' as a beginning sentence, the others develop or explain it. ", "a", 0, 2, this.f556b));
        arrayList2.add(new questions("7.", "a. in 1991, the country launched an early- warning system the first in the world and one that has been emulated by countries like Japan. \nb. Mexico’s recent quake occurred 32 years after the city's 1985 shock, which killed about 10,000 people and destroyed 3,000 buildings. \nc. since then, Mexico has worked to shore up its earthquake preparedness. \nd. some had a minute to duck and cover, to grab go bags, to locate their loved ones. \ne. Thanks to sirens and smart phones, thousands of individuals were alerted to the impending quake \nf. Those seconds can mean the difference between life and death. \n", 0, 0, 0, 0, 0, "a e b c f d", "b c a e d f", "c a b d f e", "f a e b d c", "Sentence given under 'b' uses as topic sentences of the paragraph and developed by other supporting sentences c, a, e, d and f. ", "b", 0, 2, this.f556b));
        arrayList2.add(new questions("8.", "a. I knew the journey could be tough but not as bitter. \nb. something more unbearable! My visa application was denied. \nc. I migrated to Egypt in December 2005 dreaming to travel to Australia. \nd. in fact, you have to experience it yourself to see how severe things could be \ne. The weather was indescribably harsh and the police were brutally unfriendly.\n", 0, 0, 0, 0, 0, "c a b e d", "c e d b a", "c e a b d", "d e c a b", "Using 'c as the beginning sentences the order would be e, a, b, d. ", "c", 0, 2, this.f556b));
        arrayList2.add(new questions("9.", "a. It is about cultivating one's mind. \nb. I believe in the power of education \nc. it also doesn't matter what color your skin is. \nd. learning can be the same for anyone--rich or poor. \ne. So, it doesn't matter how much money your father has.\n", 0, 0, 0, 0, 0, "b d e c a", "d a e c a", "b a e d c", "c a e d b ", "'b' I believe in the power of education is the topic sentences explained and elaborated by others. ", "c", 0, 2, this.f556b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("10.", "According to paragraph 2, how much of our soil is getting out of use every six months? ", 0, 0, 0, 0, 0, "1.75 billon tons", "2.50 billon tons", "1.50 billon tons ", "125 billon tons ", "2.5 billion tons of soil is getting out of use every six months. ", "b", 0, 3, this.f556b));
        arrayList3.add(new questions("11.", "Which paragraph could be cited as a good example to show that the continent of Africa has been seriously affected by desertification? ", 0, 0, 0, 0, 0, "Paragraph 1 ", "Paragraph 5", "Paragraph 4", "Paragraph 6", "Paragraph one talks more about desertification that takes place in Africa. ", "a", 0, 3, this.f556b));
        arrayList3.add(new questions("12.", "In relative terms, which one of the following factors contributes more to desertification?", 0, 0, 0, 0, 0, "Cultivation of land unsuitable for farming ", "Increase in the amount of erosion ", "Decrease in land left uncultivated. ", "Decline in vegetation covering the areas ", "Besides others erosion contributes more to desertification. ", "b", 0, 3, this.f556b));
        arrayList3.add(new questions("13.", "Which one of the following sentences best summarizes paragraph2? ", 0, 0, 0, 0, 0, "The world is losing its precious agricultural land at an alarming rate. ", "The amount of cultivable land is decreasing while population remains constant. ", "Soil degradation is a serious problem threatening people in developing countries. ", "The amount of cultivable land population growth are inversely proportional.", "Summary of paragraph two can be seen in line 3. ", "a", 0, 3, this.f556b));
        arrayList3.add(new questions("14.", "What does the phrase, the ink-blot spread of cities (paragraph 3) mean?", 0, 0, 0, 0, 0, "Spread of cities along the main roads ", "Establishment of a city to be followed by another in short distance ", "Establishment of mega cities on farmlands ", "Establishment and spread of cities into the farmland ", "In paragraph three, ink- blot spread refers to the cities established and spread in to the farm land. ", "d", 0, 3, this.f556b));
        arrayList3.add(new questions("15.", "How many Africa countries have specifically been mentioned as those in danger of desertification? ", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "5", "4", ExifInterface.GPS_MEASUREMENT_3D, "The four regions of Africa: Horn of Africa, South - West, Atlantic coast of the Sahara and North Africa have-been mentioned. ", "c", 0, 3, this.f556b));
        arrayList3.add(new questions("16.", "What is the main idea conveyed in paragraph 1? ", 0, 0, 0, 0, 0, "Deserts- affected developing countries more than they did the developed ones. ", "Africa has been more seriously affected by desert than Latin America. ", "The areas outside the rainy equatorial belt have not been affected by deserts. ", "FAO and UNESCO have shown a serious concern about desertification problems.", "The main idea of paragraph one is reflected in line 1 ", "a", 0, 3, this.f556b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("17.", "Which of the following sentences reflects Antonio Guterres’ view towards refugees? ", 0, 0, 0, 0, 0, "People are being persecuted at an unprecedented rate. ", "The world should be more tolerant to those displaced from their homes.", "People who flee conflict and persecution need to be more tolerant. ", "We need to be aware that there is an unprecedented humanitarian response today. ", "Paragraph five lines 1 to 3. ", "b", 0, 4, this.f556b));
        arrayList4.add(new questions("18.", "Why is the United States reluctant to admit Syrian refugees? ", 0, 0, 0, 0, 0, "Because it runs own political interest.", "Because there are terrorists mixed with the refugees. ", "Because it is possible for the refugees to settle with in Syria. ", "Because Republican lawmakers do not trust the refugees. ", "Paragraph six lines 5 and 6. ", "d", 0, 4, this.f556b));
        arrayList4.add(new questions("19.", "According to paragraph 2, which one of the following sentences is NOT true? ", 0, 0, 0, 0, 0, "Compared to the adolescent or the elderly emigrant, children are larger in number.", "The 1.5 million Afghans living in Pakistan do not seem to want to go back home.", "Newly dislocated people in 2014 make up nearly a quarter of the total number of displaced people.", "Relatively a significant number of those who flee their countries fail to find permanent homes. ", "It is not un wanting, but they were unable to go home.", "b", 0, 4, this.f556b));
        arrayList4.add(new questions("20.", "What is the paradox that one can see in paragraph3? ", 0, 0, 0, 0, 0, "Poor countries take more refugees than the wealthy ones. ", "Wealthy countries take more refugees than the poor ones. ", "Wealthy countries were supposed to take more refugees than the poor ones.", "People who flee their own countries eventually land in less developed nations. ", "Paragraph three lines 1 and 2. ", "a", 0, 4, this.f556b));
        arrayList4.add(new questions("21.", "Which countries in paragraph 3 are among those that should take the blame with regard to creating refugees? ", 0, 0, 0, 0, 0, "Syria and Eritrea", "Ethiopia and Kenya", "Britain and France ", "Turkey, Iran and Pakistan ", "Paragraph three line 9 - Syria and Eritrea. ", "a", 0, 4, this.f556b));
        arrayList4.add(new questions("22.", "What made the European Union intensify its search and rescue operations?", 0, 0, 0, 0, 0, "The sharp increase in death of migrants", "The serious demand put to them by the public ", "The increasing number of asylum seekers ", "Their intention to send back new arrivals ", "Paragraph four line 6 ", "d", 0, 4, this.f556b));
        arrayList4.add(new questions("23.", "What does the phrase' fragile countries' (paragraph 1) refer to? ", 0, 0, 0, 0, 0, "Countries located around deserts and seas ", "Countries from where people are persecuted. for some reason ", "Countries that had to host emigrants from other places ", "Countries from where people leave their homes because of war ", "Fragile countries are countries that host or protest emigrants. ", "c", 0, 4, this.f556b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("24.", "Underprivileged or……………... children deserve special consideration. We need to make decisions on how to assist them. ", 0, 0, 0, 0, 0, "disadvantaged ", "uneducated", "inaccessible ", "disabled ", "Disabled - those who have any kind of physical or mental problem. ", "d", 0, 5, this.f556b));
        arrayList5.add(new questions("25.", "I know she is lying, but it is hard to…………her story. ", 0, 0, 0, 0, 0, "disclose ", "dismantle ", "disprove", "discourage", "Disprove - to check if it true. ", "c", 0, 5, this.f556b));
        arrayList5.add(new questions("26.", "I'm meeting Sara at three o'clock to discuss our class schedule. After that, I am playing chess. Oh, .…… I may want something to eat when I get home. ", 0, 0, 0, 0, 0, "after all", "by the way", "whereas", "besides", "After all - finally, at the end. ", "a", 0, 5, this.f556b));
        arrayList5.add(new questions("27.", "No translation; students need to learn to………… what words mean from the way they are used.", 0, 0, 0, 0, 0, "reduce", "introduce", "deduce", "induce", "Deduce- arrive at, reach ", "c", 0, 5, this.f556b));
        arrayList5.add(new questions("28.", "Physical labor can exhaust the body; ………… excessive reading can reduce mental power.", 0, 0, 0, 0, 0, "equally", "incidentally", "regrettably", "sadly", "Equally -in the same way ", "a", 0, 5, this.f556b));
        arrayList5.add(new questions("29.", "The ceremony did not take long; I ………… the statue soon after the coordinator's brief speech.", 0, 0, 0, 0, 0, "unwrapped", "unsealed", "unrevealed", "unveiled", "Unveiled - remove a covering from ", "d", 0, 5, this.f556b));
        arrayList5.add(new questions("30.", "Children using the swimming pool must be by an adult at all times. ", 0, 0, 0, 0, 0, "Accompanied ", "Accorded", "adapted ", "accustomed ", "Accompanied- followed or protected from danger. ", "a", 0, 5, this.f556b));
        arrayList5.add(new questions("31.", "I usually get nervous at the beginning of interview sessions but as time goes, I become ……………... and get back to normal. ", 0, 0, 0, 0, 0, "stable ", "settle", "healthy", "calm", "Calm-quite or silent. ", "d", 0, 5, this.f556b));
        arrayList5.add(new questions("32.", "An increase in the prevalence rate of HIV/AIDS incidence reveals that some people are still ………… to their sexual partners. ", 0, 0, 0, 0, 0, "ungrateful", "unfaithful ", "unkind", "unthankful", "Unfaithful - not faithful to marriage vow. ", "b", 0, 5, this.f556b));
        arrayList5.add(new questions("33.", "As docile is to tamed so is awesome to…………...  ", 0, 0, 0, 0, 0, "grand", "fearful", "blunt", "distasteful", "Grand- is to awe some ", "a", 0, 5, this.f556b));
        arrayList5.add(new questions("34.", "They were two loving sisters. Nobody could tell why they fell ………", 0, 0, 0, 0, 0, "through ", "out", "in", "apart", "Fall out - quarrel ", "b", 0, 5, this.f556b));
        arrayList5.add(new questions("35.", "Adamu was given enough time to his assignment; however, as usual, he came ………... several excuses for failing to do his work.", 0, 0, 0, 0, 0, "across to", "through", "up with", "in", "Come up with - produced several excuses. ", "c", 0, 5, this.f556b));
        arrayList5.add(new questions("36.", "We were not happy with the hotel room we stayed in. Contrary to their advertisement, it was noisy and the views were not nice. We have a…………... claim to be at least partially refunded.", 0, 0, 0, 0, 0, "put out ", "put in", "put up", "put through", "Put in - submit a claim ", "b", 0, 5, this.f556b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("37.", "Actually, she 'takes after' her mother, not her father.", 0, 0, 0, 0, 0, "cares for", "resembles", "remembers", "follows", "Take after resemble, look like. ", "b", 0, 6, this.f556b));
        arrayList6.add(new questions("38.", "The dog 'went for' me when I knocked at their door this morning. ", 0, 0, 0, 0, 0, "attached", "barked", "growled", "grunted", "Phrasal verb' went for' in this context means the dog attacked me. ", "a", 0, 6, this.f556b));
        arrayList6.add(new questions("39.", "We heard the news and 'called off' the meeting. ", 0, 0, 0, 0, 0, "postponed", "cancelled", "held", "chaired", "Called of Canceled ", "b", 0, 6, this.f556b));
        arrayList6.add(new questions("40.", "I always believe it is healthy for everyone to 'repress' their emotions.", 0, 0, 0, 0, 0, "kick out ", "throw out", "throw away ", "hold back ", "Repress- hold back ", "d", 0, 6, this.f556b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("41.", "We all should learn to be more kind……...each other.", 0, 0, 0, 0, 0, "with", "for", "to", "at", "‘To’ means one another. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("42.", "Let's get going; I have…………heard such nonsense.", 0, 0, 0, 0, 0, "ever", "never", "forever", "wherever", "‘Never’ means not at all. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("43.", "The money We collected is………... near enough to cover our expenses. Much more is needed still.", 0, 0, 0, 0, 0, "anywhere ", "everywhere", "nowhere", "somewhere", "“Nowhere” means the money we collected is not enough. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("44.", "How…………. a three-year- old child be expected tie his shoelaces without any help?", 0, 0, 0, 0, 0, "can", "may", "must", "has", "‘Can’ is auxiliary verb that shows someone's ability. ", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("45.", "1 don't choose teaching as my profession, …………. I know teachers have long vacations. ", 0, 0, 0, 0, 0, "therefore", "but", "and", "so", "Here and is used to mean 'because'. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("46.", "I don't understand why she wouldn't lend us one if she…………. two books. ", 0, 0, 0, 0, 0, "has", "has had", "had had", "had", "That is second conditional and simple past (had) is used in the if clause. ", "d", 0, 7, this.f556b));
        arrayList7.add(new questions("47.", "I completely…………...with you; taxi drivers and waiters shouldn’t expect tips. ", 0, 0, 0, 0, 0, "disagree", "have agreement", "disagreed ", "have disagreed ", "Simple present ‘disagree’ is the right answer to express someone's believe or thought. ", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("48.", "Everyone knew about the change in the exam schedule, but………... of them told me about it. ", 0, 0, 0, 0, 0, "some ", "few", SchedulerSupport.NONE, "any", "‘None’ - not anyone of them told me about it. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("49.", "I………. any good films for the last six months. ", 0, 0, 0, 0, 0, "had not seen", "have not seen", "did not see ", "I don't see ", "Present perfect (have+V3) expresses action began in the past and continued up to now /present/. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("50.", "………….. you score an A on this exam; you will not choose to study English in the university.", 0, 0, 0, 0, 0, "Unless", "If not ", "Except", "Because", "In first conditional 'unless' replaces if + negative verb unless you score = If you don't score. ", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("51.", "My mother caught the knife carefully ………….  not to cut herself. ", 0, 0, 0, 0, 0, "so that", "to", "because ", "in order ", "In order not and so as not + to inf are used to express negative purpose. ", "d", 0, 7, this.f556b));
        arrayList7.add(new questions("52.", "The meeting had not begun………... when we arrived.", 0, 0, 0, 0, 0, "already", "yet", "since", "for", "'Yet' is used with negative verb to mean up to now. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("53.", "We have known each other…………. childhood.", 0, 0, 0, 0, 0, "when", "while", "as", "since", "Since + definite time = shows action began in the past at a definite time and continued up to now. ", "d", 0, 7, this.f556b));
        arrayList7.add(new questions("54.", "Guess how long you…………… at school by the end of this year.", 0, 0, 0, 0, 0, "will have been", "have been", "had been", "will be", "Future perfect expresses action that is expected to happen before a certain time (by the end of this year) ", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("55.", "I'm not being superstitious, but you………... something earlier that brought you this bad luck.", 0, 0, 0, 0, 0, "should have to do", "must have done", "might have been doing", "would have done", "Must + have +V3 = uses to express past necessity. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("56.", "There are many occasions when seat-belts save life, yet only………drivers often wear them. ", 0, 0, 0, 0, 0, "few", "a lot of", "a few", "many", "Only a few means few /almost no one/. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("57.", "We must hard ………... to extricate our country from poverty.", 0, 0, 0, 0, 0, "So that", "in order ", "such that", "because", "To, in order to and so as to express positive purpose. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("58.", "…………. we grow older, we care more about what other people think about us.", 0, 0, 0, 0, 0, "While", "Because", "As", "In case of ", "'As' shows definite time to mean 'when' -/ the older we get/ ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("59.", "I was hoping to find some funny stories on your shelf, but I did not see ……….", 0, 0, 0, 0, 0, "many", "any", "a few ", "some", "'Any' is used with negative verb (did not see) to mean I found nothing. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("60.", "Which of the three deserves the school's prize …………?", 0, 0, 0, 0, 0, "best ", "well", "most", "better", "The superlative form of the adjective (best) is the right form to compare the three components.", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("61.", "Nobody would like to go with a ………… ", 0, 0, 0, 0, 0, "team loose", "lost team", "team lost ", "losing team", "It is a team that loses a game because it hasn't made enough training. ", "d", 0, 7, this.f556b));
        arrayList7.add(new questions("62.", "The decision of the committee was fair; they offered the scholarship to all………. students.", 0, 0, 0, 0, 0, "deserving", "deserved ", "deserve ", "deserver ", "'Deserved' is past participle used as adjective to show the effect. ", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("63.", "What an awful thing I thought the weather would be ………… in April, but it actually got ……... ", 0, 0, 0, 0, 0, "worse/ better", "better/worse", "good/better ", "good/worse", "Comparative forms of those irregular adjectives are used. 'Better' to show what I expected the weather would he, but 'worse' to show what happened.", "b", 0, 7, this.f556b));
        arrayList7.add(new questions("64.", "We ………... at the scene when the alarm went off.", 0, 0, 0, 0, 0, "had just arrived", "were just arriving", "have just arrived ", "arrived", "Past perfect - to show the first from two past events. ", "a", 0, 7, this.f556b));
        arrayList7.add(new questions("65.", "By the end of August, we ………… our placement in universities.", 0, 0, 0, 0, 0, "will know", "will have been known", "will have known ", "will be knowing", "Future perfect (will have V3) expresses action expected to happen earlier than a time / by the end of August/. ", "c", 0, 7, this.f556b));
        arrayList7.add(new questions("66.", "The jury had no choice, but to return a verdict of guilty………. with all the evidence. ", 0, 0, 0, 0, 0, "after they presented", "when presented", "as they presented", "while they were presenting", "After means later.", "a", 0, 7, this.f556b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("67.", "Tamrat: do you know who is standing over there? \nLema: ……………………………. \n", 0, 0, 0, 0, 0, "He is very tall, isn't he?", "Who is he talking to?", "No, I don't ", "I met him yesterday,", "The question is if he knows the one standing over there, and the answer is negative.", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("68.", "Chaltu: What begins with T, ends with T and has T in it \nGenet: ……………………………... \n", 0, 0, 0, 0, 0, "Tea party", "teapot", "Tinted pot", "Tantamount ", "It is solution to the riddle. Teapot begins and ends with letter 'T' and the name of the container also begins with 'T'. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("69.", "Aunt: ……………………………….\nLojo: sure.\n", 0, 0, 0, 0, 0, "Give me the bread.", "You will give me the bread.", "I want the bread.", "Pass me the bread, will you? ", "Asking to offer him bread. ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("70.", "Jemal: What do you make of this painting, ‘Jemila’? \nKedija: ………………………………  \n", 0, 0, 0, 0, 0, "Everything ", "Nothing ", "Something ", "Anything", "Nothing means I don't do anything. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("71.", "Getahun: what was your holiday like? \nFetiha: ………………………………... \n", 0, 0, 0, 0, 0, "We liked it very much.", "Kedija came to our house. ", "Rarely so!", "It was nice but the weather was not good. ", "She had a nice holiday /describing what it liked/ ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("72.", "Azeb: have you heard about the MDGS? \nHaben: yes. I have. \nAzeb: Do you think they can be achieved?\nHaben: ……………………………….\n", 0, 0, 0, 0, 0, "I'm not sure they are based on practical experiences. ", "There is abundant research on MDGs. ", "Developed countries are excluded ", "There are people who accept or reject the MDGs. ", "Expressing indirect disagreement or doubt. ", "a", 0, 8, this.f556b));
        arrayList8.add(new questions("73.", "Temesgen: there is an exhibition at the stadium. \nAbera: What's it on? \nTemesgen: Charity \nAbera: It may be interesting. Are you planning to go? \nTemesgen: ……………………... \n", 0, 0, 0, 0, 0, "How do you know? ", "Many people are going. ", "It will surely be interesting. ", "I have a tight schedule, but I may try ", "The person is busy to visit the exhibition, but tries to do it. ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("74.", "Samrawit: Do you know how to make pizza? \nKonjit: ………………………… \n", 0, 0, 0, 0, 0, "It is easy", "No, I don't", "I don't like pizza. ", "yes, I can", "The question is whether she knows how to make pizza or not, and the answer is negative. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("75.", "Husband: There is someone at the door. \nWife: Wait, you had better put your shoes…………………….   \n", 0, 0, 0, 0, 0, "on after you open it", "off before you open it", "on before you open it. ", "off after you open it. ", "Put on your shoes first before you meet the person outside.  ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("76.", "Daniel: I got the job told you about. \nYou: …………………………….\n", 0, 0, 0, 0, 0, "I don't care. ", "Congratulations! ", "That's good news. ", "Jobs are not easy to get these days. ", "Offering words of congratulation. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("77.", "Father: …………………………….\nSon: But it’s good for health. \n", 0, 0, 0, 0, 0, "Physical exercise is good.", "Do you like physical exercise? ", "Is physical exercise good? ", "Physical exercise is tiring. ", "Even though physical exercise is tiring, it is good for health, ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("78.", "Friend: ……………………………\nYou: You should loosen your belt. \n", 0, 0, 0, 0, 0, "I have got stomach ache", "I ate too much", "I am terribly hungry ", "I am starved to death", "Loosen your belt to relax because you over ate. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("79.", "Receptionist: I get mad when. someone rings me up late at night. \nGuest: ………………………………. \n", 0, 0, 0, 0, 0, "Yes, that can be annoying, but you should try to let it upset you.", "No, that can he annoying, but you should try to let it upset you. ", "Yes, that can be annoying, but you should try not to let it upset you. ", "No, that cannot be annoying, but you should try to let it upset you. ", "Advising not to be offended or disturbed by it.  ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("80.", "Amir: They took my money, my credit cards, my passport, everything. \nDano:  …………………………………... \n", 0, 0, 0, 0, 0, "You should see a doctor. ", "Why are you here now? ", "Why not? Go to the police. ", "Oh dear! What are you going to do now? ", "Telling what he should do next. ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("81.", "You: How can I get to the nearest pharmacy, please? \nAhmed: ………………………………….\n", 0, 0, 0, 0, 0, "Why do 'you ask? ", "Go straight and turn right ", "How long have you had this headache? ", "Do you want to see a doctor? ", "telling the right direction to the nearest pharmacy. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("82.", "Nardos: I heard you were the only person to get the job. Well done! \nGirma: ……………………………………...\n", 0, 0, 0, 0, 0, "Thank you", "Sure, I did", "why expected I would not? ", "I knew I did well.", "Expressing thanks for the person's appreciation. ", "a", 0, 8, this.f556b));
        arrayList8.add(new questions("83.", "Fetle; Can we practice solving riddles? \nKassech: Ok. You start. \nFetle: I come once in a year and twice in a week. Who am I? \nKassech: But this is illogical. In a week once, in a year twice! \nFetle: Not all riddles follow logic for their solution. Some encourage you to look for other means. \nKassech: I cannot solve your riddle. \nFetle: ……………………………………… \n", 0, 0, 0, 0, 0, "What's logic? ", "My father used logic in all his activities. ", "Sometimes it is possible.", "The letter ‘e’ now prove that", "That is solution to the riddle. Letter 'e' appears twice in the word `week' and once in 'year'.", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("84.", "Fasil: Are you scared of girls? \nIbrahim: Yes, Fasil…………….  \n", 0, 0, 0, 0, 0, "There are many things to say.", "I can't think of any things to say. ", "I know what to do.", "I have four sisters. ", "Scared means frightened. That is to agree to what has been asked,", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("85.", "Mother: May I ask who can take part in your protect yourself' programs? \nDaughter: Anyone who wants; but …………………  \n", 0, 0, 0, 0, 0, "rarely it is young women", "interested individuals", "mostly it is young women", "you aren't a girl ", "Anyone who wants can take part but mostly young women, ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("86.", "Friend: Your cousin has just told me he's getting married next Week are you very pleased? \nYou: ………………………..., but he could have told me earlier.\n", 0, 0, 0, 0, 0, "I'm absolutely delighted", "No, actually ", "I’m not ", "Where is the wedding to be held ", "Absolutely delighted even though he couldn't have told him earlier, ", "a", 0, 8, this.f556b));
        arrayList8.add(new questions("87.", "Gennet: Our class is planning for a picnic next week. Will you join us? \nChalut: Well, I don't know. I have to get permission from my parents. \nGennet: But try hard. Don't miss it. \nChalut: ……………………………  \n", 0, 0, 0, 0, 0, "I don't miss it. ", "I may come.", "My parents like it very much ", "I miss it.", "The respondent is not sure, but tries to take part or join the class for a picnic.  ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("88.", "Dandir: Is Addis Ababa getting more and more dangerous? People say there are gangs everywhere. \nGemechu: No, no…………………... \n", 0, 0, 0, 0, 0, "It's simply an exaggeration ", "This kind of behavior simply won't be tolerated ", "It' simply a misunderstanding ", "That's simply the best the city can afford", "Expressing disagreement to what has been said. ", "a", 0, 8, this.f556b));
        arrayList8.add(new questions("89.", "Son: Oh no! …………………….. \nFather: I will bring you a mob. \n", 0, 0, 0, 0, 0, "Has the bathroom flooded?", "What has happened? ", "The window is open. ", "The bathroom has flooded.", "The bathroom has flooded, & he is going to use mob to clean it, ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("90.", "Daughter: ……………………………. \nMother: You should go on a diet. \n", 0, 0, 0, 0, 0, "Tell me the best restaurant there. ", "I have no appetite. ", "I am putting on a lot weight.", "I am losing weight. ", "Go on diet means sort of food usually eating to control the body weight. ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("91.", "Agaredech: Global warming and extreme pollution are interconnected. \nBehailu: But some argue that the earth is getting aged. \nAgaredech: While this may have some truth, pollution may have hastened the process. Behailu: Certainly, but there are global efforts to curb pollution. \nAgaredech: …………………………… \n", 0, 0, 0, 0, 0, "There is no pollution in backward countries", "True. But the link between the two should be unequivocally established. ", "Global warming is inevitable. ", "Environmentalists tried to influence big international organizations. ", "But global warning cannot be avoided. ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("92.", "Guest: The kitchen handle has come off. \nYou: Don't worry……………………  \n", 0, 0, 0, 0, 0, "It has never been like that", "You will buy a replacement", "It's none of your business ", "It often does ", "The detachment or separation of the kitchen handle often happens. ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("93.", "Mother: Don't you ever run out into the road like that. You could have been knocked over. \nDaughter: ………………………………\n", 0, 0, 0, 0, 0, "How come that this ever happens to. me? ", "Oh no! Thank you, Mom. ", "What? You could have told me that earlier. ", "Have I ever been knocked over? ", "Expressing agreement to the warning given by her mother. ", "b", 0, 8, this.f556b));
        arrayList8.add(new questions("94.", "Sara: I have such a bad headache that I can't even open my eyes \nHana: …………………………………...\n", 0, 0, 0, 0, 0, "Where is the nearest clinic? ", "Do you often have it? ", "I hate headaches. ", "Perhaps you need some break.", "Expressing advice ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("95.", "Teacher: You did not attend class yesterday, did you? \nStudent: ………………………………... \n", 0, 0, 0, 0, 0, "No, I didn't ", "No, you did", "No, I did", "No, you didn't ", "It is short answer. Negative statement + positive tag = Negative short answer. ", "a", 0, 8, this.f556b));
        arrayList8.add(new questions("96.", "Student 1: Virus attacks are common and the spread of antivirus. might tip the balance towards treating them seriously. \nStudent 2: I cannot follow you. Can you please paraphrase it? \nStudent 1: ……………………………….  \n", 0, 0, 0, 0, 0, "There is always an antivirus available to protect you compute. ", "How does the virus steal your documents? ", "In other words, attention would be given to arresting the effects of the virus. ", "Wanna cry is a virus that steals document in your computer. ", "Re-expressing what has been said using expression 'in other words'. ", "c", 0, 8, this.f556b));
        arrayList8.add(new questions("97.", "Deboch: National exams should not continue. \nTeklu: Probably, you may be right. \nDeboch: Since we cannot do away with exams, regions may need to set their own. \nTeklu: This may be good idea, but there is the issue of standard. \nDeboch: The Federal Ministry may set the basic standards. \nTeklu: ……………………………….  \n", 0, 0, 0, 0, 0, "I hate exams.", "Exams. Set standards. ", "There are ways and methods. ", "Well, I may agree with you. ", "Expressing tentative /partial agreement. ", "d", 0, 8, this.f556b));
        arrayList8.add(new questions("98.", "Guest: What a room service! There is no towel in the bathroom. Could you please bring me one? \nHost: Yes, madam. I will bring me soon. \nGuest: ………………… the shower does not function. Can you please fix it? \nHost: We're sorry, madam. The plumber is no leave. If you don't mind, could you use the common shower next door? \n", 0, 0, 0, 0, 0, "Oh my god! What a curse.", "Alas!", "Terrible! I don't understand.", "Where's the plumber? ", "Expresses the guest's dissatisfaction with the service given.", "a", 0, 8, this.f556b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("99.", "Which one of the following is correctly punctuated? ", 0, 0, 0, 0, 0, "I have never been to England; in fact, I have never been outside this country.", "I have never been to England; in face; I have never been outside this country. ", "I have never been to England; in fact I have never been outside this country. ", "I have never been to England, in fact, I have never been outside this country. ", "Discourse marker ‘infact’ shows emphasing idea, is preceded by a semi colon and followed by a comma.", "a", 0, 9, this.f556b));
        arrayList9.add(new questions("100.", "Which one of the following sentences has correct capitalizations?", 0, 0, 0, 0, 0, "The language I wanted to learn was arabic, not French. ", "The language I wanted to learn was arabic, not French ", "The language I wanted to learn was Arabic, not French.", "The language I wanted to learn was Arabic, not French. ", "Names of languages are capitalized.", "c", 0, 9, this.f556b));
        arrayList9.add(new questions("101.", "\"in the meantime, it is necessary to find other ways of disciplining drug offenders.\"  \nThe above line was taken from the recommendation section of a survey on drug conviction. Which of the following is true about the recommendation?\n", 0, 0, 0, 0, 0, "It is a recommendation forwarded until better actions can be taken.", "This is the major point recommended in the study ", "It is one of the two recommendations in the study. ", "This is recommended to take place immediately. ", "there is a major recommendation suggested but the writer asks to take other way of immediate discipline drug offenders mean time. ", "b", 0, 9, this.f556b));
        arrayList9.add(new questions("102.", "\"of late, drugs have changed American people practice.\" \nThe above line was taken from the introduction section of a study carried out on drug offenders in America. Which of the following sentences should come next to the quoted sentence? \n", 0, 0, 0, 0, 0, "Nations with different penal practices have experienced different crime rates. ", "People were rightly fearful of what cocaine was doing to their children, when they demanded action. ", "It needs to be pointed out that there are no easy Olson 'solutions to drug convictions. ", "In 1987, for example, only about 8 percent of state-prison inmates were serving time on drug convictions. ", "Should come next to the given sentences i.e., \" of late, drugs have changed American penal practice\" ", "d", 0, 9, this.f556b));
        arrayList9.add(new questions("103.", "\"you may not need to write your name.\" where do you find this statement in a survey study?", 0, 0, 0, 0, 0, "It is a reminder written in questionnaire covering letter, ", "It can be one of the items in the questionnaire, ", "It is taken form respondents' personal information. ", "It is taken from a 'thank you' letter written to respondents. ", "It is to inform the respondent as it may not be necessary to mention name.", "c", 0, 9, this.f556b));
        arrayList9.add(new questions("104.", "\"Dressed purposely to confuse her friends in the first week of school, Samrawit wears clothes she would normally never wear. With her new haircut, she really looks like a completely different person.\" These sentences are taken from a piece of writing that is most likely ………………...", 0, 0, 0, 0, 0, "argumentative", "expository ", "description  ", "narrative", "That is narrating or retelling a story. ", "d", 0, 9, this.f556b));
        arrayList9.add(new questions("105.", "Which one the following is taken from a formal letter of application? ", 0, 0, 0, 0, 0, "Thank you for your letter dated 5th April which I received this morning. ", "I am writing in response to the position it assistant advertised in the Monitor.", "I would be grateful if you could confirm your reservation in writing. ", "Sadly, I am not available on the date you suggested. May 1 suggest the 8th of April?", "The source of advertisement and the position you are applying for are mentioned in the opening paragraph of job application letter.", "b", 0, 9, this.f556b));
        arrayList9.add(new questions("106.", "Which of the following contains errors in capitalization, mechanics and punctuation?", 0, 0, 0, 0, 0, "Peter, my elder brother received medals for his contributions Astronomy, chemistry and Mathematics.", "The fire, although it had been burning for several hours, was still blazing fiercely. ", "You should, indeed you must, report the matter to the police. ", "\"When the judge said, 'Not guilty,' I could have hugged him.\" ", "The contrast clause is in between and separated by commas before and after. ", "b", 0, 9, this.f556b));
        arrayList9.add(new questions("107.", "Which one of the following is taken from an informal letter? ", 0, 0, 0, 0, 0, "I would like to apply for the position of assistant secretary. ", "Wish me good luck for my math exam. ", "I enclose my curriculum vitae for your attention. ", "I am writing to complain about the following damages. ", "That is a part taken from a letter written between friends. ", "b", 0, 9, this.f556b));
        arrayList9.add(new questions("108.", "\"... He couldn't understand where he had gone wrong. When he had set out that morning, the weather had been fine...\" The preceding text is possibly taken from a(n) ……………. writing. ", 0, 0, 0, 0, 0, "descriptive ", "expository ", "argumentative ", "narrative", "The sentences are likely taken from a narrative writing ", "d", 0, 9, this.f556b));
        arrayList9.add(new questions("109.", "She crosses the road, trying to figure out how to navigate the town she. has been away from for some fifteen years. This text is taken from a piece of writing that is most likely", 0, 0, 0, 0, 0, "Narrative", "Expository", "argumentative", "description", "It shows what she did step by step", "a", 0, 9, this.f556b));
        arrayList9.add(new questions("110.", "Which one of the following is correctly punctuated? ", 0, 0, 0, 0, 0, "I have tried to sing dozens of times, she says, \"but I can't.\" ", "\"I have tried to sing dozens of times,\" she says, \"but I can't.\" ", "\"I have tried to sing dozens of time, \"she say \"but I can't.\"  ", "\"I have tried to sing dozens of times\" she say, \"but I can't.\" ", "It is how to use comma & quotation marks with direct speech.", "b", 0, 9, this.f556b));
        arrayList9.add(new questions("111.", "\"Your responses' will be held confidentially.\" Which of the following might be good reason for writing the preceding sentence in the first few lines of a survey questionnaire? ", 0, 0, 0, 0, 0, "Appreciating respondents' participation ", "Limiting sample size ", "Increasing response rate ", "Requesting for permission ", "Telling / Informing his responses are confidential, that is to guarantee him.", "c", 0, 9, this.f556b));
        arrayList9.add(new questions("112.", "Which one of the following is correctly punctuated? ", 0, 0, 0, 0, 0, "The meeting ended at dawn, nothing had been decided. ", "The meeting ended at dawn nothing had been decided. ", "The meeting at dawn nothing had been decided. ", "The meeting ended at dawn; nothing had been decided. ", "In a compound’s sentences, two independent clauses are joined by either, but or; ", "d", 0, 9, this.f556b));
        arrayList9.add(new questions("113.", "Which one of the following sentences has correct capitalization? ", 0, 0, 0, 0, 0, "Sara and Hana first met at a school called Learning to Learn. ", "Sara and Hana first met at a school called learning to Learn. ", "Sara and Hana first met at a school called Learning to Learn. ", "Sara and Hana first met at a School called Learning to Learn.", "A and C    are both correctly capitalized. ", "a", 0, 9, this.f556b));
        arrayList9.add(new questions("114.", "\"in his eyes, I could see his desire to redeem himself, a need to hit me more times that I hit him, just for the sake of it.\" This text is taken from a piece of writing that is most", 0, 0, 0, 0, 0, "expository", "narrative", "argumentative", "description", "That is creating mental picture in the mind of the reader. ", "d", 0, 9, this.f556b));
        arrayList9.add(new questions("115.", "\"My coat was on the seat next to me. I took my passport out my pocket and put it in my bag in the luggage rack.\" These lines are taken from a piece of writing that is most likely", 0, 0, 0, 0, 0, "narrative ", "description", "argumentative ", "expository ", "The writer is narrating what he did step by step in their order. ", "a", 0, 9, this.f556b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("116.", "What is the most useful instrument used to gather the survey data displayed in the table? ", 0, 0, 0, 0, 0, "Questionnaire  ", "Observation", "Classroom observation", "interview", "This is response gathered by making interview ", "d", 0, 10, this.f556b));
        arrayList10.add(new questions("117.", "How many instances of use of L 1 can be observed from the data reported in the table? ", 0, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "Writing in local language and translate and out line in local language and write in English. ", "b", 0, 10, this.f556b));
        arrayList10.add(new questions("118.", "From the data in the above table, what proportion of first year university students considered in the survey wrote their essays directly in English? ", 0, 0, 0, 0, 0, "a quarter", "three - fourths", "two-thirds ", "half", "25% of the first-year university students wrote their essays directly in English, so it is a quarter of whole. ", "a", 0, 10, this.f556b));
        arrayList10.add(new questions("119.", "\"Until future study finds a better solution, English teachers should work on how students can be helped to develop their outlines in English into essays.\" \nWhich section of the above survey is the most likely appropriate' place for the preceding statement? \n", 0, 0, 0, 0, 0, "Conclusion", "Data analysis", "Recommendation ", "Methodology", "It is a sentence that recommends a possible solution until a new and better strategy is designed. ", "c", 0, 10, this.f556b));
        arrayList10.add(new questions("120.", "Which of the following is the likely title of the survey from which the data displayed in the above table were extracted? ", 0, 0, 0, 0, 0, "A survey of essays written by first year university students.", "Essay writing strategies as surveyed by first year university students. ", "Essay writing as surveyed by strategies of first year university students. ", "A survey of first year university students essay writing strategies.", "It was a survey made on essay writing strategies.", "d", 0, 10, this.f556b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f557tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2010.this.timer.setVisibility(0);
                    english2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    english2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2010.this.getBaseContext());
                    int unused = english2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = english2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = english2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = english2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = english2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = english2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = english2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = english2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = english2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = english2010.this.highscore = defaultSharedPreferences.getInt("eng2010hs", 0);
                    int access$200 = english2010.this.part1 + english2010.this.part2 + english2010.this.part3 + english2010.this.part4 + english2010.this.part5 + english2010.this.part6 + english2010.this.part7 + english2010.this.part8 + english2010.this.part9;
                    english2010.this.resultText.setText(String.valueOf(access$200));
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
                    int unused11 = english2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = english2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = english2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = english2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = english2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = english2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = english2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = english2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "eng2010hs";
                    int unused19 = english2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = english2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1300 = english2010.this.answered1 + english2010.this.answered2 + english2010.this.answered3 + english2010.this.answered4 + english2010.this.answered5 + english2010.this.answered6 + english2010.this.answered7 + english2010.this.answered8 + english2010.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$200 > english2010.this.highscore) {
                        edit.putInt(str, access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 120;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - english2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1eng101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1eng102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1eng103", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1eng104", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1eng105", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1eng106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1eng107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1eng108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1eng109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1eng1010", 0);
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
                        editor.putString("scoreeng101", str3);
                        editor.putLong("date1eng101", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreeng102", str5);
                            editor.putLong("date1eng102", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreeng103", str5);
                            editor.putLong("date1eng103", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreeng104", str5);
                            editor.putLong("date1eng104", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreeng105", str5);
                            editor.putLong("date1eng105", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreeng106", str5);
                            editor.putLong("date1eng106", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreeng107", str5);
                            editor.putLong("date1eng107", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreeng108", str5);
                            editor.putLong("date1eng108", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreeng109", str5);
                            editor.putLong("date1eng109", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreeng1010", str5);
                            editor.putLong("date1eng1010", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateeng101", 0);
                    long j12 = defaultSharedPreferences.getLong("dateeng102", 0);
                    long j13 = defaultSharedPreferences.getLong("dateeng103", 0);
                    long j14 = defaultSharedPreferences.getLong("dateeng104", 0);
                    long j15 = defaultSharedPreferences.getLong("dateeng105", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateeng106", 0);
                    long j17 = defaultSharedPreferences.getLong("dateeng107", 0);
                    long j18 = defaultSharedPreferences.getLong("dateeng108", 0);
                    long j19 = defaultSharedPreferences.getLong("dateeng109", 0);
                    long j20 = defaultSharedPreferences.getLong("dateeng1010", 0);
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
                        editor2.putString("iScoreeng101", str4);
                        editor2.putLong("dateeng101", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreeng102", str6);
                            editor2.putLong("dateeng102", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreeng103", str6);
                            editor2.putLong("dateeng103", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreeng104", str6);
                            editor2.putLong("dateeng104", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreeng105", str6);
                            editor2.putLong("dateeng105", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreeng106", str6);
                            editor2.putLong("dateeng106", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreeng107", str6);
                            editor2.putLong("dateeng107", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreeng108", str6);
                            editor2.putLong("dateeng108", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreeng109", str6);
                            editor2.putLong("dateeng109", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreeng1010", str6);
                            editor2.putLong("dateeng1010", l.longValue());
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
                        english2010.this.scr.setVisibility(8);
                        english2010.this.chr.stop();
                        english2010.this.toolbar.setVisibility(8);
                        english2010.this.Relative.setBackgroundColor(-7829368);
                        english2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2010.this.getBaseContext());
                        int unused = english2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = english2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = english2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = english2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = english2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = english2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = english2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = english2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = english2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = english2010.this.highscore = defaultSharedPreferences.getInt("eng2010hs", 0);
                        int access$200 = english2010.this.part1 + english2010.this.part2 + english2010.this.part3 + english2010.this.part4 + english2010.this.part5 + english2010.this.part6 + english2010.this.part7 + english2010.this.part8 + english2010.this.part9;
                        TextView access$1200 = english2010.this.resultText;
                        access$1200.setText(access$200 + "/120");
                        english2010.this.progressbar.setProgress(access$200);
                        english2010.this.progressbar.setMax(120);
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
                        int unused11 = english2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = english2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = english2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = english2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = english2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = english2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = english2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = english2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = english2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = english2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1300 = english2010.this.answered1 + english2010.this.answered2 + english2010.this.answered3 + english2010.this.answered4 + english2010.this.answered5 + english2010.this.answered6 + english2010.this.answered7 + english2010.this.answered8 + english2010.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$200 > english2010.this.highscore) {
                            edit.putInt("eng2010hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - english2010.this.chr.getBase()) / 1000;
                        String str = "dateeng1010";
                        String str2 = "dateeng109";
                        String str3 = "dateeng108";
                        String str4 = "dateeng107";
                        String str5 = "dateeng106";
                        String str6 = "dateeng105";
                        String str7 = "dateeng104";
                        String str8 = "dateeng103";
                        String str9 = "dateeng102";
                        String str10 = "dateeng101";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1eng1010";
                        String str12 = "date1eng109";
                        if (english2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1eng101", 0);
                            String str13 = "date1eng101";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1eng102", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1eng103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1eng104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1eng105", 0);
                            String str16 = "date1eng105";
                            String str17 = "date1eng104";
                            String str18 = "date1eng106";
                            long j6 = defaultSharedPreferences.getLong("date1eng106", 0);
                            long j7 = defaultSharedPreferences.getLong("date1eng107", 0);
                            String str19 = str12;
                            String str20 = "date1eng108";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1eng107";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1eng103";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1eng108", 0));
                            Date date9 = new Date(j8);
                            Date date10 = new Date(j9);
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(date);
                            arrayList.add(date2);
                            arrayList.add(date3);
                            arrayList.add(date4);
                            arrayList.add(date5);
                            Date date11 = date7;
                            arrayList.add(date11);
                            arrayList.add(date6);
                            arrayList.add(date8);
                            arrayList.add(date9);
                            arrayList.add(date10);
                            Date date12 = (Date) Collections.min(arrayList);
                            if (date12.compareTo(date) == 0) {
                                editor3 = editor5;
                                editor3.putString("scoreeng101", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreeng102", str25);
                                    editor3.putLong("date1eng102", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreeng103", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreeng104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreeng105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreeng106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreeng107", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreeng108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreeng109", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreeng1010", str25);
                                    editor3.putLong(str22, l.longValue());
                                }
                            }
                            String str26 = str10;
                            long j10 = sharedPreferences.getLong(str26, 0);
                            String str27 = str9;
                            long j11 = sharedPreferences.getLong(str27, 0);
                            long j12 = sharedPreferences.getLong(str8, 0);
                            SharedPreferences.Editor editor6 = editor3;
                            long j13 = sharedPreferences.getLong(str7, 0);
                            long j14 = sharedPreferences.getLong(str6, 0);
                            long j15 = sharedPreferences.getLong(str5, 0);
                            long j16 = sharedPreferences.getLong(str4, 0);
                            long j17 = sharedPreferences.getLong(str3, 0);
                            long j18 = sharedPreferences.getLong(str2, 0);
                            long j19 = sharedPreferences.getLong(str, 0);
                            Date date13 = new Date(j10);
                            Date date14 = new Date(j11);
                            Date date15 = new Date(j12);
                            Date date16 = new Date(j13);
                            Date date17 = new Date(j14);
                            Date date18 = new Date(j15);
                            Date date19 = new Date(j16);
                            Date date20 = new Date(j17);
                            Date date21 = new Date(j18);
                            Date date22 = new Date(j19);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            arrayList2.add(date16);
                            arrayList2.add(date17);
                            arrayList2.add(date18);
                            arrayList2.add(date19);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            Date date23 = (Date) Collections.min(arrayList2);
                            if (date23.compareTo(date13) == 0) {
                                editor4 = editor6;
                                editor4.putString("iScoreeng101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreeng102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreeng103", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreeng104", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreeng105", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreeng106", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreeng107", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreeng108", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreeng109", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreeng1010", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1eng101";
                            String str30 = "date1eng104";
                            String str31 = str12;
                            String str32 = "date1eng103";
                            String str33 = "date1eng107";
                            String str34 = "date1eng106";
                            String str35 = str11;
                            String str36 = "date1eng105";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1eng102", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1eng102";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1eng108";
                            long j27 = sharedPreferences2.getLong(str46, 0);
                            String str47 = str31;
                            long j28 = sharedPreferences2.getLong(str31, 0);
                            long j29 = sharedPreferences2.getLong(str11, 0);
                            Date date24 = new Date(j20);
                            Date date25 = new Date(j21);
                            Date date26 = new Date(j22);
                            Date date27 = new Date(j23);
                            Date date28 = new Date(j24);
                            Date date29 = new Date(j25);
                            Date date30 = new Date(j26);
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            Date date31 = new Date(j27);
                            String str48 = str46;
                            Date date32 = new Date(j28);
                            Date date33 = new Date(j29);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(date24);
                            arrayList3.add(date25);
                            arrayList3.add(date26);
                            arrayList3.add(date27);
                            arrayList3.add(date28);
                            arrayList3.add(date29);
                            arrayList3.add(date30);
                            arrayList3.add(date31);
                            arrayList3.add(date32);
                            arrayList3.add(date33);
                            Date date34 = (Date) Collections.min(arrayList3);
                            if (date34.compareTo(date24) == 0) {
                                editor2 = editor5;
                                editor2.putString("scoreeng101", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreeng102", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreeng103", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreeng104", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreeng105", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreeng106", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreeng107", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreeng108", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreeng109", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreeng1010", str49);
                                    editor2.putLong(str11, valueOf2.longValue());
                                }
                            }
                            SharedPreferences sharedPreferences4 = sharedPreferences3;
                            String str50 = str10;
                            long j30 = sharedPreferences4.getLong(str50, 0);
                            long j31 = sharedPreferences4.getLong(str9, 0);
                            String str51 = str8;
                            long j32 = sharedPreferences4.getLong(str51, 0);
                            SharedPreferences.Editor editor7 = editor2;
                            long j33 = sharedPreferences4.getLong(str7, 0);
                            String str52 = str6;
                            Long l2 = valueOf2;
                            long j34 = sharedPreferences4.getLong(str52, 0);
                            String str53 = str52;
                            long j35 = sharedPreferences4.getLong(str5, 0);
                            long j36 = sharedPreferences4.getLong(str4, 0);
                            long j37 = sharedPreferences4.getLong(str3, 0);
                            long j38 = sharedPreferences4.getLong(str2, 0);
                            String str54 = str;
                            long j39 = sharedPreferences4.getLong(str54, 0);
                            Date date35 = new Date(j30);
                            Date date36 = new Date(j31);
                            Date date37 = new Date(j32);
                            Date date38 = new Date(j33);
                            Date date39 = new Date(j34);
                            Date date40 = new Date(j35);
                            Date date41 = new Date(j36);
                            String str55 = str51;
                            Date date42 = new Date(j37);
                            Date date43 = new Date(j38);
                            Date date44 = new Date(j39);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date35);
                            arrayList4.add(date36);
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date39);
                            arrayList4.add(date40);
                            Date date45 = date41;
                            arrayList4.add(date45);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            arrayList4.add(date44);
                            Date date46 = (Date) Collections.min(arrayList4);
                            if (date46.compareTo(date35) == 0) {
                                editor = editor7;
                                editor.putString("iScoreeng101", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreeng102", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreeng103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreeng104", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreeng105", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreeng106", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreeng107", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreeng108", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreeng109", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreeng1010", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        english2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2010.this.scr.setVisibility(8);
                english2010.this.chr.stop();
                english2010.this.toolbar.setVisibility(8);
                english2010.this.Relative.setBackgroundColor(english2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                english2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2010.this.scr.setVisibility(0);
                english2010.this.toolbar.setVisibility(0);
                english2010.this.telegram_layout.setVisibility(8);
                english2010.this.chr.start();
                english2010.this.Relative.setBackgroundColor(english2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = english2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = english2010.this.mInterstitialAd = null;
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
            super.onBackPressed();
            showAd();
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                english2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
