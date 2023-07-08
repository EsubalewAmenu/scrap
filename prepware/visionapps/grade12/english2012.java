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

public class english2012 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;
    /* access modifiers changed from: private */
    public int answered1;
    /* access modifiers changed from: private */
    public int answered10;
    /* access modifiers changed from: private */
    public int answered11;
    /* access modifiers changed from: private */
    public int answered12;
    /* access modifiers changed from: private */
    public int answered13;
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
    private Boolean f560b;
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
    public int part10;
    /* access modifiers changed from: private */
    public int part11;
    /* access modifiers changed from: private */
    public int part12;
    /* access modifiers changed from: private */
    public int part13;
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
    RecyclerView recview11;
    RecyclerView recview12;
    RecyclerView recview13;
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
    private Toolbar f561tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2012);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEnglish2012);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f560b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_english2012);
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
        this.recview11 = (RecyclerView) findViewById(C2719R.C2722id.questions11);
        this.recview12 = (RecyclerView) findViewById(C2719R.C2722id.questions12);
        this.recview13 = (RecyclerView) findViewById(C2719R.C2722id.questions13);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "A story written by a person about his/ her experience of traveling from one place to another would most likely be ……………. ", 0, 0, 0, 0, 0, "argumentative", "process", "narrative", "descriptive ", "That is retelling a story. ", "c", 0, 1, this.f560b));
        arrayList.add(new questions("2.", "…His ears are turned back while his noble looking head is held high His all-black coat glistens in the late afternoon sun. This is taken from a piece of writing that is most likely be:", 0, 0, 0, 0, 0, "descriptive", "expository", "narrative", "argumentative", "This piece of writing is used to describe the person or create mental picture. ", "a", 0, 1, this.f560b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("3.", "a. The fastest computers can handle millions of problems in a few seconds. \nb. it is fairly a recent invention. \nc. in a few minutes a computer can perform calculations that humans would need years to complete. \nd. computers is one of the greatest advances in modem technology. \ne. computers are capable of doing extremely complicated works.\n", 0, 0, 0, 0, 0, "a, e, d, c, b", "b, c, a, e, d", "d, b, e, c, a ", "c, e, d, a, b ", "The sentence given under 'd' can be the topic sentence and the correct order is d, b, e, c, a.", "c", 0, 2, this.f560b));
        arrayList2.add(new questions("4.", "a. John lived with his mother and father in a village on the edge of the forest.\nb. John always woke up early in the morning and went to school. \nc. He was a good boy and the helped his parents in the fields when he got home from school. \nd. Life was quiet in the village and most of the people who lived there were farmers. \ne. At night, he usually slept very well after he had studied hard. \n", 0, 0, 0, 0, 0, "e, c, b, d, a", "a, d, b, c, e", "b, e, a, d, c", "a, d, c, e, b", "Those five sentences should be rearranged as a, d, b, c, and e to make up a complete paragraph. ", "b", 0, 2, this.f560b));
        arrayList2.add(new questions("5.", "a. Milk teeth loosen and fall out when a child is about 6 years old. \nb. Humans grow two sets of teeth in their lives.\nc. when a person is around 20-25, four additional back teeth grow called wisdom teeth.\nd. The first set has 20 teeth called milk teeth. \ne. The second set has 28 teeth that replace the milk teeth and are called permanent teeth.\n", 0, 0, 0, 0, 0, "b, d, a, e, c", "a, d, e, c, b", "c, b, d, e, a", "b, d, e, a, c", "The paragraph talks about the two sets of teeth, the milk teeth and the permanent teeth", "a", 0, 2, this.f560b));
        arrayList2.add(new questions("6.", "a. people are used to taking aspirin whenever the feel pain. \nb. It’s scientifically proven that excessive use of aspirin turns it in to a toxin. \nc. It’s true that aspirin is an effective pain killer; for example, in headache cases.\nd. However, aspirin like in other medicine can be dangerously harmful. \ne. Aspirin can be a fatal poison. \n", 0, 0, 0, 0, 0, "d, a, c, b, e", "c, e, d, b, a ", "b, a, d, e, c", "c, a, c, d, b ", "As aspirin is effective painkiller, it is also harmful if taken excessive.", "d", 0, 2, this.f560b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("7.", "I am W/O Almaz and I am writing this letter to inform you that my 5-year-old-son Belete will remain absent for class the next two days because of sickness. This short extract is most likely taken from a letter written to ", 0, 0, 0, 0, 0, "a football coach ", "ask information", "given an invitation ", "a school principal", "This extract is taken from a letter written to school principal to ask for permission. ", "d", 0, 3, this.f560b));
        arrayList3.add(new questions("8.", "Could you please ship it to me by mail? I will immediately transfer the cost involved to a bank in your area. This is most likely taken from   ", 0, 0, 0, 0, 0, "the body of formal letter", "the beginning of formal letter ", "the body of letter to a friend ", "the ending of formal letter ", "This is most likely taken from the ending part of letter of order (business letter) ", "d", 0, 3, this.f560b));
        arrayList3.add(new questions("9.", "A letter with the opening salutation 'Dear sir or Madam' most likely ends in:", 0, 0, 0, 0, 0, "Lots of love", "Yours sincerely", "Best wishes", "Yours faithfully ", "If the greeting begins with Dear sir/madam, the right closing would be yours faithfully. ", "d", 0, 3, this.f560b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("10.", "Choose the alternative with a correct spelling", 0, 0, 0, 0, 0, "comunication", "cooperative", "optmistic", "distnguished", "Comunication X                   communication ✓ \nOptmistic   X                         optimistic ✓\ndistnguished X                      distinguished ✓\n", "b", 0, 4, this.f560b));
        arrayList4.add(new questions("11.", "Choose the alternative with a correct spelling", 0, 0, 0, 0, 0, "earthquake", "crtical", "deprsion", "illegble", "crtical   X                              critical ✓ \ndeprsion X                             depression ✓\nillegble   X                             illegible ✓\n", "a", 0, 4, this.f560b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("12.", "Environment/a/of/affect/can/quality/polluted/our/a", 0, 0, 0, 0, 0, "A polluted affect environment of quality can our life.", "A polluted quality environment of our life can affect.", "A polluted environment can affect our quality of life.", "A polluted can environment affect our quality of life.", "Noun phrase + HV + MV + Obj (noun phrase).", "c", 0, 5, this.f560b));
        arrayList5.add(new questions("13.", "Now/books/on/studying/out/of/is/print/of/the/one/best", 0, 0, 0, 0, 0, "Now books on studying out of print are one of the best.", "Books on study out of print is now one of the best.", "One of the best books on studying is now out of print.", "Studying on books now is one of the best of print. ", "one of the best books on studying is now out of print. ", "c", 0, 5, this.f560b));
        arrayList5.add(new questions("14.", "babies/the/people/throughout/love/world", 0, 0, 0, 0, 0, "people love babies throughout the world.", "People the babies throughout love world. ", "babies world throughout love the people. ", "Throughout babies the world love people.", "S + V + Complement \nPeople love babies throughout the world. \n", "a", 0, 5, this.f560b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("15.", "Choose the best alternative which is written in correct punctuation and capitalization.", 0, 0, 0, 0, 0, "The high level symposium was organized by Ethiopian Ministry of education. ", "The high level symposium was organized by Ethiopian ministry of education", "The high level symposium was organized by Ethiopian Ministry of Education.", "The high level symposium was organized by Ethiopian ministry of education. ", "Name of international organizations, governments and ministries are written in capital letter.", "c", 0, 6, this.f560b));
        arrayList6.add(new questions("16.", "Choose the best alternative which is written in correct punctuation and capitalization.", 0, 0, 0, 0, 0, "What an incredible situation, it must make you nervous. ", "What an incredible situation; it must make you nervous. ", "What an incredible situation? It must make you nervous. ", "What an incredible situation: it must make you nervous. ", "Comma is used to separate introductory phrases. ", "a", 0, 6, this.f560b));
        arrayList6.add(new questions("17.", "Choose the best alternative which is written in correct punctuation and capitalization.", 0, 0, 0, 0, 0, "The OAU. Usually meets in Addis Ababa.", "The O.A.U usually meets in Addis Ababa. ", "The OA.0 usually meets in Addis Ababa. ", "The O.A.U. usually meets in Addis Ababa. ", "Abbreviations of names of international organization us full stop. ", "d", 0, 6, this.f560b));
        arrayList6.add(new questions("18.", "Choose the best alternative which is written in correct punctuation and capitalization.", 0, 0, 0, 0, 0, "When I get older, I will be able to drive.", "When I get older I, will be able to drive. ", "When, I get older I will be able to drive. ", "When I get older I will be able to drive.", "Abbreviations of names of international organization us full stop. ", "a", 0, 6, this.f560b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("19.", "Interviewer: ……………………………...? \nInterviewee: I would like to be a specialized worker. \n", 0, 0, 0, 0, 0, "Could you begin by telling me where you can see yourself in a year ", "Can you tell me your greatest weakness ", "Could you tell me how you handle a stress ", "Can you tell me about a difficult situation and how you overcame it ", "Asking about the person's plan for the year. ", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("20.", "Mesele: it seems we are in a difficult time at the moment. \nKuma: …………………………... \n", 0, 0, 0, 0, 0, "Where are we? ", "Please arrive here as early as you can ", "We have informed them already", "I believe the situation will improve soon. ", "The Person's feeling or opinion about the situation of that time. ", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("21.", "Dibabe: ………………………….\nMuleta: As I see it, it has both pros and cons.\n", 0, 0, 0, 0, 0, "I think globalization is a threat to developing countries like ours.", "Globalization is relatively a recent phenomenon.", "It is not easy to define globalization.", "Where did you first hear the term globalization?", "That is to mean it has both advantages and disadvantages.", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("22.", "Melaku: many students don’t follow their lessons attentively.\nSnait: ……………………………...\n", 0, 0, 0, 0, 0, "We found it interesting to watch.", "Did you see them this morning?", "I didn’t think I can help you.", "Another problem is that they don’t come to class regularly.", "Giving additional opinion on what has been said before.", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("23.", "Reservationist: can I have the dates for your departure and return?\nCustomer: yes, I want to leave on July 27 and return on 30.\nReservationist: ……………… did you say you wanted to return on July 30.\nCustomer: sorry, I didn’t make myself clear. I want to return on August 30.\n", 0, 0, 0, 0, 0, "That is your first to me to book a ticket", "I’m sorry; I didn’t follow what you side.", "Do you have a flight phobia?", "Why did you confuse me?", "Asking for clarification. ", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("24.", "Teacher: ………………………………?\nStudent: he has gone to Nazreth to attend his sister’s marriage.\n", 0, 0, 0, 0, 0, "Can you tell me where Petros is sitting?", "Do you know much about your friend?", "Can you tell me why your friend is absent?", "Did your friend do the assignment?", "Asking the reason of the absence.", "c", 0, 7, this.f560b));
        arrayList7.add(new questions("25.", "Marketing manager: our clients are not pleased with our service, what suggestion have you got?\nMarketing officer: ……………………….\nMarketing manager: That’s an excellent idea. It’ll show them our concern.\n", 0, 0, 0, 0, 0, "I’d like to give some suggestion.", "Shall we invite them to meet with us?", "What are we going to change?", "I don’t understand why they are not happy", "To express the person’s suggestion concerning what is to be done.", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("26.", "Meseret: ………………………….\nMuhaba: that’s a good idea. I’m really getting bored at home.\n", 0, 0, 0, 0, 0, "I’m afraid we can’t get all the job done today.", "We may go for a walk this evening. What do you think?", "We couldn’t do anything about it", "Do you really think you can get along with him?", "The person’s comment to relax.", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("27.", "Alemayehu: can you ride a motorbike?\nSintayehu: …………………….\n", 0, 0, 0, 0, 0, "Yes, I can.", "No, I don't", "Yes, I can’t ride a horse", "Yes I, do ", "It should be either yes, I can or no, I can’t", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("28.", "Rawda:  Would you like something to drink? \nFatuma: …………………………... \n", 0, 0, 0, 0, 0, "I need time to determine.", "That is exactly what I see.", "erecting to be h. ere with you.", "I would like tea if you don't mind", "I would like tea if you don't mind", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("29.", "Surafel: They' should know that we can't help them because we don't Have the time. \nTolra: ……………………………...\n", 0, 0, 0, 0, 0, "We can find out the information from our friend. ", "We don't clearly know why he is so interested in the matter. ", "They insist on going out for dinner this evening.", "Besides, we don't have the required resources. ", "That is to mean in addition.", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("30.", "Teklu: Some people turn deaf ear to the plight of others. \nDigafe: …………………………. \n", 0, 0, 0, 0, 0, "I here that you are form Bahir Dar. ", "Shell we have a break? ", "Excuse me, but I didn't understand what you were saying", "I think we should go for a walk.", "Asking for clarification", "c", 0, 7, this.f560b));
        arrayList7.add(new questions("31.", "Stranger: I am having trouble with my car. \nRenitent: …………………………….  \n", 0, 0, 0, 0, 0, "That sounds grate ", "Perhaps you could go to a garage ", "Let's not forget the brand ", "At least you should know about cars ", "Suggestion to find solution to the problem", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("32.", "Dawit: I like watching television in the evenings. \nFanuael: ……………………….\n", 0, 0, 0, 0, 0, "We are all happy that shura won the marathon race.", "For me, films are the most enjoyable pastime. ", "We do exercise every morning.", "Television has a long history. ", "That is telling what he enjoys most while watching TV", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("33.", "Selam: …………………………... \nKidist: An Italian person named Guglielmo Marconi. \n", 0, 0, 0, 0, 0, "Where was a radio invented", "Why was a radio invented ", "How was a radio invented ", "Who invented a radio ", "Asking for someone’s choice", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("34.", "Kass: What do you think of selam? \nHenok: ………………………... \n", 0, 0, 0, 0, 0, "I feel the same way sometimes ", "She is patient in class, but on the other hand, she isn't patient in at home ", "I work with her. ", "Alright! I will let you know if you need any information. Just ask me ", "Expressing the speaker’s expectation at the end of the lesson.", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("35.", "Driver: What's the matter? \nPoliceman: you have violated a traffic rule. …………………\n", 0, 0, 0, 0, 0, "when you see a red light, you should stop. ", "How can allow people like you? ", "I am sorry. The road is free. I failed to notice you ", "It is not my business. It is the minimum Penalty.", "when you see a red light, you should stop. ", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("36.", "Mother: …………………………...   \nson: Well, I will do as you said. \n", 0, 0, 0, 0, 0, "Do you really finish your homework by your own?", "I have put some, soft drinks in the refrigerator. ", "You won't go out unless you do your homework. ", "What sort of things did you buy? ", "Giving order to the child.", "c", 0, 7, this.f560b));
        arrayList7.add(new questions("37.", "Abush: …………………………... \nHelen: Yes, I do. \n", 0, 0, 0, 0, 0, "Have you ever compared beauty against virtue.", "Do you think beauty is more important than virtue ", "Can you say virtue is more important than beauty. ", "What do you think is more important? Virtue or beauty ", "Asking for someone’s choice.", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("38.", "Masersha: …………………………. \nSamuel:  I hope so. \n", 0, 0, 0, 0, 0, "By the end of the lesson we will have all understood the topic thoroughly.", "The teacher advised us to work very hard in preparation for the national exam. ", "What do you think about the national exam? ", "Talk to the teacher about it. ", "Expressing the speaker’s choice.", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("39.", "Tigist: Are there any flowers in your house? \nAbera: …………………………\n", 0, 0, 0, 0, 0, "My pleasure", "In my bedroom", "Both", "A few", "To show as there are a few flowers in the house.", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("40.", "Musema: ………………………?\nTiruye:  Dad we always enjoy listing to him. \n", 0, 0, 0, 0, 0, "Are you parents strict or funny? ", "Who is the funniest person in your family? ", "Do YOU usually have family gathering?", "What do you like the most about your family?", "Asking who the funniest person is in the family.", "b", 0, 7, this.f560b));
        arrayList7.add(new questions("41.", "Patient: ..............\nDoctor: That is what I told you several times to stay health. \n", 0, 0, 0, 0, 0, "How about eating a lot of fat every day?", "Sometimes, I don't know the best food. ", "I should have avoided caffeine and sugar.", "Is it okay to drink alcohol at weekends?  ", "To show what was necessary to be done. ", "c", 0, 7, this.f560b));
        arrayList7.add(new questions("42.", "Doul: What kinds of websites are very popular? \nOchala: ……………………….\n", 0, 0, 0, 0, 0, "Take for example face book and twitter ", "They have famous in many countries. ", "Popular people use twitter most often ", "Many people like to use them ", "To mention some examples of popular web sites. ", "a", 0, 7, this.f560b));
        arrayList7.add(new questions("43.", "Merid: Improvement in our team have been observed as a result of good trainings.\nThomase: ……………………………\n", 0, 0, 0, 0, 0, "it is fun to watch sports with a lot of people ", "it is because that is where the players are. ", "Football is loved by many people every where ", "I am quite sure that our team will win ", "The person is sure about the success of the team due to good. training. ", "d", 0, 7, this.f560b));
        arrayList7.add(new questions("44.", "Gudina: What's required to be a merchant  \nMoges: ………………………………...\n", 0, 0, 0, 0, 0, "It's the best way of giving service for a small business ", "It is a good idea. ", "Having a variety of asset would be an essential matter. ", "How could you open business?", "Explaining what is needed to begin business. ", "c", 0, 7, this.f560b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("45.", "Unlike the buses in the operation the ones which are to be imported have significant improvements ", 0, 0, 0, 0, 0, "both the buses in operation and those to be improved have similar improvements. ", "The buys which are to be imported are more updated than the once that are more update than the ones that are in operation. ", "Neither the buys in operation nor the ones to be improved have significant improvements. ", "The buys in operation are to be replaced by the buys imported with little improvement.", "The buys which are to be imported are more updated than the once that are more update than the ones that are in operation.", "b", 0, 8, this.f560b));
        arrayList8.add(new questions("46.", "There is no reason why our customers can't use or service as long as we provide regularly service with quality. ", 0, 0, 0, 0, 0, "There is a reason for customers not use our service as far as service with quality", "There is a tendency that excellent services drive away customers.", "Giving genuine service bring customers' satisfaction. ", "Our customers can't use our service even if we provided regular service with quality", "Giving genuine service bring customers' satisfaction. ", "c", 0, 8, this.f560b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("47.", "Workers m big firms receive a substantial part of their pay in the form of attractive bonuses and overtime.", 0, 0, 0, 0, 0, "distinct", "considerable", "fixed", "sensitive", "considerable - fair ", "b", 0, 9, this.f560b));
        arrayList9.add(new questions("48.", "The economy requires a stable environment in order to growth rapidly", 0, 0, 0, 0, 0, "Precious ", "successful", "solitary", "firm", "firm-not liked to change ", "d", 0, 9, this.f560b));
        arrayList9.add(new questions("49.", "The price of the good are known for their variability decrease every other day. ", 0, 0, 0, 0, 0, "evenness ", "fluctuation", "transition", "certainty", "firm-not liked to change ", "b", 0, 9, this.f560b));
        arrayList9.add(new questions("50.", "I have to unzip my jacket because it is getting very hot. ", 0, 0, 0, 0, 0, "undo", "zip up", "unlock", "fasten", "unlock-unzip means unfasten or open by pulling a zip.", "c", 0, 9, this.f560b));
        arrayList9.add(new questions("51.", "As a parent, I have the discretion determine which TV program my children may watch.", 0, 0, 0, 0, 0, "wealth", "alternative", "right", "spirit", "right-discretion means judge and decide for oneself.", "c", 0, 9, this.f560b));
        arrayList9.add(new questions("52.", "Despite a cancer diagnosis, Melt would remain resilient and fight without losing hope until the very end. ", 0, 0, 0, 0, 0, "Clam", "rude", "desperate", "strong", "strong-resilient means getting strong and a bit powerful.", "d", 0, 9, this.f560b));
        arrayList9.add(new questions("53.", "On her return from a trip, she got an accident resulting in the amputation on her right leg. ", 0, 0, 0, 0, 0, "sickness", "fitness", "impairment", "scratch", "scratch-cut off on arm or leg by surgery ", "d", 0, 9, this.f560b));
        arrayList9.add(new questions("54.", "He has promised his on a new bicycle for Christmas and nothing will break his resolution. ", 0, 0, 0, 0, 0, "decision", "ability", "talent", "relation ", "decision", "a", 0, 9, this.f560b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("55.", "You can get advice from some …………... students, as they have more experience.", 0, 0, 0, 0, 0, "junior", "underage", "ambitious ", "senior", "senior- who have been of higher-level students. ", "d", 0, 10, this.f560b));
        arrayList10.add(new questions("56.", "The disease is …………. and you can catch it easily if you are not more careful. ", 0, 0, 0, 0, 0, "Sever", "tropical", "infection", "malnourishment", "Severe- strict and causes serious sickness. ", "a", 0, 10, this.f560b));
        arrayList10.add(new questions("57.", "Never allow yourself to get discourage and think that your life is ………… and can't make a change. ", 0, 0, 0, 0, 0, "insignificant", "independent", "faithful", "worth", "worth- having a certain value. ", "d", 0, 10, this.f560b));
        arrayList10.add(new questions("58.", "My grandfather's face was …………… with age.", 0, 0, 0, 0, 0, "surprised", "wrinkled", "frowned", "confuse", "wrinkled- small fold or line of the skin on the face of a of age.", "b", 0, 10, this.f560b));
        arrayList10.add(new questions("59.", "Sleep disorders can cause serious …………... and physiological problem. ", 0, 0, 0, 0, 0, "mood", "difficulty", "metrological", "psychological", "psychological a problem of the mind or related to the mind.", "d", 0, 10, this.f560b));
        arrayList10.add(new questions("60.", "There was a significant …………. In crop production because of the shortage rain.", 0, 0, 0, 0, 0, "rise", "reduction", "reduction", "amount", "reduction - decreasing", "b", 0, 10, this.f560b));
        arrayList10.add(new questions("61.", "He couldn’t have been successful without my help, but I don't want to ………… anything from his achievements.", 0, 0, 0, 0, 0, "take away", "take of", "take out", "take back", "takeout - obtaining", "c", 0, 10, this.f560b));
        arrayList10.add(new questions("62.", "Applicant should have ………... experience in the relevant area to apply for the job.", 0, 0, 0, 0, 0, "access", "prior", "popular", "sector", "prior – former", "b", 0, 10, this.f560b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new questions("63.", "The writer is more concerned about ", 0, 0, 0, 0, 0, "the criticism made of modern democracy ", "the happiness of shoppers as a result of good advertising", "The lack of attention given to the criticism made of modern democracies.", "The attention given to modern democracies ", "the happiness of shoppers as a result of good advertising", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("64.", "One benefit of advertising according to the information in the passage is that ", 0, 0, 0, 0, 0, "consumers will buy products of their choice. ", "it prevents the economy from plummeting into crisis. ", "Adverts limit the endless desire for consumption. ", "People need publicity to fuel their needs.", "para 1 line 5", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("65.", "The writer of the passage ", 0, 0, 0, 0, 0, "describes how advertising works. ", "says that advertising should he used more carefully. ", "is critical of advertising. ", "argues against: the use of advertising. ", "is critical of advertising. ", "c", 0, 11, this.f560b));
        arrayList11.add(new questions("66.", "The main idea of paragraph 3 is that ", 0, 0, 0, 0, 0, "The influence of advertising lies in its power to make people envious of others. ", "People compare themselves with others in order to have what they think they need and what they lack. ", "The prevalence of social envy is a -necessary condition for advertising. ", "Social envy creates the need for advertising. ", "para 3 line 8", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("67.", "Which one of the following statements is true according to the passage?", 0, 0, 0, 0, 0, "Advertising adds to our existing problems. ", "Advertising advise us to give more attention to things that are of concern to us collectively. ", "New electronic gadgets are truly indispensable. ", "Advertising forces us to be less concerned about tensions in society and other social problems. ", "Advertising advise us to give more attention to things that are of concern to us collectively. ", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("68.", "Political freedom is mentioned in the passage to illustrate that", 0, 0, 0, 0, 0, "freedom is equated with the choice that people make between different products.", "Societies value political freedom more than advertising.", "Advertising and political freedom are equally valued by societies in the age of consumerism.", "People need political freedom in order to be able to make choices between different products.", "Societies value political freedom more than advertising.", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("69.", "In the passage, the writer says that", 0, 0, 0, 0, 0, "society would have no place in the modem world without advertising. ", "advertising is a key factor in human existence. ", "advertising has little influence on our life style.", "advertising is more than merely trying to sell a Product. ", "advertising is more than merely trying to sell a Product. ", "d", 0, 11, this.f560b));
        arrayList11.add(new questions("70.", "The word them (in paragraph 5) refers to", 0, 0, 0, 0, 0, "modern democracies", "shoppers", "criticisms", "advertisers", "para 5 line 8", "c", 0, 11, this.f560b));
        arrayList11.add(new questions("71.", "Advertising influences us by ", 0, 0, 0, 0, 0, "Making us desire to have what we lack but others have. ", "Helping us transform our individual lives. ", "Showing us how we will become richer in life. ", "Making us compare ourselves with other Members of the society. ", "Helping us transform our individual lives.", "b", 0, 11, this.f560b));
        arrayList11.add(new questions("72.", "The passage can be summarized as  ", 0, 0, 0, 0, 0, "the impact of advertising on the economy. ", "the power of advertising. ", "advertising and consumerism. ", "advertising and the freedom of choice. ", "the power of advertising. ", "b", 0, 11, this.f560b));
        recviewquestion recviewquestion11 = new recviewquestion();
        recviewquestion11.setQuestions(arrayList11);
        this.recview11.setAdapter(recviewquestion11);
        this.recview11.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new questions("73.", "Which one of the following paragraphs shows that Blackwell was reluctant to study medicine?", 0, 0, 0, 0, 0, "Paragraph 4", "Paragraph 3", "Paragraph 2", "Paragraph 1", "Paragraph 3", "b", 0, 12, this.f560b));
        arrayList12.add(new questions("74.", "According to paragraph 3, why did Blackwell change her mind to study medicine? Because (of)", 0, 0, 0, 0, 0, "It was her childhood desire", "The suggestion of her dying close friend. ", "The job was suitable for a woman. ", "She wanted to study the structures of the body.", "Paragraph 3", "b", 0, 12, this.f560b));
        arrayList12.add(new questions("75.", "What does the word physicians mean in paragraph 1? ", 0, 0, 0, 0, 0, "Nurses", "Doctors ", "Medical assistances", "Physics graduates", "para 1 line 7", "c", 0, 12, this.f560b));
        arrayList12.add(new questions("76.", "In paragraph 3,... she would have been spared her worst suffering physician had been a woman. what does this idea imply?", 0, 0, 0, 0, 0, "Women who study medicine were not successful. ", "Women physicians by nature are efficient.", "The medical profession was dominated by men. ", "Men Physicians were not experienced. ", "para 3 line 8", "c", 0, 12, this.f560b));
        arrayList12.add(new questions("77.", "They in Paragraph 4 refers to ", 0, 0, 0, 0, 0, "several", "Black Well's family", "Women", "physicians", "physicians", "d", 0, 12, this.f560b));
        arrayList12.add(new questions("78.", "The passage mainly focuses on the ………………", 0, 0, 0, 0, 0, "Campaign for women's right ", "Availability of medicine education for women ", "Social barriers women could face.", "Not really. Don't think so. ", "Social barriers women could face. ", "c", 0, 12, this.f560b));
        arrayList12.add(new questions("79.", "Which one of the following statements is WRONG about Elizabeth Black well?", 0, 0, 0, 0, 0, "A hyena ", "A cow", "A man", "An amputee", "An amputee", "d", 0, 12, this.f560b));
        arrayList12.add(new questions("80.", "The action of the all-male student body ……………", 0, 0, 0, 0, 0, "Voted yes honestly to admit Blackwell in the college. ", "Found evidence of Blackwell's reluctance to join the college.", "Appreciated Blackwell's ambition to be a physician. ", "Let Black well gain admittance in Geneva Medical College. ", "Let Black well gain admittance in Geneva Medical College. ", "d", 0, 12, this.f560b));
        arrayList12.add(new questions("81.", "What do paragraphs 4 and 5 have in common? ", 0, 0, 0, 0, 0, "Biological information of a woman", "The challenges and successes of Blackwell ", "Opportunities one could miss in life. ", "The admission of Blackwell into the college. ", "The challenges and successes of Blackwell ", "b", 0, 12, this.f560b));
        arrayList12.add(new questions("82.", "What contribution did Blackwell make to women profession? ", 0, 0, 0, 0, 0, "She supported the medical education. ", "She helped the poor financially.", "She made medicines accessible. ", "She gave free medical service. ", "She supported the medical education. ", "a", 0, 12, this.f560b));
        recviewquestion recviewquestion12 = new recviewquestion();
        recviewquestion12.setQuestions(arrayList12);
        this.recview12.setAdapter(recviewquestion12);
        this.recview12.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new questions("83.", "The more people come to the party, ………… food will be needed. ", 0, 0, 0, 0, 0, "He less", "the more", "the most", "the least", "parallel comparison we use + double comparative (the more… the more….)", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("84.", "My classmate goes to school by bus ………... I walk every day.", 0, 0, 0, 0, 0, "Whereas", "because", "since", "so", "To present two different /opposite/ ideas to mean on the contrary. ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("85.", "Ten years have passed ………... my mother died. ", 0, 0, 0, 0, 0, "When", "during", "since", "for", "Since + starting time(beginning from that time up to now) ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("86.", "We have to hurry up, or we ………. be able to catch the bus.", 0, 0, 0, 0, 0, "May not", "oughtn't to", "shall ", "do not", "That is to mean otherwise there is less probability to catch the bus. ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("87.", "The hospital has a backup generator, …………  there is a power. ", 0, 0, 0, 0, 0, "In the fact of", "in the case of", "in case", "instead", "To mean may be if the condition of power interruption happens. ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("88.", "Sleep is not her friend ……… the day. ", 0, 0, 0, 0, 0, "since", "as", "during", "while", "During + now (flood, war, peace, election etc.) ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("89.", "If I …………. her, I would learn more from her. ", 0, 0, 0, 0, 0, "met", "would have met", "have met", "meet", "In conditional Ill Improbable or unlikely condition/ the if clause would be simple past, met.", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("90.", "I ……... I studied harder in school.", 0, 0, 0, 0, 0, "will wish", "would wish", "am wishing", "wish", "Expressing wish - present wish which is \" I don't study harder \" is expressed. ", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("91.", "I will ………... a decision next week about whether or not to buy a ring.", 0, 0, 0, 0, 0, "Be done", "be made", "make", "do", "make- decision, agreement, arrangement etc.", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("92.", "It is a matter of time. ………. that good thing will come and when it comes, it will be a surprise.", 0, 0, 0, 0, 0, "We can't be certain", "I have a doubt", "There is no doubt", "there is no use", "That is to mean it is exactly true. ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("93.", "Peter has reorganized his files…………... he can easily find what he is looking for.", 0, 0, 0, 0, 0, "so that", "such that", "that is", "at that", "It expresses for what purpose or what for he reorganized his documents. ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("94.", "Biology…………… is very interesting to study. ", 0, 0, 0, 0, 0, "which is my favorite subject", "which is my favorite subject", "that is my favorite subject ", "that is my favorite subject ", "Non - defining relative clause is used to give extra information and separated by commas. ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("95.", "Thomas: Constant use of social media leads to low reading habits. \nGebre: ………………………...  \n", 0, 0, 0, 0, 0, "I don't have reading habits", "I have the right to say that", "I agree with you entirely ", "I won't say that ", "Expressing agreement to mean I completely agree. ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("96.", "The committee………... the issue thoroughly at the meeting yesterday.", 0, 0, 0, 0, 0, "discusses", "is discussed", "was discussed", "discussed", "The simple past tense expresses short quickly completed action in the past i.e., yesterday. ", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("97.", "It took us……………. hour and a half to arrive at the tourist site.", 0, 0, 0, 0, 0, "for", "the", "a", "an", "indefinite article 'an' uses before singular noun beginning with ‘h’ when it is not sounded e.g., an hour, an heir, an honest etc. ", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("98.", "I went shopping; …………., my sister cleaned the house.", 0, 0, 0, 0, 0, "during", "the time being", "meanwhile", "in a while ", "mean while means during the time or between.", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("99.", "The exam………… at 8:00 a.m. tomorrow morning. ", 0, 0, 0, 0, 0, "is started", "starting ", "is starting", "starts", "Simple present is used to express action scheduled to take place at point of time in the future.", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("100.", "Speaking on the phone, if you press the red button, the call………… ", 0, 0, 0, 0, 0, "ends", "ended", "would end", "is eliding ", "It is conditional truth and the main clause is in simple present.", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("101.", "Many accidents occur………… drivers are often reckless. ", 0, 0, 0, 0, 0, "Because", "however ", "So that", "despite", "Because, since and as are conjunctions which show the idea expressing cause or reason of an event.", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("102.", "The professor said that he………... in a university", 0, 0, 0, 0, 0, "Would taught", "had taught", "will teach", "is teaching", "It is how- the professor said,\" I taught in a university.\" ", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("103.", "Ababe: ………… Car was blocking the street?\nTesfaye: It was my uncle’s car.\n", 0, 0, 0, 0, 0, "Who", "Whose", "Whom", "What", "Information question about possession uses relative Pronoun `whose ' ", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("104.", "…………she………... that soup without reading a recipe?", 0, 0, 0, 0, 0, "Has/teste", "Has/tested", "Has/made", "Has/make", "present perfect question is formed using has / have +s+v3.", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("105.", "I kept on looking for a sign, but I…………... see anything for it was so dark.", 0, 0, 0, 0, 0, "Might", "couldn’t", "may", "can’t", "It was not possible for me to see any sign because of the darkness. ", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("106.", "She wondered if …………… a new laptop.", 0, 0, 0, 0, 0, "You have been bought", "You had bought", "I have been bought", "I had bought ", "Reporting question- First the direct question is rearranged the statement form and the simple past is changed to the past perfect tense. ", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("107.", "You…………. try paying them more money to get the job done.", 0, 0, 0, 0, 0, "are to", "were to", "have to", "should", "should express personal suggestion", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("108.", "……………. telephones first appeared they were called talking telegraphs.", 0, 0, 0, 0, 0, "When", "Next ", "Then", "Later on", "When- means by the time, shows paint of time. ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("109.", "He………. the accident if he had been more careful.", 0, 0, 0, 0, 0, "Would have avoided", "will avoid", "avoided", "would avoid", "Conditional lit- impossible condition in the past is using perfect conditional (would+ have+v3) in the main clause.", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("110.", "The hens……………...plenty of eggs in there weeks’ time. ", 0, 0, 0, 0, 0, "have laid", "have been laid", "have been lied", "have lied", "That is to mean the hens have produced eggs. Lay (present) and laid (past participle) ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("111.", "I will raise your case …………… I see the manager.", 0, 0, 0, 0, 0, "Immediate", "for ", "when", "since", "When- by the time or the moment I see the manager.", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("112.", "I wish I…………… to your advice about spending my money wisely.", 0, 0, 0, 0, 0, "Would listen", "had listened", "have listened", "listen", "past with- where the reality was \"I didn't listen.\" Is changed to I has listened.", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("113.", "Meron decided…………… home as soon as possible. ", 0, 0, 0, 0, 0, "go", "to going", "to go", "going ", "Decide- is a verb followed by infinitive with \"to\" ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("114.", "You………… get professional advice before buying very expensive materials.", 0, 0, 0, 0, 0, "had ", "ought", "would better ", "had better ", "Expresses advice- should, ought to and had better. ", "d", 0, 13, this.f560b));
        arrayList13.add(new questions("115.", "I finished work, ...……... to the beach and found a nice place to swim. ", 0, 0, 0, 0, 0, "was walking", "is walking", "walked", "walks", "List of past actions in sequence are all expressed used the simple past. ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("116.", "The whole story…………. by the kids in a few days. ", 0, 0, 0, 0, 0, "was forgotten", "had forgotten", "forgets", "forgot", "Past passive voice to express what was done ", "a", 0, 13, this.f560b));
        arrayList13.add(new questions("117.", "I can't sleep! That noise is really………….  ", 0, 0, 0, 0, 0, "annoyance ", "annoying ", "annoyed", "annoy", "present participle (the ing- adjective) describes the nature or characteristic of someone or something S+V+ ing adjective.", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("118.", "You wouldn't have lost your job if you………... your boss. ", 0, 0, 0, 0, 0, "haven't insulted", "hadn't insulted", "don't insult ", "didn't insult ", "Conditional III expresses a condition which was totally impossible in the past, past perfect tense is used. ", "b", 0, 13, this.f560b));
        arrayList13.add(new questions("119.", "I think she did an excellent job on her presentation. …………", 0, 0, 0, 0, 0, "neither do I", "neither did I", "so did I", "So do I", "short addition to avoid unnecessary repetition. i.e., positive addition to positive remark with SO + HY + subject. ", "c", 0, 13, this.f560b));
        arrayList13.add(new questions("120.", "The marketing plan…………… I was talking about was the one that may be implemented recently.", 0, 0, 0, 0, 0, "would ", "Can", "which", "how", "Relative pronoun 'which' is used for a thing.", "c", 0, 13, this.f560b));
        recviewquestion recviewquestion13 = new recviewquestion();
        recviewquestion13.setQuestions(arrayList13);
        this.recview13.setAdapter(recviewquestion13);
        this.recview13.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f561tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2012.this.timer.setVisibility(0);
                    english2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    english2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2012.this.getBaseContext());
                    int unused = english2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = english2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = english2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = english2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = english2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = english2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = english2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = english2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = english2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = english2012.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = english2012.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                    int unused12 = english2012.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                    int unused13 = english2012.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                    int unused14 = english2012.this.highscore = defaultSharedPreferences.getInt("eng2012hs", 0);
                    int access$200 = english2012.this.part1 + english2012.this.part2 + english2012.this.part3 + english2012.this.part4 + english2012.this.part5 + english2012.this.part6 + english2012.this.part7 + english2012.this.part8 + english2012.this.part9 + english2012.this.part10 + english2012.this.part11 + english2012.this.part12 + english2012.this.part13;
                    english2012.this.resultText.setText(String.valueOf(access$200));
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
                    edit.putInt("ans10", 0);
                    edit.putInt("ans11", 0);
                    edit.putInt("ans12", 0);
                    edit.putInt("ans13", 0);
                    int unused15 = english2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused16 = english2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused17 = english2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused18 = english2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused19 = english2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused20 = english2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused21 = english2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused22 = english2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused23 = english2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused24 = english2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int unused25 = english2012.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                    int unused26 = english2012.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                    int unused27 = english2012.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                    int access$1700 = english2012.this.answered1 + english2012.this.answered2 + english2012.this.answered3 + english2012.this.answered4 + english2012.this.answered5 + english2012.this.answered6 + english2012.this.answered7 + english2012.this.answered8 + english2012.this.answered9 + english2012.this.answered10 + english2012.this.answered11 + english2012.this.answered12 + english2012.this.answered13;
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
                    edit.putInt("answered11", 0);
                    edit.putInt("answered12", 0);
                    edit.putInt("answered13", 0);
                    if (access$200 > english2012.this.highscore) {
                        edit.putInt("eng2012hs", access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 120;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - english2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1eng121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1eng122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1eng123", 0);
                    long j4 = defaultSharedPreferences.getLong("date1eng124", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1eng125", 0);
                    long j6 = defaultSharedPreferences.getLong("date1eng126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1eng127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1eng128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1eng129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1eng1210", 0);
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
                        editor.putString("scoreeng121", str);
                        editor.putLong("date1eng121", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreeng122", str2);
                            editor.putLong("date1eng122", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreeng123", str2);
                            editor.putLong("date1eng123", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreeng124", str2);
                            editor.putLong("date1eng124", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreeng125", str2);
                            editor.putLong("date1eng125", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreeng126", str2);
                            editor.putLong("date1eng126", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreeng127", str2);
                            editor.putLong("date1eng127", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreeng128", str2);
                            editor.putLong("date1eng128", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreeng129", str2);
                            editor.putLong("date1eng129", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreeng1210", str2);
                            editor.putLong("date1eng1210", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateeng121", 0);
                    long j12 = defaultSharedPreferences.getLong("dateeng122", 0);
                    long j13 = defaultSharedPreferences.getLong("dateeng123", 0);
                    long j14 = defaultSharedPreferences.getLong("dateeng124", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("dateeng125", 0);
                    long j16 = defaultSharedPreferences.getLong("dateeng126", 0);
                    long j17 = defaultSharedPreferences.getLong("dateeng127", 0);
                    long j18 = defaultSharedPreferences.getLong("dateeng128", 0);
                    long j19 = defaultSharedPreferences.getLong("dateeng129", 0);
                    long j20 = defaultSharedPreferences.getLong("dateeng1210", 0);
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
                        editor2.putString("iScoreeng121", f);
                        editor2.putLong("dateeng121", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreeng122", f);
                            editor2.putLong("dateeng122", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreeng123", f);
                            editor2.putLong("dateeng123", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreeng124", f);
                            editor2.putLong("dateeng124", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreeng125", f);
                            editor2.putLong("dateeng125", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreeng126", f);
                            editor2.putLong("dateeng126", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreeng127", f);
                            editor2.putLong("dateeng127", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreeng128", f);
                            editor2.putLong("dateeng128", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreeng129", f);
                            editor2.putLong("dateeng129", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreeng1210", f);
                            editor2.putLong("dateeng1210", valueOf.longValue());
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
                        english2012.this.scr.setVisibility(8);
                        english2012.this.chr.stop();
                        english2012.this.toolbar.setVisibility(8);
                        english2012.this.Relative.setBackgroundColor(-7829368);
                        english2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2012.this.getBaseContext());
                        int unused = english2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = english2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = english2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = english2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = english2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = english2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = english2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = english2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = english2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = english2012.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = english2012.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                        int unused12 = english2012.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                        int unused13 = english2012.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                        int unused14 = english2012.this.highscore = defaultSharedPreferences.getInt("eng2012hs", 0);
                        int access$200 = english2012.this.part1 + english2012.this.part2 + english2012.this.part3 + english2012.this.part4 + english2012.this.part5 + english2012.this.part6 + english2012.this.part7 + english2012.this.part8 + english2012.this.part9 + english2012.this.part10 + english2012.this.part11 + english2012.this.part12 + english2012.this.part13;
                        TextView access$1600 = english2012.this.resultText;
                        access$1600.setText(access$200 + "/120");
                        english2012.this.progressbar.setProgress(access$200);
                        english2012.this.progressbar.setMax(120);
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
                        edit.putInt("ans10", 0);
                        edit.putInt("ans11", 0);
                        edit.putInt("ans12", 0);
                        edit.putInt("ans13", 0);
                        int unused15 = english2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused16 = english2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused17 = english2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused18 = english2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused19 = english2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused20 = english2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused21 = english2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused22 = english2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused23 = english2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused24 = english2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int unused25 = english2012.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                        int unused26 = english2012.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                        int unused27 = english2012.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                        int access$1700 = english2012.this.answered1 + english2012.this.answered2 + english2012.this.answered3 + english2012.this.answered4 + english2012.this.answered5 + english2012.this.answered6 + english2012.this.answered7 + english2012.this.answered8 + english2012.this.answered9 + english2012.this.answered10 + english2012.this.answered11 + english2012.this.answered12 + english2012.this.answered13;
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
                        edit.putInt("answered11", 0);
                        edit.putInt("answered12", 0);
                        edit.putInt("answered13", 0);
                        if (access$200 > english2012.this.highscore) {
                            edit.putInt("eng2012hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - english2012.this.chr.getBase()) / 1000;
                        String str = "dateeng1210";
                        String str2 = "dateeng129";
                        String str3 = "dateeng128";
                        String str4 = "dateeng127";
                        String str5 = "dateeng126";
                        String str6 = "dateeng125";
                        String str7 = "dateeng124";
                        String str8 = "dateeng123";
                        String str9 = "dateeng122";
                        String str10 = "dateeng121";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1eng1210";
                        String str12 = "date1eng129";
                        if (english2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1eng121", 0);
                            String str13 = "date1eng121";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1eng122", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1eng123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1eng124", 0);
                            long j5 = defaultSharedPreferences.getLong("date1eng125", 0);
                            String str16 = "date1eng125";
                            String str17 = "date1eng124";
                            String str18 = "date1eng126";
                            long j6 = defaultSharedPreferences.getLong("date1eng126", 0);
                            long j7 = defaultSharedPreferences.getLong("date1eng127", 0);
                            String str19 = str12;
                            String str20 = "date1eng128";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1eng127";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1eng123";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1eng128", 0));
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
                                editor3.putString("scoreeng121", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreeng122", str25);
                                    editor3.putLong("date1eng122", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreeng123", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreeng124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreeng125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreeng126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreeng127", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreeng128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreeng129", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreeng1210", str25);
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
                                editor4.putString("iScoreeng121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreeng122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreeng123", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreeng124", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreeng125", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreeng126", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreeng127", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreeng128", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreeng129", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreeng1210", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1eng121";
                            String str30 = "date1eng124";
                            String str31 = str12;
                            String str32 = "date1eng123";
                            String str33 = "date1eng127";
                            String str34 = "date1eng126";
                            String str35 = str11;
                            String str36 = "date1eng125";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1eng122", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1eng122";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1eng128";
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
                                editor2.putString("scoreeng121", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreeng122", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreeng123", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreeng124", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreeng125", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreeng126", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreeng127", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreeng128", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreeng129", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreeng1210", str49);
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
                                editor.putString("iScoreeng121", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreeng122", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreeng123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreeng124", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreeng125", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreeng126", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreeng127", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreeng128", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreeng129", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreeng1210", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        english2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2012.this.scr.setVisibility(8);
                english2012.this.chr.stop();
                english2012.this.toolbar.setVisibility(8);
                english2012.this.Relative.setBackgroundColor(english2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                english2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2012.this.scr.setVisibility(0);
                english2012.this.toolbar.setVisibility(0);
                english2012.this.telegram_layout.setVisibility(8);
                english2012.this.chr.start();
                english2012.this.Relative.setBackgroundColor(english2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = english2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = english2012.this.mInterstitialAd = null;
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
                english2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
