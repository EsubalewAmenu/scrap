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

public class civics2009 extends AppCompatActivity {
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
    private Boolean f507b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2009;
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
    private Toolbar f508tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2009);
        this.f507b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is a basic characteristic of a limited government? ", 0, 0, 0, 0, 0, "The government limits the power of the people.", "The state structure institutes checks and balances.", "The president can exercise arbitrary authority. ", "The parliament will monopolize state authority. ", "The basic characteristics of the limited government are that the state structure institutes checks and balances. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("2.", "What is the best mechanism to develop the habit of saving? ", 0, 0, 0, 0, 0, "consume one's income at once me. ", "maximize extravagant purchase.", "limit interest to one's income. ", "spend more money than one earns. ", "The best mechanism, to develop the habits of saving is limiting interest to the level of income. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("3.", "Which of the following is correct about the Ethiopian constitution and other laws? ", 0, 0, 0, 0, 0, "Ordinary laws have equal authority to the Constitution.", "Both of them follow similar laws.", "The Constitution is the will of the people’s representatives.", "The Constitution formulates general principles and policies ", "The difference between the Ethiopian constitutions and other laws is that the constitution is formulates the general principles and poultices whereas the other laws are very specific. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("4.", "Which of the following is essential in fulfilling one’s duties? ", 0, 0, 0, 0, 0, "Avoiding responsibility for fear of failure. ", "Evading sacrifice for the collective good. ", "Readiness to die in defense of one's country. ", "Strength to give priority to one’s self-interests ", "One of the fulfilling one’s duties are readiness to die in defense of One country.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("5.", "The right not to be discriminated because of one's age, race, sex, ability, political view or any other status is termed as, ", 0, 0, 0, 0, 0, "unity ", "freedom ", "diversity ", "equality", "The right of equality is the right not to be discriminated because of one's age, race, sex, ability, political view or any other status. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("6.", "The right to liberty is an example of ", 0, 0, 0, 0, 0, "human rights ", "political rights. ", "economic rights ", "democratic rights", "The right to liberty is an example of human rights. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("7.", "Which of the following is a democratic right? ", 0, 0, 0, 0, 0, "The right of a person accused.", "The right of persons arrested. ", "The right to elect and be elected. ", "The right to the security of a person. ", "The Ethiopian Constitution has details of human. and democratic rights that citizens enjoy the democratic rights 'are the rights of Freedom of Association; Freedom of Movement; Rights of Nationality.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("8.", "According to FDRE Constitution, regional states ", 0, 0, 0, 0, 0, "Have the power to sign international treaties. ", "Recruit and manage their own defense forcer ", "Have their own respective flag and constitution.", "Have the power to construct inter- country railways. ", "According to the EFDRE Constitution regional states have the rights to have their own respective flags and constitutions. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("9.", "Which of the following means of managing conflicts requires filling cases in the court of law? ", 0, 0, 0, 0, 0, "Negotiation ", "Arbitration", "Mediation ", "Litigation ", "Litigation: A process or means of managing conflicts requiring filling cases in the court of law. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("10.", "There are associations that embrace a group of people who devote their free time to help others without making profit and getting monetary compensation. What do we call them? ", 0, 0, 0, 0, 0, "Charity organizations ", "Development agencies. ", "Voluntary organizations.", "Humanitarian institutions.", "Voluntarism or voluntary organizations is contributing one's time or talent for educational, social, charitable and other purposes, freely without expectation of compensation. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("11.", "Which of the following is true about voluntary organizations? ", 0, 0, 0, 0, 0, "They are organized by a group of persons having common interests. ", "They are established through the initiatives of government agencies. ", "They do not receive funds from donor agencies to run their activities. ", "They generate a moderate amount of profit from the services they provide. ", "Voluntary organization, are organized and provided on an individual basis, basis, in most cases people with similar purposes form or join voluntary organizations to achieve common goals. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("12.", "Which of the following is an international organization that gives loans and grants to national governments? ", 0, 0, 0, 0, 0, "World Trade Organization ", "International Monitory Fund. ", "United Nations Security Council. ", "International Labor organization. ", "IMF (international monetary fund) is an international organization that gives loans and grants to national governments. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("13.", "Which one of the following traits put at risk the proper functioning of the judiciary system of a nation? ", 0, 0, 0, 0, 0, "Independence of judiciary. ", "Non- partisanship of judiciary ", "Stereotype in the judiciary. ", "Objectivity in the judiciary ", "Stereotyping is a combination of factual and fictional beliefs about a certain group is one of the factors that puts at risk the proper functioning of the judiciary system. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("14.", "Which one of the following is a correct match regarding attributes of self- reliance? ", 0, 0, 0, 0, 0, "Self – confidence ---- a drive to satisfy one's own needs by claiming bigger share from available resources. ", "Self – awareness ---- a moderate view towards one's strengths and weakness that promotes knowledge of the true self. ", "Assertiveness ---- are aggressive behavior through which one expresses presence, confidence and power to secure recognition.", "Independence ----- a free and prosperous life achieved through disconnecting oneself from social bond that can result in helping others.", "Self-awareness means recognition of our abilities, strength and weaknesses. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("15.", "Which one of the following personal practices contribute for improving the habit of saving. Which one is it? ", 0, 0, 0, 0, 0, "Engaging in impulsive purchase if it is within one's own means. ", "Purchasing low const and low-quality foods and services for personal use. ", "Avoiding spending on some of the basic needs which do not have immediate lethal consequence. ", "Avoiding extravagance and spending one's income on goods and services which are really necessary. ", "One of the personal practices that contribute from improving the habits of saving is avoiding extravagance and spending one's income on goods and service which are really necessary. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("16.", "Which one of the following is correct match about ways of running democratic system and example of countries that implement the specified system? ", 0, 0, 0, 0, 0, "Hybrid Democracy------ France. ", "Presidential Democracy --------- Britain ", "Parliamentary Democracy------- USA ", "Triangular Democracy---------- USA", "Democratic system runs in three ways – Parliamentary, presidential and Combined Parliamentary and Presidential democracy. Britain is a good example of parliamentary democracy: the United States of America is a good example of a Presidential Democracy and France exemplifies the hybrid system of democracy. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("17.", "The Principle of the due process of law that provides for the accused persons a right to petition to the court to order their physical release where the arresting law enforcer fails to bring them before a court within the prescribed time is; ", 0, 0, 0, 0, 0, "Right to appeal ", "Habeas corpus ", "Presumption of innocence. ", "Protection against double jeopardy ", "Habeas corpus is remedy that is available to a person who is al-Tested and not brought before a court of law within the prescribed time. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("18.", "A policy designed to remedy past discrimination against women, the disabled, and minorities is termed as: ", 0, 0, 0, 0, 0, "Civil right movement ", "Reverse discrimination.", "Affirmative action ", "Zero tolerance. ", "Affirmative action is positive actions taken to address socially disfavored groups in order to compensate past injustices.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("19.", "Which one of the following is the famous leader of civil rights movement in the USA in 1950's and 1960's? ", 0, 0, 0, 0, 0, "Rosa Parks. ", "Martin Luther King Junior.", "John F. Kennedy. ", "Charlotte Gilman, ", "Dr, Martin. Luther King was one of the prominent leaders of civil right movement in Africa 1950s and 1960s. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("20.", "An ethical consideration in decision making which argues that the outcome of any decision should result in pleasure to the greatest number of people affected by the decision is: ", 0, 0, 0, 0, 0, "Rights approach ", "Utilitarianism ", "Ethical relativism ", "Majoritarianism. ", "Ethical relativism is an ethical consideration in decision making which argue that the outcome of any decision should result in pleasure to greatest number of people affected by the decision.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("21.", "The separation of state and religion makes the Ethiopian state a, ", 0, 0, 0, 0, 0, "Federal State ", "Democratic State ", "Republican State ", "Secular State ", "The separation of state and religion makes the Ethiopian state a secular state. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("22.", "Which of the following is required for fair working of the court? ", 0, 0, 0, 0, 0, "Prejudice", "Objectivity", "Partisanship", "Stereotype ", "Objectivity is required for fair working of court. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("23.", "Which of the following helps us to distinguish true history from a distorted one? Reading, ", 0, 0, 0, 0, 0, "historical accounts by different writers. ", "materials based on historical fabrications, ", "books that tends to exaggerate fats. ", "piece of writing with biased interpretation.", "Historical account by different writers help us to distinguish true history from a distorted one. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("24.", "Concerning issues of development which of the following is correct?", 0, 0, 0, 0, 0, "Infant mortality rate is high in developed nations. ", "High rate of literacy is an indicator of poverty. ", "People earning more money tend to live longer ", "One US dollar a day is enough for good education, ", "One of the indicators of development ids the level of income and life expectancy because as the income of peoples increase, they live longer. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("25.", "Which the following is a moral obligation? ", 0, 0, 0, 0, 0, "Sitting a bus while visually- impaired persons are standings ", "Failure to learn the norms of a new society one begins to live in. ", "Treatment of small groups of people as inferior to another group. ", "Readiness to support elderly people in the community voluntarily. ", "Moral obligations are the obligations individuals have related to the moral requirements of a society for example readiness to support elderly people in the community voluntarily. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("26.", "Responsibility for protection of the environment includes, ", 0, 0, 0, 0, 0, "elimination of dangerous wild animals like hyena, ", "replacement of old monuments by a new one. ", "reservation of cultural heritages for eco-tourism, ", "clearance of the forest for large- scale urbanization. ", "Responsibility for protection of environment of the environment includes reservation of the cultural heritages for eco-tourism. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("27.", "Which one of the following is among the many benefits of self - awareness? ", 0, 0, 0, 0, 0, "Readiness to be influenced by others. ", "Recognition of strengths and weaknesses. ", "Ability to develop a superiority attitude. ", "Given excuses to noticeable Weaknesses. ", "One of the benefits of Self-awareness is recognition of our abilities, strengths and weaknesses. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("28.", "Which of the following best explains new thinking in saving? ", 0, 0, 0, 0, 0, "Sending money on expensive imported products. ", "Wastage of inputs to reduce cost of production. ", "Avoidance of cheap locally manufactured goods, ", "Felling proud of buying locally produced items. ", "The best way of new thinking in saving is feeling proud of buying locally produced items because the locally produced items are often cheaper and of just as good quality.", "d", 0, 1, this.f507b));
        arrayList.add(new questions("29.", "Which of the following is correct about active civic participation? ", 0, 0, 0, 0, 0, "Compulsory activity to all citizens. ", "Performed outside of the Constitution. ", "Done to attain specific political objectives. ", "Essential to enhance social development. ", "In a democracy, citizens have the right to actively participate to make their own life better. Thus, as a citizen, you have the right to debate on public issues so as to influence government policy makers which Answer essential to enhance social development.", "d", 0, 1, this.f507b));
        arrayList.add(new questions("30.", "Which of the following is correct about power and authority of government?", 0, 0, 0, 0, 0, "Legitimate governments lack authority.", "Illegitimate governments can have constitution. ", "Legitimate governments treat the people as subjects", "Illegitimate governments respect rule of law. ", "Regarding about the power and authority of the government both the legitimate illegitimate government have the constitution but the illegitimate have no moral authority and do not respect the constitution.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("31.", "Which of the following is correct about external relations of countries?", 0, 0, 0, 0, 0, "Foreign relations between countries started in the 19th century, ", "Diplomatic mission is to execute foreign policy, ", "Governmental organizations play no role in foreign policy. ", "External relations are conducted on the basis of arbitral rules. ", "Foreign relations are mainly referred to the external relations of countries, when such relations involve countries, it gives rise to what is called international relations. It involves countries on the one hand and non-governmental organizations on the other. The diplomatic mission is the instrument to execute foreign policy. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("32.", "The correct statement about the struggle against corruption is that, ", 0, 0, 0, 0, 0, "registration of property is a major curative approach.", "investigation of corruption is a preventive approach. ", "mass media has direct role in preventing corruption. ", "citizens are both perpetrators and victims of corruption. ", "Corruption is the abuse of public office for private gain. The struggle against corruption awareness creation by using mass media has the role in prevention of corruption. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("33.", "Which of the following is correct about affirmative action? It, ", 0, 0, 0, 0, 0, "aims at making women economically dominant ", "may lead to the occurrence of reverse discrimination: ", "is practiced in underdeveloped third world nations. ", "punishes men for committing injustice against women. ", "Affirmative Action is positive actions taken to address socially disfavored groups in order to compensate past injustices or to reverse past discrimination. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("34.", "To bring mutual benefits for Ethiopia, Egypt and Sudan concerning the Nile, ", 0, 0, 0, 0, 0, "the colonial agreements should be kept intact. ", "Ethiopia should strive to stop the flow of Nile. ", "Egypt should help afforestation in Ethiopia, ", "Sudan should follow the decision of Egypt.", "To bring mutual benefits for Ethiopia, Egypt and Sudan concerning the Nile Egypt and Sudan should help afforestation on Ethiopia. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("35.", "Which of the following is correct about resources needed by human beings? ", 0, 0, 0, 0, 0, "Land needed for food production is reduced by Desertification. ", "The resources needed to satisfy human needs are found abundantly. ", "The environment cannot be saved with proper utilization of resources. ", "The existing resources satisfy the unlimited needs of human beings. ", "The natural resources are very scarce compared to the need of the human beings so if the environment is or the land is production is reduced by the desertification. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("36.", "Which of the following is correct about the media in a democratic system? ", 0, 0, 0, 0, 0, "Media plays a role in escalating or deescalating conflict and war. ", "Freedom of the press practically means writing what one pleases. ", "Writing to damage the reputation or honor of individuals is legal. ", "Legal limitations are clearly laid to protect the interest of the youth. ", "In any system whether democratic or undemocratic the media ply both the positive and negative role in escalating and deescalating conflicts and wars. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("37.", "Which one of the following countries is a good example of a constitutional monarchy and parliamentary democracy? ", 0, 0, 0, 0, 0, "The United Kingdom ", "The Republic of China ", "The Republic of Sudan", "The United States of America ", "A good example of the constitution monarchy and parliamentary democracy is that the United Kingdom or Britain. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("38.", "Which of the following is correct about the federal system in Ethiopia? ", 0, 0, 0, 0, 0, "The federal government devolves power to regional states.", "The federal and all regional states have a bicameral parliamentary system. ", "The federal government has the power to develop policies for regional states. ", "Regional states have supreme power on all matters in their respective regions. ", "Federalism is a system of government where power is divided between federal and regional governments. Devolution, the principle of federalism, means to transfer power to the regions that constitute the federation. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("39.", "The United State of America follows the system of presidential democracy. Which of the following is among the powers of the president of the United States? ", 0, 0, 0, 0, 0, "Formulating and approving laws. ", "Approving the nomination of judges. ", "Setting the annual government budget. ", "Interpreting constitutional and ordinary laws, ", "The United States of America is a good example of a Presidential Democracy, The President has the power to set the annual budget but this must be approved by the Parliament. He also has the right to nominate judges who need to be approved by Parliament. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("40.", "Which of the following is true about the rule of law? ", 0, 0, 0, 0, 0, "The rule of law can prevail in countries ruled by dictatorial regimes. ", "Every citizen, except high government officials, is subject to the law. ", "The rule of law prohibits government officials from making arbitrary. ", "The existence of a democratic constitution indicates the prevalence of the rule of law.", "The rule of law is that the exercise of powers shall be regulated by law and that any individual or group shall not be exposed to the arbitrary will of another.", "d", 0, 1, this.f507b));
        arrayList.add(new questions("41.", "Representation in the house of the federation is mainly determined by the ", 0, 0, 0, 0, 0, "population number of each ethnic group. ", "historical background of every ethnic group. ", "geographical extent of each regional state. ", "armed struggle carried out by ethnic groups. ", "The representation in the house of the Federation determined by the population number of each ethnic group. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("42.", "Which of the following is the best way of fighting against corruption? ", 0, 0, 0, 0, 0, "Leaving the issue to government bodies such as the Ethics and Anti-Corruption Commission. ", "Mobilizing the public and other stakeholders to have active and full participation in combating corruption. ", "Fighting corruption particularly focusing on low and middle levels of government bureaucracy. ", "Waiting for more legal provisions and government instructions to launch an anti -corruption campaign. ", "Corruption is the abuse of public office for private gain. The fighting against corruption needs the mobilization of the public and other stake holder to have the active and full participation in combating and prevention of corruption. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("43.", "\"Protection against double jeopardy\" is one of the principles of due process of law, which of the following is the purpose of this principle? ", 0, 0, 0, 0, 0, "Ensuring equal accessibility of courts to defendants from different religious and racial backgrounds. ", "Upholding the right of an accused person to quick public trial under normal circumstances. ", "Protecting the right of the defendant to be represented by a council having legal knowledge. ", "Safeguarding an accused person from being charged and convicted again for the same criminal offence. ", "Double jeopardy is right of a defendant not to be charged and convicted twice with the same offence. So, protection against Double jeopardy is safeguarding an accused person from being charged and convicted again for the same crime offence. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("44.", "The FDRE Constitution recognizes the existence of formal courts, traditional courts and religious courts. Which of the following is true about the rights of traditional courts according to the FDRE Constitution? ", 0, 0, 0, 0, 0, "Resolving homicide cases.", "Hearing criminal offence cases.", "Setting family and marriage cases. ", "Addressing Sexual violence cases. ", "The EFDR constitution recognizes the existence of formal courts traditional court and religious courts, traditional courts and religious Courts have the rights to setting family and marriage cases. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("45.", "Which of the following is the best of addressing the equality of disabled groups? ", 0, 0, 0, 0, 0, "Gathering disabled people around churches and mosques so that they could get aims. ", "Enhancing the awareness of community members to give especial attention to disabled groups. ", "Giving continuous financial support to the disabled as they cannot be involved in productive activities. ", "Constructing separate camps for the disabled so that they could lead their lives in isolation. ", "One of the best ways to addressing the equality of disabled group is enhancing the awareness of the community members to give special attention to them. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("46.", "Which of the following is true about the justice system in the current Ethiopia? ", 0, 0, 0, 0, 0, "The Prime Minster has the power to appoint judges to the Federal courts. ", "The House of people's Representatives appoints the judges of the Federal courts. ", "The FDRE President has the power to recommend judges to the Federal courts. ", "The prime minister is not involved in nominating judges to the Federal courts. ", "The House of Peoples' representatives appoint judges to the Federal Courts after being recommended by the Prime Minister.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("47.", "Each profession has its own code of ethics. Which of the following contradicts the code of ethics in the teaching profession? ", 0, 0, 0, 0, 0, "Fostering civic virtues such as integrity and respect for the law. ", "Presenting facts without distortion, personal bias and prejudice. ", "Unfairness in assessing students' performance. ", "Addressing student problems based on school policies and regulations. ", "Professional Work skills are important to try to improve your professional skills. improving professional skills is beneficial both personally and for the work place. So, teacher has avoided unfairness in assessing students' performance. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("48.", "Which of the following contradicts the genuine way getting job satisfaction? ", 0, 0, 0, 0, 0, "The person's curiosity and enthusiasm in the work. ", "Suitable working environment and good team spirit. ", "Using public resources to accumulate personal asset. ", "Financial rewards, promotion and career development ", "The professional. satisfaction that comes after completing the job and seeing the results. A medical doctor, for example, experiences job satisfaction when she or he treats a patient and when the patients they treat are cured. This is true of any job. A farmer is satisfied when he or she finally collects the crops. A businessman is satisfied when his business is able to grow. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("49.", "Which of the following is a less important factor for the development of a country? ", 0, 0, 0, 0, 0, "Good policies and strategies. ", "Technological advancement. ", "Hard working and skilled citizens. ", "The territorial extent of the country. ", "Factors that important for the development of the country includes good policies and strategies; technological advancement and hardworking and skilled citizens. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("50.", "Which of the following is among the attributes of self- reliant persons? ", 0, 0, 0, 0, 0, "They do not receive support from their friends and relatives. ", "They have all kinds of abilities and skills to achieve their goals. ", "They share many characteristics of passive and isolated persons. ", "They have determination to earn their living from their own effort. ", "Self-reliant people have good self-awareness. Know their good qualities and weaknesses. Have their own views; devote their time and energy to earn their living from their own efforts and plan for their future, have self-confidence and make good decisions about their lives as well as the lives of others. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("51.", "Which of the following is correct about self- reliance? ", 0, 0, 0, 0, 0, "Self-awareness and passive behavior are important to develop self-reliance. ", "Manifesting an aggressive behavior is important to become a self-reliant person. ", "Self- confidence and assertiveness are among the attributes of a self-reliant person. ", "Self-reliant persons have a tendency of invading the personal boundaries of others. ", "Self-reliance is the ability, commitment, and effort to provide the spiritual and temporal necessities of life for self and family, so self-confidence and assertiveness are among the attributes of a self-reliant person.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("52.", "Which of the following is the best approach to use our money wisely in the process of purchasing goods? ", 0, 0, 0, 0, 0, "Concentrating on high quality goods imported from Europe. ", "Considering our budget, the quality and price of the goods. ", "Choosing cheap imported goods regardless of their quality. ", "Choosing high quality and fashionable goods as much as we can. ", "The best approach to use our money wisely in the process of purchasing goods are considering our budget the quality and prices of the goods. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("53.", "Which of the following leadership styles is important to enhance active community participation? ", 0, 0, 0, 0, 0, "Using threats and coercive methods to get things done. ", "Inspiring and motivating others to work for the common good. ", "Making followers free to act according to their wishes and interest.", "Imposing a lot of responsibilities and workloads on certain individuals ", "Transformational leadership encourage followers to view problems from new perspectives, provide support and encouragement Communicates a vision, stimulates emotion and identification to work for a common goal. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("54.", "Which one of the following experiences is the best example of region constitutions in FDRE in meeting the specific circumstances of their own regions? ", 0, 0, 0, 0, 0, "The establishment of Dire Dawa as City Administration council ", "The Council of elders established by the Somali national region state constitutions ", "The formation of council of nations, nationalities and peoples by SNNPRS constitution. ", "The formation of sub- city administration structure by the Addis Ababa regional state constitution. ", "The regional constitution of the formation of the council of nations, nationalities and peoples by the SNNPRS state is the best example of regional constitutions in the FDRE in meeting specific circumstance of their own regions. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("55.", "Which one of the following is correct about courts of justice in Ethiopia? ", 0, 0, 0, 0, 0, "They are law making oranges of government. ", "They are the only place where disagreements among people can be presented and resolved. ", "The FDRE constitution provides Chat members of house of peoples' Representatives cannot be judged in the courts. ", "The FDRE constitution provides that courts of any level shall be free from any interference of any government body. ", "According to FDRE Constitution, Article 78, states: that Courts of any level shall be free from any interference of influence of any governmental body, government official or from any other source and Judges shall exercise their functions in full independence and shall be directed solely by the law. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("56.", "Which one of the following statements best characterize traditional patriotism? ", 0, 0, 0, 0, 0, "Respecting and defending the national constitution. ", "Promoting the development of democracy in one's society. ", "Love and sacrifice for the territorial integrity of one's country. ", "Contributing what is expected and possible for the public interest. ", "The traditional patriotism is characterized by love and sacrifice of the C territorial integrity of the one's country. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("57.", "Of the following statements one is correct about promise. Which one is it? ", 0, 0, 0, 0, 0, "Keeping or breaking one's promise has a consequence. ", "Promises are frequently kept and broken by poor people. ", "The immediate effect of breaking promise is far worse than its long-term consequence. ", "It is natural for politicians to break promises made during the election campaign after taking office. ", "Promise is a declaration that something will or will not be done, given, etc., the immediate effect of the breaking promise is far worse than its long-term consequence.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("58.", "Which one of the following can be the most preferred national policy option for countries like Ethiopia to minimize the negative effect of dependency on developed nations? ", 0, 0, 0, 0, 0, "Forcibly taking over foreign- owned companies by the state. ", "Pursuing a policy of zero national debt payable to developed countries and international financial organizations.", "Promoting growth and competence of domestic manufacturing industries through various incentives and subsides. ", "Levying heavy tax on all goods imported from countries which are not purchasing proportional amount of export goods. ", "The most policy option for countries like Ethiopia to minimize the negative effect of dependency on developed nations is to promoting growth and competency of the domestic manufacturing. industries through various incentives and subsidies.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("59.", "Which one of the following is important characteristics for effective civic participation? ", 0, 0, 0, 0, 0, "Commitment and dedication. ", "Competition and profit orientation. ", "Focus on individual talent and competence. ", "Home base political organization and political agenda. ", "The characteristics of effective civic participations are commitment and dedications.", "a", 0, 1, this.f507b));
        arrayList.add(new questions("60.", "Which one of the following is correct about myth? ", 0, 0, 0, 0, 0, "All traditional knowledge is myth. ", "There are certain truths even in myth. ", "Myths can be important thoughts in certain circumstances. ", "Myth can be knowledge if it is generally accepted by a certain community", "A myth is any traditional story consisting of events that are ostensibly historical, explaining the origins of a cultural practice or natural phenomenon. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("61.", "Which one of the following is the major source of legitimate power and authority? ", 0, 0, 0, 0, 0, "A mandate to govern received from the people. ", "A written constitution with articles on human and democratic rights.", "A presidential democracy which allows people to directly elect the head of the state and government ", "The existence of judiciary organ of government that establishes limit on the power of government. ", "The major source of power and authority in the democratic constitution. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("62.", "Which one of the following is correct about diplomacy? ", 0, 0, 0, 0, 0, "Ethiopia had embassies and diplomatic missions in foreign countries for thousands of years. ", "Unlike foreign relations, diplomacy does not apply for non- governmental organizations like UN and AU.", "Among the functions of the diplomacy, conveying and gathering information relevant to a country are the basic. ", "As diplomacy is practiced art of representation of sovereign states, it would be more effective if famous artists are assigned as diplomats. ", "Diplomacy is the art and practice of conducting negotiations between representatives of states. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("63.", "Which one of the following is correct about federalism? ", 0, 0, 0, 0, 0, "Federalism is a form of government with dual polity or two-tier government system. ", "In federalism the powers given to the federal governments are more prestigious than for the federal units. ", "In federalism final and binding decisions in all matters of the people can be made by the federal state. ", "Federalism as a form of government commonly experienced a tendency towards separation than harmony. ", "Federalism is the mixed or compound mode of government, combining a general government with regional governments in a single political system. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("64.", "Which one of the following is correct about Ethiopian history in an international perspective? ", 0, 0, 0, 0, 0, "Ethiopia was the only independent African country who was member of League of Nations. ", "The only African leader who joined Emperor Haile Selassie I and formed OAU in 1963 was Sekou Touré of Guinea.", "Ethiopia is the only African country which successfully defended its independence by defeating the Italian colonial power at the Battle of Adwa. ", "Ethiopia's contribution to global peace through sending peace keeping forces to different countries starts with its membership of league of Nations. ", "Ethiopian history in international perspective is that Ethiopia's is the only African country which successfully defend its independence by defeating Italian at the baffle of Adwa in 1896. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("65.", "Which one of the following is the most appropriate reason that demands promoting international cooperation and understanding currently? ", 0, 0, 0, 0, 0, "The ownership of nuclear arsenal by many less responsible countries of the world. ", "The increasing strength and dominance of UN as compared to its member states sovereignty.", "The threats posed by environmental crises and the need for global concerted interventions. ", "Lack of professional and capable national military force in many of the developing countries of the world to keep peace. ", "The most appropriate reason reasons that demands promoting international cooperation and understanding currently is the threat posed by environmental crises and terrorism needs concerted interventions. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("66.", "Which one of the following is correct statement regarding job satisfaction? ", 0, 0, 0, 0, 0, "Irrespective of payment, engagement in the job of one's interest can result in job satisfaction. ", "Irrespective of the type of job, jobs with high financial rewards can result in job satisfaction. ", "Job satisfaction can better be achieved in jobs that can be performed by a group than individual jobs. ", "Job satisfaction is one of the gains that workers expect to get from engaging in certain job. ", "People engaged in all walks of life are satisfied when they are able to successfully complete the tasks assigned to them. In order to have job satisfaction there are a few things to take into consideration. \n-\tAnswer interest in the work\n-\tThe financial reward. \n-\tThe level of social interaction. \n", "d", 0, 1, this.f507b));
        arrayList.add(new questions("67.", "Which one of the following is different from others? ", 0, 0, 0, 0, 0, "Alfred the Great ", "Abraham Lincoln ", "Otto Von Bismarck ", "Alexander Graham Bell ", "Alfred the Great, Abraham Lincoln and Otto Von Bismarck are the political leader whereas Alexander Graham is a scientist. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("68.", "Which one of the following is correct about macroeconomics? ", 0, 0, 0, 0, 0, "It studies the behavior of consumers and producers. ", "It is more important in economic studies than microeconomics. ", "It analyses the economic welfare of a particular group of people. ", "It is an approach to analyze the growth performance of a country. ", "macroeconomics is a branch of economics dealing with the performance, structure, behavior, and decision-making of an economy as a whole. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("69.", "Which one of the following is correct about information and knowledge? ", 0, 0, 0, 0, 0, "Knowledge is information in the form facts. ", "Information is acquired while knowledge is obtained. ", "Information is obtained while knowledge is acquired. ", "Statistics on grades of students used as data for research is knowledge. ", "When the facts obtained are systematically presented in a given context it is known as information and Knowledge refers to the relevant and objective information gained through experience. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("70.", "In democratic societies, respect for the rights of the minorities can be guaranteed best by: ", 0, 0, 0, 0, 0, "The goodwill of the majority groups.", "The constitution and institutions of the country. ", "Parties that are established by the minority groups. ", "The influence of international human rights groups. ", "In democratic societies respect for the rights of the minorities can be guaranteed best by the constitutions of the country. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("71.", "Which of the following is correct about the Federal and Regional Constitutions of Ethiopia? ", 0, 0, 0, 0, 0, "Both the Federal and the Regional Constitutions are the same. ", "The Regional Constitutions in general are the same in content. ", "The Federal Constitution does not work in all of the Regions. ", "The Federal and the Regional Constitutions promote democracy. ", "The federal and regional constitutions of Ethiopia promote the democratic system in the country. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("72.", "A major consequence of dependency of poor nations on outside support is the ", 0, 0, 0, 0, 0, "opportunity to export manufactured goods. ", "limitation of self- sustained economic growth.", "Promotion of traditional and domestic industry. ", "reduction in the importation of luxury items. ", "The major consequence of the dependency of the poor nations on outside support is the limitation of self-sustained economic growth. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("73.", "The author of the Declaration of Independence of the USA was, ", 0, 0, 0, 0, 0, "Abraham Lincoln ", "Franklin Roosevelt ", "George Washington ", "Thomas Jefferson ", "The Declaration of Independence is the statement adopted by the Second Continental Congress meeting at the Pennsylvania State House (Independence Hall) in Philadelphia on July 4, 1776, which announced that the thirteen American colonies. John Adams persuaded the committee, to select Thomas Jefferson to compose the original draft of the document, which Congress would edit to produce the final version. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("74.", "According to the 1995 Constitution the foreign policy objectives of Ethiopia include, ", 0, 0, 0, 0, 0, "unilateral utilization of cross- border rivers of Ethiopia. ", "economic diplomacy to discourage foreign investment. ", "non- interference in the internal affairs of other states. ", "attainment of economic dominance on neighborly states. ", "According to the 1995 Constitution of Ethiopia Article 86 has clearly stated the country's foreign policy objectives and principles as follow. \n-\tTo promote policies of foreign relations based on the protection of national interests and respect for the sovereignty 'of the country. \n-\tTo promote mutual respect for national sovereignty and equality of states and non-interference in the internal affairs of other states. \n-\tTo ensure that the foreign relation policies of the country are based on mutual interests and equality of states as well as those international agreements promote the interests of Ethiopia, \n-\tTo observe international agreements which ensure respect for Ethiopia's sovereignty and are not contrary to the interests of its Peoples, \n-\tTo forge and promote ever growing economic union and fraternal relations of Peoples with Ethiopia’s neighbors and other African countries, \n-\tTo seek and support peaceful solutions to international disputes. \n", "c", 0, 1, this.f507b));
        arrayList.add(new questions("75.", "The tendency of considering the culture of other people inferior is known as, ", 0, 0, 0, 0, 0, "Cultural Relativism ", "Ethno- centrism ", "Afro — centrism ", "Cultural Activism ", "Ethnocentrism is judging another culture solely by the values and standards of one's own culture. Ethnocentric individuals judge other groups relative to their own ethnic group or culture, especially with concern for language, behavior, customs, and religion.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("76.", "From African historical perspective, Ethiopia is the only country to, ", 0, 0, 0, 0, 0, "successfully repulse a European colonial power. ", "represent the continent in the league of Nations. ", "Participate in the establishment of United Nations. ", "house diverse ethnic and religious communities. ", "From African and international perspective Ethiopia is the only African country to successfully repulse a European colonial power. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("77.", "The feminist Charlotte Gilman argued that, ", 0, 0, 0, 0, 0, "sexism helps women to be economically independent citizens. ", "women are more productive in rearing children at home. ", "children should go to day-care centers for mothers to work. ", "financial dependence of women men is a natural phenomenon. ", "Charlotte Perkins Gilman also -Charlotte Perkins. Stetson (July 3, 1860 August 17, 1935), was a prominent American feminist, sociologist, novelist, writer of short stories poetry, and nonfiction, and a lecturer for social reform, she was a utopian feminist and served as a role model for future generations of feminists because of her unorthodox concepts and lifestyle. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("78.", "One way of tackling the negative impact of globalization in Ethiopia is to ", 0, 0, 0, 0, 0, "remain exporters of agricultural products. ", "depend on cheaper imported commodities. ", "devise policy to drive out domestic industries. ", "aspire self- sufficiency in the basic necessities. ", "Some of the negative impacts include: Globalization operates mostly in the interests of the richest countries, \n-\tThere are no guarantees that the wealth from inward investment will benefit the local community. \n-\tAn absence of strictly enforced international laws means they may pollute the environment, run risks with safety or impose poor working conditions and low wages on local workers. \n-\tIndustry may begin to thrive in LEDCs at the expense of jobs in manufacturing in the UK and other MEDCs, especially in textiles. \n", "a", 0, 1, this.f507b));
        arrayList.add(new questions("79.", "Which of the following best explains the current economic policy of Ethiopia? ", 0, 0, 0, 0, 0, "permanent dependence on agriculture and importation of industrial products. ", "Export - led growth in order to get earnings to import essential commodities. ", "Discouragement of direct foreign investment to enhance domestic industry. ", "Rapid industrialization to comate with the developed nations of the world. ", "Based on the new 'economic policy, the government formulated a long-term economic development strategy Agriculture-Led-Industrialization (ADLI) which is geared towards the transformation of the backward economic structure. It is a two-pronged strategy, incorporating on one side the external sector (export-led part) and on the other the internal Sector which shows the forward and the backward-linkages between agriculture and industry. In the connection, \n-\tagriculture will supply commodities for exports, domestic food supply and industrial output; and \n-\texpand market for domestic manufactures. The mining sector is expected to give an impetus to the development of the export sector. \n", "d", 0, 1, this.f507b));
        arrayList.add(new questions("80.", "To promote public participation good leaders need to have personal qualities of being ", 0, 0, 0, 0, 0, "domineering ", "aggressive ", "engaging ", "rigid ", "To promote the public participation good leaders needs to have personal qualities of being engaging. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("81.", "Which of the following is INCORRECT about the relationship between Ethiopia and the League of Nations? ", 0, 0, 0, 0, 0, "Ethiopia is one of the first African countries to become a member of the League. ", "Emperor Haile Selassie requested the League to protect Ethiopia from the Italian invasion. ", "The League failed to support Ethiopia in its effort to fight against the Italian invasion. ", "Ethiopia's membership to the League continued after it was invaded by Fascist Italy. ", "Ethiopia is the only Africa country that becomes the member of the LNs, During the Italian Invasion the LNs failed to protect Ethiopian from the invasion of Italian.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("82.", "Ethiopia is multi- ethnic and multi- cultural country. The FDRE Constitution upholds the equality of all nations, nationalities and peoples living in the country. Which of the following is the best manifestation of this equality? ", 0, 0, 0, 0, 0, "Nations, nationalities and peoples of Ethiopia have equal number of representatives in the House of peoples Representatives. ", "Nations, nationalities and peoples have constitutional rights to protect, advance and promote their cultures. ", "Nations, nationalities and peoples have an equal number of representatives in the house of the federation. ", "nations, nationalities and peoples are responsible to use Amharic as a language of schools, courts, and public offices. ", "Ethiopia is a multicultural and multi ethnic country with over eighty ethnic groups inhabiting its territories. Today they are classified as nations, nationalities and peoples. They have constitutionally protected rights of equality. All, of them, have equal rights to protect, advance and promote the development of their cultural distinctions. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("83.", "“I disapprove of what you say, but I will defend to death your rights to speak.\" ", 0, 0, 0, 0, 0, "Persons have the right to express their views when their views are right and acceptable. ", "Individuals are responsible to accept the views of others as people right to express their views. ", "It is important to defend other person's right to express their views when they as the right thing. ", "We need to protect the rights of persons to express their opinion though we do not support their views. ", "Disapprove of what you say, but I Will Defend to the Death Your Right to say It means we need to Protect the rights of person to express their opinion though we do not support their views. ", "c", 0, 1, this.f507b));
        arrayList.add(new questions("84.", "Ethiopia is one of the African countries that achieved some of the Millennium development Goals, what was the area of Ethiopia's achievement? ", 0, 0, 0, 0, 0, "Reducing child mortality and improving material health. ", "Eradicating poverty and hunger from urban and rural areas.", "Slaking cities and human settlements inclusive, safe and Sustainable.", "Achieving gender equality and empowerment of all women and girls.", "Ethiopia is One of the Africa countries that achieved some of the MDGs in reducing child mortality an improving maternal health. ", "a", 0, 1, this.f507b));
        arrayList.add(new questions("85.", "Which of the following is true about the Intergovernmental Authority on Development (IGAD)? ", 0, 0, 0, 0, 0, "It was founded as a successor of the Common Market for Eastern and Southern Africa. ", "It is a predecessor of the new partnership for African's Development established in 1986. ", "It was established by East African countries including Djibouti, Ethiopia, Kenya, and Somalia. ", "It is a regional organization having member countries from Eastern, western and Southern Africa. ", "The intergovernmenta1 Authority on developmental authority was established in 1996. It succeeded the earlier as Authority on Drought Development (IGADD), a multinational \"body founded in 1986 by Djibouti, Ethiopia, Somalia, Sudan, Uganda and Kenya, with a focus on development and environmental control. IGADD’s headquarters were later moved to Djibouti, following an agreement signed in January 1986 by the member states. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("86.", "Which of the following statements is true about peer influence? ", 0, 0, 0, 0, 0, "peer influence always has negative pressure that push individuals to start bad habits. ", "Every student is exposed to negative and positive group pressures in his/ her school life. ", "young people should avoid all kinds of peer influences in order to build an independent life. ", "peer pressure is often associated with influences that encourage individuals to adopt positive behaviors. ", "Every student is exposed to the vegetative and positive group pressure during his/ her school life. The Peer Effect on Academic Achievement Among Public Elementary School Students. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("87.", "The following statement is quoted form Wangari Maathai, an environmental activist: \"The environment and the economy are two sides of the same coin. If we cannot sustain the environment, we cannot sustain ourselves. which of the following statement matches the above quotation? ", 0, 0, 0, 0, 0, "We need to exploit the environment as much as we can to enhance our living standard.", "We need to protect the environment and use it wisely in order to maintain our well-being.", "We have to give priority to rapid economic development as God creates, the world for human pleasure ", "We shall give priority to our survival and deal with environmental concerns thereafter. ", "Wangari Maathai was the founder of the Green Belt Movement and the 2004 Nobel Peace Prize Laureate Or an environmental activist the environment and the economy are the two sides of the same coins. If we cannot sustain the environment, we cannot sustain ourselves means We need to protect the environment and use it wisely in order to maintain our wellbeing.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("88.", "What is the major purpose of attracting foreign direct investment in the context of Ethiopia? ", 0, 0, 0, 0, 0, "Protecting the country from the negative effects of economic globalization. ", "Allowing foreign direct investors to send most of their profit to their country. ", "Providing foreign direct investors with access to the resources of the country. ", "Fostering technology transfer, increasing productivity and income of the country. ", "The major purpose of attracting foreign direct investment in context of Ethiopia is to faster technology transfer; increasing productivity and income for the country. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("89.", "Countries that have achieved a high level of industrial development in the recent decades are called emerging economies. Which of the following are categorized in this group? ", 0, 0, 0, 0, 0, "China and France ", "China and India ", "Japan and South Korea. ", "Germany and Brazil", "Emerging markets, also known as emerging economies or developing countries, are nations that are investing in more productive capacity, they are Brazil, Chile, China Colombia, Czech Republic Egypt, Greece, Hungary, India, Indonesia, Korea, Malaysia, Mexico, Morocco, Qatar, Peru, Philippines, Poland, Russia, South Africa, South Korea, Taiwan, Thailand, Turkey, and. United Arab Emirates. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("90.", "Which of the following increases the dependency of poor countries according to the dependency theory? ", 0, 0, 0, 0, 0, "Poor counties have not developed the culture of hard working. ", "World market system favors the wealth industrialized countries. ", "poor countries receive small financial support from rich countries. ", "Developing countries are less integrated in the world economic order. ", "Dependency theory differs from most Western approaches to studying Political development One difference is that this approach originated in the Third World (primarily Latin America), rather than among Western academics, Third World dependency thinkers were concerned with explaining the unequal and unjust situations. in which they and their nations found themselves. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("91.", "At the main gate of kebele 'X' in' Y' national regional state of Ethiopia a big chart with details about the budget allocated for the kebele and the plan of various activates is posted for the public to see. This action of Kebele 'X' implies which principle of FDRE constitution? ", 0, 0, 0, 0, 0, "The sovereignty of people. ", "The supremacy of constitution. ", "The respect of human and democratic rights. ", "Conduct and accountability of government ", "At the main gate of Kebele x in y national regional states of Ethiopia a big chart with details about budget allocated for the Kebele and the plan of various activities is posted for public to see this kebele implement the principle of good conduct and accountability of the governments.", "d", 0, 1, this.f507b));
        arrayList.add(new questions("92.", "Which one of the following statements correctly exemplifies the features of a democratic system? ", 0, 0, 0, 0, 0, "Trusting UN inspection on elected government officials than inspection by the citizen. ", "Understanding that national unity can be solidified if tolerance of diversity prevails. ", "Upholding the principle that transparency cannot be limited even during national emergencies. ", "Believing that the Western media institutions are more responsible in informing people about their government than the local media.", "Democracy a form of government in which sovereign power resides in the people and is exercised by them or by officers they elect to represent them. it also understanding that the national unity can be solidified if the tolerance and diversity prevails.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("93.", "In the election half in The Gambia in December of 2016, the president of the country Yahya Jammeh who initially conceded/ accepted defeat on state television after 22 years in power had suddenly reversed his position, denounced the election results and demanded a new vote saying that “Nobody can deprive me of that victory except the Almighty God\". Which one of the following statements correctly demonstrate the situation indicated in the above paragraph? It shows: ", 0, 0, 0, 0, 0, "The development of real decentralization of power. ", "The evolution of Apartheid type of rule through time. ", "The complete absence of constitution and constitutionalism. ", "A challenge against the role of the people in limiting the power of government.", "Presidential elections were held in the Gambia on 1 December 2016. In a surprise result, opposition candidate Adama Barrow defeated long-term incumbent Yahya Jammeh. The election marked the first change of presidency in The Gambia since a military coup in 1994, and the first transfer of power by popular election since independence from the United Kingdom in 1965. However, on 9 December, jammeh announced that he was rejecting the results and called for a new election, sparking a constitutional crisis. This is completely absence of constitution and constitutionalism.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("94.", "Dote, who is a member of socially discriminated group whose economic activity is pottery and tannery, although successfully completed his diploma in teaching, could not get employment in teaching profession in his woreda on the grounds that it is not culturally appropriate to assign a teacher from such a group, based on the FDRE constitution, which of the following is correct about Dote's situation? ", 0, 0, 0, 0, 0, "The dignity of noble professions such as teaching is respected. ", "The special treatment need of social discriminated groups is respected. ", "Sustainability of culture and skills of socially discriminated groups in maintained. ", "The right to choose one's own means of livelihood, occupation and profession is violated. ", "Dote who is the member of socially discriminated group whose economic activity is potter and tannery, although he was successfully completed his diploma in teaching, he couldn't get employment in the Leaching profession in the wereda on the ground that it is not culturally appropriate to assign a teacher from such group, based on the FDRE constitution Dote rights to choose one's own means of livelihood, occupation and profession, is violated. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("95.", "Which one of the following is the best advice a responsible citizen can give regarding HIV/ AIDS protection in Ethiopia? ", 0, 0, 0, 0, 0, "Avoid sharing any fluid substance with a person who contracted HIV/ AIDS in any form. ", "Avoid using donated blood in the health institutions in the case of any emergency. ", "Conduct a regular and periodic HIV/ AIDS test even- if you are HIB/ AIDS negative. ", "If you are HIV/ AIDS patient avoid giving birth because the baby will contract the virus. ", "There are different viewpoints surrounding the rise and development of HIV/AIDS. We should be tested for HIV is because you need to start treatment as soon as possible. If you wait to see symptoms, then it may be too late for you to receive treatment.", "c", 0, 1, this.f507b));
        arrayList.add(new questions("96.", "Which one of the following is correct about the Agriculture Development led industrialization (ADLI) development strategy of Ethiopia? ", 0, 0, 0, 0, 0, "It is a strategy that proposed a sequential development that starts with agriculture and proceeds to industry. ", "It is a strategy that acknowledge impossibility of industrial development in the agrarian societies like Ethiopia. ", "It is a development strategy which is devised to work until Ethiopia become a lower middle-income country in 2025.", "It Is a strategy that proposes a parallel development of industry with agriculture using capital generated from agricultural development. ", "The main strategy that the country uses for development today called the Agricultural Development Led Industrialization (ADLI). This development strategy is based on the idea that, first the agricultural sector must develop and then, from the development of the agricultural sector, the industrial sector could develop. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("97.", "Which one of the following statements represents a concept? ", 0, 0, 0, 0, 0, "100 * 100 = 10,000", "Ethiopia follows a Julian calendar. ", "The battle of Adwa took place in 1896. ", "Woinshet is the star of the school this year ", "A concept is an abstract idea representing the fundamental characteristics of what it represents. ", "b", 0, 1, this.f507b));
        arrayList.add(new questions("98.", "Which one of the following is best practice to promote unity in diversity? ", 0, 0, 0, 0, 0, "Considering that others way of life is good, right and superior tone's own. ", "Economic development to the level of USA or China is a prerequisite to create a political space within which unity in diversity flourishes. ", "Ethnocentric individual is a person who is less arrogant and more open-minded in relation to other societies and cultures. ", "Experiences of USA, China, and India show that it is possible to achieve rapid economic development in Ethiopia despite multitude of diversities. ", "Best practices of promote unity in diversity is that the experience of USA, China and India show that it is possible to achieve rapid economic development in Ethiopia despite multitude of diversity. ", "d", 0, 1, this.f507b));
        arrayList.add(new questions("99.", "Which one of the following is correct about decision making? ", 0, 0, 0, 0, 0, "It is quite unrealistic to be morally sensitive while deciding on technical issues. ", "Good decision making usually requires organizing serious meeting with co-workers. ", "For business people moral sensitivity usually clashes with their decision of getting profit. ", "Sometimes people can do the right things without considering the moral dimension of their actions. ", "Decision making is the process of making choices by identifying a decision, gathering information, and assessing alternative resolutions.", "b", 0, 1, this.f507b));
        arrayList.add(new questions("100.", "Which one of the following best exemplify voluntary act? ", 0, 0, 0, 0, 0, "Employment in an NGO that support HIV/ AIDS patients.", "A teacher serving as committee member in school environmental club. ", "A solider serving in Ethiopia peacekeeping force in Darfur, Sudan. ", "Teaching community elders literacy skill at weekends without pay.", "Voluntary or volunteer, person participating via volunteering/volunteerism; the best example of voluntary act is teaching community elders literacy skills at the weekends without pay.", "d", 0, 1, this.f507b));
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
        this.f508tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2009.this.timer.setVisibility(0);
                    civics2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    civics2009.this.scr.setVisibility(8);
                    civics2009.this.chr.stop();
                    civics2009.this.toolbar.setVisibility(8);
                    civics2009.this.Relative.setBackgroundColor(-7829368);
                    civics2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2009.this.getBaseContext());
                    int unused = civics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2009.this.highscoreCivics2009 = defaultSharedPreferences.getInt("civ2009hs", 0);
                    int access$600 = civics2009.this.part1 + civics2009.this.part2 + civics2009.this.part3 + civics2009.this.part4 + civics2009.this.part5 + civics2009.this.part6 + civics2009.this.part7 + civics2009.this.part8 + civics2009.this.part9;
                    civics2009.this.resultText.setText(String.valueOf(access$600));
                    civics2009.this.progressbar.setProgress(access$600);
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
                    int unused11 = civics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = civics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = civics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = civics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = civics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = civics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = civics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = civics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "civ2009hs";
                    int unused19 = civics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = civics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = civics2009.this.answered1 + civics2009.this.answered2 + civics2009.this.answered3 + civics2009.this.answered4 + civics2009.this.answered5 + civics2009.this.answered6 + civics2009.this.answered7 + civics2009.this.answered8 + civics2009.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > civics2009.this.highscoreCivics2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - civics2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1civ092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1civ093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1civ094", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1civ095", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1civ096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1civ097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1civ098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1civ099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1civ0910", 0);
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
                        editor.putString("scoreciv091", str3);
                        editor.putLong("date1civ091", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreciv092", str5);
                            editor.putLong("date1civ092", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreciv093", str5);
                            editor.putLong("date1civ093", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreciv094", str5);
                            editor.putLong("date1civ094", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreciv095", str5);
                            editor.putLong("date1civ095", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreciv096", str5);
                            editor.putLong("date1civ096", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreciv097", str5);
                            editor.putLong("date1civ097", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreciv098", str5);
                            editor.putLong("date1civ098", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreciv099", str5);
                            editor.putLong("date1civ099", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreciv0910", str5);
                            editor.putLong("date1civ0910", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateciv091", 0);
                    long j12 = defaultSharedPreferences.getLong("dateciv092", 0);
                    long j13 = defaultSharedPreferences.getLong("dateciv093", 0);
                    long j14 = defaultSharedPreferences.getLong("dateciv094", 0);
                    long j15 = defaultSharedPreferences.getLong("dateciv095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateciv096", 0);
                    long j17 = defaultSharedPreferences.getLong("dateciv097", 0);
                    long j18 = defaultSharedPreferences.getLong("dateciv098", 0);
                    long j19 = defaultSharedPreferences.getLong("dateciv099", 0);
                    long j20 = defaultSharedPreferences.getLong("dateciv0910", 0);
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
                        editor2.putString("iScoreciv091", str4);
                        editor2.putLong("dateciv091", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreciv092", str6);
                            editor2.putLong("dateciv092", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreciv093", str6);
                            editor2.putLong("dateciv093", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreciv094", str6);
                            editor2.putLong("dateciv094", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreciv095", str6);
                            editor2.putLong("dateciv095", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreciv096", str6);
                            editor2.putLong("dateciv096", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreciv097", str6);
                            editor2.putLong("dateciv097", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreciv098", str6);
                            editor2.putLong("dateciv098", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreciv099", str6);
                            editor2.putLong("dateciv099", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreciv0910", str6);
                            editor2.putLong("dateciv0910", l.longValue());
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
                        civics2009.this.scr.setVisibility(8);
                        civics2009.this.chr.stop();
                        civics2009.this.toolbar.setVisibility(8);
                        civics2009.this.Relative.setBackgroundColor(-7829368);
                        civics2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2009.this.getBaseContext());
                        int unused = civics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = civics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = civics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = civics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = civics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = civics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = civics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = civics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = civics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = civics2009.this.highscoreCivics2009 = defaultSharedPreferences.getInt("civ2009hs", 0);
                        int access$600 = civics2009.this.part1 + civics2009.this.part2 + civics2009.this.part3 + civics2009.this.part4 + civics2009.this.part5 + civics2009.this.part6 + civics2009.this.part7 + civics2009.this.part8 + civics2009.this.part9;
                        TextView access$1600 = civics2009.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        civics2009.this.progressbar.setProgress(access$600);
                        civics2009.this.progressbar.setMax(100);
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
                        int unused11 = civics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = civics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = civics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = civics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = civics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = civics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = civics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = civics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = civics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = civics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = civics2009.this.answered1 + civics2009.this.answered2 + civics2009.this.answered3 + civics2009.this.answered4 + civics2009.this.answered5 + civics2009.this.answered6 + civics2009.this.answered7 + civics2009.this.answered8 + civics2009.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > civics2009.this.highscoreCivics2009) {
                            edit.putInt("civ2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - civics2009.this.chr.getBase()) / 1000;
                        SharedPreferences.Editor editor3 = edit;
                        String str = "dateciv0910";
                        String str2 = "dateciv099";
                        if (civics2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 100) * (access$1800 * access$1800)) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            long j = defaultSharedPreferences.getLong("dateciv091", 0);
                            Long l = valueOf;
                            String str3 = f;
                            long j2 = defaultSharedPreferences.getLong("dateciv092", 0);
                            long j3 = defaultSharedPreferences.getLong("dateciv093", 0);
                            long j4 = defaultSharedPreferences.getLong("dateciv094", 0);
                            String str4 = "dateciv094";
                            String str5 = "dateciv093";
                            long j5 = defaultSharedPreferences.getLong("dateciv095", 0);
                            String str6 = "dateciv091";
                            String str7 = "dateciv095";
                            long j6 = defaultSharedPreferences.getLong("dateciv096", 0);
                            long j7 = defaultSharedPreferences.getLong("dateciv097", 0);
                            String str8 = "dateciv097";
                            String str9 = "dateciv096";
                            String str10 = "dateciv098";
                            long j8 = defaultSharedPreferences.getLong("dateciv098", 0);
                            long j9 = defaultSharedPreferences.getLong(str2, 0);
                            String str11 = str;
                            long j10 = defaultSharedPreferences.getLong(str11, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            String str12 = "dateciv092";
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
                                editor2.putString("iScoreciv091", str3);
                                editor2.putLong(str6, l.longValue());
                            } else {
                                editor2 = editor3;
                                if (date12.compareTo(date2) == 0) {
                                    editor2.putString("iScoreciv092", str3);
                                    editor2.putLong(str12, l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor2.putString("iScoreciv093", str3);
                                    editor2.putLong(str5, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor2.putString("iScoreciv094", str3);
                                    editor2.putLong(str4, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor2.putString("iScoreciv095", str3);
                                    editor2.putLong(str7, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor2.putString("iScoreciv096", str3);
                                    editor2.putLong(str9, l.longValue());
                                } else if (date12.compareTo(date7) == 0) {
                                    editor2.putString("iScoreciv097", str3);
                                    editor2.putLong(str8, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor2.putString("iScoreciv098", str3);
                                    editor2.putLong(str10, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor2.putString("iScoreciv099", str3);
                                    editor2.putLong(str2, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor2.putString("iScoreciv0910", str3);
                                    editor2.putLong(str11, l.longValue());
                                }
                            }
                            editor = editor2;
                        } else {
                            String str13 = "dateciv094";
                            String str14 = "dateciv091";
                            String str15 = "dateciv095";
                            String str16 = "dateciv096";
                            String str17 = "dateciv092";
                            String str18 = "dateciv098";
                            String str19 = str;
                            String str20 = str2;
                            String str21 = "dateciv097";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            String f2 = Float.toString(Float.valueOf(new DecimalFormat("##.##").format((double) ((float) Math.sqrt((double) ((((access$600 * 100) / 100) * (access$1800 * access$1800)) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            long j11 = defaultSharedPreferences.getLong(str14, 0);
                            String str22 = str14;
                            long j12 = defaultSharedPreferences.getLong(str17, 0);
                            String str23 = f2;
                            String str24 = str17;
                            long j13 = defaultSharedPreferences.getLong("dateciv093", 0);
                            long j14 = defaultSharedPreferences.getLong(str13, 0);
                            String str25 = "dateciv093";
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
                                editor.putString("iScoreciv091", str23);
                                editor.putLong(str22, valueOf2.longValue());
                            } else {
                                String str32 = str23;
                                editor = editor3;
                                if (date26.compareTo(date14) == 0) {
                                    editor.putString("iScoreciv092", str32);
                                    editor.putLong(str24, valueOf2.longValue());
                                } else if (date26.compareTo(date15) == 0) {
                                    editor.putString("iScoreciv093", str32);
                                    editor.putLong(str25, valueOf2.longValue());
                                } else if (date26.compareTo(date24) == 0) {
                                    editor.putString("iScoreciv094", str32);
                                    editor.putLong(str26, valueOf2.longValue());
                                } else if (date26.compareTo(date25) == 0) {
                                    editor.putString("iScoreciv095", str32);
                                    editor.putLong(str28, valueOf2.longValue());
                                } else if (date26.compareTo(date19) == 0) {
                                    editor.putString("iScoreciv096", str32);
                                    editor.putLong(str27, valueOf2.longValue());
                                } else if (date26.compareTo(date20) == 0) {
                                    editor.putString("iScoreciv097", str32);
                                    editor.putLong(str21, valueOf2.longValue());
                                } else if (date26.compareTo(date21) == 0) {
                                    editor.putString("iScoreciv098", str32);
                                    editor.putLong(str31, valueOf2.longValue());
                                } else if (date26.compareTo(date22) == 0) {
                                    editor.putString("iScoreciv099", str32);
                                    editor.putLong(str29, valueOf2.longValue());
                                } else if (date26.compareTo(date23) == 0) {
                                    editor.putString("iScoreciv0910", str32);
                                    editor.putLong(str30, valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        civics2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2009.this.scr.setVisibility(8);
                civics2009.this.chr.stop();
                civics2009.this.toolbar.setVisibility(8);
                civics2009.this.Relative.setBackgroundColor(civics2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2009.this.scr.setVisibility(0);
                civics2009.this.toolbar.setVisibility(0);
                civics2009.this.telegram_layout.setVisibility(8);
                civics2009.this.chr.start();
                civics2009.this.Relative.setBackgroundColor(civics2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = civics2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = civics2009.this.mInterstitialAd = null;
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
            finish();
            showAd();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                civics2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
