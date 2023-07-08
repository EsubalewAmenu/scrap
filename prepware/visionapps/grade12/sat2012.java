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

public class sat2012 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;
    /* access modifiers changed from: private */
    public int answered1;
    private int answered10;
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
    private Boolean f630b;
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
    private Toolbar f631tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_sat2012);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f630b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_sat2012);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questions);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "He has reached across the word, fomenting violence- against the west. ", 0, 0, 0, 0, 0, "Subduing", "Negating", "Instigating", "planning", "Fomenting- cause or increase disorder subduing overcoming, bringing under control", "a", 0, 1, this.f630b));
        arrayList.add(new questions("2.", "My sister came back to find her house in shambles.", 0, 0, 0, 0, 0, "neat ", "disorder", "mess", "ruins", "Shambles- state of confusion, dirt or disorder not - clean", "a", 0, 1, this.f630b));
        arrayList.add(new questions("3.", "Which of the following words cannot go together with the others? ", 0, 0, 0, 0, 0, "Rain", "Snow", "Wind", "Sky", "sky- But the other three are weather condition ", "d", 0, 1, this.f630b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("4.", "Which two statements prove that \" Lemlem and Samuel are married\". ", 0, 0, 0, 0, 0, "Lemlem is married to Alemu's only brother.", "Lemlem married her high school sweet heart ", "Samuel and Lemlem loved each other. ", "Alemu has the same parents as Samuel ", "If Alemu has the same parents as Samuel, they are brothers \n      Lemelm is married to Alemu's only brother means, she married Samuel. \n", "b", 0, 2, this.f630b));
        arrayList2.add(new questions("5.", "Which two statements prove that \"Senaite is a child”? ", 0, 0, 0, 0, 0, "Senaite lives with her parents.", "Senaite is the little sister of Bekele. ", "Bekele has just turned 13 ", "Bekele is still in school ", "senait is the little sister of Bekele who is just turned 13, that means senait is the younger brother of Bekele, there for, she is a child less than 13 years. ", "b", 0, 2, this.f630b));
        arrayList2.add(new questions("6.", "Which two statement prove that Eleni is a doctor? \nA. Eleni loves people.                        C. Eleni's brother's is doctor. \nB. Eleni's father is teacher                  D. Eleni has the same job as her brother \n", 0, 0, 0, 0, 0, "B and C ", "A and C", "C and D", "A and D ", "Eleni's brother is doctor and Eleni has the same job as her brother. Therefore, Eleni is a doctor ", "c", 0, 2, this.f630b));
        arrayList2.add(new questions("7.", "Which two statement prove that liana is young? \nA. liana lives with her brother.                   C. Alemu is still a student \nB. Hana is the little sister of Alemu.           D. Alemu has just turned 14 \n", 0, 0, 0, 0, 0, "B and D", "B and C", "C and D", "A and C", "liana is the little sister of Alemu, and Alemu has just turned 14 proves that Hana is younger.", "a", 0, 2, this.f630b));
        arrayList2.add(new questions("8.", "Which statements prove that “Mulualem is a lawyer”? \nA. Mulualem lives with her parents \nB. Mulualem's mother is an accountant. \nC. Mulualem's sister is a lawyer \nD. Mulualem has the same job as her sister \n", 0, 0, 0, 0, 0, "B and C", "A and C", "C and D", "A and D ", "Mulualem's sisters is a longer, and Mulualem has the same job as her sister proves that Mulualem is a longer. ", "c", 0, 2, this.f630b));
        arrayList2.add(new questions("9.", "Read the following three statements which are followed by four conclusions. choose the conclusion which logically follow from the given \n1. All births are black                     3. All birds arc loud  \n2. All crows are black                     4. All crows are loud  \n", 0, 0, 0, 0, 0, "Only (2) and (4)", "Only (3) and (4)", "Only (2) and (3)", "Only (1) and (2)", "Crows are black - all black bards are loud. All crows are birds. Therefore, all crows are black and loud. ", "a", 0, 2, this.f630b));
        arrayList2.add(new questions("10.", "Statements: some questions are answer. Some answers are writers. all the writers are poets \nConclusion: \n1. Some writers are answers                  3. All question are poets \n2. some poets are question                     4. Some poets are answer\n", 0, 0, 0, 0, 0, "Only (2) and (3)", "Only (3) and (4)", "Only (1) and (4)", "Only (1) and (2)", "Some questions are answer - some answers are writers all the writers are poets. Therefore, some writers and some poets are answers. ", "c", 0, 2, this.f630b));
        arrayList2.add(new questions("11.", "Some envelops are gums. Some games are sales are adhesives. \nConclusion: \n1. Some envelops are seals                    3. Some adhesives are seals. \n2. Some gums are adhesives                  4. Some adhesives are gums \n", 0, 0, 0, 0, 0, "Only 4", "Only 2", "Only 1", "Only 3", "Some envelops are gums, some gums are seals. some seals are adhesives. therefore, some adhesives are gums. ", "a", 0, 2, this.f630b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("12.", "Mike finished ahead of paulos and Berhanu both Finished before Lema. Orion did not finish last Who was the last to finish?", 0, 0, 0, 0, 0, "Paulos", "Berhanu", "Lema", "Orion", "The correct order to finish is making paulos and Berhanu and lastly Lema ", "c", 0, 3, this.f630b));
        arrayList3.add(new questions("13.", "At university three girls, Alemaz, Sophia, and Samra are dating three boys, Michael, Thomas, and Mara, Alemaz is dating Michael. Sophia is not dating the physics major. Samra is not dating the theater major. Michale is biology major. Marti is not majoring in theater. \nWhich of the following statements is correct, based on the above information?\n", 0, 0, 0, 0, 0, "Only Alemaz and Sophia are dating two of the students. ", "Alemaz is dating theater major ", "Samra is dating Maru, who is majoring in theater. ", "Samra is dating Maru who is physician major. ", "Alemaze dating Michael who is biology major. Sophia dating Thomas who is physics major. ", "d", 0, 3, this.f630b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("14.", "When she learned that she could not attend the University in Warsaw, she felt……………... ", 0, 0, 0, 0, 0, "Worried", "delegated", "annoyed", "hopeless", "Annoyed - discontent, dissatisfaction. ", "c", 0, 4, this.f630b));
        arrayList4.add(new questions("15.", "Marie …………………by living Poland and traveling to France to enter the Sorbonne.", 0, 0, 0, 0, 0, "Was distressed", "Behaved", "showed intelligence", "Changed authority", "Distressed- great discomfort or sorrow. ", "a", 0, 4, this.f630b));
        arrayList4.add(new questions("16.", "……………………...she remembered their joy together. ", 0, 0, 0, 0, 0, "Happily", "Tearfully", "Worriedly", "Dejectedly", "Dejected to be in stat of low spirit, filling sad.", "d", 0, 4, this.f630b));
        arrayList4.add(new questions("17.", "Her………………. began to fade when she returned to the Sorbonne to succeed her husband. ", 0, 0, 0, 0, 0, "disappointment", "wretchedness", "anger", "misfortune ", "Wretchedness to be unfortunate and miserable. ", "b", 0, 4, this.f630b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("18.", "According to this passage regular physical activity is needed to ", 0, 0, 0, 0, 0, "Improve one’s physical as well as mental health.", "Improve ones' cognitive skills. ", "Lose weight.", "Control one's blood pressure. ", "Regular physical activity is needed to Improve one's physical as women will as mental health", "a", 0, 5, this.f630b));
        arrayList5.add(new questions("19.", "In order to tone up the physical education program.", 0, 0, 0, 0, 0, "The program should be reoriented and implemented.", "A committee should he set up in every school. ", "An assessment of existing program should be made ", "It should be compulsory at school. ", "in order to tone up the physical education program, the program should be reoriented and implemented. ", "a", 0, 5, this.f630b));
        arrayList5.add(new questions("20.", "According to some countries, health education is more important teaching. ", 0, 0, 0, 0, 0, "Liberal arts", "any subjects", "natural science", "social science", "According to some country’s health education is more important than teaching.", "b", 0, 5, this.f630b));
        arrayList5.add(new questions("21.", "The author wants the reoriented physical education program to be ", 0, 0, 0, 0, 0, "Thoughtful", "relevant", "comprehensive", "short", "The author wants the reoriented physical education comprehensive, program to be comprehensive.", "c", 0, 5, this.f630b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("22.", "Which continuation is a right? \nI don't truest social medias. …………………. \n", 0, 0, 0, 0, 0, "Never can I and never I well", "Never I have and never I will", "I have never and I will never ", "I never have and I never will", "I never have and I never will", "d", 0, 6, this.f630b));
        arrayList6.add(new questions("23.", "If I were in your Position, I ……………………...", 0, 0, 0, 0, 0, "Would have done such silly things. ", "Would never do such silly things. ", "Will never have done such silly things.", "Would never had don such silly things.", "For unreal /imaginary condition would +v1 is used in the main clause ", "b", 0, 6, this.f630b));
        arrayList6.add(new questions("24.", "She contracted COVID 19 easily because she was obese and had other Preexisting diseases. The doctor side that if she……………. obese her chances of getting the disease would have been slim.", 0, 0, 0, 0, 0, "were not ", "were", "had been", "had not been ", "It is the third conditional, and we use had + v3(past perfect tense) in the if clause.", "d", 0, 6, this.f630b));
        arrayList6.add(new questions("25.", "1: Haven't you see this film? \n…………………………………….\n", 0, 0, 0, 0, 0, "Yes, have I", "Yes, I haven't", "No, I have", "Yes, I have", "Yes, I have. positive short answer (Yes, s+ HV) ", "d", 0, 6, this.f630b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("26.", "EAGLE is to BIRD as ROSE is to………………... ", 0, 0, 0, 0, 0, "FLOWER ", "ANIMAL", "BEAUTIFUL ", "GENTELMAN ", "Eagle and Bird have part and class relation and we say Rose and Flower. ", "a", 0, 7, this.f630b));
        arrayList7.add(new questions("27.", "CAR is to TRANSPORTATION as GAME is to……………… ", 0, 0, 0, 0, 0, "FOOTBALL ", "MANIPULATION  ", "INFORMATION", "ENTERTAINMENT", "Car and Transportation shows the relation of purpose, and we say Game and Entertainment. ", "d", 0, 7, this.f630b));
        arrayList7.add(new questions("28.", "SPEED is to FAST as TEMPERATURE is to ", 0, 0, 0, 0, 0, "CLIMATE ", "WARM", "ICE", "THERMOMETER", "Fast is used to describe speed, like wise warm describe temperature. ", "b", 0, 7, this.f630b));
        arrayList7.add(new questions("29.", "FAST is to RUNNING as SLOW is to ", 0, 0, 0, 0, 0, "WALKING", "SPEED", "LAZY", "PACE", "Fast show speed of doing something, similarly slow is speed of working. ", "a", 0, 7, this.f630b));
        arrayList7.add(new questions("30.", "CANDLE: WAX ", 0, 0, 0, 0, 0, "PAPER: PULP", "BAMBOO: FURNITURE", "THREE: LEVELS ", "BRANCH: WOOD ", "Candle is made of wax, and paper is made of pulp. ", "a", 0, 7, this.f630b));
        arrayList7.add(new questions("31.", "CHEF: FOOD ", 0, 0, 0, 0, 0, "BRICK: CARPENTER", "SCULPTOR: STONE", "BRUSH: WALL", "PAINT: PAINTER", "Chef and food have worker and product relation, and a painter paint.", "d", 0, 7, this.f630b));
        arrayList7.add(new questions("32.", "BOARD: TRAIN ", 0, 0, 0, 0, 0, "MOUNT: HORSE", "BICYCLE: DRIVE", "WALK: SHOE", "CHAIR: SIT", "Board and Tran- is getting on train, Mouni: Horse-is getting on horse. ", "a", 0, 7, this.f630b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("33.", "The man VEHEMENTLY denied are the charges of killing that were brought against him", 0, 0, 0, 0, 0, "devoutly", "carelessly", "hysterically", "forcefully", "Vehemently means strong eager felling similar to hysterically. ", "c", 0, 8, this.f630b));
        arrayList8.add(new questions("34.", "Which word means the some as \"COUNTERFEIT\"?", 0, 0, 0, 0, 0, "Copy", "Match", "Robbery", "Fake", "Counterfeit is something made or done in limitation of another thing in order to deceive Fake- what seems genuine. But not ", "d", 0, 8, this.f630b));
        arrayList8.add(new questions("35.", "He inherited a large amount of fortune from his parents. So, he lives a very LAVISH lifestyle. ", 0, 0, 0, 0, 0, "Spartan ", "humble", "stingy", "extravagant", "Lavish - excessive and extravagant-excessively wasting money.", "d", 0, 8, this.f630b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("1.", "What is the average amount of interest on loan per year that the company has to pay during the five year period?", 0, 0, 0, 0, 0, "36.58", "34.18", "33.72", "33.43", "The average amount of interest on loan per year that the company has to pay during the five year period is total amount of interest on loan divided by five,\n \t i.e. 182.9/5=36.58\n", "a", 0, 9, this.f630b));
        arrayList9.add(new questions("2.", "What percent of the total amount of salary was paid as bonus by the company during the given period?", 0, 0, 0, 0, 0, "1.25%", "1.00%", "0.5%", "0.10%", "", "b", C2719R.C2721drawable.sat122e, 9, this.f630b));
        arrayList9.add(new questions("3.", "In which year did the company have the highest expenditure?", 0, 0, 0, 0, 0, "2010", "2012", "2009", "2008", "715.36 million Spent in 2012 is the highest expenditure.", "b", 0, 9, this.f630b));
        arrayList9.add(new questions("4.", "What is the total expenditure of the company in the year 2012?", 0, 0, 0, 0, 0, "456.36", "586", "715.36", "1710", "The total expenditure of the company in the year 2012 is 715.36 million.", "c", 0, 9, this.f630b));
        arrayList9.add(new questions("5.", "For what item or purpose was the company's expenditure the least during the given period?", 0, 0, 0, 0, 0, "Taxes", "Transport and Fuel ", "Bonus", "Salary", "The Company’s least expenditure during the given period was 17.10 million for bonus.", "c", 0, 9, this.f630b));
        arrayList9.add(new questions("6.", "If x=15% of 30 and y=30% of 15, then which of the following is true?", 0, 0, 0, 0, 0, "The relationship between x and y cannot be determined.", "y Is less than x.", "x And y are equal.", "y Is less than x.", "", "b", C2719R.C2721drawable.sat126e, 9, this.f630b));
        arrayList9.add(new questions("7.", "Student X and student Y have Birr 2000. If 4/15 of X's share is equal to 2/5 of Y's share, how much amount does Y have?", 0, 0, 0, 0, 0, "Birr 1200", "Birr 1100", "Birr 800", "Birr 1500", "", "c", C2719R.C2721drawable.sat127e, 9, this.f630b));
        arrayList9.add(new questions("8.", "What is the simplified form of(2x+3)(x+6)-(2x-5)(x+10) ?", 0, 0, 0, 0, 0, "72", "68", "16", "32", "", "b", C2719R.C2721drawable.sat128e, 9, this.f630b));
        arrayList9.add(new questions("9.", "If the square of a number increased by two times the number is equal to six times the number increased by twelve, which one of the following is the possible value of the number?", 0, 0, 0, 0, 0, "-4", "-6", "4", "6", "", "d", C2719R.C2721drawable.sat129e, 9, this.f630b));
        arrayList9.add(new questions("10.", "The monthly telephone bill of Getachew was Birr 400 and it increases by 10% after 12 months, and another 20% increase is applied six months later. What is the price of Getachew's telephone bill after 18 months? ", 0, 0, 0, 0, 0, "Birr 489", "Birr 430", "Birr 520", "Birr 528", "Birr 400 increases by 10% after 12 months and become\n \tBirr (400+10%400)= Birr 440\nAgain Birr 440 increases by 20% after 6 months and become\n \tBirr (440+20%440)= Birr 528\nTherefore, Getachew's telephone bill after 18 months is Birr 528\n", "d", 0, 9, this.f630b));
        arrayList9.add(new questions("11.", "The sum of the ages of the father and his son is equal to sixty years. Six years ago the age of the father was five times the age of the son. What will be the age of the son six years from now?", 0, 0, 0, 0, 0, "22 years", "20 years", "19 years", "23 years", "Let x and y be the present ages of the son and father respectively.\nThe sum of the ages of the father and his son is equal to sixty years, i.e. x+y=60 so that y=60-x…..(1)\nSix years ago the age of the father was five times the age of the son, i.e. y-6=5(x-6)\nThen, using (1),y-6=5(x-6)⇒(60-x)-6=5(x-6)\n \t■(& ⇒54-x=5x-30@& ⇒6x=84⇒x=14)\nThus, six years from now son's age will be:\nx+6=14+6=20\" years \" \n", "b", 0, 9, this.f630b));
        arrayList9.add(new questions("12.", "What is the sum of the following infinite series?\n \t\tS=2-1/3+1-1/9+1/2-1/27+1/4-1/81+⋯?\n", 0, 0, 0, 0, 0, "41/9", "9/2 ", "7/2", "32/9", "", "c", C2719R.C2721drawable.sat1212e, 9, this.f630b));
        arrayList9.add(new questions("13.", "", C2719R.C2721drawable.sat1213q, 0, 0, 0, 0, "78", "55", "66", "45", "", "c", C2719R.C2721drawable.sat1213e, 9, this.f630b));
        arrayList9.add(new questions("14.", "The next term of the sequence 162,54,18,6,… equals to", 0, 0, 0, 0, 0, "1/3", ExifInterface.GPS_MEASUREMENT_3D, ExifInterface.GPS_MEASUREMENT_2D, "1", "The sequence 162,54,18,6,… is Geometric with r=1/3 so that the next term is r×6=1/3×6=2", "c", 0, 9, this.f630b));
        arrayList9.add(new questions("15.", "The first four terms of an arithmetic sequence are 39,33,27 and 21. What is the tenth term of the sequence?", 0, 0, 0, 0, 0, "-33", "-27", "-21", "-15", "", "d", C2719R.C2721drawable.sat1215e, 9, this.f630b));
        arrayList9.add(new questions("16.", "", C2719R.C2721drawable.sat1216q, 0, 0, 0, 0, "38", "41", "39", "40", "", "c", C2719R.C2721drawable.sat1216e, 9, this.f630b));
        arrayList9.add(new questions("17.", "What is the probability of getting exactly two tails when three coins are tossed at the same time?", 0, 0, 0, 0, 0, "3/4", "3/8", "1/4", "1/8", "In tossing three coins at the same time the sample space is \n \tS={HHH,HHT,HTH,HTT,THH,THT,TTH,TTT} And n(\" \" S)=8 \nThe event \"exactly two tails\" is E={HTT,THT,TTH} and n(E)=3 \nThus, the probability of getting exactly two tails is: p=(n(E))/(n(\" \" S))=3/8\n", "b", 0, 9, this.f630b));
        arrayList9.add(new questions("18.", "What is the probability that a number selected at random from the first 50 natural numbers is prime and odd number?", 0, 0, 0, 0, 0, "8/25", "3/5", "3/10", "7/25", "Considering the first 50 natural numbers the sample space S is with n(S)=50, and the event \"prime and odd number\" is\n \tE={3,5,7,11,13,17,19,23,29,31,37,41,43,47} and n(\" \" L)=14 \nThus, the probability of getting prime and odd number is:\n \tp=(n(E))/(n(\" \" S))=14/50=7/25\n", "d", 0, 9, this.f630b));
        arrayList9.add(new questions("19.", "If 3x+7y=80 and x-y=10, then what is the value of x+y ?", 0, 0, 0, 0, 0, "25", "20", "10", "15", "x-y=10⇒y=x-10 in to 3x+7y=80 gives\n3x+7(x-10)=80⇒10x=150⇒x=15\nThen, y=x-10=15-10=5 so that x+y=15+5=20\n", "d", 0, 9, this.f630b));
        arrayList9.add(new questions("20.", "", C2719R.C2721drawable.sat1220q, C2719R.C2721drawable.sat1220a, C2719R.C2721drawable.sat1220b, C2719R.C2721drawable.sat1220c, C2719R.C2721drawable.sat1220d, "", "", "", "", "", "c", C2719R.C2721drawable.sat1220e, 9, this.f630b));
        arrayList9.add(new questions("21.", "The square of the 7th term of an arithmetic progression with positive common difference is equal to the product of the 3rd and 17th terms. What is the ratio of the first term to the common difference?", 0, 0, 0, 0, 0, "4:3", "3:2", "3:4", "2:3", "", "d", C2719R.C2721drawable.sat1221e, 9, this.f630b));
        arrayList9.add(new questions("22.", "", C2719R.C2721drawable.sat1222q, 0, 0, 0, 0, "a+4", "a+2", "4a", "2a", "", "c", C2719R.C2721drawable.sat1222e, 9, this.f630b));
        arrayList9.add(new questions("23.", "", C2719R.C2721drawable.sat1223q, 0, 0, 0, 0, "The relation cannot be determined with the information provided.", "The two quantities are equal.", "Quantity Y is greater than Quantity X.", "Quantity X is greater than Quantity Y.", "", "c", C2719R.C2721drawable.sat1223e, 9, this.f630b));
        arrayList9.add(new questions("24.", "", C2719R.C2721drawable.sat1224q, 0, 0, 0, 0, "The relation cannot be determined with the information provided.", "The two quantities are equal.", "Quantity Y is greater than Quantity X.", "Quantity X is greater than Quantity Y.", "", "a", C2719R.C2721drawable.sat1224e, 9, this.f630b));
        arrayList9.add(new questions("25.", "The rectangular garden measuring 12 meters by 16 meters is to have a pedestrian pathway that is w meters wide installed all way around so that the total area including the pedestrian pathway is 252〖\" \" m〗^2. What is the width of the pathway?", 0, 0, 0, 0, 0, "1.2 m", "15 m", "12 m", "1.5 m", "", "a", C2719R.C2721drawable.sat1225e, 9, this.f630b));
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
        this.f631tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    sat2012.this.timer.setVisibility(0);
                    sat2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    sat2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2012.this.getBaseContext());
                    int unused = sat2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = sat2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = sat2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = sat2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = sat2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = sat2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = sat2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = sat2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = sat2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = sat2012.this.highscore = defaultSharedPreferences.getInt("sat2012hs", 0);
                    int access$200 = sat2012.this.part1 + sat2012.this.part2 + sat2012.this.part3 + sat2012.this.part4 + sat2012.this.part5 + sat2012.this.part6 + sat2012.this.part7 + sat2012.this.part8 + sat2012.this.part9;
                    sat2012.this.resultText.setText(String.valueOf(access$200));
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
                    int unused11 = sat2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = sat2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = sat2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = sat2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = sat2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = sat2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = sat2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = sat2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "sat2012hs";
                    int unused19 = sat2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int access$1300 = sat2012.this.answered1 + sat2012.this.answered2 + sat2012.this.answered3 + sat2012.this.answered4 + sat2012.this.answered5 + sat2012.this.answered6 + sat2012.this.answered7 + sat2012.this.answered8 + sat2012.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$200 > sat2012.this.highscore) {
                        edit.putInt(str, access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 60;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - sat2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1sat121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1sat122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1sat123", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1sat124", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1sat125", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1sat126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1sat127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1sat128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1sat129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1sat1210", 0);
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
                        editor.putString("scoresat121", str3);
                        editor.putLong("date1sat121", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoresat122", str5);
                            editor.putLong("date1sat122", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoresat123", str5);
                            editor.putLong("date1sat123", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoresat124", str5);
                            editor.putLong("date1sat124", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoresat125", str5);
                            editor.putLong("date1sat125", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoresat126", str5);
                            editor.putLong("date1sat126", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoresat127", str5);
                            editor.putLong("date1sat127", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoresat128", str5);
                            editor.putLong("date1sat128", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoresat129", str5);
                            editor.putLong("date1sat129", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoresat1210", str5);
                            editor.putLong("date1sat1210", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datesat121", 0);
                    long j12 = defaultSharedPreferences.getLong("datesat122", 0);
                    long j13 = defaultSharedPreferences.getLong("datesat123", 0);
                    long j14 = defaultSharedPreferences.getLong("datesat124", 0);
                    long j15 = defaultSharedPreferences.getLong("datesat125", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("datesat126", 0);
                    long j17 = defaultSharedPreferences.getLong("datesat127", 0);
                    long j18 = defaultSharedPreferences.getLong("datesat128", 0);
                    long j19 = defaultSharedPreferences.getLong("datesat129", 0);
                    long j20 = defaultSharedPreferences.getLong("datesat1210", 0);
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
                        editor2.putString("iScoresat121", str4);
                        editor2.putLong("datesat121", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoresat122", str6);
                            editor2.putLong("datesat122", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoresat123", str6);
                            editor2.putLong("datesat123", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoresat124", str6);
                            editor2.putLong("datesat124", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoresat125", str6);
                            editor2.putLong("datesat125", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoresat126", str6);
                            editor2.putLong("datesat126", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoresat127", str6);
                            editor2.putLong("datesat127", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoresat128", str6);
                            editor2.putLong("datesat128", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoresat129", str6);
                            editor2.putLong("datesat129", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoresat1210", str6);
                            editor2.putLong("datesat1210", l.longValue());
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
                        sat2012.this.scr.setVisibility(8);
                        sat2012.this.chr.stop();
                        sat2012.this.toolbar.setVisibility(8);
                        sat2012.this.Relative.setBackgroundColor(-7829368);
                        sat2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2012.this.getBaseContext());
                        int unused = sat2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = sat2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = sat2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = sat2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = sat2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = sat2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = sat2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = sat2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = sat2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = sat2012.this.highscore = defaultSharedPreferences.getInt("sat2012hs", 0);
                        int access$200 = sat2012.this.part1 + sat2012.this.part2 + sat2012.this.part3 + sat2012.this.part4 + sat2012.this.part5 + sat2012.this.part6 + sat2012.this.part7 + sat2012.this.part8 + sat2012.this.part9;
                        TextView access$1200 = sat2012.this.resultText;
                        access$1200.setText(access$200 + "/60");
                        sat2012.this.progressbar.setProgress(access$200);
                        sat2012.this.progressbar.setMax(60);
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
                        int unused11 = sat2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = sat2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = sat2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = sat2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = sat2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = sat2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = sat2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = sat2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = sat2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int access$1300 = sat2012.this.answered1 + sat2012.this.answered2 + sat2012.this.answered3 + sat2012.this.answered4 + sat2012.this.answered5 + sat2012.this.answered6 + sat2012.this.answered7 + sat2012.this.answered8 + sat2012.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$200 > sat2012.this.highscore) {
                            edit.putInt("sat2012hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - sat2012.this.chr.getBase()) / 1000;
                        String str = "datesat1210";
                        String str2 = "datesat129";
                        String str3 = "datesat128";
                        String str4 = "datesat127";
                        String str5 = "datesat126";
                        String str6 = "datesat125";
                        String str7 = "datesat124";
                        String str8 = "datesat123";
                        String str9 = "datesat122";
                        String str10 = "datesat121";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1sat1210";
                        String str12 = "date1sat129";
                        if (sat2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1sat121", 0);
                            String str13 = "date1sat121";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1sat122", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1sat123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1sat124", 0);
                            long j5 = defaultSharedPreferences.getLong("date1sat125", 0);
                            String str16 = "date1sat125";
                            String str17 = "date1sat124";
                            String str18 = "date1sat126";
                            long j6 = defaultSharedPreferences.getLong("date1sat126", 0);
                            long j7 = defaultSharedPreferences.getLong("date1sat127", 0);
                            String str19 = str12;
                            String str20 = "date1sat128";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1sat127";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1sat123";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1sat128", 0));
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
                                editor3.putString("scoresat121", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoresat122", str25);
                                    editor3.putLong("date1sat122", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoresat123", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoresat124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoresat125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoresat126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoresat127", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoresat128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoresat129", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoresat1210", str25);
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
                                editor4.putString("iScoresat121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoresat122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoresat123", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoresat124", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoresat125", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoresat126", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoresat127", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoresat128", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoresat129", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoresat1210", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1sat121";
                            String str30 = "date1sat124";
                            String str31 = str12;
                            String str32 = "date1sat123";
                            String str33 = "date1sat127";
                            String str34 = "date1sat126";
                            String str35 = str11;
                            String str36 = "date1sat125";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1300 * access$1300) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1sat122", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1sat122";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1sat128";
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
                                editor2.putString("scoresat121", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoresat122", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoresat123", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoresat124", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoresat125", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoresat126", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoresat127", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoresat128", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoresat129", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoresat1210", str49);
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
                                editor.putString("iScoresat121", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoresat122", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoresat123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoresat124", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoresat125", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoresat126", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoresat127", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoresat128", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoresat129", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoresat1210", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        sat2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2012.this.scr.setVisibility(8);
                sat2012.this.chr.stop();
                sat2012.this.toolbar.setVisibility(8);
                sat2012.this.Relative.setBackgroundColor(sat2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                sat2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2012.this.scr.setVisibility(0);
                sat2012.this.toolbar.setVisibility(0);
                sat2012.this.telegram_layout.setVisibility(8);
                sat2012.this.chr.start();
                sat2012.this.Relative.setBackgroundColor(sat2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = sat2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = sat2012.this.mInterstitialAd = null;
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
                sat2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
