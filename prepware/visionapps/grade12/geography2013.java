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

public class geography2013 extends AppCompatActivity {
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
    private Boolean f578b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2013;
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
    private Toolbar f579tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2013);
        this.f578b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2013);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one of the following tree is an example of highland forests of Ethiopia? ", 0, 0, 0, 0, 0, "Acacia ", "Woira ", "Sholla ", "Cactus", "Highland forests of Ethiopia grow at an altitude between 1500m and 3300m. They consist of kerkha, Tid, zigbaand woira forests.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("2.", "In which of the following places does woodland savanna vegetation predominate? ", 0, 0, 0, 0, 0, "Wollega", "Gonder", "Woliso ", "Hawassa ", "In Ethiopia woodland savanna grasslands are found in southern half of Ziway, Lanagano, Abiyata and Hawassa.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("3.", "Which one of the following is associated to the slash and burn practices?", 0, 0, 0, 0, 0, "It is keeping the land for grazing. ", "It is preparing land for cultivation. ", "It is the way of timber production. ", "It is the process of charcoal production. ", "People are involved in slash and burn practices to clear forestland in order to prepare for farming. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("4.", "In which of the following areas are tourists not allowed to practice hunting in Ethiopia? ", 0, 0, 0, 0, 0, "Game reserves ", "National parks ", "Local in color ", "Sanctuaries", "Sanctuaries are wild animal conservation areas where hunting is strictly prohibited. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("5.", "What is the characteristics of the soil derived from crystalline rocks?", 0, 0, 0, 0, 0, "Deep and fertile ", "Poor and thin ", "Black in color ", "Rich in humus ", "Soils with crystalline rock background are poor and thin. They are also rocky and acidic. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("6.", "Which of the following type of soil in Ethiopia is limited to grazing purpose due to its poor drainage qualities? ", 0, 0, 0, 0, 0, "Vertisols", "Acrisols ", "Regosols", "Lithosols", "Verisols (black basaltic soil) are limited for grazing purpose due to their poor drainage quality. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("7.", "Among the following factors, which one exerts the highest impact on Ethiopian soils? ", 0, 0, 0, 0, 0, "Over cultivation ", "Road construction ", "Deforestation ", "Overgrazing ", "Deforestation is progressing at a rapid rate and has become one of the main causes for Ethiopia's fastened erosion rate. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("8.", "Imagine a given country is highly affected by famine and requests international communities for aid. However, these communities are unwilling to help the country. The fact that they believe famine could serve as a means to control population pressure. Which population theory is related to the issues given above?", 0, 0, 0, 0, 0, "Boserupian", "Malthusian", "Anti-Malthusian", "Marxian", "Malthusian population theorist believed that famine is one of a means to control population pressure. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("9.", "Which of the statements below reflects the trends of population growth in Ethiopia? ", 0, 0, 0, 0, 0, "The population size recorded in 2007 was three times more than that of the 1970s. ", "There has been an increase in the population growth rate over recent decades. ", "There was a slight increase in the rate of population growth from 1950s onwards. ", "There was a fast rate of population growth before the 1920s ", "With worldwide efforts to control malaria and others diseases in the 1950s and later, the growth rate rose from time to time in Ethiopia. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("10.", "How is the age structure of the Ethiopia population described? ", 0, 0, 0, 0, 0, "Low number of dependent population ", "High number of old age population ", "Low number of young age population ", "High number of adult age population ", "Age structure is the distribution of a given population into age groups. Based on 2007 census data, child, adult and old age comprises 45%, 51.8% and 3.2%, respectively. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("11.", "There is a long-lasting conflict of interest over the use of the Nile water between the upper and lower course counties. In order to solve this problem, the basin countries have worked together and developed the Nile Basin initiative. What is the main aim of this initiative? ", 0, 0, 0, 0, 0, "To make the upper course countries more beneficiary of the water than the lower countries. ", "To bring about equitable utilization of the river among the basin countries. ", "To ask the lower course countries for a compensation for their use of the Nile water. ", "To share the finance and benefit of dams that will be constructed both in the upper and lower course of the river. ", "The main aim of the Nile Basin Initiation (NBI) is to bring about equitable utilization of the river among the upper and lower riparian countries.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("12.", "What type of vegetation in Africa is extensively developed in areas that have wet summers and dry winters?", 0, 0, 0, 0, 0, "The Tropical grassland vegetation ", "The tropical rainforest vegetation ", "The Afro-Alpine vegetation ", "The Mediterranean vegetation ", "Tropical grassland vegetation develops in the area of tropical continental climate which is characterized by wet summer and dry winter. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("13.", "Maquis, cork oak and wild olive plants are commonly grown in which of the following climatic regions of Africa? ", 0, 0, 0, 0, 0, "The Tropical continental climatic region ", "The Temperate continental climatic region ", "The Mediterranean climatic region ", "The Equatorial climatic region ", "Maquis, cork oak and wild olive plants commonly grow in Mediterranean climate region. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("14.", "A wild animal called 'jerboa' is mainly found in which one of the following climatic regions? ", 0, 0, 0, 0, 0, "Desert and semi-desert ", "Tropical maritime ", "Monsoon", "Highland", "Desert and semi-desert areas host many times of wild animals such as wild ass, snakes, fennel fox and Jerboa.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("15.", "Natural vegetation and wild animals of Africa are facing serious threats due to various human actions. What conservation measure should be taken in order to safeguard these natural resources. ", 0, 0, 0, 0, 0, "Encouraging extensive use of firewood", "Promoting domestication of wild animals ", "Supporting legal human settlement ", "Raising the awareness of people ", "Raising the awareness of the people is a key to overcome challenges faced by natural vegetation and wild animals of Africa. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("16.", "In which of the following climatic regions of Africa are Ferrosols mainly found? ", 0, 0, 0, 0, 0, "Mediterranean", "Equatorial", "Highland", "Monsoon", "Ferrosols are red and yellow in color. They are mainly found in Equatorial areas. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("17.", "0ne of the following is among the most densely populated areas of Africa. Which one is it? ", 0, 0, 0, 0, 0, "Namibia", "Mauritania", "Sao Tome and Principe ", "Central African Republic ", "Sao Tome and Principe is one of the most densely, populated country. Its average density is 169 people/km2.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("18.", "Which region of Africa has the highest rate of mortality?", 0, 0, 0, 0, 0, "Western Africa ", "Eastern Africa ", "Northern Africa ", "Southern Africa ", "According to UN world population data sheet (2009) report, Southern Africa has the highest rate of mortality which is 15/1000.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("19.", "Which of the following countries is known for having the lowest sex ratio in Africa? ", 0, 0, 0, 0, 0, "Malawi", "Uganda", "Gabon", "Senegal", "Sex ratio refers to the proportion of males to females in the overall population of a given area. The ratio of Malawi, Uganda, Gabon and Senegal is 98%, 97%, 103.66% and 95.3%, respectively. Therefore, Senegal has lowest population density.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("20.", "What is the movement of people from one area to another in search of seasonal job called? ", 0, 0, 0, 0, 0, "Temporary migration ", "Intra-continental migration ", "International migration ", "Permanent migration ", "Temporary migration involves the movement of people whereby they have left their original residence for another for short period of time, and come back to their original place. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("21.", "At what stage of the Action Research is the Research Design prepared?", 0, 0, 0, 0, 0, "After collecting the required data ", "Before reviewing the literature ", "After formulating the research problem ", "Before defining the objectives of the study ", "Research design is the conceptual frame work within which research work is could be conducted. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("22.", "Assume you are conducting an action research entitled 'Lateness of students for morning classes'. What will be the first step to conduct this action research? ", 0, 0, 0, 0, 0, "Making review of literature ", "Stating objectives of the study ", "Collecting the required data ", "Determining the sample size ", "After formulating research problem if could better for the researcher to define the objectives of the study.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("23.", "What is the disadvantage of having a large areal size for countries?", 0, 0, 0, 0, 0, "Shortage of agricultural products ", "Unavailability of diverse resources ", "Difficulty of communication ", "Causes conflicts of ethnic groups ", "Advantage of having large size is possessing diverse agro-climate zones, possessing a large amount of arable land, having a great variety of mineral resources. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("24.", "Which of the following explains the relative location of Ethiopia? ", 0, 0, 0, 0, 0, "It is situated west of Djibouti. ", "It is found north of Eritrea. ", "It is located east of Somalia. ", "It is located southwest of Sudan. ", "Relative location of Ethiopia is west of Djibouti, north of Kenya, Northwest of Somalia south of Eritrea and East of Sudan.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("25.", "What proves the relative compact shape of Ethiopia? ", 0, 0, 0, 0, 0, "Ethiopia has a large geographical areal size. ", "Ethiopia is a landlocked country. ", "It is located a short distance away from Equator and Prime meridian. ", "Its small differences between latitudinal and longitudinal distances. ", "Ethiopia has relatively compact shape. This is proven by its small differences between latitudinal and longitudinal distance. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("26.", "Which of the following major events took place in the horn of Africa during the Paleozoic Era? ", 0, 0, 0, 0, 0, "Intensive volcanic activities ", "Outpouring of trappean lave series ", "Predominance of invertebrates ", "Disappearance of dinosaurs ", "Major events took place in the Horn of Africa during the Paleozoic area were denudation and peneplanation, formation of coal, and predominance of invertebrates. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("27.", "Which of the following eras is associated with a pluvial rain in the horn Africa? ", 0, 0, 0, 0, 0, "The Paleozoic Era ", "The Precambrian Era ", "The Cenozoic Era ", "The Mesozoic Era ", "A heavy rain called pluvial rain occurred in the Horn of Africa as a result of climate change in the Cenozoic era, Quaternary period.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("28.", "Among the following mountains, which one belongs to the southeastern highlands of Ethiopia? ", 0, 0, 0, 0, 0, "Assimba ", "Guna ", "Gughe ", "Batu ", "South eastern highlands consist of Arsi-Bale massifs, Harerghe plateau and Sidama plateua. Batu mountain belongs to Bale massifs", "d", 0, 1, this.f578b));
        arrayList.add(new questions("29.", "What makes the Afar Triangle different from the other rift valley subdivisions of Ethiopia? ", 0, 0, 0, 0, 0, "Prevalence of fossil rich sediments ", "Presence of dense human population ", "Dense vegetation cover of the area ", "Presence of lakes of aesthetic values ", "Afar Triangle of Ethiopia is different since it consists of fossil rich sediments and rich archaeological sites. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("30.", "Which of the following southeastern lowlands borders the Indian Ocean? ", 0, 0, 0, 0, 0, "The Afar plains ", "The Banadir plains ", "The Borena plains ", "The Elkeri Plains ", "The Banadir lowland (in Somalia) is grouped in the SE lowlands of the Horn of African. It borders with the Northern Indian Ocean. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("31.", "In which of the following areas is most of the Ethiopian population concentrated? ", 0, 0, 0, 0, 0, "Lowlands and plains ", "Highlands and plateaus ", "River valleys and lakes ", "Desert and semi-deserts ", "Population distribution in Ethiopia is uneven. Most of the population concentrated in the highlands and plateau. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("32.", "Which one of the following factors is related to the current population distribution in arid and semi-arid lowland areas of Ethiopia?", 0, 0, 0, 0, 0, "Nomadic herding ", "Mixed agriculture ", "Sedentary farming ", "Shifting cultivation ", "The lowlands in most parts of Rift valley and peripheral areas of are characterized by pastoralism with temporary settlement.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("33.", "In which of the following areas are most urban settlements of Ethiopia found? ", 0, 0, 0, 0, 0, "On steep slopes of mountains ", "Along major transport networks ", "Along the main Ethiopian Rift Valley ", "Around major rivers and lakes ", "Most urban settlements of Ethiopia have developed along major transport routes, which attracted people the settle in those areas. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("34.", "What generalizations can be made about crude death rate (OR)?", 0, 0, 0, 0, 0, "It serves as an indicator for future population potential. ", "It reveals the age and sex patterns of mortality. ", "It is a poor indicator of socio-economic condition of population.", "It provides detailed information about mortality in a given population.", "The CDR of a given population reveals neither the age and sex patterns of mortality levels nor the socio- economic characteristics of a given population ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("35.", "Developing countries put blames on the developed countries for their intensive use of fossil fuels. What major threat relates to the intensive use of fossil fuels by developed countries? ", 0, 0, 0, 0, 0, "Water pollution ", "Air pollution ", "Soil pollution", "Noise pollution ", "Most of developed countries intensively use fossil fuel for industries and vehicles. This cause air pollution. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("36.", "Which one of the following regions has the lowest percentage of urban population in Ethiopia? ", 0, 0, 0, 0, 0, "Afar", "Gambella ", "Sidam ", "Harari ", "Harari national region has the lowest urban population from the country's urban population. It is about 0.84% in 2007 census.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("37.", "How is the trend of urbanization in Ethiopia explained? Ethiopia has", 0, 0, 0, 0, 0, "had a slow rate of urbanization in recent years.", "had a low rate of urbanization after the Italian occupation.", "a low rate and high level or urbanization in Africa.", "one of the least levels of urbanization in the world.", "Ethiopia has one of the least levels of urbanization (16.2%) and one of the least rates of urbanization in the world. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("38.", "Which one of the following describes economic growth and development trend in Ethiopia?", 0, 0, 0, 0, 0, "Since 1991 the Ethiopian economy has performed better than it did in the earlier years ", "There was appreciable economic growth and development during the Dergue regime. ", "Access to quality social services has been decreasing from time to time.", "Agriculture sector still remains the largest contributor of the Gross Domestic Product (GDP). ", "Agricultural sector is still the largest contributor for the Gross Domestic Product of Ethiopia. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("39.", "Among the following service sub-sectors in Ethiopia, which one is the lowest in terms of growth performance over the past two decades?", 0, 0, 0, 0, 0, "Health", "Education", "Public administration and Finance ", "Banking and insurance ", "Public administration and finance show the lowest in terms of growth performance over the past two decades. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("40.", "How is the present feature of Ethiopian socio-economic development described? ", 0, 0, 0, 0, 0, "Ethiopian has a well-functioning manufacturing sector contributing lot to socio-economic development. ", "Industrial sector is the leading in terms of contribution to socio-economic development. ", "The socio-economic development of the country is still low compared to that of other countries. ", "Ethiopia has a mature and diversified economy with a high proportion of skilled labor force. ", "The socio-economic development of Ethiopia is still low compared to that of other countries. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("41.", "Which of the following describes the scope of geography? ", 0, 0, 0, 0, 0, "The scope of geography lies beyond the upper atmosphere and the ocean current. ", "Geography is directly interested in investigating thermodynamic characteristics of the interior of the earth's core", "Geography focuses more on the outer space than the surface of the earth.", "Geography focuses on spatial aspects of phenomena between the lithosphere and the lower layer of atmosphere.", "The scope of geography focused on spatial aspects of phenomena between the lithosphere and the lower layer of the atmosphere.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("42.", "Geographers use systematic approach under which of the circumstances listed below? ", 0, 0, 0, 0, 0, "Exploring the physical and human geography of Africa.", "Studying every details of the world in a holistic way. ", "Investigation the scale of climate impact on pastoral communications.", "Describing the general characteristics of the Horn of Africa. ", "Geographers use systematic approach to study the distribution of a single feature over the surface of the earth. For instance, the scale of climate impact on pastoral communities.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("43.", "How would you describe the school of possibilism? ", 0, 0, 0, 0, 0, "It thinks that human beings can modify nature using technology. ", "It assumes that man is under the mercy of nature. ", "It views that neither environment nor human beings have the upper hand.", "It is a philosophical thought that gives more emphasis to nature.", "Environmental possibilism advocates that human beings can modify nature using technology ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("44.", "Which one of the following could be among the conditions that initiated the emergence of applied geography? ", 0, 0, 0, 0, 0, "The urge to answer the where and what questions across the world", "The growing need to solve socio-economic and political problems", "The emergence of primitive communities", "Discovery of the unknown part of the world", "The growing need to solve socio-economic and political problems is one of the conditions that initiated the emergence of applied geography.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("45.", "Among the following disciplines, which one has a more similar concern with population geography?", 0, 0, 0, 0, 0, "Meteorology", "Sociology", "Demography", "Economics", "Demography has more similar concern with population Geography. It is the study of human population, including their size, growth, density, etc.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("46.", "What type of drainage pattern develops in an area where the tributaries join the main river at right angles? ", 0, 0, 0, 0, 0, "Trellis", "Dendritic", "Centripetal", "Radial", "In trellis drainage pattern tributaries join the main river nearly at right angle. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("47.", "In which of the following conditions does a river capture occur?", 0, 0, 0, 0, 0, "When a victim stream erodes the course of a pirate stream", "When a pirate stream overrides a victim stream ", "When the rock on the direction of a pirate stream is softer ", "When heavy rain showers the watershed of a victim stream ", "River capture occur when the rock on the side of the victim river is softer, heavy rainfall on the pirate's river side of the watershed, the pirate river has steeper course and erode it and the watershed consists of lower round.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("48.", "Which one of the following features describes the middle course of a river? ", 0, 0, 0, 0, 0, "Oxbow lakes ", "Waterfalls", "V-shaped valleys ", "Meanders", "In the middle course the steepness of the river channel decreases. The river began to meander especially in areas adjacent to the lower course.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("49.", "Assume that you are traveling to the southern region of Ethiopia, crossing Hawassa town on the way to the Gedeo Zone. During your travel, what type of settlement pattern would you be more likely to observe?", 0, 0, 0, 0, 0, "Nucleated", "Dispersed", "Ribbon", "Linear", "Linear (ribbon) settlement has elongated shape. It develops along road route or ridge. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("50.", "Among the following, which one is responsible for the establishment of Wereta Town at its present location?", 0, 0, 0, 0, 0, "Hot spring ", "Fogera basin ", "Mineral resources ", "Tis Isat fall ", "One of the main reason for the establishment of Wereta town is intensively cultivated Fogera basin drained by the Rib and Gumera rivers.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("51.", "Among the following, which one explains about indicators of development in Ethiopia? ", 0, 0, 0, 0, 0, "There has been a declining literacy rate in country recently.", "Infant mortality rate is below the average of the Sub-Saharan countries.", "A greater proportion of rural population has access to electricity.", "There has been an increasing of access to clean water in recent years.", "One of the indicators of development in Ethiopia is an increasing access to clean water in recent years.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("52.", "The Great Ethiopian Renaissance Dam will open a new chapter for the socio-economic development of the country. Which of the following could be the contribution of this dam?", 0, 0, 0, 0, 0, "Providing supply of potable water ", "Promoting water transport of the country ", "Promoting tourism development ", "Regulating weather condition of the country", "Despite its potential for generating HEP and irrigation, GERD could also contribute for tourism and fishing industries", "c", 0, 1, this.f578b));
        arrayList.add(new questions("53.", "From which of the following regions, has Ethiopia been importing most items in recent years? ", 0, 0, 0, 0, 0, "Europe and Australia ", "The Middle east and Asia", "The Far east and Central America ", "North America and Africa ", "According to ministry of Trade and Industry, Ethiopia's most important source imports in 2004/05 were the middle East and Asia which accounted for 57.5%. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("54.", "Which one of the following was the focus of the Plan for Accelerated and Sustained Development to End Poverty (PASDEP) strategy in Ethiopia?", 0, 0, 0, 0, 0, "Encouraging rapid population growth", "Promoting rapid non-public sectors", "Encouraging traditional subsistent farming", "Expanding labor- intensive production activities ", "One of the initiatives of PASDEP creating is jobs. The goals were managing the dynamics of population growth and expanding labor- intensive production activities.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("55.", "What is the demerit of migration to the receiving country? ", 0, 0, 0, 0, 0, "It reduces pressure on resources.", "It causes a decline in birth rate. ", "It triggers division among families.", "It creates shortage of labor force.", "The demerits of migration for receiving country are pressure on job, low quality house, ethnic tension, limited skill worker, language difficulties, difficulty to practice their own religion, cult etc.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("56.", "Which one of the following characterizes urbanization in Africa?", 0, 0, 0, 0, 0, "Low level and high rate of urbanization ", "High level and low rate of urbanization", "Low level and low rate of urbanization ", "High level and high rate of urbanization ", "Urbanization in Africa is at lowest level (only 38%). However, rate of urbanization is very fast.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("57.", "0ne among the following is a major problem that affects urban centers of Africa. Which one is it?", 0, 0, 0, 0, 0, "Air pollution", "Squatter settlement", "Shortage of labor force", "Nucleated settlement", "Urban centers in Africa are affected by squatter settlement, urban slum, environmental degradation, poor sanitation, unemployment, poverty, social evils, etc. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("58.", "Recently, the government of Ethiopia has reported the rise of per capita income of Ethiopian nationals to 1000 US dollars per year. What does this imply? ", 0, 0, 0, 0, 0, "High income groups are expected to earn 1000 US dollar per year.", "Low income groups actually earn 1000 US dollar per year.", "Each Ethiopian citizen receives 1000 US dollar per year from the government. ", "Ethiopian citizens, on average, expect to earn 1000 US dollar per year.", "As per government report the per capita income of Ethiopians is 1000 USD/year. It imply that, Ethiopian citizens, on average, receives 1000 USD per year. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("59.", "Which of the statements below explains the Africa economy?", 0, 0, 0, 0, 0, "Most African countries have a negative trade balance. ", "Manufacturing sector is the backbone of the economy.", "Africa has a diversified economy.", "Mining is the main economic activity.", "Most African countries have a negative trade balance. This is resulted from export of raw material and import of expensive manufacturing products.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("60.", "Which one best described the human resources of Africa? ", 0, 0, 0, 0, 0, "Most of the African population is underemployed.", "Africa has a highly skilled manpower. ", "There is a low working labor force potential in the continent.", "Africa has effectively utilized its human resources potential.", "The potential of mineral resource is large and varies. However, the level of utilization of the resource very low. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("61.", "How would you explain the potential and the actual resources exploitation in Africa? ", 0, 0, 0, 0, 0, "There is over utilization of resources in the continent.", "There is a sustainable use of natural resources. ", "Many of the resources of the continent are untouched. ", "The continent is potentially poor in natural resources. ", "The potential of mineral resource is large and varied. However, the level of utilization of the resource very low.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("62.", "Which of the statements below describes research?", 0, 0, 0, 0, 0, "It is a systematic way of inventing new things.", "It is a modern way of recording historical phenomena.", "It is a way of exploring geographical areas.", "It is scientific procedure of investigation problems.", "Research is a scientific method of investigating answer for already identified problem. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("63.", "When is a quantitative research approach applied in geography?", 0, 0, 0, 0, 0, "In analyzing data from key informant interviews", "In verifying a particular geographical theory", "In describing the culture of a society", "In content analysis and narrations of an event", "Quantitative research approach is applied when a given theory is tested and verified. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("64.", "When is a quantitative research approach applied in geography?", 0, 0, 0, 0, 0, "In analyzing data from key informant interviews", "In verifying a particular geographical theory", "In describing the culture of a society", "In content analysis and narrations of an event ", "Quantitative research approach is applied when a given theory is tested and verified. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("65.", "Under which of the following is Dukam Town mainly categorized?", 0, 0, 0, 0, 0, "Commercial town ", "Mining town ", "Market town ", "Industrial town ", "Dukam Town categorized into industrial town. Such towns are engaged in processing raw materials into finished goods.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("66.", "Which one of the following governments initiated the first application of GIS to analyze land inventory data? ", 0, 0, 0, 0, 0, "The Canadian Government", "The USA Government", "The Norwegian Government", "The Australian Government", "The first GIS application was developed by Canadian government to analyze land inventory data. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("67.", "Suppose you are assigned as a field supervisor to access crises in locust infect areas of ethiopia. How does GIS primarily assist you in the assessment of the crisis?", 0, 0, 0, 0, 0, "To count the locusts in the study area", "To map hotspots of the study area", "To predict future occurrence of the crises", "To broadcast the situation of the crises", "When we are assigned to assess crises in locusts infected areas of ethiopia, GIS primarily assists us to map hotspots of the study area.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("68.", "What is the relative location of Africa? ", 0, 0, 0, 0, 0, "It is found west of the Atlantic Ocean.", "Its extreme north is Cape Verde.", "It is located south of the Mediterranean Sea.", "It is located mainly in the temperature zone.", "Africa is located south of Mediterranean Sea, east of Atlantic Ocean, NW of Indian ocean and west of red seas and Gulf of Aden.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("69.", "0ne of the following is the impact of smooth and straight coastline of Africa. Which one is it?", 0, 0, 0, 0, 0, "The coastlines remain conducive for maritime trade.", "Construction of man-made ports is an expensive endeavor.", "Significant influence of maritime climate in the interior areas.", "Ease of sea transport and access to important sea routes.", "Africa has smooth and straight coast line. This makes the continent poor in natural harbors. As a result, construction of man-made parts is a expensive endeavor. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("70.", "Which one of the following describes Northern Africa? ", 0, 0, 0, 0, 0, "It is a region where most highlands of the continent are found.", "It is the largest in areal coverage among regions of the continent.", "It is the second most populous region in the continent.", "It is a region with the most diverse economy in the continent.", "Northern Africa is the largest in area cover among regions of Africa. It covers about 1/3rd of African's land area.", "b", 0, 1, this.f578b));
        arrayList.add(new questions("71.", "Among the following, which one indicates geographical location of African regions? ", 0, 0, 0, 0, 0, "Western Africa is found to the west of the Atlantic Ocean.", "The horn of Africa is located in the central part of Africa.", "The Maghreb region is found in northern Africa.", "Eastern Africa is located to the northeast of the Indian Ocean. ", "Western Africa is found east of Atlantic Ocean. The Horn of Africa is located in the NE part of Africa. The Maghreb region is found in the North Africa. Eastern Africa is found in the NW of Indian ocean.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("72.", "Which one of the following geological eras was known for extensive denudation and peneplanation? ", 0, 0, 0, 0, 0, "The Mesozoic Era ", "The Cenozoic Era", "The Precambrian Era", "The Paleozoic Era", "Paleozoic era (from 600-250 million years) was known by massive denudation un peneplanation activity", "d", 0, 1, this.f578b));
        arrayList.add(new questions("73.", "In which of the following countries is the highest mountain of Africa located? ", 0, 0, 0, 0, 0, "Botswana", "Cameroon", "Tanzania", "Algeria", "Africa's highest mountain i.e., Mount Kilimanjaro which is 5895m above sea level is found in Tanzania. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("74.", "In which of the following climatic controls has a major effect on most parts of eastern Africa?", 0, 0, 0, 0, 0, "Altitude", "Latitude", "Ocean current", "Longitude", "", "a", 0, 1, this.f578b));
        arrayList.add(new questions("75.", "Which of the following can be generalized about the characteristics of the major rivers of Ethiopia? The major of Ethiopia ", 0, 0, 0, 0, 0, "have greater navigational potential.", "are characterized by gentle slopes. ", "are seasonally fluctuated in their volume.", "rise from rift valley parts of the country.", "Rivers of Ethiopia characterized by steep slopes, seasonal fluctuation in their volume, rise from high plateau of the country and frequent waterfalls and rapids. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("76.", "Which of the following explains about the Indian Ocean drainage system in Ethiopia?", 0, 0, 0, 0, 0, "Its major rives originate from the southeastern highlands. ", "It accounts for the largest annual water flows of the country.", "The Awash and the Omo-Gibe are the major rivers of the system.", "It drains the south western highlands and lowlands.", "The sources of water Indian drainage system are the southern the southeaster Ethiopia highlands.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("77.", "Among the following, which one is a major significance of Ethiopian rivers? ", 0, 0, 0, 0, 0, "Huge geothermal potential", "Sources of minerals", "Hydro-power generation", "Serve as transport routes", "Ethiopian rivers have many uses some of the use are source of minerals, hydro-power generation, potable water supply and means transport routes.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("78.", "Which of the following can be the immediate solution for the current problem that Lake Tana facing?", 0, 0, 0, 0, 0, "Controlling population pressure on the lake", "Reducing sediment flow to the lake", "Preventing deforestation in the area’s surroundings lake", "Avoiding the exotic plant dominating the lake", "One of the immediate solutions for current problem that Lake Tana facing is avoiding the exotic plant dominating the lake.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("79.", "Which factor determine the temporal variation of temperature in Ethiopia?", 0, 0, 0, 0, 0, "Latitude", "Cloud cover", "Planetary winds", "Ocean currents", "One of the reasons for temporal variation of temperature in Ethiopia is the distance of the overhead sun and its apparent north south movement across the equator. It is related with latitude.", "a", 0, 1, this.f578b));
        arrayList.add(new questions("80.", "Why does the upper rift valley region of Ethiopia face rain shadow effect? This is mainly because of the effect of ", 0, 0, 0, 0, 0, "latitude", "distance from the sea", "mountain barriers", "weather systems", "Due to its location in the lee wards side of rain bearing equatorial westerly winds, the upper rift valley (Afar triangle) affected by rain shadow. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("81.", "Where is the hottest area of Ethiopia located? ", 0, 0, 0, 0, 0, "Around the lake Chamo", "In the main Ethiopian rift valley", "Near Mount Batu", "In the Afar triangle", "The hottest area in Ethiopia is found in the Afar Triangle of the Rift valley.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("82.", "Where are the wettest areas of Ethiopia mainly located? ", 0, 0, 0, 0, 0, "Northwestern highlands", "Southwestern highlands", "Northeastern highlands", "Southeastern highlands", "The wettest areas of Ethiopia are mainly located in south western highlands. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("83.", "Which of the following places receives the highest amount of rainfall during summer season? ", 0, 0, 0, 0, 0, "Hawassa", "Samara", "Shakiso", "Ambo", "Summer rainfall region consists of the north west highlands and western lowlands of Ethiopia. Ambo categorized to the northwest highlands. Therefore, it receives summer maximum rain", "d", 0, 1, this.f578b));
        arrayList.add(new questions("84.", "What is the smallest rainfall region in Ethiopia?", 0, 0, 0, 0, 0, "Summer rainfall region", "Winter rainfall region", "Merged spring, summer and autumn rainfall region", "Autumn and spring rainfall region", "Merged spring, summer, and autumn rainfall region is the smallest rainfall region in Ethiopia.", "c", 0, 1, this.f578b));
        arrayList.add(new questions("85.", "Among the following winds, which one dominates the climate of tropical Africa? ", 0, 0, 0, 0, 0, "Westerly winds ", "Monsoon winds ", "Polar easterlies ", "Trade winds ", "Trade wind flows from sub-Tropical High to Equatorial Low dominates the climate of tropical Africa. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("86.", "In which of the following months does Southern Africa experience the highest temperature?", 0, 0, 0, 0, 0, "December, January and February", "September, October and November", "June, July and August", "March, April and May", "In December, January and February southern part of Africa experience relatively higher temperature. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("87.", "Which of the following countries mostly experiences tropical continental type of climate in Africa?", 0, 0, 0, 0, 0, "Somalia", "Tunisia", "Madagascar", "Morocco", "Tropical continental climate occurs north and south of the tropical wet zone, in many parts of western Africa, south Africa", "c", 0, 1, this.f578b));
        arrayList.add(new questions("88.", "In which of the following areas of Africa does a highland climate occur? ", 0, 0, 0, 0, 0, "The coastal areas of western Africa", "The Drakensberg Mountain region ", "The Maghreb region ", "The Equatorial rainforest region", "Highland climate occur in east African Highlands, the Drakensberg Mountain region and the Atlas Mountain region northern Africa", "b", 0, 1, this.f578b));
        arrayList.add(new questions("89.", "Where in Africa are most of the drought prone areas located? ", 0, 0, 0, 0, 0, "Among the Mozambique coast", "In cape Province of South Africa", "In the Mediterranean region", "In the Sahel region", "The Sahel region is found in the southern fringe of the Sahara Desert stretching from Senegal to Somalia. It is the most drought prone area.", "d", 0, 1, this.f578b));
        arrayList.add(new questions("90.", "To which of the following drainage system does the Congo River belong? ", 0, 0, 0, 0, 0, "The Indian Ocean ", "The Atlantic Ocean ", "The Inland drainage system ", "The Mediterranean Sea ", "Congo River belongs to the Atlantic Ocean drainage system. ", "b", 0, 1, this.f578b));
        arrayList.add(new questions("91.", "Among the following, which one describes the Mediterranean Sea drainage system in Africa?", 0, 0, 0, 0, 0, "It has only one major river basin in the continent. ", "It drains the northwestern parts of the continent. ", "It experiences a steady volume of water thought the year. ", "It shares the largest catchment area and annual discharge. ", "Mediterranean Sea drainage system is dominated by one major river basin, i.e., Nile basin. ", "a", 0, 1, this.f578b));
        arrayList.add(new questions("92.", "Which of the following rivers of Africa form an extensive delta at their mouths? ", 0, 0, 0, 0, 0, "The Awash and Ghibe Rivers", "The Congo and Orange Rivers", "The Niger and Zambezi Rivers", "The Senegal and Zaire Rivers", "Some African rivers form deltaic mouth and mangrove swamps. For instance, the Nile, Niger and Zambezi rivers have extensive delta. ", "c", 0, 1, this.f578b));
        arrayList.add(new questions("93.", "The Okavango swamps are found in which of the following countries?", 0, 0, 0, 0, 0, "Togo", "Mali", "Gambia", "Botswana", "Okavango swamps found in Botswana. ", "d", 0, 1, this.f578b));
        arrayList.add(new questions("94.", "Where in Africa, is the Lake Volta located? ", 0, 0, 0, 0, 0, "Ghana", "Zimbabwe", "Egypt", "Nigeria", "Lake Volta is an artificial lake stored in Akosombodam in Ghana.", "a", 0, 1, this.f578b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("95.", "", C2719R.C2721drawable.geo2013q95, 0, 0, 0, 0, "Globes are visually continent whereas maps are not.", "A globe is two-dimensional, whereas a map is three-dimensional", "Maps are more used than globe in geography", "Globes are easy to fold whereas maps are not", "Globes are the exact model of the earth. However, maps are more used than globe in geography due to its suitability", "c", 0, 1, this.f578b));
        arrayList2.add(new questions("96.", "", C2719R.C2721drawable.geo2013q96, 0, 0, 0, 0, "30 km", "40 km", "10 km", "20 km", "Given:- Altitude difference between H(700m) and X(500m) is 200m = 0.2 km- Maximum gradient a train climb is 2% = 2/100Required:- The shortest rail route between X and H (MD)Solution:Gr = AD/MD * 100 => 2/100 = 0.2 km/MD => 2MD = 100 * 0.2 km2MD/2 = 100 * 0.2km/2 => MD = 10 kmTherefore, the shortest possible rail way route between X and H is about 10 km.", "c", 0, 1, this.f578b));
        arrayList2.add(new questions("97.", "What characterizes a zenithal map direction?", 0, 0, 0, 0, 0, "True distances and directions are reserved", "Meridians are concentric circles", "Distortion increases from the equator towards the poles", "Best Suited for the projection of tropical regions", "Zenithal projection also known as azimuthal projection is retained true distance and direction.", "a", 0, 1, this.f578b));
        arrayList2.add(new questions("98.", "", C2719R.C2721drawable.geo2013q98, 0, 0, 0, 0, "Forest", "Swamp", "Farmland", "Woodland", "The geographic feature represented on the attached map by the letter 'E' is a swamp.", "a", 0, 1, this.f578b));
        arrayList2.add(new questions("99.", "", C2719R.C2721drawable.geo2013q99, 0, 0, 0, 0, "Spur", "Cliff", "Hill", "Depression", "Circular contours with tick pointing to the center represents depression. Therefore, the letter 'Y' represents a depression.", "d", 0, 1, this.f578b));
        arrayList2.add(new questions("100.", "Which one of the following distibution maps uses lines to connect points of equal value?", 0, 0, 0, 0, 0, "Isopethic maps", "Diagrammatic maps", "Chorochromatic maps", "Choroplethic maps", "Isoplethic maps uses lines to connect points of equal value.", "a", 0, 1, this.f578b));
        recviewquestion recviewquestion2 = new recviewquestion();
        recviewquestion2.setQuestions(arrayList2);
        this.recview2.setAdapter(recviewquestion2);
        this.recview2.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f579tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2013.this.timer.setVisibility(0);
                    geography2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    geography2013.this.scr.setVisibility(8);
                    geography2013.this.chr.stop();
                    geography2013.this.toolbar.setVisibility(8);
                    geography2013.this.Relative.setBackgroundColor(-7829368);
                    geography2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2013.this.getBaseContext());
                    int unused = geography2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2013.this.highscoreGeography2013 = defaultSharedPreferences.getInt("geo2013hs", 0);
                    int access$600 = geography2013.this.part1 + geography2013.this.part2 + geography2013.this.part3 + geography2013.this.part4 + geography2013.this.part5 + geography2013.this.part6 + geography2013.this.part7 + geography2013.this.part8 + geography2013.this.part9;
                    geography2013.this.resultText.setText(String.valueOf(access$600));
                    geography2013.this.progressbar.setProgress(access$600);
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
                    int unused11 = geography2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = geography2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = geography2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = geography2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = geography2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = geography2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = geography2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = geography2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "geo2013hs";
                    int unused19 = geography2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = geography2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = geography2013.this.answered1 + geography2013.this.answered2 + geography2013.this.answered3 + geography2013.this.answered4 + geography2013.this.answered5 + geography2013.this.answered6 + geography2013.this.answered7 + geography2013.this.answered8 + geography2013.this.answered9 + geography2013.this.answered10;
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
                    if (access$600 > geography2013.this.highscoreGeography2013) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - geography2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1geo131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1geo132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1geo133", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1geo134", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1geo135", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1geo136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1geo137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1geo138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1geo139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1geo1310", 0);
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
                        editor.putString("scoregeo131", str3);
                        editor.putLong("date1geo131", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoregeo132", str5);
                            editor.putLong("date1geo132", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoregeo133", str5);
                            editor.putLong("date1geo133", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoregeo134", str5);
                            editor.putLong("date1geo134", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoregeo135", str5);
                            editor.putLong("date1geo135", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoregeo136", str5);
                            editor.putLong("date1geo136", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoregeo137", str5);
                            editor.putLong("date1geo137", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoregeo138", str5);
                            editor.putLong("date1geo138", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoregeo139", str5);
                            editor.putLong("date1geo139", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoregeo1310", str5);
                            editor.putLong("date1geo1310", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dategeo131", 0);
                    long j12 = defaultSharedPreferences.getLong("dategeo132", 0);
                    long j13 = defaultSharedPreferences.getLong("dategeo133", 0);
                    long j14 = defaultSharedPreferences.getLong("dategeo134", 0);
                    long j15 = defaultSharedPreferences.getLong("dategeo135", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dategeo136", 0);
                    long j17 = defaultSharedPreferences.getLong("dategeo137", 0);
                    long j18 = defaultSharedPreferences.getLong("dategeo138", 0);
                    long j19 = defaultSharedPreferences.getLong("dategeo139", 0);
                    long j20 = defaultSharedPreferences.getLong("dategeo1310", 0);
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
                        editor2.putString("iScoregeo131", str4);
                        editor2.putLong("dategeo131", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoregeo132", str6);
                            editor2.putLong("dategeo132", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoregeo133", str6);
                            editor2.putLong("dategeo133", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoregeo134", str6);
                            editor2.putLong("dategeo134", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoregeo135", str6);
                            editor2.putLong("dategeo135", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoregeo136", str6);
                            editor2.putLong("dategeo136", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoregeo137", str6);
                            editor2.putLong("dategeo137", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoregeo138", str6);
                            editor2.putLong("dategeo138", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoregeo139", str6);
                            editor2.putLong("dategeo139", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoregeo1310", str6);
                            editor2.putLong("dategeo1310", l.longValue());
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
                        geography2013.this.scr.setVisibility(8);
                        geography2013.this.chr.stop();
                        geography2013.this.toolbar.setVisibility(8);
                        geography2013.this.Relative.setBackgroundColor(-7829368);
                        geography2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2013.this.getBaseContext());
                        int unused = geography2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = geography2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = geography2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = geography2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = geography2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = geography2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = geography2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = geography2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = geography2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = geography2013.this.highscoreGeography2013 = defaultSharedPreferences.getInt("geo2013hs", 0);
                        int access$600 = geography2013.this.part1 + geography2013.this.part2 + geography2013.this.part3 + geography2013.this.part4 + geography2013.this.part5 + geography2013.this.part6 + geography2013.this.part7 + geography2013.this.part8 + geography2013.this.part9;
                        TextView access$1600 = geography2013.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        geography2013.this.progressbar.setProgress(access$600);
                        geography2013.this.progressbar.setMax(100);
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
                        int unused11 = geography2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = geography2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = geography2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = geography2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = geography2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = geography2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = geography2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = geography2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = geography2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = geography2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = geography2013.this.answered1 + geography2013.this.answered2 + geography2013.this.answered3 + geography2013.this.answered4 + geography2013.this.answered5 + geography2013.this.answered6 + geography2013.this.answered7 + geography2013.this.answered8 + geography2013.this.answered9 + geography2013.this.answered10;
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
                        if (access$600 > geography2013.this.highscoreGeography2013) {
                            edit.putInt("geo2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - geography2013.this.chr.getBase()) / 1000;
                        String str = "dategeo139";
                        String str2 = "dategeo138";
                        String str3 = "dategeo137";
                        String str4 = "dategeo136";
                        String str5 = "dategeo135";
                        String str6 = "dategeo134";
                        String str7 = "dategeo133";
                        String str8 = "dategeo132";
                        String str9 = "dategeo131";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1geo1310";
                        String str11 = "date1geo139";
                        if (geography2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1geo131", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1geo132", 0);
                            long j3 = defaultSharedPreferences.getLong("date1geo133", 0);
                            String str13 = "date1geo133";
                            String str14 = f;
                            String str15 = "date1geo131";
                            long j4 = defaultSharedPreferences.getLong("date1geo135", 0);
                            String str16 = "date1geo135";
                            String str17 = "date1geo134";
                            String str18 = "date1geo136";
                            long j5 = defaultSharedPreferences.getLong("date1geo136", 0);
                            long j6 = defaultSharedPreferences.getLong("date1geo137", 0);
                            String str19 = str11;
                            String str20 = "date1geo138";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1geo132";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1geo134", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1geo137";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1geo138", 0));
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
                                editor3.putString("scoregeo131", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoregeo132", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoregeo133", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoregeo134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoregeo135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoregeo136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoregeo137", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoregeo138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoregeo139", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoregeo1310", str25);
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
                            long j18 = sharedPreferences.getLong("dategeo1310", 0);
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
                                editor4.putString("iScoregeo131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoregeo132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoregeo133", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoregeo134", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoregeo135", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoregeo136", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoregeo137", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoregeo138", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoregeo139", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoregeo1310", str28);
                                    editor4.putLong("dategeo1310", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1geo131";
                            String str30 = "date1geo134";
                            String str31 = str11;
                            String str32 = "date1geo132";
                            String str33 = "date1geo137";
                            String str34 = "date1geo135";
                            String str35 = "date1geo136";
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
                            long j21 = sharedPreferences2.getLong("date1geo133", 0);
                            String str40 = str32;
                            String str41 = "date1geo133";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1geo138";
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
                                editor2.putString("scoregeo131", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoregeo132", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoregeo133", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoregeo134", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoregeo135", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoregeo136", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoregeo137", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoregeo138", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoregeo139", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoregeo1310", str49);
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
                            long j38 = sharedPreferences3.getLong("dategeo1310", 0);
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
                                editor.putString("iScoregeo131", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoregeo132", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoregeo133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoregeo134", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoregeo135", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoregeo136", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoregeo137", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoregeo138", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoregeo139", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoregeo1310", str56);
                                    editor.putLong("dategeo1310", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        geography2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2013.this.scr.setVisibility(8);
                geography2013.this.chr.stop();
                geography2013.this.toolbar.setVisibility(8);
                geography2013.this.Relative.setBackgroundColor(geography2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2013.this.scr.setVisibility(0);
                geography2013.this.toolbar.setVisibility(0);
                geography2013.this.telegram_layout.setVisibility(8);
                geography2013.this.chr.start();
                geography2013.this.Relative.setBackgroundColor(geography2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = geography2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = geography2013.this.mInterstitialAd = null;
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
                geography2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
