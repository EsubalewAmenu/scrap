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
import kotlinx.coroutines.DebugKt;

public class english2009 extends AppCompatActivity {
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
    private Boolean f554b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEng2009;
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
    private Toolbar f555tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2009);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEnglish2009);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f554b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_english2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "I you say to for did want for all us thank. ", 0, 0, 0, 0, 0, "I want to say thank you for all you did for us. ", "You want to say I thank you for all did for us. ", "I did want you for all for us to say thank you. ", "You say I want to thank you for all did for us. ", "I want to say thank you for all you did for us. ", "a", 0, 1, this.f554b));
        arrayList.add(new questions("2.", "the work for she twenty-two she company to when was started. ", 0, 0, 0, 0, 0, "She for the company started to work when she was twenty-two. ", "She when was twenty-two she started to work for the company. ", "She started to work for the company when she was twenty-two. ", "When she started to work for the company, she was twenty-two. ", "She started to work for the company when she was twenty- two.", "c", 0, 1, this.f554b));
        arrayList.add(new questions("3.", "in my hospital sister a works. ", 0, 0, 0, 0, 0, "My hospital works in a sister. ", "My sister in a hospital works.", "My sister works in a hospital. ", "In a hospital works my sister. ", "My sister works in a hospital. ", "c", 0, 1, this.f554b));
        arrayList.add(new questions("4.", "any to don't us seem more understand they.", 0, 0, 0, 0, 0, "To understand us they don't seem any more.", "They don't seem to understand us anymore. ", "Any more they don't seem to understand us. ", "They seem to don't understand us anymore. ", "They don't seem to understand us anymore. ", "b", 0, 1, this.f554b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("5.", "a. All of us are prone to the same fundamental human principles that k au s e these cases of scientific denial. \nb. Because it is not ignorance. \nc. But if we really want to change how they think, we need to take an honest look at what is driving those beliefs. \nd. It is easy to dismiss people who believe things that are factually incorrect. \ne. It is psychology. \nf. Research has proven that humans are distinctly uncomfortable with events or phenomena without clear cause, and when we do not know something, we tend to fill in the gaps ourselves.\n", 0, 0, 0, 0, 0, "a d b f c e", "b a e f c", "f e b a c d", "d c b e a f ", "‘d’ is the topic sentence and the others are supporting it. ", "d", 0, 2, this.f554b));
        arrayList2.add(new questions("6.", "a. Hundreds of millions of people can recognize a Coke bottle by its shape. \nb. And the famous Coca-Cola logo is the most famous logo in the world. \nc. Do you know the most recognizable object in the world? \nd. Unlike any other famous commercial logos, it has not changed in 100 years. \ne. The Coca-Cola bottle is the most recognized object in the world. \n", 0, 0, 0, 0, 0, "d b a c e", "c e a b d", "c d b e a ", "e a c d b  ", "Sentence 'C' is used as the beginning sentence of the paragraph", "b", 0, 2, this.f554b));
        arrayList2.add(new questions("7.", "a. The country-with highest life expectancy is Japan. \nb. Hence, nuns and philosophers often lived to great ages. \nc. Historically, women died in childbirth and men in wars. \nd. Now, childbearing is less risky and there are fewer wars. \ne. There the average age for men is 76 and for women is 72. \n", 0, 0, 0, 0, 0, "a e c d b ", "c b d a e", "c d a b e  ", "a c d b e ", "‘a’ is the topic sentence explained and elaborated by others. ", "a", 0, 2, this.f554b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("8.", "Which of the following has the potential to turn millions into environmental refugees? ", 0, 0, 0, 0, 0, "allowing unchecked growth of human population", "conserving soil, water and forests ", "changing the patterns of production and consumption ", "enabling the poor nations to Slow down population growth. ", "allowing unchecked growth of human population", "a", 0, 3, this.f554b));
        arrayList3.add(new questions("9.", "From the following sentences, identify one potential consequence if population growth continues at the current rate. ", 0, 0, 0, 0, 0, "There will be a large number of new supplies o, food and energy. ", "Humankind will be able to reduce the burden placed on the earth.", "Humankind will exterminate the species and ruin the ecosystem.", "There will be no collision between rising demand and diminishing resources.", "Humankind will exterminate the species and ruin the ecosystem.", "c", 0, 3, this.f554b));
        arrayList3.add(new questions("10.", "What does they as used in the world in which they survived (paragraph 2) refer to? ", 0, 0, 0, 0, 0, "millions who will become environmental refugees ", "today's young people ", "our great-grand-children", "great-grand-children of today's young people", "Great-grand-children of today's young people. ", "d", 0, 3, this.f554b));
        arrayList3.add(new questions("11.", "Whose principal effect is in lied today's ... the principal effect came to be (paragraph 5)? ", 0, 0, 0, 0, 0, "the increase in appetite for fish ", "the rise in quantities of encouraged fishing ", "the falling demand for fish", "the mismatch between demand and supply ", "the mismatch between demand and supply ", "d", 0, 3, this.f554b));
        arrayList3.add(new questions("12.", "Which of the following statements is true according to the information in paragraph 3?", 0, 0, 0, 0, 0, "Human population will not exceed 8 billion by 2050.", "The time needed to respond to the rising environmental threats has now become short before.", "Making the world a better place for living requires more strenuous efforts now than ever before. ", "The word looks better if zero population growth is achieved through environmental catastrophe. ", "Making the world a better place for living requires more strenuous efforts now than ever before. ", "c", 0, 3, this.f554b));
        arrayList3.add(new questions("13.", "Which one of the following is not an example of rising threats to the environment?", 0, 0, 0, 0, 0, "cutting human propagation in half ", "exterminating species and the ecosystem ", "stripping nutrients from the soil.", "creating mismatches between production and consumption. ", "cutting human propagation in half ", "a", 0, 3, this.f554b));
        arrayList3.add(new questions("14.", "Which of the following words is close in meaning to soak up as used in paragraph 1? ", 0, 0, 0, 0, 0, "stop ", "accelerate ", "absorb", "extend", "Soak up means absorb. ", "c", 0, 3, this.f554b));
        arrayList3.add(new questions("15.", "What does this in the statement, this is no longer true (paragraph 3) refer to?", 0, 0, 0, 0, 0, "finding new-frontiers and empty lands ", "finding exploding population ", "achieving zero population growth ", "gripping threats with environment ", "'This' refers to finding new frontiers and empty lands. ", "a", 0, 3, this.f554b));
        arrayList3.add(new questions("16.", "From the words given below, which one shows the author's dissatisfaction with human activity, as used in Paragraph 1?", 0, 0, 0, 0, 0, "expansion", "devastation", "soak up", "prevent ", "Prevent. ", "d", 0, 3, this.f554b));
        arrayList3.add(new questions("17.", "Which word from the given alternatives can be the best substitute for demise as used in hasten the demise of species and resources... (paragraph 5)?", 0, 0, 0, 0, 0, "propagation ", "population ", "dampening ", "death ", "The ward 'Demise' can be substituted by 'death'. ", "d", 0, 3, this.f554b));
        arrayList3.add(new questions("18.", "Which of the following words is close in meaning to doomsayers, as used in humanity had confounded doomsayers ... (paragraph 4)?", 0, 0, 0, 0, 0, "people who predict disaster ", "environmentalists who lived in the 1970s", "people who cause price rises that lead to scarcity", "people who find new supplies of food and energy ", "Doomsayers are people who predict disaster.", "a", 0, 3, this.f554b));
        arrayList3.add(new questions("19.", "From the words. given below, identify the one close in meaning to collision, as used in paragraph 6. ", 0, 0, 0, 0, 0, "coercion", "influence", "reaction ", "conflict", "Collision means conflict according to the context. ", "d", 0, 3, this.f554b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("20.", "'… and everybody wins,' (the last paragraph, the last sentence) implies that", 0, 0, 0, 0, 0, "businesses will face the challenges. ", "both workers and businesses will satisfy their needs. ", "the public will be-the beneficiary. ", "businesses will establish high quality institutions of training. ", "Everybody includes both the private companies and the public.", "b", 0, 4, this.f554b));
        arrayList4.add(new questions("21.", "One of following is an instance of a recommended industry-university partnership. ", 0, 0, 0, 0, 0, "Companies prepare their own study programs based on their own needs", "Universities generate modules of training for companies. ", "Workers get trainings during their day -offs.", "Companies give universities machines that their students can learn to use.", "Companies prepare their own study programs based on their own needs", "a", 0, 4, this.f554b));
        arrayList4.add(new questions("22.", "When is it proper, according to the passage, to focus on training and 'up skilling'?", 0, 0, 0, 0, 0, "as soon as we start the business ", "when we decide to introduce digitalization-been made", "after all arrangements for the establishment of the company have ", "before we secure the money- for investment", "After the initial investment. ", "a", 0, 4, this.f554b));
        arrayList4.add(new questions("23.", "One of the following is NOT a mutual goal between private companies and the public regarding the tasks of the business.", 0, 0, 0, 0, 0, "providing employment to all citizens. ", "supporting those whose jobs are affected by technology", "enhancing the training of those in developing markets. ", "pipelining resilient workers with flexible skills.", "Creates more jobs but doesn't provide employment to all citizens. ", "a", 0, 4, this.f554b));
        arrayList4.add(new questions("24.", "What do modern education set-ups lack according to the above passage?", 0, 0, 0, 0, 0, "facilities and skilled personnel ", "preparation for future skills challenge ", "digitalization ", "optimism ", "preparation for future skills challenge ", "b", 0, 4, this.f554b));
        arrayList4.add(new questions("25.", "Which one of the following titles best suits the above passage?", 0, 0, 0, 0, 0, "Industry Education Partnership ", "The Validity of Education ", "Businesses as Models of Education", "Building Workforces Businesses Need ", "Building Workforces Businesses Need ", "d", 0, 4, this.f554b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("26.", "People who live on an island in a sea will most probably need to…………… their water. Otherwise, they cannot drink it. ", 0, 0, 0, 0, 0, "filter", "desalinate ", "detoxify", "denitrify", "Desalinate remove salt from in order to drink", "b", 0, 5, this.f554b));
        arrayList5.add(new questions("27.", "I don't like people who beat around the bush. I want them to…………….   ", 0, 0, 0, 0, 0, "stop blaming others for their own mistakes ", "come to an agreement ", "stop avoiding the issue ", "look for the hidden point ", "Stop avoiding the issue. ", "c", 0, 5, this.f554b));
        arrayList5.add(new questions("28.", "…………. your shoes or you will trip over and fall down", 0, 0, 0, 0, 0, "Embrace", "Lace up", "Brace", "Bump into", "Lace up - fasten or tighten. ", "b", 0, 5, this.f554b));
        arrayList5.add(new questions("29.", "As mistake is to eraser so 'is constitution to…………...", 0, 0, 0, 0, 0, "revolution", "draft", "concise", "amendment", "Amendment- free from fault or error, improvement.", "d", 0, 5, this.f554b));
        arrayList5.add(new questions("30.", "I understand it is taking them years to………………… the shock of their son's death, I really pity them. ", 0, 0, 0, 0, 0, "get over", "put over", "go over", "get down", "Get over recover from.", "a", 0, 5, this.f554b));
        arrayList5.add(new questions("31.", "For reasons unknown to us it is now the third month he stopped paying name from the \n his contributions. So, we can now…………. membership list. \n", 0, 0, 0, 0, 0, "erase out  ", "cancel out", "rub out ", "write out", "Rub out means cancel or erase.", "c", 0, 5, this.f554b));
        arrayList5.add(new questions("32.", "The carpenter accidentally hit his thumb with a hammer and…………... in pain. ", 0, 0, 0, 0, 0, "whispered ", "whistled  ", "winced", "wiped", "Wince-show body pain by disease. ", "c", 0, 5, this.f554b));
        arrayList5.add(new questions("33.", "It is assumed that free people are………... to infringements of their rights. ", 0, 0, 0, 0, 0, "inimical", "imitative", "innocuous ", "fragile", "Innocuous- causing no harm. ", "c", 0, 5, this.f554b));
        arrayList5.add(new questions("34.", "Many of my friends were in heated argument about which team would win the game last night; in fact, I was…………… and simply enjoyed watching the game. ", 0, 0, 0, 0, 0, "discouraged", "unwise", "unfair ", "indifferent", "Indifferent- having no interest in.", "d", 0, 5, this.f554b));
        arrayList5.add(new questions("35.", "After waiting for two hours, Mom grew………. with my sister and decided to call her.", 0, 0, 0, 0, 0, "irresponsible", "unfriendly", "unkind", "impatient", "Impatient- intolerant. ", "d", 0, 5, this.f554b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("36.", "I didn't 'ring off' until he said he didn't love me. Once I heard that, I forced myself to completely erase him out of my mind.", 0, 0, 0, 0, 0, "hang up", "hold on", "ring up ", "shut down ", "Ring off means hang up end a telephone conversation. ", "a", 0, 6, this.f554b));
        arrayList6.add(new questions("37.", "It is believed that with experience my sister will be 'proficient' at the task", 0, 0, 0, 0, 0, "adapt", "adopt", "adept", "novice", "Proficient- very good at doing something i.e adept. ", "c", 0, 6, this.f554b));
        arrayList6.add(new questions("38.", "Old shanty parts of Addis Ababa are 'pulled down' and new modern high rising buildings are erected. ", 0, 0, 0, 0, 0, "repaired ", "demolished", "replaced", "extracted ", "Pull down- destroy or demolish. ", "b", 0, 6, this.f554b));
        arrayList6.add(new questions("39.", "Heavy shelling’s in several cities of Syria have turned buildings into 'rubbles'. It would obviously take a lot of resource to reconstruct them", 0, 0, 0, 0, 0, "debris ", "rubbish", "desert", "wilderness ", "Rubbles- bits of broken stones. i.e., debris. ", "a", 0, 6, this.f554b));
        arrayList6.add(new questions("40.", "My sister is such a little 'nuisance'; she often like to ask too many silly questions. ", 0, 0, 0, 0, 0, "annoying", "sad", "exciting ", "stupid", "Nuisance means annoying.", "a", 0, 6, this.f554b));
        arrayList6.add(new questions("41.", "The teacher asked us to 'hand in' the homework this Friday.", 0, 0, 0, 0, 0, "transmit", "transfer ", "admit", "submit", "Hand in means submit. ", "d", 0, 6, this.f554b));
        arrayList6.add(new questions("42.", "We are going to 'put off' our vacation until next year. ", 0, 0, 0, 0, 0, "cancel", "enjoy", "extend ", "delay", "Put off- postpone or extend.", "c", 0, 6, this.f554b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("43.", "You…………... look like a gentleman nor speak like one.", 0, 0, 0, 0, 0, "never ", "ever", "either", "neither", "Neither- nor= used when two negative ideas are there to mean not this or that; none.", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("44.", "Many children often enjoy listening to such an…………... story of adventure.", 0, 0, 0, 0, 0, "excited ", "exciting", "excitement", "amusement", "Exciting- ing adjective used to describe something. ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("45.", "Doctors…………. help you unless you tell them what's wrong. ", 0, 0, 0, 0, 0, "can't ", "couldn't", "shouldn't", "mustn't", "Can=be able to. They are not able to help you. ", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("46.", "I found the news from the doctors…………; they said mom is in a good condition today. ", 0, 0, 0, 0, 0, "initiating", "entertaining", "encouraging", "exciting ", "Ing- adjective tells the nature or character of someone. ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("47.", "Had there been no trace of evidence for his involvement in the death of the old lady in the neighborhood, the police……………so serious about keeping him in custody.  ", 0, 0, 0, 0, 0, "won't have been", "would have been", "wouldn't have been", "was not going to be", "If there had been no trace-= Had there been no trace + present conditional (negative) in the main clause. ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("48.", "Don't say anything like that to me; ………… again!", 0, 0, 0, 0, 0, "forever", "whatever ", "never", "ever", "Giving command not to do it again", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("49.", "……………...was the bus that I was almost late for this exam. ", 0, 0, 0, 0, 0, "Very slow", "Too slow", "So slow", "As slow ", "So slow- The bus was so slow that – ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("50.", "I don't understand why he suspected us. …………… from among us would want his money. ", 0, 0, 0, 0, 0, "No one", "Anyone", "No anyone ", "Not someone ", "No one= Anyone doesn't. ", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("51.", "If the media reported that nobody died in the crash, then…………of them should be alive. You don't have to cry. ", 0, 0, 0, 0, 0, "either", "neither ", "both", "none ", "No body died means both are alive.", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("52.", "Classes begin only after you…………... registration. ", 0, 0, 0, 0, 0, "completed ", "complete", "will complete ", "had completed", "The verb in the time clause is present simple. ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("53.", "Next week this time, I ……………. all my examinations.  ", 0, 0, 0, 0, 0, "I am finishing", "have finished", "will finish ", "will have finished", "Future perfect (will +have +V3) shows action expected to happen first before another second action event. ", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("54.", "……………. you come around; I see you making troubles. That is really intolerable. ", 0, 0, 0, 0, 0, "Always ", "Sometimes", "All time", "Every time ", "Every time indicates something frequently happening. ", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("55.", "None-of the furniture we bought last week …………… yet. ", 0, 0, 0, 0, 0, "has arrived", "arrived", "have arrived", "will have arrived ", "None of + uncountable noun + singular verb.", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("56.", "Did you know that Mary and Bedlu……………married next week? ", 0, 0, 0, 0, 0, "are going to get", "will be getting", "will get ", "get", "be + going to + inf is used to mean the preparation has already made. ", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("57.", "Experts agree that neither sex is more intelligent than the other: their brains are ………...", 0, 0, 0, 0, 0, "also different", "just the same", "just different", "also the same", "Neither sex is more intelligent means they are equally intelligent and they have also the same brain. ", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("58.", "If anything goes wrong with this plan, you…………… held responsible.", 0, 0, 0, 0, 0, "would be", "would have been", "will be ", "will have been", "In likely condition simple present in the if clause and simple future in the main clause are used. ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("59.", "It is hard to imagine what life was like……………. there were no computers or mobile phones.", 0, 0, 0, 0, 0, "while", "when ", "where", "during", "Where indicates time. ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("60.", "I'm delighted…………. you in such a good health. ", 0, 0, 0, 0, 0, "I see", "seeing", "to see", "for I see", "Adjectives (delighted) +to inf. ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("61.", "I just heard on the radio that the company is selling goods at a big discount. I…………. go and check if there is anything I might need.", 0, 0, 0, 0, 0, "will", "would", "may", "am going to ", "will + inf is used to show immediate decision. ", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("62.", "She seems to be so much spoiled. She is rude…………. everyone. ", 0, 0, 0, 0, 0, "to", DebugKt.DEBUG_PROPERTY_VALUE_ON, "at", "with", "rude (adj + preposition) to", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("63.", "……………are so fallible as those who are sure they are always right.", 0, 0, 0, 0, 0, "Many", "None", "Some", "Several", "None= not anyone is so liable to error.", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("64.", "Zeritu worked really hard……………  she could pass her university entrance exam and study medicine. ", 0, 0, 0, 0, 0, "so as to", "because of", "so that", "in order to ", "Adverb clause of purpose introduced by so that. i.e. so as to pass.", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("65.", "Jorgo has a very old mum can hardly do anything. He…………. take care of her as he is her only son.", 0, 0, 0, 0, 0, "may ", "must", "shall", "ought to", "`Must' expresses obligation. He is obliged to take care of her because she is very old and needs someone's care. ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("66.", "According to a recent survey, young drivers are…………… likely to have an accident.", 0, 0, 0, 0, 0, "the worse", "the more", "the worst ", "the most", "The + superlative form of the adjective. The young are most exposed to an accident.", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("67.", "I'm not good at mathematics, but I………… any problem with my English.", 0, 0, 0, 0, 0, "had never have", "have never had", "never have ", "had never had ", "'But' shows idea that contrasts to the first one and present perfect is used to express an action that began in the past up to now. ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("68.", "I'm sure you………… a good time staying here with me this coming summer. ", 0, 0, 0, 0, 0, "will have", "should have", "have", "will be having", "Future continuous - expresses future progressive action", "d", 0, 7, this.f554b));
        arrayList7.add(new questions("69.", "I was very sad to hear that your mother……………", 0, 0, 0, 0, 0, "had died", "has died", "dies", "would die ", "Past perfect to show the first past from two events in the past ", "b", 0, 7, this.f554b));
        arrayList7.add(new questions("70.", "I was passing…………. when I saw her talk like someone mad. 1 don't think she is stable and alright.", 0, 0, 0, 0, 0, "by", "along", "to", DebugKt.DEBUG_PROPERTY_VALUE_ON, "Pass by= pay no attention to, disregard.", "a", 0, 7, this.f554b));
        arrayList7.add(new questions("71.", "I have now been admitted to the University of Mello and I am expected to be there in August. The semester……………. half way there by the time the academic year begins here. ", 0, 0, 0, 0, 0, "will be", "would be", "will have been ", "would have been", "Future perfect(Main clause) + Simple present(Time clause)/ by the time ", "c", 0, 7, this.f554b));
        arrayList7.add(new questions("72.", "……………….. Would I say about this exam later at home. ", 0, 0, 0, 0, 0, "Not a word", "Nothing word", "None a word ", "Not word", "I wouldn't say any word. ", "a", 0, 7, this.f554b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("73.", "Student: We went to Sodere for the weekend. \nTeacher: ……………………………...? \n", 0, 0, 0, 0, 0, "You went where", "When did you go ", "Where did you go", "What for", "Asking for the reason why he went. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("74.", "Lensa: Lilu loves pizza. She could eat the whole thing herself. \nLojo: ………………………………... \n", 0, 0, 0, 0, 0, "That's why she is gaining weight.", "That is why she's cutting down on junk food. ", "That is why she's very nice. ", "That's why she gets along with her friends very well.", "Supporting the first idea telling that she is getting fat. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("75.", "Teacher: You haven't submitted your assignment, have you? \nStudent: …………………………………. \n", 0, 0, 0, 0, 0, "Yes, I haven't. I'm sorry teacher.", "No, I have. I gave you in the morning. ", "When? I didn't know.", "No, I haven't.", "Negative statement + positive tag then negative short answer. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("76.", "Abraham: You should really apologize to your parents. \nTizazu: ……………………………………\n", 0, 0, 0, 0, 0, "Why? I don't care what they think! ", "Mistakes are inevitable. ", "It was a crowded classroom. ", "Yes, my parents apologized. ", "Advising to ask for an apology, but do t the respondent is not voluntary to do it.", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("77.", "Mother: Get out her way. …………….  \nYou:  What's chasing her?\n", 0, 0, 0, 0, 0, "She's doing her homework. ", "She's in a hurry. ", "She has been reading all morning. ", "She has a terrible headache. ", "Telling why are told to get out of her way.", "b", 0, 8, this.f554b));
        arrayList8.add(new questions("78.", "Dessalegn: ……………………………...\nChaltu:  Yes, you are.\n", 0, 0, 0, 0, 0, "I'm genuine, aren't I? ", "I'm working to help you, amn't I? ", "There are a number of solutions, aren't there?  ", "You are trying to help me, aren't you? ", "Tag question aren't I is used for first person singular. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("79.", "Shashe: ………………………………….  \nTollossa: How do you do? \n", 0, 0, 0, 0, 0, "How are you?", "How do you do?", "Can I speak to you?  ", "Who are you? ", "Greeting someone/ Asking someone's health", "b", 0, 8, this.f554b));
        arrayList8.add(new questions("80.", "Nurse: …………………….  \nPatient: Do I have to? \n", 0, 0, 0, 0, 0, "Sleep well. I wish you good dreams. ", "How do you feel now? ", "Don't disturb, please. Be quiet. ", "Have you taken your medicine? ", "The nurse needed to know if the patient has taken this medicine. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("81.", "Teacher: Beka is one of the most intelligent and gentle students we have. Isn't he? Director:........ \n ", 0, 0, 0, 0, 0, "I know his dad, Ato Borguda. ", "Intelligence is a quality we need. ", "He is also a good footballer, isn't he? ", "He went to Nazareth last week, I was told. ", "Expressing agreement or confirming by giving something additional. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("82.", "Abel:  She still doesn't want to give me the camera back. \nYou:........ \n", 0, 0, 0, 0, 0, "Cameras are very expensive. They cost a fortune. ", "What kind of camera does she like? Like this one? ", "So disappointing! After all she knows it is not hers. ", "She has two very sophisticated cameras, doesn't she? ", "Expressing disappointment. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("83.", "Son: Books are a thing of the past. The future is in online publications. \nFather: ……………………………………...\n", 0, 0, 0, 0, 0, "That's utterly rubbish.", "I, don't like online publications. ", "Children watch too much TV these days. ", "We don't like to read on the screen. ", "We don't like to read on the screen. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("84.", "Husband: ………………………………\nWife:  Love means never having to say you're sorry.\n", 0, 0, 0, 0, 0, "You never learn to make apologies", "I don't accept your apologies. ", "You know I love you. ", "I kept you waiting for so long. ", "You never learn to make apologies", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("85.", "Alemu:  Can you play the violin? \nZewdu: ……………………………\n", 0, 0, 0, 0, 0, "Yes, I can play.", "No, I wish I could. ", "Can you? ", "Musical instruments are usually ", "No; I can't, but I wish I could. ", "b", 0, 8, this.f554b));
        arrayList8.add(new questions("86.", "You:  I always have trouble with my English. What do you advise me to do? \nFriend: ……………………………... \n", 0, 0, 0, 0, 0, "I wish I could help. ", "You shouldn't bother about it. ", "Have you thought about seeing a doctor?", "English is an international language.", "Your friend wishes to help you with your English.", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("87.", "Bontu: ……………………………………...   \nChaltu:  Sorry, I am not going to the post office.\n", 0, 0, 0, 0, 0, "What are you going to do after class? ", "Do you go to the post office every day? ", "Could you mail these letters for me, please?", "Would you perhaps go to the post office today? ", "Asking somebody for help doing something. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("88.", "Adugna:  They asked us to submit the documents on time. What else is there? \nKiros: ………………………………………… \n", 0, 0, 0, 0, 0, "What do they do with documents? ", "How much time did they give us to do that? ", "They also want us to pay the whole amount now. ", "They come up with new requirements every year.", "To show something additional. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("89.", "Mekbib: Excuse me, can you lend me a pencil? \nZeritu: ………………………………………….   \n", 0, 0, 0, 0, 0, "Here you are.", "I've a pen.", "Can you borrow? ", "Which one? ", "Lending / Giving what he wants. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("90.", "Gennet: Yuk! How disgusting! \nLilly: ……………………………………………\n", 0, 0, 0, 0, 0, "Let me have a look. I'll try to fix it. ", "Of course. Help yourself. ", "Isn't your drink very nice? ", "I'm glad you like it. ", "Isn't your drink very nice? ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("91.", "Receptionist: ………………………………………... \nGuest:  Do you have a room with double-bed, please?\n", 0, 0, 0, 0, 0, "Why are you here, Madam?  ", "What can I do for you, madam? ", "Are you looking for someone, madam? ", "Do you want to pass a night here, madam? ", "Asking what to help. ", "b", 0, 8, this.f554b));
        arrayList8.add(new questions("92.", "Ali:  Can I make an appointment to see the doctor?  \nSori: ………………………………………………...  \n", 0, 0, 0, 0, 0, "The doctor is available any time", "No, you can't make.", "What's wrong? ", "Yes, you can make. ", "It is not necessary for you to make appointment because the doctor is available anytime. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("93.", "Friend: Globalization is just another way for rich countries to exploit poor countries. You: ………………………………………………", 0, 0, 0, 0, 0, "You may be right, but I see it that way. ", "Rich countries help the poor ones in many Ways. ", "Do you remember the beginning of globalization? ", "You may be right, but I don't see it that away.", "Expressing disagreement. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("94.", "Smoker:  I think smokers deserve the right to smoke in public. \nNon - smoker: …………………………………………. \n", 0, 0, 0, 0, 0, "No, I’m not sure about that. ", "I'd say that is not always the case. ", "I'd say the exact opposite. ", "Yes, I'm sure about that.", "Opposing what has been raised. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("95.", "Leto:  Where is the nearest cash point? \nBereket: …………………………………………………. \n", 0, 0, 0, 0, 0, "Do you want to change money or cash a traveler's cheque? ", "As a matter of fact, we don't have the nearest: cash point around? ", "Walk down the street and it is on your left before the traffic light.", "Take Bus Number 48 from -here and then I actually don't know after that. ", "Asking for location and telling where he finds it. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("96.", "You: I lost another opportunity again. \nFriend: ………………………………...  \n", 0, 0, 0, 0, 0, "Good luck", "I don't care", "Hard luck", "Take it easy", "Take it easy", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("97.", "Tutu: Oh, one lasting thing: Solan & 1 are getting married. \nDimberu: ………………………………...\n", 0, 0, 0, 0, 0, "Congratulations! When is the happy day? ", "Of course! Solan'll make a good husband. ", "Yes, but in my opinion, isn't Solan much younger? ", "I'd say Sunday is the best day for the wedding. ", "Expressing congratulation for the marriage. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("98.", "Policeman: You have seen her killing the man. Haven't you? \nUjulu: …………………………………...  \n", 0, 0, 0, 0, 0, "What was the man doing then? ", "Killing the man? Unbelievable! ", "Who is she? Hasn't she gone away? ", "I was, in fact, somewhere in the scene. ", "That is to assure he was around during the murder. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("99.", "Nuru: I didn't like, their food. The taste was so odd. \nBancho: ………………………………….  \n", 0, 0, 0, 0, 0, "What was the injera made of? ", "Did they have a party or what? ", "It was too much. We couldn't finish it", "Even the look was somewhat unattractive. ", "Supporting the first idea telling as it was somewhat unattractive.", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("100.", "Tourist: ………………………….? \nOfficer: My advice is that you hire a four-wheel-drive. \n", 0, 0, 0, 0, 0, "Should we take a bus to get to the site, Sir? ", "Is the road to the area somewhat bumpy, Sir? ", "Can we find a four-wheel-drive to the site, Sir? ", "Which one is cheaper, a bus or a four-wheel-drive, Sir?", "That is asking which means of transportation is better.", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("101.", "Nana: We have to leave early morning. Otherwise, it will he congested. \nGutiye: …………………………...\n", 0, 0, 0, 0, 0, "Which car are you going to drive? ", "How long does it take us to get there? ", "How many vehicles use the road per day? ", "Good idea! Wake me up at 5 o'clock, please.", "If they don't leave early, the roads will be crowded and he agreed to wake him before it gets over crowded. ", "d", 0, 8, this.f554b));
        arrayList8.add(new questions("102.", "Mother: It's hot inside. ……………………….  \nDaughter: Sure. Where's the key?\n", 0, 0, 0, 0, 0, "Will you open the window? ", "Shall I open the window? ", "Open the window.", "May I shut the door? ", "Asking to open the window because it is hot inside. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("103.", "Sister: Mom! Hirut failed her exam again. \nMother: ……………………………...\n", 0, 0, 0, 0, 0, "I know she is very good. ", "So disappointing! Are you sure? ", "It should, be very difficult, I suppose. ", "Exams do not measure one's real ability.", "Expressing disappointment. ", "b", 0, 8, this.f554b));
        arrayList8.add(new questions("104.", "Passenger I: The weather looks nice, doesn't it? \nPassenger II: ……………………...  \n", 0, 0, 0, 0, 0, "Yeah, but too unpredictable. ", "It is too hot this time of the year. ", "It is like Bahir Dar, where we are going. ", "Would it be the same in Bahir Dar also? ", "Expressing agreement and telling as it is unexpected. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("105.", "Eldana: It is time we left. It is going to rain later. \nFriend:  ……………………... I don't want to get my hair wet.\n", 0, 0, 0, 0, 0, "I couldn't agree more.", "Should we really go?", "What do you tell me? ", "We've been here for long. ", "Complete agreement. That is to mean I completely agree. ", "a", 0, 8, this.f554b));
        arrayList8.add(new questions("106.", "Hanna: ………………………... \nKedija: Kind of, I suppose.\n", 0, 0, 0, 0, 0, "Where's your boyfriend? ", "Here comes your boyfriend. ", "Do you love your boyfriend? ", "What does your boyfriend do for living? ", "Asking if she loves her boyfriend. ", "c", 0, 8, this.f554b));
        arrayList8.add(new questions("107.", "Teacher: How much string does it take to reach the moon? \nStudent: …………………………….\n", 0, 0, 0, 0, 0, "Never-ending piece. ", "Countless pieces. ", "One hundred million pieces.", "Just one, but a very long piece.", "That is to mean it is not possible to limit the number of strings used to reach the moon.", "b", 0, 8, this.f554b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("108.", "Which one of the following sentences has a correct punctuation? ", 0, 0, 0, 0, 0, "We said, \"Don't push us around;\" however, that didn't mean anything to them. ", "We said, \"Don't push us around\"; however, that didn't mean anything to them. ", "We. said, \"don't push us around\"; however, that didn't mean anything to them.  ", "We said, \"Don't push us around,\" however, that didn't mean anything to them. ", "Direct speech is enclosed with in quotation marks and separated by commas.", "d", 0, 9, this.f554b));
        arrayList9.add(new questions("109.", "Which one of the following sentences is most likely taken from a narrative piece of writing?", 0, 0, 0, 0, 0, "Everybody ordered a meal and started waiting. ", "The food in the restaurant was popular for its taste.", "Of all things, I liked the picture hanging from the center. ", "The meals weren't as such expensive compared to other places. ", "Retells a story or an event that happened. ", "a", 0, 9, this.f554b));
        arrayList9.add(new questions("110.", "Which one of the following sentences is correctly punctuated? ", 0, 0, 0, 0, 0, "Send me Ketema, the headmaster; Jira, the unit leader; and Desta, the guard. ", "Send me Ketema; the headmaster; Jira; the unit leader, and Desta; the guard. ", "Send me: Ketema, the headmaster; Jira, the unit leader; and Desta, the guard. ", "Send me. Ketema-the headmaster, Jira - the unit leader, and Desta-the guard.", "List of individuals is separated by commas and the noun appositive by hyphen.", "d", 0, 9, this.f554b));
        arrayList9.add(new questions("111.", "We interviewed 10 managers of different branches in the city to see if what they think about. the problem conforms with the information we secured from the customers. Which section of a study have the above lines been taken from? ", 0, 0, 0, 0, 0, "Objective ", "Methodology ", "Introduction", "Data analysis", "The researcher is explaining what he is going to do in the body of the paper while he is analyzing data. ", "d", 0, 9, this.f554b));
        arrayList9.add(new questions("112.", "We met at the back of the building and. started looking for a quiet place where we could sit down and enjoy the 'presence of one another. The area was a bit dark and we were sure no one would come there in the mid of the night. We found a corner to sit and These lines are taken from a piece of writing that is most likely: ", 0, 0, 0, 0, 0, "descriptive", "argumentative ", "narrative ", "expository", "Descriptive Writing shows the picture of the place. ", "a", 0, 9, this.f554b));
        arrayList9.add(new questions("113.", "New situations always made me nervous. Which sentence, is like to come next?", 0, 0, 0, 0, 0, "After a couple of minutes the teacher came over. ", "My first swimming lesson was no exception. ", "I stood timidly by the side of the changing room. ", "I changed into my bathing suit. ", "My first swimming lesson was no exception. ", "b", 0, 9, this.f554b));
        arrayList9.add(new questions("114.", "Which One of the following sentences -has correct capitalizations? ", 0, 0, 0, 0, 0, "The United States hers a Democratic form of. Government just as Great Britain does. ", "The United States has a democratic 'form of Government lust as Great Britain does.", "The United States has a democratic form of government just as Great Britain does. ", "The United States has a Democratic form of government just as Great Britain does.", "Names of persons, places and things (proper nouns) are written in capital letters.", "c", 0, 9, this.f554b));
        arrayList9.add(new questions("115.", "Which sentence is appropriately punctuated to avoid, any ambiguity in meaning?  ", 0, 0, 0, 0, 0, "The doctor's wife said her friend is not well. ", "The doctors' wife said, her friend is not well. ", "The doctor's wife, said her friend, is not well. ", "The doctors' 'wife said, her friend is not well. ", "Possession of singular noun with 's (Apostrophe. s) ", "a", 0, 9, this.f554b));
        arrayList9.add(new questions("116.", "Which one of the following sentences is most likely taken from a descriptive writing? ", 0, 0, 0, 0, 0, "Unlike what they thought, we managed to get there early morning.", "The whole area was wet and smoggy making driving extremely difficult. ", "In fact, it is good to start early morning if you want to' drive long' distance. ", "At 9 o'clock, some of the people started appearing from different' directions. ", "Adjectives like wet, smoggy are used to describe how the driving is difficult.", "b", 0, 9, this.f554b));
        arrayList9.add(new questions("117.", "She made me. remember Mona Lisa. Her smiles and beauty were indescribable and as she came straight looking into my eyes, all I could do was stand dumbfounded. She got closer and closer and her eyes shone unbearably brighter, ... This is taken from a piece of writing that is most likely:", 0, 0, 0, 0, 0, "expository", "argumentative ", "narrative", "descriptive", "It is a piece of writing that creates mental picture in the mind of the reader. ", "d", 0, 9, this.f554b));
        arrayList9.add(new questions("118.", "In conclusion, students from the rural areas seem to have spent a significant portion of their time helping. their parents whereas those from the urban centers hardly did anything of that kind. What is the most likely research topic from which the preceding lines were taken?", 0, 0, 0, 0, 0, "An Investigation into How Rural and Urban Students Help- their Parents ", "Residential Area as a Factor -Affecting the Assistance Students Give to Parents", "A Survey of Responsibilities of Students from Rural and Urban Areas in Helping their Parents ", "Students from the Rural and Urban Centuries; How much Time Do they spend helping Parents? ", "Because the given piece of article explains students from the rural area have spent significant, noticeable time and students from the urban centers have spent little time/ hardly did anything.", "d", 0, 9, this.f554b));
        arrayList9.add(new questions("119.", "When I looked up from the foot of the hill, I saw someone Who was -making almost to the tip and I knew it was Tesfaye. In no later than five minutes he stood on the top and started shouting down to those of us crawling up .... This is taken from a piece of writing that is most likely: ", 0, 0, 0, 0, 0, "narrative ", "argumentative", "descriptive ", "expository ", "Narrative story tells something happened. ", "a", 0, 9, this.f554b));
        arrayList9.add(new questions("120.", "\"I have a proven track record of responsibility, integrity and commitment to company objectives.\" This is most likely taken from. ", 0, 0, 0, 0, 0, "a letter of application", "an informal letter", "a business letter ", "a letter of enquiry.", "It is a part of letter of application. The writer has described the personal qualities he has in self-description part.", "a", 0, 9, this.f554b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f555tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2009.this.timer.setVisibility(0);
                    english2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    english2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2009.this.getBaseContext());
                    int unused = english2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = english2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = english2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = english2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = english2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = english2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = english2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = english2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = english2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = english2009.this.highscoreEng2009 = defaultSharedPreferences.getInt("eng2009hs", 0);
                    int access$200 = english2009.this.part1 + english2009.this.part2 + english2009.this.part3 + english2009.this.part4 + english2009.this.part5 + english2009.this.part6 + english2009.this.part7 + english2009.this.part8 + english2009.this.part9;
                    english2009.this.resultText.setText(String.valueOf(access$200));
                    english2009.this.progressbar.setProgress(access$200);
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
                    int unused11 = english2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = english2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = english2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = english2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = english2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = english2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = english2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = english2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "eng2009hs";
                    int unused19 = english2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = english2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1400 = english2009.this.answered1 + english2009.this.answered2 + english2009.this.answered3 + english2009.this.answered4 + english2009.this.answered5 + english2009.this.answered6 + english2009.this.answered7 + english2009.this.answered8 + english2009.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$200 > english2009.this.highscoreEng2009) {
                        edit.putInt(str, access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 120;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - english2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1eng091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1eng092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1eng093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1eng094", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1eng095", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1eng096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1eng097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1eng098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1eng099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1eng0910", 0);
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
                        editor.putString("scoreeng091", str3);
                        editor.putLong("date1eng091", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreeng092", str5);
                            editor.putLong("date1eng092", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreeng093", str5);
                            editor.putLong("date1eng093", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreeng094", str5);
                            editor.putLong("date1eng094", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreeng095", str5);
                            editor.putLong("date1eng095", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreeng096", str5);
                            editor.putLong("date1eng096", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreeng097", str5);
                            editor.putLong("date1eng097", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreeng098", str5);
                            editor.putLong("date1eng098", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreeng099", str5);
                            editor.putLong("date1eng099", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreeng0910", str5);
                            editor.putLong("date1eng0910", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateeng091", 0);
                    long j12 = defaultSharedPreferences.getLong("dateeng092", 0);
                    long j13 = defaultSharedPreferences.getLong("dateeng093", 0);
                    long j14 = defaultSharedPreferences.getLong("dateeng094", 0);
                    long j15 = defaultSharedPreferences.getLong("dateeng095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateeng096", 0);
                    long j17 = defaultSharedPreferences.getLong("dateeng097", 0);
                    long j18 = defaultSharedPreferences.getLong("dateeng098", 0);
                    long j19 = defaultSharedPreferences.getLong("dateeng099", 0);
                    long j20 = defaultSharedPreferences.getLong("dateeng0910", 0);
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
                        editor2.putString("iScoreeng091", str4);
                        editor2.putLong("dateeng091", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreeng092", str6);
                            editor2.putLong("dateeng092", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreeng093", str6);
                            editor2.putLong("dateeng093", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreeng094", str6);
                            editor2.putLong("dateeng094", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreeng095", str6);
                            editor2.putLong("dateeng095", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreeng096", str6);
                            editor2.putLong("dateeng096", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreeng097", str6);
                            editor2.putLong("dateeng097", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreeng098", str6);
                            editor2.putLong("dateeng098", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreeng099", str6);
                            editor2.putLong("dateeng099", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreeng0910", str6);
                            editor2.putLong("dateeng0910", l.longValue());
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
                        english2009.this.scr.setVisibility(8);
                        english2009.this.chr.stop();
                        english2009.this.toolbar.setVisibility(8);
                        english2009.this.Relative.setBackgroundColor(-7829368);
                        english2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2009.this.getBaseContext());
                        int unused = english2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = english2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = english2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = english2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = english2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = english2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = english2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = english2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = english2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = english2009.this.highscoreEng2009 = defaultSharedPreferences.getInt("eng2009hs", 0);
                        int access$200 = english2009.this.part1 + english2009.this.part2 + english2009.this.part3 + english2009.this.part4 + english2009.this.part5 + english2009.this.part6 + english2009.this.part7 + english2009.this.part8 + english2009.this.part9;
                        TextView access$1200 = english2009.this.resultText;
                        access$1200.setText(access$200 + "/120");
                        english2009.this.progressbar.setProgress(access$200);
                        english2009.this.progressbar.setMax(120);
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
                        int unused11 = english2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = english2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = english2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = english2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = english2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = english2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = english2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = english2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = english2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = english2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1400 = english2009.this.answered1 + english2009.this.answered2 + english2009.this.answered3 + english2009.this.answered4 + english2009.this.answered5 + english2009.this.answered6 + english2009.this.answered7 + english2009.this.answered8 + english2009.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$200 > english2009.this.highscoreEng2009) {
                            edit.putInt("eng2009hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - english2009.this.chr.getBase()) / 1000;
                        String str = "dateeng0910";
                        String str2 = "dateeng099";
                        String str3 = "dateeng098";
                        String str4 = "dateeng097";
                        String str5 = "dateeng096";
                        String str6 = "dateeng095";
                        String str7 = "dateeng094";
                        String str8 = "dateeng093";
                        String str9 = "dateeng092";
                        String str10 = "dateeng091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1eng0910";
                        String str12 = "date1eng099";
                        if (english2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1eng091", 0);
                            String str13 = "date1eng091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1eng092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1eng093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1eng094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1eng095", 0);
                            String str16 = "date1eng095";
                            String str17 = "date1eng094";
                            String str18 = "date1eng096";
                            long j6 = defaultSharedPreferences.getLong("date1eng096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1eng097", 0);
                            String str19 = str12;
                            String str20 = "date1eng098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1eng097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1eng093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1eng098", 0));
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
                                editor3.putString("scoreeng091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreeng092", str25);
                                    editor3.putLong("date1eng092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreeng093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreeng094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreeng095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreeng096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreeng097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreeng098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreeng099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreeng0910", str25);
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
                                editor4.putString("iScoreeng091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreeng092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreeng093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreeng094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreeng095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreeng096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreeng097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreeng098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreeng099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreeng0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1eng091";
                            String str30 = "date1eng094";
                            String str31 = str12;
                            String str32 = "date1eng093";
                            String str33 = "date1eng097";
                            String str34 = "date1eng096";
                            String str35 = str11;
                            String str36 = "date1eng095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1eng092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1eng092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1eng098";
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
                                editor2.putString("scoreeng091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreeng092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreeng093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreeng094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreeng095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreeng096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreeng097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreeng098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreeng099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreeng0910", str49);
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
                                editor.putString("iScoreeng091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreeng092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreeng093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreeng094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreeng095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreeng096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreeng097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreeng098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreeng099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreeng0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        english2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2009.this.scr.setVisibility(8);
                english2009.this.chr.stop();
                english2009.this.toolbar.setVisibility(8);
                english2009.this.Relative.setBackgroundColor(english2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                english2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2009.this.scr.setVisibility(0);
                english2009.this.toolbar.setVisibility(0);
                english2009.this.telegram_layout.setVisibility(8);
                english2009.this.chr.start();
                english2009.this.Relative.setBackgroundColor(english2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = english2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = english2009.this.mInterstitialAd = null;
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
                english2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
