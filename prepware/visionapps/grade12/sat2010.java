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

public class sat2010 extends AppCompatActivity {
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
    private Boolean f626b;
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
    private Toolbar f627tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_sat2010);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f626b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_sat2010);
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
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "SELFISH:", 0, 0, 0, 0, 0, "Greedy", "Meager ", "Altruistic", "Generous", "Altruistic= to be happy for the happiness of others first. ", "c", 0, 1, this.f626b));
        arrayList.add(new questions("2.", "MEAN; ", 0, 0, 0, 0, 0, "Cruel", "Friendly ", "Unkind", "Malicious", "Friendly=expressing kindness. ", "b", 0, 1, this.f626b));
        arrayList.add(new questions("3.", "CONDENSE:", 0, 0, 0, 0, 0, "Block", "Convert", "Summarize", "Expand", "Expand=make or become large ", "d", 0, 1, this.f626b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("4.", "POVERTY:", 0, 0, 0, 0, 0, "Destitution", "Humility", "Restraint", "Deficit", "Destitution= without things necessary for life. ", "a", 0, 2, this.f626b));
        arrayList2.add(new questions("5.", "MISERABLE:", 0, 0, 0, 0, 0, "Refutable ", "Violent", "Abject", "Challenging", "Abject=wretched, miserable.", "c", 0, 2, this.f626b));
        arrayList2.add(new questions("6.", "MISFORTUNE: ", 0, 0, 0, 0, 0, "Collapse", "Adversity", "Defenselessness", "Crisis", "Adversity=misfortune, affliction. ", "b", 0, 2, this.f626b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("7.", "BEEF is to OXEN as PORK is to:", 0, 0, 0, 0, 0, "PIG", "GOAT", "SHEEP ", "LION", "Pork=flesh of a pig. ", "b", 0, 3, this.f626b));
        arrayList3.add(new questions("8.", "CROWD, is to DISPERSED as MEETING is to: ", 0, 0, 0, 0, 0, "RECESSED ", "ADJOURNED  ", "DEPRESSED ", "DISCUSSED", "Meeting = coming together of a number of persons at a certain time and place for discussion and adjourned means break off proceedings and separated.", "b", 0, 3, this.f626b));
        arrayList3.add(new questions("9.", "CAP is to HEAD as EAR RING is to: ", 0, 0, 0, 0, 0, "EAR", "LEG", "NECK", "HAND", "Ear ring-ring worn on the lobe of the ear as an ornament. ", "a", 0, 3, this.f626b));
        arrayList3.add(new questions("10.", "ADULT is to CHILD as CAT is to: ", 0, 0, 0, 0, 0, "KITTEN", "HERD", "MARE", "ANIMAL", "Kitten=young cat", "a", 0, 3, this.f626b));
        arrayList3.add(new questions("11.", "SUCCESS is to EFFORT as FAILURE is to: ", 0, 0, 0, 0, 0, "DEVOTION", "LAZINESS", "DISASTER", "CHANCE", "Failure=state of not being adequate as a result of laziness. ", "b", 0, 3, this.f626b));
        arrayList3.add(new questions("12.", "FOOT it to LEG as HAND is to: ", 0, 0, 0, 0, 0, "FINGERS ", "THUMB", "ARM", "TOE", "Hand is a part of an arm. ", "c", 0, 3, this.f626b));
        arrayList3.add(new questions("13.", "BEGIN is to START as EMPLOY is to: ", 0, 0, 0, 0, 0, "CELEBRATE", "FIRE", "END", "HIRE", "To begin means to start. Relation of synonyms. \n       To employ means to hire. \nsentence completion \n", "d", 0, 3, this.f626b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("14.", "It was a war the prime minister and her wise counselors wished to…………. if they could and were determined in any event to…………. as long, as possible. They were repeatedly meeting and discussing on this issue until the case was under their control. ", 0, 0, 0, 0, 0, "curtail: promote ", "oppose: light", "provoke: delay ", "avoid: postpone ", "avoid) get away from/ postpone/put off/ ", "d", 0, 4, this.f626b));
        arrayList4.add(new questions("15.", "Typically, legal proceedings begin with an investigation meant to………... evidence, followed by a trial that establishes whether that evidence…………. a criterion \"beyond a reasonable doubt\" in criminal proceedings and \"according to the preponderance of evidence\" in civil proceedings. ", 0, 0, 0, 0, 0, "show: declare", "verify: contradicts", "collect: meets ", "mean: amounts ", "Collect: meets (gather: suitable, proper) ", "c", 0, 4, this.f626b));
        arrayList4.add(new questions("16.", "The natural balance between prey and predator has been increasingly…………, usually because of the human intervention. ", 0, 0, 0, 0, 0, "recognized", "disturbed", "observed", "predicted", "disturbed=affected ", "b", 0, 4, this.f626b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("17.", "Choose the word that is different from the other three ", 0, 0, 0, 0, 0, "Stern", "Leaf", "Dirt", "Root ", "The other three are parts of a tree.", "c", 0, 5, this.f626b));
        arrayList5.add(new questions("18.", "Which one of the following words does Not belom4 with the others? ", 0, 0, 0, 0, 0, "Earth ", "Mars", "Jupiter ", "COSMOS", "The other three are planets, but cosmos is the universe where the planets are well-ordered. ", "d", 0, 5, this.f626b));
        arrayList5.add(new questions("19.", "Choose the odd one out of the following words ", 0, 0, 0, 0, 0, "Disgust", "Anger", "August", "Laughter", "The other three show person's negative /strong/feelings. ", "d", 0, 5, this.f626b));
        arrayList5.add(new questions("20.", "Which one of the following words does Not belong with the others? ", 0, 0, 0, 0, 0, "Sugarcane ", "Apple", "Orange ", "Grape", "The other three are fruits. ", "a", 0, 5, this.f626b));
        arrayList5.add(new questions("21.", "Choose the word that is different from the other three, ", 0, 0, 0, 0, 0, "Zoology", "Biology", "Ecology", "Psychology", "The other three refer to science of the physical life of animals.", "d", 0, 5, this.f626b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("22.", "Which of the following is the correct word that should replace 4 (the fourth bank in the passage) is? ", 0, 0, 0, 0, 0, "exception", "trend", "warmest", "unprecedented", "warmest—having high degree of heat. ", "c", 0, 6, this.f626b));
        arrayList6.add(new questions("23.", "Which of the following is the correct word that should replace 2 (the second bank in the passage) is?", 0, 0, 0, 0, 0, "exception", "unprecedented", "emissions", "warmest", "unprecedented—never done or known before.", "b", 0, 6, this.f626b));
        arrayList6.add(new questions("24.", "The correct word that should replace 1 (the first blank in the passage) is ", 0, 0, 0, 0, 0, "emissions", "warmest", "unprecedented", "trend", "trend=tendency", "d", 0, 6, this.f626b));
        arrayList6.add(new questions("25.", "Which of the following is the correct word that should replace 3 (the third blank in the passage) is?", 0, 0, 0, 0, 0, "emissions", "trend ", "warmest", "unprecedented", "emission=sending out light, heat etc. ", "a", 0, 6, this.f626b));
        arrayList6.add(new questions("26.", "Which of the following is the correct word that should replace 5 (the fifth blank in the passage) is?", 0, 0, 0, 0, 0, "trend", "exception", "warmest", "unprecedented", "exception = not included ", "b", 0, 6, this.f626b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("27.", "Obesity is a serious problem in many developed countries. Research suggests that obesity can lead to a number of health problems including diabetes, asthma and heart disease, Recent research has even indicated that there may be a relationship between obesity and sonic types of cancer. Major public health campaigns that increase awareness and propose simple lifestyle changes that will, with diligence and desire, eliminate or at least mitigate the Changes that will, with diligence and desire, eliminate or at least mitigate the incidence of obesity are a crucial first step in battling this critical problem. \nThis paragraph best supports the statement that a decline in obesity would radically\n", 0, 0, 0, 0, 0, "A decline in obesity would radically decrease the incidence of asthma. ", "public health campaigns that raise consciousness and propose lifestyle changes are a productive way to tight obesity. ", "people in those countries watch too much television and do not exercise enough.", "fast-food restaurants and unhealthy school lunches contribute greatly to obesity.", "The paragraph best supports ", "b", 0, 7, this.f626b));
        arrayList7.add(new questions("28.", "Hassen is standing to the right of Bereket, Beletu is standing on the opposite side of Bereket. Since the opposite of right is wrong, Beletu must be standing on the wrong side of Bereket. \nWhich of the following logical errors has the author of the argument above committed? ", 0, 0, 0, 0, 0, "He has confused cause and effect. ", "He has provided in factual evidence for his conclusion. ", "lie has used a single term to mean two different things. ", "He has drawn a general conclusion from an insufficient number of examples. ", "A single term has been used to mean two different things. ", "b", 0, 7, this.f626b));
        arrayList7.add(new questions("29.", "Alula must be a basketball player; he is wearing a basketball jersey. The conclusion above is valid only if it is true that: ", 0, 0, 0, 0, 0, "All basketball players wear basketball jerseys.", "Basketball players often wear basketball jerseys. ", "Basketball players are required to wear basketball jerseys. ", "Only basketball players wear basketball jerseys.", "Only basketball players wear basketball jerseys. ", "d", 0, 7, this.f626b));
        arrayList7.add(new questions("30.", "Today's secondary school students spend too much time thinking, about trivial and distracting matters such as fashion. Additionally, they often dress inappropriately on college grounds. Rather than spending time writing another detailed dress policy, we should make school uniforms mandatory. if students were required to wear uniforms, it would increase a sense of community and harmony in our schools and it would install a sense of discipline in our students. Another positive effect would be that teachers and administrators would no longer have to act as clothing police, freeing them up to focus on more important issues. \nThis paragraph best supports the statement that \n", 0, 0, 0, 0, 0, "school uniforms should be compulsory for secondary school students. ", "students are not interested in being part of a community. ", "students who wear school uniforms get into better colleges. ", "inappropriate clothing leads to failing grades. ", "The paragraph best supports", "a", 0, 7, this.f626b));
        arrayList7.add(new questions("31.", "Today's secondary school students are not being educated. They are being trained. Their teachers demand little of them other than that they memorize facts and follow directions. The current emphasis on training in basic math and verbal skills, while a useful step, rarely leads to the essential second step development of independent critical thinking.\nThe author would probably consider which of the following aspects of a student's term paper to be most praise worthy?\n", 0, 0, 0, 0, 0, "The use of grammatically correct sentence structure. ", "Evidence of extensive research prior to writing.", "The choice of a challenging topic ", "Evidence of original insights and freshly developed concepts. ", "The use of grammatically correct sentence. ", "a", 0, 7, this.f626b));
        arrayList7.add(new questions("32.", "A company worker has six children. No one else in the factory has six children. Which Of the following conclusions logically follows from the statements given above?  ", 0, 0, 0, 0, 0, "Some of the company workers have more than six children. ", "Only one worker in the company has exactly six children. ", "All workers in the company have six children each.", "Everybody in the company has children. ", "Only one worker in the company has exactly six children. ", "b", 0, 7, this.f626b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("33.", "Statement: - If all the players play to their Full potential, we will win the football      match. When have won the football match. \nConclusions: - I. All players played to their full potential. \n                         II. Some players did not play to their full potential. \n", 0, 0, 0, 0, 0, "Both I and II follows", "Only conclusion II follows ", "Only conclusion I follows ", "Either I or II follows ", "They have won the football match because all the players were required to play to their full potential and they did it. ", "c", 0, 8, this.f626b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("34.", "Which of the following is true about where R lives? ", 0, 0, 0, 0, 0, "Fourth floor, opposite A and C ", "First floor, below B or F. ", "Second flour, below J or A and C ", "Third floor, above M or E ", "R lives below B or F on the first floor.  ", "b", 0, 9, this.f626b));
        arrayList9.add(new questions("35.", "Which of the following lists the persons named in the correct order, from the bottom floor to the top?", 0, 0, 0, 0, 0, "P, B, J, C, N, L ", "R, B, M, A, L, N", "R, F, N, E, L, C", "L, E, A, M, F, R", "The correct order of persons going from the bottom floor to the top would be P, B, C and A, N and L and W. ", "a", 0, 9, this.f626b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("1.", "The difference between a positive proper fraction and its reciprocal is 9/20. What is the value of the fraction?", 0, 0, 0, 0, 0, "5/4", "3/5", "4/3", "4/2", "", "a", C2719R.C2721drawable.sat101e, 10, this.f626b));
        arrayList10.add(new questions("2.", "÷0.1÷0.01÷0.001 is equal to", 0, 0, 0, 0, 0, "0.00001", "0.001", "1,000,000", "100", "1÷0.1÷0.01÷0.001=1÷(0.1×0.01×0.001\n \t=1÷(0.000001)=1,000,000\n \t=5/7\n", "c", 0, 10, this.f626b));
        arrayList10.add(new questions("3.", "If b≠0 and a/5=b/7, what is the value of a/b", 0, 0, 0, 0, 0, "7/5", "1/5", "1/7", "5/7", "For b≠0 multiplying both sides by 3/b,a/5=b/7⇒a/b=5/7 ", "d", 0, 10, this.f626b));
        arrayList10.add(new questions("4.", "If s is a number between 0 & 1, which of the following is NOT more than?  ", 0, 0, 0, C2719R.C2721drawable.sat104c, 0, "√s", "1/s", "", "2s", "", "c", C2719R.C2721drawable.sat104e, 10, this.f626b));
        arrayList10.add(new questions("5.", "", C2719R.C2721drawable.sat105q, 0, 0, 0, 0, "10", "1", "0.1", "100", "", "b", 0, 10, this.f626b));
        arrayList10.add(new questions("6.", "Three professors contested an election for a university president and received 1136, 7636 and 11628 votes, respectively. What percentage of the total votes did the winning professor get?", 0, 0, 0, 0, 0, "65%", "57%", "59%", "61%", "Total votes given=1136+7636+11628=20400\n \tThe winner is the professor with 11628 votes so that\n \tPercentage of 11628= 11628/20400×100%=57%\n", "b", 0, 10, this.f626b));
        arrayList10.add(new questions("7.", "What number increased by 3 is equal to 3 less than twice the number?", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_3D, "6", "9", "12", "Let the required number be x.\nThen, given: x is a number increased by 3 and equals to 3 less than twice x⇒x+3=2x-3⇒x=6\n", "b", 0, 10, this.f626b));
        arrayList10.add(new questions("8.", "If one-fourth of one-third of a number is 15, then what is three-tenth of that number?", 0, 0, 0, 0, 0, "54", "45", "39", "12", "", "a", C2719R.C2721drawable.sat108e, 10, this.f626b));
        arrayList10.add(new questions("9.", "The sum of ages of 5 children born at the interval of 3 years each is 50 years. What is the age of the youngest child?", 0, 0, 0, 0, 0, "10 years ", "6 years", "8 years ", "4 years", "Let x be age of the youngest among five children born at the interval of 3 years each and the sum of their ages is 50 years\nx+(x+3)+(x+6)+(x+9)+(x+12)=50\n ⇒5x+30=50⇒x=4 Years - age of the youngest child \n", "d", 0, 10, this.f626b));
        arrayList10.add(new questions("10.", "If y≠0 and xy=y/6, what is the value of x?", 0, 0, 0, 0, 0, "1/8", "1/4", "1/6", "1/2", "For y≠0 multiplying both sides by 1/y,xy=y/6⇒x=1/6 □( ) ", "c", 0, 10, this.f626b));
        arrayList10.add(new questions("11.", "An athlete completes a journey in 10 hours. He travels first half of the journey at a rate of 21km/hr and second half at a rate of 24\" \" km/hr. What is the total journey in km ?", 0, 0, 0, 0, 0, "225 km", "218 km", "216 km", "230 km", "", "n", C2719R.C2721drawable.sat1011e, 10, this.f626b));
        arrayList10.add(new questions("12.", "What is the product of(√7-2)(√7+2) ?", 0, 0, 0, 0, 0, "5", "4", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "", "d", C2719R.C2721drawable.sat1012e, 10, this.f626b));
        arrayList10.add(new questions("13.", "A library has an average of 510 visitors on Sunday and 240 on other days. What is the average number of visitors per day in a month of 30 days beginning with a Sunday?", 0, 0, 0, 0, 0, "285", "283", "275", "290", "", "a", C2719R.C2721drawable.sat1013e, 10, this.f626b));
        arrayList10.add(new questions("14.", "Look at the pattern carefully: 10, 20, 25, 35, 40, 50, 55… then which of the following pairs of numbers comes next?", 0, 0, 0, 0, 0, "6075", "6065", "6570", "6070", "10,20,25,35,40,50,55… Is going adding 10 and then 5 alternately so that 55+10=65 and 55+10+5=70 are pairs of numbers coming next.", "c", 0, 10, this.f626b));
        arrayList10.add(new questions("15.", "What number should come next in the series 7,10,8,11,9,12,… ? ", 0, 0, 0, 0, 0, "12", "10", "13", "7", "The series: 7,10,8,11,9,12,… is going by adding 3 and then, subtracting the series: 7,10,8,11,9,12,… is going by adding 3 and then, subtracting 2", "b", 0, 10, this.f626b));
        arrayList10.add(new questions("16.", "What number should come next in the series 58,52,46,40,34,… ?", 0, 0, 0, 0, 0, "34", "30", "32", "28", "The series: 58,52,46,40,34,… is going Answer- D 34-6=28 comes next. ", "d", 0, 10, this.f626b));
        arrayList10.add(new questions("17.", "What number should come next in the series 544,509,474,439,… ?", 0, 0, 0, 0, 0, "445", "420", "404", "414 ", "The series: 544,509,474,439,… is going arithmetically, subtracting 35 so that 439-35=404 comes next", "c", 0, 10, this.f626b));
        arrayList10.add(new questions("18.", "Look at the pattern carefully: 32, 31, 32, 29, 32, 27, 32… then which of the following pairs of numbers comes next?", 0, 0, 0, 0, 0, "2932", "2532", "2530", "2930", "32,31,32,29,32,27,32… is going keeping 32 constant for the oddthterms and a_8=a_6-2=27-2=25 ⇒ the pair 2532 comes next", "b", 0, 10, this.f626b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new questions("19.", "", C2719R.C2721drawable.sat1019q, 0, 0, 0, 0, "The two quantities are equal. ", "The relationship cannot be determined from the information given.", "Quantity A is less than quantity B", "Quantity A is greater than quantity B.", "", "b", C2719R.C2721drawable.sat1019e, 11, this.f626b));
        arrayList11.add(new questions("20.", "", C2719R.C2721drawable.sat1020q, 0, 0, 0, 0, "Quantity A is greater than quantity B.", "The two quantities are equal.", "Quantity A is less than quantity B.", "The relationship cannot be determined from the information given.", "", "a", C2719R.C2721drawable.sat1020e, 11, this.f626b));
        recviewquestion recviewquestion11 = new recviewquestion();
        recviewquestion11.setQuestions(arrayList11);
        this.recview11.setAdapter(recviewquestion11);
        this.recview11.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new questions("21.", "What is the percentage of candidates qualified from region AM for all the years together, over the candidates took the exam from Region AM during the years together?", 0, 0, 0, 0, 0, "11.75%", "11.46%", "11.57%", "11.15%", "", "d", C2719R.C2721drawable.sat1021e, 12, this.f626b));
        arrayList12.add(new questions("22.", "What percent is the total number of qualified candidates in 1997-2000 to the total number of those qualified in 2001-2004?", 0, 0, 0, 0, 0, "80%", "78%", "84%", "76%", "", "b", C2719R.C2721drawable.sat1022e, 12, this.f626b));
        arrayList12.add(new questions("23.", "What is the percentage of total number of qualified candidates to the total number of candidates took the exam among all the five regions in 2002?", 0, 0, 0, 0, 0, "11.84%", "11.52%", "11.48%", "11.89%", "", "a", C2719R.C2721drawable.sat1023e, 12, this.f626b));
        arrayList12.add(new questions("24.", "In which of the given years the number of candidates took the exam from region OR has maximum percentage of qualified candidates?", 0, 0, 0, 0, 0, "2000", "2003", "2001", "2004", "Even though 2004 doesn't mean2001-2004, we consider from the last row that the maximum percentage of qualified candidates of region OR occurred in 2004", "d", 0, 12, this.f626b));
        arrayList12.add(new questions("25.", "What is the average number of candidates who took the exam from Region TI during the given years?", 0, 0, 0, 0, 0, "8990", "8900", "8860", "8800", "", "a", C2719R.C2721drawable.sat1025e, 12, this.f626b));
        recviewquestion recviewquestion12 = new recviewquestion();
        recviewquestion12.setQuestions(arrayList12);
        this.recview12.setAdapter(recviewquestion12);
        this.recview12.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f627tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    sat2010.this.timer.setVisibility(0);
                    sat2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    sat2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2010.this.getBaseContext());
                    int unused = sat2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = sat2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = sat2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = sat2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = sat2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = sat2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = sat2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = sat2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = sat2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = sat2010.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = sat2010.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                    int unused12 = sat2010.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                    int unused13 = sat2010.this.highscore = defaultSharedPreferences.getInt("sat2010hs", 0);
                    int access$200 = sat2010.this.part1 + sat2010.this.part2 + sat2010.this.part3 + sat2010.this.part4 + sat2010.this.part5 + sat2010.this.part6 + sat2010.this.part7 + sat2010.this.part8 + sat2010.this.part9 + sat2010.this.part10 + sat2010.this.part11 + sat2010.this.part12;
                    sat2010.this.resultText.setText(String.valueOf(access$200));
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
                    int unused14 = sat2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused15 = sat2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused16 = sat2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused17 = sat2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused18 = sat2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused19 = sat2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused20 = sat2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused21 = sat2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused22 = sat2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused23 = sat2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int unused24 = sat2010.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                    int unused25 = sat2010.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                    int access$1600 = sat2010.this.answered1 + sat2010.this.answered2 + sat2010.this.answered3 + sat2010.this.answered4 + sat2010.this.answered5 + sat2010.this.answered6 + sat2010.this.answered7 + sat2010.this.answered8 + sat2010.this.answered9 + sat2010.this.answered10 + sat2010.this.answered11 + sat2010.this.answered12;
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
                    if (access$200 > sat2010.this.highscore) {
                        edit.putInt("sat2010hs", access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 60;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - sat2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1sat101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1sat102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1sat103", 0);
                    long j4 = defaultSharedPreferences.getLong("date1sat104", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1sat105", 0);
                    long j6 = defaultSharedPreferences.getLong("date1sat106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1sat107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1sat108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1sat109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1sat1010", 0);
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
                        editor.putString("scoresat101", str);
                        editor.putLong("date1sat101", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoresat102", str2);
                            editor.putLong("date1sat102", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoresat103", str2);
                            editor.putLong("date1sat103", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoresat104", str2);
                            editor.putLong("date1sat104", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoresat105", str2);
                            editor.putLong("date1sat105", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoresat106", str2);
                            editor.putLong("date1sat106", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoresat107", str2);
                            editor.putLong("date1sat107", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoresat108", str2);
                            editor.putLong("date1sat108", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoresat109", str2);
                            editor.putLong("date1sat109", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoresat1010", str2);
                            editor.putLong("date1sat1010", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datesat101", 0);
                    long j12 = defaultSharedPreferences.getLong("datesat102", 0);
                    long j13 = defaultSharedPreferences.getLong("datesat103", 0);
                    long j14 = defaultSharedPreferences.getLong("datesat104", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datesat105", 0);
                    long j16 = defaultSharedPreferences.getLong("datesat106", 0);
                    long j17 = defaultSharedPreferences.getLong("datesat107", 0);
                    long j18 = defaultSharedPreferences.getLong("datesat108", 0);
                    long j19 = defaultSharedPreferences.getLong("datesat109", 0);
                    long j20 = defaultSharedPreferences.getLong("datesat1010", 0);
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
                        editor2.putString("iScoresat101", f);
                        editor2.putLong("datesat101", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoresat102", f);
                            editor2.putLong("datesat102", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoresat103", f);
                            editor2.putLong("datesat103", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoresat104", f);
                            editor2.putLong("datesat104", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoresat105", f);
                            editor2.putLong("datesat105", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoresat106", f);
                            editor2.putLong("datesat106", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoresat107", f);
                            editor2.putLong("datesat107", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoresat108", f);
                            editor2.putLong("datesat108", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoresat109", f);
                            editor2.putLong("datesat109", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoresat1010", f);
                            editor2.putLong("datesat1010", valueOf.longValue());
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
                        sat2010.this.scr.setVisibility(8);
                        sat2010.this.chr.stop();
                        sat2010.this.toolbar.setVisibility(8);
                        sat2010.this.Relative.setBackgroundColor(-7829368);
                        sat2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2010.this.getBaseContext());
                        int unused = sat2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = sat2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = sat2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = sat2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = sat2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = sat2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = sat2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = sat2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = sat2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = sat2010.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = sat2010.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                        int unused12 = sat2010.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                        int unused13 = sat2010.this.highscore = defaultSharedPreferences.getInt("sat2010hs", 0);
                        int access$200 = sat2010.this.part1 + sat2010.this.part2 + sat2010.this.part3 + sat2010.this.part4 + sat2010.this.part5 + sat2010.this.part6 + sat2010.this.part7 + sat2010.this.part8 + sat2010.this.part9 + sat2010.this.part10 + sat2010.this.part11 + sat2010.this.part12;
                        TextView access$1500 = sat2010.this.resultText;
                        access$1500.setText(access$200 + "/60");
                        sat2010.this.progressbar.setProgress(access$200);
                        sat2010.this.progressbar.setMax(60);
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
                        int unused14 = sat2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused15 = sat2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused16 = sat2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused17 = sat2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused18 = sat2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused19 = sat2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused20 = sat2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused21 = sat2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused22 = sat2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused23 = sat2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int unused24 = sat2010.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                        int unused25 = sat2010.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                        int access$1600 = sat2010.this.answered1 + sat2010.this.answered2 + sat2010.this.answered3 + sat2010.this.answered4 + sat2010.this.answered5 + sat2010.this.answered6 + sat2010.this.answered7 + sat2010.this.answered8 + sat2010.this.answered9 + sat2010.this.answered10 + sat2010.this.answered11 + sat2010.this.answered12;
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
                        if (access$200 > sat2010.this.highscore) {
                            edit.putInt("sat2010hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - sat2010.this.chr.getBase()) / 1000;
                        String str = "datesat1010";
                        String str2 = "datesat109";
                        String str3 = "datesat108";
                        String str4 = "datesat107";
                        String str5 = "datesat106";
                        String str6 = "datesat105";
                        String str7 = "datesat104";
                        String str8 = "datesat103";
                        String str9 = "datesat102";
                        String str10 = "datesat101";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1sat1010";
                        String str12 = "date1sat109";
                        if (sat2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1sat101", 0);
                            String str13 = "date1sat101";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1sat102", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1sat103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1sat104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1sat105", 0);
                            String str16 = "date1sat105";
                            String str17 = "date1sat104";
                            String str18 = "date1sat106";
                            long j6 = defaultSharedPreferences.getLong("date1sat106", 0);
                            long j7 = defaultSharedPreferences.getLong("date1sat107", 0);
                            String str19 = str12;
                            String str20 = "date1sat108";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1sat107";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1sat103";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1sat108", 0));
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
                                editor3.putString("scoresat101", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoresat102", str25);
                                    editor3.putLong("date1sat102", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoresat103", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoresat104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoresat105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoresat106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoresat107", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoresat108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoresat109", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoresat1010", str25);
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
                                editor4.putString("iScoresat101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoresat102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoresat103", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoresat104", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoresat105", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoresat106", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoresat107", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoresat108", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoresat109", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoresat1010", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1sat101";
                            String str30 = "date1sat104";
                            String str31 = str12;
                            String str32 = "date1sat103";
                            String str33 = "date1sat107";
                            String str34 = "date1sat106";
                            String str35 = str11;
                            String str36 = "date1sat105";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1600 * access$1600) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1sat102", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1sat102";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1sat108";
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
                                editor2.putString("scoresat101", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoresat102", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoresat103", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoresat104", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoresat105", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoresat106", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoresat107", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoresat108", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoresat109", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoresat1010", str49);
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
                                editor.putString("iScoresat101", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoresat102", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoresat103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoresat104", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoresat105", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoresat106", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoresat107", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoresat108", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoresat109", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoresat1010", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        sat2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2010.this.scr.setVisibility(8);
                sat2010.this.chr.stop();
                sat2010.this.toolbar.setVisibility(8);
                sat2010.this.Relative.setBackgroundColor(sat2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                sat2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2010.this.scr.setVisibility(0);
                sat2010.this.toolbar.setVisibility(0);
                sat2010.this.telegram_layout.setVisibility(8);
                sat2010.this.chr.start();
                sat2010.this.Relative.setBackgroundColor(sat2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = sat2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = sat2010.this.mInterstitialAd = null;
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
                sat2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
