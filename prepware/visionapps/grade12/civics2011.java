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

public class civics2011 extends AppCompatActivity {
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
    private Boolean f511b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2011;
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
    private Toolbar f512tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2011);
        this.f511b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "During the Ethiopian Students' Movement of the 1960 and 1970s, the main slogan of the students was ", 0, 0, 0, 0, 0, "\"One United Ethiopia or Death\" ", "\"Land to the Tiller\" ", "\"Church and State Should be Separate\" ", "\"Cultural Equality of Nations and Nationalities\" ", "During the Ethiopian student's movement, the main slogan was “Land to the Tiller”. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("2.", "Constitutional rights include: ", 0, 0, 0, 0, 0, "respect for rules and regulations. ", "paying taxes willingly and timely. ", "positive response to a national emergency call. ", "getting opportunity to learn in schools.", "A constitutional right can be a prerogative or a duty, a power or a restraint of power, recognized and established by a sovereign state or union of states includes respecting for the rules and regulations. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("3.", "Fairness refers to: ", 0, 0, 0, 0, 0, "favouring peoples of least developed areas. ", "especial sympathy to the poor and persons with disability. ", "distribution of benefits according to one's contribution. ", "sharing the benefits of the country equally to all ethnic groups. ", "Fairness is impartial and just treatment or behaviour without favouritism or discrimination or distribution of benefits according to one's contribution.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("4.", "A medical doctor experiences real job satisfaction when he/she: ", 0, 0, 0, 0, 0, "is addressed by colleagues and patients as doctor. ", "sees the patient he/her treated fully recovers. ", "gets a huge sum of money from his private hospital. ", "succeeds to buy the latest expensive car. ", "The medical doctor experiences real job satisfaction when the patient he/her treated fully recovered. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("5.", "Which of the following best describes a modern democratic constitution? ", 0, 0, 0, 0, 0, "It requires a permanent body to draft it. ", "Its drafting is the responsibility of parliament. ", "Its amendments are similar to ordinary laws. ", "It is the supreme law of a given country. ", "Modern democratic constitution is a system of government in which power is vested in the people and exercised by them directly or through freely elected representatives. And constitution is the supreme law of the given country. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("6.", "Which one of the following is true about the Ethiopian Women Lawyer's Association (EWLA)?", 0, 0, 0, 0, 0, "It struggles to make abortion an act of crime. ", "It is a successful profit-making association ", "It strongly advocates affirmative measures. ", "It was established by the Ministry of Justice. ", "The Ethiopian Women Lawyers Association, (EWLA) is a non-profit women's advocacy group founded by Ethiopian women lawyers. It was legally registered in 1995 and began operation in 1996 to assists women, particularly disadvantaged women, who are victims of gender-based violence free of charge, The service includes legal advice/counselling, writing court briefs (court charges and affidavits) as well as representing clients in courts. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("7.", "The most important requirement to get good income is to: ", 0, 0, 0, 0, 0, "work hard and get money legally. ", "find a relative with a company.", "have a university degree. ", "wait until good income jobs appear. ", "The most important requirement to get good income is to work hard to get good income. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("8.", "Which of the following is the role of historians? ", 0, 0, 0, 0, 0, "Impressing readers by exaggerating historical accounts. ", "Fabricating evidences and facts to reconstruct history. ", "Allowing personal world view to dictate the narration. ", "Examining facts to get closer and closer to the truth. ", "The study of history is important because it helps us understand people and societies. History offers data on information of how people and societies lived and behaved in the past. History helps provide identity. Historical data contains information of how families and even nations were formed. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("9.", "Which of the following is the nature of a limited government? ", 0, 0, 0, 0, 0, "Prevalence of arbitrary rule. ", "Constitutionalism under rule of law.", "Violation of basic human rights.", "Absence of check and balance mechanism. ", "Limited government is where the government is empowered by law from a starting point of having no power, or where governmental power is restricted by law, usually in a written constitution. It is a key concept in the history of liberalism.", "b", 0, 1, this.f511b));
        arrayList.add(new questions("10.", "The basic principle of the Ethiopian Constitution includes: ", 0, 0, 0, 0, 0, "The separation of State and Religion. ", "The respect of Parliamentarians. ", "The sovereignty of the state. ", "The supremacy of Regional Constitutions. ", "one of the basic principles of the Ethiopian constitution includes secularism or the separation of state and religion. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("11.", "The right of an individual or a group to be treated the same way as the others is termed as: ", 0, 0, 0, 0, 0, "Fairness ", "Equality ", "Honesty ", "Transparency", "Fairness is the balance or impartiality (of a court proceeding) that is essential to sue process.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("12.", "A systemic killing of people to eliminate the entire ethnic or religious groups is termed as: ", 0, 0, 0, 0, 0, "Genocide ", "Nazism ", "Atrocity ", "Fascism ", "A Genocide is intentional action to destroy group of people (usually defined as an ethnic, national, racial, religious, cultural, tribal or sexual group) in whole or in part. The hybrid word \"genocide\" is a combination of the Greek word yévog (\"race, people\") and the Latin suffix -caedo (\"act of killing\").", "a", 0, 1, this.f511b));
        arrayList.add(new questions("13.", "In civic participation, having the strength to maintain the efforts to achieve certain goals is termed as: ", 0, 0, 0, 0, 0, "Team spirit ", "Competence ", "Readiness ", "Commitment ", "Commitment is a promise or agreement to do something, example of commitment is marriage. \nA commitment is defined as an official court order to send someone to prison or to a mental \n", "d", 0, 1, this.f511b));
        arrayList.add(new questions("14.", "The existence of unlimited power than can put citizen in danger signify: ", 0, 0, 0, 0, 0, "Anarchy ", "Absence of rule of law ", "Monopoly ", "Constitutional monarchy ", "Anarchy is a state of disorder due to absence or non-recognition of authority or other controlling systems. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("15.", "The corresponding. expectations from the citizen with the rights provided by the constitution are termed as: ", 0, 0, 0, 0, 0, "Obligations ", "Penalties ", "Burdens ", "Expectations ", "Obligation is corresponding expectations from the citizens with the rights provided by the constitution.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("16.", "Among the following counties, which one can be considered as an example for Presidential democracy? ", 0, 0, 0, 0, 0, "India ", "USA ", "Ethiopia", "South Africa ", "A presidential democracy is a system of government in which also called an executive branch exist but is separate from the legislature example is USA.", "b", 0, 1, this.f511b));
        arrayList.add(new questions("17.", "One of the following best describes knowledge. ", 0, 0, 0, 0, 0, "It enables human beings to interact with nature. ", "It is utilized equally by humans and animals. ", "It is absolute and never changed through time. ", "It is needed just for the snake of knowing", "Knowledge is facts, information, and skills acquired through experience or education; the theoretical or practical understanding of a subject.it enable human beings to interact with nature.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("18.", "Shouldering responsibilities: ", 0, 0, 0, 0, 0, "is mandatory to escape from arrest. ", "is a sign of submissiveness and inferiority. ", "gives confidence to citizens to demand their rights. ", "is not expected from top government officials. ", "Shouldering responsivities gives confidence to the citizens to demand their right.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("19.", "Which of the following is true about contraband trade? ", 0, 0, 0, 0, 0, "It is important as it creates job opportunity to people who are unemployed and destitute.", "It is advantageous to poor people as it makes commodities available ", "It should be conducted in collaboration with the concerned government authorities.", "It is an illegal business that should be eradicated and eliminated once and for all. ", "Contraband trade is an illegal business that should be eradicated and eliminated once and for all.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("20.", "The process of sufficiently reducing uncertainty about alternatives to make a reasonable choice refers to: ", 0, 0, 0, 0, 0, "decision making ", "self-reliance ", "assertiveness ", "self-awareness ", "Decision making is the process of making choices by identifying a decision, gathering information, and assessing alternative resolutions. Using a step-by-step decision-making process can help you make more deliberate, thoughtful decisions by organizing relevant information and defining alternatives.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("21.", "A government can claim to have legitimate power and authority when it: ", 0, 0, 0, 0, 0, "receives the mandate from the people. ", "promulgates a constitution by itself. ", "acquires divine blessing from heaven. ", "compels others to do what it desires. ", "A government is a legitimate power when it is derived from the position you hold within a hierarchy. With Legitimate Power, subordinates do as instructed because they believe in the legitimacy of the role you hold. It is underpinned by rules, laws, and even social norms. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("22.", "Which of the following is correct about myth? ", 0, 0, 0, 0, 0, "It is often based on reality. ", "It is a truth in the archaic past. ", "It is a story always harmless to society. ", "It may be used for social unity. ", "Myth is a traditional story, especially one concerning the early history of a people or explaining a natural or social phenomenon, and typically involving supernatural beings or events.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("23.", "Which one of the following is an instrument of development banks? ", 0, 0, 0, 0, 0, "Encouraging saving than investment. ", "Serving mainly as source of capital. ", "Persuading depositors to spend more money. ", "Getting most of their money from government. ", "The Bank has two basic types of lending instruments: investment loans and adjustment loans, Investment loans have a long-term focus (5 to 10 years), and finance goods, works, and services in support of economic and social development projects in a broad range of sectors, It encourage saving than investment.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("24.", "Among the alternative means of peacefully settling disputes, the one that requires carrying suit before the court is: ", 0, 0, 0, 0, 0, "Litigation ", "Negotiation ", "Mediation ", "Arbitration ", "Litigation is the process, a case (called suit or lawsuit) is brought before a court of law suitably empowered (having the jurisdiction) to hear the case, by the parties involved (the litigants) for resolution (the judgment). ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("25.", "Which of the following is morally a wrong action? ", 0, 0, 0, 0, 0, "Disinterest to give money to a beggar. ", "A boss pushing on a clerk for a date. ", "Listening to music by earphone in a bus. ", "Exposing a friend who stole public fund. ", "the wrong action is disinteresting to give money to the beggars.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("26.", "Which of the following is true about the Rule of Law? ", 0, 0, 0, 0, 0, "It places everyone in a country under the law. ", "It is essential for leaders who came to power by force of arms. ", "It strengthens the authority of the government and its officials. ", "It is respected in states with federal structure. ", "The rule of law implies that every person is subject to the law,including people who are lawmakers, law enforcement officials, and judges ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("27.", "Which of the following is not acceptable during demonstrations? ", 0, 0, 0, 0, 0, "Encouraging participation of high school students. ", "Demanding appropriate response for officials. ", "Forcing by passers to join the ongoing rally. ", "Carrying slogans that may irritate the government. ", "During demonstration forcing by passers to join the demonstration is not an acceptable act. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("28.", "Which of the following is a manifestation for the absence of the rule of law", 0, 0, 0, 0, 0, "General feeling of security ", "The prevalence of anarchy ", "Existence of supreme power ", "Consolidation of state authority ", "The Manifestations of the absence of the rule of the law is the prevalence of anarchy, In any country the Constitution, is the supreme law of the land; and ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("29.", "Which of the following is correct about the Ethiopian Constitution? ", 0, 0, 0, 0, 0, "State laws can decide against it. ", "It can be contravened by customary laws. ", "Opposition parties are exempted from it. ", "It is the supreme law of the land. ", "the judges in every state shall be bound thereby, anything in the Constitution ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("30.", "The process of thought that helps make objective judgment is termed as: ", 0, 0, 0, 0, 0, "Knowledge ", "Wisdom ", "Reasoning ", "Rationality ", "The process of thought that help to make objective judgement is termed as reasoning. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("31.", "Gender issues refer to determined patterns of behaviour to rights, duties, obligations and responsibilities assigned to: ", 0, 0, 0, 0, 0, "both female and male citizens ", "female citizens ", "discriminated groups ", "male citizens ", "Gender issues, in the main, refer to determined patterns of behaviour in relation to rights duties, obligations and responsibilities assigned to females and males in Society. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("32.", "In order to combat corruption more effectively, governments should: ", 0, 0, 0, 0, 0, "strengthen their police force. ", "set up Ethics and Anti-Corruption Commission. ", "make their officials' activities transparent. ", "pass serious punishments against corrupt officials. ", "In order to combat corruption more effectively government should make their officials activities more transparent.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("33.", "The governments set up by Adolf Hitler in Germany and Benito Mussolini in Italy were example of: ", 0, 0, 0, 0, 0, "totalitarian government ", "anarchist government ", "limited government ", "individualist government ", "The governments set up by Adolf Hitler in Germany and Benito Mussolini in Italy were the examples of totalitarian government. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("34.", "Which one is correct about media in civic participation? ", 0, 0, 0, 0, 0, "Anybody can write what pleases him/her in freedom of the press. ", "Censorship is crucial to protect the society from vulgar ideas. ", "Everyone has the right to hold opinion without interference. ", "The press is expected to highlight the government's achievements. ", "The role of media in civic participation is to up hold everyone opinion without interference ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("35.", "Based on Hippocratic Oath, the ethical standards of doctors include: ", 0, 0, 0, 0, 0, "harming aggressive mental patients. ", "assisting critical patients to commit suicide. ", "discriminating patients on the basis of sex.", "giving due support to fellow physicians. ", "Based on Hippocratic Oath the ethical standards of the doctors include giving due support to fellow physicians. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("36.", "Outside the continent of Africa, where did Ethiopia send peace-keeping troops? ", 0, 0, 0, 0, 0, "The Middle East ", "The Far East ", "The Caribbean ", "The Southern Europe ", "Ethiopia contributed peacekeeping forces to the UN missions to Korea (Fareast), Rwanda, Burundi, Liberia, Congo and Darfur. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("37.", "What does 'domestication' mean in the justice system? ", 0, 0, 0, 0, 0, "Adoption of customary practices as laws of the land. ", "Promulgation of laws for new kinds of domestic crimes. ", "Recognition of international principles as formal laws, ", "Declaration of new laws in the Federal Negarit Gazeta. ", "Domestication means in the justice system recognition of international principles as formal laws. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("38.", "Contrary to the remedial aspects, some argue that affirmative action: ", 0, 0, 0, 0, 0, "Contradicts the principle of equality. ", "perpetuates inequality of the past. ", "increases individual dependency. ", "is positive discrimination against males. ", "The development of Ethiopia requires addressing the equality of disabled groups as much as gender issues contradict the principles of equality. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("39.", "All of the following, except one, were members of the Ethiopian People's Revolutionary Democratic Front (EPRDF) in 1988. Which one was the exception? ", 0, 0, 0, 0, 0, "The Ethiopian People's Democratic Movement (EPDM). ", "The Ethiopian Democratic Officers' Revolutionary Movement (EDORM). ", "The Oromo People's Democratic Organization (OPDO). ", "The Southern People's Democratic Movement (SPDM). ", "The TPLF was. determined to liberate the whole of the country from the military, regime. To this end the Ethiopian people's Revolutionary Democratic Front formed IN 1988 This Front was made up thee TPLF, the Ethiopia people's, Democratic Movement (EPDM), the Oromo people's Democratic Organization (OPDO) and the Ethiopian Democratic Officers Revolutionary Movement ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("40.", "A major cause for the prevalence of corruption in Africa is: ", 0, 0, 0, 0, 0, "abundance of human and mineral resources. ", "low level of educational and technical development. ", "absence of rule of law and exemplary leadership. ", "existence of huge pastoralist and farming communities. ", "The major causes of the prevalence of corruption in Africa is the absence of the rule of law and ethical leadership. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("41.", "Which of the following is true about affirmative actions? ", 0, 0, 0, 0, 0, "They provide opportunity to women to have equal participation with men in the economic, social and political life of the country. ", "They clearly violate the rights of men & peoples without disabilities. ", "They are made by governments mainly to get the vote of women, the disabled and marginalized groups during election time. ", "They aim at ensuring the right of women to take part in elections. ", "Affirmative action is Passive actions taken to address socially disfavoured groups in order to compensate. past injustices and provide opportunity to women to have equal participation with men in the economic, social, political and other life in the society. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("42.", "Which of the following is true about a democratic system? ", 0, 0, 0, 0, 0, "It cannot be practiced in the absence of a documentary constitution ", "It recognizes the political rights of foreigners. ", "It does not allow extra-constitutional authorities.", "It paves the way for constitutionalism. ", "Democratic system is the promotion of political tolerance. This can be realized when individuals are able to express their different viewpoints freely. Tolerance helps unify differences among ethnic, religious, linguistic and political groups. These pave the way for constitutionalism.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("43.", "Which of the following institutions of saving was introduced to Ethiopia at last?", 0, 0, 0, 0, 0, "Insurance company ", "Equb ", "Iddir ", "Banking ", "The insurance company is one of the institutions introduced lately in Ethiopia", "a", 0, 1, this.f511b));
        arrayList.add(new questions("44.", "Which of the following is the impact of dependency? ", 0, 0, 0, 0, 0, "It results in loosing political independence and establishment of colonial rule. ", "It strengthens mutual cooperation between the developed and developing states. ", "It subjects dependent nations to unnecessary interference from foreign countries. ", "It promotes economic development by acquiring loans from the developed countries. ", "Developing countries are highly dependent on rich nations and international organizations. This results in a risk to public welfare and being susceptible to interference from outside. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("45.", "Hard work is very essential for any country including Ethiopia because it: ", 0, 0, 0, 0, 0, "enables countries to produce more goods and services for consumption. ", "is the only means through which workers could get salary increment ", "increases the number of skilled manpower in a given work place. ", "helps countries to benefit economically by diminishing the number of workers.", "In Ethiopia hard work is very essential because it enable the country is able to produce more goods and services to consume. When you are able to produce more, then you have more choice, After producing more you are more likely to satisfy your needs and want. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("46.", "Which of the following is true about protecting the environment? ", 0, 0, 0, 0, 0, "It is the responsibility of the Ministry of Agriculture ", "It is helpful both to the present and the future generations. ", "It worries those who earn income from the environment. ", "It has nothing to do with economic development of a country. ", "Protecting the environment is helpful to both the present and future generations ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("47.", "One of the following is true about politicians who break their promises. ", 0, 0, 0, 0, 0, "They will not be allowed to participate in elections. ", "They earn little respect from the people. ", "They often have strong bond of trust with the people.", "They are tolerated because politics requires flexibility. ", "Politicians who break their promises earn little respect from the people. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("48.", "Which of the following is not an indicator of poverty? ", 0, 0, 0, 0, 0, "A high average life expectancy and a high literacy rate. ", "Failure of people to satisfy their basic needs. ", "Existence of a high infant mortality rate in a country. ", "Prevalence of a very low-income level", "International indicators of poverty include: \n-\tEducation (Each indicator is weighted equally at 1/6) \n-\tHealth (Each indicator is weighted equally at 1/6) \n-\tStandard of Living (Each indicator is weighted equally at 1/18) \n", "a", 0, 1, this.f511b));
        arrayList.add(new questions("49.", "According to the international principles that guide the collection of tax, ", 0, 0, 0, 0, 0, "Civil servants should be exempted from taxes.", "People earning the same amount of income should pay the Same amount of tax.", "Payment of taxes should be based on the country’s development. ", "Merchants should pay in tax 50% of the profit they got. ", "Principles of tax principles equitable taxation. Taxes should be spread over as wide as possible section of the population, or sectors of economy, to minimize the individual tax burden. Based on this people earning the same amount income should pay the same amount of tax. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("50.", "Which of the followings is true about equitability during the reign of Emperor Haile Selassie I? ", 0, 0, 0, 0, 0, "All provinces got equal social services. ", "There was no equitable distribution of resources. ", "Children of the poor had no access to education. ", "There was no justice for the ordinary citizens. ", "During the reign of Emperor Haile Selassie I, there was no equitable distribution of services ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("51.", "Living within one's own means as mechanism of saving requires one of the following which one is it? ", 0, 0, 0, 0, 0, "Knowing how much our needs cost and limiting to our income. ", "Keeping portion of our income to be used when we get old. ", "Reducing the type and amount of meal we eat every day. ", "Judging whether the item we want to purchase is really necessary. ", "Planning is knowing how much our needs cost and limiting to our income.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("52.", "Which one of the following is correct about equity of benefits and burdens ", 0, 0, 0, 0, 0, "Harmony among societies can be achieved only when benefits and burdens are shared equally. ", "It is always true that people share benefits and burdens equally. ", "In Ethiopia, there are no problems related to sharing benefits and burden equally. ", "There should be no one, including children, exempted from sharing the burdens in the society. ", "Equity is more commonly used to allocate burdens than benefit% agreements for allocating burdens are less integrative than those for benefits; and agreements are more efficient when relationships are long term and subjects contribute unequally to the resources being allocated than when they contribute equally. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("53.", "Which one of the following is correct in the context where the government and the citizen adhere to the principles of rule of law? ", 0, 0, 0, 0, 0, "The judiciary organ of the government will be irrelevant. ", "Conducting periodic elections can be wastage of resources. ", "Establishing a national security force becomes unnecessary. ", "The rights of individuals and groups will be respected. ", "The term rule of law refers to a principle of governance in which all persons, institutions and entities, public and private, including the state itself, are accountable to laws that are publicly promulgated, equally enforced and independently adjudicated, and which are consistent with international human rights norms.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("54.", "Interpreting information gathered in a research process is about: ", 0, 0, 0, 0, 0, "concluding a study using important findings. ", "translating the information into language the research understands. ", "identifying trends from which conclusions from facts and figures can. ", "finding written sources of information such as books, journals and reports.", "Interpreting information gathered in a research process is about translating the information in to language the research understands. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("55.", "An international principle of taxation that says people earning the same amount of income should pay the same amount of taxis termed as: ", 0, 0, 0, 0, 0, "Horizontal equity ", "Ability to pay ", "Value added ", "Vertical equity ", "International principle of taxation of vertical equity drives the principle that people with higher incomes should pay more tax, through proportional or progressive tax rates. In proportional taxation, the amount of taxes paid increases directly with income. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("56.", "The rules or standards that govern the behaviour of a person of a profession can be termed as: ", 0, 0, 0, 0, 0, "Citizenship ", "Ethics ", "Patriotism ", "Constitutionalism", "Ethics moral principles that govern a person’s behavior or the conducting of an activity. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("57.", "According to the current Constitution of FDRE elected officials are given their power by the citizen of the country. Which of the following basic principles of the Constitution is reflected by this practice? ", 0, 0, 0, 0, 0, "Conduct and accountability of government. ", "The supremacy of the Constitution. ", "Respect of human and democratic rights. ", "Sovereignty off the people. ", "According to the current constitution of FDRE elected officials are given their power by the citizen of the country is the principle of conducts and accountability of government. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("58.", "Identify the correct statement about the economic principles of the free market. ", 0, 0, 0, 0, 0, "Letting market forces determine the extent of transactions & prices. ", "Providing special tax privileges to domestic manufacturers. ", "Giving priority and advantage for foreign investors. ", "Discouraging imports by imposing heavy tariffs on foreign produced goods. ", "In an idealized free-market economy, prices for goods and services are set freely by the forces of supply and demand and are allowed to reach their point of equilibrium without intervention by government policy. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("59.", "The spread of HIV/AIDS: ", 0, 0, 0, 0, 0, "is confined to Africa and the developing world. ", "is significantly controlled in the present-day Ethiopia. ", "should be the concern of educated and high-income citizens. ", "increases deaths by infectious diseases like tuberculosis. ", "The spread of HIV/AIDS increase deaths by infectious diseases like tuberculosis.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("60.", "Which of the following is not a quality of patriot? ", 0, 0, 0, 0, 0, "Taking an immediate personal act of punishment against wrong doers. ", "Treating other people the way you want to be treated. ", "Being honest, reliable, loyal and principled. ", "Being brave and confident to do what you believe in and what you want to do. ", "Respect for those with serve, and lead our country, regardless of political views and opinions.\" \"Think how hard it has been to keep the Stars and Stripes flying.\" \"Being a good patriot is caring about your friends, neighbors and community and also being proud of where you come from.\" ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("61.", "Which one of the following is a responsible behaviour against HIV/AIDS? ", 0, 0, 0, 0, 0, "Using condoms while having sex. ", "Marrying before the age of 18. ", "Avoiding pregnancy after marriage. ", "Abstaining from sexual intercourse for life. ", "One of responsible behavior against HIV/AIDS is using condoms while having sex", "a", 0, 1, this.f511b));
        arrayList.add(new questions("62.", "One of the mechanisms to tackle distorted and biased historical accounts is to: ", 0, 0, 0, 0, 0, "rewrite history based on one’s world view and political interest. ", "compare and contrast history of one country with history of another country.", "examine the sources, facts and evidences historians use to write history ", "avoid reading accounts written by historians who have different political view.", "One of the mechanisms to tackle distorted historical account is to examine the sources, facts and evidences historians use to write history. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("63.", "Which one of the following can be example of recent development in ensuring women equality in Ethiopia? For the first time in the history of the country, women ", 0, 0, 0, 0, 0, "got opportunity to join university ", "got the right to marriage and divorce. ", "got the opportunity to participate in Olympic sports. ", "have occupied half of Cabinet Minster's position. ", "The occupation of half of the Cabinet Minsters position is an example of recent development in ensuring women equality in Ethiopia. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("64.", "Which one of the following is a consequence of dependency? ", 0, 0, 0, 0, 0, "Lack of confidence and feeling of inferiority. ", "Long term economic security. ", "High life expectancy ", "Freedom and relief from explaining one's position. ", "Dependency will also lead to a tendency to work for the will of others, which results in backwardness, stagnation of the economy and social welfare in developing nations at the national level and lack of confidence and feeling of inferiority at the individual level.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("65.", "Which one of the following can be considered as negative impact of globalization on countries like Ethiopia? ", 0, 0, 0, 0, 0, "Dependence on other countries. ", "Access to cheaper products ", "Transfer of knowledge and technology ", "Advancement of information technology. ", "Globalization has had a few adverse effects on developed countries. Some adverse consequences of globalization include terrorism, job insecurity, currency fluctuation, price instability and dependency on other country. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("66.", "In Ethiopia, one of the areas for co-operation with neighbouring countries to achieve equitable use of natural resources is: ", 0, 0, 0, 0, 0, "The Ras Dashin Mountain ", "The Legadembi Gold Mines", "The Ogaden Oil Reserve ", "The Blue Nile River ", "In Ethiopia one of the areas for cooperation with neighboring countries to achieve equitable use of natural resource is the Blue Nile River.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("67.", "Which one of the following is an exclusive right of the Federal Government by the 1995-Constitutions of Ethiopia? ", 0, 0, 0, 0, 0, "Recruiting and managing police force. ", "Running and controlling Supreme Court. ", "Organizing and running national army. ", "Creating enabling condition for investment. ", "According to Constitution the exclusive power of the federal government of Ethiopia is organizing and running national army.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("68.", "Which one of the following shows the similarity among voluntary organization across community, national and international levels? ", 0, 0, 0, 0, 0, "All focus on local and community problems. ", "All are purely social groupings without formal organizational existence. ", "All are concerned with fighting poverty in one way or another. ", "All aim to promote the wellbeing of the people.", "A voluntary group or union (also sometimes called a voluntary organizations, common-interest association, association, or society) is a group of individuals who enter into an agreement, usually as volunteers to form a body (or organization) to accomplish a purpose. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("69.", "A study of economy to see the comprehensive and cumulative picture of what is going on the economy is a concern of ", 0, 0, 0, 0, 0, "Macroeconomics ", "Microeconomics ", "Meso economics", "Mega economics ", "Macroeconomics is the branch of economics concerned with large. scale or general economic factors, such as interest rates and national productivity.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("70.", "Among the work ethics, the one which requires workers to obey rules and guidelines of the work place is termed as: ", 0, 0, 0, 0, 0, "Punctuality ", "Harmony and cooperation ", "Labour discipline", "Improving professional skills ", "Labor discipline is the system of organizational relations, fixed by law and other social norms, within whose limits joint labor activity proceeds. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("71.", "One of the qualities of effective leadership for active participation is the use of: ", 0, 0, 0, 0, 0, "Threat ", "Coercion", "Rigidity ", "Motivation ", "Motivation is one of the qualities of effective leadership for effective participation.", "d", 0, 1, this.f511b));
        arrayList.add(new questions("72.", "Which of the following belongs to the capitalist economic principles? ", 0, 0, 0, 0, 0, "Prevalence of top-down command structure. ", "Heavy government involvement in the market. ", "Determination of prices on the basis of market forces. ", "Lesser freedom of decision for producers and consumers. ", "Capitalism is an economic system based on the private ownership of the means of production and their operation for profit: Characteristics central to capitalism include private property, capital accumulation, wage labor, voluntary exchange, a price system and competitive markets.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("73.", "In relation to work at international level, civilization refers to: ", 0, 0, 0, 0, 0, "a society built on culture and knowledge. ", "the construction of sky-high buildings. ", "spending more time on leisure than work. ", "forgetting the past to focus on the future. ", "In relation to work at international level civilization refers to a society build on culture and knowledge. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("74.", "One way of combating HIV/AIDS at the international level is: ", 0, 0, 0, 0, 0, "waiting until the last infected person passes away. ", "reduction of coverage of its severity in the media. ", "improvement of the living conditions of the poor. ", "disclosure of the identity of victims worldwide. ", "One of the combating HIV/AIDS at the international level is improving the living conditions of the poor. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("75.", "In federalism, the purpose of power division is to: ", 0, 0, 0, 0, 0, "limit the power of the federal government ", "prepare the state for ultimate independence. ", "consolidate the power of the central government. ", "give unlimited power to the regional states. ", "In federalism the purpose of power division is to limit the or decentralize the power of federal government. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("76.", "Which of the following is true about foreign policy of Ethiopia? ", 0, 0, 0, 0, 0, "It maintained the approach of the last government. ", "It mainly revolves around the issue of the Blue Nile. ", "It is geared towards weakening neighbouring states. ", "It promotes cordial relations for mutual benefits. ", "One of the foreign policies of Ethiopia to ensure that the foreign relation policies of the country are based on mutual interests and equality of states as well as those international agreements promote the interests of Ethiopia. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("77.", "The democratic system in which the Prime Minister is a Member of Parliament and head of the Executive Branch is: ", 0, 0, 0, 0, 0, "Presidential Democracy ", "Constitutional Democracy ", "Parliamentary Democracy ", "Republican Democracy ", "The democratic system in which the prime minster is the Member of, Parliament and head of the executive branch is the parliamentary democracy. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("78.", "What is the consequence of dependency on a given country? It will: ", 0, 0, 0, 0, 0, "enable backward nations profit from trade with wealthy nations. ", "reduce the risk of susceptibility to interference from outside. ", "make poor nations deny free market access to wealthy nations. ", "heighten the inability of developing country to support itself. ", "The consequences of dependency on a given country Due to the world economy works these days, poor countries become exploited subject to the will of rich countries and are frequently exploited. It heightens the inability of developing country to support itself. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("79.", "The correct statement about ethics is that it: ", 0, 0, 0, 0, 0, "is a value that governs behaviour and action. ", "applies similar rulers to all professions. ", "deals with morally right actions.", "has nothing to do with our upbringing and background. ", "Ethics is moral al principles that govern a person's behavior or the conducting of an activity. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("80.", "Which of the following is true about persons with disability? ", 0, 0, 0, 0, 0, "They have different rights than 'the able-bodied ones. ", "They should be treated equally like any other people. ", "They deserve special attention to be productive citizens. ", "They require no different attention from the community. ", "People with disabilities need health care and health programs for the same reasons anyone else does - to stay well active and a part of the community. Having a disability does not mean a person is not healthy or that he or she cannot be healthy.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("81.", "The correct statement about civic participation and societies is that ", 0, 0, 0, 0, 0, "civic societies are organizations that are established by governments.", "Citizens should not participate in making and evaluating public policies. ", "civic organizations help in the participation of citizens in policy making. ", "civic organizations main concern is struggling to assume political power. ", "Civic Participation is a key issue in the Social and Community Context domain. Civic participation encompasses a wide range of formal & informal activities Examples include voting, volunteering, participating in group activities, and community gardening. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("82.", "As a feminist, Charlotte Gilman: ", 0, 0, 0, 0, 0, "wanted women to take care of their children in their homes. ", "advocated complete financial independence of all women. ", "supported the idea of sexism or discrimination based on sex. ", "espoused the predominant role of women as wives and mothers.", "Charlotte Perkins Gilman (1860 – 1935) was a woman ahead of her time. From these brief quotes on her feminist ideas, we can see that on the whole, women have not progressed nearly as much as we'd like to think. Shedding a light on the economic and social discrimination that forced women into second-class citizenship was the mission of her 1898 book. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("83.", "Identify the correct statement about professional ethics ", 0, 0, 0, 0, 0, "If there is a good pay there will be a good working environment.", "Ethical standards are not needed for all professions. ", "All professions have their own peculiar professional ethics. ", "Impartiality general work ethics for all professions. ", "Professional ethics are principles that govern the behavior of a person or group in a business environment. Like values, professional ethics provide rules on how a person should act towards other people and institutions in such an environment. Impartiality is general work ethics of all professions. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("84.", "One of the following is a correct statement. Which one is it? ", 0, 0, 0, 0, 0, "There are many issues that have international magnitude affecting humanity in general. ", "Ethiopia should not bother about nuclear weapons as she is developing country. ", "Globalization has very little effect on developing countries like Ethiopia. ", "Developing countries should not be concerned about problems conflicts in the developed world. ", "The correct statement is a global issue is any issue that adversely affects the global community and environment, such as environmental issues, political crisis, social issues and economic crisis. Global issues range in severity from minor issues that affect everyone to global catastrophic risks that threaten the existence of the entire human race or its society. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("85.", "Identify the correct statement ", 0, 0, 0, 0, 0, "Linguistic and religious homogeneity is guarantee for peace and stability. ", "Diversity is strength and should not be obstacle for unity and nation building", "some languages and religions are well developed and superior than others. ", "The existence of religious along with linguistic diversity is obstacle for a national unity. ", "The correct statement is that linguistic religious homogeneity is guarantee for peace and stability. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("86.", "Which of the following is true about Presidential Democracy? ", 0, 0, 0, 0, 0, "The President is both the Head of State and the Head of government ", "The Prime Minister leads the executive branch of the government. ", "It is a system of government which has no parliaments of congresses. ", "There is no clear separation of power between the legislative and executive branches. ", "A presidential democracy is a system of government in which also called an executive branch exist but is separate from the legislature. The president is the head of state and government. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("87.", "Which of the following is true about truth and myth? ", 0, 0, 0, 0, 0, "myths are always obstacles for the development of human culture. ", "truth cannot be proven, but we can prove or disprove myths. ", "myths are simple legends with no significance to the society. ", "both truth and myth have their own value to the society. ", "Myth can be defined as traditional cultural beliefs that are not based on empirical evidence. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("88.", "Which of the following statement is correct? ", 0, 0, 0, 0, 0, "Every country needs all professions in order to make life easy for its people. ", "People engaged in waving and tannery enjoys great respect in Ethiopian. ", "All professions are not equal and thus they do not deserve equal respect ", "Teaching is greater and better than other professions because it educates all professionals. ", "The correct statement is that every country needs all professions in order to make life easy for its people.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("89.", "What does the term constitutionalism refer to? ", 0, 0, 0, 0, 0, "The presence of a constitutional monarchy.", "The situation where every citizen is strictly under the law.", "The existence of democratically elected government.", "The existence of a constitution that recognizes the rights of citizens.", "No Answer, Constitutionalism is \"a complex of ideas, attitudes, and patterns of behavior elaborating the principle that the authority of government derives from and is limited by a body of fundamental law\". It may therefore be said that the touchstone of constitutionalism is the concept of limited government under a higher law.", "n", 0, 1, this.f511b));
        arrayList.add(new questions("90.", "Transparency refers to: ", 0, 0, 0, 0, 0, "willingness of government officials to inform the public how they perform their duties. ", "surrendering the security of a nation for the sake of developing democracy. ", "exposing every national secret to prove that governments are weak. ", "government propaganda at times of elections to convince the people that they have nothing to hide. ", "Transparency in a business or governance context, is honesty and transparency are the quality of being easily seen openness. In general, through the meaning of transparent is a little different in a computer science context, coming closer to meaning invisible or undetectable. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("91.", "Which of the following statements is correct about job satisfaction? ", 0, 0, 0, 0, 0, "Financial reward from job is one of the most important factors that create satisfaction from a job. ", "We cannot achieve job satisfaction if the financial reward is low.", "To achieve satisfaction from a job, the best mechanism is to change job frequently ", "Jobs that require higher level of education are more satisfying than jobs that require lower level of education.", "Job satisfaction refers to an individual's general attitude toward his or her job.\" Some believe it is simply how content an individual is with his or her job, in other words, whether or not they like the job or individual aspects or facets of jobs, such as nature of work or supervision and financial reward from the job.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("92.", "Ato Abebe, who was arrested by police on suspicion of involving in corruption, petitioned for his physical release indicating that the enforcers failed to bring him the court in 48 hours? Which principle due process of law does this situation indicate? ", 0, 0, 0, 0, 0, "Right against self-incrimination ", "Impartial tribunal ", "Presumption of innocence ", "Habeas corpus ", "Ato Ababe, who was arrested by the police on the susception of involving in corruption petitioned for his physical release indicating that the law enforcement failed to bring him to the court in in 48 hours, the principle of Habeas corpus: This is a remedy that is available to a person who is arrested illegally and/or who is not brought before court of law within the legally prescribed period of time. Article 19(4) of the FDRE Constitution provides that all persons have an inalienable right to petition the court to order their physical release where the arresting police officer or the law enforcer fails to bring them before a court within the prescribed time (48 hours) and to provide reasons for their arrest was violated. ", "d", 0, 1, this.f511b));
        arrayList.add(new questions("93.", "Which one of the following is correct about constitutional rights obligations?", 0, 0, 0, 0, 0, "Freedom of expression without interference cannot be limited in any way. ", "Democratic constitutions clearly stipulate the rights and obligations that citizens and their government have. ", "In democratic system civil society organizations are responsible to defied the rights of the citizen. ", "Paying tax is the most important constitutional obligation in Ethiopia is paying tax. ", "The constitutional rights and obligations includes respect and obey federal, state, and local laws. Respect the rights, beliefs, and opinions of others. Pay income and other taxes honestly, and on time, to federal, state, and local authorities. Defend the country if the need should arise. Democratic constitutions clearly stipulate the rights and obligations of citizens and government. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("94.", "Which one of the following is correct about saving and investment? ", 0, 0, 0, 0, 0, "If you save enough money in bank, there is no need to struggle with doing business. ", "People who save money in banks do not need to engage in another investment. ", "Banks can avail funds for investment by collecting money from those who save. ", "People who save more money can request investors to give them priority in employment. ", "The correct answer statement about saving and investment is people who have more money can request investors to give them priority in employment. Saving is setting aside money you don't spend now for emergencies or for a future purchase. ... Financial institutions offer a number of different savings options. Investing is buying assets such as stocks, bonds, mutual. funds or real estate with the expectation that your investment will make money for you. ", "c", 0, 1, this.f511b));
        arrayList.add(new questions("95.", "Among the following, one is the major reason for the establishment operationalization of Hawassa Industrial Park complex in Ethiopia", 0, 0, 0, 0, 0, "It reduces the dependency of the country through promoting domestic industry and manufactured goods. ", "It exposes the country for the wealthy investors from foreign nations and help in improving diplomacy. ", "it can reduce the political and economic interference of foreign countries in domestic matters.", "contribute for changing some of the domestic policies through opening the country for foreign investors. ", "The major reason for the establishment and operationalization of Hawassa industrial Park complex in Ethiopia is to reduces dependency of the country through promoting domestic the impartiality of judiciary organ of the government industry and manufactured goods. ", "a", 0, 1, this.f511b));
        arrayList.add(new questions("96.", "Which of the following is a correct statement about hard work and development?", 0, 0, 0, 0, 0, "Following the Chinese model, Ethiopia is now a middle-income country. ", "Many people in developed countries work hard and earn higher income.", "Ethiopia is poor country mainly because the people are not hard working. ", "In Ethiopia hard work is not rewarding mainly due to low skill of workers.", "The statement about hard work and development is that many people in developed country work hard and earn high income. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("97.", "Among the following, which one can be considered as a mechanism to avoid abuse of human rights? ", 0, 0, 0, 0, 0, "Shutting down social media that disseminates uncontrolled information. ", "Having only one dominant party that is capable of running government ", "Ensuring the impartially of the judiciary organ of the government ", "Stopping activities of journalists that expose human rights abuses in the society.", "One of the mechanisms to avoid abuse of human rights is ensuring the impartiality of judiciary organ of the government.", "c", 0, 1, this.f511b));
        arrayList.add(new questions("98.", "Assume people \"X\" in Ethiopia have a population between 2000 and 5000. which of the following is correct about \"X\" people in the Ethiopian federalism? ", 0, 0, 0, 0, 0, "They have right to have at least one member in the federal Minister's Cabinet. ", "They have right to have at least one representative in House of Federation. ", "They have right to have at least one representative in the House of the People's Representatives. ", "Because their number is less than one million, they cannot be represented in the House of Federation. ", "Assume people ‘x’ in Ethiopia has a population between 2000 and 5000. People 'x' have the right to have at least one representative in House of federation in the Ethiopian federalism. ", "b", 0, 1, this.f511b));
        arrayList.add(new questions("99.", "Which one of the following statements is correct? ", 0, 0, 0, 0, 0, "We acquire knowledge, but we obtain information. ", "Information is very wide, but knowledge is specific. ", "Knowledge is obtained through practical use of wisdom. ", "Information is obtained through practical use of knowledge. ", "The correct statement is Knowledge involves the gathering of information and data. Knowledge is the sum total of what has perceived, discovered or inferred.", "a", 0, 1, this.f511b));
        arrayList.add(new questions("100.", "Which of the following is true about reading habit? ", 0, 0, 0, 0, 0, "There is a well-developed reading culture in Ethiopia. ", "Without habit of reading, culture cannot develop. ", "The habit of reading retards the pursuit of wisdom, ", "Reading without any purpose is meaningless.", "The habit of reading starts when you are committed to read and make it a culture.", "b", 0, 1, this.f511b));
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
        this.f512tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2011.this.timer.setVisibility(0);
                    civics2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    civics2011.this.scr.setVisibility(8);
                    civics2011.this.chr.stop();
                    civics2011.this.toolbar.setVisibility(8);
                    civics2011.this.Relative.setBackgroundColor(-7829368);
                    civics2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2011.this.getBaseContext());
                    int unused = civics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2011.this.highscoreCivics2011 = defaultSharedPreferences.getInt("civ2011hs", 0);
                    int access$600 = civics2011.this.part1 + civics2011.this.part2 + civics2011.this.part3 + civics2011.this.part4 + civics2011.this.part5 + civics2011.this.part6 + civics2011.this.part7 + civics2011.this.part8 + civics2011.this.part9;
                    civics2011.this.resultText.setText(String.valueOf(access$600));
                    civics2011.this.progressbar.setProgress(access$600);
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
                    int unused11 = civics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = civics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = civics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = civics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = civics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = civics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = civics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = civics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "civ2011hs";
                    int unused19 = civics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = civics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = civics2011.this.answered1 + civics2011.this.answered2 + civics2011.this.answered3 + civics2011.this.answered4 + civics2011.this.answered5 + civics2011.this.answered6 + civics2011.this.answered7 + civics2011.this.answered8 + civics2011.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > civics2011.this.highscoreCivics2011) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - civics2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1civ112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1civ113", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1civ114", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1civ115", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1civ116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1civ117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1civ118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1civ119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1civ1110", 0);
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
                        editor.putString("scoreciv111", str3);
                        editor.putLong("date1civ111", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreciv112", str5);
                            editor.putLong("date1civ112", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreciv113", str5);
                            editor.putLong("date1civ113", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreciv114", str5);
                            editor.putLong("date1civ114", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreciv115", str5);
                            editor.putLong("date1civ115", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreciv116", str5);
                            editor.putLong("date1civ116", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreciv117", str5);
                            editor.putLong("date1civ117", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreciv118", str5);
                            editor.putLong("date1civ118", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreciv119", str5);
                            editor.putLong("date1civ119", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreciv1110", str5);
                            editor.putLong("date1civ1110", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateciv111", 0);
                    long j12 = defaultSharedPreferences.getLong("dateciv112", 0);
                    long j13 = defaultSharedPreferences.getLong("dateciv113", 0);
                    long j14 = defaultSharedPreferences.getLong("dateciv114", 0);
                    long j15 = defaultSharedPreferences.getLong("dateciv115", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateciv116", 0);
                    long j17 = defaultSharedPreferences.getLong("dateciv117", 0);
                    long j18 = defaultSharedPreferences.getLong("dateciv118", 0);
                    long j19 = defaultSharedPreferences.getLong("dateciv119", 0);
                    long j20 = defaultSharedPreferences.getLong("dateciv1110", 0);
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
                        editor2.putString("iScoreciv111", str4);
                        editor2.putLong("dateciv111", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreciv112", str6);
                            editor2.putLong("dateciv112", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreciv113", str6);
                            editor2.putLong("dateciv113", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreciv114", str6);
                            editor2.putLong("dateciv114", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreciv115", str6);
                            editor2.putLong("dateciv115", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreciv116", str6);
                            editor2.putLong("dateciv116", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreciv117", str6);
                            editor2.putLong("dateciv117", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreciv118", str6);
                            editor2.putLong("dateciv118", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreciv119", str6);
                            editor2.putLong("dateciv119", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreciv1110", str6);
                            editor2.putLong("dateciv1110", l.longValue());
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
                        civics2011.this.scr.setVisibility(8);
                        civics2011.this.chr.stop();
                        civics2011.this.toolbar.setVisibility(8);
                        civics2011.this.Relative.setBackgroundColor(-7829368);
                        civics2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2011.this.getBaseContext());
                        int unused = civics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = civics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = civics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = civics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = civics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = civics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = civics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = civics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = civics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = civics2011.this.highscoreCivics2011 = defaultSharedPreferences.getInt("civ2011hs", 0);
                        int access$600 = civics2011.this.part1 + civics2011.this.part2 + civics2011.this.part3 + civics2011.this.part4 + civics2011.this.part5 + civics2011.this.part6 + civics2011.this.part7 + civics2011.this.part8 + civics2011.this.part9;
                        TextView access$1600 = civics2011.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        civics2011.this.progressbar.setProgress(access$600);
                        civics2011.this.progressbar.setMax(100);
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
                        int unused11 = civics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = civics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = civics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = civics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = civics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = civics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = civics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = civics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = civics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = civics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = civics2011.this.answered1 + civics2011.this.answered2 + civics2011.this.answered3 + civics2011.this.answered4 + civics2011.this.answered5 + civics2011.this.answered6 + civics2011.this.answered7 + civics2011.this.answered8 + civics2011.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > civics2011.this.highscoreCivics2011) {
                            edit.putInt("civ2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - civics2011.this.chr.getBase()) / 1000;
                        String str = "dateciv119";
                        String str2 = "dateciv118";
                        String str3 = "dateciv117";
                        String str4 = "dateciv116";
                        String str5 = "dateciv115";
                        String str6 = "dateciv114";
                        String str7 = "dateciv113";
                        String str8 = "dateciv112";
                        String str9 = "dateciv111";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1civ1110";
                        String str11 = "date1civ119";
                        if (civics2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1civ111", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1civ112", 0);
                            long j3 = defaultSharedPreferences.getLong("date1civ113", 0);
                            String str13 = "date1civ113";
                            String str14 = f;
                            String str15 = "date1civ111";
                            long j4 = defaultSharedPreferences.getLong("date1civ115", 0);
                            String str16 = "date1civ115";
                            String str17 = "date1civ114";
                            String str18 = "date1civ116";
                            long j5 = defaultSharedPreferences.getLong("date1civ116", 0);
                            long j6 = defaultSharedPreferences.getLong("date1civ117", 0);
                            String str19 = str11;
                            String str20 = "date1civ118";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1civ112";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1civ114", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1civ117";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1civ118", 0));
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
                                editor3.putString("scoreciv111", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoreciv112", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoreciv113", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoreciv114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoreciv115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoreciv116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoreciv117", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoreciv118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoreciv119", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoreciv1110", str25);
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
                            long j18 = sharedPreferences.getLong("dateciv1110", 0);
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
                                editor4.putString("iScoreciv111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoreciv112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoreciv113", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoreciv114", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoreciv115", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoreciv116", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoreciv117", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoreciv118", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoreciv119", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoreciv1110", str28);
                                    editor4.putLong("dateciv1110", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1civ111";
                            String str30 = "date1civ114";
                            String str31 = str11;
                            String str32 = "date1civ112";
                            String str33 = "date1civ117";
                            String str34 = "date1civ115";
                            String str35 = "date1civ116";
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
                            long j21 = sharedPreferences2.getLong("date1civ113", 0);
                            String str40 = str32;
                            String str41 = "date1civ113";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1civ118";
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
                                editor2.putString("scoreciv111", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoreciv112", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoreciv113", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoreciv114", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoreciv115", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoreciv116", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoreciv117", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoreciv118", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoreciv119", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoreciv1110", str49);
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
                            long j38 = sharedPreferences3.getLong("dateciv1110", 0);
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
                                editor.putString("iScoreciv111", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoreciv112", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoreciv113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoreciv114", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoreciv115", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoreciv116", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoreciv117", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoreciv118", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoreciv119", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoreciv1110", str56);
                                    editor.putLong("dateciv1110", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        civics2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2011.this.scr.setVisibility(8);
                civics2011.this.chr.stop();
                civics2011.this.toolbar.setVisibility(8);
                civics2011.this.Relative.setBackgroundColor(civics2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2011.this.scr.setVisibility(0);
                civics2011.this.toolbar.setVisibility(0);
                civics2011.this.telegram_layout.setVisibility(8);
                civics2011.this.chr.start();
                civics2011.this.Relative.setBackgroundColor(civics2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = civics2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = civics2011.this.mInterstitialAd = null;
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
                civics2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
