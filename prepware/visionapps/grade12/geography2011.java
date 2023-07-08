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

public class geography2011 extends AppCompatActivity {
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
    private Boolean f574b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2011;
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
    private Toolbar f575tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2011);
        this.f574b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one of the following characterizes the African population? ", 0, 0, 0, 0, 0, "LOW infant mortality rate ", "High life expectancy at birth", "Low dependency ratio ", "High rate of natural increase ", "The African continent is undergoing profound demographic changes characterized by declining fertility and child mortality rates and rapid population growth.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("2.", "What is the most likely cause for low level of economic development in many African countries? ", 0, 0, 0, 0, 0, "Poor natural resource endowment ", "Political instability and poor governance ", "High population pressure ", "High mean annual temperatures ", "Reasons for slow economic growth in Africa are find that poor economic policies have played an especially important role in the slow growth, most importantly Africa's lack of openness to international markets. In addition, geographical factors such as lack of. access to the sea and tropical climate have also contributed to Africa's slow growth.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("3.", "The techniques and procedures used to undertake research is termed as:", 0, 0, 0, 0, 0, "Research approach", "Research methodology", "Research project ", "Research methods ", "Research methodology is a systematic way to solve a problem. It is a science of studying how research is to be carried out. Essentially, procedures by which researchers go about their work of describing, explaining and predicting phenomena are called research Methodology. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("4.", "Which map types use lines of equal value to show areas with continuous distribution? ", 0, 0, 0, 0, 0, "Sketch maps", "Isopleth maps ", "Flow maps ", "Choropleth maps ", "Isopleth maps may use lines. to show areas were elevation. temperature, rainfall, or some other quality is the same; values between lines can be interpolated. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("5.", "Countries of the Horn of Africa lie in the GMT+3 time zone due to their ", 0, 0, 0, 0, 0, "Relative location", "Vicinal location", "Geological location ", "Absolute location ", "An absolute location is a description of the exact site on an objective coordinate system, such as a grid. 2. When referring to a map or the Earth's surface, an absolute location is the latitude and longitude of a specific place. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("6.", "Where is mount Batu found? ", 0, 0, 0, 0, 0, "Bale massifs", "Hararghe plateau", "Shewan plateau ", "Arsi plateau ", "Mount Batu found in the Bale Massif. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("7.", "Gibra (Lobelia rhynochopetalum) & Asta (Erica arborca) are examples of ", 0, 0, 0, 0, 0, "Woodland vegetation ", "Steppe vegetation", "Savanna vegetation  ", "Afro-alpine vegetation ", "Erica arborea (tree heath) is a species of flowering plant (angiosperms) in the heather family, Ericaceae. There are disjunct populations in Africa including the Ethiopian Highlands, the mountains of Ruwenzori and the Cameroon Mountains. In Africa it is normally referred to as giant heather.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("8.", "The relative proportion of male and female population is expressed by: ", 0, 0, 0, 0, 0, "Age structure ", "Economic ratio", "Sex structure  ", "Dependency ratio ", "Age-Sex Structure is the composition of a population as determined by the number or proportion of males and females in each age category.  The age-sex structure of a population is the cumulative result of past trends in fertility, mortality, and migration. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("9.", "What distinguishes an urban settlement from a rural settlement? ", 0, 0, 0, 0, 0, "Main occupation of the population ", "Physical size of the settlement ", "Population size of the settlement ", "Physical infrastructure ", "No correct answer because the difference between rural and urban settlement is that the urban settlement includes cities and towns. On the other hand, the rural settlement includes vi ridges and hamlets. Population wise, urban areas are densely populated, which is based on the urbanization, i.e., the higher the urbanization the higher is the population. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("10.", "Which one of the following is correct about vertical exaggeration in map? ", 0, 0, 0, 0, 0, "Vertical exaggeration minimizes distortion in maps ", "Vertical exaggeration occurs when a vertical scale is smaller than a horizontal scale.", "vertical exaggeration cause the slope of a hillside to look gentler than it really is ", "The degree of vertical exaggeration depends on the scale of the map ", "To determine the amount of vertical exaggeration used to construct a Profile, simply divide the real-world units on the horizontal axis by the, real-world units on vertical axis. If, the vertical scale is one r=1000' and the horizontal scale the vertical exaggeration is 2.x.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("11.", "Which one of the following is correct about drainage patterns?", 0, 0, 0, 0, 0, "A trellises drainage pattern usually develops in areas of flat sedimentary deposits. ", "A radial drainage pattern typically develops on the slopes of a volcanic cone ", "Tectonics forces lead to the formation of a dendrite drainage pattern. ", "A rectangular drainage pattern is found in areas where rivers flow towards a central", "Drainage pattern is the pattern formed by the streams, rivers, and lakes in a particular drainage basin. They are -governed by the topography of the land region is dominated by hard or soft rocks whether a particular and the gradient of the land.  ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("12.", "…………….. refers to a place where a pirate river diverts the headwater of its victim river. ", 0, 0, 0, 0, 0, "Elbow of capture", "Base level", "Wind gap ", "Incision", "The headwaters from the minor river diverted into the more e is often a sudden may be d. rapidly eroding channel. There is often a change of stream direction at the point of capture; this is the elbow of capture. In the first diagram, River capture is initiated by a stream through headward erosion.", "a", 0, 1, this.f574b));
        arrayList.add(new questions("13.", "Which one of the following does not influence the development of road transport networks? ", 0, 0, 0, 0, 0, "Topography", "Land use and settlement patterns ", "Technological development ", "Language diversity ", "The development of the road transport network influenced by topography; land use and settlement and technological development of the region. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("14.", "Geographic information system (GIS) can be applied to all of the following except one ", 0, 0, 0, 0, 0, "Then analysis of urban growth and expansion ", "Building constructions sites. ", "Environment and natural resource management. ", "The management of transport and logistical problems. ", "GIS Applications in Geology: Geologists use GIS in a various application. The GIS is used to study geologic features, analyze soils and strata, assess seismic information, and or create three dimensional (3D) displays of geographic features. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("15.", "What is the concern of temporal perspective in Geographical studies? ", 0, 0, 0, 0, 0, "Where and why are phenomena located", "What phenomena are found where", "The chronological pattern of phenomena ", "How phenomena are related to one another ", "The temporal perspective in geographical studies refers to time geography or time-space geography is an evolving transdisciplinary perspective on spatial and temporal processes and events such as social interaction, ecological interaction, social and environmental change, and biographies of individuals. Or the chronological pattern of phenomena. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("16.", "…………….. represents the Earth's life sphere. ", 0, 0, 0, 0, 0, "The anthroposphere", "The troposphere", "The ionosphere ", "The biosphere ", "The area near the surface of the earth can be divided into four interconnected spheres: lithosphere, hydrosphere, biosphere, and atmosphere. Think of them as four interconnected parts that make up a complete system, in this case, of life on earth. The biosphere is composed of all living organisms: plants, animals and one-celled organisms alike_ The biosphere is composed of all living organisms: plants, animals and one-celled organisms alike.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("17.", "In topographic map a cliff is best represented by", 0, 0, 0, 0, 0, "Closely spaced contour lines ", "overlapping contours ", "Widely spaded contour lines ", "Contour lines that cross each other. ", "A cliff is a vertical or near vertical feature; it is an abrupt change of the land. When a slope is so steep that the contour lines converge into one \"carrying\" contour of contours, this last contour line sometimes has tick marks pointing toward low ground. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("18.", "Which one of the following is not correct about contour lines? ", 0, 0, 0, 0, 0, "Contour lines are used to show the relief of an area ", "All points on a given contour line are of the same elevation. ", "Closely spaced contour lines represent a gentle slope. ", "Contour lines are generated from spot heights. ", "The space between two consecutive contour lines in a contour m. ap is called as the contour interval which shows the difference. in the elevation_ The best feature of using contour lines in mapping is that it can represent the 3-dimensional surface of the any terrain in a 2- dimensional contour map. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("19.", "In which part of a river course is the presence of waterfalls, rapids and cataracts observed? ", 0, 0, 0, 0, 0, "In the river delta", "Middle course", "Lower course ", "Upper course ", "In the upper course of a river gradients are steep and river channels arc narrow, Vertical erosion is greatest in the upper course of a river. As the result of these typical features include steep valley sides, interlocking spurs, rapids, gorges and waterfalls.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("20.", "Which one of the following hierarchy of settlements is correct according to ascending population size? ", 0, 0, 0, 0, 0, "Village - hamlet - town - city - metropolis  ", "Hamlet - village - town - city - metropolis", "Metropolis - town - city - village - hamlet ", "Village - town - hamlet - city - metropolis ", "The ascending orders of settlements hamlet - village - town - city - metropolis. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("21.", "Identify the correct pairing ", 0, 0, 0, 0, 0, "Lake Trukana - Kenya", "Lake Volta - Nigeria", "Lake Victoria - Ghana ", "Lake Nasser - Malawi ", "The correct pairing of lake of Africa Lake Turkan in Kenya; Lake Victoria Tanzania; artificial lake of Nasser in Egypt and lake Volta in Niger.", "a", 0, 1, this.f574b));
        arrayList.add(new questions("22.", "The savanna vegetation in Africa is characterized by ", 0, 0, 0, 0, 0, "The dominance of xerophytes ", "Mixed woodland and grass ecosystem ", "Alpine plants ", "Evergreen and deciduous trees ", "Savannah vegetation type that grows under hot, seasonally dry climatic conditions and is characterized by an open tree canopy (i.e., scattered tree) above a continuous tall grass understory (the vegetation layer between the forest canopy and the ground)", "c", 0, 1, this.f574b));
        arrayList.add(new questions("23.", "……………. is a dark colour soil type with high content of shrinking and swelling clay minerals. ", 0, 0, 0, 0, 0, "Acrisol", "Nitosol ", "Livisol", "Vertisol", "Verticals (black basaltic soils): soil types of these sort: cover about 10 percent of the total land of Ethiopia. Have high clay content; so, are sticky. For this reason and for poor drainage qualities, such soils are difficult to be used for farming purposes.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("24.", "In which of the following area in Africa is wind a dominant agent of soil erosion?", 0, 0, 0, 0, 0, "The tropical rainforests", "The Sahel region", "The east African highlands ", "The Congo basin ", "The Sahel region of Africa is mainly affected by wind erosion.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("25.", "…………… is a soil conservation method that involves the covering of the soil with plant residues to conserve soil moisture and regain soil fertility. ", 0, 0, 0, 0, 0, "Crop rotation", "Mulching", "Green manure ", "Fallowing", "Mulching is a practice of covering the topsoil surface with organic materials like straw, grass, stones inorganic materials like plastics, etc. mulching is a process of reducing the evaporation, to keep down weeds. Advantage of mulching; mulch suppresses weed growth.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("26.", "Which one of the following is correct about the population of Africa? ", 0, 0, 0, 0, 0, "The rate of population growth in Africa is the fastest in the world ", "North Africa is the most densely populated regions of Africa. ", "Africa is the most populous continent in the world ", "The African population is characterized by long doubling time ", "Africa has one of the worlds largest population. The continent is the worlds second most populous next to Asia. According to the world population data sheet, by the mid of 2009, the continent had a total population of 999 million (nearly 1 billion). This makes up nearly 14.7% of the world’s total population. As the table below depicts, Africa’s population is nearly 1/4th of the of Asia, the most populous, and 28 times that of Oceania, the least population.", "a", 0, 1, this.f574b));
        arrayList.add(new questions("27.", "Which the One of the following is among the main reasons for the high death rate of the African population? ", 0, 0, 0, 0, 0, "Wide spread use of contraceptives ", "malnutrition", "Improved health services", "Low level of poverty ", "The main reason for high death African population is the malnutrition.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("28.", "Which indicator best describes the difference between immigration and emigration? ", 0, 0, 0, 0, 0, "Rate of migration", "Gross migration", "Total migration ", "Low level of poverty ", "Gross migration ratio of the difference between the numbers of in-migrants and out-migrants from a country to the average population, expressed per 1000 people. Ratio of the country’s populous.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("29.", "Which one of the following better describes the difference between economic growth and economic development? ", 0, 0, 0, 0, 0, "Economic growth is an indicator of structural and technological change ", "Economic growth is a measure of the amount of goods and services produced ", "Economic development is one aspect of economic growth ", "Economic growth measures the welfare of society. ", "Economic development is a broader concept than the economic growth. Economic development refers to the increase of the real national income of the economic and socio-economic structure of any country over a long period of time. Economic growth can be measured through an increase in the GDP, per capital income, etc.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("30.", "………….. is an indicator of development which describes the total value of goods and services produced in a country in a specific period of time. ", 0, 0, 0, 0, 0, "Gross domestic Product ", "Gross National Product", "Per capital Income ", "Gross National Income ", "gross domestic product (GDP) is the value of a nation’s finished domestic goods and services during a specific time period. The gross national product (GNP) is the value of all finished goods and services owned by a country’s residents over a period of time.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("31.", "Which of the following is correct about sampling? ", 0, 0, 0, 0, 0, "The sample size of a homogenous population should be larger than a heterogeneous population. ", "Non-probability sampling provides equal chance for every item of the population ", "Sample size has no much effect on the results of the research ", "Large sample size provides more representation of the population. ", "Sampling is a process used in statical analysis in which a predetermined number of observations are taken from a larger population depends on the type of analysis being performed but may include simple random sampling or systematic sampling. If the population under study is homogenous(similar) a small sample is sufficient. On the other hand, if the population is heterogenous, a much larger size is necessary. The large simple size provides more representation of the population.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("32.", "Which one of the following map projections causes low level of distortions in representing the equatorial region? ", 0, 0, 0, 0, 0, "Zenithal projection", "Conical projection", "Cylindrical projection ", "Planar projection ", "Cylindrical projections are best suited for the projection of tropical regions since deformities increase pole wards.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("33.", "Ethiopia shares the longest & shortest boundary with………and………... respectively. ", 0, 0, 0, 0, 0, "Eritrea and Somalia", "Djibouti and Sudan ", "Somalia and Djibouti ", "Sudan and Djibouti ", "the shared border between Ethiopia and Somalia stretches over a distance of 101904 miles, making it the longest international border with Djibouti. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("34.", "Which of the following is correct about the geologic history of the Horn of Africa? ", 0, 0, 0, 0, 0, "The Paleozoic era is known for the predominance of reptiles ", "The geologic events of the Tertiary period resulted in the outpouring of huge quantities of basaltic lava. ", "The thickness and age of Adigrat sandstone progressively increases from the southeast to the northwest.", "Most of the sedimentary rocks in the Horn of Africa were formed during the Precambrian era. ", "The main geological events of the Paleozoic era were denudation and peneplanation. No significant structural formation took place. The massive denudation activity resulted in the formation of inselbergs in some parts of Ethiopia and the horn. The Paleozoic era is known for the predominance of invertebrates. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("35.", "Which one of the following is not among the domains of Geographic information system (GIS)?", 0, 0, 0, 0, 0, "Data manipulation", "Data storage and management", "Data discussion ", "Data analysis and presentation ", "A geographic information system (GIS) is a system designed to capture, store, manipulate, analyze, massage, and present spatial or geographic data. All earth-based spatial-temporal location and extent references should be relatable to one another and ultimately to a “real” physical location or extent.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("36.", "The straight of Bab-el Mandeb connects Africa with ", 0, 0, 0, 0, 0, "Europe ", "south America", "India", "Asia", "Bab al-Mandab. strait between Arabia (northeast) and Africa (southwest) that connects the red sea (northwest) with the Gulf of Aden and the Indian ocean (southeast). The stair is 20 miles (32 km) wide and is divided into two channels by Perim island; the western channel with l6 miles (26 km) across, and the eastern is 2 miles (3 km) wide. with the building of the Suez Canal, the strait assumed great strategic and economic importance.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("37.", "Which major geological event took place in Africa during the Paleozoic era? ", 0, 0, 0, 0, 0, "Orgenesis", "Denudation", "Extensive lava flows ", "Mineralization of rocks", "The main geological events of the Paleozoic era were denudation and peneplanation. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("38.", "Which one of the following African countries is outside the Rift Valley area? ", 0, 0, 0, 0, 0, "Sudan", "Mozambique", "Malawi ", "Burundi", "Sudan is one of the Africa countries that located outside the rift valley area. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("39.", "What contributed most for Africa to be the hottest of all continents of the world? ", 0, 0, 0, 0, 0, "High altitudinal range ", "Longitudinal range ", "Presence of adjacent water bodies ", "Latitudinal location ", "latitudinal location of Africa caused Africa's position across equatorial and subtropical latitudes in both the northern and southern hemisphere which contributed for the hotness of the contents.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("40.", "Which climatic region of Africa is dry during the summer season? ", 0, 0, 0, 0, 0, "The equatorial climate region ", "The Mediterranean climate region ", "The highland climate region ", "The tropical continental climate region ", "The Mediterranean climate of Africa characterized by known for warm to hot, dry summers and mild to cool, wet winters. Winter temperatures are usually between 30 and 65 degrees, Sumner months all average above 50 degrees. ……The cause of this climate is directly related to large bodies of water such as the Mediterranean Sea and ocean currents.", "b", 0, 1, this.f574b));
        arrayList.add(new questions("41.", "Which one of the following soil types is found in the arid and semi-arid areas of Ethiopia? ", 0, 0, 0, 0, 0, "Lithosols", "Cambisols ", "Xerosols", "Nitosols ", "Xerosols: these soils are generally young and shallow, and are found in arid and semi-arid regions. They have a weakly developed profile.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("42.", "Which one of the following climate types of Africa is least affected by the ITCZ? ", 0, 0, 0, 0, 0, "Mediterranean climate", "Desert climate", "Afro-alpine climate ", "Semi-desert climate ", "The inter tropical convergence zone (ITCZ), which is the zone of convergence between the trade winds, regulates the winds that blow into convergence between the trade winds regulates the winds that blow into Africa at different seasons. The ITCZ moves between the tropics of cancer and Capricorn, following the overhead sun, pulling winds towards it hence, it controls the distribution of rainfall in Africa within the tropic.", "a", 0, 1, this.f574b));
        arrayList.add(new questions("43.", "All of the following are factors that influence the process of soil formation except one?", 0, 0, 0, 0, 0, "Climate", "Organisms Accords", "Parent material ", "Overgrazing", "Soil are formed through the interaction of five major factors, time, climate, parent material, topography and relief, and organisms.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("44.", "According to Karl Marx, food security among population should be understood in relation to ", 0, 0, 0, 0, 0, "The potentials of technological innovation  ", "The adoption of preventive check ", "Unequal distribution of resources ", "Natural resource degradation ", "the Malthusian theory was supported by many people, but 19th century sociologist Karl Marx claimed that poverty and hunger was a result of the capitalist’s economy, not population growth. Marx stated, such food scarcities are purely the result of unequal distribution of resources by capitalism.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("45.", "Which one of the following is correct about the population of Ethiopia? ", 0, 0, 0, 0, 0, "Ethiopia is among the least populations in Africa", "The distribution of the Ethiopian population is reasonably even ", "Aging is a major challenge of the Ethiopian population", "The growth rate of the Ethiopian population shows a slight decline", "the major challenge of Ethiopia population ageing population.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("46.", "Which of the following crops is widely cultivated in areas of low population density in ethiopia? ", 0, 0, 0, 0, 0, "Sorghum", "Coffee ", "Enset", "Teff", "Sorghum is one of the crops that is widely cultivated in the area of low population density in Ethiopia.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("47.", "Where do we commonly find temporary settlements in Ethiopia?", 0, 0, 0, 0, 0, "The highlands of Ethiopia", "The pastoral areas", "The peri-urban areas", "The river valley", "In the pastoral area we commonly find temporary settlement", "b", 0, 1, this.f574b));
        arrayList.add(new questions("48.", "Which of the following Mortality Rates is the highest in Ethiopia?", 0, 0, 0, 0, 0, "Martial mortality", "Child Mortality Rate", "Infant Mortality Rate", "Adult Mortality Rate ", "Mortality is the second principal factor in population change that determines the size and structure of the population of a country. In its general sense, mortality is the occurrence of death in a given population. Maternal Mortality rate (MMR): this is the annual number of maternal deaths occurring during pregnancy, child birth, or within two months after the birth or termination of pregnancy, per 1000 women between 15 and 49 years of age (reproductive age) which is highest in Ethiopia. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("49.", "One of the following is not among the causes of high maternal mortality Rate in Ethiopia", 0, 0, 0, 0, 0, "Poverty", "Rural – urban migration", "Early marriage and abortion", "Limited access to health services ", "Maternal Mortality rate (MMR) is high in Ethiopia and it caused by poverty; early marriage and limited access to health services.  ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("50.", "Which one of the following countries is known for its anti-natalist population policy?", 0, 0, 0, 0, 0, "United States of America", "North Korea", "China", "France", "The aim of anti-natalist policies is to decrease the total fertility- rate, as well as the crude birth rate, in order to slow the population growth. These policies are seen in countries of rapid population growth like China, India, or a few decades ago Singapore ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("51.", "Which one of the following is not an industrial crop?", 0, 0, 0, 0, 0, "Chat ", "Sesame", "Coffee ", "Sugarcane", "Industrial crops is a designation given to an enterprise that attempts to raise farm sector income, and provide economic development activities fear rural areas, industrial crops also attempt to provide products that can he used as substitutes for imports from other nations includes sesame, coffee, sugarcane. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("52.", "Which one of the following is not among the main challenges of the Ethiopian economy?", 0, 0, 0, 0, 0, "Climate change and variability", "Capital constraint", "Labour shortage  ", "Lack of good governance", "The major constraints of Ethiopian economy include capital, climatic change and lack of good governance. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("53.", "Which of the following parts of the world is the leading export destination of Ethiopian commodities? ", 0, 0, 0, 0, 0, "Africa", "Asia", "North America", "Europe", "Regarding Ethiopia's export distribution in world regions, Europe was the leading export destination in the year 2006/07, taking 40.8% of the total value, and was followed by Asia, Africa and North and Central America, accounting for 33.5% 15,5% and 5.8%, respectively.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("54.", "In which of the following settlement types do you expect to find collective amenities such as shops, schools, places of worship and entertainment? ", 0, 0, 0, 0, 0, "Dispersed settlements", "Isolated dwellings", "Nucleated settlements ", "Nomadic settlements ", "Nucleated settlements are towns where buildings are close together, often clustered around a central point. The location of a nucleated settlement can be determined by a range of factors, including being easy to defend, close to a water supply or located at a route center. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("55.", "Which of the following landforms is a watershed between river Abay and river Awash? ", 0, 0, 0, 0, 0, "The Tigrean plateau ", "The Goijam massif ", "The Sheeran plateau ", "The Amhara Saynt massif  ", "The Shoan Plateau is a dome-shaped plateau that serves as a watershed between the Awash and Abbay river basins. It extends westwards into western Wellega through Horo Guduru and forms a crescent shape which causes the Abbay to swerve and drain northwards. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("56.", "Which one of the Ethiopian lakes is located outside the Rift- Valley system? ", 0, 0, 0, 0, 0, "Chatno ", "Tana", "Langano", "Abaya", "Lake Tana was formed during the Quaternary Period, outside of the Rift valley when a sheet of flowing lava dammed the shallow depression that had already been formed between the Gojjam and Gondar massifs. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("57.", "In which agro-ecological zone is most agricultural land of Ethiopia located?", 0, 0, 0, 0, 0, "Kolla", "Dega", "Woina Dega", "Wurch", "The Woina-Dega-zone areas contain most of Ethiopia's agricultural land. They are the country's main areas producing: \n•\tSurplus grain Inset \n•\tand its derivatives \n", "c", 0, 1, this.f574b));
        arrayList.add(new questions("58.", "Which of the following rain bearing winds carry moisture to the Ethiopian highlands during the summer season? ", 0, 0, 0, 0, 0, "Southwesterly winds ", "Equatorial westerlies", "Northeast trade winds", "Northwestern winds", "The Equatorial Westerlies and Easterlies winds bring moisture to the highlands but decrease their magnitude and length of rainy periods northwards. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("59.", "Which endemic animal is found in both the Semien mountains and the Bale highlands of Ethiopia? ", 0, 0, 0, 0, 0, "Walia Ibex ", "Wild Ass", "Semien Fox ", "Swayne's Harebeest ", "The Ethiopian wolf (Canis simensis), also known as the Simien jackal or Simien fox, is a caned native to the Ethiopian Highlands of Bale and Semien. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("60.", "Which of the following measures can be used for the conservation of natural vegetation? ", 0, 0, 0, 0, 0, "Mulching", "Overgrazing", "Slash & burn", "Agroforestry", "Agroforestry is a land use management system in which trees or shrubs are grown around or among crops or pastureland. This intentional combination of agriculture and forestry has, varied benefits, including increased biodiversity and reduced erosion. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("61.", "Which one of the following pairings is not correct? ", 0, 0, 0, 0, 0, "Tekeze - Angereb", "Ghenale - Dawa", "Ghibe - Gilo  ", "Awash - Akaki ", "The Major Tributaries Genale river are Dawa, Weyb, Welmel, Mena. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("62.", "Which one of the following geographical approaches is most appropriate for the study of the interaction between biophysical and socio-economic phenomena in a particular area?", 0, 0, 0, 0, 0, "Topical approach", "Systematic approach", "Regional approach ", "Thematic approach ", "Systematic approach geography is the most appropriate for the study of the interaction between biophysical and socio-economic phenomena in a particular area. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("63.", "What does a spot height represent on topographic maps? ", 0, 0, 0, 0, 0, "Height of places between successive contours. ", "The slope of a specific point ", "The distance between two specific points ", "Measured altitude of a specific point ", "The numbers written on contour lines indicate the elevation of the lines. Topographic maps would be very cluttered if all contour lines were labeled, so only the heavier lines show labels. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("64.", "Identify a landform type which is different from the others ", 0, 0, 0, 0, 0, "Ridge", "Depression", "Saddle ", "Valley", "The name derives from the fact that the prototypical example in two dimensions is a surface that curves up in one direction, and curves down in a different direction, resembling a riding saddle or a mountain pass between two peaks forming a landform saddle. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("65.", "…………… refers to an area that separates adjacent drainage basins ", 0, 0, 0, 0, 0, "Drainage system", "Tributary", "Confluence ", "Water divide ", "drainage pattern is formed when rivers discharge their waters from all directions into a lake or a depression. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("66.", "……………… is a push factor that likely causes rural-rural population migration in Africa.  ", 0, 0, 0, 0, 0, "Natural disaster", "Infrastructure development", "Employment opportunities ", "Improved housing ", "Natural disaster is one of a push factor that most likely causes rural to rural population migration in Africa. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("67.", "Which one of the following is not among the advantages of air transport? ", 0, 0, 0, 0, 0, "It is the fastest mode of transport ", "It is the most affordable means of transport ", "It is least affected by physical barriers ", "It is most appropriate for transporting perishable goods ", "Air transportation has become the primary means of common-carrier traveling. Air transportation also provides a communication or medical link, which is sometimes vital, between the different groups of people being served but it is not easily affordable. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("68.", "In which region of Africa are the Atlas Mountain found? ", 0, 0, 0, 0, 0, "Northern Africa", "Western Africa ", "Eastern Africa ", "Southern Africa", "The High Atlas range is located in central Morocco in Northern African region. It rises from the coast of the Atlantic Ocean, and then stretches east to Morocco's border with Algeria. The two highest peaks of the Atlas Mountains Toubkal (13,671 ft) and m’Goun (13,356 ft), are located in the Atlas range. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("69.", "In which part of Africa do we find the highest relief? ", 0, 0, 0, 0, 0, "Western Africa", "Southern Africa", "Eastern Africa ", "Northern Africa", "The highest Relif Kilimanjaro (19,340 feet [5,895 meters]) is the highest point on the continent and the lowest part of Africa found in East Africa. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("70.", "The equatorial type of climate in Africa is characterized by ", 0, 0, 0, 0, 0, "Low mean monthly temperature ", "Low annual range of temperature ", "Shallow depth of the waters ", "Steep water courses ", "Because areas with equatorial climate arc constantly covered by warm maritime air masses, variations in their monthly and daily temperatures are less pronounced than in the tropical wet-and-dry regions. Marked variations in the rhythm of equatorial climate sometimes occur. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("71.", "The navigability of most African rivers is hindered by ", 0, 0, 0, 0, 0, "The steady volume of flow ", "The trans boundary nature of the rivers ", "Shallow depth of the waters ", "Steep water courses ", "Most of the rivers in Africa arc characterized by waterfalls, rapids, steep profiles, deltaic months and seasonal volume fluctuation. These conditions hinder their navigability. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("72.", "Which refers to the average lifespan of a newly born infant under current mortality levels.", 0, 0, 0, 0, 0, "Infant mortality rate", "Doubling period", "Life expectancy ", "Dependency ratio ", "life expectancy - the life span expected when one is born or at birth.", "c", 0, 1, this.f574b));
        arrayList.add(new questions("73.", "Which of the following research approaches involves the use of ethnography and participant observation for data collection? ", 0, 0, 0, 0, 0, "Quantitative approach", "Simulation approach", "Desk review approach ", "Qualitative approach ", "Qualitative Research is primarily exploratory research. It is used to gain an understanding of underlying reasons, opinions, and motivations. It provides insights into the problem or helps to develop ideas or hypotheses for potential quantitative research. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("74.", "Which one of the following is an example of a primary source of data? ", 0, 0, 0, 0, 0, "Diaries ", "Journals", "Interviews", "Historical records ", "Primary data collection sources include surveys, observations, experiments, questionnaire, personal interview, etc. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("75.", "One of the following is not a major cause of drought in Africa ", 0, 0, 0, 0, 0, "Increasing human and livestock populations. ", "Increased use of commercial fertilizers and improved seeds ", "Expansion of farm lands and settlements ", "Unwise use of natural resources ", "Drought in Africa caused by El Nino, human action and climate change. The present drought in Africa with the result that the water supplies are under enormous pressure. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("76.", "One of the following is not a major destination of the intra-continental labor migrants in Africa ", 0, 0, 0, 0, 0, "The Gold and diamond mines of the Republic of South Africa ", "Oil fields of Nigeria and North Africa ", "The Danakil salt plains of the Afar Region of Ethiopia ", "Citrus and Vine planation of Algeria, Tunisia and Morocco ", "Labor migration in Africa is largely intra-regional (80%) and mainly characterized by the migration of low-skilled workers. ", "c", 0, 1, this.f574b));
        arrayList.add(new questions("77.", "What is the other name for maps that emphasize the distribution of a single geographic clement or character? ", 0, 0, 0, 0, 0, "Reference or general-purpose maps ", "Charts", "Topographic maps", "Thematic or special purpose maps ", "A thematic map is a kind of map designed to show the distribution of human or natural features or data. The information may or may not be related to geography. For example, a map which shows population is a thematic map. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("78.", "Where do we find the active volcano of Ertalle? ", 0, 0, 0, 0, 0, "The Upper Awash Valley", "The Afar triangle", "The Red Sea coastal plains", "The Rift Valley lakes district ", "The Afar triangle is bounded by parallel fault lines on the east and west. Its floor is made up of: \n•\tFgrabens such as the Tendaho Graben \n•\tvolcanic ash and lava deposits \n•\tLacustrian and fluvial deposits, and \n•\tVolcanic mountains such as Mount Fentalle \n", "b", 0, 1, this.f574b));
        arrayList.add(new questions("79.", "To which major drainage system of Ethiopia does the Ghibe River drainage system belong? ", 0, 0, 0, 0, 0, "The Western (Mediterranean) Drainage System", "The Southeastern Drainage System. ", "The Inland (Rift Valley) Drainage System. ", "The Southern Omo Drainage System. ", "The Gibe River Basin is about 79 000 km2 in area and is situated in the south- west of Ethiopia. It is approximately 550 km long and it belonged to south Omo Drainage System.", "d", 0, 1, this.f574b));
        arrayList.add(new questions("80.", "Which of the following is the main reason why relatively low mean monthly temperatures are recorded on Ethiopian hi tempera highlands in summer? ", 0, 0, 0, 0, 0, "Ethiopia's latitudinal location", "The country's distance from the sea ", "The altitude factor ", "The prevalence of high cloud cover ", "The main reason for the relatively low mean monthly temperature goes, recorded on Ethiopian highlands in high prevalence of cloud cover. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("81.", "What is the focus of Thomas Malthu's population theory? ", 0, 0, 0, 0, 0, "The power of the earth to produce enough food to meet growing demands", "The importance of positive checks to regulate population growth ", "The positive effects of population of food production ", "The influence of capitalist modes of production ", "Thomas Robert Malthus argued that; left unchecked, a population will outgrow its resources. He discussed two ways to 'check' a population: preventive checks, like the moral restraint of postponing mama, or positive checks, like famine, disease and warfare. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("82.", "What is the main reason for the high population growth in urban centers compared to the rural areas of Ethiopia? ", 0, 0, 0, 0, 0, "High fertility rate in urban areas ", "Limited use of family planning services in rural areas ", "Differences in early marriage ", "Rural urban migration ", "The main reason for high population growth in Urban area than rural areas are rural to urban migration. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("83.", "Which of the following statements is not correct about the outcomes of the analytical method of inquiry-in geography?", 0, 0, 0, 0, 0, "It helped geography to become a more law-giving science ", "It weakened the quantitative revolution ", "It led to the development of Applied Geography ", "It weakened the conception of Geography as and ideographic field of study", "Geography is the study of the physical and cultural environments of the earth. What makes geography different from other disciplines is its focus on spatial inquiry and analysis. Geographers also try to look for connections between things such as patterns. movement and mutation. trends, and so forth. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("84.", "Which of the following statements is not correct about the Tropical Rainforests of Africa?", 0, 0, 0, 0, 0, "They have significantly low species diversity all trees ", "They have little undergrowth as the canopy of the t prevent the penetration of light ", "They contain broad-leafed evergreen trees ", "They are largely Western Africa and Eastern confined to Central and Madagascar", "Tropical rainforests develop in areas with equatorial climates. In Africa, they are confined to Central and Western Africa, and eastern Madagascar. In these places, the climate is typically tropical, with high rainfall & high temperatures throughout the year. Tropical rain forests are also known as equatorial broad leaf evergreen forests. Africa's most extensive rainforest is found in the Congo Basin. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("85.", "What is the final step in a research project? ", 0, 0, 0, 0, 0, "Generalizing and interpreting the data ", "Compelling the bibliography of references ", "Preparing the research report ", "Writing the concluding remarks ", "Compiling a bibliography is the final step of your research project. A bibliography is a list of written materials relevant to the research study you have performed. It includes all books, documents, etc. that you referred to as you prepared for and conducted your project. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("86.", "Which of the following was not among the main reason why the Dega zone areas were historically home of concentrated human settlement? ", 0, 0, 0, 0, 0, "The people's lack of choice to settle in lower and warmer agro climatic zones", "its reliable rainfall and support for two growing periods per year ", "The absence of vector borne diseases such as malaria ", "its suitable location for the people to defend themselves from threats ", "The main reasons why the Dega zone areas were historically home of concentrated human settlement includes: \n•\tIts reliable rain and support for two growing seasons \n•\tThe absence of vector borne diseases. \n•\tIts suitable location for the people to defend themselves from the threats \n", "a", 0, 1, this.f574b));
        arrayList.add(new questions("87.", "Which of the following statements is correct about the wild animals of Ethiopia?", 0, 0, 0, 0, 0, "All or the endemic animals of Ethiopia inhabit the highlands ", "Virtually all types of mammals found in East Africa are also found in Ethiopia ", "Ethiopia's wild animal stock is generally similar to that of East Africa as whole ", "Ethiopia's Wild Ass population is confined to the Afar lowlands ", "The diversity in Ethiopia's topography, climate, and vegetation has given the country a wide variety of wild animals. Ethiopia's wild animal stock is generally similar to that of East Africa as a whole, due to topographic similarity and other aspects ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("88.", "Which of the following statements shows Esther Boserup’s argument about the relationship between population growth and food supply? ", 0, 0, 0, 0, 0, "Food production is limited and population cannot increase beyond the means of subsistence", "Technological advancement would ensure that food supply will keep up with population growth ", "The poor are to be blamed for their won poverty ", "If population growth outstrips the means of subsistence, positive checks will apply.", "Boserup argues that population growth is independent of food supply and that population increase is a cause of changes in agriculture. The principal means of increasing agricultural output is intensification. Boserup's work has had a varied response from readers; other economists have been less than enthusiastic. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("89.", "The three leading economic sectors of Ethiopia according to their contribution to the GDP from the highest to the lowest is ", 0, 0, 0, 0, 0, "Agriculture, Industry and Services", "Services, Industry and Agriculture ", "Services, Agriculture and Industry  ", "Industry, Agriculture and Services ", "The major sectors of the Ethiopian economy: are agricultural; industrial and distributed (service). ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("90.", "………….. describes the height of a specific location above the sea level. ", 0, 0, 0, 0, 0, "Contour ", "Altitude ", "Relief ", "Topology", "Altitudes the vertical elevation of an object above a surface (such as sea level or land) of a planet or natural satellite. ", "b", 0, 1, this.f574b));
        arrayList.add(new questions("91.", "Which of the following maps can best show population distribution in a specific area? ", 0, 0, 0, 0, 0, "Topographic map", "Cadastral map", "Navigation map ", "Thematic map", "A thematic map is a kind of map. Different from normal maps, a thematic map is designed to show the distribution of human or natural features or data. The information may or may not be related to geography. For example, a map which shows population is a thematic map. ", "d", 0, 1, this.f574b));
        arrayList.add(new questions("92.", "In Azimuthal map projection ", 0, 0, 0, 0, 0, "Parallels make arcs of concentric circles ", "Longitudes are straight lines radiating from the poles ", "Distortions increase towards the poles from the Equator ", "All longitudes are equal in length from the Equator ", "Azimuthal projection refers to overhead position that is perpendicular True distances and directions in such projection are retained by placing developable surface at one of the poles. Characteristics of Zenithal. Azimuthal Projections includes: - \n•\tParallels are concentric circles \n•\tMeridians are straight lines radiating from the poles \n", "a", 0, 1, this.f574b));
        arrayList.add(new questions("93.", "…………….. is the wettest lowland in Ethiopia. ", 0, 0, 0, 0, 0, "Baro-Akobo lowlands", "Abbay-Dinder lowlands ", "Angereb lowlands ", "Omo-Ghibe lowlands ", "The Western Lowlands are characterized by and & and semi—ark conditions. The Baro-Akobo lowland is the wettest lowland in Ethiopia. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("94.", "Which of the following towns is located in the autumn and spring rainfall regions of Ethiopia? ", 0, 0, 0, 0, 0, "Gode", "Jigjiga", "Harar ", "Assaita", "A and B are answers. The autumn-and-spring rainfall region covers the southeastern highlands and associated lowlands up to the Somalia coasts. They can be represented by the following stations includes: -Gode, Moyalle, Jigjiga Yabello, Baydhabo. ", "a", 0, 1, this.f574b));
        arrayList.add(new questions("95.", "Which one of the following activities could accelerate soil degradation? ", 0, 0, 0, 0, 0, "Contour plowing", "Intercropping", "Intensive cultivation ", "Manuring", "Accelerated erosion is generally caused by activities that disturb or expose the soil to the erosive forces of gravity and rainwater. Climatic of weather conditions combined with human activity such as intensive cultivation can accentuate soil erosion ", "c", 0, 1, this.f574b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("96.", "The landform shown by the line connection points \"F\" and \"G\" is  ", 0, 0, 0, 0, 0, "A spur", "A watershed", "A valley", "A ridge ", "The land form that shown by line connecting point ‘F’ and ‘G’ is valley is a low area between hills or mountains typically with a river running through it. In geology, a valley or dale is a depression that is longer than it is wide. The terms U-shaped and Y-shaped are descriptive terms of geography to characterize the form of valleys.", "c", 0, 2, this.f574b));
        arrayList2.add(new questions("97.", "The map distance between 'C' and 'H' is 4 centimeters. What is the crow flight distance between the two points in kilometer? ", 0, 0, 0, 0, 0, "20", "8 ", "80 ", ExifInterface.GPS_MEASUREMENT_2D, "The map distance between 'C' and is 4cm. the scale of the map is 1 cm=2km so the actual distance between points 'C' and ‘S’ is 8kms. ", "b", 0, 2, this.f574b));
        arrayList2.add(new questions("98.", "The drainage pattern shown on the map is ", 0, 0, 0, 0, 0, "Centripetal drainage pattern ", "Trellis drainage pattern ", "Radial drainage pattern ", "Rectangular drainage pattern ", "The drainage pattern shown on the map radial drainage pattern because consequent streams radiate or diverge outward, like the spokes of wheel, from a high central area. ", "c", 0, 2, this.f574b));
        arrayList2.add(new questions("99.", "Point \"A\" is located to the……………... of point \"D\" ", 0, 0, 0, 0, 0, "Southeast ", "Northwest", "Northeast ", "Southwest ", "Point 'A' on the map located on the Northeast direction point ‘D’ ", "c", 0, 2, this.f574b));
        arrayList2.add(new questions("100.", "What is the elevation of the highest peak on the map? ", 0, 0, 0, 0, 0, "3900 meters above the sea level ", "More than 3800 meters above the sea level ", "3650 meters above the sea level ", "More than 3800 meters above", "B and D are answers. The highest peak of elevation of the on the map is more that 3800meters above sea level. ", "b", 0, 2, this.f574b));
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
        this.f575tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2011.this.timer.setVisibility(0);
                    geography2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    geography2011.this.scr.setVisibility(8);
                    geography2011.this.chr.stop();
                    geography2011.this.toolbar.setVisibility(8);
                    geography2011.this.Relative.setBackgroundColor(-7829368);
                    geography2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2011.this.getBaseContext());
                    int unused = geography2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2011.this.highscoreGeography2011 = defaultSharedPreferences.getInt("geo2011hs", 0);
                    int access$600 = geography2011.this.part1 + geography2011.this.part2 + geography2011.this.part3 + geography2011.this.part4 + geography2011.this.part5 + geography2011.this.part6 + geography2011.this.part7 + geography2011.this.part8 + geography2011.this.part9;
                    geography2011.this.resultText.setText(String.valueOf(access$600));
                    geography2011.this.progressbar.setProgress(access$600);
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
                    int unused11 = geography2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = geography2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = geography2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = geography2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = geography2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = geography2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = geography2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = geography2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "geo2011hs";
                    int unused19 = geography2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = geography2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = geography2011.this.answered1 + geography2011.this.answered2 + geography2011.this.answered3 + geography2011.this.answered4 + geography2011.this.answered5 + geography2011.this.answered6 + geography2011.this.answered7 + geography2011.this.answered8 + geography2011.this.answered9 + geography2011.this.answered10;
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
                    if (access$600 > geography2011.this.highscoreGeography2011) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - geography2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1geo111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1geo112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1geo113", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1geo114", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1geo115", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1geo116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1geo117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1geo118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1geo119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1geo1110", 0);
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
                        editor.putString("scoregeo111", str3);
                        editor.putLong("date1geo111", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoregeo112", str5);
                            editor.putLong("date1geo112", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoregeo113", str5);
                            editor.putLong("date1geo113", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoregeo114", str5);
                            editor.putLong("date1geo114", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoregeo115", str5);
                            editor.putLong("date1geo115", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoregeo116", str5);
                            editor.putLong("date1geo116", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoregeo117", str5);
                            editor.putLong("date1geo117", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoregeo118", str5);
                            editor.putLong("date1geo118", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoregeo119", str5);
                            editor.putLong("date1geo119", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoregeo1110", str5);
                            editor.putLong("date1geo1110", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dategeo111", 0);
                    long j12 = defaultSharedPreferences.getLong("dategeo112", 0);
                    long j13 = defaultSharedPreferences.getLong("dategeo113", 0);
                    long j14 = defaultSharedPreferences.getLong("dategeo114", 0);
                    long j15 = defaultSharedPreferences.getLong("dategeo115", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dategeo116", 0);
                    long j17 = defaultSharedPreferences.getLong("dategeo117", 0);
                    long j18 = defaultSharedPreferences.getLong("dategeo118", 0);
                    long j19 = defaultSharedPreferences.getLong("dategeo119", 0);
                    long j20 = defaultSharedPreferences.getLong("dategeo1110", 0);
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
                        editor2.putString("iScoregeo111", str4);
                        editor2.putLong("dategeo111", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoregeo112", str6);
                            editor2.putLong("dategeo112", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoregeo113", str6);
                            editor2.putLong("dategeo113", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoregeo114", str6);
                            editor2.putLong("dategeo114", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoregeo115", str6);
                            editor2.putLong("dategeo115", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoregeo116", str6);
                            editor2.putLong("dategeo116", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoregeo117", str6);
                            editor2.putLong("dategeo117", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoregeo118", str6);
                            editor2.putLong("dategeo118", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoregeo119", str6);
                            editor2.putLong("dategeo119", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoregeo1110", str6);
                            editor2.putLong("dategeo1110", l.longValue());
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
                        geography2011.this.scr.setVisibility(8);
                        geography2011.this.chr.stop();
                        geography2011.this.toolbar.setVisibility(8);
                        geography2011.this.Relative.setBackgroundColor(-7829368);
                        geography2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2011.this.getBaseContext());
                        int unused = geography2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = geography2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = geography2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = geography2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = geography2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = geography2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = geography2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = geography2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = geography2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = geography2011.this.highscoreGeography2011 = defaultSharedPreferences.getInt("geo2011hs", 0);
                        int access$600 = geography2011.this.part1 + geography2011.this.part2 + geography2011.this.part3 + geography2011.this.part4 + geography2011.this.part5 + geography2011.this.part6 + geography2011.this.part7 + geography2011.this.part8 + geography2011.this.part9;
                        TextView access$1600 = geography2011.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        geography2011.this.progressbar.setProgress(access$600);
                        geography2011.this.progressbar.setMax(100);
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
                        int unused11 = geography2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = geography2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = geography2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = geography2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = geography2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = geography2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = geography2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = geography2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = geography2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = geography2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = geography2011.this.answered1 + geography2011.this.answered2 + geography2011.this.answered3 + geography2011.this.answered4 + geography2011.this.answered5 + geography2011.this.answered6 + geography2011.this.answered7 + geography2011.this.answered8 + geography2011.this.answered9 + geography2011.this.answered10;
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
                        if (access$600 > geography2011.this.highscoreGeography2011) {
                            edit.putInt("geo2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - geography2011.this.chr.getBase()) / 1000;
                        String str = "dategeo119";
                        String str2 = "dategeo118";
                        String str3 = "dategeo117";
                        String str4 = "dategeo116";
                        String str5 = "dategeo115";
                        String str6 = "dategeo114";
                        String str7 = "dategeo113";
                        String str8 = "dategeo112";
                        String str9 = "dategeo111";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1geo1110";
                        String str11 = "date1geo119";
                        if (geography2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1geo111", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1geo112", 0);
                            long j3 = defaultSharedPreferences.getLong("date1geo113", 0);
                            String str13 = "date1geo113";
                            String str14 = f;
                            String str15 = "date1geo111";
                            long j4 = defaultSharedPreferences.getLong("date1geo115", 0);
                            String str16 = "date1geo115";
                            String str17 = "date1geo114";
                            String str18 = "date1geo116";
                            long j5 = defaultSharedPreferences.getLong("date1geo116", 0);
                            long j6 = defaultSharedPreferences.getLong("date1geo117", 0);
                            String str19 = str11;
                            String str20 = "date1geo118";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1geo112";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1geo114", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1geo117";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1geo118", 0));
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
                                editor3.putString("scoregeo111", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoregeo112", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoregeo113", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoregeo114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoregeo115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoregeo116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoregeo117", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoregeo118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoregeo119", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoregeo1110", str25);
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
                            long j18 = sharedPreferences.getLong("dategeo1110", 0);
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
                                editor4.putString("iScoregeo111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoregeo112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoregeo113", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoregeo114", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoregeo115", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoregeo116", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoregeo117", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoregeo118", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoregeo119", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoregeo1110", str28);
                                    editor4.putLong("dategeo1110", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1geo111";
                            String str30 = "date1geo114";
                            String str31 = str11;
                            String str32 = "date1geo112";
                            String str33 = "date1geo117";
                            String str34 = "date1geo115";
                            String str35 = "date1geo116";
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
                            long j21 = sharedPreferences2.getLong("date1geo113", 0);
                            String str40 = str32;
                            String str41 = "date1geo113";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1geo118";
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
                                editor2.putString("scoregeo111", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoregeo112", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoregeo113", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoregeo114", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoregeo115", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoregeo116", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoregeo117", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoregeo118", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoregeo119", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoregeo1110", str49);
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
                            long j38 = sharedPreferences3.getLong("dategeo1110", 0);
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
                                editor.putString("iScoregeo111", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoregeo112", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoregeo113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoregeo114", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoregeo115", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoregeo116", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoregeo117", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoregeo118", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoregeo119", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoregeo1110", str56);
                                    editor.putLong("dategeo1110", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        geography2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2011.this.scr.setVisibility(8);
                geography2011.this.chr.stop();
                geography2011.this.toolbar.setVisibility(8);
                geography2011.this.Relative.setBackgroundColor(geography2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2011.this.scr.setVisibility(0);
                geography2011.this.toolbar.setVisibility(0);
                geography2011.this.telegram_layout.setVisibility(8);
                geography2011.this.chr.start();
                geography2011.this.Relative.setBackgroundColor(geography2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = geography2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = geography2011.this.mInterstitialAd = null;
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
                geography2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
