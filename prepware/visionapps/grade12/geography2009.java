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

public class geography2009 extends AppCompatActivity {
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
    private Boolean f570b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreGeography2009;
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
    private Toolbar f571tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_geography2009);
        this.f570b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextGeography2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_geography2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one of the geospheres of the earth is the main domain of climatology? ", 0, 0, 0, 0, 0, "Biosphere ", "Troposphere ", "Anthroposphere ", "Lithosphere ", "Troposphere is the geography of the earths surfaces the main climatology. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("2.", "The Suez Canal connects Africa with ", 0, 0, 0, 0, 0, "Asia", "Europe ", "South America ", "Australia", "The Suez Canal connect Africa with Asia. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("3.", "One of the following lakes of Africa is NOT a Rift Valley Lake ", 0, 0, 0, 0, 0, "Lake Tana", " Lake Tanganyika", "Lake Kivu ", "Lake Turkana ", "Lake tana is one of the largest lakes outside the area of rift valley on Africa.", "a", 0, 1, this.f570b));
        arrayList.add(new questions("4.", "_________ is the ration of the size of an object on a map to its actual size. ", 0, 0, 0, 0, 0, "Area", "Volume", "Scale", "Distortion", "The scale of a map is the ratio between the measurement of distance on the map and the corresponding measurement on the earth's surface. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("5.", "Which one of the following rivers of Ethiopia flows to the East? ", 0, 0, 0, 0, 0, "Wabishebelle  ", "Nile", "Awash ", "Ghenale ", "The Awash River basin is the most utilized in the Rift Valley. The basin covers a total area of 110 thousand square kilometers and serves as home to 10.5 million inhabitants. It flows to the East. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("6.", "One of the following Rift Valley lakes of Ethiopia is the deepest ", 0, 0, 0, 0, 0, "Lake Ziway ", "Lake Shalla ", "Lake Abaya ", "Lake Langano", "Lake Shala is the deepest rift valley lake in Ethiopia with depth 266 meters. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("7.", "One of the following is NOT among the primary sources of data in geography.", 0, 0, 0, 0, 0, "a questionnaire", "a diary", "an interview ", "a researcher's observation ", "A Researcher observation is one of the primary sources of data in Geography. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("8.", "The least urbanized region of Africa is_________", 0, 0, 0, 0, 0, "Eastern Africa", "Southern Africa  ", "Western Africa ", "Northern Africa ", "Lest Africa the least urbanized part of Africa. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("9.", "One of the following sub- regional organizations promotes economic cooperation and development to eastern and southern Africa. ", 0, 0, 0, 0, 0, "SADC", "CEN- DAD", "COMESA", "ECCAS", "COMESA is Common Market for Eastern and Southern Africa promote economic corporation & development to Eastern & Southern Africa. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("10.", "One of the following countries is the leading producer of phosphate ", 0, 0, 0, 0, 0, "Egypt", "South Africa ", "Morocco ", "Democratic Republic of Congo ", "Morocco, which was the leading producer of phosphate rock in Africa, accounted for 60% of continental phosphate. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("11.", "As the Aswan dam is the Nile River, the Kariba dam is to………", 0, 0, 0, 0, 0, "Volta river", "Zambezi river", "Limpopo River ", "Niger River ", "As Aswan dam is to the Nile River Kariban dams to Zambezi River. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("12.", "Which of the following wet- points is most suitable for hydroelectric power generation?", 0, 0, 0, 0, 0, "Deltas", "Lakes ", "Waterfalls  ", "water holes", "The most suitable for the hydroelectric power generation is waterfalls. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("13.", "Which of the following towns of Ethiopia is best known for it industrial functions? ", 0, 0, 0, 0, 0, "Dukam", "Dubti", "Dolo", "Dera", "Dukam is one the best known for its industrial function in Ethiopia.", "a", 0, 1, this.f570b));
        arrayList.add(new questions("14.", "The southernmost tip of the African continent is known as………...", 0, 0, 0, 0, 0, "Cape Town", "Cape Agulhas", "Cape verde", "Cape guardafui", "The southernmost point of Africa continent is known as the Cape Agulhas Republic of South Africa. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("15.", "Africa's relief is predominantly made up of…………...", 0, 0, 0, 0, 0, "Plains", "Mountains", "Valleys and gorges ", "Plateaus", "In most parts of Africa, areas above 300 m above sea level altitude are i r considered to be plateaus. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("16.", "Which of the following soils of Africa are ideal for crop production? ", 0, 0, 0, 0, 0, "Ferrasls", "Nitosols ", "Acrisols", "Regosols", "Nitosols soils mainly develop in humid climatic regions. Their parent materials are usually volcanic rocks. Such soils have a deep profile and are rich in humus content. Therefore, they are the most productive soils in Africa. As a result, they are ideal for crop production. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("17.", "All of the following African Countries arc cocoa producers EXCEPT ", 0, 0, 0, 0, 0, "Ghana ", "Liberia ", "Uganda  ", "Nigeria ", "Cacao producing countries includes Ghana, Cote D'Ivoire, Nigeria, Liberia, Togo, Cameroon. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("18.", "in which time zone do countries of the Horn of Africa lie? ", 0, 0, 0, 0, 0, "GMT+4", "GMT+3", "GMT+2", "GMT+1", "The countries of the Horn of Africa lie at GMT+3 Zone. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("19.", "Which sub- division of the Western Lowlands of Ethiopia is the wettest? ", 0, 0, 0, 0, 0, "The Tekezze and Angereb lowlands. ", "The Abbey Dinder Lowlands. ", "The Baro- Akobo Lowlands ", "The Omo- Ghibe Lowlands ", "The Baro-Akobo lowland of the westerns of Ethiopia' is the wettest. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("20.", "Which of the following areas is the best example of an inland drainage system? ", 0, 0, 0, 0, 0, "The drainage system of the Red Sea coastal plains. ", "The Rift Valley drainage system. ", "The Baro- Akobo drainage system. ", "The Wabishebelle drainage system. ", "The Rift Valley drainage system is the example of an inland drainage system in Ethiopia.", "b", 0, 1, this.f570b));
        arrayList.add(new questions("21.", "Which one of the following is NOT a highland forest? ", 0, 0, 0, 0, 0, "Zigba ", "kerkeha", "Warka ", "Woira", "Ethiopia's highland forests consist of Kerkha (Arundinaria),Tid(Juniperous Procera) or Coniferous trees Zigba (Podocarpus),Woira (olila Afrwana) and Kosso (Hagenia Abyssinia) ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("22.", "Rainfall distribution is more reliable in ", 0, 0, 0, 0, 0, "Mekelle  ", "Gore", "Bahir Dar", "Dire Dawa ", "The rainfall distribution is more reliable in south western parts of Ethiopia (Gore). ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("23.", "______ is a landform type represented b contours forming concentric circles. ", 0, 0, 0, 0, 0, "Hill ", "Depression", "Saddle  ", "Ridge ", "A hill is an area of high ground-but is lower than a mountain in elevation. From the top of the hill the ground slopes down in all directions. topographic map, a hill is shown by contour lines forming concentric circles. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("24.", "tWhich type of internal migration is common in many Africa countries? ", 0, 0, 0, 0, 0, "Rural- Rural ", "Rural- Urban ", "Urban- Rural ", "Urban - Urban ", "Rural- urban migration is common internal migration in many African countries. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("25.", "The quantitative revolution has led to ", 0, 0, 0, 0, 0, "Increased use of descriptive methodologies in geographical studies.", "More emphasis on theory building in geographical studies. ", "The use of maps in geographical studies. ", "The application of statistical and mathematical techniques in geographical studies.", "The quantitative revolution (QR)was a paradigm shift that sought to develop a more rigorous and systematic methodology for the discipline of geography. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("26.", "Two points on a map are said to be indivisible when they are", 0, 0, 0, 0, 0, "Separated by closely spaced contour lines. ", "of the same elevation ", "separated by a concave slope ", "located at the opposite side of a high ground ", "Two points separated by a concave slope are said to be intervisible if no other factor exists that hinders intervisibility. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("27.", "In which of the following regions of Africa is the economy more diverse? ", 0, 0, 0, 0, 0, "Eastern Africa", "Southern Africa", "Northern Africa ", "Western Africa ", "Southern part of Africa is one of the regions in Africa has more diverse economy. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("28.", "Which region of the Africa continent is dominated by tropical rainforests? ", 0, 0, 0, 0, 0, "Eastern region", "Equatorial region", "Northern region  ", "Central region ", "The central region of Africa is dominated by tropical rainforest.", "d", 0, 1, this.f570b));
        arrayList.add(new questions("29.", "Which one of the following is correct about the Easter African Rift Valley? ", 0, 0, 0, 0, 0, "It is formed during the tectonic process of the Mesozoic era. ", "It is endowed with a hospitable climate for human habitation ", "It has numerous lakes and active volcanoes ", "It is a source for most of the metallic minerals of Africa ", "The Ethiopian Rift Valley System is part of the Horn's Rift Valley System, which is part of the Great East African Rift System. The Great East African Rift System is a set of fractures in the earth's crust that extend from the Dead Sea in the north, through the Red Sea, and then across East and Central Africa to Mozambique in the south. It has numerous lakes and the active volcano. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("30.", "Which parts of Africa receive rainfall during the winter season? ", 0, 0, 0, 0, 0, "East African Highlands", "Western Africa   ", "The Mediterranean region ", "Central Africa ", "Winter is dry in all parts of Africa, except for the equatorial and Mediterranean climate regions. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("31.", "Wind is the most active and dominant agent of soil erosion in ", 0, 0, 0, 0, 0, "The East African highlands ", "The Mediterranean region ", "The Sahel region ", "Sub- humid (savannah) region ", "Wind is the most active and dominant agent of soil erosion in desert and semi-desert areas (the Sahel region) ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("32.", "A type of map with a detailed two-dimensional representation of natural and human- made features is ", 0, 0, 0, 0, 0, "Thematic map", "Topographic map", "Cadastral map ", "Choropleth map ", "Chorochromatic Maps are the maps that show the spatial distribution of geographic elements, using color tint, shading, dots or line symbols, without attaching any numerical values. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("33.", "Rain bearing winds for Autumn and Spring rainfall in Ethiopia originate from ", 0, 0, 0, 0, 0, "The red sea  ", "The Indian Ocean", "Navigation", "Fishing", "The autumn-and-spring rainfall region covers the southeastern highland and associated lowlands up to the Somalia coasts. The region's moisture-bearing winds are the Equatorial Easterlies. They pick up moisture from the Indian Ocean, and they blow over the autumn and spring rainfall region when the Northeasterlies and Equatorial Westerlies are weak. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("34.", "Ethiopian rivers are more suitable for ", 0, 0, 0, 0, 0, "Irrigation agriculture", "Hydroelectric power generation", "Navigation", "Fishing ", "Most of the rivers of Ethiopia rivers are more suitable for hydroelectric power generation. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("35.", "Soils in the semi- arid areas of Ethiopia are generally characterized by ", 0, 0, 0, 0, 0, "The dominance of economically inactive population ", "The dominance of younger age population. ", "Unbalanced sex structure ", "Short life expectancy ", "Arid and semi-arid soils are generally young and shallow, and are found in arid and semi-arid regions. They have a weakly developed profile, are found extensively in the Northeastern escarpment, Northwestern and Southeastern Lowlands of Ethiopia are characterized by high salt content and humus deficiencies.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("36.", "High age- dependency ration in Ethiopia is an indicator of ", 0, 0, 0, 0, 0, "The dominance of economically inactive population ", "The dominance of younger age population ", "Unbalanced sex structure ", "short life expectancy ", "High age dependency ratio in Ethiopia is the indicator of the dominance of economically inactive population. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("37.", "Dark color of soils is mostly associated with ", 0, 0, 0, 0, 0, "High iron content", "Excessive leaching ", "High organic matter", "Intensive cultivation", "Vertisols (black Basaltic soils) or dark color of soil is mostly associated with high organic matters. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("38.", "Which one of the following is Not correct? ", 0, 0, 0, 0, 0, "Geography is standalone discipline that deals with various phenomena ", "The main advocator of “determinism” as a school of thought was Charles Darwin ", "Demography deals with the dynamic and static aspect of population ", "A part of geosphere that represents the cultural landscape is Anthroposphere ", "Geography is not the only subject that studies with various phenomena it includes economic, history, Chemistry? Biology, Politics, Physics and other geography includes them all. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("39.", "One of the following is NOT a factor contributing for the high fertility rate in Africa ", 0, 0, 0, 0, 0, "Children are considered to be an asset.to the family. ", "Low access to and usage of contraceptive methods. ", "Equal social and economic roles of women in the household ", "Low educational status of the population ", "The persistence of high fertility in sub-Saharan Africa, while all other world regions have been able. to control population growth, represents a grave threat. Traditional explanations for this phenomenon--e.g., lower levels of income, education, health, and urbanization--are not adequate, given the fact that many Asian countries have been able to reduce fertility in the face of the same obstacle. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("40.", "Which of the following statements is true? ", 0, 0, 0, 0, 0, "Crude death rate is the total number of deaths in a year per total population. ", "Infant mortality rate is the number of deaths under ten years compared to the live births. ", "Life expectancy is the maximum number of years a person is expected to live. ", "Rate of natural increase is the difference between birth rate and infant mortality rate.", "Life expectancy at birth compares the average number of years to be lived by a group of people born in the same year, if mortality at each age remains constant. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("41.", "Which of the following factors most significantly affects population distribution in Ethiopia? ", 0, 0, 0, 0, 0, "types of economic activities ", "altitude", "soil fertility", "Forest and vegetation cover ", "Altitude is one of the most important factors that significantly affect the population distribution in Ethiopia because the high altitude areas are densely populated whereas the low altitude areas are sparsely populated.  ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("42.", "Which of the following has little impact on population growth in Ethiopia? ", 0, 0, 0, 0, 0, "Fertility rate ", "Death rate", "Infant Mortality Rate", "Migration ", "Migration has little impact on the population of Ethiopia compared to others. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("43.", "One of the following is NOT a result of rapid population growth ", 0, 0, 0, 0, 0, "environmental pollution", "land degradation ", "fallowing ", "land scarcity ", "The effect of growing population will be an increased demand for resources and space. Both of which we are running out of. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("44.", "One of the following is the leading export destination of Ethiopian goods ", 0, 0, 0, 0, 0, "Germany  ", "China ", "Japan ", "USA", "The leading export destination of Ethiopian goods is Germany by importing Ethiopian goods like coffee and other. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("45.", "Which of the following regions of Africa possesses large mining and manufacturing industries of the continent? ", 0, 0, 0, 0, 0, "Western Africa", "Northern Africa", "Southern Africa ", "Eastern Africa", "Southern Africa has possessed large mining and manufacturing industries in the continent. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("46.", "The geological process that resulted in the formation of Atlas Mountain through folding took place during. ", 0, 0, 0, 0, 0, "Cenozoic era ", "Paleozoic era   ", "Precambrian era ", "Mesozoic era ", "The geological process that resulted in the formation of Atlas Mountains through folding took place during Cenozoic era.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("47.", "Which of the following statements is NOT correct about the Great East African Rift valley? ", 0, 0, 0, 0, 0, "It has numerous active and dormant volcanoes ", "It is found along the coast and covers one- fourth of total area of Africa ", "It has hot and dry climate ", "It extends to about 5600km and crosses about 15 countries in Africa ", "The major characteristics of the East African Rift Valley are s bounded by steep escarpments (edges); has numerous active and dormant volcanoes; It is often affected by earth tremors like earthquakes, volcanism and landslides, making the Rift Valley very unstable; Has a lint and dry climate in its many parts, making the place difficult for human habitation and many structural basins (lakes) occupy the floor of the rift valley. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("48.", "Which of the following is true about the temperature of Africa? ", 0, 0, 0, 0, 0, "The sun is overhead in the north of the equator from January to February ", "The ITCZ lies parallel to the southern fringes of the Sahara from January to February.", "The prevailing wind over the sub- Saharan areas is south easterlies ", "Africa south of the equator receives its minimum temperature from January to February. ", "Most of Africa lies within the tropics. Hence, much of it lies within the trade wind belts. The southeast trades and northeast trades dominate the climate of tropical Africa.", "b", 0, 1, this.f570b));
        arrayList.add(new questions("49.", "The high amount of rainfall that results in leaching is common to one of the following soils of Africa ", 0, 0, 0, 0, 0, "Nitisols", "Fluvisols ", "Vertosols  ", "Regolsols ", "Fluvisols occur in all periodically flooded areas such as flood plains, river fans, valleys. Fluvisols show a layering of sediments with pedogenic horizon. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("50.", "______ is a vegetation type which grows in the tropical climate region when summer is wet and winter is? ", 0, 0, 0, 0, 0, "Tropical rainforest", "Savanna vegetation", "Desert and semi desert vegetation", "Afromontane forest  ", "Savannas vegetation get all their rain in the summer months. During the distinct dry season of a savanna, most of the plants shrivel up and die. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("51.", "________ is the largest lake in Africa ", 0, 0, 0, 0, 0, "Volta", "Victoria  ", "Turkana  ", "Tanganyika ", "Lake Victoria, also called-Victoria Nyanza , largest lake in Africa and chief reservoir of the Nile, lying mainly in Tanzania and Uganda but bordering on Kenya .", "b", 0, 1, this.f570b));
        arrayList.add(new questions("52.", "Which one of the following is NOT true about the Horn of Africa? ", 0, 0, 0, 0, 0, "Most of the region is found in the northern hemisphere, ", "It is found in the GMT+ 3 time zone ", "Is bounded by the red sea and the Gulf of Aden ", "the most widely spoken language in the region is Afro-Asiatic group ", "Most of the Horn of Africa region is found in the North of the equator and bounded by red sea and Gulf of Aden. Most of its populations are the speakers of the Afro- Asiatic super families. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("53.", "Geography helps us to understand all of the following EXCEPT ", 0, 0, 0, 0, 0, "how places and landscapes are formed. ", "how plants absorb nutrients ", "how people and their environment interact ", "That causes the diverse range of cultures and societies ", "Geography helps us to understand how peoples and their environment interact, how landscapes are formed and how plants absorb nutrients. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("54.", "Which course of a river is typically characterized by deep V- shaped valleys waterfalls, rapids and cataract?", 0, 0, 0, 0, 0, "the upper courses", "the middle course ", "the lower course", "the plain course", "The lower course of a river is the third. stage in a river valley's development. It is the course that is influenced by the ocean or lake where the river ends. At this stage, a river may have the following characteristics. The river flows in a U-shaped valley with a flat river bed, the rate of change in slope is minimal, and the river flows very slowly. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("55.", "On Which of the following modes of transport do different landforms or ground conditions have the lowest effect? ", 0, 0, 0, 0, 0, "Rail transport", "Air transport", "Water transport", "Road transport ", "Air transport is one of the modes of transport which different land forms or ground conditions have lowest effect. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("56.", "Which of the following regional divisions of Africa is LEAST densely populated? ", 0, 0, 0, 0, 0, "Western Africa", "Northern Africa", "Eastern Africa", "Central Africa", "Central Africa is the least densely populated regions in Africa which its Population Density is about 18 per km2. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("57.", "which of the following Countries of Africa had the lowest maritime influence on its climate? ", 0, 0, 0, 0, 0, "Morocco", "Chad", "Sudan ", "Namibia ", "Chad is one of the countries located in Central Africa which has the maritime influences on the climate. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("58.", "The Main factor that controls the distribution of rainfall in Africa is the ", 0, 0, 0, 0, 0, "north-south movement of the ITCZ ", "north-east trade -winds ", "equatorial westerlies ", "summer monsoons ", "The ITCZ moves between the tropics of Cancer and Capricorn, following the overhead sun, pulling winds towards it. Hence, it controls the distribution of rainfall in Africa. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("59.", "One of the following statements about the Tropical Continental (Savanna) climate in Africa is NOT correct ", 0, 0, 0, 0, 0, "It is found between 5° and 15° north and south latitudes ", "It does not have a well-defined by season. ", "It is located between the wettest and driest climatic zones of the continent. ", "It has hot summers and cool winters ", "Tropical Continental (Savanna) Climate region is found between 5° and 15° north and south latitudes. It occurs north and south of the tropical wet zone, in many parts of Western Africa and Southern Africa and in most of Madagascar. In this region, summer is very hot, with an average temperature of 25 degree C, and winter is cool, with an average-temperature of slightly above 15 degree C.", "b", 0, 1, this.f570b));
        arrayList.add(new questions("60.", "During which months do cities of the Republic of South Africa normally register their lowest temperatures? ", 0, 0, 0, 0, 0, "December, January and February ", "March, April and May ", "June, July and August ", "September, October and November ", "During summer in the North in the Months June, July and August in the Northern Hemisphere is hot and rainy season whereas the Southern Hemisphere the season of Dray and cold. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("61.", "Which of the following regions of Africa is the richest in biodiversity? ", 0, 0, 0, 0, 0, "Western Africa ", "Southern Africa ", "Central Africa ", "Eastern Africa ", "Central Africa is the richest in Biodiversity in Africa. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("62.", "Which of the following natural vegetation of Africa is found in an area that lacks clear divisions of seasons? ", 0, 0, 0, 0, 0, "Tropical rain forests  ", "Tropical grassland ", "Afro- alpine vegetation ", "Mediterranean vegetation ", "Afro alpine vegetation can be characterized by the occurrence of Giant Senecio species and lacked clear division of season.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("63.", "What would a population pyramid drawn for a country located in Sub-Saharan Africa most probably look like? ", 0, 0, 0, 0, 0, "Wider at its top and narrower at its base ", "Relatively Very narrow at its base but considerably bulging at its center ", "Very wide at its base and getting progressively narrower towards its top ", "Africa has the lowest rate of urban growth in the world ", "Population Pyramids: Sub-Saharan Africa - 2016 characterized by very wide at its bases and getting progressively toward the top.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("64.", "Which of the following statements about urbanization in Africa is correct? ", 0, 0, 0, 0, 0, "Northern Africa is the most urbanized region in the continent ", "Africa is more or less at the same level of urbanization as South America ", "Eastern Africa is the continent's least urbanized region ", "Africa has the lowest rate of urban growth in the world ", "The extent of urbanization shows the table below great regional variation in Africa. As it can clearly be observed from the table below, southern Africa is the most urbanized region with 56% of its population living in urban areas in 2009 followed by Northern Africa (50%). Eastern Africa is the least urbanized region having region having only 22% of its population in the urban areas.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("65.", "Which group of highlands consists of the four highest peaks of Ethiopia? ", 0, 0, 0, 0, 0, "The North Central Massifs", "The Gojam Massifs", "The Arsi- Bale Massifs ", "The South- western Highlands ", "The North-Central Massifsare the group of highlands consists of four highest mountains in Ethiopia namely Ras Dashcn, Ancua, Kidis Yared and Bwahit.", "a", 0, 1, this.f570b));
        arrayList.add(new questions("66.", "Ethiopia is the _________ richest country in Africa in terms of water resource potential ", 0, 0, 0, 0, 0, "First", "Second", "third ", "fourth ", "Ethiopia is among the few countries that have many rivers. Ethiopia has enormous potential water resources. As well as being numerous, Ethiopian rivers are energetic. ", "n", 0, 1, this.f570b));
        arrayList.add(new questions("67.", "Which of the following statements about over cropping is correct? ", 0, 0, 0, 0, 0, "It is the same as over cultivation ", "It is the act of planting an area too densely ", "It is the practice of growing two or more crops on the same plot of land ", "It is the practice of tilling the same land year after year. ", "Cropping is the pattern of crops for a given piece of land or cropping pattern means the proportion of area under various crops at a point of time in a unit area or it indicated the yearly sequence and spatial arrangements of crops and follows in an area. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("68.", "Which one of the following soil conservation measures is different from others? ", 0, 0, 0, 0, 0, "Crop rotation ", "Fallowing", "Terracing ", "Strip cultivation ", "Fallowing is left the agricultural land unseeded after being ploughed and harrowed to regain fertility for a crop. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("69.", "One of the following is NOT true about the relative location of Ethiopia ", 0, 0, 0, 0, 0, "Southwest of the Red Sea ", "Northeast of the Indian Ocean ", "Southwest of the Asian Continent ", "South of the Mediterranean Sea ", "RELATIVE LOCATION: Ethiopia is located in eastern Africa, and is in both the eastern and northern hemispheres. Ethiopia is bordered by the countries of Djibouti, Eritrea, Kenya, Somalia, South Sudan, and Sudan. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("70.", "Identify the wrong pairing ", 0, 0, 0, 0, 0, "Mount Meru- Tanzania ", "Mount Ruwenzori- Uganda ", "Mount Elgon- Malawi ", "Mount Kilimanjaro- Tanzania ", "The wrong pairing are Mount Kilimanjaro, Tanzania, mount Egon in Uganda, Mount Meru in Tanzania, and mount Ruwenzori in Uganda. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("71.", "One of the following instruments is used to measure altitude. ", 0, 0, 0, 0, 0, "Clinometer ", "Altimeter ", "Stereoscope ", "Barometer ", "An -altimeter or an altitude meter is an instrument used to measure the altitude of an object above a fixed level. The measurement of altitude is called altimetry. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("72.", "Uneven spatial distribution of population in. Ethiopia has resulted due mainly to ", 0, 0, 0, 0, 0, "uneven distribution of infrastructure ", "biophysical factors ", "political forces ", "historical patterns of migration ", "The uneven spatial distributions of the population of Ethiopia is the bio-physical factors such as the altitudes. The best way to understand the population distribution patterns in Ethiopia is to… highlands of Ethiopia the distribution patern is uneven (see table below). …intervals according to the population density ranking of the spatial subunit.", "b", 0, 1, this.f570b));
        arrayList.add(new questions("73.", "Which one of the following is correct about vertical exaggeration on maps? ", 0, 0, 0, 0, 0, "It reduces the visual effectiveness of a relief ", "It is determined by considering the scale of the map and the nature of the terrain ", "It does not cause any distortion on maps ", "It is needed where the relief elevation is high ", "The vertical exaggeration simply means that your vertical scale is larger than your horizontal scale (in the example you could use one inch is equal to 1000ft. for your horizontal scale, while keeping the horizontal scale the same). Vertical exaggeration is often used if you want to discern subtle topographic features or if the profile covers a large horizontal distance(miles) relative to the relief (feet). To determine the amount of vertical exaggeration used to construct a profile, simply divide the real-world units on the horizontal axis by the real-world units on the vertical scale is one 1\"--1000' and the horizontal scale is 1\"----2000', the vertical exaggeration is 2x (2000’/1000’).", "b", 0, 1, this.f570b));
        arrayList.add(new questions("74.", "One of the following countries is NOT within the Sahel region of Africa ", 0, 0, 0, 0, 0, "Zambia", "Niger ", "Mali ", "Sudan", "The semiarid region of western and north-central Africa extending from Senegal eastward to The Sudan. It forms a transitional zone between the arid Sahara (desert) to the north and the belt of humid savannas to the south. The Sahel stretches from the Atlantic Ocean eastward through northern Senegal, southern Mauritania, the great bend of the Niger River in Mali, Burkina Faso (formerly Upper Volta), southern Niger, northeastern Nigeria, south-central Chad, and into The Sudan. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("75.", "One of the following lakes of Africa is an artificial lake", 0, 0, 0, 0, 0, "Lake Chad", "Lake Kivu", "Lake Tam", "Lake Nasser", "Lake Nasser is a vast reservoir in southern Egypt and northern Sudan. It is one of the largest artificial lakes in Africa. Current Status of Fisheries and Fish Stocks of the Four Largest African Reservoirs: Kainji, Kariba, Nasser/Nubia and Volta. Food & Agriculture Org. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("76.", "A soil type which is widely found in the wet highlands of Ethiopia is ", 0, 0, 0, 0, 0, "Fluvisols", "Vertosols ", "Regosols", "Nithosols ", "Nithosols (red basaltic soils): These soil cover about 12 percent of the country. It basically associated with high rainfall and are found in areas that were previously covered with forestare predominant in the Western Highlands of Wellega, Keffa, Illubabor, the Southern Highlands of Sidama, the Central and Western Highlands of Shoa, the Highlands of Gojjam and the Eastern Highlands of Hararghe. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("77.", "In Ethiopia, fertility rate is higher in rural areas than in urban areas mainly because of", 0, 0, 0, 0, 0, "More females in urban areas ", "Better social services in urban areas", "High mortality rate in rural areas. ", "More labor demand in rural areas ", "Fertility rate is higher in rural areas than urban in Ethiopia because the urban areas have better social services than the rural areas. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("78.", "________ is a term used to describe the minimum income level used for determining the proportion of a population living under poverty. ", 0, 0, 0, 0, 0, "GDP", "Poverty line ", "Poverty trap line ", "GNP", "The poverty threshold, poverty limit or poverty line is the minimum level of income deemed adequate in a particular country.", "b", 0, 1, this.f570b));
        arrayList.add(new questions("79.", "Age dependency ration in Africa is above seventy five percent. This implies that ", 0, 0, 0, 0, 0, "for every 100 productive population, there are greater than 75 people who need support ", "about three fourth of the population of Africa is active segment of the population ", "a quarter of the population of Africa is dependent", "there is a balance of productive and dependent section of the population ", "The age of dependency in Africa is above 75% this implies that for every 100 productive population there is greater than 75 peoples, who needs support.", "a", 0, 1, this.f570b));
        arrayList.add(new questions("80.", "One of the following is true about the age structure of Ethiopian population when shown using, a pyramid…….", 0, 0, 0, 0, 0, "abroad base of the pyramid shows high infant mortality rate ", "the narrow shape of the pyramid towards the top shows high death rate ", "the young population is represented at the top of the pyramid ", "male and female ration is represented in the middle of the pyramid ", "No correct answer because the broad bases of the \"Ethiopia pyramids represent a large number of children in relation to the working age population. \"Ethiopia 2010\" shows a base that is beginning to narrow at the youngest ages, representing a fertility decline.", "n", 0, 1, this.f570b));
        arrayList.add(new questions("81.", "The present surface configuration of Africa was formed during_______era.", 0, 0, 0, 0, 0, "Precambrian", "Paleozoic", "Cenozoic ", "Mesozoic   ", "The present surface configuration of Africa formed during Cenozoic Era. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("82.", "…………… is a period characterized by warm climate, and subsequent high evaporation that resulted in the formation of a vast salt plain ", 0, 0, 0, 0, 0, "Quaternary ", "Tertiary", "Cretaceous   ", "Jurassic ", "In the Cretaceous Period, the landmass began to rise and the sea started to regress towards the southeast, depositing sedimentary rock. The climate Was generally warmer and more humid than today probably because of very active volcanism associated with unusually high rates of seafloor spreading. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("83.", "Why does Africa experience a high temperature throughout the year? ", 0, 0, 0, 0, 0, "High range of altitudes that is about 5412 meters ", "Every place in Africa gets the overhead sun twice a year ", "Large areas of Africa have low altitude ", "Most places experience large variation in the angle of the sun ", "Africa experienced high temperature because it lies within the tropical latitudes. Hence, the continent receives high sun angles throughout the year Due to its latitudes, Africa is the hottest of all the continents.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("84.", "Which one of the following is NOT true about the climate of Africa? ", 0, 0, 0, 0, 0, "High mean monthly and annual temperature", "Low daily range of temperature", "Convectional type of rainfall dominates the equatorial climate ", "Tropical continental climate occurs in many parts of water and southern Africa", "Latitudes indicate the distance rpm the equator. A place's latitudinal location affects the amount of incoming solar radiation the place receives, and thereby its temperature. As discussed earlier, much of Africa (nearly 2/3rd) lies within the tropical latitude. Hence, the continent receives high sun angles throughout the year. Due to its latitudes, Africa is the hottest of all the continents. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("85.", "Acrisols are NOT suitable for crops in Africa because of _______", 0, 0, 0, 0, 0, "salinization", "acidity", "desertification ", "erosion  ", "Acrisols are not suitable for crops in Africa because of these are soils that develop in hilly areas with wet tropical and monsoon climates. These soils are weathered, acidic and shallow. As a result, they are unproductive. This soil type is found in Western Africa and the Lake Region of East Africa. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("86.", "Why is the African continent poor in natural harbors? ", 0, 0, 0, 0, 0, "The continent has a fairly unbroken coastline ", "Most countries of the continent arc not very far from the sea ", "Its land mass is largely made up of plateaus ", "Many of its rivers are not navigable in their upper and middle courses. ", "Africa continent is poor in natural Harbor because the unbroken coastline of Africa makes the continent poor in natural harbors. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("87.", "What was the main geological development in the Horn of Africa during the Jurassic period? ", 0, 0, 0, 0, 0, "The transgression of the sea from the south cast to the north west ", "The land remained under the sea ", "The regression of the sea from the northwest to the south cast. ", "The rising or the uplifting of the land", "During the Triassic period, there was sinking of the land in the eastern part of the continent and the land remained under the sea during the Jurassic period. Rising (uplifting) of the land began in the Cretaceous. ", "b", 0, 1, this.f570b));
        arrayList.add(new questions("88.", "What is the main reason behind River Nile's loss of nearly 64% of its total runoff as it flows towards the Mediterranean Sea? ", 0, 0, 0, 0, 0, "Extensive use of its waters for irrigation ", "Increased use of its waters for HEP generation ", "Prolonged exposure to evaporation and seepage ", "Growing industrial use of its waters ", "The Nile flows generally northwards through the Sudan and Egypt and empties into the Mediterranean forming an extensive delta in north Egypt, Nile lost nearly 64% of its total runoff at it flow toward Mediterranean Sea prolonged exposure to evaporation and seepages. ", "c", 0, 1, this.f570b));
        arrayList.add(new questions("89.", "Which of the following statements about the population of Africa is NOT correct? ", 0, 0, 0, 0, 0, "Africa is the second most populous continent in the world next to Asia ", "Presently more than a billion people live in Africa ", "Africa has the highest rate of population growth in the world ", "Africa has the longest population doubling time in the world ", "In Africa, the current population change (growth) is a function of fertility, mortality and migration_ Africa has the shortest population doubling in the world.", "d", 0, 1, this.f570b));
        arrayList.add(new questions("90.", "Which of the following is NOT normally associated with high per capita income? ", 0, 0, 0, 0, 0, "Low fertility and mortality rates ", "High division of labor ", "Low capital accumulation or creation of wealth ", "High GDP ", "The higher per- capital income associate with low fertility and mortality rate; higher division of labor and higher GDP.", "c", 0, 1, this.f570b));
        arrayList.add(new questions("91.", "Which of the following factors is NOT among the leading causes of the Poor development of inter- regional trade in Africa? ", 0, 0, 0, 0, 0, "The landlocked status of many African countries ", "Shortage of foreign currency ", "Conflicts and civil wars ", "Poor transport and communication networks ", "The leading cause of the poor development of inter —regional trade in Africa is poor transportation and communication, conflicts and wars.", "a", 0, 1, this.f570b));
        arrayList.add(new questions("92.", "In which of the following parts of Ethiopia can we find extensive outcrops the old crystalline basement complex? ", 0, 0, 0, 0, 0, "In central and northern Tigray", "In the Denakil plains ", "in the middle Awash Valley ", "in the lake Tana basin ", "The central and north Tigray are parts of Ethiopia we can find extensive outcrops of the old crystalline basement complex. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("93.", "What are the critical factors that determine the spatial distribution of temperature in Ethiopia?", 0, 0, 0, 0, 0, "Altitude and cloud cover ", "Latitude and distance from the seas ", "Weather systems and Ocean currents ", "Mountain barriers and winds ", "The two factors that most affect the spatial variation of temperature Ethiopia are cloud cover and altitude. ", "a", 0, 1, this.f570b));
        arrayList.add(new questions("94.", "Ethiopia had rural and urban sex rations of 102.5 and 98.8 respectively in 2007. What do these ratios tell us about the sex structure of the population? ", 0, 0, 0, 0, 0, "There are slightly fewer males than females in both areas ", "Ethiopia's urban and rural sex ratios arc almost identical ", "there are slightly fewer males than females' in rural Ethiopia ", "There are slightly fewer males than females in urban Ethiopia ", "Ethiopia had rural and urban sex ratios of 102.5 and 98.8 respectively in 2007. These means there are slightly fewer males than females in urban Ethiopia. ", "d", 0, 1, this.f570b));
        arrayList.add(new questions("95.", "Swayne's Hartebeest (Korkay), which is one of the endemic mammals of Ethiopia, is confined to…………...", 0, 0, 0, 0, 0, "The Gambella and Mago lowlands ", "The Nechsar park and the Sankalle Sanctuary ", "The Afar and Southeast Lowlands ", "The Simen and Bale Mountains ", "Swaye’s and Harebeest(Korkey), which is one of the endemic mammals of Ethiopia are confined to the Nechsar park and Sankalle sanctuary.", "b", 0, 1, this.f570b));
        recviewquestion recviewquestion = new recviewquestion();
        recviewquestion.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestion);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new questions("96.", "Which of the following slopes is the best example of an even slope?", 0, 0, 0, 0, 0, "EI", "BA", "BE", "GH", "The slop between G and H are she even slopes on the Map. ", "d", 0, 2, this.f570b));
        arrayList2.add(new questions("97.", "Point 'D' is most likely located _______", 0, 0, 0, 0, 0, "on a peak of a mountain", "in a crater", "on a saddle", "on a gap", "Point D is most likely located in a Crater.", "b", 0, 2, this.f570b));
        arrayList2.add(new questions("98.", "What type of drainage system si shown in the map?", 0, 0, 0, 0, 0, "Trellis drainage pattern", "Dendritic drainage pattern", "Rectangular drainage pattern", "Radial drainage pattern", "Dendritic Drainage Pattern is drainage pattern is characterized by a tree-like shape with branches. The smallest tributaries are the outermost twigs, and the main river channel forms the trunk. The lower order streams (tributaries) join the main (higher-order) streams at acute angles (less than 90o angles), forming ", "b", 0, 2, this.f570b));
        arrayList2.add(new questions("99.", "The crow flight distance between point K and F is approximately ________", 0, 0, 0, 0, 0, "20 Kilometers", "7 Kilometers", "30 Kilometers", "3 Kilometers", "The crow flight distance between point K and F is approximately 3kilometers because the scale of the map is 1:100000 distance between point K and F is 3cm so the crow flight distance between point K and F is 3kms. ", "d", 0, 2, this.f570b));
        arrayList2.add(new questions("100.", "The landform shown on this map is most likely a product of __________", 0, 0, 0, 0, 0, "Folding ", "Volcanism", "Faulting", "Sedimentation", "The landform shown on the map is most likely product of Folding because of the bending of rock layers subjected to tectonic stresses.", "a", 0, 2, this.f570b));
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
        this.f571tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    geography2009.this.timer.setVisibility(0);
                    geography2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    geography2009.this.scr.setVisibility(8);
                    geography2009.this.chr.stop();
                    geography2009.this.toolbar.setVisibility(8);
                    geography2009.this.Relative.setBackgroundColor(-7829368);
                    geography2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2009.this.getBaseContext());
                    int unused = geography2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = geography2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = geography2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = geography2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = geography2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = geography2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = geography2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = geography2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = geography2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = geography2009.this.highscoreGeography2009 = defaultSharedPreferences.getInt("geo2009hs", 0);
                    int access$600 = geography2009.this.part1 + geography2009.this.part2 + geography2009.this.part3 + geography2009.this.part4 + geography2009.this.part5 + geography2009.this.part6 + geography2009.this.part7 + geography2009.this.part8 + geography2009.this.part9;
                    geography2009.this.resultText.setText(String.valueOf(access$600));
                    geography2009.this.progressbar.setProgress(access$600);
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
                    int unused11 = geography2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = geography2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = geography2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = geography2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = geography2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = geography2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = geography2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = geography2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = geography2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int i = access$600;
                    int unused20 = geography2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = geography2009.this.answered1 + geography2009.this.answered2 + geography2009.this.answered3 + geography2009.this.answered4 + geography2009.this.answered5 + geography2009.this.answered6 + geography2009.this.answered7 + geography2009.this.answered8 + geography2009.this.answered9 + geography2009.this.answered10;
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
                    int i2 = i;
                    if (i2 > geography2009.this.highscoreGeography2009) {
                        edit.putInt("geo2006hs", i2);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i3 = (i2 * 100) / 100;
                    float sqrt = (float) Math.sqrt((double) (((access$1800 * access$1800) * i3) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - geography2009.this.chr.getBase()) / 1000)) * 3600) / 7200))));
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) sqrt)).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i3)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1geo091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1geo092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1geo093", 0);
                    Long l = valueOf;
                    String str = f;
                    long j4 = defaultSharedPreferences.getLong("date1geo094", 0);
                    String str2 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1geo095", 0);
                    Long l2 = l;
                    SharedPreferences.Editor editor3 = edit;
                    long j6 = defaultSharedPreferences.getLong("date1geo096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1geo097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1geo098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1geo099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1geo0910", 0);
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
                        editor.putString("scoregeo091", str2);
                        editor.putLong("date1geo091", l2.longValue());
                    } else {
                        String str3 = str2;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoregeo092", str3);
                            editor.putLong("date1geo092", l2.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoregeo093", str3);
                            editor.putLong("date1geo093", l2.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoregeo094", str3);
                            editor.putLong("date1geo094", l2.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoregeo095", str3);
                            editor.putLong("date1geo095", l2.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoregeo096", str3);
                            editor.putLong("date1geo096", l2.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoregeo097", str3);
                            editor.putLong("date1geo097", l2.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoregeo098", str3);
                            editor.putLong("date1geo098", l2.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoregeo099", str3);
                            editor.putLong("date1geo099", l2.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoregeo0910", str3);
                            editor.putLong("date1geo0910", l2.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dategeo091", 0);
                    long j12 = defaultSharedPreferences.getLong("dategeo092", 0);
                    long j13 = defaultSharedPreferences.getLong("dategeo093", 0);
                    long j14 = defaultSharedPreferences.getLong("dategeo094", 0);
                    long j15 = defaultSharedPreferences.getLong("dategeo095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dategeo096", 0);
                    long j17 = defaultSharedPreferences.getLong("dategeo097", 0);
                    long j18 = defaultSharedPreferences.getLong("dategeo098", 0);
                    long j19 = defaultSharedPreferences.getLong("dategeo099", 0);
                    long j20 = defaultSharedPreferences.getLong("dategeo0910", 0);
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
                        editor2.putString("iScoregeo091", str);
                        editor2.putLong("dategeo091", l2.longValue());
                    } else {
                        String str4 = str;
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoregeo092", str4);
                            editor2.putLong("dategeo092", l2.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoregeo093", str4);
                            editor2.putLong("dategeo093", l2.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoregeo094", str4);
                            editor2.putLong("dategeo094", l2.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoregeo095", str4);
                            editor2.putLong("dategeo095", l2.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoregeo096", str4);
                            editor2.putLong("dategeo096", l2.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoregeo097", str4);
                            editor2.putLong("dategeo097", l2.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoregeo098", str4);
                            editor2.putLong("dategeo098", l2.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoregeo099", str4);
                            editor2.putLong("dategeo099", l2.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoregeo0910", str4);
                            editor2.putLong("dategeo0910", l2.longValue());
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
                        geography2009.this.scr.setVisibility(8);
                        geography2009.this.chr.stop();
                        geography2009.this.toolbar.setVisibility(8);
                        geography2009.this.Relative.setBackgroundColor(-7829368);
                        geography2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(geography2009.this.getBaseContext());
                        int unused = geography2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = geography2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = geography2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = geography2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = geography2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = geography2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = geography2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = geography2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = geography2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = geography2009.this.highscoreGeography2009 = defaultSharedPreferences.getInt("geo2009hs", 0);
                        int access$600 = geography2009.this.part1 + geography2009.this.part2 + geography2009.this.part3 + geography2009.this.part4 + geography2009.this.part5 + geography2009.this.part6 + geography2009.this.part7 + geography2009.this.part8 + geography2009.this.part9;
                        TextView access$1600 = geography2009.this.resultText;
                        access$1600.setText(access$600 + "/100");
                        geography2009.this.progressbar.setProgress(access$600);
                        geography2009.this.progressbar.setMax(100);
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
                        int unused11 = geography2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = geography2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = geography2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = geography2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = geography2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = geography2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = geography2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = geography2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = geography2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = geography2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = geography2009.this.answered1 + geography2009.this.answered2 + geography2009.this.answered3 + geography2009.this.answered4 + geography2009.this.answered5 + geography2009.this.answered6 + geography2009.this.answered7 + geography2009.this.answered8 + geography2009.this.answered9 + geography2009.this.answered10;
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
                        if (access$600 > geography2009.this.highscoreGeography2009) {
                            edit.putInt("geo2006hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - geography2009.this.chr.getBase()) / 1000;
                        String str = "dategeo099";
                        String str2 = "dategeo098";
                        String str3 = "dategeo097";
                        String str4 = "dategeo096";
                        String str5 = "dategeo095";
                        String str6 = "dategeo094";
                        String str7 = "dategeo093";
                        String str8 = "dategeo092";
                        String str9 = "dategeo091";
                        SharedPreferences.Editor editor5 = edit;
                        String str10 = "date1geo0910";
                        String str11 = "date1geo099";
                        if (geography2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 100;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1geo091", 0);
                            Long l = valueOf;
                            String str12 = f2;
                            long j2 = defaultSharedPreferences.getLong("date1geo092", 0);
                            long j3 = defaultSharedPreferences.getLong("date1geo093", 0);
                            String str13 = "date1geo093";
                            String str14 = f;
                            String str15 = "date1geo091";
                            long j4 = defaultSharedPreferences.getLong("date1geo095", 0);
                            String str16 = "date1geo095";
                            String str17 = "date1geo094";
                            String str18 = "date1geo096";
                            long j5 = defaultSharedPreferences.getLong("date1geo096", 0);
                            long j6 = defaultSharedPreferences.getLong("date1geo097", 0);
                            String str19 = str11;
                            String str20 = "date1geo098";
                            long j7 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str10;
                            String str22 = str19;
                            long j8 = defaultSharedPreferences.getLong(str21, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            String str23 = "date1geo092";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date4 = new Date(defaultSharedPreferences.getLong("date1geo094", 0));
                            Date date5 = new Date(j4);
                            Date date6 = new Date(j5);
                            Date date7 = new Date(j6);
                            String str24 = "date1geo097";
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1geo098", 0));
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
                                editor3.putString("scoregeo091", str12);
                                editor3.putLong(str15, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str12;
                                if (date11.compareTo(date2) == 0) {
                                    editor3.putString("scoregeo092", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date11.compareTo(date3) == 0) {
                                    editor3.putString("scoregeo093", str25);
                                    editor3.putLong(str13, l.longValue());
                                } else if (date11.compareTo(date4) == 0) {
                                    editor3.putString("scoregeo094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date11.compareTo(date5) == 0) {
                                    editor3.putString("scoregeo095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date11.compareTo(date6) == 0) {
                                    editor3.putString("scoregeo096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date11.compareTo(date7) == 0) {
                                    editor3.putString("scoregeo097", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date11.compareTo(date8) == 0) {
                                    editor3.putString("scoregeo098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date11.compareTo(date9) == 0) {
                                    editor3.putString("scoregeo099", str25);
                                    editor3.putLong(str22, l.longValue());
                                } else if (date11.compareTo(date10) == 0) {
                                    editor3.putString("scoregeo0910", str25);
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
                            long j18 = sharedPreferences.getLong("dategeo0910", 0);
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
                                editor4.putString("iScoregeo091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date22.compareTo(date13) == 0) {
                                    editor4.putString("iScoregeo092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date22.compareTo(date14) == 0) {
                                    editor4.putString("iScoregeo093", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date22.compareTo(date15) == 0) {
                                    editor4.putString("iScoregeo094", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date22.compareTo(date16) == 0) {
                                    editor4.putString("iScoregeo095", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date22.compareTo(date17) == 0) {
                                    editor4.putString("iScoregeo096", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date22.compareTo(date18) == 0) {
                                    editor4.putString("iScoregeo097", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date22.compareTo(date19) == 0) {
                                    editor4.putString("iScoregeo098", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date22.compareTo(date20) == 0) {
                                    editor4.putString("iScoregeo099", str28);
                                    editor4.putLong(str, l.longValue());
                                } else if (date22.compareTo(date21) == 0) {
                                    editor4.putString("iScoregeo0910", str28);
                                    editor4.putLong("dategeo0910", l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1geo091";
                            String str30 = "date1geo094";
                            String str31 = str11;
                            String str32 = "date1geo092";
                            String str33 = "date1geo097";
                            String str34 = "date1geo095";
                            String str35 = "date1geo096";
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
                            long j21 = sharedPreferences2.getLong("date1geo093", 0);
                            String str40 = str32;
                            String str41 = "date1geo093";
                            long j22 = sharedPreferences2.getLong(str30, 0);
                            Long l2 = valueOf2;
                            String str42 = str30;
                            long j23 = sharedPreferences2.getLong(str34, 0);
                            long j24 = sharedPreferences2.getLong(str35, 0);
                            String str43 = str35;
                            String str44 = str37;
                            String str45 = str33;
                            long j25 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1geo098";
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
                                editor2.putString("scoregeo091", str39);
                                editor2.putLong(str38, l2.longValue());
                            } else {
                                String str49 = str39;
                                editor2 = editor5;
                                if (date33.compareTo(date24) == 0) {
                                    editor2.putString("scoregeo092", str49);
                                    editor2.putLong(str40, l2.longValue());
                                } else if (date33.compareTo(date25) == 0) {
                                    editor2.putString("scoregeo093", str49);
                                    editor2.putLong(str41, l2.longValue());
                                } else if (date33.compareTo(date26) == 0) {
                                    editor2.putString("scoregeo094", str49);
                                    editor2.putLong(str42, l2.longValue());
                                } else if (date33.compareTo(date27) == 0) {
                                    editor2.putString("scoregeo095", str49);
                                    editor2.putLong(str34, l2.longValue());
                                } else if (date33.compareTo(date28) == 0) {
                                    editor2.putString("scoregeo096", str49);
                                    editor2.putLong(str43, l2.longValue());
                                } else if (date33.compareTo(date29) == 0) {
                                    editor2.putString("scoregeo097", str49);
                                    editor2.putLong(str45, l2.longValue());
                                } else if (date33.compareTo(date30) == 0) {
                                    editor2.putString("scoregeo098", str49);
                                    editor2.putLong(str48, l2.longValue());
                                } else if (date33.compareTo(date31) == 0) {
                                    editor2.putString("scoregeo099", str49);
                                    editor2.putLong(str47, l2.longValue());
                                } else if (date33.compareTo(date32) == 0) {
                                    editor2.putString("scoregeo0910", str49);
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
                            long j38 = sharedPreferences3.getLong("dategeo0910", 0);
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
                                editor.putString("iScoregeo091", str44);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str44;
                                if (date45.compareTo(date35) == 0) {
                                    editor.putString("iScoregeo092", str56);
                                    editor.putLong(str51, l2.longValue());
                                } else if (date45.compareTo(date36) == 0) {
                                    editor.putString("iScoregeo093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date45.compareTo(date37) == 0) {
                                    editor.putString("iScoregeo094", str56);
                                    editor.putLong(str6, l2.longValue());
                                } else if (date45.compareTo(date38) == 0) {
                                    editor.putString("iScoregeo095", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date45.compareTo(date41) == 0) {
                                    editor.putString("iScoregeo096", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date45.compareTo(date40) == 0) {
                                    editor.putString("iScoregeo097", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date45.compareTo(date42) == 0) {
                                    editor.putString("iScoregeo098", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date45.compareTo(date43) == 0) {
                                    editor.putString("iScoregeo099", str56);
                                    editor.putLong(str54, l2.longValue());
                                } else if (date45.compareTo(date44) == 0) {
                                    editor.putString("iScoregeo0910", str56);
                                    editor.putLong("dategeo0910", l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        geography2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2009.this.scr.setVisibility(8);
                geography2009.this.chr.stop();
                geography2009.this.toolbar.setVisibility(8);
                geography2009.this.Relative.setBackgroundColor(geography2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                geography2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                geography2009.this.scr.setVisibility(0);
                geography2009.this.toolbar.setVisibility(0);
                geography2009.this.telegram_layout.setVisibility(8);
                geography2009.this.chr.start();
                geography2009.this.Relative.setBackgroundColor(geography2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = geography2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = geography2009.this.mInterstitialAd = null;
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
                geography2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
