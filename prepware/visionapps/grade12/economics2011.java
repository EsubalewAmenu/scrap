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

public class economics2011 extends AppCompatActivity {
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
    private Boolean f547b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEconomics2011;
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
    private Toolbar f548tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_economics2011);
        this.f547b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEconomics2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_economics2011);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "External assistance, which a country can receive from friendly governments is:", 0, 0, 0, 0, 0, "Multilateral assistance ", "Multilateral loans", "Bilateral assistance", "Unilateral assistance", "External assistances received from friendly countries is called bilateral assistance, where as assistances (grants) received from multilateral or international institutions is known as multilateral assistance.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("2.", "Which one of the following statements is true?", 0, 0, 0, 0, 0, "Real GDP is GDP at market prices at any time of the year.", "Nominal GDP is GDP measured in current market prices. ", "Nominal GDP can grow only when there is growth in output.", "Real GDP can grow when prices increase", "Nominal GDP is GDP measured in current market price, where as Real GDP is GDP measured in constant price. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("3.", "Which one of the following costs increases as output increases in the short run?", 0, 0, 0, 0, 0, "Overhead cost", "Rent of land (land cot)", "Cost on factory building.", "Labor cost", "Costs which increase as the output level increases are called variable costs and costs which don't vary with the change in output in the short run are called fixed costs, therefore overhead costs change as output level increase. ", "a", 0, 1, this.f547b));
        arrayList.add(new questions("4.", "Which one of the following conditions characterizes the capitalist economics system?", 0, 0, 0, 0, 0, "Private ownership of resources is the dominant ownership type.", "There is no wastage of resources.", "There is a smooth and constant growth of the economy. ", "All citizens equally benefit from economic activities.", "In a capitalist economic system there is\n\tThe right to private property is the fundamental future of capitalist economy in addition\n\tFreedom of enterprise\n\tFreedom of choice by consumers\n\tprofit motive\n\tcompetition \n\tMinor role of the government etc are some other characteristics of capitalist economy system. \n", "a", 0, 1, this.f547b));
        arrayList.add(new questions("5.", "Which of the following statements is true about the historical development of the industrial sector in Ethiopia?", 0, 0, 0, 0, 0, "The earliest types of industrial activities were largely confined to small scale establishments. ", "The earliest types of industrial activities were largely confined to medium-scale establishments.", "The earliest types of industrial activities were largely confined to large scale establishments.", "The military government followed export-promotion industrialization strategy.", "The earliest type of industrial activities were largely confined to small - scale establishments producing wood and furniture, leather, edible oil soap, flour etc.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("6.", "Which one of the following is an expansionary monetary Policy Instrument? ", 0, 0, 0, 0, 0, "Increasing cash reserve ratio.", "Increasing bank rate.", "Decreasing money supply ", "Decreasing cash reserve ratio.", "Expansionary Momentary policy is a measure which can be taken when there is a defiut demand. The major instruments of expansionary monetary policy measures are:\n\tReducing bank rate \n\tBuying securities and\n\tReducing cash reserve ratio \nThe opposite of theme measure will be taken to contractionary monetary policy.\n", "d", 0, 1, this.f547b));
        arrayList.add(new questions("7.", "The lowest level of investment, employment, output, income and prices during a business cycle is:", 0, 0, 0, 0, 0, "Recession ", "Depression", "Boom", "Contraction", "There are three farming systems in Ethiopia these are \n\tThe smallholder farming system.\n\tThe pastoral / nomadic system and\n\tThe modern commercial farming \nThe crop- productions sub-sector involves the production of food crops and cash crops about 97% of the food crop is produced by smallholders.\n", "d", 0, 1, this.f547b));
        arrayList.add(new questions("8.", "The greatest contribution to Ethiopia's agricultural GDP comes from the", 0, 0, 0, 0, 0, "livestock sub-sector", "forestry and fishery sub-sector ", "nomadic/pastoral system", "crop-production sub-sector", "In a business cycle if effective corrective measure cannot be under taken for recession. The economy may find itself caught up in the whirlpool of depression. This is a stage when the business confidence is at its lowest. Investment, employment, output, income and price reach bottom. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("9.", "The largest contribution of industrial products to export in Ethiopia comes from export of__________________", 0, 0, 0, 0, 0, "food products ", "leather products", "chemical products", "textile products", "Textile generates 41.5% of the sector's foreign exchange which is the largest contribution food and beverage, leather and footwear follows as second and third with 32% and 10% respectively.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("10.", "Which one of the following is true about the current account balance in international trade?", 0, 0, 0, 0, 0, "The current account balance refers to the difference between gross domestic product and net factor income from abroad. ", "The current account balance refers to the difference between the exports and imports of goods and services.", "The current account balance refers to all the transactions assets and liabilities. in financial", "The current account balance refers to all exports and imports of goods E and services and unilateral transfers.", "The current account records inflow and outflow of foreign currency resulting from flows of goods flows of services and unilateral transfer and current account has 3 parts. i.e trade balance net service and net transfer.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("11.", "Which one of the following is not included in current account of balance of payments?", 0, 0, 0, 0, 0, "Trade balance", "Capital account", "Services account", "Transfer account", "Current account has three parts\n1. trade balance \n2. net service\n3. net transfer\n1.\tTrade balance is the difference between the export and import of goods. \n2.\tNet service:- is the difference between the export and import of service and. \n3.\tNet Transfer is difference between the receipts and payments of transfers.\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("12.", "A country imports more goods than it exports. This shows that: ", 0, 0, 0, 0, 0, "there is surplus trade balance.", "there is a positive balance of trade", "there is a deficit trade balance", "there is a favorable balance trade.", "When a country imports move goods than it exports it shows there is a defiut trade balance and when export are more than imports it is called surplus trade balance and when imports are equal to exports it is called balanced.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("13.", "Which one of the following is a factor that causes international trade to take place between two or more countries?", 0, 0, 0, 0, 0, "The same income level in different countries. ", "The same population size in different countries.", "The same distribution of resources between countries. ", "Unequal distributions of resources.", "Countries has different resource endowments or there is unequal distribution of resource therefore international trade helps to solve this unequal distribution of resource between two or more countries. ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("14.", "Which one of the following is not true about the performance of education sector in Ethiopia? to other countries.", 0, 0, 0, 0, 0, "Enrolment at secondary schools is still low compared ", "Access to education has increased over time.", "The gross enrolment rate for boys and girls is equal.", "Female enrolment at higher institution is very low.", "The education sector of Ethiopia is beset by a number of problems such as\n\tGreat disparity between region. \n\tEnrollment of girls at every level of education is lower than that of boys.\n\tIn adequate facilities.\n\thigh illiteracy rate\n\tquality problem and high dropout etc. \n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("15.", "The law of equi-marginal utility states that a consumer gets maximum satisfaction when the", 0, 0, 0, 0, 0, "ratio of marginal utilities of all commodities is greater than its price", "ratio of marginal utilities of all commodities is less than its price. ", "ratio of marginal utilities of all commodities and their prices is equal. ", "ratio of average utilities of all commodities and its prices is equal.", "Equi Marginal utility states that consumer gets maximum satisfaction.\nWhen Mux/Px=MUY/Py---MUN/Pn\n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("16.", "Demand for a commodity will be elastic if________________.", 0, 0, 0, 0, 0, "its price does not change", "its consumption can be postponed ", "its consumption cannot change.", "its consumption cannot be postponed. ", "Price elasticity of demand can be determined by \n\tavailability of substitutes\n\tNature of the commodity\n\tproportion of income spent \n\tthe number of uses of a commodity\n\ttime factor\n\tpostponement of consumption and \n\tprice range and habit of consumers.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("17.", "Price elasticity of demand is defined as the________________.", 0, 0, 0, 0, 0, "percentage change in quantity demanded of a commodity as a result of one percent change in price of related commodity.", "percentage change in quantity demanded of a commodity as a result of one percent change in come of the consumer.", "percentage change in quantity demanded for a commodity as a result of one percent change in its own price.", "percentage change in quantity demanded of commodity as a result of one unit change in its own price. ", "Price elasticity of demand is defined as \nelasticity of price (ep)=  (% change in quantity demand)/(% change in price )\n=(%AQd)/(% AP)  \n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("18.", "Which one of the following is true about the structure of government budget? ", 0, 0, 0, 0, 0, "The government budget an economic plan of government savings and investments.", "The government budget is a financial plan of government revenues and expenditures.", "The government budget is a financial plan of government assets and liabilities.", "The government budget is an economic plan of exports and imports. ", "The government budget is defined as a financial plan of government revenue and expenditure. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("19.", "Individual supply schedule refers to a________________. ", 0, 0, 0, 0, 0, "tabular statement which shows the different quantities of a commodity offered for sale by an individual firm at the same price per time period. ", "tabular statement which shows the different quantities of a commodity offered for sale by an individual firm at different prices at a point in time.", "tabular statement which shows the different quantities of a commodity offered for sale by an individual firm at different prices per time period.", "tabular statement which shows the different quantities of a commodity offered for sale by an individual firm at the same price at a given point in time.", "Individual supply schedule is a tabular statement which shows the different quantities of a commodity offered for sale by an individual firm at different price per time period.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("20.", "Which of the following best describes opportunity cost of producing a commodity? ", 0, 0, 0, 0, 0, "The amount of other commodities gained when producing the commodity. ", "The amount of the same commodity forgone when producing the commodity", "The amount of the same commodity gained when producing the commodity ", "The amount of other commodities forgone when producing the commodity.", "Opportunity cost of accommodate is the amount of other commodities, that must be forgone in order to produce the first \nOpportunity cost of commodity = (the amount of the next best alternative givenup)/(the amount of the commodity produced)\n", "d", 0, 1, this.f547b));
        arrayList.add(new questions("21.", "Which one of the following represents transfer income? ", 0, 0, 0, 0, 0, "Gifts and subsidies", "Wages and salaries", "Personal disposable income ", "Factor income", "Transfer income are transaction such as gifts, remittances, donations etc because residents of a country receive them 'for free'. Nothing has to be paid in return.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("22.", "What is the role of the National Bank of Ethiopia?", 0, 0, 0, 0, 0, "Provision of loans to the individual farmers.", "Taxing the private sector. ", "Collecting interest income.", "Regulation of the financial sector. ", "One of the roles of the national bank of Ethiopia include regulating of the financial sector. The other choices are not the role of the national bank of Ethiopia.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("23.", "If an economic system is experiencing economic growth, which one of the following best expresses the situation?", 0, 0, 0, 0, 0, "The economy operates beyond its previous production possibility curve", "The economy operates within the production possibility curve to save its resources. ", "The economy moves along its production possibility curve to produce more of all goods.", "The Economy produces more of one goods than before.", "", "a", C2719R.C2721drawable.econ2011q23exp, 1, this.f547b));
        arrayList.add(new questions("24.", "The basic characteristic of the service sector is that it produces________________.", 0, 0, 0, 0, 0, "tangible goods", "commodities", "intangible goods ", "food", "The basic characteristics of the service sector is that it produces intangible goods.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("25.", "An increase in dependency ratio could be due to______________. ", 0, 0, 0, 0, 0, "decrease in number of children", "increase in the number of children", "decrease in old aged population", "increase in the economically active population", "An increase in dependency ratio could be due to an increase the number of inactive economic groups such as an increase in the number of old age or an increase number of children in the population.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("26.", "When does quantity supplied of a good increase? ", 0, 0, 0, 0, 0, "When the prices of goods related to the product decreases", "When the price of the food decreases. ", "When the price of factors of production increases", "When the price of the good increases ", "In a supply low other things being equal as the price of the commodity increases, the supply of the good also increase, that is there is a direct relationship between price of the good and supply of the good. As price of the good increase’s quantity supplied of a good also increase.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("27.", "An indifference curve shows", 0, 0, 0, 0, 0, "the same combinations of two goods which give equal satisfactions to the consumer. ", "various combinations of two goods which give equal satisfactions to the consumer. ", "various combinations of three goods which give equal satisfactions to the consumer.", "the combinations of three goods which give equal satisfactions to the consumer.", "", "b", C2719R.C2721drawable.econ2011q27exp, 1, this.f547b));
        arrayList.add(new questions("28.", "Real GDP is measured at___________ prices", 0, 0, 0, 0, 0, "current market ", "factor", "constant", "nominal", "Real GDP is measured at constant price where as Nominal GDP is measured at current market price.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("29.", "Which one of the following statements best expresses a characteristic of perfectly competitive market? ", 0, 0, 0, 0, 0, "There are a few large producers which can fix their prices freely", "Many producers supply homogenous products to the market. ", "Different producers set different prices for their products.", "Mobility of firms between different economic activities is limited. ", "Perfect competitive market is characterized by \n\tvery large number of buyers and sellers\n\thomogeneous products\n\tfree entry and exit of firms\n\tperfect knowledge\n\tperfect stability and\n\tabsence of transport cost\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("30.", "Which one of the following best expresses the relation between consumption and saving?", 0, 0, 0, 0, 0, "At breakeven point between income and consumption, there is no saving.", "Consumption is equal to income plus saving.", "Over-time consumption is dependent only on income.", "Saving is equal to consumption plus income. ", "Disposable income (Ya) is equal to consumption plus sharing ie. Y C+S therefore, when saving is zero YS. At breakeven point consumption is equal to income therefore saving will be zero.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("31.", "In foreign trade, the volume of trade represents:", 0, 0, 0, 0, 0, "money paid for goods bought from other countries ", "money received from selling goods to other countries", "all goods exported and imported", "only the goods exported to other countries", "Volume of trade represent the amount of currency that changes hands from sellers to buyers. It is money received from selling goods to other countries.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("32.", "Which one of the following is true about aggregate demand and aggregate supply?", 0, 0, 0, 0, 0, "They are useful in determining individual economic output and prices: ", "They are both affected by the same factors.", "Aggregate demand determines employment while aggregate supply determines the general price level. ", "They both determine the level of macroeconomic variables.", "In macroeconomics analysis we determine the level of overall economic activity in economy particularly the level of output, prices and employment through the interaction aggregate demand and aggregate supply. ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("33.", "Which one of the following equations expresses the condition at which a consumer maximizes his/her utility from consuming product A and B?", 0, 0, 0, 0, 0, "Total utility of A = total utility B", "(B) Marginal utility of A=Marginal utility of B ", "(Marginal utility of product A)/PA = ( Marginal utility of B )/PB", "Total utility=Income", "Condition at which the consumer maximizes his or her utility from consuming products A&B can be achieved when\n(Marginal utility of productA)/(price of A)=  (Marginal utility ofB)/(price of B)\n", "a", 0, 1, this.f547b));
        arrayList.add(new questions("34.", "Which one of the following factors is most likely to cause inflation? ", 0, 0, 0, 0, 0, "A reduction in government expenditure.", "A reduction in tax", "A reduction in investment", "A decrease in wages.", "Inflation can be caused either demand pull factors of cost push factors, among the given choice a reduction in tax increases the supply of money therefore it causes inflation the rest of the choices are measure which should be taken to reduce the inflation rate because they reduces the supply of money in the economy. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("35.", "Which of the following describes the characteristic of monopolistic completion?", 0, 0, 0, 0, 0, "Price completion is used by sellers.", "There is no free entry and exist.", "There is product differentiation as a means of completion.", "There are only a few sellers.", "Monopolistic competitive market refers to a situation where there are many sellers of differentiated products it is mainly characterized by having\n\tmany sellers\n\tproduct differentiation\n\tfree entry and exit of firms\n\tselling cost \n\tnon price completion and\n\tindependent price policy \n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("36.", "Which one of the following sources of revenue contributes the biggest proportion of tax-revenue in Ethiopia?", 0, 0, 0, 0, 0, "Land use fee", "Import duties (taxes)", "Domestic indirect taxes", "Export taxes", "The biggest proportion of tax-revenue in Ethiopia comes from import duties (tax). ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("37.", "Which one of the following functions of a government is best associated with defending the country against external enemies? ", 0, 0, 0, 0, 0, "Promoting economic efficiency to facilitate appropriate allocation of resources", "Regulation of the economy to ensure enforcement of policies", "Stabilizing the economy to minimize economic fluctuation ", "Provision of public goods to benefit all members of the society", "Regulation of the economy to ensure enforcement of police is the function of government which is best associated with defending the country against external enemies.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("38.", "From the industrial sector of Ethiopia, the largest contribution to GDP is made by____________.", 0, 0, 0, 0, 0, "The small-scale industries", "The handicrafts and electricity", "The big and medium manufacturing industries ", "The water and mineral sub-sectors.", "The GDP role of each component of the industrial sector in the national economy we find that large and medium scale manufacturing accounted for 4.3% small scale 2-01-1- and handcrafts 2.5% of the national output in the period spanning 1991-1999.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("39.", "Which one of the following best characterizes foreign exchange earnings contributions of the industrial sector in Ethiopia? ", 0, 0, 0, 0, 0, "It contributes more than 50% of the total foreign exchange earnings of the country.", "It contributes a smaller proportion of the total, which if below 20% of the total foreign exchange earnings of the country.", "It contributes more than the contribution of the agricultural sector.", "It contributes 30% of the total export earnings.", "More than 90% of the nation's foreign currency earning comes from the agriculture sector. The poorly developed industrial sector of Ethiopia contributes very little (below 20%) to the foreign currency carrying of the nation.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("40.", "Which one of the following best represents contractionary fiscal policy?", 0, 0, 0, 0, 0, "An increase in taxation", "An increase in government expenditure", "Reduction in government borrowings ", "Reduction in taxation", "Contractionary fiscal policy is a measure which can be taken place to control the situation of excess demand, the major instruments of contractionary fiscal policy are\n\tReducing government expenditure.\n\tIncreasing tax.\n\tGovernment (public) borrowing are instruments which reduces the excess demand. \n", "a", 0, 1, this.f547b));
        arrayList.add(new questions("41.", "What does the interaction between aggregate supply and aggregate demand determine?", 0, 0, 0, 0, 0, "Full employment", "The equilibrium output and the general price level", "The aggregate output", "Potential output", "The equilibrium output and the general price level determines the interaction between aggregate supply and aggregated demand.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("42.", "One most important role of trade is to:", 0, 0, 0, 0, 0, "Strengthen specialization/division of labor, which helps growth of productivity", "create the same demand for goods in all countries", "eliminate poverty through distribution of income", "equalize resource distribution among countries", "One most important role of trade is to strengthen specialization /division of labour which helps growth of productivity ", "a", 0, 1, this.f547b));
        arrayList.add(new questions("43.", "Which one of the following is not true about the relationship between total product and marginal product? ", 0, 0, 0, 0, 0, "When total product increases at a diminishing rate, marginal product decreases.", "When total product increases at an increasing rate, marginal product increases.", "When total product reaches a maximum, marginal product becomes positive.", "When total product begins to decline, marginal product becomes negative.", "The relationship between total product (TP) and marginal product (MP) is that:\n\tWhen TP increases at an increasing rate MP increase.\n\tWhen TP increases maximum MP becomes zero\n\tWhen TP begins to decline MP becomes negative. \n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("44.", "In economics, production is defined as the______________.", 0, 0, 0, 0, 0, "creation of resources", "saving of resources", "consumption of resource", "transformation of resources", "In economics production is defined as the transformation of inputs into outputs, production Input output therefore production is the transformation of resources. ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("45.", "In Ethiopia, the bank that serves as banker to the government is: ", 0, 0, 0, 0, 0, "The Commercial Bank of Ethiopia", "The Development Bank of Ethiopia", "The National Bank of Ethiopia.", "The treasury of the government", "In Ethiopia one of the roles of the national bank of Ethiopia is serving as banker to the government.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("46.", "From the Ethiopian tax law, it can be concluded that personal income tax in the country is: ", 0, 0, 0, 0, 0, "progressive", "regressive", "constant", "partly regressive & partly progressive", "From Ethiopian tax low it can be concluded that personal income tax in the country is progressive, because the tax rate increases an income increase.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("47.", "How does the domestic development of industrial sector affect the balance of payments of Ethiopia?", 0, 0, 0, 0, 0, "There will be no import of raw materials", "There will be increased manufactured goods export and larger foreign exchange earnings.", "There will be no import of goods", "There will be more employment in foreign countries and more net income from abroad ", "The domestic development of industrial sector can affect the balance of payment positively because as the domestic industrial sectors develops the amount export items increases by then it increases the foreign currency of the country. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("48.", "Which one of the following statements is not true about the circular flow of income representing the flow of goods, services and factors of production between firms and households?", 0, 0, 0, 0, 0, "Households provide factor services", "Firms provide payments for factor services ", "Firms provide goods and services", "Households provide payments for factor services ", "In a circular flow household are owners os factors of production, by selling this factor of production to the firms they earn income from the firms, and the firms produce goods and services using factors of production and in return they sale the goods and service to the households.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("49.", "How does individual supply differ from market supply?", 0, 0, 0, 0, 0, "Individual supply is the quantity of a commodity offered for sale by a firm while market supply is the various quantities offered for sale by all firms.", "Individual supply is the various quantities offered for sale by all firms while market supply is the quantity of a commodity offered for sale by a firm.", "Individual supply is downward sloping while market supply is upward sloping ", "Individual supply is upward sloping while market supply is downward sloping", "Individual supply is the quantity of a commodity offered for sale by individual firm while market supply is the quantity of a commodity (various quantity of a commodity) offered for sale by all firms. i.e. market supply is the sum of individual supplies.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("50.", "Which of the following commodities has the largest share in Ethiopian exports? ", 0, 0, 0, 0, 0, "Gold", "Pulses ", "Coffee", "Oils seeds", "Coffee has the largest share in Ethiopian export.", "c", 0, 1, this.f547b));
        arrayList.add(new questions("51.", "Which one of the following will be the outcome of a change in the income of the consumer on the consumer's demand keeping prices the same, which_____________? ", 0, 0, 0, 0, 0, "The demand curve shifts outwards indicating that more of the goods can be bought and consumed. ", "The consumer will move along the same demand curve and buys more of the goods she/he consumes.", "The demand curve remains at the previous level and the continues to live as before. ", "The quantity demanded of normal goods will fall.", "A demand curve shifts outward due to two conditions either when the price of the good decreases or when the income of the consumer increases. The outcome of a change income of the consumer on the consumer's demand keeping price the same. The demand curve shifts outwards indicating that more of the good can be bought and consumed.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("52.", "Which one of the following is a problem of the Ethiopian agricultural sector? ", 0, 0, 0, 0, 0, "Efficient marketing is available", "Excess supply of credit", "Excess supply of arable land", "Land fragmentation", "All of the choice except that of D are not the problem of the agriculture sector of Ethiopia but land fragmentation is one of the problems of the Ethiopian agriculture sector. ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("53.", "Which of the following is a true statement about marginal propensity to save?", 0, 0, 0, 0, 0, "Marginal propensity to save is larger for low-income groups.", "Marginal propensity to save larger for high income groups. ", "Marginal propensity to save is constant for high income groups. ", "Marginal propensity to save is constant for low income groups.", "The main properties of marginal propensity to save (MPS) are\n\tValue of MPS lies between 0 and 1. In other words 0< MPS < 1. and\n\tMPS increases with increase in income.\n\tThe MPS of the poor is lower than that of the rich. Therefore, MPS is larger for high income groups.\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("54.", "Which of the following one of the approaches to measurement of Gross Domestic product (GDP)? ", 0, 0, 0, 0, 0, "Computational approach ", "Income tax approach", "Production approach ", "Distributional approach", "We can look at national income from there angles as flow of goods and service, as flow of income or as flow of expenditure. Accordingly, there are three methods of measuring national income or GDP, these approaches are\n1.\tproduct approach\n2.\tincome approach and \n3.\texpenditure approach\n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("55.", "Which of the following is a correct assumption of the perfectively competitive market model?", 0, 0, 0, 0, 0, "Very few number of buyers but large number of sellers.", "Very large number of buyers and sellers.", "Very few number of buyers and sellers.", "Very large number of buyers but little number of sellers. ", "In a perfectly competitive market the correct assumptions are \n\tvery large number of buyers and sellers\n\thomogeneous products \n\tfree entry and exit of firms etc\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("56.", "How do you characterize Ethiopian education?", 0, 0, 0, 0, 0, "high-quality education ", "high similarity in all regions", "low quality education ", "low drop-out", "Low quality of education\n\thigh disparity between regions \n\tlow quality of education and\n\thigh drop-out are the main characteristics of Ethiopian education.\n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("57.", "A firm increases the number of its workers from 3 to 5 workers, and the total product increased from 30 to 46 Kgs. The marginal product of labor is", 0, 0, 0, 0, 0, "16 Kgs", "8Kgs", "15Kgs", "23Kgs ", "Given number of workers increased from 3 to 5 therefore AL = 2 and total product increased from 30 to 40Kg AQ = 16 (which is 46-30) \ntherefore, marginal product of labour MP^1=  AQ/AL=16/2= 8Kgs\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("58.", "Suppose that the quantity demanded of wheat is greater than the quantity supplied of wheat on a free market. Which one of the following happens to move the market to equilibrium? ", 0, 0, 0, 0, 0, "Price of wheat will decline", "Price of wheat will rise", "Less quantity of wheat will be supplied", "The prices of related goods will be reduced", "Suppose that the quantity demand (Qd)> (Qs) in a free market therefore to move the market in to equilibrium, the excess demand will create competition among buyers to buy wheat which is in short supply and push the price up till it reaches the equilibrium price where demand becomes equal to supply. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("59.", "Which one of the following statements best indicates the result of an increase in the price of a product on the satisfaction of a consumer?", 0, 0, 0, 0, 0, "The budget line and the indifference curve move outwards and the consumer consumes more of the two products.", "The budget line of the consumer moves parallel to the original one and the consumer finds a new level of satisfaction", "The consumer moves along the same indifference curve and finds a new equilibrium position on the previous budget line. ", "The budget line shifts inwards and becomes tangent to a lower indifference curve and the consumer consumes less of the products.", "Increase in the price of a product on the satisfaction of consumers, the budget line shifts inwards and become tangent to a lower indifference curve and the consumer consumes less of the product.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("60.", "When does the law of diminishing marginal returns start to operate? ", 0, 0, 0, 0, 0, "Just as soon as production begins", "When total product starts to increase at a decreasing rate", "when total product is at its maximum ", "After average product curve reaches its maximum.", "Diminishing marginal returns occur when marginal product starts to fall. This means that the total product will be increasing at decreasing rate This implies that marginal cost will rise as output increase eventually rising marginal cost will lead to a rise in average total cost.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("61.", "Which one of the following best shows the relationship between average product and marginal product? ", 0, 0, 0, 0, 0, "Average product reaches its maximum before marginal product.", "Average product is equal to marginal product when total product is at its maximum level. ", "Average product is equal to marginal product when average product is at its maximum level. ", "Marginal product starts to fall after average product begins to fall", "The relationship between average product (AP) and marginal product (MP) is that\nWhen MP > AP this means that AP is rising.\nWhen MP = AP this means that AP is maximum.\nWhen MP < AP this means that AP is falling.\n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("62.", "Which one of the following conditions could result in an increase in saving? ", 0, 0, 0, 0, 0, "the rate of interest paid by banks falls. ", "inequality of income between the rich and the poor increases.", "the level of direct taxes rises.", "a higher future income is expected", "An increase in saving could result in the fall of interest rates paid by banks.", "a", 0, 1, this.f547b));
        arrayList.add(new questions("63.", "Identify the correct statement about average variable and average fixed cost of a firm from the following statements. ", 0, 0, 0, 0, 0, "Average variable cost falls at first and then starts to rise", "Average fixed cost declines first and then rises ", "Average variable cost reaches its minimum when average fixed cost is at its maximum points ", "Average variable cost continuously falls as production increase. ", "Average variable cost falls at first then starts to rise as the output level increase AVC=TVC/Q as Q increase, AVC also increase.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("64.", "In the context of the theory of consumer behavior, what does the assumption of rationality refer to?", 0, 0, 0, 0, 0, "The marginal utility derived from additional units should increase", "The maximization utility subject to income constraint ", "As more and more is consumed, the total utility increases at an increasing rate ", "The maximization or profit subject to cost constraint.", "In the context of theory of consumer's behavior the assumption of rationality refer to a consumer aims to maximize his/her utility (subject to income and price) under condition of certainty.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("65.", "The long run profit is maximized when ", 0, 0, 0, 0, 0, "price is greater than average revenue.", "marginal revenue is greater than marginal cost. ", "price is higher than long run average cost.", "marginal cost-Marginal revenue", "The long run condition for profit maximization is that marginal cost (at long run) (LMC) equals to long-run marginal revenue (LMR) and LMC is rising. i.e MR = LMC (LMC is rising) and price or Average Revenue equals to long-run average cost. P = LAC ", "d", 0, 1, this.f547b));
        arrayList.add(new questions("66.", "Which one of the following resources is most necessary of sustainable development? ", 0, 0, 0, 0, 0, "Favorable environment and protected natural resources.", "Different types of minerals ", "A fast growing population", "Large areas of land.", "The most necessary resource for sustainable development is favorable environment and protected natural resource than the alternatives given other choices. ", "a", 0, 1, this.f547b));
        arrayList.add(new questions("67.", "Which of the following major minerals are currently producing Ethiopia?", 0, 0, 0, 0, 0, "Petroleum & platinum ", "Gold & Tantalum", "Gold & Diamond", "Gold & copper", "The major minerals which are currently produced in Ethiopia are Gold and Tantalum.", "b", 0, 1, this.f547b));
        arrayList.add(new questions("68.", "A disadvantage of a bimodal agricultural development policy is that it:", 0, 0, 0, 0, 0, "supports individual rights ", "prevents increased use of capital and investment in agriculture", "results in the eviction of poor peasants from land ", "prevents technological transfer", "The disadvantages of a bimodal agricultural development policy is that \n\tIt creates differentiation in the rural society.\n\tLack of off-farm job opportunities.\n\tPromotes the eviction of small peasants/poor people \n\tIt deprives the majority of the rural population of land.\n", "c", 0, 1, this.f547b));
        arrayList.add(new questions("69.", "The short run supply curve of a perfectly competitive firm is:", 0, 0, 0, 0, 0, "The rising part of the average variable cost. ", "The part of the marginal cost above the shutdown point.", "The part of the marginal cost curve above the breakeven point ", "The part of the average cost curve above the shutdown point.", "The marginal cost curve which lie above the minimum point of the AVC curve is the supply curve of the perfectly competitive firm in short run. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("70.", "Which one of the following formulae is used to measure unemployment rate? ", 0, 0, 0, 0, 0, "(No.of unemployed persons x100)/(Total labor force)  ", "(No.of unemployed persons x100)/(Total population.)  ", "(No.of unemployed persons x100)/( No.of employed persons)", "(No.of hidden unemployed personsx100 )/(Total population)", "Unemployment is usually measured on the ratio of the unemployed person to the total labor force in a country and is expressed in percentage terms. Thus\tRate of unemployment =(No of unemplolyed person)/(Total labour force)  x 100", "a", 0, 1, this.f547b));
        arrayList.add(new questions("71.", "A firm's total cost function is given by TC= 10-Q² +4Q³ where TC refers to total cost in Birr and Q refers to quantity produced in kilograms. When Q=2 kilogram, the average fixed and average variable costs are___________ and ______________Birr per kilogram respectively. ", 0, 0, 0, 0, 0, "5, 14", "5, 144", "14,5", "4, 10", "A Firms total cost function is given by\nTC=10-Q² + 4Q³ and Q = 2 \nThen, the average fixed cost (AFC) \nAFC =TFC/(Q)\nTC=TFC + TVC \nATC=TFC/Q+TVC/Q          ∴TFC=10\nAFC =10/( 2)=5\nTQ Q 10 2 =5 AFC =\nAVC =TVC/Q=(-Q^2+4Q^3)/2  AVC=(-4^2+4(2)^3)/2=(-4^2+32)/2=28/2= 14\n\n'^' this symbol means the power of", "n", 0, 1, this.f547b));
        arrayList.add(new questions("72.", "Suppose a consumer's consumption function is given as C = 200+0.8Yd (C-consumption. Yd disposable income). Its disposable income is 4000 birr, find total consumption and saving:", 0, 0, 0, 0, 0, "C=3000; saving=900", "C=3200; saving=1000", "C=3400,saving=800", "C=3600; saving=400", "No answer Suppose a consumer's consumption function is given as \nC =200 +08.8 Yd \nWhere C=consumption\nYd=disposable income \nYd=4,000 birr\nC= 200+ 0.8(4000)\nC=3200 + 200 = 3400\n", "n", 0, 1, this.f547b));
        arrayList.add(new questions("73.", "The short run production F(K, L) is expressed as a function of Capital K and labor L as follows: F(k,L)=K^0.5 L^0.5. If we keep capital at constant, K=1 and but increase labor from 4 to 9, what will be the marginal product of labor? ", 0, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_2D, "5", "0.2", "4", "No answer\nYd=C+S\n4000=3400+ S\nS=4000-3400=∶ C = 3400,S =600\n", "n", 0, 1, this.f547b));
        arrayList.add(new questions("74.", "Suppose the Quantity supplied (Qs) and Quantity demanded (Qd) of \"teff\" is given as follows:Qs-5P-10\nQd-35-10P what is the equilibrium Quantity? \n", 0, 0, 0, 0, 0, "10", "5", "15 ", ExifInterface.GPS_MEASUREMENT_3D, "Given\nQs = 5p - 10 \nQ₁ = 35-10p\nAt equilibrium Qs = d \n5p-10=35-10p=15p = 45\np=3 equilibrium price\nThen 15(3)-10-35-10(3) 15-10-35-30-5 equilibrium quantity.\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("75.", "Given the following information, calculate the Nominal and Real GDP: Household consumption expenditure=16 billion birr\nGovernment expenditure=3 billion birr\nExport=3 billion birr\nGross investment=2-billion-birr Import-4 billion birr\nCPI/consumer price index=125 The real GDP is\n", 0, 0, 0, 0, 0, "24 billion birr", "16 billion birr", "21 billion birr", "20 billion birr", "GDPmp = C+Ig+G+ (X-m)\n= 16 billon + 2billion + 3billion +(3billion - 4billion)\n= 21billion-1billion = 20billion Nominal GDP\nReal GDP =Nominal GDP/(price index of current yr)  x 100\n=20billion/( 125) x 100= 16billion\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("76.", "Which one of the following is true about a floating exchange rate? It is: ", 0, 0, 0, 0, 0, "determined by the government", "hybrid of fixed and floating systems", "pegged to other currencies", "determined by the market forces", "Floating exchange rate is the rate which is determined by for forces of supply and demand in the foreign exchange market. There is no (official) government intervention.", "d", 0, 1, this.f547b));
        arrayList.add(new questions("77.", "When the quantity supplied of a product falls short of the quantity demanded and the competitive price is above the ability of the purchasing power of the poor, the government can fix a price known as:  ", 0, 0, 0, 0, 0, "Price ceiling", "Floor price", "Price range", "Subsidized price", "When the supply of a commodity is so short that it creates shortage in the market and common consumers are unable get the commodity from the market competitive prices are so high that they become out of reach for common consumers, only the rich can purchase and consume the commodity. In such a situation government comes forward and fixed the maximum price for the commodity. This process is known as price ceiling. ", "a", 0, 1, this.f547b));
        arrayList.add(new questions("78.", "Which of the following is true about the effects of changes in demand supply?", 0, 0, 0, 0, 0, "Increase in demand decreases the equilibrium price. and", "Increase in demand increases the equilibrium price. ", "Increase in supply increases the equilibrium price. ", "Decrease in supply decreases the equilibrium price.", " Increase in demand when supply remain constant both equilibrium quantity and equilibrium prices increase.\nDue to increase in demand equilibrium price increased from P to P₁ and equilibrium quantity increased from Q to Q₁.\n", "b", 0, 1, this.f547b));
        arrayList.add(new questions("79.", "What does currency devaluation refer to?", 0, 0, 0, 0, 0, "An increase in the value of a currency by government", "A decrease in the value of a currency by the government ", "A decrease in the value of a current by market forces", "An increase in the value of a currency by market forces. ", "Under fixed exchange rate the value of a currency in terms of another currency is determined by the government therefore under fixed exchange rate. When the government decrease the value of the currency in terms of another currency it is called devaluation and when it increases the value of the currency it is called revaluation. ", "b", 0, 1, this.f547b));
        arrayList.add(new questions("80.", "The amount of utility that a consumer expects to get from consuming an additional unit of an item is:", 0, 0, 0, 0, 0, "total utility from the last unit ", "the amount of total ordinal utility from an additional unit ", "marginal rate of substitution for the last unit", "marginal utility from an additional unit.", "Marginal utility is a satisfaction that a consumer expects to get from consuming an additional unit of an item.", "d", 0, 1, this.f547b));
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
        this.f548tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    economics2011.this.timer.setVisibility(0);
                    economics2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    economics2011.this.scr.setVisibility(8);
                    economics2011.this.chr.stop();
                    economics2011.this.toolbar.setVisibility(8);
                    economics2011.this.Relative.setBackgroundColor(-7829368);
                    economics2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2011.this.getBaseContext());
                    int unused = economics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = economics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = economics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = economics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = economics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = economics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = economics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = economics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = economics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = economics2011.this.highscoreEconomics2011 = defaultSharedPreferences.getInt("econ2011hs", 0);
                    int access$600 = economics2011.this.part1 + economics2011.this.part2 + economics2011.this.part3 + economics2011.this.part4 + economics2011.this.part5 + economics2011.this.part6 + economics2011.this.part7 + economics2011.this.part8 + economics2011.this.part9;
                    economics2011.this.resultText.setText(String.valueOf(access$600));
                    economics2011.this.progressbar.setProgress(access$600);
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
                    int unused11 = economics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = economics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = economics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = economics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = economics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = economics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = economics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = economics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "econ2011hs";
                    int unused19 = economics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = economics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = economics2011.this.answered1 + economics2011.this.answered2 + economics2011.this.answered3 + economics2011.this.answered4 + economics2011.this.answered5 + economics2011.this.answered6 + economics2011.this.answered7 + economics2011.this.answered8 + economics2011.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > economics2011.this.highscoreEconomics2011) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 75;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - economics2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1econ111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1econ112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1econ113", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1econ114", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1econ115", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1econ116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1econ117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1econ118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1econ119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1econ1110", 0);
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
                        editor.putString("scoreecon111", str3);
                        editor.putLong("date1econ111", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreecon112", str5);
                            editor.putLong("date1econ112", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreecon113", str5);
                            editor.putLong("date1econ113", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreecon114", str5);
                            editor.putLong("date1econ114", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreecon115", str5);
                            editor.putLong("date1econ115", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreecon116", str5);
                            editor.putLong("date1econ116", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreecon117", str5);
                            editor.putLong("date1econ117", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreecon118", str5);
                            editor.putLong("date1econ118", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreecon119", str5);
                            editor.putLong("date1econ119", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreecon1110", str5);
                            editor.putLong("date1econ1110", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateecon111", 0);
                    long j12 = defaultSharedPreferences.getLong("dateecon112", 0);
                    long j13 = defaultSharedPreferences.getLong("dateecon113", 0);
                    long j14 = defaultSharedPreferences.getLong("dateecon114", 0);
                    long j15 = defaultSharedPreferences.getLong("dateecon115", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateecon116", 0);
                    long j17 = defaultSharedPreferences.getLong("dateecon117", 0);
                    long j18 = defaultSharedPreferences.getLong("dateecon118", 0);
                    long j19 = defaultSharedPreferences.getLong("dateecon119", 0);
                    long j20 = defaultSharedPreferences.getLong("dateecon1110", 0);
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
                        editor2.putString("iScoreecon111", str4);
                        editor2.putLong("dateecon111", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreecon112", str6);
                            editor2.putLong("dateecon112", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreecon113", str6);
                            editor2.putLong("dateecon113", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreecon114", str6);
                            editor2.putLong("dateecon114", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreecon115", str6);
                            editor2.putLong("dateecon115", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreecon116", str6);
                            editor2.putLong("dateecon116", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreecon117", str6);
                            editor2.putLong("dateecon117", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreecon118", str6);
                            editor2.putLong("dateecon118", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreecon119", str6);
                            editor2.putLong("dateecon119", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreecon1110", str6);
                            editor2.putLong("dateecon1110", l.longValue());
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
                        economics2011.this.scr.setVisibility(8);
                        economics2011.this.chr.stop();
                        economics2011.this.toolbar.setVisibility(8);
                        economics2011.this.Relative.setBackgroundColor(-7829368);
                        economics2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2011.this.getBaseContext());
                        int unused = economics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = economics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = economics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = economics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = economics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = economics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = economics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = economics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = economics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = economics2011.this.highscoreEconomics2011 = defaultSharedPreferences.getInt("econ2011hs", 0);
                        int access$600 = economics2011.this.part1 + economics2011.this.part2 + economics2011.this.part3 + economics2011.this.part4 + economics2011.this.part5 + economics2011.this.part6 + economics2011.this.part7 + economics2011.this.part8 + economics2011.this.part9;
                        TextView access$1600 = economics2011.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        economics2011.this.progressbar.setProgress(access$600);
                        economics2011.this.progressbar.setMax(80);
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
                        int unused11 = economics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = economics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = economics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = economics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = economics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = economics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = economics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = economics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = economics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = economics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = economics2011.this.answered1 + economics2011.this.answered2 + economics2011.this.answered3 + economics2011.this.answered4 + economics2011.this.answered5 + economics2011.this.answered6 + economics2011.this.answered7 + economics2011.this.answered8 + economics2011.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > economics2011.this.highscoreEconomics2011) {
                            edit.putInt("econ2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - economics2011.this.chr.getBase()) / 1000;
                        String str = "dateecon1110";
                        String str2 = "dateecon119";
                        String str3 = "dateecon118";
                        String str4 = "dateecon117";
                        String str5 = "dateecon116";
                        String str6 = "dateecon115";
                        String str7 = "dateecon114";
                        String str8 = "dateecon113";
                        String str9 = "dateecon112";
                        String str10 = "dateecon111";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1econ1110";
                        String str12 = "date1econ119";
                        if (economics2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1econ111", 0);
                            String str13 = "date1econ111";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1econ112", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1econ113", 0);
                            long j4 = defaultSharedPreferences.getLong("date1econ114", 0);
                            long j5 = defaultSharedPreferences.getLong("date1econ115", 0);
                            String str16 = "date1econ115";
                            String str17 = "date1econ114";
                            String str18 = "date1econ116";
                            long j6 = defaultSharedPreferences.getLong("date1econ116", 0);
                            long j7 = defaultSharedPreferences.getLong("date1econ117", 0);
                            String str19 = str12;
                            String str20 = "date1econ118";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1econ117";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1econ113";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1econ118", 0));
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
                                editor3.putString("scoreecon111", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreecon112", str25);
                                    editor3.putLong("date1econ112", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreecon113", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreecon114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreecon115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreecon116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreecon117", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreecon118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreecon119", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreecon1110", str25);
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
                                editor4.putString("iScoreecon111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreecon112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreecon113", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreecon114", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreecon115", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreecon116", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreecon117", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreecon118", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreecon119", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreecon1110", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1econ111";
                            String str30 = "date1econ114";
                            String str31 = str12;
                            String str32 = "date1econ113";
                            String str33 = "date1econ117";
                            String str34 = "date1econ116";
                            String str35 = str11;
                            String str36 = "date1econ115";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1econ112", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1econ112";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1econ118";
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
                                editor2.putString("scoreecon111", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreecon112", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreecon113", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreecon114", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreecon115", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreecon116", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreecon117", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreecon118", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreecon119", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreecon1110", str49);
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
                                editor.putString("iScoreecon111", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreecon112", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreecon113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreecon114", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreecon115", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreecon116", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreecon117", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreecon118", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreecon119", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreecon1110", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        economics2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2011.this.scr.setVisibility(8);
                economics2011.this.chr.stop();
                economics2011.this.toolbar.setVisibility(8);
                economics2011.this.Relative.setBackgroundColor(economics2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                economics2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2011.this.scr.setVisibility(0);
                economics2011.this.toolbar.setVisibility(0);
                economics2011.this.telegram_layout.setVisibility(8);
                economics2011.this.chr.start();
                economics2011.this.Relative.setBackgroundColor(economics2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = economics2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = economics2011.this.mInterstitialAd = null;
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
                economics2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
