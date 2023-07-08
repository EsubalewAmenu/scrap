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

public class economics2010 extends AppCompatActivity {
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
    private Boolean f545b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEconomics2010;
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
    private Toolbar f546tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_economics2010);
        this.f545b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEconomics2010);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_economics2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one of the following is the main expenditure item of the Ethiopian government? ", 0, 0, 0, 0, 0, "Transportation", "Primary and secondary education", "Sporting and recreation schooling", "Evening schooling", "According to the report of Ministry of Finance & economic development (MOFED) the following sectors were found to absorb more than 90% of the total expenditure.\n\tGeneral administration. \n\tPrimary and secondary education.\n\tPublic health. \n\tAgriculture and natural resources.\n\tClean water supply and rural road constructions and maintenance therefore from the given alternative the main expenditure item of Ethiopian government is primary and secondary education.\n", "b", 0, 1, this.f545b));
        arrayList.add(new questions("2.", "When does a change in demand for a given commodity take place?", 0, 0, 0, 0, 0, "When the price of the commodity changes.", "When the supply curve of the commodity shifts. ", "When the quantity demanded of the commodity changes following a change in price.", "When the demand curve for a commodity shift. ", "Demand for a given commodity takes place when the demand curve shifts either upward or inward. ", "b", 0, 1, this.f545b));
        arrayList.add(new questions("3.", "Which one of the following features best describes the basis for international trade? ", 0, 0, 0, 0, 0, "Uneven distribution of resources and technology.", "Uneven distribution of soil and climate. ", "Variations in the distribution of male and female population.", "Variations in the distribution of youth and adult population. ", "The feature that best describes the basis for international trade is unequal distribution of resources and technology of the difference in resource endowment of countries.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("4.", "Which one of the following statements is true about supply or demand curve?", 0, 0, 0, 0, 0, "Own price shifts the supply curve. ", "Own price shifts the demand curve.", "Income is a shift factor of the supply curve.", "Income is a shift factor of demand curve.", "shift factors of demand curve are factors other than the price of the food, thin factors are income, and taste, price of related goods etc are factors for shift in the demand curve or change in demand.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("5.", "Which of the following is a failure of the environmental policy of the Ethiopian government?", 0, 0, 0, 0, 0, "Strengthening exploitation of natural resources to stimulate the economy irrespective of the impacts on the environment.", "Strengthening measures taken for the preservation of biodiversity. ", "Strengthening efforts to address the critical problems of land degradation.", "Strengthening regulatory and institutional capacity in regards to environmental protection. ", "Strengthening regulatory and intuitional capacity in regard to environmental protection is a failure of the environmental policy of the Ethiopian government.", "d", 0, 1, this.f545b));
        arrayList.add(new questions("6.", "What is the reason of real GDP to be a better measure of national income account than the nominal GDP?", 0, 0, 0, 0, 0, "Real GDP is adjusted to the rate of inflation. ", "Real GDP takes into account the total labor force.", "Real GDP takes into account the total population. ", "Real GDP is adjusted to the rate of unemployment.", "GDP (Gross Domestic Product) can be measured in two ways \n\tAt current move it price and\n\tAt constant price\nWhen final goods and services included in GDP are valued at current market price. i.e price prevailing in the year for which GDP is being measured than it is called Nominal GDP, On the other hand, when goods and service included in the GDP are valued at fixed or constant price (adjusted to the rate of inflation) that is price of the one year I scald Real GDP.\n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("7.", "When the receipts of the government are more than its expenditures, the budget of the government is said to have ", 0, 0, 0, 0, 0, "balanced", "defective", "surplus ", "increasing", "When the receipts of the government are more than its expenditure, the budget of the government is said to have surplus and when receipts are less than its expenditure the budget of the government is said to have deficit.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("8.", "Which one of the following statements is true in capitalist economic systems?", 0, 0, 0, 0, 0, "Basic economic problems are solved by the government.", "There is a narrow economic gap between the rich and the poor. ", "Entrepreneurs, in their productive activities, are guided by social welfare motives.", "Basic economic problems are solved by price mechanisms. ", "The main features of capitalist economy \n\tThe right to private property.\n\tFreedom of enterprise.\n\tFreedom of choice by consumers.\n\tprofit motive\n\tCompetition\n\tPrice mechanism all basic economic problems are solved through the price mechanism.\n\tMinor role of the government\n\tInequality of income and\n\tExistence of negative externalities\n", "d", 0, 1, this.f545b));
        arrayList.add(new questions("9.", "Which one of the following manufacturing sub-sectors has contributed to the largest share in terms of employment in Ethiopia?", 0, 0, 0, 0, 0, "The food and beverage group ", "Wood and furniture", "Heavy metallic industry", "Textile", "The food and beverage group of the manufacturing sub-sector has contributed to the largest share in terms of employment in Ethiopia. ", "a", 0, 1, this.f545b));
        arrayList.add(new questions("10.", "Which one of the following best describes contractionary fiscal policy? ", 0, 0, 0, 0, 0, "reduce of income tax.", "increase of reserve requirement.", "increasing of income tax. ", "reduction of reserve requirement.", "The following are contra dictionary fiscal measure Reducing expenditure, increasing tax and increasing government borrowing. ", "c", 0, 1, this.f545b));
        arrayList.add(new questions("11.", "Which one of the following is a correct relationship between Marginal Product (MP) and Average Product (AP)?", 0, 0, 0, 0, 0, "AP rises when MP is less than AP. ", "AP rises when MP is equal to AP.", "AP rises when MP is greater than AP.", "AP falls when MP is equal to AP.", "", "c", C2719R.C2721drawable.econ2010q11exp, 1, this.f545b));
        arrayList.add(new questions("12.", "Which of the following Best expresses the opportunity cost of wheat in terms one more of cloth?", 0, 0, 0, 0, 0, "The number of units of cloth that must be given up to produce unit of wheat.", "The amount of wheat that must be exchanged for cloth. ", "The amount of cloth that must be exchanged for wheat.", "The number of units of wheat that must be given up to produce one more unit of cloth.", "The opportunity cost of a commodity is the amount of another commodity that must be forgone in order to produce the first \nOpportunity cost of wheat =  (the amounts of cloth given up)/(the amount of wheat produced)  \n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("13.", "Suppose an individual consumer consumes two commodities, commodity X and commodity Y. In case income of the individual consumer increases, while prices of X and Y remain the same, what will happen to the budget line? The budge line will shift", 0, 0, 0, 0, 0, "parallel to X-axis", "parallel to Y-axis", "outwards (expand) parallel to itself. ", "inwards (shrink) parallel to itself.", "Suppose an individual consumer consume two commodities is X and Y in case income of individual consumer increases while price of X and Y remains the same the budget line will shift outward parallel to itself.\nA shift on budget line when income increase while the price of X and Y remain the same.\n", "c", 0, 1, this.f545b));
        arrayList.add(new questions("14.", "What does market supply refer to? ", 0, 0, 0, 0, 0, "The total revenue generated from the sale of a commodity by a firm.", "The total quantity offered for sale by all firms at a given price during a given period of time ", "The total revenue generated from the sale of all commodities by all", "The quantity of a commodity offered for sale by a firm at a given price during a given period of time.", "Market supply refers to the total quantity offered for sale by all firms at good x a given price during a given period of time (the sum of individual supply)", "b", 0, 1, this.f545b));
        arrayList.add(new questions("15.", "Which one of the following statements best describes the policies introduced in the agricultural sector of Ethiopia since 1960s? There was", 0, 0, 0, 0, 0, "expansion of public investment in state farms in 1990s. ", "dissolution of compulsory food-grain quotas in 1990s.", "dissolution of large-scale mechanized farming during pre-1974 period.", "encouragement of producers and serve cooperatives in 1990s. ", "There were two policy paths for the development of Agriculture sector in the late 1960s. They were large scale mechanized commercial farms and the establishment of package projects to assist the sector in diffusing agricultural innovation.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("16.", "Which one of the following is the dominant farming system in the Ethiopian agricultural sector?", 0, 0, 0, 0, 0, "The smallholder farming system.", "The pastoral farming system.", "The commercial farming system.", "The commercial and smallholder arming systems. ", "Currently, the following farming systems are widely practiced in Ethiopia.\n\tThe small holder farming system. \n\tThe pastoral/nomadic system and\n\tThe modern commercial farming system. \nThe small holder farming system is the most important or dominant system. It accounts for more than 90% of the agricultural production and for about 95% of the total area under crop production.\n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("17.", "Which one of the following least describes the nature of saving?", 0, 0, 0, 0, 0, "Saving is a positive function of income.", "Average propensity to save is the ratio of saving to income.", "Saving is a negative function of income.", "Marginal propensity to save is the ratio of change in saving to change in income.", "Saving is the positive function of income. i.e S-f(Y) when income increases saving also increase and vice versa.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("18.", "What does the circular flow of income or the circular diagram show?", 0, 0, 0, 0, 0, "The flow of goods and services among firms. ", "The flow of money, goods and services among economic agents.", "The flow of goods and services among households.", "The flow of money, goods and services among governments.", "The circular diagram shows that the flow of money, goods & service among economic agents (among, firms’ household and government).", "b", 0, 1, this.f545b));
        arrayList.add(new questions("19.", "Which one of the following is an important difference between the characteristics of perfectly competitive and monopolistically competitive markets?", 0, 0, 0, 0, 0, "Firms in monopolistically competitive industries have horizontal demand curve. ", "Firms in monopolistically competitive industries do not try to maximize profits by producing a quantity that equals MR to MC.", "Firms in monopolistically competitive industries have substantial barriers to deter the entry of competing firms while perfectly competitive firms do not.", "Firms in monopolistically competitive industries sell similar but not identical products. ", "An important different between the characteristics of perfectly competitive and monopolistically competitive market is that, firms in mono politically competitive industries sell similar but not identical products (products are close substitute but not identical).", "d", 0, 1, this.f545b));
        arrayList.add(new questions("20.", "Which one of the following was not the focus of the national development plan under the EPRDF during the period 1992-1996?", 0, 0, 0, 0, 0, "Devaluing the country's currency to promote expos ", "Ensuring peace and security", "Promoting people's equality and fraternity ", "Alleviating poverty through rapid economic growth.", "All of the alternative that found in choice B, C and D are the focused of the national development plan under EPRDF during the period 1992 1996 but that of Choice A is not a plan during the period 1992-1996.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("21.", "Which one of the following is true about the difference between nominal GDP and real GDP", 0, 0, 0, 0, 0, "Nominal GDP is based on the current prices, while real GDP is based on the current population", "Nominal GDP is computed on the basis of current prices.", "GDP is computed on the basis of constant prices while real C Nominal GDP is based on constant prices, while real GDP is based on constant population.", "Nominal GDP is computed on the basis of constant prices, while real GDP is computed on the basis of current prices ", "It is explained in ques. No 6 & refer the answer for ques. No 6. ", "b", 0, 1, this.f545b));
        arrayList.add(new questions("22.", "Which of the following is true about industrialization? ", 0, 0, 0, 0, 0, "Industrialization leads to deterioration in the balance of trade", "Industrialization worsens the balance of payments problems of developing nations.", "Industrialization leads to the improvement in the balance of trade. ", "Industrialization destroys positive externalities through the consumption of agricultural raw materials to produce goods for the economy.", "The true statement about industrialization is that, industrialization leads to improvement in the balance of trade.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("23.", "Which one of the following best expresses the major problem facing the financial sector in Ethiopia? ", 0, 0, 0, 0, 0, "The sector does not have the potential for development", "There is shortage of trained and efficient human resource in the sector.", "The channeling of surplus funds to the formal financial sector is limited", "A good part of the economy is not monetized In the theory of production.", "The different kinds of bottlenecks for the development formal financial sectors in Ethiopia includes\n\tA good part of the economy is not monetized.\n\tFail to repay loans.\n\tLack of weak competition.\n\tMaintenance of large amount of financial resources by some banks due to high collateral requirements and lack of variable projects.\n", "d", 0, 1, this.f545b));
        arrayList.add(new questions("24.", "Which one of the following is true? When total product", 0, 0, 0, 0, 0, "begins to decline, marginal product becomes negative. ", "decreases at an increasing rate, then marginal product increases.", "decreases at a diminishing rate, then average product increases.", "reaches a maximum, average product becomes zero. ", "When total product increase at an increasing rate, marginal product increase.\n\tWhen TP increase at diminishing rate, marginal product (MP) decliner. \n\tWhen TP reaches its maximum MP becomes zero and\n\tWhen TP begins to decline MP becomes negative. \n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("25.", "Which one of the following is a measure of unemployment? The ratio of unemployed persons to the total ", 0, 0, 0, 0, 0, "population in a country, expressed as a percentage.", "employed persons in a country, expressed as a percentage.", "labor force in a country, expressed as a percentage.", "gross domestic product in a country, expressed as a percentage.", "Unemployment is usually measured as the ratio of the unemployed persons to the total labor force in a country and its expressed in percentage terms. Thus\nRate of Unemployment =  (No of unemployed person )/(total labor force)×100\n", "c", 0, 1, this.f545b));
        arrayList.add(new questions("26.", "What are the two major sources of revenue for the Ethiopian government? ", 0, 0, 0, 0, 0, "Sales of bonds and shares.", "Exports and imports of goods and services. ", "Sales of agricultural and industrial products.", "Taxes and non-tax revenues ", "The two major sources of revenue for the Ethiopian government are taxes and non-tax revenues.", "d", 0, 1, this.f545b));
        arrayList.add(new questions("27.", "What is an ad valorem tax?", 0, 0, 0, 0, 0, "A foreign trade tax in proportion to value of imported commodity.", "A sales tax imposed on business enterprises.", "A value-added tax leveled on goods and services.", "A foreign trade tax as a fixed monetary tax per physical unit of the imported commodity. ", "Ad valorem tax: is a foreign trade tax in proportion to value of imported commodity. Example 5% on the value of the commodity. ", "d", 0, 1, this.f545b));
        arrayList.add(new questions("28.", "Which one of the following is a factor for improved performance of the economy after the new economic reform program in Ethiopia?", 0, 0, 0, 0, 0, "The protection of foreign trade.", "The regulation of domestic prices.", "Disabling environment for the development of the private sector.", "The devaluation of the local currency. ", "Devaluation of local currency is one of the new economic reform programs. ", "d", 0, 1, this.f545b));
        arrayList.add(new questions("29.", "Which one of the following factors affect most the size and growth of Ethiopia's population?", 0, 0, 0, 0, 0, "Fertility and mortality ", "Diet and nutrition", "Education and health", "Income and standard of living ", "Mortality and Fertility are factors that affect the size and growth of Ethiop's population.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("30.", "Which one of the following is true about the short-run supply curve in perfect competition?", 0, 0, 0, 0, 0, "The short-run supply curve for a constant-cost industry is horizontal.", "The long-run supply curve for decreasing-cost industry is upward sloping. ", "The short-run supply curve for a constant-cost industry is vertical. ", "The long-run supply curve for an increasing-cost industry is downward.", "In a perfect competition the short-run supply curve for constant cost industry is horizontal.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("31.", "Which of the following best describes the current account balance of Ethiopia?", 0, 0, 0, 0, 0, "The balance on net services has been negative over the period 1992 2009.", "The cost of import has been consistently greater than export revenue over the period 1992-2009. ", "The balance on private transfers has been negative over the period 1992-2009.", "The export revenue has been increasing by more than import costs over the period 1992-2009. ", "The cost of import has been consistently greater than export revenue over the period 1992-2009.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("32.", "Which one of the following is the consequence of international trade? International trade", 0, 0, 0, 0, 0, "prohibits countries to specialize in the production of goods which they can produce at the least cost. ", "allows countries to gain access to international technology only if they are large and developed. ", "allows countries to consume and produce more than what would be possible without trade.", "discourages countries to import those goods and services whose domestic production is relatively costly. ", "One of the consequences of international trade is that it may discourage countries to import those goods and service whose domestic production is relatively costly. ", "c", 0, 1, this.f545b));
        arrayList.add(new questions("33.", "Which one of the following statements is true about the performance of the education sector of Ethiopia? ", 0, 0, 0, 0, 0, "There has been decreasing access to primary education. ", "The gender gap at the primary level increased over the years. ", "The lowest enrollment rates for girls and pastoralist areas. are recorded in emerging regions ", "There has been insignificant progress in gross enrolment rate in primary schools.", "Among the given choices the true statement about the performance of the education sector of Ethiopia is that, the lowest enrollment of rate for girls are recorded in emerging regions and pastoralist areas. ", "c", 0, 1, this.f545b));
        arrayList.add(new questions("34.", "Which one of the following represents the value added of a firm? The value of total product minus: ", 0, 0, 0, 0, 0, "cost of intermediate goods used in production.", "labor costs.", "investment expenditures. ", "all of its costs of production.", "Value added at factor cost (VAFC) is the difference between the gross value of output and the value of intermediate inputs such as the cost of raw materials. VAFC-Gross value of output-Value of intermediate input", "a", 0, 1, this.f545b));
        arrayList.add(new questions("35.", "Which one of the following statements is true about demand-pull inflation? ", 0, 0, 0, 0, 0, "Demand-pull inflation is normally initiated by a leftward shift in the aggregate demand curve.", "Demand-pull inflation is normally initiated by a leftward shift in the aggregate supply curve. ", "Demand-pull inflation is normally initiated by a rightward shift in the aggregate demand curve", "Demand-pull inflation is normally initiated without a shift in either the aggregate demand or aggregate supply curve. ", "When demand for goods and services exceeds the available supply at current price, it is a demand-pull inflation, it is a demand-pull inflation, it is the condition at which the purchasing power of the people increase, but there is no corresponding expansion of the supply of goods and services.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("36.", "Suppose that a consumer has the utility function U = 5X +7Y. Which one of the following is true if X is measured on the horizontal axis? ", 0, 0, 0, 0, 0, "The indifference curves will be straight lines with slope -5", "The indifference curves will be L-shaped. ", "The indifference curves will be horizontal.", "The indifference curves will be straight lines with slope ", "The consumer has the utility function U-5X+7Y; When the value of X is measured on the horizontal axis the difference curves will be constant/straight lines with slop-5/7", "a", 0, 1, this.f545b));
        arrayList.add(new questions("37.", "Which of the following is usually a characteristic of a perfectly competitive industry? A. Existing firms can bar the entry of new firms.", 0, 0, 0, 0, 0, "Existing firms can ban the entry of new firms ", "An individual firm can have significant amount of market power. ", "Any individual firm can increase its production and sales, affecting the price of the good.", "The market supply curve is elastic and sloping upwards.", "A perfectly competitive market is a market structure in which there are large number of producers producing homogeneous products so that no individual firm can influence the price of the commodity. Free entry and exit of firms is one of its characteristics.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("38.", "The law of diminishing returns implies that, with the use of capital fixed,  the use of labor rises: ", 0, 0, 0, 0, 0, "total product will fall eventually. ", "the total product of labor will fall below the marginal product of labor.", "the marginal product of labor will fall eventually.", "the production process will become technologically inefficient eventually. ", "The law states that as more and more of one factor input is employed, assuming all other (inputs held constant, a point will eventually be reached where additional quantities of the varying input will yield diminishing marginal contribution to total product.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("39.", "Assuming that all other factors remain the same, which of the following will most likely occur during the expansionary phase of a business cycle?", 0, 0, 0, 0, 0, "Real GDP rises and unemployment falls.", "Inflation rises and employment falls. ", "Real GDP declines and inflation rises.", "Interest rates rise and the number of business failures rise. ", "As the economy moves out of depression it enters the phase of recovery. have the level of investment, employment output, income and price moves upward real GDP rises and unemployment falls.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("40.", "Which one of the following is not true about the relationship between indifference curve and utility?", 0, 0, 0, 0, 0, "Indifference curve is concave to the origin, indicating an increasing marginal rate of substitution at the same level of utility. ", "Indifference curve is convex to the origin, indicating a diminishing marginal rate of substitution at the same level of utility.", "The consumer maximizes utility at a point where the indifference curve and the budget line are tangent to each other. ", "Indifference curve is the locus of points representing different combinations of two goods which yield the same level of utility.", "Choice B, C and D are the statements about the relationship between indifference-curve & Utility that of A is not true because indifference curve are not concave to the origin rates it is convex to the origin. ", "a", 0, 1, this.f545b));
        arrayList.add(new questions("41.", "Which of the following is the major bottleneck to the industrial sector of Ethiopia?", 0, 0, 0, 0, 0, "Unfavorable climate", "Lack of demand ", "Shortage of unskilled manpower", "Shortage of credit to the sector ", "The main problems of industry sector of Ethiopia are\n\tLack finance\n\tMarket related problems\n\tTechnology related problems and\n\tInput related problems\nLack of demand is one of the market related problems of the industrial sector of Ethiopia.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("42.", "Which one of the following is true about the relationship between balance of trade and balance of payments? ", 0, 0, 0, 0, 0, "Balance of payments is a part of balance of trade.", "Balance of payments is not influence by balance of trade.", "Balance of trade has positive and significant relationship with balance of payments.", "Balance of trade is not a part of the balance of payments. ", "Balance of trade has a positive and significant relationship with balance of payment because, when balance of trade (Export-Import) is positive then balance of payment will be at surplus and vice versa.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("43.", "Which of the following is the role of commercial Banks in Ethiopia?", 0, 0, 0, 0, 0, "Regulating insurance companies.", "Mobilization of domestic saving. ", "Setting reserve requirement ratio.", "Regulating other commercial Banks. ", "Choice A, C and D contains the role of national bank of Ethiopia where as that of Choice A is the role of commercial banks (Mobilization of domestic saving) ", "b", 0, 1, this.f545b));
        arrayList.add(new questions("44.", "Which of the following is among the financial sector policies introduced during the Derg regime?", 0, 0, 0, 0, 0, "Cooperatives and public enterprises were borrowing at lower interest rates compared to private firms. ", "Private banks were allowed to lend only to the government.", "Floating exchange rate policy was followed by the Derg government. ", "The government introduced financial sector policy that encourages innovation and financial deepening.", "Among the financial sector polices introduced during the Derg regime cooperatives and public enterprises where borrowing at lower interest rates compared to private firms.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("45.", "Which of the following is among the components of the structural adjustment policy measures undertaken in Ethiopia in early 1990s?", 0, 0, 0, 0, 0, "Expenditure expansion policy.", "Policy to maintain productive resources in non-productive sectors. ", "Policy to restructure institutions towards competitiveness and efficiency through a market-oriented economy.", "Policy to expand economic role of the public sector and its expenditure. ", "Structural adjustment policy measure undertaken in Ethiopia include\n\tMacroeconomic policy\n\tPrivatization\n\tTransport deregulation.\n\tDomestic price liberalization\n\tForeign trade liberalization and\n\tPrivate sector reform.\n", "c", 0, 1, this.f545b));
        arrayList.add(new questions("46.", "Which one of the following best explains the motives for setting trade restrictions?", 0, 0, 0, 0, 0, "Cyclical", "Frictional", "Structural", "Seasonal", "The major motives for setting trade restriction is to protect the local economy from foreign competition the rest are secondary motives of trade restriction.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("47.", "Which of the following best summarizes the economic role of Ethiopian government?", 0, 0, 0, 0, 0, "To limit the quantity of imports.", "To protect local economy from foreign competition.", "To generate government revenue. ", "To raise the price of imported goods. ", "Structural unemployment refers to situation in which workers become jobless due to loss of demand in particular region or industry is bound to curtail coal mining activity & cause unemployment there.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("48.", "Which one of the following best summarizes the economic role of Ethiopian government?", 0, 0, 0, 0, 0, "Organizing political parties.", "Provision of military services. ", "Provision of economic commodities such as oil and sugar.", "Promoting economic growth and social welfare.", "Summarized economic role of Ethiopians government is promoting economic growth and social welfare. ", "d", 0, 1, this.f545b));
        arrayList.add(new questions("49.", "Which one of the following is the reason for the unsatisfactory performance of Ethiopian's agricultural sector? ", 0, 0, 0, 0, 0, "Lack of effective land ownership entitlement.", "Unpredictable human made problems.", "Establishment of infrastructure and extension services.", "Natural problems that result from social and economic practices. ", "According to the studies made so far the problems of the agriculture sector of Ethiopia are \nUnpredictable weather condition\nHuman made problems such as\n\tLand fragmentation \n\tLack of infrastructure\n\tLack of credit facilities\n\tLack of effective land ownership entitlement\n\tErosion and land degradation \n\tTraditional practice \n\tThe use of backward technology and \n\tInadequate rural market", "a", 0, 1, this.f545b));
        arrayList.add(new questions("50.", "Which one of the following is true about the actual resource base of Ethiopia? ", 0, 0, 0, 0, 0, "Large potential of energy source that is both exported and domestically used.", "Little livestock population contributing little to foreign exchange earnings.", "Large and old population that could serve as source of experienced labor and entrepreneurs. ", "Large deposits of fossil fuel or petroleum that contributes to forei exchange earnings. ", "Ethiopia is one of the few African countries with the potential to produce hydroelectric and geothermal power.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("51.", "Which one of the following descriptions is true about the importance of industrial sector relative to the rest of the economic sectors in Ethiopia? ", 0, 0, 0, 0, 0, "The industrial sector is the dominant sector which contributes about 3 to employment.", "The industrial sector has high potential to create linkages with the different sectors of the domestic economy. ", "The industrial sector has little potential to create job opportunities for the rapidly growing urban population.", "The industrial sector cannot generate higher profit margins than the agriculture sector and thus may lead to lower levels of saving. ", "The industry sector has more importance relative to the rest of the economic sectors in Ethiopia because the industry sector has high potential to create linkage with the difference of the domestic economy.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("52.", "Which one of the following statements is true if it takes Ethiopia 40 and 30 labor-hours to produce a quintal of maize and wheat, respectively while it takes Kenya 30 and 40 labor-hours to produce the same?", 0, 0, 0, 0, 0, "Ethiopia has and absolute advantage in maize production. ", "Kenya has a comparative advantage in wheat production.", "Ethiopia has a comparative advantage in maize production. ", "Ethiopia has an absolute advantage in wheat production.", "", "d", C2719R.C2721drawable.econ2010q52exp, 1, this.f545b));
        arrayList.add(new questions("53.", "Which of the following statements is true about international trade? ", 0, 0, 0, 0, 0, "Trade denies counties access to the greater variety of goods produced abroad.", "Trade allows countries to take advantage of increasing returns to scale.", "Trade reduces efficiency of local producer by posing excessive competition. ", "Trade discourages countries to specialize in producing where they have a comparative advantage.", "International trade allows countries to take advantage of increasing return to scale.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("54.", "In the aggregate demand and aggregate supply model, the intersection of the aggregate demand and aggregate supply curves determines the ", 0, 0, 0, 0, 0, "price level and the rate of inflation.", "equilibrium price and employment level.", "difference between real and nominal GDP.", "price level and real GDP.", "Equilibrium point is the point at which demand becomes equal to supply or the demand curve crosses the supply curve equally and it shows the equilibrium price and quantity.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("55.", "In the context of the theory of production and cost, which one of the following is true?", 0, 0, 0, 0, 0, "Expenditures made on power supply and raw materials constitute fixed costs.", "The production function is a financial relationship between output and different combinations of inputs.", "A firm can continue production even at a loss of fixed costs. ", "Returns to scale refer to the behavior of output consequent to change in the quantities of factor inputs in the different proportions. ", "The production function is written mathematically on\nQ=f(x₁,X2,X3,X4 ---Xn) Where X₁,X2,X3,X4---Xn\ndifferent inputs and Q is amount of output.\n", "b", 0, 1, this.f545b));
        arrayList.add(new questions("56.", "In the theory of production, what do short-run and long-run refer to, respectively?", 0, 0, 0, 0, 0, "Short-run refers to the period of time during which all factors of production are variable, while long-run refers to the period of time during which all factors of production are fixed.", "Short-run refers to the period of time during which at least one factor of production is fixed, while long-run refers to the period of time during which all factors of production are variable. ", "Short-run refers to the time it takes between exchange & consumption", "Short-run refers to the time it takes between production and consumption, while long-run refers to the time it takes between distribution and exchange. ", "Economists classify time periods into two categories: The short run and\nThe long run Short-run: In production theory is the period of time over which the amount of some inputs called fixed inputs cannot be changed. For example, the amount of plant and equipment etc is fixed in the short-run. Whereas Long-run: Refers to the time period during which all factors of production can be varied. \n", "b", 0, 1, this.f545b));
        arrayList.add(new questions("57.", "Which of the following is true about consumption and saving functions?", 0, 0, 0, 0, 0, "Both consumption and saving are negatively related to income.", "Consumption is directly related to income, while saving is inversely related to income.", "Both consumption and saving are positively related to income.", "Consumption is inversely related to income, while saving is directly related to income. 58. Which one of the following is true about fixed costs?", "In both consumption and saving functions both consumption and saving are positively related to income. i.e C = f(Y) where C is consumption & Y is income (disposable income) as Y increases C also increases & vice versa and S=f(Y) as disposable income increase saving also increase & vice versa.", "c", 0, 1, this.f545b));
        arrayList.add(new questions("58.", "Which one of the following is true about fixed costs?", 0, 0, 0, 0, 0, "Expenditures that are made on raw materials and power supply. ", "Expenditures associated with the amount of goods and services. ", "Costs that increase or decrease with the volume of production. ", "Costs that is independent of the volume of production.", "Fixed cost refers to the total cost incurred by the firm for the use of all fixed factors. This cost is independent of output, fixed cost is fixed even in zero production in the short-run.", "d", 0, 1, this.f545b));
        arrayList.add(new questions("59.", "Which one of the following components constitutes aggregate demand? ", 0, 0, 0, 0, 0, "Consumption, investment, government expenditures, and net exports.", "Demand, supply, price and equilibrium.", "Exports, imports, balance of trade and balance of payments.", "Gross national product, gross domestic product and net factor income from abroad. ", "The main components of aggregate demand are \n\tPrivate (household) consumption demand (C).\n\tGross private investment demand (1g). \n\tGovernment demand for goods and service (G)\n\tNet export demand (X-M) where x is export and m is import \nSo that AD=C+I+G+ (X-M)\n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("60.", "Which one of the following best describes the major problems of educational sector in Ethiopia?", 0, 0, 0, 0, 0, "The problems associated with high drop-outs and repetition rates. ", "The disparity between the enrollment of girls and the enrollment of boys.", "The disparity between developed and undeveloped regions as well as between rural and urban areas.", "The problems associated with relevance, quality, accessibility & equity. ", "According to MEOC (1999) the main problems of the education sector of Ethiopia are\n\tGreat disparity between region.\n\tEnrollment of girls at every level is lower than boys. \n\tIn adequate facilities.\n\tHigh illiteracy rate.\n\tProblem of relevance quality accessibility and equity. \nProblem of relevance, quality accessibility and equity best describes the major problems of the sector.\n", "d", 0, 1, this.f545b));
        arrayList.add(new questions("61.", "Which one of the following is an indicator of the low performance of the education sector of Ethiopia?", 0, 0, 0, 0, 0, "Low relevance ", "Low drop-out", "Low gender disparity", "Lower pupil-teacher ratio", "Low drop-out low gender disparity and lower pupil teacher ration are indicators of good performance in education sector but low relevance shows the low performance of the education sector.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("62.", "Which one of the following is personal income tax in Ethiopia? ", 0, 0, 0, 0, 0, "Tax paid by self-employed individuals from their businesses. ", "Proportional to their expenditures in Tax paid by government employees ", "Tax paid by non-government organization employees from the purchase goods. of luxury items.", "Tax paid by private organization employees from the wage/salary earn. ", "Personal income tax every person deriving income from employment in any government or other private organization or non-governmental and income from employment including any payments or gain in cash or in kind which he/she received from employees.", "d", 0, 1, this.f545b));
        arrayList.add(new questions("63.", "Assume that a country produces only bread and machines. Which one of the following is true if resources are equally usable to the production of bread and machines?", 0, 0, 0, 0, 0, "The slope of the production possibilities frontier is constant. ", "Concave production possibility frontier.", "The production possibilities frontier of the country will be upward sloping. ", "The slope of the production possibilities frontier changes as we move along the production possibilities curve.", "If resource is equally usable to the production of the two goods the slope of PPF is constant. ", "a", 0, 1, this.f545b));
        arrayList.add(new questions("64.", "Holding everything else constant, which of the following is true about increasing price in a perfectly competitive industry? An increase in price will result in", 0, 0, 0, 0, 0, "lower than normal profits and that in turn will result in a reduction in the price. ", "lower than normal profits, leads some firms to leave the industry and thus result in an even greater price increase. ", "greater than normal profits for firms, which will lead some firms to leave the industry and thus result in an even greater price increase. ", "greater than normal profits for firms, will attract new firms and that in turn will result in a reduction the price.", "Increasing price in a perfectly competitive industry an increase in price will result in greater than normal profit for firms will attract new firms and that in turn will result in reduction in price.", "d", 0, 1, this.f545b));
        arrayList.add(new questions("65.", "Which one of the following happens if the government budget deflects decreases? ", 0, 0, 0, 0, 0, "The level of investment, the level of national saving and the interest increase rate", "The level of investment and the level of national saving increase and interest rate of decreases.", "The level of investment the level of national saving and the interests rate decrease. ", "The level of investment and the level of national saving decrease and the interest rate increases.", "decrease in government budget deficit means that it is going to be in a surplus position therefore, when there is budget surplus investment decreases level of -unemployment increase saving decrease and interest rate decrease. ", "c", 0, 1, this.f545b));
        arrayList.add(new questions("66.", "Which one of the following best describes the outcomes of bi-modal agricultural strategy? ", 0, 0, 0, 0, 0, "It promotes small-scale diversification.", "It discourages individual's right to acquire land. ", "It promotes individual's right to acquire land.", "It invites less capital and technology investment for agriculture.", "The Characteristics of the Bi-modal agricultural approach are\n\tIt is dualistic agricultural development approach that support a strong principal commercial sector. \n\tEntrepreneurial individual should be allowed to accumulate land.\n\tit support individual right to acquire land\n\tit invite more capital and technology and\n\tit promotes large scale diversification. \n", "c", 0, 1, this.f545b));
        arrayList.add(new questions("67.", "Which of the following is a mode of payment in international trade, which is an order written from creditor to a debtor and signed by the creditor requiring the person to whom it is addressed to pay either on demand or a fixed date in the future?", 0, 0, 0, 0, 0, "Banker's transfer", "Bill of exchange", "Letter of credit", "Open market operation", "Bill of exchange is an order in written from addressed by a creditor to debtor and signed by creditor requiring the person to whom it is addressed (the debtor or buyer) to pay either on demand or at a fixed date or at a determinable future time a certain sum of money to the person named on the bill or to his order.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("68.", "Which of the following statement is true about the contribution of industrial foreign exchange in Ethiopian economy? ", 0, 0, 0, 0, 0, "The value of export of chemicals is more than that of leather and sector to footwear. B. The value of export of textile is more than that of food and beverages.", "The value of exports of textile is morethan that of food and beverages.", "The value of exports of food and beverage is more than that of textile.", "The value of export of paper and printing is more than that of metals.", "", "b", C2719R.C2721drawable.econ2010q68exp, 1, this.f545b));
        arrayList.add(new questions("69.", "Which of the following cannot be a determinant of autonomous investment?", 0, 0, 0, 0, 0, "Income", "Population", "The level of technology ", "The interest rates", "Autonomous investment refers to investment which is made irrespective of income level this approach is generally taken in the government sector. It is income inelastic it is not affected by change in income level.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("70.", "Which of the following is true about a change in technology that shifts the firm's total product curve upward without changing the quantity of capital used? The change in technology", 0, 0, 0, 0, 0, "shifts the average total cost curve downward. ", "does not change the cost curves.", "shifts the marginal cost curve upward. ", "shifts the average total cost curve upward.", "The change in technology shifts the average cost curve downward or decrease cost of production.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("71.", "Given the production function Q-L² what is the average product of labor for 1-2 and the marginal product of labor between L-1 and L-2? The average product of labor is", 0, 0, 0, 0, 0, "2 and the marginal product of labor is 3.", "2 and the marginal product of labor is 2. ", "1 and the marginal product of labor is 3.", "3 and the marginal product of labor is 2.", "Initially the total labor employed by affirm was 10person-hours and gradually increased to 12 person-hours keeping all other input factors constant. The hourly wage rate is 10Birr.The change in total variable costs is 2 Birr.", "b", 0, 1, this.f545b));
        arrayList.add(new questions("72.", "Suppose initially the total labor employed by a firm was 10person-hours and gradually increased to 12 person-hours keeping all other input factors constant. The hourly wage rate is 10 Birr. What is the change in the total variable costs? ", 0, 0, 0, 0, 0, "20 Birr", "2 Birr ", "100 Birr ", "120 Birr", "Given L₁ = 10 Wage rate-10birr\n\t\tL₂=12\nTVC = 10 × 10 = 100birr\nTVC = 12 × 10 = 100birr A\nTVC=TVC₂-TVC₁ = 120-100 = 20\n", "a", 0, 1, this.f545b));
        arrayList.add(new questions("73.", "Suppose a perfectly competitive firm has an output-2000 units, market price-2 Birr, fixed costs-2000 Birr total variable costs-1000 Birr marginal cost-2.20 Birr. Which of the following is true about this firm?", 0, 0, 0, 0, 0, "The firm is making a zero-economic profit. ", "The firm is producing the output where AVC=MC", "The firm is losing money, although it could make a profit by decreasing its output.", "The firm is making a positive economic profit. ", "Given\nQ=200 units\nP=2 birr\nTFC= 2000 birr\nTVC= 1000 birr MC= 2.2 birr\nProfit-TR-TC\nTR = P X Q = 2000 × 2 = 4000\nTC=TFC+TVC = 2000 x 1000 = 3000\nProfit=4000-3000 1000\n", "d", 0, 1, this.f545b));
        arrayList.add(new questions("74.", "Individual demand and supply functions for a commodity are given refers to price. If there are 50 buyers and 25 suppliers of the commodity, respectively as Q-10-p and Q-2P-12 where Q refers to the quantity and p what are the market equilibrium prices and quantities respectively? ", 0, 0, 0, 0, 0, "100 and 8", "8 and 100", "4 and 8", "8 and 4", "Given\nQ=10-P\nQ=2P-12\nThere are 50 buyers and 25 suppliers \nMarket demand function (Q_dm)=no of buyers x demand function\n= 50(10-P)\nQam=500-50P\nMarket supply function (Qsm)=no of sellers x supply function\n= 25(2P-12)\nAt equilibrium Qam = Qsm\n\tQsm = 50P-300\n\t500-50P=50P-300 \n\t100P = 800\n\tP= 800=8 → equilibrium price 100\n50(8) - 300 = 500 - 50(8)\n 400-300=500-400\n100= 100 means equilibrium quantity\nTherefore the equilibrium price is 8 and the equilibrium quantity is 100.\n", "b", 0, 1, this.f545b));
        arrayList.add(new questions("75.", "The following information was obtained from a firm operating under perfectly competitive market. When total product was 100 kilograms, the total revenue was Birr 240. However, when total product was increased to 120kilograms, the total revenue increased to 280Birr. What is the marginal revenue in Birr? ", 0, 0, 0, 0, 0, "1", "40", "20", ExifInterface.GPS_MEASUREMENT_2D, "Given TP₁ = 100kg ,TRP₁ = 240,TP₂ = 120kg ,TRP₁ = 280\n\t\tMR= ∆TR\n\t\t∆TR = 280kg - 240 = 40 \n\t\t∆TP( )= TP₂-TP₁ = 120-100 = 20\n\t\tMR =40/20= 40\n", "d", 0, 1, this.f545b));
        arrayList.add(new questions("76.", "Which of the following statements is true about an economic system?", 0, 0, 0, 0, 0, "Some economic systems try to address the problems of what to produce, how to produce and how to distribute. ", "In a system of market economy both the government and the market have roles to play in determining what to produce how to produce and how to distribute. ", "In a market economy while the problems of what to produce and how to produce are determined by the market, the problem of how to distribute is determined by the government.", "In a command economy, a government of a government agency (like central planning) determines what to produce how to produce and how to distribute.", "In command economy system the government or government agency determine what to produce, how to produce and how to distribute. ", "d", 0, 1, this.f545b));
        arrayList.add(new questions("77.", "Which one of the following is true about the national development plan during the Monarchy?", 0, 0, 0, 0, 0, "Acceleration of agricultural development by promoting commercial ventures.", "Shrinking of the bureaucratic structure and ancillary services. ", "Transition from service economy to agro-industrial economy.", "Nationalization of farms and the formation of farmer's cooperatives. ", "Among the national development plan during the monarchy Agricultural development by promoting commercial ventures. ", "a", 0, 1, this.f545b));
        arrayList.add(new questions("78.", "Which one of the following best represents foreign exchange rate system based on the supply and demand of foreign exchange?", 0, 0, 0, 0, 0, "Floating exchange rate", "Quotas", "Fixing foreign exchange rate", "Managed exchange rate system.", "Floating exchange rate is an exchange rate at which the exchange rate is determined on the supply and demand of foreign exchange. i.e the exchange rate is determined by market force of demand and supply where as in a fixed exchange rate the foreign exchange is determined by the government and managed floating exchange rate is a mix of floating and fixed exchange rate systems.", "a", 0, 1, this.f545b));
        arrayList.add(new questions("79.", "Which of the following is applicable to both monopolistic competition and perfect competition?", 0, 0, 0, 0, 0, "Firms cannot earn an economic profit in the short run.", "There are a small number of independently acting sellers. ", "There are no barriers to entry.", "Firms compete on their product price as well as its quality.", "In both monopolistically completion and perfect competitive market structures there are no barrier to entry in to the market (there is free entry and exit of firms) ", "c", 0, 1, this.f545b));
        arrayList.add(new questions("80.", "What is the relationship between marginal utility and total utility?", 0, 0, 0, 0, 0, "Marginal utility is the ratio of total utility to quantity. ", "Marginal utility is the difference between total utilities", "Marginal utility is the change in total utility due to a unit change in quantity. ", "Marginal utility is the sum of total utilities of various units of a commodity.", "Marginal utility is the change in total utility due to a unit change in quantity\nMU=  ∆TU/∆Q  \nWhere, MU is marginal utility \n∆TU is change in total utility \nand ∆Q is change in quantity.\n", "c", 0, 1, this.f545b));
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
        this.f546tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    economics2010.this.timer.setVisibility(0);
                    economics2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    economics2010.this.scr.setVisibility(8);
                    economics2010.this.chr.stop();
                    economics2010.this.toolbar.setVisibility(8);
                    economics2010.this.Relative.setBackgroundColor(-7829368);
                    economics2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2010.this.getBaseContext());
                    int unused = economics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = economics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = economics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = economics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = economics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = economics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = economics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = economics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = economics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = economics2010.this.highscoreEconomics2010 = defaultSharedPreferences.getInt("econ2010hs", 0);
                    int access$600 = economics2010.this.part1 + economics2010.this.part2 + economics2010.this.part3 + economics2010.this.part4 + economics2010.this.part5 + economics2010.this.part6 + economics2010.this.part7 + economics2010.this.part8 + economics2010.this.part9;
                    economics2010.this.resultText.setText(String.valueOf(access$600));
                    economics2010.this.progressbar.setProgress(access$600);
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
                    int unused11 = economics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = economics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = economics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = economics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = economics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = economics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = economics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = economics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "econ2010hs";
                    int unused19 = economics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = economics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = economics2010.this.answered1 + economics2010.this.answered2 + economics2010.this.answered3 + economics2010.this.answered4 + economics2010.this.answered5 + economics2010.this.answered6 + economics2010.this.answered7 + economics2010.this.answered8 + economics2010.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > economics2010.this.highscoreEconomics2010) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 75;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - economics2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1econ101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1econ102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1econ103", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1econ104", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1econ105", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1econ106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1econ107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1econ108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1econ109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1econ1010", 0);
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
                        editor.putString("scoreecon101", str3);
                        editor.putLong("date1econ101", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreecon102", str5);
                            editor.putLong("date1econ102", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreecon103", str5);
                            editor.putLong("date1econ103", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreecon104", str5);
                            editor.putLong("date1econ104", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreecon105", str5);
                            editor.putLong("date1econ105", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreecon106", str5);
                            editor.putLong("date1econ106", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreecon107", str5);
                            editor.putLong("date1econ107", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreecon108", str5);
                            editor.putLong("date1econ108", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreecon109", str5);
                            editor.putLong("date1econ109", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreecon1010", str5);
                            editor.putLong("date1econ1010", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateecon101", 0);
                    long j12 = defaultSharedPreferences.getLong("dateecon102", 0);
                    long j13 = defaultSharedPreferences.getLong("dateecon103", 0);
                    long j14 = defaultSharedPreferences.getLong("dateecon104", 0);
                    long j15 = defaultSharedPreferences.getLong("dateecon105", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateecon106", 0);
                    long j17 = defaultSharedPreferences.getLong("dateecon107", 0);
                    long j18 = defaultSharedPreferences.getLong("dateecon108", 0);
                    long j19 = defaultSharedPreferences.getLong("dateecon109", 0);
                    long j20 = defaultSharedPreferences.getLong("dateecon1010", 0);
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
                        editor2.putString("iScoreecon101", str4);
                        editor2.putLong("dateecon101", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreecon102", str6);
                            editor2.putLong("dateecon102", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreecon103", str6);
                            editor2.putLong("dateecon103", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreecon104", str6);
                            editor2.putLong("dateecon104", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreecon105", str6);
                            editor2.putLong("dateecon105", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreecon106", str6);
                            editor2.putLong("dateecon106", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreecon107", str6);
                            editor2.putLong("dateecon107", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreecon108", str6);
                            editor2.putLong("dateecon108", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreecon109", str6);
                            editor2.putLong("dateecon109", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreecon1010", str6);
                            editor2.putLong("dateecon1010", l.longValue());
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
                        economics2010.this.scr.setVisibility(8);
                        economics2010.this.chr.stop();
                        economics2010.this.toolbar.setVisibility(8);
                        economics2010.this.Relative.setBackgroundColor(-7829368);
                        economics2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2010.this.getBaseContext());
                        int unused = economics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = economics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = economics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = economics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = economics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = economics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = economics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = economics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = economics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = economics2010.this.highscoreEconomics2010 = defaultSharedPreferences.getInt("econ2010hs", 0);
                        int access$600 = economics2010.this.part1 + economics2010.this.part2 + economics2010.this.part3 + economics2010.this.part4 + economics2010.this.part5 + economics2010.this.part6 + economics2010.this.part7 + economics2010.this.part8 + economics2010.this.part9;
                        TextView access$1600 = economics2010.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        economics2010.this.progressbar.setProgress(access$600);
                        economics2010.this.progressbar.setMax(80);
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
                        int unused11 = economics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = economics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = economics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = economics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = economics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = economics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = economics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = economics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = economics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = economics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = economics2010.this.answered1 + economics2010.this.answered2 + economics2010.this.answered3 + economics2010.this.answered4 + economics2010.this.answered5 + economics2010.this.answered6 + economics2010.this.answered7 + economics2010.this.answered8 + economics2010.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > economics2010.this.highscoreEconomics2010) {
                            edit.putInt("econ2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - economics2010.this.chr.getBase()) / 1000;
                        String str = "dateecon1010";
                        String str2 = "dateecon109";
                        String str3 = "dateecon108";
                        String str4 = "dateecon107";
                        String str5 = "dateecon106";
                        String str6 = "dateecon105";
                        String str7 = "dateecon104";
                        String str8 = "dateecon103";
                        String str9 = "dateecon102";
                        String str10 = "dateecon101";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1econ1010";
                        String str12 = "date1econ109";
                        if (economics2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1econ101", 0);
                            String str13 = "date1econ101";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1econ102", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1econ103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1econ104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1econ105", 0);
                            String str16 = "date1econ105";
                            String str17 = "date1econ104";
                            String str18 = "date1econ106";
                            long j6 = defaultSharedPreferences.getLong("date1econ106", 0);
                            long j7 = defaultSharedPreferences.getLong("date1econ107", 0);
                            String str19 = str12;
                            String str20 = "date1econ108";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1econ107";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1econ103";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1econ108", 0));
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
                                editor3.putString("scoreecon101", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreecon102", str25);
                                    editor3.putLong("date1econ102", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreecon103", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreecon104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreecon105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreecon106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreecon107", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreecon108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreecon109", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreecon1010", str25);
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
                                editor4.putString("iScoreecon101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreecon102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreecon103", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreecon104", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreecon105", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreecon106", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreecon107", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreecon108", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreecon109", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreecon1010", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1econ101";
                            String str30 = "date1econ104";
                            String str31 = str12;
                            String str32 = "date1econ103";
                            String str33 = "date1econ107";
                            String str34 = "date1econ106";
                            String str35 = str11;
                            String str36 = "date1econ105";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1econ102", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1econ102";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1econ108";
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
                                editor2.putString("scoreecon101", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreecon102", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreecon103", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreecon104", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreecon105", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreecon106", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreecon107", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreecon108", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreecon109", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreecon1010", str49);
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
                                editor.putString("iScoreecon101", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreecon102", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreecon103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreecon104", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreecon105", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreecon106", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreecon107", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreecon108", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreecon109", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreecon1010", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        economics2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2010.this.scr.setVisibility(8);
                economics2010.this.chr.stop();
                economics2010.this.toolbar.setVisibility(8);
                economics2010.this.Relative.setBackgroundColor(economics2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                economics2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2010.this.scr.setVisibility(0);
                economics2010.this.toolbar.setVisibility(0);
                economics2010.this.telegram_layout.setVisibility(8);
                economics2010.this.chr.start();
                economics2010.this.Relative.setBackgroundColor(economics2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = economics2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = economics2010.this.mInterstitialAd = null;
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
                economics2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
