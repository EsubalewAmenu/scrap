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

public class sat2009 extends AppCompatActivity {
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
    private Boolean f624b;
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
    private Toolbar f625tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_sat2009);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultText);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f624b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_sat2009);
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
        arrayList.add(new questions("1.", "CAUSE is to EFFECT as PREDECESSOR is to ", 0, 0, 0, 0, 0, "Foundation ", "Outcome  ", "Successor", "Precursor", "The relation is time sequence predecessor refer to former as successor refers to follower. ", "c", 0, 1, this.f624b));
        arrayList.add(new questions("2.", "DEPARTURE: ARRIVAL ", 0, 0, 0, 0, 0, "Inception: Conclusion", "Beginning: Culmination.", "Upshot: End", "Process: Outcome", "Inception refers to start as conclustion refers to end. ", "a", 0, 1, this.f624b));
        arrayList.add(new questions("3.", "WIDOW is to a WOMAN as……………... is to a MAN. ", 0, 0, 0, 0, 0, "Divorcee", "Widower", "Widow", "Fiance", "Widower is a man who has not married again after his wife's death.", "b", 0, 1, this.f624b));
        arrayList.add(new questions("4.", "LAND is to ARABLE as RIVER is to……………… ", 0, 0, 0, 0, 0, "Shallow", "Navigable", "Water ", "Impenetrable", "Arable is a land suitable for ploughing and navigable is river or sea suitable for transportation. ", "b", 0, 1, this.f624b));
        arrayList.add(new questions("5.", "OPINION is to DEBATE as HYPOTHESIS is to………….   ", 0, 0, 0, 0, 0, "Shallow", "Discovering", "Stating", "Testing", "Hypothesis is idea put forward to be tested and explained. ", "d", 0, 1, this.f624b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("6.", "ARROGANCE", 0, 0, 0, 0, 0, "Truthful", "Humility", "Courage ", "Self - esteem", "Humility- humble condition cause to feel ashamed. ", "b", 0, 2, this.f624b));
        arrayList2.add(new questions("7.", "THRIVE", 0, 0, 0, 0, 0, "Trail", "Strive", "Deteriorate", "Distractive", "Deteriorate- become less value or worse. ", "c", 0, 2, this.f624b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("8.", "IMMEDIATELY:", 0, 0, 0, 0, 0, "Instantly ", "Gradually", "Slowly", "Temporarily", "Instantly- at once, quickly ", "a", 0, 3, this.f624b));
        arrayList3.add(new questions("9.", "CURTAIL ", 0, 0, 0, 0, 0, "Facilitate ", "Improve", "Recover", "Restrain", "Restrain- hold back, keep under control. ", "d", 0, 3, this.f624b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("10.", "'Taciturn' by nature, Eyasu speaks very little even to his on-family members.", 0, 0, 0, 0, 0, "quiet", "talkative", "warm", "obtrusive", "Taciturn is to be the habit of saying very little quiet.", "a", 0, 4, this.f624b));
        arrayList4.add(new questions("11.", "If you can't make it to my graduation party, 'it's not a big deal'  ", 0, 0, 0, 0, 0, "not tolerable", "no need to worry", "surprising", "something I dislike ", "It's not a big deal means no need to worry. ", "b", 0, 4, this.f624b));
        arrayList4.add(new questions("12.", "Hannan remained 'as cool as a cucumber' even when she was in the pressure of the completion against her opponent.", 0, 0, 0, 0, 0, "Strong", "ruffled", "Calm", "agitated", "As cool as a cucumber means calm.", "c", 0, 4, this.f624b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("13.", "Because artist Aster Aweke paved the way for later jazz- fusion musicians, she is considered a…………….  of that style.", 0, 0, 0, 0, 0, "beneficiary", "connoisseur", "revivalist", "Progenitor ", "Progenitor- predecessor ", "d", 0, 5, this.f624b));
        arrayList5.add(new questions("14.", "Even after long years of extensive investigation, scientists could not discover the treatment for cancer. The treatment still remains…………….  ", 0, 0, 0, 0, 0, "clear ", "cursory", "apparent", "mysterious ", "My sterious- hidden, impossible to understand ", "d", 0, 5, this.f624b));
        arrayList5.add(new questions("15.", "While the disease is in…………... state it is almost impossible to determine its existence by………………  ", 0, 0, 0, 0, 0, "a critica--- examination", "an acute----analysis", "a latent---- observation ", "a dormant------postulate ", "Present but not yet active. ", "c", 0, 5, this.f624b));
        arrayList5.add(new questions("16.", "The……………… of the apartment was unbelievable; it was difficult to realize that human beings could live in such…………... ", 0, 0, 0, 0, 0, "squalor --- filth", "stench --- disarray", "disorder --- isolation ", "spacious --- proximity ", "squalor- dirty for living in & filth means disgusting dirt, very dirty. ", "a", 0, 5, this.f624b));
        arrayList5.add(new questions("17.", "As Mohammed and Abdi have planned to join university in the coming year by sponsoring themselves, they are…………and………... a lot.  ", 0, 0, 0, 0, 0, "reading--- saving", "applying---- paying", "teaching --- learning", "working --- entertaining", "reading and saving ", "a", 0, 5, this.f624b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("18.", "What is the primary proposing of the passage? ", 0, 0, 0, 0, 0, "Advocating the importance of black holes. ", "Disproving, an existing theory of black holes. ", "Verifying the danger of black holes for human beings. ", "Explaining, the role that black holes play in the formation of stars.", "Verifying the danger of black holes for human beings. ", "c", 0, 6, this.f624b));
        arrayList6.add(new questions("19.", "What does the word\" minuscule\" in line 4 refer to? ", 0, 0, 0, 0, 0, "tiny", "very large", "Invisible", "noticeable", "The word minuscule refers to tiny- very small ", "a", 0, 6, this.f624b));
        arrayList6.add(new questions("20.", "Which of the following most resembles the relationship between \"black hole activity' & \"star formation\" (lines 8-9) as described in the passage? ", 0, 0, 0, 0, 0, "A crought in a wilderness area causes a significant loss of vegetation in that area.", "Overfishing in a gulf leads to an increase in the population of smaller aquatic organisms. ", "A volcanic eruption on one continent result in higher rainfall total on another continent. ", "Industrial emissions in one region led to an increase in airborne pollutants in adjacent regions. ", "A volcanic eruption on one continent result in higher rainfall total on another continent. ", "c", 0, 6, this.f624b));
        arrayList6.add(new questions("21.", "Which of the following best describes the function of the statement in lines 7-9(\"So it Galaxy\")? ", 0, 0, 0, 0, 0, "It challenges recent scientific findings. ", "It offers examples to support a theory. ", "It introduces a new view of information presented earlier in the passage. ", "It provides support for the argument asserted in the preceding statement. ", "It provides support for the argument asserted in the preceding statement. ", "d", 0, 6, this.f624b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("22.", "According to the passage, which of the following is, TRUE about Miruts Yifter? ", 0, 0, 0, 0, 0, "Miruts had won two gold medals in one Olympic. ", "Miruts had run in all Olympics since Munich Olympics. ", "Miruts won a gold medal the first time he ran at the international stage. ", "Miruts began his career as long- distance runner since his childhood years. ", "Miruts had won two gold in Moscow Olympic.", "a", 0, 7, this.f624b));
        arrayList7.add(new questions("23.", "Which of the following is closest in meaning to the word debut (line5)? ", 0, 0, 0, 0, 0, "First appearance", "Second appearance", "Usual appearance ", "Obligatory appearance ", "Debut means first appearce of a public stage. ", "a", 0, 7, this.f624b));
        arrayList7.add(new questions("24.", "Which of the following is closest in meaning to the word abrupt (line 14)? ", 0, 0, 0, 0, 0, "Easy", "Difficult", "Storm", "Sudden", "Abrupt means unexpected or sudden. ", "d", 0, 7, this.f624b));
        arrayList7.add(new questions("25.", "According to the passage, which one of the following is TRUE about the Gold medal in 5,000 meters Miruts won in Moscow Olympics?", 0, 0, 0, 0, 0, "Miruts had to run with knee. injury when he won the gold medal. ", "It would not have made any difference whether or not Mohammed kedir had stepped aside. ", "Miruts was in uncomfortable position but he came out of that position without anyone's help. ", "Thanks to the support from Moammed kedir, Miruts won the medal with his unique sprint at the end.", "That is because of his teammate, Mohammed kedir's assistance. ", "d", 0, 7, this.f624b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("26.", "If you present a yellow pass, then you may enter the compound, the statement above is true, which of the following must also be true? \nI.\tIf you do not, present a yellow pass, then you ma y not enter the compound. \nII.\tIf you enter the compound, then you must 'have presented a yellow pass. \nIII.\tIf you may not enter the compound, you did not present a yellow pass \n", 0, 0, 0, 0, 0, "III only", "II only", "I only", "I and II only ", "If only- if you may enter the compound, then you must have presented a yellow pass. must have presented a yellow pass. ", "b", 0, 8, this.f624b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("27.", "Which of the following is the best argument used by the citizens who protested the action by the park department? ", 0, 0, 0, 0, 0, "Freedom of speech was violated. ", "A public referendum should have been held. ", "Citizens would be denied the enjoyment of the public park during this one day. ", "The town would incur expenses to clean up the park after the one-day meeting.", "The town would incur expenses to clean up the park after the one-day meeting.", "d", 0, 9, this.f624b));
        arrayList9.add(new questions("28.", "What is the best argument used by the company to retain its license? ", 0, 0, 0, 0, 0, "The company is a local taxpayer.", "No one would be excluded from entering' the park during the meeting.", "Wide publicity had already been given to the location of special meeting. ", "The park had been used before by companies for meetings, concerts, rallies. ", "The company is a local taxpayer.", "a", 0, 9, this.f624b));
        arrayList9.add(new questions("29.", "Since it is possible that. substances Contained in certain tree roots may provide a cure for cancer, the government must provide sufficient funds to allow thorough testing of this possibility. what is the assumption in the argument above?", 0, 0, 0, 0, 0, "A cure for cancer would be extremely valuable to society.", "Substances contained in certain tree roots will probably cure cancer.", "The possibility of finding a cure is sufficient reason for funding research into possible cancer cures.", "The line of research mentioned offers at present the most promising Possibility for finding a cure for cancer. ", "The line of research mentioned offers at present the most promising Possibility for finding a cure for cancer. ", "d", 0, 9, this.f624b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("30.", "Which of the following statements would be Mr. Abera's most effective rebuttal of Ms. Halima's argument:", 0, 0, 0, 0, 0, "My proposal is not 'obviously' wrong. There is only one way to find out if it is wrong, and that is to try it. ", "You have offered statistics to back up neither your claims nor any proposal for an alternative solution to our problem. ", "I have been in this business for 30 years, during which time I have repeatedly proven my ability to identify and solve business problems. ", "our two major competitors do not need to advertise as much as we do, because they are already much better known and have larger shares of the market. ", "My proposal is not 'obviously' wrong. There is only one way to find out if it is wrong, and that is to try it. ", "a", 0, 10, this.f624b));
        arrayList10.add(new questions("31.", "Ms. Halima's primary method of making her point is to: ", 0, 0, 0, 0, 0, "draw and analogy. ", "question Mr. Abera's competence ", "present evidence which was previously overlooked ", "suggests a different underlying cause of the problem. ", "draw an analogy. ", "a", 0, 10, this.f624b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion10);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new questions("32.", "During which day of the week would it be necessary to call on Mohammed to complete the full complement of workers? ", 0, 0, 0, 0, 0, "Friday", "Monday", "Thursday", "Wednesday", "Friday. Because only meaze and yeshi are available.", "a", 0, 11, this.f624b));
        arrayList11.add(new questions("33.", "During which day of the week might it be impossible to obtain a full complement of workers?", 0, 0, 0, 0, 0, "Monday", "Tuesday", "Thursday", "Wednesday", "Tuesday", "b", 0, 11, this.f624b));
        arrayList11.add(new questions("34.", "Which three could you count on to report for work on Friday? ", 0, 0, 0, 0, 0, "Meaza, Nati, and Yeshi. ", "Nati, Meaza, and Mohammed. ", "Mohammed, Meaza, and Yeshi ", "Mohammed, Meaza, and Alemayehu ", "Mohammed, meaze and yeshi", "c", 0, 11, this.f624b));
        arrayList11.add(new questions("35.", "Which three are available on any Monday? ", 0, 0, 0, 0, 0, "Meaza, Nati, and Yeshi ", "Mohammed, Yeshi, and Nati ", "Nati, Meaza, and Mohammed ", "Alemayehy, Meaza, and Mohammed.", "Alemaychu, Meaza and Mohammed ", "d", 0, 11, this.f624b));
        recviewquestion recviewquestion11 = new recviewquestion();
        recviewquestion11.setQuestions(arrayList11);
        this.recview11.setAdapter(recviewquestion11);
        this.recview11.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new questions("1.", "When a number is divided by 2 the result is equal to the result when the same number is divided by 4. What is the number?", 0, 0, 0, 0, 0, "-2", "0", ExifInterface.GPS_MEASUREMENT_2D, "4", "", "b", C2719R.C2721drawable.sat091e, 12, this.f624b));
        arrayList12.add(new questions("2.", "", C2719R.C2721drawable.sat092q, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "a", C2719R.C2721drawable.sat092e, 12, this.f624b));
        arrayList12.add(new questions("3.", "What is the value of x+10, if (x-5)=11/(x+5), for x≠-5?", 0, 0, 0, 0, 0, "-10", "4", "10", "25", "", "d", C2719R.C2721drawable.sat093e, 12, this.f624b));
        arrayList12.add(new questions("4.", "Which of the following is less than z if z is a number between 0 and 1?", 0, C2719R.C2721drawable.sat094a, 0, 0, 0, "", "√z", "2z", "1/z", "", "a", C2719R.C2721drawable.sat094e, 12, this.f624b));
        arrayList12.add(new questions("5.", "What is the sum of the following values ( 1/4+0.25+25/100+10/40+25/50+50/100)", 0, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "b", C2719R.C2721drawable.sat095e, 12, this.f624b));
        arrayList12.add(new questions("6.", "", C2719R.C2721drawable.sat096q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "4", "10", "100", "", "c", C2719R.C2721drawable.sat096e, 12, this.f624b));
        arrayList12.add(new questions("7.", "If 75 percent of x is equal to p percent of 25, where p>0, what is the value of x/p ?", 0, 0, 0, 0, 0, "1/3", "3/16", "3/4", "3 ", "", "a", C2719R.C2721drawable.sat097e, 12, this.f624b));
        arrayList12.add(new questions("8.", "If 15+x is 5 more than 20, what is the value of x", 0, 0, 0, 0, 0, "5", "10 ", "25", "50", "\"Given: \" 15+x\" is \" 5\" more than \" 20⇒15+x=20+5⇒x=10", "b", 0, 12, this.f624b));
        arrayList12.add(new questions("9.", "", C2719R.C2721drawable.sat099q, 0, 0, 0, 0, "2 ", ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "", "c", C2719R.C2721drawable.sat099e, 12, this.f624b));
        arrayList12.add(new questions("10.", "The price of one quintal of sugar is birr 5,800 and it decreases at a rate of birr 2 every three months. The price of one quintal of coffee is birr 4,200 and it increases at a rate of birr 8 every four months. How many years will it take for the two commodities to become equal in price?", 0, 0, 0, 0, 0, "10", "20", "50", "60", "", "c", C2719R.C2721drawable.sat0910e, 12, this.f624b));
        arrayList12.add(new questions("11.", "If as many 7-meter pieces of wire as possible are cut from a wire that is 36 meters long, what is the total length of the wire that is left over?", 0, 0, 0, 0, 0, "1 meter ", "2 meters", "3 meters ", "4 meters", "By long division 36=5×7+1 so that the total length of the wire that is left over is the remainder 1, i.e. 1 meter. ", "a", 0, 12, this.f624b));
        arrayList12.add(new questions("12.", "Hawa used 1/4 of her monthly salary for buying teff and 1/2 more than the price of teff for house rent. What fraction of her monthly salary did Hawa use that month for teff and rent combined?", 0, 0, 0, 0, 0, "1/3", "7/12", "5/8", "3/4", "", "c", C2719R.C2721drawable.sat0912e, 12, this.f624b));
        arrayList12.add(new questions("13.", "When 5 times the number x is added to 12, the result is 32. What number results when 2 times x is added to 7?", 0, 0, 0, 0, 0, "-15", "-5", " 5", "15", "5 times the number x is added to 12, the result is 32\n \t⇒5x+12=32⇒5x=20⇒x=4\n \t⇒2x=8⇒2x+7=15\n", "d", 0, 12, this.f624b));
        arrayList12.add(new questions("14.", "If three students have score X, Y and 80, with their sum equal to 180, what is the average (arithmetic mean) of the three scores?", 0, 0, 0, 0, 0, "60", "70", "80", "90", "If the sum of X,Y and 80 is 180, then\n \tAverage of the three scores =180/3=60\n", "a", 0, 12, this.f624b));
        arrayList12.add(new questions("15.", "If the sum of three consecutive integers is 33, what is the middle integer?", 0, 0, 0, 0, 0, "9", "10", "11", "12", "Let the consecutive integers be: x,x+1 and x+2\nGiven sum of three consecutive integers is 33 \n  \t⇒x+(x+1)+(x+2)=33⇒3x=30⇒x=10\nThus, the middle integer is, x+1=10+1=11 \n", "c", 0, 12, this.f624b));
        arrayList12.add(new questions("16.", "What is the value of E, if ABCDE is a five digit positive number divisible by 5 and 10?", 0, 0, 0, 0, 0, "0", "1", ExifInterface.GPS_MEASUREMENT_2D, "5", "Since 5 is a factor of 10, every number divisible by 10 is also divisible by 5. And only numbers with unit digit zero are divisible by 10. Thus, E=0. ", "c", 0, 12, this.f624b));
        arrayList12.add(new questions("17.", "The arithmetic mean of p and q is 15, and the average of y and x is 15. What is the average of p,y,x, and q ?", 0, 0, 0, 0, 0, "7.5", "15", "22.5", "30", "", "b", C2719R.C2721drawable.sat0917e, 12, this.f624b));
        arrayList12.add(new questions("18.", "Which of the following is the average of the first 10 odd numbers?", 0, 0, 0, 0, 0, "10", "15", "20", "25", "", "a", C2719R.C2721drawable.sat0918e, 12, this.f624b));
        arrayList12.add(new questions("19.", "A number is called \"even-odd\" if it is halfway between an even integer and an odd integer. If x is an even-odd number, which of the following must be true?\n \tI. 2x is an integer.\n \tII. 2x Is even-odd.\n \tIII. x is halfway between two even integers.\n", 0, 0, 0, 0, 0, "I only", "II only", "I and II only", "II and III only", "", "a", C2719R.C2721drawable.sat0919e, 12, this.f624b));
        recviewquestion recviewquestion12 = new recviewquestion();
        recviewquestion12.setQuestions(arrayList12);
        this.recview12.setAdapter(recviewquestion12);
        this.recview12.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new questions("20.", "How many schools had higher rate of saving compared to the rate of the saving from the total income of all schools?", 0, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "a", C2719R.C2721drawable.sat0920e, 13, this.f624b));
        arrayList13.add(new questions("21.", "If each school was expected to save at least 10% of its income, how many schools have met the expectation?", 0, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "d", C2719R.C2721drawable.sat0921e, 13, this.f624b));
        arrayList13.add(new questions("22.", "Assume that one school will be awarded based on the proportion of saving to the income generated. Which school do you think deserve the award?", 0, 0, 0, 0, 0, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "", "d", C2719R.C2721drawable.sat0922e, 13, this.f624b));
        arrayList13.add(new questions("23.", "Which one of the following is NOT true about the income-expenditure data given above?", 0, 0, 0, 0, 0, "The difference between income and expenditure was the highest for School E.", "All Schools have managed to keep their expenditure lower than their income.", "Most of the Schools had annual income which was larger than the average annual income of the five Schools combined.", "Only one School had an annual expenditure which was larger than the average annual expenditure of the five Schools combined", "", "a", C2719R.C2721drawable.sat0923e, 13, this.f624b));
        arrayList13.add(new questions("24.", "The difference between the average annual income and average annual expenditure of the five Schools in ETB is.", 0, 0, 0, 0, 0, "100,000", "240,000", "200,000", "1,200,000", "240,000", "b", 0, 13, this.f624b));
        arrayList13.add(new questions("25.", "The average annual income of the five Schools in ETB is.", 0, 0, 0, 0, 0, "1,200,000", "1,400,000", "1,300,000", "1,440,000", "", "d", C2719R.C2721drawable.sat0925e, 13, this.f624b));
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
        this.f625tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    sat2009.this.timer.setVisibility(0);
                    sat2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    sat2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2009.this.getBaseContext());
                    int unused = sat2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = sat2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = sat2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = sat2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = sat2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = sat2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = sat2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = sat2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = sat2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = sat2009.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = sat2009.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                    int unused12 = sat2009.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                    int unused13 = sat2009.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                    int unused14 = sat2009.this.highscore = defaultSharedPreferences.getInt("sat2009hs", 0);
                    int access$200 = sat2009.this.part1 + sat2009.this.part2 + sat2009.this.part3 + sat2009.this.part4 + sat2009.this.part5 + sat2009.this.part6 + sat2009.this.part7 + sat2009.this.part8 + sat2009.this.part9 + sat2009.this.part10 + sat2009.this.part11 + sat2009.this.part12 + sat2009.this.part13;
                    sat2009.this.resultText.setText(String.valueOf(access$200));
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
                    int unused15 = sat2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused16 = sat2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused17 = sat2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused18 = sat2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused19 = sat2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused20 = sat2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused21 = sat2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused22 = sat2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused23 = sat2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused24 = sat2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int unused25 = sat2009.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                    int unused26 = sat2009.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                    int unused27 = sat2009.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                    int access$1700 = sat2009.this.answered1 + sat2009.this.answered2 + sat2009.this.answered3 + sat2009.this.answered4 + sat2009.this.answered5 + sat2009.this.answered6 + sat2009.this.answered7 + sat2009.this.answered8 + sat2009.this.answered9 + sat2009.this.answered10 + sat2009.this.answered11 + sat2009.this.answered12 + sat2009.this.answered13;
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
                    if (access$200 > sat2009.this.highscore) {
                        edit.putInt("sat2009hs", access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 60;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - sat2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1sat091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1sat092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1sat093", 0);
                    long j4 = defaultSharedPreferences.getLong("date1sat094", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1sat095", 0);
                    long j6 = defaultSharedPreferences.getLong("date1sat096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1sat097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1sat098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1sat099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1sat0910", 0);
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
                        editor.putString("scoresat091", str);
                        editor.putLong("date1sat091", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoresat092", str2);
                            editor.putLong("date1sat092", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoresat093", str2);
                            editor.putLong("date1sat093", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoresat094", str2);
                            editor.putLong("date1sat094", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoresat095", str2);
                            editor.putLong("date1sat095", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoresat096", str2);
                            editor.putLong("date1sat096", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoresat097", str2);
                            editor.putLong("date1sat097", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoresat098", str2);
                            editor.putLong("date1sat098", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoresat099", str2);
                            editor.putLong("date1sat099", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoresat0910", str2);
                            editor.putLong("date1sat0910", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datesat091", 0);
                    long j12 = defaultSharedPreferences.getLong("datesat092", 0);
                    long j13 = defaultSharedPreferences.getLong("datesat093", 0);
                    long j14 = defaultSharedPreferences.getLong("datesat094", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datesat095", 0);
                    long j16 = defaultSharedPreferences.getLong("datesat096", 0);
                    long j17 = defaultSharedPreferences.getLong("datesat097", 0);
                    long j18 = defaultSharedPreferences.getLong("datesat098", 0);
                    long j19 = defaultSharedPreferences.getLong("datesat099", 0);
                    long j20 = defaultSharedPreferences.getLong("datesat0910", 0);
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
                        editor2.putString("iScoresat091", f);
                        editor2.putLong("datesat091", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoresat092", f);
                            editor2.putLong("datesat092", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoresat093", f);
                            editor2.putLong("datesat093", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoresat094", f);
                            editor2.putLong("datesat094", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoresat095", f);
                            editor2.putLong("datesat095", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoresat096", f);
                            editor2.putLong("datesat096", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoresat097", f);
                            editor2.putLong("datesat097", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoresat098", f);
                            editor2.putLong("datesat098", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoresat099", f);
                            editor2.putLong("datesat099", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoresat0910", f);
                            editor2.putLong("datesat0910", valueOf.longValue());
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
                        sat2009.this.scr.setVisibility(8);
                        sat2009.this.chr.stop();
                        sat2009.this.toolbar.setVisibility(8);
                        sat2009.this.Relative.setBackgroundColor(-7829368);
                        sat2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(sat2009.this.getBaseContext());
                        int unused = sat2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = sat2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = sat2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = sat2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = sat2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = sat2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = sat2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = sat2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = sat2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = sat2009.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = sat2009.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                        int unused12 = sat2009.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                        int unused13 = sat2009.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                        int unused14 = sat2009.this.highscore = defaultSharedPreferences.getInt("sat2009hs", 0);
                        int access$200 = sat2009.this.part1 + sat2009.this.part2 + sat2009.this.part3 + sat2009.this.part4 + sat2009.this.part5 + sat2009.this.part6 + sat2009.this.part7 + sat2009.this.part8 + sat2009.this.part9 + sat2009.this.part10 + sat2009.this.part11 + sat2009.this.part12 + sat2009.this.part13;
                        TextView access$1600 = sat2009.this.resultText;
                        access$1600.setText(access$200 + "/60");
                        sat2009.this.progressbar.setProgress(access$200);
                        sat2009.this.progressbar.setMax(60);
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
                        int unused15 = sat2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused16 = sat2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused17 = sat2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused18 = sat2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused19 = sat2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused20 = sat2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused21 = sat2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused22 = sat2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused23 = sat2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused24 = sat2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int unused25 = sat2009.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                        int unused26 = sat2009.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                        int unused27 = sat2009.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                        int access$1700 = sat2009.this.answered1 + sat2009.this.answered2 + sat2009.this.answered3 + sat2009.this.answered4 + sat2009.this.answered5 + sat2009.this.answered6 + sat2009.this.answered7 + sat2009.this.answered8 + sat2009.this.answered9 + sat2009.this.answered10 + sat2009.this.answered11 + sat2009.this.answered12 + sat2009.this.answered13;
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
                        if (access$200 > sat2009.this.highscore) {
                            edit.putInt("sat2009hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - sat2009.this.chr.getBase()) / 1000;
                        String str = "datesat0910";
                        String str2 = "datesat099";
                        String str3 = "datesat098";
                        String str4 = "datesat097";
                        String str5 = "datesat096";
                        String str6 = "datesat095";
                        String str7 = "datesat094";
                        String str8 = "datesat093";
                        String str9 = "datesat092";
                        String str10 = "datesat091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1sat0910";
                        String str12 = "date1sat099";
                        if (sat2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1sat091", 0);
                            String str13 = "date1sat091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1sat092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1sat093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1sat094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1sat095", 0);
                            String str16 = "date1sat095";
                            String str17 = "date1sat094";
                            String str18 = "date1sat096";
                            long j6 = defaultSharedPreferences.getLong("date1sat096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1sat097", 0);
                            String str19 = str12;
                            String str20 = "date1sat098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1sat097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1sat093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1sat098", 0));
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
                                editor3.putString("scoresat091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoresat092", str25);
                                    editor3.putLong("date1sat092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoresat093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoresat094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoresat095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoresat096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoresat097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoresat098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoresat099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoresat0910", str25);
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
                                editor4.putString("iScoresat091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoresat092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoresat093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoresat094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoresat095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoresat096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoresat097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoresat098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoresat099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoresat0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1sat091";
                            String str30 = "date1sat094";
                            String str31 = str12;
                            String str32 = "date1sat093";
                            String str33 = "date1sat097";
                            String str34 = "date1sat096";
                            String str35 = str11;
                            String str36 = "date1sat095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 60;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1sat092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1sat092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1sat098";
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
                                editor2.putString("scoresat091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoresat092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoresat093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoresat094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoresat095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoresat096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoresat097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoresat098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoresat099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoresat0910", str49);
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
                                editor.putString("iScoresat091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoresat092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoresat093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoresat094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoresat095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoresat096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoresat097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoresat098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoresat099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoresat0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        sat2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2009.this.scr.setVisibility(8);
                sat2009.this.chr.stop();
                sat2009.this.toolbar.setVisibility(8);
                sat2009.this.Relative.setBackgroundColor(sat2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                sat2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sat2009.this.scr.setVisibility(0);
                sat2009.this.toolbar.setVisibility(0);
                sat2009.this.telegram_layout.setVisibility(8);
                sat2009.this.chr.start();
                sat2009.this.Relative.setBackgroundColor(sat2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = sat2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = sat2009.this.mInterstitialAd = null;
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
                sat2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
