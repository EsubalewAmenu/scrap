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

public class geography2010 extends AppCompatActivity {
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
    private Boolean f572b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2010;
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
    private Toolbar f573tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2010);
        this.f572b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is correct about environmental lapse rate? ", 0, 0, 0, 0, 0, "10°C decrease in temperature per 1000 meters of ascent ", "60°C decrease in temperature per 1000 meters of ascent ", "60°C decrease in temperature per 5000 meters of ascent ", "10°C decrease in temperature per 600 meters of ascent ", "The lapse rate of nourishing air is hi o high referred to as the normal, or environmental, lapse rat is highly variable, being affected by radiation, convection, and condensation; it averages about 6.5 °C per kilometer (18.8 °F per mile) in the lower atmosphere (troposphere). ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("2.", "A branch of geography that studies the long-term atmospheric conditions of given place is", 0, 0, 0, 0, 0, "Meteorology  ", "Geomorphology", "Climatology", "atmospherology", "Climatology is climate science is the scientific study of climate, scientifically defined as weather conditions averaged over a period of time. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("3.", "In ________ projection, true distance and directions are retained ", 0, 0, 0, 0, 0, "Azimuthal", "Cylindrical  ", "Conic ", "Equal Area ", "The azimuthal equidistant projection is an azimuthal map projection. it has the useful properties that all points on the map are at proportionately correct distances from the center point, and that all points on the map are at the correct azimuth (direction) from the center point. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("4.", "One of the following terms is used to refer to the entire area that a river and its tributaries drain ", 0, 0, 0, 0, 0, "A river valley ", "A catchment area ", "A river capture", "A flood plain", "A catchment area drainage basin is any area of land where precipitation collects and drains of into a common ... Other terms used interchangeably with drainage basin are catchment area, catchment basin, drainage area, river basin, and water basin. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("5.", "Which one of the following instruments is used for measuring a slope angler? ", 0, 0, 0, 0, 0, "Clinometer", "Altimter ", "stereoscope ", "Barometer ", "An inclinometer or clinometers is an instrument used for measuring angles of slope (or tilt), elevation, or depression of an object with respect to gravity. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("6.", "Ethiopia shares the shortest boundary line with ", 0, 0, 0, 0, 0, "Eritrea", "Kenya  ", "Somalia ", "Djibouti", "The Republic of Djibouti shares the smallest boundary line length. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("7.", "What does natural increase denote in population studies?", 0, 0, 0, 0, 0, "Difference between the number of births and the number of deaths ", "Difference between the number of emigrates ", "Sum of the number of immigrants of emigrants ", "Sum of the number of births and the number of deaths ", "Put simply, natural increase is the difference between the numbers of births and deaths in a population; the rate of natural increase is the difference between the birthrate and the death rate. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("8.", "One of the following CANNOT be the mouth of river?", 0, 0, 0, 0, 0, "Marsh", "Lake ", "Spring", "sea ", "From its source, a river flows downhill as a small stream. A river's watershed includes the river, all its tributaries, and any groundwater resources in the area. The end of a river is its mouth. Here, the river empties into another body of water- a larger river, a lake, or the ocean. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("9.", "Which one of the following rivers is a tributary of the Nile River?", 0, 0, 0, 0, 0, "Sobat", "Bilate ", "Ghibe", "Bulbula ", "The Sobat River is a river of the Greater Upper Nile region in northeastern South Sudan, Africa. It is the most southerly of the great eastern tributaries of the White Nile.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("10.", "The traditional agro climatic zone of Ethiopia that is the most produce of surplus gains is", 0, 0, 0, 0, 0, "Woina dega ", "Dega ", "Qolla", "Bereha", "Woina-Dega is the traditional agro - climatic zones of Ethiopia that is the most important producer of surplus grains. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("11.", "Wild animals that are killed for sport are known as", 0, 0, 0, 0, 0, "Common wild animals", "Game animals", "Endangered animals", "Endemic animals ", "Game animals or quarry is any animal hunted for sport or for food. The type and range of animals hunted for food varies in different parts of the world. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("12.", "Which of the following rivers of Africa is navigable for a good part of its course during the greatest part of the year?", 0, 0, 0, 0, 0, "The Niger river", "The Congo river", "the nil river", "the Gambia river ", "Congo River which runs for 1,609 km, forming in a mostly navigable river in Africa.", "b", 0, 1, this.f572b));
        arrayList.add(new questions("13.", "The trees in the savannah region of Africa survive the dry seasons by using all EXCEPT one", 0, 0, 0, 0, 0, "Having thorny leaves ", "Shedding their leaves", "having a small number of leaves", "Having short roots", "You may wonder how an area is able to survive with such long dry periods. However, in order for the savannas to survive, they must have the long dry Periods, if it rained all year, the savannas would become tropical forests, filled with trees and tall vegetation. For grasslands to survive, they need the dry periods that prevent trees from taking over. in many savannas a combination of seasonal fires and large numbers of grazing animals keep forests from growing up and taking over the habitat. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("14.", "Which type of crop is most extensively produced in the northern and north central highlands of Ethiopia?", 0, 0, 0, 0, 0, "Pulses", "Enset", "Coffee", "Cereals", "Cereals are the crop types are most extensively produced in the Northern and north central highlands of Ethiopia. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("15.", "One of the following is NOT within the domain of Geographical studies", 0, 0, 0, 0, 0, "The spatial distribution of phenomena ", "The relationships between natural and human systems ", "The evolution of the humans and their environment ", "The patterns and systems of geographical phenomena ", "Geography has a well-developed set of perspectives: \n✓ Geography's way of looking at the world through the lenses of place, space, and scale;\n✓ Geography's domains of synthesis :1 environmental-societal dynamics relating human action to the physical environment, environmental dynamics linking physical systems, & human-societal dynamics linking economic, social, & political systems; and \n✓ Spatial representation using visual, verbal, mathematical, digital, and cognitive approaches. \n", "b", 0, 1, this.f572b));
        arrayList.add(new questions("16.", "Two places are intervisible when", 0, 0, 0, 0, 0, "The slope between them is convex ", "There is a high ground between them ", "They are located at the opposite side of a hill  ", "They are located at the opposite sides of a valley ", "Two points, one being located at the top of a hill and the other at its bottom, with contours that are evenly spaced (i.e., gentle slopes) are intervisible. Points that are located at the same altitude are intervisible if there is no higher ground between the points. Otherwise, they are not intervisible ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("17.", "Which river is named as `Juba` after it crosses the county' border?", 0, 0, 0, 0, 0, "Abbay", "Baro", "Ghheanlle", "Tekezze", "The Jubba River is a river in southern Somalia. It begins at the border with Ethiopia, where the Dawa and Ganale Dorya rivers meet, and flows directly south to Somalia. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("18.", "Which of the following plateaus serves as a watershed between the Abay and Awash River basins?", 0, 0, 0, 0, 0, "The plateau of Hararghe", "The plateau of Shewa", "The southwestern highlands ", "The plateau of Arsi ", "The Shoan Plateau is a dome-shaped plateau that serves as a watershed between the Awash and Abbay River basins. It extends westwards into western Wellega through Horo Guduru and forms a crescent shape which causes the Abbay to swerve and drain northwards. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("19.", "About 98 percent of the world's known deposits of one of the following minerals is found in Africa", 0, 0, 0, 0, 0, "Chromium", "Uranium", "Gold", "Manganese", "South Africa was the leading chromite ore and a leading ferrochromium producer upon whom world stainless steel producers depend directly or indirectly for chromium supply. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("20.", "Which one of the following is a pull factor of migration?", 0, 0, 0, 0, 0, "Resource scarcity", "Population pressure", "Low income", "Employment opportunities ", "People migrate for a number of reasons, these reasons may fall under these four areas: Environmental, Economic, Cultural and Socio-political. Push factors may include conflict, drought, famine, or extreme religious activity. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("21.", "Which region of Africa is the least populous?", 0, 0, 0, 0, 0, "Eastern Africa", "Central Africa", "Western Africa ", "Southern Africa ", "Central Africa is the least populous region in Africa. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("22.", "Which of the following is NOT Thomas Malthus's recommendation regarding the population growth challenge? ", 0, 0, 0, 0, 0, "Moral restraint ", "Preventive checks ", "late marriage ", "use of contraception ", "The most well-known theory of population is the Malthusian theory. His recommendation includes the positive checks to population are various methods include the use of preventive checks and late marriage. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("23.", "Temperature distribution in Ethiopia is mainly controlled by ", 0, 0, 0, 0, 0, "Proximity to the sea", "Wind pattern", "Elevation ", "pressure belts ", "Temperature distribution in Ethiopia mainly controlled by elevation (Altitude).", "c", 0, 1, this.f572b));
        arrayList.add(new questions("24.", "_________ refers to the capacity of a given environment to support the maximum possible population size ", 0, 0, 0, 0, 0, "Population density ", "Population boom", "Optimum population ", "Carrying capacity ", "The carrying of a biological species in an environment is the maximum population size of the species that the environment can pecks in sustain indefinitely, given the food habitat, water, and other necessities available in the environment.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("25.", "During which geologic time scales was the Hintalo limestone formed? ", 0, 0, 0, 0, 0, "Triassic period", "Cretaceous period", "tertiary period ", "Jurassic period ", "During the Jurassic Period the transgression of the sea contained into the mainland in the northwest direction. This event deposited another sedimentary rock known as Hintalo limestone. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("26.", "Which river basin has the largest irrigable area in Ethiopia? ", 0, 0, 0, 0, 0, "Wabishebelle basin", "The tekeze basin", "the barn basin ", "the abay basin ", "Upper Blue Nile Basin (locally called Abbay) has the largest area of suitable land for irrigation, which is approximately 21,186 km square while Rift Valley basin has the largest percentage of suitable land for irrigation.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("27.", "Which of the following river belongs to the southeastern drainage system of Ethiopia?", 0, 0, 0, 0, 0, "River omo ", "River mereb", "River Dawa", "River Gojeb ", "The Wabishebelle, the longest river in the country, does not reach the Indian Ocean. It ends at the Benadir coast of Somalia. The Ghenalle, on the other hand, reaches the Indian Ocean. It joins the Dawn River at the Ethio-Somalia border, where it acquires the name Juba. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("28.", "In which of the following towns of Ethiopia is rainfall variability the lowest?", 0, 0, 0, 0, 0, "Mekelle", "Emma", "Hawassa", "Gore", "Gore one of the towns in Ethiopia has the lowest variability of rainfall in Ethiopia.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("29.", "Which of the following type of soil are relatively the most widespread soils in the central highlands of Ethiopia? ", 0, 0, 0, 0, 0, "Vertisols ", "Nithosols ", "Lithosols ", "Cambisols ", "Nithosols red basaltic soils are relatively the widest spread soil in the central highlands of Ethiopia which cover about 12 percent of the country. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("30.", "________ is a control of climate with a pronounced influence on the climate of the east Africa highlands ", 0, 0, 0, 0, 0, "Latitude  ", "Ocean current", "Altitude", "Distance from the sea ", "Latitude, as a climate control, is the angular location of a place or point with reference to the direct rays of the sun. When we speak of the latitudinal impact on the climates of Ethiopia and the Horn, we are considering the intensity of temperature in the region. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("31.", "Which of the following rivers of Africa is most significantly used for hydroelectric power production and irrigation? ", 0, 0, 0, 0, 0, "Juba  ", "Sobat", "Athbara", "Nile ", "The most important thing the Nile provided to the Ancient Egyptians was fertile land. Most of Egypt is desert, but along In the Nile River the soil is rich and good for growing crops. The, three important crops were wheat, flax, and papyrus. most used river for hydroelectric and irrigation in Africa. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("32.", "The population of Ethiopia is characterized by ", 0, 0, 0, 0, 0, "High total fertility rate", "High life expectancy", "Low age dependency ratio ", "Low infant mortality rate ", "The population of Ethiopia characterized by high total fertility rate.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("33.", "Which of the following economic sectors falls under a service sector? ", 0, 0, 0, 0, 0, "Forestry", "Crop cultivation  ", "Tourism ", "Animal husbands ", "The service sector, also called tertiary sector, is the third of the three traditional economic sectors. ... Activities in the service sector include retail, banks, hotels, real estate, education, health, social work, computer services, media, communications, electricity, gas and water supply.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("34.", "Which of the following is correct about the population of Africa?  ", 0, 0, 0, 0, 0, "Population growth in Africa is the second fastest in the world next to Asia ", "Central Africa has the continent's lowest population density ", "The Maghreb region is the most densely population Region in Africa ", "West Africa has the continent's highest population density ", "In some African states, more than half the population is under 25 years of age.  The total number of people in Africa increased from 229 million in 1950 to 630 million in 1990. As of 2016 In some African years of states, more than half the population of Africa is estimated at 1.2 billion. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("35.", "Xerophytic plants are commonly found in areas where there is", 0, 0, 0, 0, 0, "moisture stress ", "abundant humidity ", "high diurnal range of temperature ", "reliable rainfall", "xerophyte is any plant adapted to life in a dry or physiologically dry habitat (salt marsh, saline soil, or acid bog) by means of mechanisms to prevent water loss or to store available water. Succulents (plants that store water) such as cacti and agaves have thick, fleshy stems or leaves.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("36.", "One of the following is a soil conservation measure", 0, 0, 0, 0, 0, "Over cultivation", "Terracing", "Slash and burn", "Used of tractors for cultivation", "Terracing is an earthen embankment, ridge or ridge-and-channel built across a slope to intercept runoff water and reduce soil erosion. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("37.", "Geographic information system (GIS) is a useful tool for all of the following EXCEPT", 0, 0, 0, 0, 0, "Regional planning ", "Modifying climate extremes ", "Monitoring the patterns of urban growth ", "Regulating traffic flows ", "A geographic information system (GIS) is a computer system for capturing, storing, checking, and displaying data related to positions on Earth's surface. By relating seemingly unrelated data, GIS can help individuals and organizations better understand spatial patterns and relationships. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("38.", "_______ drainage pattern develops on a raised on a land feature that stands higher than its surrounding", 0, 0, 0, 0, 0, "Radial", "Dendritic", "Trellis", "Rectangular", "Rectangular drainage pattern a in which the main streams and their tributaries display many right-angle bends and exhibit sections of approx. the same length; it is indicative of streams following prominent fault or joint systems that break the rocks into rectangular blocks. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("39.", "Which of the following continents is a major export for Ethiopian coffee?", 0, 0, 0, 0, 0, "Australia", "Africa", "south America  ", "Europe", "Deforestation is progressing at a rapid rate and has become one of the main causes for Ethiopia's hastened erosion rate. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("40.", "One of the following is NOT among the main drivers of deforestation Ethiopia?", 0, 0, 0, 0, 0, "Regionalization", "Poverty ", "Extensive farming ", "population pressure", "Regarding Ethiopia's export distribution in world regions, Europe was the leading export destination in the year 2006/07, taking 40.8% of the total value, and was followed by Asia, Africa and North and Central America, accounting for 33.5%, 15.5% and 5.8%, respectively.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("41.", "Which one of the following continents has territories in all the four?", 0, 0, 0, 0, 0, "Africa ", "Asia", "South Africa", "Australia ", "Africa, the planet's 2nd largest continent and the second most-populous continent. Its territory located in all four hemispheres. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("42.", "One of the following is different from the others", 0, 0, 0, 0, 0, "Group interview", "Modeling", "questionnaires", "personal observation ", "Common techniques for gathering data in the qualitative approach are: \n- group interviews \n- questionnaires and \n- personal observations \n", "b", 0, 1, this.f572b));
        arrayList.add(new questions("43.", "One of the following statements about the water resources of Ethiopia is NOT correct ", 0, 0, 0, 0, 0, "Pollutants are increasingly contaminating the country's water resources ", "Some highland lakes are not the verge of disappearance ", "The country does not have a national water conservation policy ", "The volume and purity of Ethiopia rivers is decreasing ", "Regarding water resource in Ethiopia pollutants are increasingly contaminating the country's water resources, some highland lakes are on the verge of disappearance and the volume of purity of Ethiopian rivers is decreasing from time to time. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("44.", "Which of the following geologic events occurred during Quaternary period in Ethiopia? ", 0, 0, 0, 0, 0, "Formation of the active volcano of Engle ", "Rift valley formation ", "Formation of the old crystalline basement ", "Formation of the highlands of Ethiopia ", "The Quaternary Period, these structures were formed in Ethiopia and the Horn: \n-\tThe Afar Horst that extends into Djibouti \n-\tThe active volcano of Ertalle in Afar \n-\tThe dormant volcanic mountain of Fentalle in Eastern Orornia \n-\tThe extensive lava field of Methara. \n", "a", 0, 1, this.f572b));
        arrayList.add(new questions("45.", "The northern and eastern extreme points of Africa are______and______respectively ", 0, 0, 0, 0, 0, "Cape Bon and Cape Guardafui ", "Cape verde and cape Agulhas ", "Cape Agulhas and Cape Verde  ", "Cape Guardafi and Cape Bon ", "Cape Guardafui- Eastern most point in mainland Africa Cap Bon; Ras Ben Sakka-Northern most point in mainland Africa. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("46.", "In Which era were Africa's volcanic and young fold mountains formed? ", 0, 0, 0, 0, 0, "Precambrian", "Cenozoic ", "Mesozoic ", "Paleozoic ", "The Cenozoic is the most recent geological era. Very significant structural, climatic and biological events have occurred in the Horn. In order to make things simple and easily comprehendible, we shall discuss only the geological events of this era into events of the Tertiary and Quaternary periods. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("47.", "Which of the following correctly characterizes the east African rift valley? ", 0, 0, 0, 0, 0, "Many structural basins in its floor ", "Diversified agro ecological climate zones ", "Great elevation differences ", "Has numerous active and dormant volcanoes ", "East African rift system, also called afro-arabian rift vally, one of the most extensive rifts on earth’s surface, extending from Jordan in southwestern asia. It has numerous active and dormant volcanoes.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("48.", "Which of the following types of soils is dominantly used for the production of rice? ", 0, 0, 0, 0, 0, "Claciosols", "Regosols", "Gleysols", "Vertisols", "Gleysols holds wetland soils that, unless drained, are saturated with ground water for long enough period to develop a characteristic “gleyic color pattern”", "c", 0, 1, this.f572b));
        arrayList.add(new questions("49.", "The two leading producers of diamond and coffee are _______and _______ respectively ", 0, 0, 0, 0, 0, "Republic of south Africa and Sudan ", "Nigeria and Republic of south Africa ", "Ghana and cote 'D' Ivoire ", "Republic of south Africa and cote 'D 'Ivoire ", "South Africa and cote Devore are the leading producer of diamond and coffee in Africa’s.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("50.", "Epeirogenesis is a process by which the earth's crust is  ", 0, 0, 0, 0, 0, "Denuded   ", "Faulted", "Folder  ", "elevated ", "In geology, epeirogeny movement is upheaval or depressions of land exhibiting long wavelengths and little folding apart from broad undulations. The broad central parts of continents are called cartons, and are subject to epeirogeny.", "b", 0, 1, this.f572b));
        arrayList.add(new questions("51.", "Which of the following statements about the Great Rift Valley is NOT correct? ", 0, 0, 0, 0, 0, "It is experiencing many earth quakes and volcanic eruptions ", "It is a geological depression that extends over thousands of kilometers ", "It is slowly but surely narrowing ", "It consists of valleys and water bodies that are bounded by parallel fault lines ", "A rift valley is a linear-shaped lowland between several highlands or mountain ranges created by the action of a geological rift or fault. A rift valley is formed on a divergent plate boundary, a crustal extension or spreading apart of the surface, which is subsequently further depend by the forces of erosion.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("52.", "________ is development that meets the needs of the present generation without compromising the ability of the future generation to meet their own need ", 0, 0, 0, 0, 0, "Economic growth", "Economic development", "Sustainable development ", "Socio economic growth ", "Sustainable development is development that meets the needs of the present ‘without compromising the ability of future generations to enact their own needs. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("53.", "Geographers usually ask all EXCEPT one of the following questions when they make spatial investigations ", 0, 0, 0, 0, 0, "\"Where are things located?\" ", "\"Who created things?\" ", "\"When are things from?\" ", "\"why are they located where they are? ", "While making spatial investigations, geographers ask five pertinent questions about the phenomena they study. These are: \n-\tWHERE are things located?\" \n-\tWHY are they fixated where they are?\" \n-\tWHEN did the things form?\" \n-\tWHAT things are found where?\" and \n-\tHOW are they arranged? \n", "b", 0, 1, this.f572b));
        arrayList.add(new questions("54.", "Which of the following is the most important agent of soil erosion in the Sahel region of western Africa? ", 0, 0, 0, 0, 0, "Water  ", "Wind ", "wild life", "slope", "In deserts and semi desert or Sahel regions wind picks up small particles and leaves behind larger rocks to form desert pavement. Moving sand may sand blast rocks and other features to create vent facts. The sand is transported until it is deposited in a sand dune. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("55.", "Which of the following type of rocks forms the largest portion of the parent material of the soils of the highlands of Ethiopia? ", 0, 0, 0, 0, 0, "Sedimentary ", "Old basement complex", "Recent volcanic rocks ", "Tertiary lava ", "The large portion of Ethiopia highland soil made from the parents of recent volcanic rocks. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("56.", "In which part of the Ethiopia rift valley is the active volcano of Ertalle found?  ", 0, 0, 0, 0, 0, "Conurbation  ", "The Chew- Bahir Rift    ", "the main Ethiopia rift", "the rift valley lake region", "Ertalle is a continuously active basaltic shield volcano in the Afar region of northeastern Ethiopia, it is situated in the afar depression or afar triangle.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("57.", "Addis Ababa, the capital city of Ethiopia, is a good example of a…………. ", 0, 0, 0, 0, 0, "Conurbation", "Megalopolis", "metropolis ", "large town", "Addis Ababa is A major city, especially the chief city of a country is the example of a Metropolis", "c", 0, 1, this.f572b));
        arrayList.add(new questions("58.", "Which of the following drainage system is characterized by a tree- like shape with branches? ", 0, 0, 0, 0, 0, "Centripetal ", "Trellis drainage pattern  ", "Radial drainage pattern ", "Dendritic drainage pattern ", "A dendritic drainage pattern is the most common form and looks like the branching pattern of tree roots. It develops in regions underlain by homogenous material. …. parallel drainage patterns from where there is a pronounced slope to the surface.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("59.", "Which of the following is NOT a product of the Quantitative revolution in geography? ", 0, 0, 0, 0, 0, "Increased used of descriptive methods in the study of regional geography ", "Increased used of statistical methods in geography ", "Growing interest in the use of computers in geographic research ", "The emergence of a more profound scientific thinking in geography ", "The quantitative revolution (QR) was a paradigm shift that sought to develop a more rigorous and systematic methodology for the discipline of geography. It came as a response to the inadequacy of regional geography to explain general spatial dynamics.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("60.", "Which of the following regions of Africa has the highest percentage of urban population? ", 0, 0, 0, 0, 0, "Central Africa ", "South Africa", "Western Africa", "North Africa ", "The extent of urbanization shows great regional variation in Africa. As it can clearly be observed from the table below, Southern Africa is the most urbanized region with 56% of its population living in urban areas in 2009 followed by Northern Africa (50%).", "b", 0, 1, this.f572b));
        arrayList.add(new questions("61.", "One of the following statements about the savanna vegetation in NOT correct ", 0, 0, 0, 0, 0, "It is habitat for game animal ", "It is dominated by tall grasses ", "It is extensively found in northern and southern Africa ", "It develops in areas that experience wet winters and dry summers ", "Tropical grasslands exist in Northern and Southern Africa, and they encircle the equatorial rainforests. Rainfall in savanna areas varies, decreasing over the range from the forest margins to the edges of the desert. Savanna areas that are close to the equatorial rainforests receive more rainfall, compared to the areas at the edge of the desert. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("62.", "Ethiopia's indicator of infrastructure availability is markedly higher than the average for the developing countries in one of the following ", 0, 0, 0, 0, 0, "Road density (per 1000 people) ", "Improved water (% of population) ", "Electrical power (kw per capita) ", "Telephone lines (per 1000 persons) ", "Ethiopia's indicator of infrastructure availability ls markedly higher than the average for developing countries may be in telephone lines. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("63.", "Which of the following is a common characteristic of commercial agriculture?", 0, 0, 0, 0, 0, "Low labor efficiency ", "Low external input ", "Agricultural mechanization ", "production of crops for domestic use ", "Commercial agriculture is a large-scale production of crops for sale, intended for widespread distribution to wholesalers or retail outlets. In commercial farming crops such as wheat, maize, tea, coffee, sugarcane, cashew, rubber, banana, cotton are harvested and sold in the world markets. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("64.", "One of the following landforms is different from the others", 0, 0, 0, 0, 0, "Ridge", "valley ", "cliff  ", "spur", "Terrain features are identified in the same manner on all maps. regardless of the contour interval Ridge-a line of high ground with height variations along its crest. Whereas spur, valley and cliff are low point or hole in the ground, surrounded on all sides by higher ground.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("65.", "The Winds that bring summer rainfall to central Ethiopia are", 0, 0, 0, 0, 0, "Equatorial Westerlies", "North Easterlies", "South Easterlies", "North Westerlies ", "The summer rainfall region is the largest in Ethiopia. This region consists of the Northwest Highlands and Western Lowlands, and can be represented by the following stations. Its moisture-bearing winds are the Equatorial Westerlies and Easterlies. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("66.", "The factors that most strongly affect the spatial distribution of temperature in Ethiopia are", 0, 0, 0, 0, 0, "Latitude and longitude ", "Altitude and cloud cover ", "Weather systems and mountain banters ", "Latitude and distance from the sea ", "The two factors that most affect the spatial variation of temperature in Ethiopia are cloud cover and altitude. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("67.", "Which of the following statement is correct? ", 0, 0, 0, 0, 0, "Nearly three quarters of the landmass of Africa is found within the tropics ", "The African landmass is located southeast of Asia ", "The equator crosses Africa almost at its east-west center ", "Cape bon is the western most tip of Africa ", "Shape is defined as the geographical form of an area. In other words, it is the external geographical appearance of a place. It has great impact on the socio-economic integration and flow of goods and services within each region. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("68.", "Which of the following statement is correct? ", 0, 0, 0, 0, 0, "According to the school of environmental possibilism, human beings are under the influence of the natural environment ", "Environmental determinism focuses on the impact of human beings on the physical environment ", "Environmental determinists consider human beings as passive agents influenced by physical factors ", "Proponents of environmental possibilism believe that there is a linear relationship between people and the natural environment ", "Environmental determinists consider human beings as passive agents where the physical factors determine their attitude and process of decision making. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("69.", "Which of the following factors most strongly explains why the river valleys of Ethiopia are sparsely populated? ", 0, 0, 0, 0, 0, "The high cost of constructing roads and bridges ", "The largely inaccessible location of main river valleys ", "The need to avoid the risks of devastating floods ", "The prevalence of major vector born disease ", "The strongest factor that explains why the river valleys of Ethiopia are sparsely populated because the need to avoid the risks of devastating floods. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("70.", "Which of the following regions of Ethiopia has the highest population density? ", 0, 0, 0, 0, 0, "The Amhara Region ", "The southern nations, nationalities and people’s region ", "The Oromia Region ", "The Tigray Region ", "We can clearly see wide variations in population distribution and density among the various regions of the country. The SNINP has the highest density of population which is 112,343.19 /km2", "b", 0, 1, this.f572b));
        arrayList.add(new questions("71.", "In which part of Africa is summer a dry season? ", 0, 0, 0, 0, 0, "Eastern part of Africa ", "Western coast Africa  ", "Cape province of south Africa ", "Central Region ", "The westerly winds bring rainfall to the maghreb region of North Africa and the cape province of south Africa in their respective winter seasons. Summer is not the wettest season in these places.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("72.", "Which of the following is a type of elongated settlement common on ridges? ", 0, 0, 0, 0, 0, "Linear (ribbon) settlement ", "Nucleated settlement ", "Compact settlement ", "Dispersed settlement", "linear settlement is a (normally small to medium sized) settlement or group of buildings that is formed in a long line. Many follow a transport route, such as a road, river, or canal through some form due to physical restrictions, such as coastlines, mountains, hills or valleys.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("73.", "When deforestation is a variable which is determined by various variable factors then deforestation is a ", 0, 0, 0, 0, 0, "Dependent variable", "Subordinate variable", "Independent variable ", "Explanatory variable ", "When deforestation is variable which is determined by various factors then deforestation is dependent variable because the values of dependent variables depend on the values of independent variables.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("74.", "The large size of Ethiopia is NOT related to one of the following ", 0, 0, 0, 0, 0, "Diversified agro ecological zones ", "Diverse minerals  ", "Different amount of rainfall and temperature ", "The high of the noon or mid day sun ", "The large size of Ethiopia is not directly related to the high angle of the noon or midday sun.", "d", 0, 1, this.f572b));
        arrayList.add(new questions("75.", "Which of the following types of vegetation are relatively the most widespread forests in Ethiopia? ", 0, 0, 0, 0, 0, "Mixed deciduous woodlands", "Broadleaf rainforests ", "Afro-alpine forests ", "Coniferous forests ", "Afro-Alpine vegetation consists of tussock grasslands, serules, scattered mosses and lichens. SubAfro Alpines are predominantly woodland scrubs. Gibra (Lobelia rhynchopetalum) and Asta (Erica arborea) are dominant plant species in this region of natural vegetation ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("76.", "Which of the following is NOT correct about the qualitative research approach ", 0, 0, 0, 0, 0, "It uses telephone interview as one of the data collection techniques ", "Qualitative data is used to explain a new theory ", "It requires intensive involvement of the researcher in data collection ", "It is usually employed to verify an existing theory ", "a qualitative \"approach\" is a general way of thinking about conducting qualitative research. It describes either explicitly or implicitly, the purpose of the qualitative research, the role of the researcher(s), the stages of research, and the method of data analysis. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("77.", "Which of the following is a common climatic experience in Ethiopia? ", 0, 0, 0, 0, 0, "Bega season is the coldest season ", "Low temperature when the season ", "The range of day and night temperature ", "Every place gets the overhead sun during spring season ", "In Ethiopia and elsewhere in the Horn, temperatures vary from season to season. For example, in most of Ethiopia, high temperatures are recorded from March to June. Conversely, low temperatures are recorded from November to February. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("78.", "One of the following is NOT the outcome of tropical location of Ethiopia ", 0, 0, 0, 0, 0, "Uneven distribution of temperature ", "Very high angle of the sun ", "Maximum isolation ", "Overhead sun twice a year ", "The outcome of tropical location of Ethiopia includes high angle of sun, maximum isolation and twice overhead of the sun. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("79.", "In which of the following landforms of Ethiopia is population density the highest? ", 0, 0, 0, 0, 0, "The Southwestern Highlands ", "The North-central massifs ", "The Tigray plateaus ", "The Shewan plateau", "Two main areas have relatively large concentrations of urban centers and urban population: the Shewan and the Harerghe plateaus. ", "d", 0, 1, this.f572b));
        arrayList.add(new questions("80.", "Which of the following is NOT correct about globes? ", 0, 0, 0, 0, 0, "On globes, all meridians con-verge at the poles ", "All latitudes and longitudes intersect at right angles on globes", "A globe is a three-dimensional representation of the earth ", "Globes are not visually convenient compared to maps", "Globe is a spherical model of Earth, of some other celestial body, or of the celestial sphere. Globes serve similar purposes to maps, but unlike maps, do not distort the surface that they portray except to scale it down. A globe of Earth is called a terrestrial globe. A globe of the celestial sphere is called a celestial globe. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("81.", "81.\tOne of the following is among the main goals of the population policy of Ethiopia", 0, 0, 0, 0, 0, "To control morbidity and mortality", "To promote accelerated utilization of natural resources", "To raise the economic and social status of women", "To achieve equal fertility and mortality rate", "The strategies by which the goals and objectives of the population policy includes integrating women into the modern sector of the economy and promoting the involvement of males in family planning. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("82.", "The part of Africa that receive rainfall in the winter season are ", 0, 0, 0, 0, 0, "The tropical desert and semi-desert climatic regions ", "The equatorial and Mediterranean climatic regions ", "The tropical continental (savanna)regions ", "The tropical maritime climate region ", "The equatorial and Mediterranean climate regions or parts of Arica that receive rainfall in the winter season. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("83.", "Why do certain highways tend to follow watersheds as much as possible? ", 0, 0, 0, 0, 0, "To shorten the distance travelled between points of origin and destination ", "To avoid mountains and lowlands ", "To shorten the time required to begin and finish road construction ", "To minimize costs of road construction ", "The highways tend to follow watersheds as much as possible to shorten the distance travelled between points of origin and destination.  ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("84.", "One of the following is NOT characteristic of the population of a country that has low median age ", 0, 0, 0, 0, 0, "A predominantly young population ", "A high dependency ratio ", "A narrow based population pyramid ", "A low level of economic development ", "The country that characterized by low median age means has predominately young population, high dependency radio and low economic development.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("85.", "What is the basis for classifying seasons as, summer, autumn; winter and spring? ", 0, 0, 0, 0, 0, "Altitudinal distribution of temperature ", "Annual rainfall distribution ", "Altitudinal distribution of rainfall ", "Annual temperature distribution ", "The basis for classification of seasons into summer, autumn winter and spring is based on the annual rainfall distribution.", "c", 0, 1, this.f572b));
        arrayList.add(new questions("86.", "\"Necessity is the mother of innovation\" and\" population growth leads to catastrophe\" best fit to which population theories, respectively ", 0, 0, 0, 0, 0, "Malthusian and Boserupian population theory ", "Boserupian and Marxist population theory ", "Boserupian and Malthusian population theory ", "Marxist and Malthusian population theory ", "Malthus referred to the catastrophes as positive checks that controls fast population growth and in the long term maintain a balance between population and resources.", "a", 0, 1, this.f572b));
        arrayList.add(new questions("87.", "Sex ratio is least affected in Ethiopia by ", 0, 0, 0, 0, 0, "war and political unrest", "technology", "fertility rate", "migration ", "The low sex ratio during the 1980s appears to be due to political unrest and civil war. ", "a", 0, 1, this.f572b));
        arrayList.add(new questions("88.", "Which is the following was NOT among the main challenges that geography faced during the late 9140s and early 1950s? ", 0, 0, 0, 0, 0, "The view that geography was not useful for problem solving ", "The emergence of many geography departments and courses ", "The fact that geography was seen as solely descriptive and unscientific ", "The growing demand for the autonomous subject hood of human geography ", "The quantitative revolution was a response to the crisis in the 1950’s. the crisis was the result of the challenges that geography faced during late 1940’s and early 1950’s. some of the major challenges were:\n-\tThe shutting down of many geography departments and courses for example, the geography program at Harvard university was abolished in 1948.\n-\tThe division between human and physical geography was continued demanding the autonomous subject hood of human geography. \n-\tGeography was seen as solely descriptive and unscientific. As some argued, there was no explanation of why processes or phenomena occur in geography.\n-\tGeography was not useful for solving problems. Hence, it was seen as exclusively educational. \n-\tQuestions regarding the nature of geography persisted, for example, it was unclear to some people whether geography was a science, an art,  a humanities subject or a social science. \n", "a", 0, 1, this.f572b));
        arrayList.add(new questions("89.", "Which of the following statements about plateaus in Africa is NOT correct? ", 0, 0, 0, 0, 0, "The low plateaus of Africa are largely found to the south of the equator ", "Plateaus constitute more than 07% of the land form of Africa ", "The 700m latitude is the dividing line between high and low plateaus in Africa ", "Some of Africa's low plateaus from inland basins when surrounded by high plateaus", "in most parts of Africa, areas above 300 in above sea level altitude are considered to be plateaus. Their altitude reaches its maximum in Eastern Africa; and the Ethiopian plateaus reach over 2000 m above sea level. Low Plateaus: lie between 300 and 700m above sea level, The northern and western parts of Africa are predominantly areas of low plateau. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("90.", "Which of the following statements about urbanization in Ethiopia is NOT correct? ", 0, 0, 0, 0, 0, "Ethiopia has one of the highest rates of urban growth in the world ", "Ethiopia did not have cities and towns prior to the 19th century ", "Ethiopia is one of the least urbanized countries Africa ", "Most of the urban center of Ethiopia have developed along major transport routes ", "As been pointed out earlier, urbanization is a recent phenomenon in Ethiopia., It was introduced mainly after the late 19th and early 20th centuries. In spite of the high rate of rural-urban migration in Ethiopia, the level of urbanization has been very low in the country. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("91.", "The term\" economic growth\" is used to describe ", 0, 0, 0, 0, 0, "The qualitative change in the welfare of human beings  ", "The growth in structural and technological change ", "The improvement made in service provision and living conditions ", "The increase in the total amount of wealth of a given economy ", "Economic growth Increase in a country's productive capacity, as measured by comparing gross national product (GNP) in a year With the GNP in the previous year. Increase in the capital stock, advances in technology and improvement in the quality and level of literacy are considered to be the principal causes of economic growth. In recent years, the idea of sustainable development has brought in additional factors such as environmentally sound processes that must be taken into account in growing an economy. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("92.", "One of the following factors is NOT directly associated with the low GDP per capita of African countries ", 0, 0, 0, 0, 0, "Their declining life expectancy ", "Their growing problem of brain drain ", "Their very low levels of national wealth ", "Their high population growth rates ", "Gross domestic product (GDP) is a monetary measure of the market value of all final goods and services produced in a period (quarterly or yearly) of time. Nominal GDP estimates are commonly used to determine the economic performance of a whole country or region, and to make international comparisons. ", "b", 0, 1, this.f572b));
        arrayList.add(new questions("93.", "Which of the following best represents the concerns of geographers in the study of human population? ", 0, 0, 0, 0, 0, "Aggregate demand and supply and responses to production ", "The impact of population pressure on natural resources ", "The impact of ethnic diversity on national unity and political stability ", "The effect of cultural values on the occurrence of crimes ", "Human population studies is broadly defined as the scientific study of interdisciplinary area of study; scholars from demography, epidemiology, sociology, economics, anthropology, and various other disciplines study populations. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("94.", "What do you understand by the concept of sustainable use of forests in Ethiopia? ", 0, 0, 0, 0, 0, "Severely limiting the cutting of trees to meet household and industrial needs ", "Protecting community forests by applying strict legal measures ", "Providing environmental education to raise public awareness about forests ", "Making use of forest resources in a way that does not harm the environment ", "The most important part of a sustainable forest management plan is that it helps local people work together to use and protect forests. Some ways to both use and protect the forest at the same time include: Thinning vines, plants, and trees allows more sunlight into the forest, so that the plants you want can grow. ", "c", 0, 1, this.f572b));
        arrayList.add(new questions("95.", "What do you understand by the concept of leaching? ", 0, 0, 0, 0, 0, "The removal of soluble minerals from soil by water passing through it ", "The erosion of soil by water ", "The removal of nutrients from top soil by continuous cultivation ", "Decrease in the productivity of soils due to over cropping ", "Leaching is a method of separation which depends on differences in solubility in a solvent. When solvents arc used to remove substances from porous solids, or sludges, the process is called leaching. ", "a", 0, 1, this.f572b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("96.", "Which of the following points are located on the watershed that divides the two main river systems?", 0, 0, 0, 0, 0, "A,B and H", "B,F and H", "C,D and H", "E,F and G", "Point A, B and H arc located on the watershed that divides the two main river system.", "a", 0, 1, this.f572b));
        arrayList2.add(new questions("97.", "The crow flight distance between points 'A' and 'B' is approximately _____ kilometers", 0, 0, 0, 0, 0, "8", "12", "16", "4", "The crow flight distance between points A and B is approximately 8kms because the scale of the map is 1:200000 the distance between the two point is 4 centimeters so distance between point A and B is approximately 8kms. ", "a", 0, 1, this.f572b));
        arrayList2.add(new questions("98.", "Which of the following points is located on a confluence?", 0, 0, 0, 0, 0, "B", "C", "F", "H", "Point C the place where two rivers meet together and become one larger river called Confluence.", "b", 0, 1, this.f572b));
        arrayList2.add(new questions("99.", "Which of the following points are inter visible?", 0, 0, 0, 0, 0, "C and H", "F and G", "E and G", "E and F", "points C and H, inter visible (comparable) (surveying) Mutually visible; each in sight of the other because they located at the same interval. ", "a", 0, 1, this.f572b));
        arrayList2.add(new questions("100.", "In which traditional agro climatic zone of Ethiopia is the area shown on the map found?", 0, 0, 0, 0, 0, "Wurch", "Dega", "Qolla", "Woina Dega", "The traditional agro- climate zones of Ethiopia shown in the map found is Qolla because the Qolla and Bereha agro - climatic zones are largely confined to lowland areas with altitudes of 1500 meters and below. They are sparsely populated and their populations are primarily engaged in pastoralist activities.", "c", 0, 1, this.f572b));
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
        this.f573tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2010.this.timer.setVisibility(0);
                    geography2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    geography2010.this.scr.setVisibility(8);
                    geography2010.this.chr.stop();
                    geography2010.this.toolbar.setVisibility(8);
                    geography2010.this.Relative.setBackgroundColor(-7829368);
                    geography2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2010.this.getBaseContext());
                    int unused = geography2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2010.this.highscoreGeography2010 = defaultSharedPreferences.getInt("geo2010hs", 0);
                    int access$600 = geography2010.this.part1 + geography2010.this.part2 + geography2010.this.part3 + geography2010.this.part4 + geography2010.this.part5 + geography2010.this.part6 + geography2010.this.part7 + geography2010.this.part8 + geography2010.this.part9;
                    TextView access$1600 = geography2010.this.resultText;
                    access$1600.setText(String.valueOf(access$600 + "/100"));
                    geography2010.this.progressbar.setProgress(access$600);
                    geography2010.this.progressbar.setMax(100);
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
                    int unused11 = geography2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = geography2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = geography2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = geography2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = geography2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = geography2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = geography2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = geography2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = geography2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = geography2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = geography2010.this.answered1 + geography2010.this.answered2 + geography2010.this.answered3 + geography2010.this.answered4 + geography2010.this.answered5 + geography2010.this.answered6 + geography2010.this.answered7 + geography2010.this.answered8 + geography2010.this.answered9 + geography2010.this.answered10;
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
                    if (access$600 > geography2010.this.highscoreGeography2010) {
                        edit.putInt("geo2010hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 100;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - geography2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1geo101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1geo102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1geo103", 0);
                    long j4 = defaultSharedPreferences.getLong("date1geo104", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1geo105", 0);
                    long j6 = defaultSharedPreferences.getLong("date1geo106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1geo107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1geo108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1geo109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1geo1010", 0);
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
                        editor.putString("scoregeo101", str);
                        editor.putLong("date1geo101", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoregeo102", str2);
                            editor.putLong("date1geo102", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoregeo103", str2);
                            editor.putLong("date1geo103", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoregeo104", str2);
                            editor.putLong("date1geo104", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoregeo105", str2);
                            editor.putLong("date1geo105", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoregeo106", str2);
                            editor.putLong("date1geo106", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoregeo107", str2);
                            editor.putLong("date1geo107", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoregeo108", str2);
                            editor.putLong("date1geo108", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoregeo109", str2);
                            editor.putLong("date1geo109", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoregeo1010", str2);
                            editor.putLong("date1geo1010", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dategeo101", 0);
                    long j12 = defaultSharedPreferences.getLong("dategeo102", 0);
                    long j13 = defaultSharedPreferences.getLong("dategeo103", 0);
                    long j14 = defaultSharedPreferences.getLong("dategeo104", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("dategeo105", 0);
                    long j16 = defaultSharedPreferences.getLong("dategeo106", 0);
                    long j17 = defaultSharedPreferences.getLong("dategeo107", 0);
                    long j18 = defaultSharedPreferences.getLong("dategeo108", 0);
                    long j19 = defaultSharedPreferences.getLong("dategeo109", 0);
                    long j20 = defaultSharedPreferences.getLong("dategeo1010", 0);
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
                        editor2.putString("iScoregeo101", f);
                        editor2.putLong("dategeo101", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoregeo102", f);
                            editor2.putLong("dategeo102", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoregeo103", f);
                            editor2.putLong("dategeo103", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoregeo104", f);
                            editor2.putLong("dategeo104", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoregeo105", f);
                            editor2.putLong("dategeo105", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoregeo106", f);
                            editor2.putLong("dategeo106", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoregeo107", f);
                            editor2.putLong("dategeo107", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoregeo108", f);
                            editor2.putLong("dategeo108", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoregeo109", f);
                            editor2.putLong("dategeo109", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoregeo1010", f);
                            editor2.putLong("dategeo1010", valueOf.longValue());
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
                        geography2010.this.scr.setVisibility(8);
                        geography2010.this.chr.stop();
                        geography2010.this.toolbar.setVisibility(8);
                        geography2010.this.Relative.setBackgroundColor(-7829368);
                        geography2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2010.this.getBaseContext());
                        int unused = geography2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = geography2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = geography2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = geography2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = geography2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = geography2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = geography2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = geography2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = geography2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = geography2010.this.highscoreGeography2010 = defaultSharedPreferences.getInt("geo2010hs", 0);
                        int access$600 = geography2010.this.part1 + geography2010.this.part2 + geography2010.this.part3 + geography2010.this.part4 + geography2010.this.part5 + geography2010.this.part6 + geography2010.this.part7 + geography2010.this.part8 + geography2010.this.part9;
                        geography2010.this.resultText.setText(String.valueOf(access$600));
                        geography2010.this.progressbar.setProgress(access$600);
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
                        int unused11 = geography2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = geography2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = geography2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = geography2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = geography2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = geography2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = geography2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = geography2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = geography2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = geography2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = geography2010.this.answered1 + geography2010.this.answered2 + geography2010.this.answered3 + geography2010.this.answered4 + geography2010.this.answered5 + geography2010.this.answered6 + geography2010.this.answered7 + geography2010.this.answered8 + geography2010.this.answered9 + geography2010.this.answered10;
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
                        if (access$600 > geography2010.this.highscoreGeography2010) {
                            edit.putInt("geo2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - geography2010.this.chr.getBase()) / 1000;
                        String str = "dategeo109";
                        String str2 = "dategeo108";
                        String str3 = "dategeo107";
                        String str4 = "dategeo106";
                        String str5 = "dategeo105";
                        String str6 = "dategeo104";
                        String str7 = "dategeo103";
                        String str8 = "dategeo102";
                        String str9 = "dategeo101";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1geo1010";
                        String str11 = "date1geo109";
                        if (geography2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1geo101", 0);
                            String str12 = "date1geo101";
                            String str13 = f;
                            long j2 = defaultSharedPreferences.getLong("date1geo102", 0);
                            Long l = valueOf;
                            String str14 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1geo103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1geo104", 0);
                            String str15 = "date1geo104";
                            String str16 = "date1geo103";
                            String str17 = "date1geo105";
                            long j5 = defaultSharedPreferences.getLong("date1geo105", 0);
                            long j6 = defaultSharedPreferences.getLong("date1geo107", 0);
                            String str18 = "date1geo106";
                            String str19 = "date1geo108";
                            long j7 = defaultSharedPreferences.getLong("date1geo108", 0);
                            long j8 = defaultSharedPreferences.getLong(str11, 0);
                            long j9 = defaultSharedPreferences.getLong(str10, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            Date date6 = new Date(defaultSharedPreferences.getLong("date1geo106", 0));
                            Date date7 = new Date(j6);
                            Date date8 = new Date(j7);
                            String str20 = "date1geo107";
                            Date date9 = new Date(j8);
                            Date date10 = new Date(j9);
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
                                editor3.putString("scoregeo101", str14);
                                editor3.putLong(str12, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str21 = str14;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoregeo102", str21);
                                    editor3.putLong("date1geo102", l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoregeo103", str21);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoregeo104", str21);
                                    editor3.putLong(str15, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoregeo105", str21);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoregeo106", str21);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoregeo107", str21);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoregeo108", str21);
                                    editor3.putLong(str19, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoregeo109", str21);
                                    editor3.putLong(str11, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoregeo1010", str21);
                                    editor3.putLong(str10, l.longValue());
                                }
                            }
                            String str22 = str9;
                            long j10 = defaultSharedPreferences.getLong(str22, 0);
                            String str23 = str8;
                            long j11 = defaultSharedPreferences.getLong(str23, 0);
                            String str24 = str7;
                            long j12 = defaultSharedPreferences.getLong(str24, 0);
                            SharedPreferences.Editor editor6 = editor3;
                            String str25 = str5;
                            String str26 = str4;
                            long j13 = defaultSharedPreferences.getLong(str25, 0);
                            long j14 = defaultSharedPreferences.getLong(str26, 0);
                            String str27 = str26;
                            long j15 = defaultSharedPreferences.getLong(str3, 0);
                            long j16 = defaultSharedPreferences.getLong(str2, 0);
                            long j17 = defaultSharedPreferences.getLong(str, 0);
                            long j18 = defaultSharedPreferences.getLong("dategeo1010", 0);
                            Date date12 = new Date(j10);
                            Date date13 = new Date(j11);
                            Date date14 = new Date(j12);
                            Date date15 = new Date(defaultSharedPreferences.getLong(str6, 0));
                            Date date16 = new Date(j13);
                            String str28 = str25;
                            Date date17 = new Date(j14);
                            Date date18 = new Date(j15);
                            String str29 = str24;
                            Date date19 = date17;
                            Date date20 = new Date(j16);
                            Date date21 = new Date(j17);
                            Date date22 = new Date(j18);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(date12);
                            arrayList2.add(date13);
                            arrayList2.add(date14);
                            arrayList2.add(date15);
                            arrayList2.add(date16);
                            Date date23 = date19;
                            arrayList2.add(date23);
                            arrayList2.add(date18);
                            arrayList2.add(date20);
                            arrayList2.add(date21);
                            arrayList2.add(date22);
                            Date date24 = (Date) Collections.min(arrayList2);
                            if (date24.compareTo(date12) == 0) {
                                editor4 = editor6;
                                editor4.putString("iScoregeo101", str13);
                                editor4.putLong(str22, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str30 = str13;
                                if (date24.compareTo(date13) == 0) {
                                    editor4.putString("iScoregeo102", str30);
                                    editor4.putLong(str23, l.longValue());
                                } else if (date24.compareTo(date14) == 0) {
                                    editor4.putString("iScoregeo103", str30);
                                    editor4.putLong(str29, l.longValue());
                                } else if (date24.compareTo(date15) == 0) {
                                    editor4.putString("iScoregeo104", str30);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date24.compareTo(date16) == 0) {
                                    editor4.putString("iScoregeo105", str30);
                                    editor4.putLong(str28, l.longValue());
                                } else if (date24.compareTo(date23) == 0) {
                                    editor4.putString("iScoregeo106", str30);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date24.compareTo(date18) == 0) {
                                    editor4.putString("iScoregeo107", str30);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date24.compareTo(date20) == 0) {
                                    editor4.putString("iScoregeo108", str30);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date24.compareTo(date21) == 0) {
                                    editor4.putString("iScoregeo109", str30);
                                    editor4.putLong(str, l.longValue());
                                } else if (date24.compareTo(date22) == 0) {
                                    editor4.putString("iScoregeo1010", str30);
                                    editor4.putLong("dategeo1010", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            String str31 = "date1geo104";
                            String str32 = "date1geo103";
                            String str33 = str;
                            String str34 = str2;
                            String str35 = str3;
                            String str36 = str5;
                            String str37 = str6;
                            String str38 = str7;
                            String str39 = str8;
                            String str40 = str10;
                            String str41 = str11;
                            String str42 = "date1geo105";
                            String str43 = "date1geo106";
                            String str44 = "date1geo107";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j19 = defaultSharedPreferences.getLong("date1geo101", 0);
                            String str45 = "date1geo101";
                            String str46 = f3;
                            String str47 = f4;
                            long j20 = defaultSharedPreferences.getLong(str32, 0);
                            long j21 = defaultSharedPreferences.getLong(str31, 0);
                            String str48 = str32;
                            String str49 = str31;
                            long j22 = defaultSharedPreferences.getLong(str42, 0);
                            long j23 = defaultSharedPreferences.getLong(str43, 0);
                            String str50 = str42;
                            String str51 = str43;
                            long j24 = defaultSharedPreferences.getLong(str44, 0);
                            String str52 = "date1geo108";
                            long j25 = defaultSharedPreferences.getLong(str52, 0);
                            long j26 = defaultSharedPreferences.getLong(str41, 0);
                            long j27 = defaultSharedPreferences.getLong(str40, 0);
                            Date date25 = new Date(j19);
                            Date date26 = new Date(defaultSharedPreferences.getLong("date1geo102", 0));
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            String str53 = str40;
                            Date date27 = new Date(j20);
                            Date date28 = new Date(j21);
                            Date date29 = new Date(j22);
                            Date date30 = new Date(j23);
                            Date date31 = new Date(j24);
                            String str54 = str41;
                            Date date32 = new Date(j25);
                            SharedPreferences sharedPreferences2 = sharedPreferences;
                            Date date33 = new Date(j26);
                            Date date34 = new Date(j27);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(date25);
                            arrayList3.add(date26);
                            arrayList3.add(date27);
                            arrayList3.add(date28);
                            arrayList3.add(date29);
                            arrayList3.add(date30);
                            arrayList3.add(date31);
                            Date date35 = date32;
                            arrayList3.add(date35);
                            arrayList3.add(date33);
                            arrayList3.add(date34);
                            Date date36 = (Date) Collections.min(arrayList3);
                            if (date36.compareTo(date25) == 0) {
                                editor2 = editor5;
                                editor2.putString("scoregeo101", str47);
                                editor2.putLong(str45, valueOf2.longValue());
                            } else {
                                String str55 = str47;
                                editor2 = editor5;
                                if (date36.compareTo(date26) == 0) {
                                    editor2.putString("scoregeo102", str55);
                                    editor2.putLong("date1geo102", valueOf2.longValue());
                                } else if (date36.compareTo(date27) == 0) {
                                    editor2.putString("scoregeo103", str55);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date36.compareTo(date28) == 0) {
                                    editor2.putString("scoregeo104", str55);
                                    editor2.putLong(str49, valueOf2.longValue());
                                } else if (date36.compareTo(date29) == 0) {
                                    editor2.putString("scoregeo105", str55);
                                    editor2.putLong(str50, valueOf2.longValue());
                                } else if (date36.compareTo(date30) == 0) {
                                    editor2.putString("scoregeo106", str55);
                                    editor2.putLong(str51, valueOf2.longValue());
                                } else if (date36.compareTo(date31) == 0) {
                                    editor2.putString("scoregeo107", str55);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date36.compareTo(date35) == 0) {
                                    editor2.putString("scoregeo108", str55);
                                    editor2.putLong(str52, valueOf2.longValue());
                                } else if (date36.compareTo(date33) == 0) {
                                    editor2.putString("scoregeo109", str55);
                                    editor2.putLong(str54, valueOf2.longValue());
                                } else if (date36.compareTo(date34) == 0) {
                                    editor2.putString("scoregeo1010", str55);
                                    editor2.putLong(str53, valueOf2.longValue());
                                }
                            }
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            String str56 = str9;
                            long j28 = sharedPreferences3.getLong(str56, 0);
                            String str57 = str39;
                            long j29 = sharedPreferences3.getLong(str57, 0);
                            String str58 = str38;
                            long j30 = sharedPreferences3.getLong(str58, 0);
                            SharedPreferences.Editor editor7 = editor2;
                            String str59 = str57;
                            String str60 = str37;
                            long j31 = sharedPreferences3.getLong(str60, 0);
                            String str61 = str58;
                            String str62 = str60;
                            String str63 = str36;
                            long j32 = sharedPreferences3.getLong(str63, 0);
                            String str64 = str63;
                            String str65 = str4;
                            long j33 = j32;
                            long j34 = sharedPreferences3.getLong(str65, 0);
                            String str66 = str65;
                            long j35 = sharedPreferences3.getLong(str35, 0);
                            long j36 = sharedPreferences3.getLong(str34, 0);
                            String str67 = str33;
                            long j37 = sharedPreferences3.getLong(str67, 0);
                            String str68 = str67;
                            long j38 = sharedPreferences3.getLong("dategeo1010", 0);
                            Date date37 = new Date(j28);
                            Date date38 = new Date(j29);
                            Date date39 = new Date(j30);
                            Date date40 = new Date(j31);
                            Date date41 = new Date(j33);
                            Date date42 = new Date(j34);
                            Date date43 = new Date(j35);
                            Date date44 = new Date(j36);
                            Date date45 = new Date(j37);
                            Date date46 = new Date(j38);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(date37);
                            arrayList4.add(date38);
                            arrayList4.add(date39);
                            arrayList4.add(date40);
                            arrayList4.add(date41);
                            arrayList4.add(date42);
                            arrayList4.add(date43);
                            arrayList4.add(date44);
                            arrayList4.add(date45);
                            arrayList4.add(date46);
                            Date date47 = (Date) Collections.min(arrayList4);
                            if (date47.compareTo(date37) == 0) {
                                editor = editor7;
                                editor.putString("iScoregeo101", str46);
                                editor.putLong(str56, valueOf2.longValue());
                            } else {
                                String str69 = str46;
                                editor = editor7;
                                if (date47.compareTo(date38) == 0) {
                                    editor.putString("iScoregeo102", str69);
                                    editor.putLong(str59, valueOf2.longValue());
                                } else if (date47.compareTo(date39) == 0) {
                                    editor.putString("iScoregeo103", str69);
                                    editor.putLong(str61, valueOf2.longValue());
                                } else if (date47.compareTo(date40) == 0) {
                                    editor.putString("iScoregeo104", str69);
                                    editor.putLong(str62, valueOf2.longValue());
                                } else if (date47.compareTo(date41) == 0) {
                                    editor.putString("iScoregeo105", str69);
                                    editor.putLong(str64, valueOf2.longValue());
                                } else if (date47.compareTo(date42) == 0) {
                                    editor.putString("iScoregeo106", str69);
                                    editor.putLong(str66, valueOf2.longValue());
                                } else if (date47.compareTo(date43) == 0) {
                                    editor.putString("iScoregeo107", str69);
                                    editor.putLong(str35, valueOf2.longValue());
                                } else if (date47.compareTo(date44) == 0) {
                                    editor.putString("iScoregeo108", str69);
                                    editor.putLong(str34, valueOf2.longValue());
                                } else if (date47.compareTo(date45) == 0) {
                                    editor.putString("iScoregeo109", str69);
                                    editor.putLong(str68, valueOf2.longValue());
                                } else if (date47.compareTo(date46) == 0) {
                                    editor.putString("iScoregeo1010", str69);
                                    editor.putLong("dategeo1010", valueOf2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        geography2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2010.this.scr.setVisibility(8);
                geography2010.this.chr.stop();
                geography2010.this.toolbar.setVisibility(8);
                geography2010.this.Relative.setBackgroundColor(geography2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2010.this.scr.setVisibility(0);
                geography2010.this.toolbar.setVisibility(0);
                geography2010.this.telegram_layout.setVisibility(8);
                geography2010.this.chr.start();
                geography2010.this.Relative.setBackgroundColor(geography2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = geography2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = geography2010.this.mInterstitialAd = null;
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
                geography2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
