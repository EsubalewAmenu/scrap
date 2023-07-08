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
import kotlinx.coroutines.DebugKt;
import p013io.reactivex.annotations.SchedulerSupport;

public class english2011 extends AppCompatActivity {
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
    private Boolean f558b;
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
    private Toolbar f559tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2011);
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEnglish2011);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        Intent intent = getIntent();
        this.f558b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_english2011);
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
        arrayList.add(new questions("1.", "the elsewhere is of unfriendly town people full from. ", 0, 0, 0, 0, 0, "The town is full of unfriendly people from elsewhere. ", "The town is unfriendly full of people from elsewhere.", "Unfriendly people from elsewhere is full of the town. ", "From elsewhere is the town full of unfriendly people. ", "S + v + noun phrase as complement +place ", "a", 0, 1, this.f558b));
        arrayList.add(new questions("2.", "they who are know do you?", 0, 0, 0, 0, 0, "Do they know who are you?", "Who are you do they know? ", "Who do you know they are? ", "Do they know who you are? ", "v + s + v + word + s + v ", "d", 0, 1, this.f558b));
        arrayList.add(new questions("3.", "his bet would I heart she win. ", 0, 0, 0, 0, 0, "I would win she bet his heart ", "I bet she would win his heart ", "I win his heart she would bet ", "She would win I bit his heart. ", "I bet she would win his heart ", "b", 0, 1, this.f558b));
        arrayList.add(new questions("4.", "before were in they all packed room interrogation tiny started.", 0, 0, 0, 0, 0, "Interrogation were started before they all packed in a tiny room. ", "Before they were packed started all interrogation in a tiny room ", "They were all packed in a tiny room before interrogation started. ", "All packed in a tiny room before they were started interrogation.", "They were all packed in a tiny room before interrogation started. ", "c", 0, 1, this.f558b));
        arrayList.add(new questions("5.", "a take half it one days to may and cure.", 0, 0, 0, 0, 0, "It may take one and half days to a cure. ", "It may take one and a half days to cure ", "It may take to cure one and a half days. ", "It may take a one and half days to cure. ", "It may take one and a half days to cure ", "b", 0, 1, this.f558b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("6.", "a. Finally, they advise that continued efforts are required to strengthen the other financial sectors. \nb. However, these reforms should include the development of a market for government securities with market determined interest rates. \nc. Experts argue that financial sector reforms-would increase the effectiveness of monetary policy and support development goals.\nd. Until this market develops. they argue, National Bank of Ethiopia bills should be used solely to manage liquidity in the banking system. \ne. In addition to this, they state that 6e gradual opening of the financial sector to foreign investors could improve services and technology and know- how. \nf. Moreover, they recommend that channeling the payment of taxes through banks could deepen financial intermediation, reduce opportunities for corruption and improve the business climate.\n", 0, 0, 0, 0, 0, "f a c b e d", "b d e f a c", "a c f e d b", "c a e f d b ", "c a e f d b ", "d", 0, 2, this.f558b));
        arrayList2.add(new questions("7.", "a. But that has never been true at all. \nb. Lately, however, I decided to get more serious. \nc. people think I am smart because I do well in school. \nd. To tell you the truth, I usually struggled in my school life. \ne. First, I decided to become interested in whatever I was \n", 0, 0, 0, 0, 0, "c a d b e", "e a d b c", "d e a c b ", "c e d a b ", "'C' is the topic sentence developed by supplementary sentences.", "a", 0, 2, this.f558b));
        arrayList2.add(new questions("8.", "a. But issues of access and quality loom large. \nb. About 50 million children remain out of school. \nc. Apparently, it is also this section of the population who have lowest access to education. \nd. Africa is also the only region where the number of out of school adolescents has risen in recent years. \ne. Africa has the largest return on education, with each additional year of schooling raising earnings by 11 percent for males and 14 percent for females.  \nf. This is partly because of rapid population growth among the poorest.\n", 0, 0, 0, 0, 0, "b c a e d f ", "b e a c f d", "a f e c b d ", "a b e f c d", "e, a, c, f and are developing the topic sentence 'b' ", "b", 0, 2, this.f558b));
        arrayList2.add(new questions("9.", "a. You should appreciate this perfect system for cleaning your room. \nb. Now find a location for the items you had placed in the center of the room. \nc. Then, take out all of the trash and any other thing you have not used recently. \nd. For any remaining items, see if you can stuff them into the back of your closet. \ne. Start with moving items that do not have a proper place to the center of the room.\n", 0, 0, 0, 0, 0, "a e d b c", "a e b c d", "e b c d a ", "a e c b d ", "It is a paragraph that shows the steps to clean and rearrange items in your room. ", "b", 0, 2, this.f558b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("10.", "What would be the possible situation of students who get the short end of the stick (para.5)? ", 0, 0, 0, 0, 0, "They are compensated for their hard work.", "They score higher than those who cheat. ", "They score equally with those who-cheat. ", "They score lower than those who cheat.", "Line B", "d", 0, 3, this.f558b));
        arrayList3.add(new questions("11.", "What is the writer's view about the consequence of cheating in schools ( para: 1)? ", 0, 0, 0, 0, 0, "How a student cheated should 'be the main factor for the measure taken. ", "It is not surprising cheating. ", "The measure taken for cheating should consider why a student cheated.", "Cheaters should, by any means, face the consequences of their action. ", "Line 11-12", "a", 0, 3, this.f558b));
        arrayList3.add(new questions("12.", "Which one of the following sentences best summarizes Paragraph 2? ", 0, 0, 0, 0, 0, "Cheating creates lazy students. ", "Cheating discourages hardworking students. ", "Cheating should not be tolerated at all. ", "Students cheat only to confirm their answers. ", "Line 8", "d", 0, 3, this.f558b));
        arrayList3.add(new questions("13.", "What does the phrase, …. this type of cheating.... (Para 3, last sentence) refer to?", 0, 0, 0, 0, 0, "Storing materials on calculators ", "Using restricted materials", "Sneaking in cards to take notes ", "Using calculators during maths test ", "using materials not allowed in exam rooms ", "b", 0, 3, this.f558b));
        arrayList3.add(new questions("14.", "According to the passage, who could possibly solve the problem of cheating? ", 0, 0, 0, 0, 0, "The invigilators ", "The teacher", "The exam writer ", "The students ", "The invigilators ", "a", 0, 3, this.f558b));
        arrayList3.add(new questions("15.", "Which one of the paragraphs below emphasizes the need for one's own competence in tests? ", 0, 0, 0, 0, 0, "Paragraph 2", "Paragraph 4", "Paragraph 3 ", "Paragraph 5", "Line 10 ", "a", 0, 3, this.f558b));
        arrayList3.add(new questions("16.", "According to the first paragraph, what consequence do cheaters in schools face? ", 0, 0, 0, 0, 0, "withdrawal", "expulsion", "reprimand", "dishonesty", "Line 9 ", "b", 0, 3, this.f558b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("17.", "What is the idea that the writer of this article doesn't seem to agree to (para: 9)? ", 0, 0, 0, 0, 0, "Dogs exhibit submissive behavior.", "The wolves do not look at their owners.", "Wolves are more aggressive than dogs. ", "Adult dogs are more like baby wolves. ", "Line 4", "d", 0, 4, this.f558b));
        arrayList4.add(new questions("18.", "Which one of the following was an unexpected finding in the experiments reported in November 2002?", 0, 0, 0, 0, 0, "That both the wolves and the chimps seemed to have, similar abilities. ", "That both the wolves and the dogs exhibited similar abilities ", "That the dogs outperformed the chimps in the experiment ", "That both the' wolves and the chimps failed to understand the experimenters.", "paragraph 3 line 2", "d", 0, 4, this.f558b));
        arrayList4.add(new questions("19.", "Which one of the following sentences is true about wolves and dogs? ", 0, 0, 0, 0, 0, "They equally interact with human beings.", "Their difference is less vivid in mind than in physique. ", "Wolves emerged from dogs thousands of years ago.", "Wolves avoid people's faces while dogs don't.", "Paragraph 4 line 1", "b", 0, 4, this.f558b));
        arrayList4.add(new questions("20.", "What do paragraphs 6 and 7 imply about wolves and dogs?", 0, 0, 0, 0, 0, "Dogs are more intelligent than wolves.", "Dogs communicate with people better than do wolves. ", "One can train wolves and dogs to do anything. ", "Wolves and dogs are equally intelligent. ", "Paragraph 7 line 3 ", "d", 0, 4, this.f558b));
        arrayList4.add(new questions("21.", "What does the phrase checking out (para.8) mean?", 0, 0, 0, 0, 0, "investigating", "taking a brief look at", "expecting food from", "going for a walk with", "i.e., looking at the person to get some kind of sign ", "b", 0, 4, this.f558b));
        arrayList4.add(new questions("22.", "In Paragraph 5, what variable were the Hungarian scientists trying to control? ", 0, 0, 0, 0, 0, "The degree of exposure of both animals to human beings ", "The difference in age of beings both the wolves Ives and the dogs ", "The extent of anxiety both animals show as they grow up. ", "The amount of time both animals can stay with humans in a day ", "line 4-5", "c", 0, 4, this.f558b));
        arrayList4.add(new questions("23.", "What did the writer in his study want to find out (para.1)?", 0, 0, 0, 0, 0, "Dogs' ability to find hidden things ", "Dog's ability to read the human mind", "Dog's single skill that makes them different ", "Dogs' ability to read human body language ", "Line 1", "b", 0, 4, this.f558b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion4);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("24.", "Apparently, there are lots of buildings in Addis Ababa that should be………... because of their inferior quality. If left alone, they could be risky to the occupants.", 0, 0, 0, 0, 0, "pulled away", "pulled out ", "pulled off", "Pulled down. ", "pulled down- demolished", "d", 0, 5, this.f558b));
        arrayList5.add(new questions("25.", "Countries which are members of the African union are…………… states. ", 0, 0, 0, 0, 0, "riparian", "member", "sovereign", "monolithic", "sovereign- independent, having power without limit", "c", 0, 5, this.f558b));
        arrayList5.add(new questions("26.", "She likes to try extraordinary things. In other words, she usually comes up with………… ideas that most of us cannot think of. ", 0, 0, 0, 0, 0, "good", "further", "mundane", "strange ", "strange- unusual, not previously known ", "d", 0, 5, this.f558b));
        arrayList5.add(new questions("27.", "We should teach children to…………… when they cross roads. There could be speeding vehicles coming from either direction.", 0, 0, 0, 0, 0, "look ahead", "look out", "look on", "look back ", "look out- be at a view ", "b", 0, 5, this.f558b));
        arrayList5.add(new questions("28.", "Previously, he was a fulltime manager at the Sheraton Hotel, but now he earns a living working as a…………. giving training to managers in various companies.", 0, 0, 0, 0, 0, "freelancer", "personnel", "dynamist", "staff", "Freelancer- independent servant earning his living by selling his service. ", "a", 0, 5, this.f558b));
        arrayList5.add(new questions("29.", "The new prime minister seems to have the…………... of a natural leader, but to be successful, he needs the cooperation of all the people.", 0, 0, 0, 0, 0, "dynamics", "dynamism", "dynamist", "dynamicity", "dynamism- energy and a strong desire to make something happen.", "b", 0, 5, this.f558b));
        arrayList5.add(new questions("30.", "I believe the machine was …………... by the operator, how can it stop working in just three months? ", 0, 0, 0, 0, 0, "misused ", "unused", "disused", "underused", "misused- wrongly or badly used ", "b", 0, 5, this.f558b));
        arrayList5.add(new questions("31.", "Corrupt officials might think they could rob public property and…………... it, but sooner or later, would get caught.", 0, 0, 0, 0, 0, "get out of", "get away with", "get down on ", "get down to", "get away with- do something without being caught ", "b", 0, 5, this.f558b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion5);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("32.", "The doctor told the nurse to have all the gadgets 'sterilized' and make them ready for the operation this morning.", 0, 0, 0, 0, 0, "speck-free", "germ-free", "disassembled ", "well organized ", "sterilized/germfree- freed from living germs ", "b", 0, 6, this.f558b));
        arrayList6.add(new questions("33.", "This task 'calls for' careful investigation and scrutiny.", 0, 0, 0, 0, 0, "demands", "looks for", "names", "visits", "call for /demand-require ", "a", 0, 6, this.f558b));
        arrayList6.add(new questions("34.", "'Contrary to' what I heard about her; she is such a cute girl difficult to part with. She has a huge sense of humor.", 0, 0, 0, 0, 0, "Though", "In contrast", "Unlike", "Opposite ", "contrary to /opposite- paying no attention to ", "d", 0, 6, this.f558b));
        arrayList6.add(new questions("35.", "If we carefully listen to the advice of our medical personnel, I am sure we can easily prevent some of the 'infectious' diseases in Ethiopia. But people don't seem to be serious about them. ", 0, 0, 0, 0, 0, "fatal", "dangerous", "contagious", "serous ", "infectious/contagious-of disease spreader by means of bacteria. ", "c", 0, 6, this.f558b));
        arrayList6.add(new questions("36.", "The whole family 'looked up' to my mother as their ideal example.", 0, 0, 0, 0, 0, "spoke", "told", "took", "respected", "looked up to/ respected- admire, respect to somebody for his good deeds.", "d", 0, 6, this.f558b));
        arrayList6.add(new questions("37.", "We are so 'regretful' that we didn't take necessary measures to stop the tyranny that went on in prisons of this country. No doubt, we would be held responsible.", 0, 0, 0, 0, 0, "gleeful", "remorseful", "shameful", "disgraceful", "regretful/ remorseful- deep/ bitter regret for wrong doing able number ", "b", 0, 6, this.f558b));
        arrayList6.add(new questions("38.", "A 'substantial' number of refugees from the Middle East have drowned in the Mediterranean Sea while trying to cross to Europe. ", 0, 0, 0, 0, 0, "innumerable", "record- breaking", "considerable ", "verified", "substantial/ considerable- large or considerable number  ", "c", 0, 6, this.f558b));
        arrayList6.add(new questions("39.", "'Despite' all attempts to bring about peace and stability, things are going very slow and, in some places, they are even getting worse.", 0, 0, 0, 0, 0, "Regardless of", "Even though", "With regard to ", "Because of ", "Despite / regardless of-paying no attention to ", "a", 0, 6, this.f558b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion6);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("40.", "There might be skirmishes here and there in the country. ………..., the system is more democratic than ever before and the majority seems to be happier.", 0, 0, 0, 0, 0, "Even so", "Despite", "But ", "Even though ", "but - expresses certainty ", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("41.", "The fact is that I didn't know she was in such a serious problem. Now you calm down and I …………... do everything possible. Ok?", 0, 0, 0, 0, 0, "may", "can", "will", "am going to", "will", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("42.", "Aren't you Mr. karimu’s daughter? introduced you to me.", 0, 0, 0, 0, 0, "Yes, I am", "Yes, I'm not", "No, I am", "No, I am", "yes, I am-expressing agreement ", "a", 0, 7, this.f558b));
        arrayList7.add(new questions("43.", "…………. In the town could you find any safe haven. I ask you to leave before it is too late. ", 0, 0, 0, 0, 0, "No one", "Neither", "Nothing", "Nowhere", "nowhere-There isn’t any place which is safe", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("44.", "She was rude …………. All of us, so the president should take an immediate measure in fact, see her off for good.", 0, 0, 0, 0, 0, DebugKt.DEBUG_PROPERTY_VALUE_ON, "to", "at", "with", "rude to-Many adjectives are followed by definite preposition. ", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("45.", "…………. of you is responsible for what had happened. It was this Nigerian guy that stole everything. ", 0, 0, 0, 0, 0, "Both", "Neither", "One", "Either", "neither- no one of you ", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("46.", "I understand …………. could replace the trouble you took to make us live comfortably. All we could do is say thank you from the bottom of our heart. ", 0, 0, 0, 0, 0, "everything", "noting", "something", "no anything", "nothing-negative adverb which means don't understand anything. ", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("47.", "Hebran…………. there since last October, but she wants to come back very soon. She says she is missing her little daughter. ", 0, 0, 0, 0, 0, "has been", "was", "had been", "is", "has been- since last October up to now ", "a", 0, 7, this.f558b));
        arrayList7.add(new questions("48.", "I don't think I'll need a hand. I am sure I ………….  manage to get it upstairs. ", 0, 0, 0, 0, 0, "will", "may", "must", "can ", "can- I am able to ", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("49.", "Gebre didn't come to the meeting…………. fear of being labeled as a puppet, but it could have been better to go and see what people think about the system.", 0, 0, 0, 0, 0, "because", "in case of", "for", "as", "for-to show reason, for +noun ", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("50.", "I………… this job for the last 35 years and I don't think I would even think of changing it. It is my world and I feel there is no better world for me. ", 0, 0, 0, 0, 0, "am doing", "have done", "had done", "was doing ", "have gone-action began in the past and continued up to now. ", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("51.", "We were worried that everybody had very little money left. It was even more frustrating that Abdu, our group leader, had the………… compared to the rest of us. ", 0, 0, 0, 0, 0, "less", "more little", "least", "most little", "least-the +superlative form of the adjective little? ", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("52.", "You know your aunt is getting very old. You…………. visit her every day and see what is lacking. Check if she takes her meals properly.", 0, 0, 0, 0, 0, "ought to ", "should", "have to", "must", "must - That is to mean it is strongly necessary. ", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("53.", "Despite the provocative comments, made by some of her audience, she chose her words very carefully…………. not to go out of topic and make the issue personal. I really admired her patience. ", 0, 0, 0, 0, 0, "so that", "so as", "because of ", "in order that ", "so as- negative purpose so as not to/in order not to +", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("54.", "By the time you come for your next holiday, they………... the construction of the hotel, Surely, you will be staying there.", 0, 0, 0, 0, 0, "Will complete", "will have completed", "would complete", "already completed ", "will have completed- the earlier from two future events. ", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("55.", "Nearly…………. of the invited guest appeared for the theatre and the Manager was fuming about this, I said noting, but chose to keep silent.", 0, 0, 0, 0, 0, "some", "all", SchedulerSupport.NONE, "neither", "none- no one ", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("56.", "They still argue that the quality of education is steadily improving. Obviously, they are trying to fool us, but we…………. the idea. ", 0, 0, 0, 0, 0, "don't expect", "never buy", "either take", "neither agree to ", "neither agree to-'but' shows contrary addition and that's to mean we don't agree to his idea.", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("57.", "I am giving up the idea of starting an MA program at Jombola University. Admission with them is in August, but I …………. from here by then. I will still have. one more course to do. ", 0, 0, 0, 0, 0, "won't graduate", "won't have graduated", "wouldn't graduate ", "won't be graduating", "won't have graduated- the firsts from two future actions (to who the action expected to happen before time of admission at the other universities)", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("58.", "There are wide-spread …………... rumors of exempting students who score over 600 from educational cost- sharing. ", 0, 0, 0, 0, 0, "inspired", "inspiring ", "inspiration", "inspirational", "inspiring- present participle as an adjective/describes nature or character of something)", "b", 0, 7, this.f558b));
        arrayList7.add(new questions("59.", "She showed such……………… gestures that the boy thought she loved him. We shouldn't totally blame him for his actions. ", 0, 0, 0, 0, 0, "pleasing", "relaxing", "daring", "misleading", "darling- lovely ", "c", 0, 7, this.f558b));
        arrayList7.add(new questions("60.", "…………… need further clarification, give us a call or pay us a visit. We will be happy to assist. ", 0, 0, 0, 0, 0, "Should you", "You will", "You may ", "Would you ", "should you- That is inversion of the first conditional If you need= should you ", "a", 0, 7, this.f558b));
        arrayList7.add(new questions("61.", "When We arrived in Addis Ababa, Bubu …………. the money yet. You can't imagine how cross I was as we had no cash on hand. ", 0, 0, 0, 0, 0, "didn't send", "hasn't sent", "hadn't sent", "wouldn't send", "hadn't sent- the first from two past actions can be expressed with past perfect. ", "a", 0, 7, this.f558b));
        arrayList7.add(new questions("62.", "………… had we finished the cooking than he knocked at the door wanting something to eat. His noses should be very dependable. ", 0, 0, 0, 0, 0, "As soon as", "Very soon", "So soon", "No sooner", "No sooner- immediately, soon after", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("63.", "I ………… with you, Abel; irregular class attendance isn't the cause of your failure.", 0, 0, 0, 0, 0, "disagreed", "am disagreeing", "have disagreement", "disagree", "disagree- simple present) shows present situation. ", "d", 0, 7, this.f558b));
        arrayList7.add(new questions("64.", "Everybody reacted in a strange way, it was a really…………. blast that I could bear almost noting of the screams and yells around. It took me five minutes to realize what was going on. ", 0, 0, 0, 0, 0, "deafening", "disheartening ", "devastating", "exploding", "deafening- something that affects normal sense of hearing. ", "a", 0, 7, this.f558b));
        arrayList7.add(new questions("65.", "You would easily get a good job if you…………... your spoken English.", 0, 0, 0, 0, 0, "improved", "were improving", "improve", "are improving", "improved-for second/ unlikely/ condition simple past is used in the if clause.", "a", 0, 7, this.f558b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion7);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("66.", "Chemeda: Excuse me Can you tell me the way to the nearest station? \nZernedkun: …………………... \n", 0, 0, 0, 0, 0, "Sorry I'm a stranger here myself. ", "Stations are big in this city. ", "Many people line up in the station. ", "Why would you like to go the station? ", "Asking for direction. ", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("67.", "Ujialu: I heard that girl is very hard- working. She always stands first. \nHagos: ……………………………  \n", 0, 0, 0, 0, 0, "Girls are mostly like that.", "Where does she come from? ", "What is more, she is well- behaved. ", "Do you know her younger sister? ", "Expressing total agreement ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("68.", "Shaket: They lost their grandma only a month ago. \nSosina:  ………………………………\n", 0, 0, 0, 0, 0, "Who is their grandma?", "Sad! Their uncle is also critically ill.", "Grandmas spoil their grandchildren. ", "They used to talk about her. ", "Expressing mourning ", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("69.", "Demeku: How is the weather? \nAzalech:   ……………………………...\n", 0, 0, 0, 0, 0, "It's summer here", "Phew! It's hot.", "What is the weather forecast? ", "Wow, they are enjoying the sun.", "Expressing her felling", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("70.", "Boss: What was their argument in brief? \nSubordinate:  ……………………. \n", 0, 0, 0, 0, 0, "Yes, they always like to argue.", "Majority were not arguing strongly.", "They want the group to leave now. ", "They just kept talking. Noting brief.", "Telling the point on which they are arguing ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("71.", "Mammo: Are you coming to the party? \nMamitu: …………………………\n", 0, 0, 0, 0, 0, "Only if I finish the assignment.", "You like going to parties. ", "Who told you I am throwing a party? ", "Flow many parties have I got that day?", "Accepting the invitation if the condition is possible", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("72.", "Yihun: Poor Lili! she lost all her money. \nJember: …………………………... \n", 0, 0, 0, 0, 0, "She is not very poor.", "How much money was it?", "Was she Walking around? ", "Was she Walking around? ", "Was she Walking around? ", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("73.", "Marta: This is the pair of shoes I bought last week. \nAriat: ……………………………...\n", 0, 0, 0, 0, 0, "Leather shoes last very long.", "Did you really need one? ", "So fashionable, Isn't it? ", "What size do you usually wear? ", "Appreciating the pair of shoes ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("74.", "Lelisa: Shall we walk or take a bus? \nJigsa: ……………………………. \n", 0, 0, 0, 0, 0, "Tell me, why do you ask? ", "Come on! We'd rather take a bus", "Have you walked all morning?", "Do you always take buses? ", "Asking for advice", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("75.", "Aster: Jim and Jane are marrying next week. \nBeli: ……………………………….  \n", 0, 0, 0, 0, 0, "There are so many weddings to take place next week.", "Jane is so beautiful that all the boys around like her. ", "I don't think they would make a good couple.", "I know Jim loves her, but she was going out with someone else. ", "According to the response their marriage might not be successful. ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("76.", "Student: …………………………...  \nFriend: If I were you, I would report to the campus police.\n", 0, 0, 0, 0, 0, "My ID is missing. What shall I do? ", "I saw them fighting. Anything serious? ", "Where are my books? I left them all here. ", "There is a mob dancing down there. So strange!", "Asking for advice ", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("77.", "Didi: I heard you won the scholarship. \nDunka: ……………………... \n", 0, 0, 0, 0, 0, "This is one of the best scholarships.", "Twenty of us applied for it. ", "I won't be bothered if I don't. ", "Sure, I knew I would.", "He was confident as he would win.", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("78.", "Alemu: Sounds like you had a boring day. Did anything interesting happen? \nFeyissa: ………………………. \n", 0, 0, 0, 0, 0, "What's interesting? ", "Often many things happen, but few may take our attention.", "any things happen in this city. ", "Not really. Don't think so. ", "Expressing disagreement ", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("79.", "Tesfa: who walks on all fours in the morning, two in the afternoon and three in the evening? \nSoliana: …………………………  \n", 0, 0, 0, 0, 0, "A hyena ", "A cow", "A man", "An amputes", "It is a puzzle. A baby crawls, an adolescent walks on two feet and elder uses walking stick- so that is a man.", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("80.", "Niguse: The wot was too spicy, I just couldn't eat it, \nNibrete: …………………………\n", 0, 0, 0, 0, 0, "Gosh! Wasn't the taste also horrible? ", "Was it shiro wot or something else? ", "We didn't need any wot, as a matter of fact. ", "Are you hungry now? Let's go out for dinner.", "To give additional opinion /suggestion/ ", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("81.", "Shumi: Exams are round the corner. We have to work hard. \nMeseret: ………………………... \n", 0, 0, 0, 0, 0, "I couldn't agree more, Shumi.", "This semester is too short.", "Most of the students are lazy. ", "sit in the corner and study. ", "Expressing complete agreement.", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("82.", "Niema: I'm worried, I'm performing awfully poor this year. \nKulani: …………………………. \n", 0, 0, 0, 0, 0, "What courses did you fail?", "Night clubs don't help. Get down and study! ", "Yes, I know a lot of students are. ", "Did you tell me that your dorm mate also flunked? ", "Giving strong advice. ", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("83.", "Bertukan: My new boyfriend loves me a lot \nMamitu: ……………………….  \n", 0, 0, 0, 0, 0, "What is his name, please?", "Did you break up with Temesgen? ", "He is very handsome, Isn't he? ", "Isn't that rather too soon to say? ", "That is telling not to be in a hurry to say that. ", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("84.", "Elsa: What shall we do about our politicians? They are all corrupt. \nFrehiwot: ……………………… \n", 0, 0, 0, 0, 0, "Corruption has now become rampant.", "You don't have to say that. There are some honest ones.  ", "I don't think politicians in the West are corrupt. ", "Politics and corruption are the same in third world. Don't you think? ", "Expressing partial disagreement.", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("85.", "Tourist: The roads in the city are dilapidated. \nFriend:  …………………………\n", 0, 0, 0, 0, 0, "They are better in the countryside.", "Yeah, they should have at least been patched.", "There are more pressing problems, though ", "You know, the world economy is in a problem. ", "Expressing disappointment and suggesting what shoula have been made. ", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("86.", "Doctor: How would it matter if the patients do not turn up on time? \nNurse:  …………………………...\n", 0, 0, 0, 0, 0, "There is no patient here. ", "No, patients do not arrive on time. ", "On the contrary, patients are usually apprehensive. ", "Well. I think this would oblige us to stay longer. ", "Expressing the opinion of the nurse concerning the duty expected from the staff.", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("87.", "Tsegaye: ……………, what would you do? \nGutema: What comes to mind calling the police or friends? l don't know. \n", 0, 0, 0, 0, 0, "Wow! Moons and stars.", "Alas, what a tough luck! ", "What is the cause of the accident? ", "suppose you had an accident ", "Asking what he does if something happens ", "d", 0, 8, this.f558b));
        arrayList8.add(new questions("88.", "Student 1: m sorry. I don't remember. Have you seen them? \nStudent 2: ………………………... \n", 0, 0, 0, 0, 0, "Sure. I've seen them with my naked eyes. ", "probably, it was an empty room:", "I was busy doing my homework.", "What were they doing? They must be our friends.", "Assuring/ Agreement to what has been said", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("89.", "Seman: Who has two eyes, but cannot see? \nRahel: ……………………………... \n", 0, 0, 0, 0, 0, "insect", "librarian ", "camera", "lightning ", "It is a puzzle and the correct answer is a camera ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("90.", "Friend: ……………………………. \nErgicho: Alright, but only for five minutes. \n", 0, 0, 0, 0, 0, "Do you need the computer for long? ", "I'll need time to buy a new computer. ", "How about helping me with the computer? ", "Are they perhaps fixing my computer? ", "Asking if he needs it for long", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("91.", "Hamza: I'm sorry. I've broken your glasses \nMother: …………………………….  \n", 0, 0, 0, 0, 0, "You know glasses are so fragile.", "You will need to handle them carefully.", "How disappointing! I got them only yesterday.", "These are very expensive, twenty birr each.", "Expressing disappointment for the broken glass. ", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("92.", "Ashu: There are positive changes all over the country. \nZenebe: ……………………………...   \n", 0, 0, 0, 0, 0, "Yeah, but there is some instability here and there. ", "Positive changes are good for the people. ", "some people do not seem to like it. ", "So many years have lapsed before we saw changes ", "Expressing dissatisfaction and disagreement", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("93.", "Manager: What happened to those new machines? \nTechnicion: ………………………. \n", 0, 0, 0, 0, 0, "Shall we put them on auction? ", "Very frustrating! None of them is working. ", "May be, they are not good machines. ", "Amazing! They are new and well- designed.", "Expressing opinion with 'may be'", "c", 0, 8, this.f558b));
        arrayList8.add(new questions("94.", "Beruktawit: I got the position I applied for. \nShashitu:  …………………………\n", 0, 0, 0, 0, 0, "Getting a job here is not very easy. ", "I knew it was a well-paid job. ", "For how long will you be serving? ", "Really? What good news! ", "The responding person was surprised and happy.", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("95.", "Gonfe: I don't agree to her idea of perfectionism. \nLakech: ……………………………. \n", 0, 0, 0, 0, 0, "You mean it is not possible to be exact?", "Are you saying she is after precision?", "Driving needs accuracy, doesn’t it? ", "I know her brother makes a lot of mistakes. ", "Requiring clarification of the suggestion. ", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("96.", "You: Guess what! I bought a car. \nFriend: ………………...  \n", 0, 0, 0, 0, 0, "Cars are very important.", "Are you serious? You must be joking ", "Where are cars sold in this city?", "I also want to buy a new one. ", "The friend has been surprised.", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("97.", "Husband: We have to be stringent in using our home provision. \nWife: What do you mean by that? How? You know we are spending the minimum possible. \nHusband: I know; However, our income is diminishing and the cost-of-living sky-rocketing. \nWife: So, what should we do? \nHusband: We've to change our style of living. Economize. \nWife: I concur; however, I disagree with your solution………….  \n", 0, 0, 0, 0, 0, "We have to work more and harder. ", "Where did you put your money? ", "Generally, the cost of living is rising. ", "Whether we like it or not we have to accept it.", "Disagreeing and suggesting the possible solution ", "a", 0, 8, this.f558b));
        arrayList8.add(new questions("98.", "Abay: They shouldn't have released all those prisoners. \nMulatu: ……………………... \n", 0, 0, 0, 0, 0, "Who would like to stay in jail? ", "Well, probably those who robbed public resources! ", "Most of the prisoners had been unjustly tortured. ", "Everybody wants the freedom out of prison. ", "Well, probably those who robbed public resources! ", "b", 0, 8, this.f558b));
        arrayList8.add(new questions("99.", "Driver: My Toyota car is still perfect after 10 years on the road. \nMechanic: ……………………………… \n", 0, 0, 0, 0, 0, "I have a Volkswagen. ", "My brother also has one. ", "Toyota cars are the best. ", "Do they also drive Toyota? ", "Appreciating that model of car. ", "c", 0, 8, this.f558b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion8);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("100.", "After graduation from a college, he went straight into the army and took training for three years. Apparently, it was towards the end of the training that he decided to join the front, so he established contact with the leaders. After that.... What kind of writing are the above lines most likely taken from?", 0, 0, 0, 0, 0, "Descriptive", "Argumentative", "Expository ", "Narrative", "It is retelling his life story after graduation from college. ", "d", 0, 9, this.f558b));
        arrayList9.add(new questions("101.", "Early morning, I went for a walk and came back to the hotel to have breakfast with her and go out. Our plan for the day was to visit an old castle from the 17th century, As we finished breakfast, we packed our stuff and called a taxi...These lines are taken from a piece of writing that is most likely:", 0, 0, 0, 0, 0, "Expository", "Argumentative ", "Narrative", "Descriptive", "That is narrating the day's diary.", "c", 0, 9, this.f558b));
        arrayList9.add(new questions("102.", "Which one of the following is an example of a sentence extracted from a descriptive piece of writing? ", 0, 0, 0, 0, 0, "We could hear from distance a huge crowd chanting and singing.", "First, we met the Deputy president right in front of his office.", "There was no point in getting together to discuss the issue.", "Officials like ministers in many countries have their own schedules. ", "\" The huge crowd chanting and singing\" is example of descriptive writing. ", "a", 0, 9, this.f558b));
        arrayList9.add(new questions("103.", "Which one of the following sentences has a correct punctuation? ", 0, 0, 0, 0, 0, "\"Is that so?\", Buli remarked politely. \"Just to save you!\" ", "\"is that so\" Buli remarked politely?\" Just to save you!\" ", "\" is that so?\" Buli remarked politely. \"Just to save you!\" ", "\"Is that so?\" Buli remarked politely; \"Just to save you!\"", "\"Is that so?\" Buli remarked politely.\" Just to save you.\" Is correctly punctuated.", "c", 0, 9, this.f558b));
        arrayList9.add(new questions("104.", "Which one of the following sentences is most likely taken from a narrative piece of writing? ", 0, 0, 0, 0, 0, "Feminism is an outlook claiming equality of women with men.", "Her life history shows that she was born in 1987.", "Women should enjoy the same opportunity as men, she believes. ", "She radically changed & was, overwhelmed by the idea of feminism. ", "That is a piece of writing taken from biography and it is example of narrative.", "b", 0, 9, this.f558b));
        arrayList9.add(new questions("105.", "Which one of the- following sentences is WRONGLY punctuated? ", 0, 0, 0, 0, 0, "\"Sodere\", I replied, 'I was there for a year.'", "I asked, \"Why don't you pick her up?\"", "She said,\" We'll be there in five minutes.\" ", "We uttered, \"Just calm down”! ", "The comma after \"sodere\" should be inside and a comma should be used instead of full stop before actual speech. ", "a", 0, 9, this.f558b));
        arrayList9.add(new questions("106.", "Which one of the following could be an opening to a letter a company manager is writing to you with regard to the job you applied for? ", 0, 0, 0, 0, 0, "Dear sir, Remember you applied to company for a job? Unfortunately you", "How are you doing? I am writing to let you know that you have not…", "I'm dropping you a few lines just to bring to your attention that you have not… ", "I regret to inform you that you have not been chosen... ", "That is a polite letter written to the applicant who applied to fill a. vacancy by the company manager.", "d", 0, 9, this.f558b));
        arrayList9.add(new questions("107.", "Which one of the following word doesn't have correct spelling? ", 0, 0, 0, 0, 0, "license", "graffiti", "argument", "Acquaintance", "License is the correctly spelt one.", "a", 0, 9, this.f558b));
        arrayList9.add(new questions("108.", "Which one of the following sentences is correctly punctuated? ", 0, 0, 0, 0, 0, "Last week; I think it was Monday, l sent them a complete report", "Last week, I think, It was Monday-I sent-them a complete report. ", "Last week- I think, it was Monday, I sent them a complete report. ", "Last week-I think it was Monday- I sent them a complete report.", "In formal English instead colon and semicolon to indicate that what follows is a summary or conclusion of what has gone before. ", "d", 0, 9, this.f558b));
        arrayList9.add(new questions("109.", "Which one of the following could be an ending you would possibly use to a letter you wrote to your best friend in Nazareth? ", 0, 0, 0, 0, 0, "Good bye!", "Bye!", "Sincerely", "Best wishes ", "'Bye' is an informal ending possibly used in a letter written to best friend. ", "b", 0, 9, this.f558b));
        arrayList9.add(new questions("110.", "He was a real miser. Giving out a penny even to his old mum hurt like him a knife in the body... This is taken from a piece of writing that is most likely", 0, 0, 0, 0, 0, "Narrative", "Argumentative", "Descriptive ", "Expository ", "The adjectives used in the piece of writing given to describe the person.", "c", 0, 9, this.f558b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion9);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("111.", "What conclusion can we draw from the age distribution or tilt-students?", 0, 0, 0, 0, 0, "Most children in the country begin school at early age. ", "The age of the child is an important variable to start primary school. ", "Female children in the country start school earlier than the males. ", "Children in the country do not seem to start school at the same age.", "The age distribution 14 15 16 17 18 19 shows that children in the country in the country do not start school at the same age. ", "d", 0, 10, this.f558b));
        arrayList10.add(new questions("112.", "What is the median of the age distribution? ", 0, 0, 0, 0, 0, "15", "18", "17 ", "16", "Median the middle item of the population data.", "d", 0, 10, this.f558b));
        arrayList10.add(new questions("113.", "What is the class size?", 0, 0, 0, 0, 0, "17", "19", "18", "20", "19", "b", 0, 10, this.f558b));
        arrayList10.add(new questions("114.", "What is the range of the distribution? ", 0, 0, 0, 0, 0, "5", "4", ExifInterface.GPS_MEASUREMENT_3D, "6", "Range= The difference between the maximum and minimum value of the given population data. \nMaximum / Biruk/=19 \nMinimum/ Eldana/=14/5 \n", "a", 0, 10, this.f558b));
        arrayList10.add(new questions("115.", "What is the mode of the distribution?", 0, 0, 0, 0, 0, "17", "16", "15", "18", "Mode= The most frequent item/ data value in the given distribution or population. The mode of the distribution is 16 because there are 6 students who are 16 years old in the class. ", "c", 0, 10, this.f558b));
        arrayList10.add(new questions("116.", "The study made an attempt to see if differences exist between the ways students from the rural areas and those from towns adapt to the higher education environment. Where in a research report would the above sentence most likely belong?", 0, 0, 0, 0, 0, "Methodology", "Introduction ", "Data analysis ", "Conclusion", "Introduction- It shows what is going to be made in the research. ", "b", 0, 10, this.f558b));
        arrayList10.add(new questions("117.", "This study showed that both government and private media are biased in their own ways with regard to the information they transmit to the public. Which section of a research report are the above lines most likely taken from? ", 0, 0, 0, 0, 0, "Conclusion", "Methodology", "Data analysis", "Introduction", "conclusion- It is a kind of short summary of the whole research. ", "a", 0, 10, this.f558b));
        arrayList10.add(new questions("118.", "Of the 110 that filled in the questionnaire, 88(80%) said the bonus they get from the companies are nowhere close to the extra efforts they make to boost production. Which section of a research report is the above most likely extracted from?", 0, 0, 0, 0, 0, "Discussion", "Conclusion", "Meth", "Meth", "Data analysis- That is how the data gathered through the methodology mentioned in analyzed.", "d", 0, 10, this.f558b));
        arrayList10.add(new questions("119.", "In order to objectively and genuinely address the needs of the employees, it is important that their voices are heard during appointment of managers. Where in a research report would the above sentence most likely belong?", 0, 0, 0, 0, 0, "Discussion", "Data analysis", "Recommendation ", "Conclusion", "Recommendation- It is a sort of remedy or solution suggested by the researcher.", "c", 0, 10, this.f558b));
        arrayList10.add(new questions("120.", "Fifty- five employees from each of the companies were made to fill in a questionnaire after on the job observations were conducted. Which section of a research report is the above sentence most likely taken from? ", 0, 0, 0, 0, 0, "Methodology", "Introduction", "Data analysis", "Conclusion", "Methodology- it is an extract that shows the technique used in the research made.", "a", 0, 10, this.f558b));
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
        this.f559tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2011.this.timer.setVisibility(0);
                    english2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    english2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2011.this.getBaseContext());
                    int unused = english2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = english2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = english2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = english2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = english2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = english2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = english2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = english2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = english2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = english2011.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = english2011.this.highscore = defaultSharedPreferences.getInt("eng2011hs", 0);
                    int access$200 = english2011.this.part1 + english2011.this.part2 + english2011.this.part3 + english2011.this.part4 + english2011.this.part5 + english2011.this.part6 + english2011.this.part7 + english2011.this.part8 + english2011.this.part9 + english2011.this.part10;
                    english2011.this.resultText.setText(String.valueOf(access$200));
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
                    int unused12 = english2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused13 = english2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused14 = english2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused15 = english2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused16 = english2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused17 = english2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused18 = english2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused19 = english2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "eng2011hs";
                    int unused20 = english2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused21 = english2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1400 = english2011.this.answered1 + english2011.this.answered2 + english2011.this.answered3 + english2011.this.answered4 + english2011.this.answered5 + english2011.this.answered6 + english2011.this.answered7 + english2011.this.answered8 + english2011.this.answered9 + english2011.this.answered10;
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
                    if (access$200 > english2011.this.highscore) {
                        edit.putInt(str, access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 120;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - english2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1eng111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1eng112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1eng113", 0);
                    long j4 = defaultSharedPreferences.getLong("date1eng114", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1eng115", 0);
                    long j6 = defaultSharedPreferences.getLong("date1eng116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1eng117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1eng118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1eng119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1eng1110", 0);
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
                        editor.putString("scoreeng111", str2);
                        editor.putLong("date1eng111", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str3 = str2;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreeng112", str3);
                            editor.putLong("date1eng112", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreeng113", str3);
                            editor.putLong("date1eng113", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreeng114", str3);
                            editor.putLong("date1eng114", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreeng115", str3);
                            editor.putLong("date1eng115", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreeng116", str3);
                            editor.putLong("date1eng116", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreeng117", str3);
                            editor.putLong("date1eng117", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreeng118", str3);
                            editor.putLong("date1eng118", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreeng119", str3);
                            editor.putLong("date1eng119", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreeng1110", str3);
                            editor.putLong("date1eng1110", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateeng111", 0);
                    long j12 = defaultSharedPreferences.getLong("dateeng112", 0);
                    long j13 = defaultSharedPreferences.getLong("dateeng113", 0);
                    long j14 = defaultSharedPreferences.getLong("dateeng114", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("dateeng115", 0);
                    long j16 = defaultSharedPreferences.getLong("dateeng116", 0);
                    long j17 = defaultSharedPreferences.getLong("dateeng117", 0);
                    long j18 = defaultSharedPreferences.getLong("dateeng118", 0);
                    long j19 = defaultSharedPreferences.getLong("dateeng119", 0);
                    long j20 = defaultSharedPreferences.getLong("dateeng1110", 0);
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
                        editor2.putString("iScoreeng111", f);
                        editor2.putLong("dateeng111", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreeng112", f);
                            editor2.putLong("dateeng112", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreeng113", f);
                            editor2.putLong("dateeng113", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreeng114", f);
                            editor2.putLong("dateeng114", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreeng115", f);
                            editor2.putLong("dateeng115", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreeng116", f);
                            editor2.putLong("dateeng116", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreeng117", f);
                            editor2.putLong("dateeng117", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreeng118", f);
                            editor2.putLong("dateeng118", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreeng119", f);
                            editor2.putLong("dateeng119", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreeng1110", f);
                            editor2.putLong("dateeng1110", valueOf.longValue());
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
                        english2011.this.scr.setVisibility(8);
                        english2011.this.chr.stop();
                        english2011.this.toolbar.setVisibility(8);
                        english2011.this.Relative.setBackgroundColor(-7829368);
                        english2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2011.this.getBaseContext());
                        int unused = english2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = english2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = english2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = english2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = english2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = english2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = english2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = english2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = english2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = english2011.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = english2011.this.highscore = defaultSharedPreferences.getInt("eng2011hs", 0);
                        int access$200 = english2011.this.part1 + english2011.this.part2 + english2011.this.part3 + english2011.this.part4 + english2011.this.part5 + english2011.this.part6 + english2011.this.part7 + english2011.this.part8 + english2011.this.part9 + english2011.this.part10;
                        TextView access$1300 = english2011.this.resultText;
                        access$1300.setText(access$200 + "/120");
                        english2011.this.progressbar.setProgress(access$200);
                        english2011.this.progressbar.setMax(120);
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
                        int unused12 = english2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused13 = english2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused14 = english2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused15 = english2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused16 = english2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused17 = english2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused18 = english2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused19 = english2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused20 = english2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused21 = english2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1400 = english2011.this.answered1 + english2011.this.answered2 + english2011.this.answered3 + english2011.this.answered4 + english2011.this.answered5 + english2011.this.answered6 + english2011.this.answered7 + english2011.this.answered8 + english2011.this.answered9 + english2011.this.answered10;
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
                        if (access$200 > english2011.this.highscore) {
                            edit.putInt("eng2011hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - english2011.this.chr.getBase()) / 1000;
                        String str = "dateeng1110";
                        String str2 = "dateeng119";
                        String str3 = "dateeng118";
                        String str4 = "dateeng117";
                        String str5 = "dateeng116";
                        String str6 = "dateeng115";
                        String str7 = "dateeng114";
                        String str8 = "dateeng113";
                        String str9 = "dateeng112";
                        String str10 = "dateeng111";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1eng1110";
                        String str12 = "date1eng119";
                        if (english2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1eng111", 0);
                            String str13 = "date1eng111";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1eng112", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1eng113", 0);
                            long j4 = defaultSharedPreferences.getLong("date1eng114", 0);
                            long j5 = defaultSharedPreferences.getLong("date1eng115", 0);
                            String str16 = "date1eng115";
                            String str17 = "date1eng114";
                            String str18 = "date1eng116";
                            long j6 = defaultSharedPreferences.getLong("date1eng116", 0);
                            long j7 = defaultSharedPreferences.getLong("date1eng117", 0);
                            String str19 = str12;
                            String str20 = "date1eng118";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1eng117";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1eng113";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1eng118", 0));
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
                                editor3.putString("scoreeng111", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreeng112", str25);
                                    editor3.putLong("date1eng112", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreeng113", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreeng114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreeng115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreeng116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreeng117", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreeng118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreeng119", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreeng1110", str25);
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
                                editor4.putString("iScoreeng111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreeng112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreeng113", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreeng114", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreeng115", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreeng116", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreeng117", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreeng118", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreeng119", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreeng1110", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1eng111";
                            String str30 = "date1eng114";
                            String str31 = str12;
                            String str32 = "date1eng113";
                            String str33 = "date1eng117";
                            String str34 = "date1eng116";
                            String str35 = str11;
                            String str36 = "date1eng115";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1400 * access$1400) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1eng112", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1eng112";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1eng118";
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
                                editor2.putString("scoreeng111", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreeng112", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreeng113", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreeng114", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreeng115", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreeng116", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreeng117", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreeng118", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreeng119", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreeng1110", str49);
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
                                editor.putString("iScoreeng111", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreeng112", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreeng113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreeng114", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreeng115", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreeng116", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreeng117", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreeng118", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreeng119", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreeng1110", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        english2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2011.this.scr.setVisibility(8);
                english2011.this.chr.stop();
                english2011.this.toolbar.setVisibility(8);
                english2011.this.Relative.setBackgroundColor(english2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                english2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2011.this.scr.setVisibility(0);
                english2011.this.toolbar.setVisibility(0);
                english2011.this.telegram_layout.setVisibility(8);
                english2011.this.chr.start();
                english2011.this.Relative.setBackgroundColor(english2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = english2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = english2011.this.mInterstitialAd = null;
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
                english2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
