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
import com.google.firebase.analytics.FirebaseAnalytics;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class english2013 extends AppCompatActivity {
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
    private Boolean f562b;
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
    private Toolbar f563tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_english2013);
        Intent intent = getIntent();
        this.f562b = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEnglish2013);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_english2013);
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
        arrayList.add(new questions("1.", "In which of the sentences in Paragraph one is the concept of diversity best reflected? ", 0, 0, 0, 0, 0, "Sentence one ", "Sentence three ", "Sentence five ", "Sentence six ", "Sentence three in paragraph one, best describes the concept and the varied reasons for diversity. ", "b", 0, 1, this.f562b));
        arrayList.add(new questions("2.", "Which one of the following is NOT implied in what the author states as reasons for diversity? ", 0, 0, 0, 0, 0, "One's behavioral characteristics ", "The kind of people one met in life ", "The social origin of the individual ", "The kind of family one comes from ", "According to paragraph 1, the reasons for diversity are: \n- Different backgrounds in which different people are brought up, \n- Different personalities or several other attributes. \nThe kind of people one met in life is NOT implied by the author as a reason for diversity. \n", "b", 0, 1, this.f562b));
        arrayList.add(new questions("3.", "What is the authors viewpoint towards diversity? ", 0, 0, 0, 0, 0, "Without diversity, the world wouldn't have been interesting ", "Life would have been much better if everything were uniform. ", "The fact that we share the same planet works against diversity. ", "Diversity is the major cause of war and other evils in the world. ", "Toward the end of paragraph 1, the author states that the world would never have been as interesting if there wasn't diversity. ", "a", 0, 1, this.f562b));
        arrayList.add(new questions("4.", "According to the author, what is a possible advantage of diversity of human beings? ", 0, 0, 0, 0, 0, "It has proved a solution to reducing conflicts. ", "It has allowed us to live on one part of the planet. ", "It has allowed us to have enough of what we live on. ", "It has relived us of worrying about eating differently. ", "Toward the beginning of paragraph 2, the author states without diversity there would be no place for everyone to stay and indeed no food for everyone... some have to eat nsima, some sushi and others have to eat another type of food. This reduces unnecessary conflict. ", "a", 0, 1, this.f562b));
        arrayList.add(new questions("5.", "Which one of the following could most likely be a culture shock to a foreigner visiting Ethiopia? ", 0, 0, 0, 0, 0, "Coming across people drinking tella together. ", "Encountering young people fighting in the street. ", "Watching shoeshine boys cleaning shoes by the road. ", "Being invited to a meal where raw meat is served as a part. ", "Culture shock: the feeling of confusion, uncomfortable that people may experience when moving to a different country or different culture. \nFrom the given choices, choice D seems a cultural shock for a foreigner. With the exception of a few countries, eating raw meat may come as strange /or a little uncomfortable for a foreigner. \n", "d", 0, 1, this.f562b));
        arrayList.add(new questions("6.", "What does the word \"this\" in Paragraph 3, line 2 or 3 refers to?", 0, 0, 0, 0, 0, "One of the many answers ", "Breaking cultural barriers ", "Answering to curbing clashes ", "The so called cultural barriers. ", "In paragraph 3, this refers to the so-called cultural barriers. ", "d", 0, 1, this.f562b));
        arrayList.add(new questions("7.", "In Paragraph 3, the author says, \"With the latter, it seems everyone loses out in one way or ...\" What does with the \"latter\" show? ", 0, 0, 0, 0, 0, "Combating global challenges ", "Learning from our differences ", "Harnessing the limited resources ", "Creating disadvantages for others ", "Toward the part of paragraph 3, it states \" Differences and diversity in points of view, attitudes, behaviours, practices, and cultures should be used to learn instead of creating disadvantages for others. With the LATTER, it seems everyone loses out in one way or the other....\" LATTER means \"creating disadvantages for others\" ", "d", 0, 1, this.f562b));
        arrayList.add(new questions("8.", "Given the objective realities in the world today, what can we say about the authors remarks at the end of Paragraph 3? ", 0, 0, 0, 0, 0, "They are too optimistic", "They are rather realistic", "They are rather too critical", "They tend to be pessimistic", "At the end of paragraph 3, it states \"Both uniqueness and diversity of individuals are gifts that I am sure is meant to benefit humanity. It is my hope that in the near future, people will be accepted in societies regardless of their religion, sexual orientation, ethnicity, or other various categories\" This shows the authors are optimistic about the future. ", "a", 0, 1, this.f562b));
        arrayList.add(new questions("9.", "What is the paradox about diversity being a blessing to humanity in enhancing equity in the various sectors? ", 0, 0, 0, 0, 0, "The most societies today, their diversity has become a source of atrocity. ", "Diversity has been among the source of unfair distribution of resources. ", "Most countries have exploited their diversity for peace and development. ", "A lot of countries have used diversity as a basis of difference and hostility. ", "Definition: A paradox is a figure of speech in which a statement appears to contradict itself. i.e., self-contradictory. Diversity as a source of unfair distribution of resources is a paradox(contradictory) to diversity being a blessing to humanity in enhancing equity(fairness). ", "b", 0, 1, this.f562b));
        arrayList.add(new questions("10.", "Which one of the following, according to the writer, is NOT among the important tools used in fighting some of the common problems facing humanity today? ", 0, 0, 0, 0, 0, "Tolerating others' deviations from us ", "Respecting the way other people worship ", "Shaping others so they adore our perceptions ", "Using our diverse heritages in a positive way ", "Toward the end of the passage, it states Tolerance, understanding, respecting some perceptions and practices of people deemed different from us is important in fighting some of the common problems facing humanity. Shaping others to adore our perception is NOT among the important tools in fighting some of the problems facing humanity. ", "c", 0, 1, this.f562b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("11.", "According to the authors one of those given below is recommended to help deal with climate change ", 0, 0, 0, 0, 0, "Prioritizing environmental rehabilitation ", "Expand on urbanization ", "Modernize agriculture ", "Commitment to gender equity ", "At the end of paragraph 4, it implies environmental rehabilitation is recommended to deal with climate change. It involves protection activities such as the conservation of soil and wildlife including plants. ", "a", 0, 2, this.f562b));
        arrayList2.add(new questions("12.", "According to the passage, the drought and famine of Wollo demonstrate the relationship between climate change and ", 0, 0, 0, 0, 0, "Lack of good governance ", "Overpopulation ", "Peasantry", "Infrastructure ", "At the beginning of paragraph 1, it states climate change in Ethiopia caused mass starvation in its history. One of them was the Wollo drought and famine which killed hundreds of thousands of people was one of the major causes of the mass uprising against the government of Emperor Haile Selassie.\" According to the passage, the Wollo drought and famine show the relationship between climate change and lack of good governance. ", "a", 0, 2, this.f562b));
        arrayList2.add(new questions("13.", "According to the authors, NAPA is ", 0, 0, 0, 0, 0, "Successfully accomplishing its objectives. ", "Doing fine but needs reformulation. ", "A redundant organization. ", "Blame for inefficiency and lacks responsiveness. ", "According to paragraph 6, the authors believe if NAPA is reformulated by incorporating food security and economic well-being it can make an impact on the lifestyle of people and mitigate the consequences of climate change. ", "b", 0, 2, this.f562b));
        arrayList2.add(new questions("14.", "The authors think that to prepare the population to be able to cope with climate change one of those given below is a priority. ", 0, 0, 0, 0, 0, "Investment on building industries ", "Mass education on climate change ", "Improved infrastructure ", "Regional cooperation ", "According to paragraph 5, education is a key factor to cope with climate change. ", "b", 0, 2, this.f562b));
        arrayList2.add(new questions("15.", "Studies made by Miz-Hasab Research Center confirmed a strong relationship between:", 0, 0, 0, 0, 0, "Industrialization and climate change.", "Agricultural development and climate change.", "Education and climate change.", "HIV/AIDS and climate change.", "At the beginning of paragraph 3, it states Miz-Hasab Research Centre show that vulnerability to HIV/AIDS has increased in communities affected by climate change, especially among internally displaced people and re-settlers. ", "d", 0, 2, this.f562b));
        arrayList2.add(new questions("16.", "The resettlement and villagization programs implemented by the military government ", 0, 0, 0, 0, 0, "Helped in dealing with climate change. ", "Was forced displacement of people. ", "Raised agricultural productivity. ", "Reduced environmental degradation. ", "Toward the end of paragraph 1, it states the 1979 and 1984 famines forced the military government to initiate resettlement and villagization program. This was unpopular and contributed to the downfall of the regime. From, this we can understand the resettlement and villagization program is a forced displacement of people. ", "b", 0, 2, this.f562b));
        arrayList2.add(new questions("17.", "Social capital paragraph 5 refers to the ", 0, 0, 0, 0, 0, "Financial investment of the communities ", "Positive cultural assets and values of communities ", "Scientific knowledge communities possess ", "Use of technologies by communities ", "Social capital: is a set of shared values that allows individuals to work together in a group to effectively achieve a common purpose. Refer paragraph 5 ", "b", 0, 2, this.f562b));
        arrayList2.add(new questions("18.", "According to the passage resettlement ", 0, 0, 0, 0, 0, "Increases HIV/AIDS infection and environmental degradation ", "Increases food security. ", "Creates better environment for giving health services. ", "Helps the use of technology. ", "According to paragraph 3, resettlement was caused by drought and shortage of food. It increased: \n- Exposure to all diseases such as HIV/ AIDS. \n- Mobility \n- Migration \n", "a", 0, 2, this.f562b));
        arrayList2.add(new questions("19.", "Ethiopia has been experiencing the effects of climate change recurrently for many years. This implies Ethiopia has problems related to", 0, 0, 0, 0, 0, "Agricultural resources to feed its people. ", "Water resources to make portable water available to its people. ", "Preventing causes of climate change and its consequences", "Preventing infectious disease such as HIV/AIDS.", "At the beginning of paragraph 2, it states long periods of recurrent drought and erratic(irregular) rainfall are the visible outcomes of climate change. Marking the word erratic(irregular) rainfall, not being able to utilize this shows that Ethiopia has problems related to preventing causes of climate changes and its consequence. ", "c", 0, 2, this.f562b));
        arrayList2.add(new questions("20.", "Ethiopia could manage climate change and HIV/AIDS infection ", 0, 0, 0, 0, 0, "By slowing industrialization to reduce carbon emission. ", "By using environment friendly technologies and activities. ", "By reducing rural residents through urbanization. ", "By getting assistance from the international community. ", "According to paragraph 4, Ethiopia could manage climate change and HIV/AIDS infection by: \n- Using environment friendly technologies and activities. \n- Family planning and population control activities \n- Raising food production \n- Environmental rehabilitation \n", "b", 0, 2, this.f562b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new questions("21.", "Until the world is fully vaccinated against COVID-19, the global economy will not be able to resume activity ", 0, 0, 0, 0, 0, "The global economy will revive as soon as everybody is vaccinated against COVID-19. ", "We should all be vaccinated against OVID-19 for the global economy to resume activity. ", "Full vaccination against COVID-19 is necessary for the global economy to resume functions. ", "All nations should be vaccinated against COVID-19 for the global economic crisis to go.", "The correct meaning: All nations should be vaccinated against COVID-19 for the global economic crisis to go. ", "d", 0, 3, this.f562b));
        arrayList3.add(new questions("22.", "The next time you are about to express disapproval to your youngster, remember to stay aware and sensitive to her/his emotional needs.", 0, 0, 0, 0, 0, "Knowledge of emotional needs is important to guide a child in the right way. ", "If you want to prevent a child from doing, use her/his emotional feeling.", "If you don't like what your Child is doing, ask her/him about her/his emotional needs. ", "If you want to make children stop what they are doing, do it without hurting their feeling. ", "The correct meaning: If you are about to express disapproval to children or want to make children stop what they are doing, do it without hurting their feeling. ", "d", 0, 3, this.f562b));
        recviewquestion recviewquestion3 = new recviewquestion();
        recviewquestion3.setQuestions(arrayList3);
        this.recview3.setAdapter(recviewquestion3);
        this.recview3.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new questions("23.", "We are fed up with people killing each other in this country. We want to see all ethnic groups ______ with one another and lead a peaceful life as they once did. ", 0, 0, 0, 0, 0, "mediated", "reconciled", "intervened", "compromised", "Reconcile: to restore to friendship or harmony. \nExample: She helped to reconcile friends who had been quarrelling. \n", "b", 0, 4, this.f562b));
        arrayList4.add(new questions("24.", "I will never forget my stay in this company. I enjoyed working with you as my boss and I ___________ meeting you again sometime in my life. ", 0, 0, 0, 0, 0, "like", "wish", "will wait until ", "look forward to ", "\"Look forward to\" feel excited about something happening in the future. \nExample: I look forward to meeting my new co-workers. \n", "d", 0, 4, this.f562b));
        arrayList4.add(new questions("25.", "New schools have been opened in almost all corners of Ethiopia during the last two decades and ________ has increased by nearly ten-fold. We now have almost all school-age children in the system. ", 0, 0, 0, 0, 0, "enrolment", "schooling", FirebaseAnalytics.Param.QUANTITY, "education", "Student enrolment: the number of students who have joined school, college or university. \nExample: The university enrols about 20,000 students. \n", "a", 0, 4, this.f562b));
        arrayList4.add(new questions("26.", "Your room is still ________! Remember, I told you to get your stuff organized when I visited you last time. If I found the same next time, make sure you would be out ", 0, 0, 0, 0, 0, "untidy", "unclean", "crowded", "suffocated", "Untidy: not arranged neatly and in order. \nExample: The thieves left a very untidy mess behind them. \n", "a", 0, 4, this.f562b));
        arrayList4.add(new questions("27.", "It rained all of a sudden and brought the game to an unexpected ________. The good thing, however, was that it stopped in fifteen minutes and the match continued. ", 0, 0, 0, 0, 0, "confusion", "circumstance", "halt", "finish", "When an activity gets suspended for a sudden/temporary time, we use halt. \nExample: Production was brought to a temporary halt when power supplies failed.", "c", 0, 4, this.f562b));
        arrayList4.add(new questions("28.", "We will need to revolutionize our work culture. Everyone should be convinced that ________ comes through hard work and embrace for that. Otherwise, we remain poor forever. ", 0, 0, 0, 0, 0, "authority", "reputation", "prosperity", "popularity", "Prosperity: The condition of being successful or thriving; especially: economic well-being. ", "c", 0, 4, this.f562b));
        arrayList4.add(new questions("29.", "If you have to go abroad for your education, one of the things you have to be worried about is ________. You have to be sure of where you are going to stay before you leave this country. ", 0, 0, 0, 0, 0, "stipend", "provisions", "facilities", "accommodation", "Accommodation is a room or place where someone will stay or live.\nExample: They weren't sure if they could provide food and accommodations for the whole group.", "d", 0, 4, this.f562b));
        arrayList4.add(new questions("30.", "They heard it on the radio that the ________ where they store expensive electronic materials was on fire. I heard that the damage it inflicted is estimated at five million birr. ", 0, 0, 0, 0, 0, "hall", "warehouse", "classroom", "auditorium", "Warehouse: a large building where physical goods or manufactured goods may be stored prior to their distribution for sale. \nExample: \n- The warehouse was completely destroyed by fire. \n- The goods have been sitting in a warehouse for months because a strike has prevented distribution. \n", "b", 0, 4, this.f562b));
        new recviewquestion().setQuestions(arrayList4);
        this.recview4.setAdapter(recviewquestion3);
        this.recview4.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new questions("31.", "I heard a big bang in the middle of the night. Did the firearms in the depot GO OFF or was it something else? ", 0, 0, 0, 0, 0, "heat up ", "explode", "catch fire ", "burn down ", "Based on the context, go off means to explode, or to be fired. \nExample: The bomb was timed to go off at 9 o'clock. \n", "b", 0, 5, this.f562b));
        arrayList5.add(new questions("32.", "A very important lesson I learned from Kokeb is that you don't have to RELY on anyone. People respect you when you are self-sufficient, particularly financially. ", 0, 0, 0, 0, 0, "beg", "trouble", "depend", "entreat", "Rely: to need (someone or something) for support, help, etc. \n- to depend on (someone or something) \nExample: \n-My mother relied on me for financial support. \n- Many working women rely on relatives for childcare. \n", "c", 0, 5, this.f562b));
        arrayList5.add(new questions("33.", "Why are you worried about her? I know she is CAPABLE. Just leave her alone and you will see how beautifully she would do it. ", 0, 0, 0, 0, 0, "clever", "bright", "diligent", "competent", "Capable: having power and ability; efficient; competent. \nExample: \n- I know what Kebede is capable of. \n- He's a very capable business man. \n", "d", 0, 5, this.f562b));
        arrayList5.add(new questions("34.", "If he is visually IMPAIRED, tell him he should learn how to use braille. Otherwise, things will be hard for him when it comes to reading and writing. ", 0, 0, 0, 0, 0, "disabled", "weakened", "unable", "damaged", "Visual impairment describes any kind of vision loss, whether it's someone who cannot see at all or someone who has partial vision loss. \nImpaired: Having a disability of a specified kind. \nExample: Visually impaired people orient themselves by touch. \n", "a", 0, 5, this.f562b));
        arrayList5.add(new questions("35.", "It is important to CONSERVE some of our peace-building traditions and pass them down to the coming generation. On the other hand, there are others that should be done away with. ", 0, 0, 0, 0, 0, "enjoy", "keep", "Stock", "appreciate", "Conserve: to keep in a safe or sound state \nExample: \n- There are many simple ways to conserve water and help the environment. \n- Raising awareness of biodiversity is also required to conserve wildlife.\n", "b", 0, 5, this.f562b));
        arrayList5.add(new questions("36.", "Problems in this country are getting more and more complex from time to time. However, ways should be sought to OVERCOME them and start thinking about development. ", 0, 0, 0, 0, 0, "defeat", "handle", "solve", "overpower", "According to the context, overcome means to solve a problem. \nExample: I will strive to overcome these problems.\n", "c", 0, 5, this.f562b));
        arrayList5.add(new questions("37.", "Your persistent complaints have now started to IRRITATE me. How come that your eyes cannot see anything positive of what is going on? ", 0, 0, 0, 0, 0, "prick", "disgust", "itch", "annoy", "According to this question, irritate means to feel impatient or angry; annoyed. \nExample: After a while his behavior began to irritate me \n", "d", 0, 5, this.f562b));
        arrayList5.add(new questions("38.", "Despite our resistance, he decided to quit his studies and TAKE UP music. He has now been doing it for two months and I don't even want to know the progress he is making in this regard. ", 0, 0, 0, 0, 0, "sing", "major in", "start", "play ", "Take up meaning to start doing something regularly as a habit, job, or interest \nExample: \n- He can't wait to take up the sport. \n- Maybe you should take up a hobby! \n", "c", 0, 5, this.f562b));
        recviewquestion recviewquestion4 = new recviewquestion();
        recviewquestion4.setQuestions(arrayList5);
        this.recview5.setAdapter(recviewquestion4);
        this.recview5.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new questions("39.", "Nurses and doctors _________ every three days to see the progress the migrants are making. Reports show that most of them are now recovering which is a good thing to hear. ", 0, 0, 0, 0, 0, "Dispatched", "are dispatched ", "were dispatched ", "have been dispatched", "We use simple present tense, for words like every day, every month, every year, etc…\nExample: He plays football everyday\n", "b", 0, 6, this.f562b));
        arrayList6.add(new questions("40.", "I say we should not question the competence of the new team. Each member is ________ those we had in the last round. They may have another problem and that should be studied.", 0, 0, 0, 0, 0, "very experienced ", "much experienced as ", "so experienced ", "as experienced as ", "We use as + adjective/adverb + as to compare two things(nouns). It is used when the things or people we are comparing are equal in some way. \nExample: \n- The world's biggest bull is as big as a small elephant. \n- The weather this summer is as bad as last year. It hasn't stopped raining for weeks. \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("41.", "We do not understand why he always comes so late. If he arrives on time like his friends, he ________ the opportunity to meet us and get the necessary assistance. ", 0, 0, 0, 0, 0, "will have", "would have ", "ought to have ", "may be having ", "It is a type 1 conditional sentence: \nIf + simple present ...... will + infinitive \nIf he arrives on time like his friends, he will have the opportunity to meet us. \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("42.", "Of all the stuff she bought yesterday, I like the books ________ she got from the library. I started reading one of them and the story is really thrilling. ", 0, 0, 0, 0, 0, "which", "whose", "who", "That", "We use 'which' for things, 'who' & 'whom' for people, 'that' for both. \nExample: Which book are you going to buy? \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("43.", "Have you heard that the police arrested Mr. Gwangu, ________ was our school Director? He may have been involved in some corruption. ", 0, 0, 0, 0, 0, "whom", "which", "who", "that", "We use \"who\" as a relative pronoun to introduce a relative clause about people: \nExample: He shared a flat with Tayitu, who he married, and eventually they moved to Eritrea. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("44.", "Conflicts ________ take place between the pastoralists and farmers in this area every time the dry season comes. The government has to find a means of solving the shortage of water which is the main cause of the problem.", 0, 0, 0, 0, 0, "will", "would", "may", "shall", "May is used to indicate possibility or probability. \nExample: In the workplace, you may experience conflict with a co-worker, manager or customer. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("45.", "I am taking my own bed sheets with me ______ the hotel doesn't provide clean ones. It is always good to be careful. ", 0, 0, 0, 0, 0, "If", "Just since ", "In case ", "If perhaps ", "In case: is used to talk about things we should do in order to be prepared for possible future situation. \nExample: Her father always gives her some money in case she can need it. She can need it — possibility / Her father always gives her some money — precaution) \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("46.", "I believe you and there may not be any mosquitoes at this time of the year. But ________ it is always good to be on the safe side? So, get the rooms sprayed with insecticides. ", 0, 0, 0, 0, 0, "may I agree ", "can I disagree ", "isn't it true ", "can I just say that ", "We use \"isn't it\" when we have some idea that something is true, or we suspect it is true, but we are not sure and are asking from a position of uncertainty \nExample: The laptop looks used, isn't that true? \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("47.", "We learned there is a very important conference you are holding towards the end of this month. _______ as they could gain some knowledge? ", 0, 0, 0, 0, 0, "would our students attend it ", "our students could attend it please ", "shall our students possibly attend it ", "is it possible that our students attend it ", "\"Is it / would it be possible\" is used for asking politely. \nExample: Would it be possible to have a look at your newspaper? \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("48.", "I appreciate what you said about the root causes of the problem and how we can possibly solve it. But for our record, ______ ", 0, 0, 0, 0, 0, "what is your name and where you come from? ", "where do you come from and your name, please? ", "could you tell us your name and where you come from? ", "are you willing to tell us what's your name and your address? ", "\"Could you tell us” Or \"can you tell us” Is a formal way of asking for name and address. \nExample: Could you tell me your name? \nOn other hand, \"Are you willing\" implies that the person asking the question expects that the listener might have some hesitancy about whether he/she would actually want to take on the task. \nExample: Are you willing to work night shifts? \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("49.", "We were all busy reading the fiction our teacher asked us to read when we ______ a huge explosion that seemed to be from upstairs. Many of us fell on the floor and it was as if we were all dead. ", 0, 0, 0, 0, 0, "heard", "would hear ", "hear", "were hearing ", "We use past progressive for actions that was happening and the past simple tense for the second action that interrupted it. The interrupting action often comes with when. \nExample: He was going home when he saw a thief. \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("50.", "The area was rugged and mountainous. _______ its weather was so harsh that we could hardly move around and see places. ", 0, 0, 0, 0, 0, "However", "In addition ", "Even then ", "All along ", "We use \"in addition\" to express another item related with the first one. \nExample: I cannot come with you, I have to go to work. In addition, there is someone I need to see at 2 p.m. sorry. \n", "b", 0, 6, this.f562b));
        arrayList6.add(new questions("51.", "The crowd kept rallying every day and the scene gradually started turning violent the people thought the government didn't take them seriously. Now things reached a point where they are completely out of control. ", 0, 0, 0, 0, 0, "because", "because of ", "consequently ", "as a consequence of ", "Difference between because and because of: \n- Both because and because of are used to give reasons. \n- Because of is a preposition, whereas because is a conjunction. \n- Because is followed by a verb and a subject whereas because of is followed by an ing verb and a noun. \n- Because is used in place of since and as. \nExample: \n- Helen did not go to school because she was sick.\n- He could not work properly because of the crying infant in the room\n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("52.", "Tensions between the two countries seem to _____ from time to time but they would never fight. This has become a tradition and would only remain a war of words. ", 0, 0, 0, 0, 0, "improve", "worsen", "heighten", "regenerate ", "Heighten: to become more intense. \nFrom the given choices, heighten is the best word that goes well with tension. \nExample: \n• There are fears that the march will heighten racial tension. \n• Tensions between the two racial groups have heightened. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("53.", "It is sad that COVID-19 has already caused a lot of damage to many countries of the world. ________ due to the vaccines administered all over the world, there are signs that the rate of infection is declining. ", 0, 0, 0, 0, 0, "Surprisingly ", "On the contrary ", "But", "However", "No explanation", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("54.", "Our office wants to employ secretaries on a contractual basis but with a possible extension. The salary and other benefits are amazingly attractive. I encourage you to apply if you ______ neatly type at least 60 words per minute. ", 0, 0, 0, 0, 0, "can", "will", "may", "would", "We use \"can\" to express ability, request permission, show possibility. In this specific question, typing need ability, hence we use can. \nExample: I recommend you to apply for the job, if you can drive a car. We often use would as a kind of past tense of will or going to: \nExample: Even as a boy, he knew that he would succeed in life. \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("55.", "Everything was in a mess _______ I arrived. It was not even possible to find out what had happened because she never came back. ", 0, 0, 0, 0, 0, "after", "since", "when", "while", "We use when as a conjunction meaning 'at the time that'. \nExample: \n- When I was a child, there were no houses \n- Nobody spoke when she came into the room. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("56.", "If she _______ persistent dry cough and fever, I would have called 8335 but that wasn't the case. It just looked like the ordinary flu.", 0, 0, 0, 0, 0, "did have ", "would have ", "has had ", "had", "Form of third conditional sentence: \nIf + past perfect, would/wouldn't have + past participle \nExample: \n- If you had told me you needed a ride, I would have left earlier. \nMeaning The speaker was capable of leaving early, but did not. \n- If I had cleaned the house, I could have gone to the movies. \nThe speaker was capable of cleaning the house, but did not \nThese sentences express a condition that was likely enough, but did not actually happen in the past.\n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("57.", "We _______ in the same office since 2010 but she has never acted like that before. She must have got out of bed on the wrong side. ", 0, 0, 0, 0, 0, "worked", "have worked ", "work", "are working ", "Using the present perfect, we can define a period of time before now by considering its duration, with for + a period of time, or by considering its starting point, with since + a point in time. \nExample: \n- I have worked here since 1990. \n- We have taught at this school since 1965. \n", "b", 0, 6, this.f562b));
        arrayList6.add(new questions("58.", "I am trying to move to Australia to live with my elder brother. I hope my life _______ be different there.", 0, 0, 0, 0, 0, "might", "is going to ", "will", "should", "We use 'will' for the following situations: \n- To describe the future. Example: We'll be at the hotel until 8pm. \n- To make a prediction. Example: The world population will grow a lot in the next 50 years. \n- To express a decision made at the moment of speaking. \nExample: (The phone rings) I'll answer it. \n- To make a request: \nExample: Will you bring some more water please? \n-To make promises and offers. \nExample: I'll call you when I get home. \n- To describe the consequence of a conditional phrase: \nExample: If it rains, I'll take my umbrella. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("59.", "I would be happy if we can meet this afternoon but _______ it is going to rain. If it doesn't come to Eliana at 3:30. ", 0, 0, 0, 0, 0, "very unlikely ", "it looks as if ", "I am sure ", "it is as though ", "Looks as if: in such a way that something seems to be true. \nExample: \n- It looks as if it's going to rain \n- She felt as if all her worries had gone. \n", "b", 0, 6, this.f562b));
        arrayList6.add(new questions("60.", "Are those two girls from the same family? They look alike and ______ I see them together, even in odd kinds of places. ", 0, 0, 0, 0, 0, "hardly do ", "infrequently", "some of the time ", "most of the time ", "Most of the time — on most occasions or usually. \nExample: Most of the time he's a really nice guy, but sometimes he can be really nasty. \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("61.", "I haven't started my homework yet but I ________ it by 4:00 in the afternoon. Submission time is 4:15 p.m. ", 0, 0, 0, 0, 0, "will have done", "would have done", "will done ", "am going to do", "We use the future perfect tense to describe the same sense of completion but at a moment in the future. \"Will have done\" is used for saying that you expect an action to be completed before a time in the future. \nExample: \n- We will have gone to bed by the time you arrive. \n- Next month my parents will have been together for twenty years. \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("62.", "Despite their longtime friendship, Biftu and Tola are not in good terms. ______, they had a problem and now they have broken up. I don’t know what had happened.", 0, 0, 0, 0, 0, "Anyway, as I was saying ", "However, as I understand ", "In addition ", "Unfortunate it is ", "We use \"in addition\" to express another item related with the first one. \nExample: I cannot come with you, I have to go to work. In addition, there is someone I need to see at 2 p.m., sorry. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("63.", "My son scored A's in all the courses he took this semester. I am really _____ him. ", 0, 0, 0, 0, 0, "keen on ", "famous for ", "proud of ", "satisfied ", "Proud of: feeling deep pleasure or satisfaction as a result of one's own achievements. \nExample: Her parents are proud of her. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("64.", "We all contributed what is within our reach ______ help the needy children in our school. We bought them the stationery they needed for the whole year. ", 0, 0, 0, 0, 0, "because to ", "because of to ", "so that to ", "so as to ", "\"so as to\" is used to explain why an action is done. \nExample: \n- He looked at job advertisements so as to find a new job. \n- He will go to the cinema so as to watch the new movie. \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("65.", "I can see your point of argument but the officials are honest when it comes to denouncing corruption. One of them was caught red-handed by the police a fortnight ago. ", 0, 0, 0, 0, 0, "I don't doubt that ", "It is unacceptable ", "everybody says that ", "I am not convinced ", "I am not convinced: not brought to believe or accept something by argument, The speaker is trying not to accept what he has been told about the officials. ", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("66.", "I know one thing for sure. _____ hand in hand and worked for the unity of the country. If everyone goes his way, we get smaller and weaker for the enemy to engulf us. ", 0, 0, 0, 0, 0, "Everybody joined ", "It is time we joined ", "Let everybody join ", "We should stand together ", "\"We stand together hand in hand\" is the correct phrase. ", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("67.", "I am glad we decided to let Birke move in because we are saving her life. _____ we are disappointing her mom who wants her around regardless of any risk that may come. ", 0, 0, 0, 0, 0, "Anyway", "Consequently", "On the other hand ", "In this circumstance ", "\"On the other hand\" is used to introduce a statement that contrasts with a previous statement or presents a different point of view. \nExample: He's a good guy. His brother, on the other hand, is a very selfish man. \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("68.", "Is he serious threatening to kill you? Don't take this as a joke. ______ need to report it to the police. ", 0, 0, 0, 0, 0, "You might ", "It is that you ", "It is important you ", "The thing is you ", "Might is a modal verb. We use might to suggest a possible action or situation to another person. \nExample: \n-You might want to catch a taxi. \n-Might I ask who has been invited to the party? \n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("69.", "They have now arrested the two brothers _____ led the coup against King  Bozambo of Jombaria. Rumors have it that they had seen hiding in a little village in the country. ", 0, 0, 0, 0, 0, "who ", "which", "those", "whom", "\"Who\" is a subjective pronoun. \"Whom\" is an objective pronoun. This means \"who\" is always subject to a verb, and that \"whom\" is always working as an object in a sentence. \nExample: \n- Michael is the one who wants to go. \n- A number of friends went to the cinema, one of whom was the birthday boy.\n", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("70.", "The school ______ a lot of job this year. This was mainly because every member of the school community was cooperative in supporting the administration.", 0, 0, 0, 0, 0, "does", "is doing ", "has done ", "had done ", "The present perfect tense is used for: \n1) Actions which started in the past and are still continuing \nExample: He has lived in Ethiopia for five years. (He started living in Ethiopia five years ago, and he is still living there now.) \n2) Actions (single action or repeated actions) I which happened at some unknown time in the past \nExample: They have eaten at that restaurant many times. (Repeated past actions; when they ate there isn’t important) \n3) Actions which happened in the past, but have an effect in the present.\nExample: I’ve lost my keys. (Meaning: I don’t have the keys. They are still missing.)\n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("71.", "The fundraising project in our kebele has been more successful than ever before an insider told me they _____ raised 10 million birr in six months. ", 0, 0, 0, 0, 0, "may be able to ", "would be able to ", "are able to ", "were able to ", "To talk about a general ability in the past, we use \"could\" or \"was / were able to\" \nExample: \n-I was able to run very fast. \n-They were able to jump so high. \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("72.", "Unless there is something fishy about his business, Elias _____ a millionaire now. He just had that small kiosk when I left the village half a year ago. ", 0, 0, 0, 0, 0, "is not ", "can't be ", "may not be ", "must not be ", "We use \"can't be\" to draw a conclusion about something in a negative way. ", "b", 0, 6, this.f562b));
        arrayList6.add(new questions("73.", "I have ______ things to do before I leave for the meeting. So, I have to lock myself in a work with no interruption. ", 0, 0, 0, 0, 0, "Some", "a few ", "much ", "a lot of ", "A lot of and lots of can both be used with plural countable nouns and with singular uncountable nouns for affirmatives, negatives, and questions: \nExample: \n- There weren't a lot of choices \n- Can you hurry up? I don't have a lot of time. \n", "d", 0, 6, this.f562b));
        arrayList6.add(new questions("74.", "The question is interesting. _____ family do I like most? The answer is \"Million's\". They are very disciplined, close, and cooperative. Everybody envies them. ", 0, 0, 0, 0, 0, "Whose", "Which", "Who", "What", "Whose is a possessive pronoun. It should be used to ask or tell to whom something belongs. ", "a", 0, 6, this.f562b));
        arrayList6.add(new questions("75.", "I can see you are not very happy these days. _______ what is bothering you? ", 0, 0, 0, 0, 0, "What is the problem ", "Honestly, I want to know ", "Would you mind telling me ", "It could happen but is it serious? ", "\"Would you mind\" is used for asking politely for something. \nExample: Would you mind closing that window? \n", "c", 0, 6, this.f562b));
        arrayList6.add(new questions("76.", "You now seem to have lost all the excess weight. You look really supportive. ______ do you go to the gym? ", 0, 0, 0, 0, 0, "With who ", "Which place ", "How often ", "How many times ", "How often is an adverb of frequency used to ask question about how frequently an event occurs. \nExample: How often do you go to the cinema? \n", "c", 0, 6, this.f562b));
        recviewquestion recviewquestion5 = new recviewquestion();
        recviewquestion5.setQuestions(arrayList6);
        this.recview6.setAdapter(recviewquestion5);
        this.recview6.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList7 = new ArrayList();
        arrayList7.add(new questions("77.", "Shashitu: Tell me, are there twins in your family? \nSintayehu: _________\n", 0, 0, 0, 0, 0, "No I don't have twins ", "Sure, I have two brothers. ", "Not at all. We have none. ", "You mean sisters and brothers?", "“Not at all” is used to say “no” or “not” strongly. Sintayehu tells shashitu that there are no wins in their family", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("78.", "Biru: Shall we report the case to the deputy manager? \nMegersa: __________\n", 0, 0, 0, 0, 0, "What is the problem with them? ", "Who knows, they could be friends. ", "What is the deputy manager doing? ", "I think it would be safe if you report it. ", "We use 'I think' as a way of being polite when you are explaining or suggesting to someone what you want to do, or when you are accepting or refusing an offer.", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("79.", "Tilahun: Let's go and get them back by force. \nAsmara: _________\n", 0, 0, 0, 0, 0, "I see your point but force may not be a good solution.", "How and when do you intend to go there? Let's know.", "Do you know the cause of the conflict? What went wrong? ", "Isn't it mad that violence has become so rampant these days? ", "Asmara wants Tilahun to know that force is not a good solution. ", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("80.", "Policeman: Tell me what you saw happening at the scene of the incident. \nWitness: ___________\n", 0, 0, 0, 0, 0, "First, he snatched her purse and in no time vanished into the village. ", "I saw a crowd of people some of who were aimlessly wandering around. ", "I was surprised to see this girl with beautiful long hair trying to talk to me. ", "The scene was full of people as usual. It has become hard to afford bread. ", "The witness tells the policeman what he saw at the scene of the incident. ", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("81.", "Tsehay: You know, inflation has got out of control. It has become hard to afford bread. \nFinote: _____________\n", 0, 0, 0, 0, 0, "Inflation? But there are people who have got money to burn. ", "The government started to control greedy business people in town. ", "Sure, but another problem is that you can't even find items you want. ", "Inflation is everywhere in the world. There is no need to worry about it. ", "Finote agrees with what Tsehay said, by replying with \"sure\". ", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("82.", "Titi: Shall I quit my education and get married? \nSister: ___________\n", 0, 0, 0, 0, 0, "Did you fail the course you were taking? ", "Many girls are getting married these days.", "Marriage is an important chapter in one's life. ", "In my view, you'd better get your degree first. ", "“You'd” is a contraction of 'you had' or 'you would’. 'You would' is used to suggest someone for a particular action. \nExample: You would better invite your brother. \n", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("83.", "Peter: I am suspecting myself of catching the current virus. Shall I go and take rest? \nDidi: ________\n", 0, 0, 0, 0, 0, "Where have you been to these days? ", "Don't say that. The name itself is scary. ", "Oh no! I would advise you to get tested. ", "Do you mean COVID-19? It is a bad virus. ", "Didi is advising Peter ", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("84.", "Hawulet: Tell me. What is that offends Melat? \nWoinitu: _______\n", 0, 0, 0, 0, 0, "Melat is such a nice girl. I'll ask her. ", "There are many things she doesn't like. ", "Actually, there are some people who offend her. ", "If you tell her she is not beautiful, she'll get mad. ", "Woinshet tells her the thing that offends Melat. ", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("85.", "Ahmed: How did China develop so quickly? \nNejat: __________ \n", 0, 0, 0, 0, 0, "China! It surprised the world, didn't it? ", "Above all, the Chinese have a strict work discipline. ", "This is possible. A lot of other countries have done it. ", "Let's see. How many years did it take them to get there? ", "Nejat tells the reason behind the development of China is their strict work discipline.", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("86.", "Holala: Do you think life could have been possible without water? \nMola: _______\n", 0, 0, 0, 0, 0, "No way! We would be dehydrated to death. ", "Is there anything more important than water? ", "In fact, water is very useful for human beings. ", "We don't seem to value water because it is free.", "For questions that begin with \"Do you think\", we can respond with \n• No, I don't think.... \n• Yes.... \nDefinition: Dehydration occurs when your body doesn't have enough water as it needs to carry out its normal functions. \n", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("87.", "Obang: My computer has suddenly shut down. What has happened to it? \nTechnician: _______\n", 0, 0, 0, 0, 0, "Is that a very older computer? ", "Were you typing stuff on it? ", "Mine has never been like that. ", "I hope that wouldn't be a virus. ", "Some viruses are programmed to make your computer shut itself off. ", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("88.", "Abush: __________\nFriend: My dream is actually to visit Japan. The cleanliness attracts me. \n", 0, 0, 0, 0, 0, "Which country are you planning to visit? ", "Which place in the world do you like most? ", "Which place in the world do you want to visit? ", "Which country in the world is attractive to you. ", "From Abush's friends reply, we can see that Abush must have asked him which country/ place his friend wants to visit. ", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("89.", "Tigist: Of all jobs, why did you choose to be a hostess? \nLilu: ________\n", 0, 0, 0, 0, 0, "Sure. There are a lot of other jobs to take. ", "I am interested in visiting different places. ", "Many of the girls in my city are also hostesses. ", "You don't know what it took me to become one. ", "Lilu chose hostess profession to visit different places. ", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("90.", "Hussein: what do you mean by 'education is not financially rewarding?\" \nBilal: ________\n", 0, 0, 0, 0, 0, "I am saying that doing a degree is materially and physically demanding. Okay? ", "What I'm trying to say is that most well-educated people are economically poor. ", "You know, there are so many people who haven't had any job for ten or so years. ", "Come on. Imagine the number of years it takes to get a master's or a PhD. Degree. ", "According to Bilal, well-educated people are economically poor. ", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("91.", "Melkam: Do we need to send delegates and try to convince them? \nBelay: _________\n", 0, 0, 0, 0, 0, "We have been friends for generations. Why do they forget that? ", "Convincing someone needs some kind of special skill. Doesn't it?", "Who are they making all this trouble? They don't like to see us change. ", "Well, as far as I can see, there is no point in doing that. Just ignore them. ", "As far as I can see: to the best of my understanding or belief. \nExample: As far as I can see you've got an excellent of chance of getting that job. \n", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("92.", "Kuku: BMC Company is going bankrupt and they have advertised to sell it. \nZeritu: _________\n", 0, 0, 0, 0, 0, "KMD has done the same thing. that is not good news at all. ", "The only solution to this problem is unity among the people. ", "I was there a couple of weeks ago. How old is that company now? ", "Well, I would find this good for it. Better heads could come in to manage.", "Both BMC and KMD companies are going bankrupt. ", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("93.", "Chimsa: I feel the atmosphere is murky around. Can't you sense some danger looming? \nGalgalo: ________\n", 0, 0, 0, 0, 0, "We really should finish this work today and leave immediately. ", "That is the case in many parts of the country. How frustrating!", "For how long is this going to continue? A week, month, a year?", "We hope things will improve soon. It is just a temporary problem. ", "Murky means very dark. \nChimsa responded how frustrating the atmosphere is and told him it is a case in many parts of the country\". ", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("94.", "Risom: Have you seen Ghidey's new jacket? Very beautiful! \nKibrom: __________\n", 0, 0, 0, 0, 0, "I don't like jackets. ", "Sure, what is it made of? ", "Ghidey is rather too showy. ", "That boutique sells nice jackets. ", "Kibrom has already seen Ghidey's new jacket and wondering what it is made of. ", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("95.", "Ambassador: My son wants to get a driving license? What is the requirement here? \nYou: __________ \n", 0, 0, 0, 0, 0, "As a rule, everybody would need to be 18 to get one in this country.", "Oh, I see. Driving a car is one of the dreams of young people. ", "Driving a car is not very difficult. He shouldn't worry as such. ", "Excuse me but how many sons have you got, Mr. Ambassador? ", "In order to get a driving license, you need to be 18. ", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("96.", "Alambo: Elders of the village should impose sanctions on these young people. \nJikamo: __________\n", 0, 0, 0, 0, 0, "How many elders do we have here? Do you know? ", "Young people have become out of control. It's sad. ", "What did you say? I'm sorry, I'm not quite with you ", "Young people today? They don’t even listen to elders. ", "No explanation", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("97.", "Boss: Sorry but novice employees have not been included in the scheme this time. \nEmployee: ___________\n", 0, 0, 0, 0, 0, "When does the scheme start operation? ", "That is not clear. Can you explain why? ", "Novice employees are really hard working. ", "Why is that you hate novice employees? ", "Scheme is a large-scale systematic plan. The employee is asking why novice(new) employees are not included in the scheme. ", "b", 0, 7, this.f562b));
        arrayList7.add(new questions("98.", "Staff: Why hasn't the manager himself come? We wanted him to give us explanations. \nDeputy: ___________\n", 0, 0, 0, 0, 0, "The main reason is that he has visitors right this time. ", "The manager wanted me to represent him at this meeting.", "This is not the time to boycott. It is the time to work hard. ", "What are your major complaints? Let me know them in detail. ", "Staff can't talk to the manager, because he has visitors at the time. ", "a", 0, 7, this.f562b));
        arrayList7.add(new questions("99.", "Evictees: We love you! We appreciate! Thank you for your kind assistance! \nDonor: ____________\n", 0, 0, 0, 0, 0, "I hope you will give special care to children and the elderly. ", "I understand being evicted is very tormenting and disgraceful. ", "The agents behind your eviction will soon be brought to justice. ", "It gives me much pleasure to be of some help at this critical time. ", "Ways of accepting someone's thanks \n- You're welcome \n- Don't mention it. \n- It's my pleasure \n- It gives me pleasure \n- Not at all. \n- No problem \n", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("100.", "Speaker: ___________ \nAudience: Sir, can I ask a question before you go?\n", 0, 0, 0, 0, 0, "My last point relates to the benefits we would provide to you. ", "Let me move on to talk about the availability of raw materials.", "I would also like to talk about our plan for the next fiscal year. ", "Finally, I would like to say to you all thank you for your attention. ", "From the audience's answer, we understand that the speaker has already finalized his speech. ", "d", 0, 7, this.f562b));
        arrayList7.add(new questions("101.", "Journalist: welcome to our program of \"Politics and Politicians.\" \nInterviewee: _________\n", 0, 0, 0, 0, 0, "I have been following this program regularly ", "To be honest, I am not a politician deep in the heart. ", "Thank you for inviting me. It is my pleasure to be here. ", "Tell me. What is the program of \"Politics and Politicians\" about? ", "Thank you for inviting me: is a polite expression of gratitude. This expression is directed towards the host to show respect and reciprocity for being allowed to take part in the event. ", "c", 0, 7, this.f562b));
        arrayList7.add(new questions("102.", "Gaga: Who is a famous Ethiopian singer you admire? \nGugu: ____________\n", 0, 0, 0, 0, 0, "A famous Ethiopian singer I admire is Muluken Melese. He's wonderful. ", "There are lots of famous Ethiopian singers. Truly speaking, it is a long list. ", "I think I admire Sudanese singers more than I do Ethiopians. You may hate me. ", "Many people admire Tilahun Gesesse. They say he is the king of Ethiopian music. ", "Gugu replies by picking the name of the singer, he admires the most. ", "a", 0, 7, this.f562b));
        recviewquestion recviewquestion6 = new recviewquestion();
        recviewquestion6.setQuestions(arrayList7);
        this.recview7.setAdapter(recviewquestion6);
        this.recview7.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList8 = new ArrayList();
        arrayList8.add(new questions("103.", "Which of the following sentence is correctly punctuated?", 0, 0, 0, 0, 0, "Kindly, donate shirts, jackets, trousers, shoes and even bags. ", "Kindly donate shirts, jackets, trousers, shoes and even bags. ", "Kindly donate, shirts, jackets, trousers, shoes and even bags.", "Kindly donate shirts, jackets, trousers, shoes and even, bags. ", "Usage of kindly. \nExample: \n- Kindly inform us when this is put into effect. \n- Kindly send me your letter. \n- Kindly hand me your homework. \n- Kindly explain to us the reason for this urgency. \n- Kindly donate shirts and jackets. \n", "b", 0, 8, this.f562b));
        arrayList8.add(new questions("104.", "Which of the following sentence has the correct punctuation? ", 0, 0, 0, 0, 0, "Come to Sidist kilo and you will take a taxi to the French Embassy. ", "Come to Sidist Kilo and you will take a taxi to the French embassy.", "Come to Sidist Kilo and you will take a taxi to the French Embassy. ", "Come to sidist kilo and you will take a taxi to French Embassy. ", "Capitalization Rules: \n1) Capitalize the First Word of a Sentence \nExample: The cat is sleeping. \n2) Capitalize Names and Other Proper Nouns \nExample: My favourite author is Addis Alemayehu \n3) Capitalize Cities, Countries, Nationalities, and Languages \nExample: \n• My mother is Eritrean. \n• The capital city of Ethiopia is Addis Ababa. \nCome to Sidist Kilo and you will take a taxi to the French embassy is the correct answer. \n• \"Come\" is capitalized according to rule No. 1\n• Both words \"Sidist Kilo\" are capitalized just like city the \"Addis Ababa\" according to rule No. 3\n• \"French\" is capitalized according to rule No. 3 \n• When used with proper noun \"Embassy\" is capitalized e.g. (U.S. Embassy or French Embassy), other than that, it is not capitalized.\n", "c", 0, 8, this.f562b));
        arrayList8.add(new questions("105.", "Which of the following sentence is correctly punctuated? ", 0, 0, 0, 0, 0, "What do you think of his new book, \"Kind Is Not Kind?\" ", "Every morning he shouts, \"Why don't you get up in time\"? ", "I can change my decision to sell the house, can't I, whenever I wish? ", "She wouldn't collect her belongings soon, would she? In my opinion. ", "When the quotation itself is a question, put a question mark inside the quotation marks. When the sentence as a whole is a question, but the quoted material is not, put a question mark outside the quotation marks. \nThe correct answer is C. The remaining choices can be corrected as follows:  Choice A and B can be corrected as follow: \nA) What do you think of his new book, \"Kind Is Not Kind\"? \nB) Every morning, he shouts, \"Why don't you get up in time?\" \n", "c", 0, 8, this.f562b));
        arrayList8.add(new questions("106.", "Which of the following sentence has the correct punctuation?", 0, 0, 0, 0, 0, "They will all receive the standard discount ie., 25%. ", "The UN. Has taken irreversible measures against them. ", "She told me that the items will be delivered at 3:30. pm. ", "Send me the following items: a hammer, nails and a saw.", "The correct answer is Send me the following items: a hammer, nails and a saw.  ", "d", 0, 8, this.f562b));
        recviewquestion recviewquestion7 = new recviewquestion();
        recviewquestion7.setQuestions(arrayList8);
        this.recview8.setAdapter(recviewquestion7);
        this.recview8.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList9 = new ArrayList();
        arrayList9.add(new questions("107.", "better you you listen they tell what to. ", 0, 0, 0, 0, 0, "You better listen to what they tell you. ", "You better listen what they tell to you. ", "Better you listen what they tell to you. ", "They better listen you to what you tell. ", "The correct word order is: You better listen to what they tell you. ", "a", 0, 9, this.f562b));
        arrayList9.add(new questions("108.", "were they fifty and made they happy birr some ", 0, 0, 0, 0, 0, "They made happy and they were some fifty birr", "Some fifty birr they made and they were happy. ", "They made fifty birr and some they were happy. ", "They made some fifty birr and they were happy. ", "The correct word order is: They made some fifty birr and they were happy.", "d", 0, 9, this.f562b));
        arrayList9.add(new questions("109.", "in you girl about slim, are pretty the talking neighborhood tall, this? ", 0, 0, 0, 0, 0, "Are you talking about this tall, slim, pretty girl in the neighborhood?", "You are about the pretty, talking, tall girl in this slim neighborhood? ", "This pretty, tall, girl in the neighborhood talking about you are slim? ", "Are you this pretty, tall, slim girl talking about in the neighborhood? ", "The correct word order is: Are you talking about this tall, slim, pretty girl in the neighborhood? ", "a", 0, 9, this.f562b));
        recviewquestion recviewquestion8 = new recviewquestion();
        recviewquestion8.setQuestions(arrayList9);
        this.recview9.setAdapter(recviewquestion8);
        this.recview9.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList10 = new ArrayList();
        arrayList10.add(new questions("110.", "Display and movement communications are evident in all kinds of animals. The herring gull is a type of bird that has a yellow-colored beak with a red spot on the end. When it returns to its nest to feed its young, it taps its beak on the ground to indicate that it has good. The young chicks, in return, tap the red spot on the parent's beak and this stimulates the gull to give the good to the chicks. North American rattlesnakes make a loud rattling sound before administering their poisonous bite. This is a warning to a potential predator. \n\nWhat is the main idea of the paragraph? \n", 0, 0, 0, 0, 0, "Animals have their own means of communication. ", "The herring gull is a bird with a yellow-colored beak.", "Young chicks communicate with their mothers when hungry. ", "Snakes and other animals have a way of warning their predatory ", "In the first sentence of the paragraph, it states the main idea of the paragraph", "a", 0, 10, this.f562b));
        arrayList10.add(new questions("111.", "The African Nations Cup started in Sudan in 1957. At the time, although many countries had lively national club competitions, there were very few international matches between African national teams and so only three countries took part: Egypt, Ethiopia and Sudan. \n\nWhich one of the following is the main ideas of the paragraph? \n", 0, 0, 0, 0, 0, "Three countries started the African Nations Cup. ", "In 1957, many African countries had national clubs. ", "African countries were hardly involved in matches in 1957. ", "The history of African Nations Cup goes as far back as 1957. ", "In the first sentence of the paragraph, it states the main idea of the paragraph. ", "d", 0, 10, this.f562b));
        recviewquestion recviewquestion9 = new recviewquestion();
        recviewquestion9.setQuestions(arrayList10);
        this.recview10.setAdapter(recviewquestion9);
        this.recview10.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList11 = new ArrayList();
        arrayList11.add(new questions("112.", "Which of the following words has a correct spelling? ", 0, 0, 0, 0, 0, "Bussiness", "millenium", "programe", "vaccination", "The correct spelling: \nA) business \nB) millennium \nC) program \nD) vaccination \n", "d", 0, 11, this.f562b));
        arrayList11.add(new questions("113.", "Which of the following words has a correct spelling? ", 0, 0, 0, 0, 0, "decision", "convension", "convieced", "partcipation", "The correct spelling: \nA) decision \nB) convention \nC) convinced \nD) participation \n", "a", 0, 11, this.f562b));
        recviewquestion recviewquestion10 = new recviewquestion();
        recviewquestion10.setQuestions(arrayList11);
        this.recview11.setAdapter(recviewquestion10);
        this.recview11.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList12 = new ArrayList();
        arrayList12.add(new questions("114.", "Which one of the following is a possible closing salutation to an informal letter? ", 0, 0, 0, 0, 0, "Regards. ", "Sincerely. ", "Take care. ", "Yours truly. ", "Possible closing salutation for an informal letter: \n- Yours truly \n- Your friend \n- All the best \n- Take care \nPossible closing salutation for formal letter: \n- Sincerely \n- Regards \n- Respectfully \n- Faithfully \n- Best regards \n\nChoice C and D can both be answers. \n", "c", 0, 12, this.f562b));
        arrayList12.add(new questions("115.", "Which one off the following lines is most likely taken from an informal letter? ", 0, 0, 0, 0, 0, "We have received a letter of your complaints about the service you... ", "We had booked a table for six but when we arrived, there was no free...", "I am writing this letter to invite you to my birthday party which will be... ", "In this first place, I requested you to book me a room by the view of the sea... ", "An informal letter is a letter that encompasses a personal tone and is exchanged among friends, family members, or neighbors. \nExamples of informal letters are: \n-Inviting a friend for a birthday, marriage or ceremony. \n- Calling a friend for a trip or holiday. \n- Asking sorry or apologizing to someone for mistakes you have done. \n- Congratulating a friend for his success or achievement.\n", "c", 0, 12, this.f562b));
        arrayList12.add(new questions("116.", "In an informal letter, which one of the following comes following the date? ", 0, 0, 0, 0, 0, "Opening", "Receiver's name ", "Body", "Receiver's address ", "Format of informal letter in the correct order: \n- Address of the sender \n- Date of writing a letter \n- Address of receiver \n- Salutation/Greeting \n- Body of the letter \n- Conclusion \n- Signature of the sender \n", "d", 0, 12, this.f562b));
        recviewquestion recviewquestion11 = new recviewquestion();
        recviewquestion11.setQuestions(arrayList12);
        this.recview12.setAdapter(recviewquestion11);
        this.recview12.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList13 = new ArrayList();
        arrayList13.add(new questions("117.", "a. I followed him proudly, step by step. \nb. My uncle was wonderful at rice cutting. \nc. Then my uncle tied the bundles together. \nd. He handed me the bundles of stalks as he cut them. \ne. I tore off the leaves, trimmed the stalks and piled them. \n", 0, 0, 0, 0, 0, "b d a c e ", "b a e c d ", "b d e a c ", "b a d e c ", "Correct coherence: b a d e c ", "d", 0, 13, this.f562b));
        arrayList13.add(new questions("118.", "a. However, it is extremely energy inefficient. \nb. That makes the use of desalination very limited. \nc. Currently, there is world crisis in energy supplies. \nd. Desalination of sea water can increase water supply. \ne. That is why it is in use only in energy-rich countries. \n", 0, 0, 0, 0, 0, "d a e c b ", "d c e b a ", "c d a b e ", "c e d a b ", "Correct coherence: d a e c b ", "a", 0, 13, this.f562b));
        arrayList13.add(new questions("119.", "a. That created a huge resentment in me. \nb. Rebel soldiers always wanted to kill him. \nc. In fact, my mom was a very strong woman. \nd. We lived in a hut in a small village near Buntu. \ne. My father ran away when I was only 12 years old. \n", 0, 0, 0, 0, 0, "e d b a c ", "d e b a c ", "d c e a b ", "c e d a b ", "Correct coherence: d e b a c ", "b", 0, 13, this.f562b));
        arrayList13.add(new questions("120.", "a. In fact, this wasn't without any challenge. \nb. The number of democratic regimes has continued to rise. \nc. The quality of governance has become a major issue of concern. \nd. Corruption, violence and poverty have become the worst threats. \ne. Further, good governance has become a criterion for country's credibility. \n", 0, 0, 0, 0, 0, "c e b a d ", "b c e d a ", "c b e a d ", "d a c b e ", "The correct coherence: c e b a d ", "a", 0, 13, this.f562b));
        recviewquestion recviewquestion12 = new recviewquestion();
        recviewquestion12.setQuestions(arrayList13);
        this.recview13.setAdapter(recviewquestion12);
        this.recview13.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f563tb = toolbar3;
        setSupportActionBar(toolbar3);
        getIntent();
        Boolean valueOf = Boolean.valueOf(intent.getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    english2013.this.timer.setVisibility(0);
                    english2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    english2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2013.this.getBaseContext());
                    int unused = english2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = english2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = english2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = english2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = english2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = english2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = english2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = english2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = english2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = english2013.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                    int unused11 = english2013.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                    int unused12 = english2013.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                    int unused13 = english2013.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                    int unused14 = english2013.this.highscore = defaultSharedPreferences.getInt("eng2013hs", 0);
                    int access$200 = english2013.this.part1 + english2013.this.part2 + english2013.this.part3 + english2013.this.part4 + english2013.this.part5 + english2013.this.part6 + english2013.this.part7 + english2013.this.part8 + english2013.this.part9 + english2013.this.part10 + english2013.this.part11 + english2013.this.part12 + english2013.this.part13;
                    english2013.this.resultText.setText(String.valueOf(access$200));
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
                    int unused15 = english2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused16 = english2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused17 = english2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused18 = english2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused19 = english2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused20 = english2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused21 = english2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused22 = english2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused23 = english2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused24 = english2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int unused25 = english2013.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                    int unused26 = english2013.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                    int unused27 = english2013.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                    int access$1700 = english2013.this.answered1 + english2013.this.answered2 + english2013.this.answered3 + english2013.this.answered4 + english2013.this.answered5 + english2013.this.answered6 + english2013.this.answered7 + english2013.this.answered8 + english2013.this.answered9 + english2013.this.answered10 + english2013.this.answered11 + english2013.this.answered12 + english2013.this.answered13;
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
                    if (access$200 > english2013.this.highscore) {
                        edit.putInt("eng2013hs", access$200);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$200 * 100) / 120;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - english2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1eng131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1eng132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1eng133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1eng134", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1eng135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1eng136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1eng137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1eng138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1eng139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1eng1310", 0);
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
                        editor.putString("scoreeng131", str);
                        editor.putLong("date1eng131", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreeng132", str2);
                            editor.putLong("date1eng132", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreeng133", str2);
                            editor.putLong("date1eng133", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreeng134", str2);
                            editor.putLong("date1eng134", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreeng135", str2);
                            editor.putLong("date1eng135", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreeng136", str2);
                            editor.putLong("date1eng136", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreeng137", str2);
                            editor.putLong("date1eng137", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreeng138", str2);
                            editor.putLong("date1eng138", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreeng139", str2);
                            editor.putLong("date1eng139", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreeng1310", str2);
                            editor.putLong("date1eng1310", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateeng131", 0);
                    long j12 = defaultSharedPreferences.getLong("dateeng132", 0);
                    long j13 = defaultSharedPreferences.getLong("dateeng133", 0);
                    long j14 = defaultSharedPreferences.getLong("dateeng134", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("dateeng135", 0);
                    long j16 = defaultSharedPreferences.getLong("dateeng136", 0);
                    long j17 = defaultSharedPreferences.getLong("dateeng137", 0);
                    long j18 = defaultSharedPreferences.getLong("dateeng138", 0);
                    long j19 = defaultSharedPreferences.getLong("dateeng139", 0);
                    long j20 = defaultSharedPreferences.getLong("dateeng1310", 0);
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
                        editor2.putString("iScoreeng131", f);
                        editor2.putLong("dateeng131", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreeng132", f);
                            editor2.putLong("dateeng132", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreeng133", f);
                            editor2.putLong("dateeng133", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreeng134", f);
                            editor2.putLong("dateeng134", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreeng135", f);
                            editor2.putLong("dateeng135", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreeng136", f);
                            editor2.putLong("dateeng136", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreeng137", f);
                            editor2.putLong("dateeng137", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreeng138", f);
                            editor2.putLong("dateeng138", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreeng139", f);
                            editor2.putLong("dateeng139", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreeng1310", f);
                            editor2.putLong("dateeng1310", valueOf.longValue());
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
                        english2013.this.scr.setVisibility(8);
                        english2013.this.chr.stop();
                        english2013.this.toolbar.setVisibility(8);
                        english2013.this.Relative.setBackgroundColor(-7829368);
                        english2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(english2013.this.getBaseContext());
                        int unused = english2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = english2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = english2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = english2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = english2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = english2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = english2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = english2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = english2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = english2013.this.part10 = defaultSharedPreferences.getInt("ans10", 0);
                        int unused11 = english2013.this.part11 = defaultSharedPreferences.getInt("ans11", 0);
                        int unused12 = english2013.this.part12 = defaultSharedPreferences.getInt("ans12", 0);
                        int unused13 = english2013.this.part13 = defaultSharedPreferences.getInt("ans13", 0);
                        int unused14 = english2013.this.highscore = defaultSharedPreferences.getInt("eng2013hs", 0);
                        int access$200 = english2013.this.part1 + english2013.this.part2 + english2013.this.part3 + english2013.this.part4 + english2013.this.part5 + english2013.this.part6 + english2013.this.part7 + english2013.this.part8 + english2013.this.part9 + english2013.this.part10 + english2013.this.part11 + english2013.this.part12 + english2013.this.part13;
                        TextView access$1600 = english2013.this.resultText;
                        access$1600.setText(access$200 + "/120");
                        english2013.this.progressbar.setProgress(access$200);
                        english2013.this.progressbar.setMax(120);
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
                        int unused15 = english2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused16 = english2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused17 = english2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused18 = english2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused19 = english2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused20 = english2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused21 = english2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused22 = english2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused23 = english2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused24 = english2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int unused25 = english2013.this.answered11 = defaultSharedPreferences.getInt("answered11", 0);
                        int unused26 = english2013.this.answered12 = defaultSharedPreferences.getInt("answered12", 0);
                        int unused27 = english2013.this.answered13 = defaultSharedPreferences.getInt("answered13", 0);
                        int access$1700 = english2013.this.answered1 + english2013.this.answered2 + english2013.this.answered3 + english2013.this.answered4 + english2013.this.answered5 + english2013.this.answered6 + english2013.this.answered7 + english2013.this.answered8 + english2013.this.answered9 + english2013.this.answered10 + english2013.this.answered11 + english2013.this.answered12 + english2013.this.answered13;
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
                        if (access$200 > english2013.this.highscore) {
                            edit.putInt("eng2013hs", access$200);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - english2013.this.chr.getBase()) / 1000;
                        String str = "dateeng1310";
                        String str2 = "dateeng139";
                        String str3 = "dateeng138";
                        String str4 = "dateeng137";
                        String str5 = "dateeng136";
                        String str6 = "dateeng135";
                        String str7 = "dateeng134";
                        String str8 = "dateeng133";
                        String str9 = "dateeng132";
                        String str10 = "dateeng131";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1eng1310";
                        String str12 = "date1eng139";
                        if (english2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1eng131", 0);
                            String str13 = "date1eng131";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1eng132", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1eng133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1eng134", 0);
                            long j5 = defaultSharedPreferences.getLong("date1eng135", 0);
                            String str16 = "date1eng135";
                            String str17 = "date1eng134";
                            String str18 = "date1eng136";
                            long j6 = defaultSharedPreferences.getLong("date1eng136", 0);
                            long j7 = defaultSharedPreferences.getLong("date1eng137", 0);
                            String str19 = str12;
                            String str20 = "date1eng138";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1eng137";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1eng133";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1eng138", 0));
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
                                editor3.putString("scoreeng131", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreeng132", str25);
                                    editor3.putLong("date1eng132", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreeng133", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreeng134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreeng135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreeng136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreeng137", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreeng138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreeng139", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreeng1310", str25);
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
                                editor4.putString("iScoreeng131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreeng132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreeng133", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreeng134", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreeng135", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreeng136", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreeng137", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreeng138", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreeng139", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreeng1310", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1eng131";
                            String str30 = "date1eng134";
                            String str31 = str12;
                            String str32 = "date1eng133";
                            String str33 = "date1eng137";
                            String str34 = "date1eng136";
                            String str35 = str11;
                            String str36 = "date1eng135";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$200 * 100) / 120;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1700 * access$1700) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1eng132", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1eng132";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1eng138";
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
                                editor2.putString("scoreeng131", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreeng132", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreeng133", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreeng134", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreeng135", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreeng136", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreeng137", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreeng138", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreeng139", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreeng1310", str49);
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
                                editor.putString("iScoreeng131", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreeng132", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreeng133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreeng134", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreeng135", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreeng136", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreeng137", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreeng138", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreeng139", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreeng1310", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        english2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2013.this.scr.setVisibility(8);
                english2013.this.chr.stop();
                english2013.this.toolbar.setVisibility(8);
                english2013.this.Relative.setBackgroundColor(english2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                english2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                english2013.this.scr.setVisibility(0);
                english2013.this.toolbar.setVisibility(0);
                english2013.this.telegram_layout.setVisibility(8);
                english2013.this.chr.start();
                english2013.this.Relative.setBackgroundColor(english2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = english2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = english2013.this.mInterstitialAd = null;
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
                english2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
