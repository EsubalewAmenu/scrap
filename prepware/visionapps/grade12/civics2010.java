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

public class civics2010 extends AppCompatActivity {
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
    private Boolean f509b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2010;
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
    private Toolbar f510tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2010);
        this.f509b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is the best indicator for job satisfaction? ", 0, 0, 0, 0, 0, "Material gain without effective performance. ", "Spending more time in towns by a farmer. ", "Saving a patient's life by a medical doctor. ", "Doing one job for a long time for a worker. ", "The key to job satisfaction is in fact, is the fit between the objective conditions of the job and the worker’s expectation. Wages, safety, flexibility of timetable, etc. are used as indicators of job quality, whereas socio-demographic in such as age, sex or education are used as proxies to job expectations. Saving the patient's life by a medical doctor is good example. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("2.", "Which of the following statement is correct concerning the difference between constitution and other laws? ", 0, 0, 0, 0, 0, "Ordinary laws in no way contradict a constitution. ", "Both are considered as supreme laws of a country. ", "The procedure of making them is quite similar. ", "Constitution is normally drawn up by a parliament ", "Constitution is the over supreme law whereas a law is an individual enactment passed by the legislature in accordance with the provisions of the Constitution. in short, the Constitution is the substantive law but a law is one springs out from it. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("3.", "What is the significance of knowledge to human beings? ", 0, 0, 0, 0, 0, "It allows them to destroy nature around them. ", "It encourages them disregard religious teachings. ", "It enables them to make objective judgment. ", "It makes them realize the power of nature on them. ", "Knowledge is a familiarity, awareness, or understanding of someone or something, such as facts, information, descriptions, or skills, which is acquired through experience or education by perceiving, discovering, or learning. Knowledge can refer to a theoretical or practical understanding of a subject. It enables them to make objective judgment. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("4.", "Which of the following is correct about equality among peoples of Ethiopia?", 0, 0, 0, 0, 0, "Equality means getting special treatment because of political view ", "Equality among peoples is key to ensuring peace and development", "Economic inequality among human beings is a natural phenomenon ", "It is difficult to accomplish cultural equalities by restorative justice.", "Equal activity is crucial for equal consideration since political activity is the means by which citizens inform governing elites of their needs and preferences and induce them to be responsive. Citizen participation is, thus, at the heart of political equality. Equality is a key to ensuring peace and development. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("5.", "What does the absence of rule of law in a given country imply? ", 0, 0, 0, 0, 0, "The presence of stability ", "The predominance of justice ", "The existence of social order. ", "The prevalence of anarchy. ", "The absence of the rule of law implies: \n-\tPut citizens in danger. \n-\tThere will not be justice. \n-\tweakens the authority of government and \n-\tThe people will not feel secure. \n-\tCharacterized by anarchy and arbitrary rule. \n-\tJustice suffers peace and stability is threatened and \n-\tThe strong may take advantage of the weak \n", "d", 0, 1, this.f509b));
        arrayList.add(new questions("6.", "What does the separation of state and religion make Ethiopia? ", 0, 0, 0, 0, 0, "A secular State ", "A Federal State", "A Democratic State ", "A Unitary State ", "The Separation of State and religion is essential for a democratic state. This makes Ethiopia a secular state. A secular state is one that separates state and religion as two independent institutions with different objectives, Article 27, sub-article 5 of the Constitution declares the Ethiopian state as a secular state.", "a", 0, 1, this.f509b));
        arrayList.add(new questions("7.", "Which of the following citizens obligation does support government to expand social services? ", 0, 0, 0, 0, 0, "Appreciating group differences. ", "Participating in political debates ", "Paying fair taxes from earnings.", "Resolving conflicts peacefully.", "Obligations of citizens includes obey laws, pay taxes, defend the nation, and serve on juries. Experience the responsibilities of citizens at the local, state, or federal levels. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("8.", "Which of the following refers to a crime that involves the extermination of ethnic, religious or other corporate groups? ", 0, 0, 0, 0, 0, "Fascism", "Racism", "Homicide", "Genocide", "Genocide is the act or attempt to exterminate/make extinct a clang family or people.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("9.", "People have a tendency of considering their cultural values superior to the values of other cultures. What does this tendency indicate? ", 0, 0, 0, 0, 0, "Afro centrism ", "Ethnocentrism", "Euro centrism ", "Multiculturalism", "Ethnocentrism is belief in, or assumption of, the superiority of the social or Cultural group that a person belongs to. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("10.", "What does the phrase \"unity in diversity\" refer to in the current Ethiopian context?", 0, 0, 0, 0, 0, "Maintaining unity without negating diversity of cultures. ", "Placing more emphasis on cultural and linguistic diversity. ", "Maintaining unity of the country using every possible means. ", "Establishing unified and centralized state system. ", "Unity in diversity means maintaining unity without negating diversity of culture It means understanding that each individual is unique, and recognizing our individual differences. These can be along, the dimensions of race, ethnicity, gender, sexual orientation, socio-economic status, age, physical abilities, religious beliefs, political beliefs, or other.", "a", 0, 1, this.f509b));
        arrayList.add(new questions("11.", "Which of the following is a political system practiced in the present Ethiopia? ", 0, 0, 0, 0, 0, "Presidential system ", "Hybrid of different systems ", "Parliamentary system. ", "Presidential and Parliamentary ", "The political system that is practiced in Ethiopia is Parliamentary has the ideologies. right to formulate laws that must be implemented by the Executive. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("12.", "Which of the following statement is correct about civic societies? ", 0, 0, 0, 0, 0, "They are often static dealing with specific issue for long period. ", "They prefer members to be wealthy to get sufficient fund. ", "They focus only on political issues and democratic elections. ", "They are dynamic and changing based on the need of the society.", "Civic society is a voluntary body or society which aims to represent the needs of a local community. Some also take the role of an amenity society. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("13.", "Which of the following refers to the rules and standards governing the behavior of a person or members of a profession? ", 0, 0, 0, 0, 0, "Civics ", "Morality ", "Ethics ", "Rule of law ", "Ethics is oral principles that govern a person's behavior or the conducting or an activity. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("14.", "Which of the following is the name of the corruption in which Richard Nixon, the 37th president of America was involved? ", 0, 0, 0, 0, 0, "The Watergate scandal ", "The White house scandal", "The Monica scandal ", "The Washington scandal ", "Richard Milhous Nixon (January 9, 1913 – April 22, 1994) was an American politician who served as the 37th President of the United States…. By late 1973, the Watergate scandal escalated, costing Nixon much of his political support.", "a", 0, 1, this.f509b));
        arrayList.add(new questions("15.", "Which of the following is not needed if governments and the governed respect rule of law? ", 0, 0, 0, 0, 0, "establishing a national security force. ", "conducting periodic elections. ", "ensuring the role of the judiciary organ of the government. ", "worrying about the violation of individual and group rights. ", "A government that fails to respect human rights has no claim to the loyalty or obedience of any person within its jurisdiction. When the government refuses to protect democracy, subject itself to the rule of law, or honor human dignity, then it forsakes its claim to the people's loyalty or obedience to its laws. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("16.", "Which of the following is true about wisdom? ", 0, 0, 0, 0, 0, "Relying on data gathered from a single source. ", "Arguing firmly to undermine the respect of others. ", "Using knowledge effectively for a given purpose. ", "Drawing generalization from a few observations. ", "Wisdom or sapience is the ability to think and act using knowledge, experience, understanding, common sense, and insight, especially in a mature or utilitarian manner.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("17.", "Which of the following is a traditional Saving institution run by a group People that contribute equal amount of money every week or month? ", 0, 0, 0, 0, 0, "Equb ", "Bank ", "Iddir", "Mahiber ", "Equb- is the traditional institutions that serve as forced saving instruments run by a group of people that contribute equal amount of money every week or moths.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("18.", "Which of the following personalities is associated with ethical standards of the medical profession? ", 0, 0, 0, 0, 0, "Aristotle ", "Hippocrates ", "Socrates ", "Herodotus", "Hippocrates, ancient Greek physician who lived during Greece's Classical period and is traditionally regarded as the father of medicine. He has been revered for his ethical standards in medical science.", "b", 0, 1, this.f509b));
        arrayList.add(new questions("19.", "Which one of the following is correct about unity in diversity? ", 0, 0, 0, 0, 0, "Ethnocentrism has good implications for fostering unity among different cultural groups. ", "Countries such as India maintains their unity as they have home genes language and culture. ", "Diversity does not stop countries from achieving rapid economic development. ", "Countries such as USA emerged as a world power by eliminating and ethnic diversity. ", "Unity in diversity is a concept of \"unity without uniformity and diversity without fragmentation\" that shifts focus from unity based on a mere tolerance of physical, cultural, linguistic, social, religious, political, ideological and/or psychological differences towards a more complex unity based on an understanding. Diversity does not stop countries from achieving rapid economic development. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("20.", "Which of the following best represents unlimited governments? ", 0, 0, 0, 0, 0, "The prevalence of authoritarianism. ", "The application of free and fair election. ", "The freedom of opposition parties. ", "The suppression of absolute power. ", "Unlimited governments have no restraint of power and are typically led government is not limited by a constitution or laws. These governments have total control over their citizen' s ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("21.", "Which of the following is correct about the federal system of government in Ethiopia? ", 0, 0, 0, 0, 0, "enabled regional governments handle foreign policy matters. ", "gave monopoly of state power to the federal government. ", "eroded national unity by emphasizing ethnic diversities. ", "came after decades of struggle against dictatorial regimes. ", "A federal system of government is one government between that divides the powers of the national (federal) government and state and local governments. The Constitution of the Ethiopia came after decades of struggle against dictatorial regimes established the federal system, also known as federalism. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("22.", "A process through which a country officially recognizes certain international principles as valuable and includes them in the country's legal system is termed as, ", 0, 0, 0, 0, 0, "Internationalization ", "Domestication ", "Globalization ", "Localization ", "Internationalization is sometimes shortened to is the process of planning and implementing products & services so that they can easily be adapted to specific local languages & cultures, a process called localization. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("23.", "Which of the following term refers to an unscientific story that people would like to tell and believe? ", 0, 0, 0, 0, 0, "Myth ", "Culture ", "Traditions", "Faith ", "Myth traditional story, especially one concerning the early history of a people or explaining a natural or social phenomenon, and typically involving supernatural beings or events. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("24.", "Which of the following is the most respectable and legal way to earn high income? ", 0, 0, 0, 0, 0, "Joining ruling party as a member. ", "Migration to urban areas. ", "Migration to Europe or USA. ", "Working hard. ", "Hardworking a person, taking their work seriously and doing it well and rapidly. And most respectable and legal way to earn high income.  ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("25.", "Which of the following is correct about power and authority in relation to government? ", 0, 0, 0, 0, 0, "Their application within the appropriate limit makes them legitimate. ", "They always reflect the undemocratic nature of governments. ", "Undemocratic governments lack legitimate constitution & authority ", "Democratic governments upheld ultimately the rule of men.", "In Government, the term authority is often used interchangeably with power. However, their meanings differ: while power is defined as \"the ability to influence somebody to do something that he/she would not have done\", authority refers to a claim of legitimacy, the justification and right to exercise that power. Their application within the appropriate limit makes them legitimate. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("26.", "Which of the following is correct about the contribution of investment? ", 0, 0, 0, 0, 0, "aims at making individuals exceptionally wealthy. ", "Heightens the exploitation of workers by factory owners. ", "Leads to a national growth in income and development. ", "Has negative implications for cash-crop farmers. ", "In an economic sense, an investment is the purchase of goods that are not consumed today but are used in the future to create wealth. In finance, an investment is a monetary asset purchased with the idea that the asset will provide income in the future or will later be sold at a higher price for a profit. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("27.", "Which of the following is correct about Equb as a traditional saving institution? ", 0, 0, 0, 0, 0, "Its workings are related more to banks than insurances. ", "It is liberal in that members can leave it at will. ", "Its members are entirely exercising the act of saving. ", "It is forced saving due to regular and fixed contribution. ", "Equb is the traditional institutions that serve as forced saving instruments. It is liberal in that members can leave it at will. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("28.", "Which of the following statement is true about standard of living in Ethiopia? ", 0, 0, 0, 0, 0, "Most people work hard enough and get good income. ", "Nearly half of the people are below the absolute poverty line. ", "Hard work necessarily brings enormous rewards to all. ", "Production of goods and services satisfy the need of people.", "A standard of living is the level of wealth, comfort, material Goods and necessities available to a certain socioeconomic class or a certain geographic area. The standard of living is closely related to quality of life. Nearly half of the people are below the poverty line.", "b", 0, 1, this.f509b));
        arrayList.add(new questions("29.", "Which of the following statement is correct about responsibility for protecting the environment? ", 0, 0, 0, 0, 0, "Each and every individual has a role to play. ", "It must be left to the ministry of Environment. ", "Much is expected from developing countries. ", "Clearing wild forest isa major component. ", "I think every and each individual's or the people of should be responsible for protecting the environment. We live here so eve should take care of our surroundings.", "a", 0, 1, this.f509b));
        arrayList.add(new questions("30.", "What do you understand by voluntary organizations? They are,", 0, 0, 0, 0, 0, "exactly similar to any other purely social grouping. ", "dependent on government and public authorities.", "interested in providing service to individual benefits. ", "non-profit making entities aiming at a common good. ", "Voluntary group or union is a group of individuals who enter into an agreement, usually as volunteers, to form a body (or organization). to accomplish a purpose. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("31.", "Which of the following statement is correct about the relations between Egypt and Ethiopia concerning the Nile River? ", 0, 0, 0, 0, 0, "Egypt can benefit by undertaking afforestation in Ethiopia. ", "It has served as a source of cooperation in the past. ", "Ethiopia took part in the Nile agreements during colonial period. ", "Water management program on the Nile will not affect Ethiopia. ", "The relation between Egypt and Ethiopia regarding the Nile River it has served as source of cooperation in the past.", "b", 0, 1, this.f509b));
        arrayList.add(new questions("32.", "Which of the following is not considered as fulfilling responsibilities at the international context? ", 0, 0, 0, 0, 0, "Working with others to maintain global peace and prosperity. ", "Supporting peace-keeping forces and activities to stop civil wars. ", "Supporting development projects aimed at solving community problems. ", "Fighting terrorism at the local, regional and global levels. ", "Solving or supporting development projects aimed at solving community problems has the local context whereas maintaining global peace, fighting terrorism and supporting, peace keeping forces has international context. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("33.", "Which of the following is correct about morality? ", 0, 0, 0, 0, 0, "It is the study of ethics and behavior. ", "It analyzes our essential duties and rights. ", "It allows individuals to act as they wish. ", "It tells us how we should act and behave. ", "Mortality is the obligations individuals have related to the moral requirements of a society. The care, understanding or consideration of mortal issues related to right and wrong reception: A belief or opinion based on facts and evidence. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("34.", "Which one of the following is correct about group rights? They, ", 0, 0, 0, 0, 0, "are meant to facilitate the realization of equality. ", "are universal and includes all human rights. ", "upheld rights of a person as an individual. ", "regard women as second-class citizen everywhere. ", "Group rights are the rights held by individuals who are the members of a group are universal and included all human rights. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("35.", "Which one of the following contributes to the rampancy of corruption? ", 0, 0, 0, 0, 0, "Prevalence of strong civil societies. ", "Lack of exemplary ethical leadership. ", "Commitment to national interest. ", "Proliferation of private companies. ", "Commitment to national Interest is one of the factors that contributed to the rampancy of corruption.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("36.", "Which of the following is true about foreign relations? ", 0, 0, 0, 0, 0, "It started in the period after the First World War. ", "It remains the same even if governments change. ", "It excludes non-governmental organizations.", "It has foreign policy and diplomacy as components. ", "Foreign relations are mainly referred to the external relations of countries. When such relations involve countries, it gives rise to what is countries on the one hand and called international relations. It involves countries on the one hand and non-governmental organization on the other. It has foreign policy and diplomacy as components.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("37.", "Which of the following is a preventive approach to fight against corruption? ", 0, 0, 0, 0, 0, "Investigating corruption cases. ", "Formulating anti-corruption laws ", "Bringing corrupt officials to justice ", "Punishing corrupt individuals. ", "Preventive approach: focuses on the preventive role that the constitution and other laws afford. Laws and rules related to financial administration auditing systems have a direct role in preventing corruption. Issues related to ethical regulation, having committed citizens, disclosure, registration of property and mass media all play indirect roles. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("38.", "What is the intention of the principles of external relations, according to the FDRE's Constitution? ", 0, 0, 0, 0, 0, "Enhancing relations with other states based on the principle of mutual respect. ", "Developing a military that might dominate the political-economy of Africa. ", "Promoting a close door policy to protect Ethiopia from external influences.", "Protecting national interests at the expenses of other countries and partners. ", "The 1995 Constitution of Ethiopia Article 86 has clearly stated the country's foreign policy objectives and principles as follow: \n-\tTo promote (policies of foreign relations based on the protection of national interests and respect for the sovereignty of the country. \n-\tTo promote mutual respect for national sovereignty and equality of state and non-interference in the internal affairs of other states.\n-\tTo ensure that the foreign relation policies of the country are based on mutual interests and equality of states as well as that international. agreements promote the interests of Ethiopia.\n-\tTo observe international agreements which ensure re respect for Ethiopia's sovereignty and are not contrary to the interests of its Peoples? \n-\tTo forge & promote ever growing economic union & fraternal relations of Peoples with Ethiopia's neighbors & other African countries. \n-\tTo seek and support peaceful solutions to international disputes \n", "a", 0, 1, this.f509b));
        arrayList.add(new questions("39.", "\"Any propaganda for war as well as the public expression of opinion intended to injure human dignity shall be prohibited by law.\" This statement is quoted from the FDRE's Constitution. What does it indicate? ", 0, 0, 0, 0, 0, "Citizens have the right to express their opinion without any limitation. ", "Freedom of expression does not involve obligation and legal restrictions. ", "Opinion expression in public places is prohibited to protect the rights of others. ", "The law puts restrictions on freedom of expression to protect public’s safety. ", "Any propaganda for war as well as the public expression of opinion intended to injure human dignity shall prohibited by law is this treatment is quoted from the PDRE's constitution it indicates Any propaganda for war as well as the public expression of opinion intended to injure human dignity shall be prohibited by law. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("40.", "Which of the following is a customary particle that violates the rights of children and girls? ", 0, 0, 0, 0, 0, "performing farming activities ", "The spread of HIV/AIDS ", "Forced and early marriage", "Bearing and nurturing children.", "Forced and early marriage are the customary practices that violate the right of children and Girls.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("41.", "Which of the following is correct about civic participation in countries like Ethiopia? ", 0, 0, 0, 0, 0, "Similar political stands are expected from citizens of the nation. ", "Citizens engage in policy making through public meetings ", "Developing alternative ideas is discouraged ", "Civic societies are not allowed to propose suitable ", "In a country like Ethiopia, where we have diverse cultural and social backgrounds, different political stands and perspectives are expected, Citizens engage in the process of policy making by directly participating in civic life and by discussing pressing issues with their neighbors or with citizens who belong to civic forums in their communities, like parent-teacher associations, service organizations, neighborhood associations or Iddir", "b", 0, 1, this.f509b));
        arrayList.add(new questions("42.", "Which of the following is a decision based on moral sensitivity? ", 0, 0, 0, 0, 0, "A medical practitioner divulging the status of AIDS patient  ", "Telling lies that may lead to the break-up of a marriage", "Using harsh words on students who perform very low in class ", "Increasing prices by a merchant with reasonable justification", "Decision-making requires examining the pros and cons of the decisions that you make. You need to question the morality of your decision in order to take morally sound actions for example increasing prices by merchants with reasonable justifications. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("43.", "HIV/AIDS is considered as a global pandemic. What does this statement mean? ", 0, 0, 0, 0, 0, "HIV/AIDS is a contagious disease equally affecting all regions of the world. ", "HIV/AIDS is similar to other diseases such as tuberculosis, typhoid and malaria. ", "HIV/AIDS is no more considered as an epidemic disease in the developing world. ", "HIV/AIDS affects human being across regions and countries of the world. ", "There are different viewpoints surrounding the rise and development of HIV/ AIDS. So far, the origins of HIV and first cases of AIDS are not clear but affect human beings across regions and countries of the world.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("44.", "Which of the following is a good example of giving priority to the collective good? ", 0, 0, 0, 0, 0, "Soldiers dying to protect the sovereignty of their country. ", "Students working hard to get excellent grades in their courses. ", "Business men trying their best to maximize their profits. ", "Employees performing well to get promotion and better salaries. ", "solders dying to protect the sovereignty of the country are the good example of collective goods. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("45.", "Which of the following became a famous human rights activist after suffering discrimination in South Africa? ", 0, 0, 0, 0, 0, "Martin Luther King", "Rosa Parks ", "Mohandas Gandhi ", "Luther King senior ", "Mohandas K. Gandhi was the youngest of four children Gandhi experienced the prejudice firsthand after he booked first-class passage on a train to Pretoria in South Africa. He after suffering discrimination in South Africa. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("46.", "Which of the following is the meaning of traditional patriotism? ", 0, 0, 0, 0, 0, "Acting ethically and responsibly to uphold constitutional values. ", "Fighting against enemies to defend the boundaries of one's country. ", "Standing for the principles of democracy and human rights. ", "Participating strongly in community development activities. ", "The traditional mining of patriotism is just fighting against enemies to defend the boundaries of one's country. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("47.", "Which of the following political parties emerged from the Ethiopian People's Revolutionary Party? ", 0, 0, 0, 0, 0, "Tigrean People's Liberation Front. ", "Oromo People Democratic organization. ", "Ethiopian People's Revolutionary Democratic Front. ", "Ethiopian People Democratic Movement. ", "The Ethiopian people's democratic movement is one of the political parties that emerged from Ethiopian people's revolutionary party. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("48.", "Which of the following is true about equality? It is, ", 0, 0, 0, 0, 0, "giving priority to people based on their loyalty to certain Political ideologies.", "providing equal payments for all employees regardless of their educational status, skills and experiences. ", "providing equal opportunities for all regardless of gender, ethnic and religious differences. ", "opening up top managerial positions for citizens regardless of their credentials and work experiences. ", "Equality, in the main refers to opportunities that the state extends to its people. It also means equal protection and the rights given to all citizens. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("49.", "One of the factors that enhance active community participation is a versatile leader. What are the major qualities of a versatile leader? ", 0, 0, 0, 0, 0, "Flexibility and all-rounded personality", "Charismatic, attractive, and charming. ", "Ability to develop and enact a realistic plan. ", "Enthusiasm and ability of inspiring others. ", "Versatile leader somebody who is adaptable, flexible, resourceful, multitalented and an all-round personality. A leader can work in situations totally different from routine functions. Intelligence, ambition, assertiveness, politeness and psychological stimulation are essential attributes of a leader. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("50.", "What is the contribution of knowledge to enhance the development of democracy? ", 0, 0, 0, 0, 0, "Knowledge serves no purpose in the development of political systems.", "Education has a very limited role in fostering political participation of citizens.", "Knowledge helps citizens to make informed decisions in their political participation. ", "Critical investigation is an essential means of generating scientific findings. ", "The contribution of knowledge to the enhancement of democracy is that it helped the citizens to make the informed decisions in their political Participation. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("51.", "Which of the following is an international multilateral organization founded after the Second World War to assist the reconstruction of Europe? ", 0, 0, 0, 0, 0, "World Bank ", "International Monetary Fund", "World Health Organization. ", "World Trade Organization ", "World Bank is an international multilateral urbanization founded Europe after the Second World War to assist the reconstruction. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("52.", "How do modern banks facilitate investment?", 0, 0, 0, 0, 0, "They are institutions of forced savings and accumulation of wealth.", "They encourage savings while discouraging borrowing money to start businesses.", "They motivate individuals and institutions to use traditional saving mechanisms", "They encourage the accumulation of capital that could be used for investment.", "The modern bank facilitates investment by encouraging the accumulation of capital that could be used for investment. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("53.", "What is the benefit of using locally produced goods for national development?", 0, 0, 0, 0, 0, "It provides local manufacturing industries with wider market opportunities.", "It benefits local industries to sell their products without competition", "It encourages foreign direct investment run by Western business companies.", "It makes the country independent of the pressure of developed countries. ", "The benefit of using locally produced goods for national development is provides loyal manufacturing industries with wider market opportunities. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("54.", "Which of the following is true about globalization?", 0, 0, 0, 0, 0, "It has the same impact on developing and developed countries.", "It has little impact on cultural identities in developing countries.", "It opens up the world for more interaction and interdependence. ", "It has very limited influence on the current development of Ethiopia. ", "Globalization open up the world for more interaction &interdependence. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("55.", "Which of the following is true about a promise?", 0, 0, 0, 0, 0, "In election campaigns there is nothing wrong to see political parties making false promises.", "The immediate effect of breaking promise is far worse than long term consequence.", "Breaking promise results in breaking the bond of trust among individuals and groups. ", "The culture of keeping promise has deteriorated through time and the current youth has becomes less trust worthy. ", "Breaking the premises results in breaking the bond of trust among the individuals and groups. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("56.", "Which of the following is an opportunity for Ethiopia in fighting poverty? ", 0, 0, 0, 0, 0, "Gender equality which was achieved in 2015.", "Availability of rich natural resources in different Corms.", "Elimination of infant mortality in 2015", "Availability of world-class universities in significant numbers.", "One of the opportunities to Ethiopian to fight poverty is the availabilities of rich natural resources in different forms. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("57.", "Which of the following is among the major practices that can jeopardize unity in diversity? ", 0, 0, 0, 0, 0, "Failing to display mutual respect among different ethnic, linguistic and cultural groups. ", "Promoting education in the mother tongue of children. ", "Joining opposition political party as a member. ", "Promoting the use of widely spoken languages as official working languages in the regions.", "One of the major practices that can jeopardize, unity in diversity is falling to display mutual respect among different ethnic, linguistic and cultural group.", "a", 0, 1, this.f509b));
        arrayList.add(new questions("58.", "Which of the following refers to a limited government? ", 0, 0, 0, 0, 0, "Courts ignore rule of law whenever they deem it necessary. ", "It is landlocked without access to the sea. ", "Certain group of people are entitled to hold political power. ", "Its power is restricted constitutionally. ", "Limited Government A government whose power is restricted constitutionally. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("59.", "What does the principle of the supremacy of the FDRE Constitution ", 0, 0, 0, 0, 0, "Elected officials shall be accountable to their electorate.", "All other laws in the country have to conform to the Constitution.", "Human and democratic rights of the citizen shall be respected.", "Elected officials shall be given power by the citizens of the country.", "The supremacy of the constitution implies the constitution is the supreme law of the land. Any law, customary practice or a decision of an organ of state or a public official which contravenes this Constitution shall be of no effect. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("60.", "Which of the following is true about theories of truth? ", 0, 0, 0, 0, 0, "The scientific theory of truth assumes that truth is measured by its usefulness", "The pragmatic theory of truth assumes that, truth depends on objective facts", "The relative theory of truth assumes that there is no absolute truth. ", "The relative theory and pragmatism have a similar assumption about truth.", "One of the philosophical approaches to truth states that true is relative to space and time. This is what is called the relativity of truth and it means there is no absolute or fixed truth. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("61.", "Ethiopia's commitment to send peacekeeping forces to different countries of Africa and Asia is a manifestation of the country’s ", 0, 0, 0, 0, 0, "Strength in military power. ", "Fulfillment of membership obligation to IGAD. ", "Dependence on foreign aid. ", "Commitment to international security. ", "Ethiopian's commitment to sending peacekeeping force to different and Asia is the manifestation of the country's countries of Africa commitment to international security.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("62.", "Which of the following refers to an organ of government that intervened in the 2017 Kenyan election and decided a second-round run-off election between Uhuru Kenyatta and Raila Odinga? ", 0, 0, 0, 0, 0, "The judiciary branch of government. ", "The executive branch of government ", "The legislative branch of government. ", "The House of Peoples Representatives. ", "The judiciary branch or organ of government that intervened in the 2017 Kenya election and decided a second-round run-off election between Uhruu Keneyata and Raila Odinga. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("63.", "Which of the following rebellions in Imperial Ethiopia was caused due to extreme greediness of the army stationed among the peasants? ", 0, 0, 0, 0, 0, "The Bale peasant’s rebellion ", "The Gojam peasant's rebellion ", "The first Woyane movement", "The Jarso peasant's rebellion. ", "The first Woyane movement took place in Tigray immediately after the liberation of Ethiopia from the Italian occupation (1941). The major causes were: administrative inefficiency, corruption and greediness of the army stationed in Raya and Azabo.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("64.", "What is the mechanism through which responsible citizens can influence the political decisions of government officials? ", 0, 0, 0, 0, 0, "Removal from the positions ", "Giving money as bribe ", "Intimidation using force", "Demonstration ", "Demonstration is the mechanism through which the responsible citizens can influences the political decisions of government officials. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("65.", "What is the best mechanism to be considered in developing the habit of saving? ", 0, 0, 0, 0, 0, "Avoiding leisure expenditure at all. ", "Avoiding extravagance and living within ones means. ", "Refraining from helping the poor and needy. ", "Increasing salary of workers annually. ", "The best mechanism to be considered in developing the habits of saving is avoiding extravagance and living within. one means. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("66.", "Which of the following important work ethics is expected from employees in organizations? ", 0, 0, 0, 0, 0, "Avoiding wastage of time and material in the work place to reduce production costs. ", "Refraining from criticizing the weaknesses of co-workers to maintain harmonious relationship.", "Staying home during working hours when there is no good relationship with co-workers. ", "Respecting the organization's dress code during all occasions to build the image of the Organization. ", "One of the important work ethics is expected from employees in the organization is avoiding wastage of time and material in work place to reduce production costs. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("67.", "Which of the following is true about the workings of the court? ", 0, 0, 0, 0, 0, "Impartial courts discriminate on certain grounds. ", "Courts have the mandate to promulgate new laws. ", "Independent courts guarantee human right protection. ", "Stereotyping helps the court to make fair judgment. ", "Courts are agencies of the law and they should be independent without any interference. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("68.", "As a responsible citizen what would be your reaction if someone claimed to have the key to the National Exam and could sell it to you? ", 0, 0, 0, 0, 0, "Buy the key to use it during the time of the National Exam. ", "Fight corruption by quickly alerting the concerned bodies. ", "Inform my friends and relatives to benefit from the opportunity. ", "Refuse to buy the key but keep the information secrets ", "As responsible citizens what would be your reaction if some claimed to have the key to the national examination and could sell to you, you have to fight corruption by quickly alerting the concerned bodies. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("69.", "Which of the following is correct about the method of research that one chooses to collect data? ", 0, 0, 0, 0, 0, "Method of data collection should depend on the nature of the research intended. ", "Quantitative methods of data collection are more dependable than qualitative methods. ", "Qualitative methods of data collection are more dependable than quantitative methods. ", "Method of data collection should depend on the level of education of the respondents. ", "One of the methods through which we can gather information is through research.  The method of data collection should depend on the nature of research intended. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("70.", "Which of the following statements is correct about the characteristics of remembers? Members are committed to: ", 0, 0, 0, 0, 0, "expand their market share for the goods they produce. ", "achieve maximum profit from their investment. ", "get support of voters during election. ", "share common goals", "Civic society's members are committed to share common goals. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("71.", "Which of the following factors must be taken into account before planning saving?", 0, 0, 0, 0, 0, "The availability of modern saving institutions.", "The availability of goods one needs to consume in the market. ", "Level of income and limiting interests accordingly.", "Assessment of viable investment opportunity", "One of the factors must take into account before the planning saving is knowing the level of income and limiting interest accordingly. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("72.", "Which of the following statements is correct about job satisfaction?", 0, 0, 0, 0, 0, "People who are interested in team work are more satisfied than those who prefer to work alone.", "A working environment where social interaction is a strong contributor to enhancing job satisfaction.", "Of all other factors the maximum satisfaction in a job depends on the amount of payment.", "A job that benefits the individual more than the society promotes better job satisfaction.", "A work environment where social interaction is strong contributes to enhancing job satisfaction. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("73.", "Which of the following is a correct statement about the positive impact of globalization to developing nations? It,", 0, 0, 0, 0, 0, "makes life hard through cheap products.", "helps to drive out traditional local industries", "transfer knowledge and advance technology", "affects life through direct foreign investement", "The positive impact of globalization to the developing nations is transfer knowledge and advanced technology. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("74.", "Which of the following is correct about the HIV/AIDS pandemic?", 0, 0, 0, 0, 0, "The disease is sensitive towards color", "Low living condition heightens vulnerability", "developed countries are immune from it", "victims are most likely to die of heart attack", "HIV/AIDS pandemic highly affect the low living condition and heighten vulnerability.", "b", 0, 1, this.f509b));
        arrayList.add(new questions("75.", "Which of the following best explains tax evasion", 0, 0, 0, 0, 0, "honesty in reporting the exact amount of income", "avoidance of tax by changing a business venture", "light offense constituting minor legal punishment", "fraud with the intention of avoiding tax illegally", "Tax evasion is fraud with the intention of avoiding tax illegally.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("76.", "Which one of the following is a correct statement about Ethiopia's policy of foreign relations since 1955? It", 0, 0, 0, 0, 0, "promotes public diplomacy to enhance people-to-people relations", "seeks to make agreement concerning awash river with Djibouti", "gives more attention to domestic rather than foreign investment", "advocates interference in the internal affairs of neighbouring states", "The 1995 Constitution of Ethiopia Article 86 has dearly stated the country's foreign policy objectives and principles are promoting public diplomacy to enhance People to people relations. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("77.", "Which of the following best exemplifies a presidential democracy?", 0, 0, 0, 0, 0, "The parliament has the power to set the annual budget of the country.", "The people choose their president through their representatives.", "Checks and balances are more effective than parliamentary representation", "The president cannot refuse laws passed by the houses of ", "In the presidential democracy the President heads the Executive Branch and the representatives head the Legislative Branch of government. The branches of government function independently, Checks and balances are implemented more effectively than in a Parliamentary Democracy. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("78.", "Which of the following is a consequence of dependency for a nation? ", 0, 0, 0, 0, 0, "It exports more goods to developed nations and get profits. ", "It enjoys fair economic relations with wealthy nations. ", "It protects itself from capitalist penetrations. ", "It imports obsolete goods from wealthy nations. ", "One of the consequences of dependency of nation is imports obsolete • goods from developed nations. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("79.", "The fight against corruption requires active participation of the public and the commitment of government institutions. What does the above statement imply? ", 0, 0, 0, 0, 0, "Corruption cannot be effectively controlled without the participation of the people and public institutions.", "Through their continuous efforts, individual citizens can eradicate corruption from public institutions.", "Corruption can be eliminated through the dedication of government officials and institutions. ", "Corruption remains a wide-spread social evil because no one is fighting against the problem. ", "The fight against corruption requires the active and full participation of the public and the unreserved commitment of, among others, each and every government institution. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("80.", "Which of the following is true about the relationship between the FDRE's Constitution and constitutions of Regional States? ", 0, 0, 0, 0, 0, "The Federal Constitution allows regional states to sign treaties with other African states. ", "Like the Federal Constitution, constitutions of Regional Sates have applicability throughout the country. ", "The federal and regional constitutions must have similar preambles, chapters, articles and sub-articles. ", "The provisions of constitutions of Regional States Hall not contradict the fundamental principles of the Federal Constitution. ", "The relation between the FDRE'S Constitution and constitution of regional states is that the Federal Constitution sets limits and provides direction for the administrative activities of-regional states. The regional states form the other centers of power and operate based on their constitution but not disregarding the federal constitution. Their constitutions are designed to meet the specific circumstances of their own regions.", "d", 0, 1, this.f509b));
        arrayList.add(new questions("81.", "A democratic system is considered as essential in countries like Ethiopia. What is the major reason? ", 0, 0, 0, 0, 0, "Democracy provides a favorable atmosphere for development of agricultural led industrialization. ", "Democracy has a strong foundation in the history of political developments in the country. ", "Democracy creates a suitable condition to manage the relationship among diverse cultural groups. ", "Democracy is the best way of developing a federal system with a strong centralized government. ", "A democratic system is considered as essential in countries like Ethiopia because democracy create a suitable condition to manage the relationship among diverse cultural groups. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("82.", "\"Human rights and freedoms, emanating from the nature of mankind are inviolable and inalienable\" (Article 10 FRDE's Constitution). Which of the following is true based on the above statement? ", 0, 0, 0, 0, 0, "Democratic governments play an important role in granting human rights and freedoms of their citizens. ", "Human rights and freedom are rights that are not subject to being given to or taken away from human beings. ", "The origin of human rights and freedoms is strongly associated with the determination of democratic governments. ", "Democratic governments and human rights commissions are authorized to grant human rights and freedoms. ", "Article 10, of FDRE constitution states the following: Human rights and freedoms, emanating from the nature of mankind, are inviolable and inalienable. Human and democratic rights of citizens and peoples shall be respected. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("83.", "Which of the following best describes knowledge? ", 0, 0, 0, 0, 0, "Knowledge is a general understanding of nature and ideas. ", "Hypothesis is knowledge acquired through scientific research. ", "Knowledge is understanding or learning about the unknown. ", "Knowledge is obtained while information is acquired. ", "Knowledge involves the gathering of information and data. It is the sum total of what has been perceived, discovered, or inferred. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("84.", "Which of the following is correct about microeconomics? ", 0, 0, 0, 0, 0, "It is concerned with overall economy. ", "It studies the growth of a specific country. ", "It focuses on Gross Domestic Product (GDP). ", "It deals with the determination of prices. ", "Microeconomics studies the behavior of consumers and producers. It deals with the, determination of prices and summarizes the interrelationship between these economic agents. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("85.", "Which of the following shows the difference between knowledge and myth?", 0, 0, 0, 0, 0, "Knowledge is associated with beliefs and traditions while myth emerges out of critical reading. ", "Myth is the product of scientific discovery while knowledge is gained through critical reading. ", "Myths are beliefs that cannot be proven to be true wile knowledge is the product of scientific facts. ", "Myth is no more important in African societies while knowledge essential to enhance social development ", "Truth is Human knowledge is built based on scientific facts whereas myth is they are not proven to be true through scientific methods of investigation. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("86.", "According to the principle of the capitalist free market economic system, economic agents such as producers and consumers have the freedom of decision making. What does this mean? ", 0, 0, 0, 0, 0, "Manufacturer. and consumers interact based on the principle of free market economy. ", "Manufacturing industries are completely free from government rules and regulations. ", "Government institutions fix market prices to protect the wellbeing of consumers. ", "Producers are under strict control of government agents and public financial institutions. ", "According to the capitalist principle the free market economy system suppliers and consumers interact based on the principle of free market economy. ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("87.", "Which of the following is the major reason for the dependency of poor countries on developed countries?", 0, 0, 0, 0, 0, "Developing countries equally benefit from their relationship with ", "Developed countries penetrate poor countries' economies through their financial and technological superiority. ", "Developing countries lack interest to have a balanced trade relationship with developed countries. ", "Developed countries genuinely support developing countries to emerge as industrial powers. ", "The problems related to dependency are not limited to the individual or country. They also affect the relationship between poor and rich countries in the international context. Dependency is the notion that a country fully relies on the support of other countries and international organizations in many different ways for example developed countries through their financial and penetrates poor countries economy through their financial and technological superiority.", "c", 0, 1, this.f509b));
        arrayList.add(new questions("88.", "Some poor countries take protective practices to reduce their dependence on developed countries. Which of the following is an example of such practices? ", 0, 0, 0, 0, 0, "Expelling foreign industries working in their country, ", "Terminating trade relationships with developed countries. ", "Stopping the import of manufactured goods from industrialized countries. ", "Supporting domestic industries to produce manufactured goods. ", "Some poor countries take protectives to reduce their dependence on developing countries is supporting domestic industries to produce manufactured goods. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("89.", "What is the major assumption of Agricultural Development Led Industrialization? ", 0, 0, 0, 0, 0, "Industrialization is a precondition for the development of the agricultural sector. ", "Industrial development shall be achieved to accelerate agricultural development ", "Enhancing agricultural development is essential to accelerate industrial development ", "Industrialization must produce the initial capital to the development of the agricultural sector. ", "Agricultural Development Led Industrialization (ADLI). This development strategy is based on the idea that, first the agricultural sector must develop, and then, from the development of the agricultural sector, the industrial sector could develop. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("90.", "Which of the following is true about the separation of powers among the legislative, executive, judiciary? ", 0, 0, 0, 0, 0, "The division of government into three branches guarantees the prevalence of a limited government. ", "The major purpose of the division of power among the three branches is to limit government authority, ", "The three branches of government check the power of each other in every forms of government. ", "The division of powers and system of checks and balances effectively work in totalitarian governments. ", "The separation of powers among the three branch of government function independently checks the power of each other in every form of government. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("91.", "Since the outbreak of conflict in South Sudan in 2013, IGAD under the Chairmanship of Ethiopia is working hard to achieve peaceful settlement of the dispute. Which of the following refers to this role of IGAD under the chairmanship of Ethiopia? ", 0, 0, 0, 0, 0, "Negotiation ", "Litigation", "Arbitration", "Mediation", "Since the outbreak of conflict in South Sudan in 2013, IGAD under the chairmanship of Ethiopia is working hard to achieve peaceful settlement of the dispute. The role Ethiopia chairmanship wider the IGAD is negotiating the two conflated bodies.  ", "a", 0, 1, this.f509b));
        arrayList.add(new questions("92.", "Which of the following is the basic function of diplomacy? ", 0, 0, 0, 0, 0, "Negotiating international financial aid to the country. ", "Formulating foreign policy of the country. ", "Gathering and conveying information relevant to the country. ", "Lobbying the Diaspora to support the government on power. ", "The basic functions of diplomacy have been to convey and gather information relevant to a country. Those working in diplomatic missions assist in the formulation of foreign policies made by governments in matters of war and peace. ", "c", 0, 1, this.f509b));
        arrayList.add(new questions("93.", "Which of the following can be an example of civic participation? ", 0, 0, 0, 0, 0, "police officer who is leading a community police office in a woreda.", "Secondary school student who is active member in the school environmental protection club. ", "Grade 12 student who is committed to read to pass University entrance examination ", "A teacher who is committed to prepare simplified reading notes for students on the subject he/she is teaching. ", "Civic participation is actions outside politics, church, military etc. for example the secondary school student who is active members in school environment protection club.", "b", 0, 1, this.f509b));
        arrayList.add(new questions("94.", "Which of the following is correct about decision making? ", 0, 0, 0, 0, 0, "Decisions may be made based on facts, opinions and feelings. ", "Any decision requires absolute certainty on all possible alternatives. ", "It is better not to make any decisions than taking high risks. ", "Best decision making involves flexibility to change the decision at a point. ", "Decision making requires absolute certainty on all possible alternatives. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("95.", "Which one of the following is a correct statement about patriotism? ", 0, 0, 0, 0, 0, "In the modern practice of defending a country in which technology plays big role, patriotism is no more important. ", "The sense of ethics limits citizens' commitment to sacrifice their lives to the nation. ", "The traditional meaning of patriotism is irrelevant in any form for the current generations ", "To be a patriot means having a deep concern to a community and a country. ", "Patriotic citizens have various duties and responsibilities. These duties are related to promoting the public interest.at local and national levels. Patriot means having deep concern to a community and country. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("96.", "Democratic rights are different from human rights in that democratic rights are, ", 0, 0, 0, 0, 0, "neither given to individuals, nor should be denied. ", "granted by democratic constitutions. ", "respected by all nations of the world in a uniform manner. ", "fully enjoyed in developed countries of the world. ", "Democratic right different from human rights are Granted by democratic constitution whereas the human rights are neither given to individuals nor should be denied. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("97.", "Which of the following events signify Ethiopian history from international perspective? ", 0, 0, 0, 0, 0, "The Ethiopian student's movement and the downfall of Emperor Haile Selassie in 1974. ", "Ethiopia's joining the League of Nation in 1923 as a member alongside Liberia and South Africa from the African continent ", "The establishment of Minilik II school in 1908 ", "The discovery of the fossil of Lucy in Hadar area of Afar significance in locating Ethiopia as origin of humankind ", "Ethiopia joined the League of Nations in 1923, three years after its establishment is one of the events that signify Ethiopian history from the international perspective. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("98.", "The participation of Prime Minister Hailemariam Desalegn in the monthly community-based Addis Ababa city cleaning activity in 2017 can signify which of the following personal quality expected from a leader? ", 0, 0, 0, 0, 0, "Versatility ", "Being realistic", "Good communicator ", "Being motivator ", "The participation the ex-prime minster Hailemariam Desalegn in the monthly community-based Addis Ababa city cleaning activity in 2017 can signify being motivator personal quality of leader. ", "d", 0, 1, this.f509b));
        arrayList.add(new questions("99.", "What is the major reason for those who consider affirmative action as unjust? ", 0, 0, 0, 0, 0, "Affirmative action itself promotes reverse discrimination by favoring a group. ", "Affirmative actions never achieved their objectives correcting the past injustice. ", "Affirmative action threatens the vested interest of men in the society. ", "Affirmative actions can lead countries to civil rights movements and civil wars. ", "The major reason for those who consider Affirmative Action as unjust is never achieving their objectives Correcting the past injustice. ", "b", 0, 1, this.f509b));
        arrayList.add(new questions("100.", "HIV/AIDS is a global problem that requires global action because, it is a, ", 0, 0, 0, 0, 0, "communicable disease that transmits through inhaling air carrying the virus. ", "responsibility of UN agencies to deal with such diseases that transmit through body fluids.", "disease that affects humans irrespective of age, color, race, religion or occupation.", "a danger that brought a number of organizations across the world in support of victims. ", "HIV/AIDS is a global problem that requires global intervention to stop it. Because all human being irrespective of age, color, race, religion occupation.", "c", 0, 1, this.f509b));
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
        this.f510tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2010.this.timer.setVisibility(0);
                    civics2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    civics2010.this.scr.setVisibility(8);
                    civics2010.this.chr.stop();
                    civics2010.this.toolbar.setVisibility(8);
                    civics2010.this.Relative.setBackgroundColor(-7829368);
                    civics2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2010.this.getBaseContext());
                    int unused = civics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2010.this.highscoreCivics2010 = defaultSharedPreferences.getInt("civ2010hs", 0);
                    int access$600 = civics2010.this.part1 + civics2010.this.part2 + civics2010.this.part3 + civics2010.this.part4 + civics2010.this.part5 + civics2010.this.part6 + civics2010.this.part7 + civics2010.this.part8 + civics2010.this.part9;
                    civics2010.this.resultText.setText(String.valueOf(access$600));
                    civics2010.this.progressbar.setProgress(access$600);
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
                    int unused11 = civics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = civics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = civics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = civics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = civics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = civics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = civics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = civics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "civ2010hs";
                    int unused19 = civics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = civics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = civics2010.this.answered1 + civics2010.this.answered2 + civics2010.this.answered3 + civics2010.this.answered4 + civics2010.this.answered5 + civics2010.this.answered6 + civics2010.this.answered7 + civics2010.this.answered8 + civics2010.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > civics2010.this.highscoreCivics2010) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - civics2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1civ101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1civ102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1civ103", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1civ104", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1civ105", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1civ106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1civ107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1civ108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1civ109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1civ1010", 0);
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
                        editor.putString("scoreciv101", str3);
                        editor.putLong("date1civ101", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreciv102", str5);
                            editor.putLong("date1civ102", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreciv103", str5);
                            editor.putLong("date1civ103", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreciv104", str5);
                            editor.putLong("date1civ104", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreciv105", str5);
                            editor.putLong("date1civ105", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreciv106", str5);
                            editor.putLong("date1civ106", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreciv107", str5);
                            editor.putLong("date1civ107", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreciv108", str5);
                            editor.putLong("date1civ108", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreciv109", str5);
                            editor.putLong("date1civ109", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreciv1010", str5);
                            editor.putLong("date1civ1010", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateciv101", 0);
                    long j12 = defaultSharedPreferences.getLong("dateciv102", 0);
                    long j13 = defaultSharedPreferences.getLong("dateciv103", 0);
                    long j14 = defaultSharedPreferences.getLong("dateciv104", 0);
                    long j15 = defaultSharedPreferences.getLong("dateciv105", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateciv106", 0);
                    long j17 = defaultSharedPreferences.getLong("dateciv107", 0);
                    long j18 = defaultSharedPreferences.getLong("dateciv108", 0);
                    long j19 = defaultSharedPreferences.getLong("dateciv109", 0);
                    long j20 = defaultSharedPreferences.getLong("dateciv1010", 0);
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
                        editor2.putString("iScoreciv101", str4);
                        editor2.putLong("dateciv101", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreciv102", str6);
                            editor2.putLong("dateciv102", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreciv103", str6);
                            editor2.putLong("dateciv103", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreciv104", str6);
                            editor2.putLong("dateciv104", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreciv105", str6);
                            editor2.putLong("dateciv105", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreciv106", str6);
                            editor2.putLong("dateciv106", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreciv107", str6);
                            editor2.putLong("dateciv107", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreciv108", str6);
                            editor2.putLong("dateciv108", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreciv109", str6);
                            editor2.putLong("dateciv109", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreciv1010", str6);
                            editor2.putLong("dateciv1010", l.longValue());
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
                        civics2010.this.scr.setVisibility(8);
                        civics2010.this.chr.stop();
                        civics2010.this.toolbar.setVisibility(8);
                        civics2010.this.Relative.setBackgroundColor(-7829368);
                        civics2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2010.this.getBaseContext());
                        int unused = civics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = civics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = civics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = civics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = civics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = civics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = civics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = civics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = civics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = civics2010.this.highscoreCivics2010 = defaultSharedPreferences.getInt("civ2010hs", 0);
                        int access$600 = civics2010.this.part1 + civics2010.this.part2 + civics2010.this.part3 + civics2010.this.part4 + civics2010.this.part5 + civics2010.this.part6 + civics2010.this.part7 + civics2010.this.part8 + civics2010.this.part9;
                        TextView access$1600 = civics2010.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        civics2010.this.progressbar.setProgress(access$600);
                        civics2010.this.progressbar.setMax(100);
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
                        int unused11 = civics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = civics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = civics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = civics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = civics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = civics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = civics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = civics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = civics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = civics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = civics2010.this.answered1 + civics2010.this.answered2 + civics2010.this.answered3 + civics2010.this.answered4 + civics2010.this.answered5 + civics2010.this.answered6 + civics2010.this.answered7 + civics2010.this.answered8 + civics2010.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > civics2010.this.highscoreCivics2010) {
                            edit.putInt("civ2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - civics2010.this.chr.getBase()) / 1000;
                        String str = "dateciv109";
                        String str2 = "dateciv108";
                        String str3 = "dateciv107";
                        String str4 = "dateciv106";
                        String str5 = "dateciv105";
                        String str6 = "dateciv104";
                        String str7 = "dateciv103";
                        String str8 = "dateciv102";
                        String str9 = "dateciv101";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1civ1010";
                        String str11 = "date1civ109";
                        if (civics2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1civ101", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1civ102", 0);
                            long j3 = defaultSharedPreferences.getLong("date1civ103", 0);
                            String str13 = "date1civ103";
                            String str14 = f;
                            String str15 = "date1civ101";
                            long j4 = defaultSharedPreferences.getLong("date1civ105", 0);
                            String str16 = "date1civ105";
                            String str17 = "date1civ104";
                            String str18 = "date1civ106";
                            long j5 = defaultSharedPreferences.getLong("date1civ106", 0);
                            long j6 = defaultSharedPreferences.getLong("date1civ107", 0);
                            String str19 = str11;
                            String str20 = "date1civ108";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1civ102";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1civ104", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1civ107";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1civ108", 0));
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
                                editor3.putString("scoreciv101", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoreciv102", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoreciv103", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoreciv104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoreciv105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoreciv106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoreciv107", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoreciv108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoreciv109", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoreciv1010", str25);
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
                            long j18 = sharedPreferences.getLong("dateciv1010", 0);
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
                                editor4.putString("iScoreciv101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoreciv102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoreciv103", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoreciv104", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoreciv105", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoreciv106", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoreciv107", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoreciv108", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoreciv109", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoreciv1010", str28);
                                    editor4.putLong("dateciv1010", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1civ101";
                            String str30 = "date1civ104";
                            String str31 = str11;
                            String str32 = "date1civ102";
                            String str33 = "date1civ107";
                            String str34 = "date1civ105";
                            String str35 = "date1civ106";
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
                            long j21 = sharedPreferences2.getLong("date1civ103", 0);
                            String str40 = str32;
                            String str41 = "date1civ103";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1civ108";
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
                                editor2.putString("scoreciv101", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoreciv102", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoreciv103", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoreciv104", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoreciv105", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoreciv106", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoreciv107", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoreciv108", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoreciv109", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoreciv1010", str49);
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
                            long j38 = sharedPreferences3.getLong("dateciv1010", 0);
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
                                editor.putString("iScoreciv101", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoreciv102", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoreciv103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoreciv104", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoreciv105", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoreciv106", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoreciv107", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoreciv108", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoreciv109", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoreciv1010", str56);
                                    editor.putLong("dateciv1010", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        civics2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2010.this.scr.setVisibility(8);
                civics2010.this.chr.stop();
                civics2010.this.toolbar.setVisibility(8);
                civics2010.this.Relative.setBackgroundColor(civics2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2010.this.scr.setVisibility(0);
                civics2010.this.toolbar.setVisibility(0);
                civics2010.this.telegram_layout.setVisibility(8);
                civics2010.this.chr.start();
                civics2010.this.Relative.setBackgroundColor(civics2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = civics2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = civics2010.this.mInterstitialAd = null;
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
                civics2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
