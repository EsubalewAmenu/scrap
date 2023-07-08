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

public class geography2012 extends AppCompatActivity {
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
    private Boolean f576b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2012;
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
    private Toolbar f577tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2012);
        this.f576b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "What is the most sparsely populated country in northern Africa? ", 0, 0, 0, 0, 0, "Tunisia", "Libya", "Egypt", "Algeria", "The most sparsely populated country in North Africa is Libya. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("2.", "In which region of Africa is the highest infant mortality rate found? ", 0, 0, 0, 0, 0, "Western Africa", "Eastern Africa", "Northern Africa ", "Central Africa ", "ON of the major demographic characteristics of Africa is infant mortality rate is high in Central Africa which is 95 in terms of regions. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("3.", "Which one best characterized the African population?", 0, 0, 0, 0, 0, "Low crude death rate in the world ", "High immigrants from other continents ", "Categorized as young age group ", "Dominated by old age population ", "Africa has one of the world's fastest growing populations. The continent has been experiencing rapid changes in its population and most of the populations categorized as young which is constituted 70% of the population. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("4.", "What is the main reason for the low sex ratio in Sub -Saharan African countries? ", 0, 0, 0, 0, 0, "The region is characterized by a large number of female immigrants ", "The drought condition of the region highly affects male population ", "There if huge loss of male population due to war and migration ", "Female birth exceed male birth in the region ", "The main reason for low sex- ratio in sub-Saharan African countries is there are huge loss of Male populations due to war and migration in the Region. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("5.", "People often move from their original residence to another place in the same country in search of work. This happens for a short period as the people return to their original place when the working season is over. What is this type of movement called? ", 0, 0, 0, 0, 0, "International migration", "Intra- continental migration", "Permanent migration", "Temporary migration", "Temporary migration involves the movement of people whereby they leave their original residence for another for a short period of time, and then come back to their original place. Such migration is often practiced only periodically. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("6.", "What is the disadvantage of migration to the losing countries? ", 0, 0, 0, 0, 0, "It put more pressure on public services ", "It losses people in productive age groups. ", "It increase cost of service ", "It leads to overcrowding  ", "Disadvantages of migration to the losing countries includes: \n•\tLoses people in working age group \n•\tLoses people most likely to have some education and skills \n•\tMainly males leave causing a division in families \n•\tLeft with an elderly population and so a high death rate. \n", "b", 0, 1, this.f576b));
        arrayList.add(new questions("7.", "Which one of the following is the disadvantage of migration to the receiving countries?", 0, 0, 0, 0, 0, "An increase in the number of skilled workers. ", "A reduction in pressure on jobs ", "A reduction in social and racial tension ", "Communication barrier ", "Disadvantages of migration to the receiving countries includes: \n•\tPressure on jobs but most likely to be the first unemployed in a recession. \n•\tLow quality over crowded housing lacking in basic amenities \n•\tEthnic groups tend not to integrate \n•\tRacial tension \n•\tLimited skilled/educated group \n•\tLack of opportunities to practice their own religion, culture, etc. \n•\tLanguage difficulties or communication barriers \n", "d", 0, 1, this.f576b));
        arrayList.add(new questions("8.", "What is the main reason for the highest rate of Urbanization in Africa? ", 0, 0, 0, 0, 0, "High rate of urban-to-urban migration ", "Advancement of social services in urban areas ", "High fertility rate in the urban areas ", "The expansion of industries in urban area", "Africa is the least urbanized of all the continents in the world. However, as a result of the existing very high rate of rural-urban migration and high fertility in the urban areas, the continent has the world's highest rate of urbanization, which is about 5.4% per year size as a result of many factors including the interactions between fertility and mortality.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("9.", "In which region of Africa is the highest level of urbanization found?", 0, 0, 0, 0, 0, "Eastern Africa", "Southern Africa", "Western Africa ", "Northern Africa", "The extent of urbanization shows great regional variation in Africa. as it can clearly be observed from the table below, Southern Africa is the most urbanized region with 56% Of its population living ill urban areas in 2009 followed by Northern Africa (50%). ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("10.", "Among the following, which one is the main impact of rapid urbanization in urban areas of Africa? ", 0, 0, 0, 0, 0, "Language difficulties", "Theft related crime", "Noise population ", "Improper waste disposal ", "The adverse effects of urbanization in Africa arc absence of employment opportunity, unreliable food security, shortage of water, scarcity or shelter and inefficient waste disposal, etc... ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("11.", "Which part of Ethiopia contributes rainfall water to the Wabishebelle River? ", 0, 0, 0, 0, 0, "Hararghe", "Kaffa", "Shewa", "Illubabor", "The Southeastern Drainage System is the second largest drainage system; it consists of the Genalle and Wabishebelle. These rivers collect waters from the highlands of Hararghe, Sidamo, Bale and Arsi. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("12.", "What are the two major rivers of inland drainage system in Ethiopia? ", 0, 0, 0, 0, 0, "The Baro-Akobo and the Tekezze Rivers ", "The Wabishebelle and the Genale Rivers ", "The awashe and the Omo- Ghibe River ", "The Abay and the Didessa River ", "The two inland (Rift Valley) Drainage System are the Awash and the Omo- Gibe rivers. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("13.", "In which part of Ethiopia are most of the highland likes found? ", 0, 0, 0, 0, 0, "Shewa", "Wello", "Tigray", "Wellega", "Highland Lakes are found dispersed on the plateaus most of them found in Shewa for example: \n•\tBishollu, Kuruflu, Babbo Gaya, and Arsedi, all around Bishoftu \n•\tWonchi and Dendi around Ambo, Ginchi and Wellisso \n•\tZequala near Bishoftu \n•\tHashenge near Korum in Tigray \n•\tHaik, (some 30 kilometers away from Desse on the road to Woldiya) \n", "a", 0, 1, this.f576b));
        arrayList.add(new questions("14.", "Which one of the following is relatively the most utilized river for irrigation and hydro electronic power generation in Ethiopia? ", 0, 0, 0, 0, 0, "The Ghibe River", "The Fincha River", "The Awash River ", "The Abbay River ", "The Awash River basin is the most utilized in the Rift Valley. The basin covers a total area of 110 thousand square kilometers and serves as home to 10.5 million inhabitants. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("15.", "Which one of the following represent the sphere of water body? ", 0, 0, 0, 0, 0, "Anthroposphere ", "Lithosphere", "Hydrosphere", "Biosphere ", "A hydrosphere is the total amount of water on a planet. The hydrosphere includes water that is on the surface of the planet, underground, and in the air. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("16.", "A geography teacher aims to teach the course ‘introduction to Climatology’. He wants to cover the spatial distribution, variation and interaction of climate system of the world in the course. Among the following geographical approaches, which one is the best approach in the teacher to use? ", 0, 0, 0, 0, 0, "Systematic approach", "Regional approach", "Quantitative approach  ", "Analytical approach ", "The quantitative approach when trying to verify a given geographical theory. We translate the concepts of the theory into variables that can be measured with statistical techniques. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("17.", "Agricultural activity carried out in Ethiopia have contributed to climate change. Climate change has in turn an adverse impact on agricultural yield. To reduce the impact of climate change, Ethiopian’s farmers have developed different adaption strategies. Which school of geographical thought is concerned with such interactions between the environment and human activates? ", 0, 0, 0, 0, 0, "Quantitative revolution", "Environmental perception", "Environmental possibilism ", "Environmental determinism", "Environmental Determinisms is a philosophy that bases its view on the idea that the natural environment is an influencing factor on humans’ mode of living. It believes that human activities are controlled by the environment. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("18.", "What is the use of geographic knowledge that is used to solve spatial problems called? ", 0, 0, 0, 0, 0, "Political geography", "Applied geography", "Human geography", "Physical geography", "Applied geographers are making important contributions in all the systematic branches of geography. These include both physical and human geography and at the interface between the two. These include remote sensing, geographic information systems, and statistical analysis. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("19.", "Which sub filed geography studies the behavior of human population? ", 0, 0, 0, 0, 0, "Historical geography", "population geography", "Political geography", "cultural geography ", "Population geography is a division of human geography. It is. the study of the ways in which spatial variations in the distribution, composition, migration and growth of populations ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("20.", "The Awash and the Abay River basin are separated from one another the shona plateau. In this case the Shona plateau is ", 0, 0, 0, 0, 0, "drainage basin", "drainage system", "drainage pattern ", "watershed", "In geography, drainage patterns differ from drainage systems. The term patterns refer to the fabric or surface arrangement of the main rivers and their tributaries. These features are the result of factors of the underlying rock and slope. In contrast, the term drainage systems refer to the direction and destination of the rivers. So, the Showa Plateau is the drainage system that separate Awash and Abay rivers basins.", "b", 0, 1, this.f576b));
        arrayList.add(new questions("21.", "What types of drainage pattern do you expect in areas that consist of rocks of different hardness? ", 0, 0, 0, 0, 0, "Rectangular", "Centripetal", "Trellis", "Dendritic ", "The drainage patterns arc expressed as radial, dendrite, trellis, etc., while drainage systems are expressed as endoric, exotric and aerie. Dendritic drainage pattern is seen to feed a river channel that matches and is strongly accordant to the overriding gradient of the land. Truly dendritic systems fount in V-shaped valleys; as a result, the rock types must be (Mute impervious and non-porous. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("22.", "Source of rivers are higher ground that are often covered by herd rocks which cannot easily be eroded. If an area has ample rainfall what types of drainage pattern, do you think, can develop in the area? ", 0, 0, 0, 0, 0, "Rectangular", "Centripetal", "Trellis", "Radial", "a rectangular drainage pattern develops on a strongly jointed rocky terrain. It differs from trellis pattern drainage, since it is more irregular, and its tributary streams are not as long or as parallel as in trellis drainage. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("23.", "Under what condition is a river captured formed? ", 0, 0, 0, 0, 0, "It is formed in watershed that comprises higher ground. ", "It is formed in area where the pirate's rivers have a moderate slop and erosion resistance course. ", "It is formed when heavy participation occurs in the pirate's river side of the watershed", "It is formed in areas where the rock on the side of the victim river is harder. ", "River capture occurs when an actively eroding low level stream encroaches on the drainage of a nearby stream flowing at a higher level and diverts part of the water of the higher stream ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("24.", "Among the following which one explains the feature of a river at its middle course? ", 0, 0, 0, 0, 0, "The slope of the river gets stepper than it does at the upper closes.", "The sediment carrying capacity is higher than it is at the lower course. ", "The volume of the river discharged is lower than it is at upper courses. ", "The speed of water flow is faster than it is at the upper course. ", "in the middle course the river has more energy and a high volume of water. As the river erodes laterally, to the right side then the left side, it forms large bends, and then horseshoe-like loops called meanders. The formation of meanders is due to both deposition and erosion and meanders gradually migrate downstream. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("25.", "What is the average amount of money that an individual is expected to have as a result of the country's gross national product? ", 0, 0, 0, 0, 0, "Per capita income", "Standard of living", "Gross national product ", "Gross domestic product ", "Per capita income is a measure of the amount of money earned per person in a nation or geographic region. Per capita income helps determine the average per-person income to evaluate the standard of living for a population. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("26.", "Which African sub region is known for its low Gross domestic product (GDP)? ", 0, 0, 0, 0, 0, "Horn of Africa", "Maghreb", "Western Africa", "Southern Africa ", "The Horn of Africa is one of the subs–African Region with the lowest Dross Domestic Product (GDP) ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("27.", "What characterizes countries of low standard of living? ", 0, 0, 0, 0, 0, "High life expectancy", "Low per capital income", "Standard housing", "Low fertility rate ", "Characteristics of low standard of living includes: \n•\thigh Poverty rate. \n•\tLow Quality and affordability of housing. \n•\tLow Gross domestic product (GDP) \n•\tLow Affordable access to quality healthcare. \n•\tLow Quality and availability of education. \n•\thigh Incidence of disease. \n•\tLow per capita income \n", "b", 0, 1, this.f576b));
        arrayList.add(new questions("28.", "Which one of the following characterizes the Africa economy? ", 0, 0, 0, 0, 0, "Tertiary economic sector has a major share in its GDP. ", "Secondary economic sector is the backbone of Africa economy ", "There is very high inter African communication ", "Its inter and infra- regional trade is at low. ", "African economy characterized by low inter and Infra trade relations ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("29.", "Why are most countries of Africa considered to be not so developed? ", 0, 0, 0, 0, 0, "There is high dependency on primary economic sectors. ", "They have high level important substituting industries. ", "Their exports are mainly high value products.", "Their economy largely depends on manufacturing sector. ", "Most African countries are considered to be riot developed because there is high dependency on primary economic sectors ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("30.", "Which one of the following adversely affect the prospect or Africa development? ", 0, 0, 0, 0, 0, "Existence of free trades and common currency ", "Prevalence of political instability and civil war ", "Availability of untapped mineral resources ", "Large territorial and population size ", "the prevalence of political instability and civil war is one of the reason that adversely affect the prospect of African economic development. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("31.", "According to the 2009 world population data sheet, more than half of African population is ", 0, 0, 0, 0, 0, "in the infant age group ", "in the old age group", "in the children age group ", "in the productive age group ", "According to the 2009 world population data sheet, more than half of the Population of Africa was found in the children age group. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("32.", "In which areas of Africa is placer mining commonly practiced? ", 0, 0, 0, 0, 0, "In areas where there is dense vegetation ", "In areas of rock layered surface. ", "At the top of the mountain ", "Near river valleys ", "The areas of rock layered surfaces of Africa is placer mining commonly practiced.", "b", 0, 1, this.f576b));
        arrayList.add(new questions("33.", "Which one of the following is the main factors for the low level of extraction and utilization of mineral resource in Africa? ", 0, 0, 0, 0, 0, "Lack of initial capital for mineral resource exploitation ", "Lack of good governance and corruption ", "Shortage of economically active population", "Lack of skilled human power in the mining sector ", "The main factor for the low level of extraction and utilization of, mineral resources in Africa are lack of capital, skilled human power and modern technology are the major problems hampering its development", "d", 0, 1, this.f576b));
        arrayList.add(new questions("34.", "How could you explain the paradox between the potential and the actual resource exploitation in Africa? ", 0, 0, 0, 0, 0, "There is improper resource exploitation in the continent. ", "Low potential resource is the cause for its underdeveloped ", "There is low potential and high actual resource exploitation ", "Resource are highly exploited to rise the standard of living ", "The paradox in resource exploitation and potential is that high potential of resource but there is low potential to utilize these natural resources.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("35.", "As the Lake Volta is to Ghana, so is the Lake Kaindji to ", 0, 0, 0, 0, 0, "Zambia", "Nigeria", "Egypt", "Zimbabwe", "Africa has large numbers of rivers that have enormous hydro-electric power and irrigation potential. To utilize the rivers for these and many other purposes, large dams have been constructed across their courses. The major anthropogenic lakes in Africa are Nasser in Egypt; Koka in Ethiopia; Volta in Ghana Kaindji in Nigeria and Kariba in Zambia and Zimbabwe. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("36.", "Which of the swamps below is found in the Nile River basin? ", 0, 0, 0, 0, 0, "Sudd swamps ", "Okovango swamps", "Kamulando swamps ", "Timbukto swamps ", "The major swamps of Africa include - Sudd swamps, along the Nile River basin; - Kamulando swamps, in the Congo Basin; Batorse and Kafue swamps, in the Zambezi Basin - Okovango swamps, in Botswana - Swamps adjacent to lake Chad; - Mangrove (coastal) swamps along the deltaic mouths of the major rivers; - Timbukto swamps, in Mali along the Niger river ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("37.", "Why does the riparian state of the Nile River basin countries fail to agree on the use of the water? ", 0, 0, 0, 0, 0, "The increasing water shortage in the upper course countries. ", "The absence of acceptable international water law concerning the river ", "Egypt claims the largest quantity of the Nile River water. ", "The upper course states of the Nile basin are desert and need more water ", "The Riparian states of the Nile basin countries fail to agree on the use of water because the absence of acceptable international water low concerning water use. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("38.", "What is the type of savanna that comprised many trees and grasses called? ", 0, 0, 0, 0, 0, "True savanna", "Torn savanna", "High savanna", "Park savanna ", "Park (Wetter) Savanna: it is found close to the rain forests and made up of many trees and grasses. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("39.", "What types of vegetation develops over the high land of Ethiopia? ", 0, 0, 0, 0, 0, "Semi desert vegetation", "Afro-Alpine vegetation", "Tropic rainforest", "Mangrove vegetation", "In Ethiopia, Afro-alpine and sub-Afro-alpine vegetation are found in the Highlands of Semein and Highlands of Bale ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("40.", "Which of the following is correct about the Mediterranean vegetation? ", 0, 0, 0, 0, 0, "It is dominated by broad leafed trees", "The vegetation has short roots ", "Maquis is the most common plant type", "It has low plant species diversity ", "Mediterranean Vegetation is characterized by rich in plant species, evergreen and deciduous trees constitute a good part of the vegetation of this zone. Cork oak, maquis, and wild olive, are among the most common plant types in the region. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("41.", "Which climate region of Africa is associated clamping animals? ", 0, 0, 0, 0, 0, "The tropical desert climate", "The Equatorial Climate", "The Highland climate", "The Mediterranean climate", "The Equatorial climate in Africa mainly associate with high diversity of tree climbing animals like monkeys, apes, baboons and gorillas.", "b", 0, 1, this.f576b));
        arrayList.add(new questions("42.", "Which of the following is the decisive measure to conserve the wildlife resource of Ethiopia?", 0, 0, 0, 0, 0, "Conserving natural vegetation ", "Establishing national parks", "Encouraging legal hunting of wild animals ", "Raising the level of awareness of the community ", "There are some conservation measures that have been recommended but the decisive measure to conserve the wildlife resource in Ethiopia is educate and encourage local communities to protect their animals' habitats and resources ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("43.", "The types of soil which is rich in human content climate region of Africa is ", 0, 0, 0, 0, 0, "Lixisols", "Acrisols", "Nitosols", "Ferrasols", "Nitosols soils mainly develop in humid climatic regions. Their parent materials are usually volcanic rocks. Such soils have a deep profile and are rich in humus content. Therefore, they are the most productive soils in Africa. As a result, they are ideal for crop production.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("44.", "Which of the following is correct about human population growth in Africa? ", 0, 0, 0, 0, 0, "The doubling time of population in the content is very long ", "The population growth rate of Africa is the slowest in the world ", "The declining mortality in Africa is the highest in the world ", "It is characterized by the gradual decline in the birth and death rate. ", "The general characteristics of African Population are short doubling time: high rate of population growth and declining of mortality due to increasing, health facility.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("45.", "In Ethiopia, where do you find more nucleated settlement? ", 0, 0, 0, 0, 0, "Ghimbi", "Assosa ", "Harar ", "Gambella", "Harar is one of the areas in Ethiopia where there is more concentration or nucleated settlement area in Ethiopia", "c", 0, 1, this.f576b));
        arrayList.add(new questions("46.", "In Ethiopia, there were area town developed along the main highway line from Addis Ababa to Mekele. Such town can be an example of ", 0, 0, 0, 0, 0, "scattered settlement", "liner settlement", "dispersed settlement ", "nucleated settlement ", "In Ethiopia there are towns developed along the main highway line from Addis Ababa to Mekele is one of the examples of linear settlement area in Ethiopia.", "b", 0, 1, this.f576b));
        arrayList.add(new questions("47.", "What is the major factors that influences the location of settlement in the rural Parts of the Ethiopian highlands? ", 0, 0, 0, 0, 0, "Asphalt Road", "Military camp", "Hydroelectricity", "Fertile farmland", "In Ethiopia, most of the physical factors are influenced by altitude. Since soil formation and vegetation growth are closely associated with adequate rainfall and moderate temperature, highlands tend to have better soils and vegetation cover.", "d", 0, 1, this.f576b));
        arrayList.add(new questions("48.", "What is the main reason for the establishment of Addis Ababa at the foothills of the Entoto Mountain? ", 0, 0, 0, 0, 0, "The presence of filwuha hot spring", "Its central location related to the rest of the country", "The availability of dense vegetation cover ", "Its suitability for military camps ", "The main reason for the establishment of Addis Ababa at the foothill of the Entoto Mountain is its location relatively at the center of the century. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("49.", "Which one of the following towns mostly serves as a center of exchange of goods and services?", 0, 0, 0, 0, 0, "Administrative towns", "Market towns", "Industrial towns ", "Cultural tow ", "Market tons are mostly served as the center of exchange of goods and services. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("50.", "What types of transport network is commonly used in areas were construction of graded surfaced road is extremely expensive? ", 0, 0, 0, 0, 0, "Asphalt road", "Railway ", "Cart tracks ", "Trails", "Asphalt road is the type of transportation network is commonly used in area where construction of graded surface road is extremely expensive. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("51.", "Among the following, which one is the foremost physical factors that determines the development of road transport networks. ", 0, 0, 0, 0, 0, "Rain fall", "Topography", "Temperature ", "Land use and land cover ", "Topography is one and the most physical factor that affect or determined the development of road transport network. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("52.", "Among the following, which mode of land transport is feasible for Ethiopian to develop in most parts of its rugged topography? ", 0, 0, 0, 0, 0, "Foot path", "Cable transport", "Roads ", "railway", "Cable transport is mode of transportation that is feasible for Ethiopian to develop in the most rugged topography. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("53.", "Which one of the following plays a decisive role in the development of Geographic Information systems technology? ", 0, 0, 0, 0, 0, "The investigation of Geographic Information systems in disciplines such as geography and hydrology. ", "The establishment of the Harvard laboratory for computer graphics and special analysis. ", "The development and accessibility of computers", "The availability of spatial analysis", "The decisive role in the development of GIS (Geographic Information System) is the availability of spatial and non-spatial data receive geographical data from maps, satellites, photographs, and printed texts and books that records, stores and analyses information about features of the earth's surface. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("54.", "A geographic information system has mostly been applied in ", 0, 0, 0, 0, 0, "Land use planning ", "Wild animal counting ", "Water quality monitoring", "air pollutant concentration movement ", "GIS (Geographic Information System) is mostly been applied in land using. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("55.", "What is the relative location of Ethiopia? ", 0, 0, 0, 0, 0, "It is located southeast of Somalia ", "It lies north east of the India Ocean ", "It is located to the southwest of Asia ", "It is found south of Uganda ", "Ethiopia's geological or relative location can be described in the following ways. It is found: \n•\tto the southwest of the Asian continent, \n•\tto the south of Europe, \n•\tto the northwest of the Indian Ocean, \n•\tin the Nile Basin, and \n•\tin northeastern Africa' the relative location is south east of Asia. \n", "b", 0, 1, this.f576b));
        arrayList.add(new questions("56.", "What looks like the shape of Ethiopia? ", 0, 0, 0, 0, 0, "Compact shape", "Liner shape", "Fragmented shape ", "Truncated shape ", "Ethiopia's shape is of the compact type. Its shape is considered to be compact, or essentially circular, because the extreme north-south and east-west spans of the country cover comparable distances. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("57.", "Which. one of the following era is correctly paired with the geological events that took place in the horn of Africa? ", 0, 0, 0, 0, 0, "Cenozoic era - Adigrat sandstone ", "Mesozoic era - Trtappean lava series ", "Paleozoic era - Disappearance of the dinosaurs ", "Precambrian era - Amoeba and jellyfish ", "-\tThe correct pair is during the Precambrian era\n-\tThe first forms of life emerged, such as amoeba, and jellyfish.\n-\tThe oldest rock formed the old crystalline basement \n", "d", 0, 1, this.f576b));
        arrayList.add(new questions("58.", "In which geological era were inselbergs formed in the Horn of Africa?", 0, 0, 0, 0, 0, "The Precambrian Era", "The Paleozoic era", "The Cenozoic era ", "The Mesozoic era", "The major geologic event of the Precambrian Era was As a result, the land was plain with some residual features called inselberg was formed. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("59.", "Among the following which events took place in Ethiopia during the Cenozoic era?", 0, 0, 0, 0, 0, "Formulation of rift valley land form ", "Formulation of sedimentary rock ", "Predominance of invertebrates ", "Denudation and peneplanation ", "In Ethiopia and the Horn it formed huge blocks of dome over the greater part of the region. As the uplifting continued through time, great cracks opened in the crust and resulted in the pouring out of extensive basaltic lava (known as the Trappean lava series). As the cracking continued during the period, it formed the Great East African Rift Valley System of which the Ethiopian Rift Valley System. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("60.", "One of the following southeastern highlands of Ethiopia is the lowest, compared to all the others. ", 0, 0, 0, 0, 0, "Plateau of Hararghe", "Bale massif ", "Sidama highlands", "Somali highlands ", "Among the Southeastern Highlands of the Horn the lowest is the Somali highlands are the extension of the southeastern highlands of Ethiopia. Their average altitude doesn't exceed 1500 mail. They rise gently in the west and descend sharply to the Indian Ocean coasts ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("61.", "What characterized the rift valley section of Ethiopia? ", 0, 0, 0, 0, 0, "Stability of the section ", "High and reliable rain full", "Low mean annual temperature ", "Availability of numerous lakes ", "The central subdivision of the Ethiopian Rift system, i.e., the Main Ethiopian Rift, covers the area from the lower Awash basin up to Lake Chamo. This subdivision is the most elevated part of the Ethiopian Rift Valley. It is also the wettest, most densely vegetated, and most densely populated. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("62.", "Which parts of the Southeastern lowland is located in Bale? ", 0, 0, 0, 0, 0, "Borena plains", "Benadir plains", "Elkeri plains ", "Ogaden plains ", "Among the lowlands in Southeastern lowlands the Elkeri plains found in Bale. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("63.", "Why is Ethiopia called the Roof of the North Eastern Africa? ", 0, 0, 0, 0, 0, "The landforms are made up of river cut gorges and valleys. ", "Its largest part is the highland relative to the surrounding areas. ", "Its landforms are formed a result of endogenic forces. ", "The country is found in north eastern parts of Africa. ", "Ethiopia is called as the Roof of North East Africa because the largest part is highland relative to the sounding area. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("64.", "Which one of the following is the main characteristics of Ethiopian rivers? ", 0, 0, 0, 0, 0, "They originate from the lowland parts of the country. ", "Most of the rivers run through valleys and gorges.", "They are suitable for navigation purposes. ", "Most of the rivers show low seasonal fluctuation. ", "The main characteristics of most of Ethiopian rivers are run through valleys and gorges. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("65.", "Which of the following controls of climate is mainly responsible for the interior part of Africa to experience continental climate? ", 0, 0, 0, 0, 0, "Distance from the sea", "Angle of the sun", "Latitude", "Cloud cover", "The important factors that are responsible for this variation include latitude, altitude, distance from the sea, mountain barriers, ocean currents and major planetary winds and pressure belts. Latitudes indicate the distance places have from the equator. A place's latitudinal location affects the amount of incoming solar radiation the place receives, and thereby its temperature. As we discussed earlier, much of Africa (nearly 2/3rd) lies within the tropical latitudes. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("66.", "Which of the types of wind listed below is significantly dominates the climate of northern and the southern tips of Africa? ", 0, 0, 0, 0, 0, "Northeast trade winds", "Guinea monsoon", "Southeast trade winds", "Westerly winds ", "The westerly winds from the subpolar high-pressure belts of the world reach the southern and northern tips of the continent.", "d", 0, 1, this.f576b));
        arrayList.add(new questions("67.", "Which of the given months constitute winter season in the Northern hemisphere? ", 0, 0, 0, 0, 0, "September October and November ", "June, July and August ", "March, April and May", "December, January and February ", "According to the meteorological definition, the seasons begin on the first day of the months that include the equinoxes and solstices. In the Northern Hemisphere, for example, Winter season runs from December 1 to February 28 (February 29 in a leap year)", "d", 0, 1, this.f576b));
        arrayList.add(new questions("68.", "Which statement describes the tropical continental climate of Africa? ", 0, 0, 0, 0, 0, "It is located between the wettest and the driest zones ", "It is found only in the northern hemisphere ", "The main annual rainfall in the region is 1500 millimeters ", "It experience low daily temperature through the year ", "Tropical Continental (Savanna) Climate This climatic region is found between 5digree and 15digree north and south latitudes. It occurs north and south of the tropical wet zone, in many parts Of Western Africa and Southern Africa and in most Madagascar. The region is situated between the wettest and driest climate zones of the continent. As a result, it is said to be zone of transition between the equatorial and the desert climatic region of Africa. In this region, summer is very hot, with an average temperature of 25oC, and winter is cool, with an average temperature of slightly above 15oC.", "b", 0, 1, this.f576b));
        arrayList.add(new questions("69.", "Which of the following is true about mountain climate in Africa? ", 0, 0, 0, 0, 0, "Its rainfall decreases with the rise in altitude. ", "It is similar to tropical climate. ", "It mainly receives orthographic type of rainfall ", "It has high annual range of temperature ", "Highland (Mountain) Climate type is predominantly found in areas where altitude is relatively high. It is dominant in the equatorial and tropical highland and plateau regions of the continent. The region, also experiences high rainfall, mainly of orographic origin. The rainfall increases with the rise in altitude. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("70.", "Which region in Africa is extremely affected by drought? ", 0, 0, 0, 0, 0, "Western coastal region", "Southeastern highland region", "Sahel region ", "Equatorial region", "The Sahel region of Africa is one of the extremely drought-affected areas in the continent. The region is a transitional zone between the Sahara on the north and the wetter tropical areas to the south.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("71.", "Which drainage system in Africa is the largest in terms of annual discharges? ", 0, 0, 0, 0, 0, "The Inland drainage system ", "The Mediterranean Sea drainage system ", "The Inland Ocean drainage system ", "The Atlantic Ocean drainage system ", "The Atlantic Ocean Drainage System is the largest in terms of catchment area, annual discharge and drainage density. It accounts for about 90 percent of the content's surface flow. The major river basins that constitute this system are the Congo, Niger, Volta, Gambia, Orange and Senegal basins. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("72.", "The White Nile River originates from which country? ", 0, 0, 0, 0, 0, "Ethiopia", "Tanzania", "Uganda", "Rwanda ", "The White Nile originates from Lake Victoria in Uganda, while the Blue Nile emerges from Lake Tana in Ethiopia, near Bahir Dar. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("73.", "Which of the following is correct about the main future of the Africa rivers? ", 0, 0, 0, 0, 0, "Most of the rivers have steep courses ", "They have low seasonal fluctuation ", "Many rivers are suitable for navigation ", "They have low hydroelectric power generation potential ", "Most African rivers share some common characteristics: \n•\tSteep long profile\n•\tWaterfalls and Rapids \n•\tSeasonal Fluctuation \n•\tDeltaic Mouths and Mangrove Swamps \n•\tExotic Nature of the Rivers \n", "a", 0, 1, this.f576b));
        arrayList.add(new questions("74.", "What types of water body is formed when water is accumulated at the back of dams? ", 0, 0, 0, 0, 0, "Swaps", "Ocean", "Artificial Lack", "Natural Lack", "Artificial darns arc the types of water body is formed when water is the at the back of the dams. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("75.", "What is the main cause of civil wars in Africa? ", 0, 0, 0, 0, 0, "Rapid rate of population growth on rural areas ", "Prevalence of raped urbanization in the continent. ", "Unfair utilization and allocation of resources ", "Scarcity of both agricultural and mineral resources ", "The main causes of civil wars in Africa unfair utilization and allocation of resources.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("76.", "What is the discovery of new facts through a systematic inquiry of the problem identified called? ", 0, 0, 0, 0, 0, "Research design", "Research", "Research method", "Research approach ", "Research as a science or professional trade identifies the causes of problems, and the degree or extent of these problems. Example: The occurrences of hunger, flood, epidemics. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("77.", "Which of the reason stated below encourage scientist to conduct research? ", 0, 0, 0, 0, 0, "To add new thing to the exciting body of knowledge", "To provide job opportunity for different experts", "To make the study area the best living place ", "To suggest solution to every problem", "The main reason that encourage the scientist to conduct research is to suggest solution to every problem. ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("78.", "What types of research approach do you recommended to study the relationship between rainfall and elevation in Ethiopia? ", 0, 0, 0, 0, 0, "Quantitative approach", "Questionnaire", "personal observation ", "Qualitative approach ", "Quantitative approach of research is the type used to study the relationship between rainfall and elevation Ethiopia. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("79.", "Which one of the following research objects is best addressed by geographers? ", 0, 0, 0, 0, 0, "Examining the effect of under employment on political stability ", "Assessing the relationship between education level and crime rate ", "Assessing the relationship between education level and crime rate ", "Investing the effect of human settlement on vegetation resource ", "Researcher in the field of geography may conduct on the mainly on: \n•\tthe spatial distributions of phenomena and things \n•\tthe resulting patterns and interactions\n•\tthe forces responsible for the formation of the patterns\n•\tinvesting the effect of human settlement on vegetation resource \n", "d", 0, 1, this.f576b));
        arrayList.add(new questions("80.", "Which of the following would give you the training you need to acquire the skill of conducting studies formulation down to reporting its result? ", 0, 0, 0, 0, 0, "Understanding the philosophy behind the research method", "Studying basic geographic research methodology ", "Acquainting oneself with research methods", "Understanding the meaning of research ", "Acquainting oneself with research methods is the help to acquire skills of conducting studies from the problem formulating down to reporting its result. ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("81.", "If you plan to exercise elementary researches work activities on the topic why do money student feel un comfortable approach for you the carry out this research? ", 0, 0, 0, 0, 0, "Qualitative ", "Inferential  ", "Quantitative ", "simulation", "If the researcher plan to exercise, elementary research work activities on the topic why do many students feel uncomfortable with the afternoon class use the quantitative research approach to translate the concept of the theory into variables that can be measured with statistical techniques.", "c", 0, 1, this.f576b));
        arrayList.add(new questions("82.", "Which one of the following bounded the Horn of Africa in the southeast? ", 0, 0, 0, 0, 0, "The India Ocean", "The Red sea", "Sudan", "Kenya ", "Indian Ocean is bounded the horn of Africa in the south east ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("83.", "Which one of the following is the largest country in the Horn of Africa?", 0, 0, 0, 0, 0, "Eritrea ", "Kenya", "Somali", "Ethiopia", "Ethiopia is the largest country in the horn of Africa ", "d", 0, 1, this.f576b));
        arrayList.add(new questions("84.", "Which one of the following is the main disadvantage of having large areal size for a country? ", 0, 0, 0, 0, 0, "Having divers ethnic groups and culture ", "High expenditure for construction of infrastructure ", "Presence of a variety of mineral resources ", "Position of divers agro-climatic zone", "The main disadvantage of countries having the large areal size is difficult to fulfill the infrastructure facilities to its citizens. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("85.", "Which of the following connects Africa with Europe? ", 0, 0, 0, 0, 0, "Suez Canal", "Strait of Gibraltar", "Panama Canal", "Strait of Babel Mandab ", "Strait of Gibraltar is the channel that connect North Africa with south Europe. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("86.", "What is the impact of the unbroken coastline of Africa?", 0, 0, 0, 0, 0, "Development of transport network among African countries has become easy", "It has encouraged communication with neighboring continent", "External trades with of continents have been enhanced. ", "Poor natural harbor development is available. ", "The impact of unbroken coastline of Africa is poor natural harbor development is available.", "d", 0, 1, this.f576b));
        arrayList.add(new questions("87.", "Which of the following is correct about the northern Africa? ", 0, 0, 0, 0, 0, "Its surface configuration is dominated by mountains. ", "It is characterized by tropical climate. ", "It is land locked region in the continent. ", "Its largest part is covered by dens population ", "Northern Africa is the largest region in terms of area. It covers nearly 1/3rd of the continent's total area. There are seven countries in the region, two of which namely Sudan and Algeria are among the largest states in Africa. ", "b", 0, 1, this.f576b));
        arrayList.add(new questions("88.", "What is the second most populous region in Africa? ", 0, 0, 0, 0, 0, "Eastern Africa", "Southern Africa", "Central Africa ", "Western Africa ", "Terms of population, Eastern Africa is the most populous of all the regions accounting for about 31.3% of Africa's total population in 2009 Nearly 22% of the region's population is urban. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("89.", "In which region of Africa are both the highest and the lowest elevations of the continent found? ", 0, 0, 0, 0, 0, "Eastern Africa", "Western Africa", "Southern Africa ", "Northern Africa ", "East Africa characterized by Very high volcanic mountains) extensive plateaus, great rift valleys and low depressions dominate the region's topography. ", "a", 0, 1, this.f576b));
        arrayList.add(new questions("90.", "Which region in Africa accounts for the major mining and manufacturing industries of the continent? ", 0, 0, 0, 0, 0, "Western Africa", "Northern Africa", "Central Africa", "Southern Africa ", "Southern Africa has the most diverse economy in the continent. Agriculture, mining, manufacturing and tourism form the major occupation of the region's population Agriculture in the region is highly mechanized and commercialized. The region is also rich in terms of mineral resources. Gold, diamond, and coal are among the most important ones. The region has most of the major mining and manufacturing industries in the continent.", "d", 0, 1, this.f576b));
        arrayList.add(new questions("91.", "Which geological events took place in Africa during the Paleozoic era? ", 0, 0, 0, 0, 0, "Formation of coal", "Sea Transgression", "extensive lava flows ", "Mountain building ", "Paleozoic Era (600 – 250 million years before the present) is the second-longest and second-oldest era in geological history. This era witnessed no major rock formation processes. As a result, it is a gap relative to rock formation in Africa. However, several other important events took place during this era. The following are the most important ones.\n•\tSeries of denudation and peneplanation\n•\tHeavy erosion \n•\tFormation of coal during the Carboniferous period \n", "d", 0, 1, this.f576b));
        arrayList.add(new questions("92.", "Which one of the following explains the Mesozoic era? ", 0, 0, 0, 0, 0, "It is during this era that the Mediterranean Sea was formed. ", "It is in this era when mountains in Africa were formed. ", "It is known by sinking and uplifting of landmass of Africa. ", "It is the second longest era in geological history. ", "The Mesozoic era is the third-largest and third-oldest era in the geological history of the earth. For Africa, the era was a time of alternate sinking and rising of the land. The era is divided into three periods ", "c", 0, 1, this.f576b));
        arrayList.add(new questions("93.", "Among the following which one indicates and its location in Africa? ", 0, 0, 0, 0, 0, "Mt. Atlas - Tanzania", "Mt. Kilimanjaro - Cameroon", "Mt. Meru — Kenya ", "Mt. Egon — Uganda ", "93.\tVolcanic Mountains of Africa includes: \n•\tKilimanjaro in Tanzania \n•\tMt. Elgon in Uganda \n•\tKenya in Kenya \n", "a", 0, 1, this.f576b));
        arrayList.add(new questions("94.", "In which part of Africa is the impact of high altitude on climate highly visible? ", 0, 0, 0, 0, 0, "The Cape range of south Africa", "The Rift valley part of Ethiopia ", "The Benadir plains of Somalia ", "The Sahara Desert ", "Much of Africa is plateau. There are also high mountains in many parts of the continent, especially in Eastern Africa. These plateaus and mountains have great impacts on the continent's climate. Similarly, the Atlas Mountains of North Africa and the Cape Ranges of South Africa experience the coldest-temperatures in the continent. ", "a", 0, 1, this.f576b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("95.", "Which one of the following is correct about Zenithal map projection? ", 0, 0, 0, 0, 0, "Less studied to map the polar landmasses", "Meridian are straight lines radiating from the equator. ", "Parallels are concentric circles. ", "True distance and direction are highly distorted. ", "Zenithal map -perpendicular to the area or position under consideration ", "c", 0, 2, this.f576b));
        arrayList2.add(new questions("96.", "What is the land form shown by the line connecting points ‘x’ ‘Y’?", 0, 0, 0, 0, 0, "Valley", "Ridge ", "Hill", "Saddle", "The landform shown by the line connected by point 'X' and 'Y' is valley. ", "a", 0, 2, this.f576b));
        arrayList2.add(new questions("97.", "What is the astronomical location of Africa? It is located between ", 0, 0, 0, 0, 0, "10 S to 180 N latitudes and 330 E longitudes ", "340 52' S to 370 '21 N latitudes and 170 33' W to 510 28' E longitudes", "30 N to 1s0 N latitudes and 330 E to 480 E longitudes ", "170 33'W to 510 28E latitudes and 340 52'SE 370 21' N longitudes", "Africa lies between 37o21’N and 34052’S latitudes and between 17o33'W and 51o28E longitudes. This means that the continent extends for about 37o to the north of the equator and 35o south of it. Similarly, Africa extends for about 17o west and 510 east of the Greenwich Meridian. ", "d", 0, 2, this.f576b));
        arrayList2.add(new questions("98.", "Which points on the map are intervisible? ", 0, 0, 0, 0, 0, "Point C and D", "Point R and D", "Point S and T", "Point A and D", "Inter visibility is simply defined as the visibility of places to each other. If an observer standing at a certain point can see another observer standing at another point, then the two 'S' and 'T' places are said to be indivisible. ", "c", 0, 2, this.f576b));
        arrayList2.add(new questions("99.", "Which one of the following is the basic difference between Globe and Map? ", 0, 0, 0, 0, 0, "Globe is representation of the actual shape of the earth while map is a flat drawing of the earth. ", "Map represents the entire parts of the world in one sheet where as many globes are required to cover the world.", "Map spins around an axis whereas globe is a representation on a piece of paper. ", "Map is a made of hard materials and cannot be followed while you can easily fold and carry globe.", "99.\tThe different between the Map and Globe is that globe is being presentation of the actual shape while map is a flat drawing of the earth. ", "c", 0, 2, this.f576b));
        arrayList2.add(new questions("100.", "Which types of features is represented by 'H'? ", 0, 0, 0, 0, 0, "Swamp", "Settlement", "Forest", "Bench mark", "The type of the land feature represented by ‘H’ on the map is swap.", "a", 0, 2, this.f576b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f577tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2012.this.timer.setVisibility(0);
                    geography2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    geography2012.this.scr.setVisibility(8);
                    geography2012.this.chr.stop();
                    geography2012.this.toolbar.setVisibility(8);
                    geography2012.this.Relative.setBackgroundColor(-7829368);
                    geography2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2012.this.getBaseContext());
                    int unused = geography2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2012.this.highscoreGeography2012 = defaultSharedPreferences.getInt("geo2012hs", 0);
                    int access$600 = geography2012.this.part1 + geography2012.this.part2 + geography2012.this.part3 + geography2012.this.part4 + geography2012.this.part5 + geography2012.this.part6 + geography2012.this.part7 + geography2012.this.part8 + geography2012.this.part9;
                    geography2012.this.resultText.setText(String.valueOf(access$600));
                    geography2012.this.progressbar.setProgress(access$600);
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
                    int unused11 = geography2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = geography2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = geography2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = geography2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = geography2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = geography2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = geography2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = geography2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "geo2012hs";
                    int unused19 = geography2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = geography2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = geography2012.this.answered1 + geography2012.this.answered2 + geography2012.this.answered3 + geography2012.this.answered4 + geography2012.this.answered5 + geography2012.this.answered6 + geography2012.this.answered7 + geography2012.this.answered8 + geography2012.this.answered9 + geography2012.this.answered10;
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
                    if (access$600 > geography2012.this.highscoreGeography2012) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - geography2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1geo121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1geo122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1geo123", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1geo124", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1geo125", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1geo126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1geo127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1geo128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1geo129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1geo1210", 0);
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
                        editor.putString("scoregeo121", str3);
                        editor.putLong("date1geo121", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoregeo122", str5);
                            editor.putLong("date1geo122", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoregeo123", str5);
                            editor.putLong("date1geo123", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoregeo124", str5);
                            editor.putLong("date1geo124", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoregeo125", str5);
                            editor.putLong("date1geo125", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoregeo126", str5);
                            editor.putLong("date1geo126", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoregeo127", str5);
                            editor.putLong("date1geo127", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoregeo128", str5);
                            editor.putLong("date1geo128", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoregeo129", str5);
                            editor.putLong("date1geo129", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoregeo1210", str5);
                            editor.putLong("date1geo1210", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dategeo121", 0);
                    long j12 = defaultSharedPreferences.getLong("dategeo122", 0);
                    long j13 = defaultSharedPreferences.getLong("dategeo123", 0);
                    long j14 = defaultSharedPreferences.getLong("dategeo124", 0);
                    long j15 = defaultSharedPreferences.getLong("dategeo125", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dategeo126", 0);
                    long j17 = defaultSharedPreferences.getLong("dategeo127", 0);
                    long j18 = defaultSharedPreferences.getLong("dategeo128", 0);
                    long j19 = defaultSharedPreferences.getLong("dategeo129", 0);
                    long j20 = defaultSharedPreferences.getLong("dategeo1210", 0);
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
                        editor2.putString("iScoregeo121", str4);
                        editor2.putLong("dategeo121", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoregeo122", str6);
                            editor2.putLong("dategeo122", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoregeo123", str6);
                            editor2.putLong("dategeo123", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoregeo124", str6);
                            editor2.putLong("dategeo124", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoregeo125", str6);
                            editor2.putLong("dategeo125", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoregeo126", str6);
                            editor2.putLong("dategeo126", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoregeo127", str6);
                            editor2.putLong("dategeo127", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoregeo128", str6);
                            editor2.putLong("dategeo128", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoregeo129", str6);
                            editor2.putLong("dategeo129", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoregeo1210", str6);
                            editor2.putLong("dategeo1210", l.longValue());
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
                        geography2012.this.scr.setVisibility(8);
                        geography2012.this.chr.stop();
                        geography2012.this.toolbar.setVisibility(8);
                        geography2012.this.Relative.setBackgroundColor(-7829368);
                        geography2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2012.this.getBaseContext());
                        int unused = geography2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = geography2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = geography2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = geography2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = geography2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = geography2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = geography2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = geography2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = geography2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = geography2012.this.highscoreGeography2012 = defaultSharedPreferences.getInt("geo2012hs", 0);
                        int access$600 = geography2012.this.part1 + geography2012.this.part2 + geography2012.this.part3 + geography2012.this.part4 + geography2012.this.part5 + geography2012.this.part6 + geography2012.this.part7 + geography2012.this.part8 + geography2012.this.part9;
                        TextView access$1600 = geography2012.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        geography2012.this.progressbar.setProgress(access$600);
                        geography2012.this.progressbar.setMax(100);
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
                        int unused11 = geography2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = geography2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = geography2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = geography2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = geography2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = geography2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = geography2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = geography2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = geography2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = geography2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = geography2012.this.answered1 + geography2012.this.answered2 + geography2012.this.answered3 + geography2012.this.answered4 + geography2012.this.answered5 + geography2012.this.answered6 + geography2012.this.answered7 + geography2012.this.answered8 + geography2012.this.answered9 + geography2012.this.answered10;
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
                        if (access$600 > geography2012.this.highscoreGeography2012) {
                            edit.putInt("geo2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - geography2012.this.chr.getBase()) / 1000;
                        String str = "dategeo129";
                        String str2 = "dategeo128";
                        String str3 = "dategeo127";
                        String str4 = "dategeo126";
                        String str5 = "dategeo125";
                        String str6 = "dategeo124";
                        String str7 = "dategeo123";
                        String str8 = "dategeo122";
                        String str9 = "dategeo121";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1geo1210";
                        String str11 = "date1geo129";
                        if (geography2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1geo121", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1geo122", 0);
                            long j3 = defaultSharedPreferences.getLong("date1geo123", 0);
                            String str13 = "date1geo123";
                            String str14 = f;
                            String str15 = "date1geo121";
                            long j4 = defaultSharedPreferences.getLong("date1geo125", 0);
                            String str16 = "date1geo125";
                            String str17 = "date1geo124";
                            String str18 = "date1geo126";
                            long j5 = defaultSharedPreferences.getLong("date1geo126", 0);
                            long j6 = defaultSharedPreferences.getLong("date1geo127", 0);
                            String str19 = str11;
                            String str20 = "date1geo128";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1geo122";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1geo124", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1geo127";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1geo128", 0));
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
                                editor3.putString("scoregeo121", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoregeo122", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoregeo123", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoregeo124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoregeo125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoregeo126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoregeo127", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoregeo128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoregeo129", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoregeo1210", str25);
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
                            long j18 = sharedPreferences.getLong("dategeo1210", 0);
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
                                editor4.putString("iScoregeo121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoregeo122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoregeo123", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoregeo124", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoregeo125", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoregeo126", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoregeo127", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoregeo128", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoregeo129", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoregeo1210", str28);
                                    editor4.putLong("dategeo1210", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1geo121";
                            String str30 = "date1geo124";
                            String str31 = str11;
                            String str32 = "date1geo122";
                            String str33 = "date1geo127";
                            String str34 = "date1geo125";
                            String str35 = "date1geo126";
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
                            long j21 = sharedPreferences2.getLong("date1geo123", 0);
                            String str40 = str32;
                            String str41 = "date1geo123";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1geo128";
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
                                editor2.putString("scoregeo121", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoregeo122", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoregeo123", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoregeo124", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoregeo125", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoregeo126", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoregeo127", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoregeo128", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoregeo129", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoregeo1210", str49);
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
                            long j38 = sharedPreferences3.getLong("dategeo1210", 0);
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
                                editor.putString("iScoregeo121", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoregeo122", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoregeo123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoregeo124", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoregeo125", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoregeo126", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoregeo127", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoregeo128", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoregeo129", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoregeo1210", str56);
                                    editor.putLong("dategeo1210", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        geography2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2012.this.scr.setVisibility(8);
                geography2012.this.chr.stop();
                geography2012.this.toolbar.setVisibility(8);
                geography2012.this.Relative.setBackgroundColor(geography2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2012.this.scr.setVisibility(0);
                geography2012.this.toolbar.setVisibility(0);
                geography2012.this.telegram_layout.setVisibility(8);
                geography2012.this.chr.start();
                geography2012.this.Relative.setBackgroundColor(geography2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = geography2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = geography2012.this.mInterstitialAd = null;
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
                geography2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
