package com.visionapps.grade12;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
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
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class civics2007 extends AppCompatActivity {
    private Object Menu;
    /* access modifiers changed from: private */
    public RelativeLayout Relative;
    private Button actualReport;

    /* renamed from: b */
    private Boolean f503b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreCivics2007;
    /* access modifiers changed from: private */
    public View layout;
    private Boolean mode;
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
    private Toolbar f504tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics2007);
        this.f503b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextCivics2007);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_Civics2007);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Who was the leader of the black civil rights movement killed in April 1968 after addressing his last speech? ", 0, 0, 0, 0, 0, "Rosa Parks", "Allan John", "Mohandas Gandhi", "Martin Luther King ", "Dr, Martin Luther King was the leader of the black civil rights movement in America was killed in April 1968 after addressing his last speech", "d", 0, 1, this.f503b));
        arrayList.add(new questions("2.", "What is meant by treating others the way you want to be treated as well as impartial treatment of people? ", 0, 0, 0, 0, 0, "Fairness", "Truthfulness ", "Honest ", "Courage ", "A. Fairness is meant treating others the way you want to be treated as well as impartial treatment of people. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("3.", "When did Ethiopia become the member of the League of Nations? ", 0, 0, 0, 0, 0, "1920", "1921 ", "1923 ", "1925 ", "Ethiopia became the member of the League of Nation in 1932", "c", 0, 1, this.f503b));
        arrayList.add(new questions("4.", "Which African countries joined the League of Nations besides Ethiopia? ", 0, 0, 0, 0, 0, "Kenya and Tunisia.", "Liberia and South Africa.", "Algeria and Egypt. ", "Ghana and Nigeria. ", "In addition to Ethiopia the Republic of South Africa under the Apartheid and Liberia which were also joined the League of Nations.", "b", 0, 1, this.f503b));
        arrayList.add(new questions("5.", "When was the Organization of African Union (OAU) transformed into African Union (AU)? ", 0, 0, 0, 0, 0, "2002 ", "2004 ", "2006", "2009 ", "Cooperation among states for economic development, regional organization have been setup. But to overcome the problem of the OAU and to speed up African political and economic integration the Union was established in 2004. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("6.", "Which right is different from the others? ", 0, 0, 0, 0, 0, "Right to Life. ", "Right to Liberty. ", "The right to the security of persons. ", "The right to assembly and demonstration.", "The Human Rights can be defined as rights that universally belong to people regardless of sex, race, color, language, national origin, age, religion or political beliefs. As a citizen, you have the right to life where as the Democratic Rights are fundamental rights of individuals and peoples in a democratic society that are protected by the law and those rights mainly reserved for citizens of a democratic nation. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("7.", "Why is the Kyoto Protocol is so significant? ", 0, 0, 0, 0, 0, "Because it is directed at fighting international crimes. ", "Because it is adopted to reduce greenhouse gas emissions. ", "Because its main agenda on equitable use of international rives. ", "Because it is made to find solutions for refugees throughout the world. ", "The Kyoto protocol is very important because it adopt the initiatives to reduce the greenhouse gas emissions.", "b", 0, 1, this.f503b));
        arrayList.add(new questions("8.", "Which of the following is a peaceful way of settling disputes with the involvement of a third party? ", 0, 0, 0, 0, 0, "Arbitration ", "Negotiation ", "Mediation ", "Litigation", "Mediation: Is a method of non-binding dispute resolution involving a neutral third party who tries to help the disputing parties reach a mutually agreeable solution. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("9.", "Which one of the following can best define a democratic constitution? ", 0, 0, 0, 0, 0, "It gives ultimate power to the concerned peoples ", "It establishes different social classes of a given society. ", "It reflects the psychological and moral values of the society. ", "It is a legal law subjugated to some other laws of the country ", "The Democratic Constitution states that the source of power is Peoples or the ultimate power is in the hand of the people ", "", 0, 1, this.f503b));
        arrayList.add(new questions("10.", "Which of the following attributes refers to a person who is ready to listen to others' views? ", 0, 0, 0, 0, 0, "Civility ", "Open mindedness ", "Honest ", "Civic mindedness ", "A person who pays attention to different ideas and arguments could be regarded as Open — minded. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("11.", "It is underscored that the chance of the vulnerability or women to HIV/AIDS is twenty times compared to men. What is the main reason for this problem", 0, 0, 0, 0, 0, "This is because women are exposed for abduction. ", "This is because women usually use sharp iron tools compared to men.", "This is because women have easily vulnerable tissues during sexual intercourse.", "This is because women are naturally weaker and easily exposed for ", "it underscored that the chance of vulnerability of women to HIV/ADIS is twenty times compared to men. This is mainly because women have easily vulnerable tissues during sexual intercourse. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("12.", "What strategy is devised to achieve the development of Ethiopia? ", 0, 0, 0, 0, 0, "The tourism sector must develop first and then the industrial sector. ", "Both the agricultural and the industrial sectors must develop together ", "The agricultural sector must develop first followed by the industrial sector.", "The industrial sector must develop first followed by the agricultural sector. ", "our country Ethiopia used the economic development strategy known as that agricultural development led industry (ADLI) mean agricultural sector must develop first followed by the industrial sector. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("13.", "What form of democracy -has recently been adopted by the Ethiopian government? ", 0, 0, 0, 0, 0, "Neo - liberalism. ", "Social democracy ", "Liberal democracy", "Developmental democracy", "the Ethiopian government currently followed the policy or system democratic developmental states. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("14.", "Where did Ethiopia play a role in peace keeping mission? ", 0, 0, 0, 0, 0, "Angola ", "Congo ", "North Korea ", "South Africa ", "Ethiopia contributed peacekeeping forces to UN missions in Korea and Congo in the early years of the existence of the organization. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("15.", "Which of the following peoples' movement was the first to join the Tigray Peoples Liberation Front to create the Ethiopian people’s Revolutionary Democratic front? ", 0, 0, 0, 0, 0, "The Oromo peoples' Democratic Movement ", "The Ethiopian people's Democratic Movement ", "The south Nations, Nationalities, and Peoples' Movement. ", "The Ethiopian Democratic Officers' Revolutionary Movement", "In 1989 the TPLF gained decisive victory at the battle of shire. TPLF was determined to liberate the whole of the country from the military regime. To this end the Ethiopian people's Revolutionary Democratic Front formed. This Front was made up of the TPLF, the Ethiopia people's Democratic Oromo people's Democratic Organization (OPDO) and the Ethiopian Democratic Officers Revolutionary Movement (EDORM). ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("16.", "Who used the Crowned Lion of Judah as the emblem of the Ethiopian flag during his reign? ", 0, 0, 0, 0, 0, "Hileselassie I. ", "Menelik II", "Tekle-Giorgise ", "Yohannes IV", "The crowned Lion of Judah as the emblem of the Ethiopian flag used during the region of Emperor HaileSelassie I. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("17.", "Which of the following refers to a kind of a person who is unwilling to understand the qualities of other cultures and considering his or her own culture as superior to others? ", 0, 0, 0, 0, 0, "Civic-minded ", "Ethnocentric ", "Tolerant", "Open minded ", "A kind of person who is unwilling to understand the qualities of other cultures and considering his or her own culture as the superior to others is known as the ethnocentric person. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("18.", "What is the correct constitutional name for one of the member states in the Federal Democratic Republic of Ethiopia? ", 0, 0, 0, 0, 0, "The Afar Regional state.", "The Afar National state.", "The Afar Regional National state ", "The Afar National Regional state. ", "The correct constitutional name of one of the members of states in the Federal Democratic Republic of Ethiopia is the Regional National State. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("19.", "Which of the following is the best manifestation of corruption? ", 0, 0, 0, 0, 0, "Dowry", "Cheap labor ", "Nepotism ", "Holiday banquet ", "The best manifestation of corruption is Nepotism which is the action taken by government officials who favour their own relatives, often at the expense of others. For example, when the manager appoints his/her own family members to work in the office rather than advertising and selecting fairly from other candidates. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("20.", "What types of rights are exclusively reserved only to citizens in a state? ", 0, 0, 0, 0, 0, "Civil rights ", "Moral rights ", "Human rights", "Political rights ", "Political rights are the exclusively reserved only to the citizens. The rights are the right to election and forming political parties. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("21.", "What kind of party system is currently followed by Ethiopia? ", 0, 0, 0, 0, 0, "Single Party System", "Two Dominant Party systems", "Multi-Party System ", "One Dominant party", "One of the characteristics of democratic system is the existence different political parties in the country or multi part system. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("22.", "Which of the following is correct about Ethiopian languages as stipulated in the constitution of the Federal Democratic Republic of Ethiopia? ", 0, 0, 0, 0, 0, "Amharic shall be the state language of the country ", "Amharic shall be the working language of member states ", "Regional states can have their own respective working language, ", "All Ethiopian languages shall be recognized based on the size of their speakers ", "Article 5 of the Federal Democratic Republic of Ethiopia constitution stimulated that; \n-\tAll Ethiopian languages shall enjoy equal state recognition. \n-\tAmharic shall be the working language of the Federal Government. \n-\tMembers of the Federation may by law determine their respective working languages. \n", "b", 0, 1, this.f503b));
        arrayList.add(new questions("23.", "Which of the following is correct about the current Ethiopian court system? ", 0, 0, 0, 0, 0, "The empowerment of judges who are directed by the law. ", "The existence of a judiciary system that is controlled by the government ", "The absence of recognition to traditional courts operating based on religious principles. ", "The absence of recognition to traditional courts operating based on unwritten laws. ", "The court system of federal democratic republic of Ethiopia is empowered by the directed by the law. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("24.", "Which of the following can best explain a legitimate government? ", 0, 0, 0, 0, 0, "It safeguards the rights of interest groups ", "If fails to uphold transparency and accountability ", "Its can function beyond the limit of the constitution ", "It receives its mandate of governing from the people ", "the legitimate power is democratic power which is receives its mandate of governing from the people. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("25.", "Why is constitutionalism valued as a fundamental constitutional principle? Because it:", 0, 0, 0, 0, 0, "Makes citizens subservient to government ", "Enables a government to exercise its will over the people ", "Binds the government to act in accordance with the constitution ", "Allows government to exercise extra-constitutional authorities.", "Constitutionalism valued as a fundamental constitutional principle because all the governed and the governing are equally responsible for the Constitution. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("26.", "Which of the following is correct about the conduct and accountability of the Government as stipulated in Article 12 of the Current Ethiopian Constitution? ", 0, 0, 0, 0, 0, "The conduct of affairs of government shall be secretive ", "The government shall defend the failure of public officials ", "An elected representative has the right to access national secret. ", "In case of loss of confidence, the people have the right to recall an elected representative", "Article 12 of the Federal Democratic Republic of Ethiopia constitution stimulated that Conduct and Accountability of Government \n-\tThe conduct of affairs of government shall be transparent: \n-\tAny public official or an elected representative is accountable for any failure in official duties \n-\tIn case of loss of confidence, the people may recall an elected\n", "d", 0, 1, this.f503b));
        arrayList.add(new questions("27.", "Which government body is responsible for appointing judges of the Federal courts of Ethiopia? ", 0, 0, 0, 0, 0, "The Head of the state ", "The Council of Ministers ", "The President of the supreme Court ", "The House of Peoples Representatives ", "According to article 81 the Federal Democratic Republic of Ethiopia Constitution the appointment of Federal judges, the Prime Minister shall submit to the House of Peoples' Representatives for appointment Candidates selected by the Federal Judicial Administration Council", "d", 0, 1, this.f503b));
        arrayList.add(new questions("28.", "Which one of the following is put in a correct order of sequence regarding scientific methods of research? ", 0, 0, 0, 0, 0, "Data collection  Hypothesis  Analysis  Evaluation of Results  Conclusion. ", "Analysis  Evaluation of Results  Data collection  Hypothesis  Conclusion.", "Hypothesis  Data Collection  Analysis  Evaluation of Results  Conclusion.", "Analysis  Hypothesis  Data collection  Conclusion  Evaluation of Results.", "the correct order of sequence regarding scientific methods of research is Data collection – Hypothesis – Analysis – Evaluation - conclusion. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("29.", "Which of the following is correct about the Millennium Goals of Ethiopia? ", 0, 0, 0, 0, 0, "Federating Ethiopia with Djibouti. ", "Finding solution for Sudan- South Sudan civil war. ", "Decreasing the death of mother's and child on birth. ", "Making the horn of Africa free from any war and conflict ", "one of the millennium goals of Ethiopia is to decrease the death of children by 2015.", "c", 0, 1, this.f503b));
        arrayList.add(new questions("30.", "What form of government best represents the commonness of extra - constitutional power by those who assume state power? ", 0, 0, 0, 0, 0, "Aristocracy ", "Democracy ", "Oligarchy ", "Dictatorship ", "dictatorship is the form of government that assumes extra constitutional power by those who assumed state power. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("31.", "Which of the following statements can best describe the federal Democratic Republic of Ethiopia? ", 0, 0, 0, 0, 0, "Ordinary laws at the Federal level are made by the Parliament ", "At the Federal level the higher executive powers are given to Parliament ", "Ordinary laws at the regional level are made by the state Administration ", "At the Regional level the state Council is the highest organ of executive power ", "", "d", 0, 1, this.f503b));
        arrayList.add(new questions("32.", "Which of the following best expresses the concept of arbitration as a way of conflict resolution? ", 0, 0, 0, 0, 0, "It is a proceeding by a party or parties against another in a court of law. ", "It is a means of applying legal principles to a controversy for final solution. ", "It involves direct discussion between or among the parties to reach an agreement ", "Is a method of non-binding dispute resolution involving a neutral third party ", "Arbitration is a means of applying legal principles to a controversy within limits previously agreed upon by the disputing parties. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("33.", "What basic principle is underlined in due process of law?", 0, 0, 0, 0, 0, "An accused person has the right to be represented by a legal counsel ", "An accused person can be considered guilty as soon as he/she comes under control ", "supporting unequal accessibility of court and tribunals to' any person committee serious crime. ", "An accused person suspected for matters to national security has the right to a quick public trial.", "Due process of law: means, the conduct of legal proceedings according to established rules and principles for the protection and enforcement of private rights including notice and- the right to a fair hearing before a tribunal with the power to decide the case. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("34.", "How and when can the current Ethiopian Constitution be amended? ", 0, 0, 0, 0, 0, "When two-thirds of the country's population votes to approve the proposed amendment ", "When the Prime Minister and the President agrees to approve the proposed amendment. ", "When the Regional State Administration and state Councils jointly approve a proposed amendment by a majority vote ", "When the House o peoples' Representatives and the House of the Federation in a joint session, approve a proposed amendment by a two thirds majority vote. ", "Any proposal for constitutional amendment, if supported by two-thirds majority vote in the House of Peoples' Representatives, or by a two thirds majority vote in the House of the Federation or when one-third of the State Councils of the member States of the Federation, by a majority vote in each Council have supported it, shall be submitted for discussion and decision to the general public and to those whom the amendment of the Constitution concerns. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("35.", "Which principle of the Hippocratic Oath is currently recognized in Ethiopia? ", 0, 0, 0, 0, 0, "Giving priority to patients who are elder ", "Assisting patients and keeping their secret", "Insulting fellow physicians when they make error on job ", "Providing assistance to patients who prefer to commit suicide. ", "the Hippocratic Oath is currently recognized in Ethiopia by graduate of medicine in order to assisting patents and keeping their secret ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("36.", "Which of the following is correct about Ordinary Laws? ", 0, 0, 0, 0, 0, "They are above the constitution ", "They are enacted through a proclamation. ", "They can contradict with the Constitution. ", "They are made by a Constituent Assembly. ", "ordinary law comprises the body of those principles and rules of action relating to the existence of government, security of persons and property. This arises from the usage, customs, judgments and decrees of counsel recognizing, affirming and enforcing such usage and custom. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("37.", "What is the objective of the Ethiopian foreign policy? ", 0, 0, 0, 0, 0, "Promoting relation with states standing for religious fanatic ", "Respecting conventions which challenge Ethiopia's interest ", "Establishing a geographically defined relation with some countries. ", "Creating economic and cultural ties with countries supporting Ethiopia’s enemy. ", "The 1995 Constitution of Ethiopia Article 86 has clearly stated the country's foreign policy objectives and principles as follow: \nTo promote policies of foreign relations based on the protection of national interests and respect for the sovereignty of the country. To promote mutual respect for national sovereignty and equality of states and non-interference in the internal affairs of other states.\n", "", 0, 1, this.f503b));
        arrayList.add(new questions("38.", "What makes the Presidential Democratic system different from the Parliamentary one? ", 0, 0, 0, 0, 0, "The President is elected from the winning party ", "Once elected, The President has unlimited power. ", "The President heads the executive branch of the government ", "The check and balance between the three branch of government is weak in it.", "what make the Presidential democratic system different from the parliamentary one is the President heads the Executive Branch and the representatives head the Legislative Branch of government ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("39.", "Which of the following is correct about a federal state structure? ", 0, 0, 0, 0, 0, "It is conducive to too small stated. ", "It is suitable for multi-ethnic society. ", "It is characterized by centrally controlled power. ", "It is impossible to organize units based on natural boundaries. ", "Federalism is a system of government where power is divided Between federal and regional governments. Devolution, the principle of federalism, means to transfer power to the regions that constitute the federation. It is suitable for multi ethnic society. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("40.", "What constitutional rights are given to the regional states of the FDRE? ", 0, 0, 0, 0, 0, "The right to have their own anthem as a symbol of their state ", "The right to recruit and train their own defense force to keep security. ", "The right to formulate and establish their own external relations. ", "The power to control the Supreme Court of the central government. ", "one of the constitutional rights given to the regional states of the FDRE is the right to have their own anthem as the symbol of their state. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("41.", "Which of the following can best describe parliamentary structure of government? ", 0, 0, 0, 0, 0, "The head of the government is the president. ", "The role of the head of government is ceremonial. ", "The prime minister is elected by popular vote of citizens. ", "The head of the government is responsible to the legislature. ", "in the parliamentary structure the Prime Minister leads Executive branch of government and at the same time is the member of the legislative branch", "d", 0, 1, this.f503b));
        arrayList.add(new questions("42.", "What does the phrase Justice delayed is justice denied express? ", 0, 0, 0, 0, 0, "It expresses that justice coming late is unacceptable. ", "It emphasizes the right to be tried without undue delay. ", "The need to reject possible appeal time to a higher court. ", "The need to disapprove the time spent before the trial begins. ", "justice delayed is justice denied it emphasize the right to be tried without undue of citizens.", "b", 0, 1, this.f503b));
        arrayList.add(new questions("43.", "In democratic society a \"good citizenship is the active side of one's character\". Which of the following statements best reflects the message of the phrase in the quotation mark? ", 0, 0, 0, 0, 0, "One must apply the principles of citizenship in his or her conduct ", "The character of good citizenship cannot be acquired through learning. ", "Theoretical knowledge is the science aspect of good citizenship. ", "Good citizenship is an art to be practiced through civic commitment ", "in democratic society a' good citizenship is the active side of one's charter 'means good citizens is an art to be practiced through civic commitments.", "d", 0, 1, this.f503b));
        arrayList.add(new questions("44.", "What does state sovereignty imply? ", 0, 0, 0, 0, 0, "Superiority of one state over the other. ", "Non-interaction among sovereign states. ", "Non-intervention in the domestic affairs of states. ", "Unquestionability of domestic rules and decisions. ", "sovereignty implies non-intervention in domestic affairs of states. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("45.", "What does habeas corpus refer to?", 0, 0, 0, 0, 0, "An accused person has the right to a quick public trial. ", "A person shall not be accused again for a single crime already treated. ", "A self-incriminating person has no burden to prove his or her innocence. ", "A person arrested by a police man has the right to know why he or she is arrested. ", "Habeas corpus: is a remedy that is available to a person who is arrested illegally and/ or who is not brought before a court of law within the legally prescribed time. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("46.", "Which one of the following sentences is correct about co-operation and competition among nations? ", 0, 0, 0, 0, 0, "Co-operation cropes up tensions resulting from competition for resource. ", "Countries co-operate to protect and preserve their natural and cultural heritages. ", "Co-operation between two nations lasts long when it is based on unequal benefits. ", "Countries cooperate for inequitable use of natural resources. Such as cross — boundary Rivers. ", "Countries cooperate to protect and preserve their natural resources and cultural heritages.", "b", 0, 1, this.f503b));
        arrayList.add(new questions("47.", "Which of the following is an expected duty of a patriot citizen? ", 0, 0, 0, 0, 0, "Sacrificing personal interest for the common good. ", "Giving access state's secret to neighboring countries. ", "Avoiding of criticizing government policies based on evidence ", "Keep away from taking part in voluntary activities so as to save time. ", "one of the duties of patriotic citizen is sacrificing personal interest for the common goods. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("48.", "Which of the following approaches has a direct role in preventing corruption? ", 0, 0, 0, 0, 0, "Ethical regulations. ", "Registration of properties of citizens", "Laws related to financial administration and auditing systems. ", "The emergence of groups interested in accumulating wealth at others/ expense.", "the solution to avoid corruption lies with the citizens. Citizens have to respect the constitution, be honest and truthful (ethical regulation) in their daily activities and be ready to combat corruption in every way possible. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("49.", "What is correct regarding deliberate transmission of HIV/AIDS? ", 0, 0, 0, 0, 0, "It is considered as a suicide.", "It can be taken as a serious crime of homicide. ", "It can be seen as part of the HIV/AIDS victims attempt to share his/her pain. ", "It can be seen as part of the HIV/AIDS patients effort to exploit his/her rights and duties. ", "Deliberate Transmission of HIV/ADIS is considered as a crime of homicide which is the deliberate murder of an individual. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("50.", "What is meant by morality? ", 0, 0, 0, 0, 0, "It is a way of behaving according to legal laws. ", "It is a system that tells a person to act against nature.", "It is principles which are similar throughout the world. ", "It is a standard examining the rightness and wrongness of our acts. ", "morality is a standard examining the rightness and wrongness of our acts in the society. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("51.", "What is the principle of the constitution of the Federal Democratic Republic of Ethiopia in relation to religion? ", 0, 0, 0, 0, 0, "There shall be state religion. ", "State and religion are inseparable ", "All religions of the land are equal in status. ", "Government shall intervene in the affairs of religion ", "according to the FDRE constitution Article II State and religion are separate. There shall be no state religion and the state shall not interfere in religious matters & religion shall not interfere in state affairs. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("52.", "Which of the following statements is correct about rule of Law? ", 0, 0, 0, 0, 0, "Rule of law is a natural law acquired by virtue of being human. ", "To practice rule of law, government must be the source of power. ", "The existence of constitutionalism guarantees the prevalence of rule of law. ", "The main major purpose of rule of law is to limit popular sovereignty. ", "Constitutions of democratic countries are the bases for the prevalence of rule of law. It establishes restrictions both on the governor and the governed; it imposes restrictions on citizens to act only according to the law and respect the rights of individuals and groups will be.", "c", 0, 1, this.f503b));
        arrayList.add(new questions("53.", "When does the Ethiopian government apply legal limitation on the right to freedom of expression? ", 0, 0, 0, 0, 0, "When a citizen criticizes against the government ", "When a citizen propagates in support of an opposition party. ", "When a citizen makes propaganda without the knowledge of the government. ", "When a citizen makes a propaganda harming the honor and reputation of individuals. ", "The government of Ethiopia apply legal limitation of the right to freedom of expression of ideas when a citizen makes propaganda harming the honour and reputation of an individuals. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("54.", "How can the concept of negotiation be best explained as a way of conflict resolution? ", 0, 0, 0, 0, 0, "It is a proceeding by a party or parties against another in a court of law. ", "It is a means of applying legal principles to a controversy for final solution. ", "Is a method of non- binding dispute resolution involving a neutral third party? ", "It involves direct discussion between or among the parties to reach an agreement. ", "Negotiation is the most common peaceful ways of settling a dispute and involves direct discussion between or among the parties to the dispute with the objective of reaching an agreement. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("55.", "Which of the following is correct about the features of federal form of states? Such as Ethiopia? ", 0, 0, 0, 0, 0, "The power of the central government is indivisible. ", "The regional governments are supreme in their own spheres. ", "The power of the regional government is given by the national ", "The existence of the local units depends on the willingness of the central government ", "The major features of federalism in Ethiopia characterized by; It is an Incentive to empower citizens at all levels to exercise power within their Own area; builds confidence among people when they are able to manage their affairs and helps to create a sense of responsibility among citizens to respect each other's rights in order to live in peace and dignity.", "b", 0, 1, this.f503b));
        arrayList.add(new questions("56.", "What is the purpose of learning civic education in academic institutions of Ethiopia, ", 0, 0, 0, 0, 0, "To forge active participation to support the ruling party. ", "To produce a personality of passive consent in the action of others ", "To affect the personality of just any kind of civic participation of a subject people. ", "To affect the personality of civic participation of informed and responsible citizens. ", "the purpose of learning civic education in academic institutions of Ethiopia is to affect the personality of civic participation of informed and responsible citizens. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("57.", "Which the following powers and functions belongs to the Regional Governments of Federal Democratic Republic of Ethiopia? ", 0, 0, 0, 0, 0, "Formulation of foreign policy. ", "Declaring state of emergency in the country. ", "Negotiating and ratifying international agreements. ", "Formulating policy on land use and natural resources. ", "one the Powers and Functions of FDRE Regional States is to formulate and execute economic, social and development policies, strategies and plans of the State. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("58.", "What does referendum refer to? ", 0, 0, 0, 0, 0, "A power referred to a government to give final decision on some problems. ", "The veto power given to the chief executive to decide on some political matters. ", "The direct participation of people in giving decision on some political matters ", "The direct participation of peoples' representatives in the politics of a country. ", "A referendum (in some countries synonymous with plebiscite --- or a vote on a ballot question) is a direct vote in which an entire electorate is asked to vote on a particular proposal. This may result in the adoption of a new law. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("59.", "Which specific right of any accused person is violated if the trial goes with an unintentional absence of the accused? ", 0, 0, 0, 0, 0, "The right to a fair and public hearing. ", "The right to be tried without undue delay", "The right to a fair trial in his or her presence. ", "The right to have free assistance of an interpreter. ", "the right to be tried without undue delay is violated if the trial of an accused goes with unintentional absence of the accused person. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("60.", "Which of the following is the best recommendation for a person who for the first time made HIV/AIDS blood test and informed that he is not victim? ", 0, 0, 0, 0, 0, "To be sure he should be retested. ", "He should be abstained from having sex. ", "Ashe is sure that he is not victim he should marry a wife. ", "Since he is sure that he is not victim he should continue his past habits. ", "the best recommendation for the person who for the first time made HIV/ADIS blood test and informed that he is not victim but to be sure he should be retested after three months. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("61.", "In which form of government is the removal of the chief executive through the process of Non — Vote of confidence practiced? ", 0, 0, 0, 0, 0, "Presidential ", "Parliamentary ", "Semi- Presidential ", "Quasi-Presidential ", "In the parliamentary system a parliamentary motion, it demonstrates to the head of state that the elected, parliament no longer has confidence in (one or more members of) the appointed government. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("62.", "Which of the following qualities is expected from a person to be a patriotic citizen? ", 0, 0, 0, 0, 0, "The person should not be law abiding. ", "The person should not be loyal to his or her country. ", "The person should work for his or her parochial interest ", "The person should be self- evident and defend his or her constitutional rights ", "one of the qualities that expected from a person to be a patriotic citizen is the person should be self-evident and defended his or her constitutional rights. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("63.", "Which of the following is correct about the personal qualities of a good leader? ", 0, 0, 0, 0, 0, "A one who falls prey to their own undoing ", "A one who is aware of how much he does not know. ", "A one who has ability to influence others without logic. ", "A one who rationalizes unethical behavior based upon current needs. ", "one of the qualities of good leader is rationalizes unethical behaviours based upon current needs. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("64.", "Which of the following is INCORRECT about saving in relation to locally produced items? ", 0, 0, 0, 0, 0, "Wastage of a lot of inputs harms a development of a country. ", "Avoiding wastage during production is one means of saving money. ", "Buying locally produced items helps to save money when they are cheaper. ", "Wastage of inputs in the main cause for decreasing cost of production. ", "In relation to saving wastage of inputs harms the development of the country; buying locally produced items help for saving and avoiding wastage during production is one way of saving. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("65.", "Which of the following does NOT develop the habit of saving among individuals? ", 0, 0, 0, 0, 0, "The act of spending money wisely ", "Balancing the needs and wants of individuals. ", "Thinking and planning about the fate of our feature. ", "The encouragement of extravagance behavior of individuals. ", "the habit of saving among individual includes; developing the act of spending money wisely; balancing the needs and wants of individuals and thinking and planning about the fate of our future.", "d", 0, 1, this.f503b));
        arrayList.add(new questions("66.", "What is true about ethics? ", 0, 0, 0, 0, 0, "Ethics is the same as feelings. ", "Ethics is the same as religion. ", "Ethics means strictly following the law. ", "Ethics is following and doing culturally accepted norms and practices. ", "Ethics (also moral philosophy) is the branch of philosophy that involves systematizing, defending, and recommending concepts of right and wrong conduct: ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("67.", "Which of the following is correct about corruption? ", 0, 0, 0, 0, 0, "It reduces public confidence in the government ", "All acts of corruption results in the payment of bribes. ", "Civil servants commit corruption in a more systematic way than government officials. ", "The fight against corruption can be successful through preventive actions than curative measures. ", "In relation the fight against corruption the preventive action is more successive than the corrective measures because Preventive approach: focuses on the preventive role that the constitution and other laws afford.\nLaws and rules related to financial administration auditing systems have a direct role in preventing corruption. Issues related to ethical regulation, having committed citizens, disclosure, registration of property and mass media all play indirect roles. \n", "d", 0, 1, this.f503b));
        arrayList.add(new questions("68.", "Which of the following statements is correct about group rights in the current Ethiopian context?", 0, 0, 0, 0, 0, "They are not treated as universal rights. ", "They are made to eliminate rights belonging to an individual. ", "They are made to favor the disadvantaged groups at others expense. ", "They are made to facilitate the realization of discrimination among peoples of the State. ", "The group rights made to favour the disadvantaged groups at Others' expenses. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("69.", "Which of the following statement goes with the principle of equality within diversity? ", 0, 0, 0, 0, 0, "Equality with diversity erodes national unity. ", "Ethnocentrism promotes equality within diversity. ", "Equality with diversity is an obstacle for national development. ", "All citizens are equal before the law regardless of cultural backgrounds. ", "The principle of equality with diversity is all citizens are equal before the law regardless of cultural background.", "d", 0, 1, this.f503b));
        arrayList.add(new questions("70.", "Which of the following is correct about the characteristics of undemocratic government? ", 0, 0, 0, 0, 0, "It believes in accountability to empower people. ", "It does not give recognition to talented people. ", "It believes that government is the source of unquestionable power. ", "It believes that legitimate power resides in the people & government. ", "The characteristics of undemocratic government includes: \n-\tWith no rules of accountability to the people. \n-\tDo not want to know what the people want they simply do what they want. \n-\tThe absence of rule of law can lead to authoritarian rule whereby individuals or groups are above the law. \n", "c", 0, 1, this.f503b));
        arrayList.add(new questions("71.", "What is the possible threat to international peace and security? ", 0, 0, 0, 0, 0, "Afforestation", "Increasing price of oil. ", "Increasing desertification. ", "Growing arms race between nations. ", "The growing arms race between nations is a possible threat to international peace and security. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("72.", "What is the possible benefit that one can get from fulfilling his/her responsibility? ", 0, 0, 0, 0, 0, "The inability to exploit his/her rights. ", "Lack of confidence and self-accomplishment. ", "The development of a sense of dependence upon others. ", "The achievement of being valued by the concerned society. ", "an individual who can fulfil his/her responsibility may achieve of being valued by the concerned society. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("73.", "Which of the following is correct about citizens combating challenges of international magnitude that affects humanity? ", 0, 0, 0, 0, 0, "Being unaware of politics and current affairs. ", "Disinclination to work together in tackling problems. ", "Acquiring knowledge and the skills as per the global reality. ", "Unwilling to co-operate with the world to eliminate the problem. ", "The citizens combating challenges of international magnitude that affect humanity acquiring knowledge and skills as per the global reality.", "c", 0, 1, this.f503b));
        arrayList.add(new questions("74.", "Which of the following factors in responsible for prompting job satisfaction? ", 0, 0, 0, 0, 0, "Lack of interest in the work. ", "Career growth through short term training. ", "Long hours of work and low financial reward. ", "Insecurity of work and unhealthy working conditions. ", "Career growth through short term training is one the factor for promoting job satisfaction. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("75.", "In the context of economic globalization, what efforts have been made by the Ethiopian government to promote foreign direct investment? ", 0, 0, 0, 0, 0, "The provision of land without lease. ", "To let investors remit part of their profit to their country. ", "The decline to give a tax holiday for foreign direct investors. ", "The provision of limited information on the possible Profitable ", "in the context of economic globalization, the Ethiopian government provides land without lease to promote foreign direct investment. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("76.", "Which of the following is correct about Drug use and trafficking? ", 0, 0, 0, 0, 0, "Drug users cannot stop taking drugs. ", "Drug users involve in robbery and theft. ", "Drug users are highly respected among their society. ", "Drug users are committed to fight illegal weapon trafficking. ", "Drug Trafficking: is the crime of using, distributing / circulating narcotic drugs and involve in robbery and theft. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("77.", "Which of the following is correct about the Ethiopian flag? ", 0, 0, 0, 0, 0, "It is a recent fabrication. ", "It serves as symbol of unity. ", "It is a purely colonial legacy. ", "It has insignificant historical value. ", "The Ethiopian flag serve as the symbol of unity for long period of time. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("78.", "What is the role of the judiciary organ in the current Ethiopia context? ", 0, 0, 0, 0, 0, "Drafting the constitution when it is required. ", "Restoring justice whenever the law is violated. ", "Encouraging controversies in order to resolve them. ", "Defending biased court officials and self- centered lawyer. ", "The judiciary organ in the current Ethiopian context restores justices whenever the low is violated ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("79.", "Which of the following ideas refers to an attempt to exterminate a clan, family or people? ", 0, 0, 0, 0, 0, "Genocide ", "Drug trafficking ", "Aggression ", "Corruption ", "Genocide is the systematic elimination of all or a significant part of a racial, ethnic, religious, or national group. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("80.", "Which of the following is considered as a criminal Offence in relation to taxation? ", 0, 0, 0, 0, 0, "Having license for your shop. ", "Unwillingness to reveal the appropriate income. ", "An attorney in a court for a person committed a crime. ", "Assisting custom officials in an effort to combat contraband trade. ", "one of the criminal offences in relation to taxation is unwilling to reveal the appropriate income. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("81.", "Which of the following is an obligation of a citizen as per the constitution of the Federal Democratic Republic of Ethiopia? ", 0, 0, 0, 0, 0, "Valuing gender disparity. ", "Respecting the government as the source of power. ", "Respecting the constitution as the supreme law of the land. ", "Fighting for and upholding the inequality of groups and individuals, ", "one of an obligation of a citizens as per the constitution of FDRE is respecting the constitution as the law of the land. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("82.", "What is the primary justification for adopting the federal system in Ethiopia? ", 0, 0, 0, 0, 0, "To avoid tyrannical rule from the center. ", "To suppress local initiatives and interests across the state. ", "To accommodate all the centrifugal forces within one nation. ", "To look for ways of having greater weight against external force. ", "the primary justification for adopting the federal system in Ethiopia is to accommodate all the centrifugal forces within one nation. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("83.", "Which of the following ideas agrees with the principle of multiculturalism? ", 0, 0, 0, 0, 0, "It undermines peoples to promote their cultural distinctions. ", "It believes that the prevalence of diversity is an obstacle for unity. ", "It believes that no culture is superior or inferior to any other culture. ", "It underscores that the very purpose of politics is to affirm group indifferences. ", "The principle of multiculturalism believes that and culture is superior or inferior to any other culture. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("84.", "Which of the following is correct about human rights? ", 0, 0, 0, 0, 0, "They are acquired after birth. ", "They are created and maintained by stated. ", "They are natural and enjoyed by all human kind. ", "They are exercised based on one's political achievement ", "The Human Rights can be defined as rights that universally belong to people regardless of sex, race, color, language, national origin, age, religion or political beliefs. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("85.", "Which of the following statements is correct about the principle of rule of law? ", 0, 0, 0, 0, 0, "All laws have equal power. ", "Every citizen is subject to the law.", "No, a law is superior to another law. ", "Laws are monopolized by a government ", "The rule of law means the general practice of the legal system in democracy has constitutional backing and every citizen is subject to the law. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("86.", "Which of the following is INCORRECT about the role played by governmental and non-governmental organizations in promoting citizens participation in policy making? ", 0, 0, 0, 0, 0, "They raise awareness of the community. ", "They organize venue for expressing views. ", "They arrange and facilitate discussions to identify local problems. ", "They arrange debates which promote unsubstantiated judgment of policies. ", "the roles of government and non-governmental organization in promoting citizens participation in policy making includes; they raise awareness of the community; they organize venue for expressing views and arrange and facilitate discussion to identify the problems. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("87.", "What is the advantage of citizens' participation in making and evaluating public policies? ", 0, 0, 0, 0, 0, "It develops a sense of betrayal among citizens ", "It promotes suspicion between government and citizens. ", "It enables citizens to formulate and implement sustainable and effective policies. ", "It enables government to know the feeling and reactions of citizens towards various issues. ", "the advantage of citizen's participation in making and evaluating public Polices enables citizens to formulate and implement sustainable and effective policies.", "c", 0, 1, this.f503b));
        arrayList.add(new questions("88.", "What benefit can be gained from utilizing locally produced goods than the exported ones in a country? ", 0, 0, 0, 0, 0, "Promoting imbalance import-export trade. ", "Proper and efficient exploitation of resources. ", "Keeping country’s domestic factories out of business. ", "Alienation of a given country from an international trade. ", "one of the benefits that can be gained from utilizing produced than the exported ones in the country helped for proper and effective utilization of local resources.", "a", 0, 1, this.f503b));
        arrayList.add(new questions("89.", "Which of the following is correct about a good leader? ", 0, 0, 0, 0, 0, "He/she strives to attain personal gains. ", "He/she creates vision and inspires others to achieve goals. ", "He/she depends on threats and coercion to meet his/her goals. ", "He/she sets a plan to keep his/her position & struggles to achieve it.", "one of the qualities of good leader is creating vision and inspires others to achieve their goals. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("90.", "Which one of the following can best describe the personal quality of a versatile leader? ", 0, 0, 0, 0, 0, "The quality-of being flexible, resourceful and an all rounded one. ", "The quality of realizing what is achievable based on known facts. ", "The quality of inspiring others and committing to the objective of the task. ", "The presence of good ability to set appropriate courses of action through plan. ", "quality of versatile leader is openness, allows the leader to change on a dime when necessary. Flexibility and versatility are the pathways to speedy responsiveness.", "a", 0, 1, this.f503b));
        arrayList.add(new questions("91.", "Which of the following goes with the notion of constitutional patriotism in the current Ethiopian context? ", 0, 0, 0, 0, 0, "Citizens' commitment to the state's development ", "Citizens' commitment to conquer neighboring countries. ", "Citizens' indulgence to cultural and religious fundamentalism.", "Citizens' determination to fight the virtue of tolerance in the state. ", "The notion of constitutional patriotism in the current Ethiopian context citizens committed to the development.", "a", 0, 1, this.f503b));
        arrayList.add(new questions("92.", "What is true about cultural relativism? ", 0, 0, 0, 0, 0, "Societal norms form the basis of morality. ", "Morality does not differ from culture to culture. ", "The moral values of one culture can be judged to be better than that of the other ", "There are universally agreed moral, principles by which we judge our action. ", "Cultural relativism is the principle that an individual human's beliefs and activities should be understood by others in terms of that individuals own culture. It was established as axiomatic in anthropological research by Franz Boas in the first few decades of the 20th century and later popularized by his students. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("93.", "Which of the following contributes for creating favorable condition for corruption? ", 0, 0, 0, 0, 0, "The presence of measurement of corruption. ", "The emergency of rent- seeking political elites. ", "The devotion of the government to apply harsh penalties ", "Citizens' unreserved commitment for combating corrupted officials. ", "one of the factors that created the favourable condition for corruption is the emergence of rent seeking political elites. ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("94.", "What is the consequence of corruption in a country?", 0, 0, 0, 0, 0, "It eliminates societal moral values. ", "It increases foreign direct investment. ", "It reduces expenditure for public services. ", "It reduces investment and the rate of growth. ", "Corruption is one of the factors that affect the prevalence of rule of Corruption causes many social and economic problems. Among other things: It creates inequality among citizens; \n-\tIt causes lack of faith and disregard for the law; \n-\tIt allows government officials to extract public money for themselves and their families; \n-\tIt affects economic growth and reduces the social services that citizens receive from government. \n", "a", 0, 1, this.f503b));
        arrayList.add(new questions("95.", "Which of the following is the reason for adopting the principle of equality for the current Ethiopian society? ", 0, 0, 0, 0, 0, "To encourage gender discrepancy. ", "To eradicate citizens' economic inequality. ", "To enable the society to have a similar culture. ", "To develop the different cultures of the country. ", "the reason for adopting the principles of equality in the current Ethiopian society is Ethiopia is a country of different peoples and cultures. Tolerating these and other differences is important to live in peace and cooperation ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("96.", "What can be a consequence of economic dependency of developing nations? ", 0, 0, 0, 0, 0, "The development of self-sustained economy of developing nations. ", "The increment of the stagnation of the economies of developed nations.", "The emerging of balanced economic relationship between the developed and developing nations. ", "The occurrence of technological and financial penetration by the developed nations at the of the developing ones. ", "the consequences of economic dependency of developing nations is the occurrence of technological and financial penetration by the developed nations at the expense of developing ones. ", "d", 0, 1, this.f503b));
        arrayList.add(new questions("97.", "Which of the following is an attribute of patriotism? ", 0, 0, 0, 0, 0, "Developing rent-seeking behavior. ", "Playing the role of whistle blowers", "Recognizing and accepting cultural indifferences. ", "Respecting heritages on the basis of ethno-centrism. ", "one of the attributes of patriotism is playing the role of whistle blowers ", "b", 0, 1, this.f503b));
        arrayList.add(new questions("98.", "Which of the following statements agrees with the principle of fairness? ", 0, 0, 0, 0, 0, "Everybody should benefit according to his/her age. ", "It is unfair to consider ageism when sharing benefits. ", "Benefits should be distributed as per burdens discharged. ", "Benefits should be shared regardless one's responsibilities. ", "according to the principle of fairness benefit should be shared distributed based on burden discharged or the fair distribution of benefits and burdens can be fair only if a person or a group could earn according to their contribution in an activity that brings benefits. ", "c", 0, 1, this.f503b));
        arrayList.add(new questions("99.", "What can be an outcome of fair distribution of benefits and burdens among citizens of a state? ", 0, 0, 0, 0, 0, "The cultivation of the sense of 'weness' among citizens. ", "The elimination of economically and socially stratified groups ", "The development of citizens' subordination to the government. ", "The cultivation of shared feelings towards international politics. ", "an outcome of fair distributions of benefits and burdens among citizens of the state cultivate the sense of ‘weness’ among citizens. ", "a", 0, 1, this.f503b));
        arrayList.add(new questions("100.", "Which of the following is an indicator of poverty in a country? ", 0, 0, 0, 0, 0, "Low illiteracy rate. ", "Low infant mortality rate. ", "Very low population size ", "Low average life expectancy. ", "the indicator of for the poorer country’s poverty is the inability to meet basic needs. Besides, prevalence of illiteracy, inadequate social services lack of infrastructural development, etc are indicators of poverty. ", "a", 0, 1, this.f503b));
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
        this.f504tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(6), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    civics2007.this.timer.setVisibility(0);
                    civics2007.this.timer.setText(format);
                }

                public void onFinish() {
                    civics2007.this.scr.setVisibility(8);
                    civics2007.this.chr.stop();
                    civics2007.this.toolbar.setVisibility(8);
                    civics2007.this.Relative.setBackgroundColor(-7829368);
                    civics2007.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2007.this.getBaseContext());
                    int unused = civics2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = civics2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = civics2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = civics2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = civics2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = civics2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = civics2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = civics2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = civics2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = civics2007.this.highscoreCivics2007 = defaultSharedPreferences.getInt("Civics2007hs", 0);
                    int access$600 = civics2007.this.part1 + civics2007.this.part2 + civics2007.this.part3 + civics2007.this.part4 + civics2007.this.part5 + civics2007.this.part6 + civics2007.this.part7 + civics2007.this.part8 + civics2007.this.part9;
                    civics2007.this.resultText.setText(String.valueOf(access$600));
                    civics2007.this.progressbar.setProgress(access$600);
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
                    if (access$600 > civics2007.this.highscoreCivics2007) {
                        edit.putInt("Civics2007hs", access$600);
                    }
                    edit.commit();
                }
            }.start();
        } else {
            this.chr.setVisibility(0);
            this.chr.start();
        }
        this.finish.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2007.this.scr.setVisibility(8);
                civics2007.this.chr.stop();
                civics2007.this.toolbar.setVisibility(8);
                civics2007.this.Relative.setBackgroundColor(-7829368);
                civics2007.this.layout.setVisibility(0);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(civics2007.this.getBaseContext());
                int unused = civics2007.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                int unused2 = civics2007.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                int unused3 = civics2007.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                int unused4 = civics2007.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                int unused5 = civics2007.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                int unused6 = civics2007.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                int unused7 = civics2007.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                int unused8 = civics2007.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                int unused9 = civics2007.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                int unused10 = civics2007.this.highscoreCivics2007 = defaultSharedPreferences.getInt("Civics2007hs", 0);
                int access$600 = civics2007.this.part1 + civics2007.this.part2 + civics2007.this.part3 + civics2007.this.part4 + civics2007.this.part5 + civics2007.this.part6 + civics2007.this.part7 + civics2007.this.part8 + civics2007.this.part9;
                civics2007.this.resultText.setText(String.valueOf(access$600));
                civics2007.this.progressbar.setProgress(access$600);
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
                if (access$600 > civics2007.this.highscoreCivics2007) {
                    edit.putInt("Civics2007hs", access$600);
                }
                edit.commit();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2007.this.scr.setVisibility(8);
                civics2007.this.chr.stop();
                civics2007.this.toolbar.setVisibility(8);
                civics2007.this.Relative.setBackgroundColor(civics2007.this.getResources().getColor(C2719R.C2720color.transparent_black));
                civics2007.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2007.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics2007.this.scr.setVisibility(0);
                civics2007.this.toolbar.setVisibility(0);
                civics2007.this.telegram_layout.setVisibility(8);
                civics2007.this.chr.start();
                civics2007.this.Relative.setBackgroundColor(civics2007.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    public void onBackPressed() {
        if (this.doubleBackToExitPressedOnce) {
            startActivity(new Intent(this, Naturalscience.class));
            finish();
            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", 0).show();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                civics2007.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
