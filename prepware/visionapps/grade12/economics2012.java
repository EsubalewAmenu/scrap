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

public class economics2012 extends AppCompatActivity {
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
    private Boolean f549b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEconomics2012;
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
    private Toolbar f550tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_economics2012);
        this.f549b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEconomics2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_economics2012);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following is a micro economic issue? ", 0, 0, 0, 0, 0, "The Ethiopian economy experienced rapid economic growth last year. ", "Unemployment rate soared in Ethiopian in recent year. ", "Inflation dramatically increased in Ethiopian in the previous year. ", "The price of edible of increased in Ethiopia in the previous year. ", "Microeconomics is a branch of economics that studies the behavior of individuals and firms in making decisions regarding the allocation of scarce resources and the interactions among these individuals and firm. For example, the price of edible ill increased in Ethiopia over the last 2 months", "d", 0, 1, this.f549b));
        arrayList.add(new questions("2.", "The opportunity cost of any economic action is ", 0, 0, 0, 0, 0, "The monitory cost but not the time required. ", "The time required but not the monitory cost. ", "All the possible alternative forgone. ", "The next best alternative forgone. ", "The opportunity cost is time spent studying and that money to spend on something else. A farmer chooses to plant wheat, the opportunity cost is planting a different crop, or an alternate use of the resources (land and farm equipment) OPP Cost-FD-CD.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("3.", "Shortage of economic resource mainly implies that people must ", 0, 0, 0, 0, 0, "Cooperate to satisfy their wants ", "Trade to satisfy their wants ", "Make choice to satisfy their wants ", "Compete to satisfy their wants ", "A scarcity of resources arises when the resources or means to fulfill an end are either limited or costly. Scarcity is an economic problem ", "d", 0, 1, this.f549b));
        arrayList.add(new questions("4.", "The major role entrapment can play in an economy is ", 0, 0, 0, 0, 0, "telling consumers what they should want or expected from the business environment. ", "taking risks to crate business that yield products that meet the wants and need of consumers ", "borrowing money from financial institution to start their businesses. ", "Providing loans to financial companies at high rates of interest ", "Entrepreneurship is one of the most important input in the economic development of a country. The entrepreneur acts as a trigger head to give spark to economic activities by his entrepreneurial decisions. An entrepreneur supplies risk capital as a risk taker, and monitors and controls the business activities ", "b", 0, 1, this.f549b));
        arrayList.add(new questions("5.", "The low of demand states that, ceteris paribus, the higher the price of a good, ", 0, 0, 0, 0, 0, "The smaller is the demand for the good ", "The larger is the demand for the good ", "The larger is the quantity of the good demanded. ", "The smaller is the quantity of the good demand. ", "The law of demand states that other factors being constant (cetris peribus), price and quantity demand of any good and service are inversely related to each other. When the price of a product increases, the demand for the same product will fall. ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("6.", "A decrease in quantity demanded due to a rise in the price of the commodity is, graphically, represented by a ", 0, 0, 0, 0, 0, "movement down and to the right along a demand curve. ", "movement up and to the left along demand curve. ", "leftward shift in the demand curve. ", "right wards shift in the demand curve. ", "On a graph, a decrease in quantity demanded moves leftward from two to one when the price rise.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("7.", "Which of the following is a determine of the demand for good Y? ", 0, 0, 0, 0, 0, "Fiscal policy of the government ", "The cost of labor used to produce good Y.", "The number of sellers of good Y ", "The income of consumers who why good Y ", "The Five Determinants of Demand for good \"Y\" \n•\tThe price of the good or service.\n•\tThe income of buyers.\n•\tThe prices of related goods or services-either complementary and purchased along with a particular item, or substitutes and bought instead of a product.\n•\tThe tastes or preferences of consumers will drive demand. \n•\tConsumer expectations.\n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("8.", "A Business Collage decides to increase tuition fees aiming to get higher total revenue. This strategy will however, work if the demand for education at that business College is ", 0, 0, 0, 0, 0, "price- inelastic demand ", "price- elastic demand ", "unit elastic demand ", "perfectly elastic demand ", "A business College decided to increase tuition fee aiming to get higher total revenue. This strategy will however work if the demand for education at that collage is Price-inelastic demand. An inelastic service on the other hand, is defined as one where a change in price does not significantly impact demand for that service.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("9.", "A long run demand curve, as compared to a short- run demand curve for the same commodity, is generally ", 0, 0, 0, 0, 0, "more elastic ", "less elastic ", "of the same elasticity ", "cannot be determined ", "Price elasticity of demand is usually lower in the short run, before consumers have much time to react, than in the long run, when they have greater opportunity to find substitute goods. Thus, demand is more price elastic in the long run than in the short run. Micro economic problems. ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("10.", "If the cross-price elasticity of demand for two products is -25, then the products are ", 0, 0, 0, 0, 0, "substitute and demand is cross price inelastic ", "complement and demand is cross price elastic ", "substitute and demand is cross price elastic ", "complement and demand is cross price inelastic ", "Cross price elasticity of demand (XED) for two products is -2.5, then the product area perfect complements that must be consumed in fixed proportion.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("11.", "For a rational consumer, total utility will be a maximum when ", 0, 0, 0, 0, 0, "marginal utility equals total utility. ", "marginal utility equals average utility. ", "average utility is zero ", "marginal utility is zero ", "Total utility is maximum when the marginal utility of the last unit purchased is equal to the price of the good. (MU=P) or (MU - P=0) or MU/P = This is the standard model of an economically rational consumer deciding how much to purchase of two market goods with different prices within a budget.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("12.", "Indifference curves are convex to the origin because we assume that two consumption goods are", 0, 0, 0, 0, 0, "perfect substitutes ", "perfect complements ", "imperfect substitutes ", "unrelated", "Indifference curves are convex to the origin because as the consumer begins to increase his or her use of one good over another, the curve represents the marginal rate of substitution. The marginal rate of substitution goes down as the consumer gives up one good for another, so it is convex to the origin.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("13.", "A decrease in income of consumer with no changes in the price of either good will cause, assuming both goods are normal ", 0, 0, 0, 0, 0, "a rotation of the budget line along the horizontal axis. ", "an inward shift of the budget line. ", "and outward shift of the budget line ", "no change in the budget line ", "A decrease in income of consumer with no change in price of either good will causes assuming both goods are normal result inward shift of the budget line.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("14.", "In the ordinary theory of utility, the income Consumption Curve (ICC) shows the way in which ", 0, 0, 0, 0, 0, "consumption varies as price of a commodity changes ", "consumption varies as prices of two commodities change ", "income is affected as prices of two commodities change ", "consumption varies as income of the consumer changes. ", "In economics and particularly in consumer choice theory, the income consumption curve is a curve in a graph in which the quantities of two goods are plotted on the two axes; the curve is the locus of points showing the consumption bundles chosen at each of various levels of income.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("15.", "Which one of the following is true statement of a short run production function with one variable input? ", 0, 0, 0, 0, 0, "When AP Curve is rising, MP is higher than AP", "MP is above AP when Ap is falling. ", "The lowest average product (AP)occurs where AB and marginal product (MP) are equal to each other. ", "AP and MP curves meet at MP's maximum point. ", "Initially, production with one variable input (labor) follows the law of increasing returns. According to this law, output would increase at an increasing rate as the quantity of labor increases. At the end of the stage of diminishing returns, i.e., at L = L2, the firm's output reaches the maximum.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("16.", "The economic definition of market includes expect ", 0, 0, 0, 0, 0, "place or an arrangement where buyers and sellers intricate to exchange goods and services. ", "Merrily physical place where commodities bought and sold. ", "a place or structure in which buyers and sellers of a commodity remain in contact. ", "a place or mechanism by which buyers and sellers are able to exchange goods or services for money. ", "A market is a place where buyers and sellers can meet to facilitate the exchange or transaction of goods and services. Other examples include the black market, auction markets, and financial markets. Markets establish the prices of goods and services that are determined by supply and demand.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("17.", "In monopolistic competition firms maximize profit at the level of output at which ", 0, 0, 0, 0, 0, "Marginal revenue =Average revenue ", "Marginal revenue =Marginal cost and Marginal cost falling ", "Marginal revenue =Marginal cost and Marginal cost rising ", "Marginal revenue -Average cost ", "The monopolistic competitive firm maximizes profits where marginal revenue equals marginal cost. A monopolistic competitive firm's demand curve is downward sloping, which means it will charge a price that exceeds marginal costs.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("18.", "Produce operating in monopolistically competitive markets are likely to ", 0, 0, 0, 0, 0, "produce up to the point where marginal revenue is greater than marginal cost. ", "make only normal profits in the short-run. ", "differentiate their products. ", "allocate efficiency in the short-run ", "Producer operating in monopolistically competitive market are likely produce up to the point where marginal revenue is greater than marginal cost. Profit maximized where Monopolistically competitive firms maximize their profit when they produce at a level where its marginal costs equal its marginal revenues.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("19.", "In a given society which one is NOT considered as a cost of youth unemployment? ", 0, 0, 0, 0, 0, "Loss of skills by the unemployed ", "Ensuing socio-political unrest ", "Crime expansion ", "Youth empowerment ", "In a given society youth empowerment is not considered as a cost of youth unemployment. increase in injections into the", "d", 0, 1, this.f549b));
        arrayList.add(new questions("20.", "An increase in injections in to the economy may lead to an outward shift of aggregate ", 0, 0, 0, 0, 0, "Demand and demand-pull information ", "Demand and cost-push inflation ", "Supply and demand-pull inflation. ", "Supply and cost-push inflation ", "An economy may lead to an outward shift of aggregate demand and demand-pull inflation. ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("21.", "Which one of the following may give rise for a cost-push inflation? ", 0, 0, 0, 0, 0, "Economic growth (increase in per capita of income of individuals in a given society) ", "Raped population growth ", "Increase in money supply-due to deficit financing ", "Increase in wages and prices of raw materials ", "Cost-push inflation occurs when overall prices increase (inflation) due to increases in the cost of wages and raw materials.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("22.", "A devolution of the Ethiopian birr may have inflationary consequences in the Ethiopian economy mainly because it", 0, 0, 0, 0, 0, "increases the cost of exports. ", "decreases the international competitiveness of Ethiopia producers.", "increases the cost of imported goods. ", "discourages exports. ", "The devaluation of the Ethiopian Birr may have inflationary consequences in Ethiopian economy mainly because it is reducing the cost of a country's exports and can help shrink trade deficits.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("23.", "Which of the following is a capital expenditure of the government budget? ", 0, 0, 0, 0, 0, "Pension payment ", "Repayment of public ", "Salaries of civil servant ", "purchase of machineries ", "Capital expenditure is the part of the government spending that goes into the creation of assets like schools, colleges, hospitals, roads, bridges, dams, railway lines, airports and seaports.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("24.", "The primary use of national income accounting is to year ", 0, 0, 0, 0, 0, "asses the economic efficiency of specific industries in an economic in a ", "determine whether there is a fair and equitable distribution of income in  an economy in a year. ", "Measure the value of goods and service produced in an economy in ", "Present yearly data that can be understood only by accountant year. ", "The primary use of national income accounting is as a tool to set economic policy by measuring the economic activity of a country, including gross domestic product and unemployment figures or measures the values of goods and service produced in economic year.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("25.", "Which one of the following is fundamentally true? ", 0, 0, 0, 0, 0, "Nominal GDP is always larger than real GDP. ", "Real GDP is always larger than Nominal GDP. ", "Real GDP control for change in population. ", "Real GDP control for change in price. ", "How Does Nominal GDP Compare to Real GDP? While nominal GDP by definition reflects inflation, real GDP uses a GDP deflator to adjust for inflation, thus reflecting only changes in real output. Since inflation is generally a positive number, a country's nominal GDP is generally higher than its real GDP.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("26.", "The difference between Gross Nati products (GNT) and their Net National Product (NNP) is ", 0, 0, 0, 0, 0, "The net factor income from abroad ", "Net export ", "Capital conception allowance or Deprecation. ", "Net taxes ", "The difference between GNP and NNP; NNP is often examined on an annual basis, as a way to measure a nation's success in continuing minimum production standards Net national product (NNP) is Gross National Product (GNP), the total value of finished goods and services produced by a country's citizens overseas and domestically, minus depreciation.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("27.", "Which one of the following is NOT main property of marginal propensity of Consumer (MPC)? ", 0, 0, 0, 0, 0, "MPC is greater than zero, but less than one. ", "MPC rise with increase in income of the consumer. ", "MPC of rich people is generally higher than those of poor people ", "MPC is stable in the short-run ", "The marginal propensity to consume (MPC) is equal to AC/AY, where AC is the change in consumption, and AY is the change in income. If consumption increases by 80 cents for each additional dollar of income, then MPC is equal to 0.8/1=0.8. MPC rise with increase in income of the consumer.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("28.", "The sum of marginal propensity to consumer (MPC)and Marginal propensity to save (MPC) is always equal to ", 0, 0, 0, 0, 0, "Unity ", "Zero ", "greater unity ", "less than unity ", "The sum of MPC and MPS is equal to unity (i.c., MPC + MPS = 1). ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("29.", "International free trade is based on the principle of ", 0, 0, 0, 0, 0, "Increasing economies of scale. ", "Comparative advantage. ", "Constant economies of scale. ", "Production possibility advantage. ", "The basis of international trade lies in the diversity of economic resources in different countries. All countries are endowed by nature with the same productive facilities. ... Economists cite Ricardo's theory of Comparative Advantage as the first principle of international trade.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("30.", "When a country's imports are more than exports, the country is said to have a ", 0, 0, 0, 0, 0, "Favorable foreign trade. ", "Positive value of trade. ", "trade deficit.", "trade balance.", "A trade deficit occurs when a country's imports exceed its exports during a given time period.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("31.", "balance of trade commonly refers to ", 0, 0, 0, 0, 0, "The goods and services that inter in to country in the form of purchases from other countries in a year. ", "The goods and service that level the country's frontiers in the form of sales in a year. ", "The value of exports plus the value of imports during a given year. ", "The different between the amount of foreign currency received on account of exports and the payment made for imports in a year. ", "Balance of trade (BOT) is the difference between the value of a country's exports and the value of a country's imports for a given period. Balance of trade is the largest component of a country's balance of payments (BOP).", "c", 0, 1, this.f549b));
        arrayList.add(new questions("32.", "In affixed exchange rate system, if there is disequilibrium in the balance of payments, causing excess demand for hard currency, the central bank of the country has to ", 0, 0, 0, 0, 0, "sell the required quantities of foreign exchange to eliminate the excess demand. ", "sell the required quantities of foreign exchange to eliminate the excess supply. ", "buy the required quantities of foreign exchange to eliminate the excess demand. ", "buy the required quantities of foreign exchange to eliminate the excess Supply. ", "A fixed exchange rate is a regime applied by a government or central bank that ties the country's official currency exchange rate to another country's currency or the price of gold. The purpose of a fixed exchange rate system is to keep a currency's value within a narrow band. In case there is disequilibrium in the balance of payments, causing excess demand or excess supply of foreign exchange, the central bank of the country has to buy or sell the quantities of foreign exchange required to eliminate the excess demand or supply.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("33.", "In floating exchange rate system, if the exchange rate is above the equilibrium level there is excess ", 0, 0, 0, 0, 0, "demand and the exchange rate should fall. ", "supply and the exchange rate should fall. ", "demand and the exchange rate should rise. ", "supply and the exchange rate should rise. ", "The floating exchange rate is the rate which is determined by forces of supply and demand in the foreign exchange market. There is no (official) government intervention. If the exchange rate is above the equilibrium level there is excess demand rate and exchange rate should fall.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("34.", "A contractionary fiscal policy could include ", 0, 0, 0, 0, 0, "lower interest rates.", "increased leading by banks", "a decrease in corporation tax. ", "a decrease in discretionary government spending ", "Contractionary fiscal policy is when the government either cuts spending or raises taxes. It gets its name from the way it contracts the economy. It reduces the amount of money available for businesses and consumers to spend.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("35.", "which one of the following is NOT an instrument of expansionary monetary policy ", 0, 0, 0, 0, 0, "lowering bank discount rate. ", "Buying government bonds and securities from commercial banks. ", "Lowering Cash Reserve Ratio (CRR) ", "Selling securities and bounds to commercial banks. ", "Expansionary monetary policy works by expanding the money supply faster than usual or lowering short-term interest rates. he three key actions by the Fed to expand the economy include a decreased discount rate, buying government securities, and lowered reserve ratio. One of the greatest examples of expansionary monetary policy happened in the 1980s.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("36.", "According to the recent national statistical report, the contribution of mining sub-sector to the Ethiopian GDP is about_________", 0, 0, 0, 0, 0, "1% ", "10%  ", "5% ", "0.1% ", "Mining contributes only about 1% to Ethiopia's GDP. Gold, marble, limestone and tantalum are the major minerals mined in Ethiopia.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("37.", "The current media age for the Ethiopia population is about ", 0, 0, 0, 0, 0, "10 years ", "20 Years ", "30 years ", "40 years on environment ", "The current median age for Ethiopian Population is about 20 years. (The median age in Ethiopia is 19.5 years.)", "b", 0, 1, this.f549b));
        arrayList.add(new questions("38.", "Ethiopian has ratified the following international agreement except ", 0, 0, 0, 0, 0, "Ozone layer protection. ", "Hazardous wastes.", "law of the sea.", "climate-change-Kyoto protocol ", "Ethiopia has accepted the following international agreements on environment: Biodiversity, Climate Change, Climate-Change-Kyoto Protocol, Desertification, Endangered Species, Hazardous Wastes, Ozone Layer Protection.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("39.", "Under the Derg regime, the following national development plan were introduced except ", 0, 0, 0, 0, 0, "Nationalization", "Cooperation campaign", "Strategies of cooperation and Establishment of state farms.", "Peace, Democracy and Development programs.", "The 1974 revolution by the Derg resulted in the establishment of a socialist state which aimed at the nationalization and restructuring of the Ethiopian economy.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("40.", "Under EPRDF regime, Ethiopian relatively enjoyed the highest economic growth rate during the economic plan of", 0, 0, 0, 0, 0, "Sustainable development and poverty Reduction program (SDPRP). ", "Plan for Accelerated and Sustained development to end poverty (PASDEP). ", "Growth and Transformation plan I ", "Growth and Transformation plan II.", "Under EPRDF regime Ethiopia relatively enjoyed the highest economic growth rate during the economic plan Sustainable Development and Poverty Reduction Programme (SDPRP)", "a", 0, 1, this.f549b));
        arrayList.add(new questions("41.", "The following are true of Bi-modal agricultural strategy except it", 0, 0, 0, 0, 0, "Supports individually rights to acquire land.", "Promotes large scale - diversification ", "Creates off-farm jobs opportunity", "Allows the transfer of technology. ", "Bi-modal is an agricultural development pathway that advocates the practices both of the intensification of small peasant farms and of commercialization. Its advantages include:\n•\tIt supports individual rights to acquire land \n•\tIt invites more capital and technology investment for agriculture\n•\tIt promotes large-scale diversification\n•\tIt allows the transfer of technology\n", "a", 0, 1, this.f549b));
        arrayList.add(new questions("42.", "Which of the following is not true about the agriculture sector in Ethiopia? ", 0, 0, 0, 0, 0, "It has contributed the largest share to the country's GDP in recent years.", "It is dominated by small holder farm system.", "It is the ministry of the Ethiopian population.", "It covers the largest share in terms of export earnings.", "The agricultural sector of Ethiopian is composed of the crop-production, livestock, forestry, and fishery sub-sectors. About 65% of the sector's GDP comes from crop-production, while animal husbandry contributes 25%. The remaining 10% is generated from the allied sectors, forestry, fishing and others. ", "c", 0, 1, this.f549b));
        arrayList.add(new questions("43.", "Challenges in an attempt to transform the Ethiopian agricultural sector include except", 0, 0, 0, 0, 0, "Inappropriate pricing policy towards agricultural lands property. ", "Inappropriate entitlement of lands property.", "Credit offerings at lower interest rates.", "Inductee rural markets.", "According to the studies made so far, the agricultural sector's problems identified fall into two major categories: \n\tNatural problems-Unpredictable Weather Conditions\n\tHuman-Made Problems\n•\tLand fragmentation: \n•\tLack of infrastructure\n•\tLack of credit facilities\n•\tLack of effective land-ownership entitlement\n•\tErosion and land degradation:\n•\tTraditional practices\n•\tThe use of backward technology.\n•\tInadequate rural markets\n", "c", 0, 1, this.f549b));
        arrayList.add(new questions("44.", "To mitigate the problems affecting the Ethiopian agricultural sector, it is important to take the following possible remedies except ", 0, 0, 0, 0, 0, "reduce the prevailing heavy dependence on rain- fed agricultural practices.", "promote commuted literacy companies to help farmers understand price and farm technique information. ", "pursue an effective land -owner ship right and a way farmers can develop long-term farm practices. ", "use capital intensive technology.", "Possible Remedies: to reduce or mitigate the problems affecting the agricultural sector of Ethiopia, the following possible remedies are proposed.\n•\tReduce the prevailing heavy dependence on rain-fed agricultural practices.\n•\tProduction of drought-resistant crops in drought-prone areas so that.\n•\tthe recurrence of acute shortages of food will be minimized.\n•\tPursue an effective land-ownership right so that the farmers will develop long-term developmental commitments.\n•\tPromotion of extension services supported with consistent capacity building tasks.\n•\tPromote committed literacy campaigns to help farmers understand price and farm-technique information. Promote infrastructure facilities as per their availability.\n•\tInclusion of the issue in school curricula. \n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("45.", "The industrial group that have recently contributed most to the Ethiopia foreign exchange earnings are ", 0, 0, 0, 0, 0, "food-beverage and textiles.", "a consumer bias against local products ", "strong competition from imported goods.", "metals and non-metals. ", "The contribution of the food -beverage and textiles about 48% among the industrial groups to the manufacturing sector for the year 2007/08. ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("46.", "The Ethiopian industrial sector is characterized by the following except ", 0, 0, 0, 0, 0, "absence of adequate educational support.", "a consumer bias against local products. ", "strong computation from imported goods.", "Usage of labor-intensive technology. ", "The manufacturing sector of Ethiopia is in its infant stage due to many interrelated problems. These problems are generally related to finance, technology, market, policy, input supply and other socio-economic factors. The technology we use is also capital intensive; consumer bias against local products; Strong competition from cheap imports. 47. A- Over recent years, to establish a large-scale manufacturing hub with in Africa, the Ethiopian government has particularly been doubling is special zones of industrial parks establishment.", "d", 0, 1, this.f549b));
        arrayList.add(new questions("47.", "Over recent years, to establish a large-scale manufacturing hub with in Africa, the Ethiopia government has particularly been doubling its efforts on", 0, 0, 0, 0, 0, "special zones of industrial parks establishment. ", "agriculture and irrigation expansion", "road constrictions", "hotel and tourism works ", "Over recent years, to establish a large scale manufacturing hub within africa, the Ethiopian government has particularly been doubling its special zones of industrial parks establishment.  ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("48.", "The theory of linkage stress that", 0, 0, 0, 0, 0, "When certain industries are developed first, their interconnections with other industries will reduced the development of new industries.", "When certain industries are developed first, there is uncertainly whether this is Could help facilitate the development of new industries.", "When certain industries are developed first, their interconnections with other industries will induced the development of new industries.", "The relation between agriculture and non- agriculture sector is very strong in developing countries.", "The theory of linkage stress when certain industries are developed first their interconnection with other industries will induce the development of new industries.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("49.", "In an industry when a firm buys a good from another firm to use as an input for its output is called", 0, 0, 0, 0, 0, "agglomeration economics. ", "forward linkage.", "backward linkage. ", "localization economics.", "In industry when a firm buys a goods from another firm to use as an input for its outputs is the firm can create backward linkages.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("50.", "When transportation costs are significant to a main market, users of the output of an industry my benefit from a nearby location to save costs of transportation. This benefit is a type of", 0, 0, 0, 0, 0, "agglomeration economics. ", "forward linkage.", "backward linkage.", "localization economics", "when transportation costs are significant to main market, users of the outputs of the industry may benefit from the nearby location to save cost of transportation. This benefit is the types of localization of the economies", "d", 0, 1, this.f549b));
        arrayList.add(new questions("51.", "Two major service provides that help Ethiopian earn considerable foreign exchange compared to other service providers are ", 0, 0, 0, 0, 0, "Ethiopian Airlines and Ethiopian Shaping Lines.", "National Museum and Ethio-telecom. ", "National museum and National Lottery.", "National Lottery and -telecom. ", "The two major service providers that help Ethiopia earn considerable foreign exchange compared with other services providers are Ethiopian Airline and Ethiopian Shipping Lines", "a", 0, 1, this.f549b));
        arrayList.add(new questions("52.", "The 1992 proclamation on Ethiopia transport policy allows except", 0, 0, 0, 0, 0, "Regulation of the freight transport industry. ", "Promotion of efficiency and equitable transport distribution.", "Free entry in to existing transport associations.", "Obtaining licenses to from new transport association.", "Following the 1992 Proclamation, of Ethiopian transport policy many of the private commercial freight and passenger transport activities left the corporation and formed their own independent association.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("53.", "Compared to other African countries, Ethiopia is more successful in terms of", 0, 0, 0, 0, 0, "Road transport. ", "Air transport and Civil Aviation", "Railway transport", "Metro transport service", "Compared to other African countries Ethiopia is more successful in terms of air transport and civil aviation. ", "b", 0, 1, this.f549b));
        arrayList.add(new questions("54.", "All are key resource base of Ethiopia except", 0, 0, 0, 0, 0, "Abundant valuable minerals.", "High potential to produce hydro electronic and geothermal energy.", "Availability of many rivers and lakes. ", "Availability of sea port.", "The key resources that are a viable in Ethiopia are: -\n•\tAbundant valuable minerals\n•\tHigh potential to produce HEP and Geothermal energy \n•\tAvailability of many rivers and seas\n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("55.", "What can we say about the current population composition of Ethiopia? ", 0, 0, 0, 0, 0, "There is very high proportion of old age people in the economy. ", "The proportion of literate people is greater than 80%.", "The proportion of female is close to 50%.", "More than half of the whole population lives in urban areas.", "Regarding current composition of Ethiopian population the male population is slightly higher (50.5%) than female population (49.5%) at the national level.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("56.", "Identify the correct statement about minerals and environment in Ethiopia.", 0, 0, 0, 0, 0, "There are insufficient amount minerals in the economy. ", "The development the mineral sectors is at an infant stage. ", "The contribution of the mineral sector to the GDP of the country is very high.", "The economy has no environmental problems. ", "The development of mining sector is at an infant stage that contributes only about 1% to Ethiopia's GDP. Gold, marble, limestone and tantalum are the major minerals mined in Ethiopia.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("57.", "Under the Derg regime,", 0, 0, 0, 0, 0, "Ethiopia had no development plans.", "the country was structured under a capitalist system. ", "Ethiopia experienced a widespread drought.", "The private sector was able to grow at a very high rate.", "Under the Derg regime Ethiopia experienced a wide spread drought. 58. A- The development plans under the Derg and EPRDF have in common are they aim to bring growth and development in the economy of the country.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("58.", "What do the development plans under the Derg and EPRDF have in common?", 0, 0, 0, 0, 0, "They aim to bring growth and development in the economy. ", "They have nothing in common.", "They focus on industrialization as the only way to growth and development. ", "The plans never talk about poverty reduction and building democracy. ", "The development plans under the Derg and EPRDF have in common are they aim to bring growth and development in the economy of the country. ", "a", 0, 1, this.f549b));
        arrayList.add(new questions("59.", "Relative to unimodal agriculture, bimodal agriculture", 0, 0, 0, 0, 0, "reduces inequality among rural households.", "Promotes transfer of technology.", "Protects peasants from eviction.", "Focus only on production of food crops. ", "A bimodal strategy in agriculture involves capital-intensive technical change within a modernized subsector. A unimodal strategy involves progressive technical change which only gradually increases the degree of capital-intensity and which involves the entire agricultural sector.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("60.", "Today, the Ethiopian economy is predominantly an agrarian economy since", 0, 0, 0, 0, 0, "Nearly 80% of Ethiopia live in rural areas. ", "Most of the GDP comes from this sector.", "The majority of the growth rate in the GDP comes from the agricultural sector. ", "Most of the total national investment project go to this actor", "Today the Ethiopian economy is predominately an agrarian economy since Agriculture contributes about 45% of the overall GDP of the country, generates more than 80% of export earnings; employs about 85% of the population; and supplies about 70% of raw materials to the secondary activities", "b", 0, 1, this.f549b));
        arrayList.add(new questions("61.", "Concerning the agricultural sector of Ethiopia, all are the major challenges except", 0, 0, 0, 0, 0, "Lack of fertile land.", "Lack of access to credit and financial facilities in the sector. ", "Lack of infrastructure in rural area.", "Heavy dependence on rain- fed agriculture. ", "Major problems of the agricultural sector includes:\n•\tFrequent drought.\n•\tSoil degradation largely caused by overgrazing and overpopulation.\n•\tLand fragmentation.\n•\tPrevalence of backward agricultural practices.\n•\tPoor marketing facilities due to poor road networks, etc.\n•\tRapidly increasing prices of agricultural inputs like fertilizers etc.\n", "a", 0, 1, this.f549b));
        arrayList.add(new questions("62.", "From the under listed policy interventions, the one which does not enhance agricultural productivity in Ethiopia is", 0, 0, 0, 0, 0, "Introduction of new and improved varieties of seed and inputs.", "Enhancing the extension service.", "Development and expansion of irrigation coverage. ", "Introducing traffic and taxes on intermediate agriculture input", "Policy interventions that enhance agricultural productivity in Ethiopia includes; -\n•\tCrop production and productivity in both volumes of production and yield per hectare have shown consistent increases for almost all categories of main crops during the last few years.\n•\tDiversification of agricultural production. \n•\tEstablishment of an agricultural marketing system.\n•\tDevelopment of research and extension services.\n•\tImprovement in the supply of agricultural inputs. \n•\tExpansion of small-and medium-scale irrigation.\n•\tBetter management of natural resources.\n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("63.", "According to report by NBE (2017/18), the share the industrial sector from the GDP is 27% in 2017/18 with the service sector accounting for 39%. Only 5% of the GDP comes from the manufacturing sector during this period. Hence, we can say that", 0, 0, 0, 0, 0, "the contribution of the industrial sector exceeds that the agriculture sector in 2017/18.", "the economy has joined the industrialized world based on Sutcliff's criteria,", "Multiple and continued effort is needed in the future since the economy has not industrialized. ", "the performance of the industrial sector is satisfactory and should continue as it is.", "According to report of NBE (2017/18), the share of the industrial sector from the GDP is 27% in 2017/18 within service sector accounting for 39%. Only 5% of the GDP came from manufacturing sector during this period. Hence we can say that multiple and continued effort is needed in the future since the economy has not industrialized.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("64.", "The manufacturing sector in Ethiopia is characterized by ", 0, 0, 0, 0, 0, "the dominance of firms with labor intensive technologies", "the prevalence of strong and dominate firms in the international markets.", "firms with limited access to finance and financial resource. ", "Firms operating under well-established institution and dependable infrastructure. a policy option to solve the", "There are a number of problems that have constrained the growth of the manufacturing sector. These problems include weaknesses in technology, markets, finance, policies, skilled manpower, and the like. Broadly, these problems can be classified as technological, structural, and policy problems.", "c", 0, 1, this.f549b));
        arrayList.add(new questions("65.", "Which one of the following cannot be taken as key problem of the industrial sector in Ethiopia?", 0, 0, 0, 0, 0, "Improving the input supply problem.", "Development of appropriate technology.", "Improving access to finance ", "Reducing the number of skilled manpower available in the economy", "Policy option to solve the key problem in industrial sector in Ethiopia includes: -\n•\tImproving the input supply problem \n•\tDevelopment of appropriate technology\n•\tImproving access to finance \n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("66.", "Given property to industrial sector in Ethiopia may lead to superior outcome in the economy compared to another sector because ", 0, 0, 0, 0, 0, "Industrial sector is the biggest employer and major source of livelihood in the economy. ", "The country has abundant capital required for the development of the industrial sector.", "The industrial sector is expected to have strong linkage with the economy. ", "The environmental impact of industrial sector is negligible.", "Giving priority to industrial sector Ethiopia may lead to the superior outcome in the economy compared with other sector because it is expected to have strong linkages with the rest of the economy", "c", 0, 1, this.f549b));
        arrayList.add(new questions("67.", "Suppose Mugher Cement factory has decided to subcontract supply of some input (e.g. limestone) to local farmers who own the minerals. This type of linkage between an industry and input suppliers is", 0, 0, 0, 0, 0, "back ward linkage ", "forward linkage", "horizontal linkage ", "consumption linkage", "Suppose Mugher cement factory has decided to sub contract supply of some inputs to local farmers who own the materials. This types of linkages between industries and suppliers is known as backward linkages.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("68.", "According to Hirschman, a linkage crated when investment in a project encourages investment in subsequence stage of production and market is called ___________", 0, 0, 0, 0, 0, "back ward linkage ", "forward linkage ", "horizontal linkage ", "infrastructure linkage", "According to Hirschman a linkage created a forward linkage is created when investment in a particular project encourages investment in subsequent stages of production: A backward linkage is created when a project encourages investment in facilities that enable the project to succeed.", "a", 0, 1, this.f549b));
        arrayList.add(new questions("69.", "the contribution of the service sector to the foreign exchange earnings in Ethiopian economy over the last couple of year is", 0, 0, 0, 0, 0, "below the contribution by the manufacturing sector.", "better than the contribution by the merchandise export.", "negative and very high in terms of net balance relative to the trade balance. ", "very low and insignificant and hence can be ignored", "The contribution of the service sector of the foreign exchange earning in Ethiopian economy over the last couple of years is better than the contribution by merchandise export. For example, in 2008/09, foreign exchange income earned from service providers such as Ethiopian Airlines and Ethiopian Shipping Lines, as well as from various service sub-sectors such as tourism, communication, insurance and financial services, collectively reached nearly 2 billion dollars, when compared to just 1.5 billion dollars for the export of goods.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("70.", "The transport sector in Ethiopia", 0, 0, 0, 0, 0, "can be considered as a well-developed sector in rural part of the country.", "was under a state control during the Derg regime.", "It was more deregulated under the Derg regime than the EPRDF", "Plays insignificant role in economic growth and development.", "During the Military Government, the transport sector was put under close state regulation and control. The entire commercial truck and passenger transport system was under strict control of the government through Proclamation No.107/1976.", "b", 0, 1, this.f549b));
        arrayList.add(new questions("71.", "Suppose the average products of 8 workers is 750 units of a products and that of 9 workers is 756 units. The marginal product of the ninth worker equals _____________", 0, 0, 0, 0, 0, "804", "6", "600", "6804", "No explanation", "n", 0, 1, this.f549b));
        arrayList.add(new questions("72.", "A firm's total cost function is given by: TC-300-6Q+4Q^2 where TC refers to total cost in birr and Q refers to quantity produced in kilogram. When Q-4, the marginal and average variable cost are", 0, 0, 0, 0, 0, "10 and 26 Birr per kilogram respectively.", "26 and 10Birr per kilogram respectively. ", "10 and 16 Birr per kilogram respectively.", "12 and 16 Birr per kilogram respectively.", "A firm's total cost function is given by: TC-300-6Q+4Q² Where TC refer to total cost in birr and Q refer to the quantity produced in kilograms when Q-4, the marginal and average variable costs are 12 and 16 birr per kilogram respectivelyATC=TC/Q=(300+10q+5q²)/q=300/Q+6+4Q \nAVC=VC/1 = (6Q+4Q²)/q=6+4Q\nAFC FC/Q=300/Q\n", "d", 0, 1, this.f549b));
        arrayList.add(new questions("73.", "Assume firm's total cost of producing 8 unit of output is 160 birrs with average fixed cost of 2 Birr. The firm's average variable costs are equal to", 0, 0, 0, 0, 0, "18 Birr per units ", "20 Birr per units", "2 Birr per units ", "4 Birr per units", "Assume firm's total cost of producing 8 units of output is 160 birt with average fixed costs of 2 birr. The firm's average variable cost is equal to 20 birr per units \naverage variable cost=VC/Q\n=160/8=20\nA-Short run production functions the value of labor that maximizes average product is L-20 According to this law, output would increase at an increasing rate as the quantity of labor increases. At the end of the stage of diminishing returns, i.e., at L = L₂, the firm's output reaches the\n L=20\n", "b", 0, 1, this.f549b));
        arrayList.add(new questions("74.", "Consider the following short run production function where capital is assumed to be constant\nQ= 8L² - 0.2L^3 where Q refers to output and L refers to labor. Where ‘^’ symbol means the power of\nThe value of labor that maximizes average product is\n", 0, 0, 0, 0, 0, "20", "15", "7", "10", "A short run production functions the value of labour that maximizes average product L = 20. According to this law, output would increase at an increasing rate as the quantity of labour increases. At the end of the stage of diminishing returns, i.e., at L = L2, the firms output reaches the maximum\nQ= 8L^2-0.2L^3\nAP=Q/L=∂(8L^2-0.2L^3 )/∂L\nAP=Q/L=9-0.2L=0\nL = 20\n", "a", 0, 1, this.f549b));
        arrayList.add(new questions("75.", "Consider the following short run production function where capital is assumed to be constant\nQ= 8L² - 0.2L^3 where Q refers to output and L refers to labor. Where ‘^’ symbol means the power of\nThe approximate value of labor that maximize marginal product is\n", 0, 0, 0, 0, 0, "10 ", "13", "15", "20", "Approximate value of labor maximum marginal product\nMP = ∂Q/∂L=(∂(8L²-0.2L^3))/∂L\nMP = 16L-0.61²\n =16-1.2L=0\n1.2L/1.2 = 16/1.2 \n=L=13.3\n", "b", 0, 1, this.f549b));
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
        this.f550tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    economics2012.this.timer.setVisibility(0);
                    economics2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    economics2012.this.scr.setVisibility(8);
                    economics2012.this.chr.stop();
                    economics2012.this.toolbar.setVisibility(8);
                    economics2012.this.Relative.setBackgroundColor(-7829368);
                    economics2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2012.this.getBaseContext());
                    int unused = economics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = economics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = economics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = economics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = economics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = economics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = economics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = economics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = economics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = economics2012.this.highscoreEconomics2012 = defaultSharedPreferences.getInt("econ2012hs", 0);
                    int access$600 = economics2012.this.part1 + economics2012.this.part2 + economics2012.this.part3 + economics2012.this.part4 + economics2012.this.part5 + economics2012.this.part6 + economics2012.this.part7 + economics2012.this.part8 + economics2012.this.part9;
                    economics2012.this.resultText.setText(String.valueOf(access$600));
                    economics2012.this.progressbar.setProgress(access$600);
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
                    int unused11 = economics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = economics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = economics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = economics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = economics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = economics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = economics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = economics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "econ2012hs";
                    int unused19 = economics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = economics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = economics2012.this.answered1 + economics2012.this.answered2 + economics2012.this.answered3 + economics2012.this.answered4 + economics2012.this.answered5 + economics2012.this.answered6 + economics2012.this.answered7 + economics2012.this.answered8 + economics2012.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > economics2012.this.highscoreEconomics2012) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 75;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - economics2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1econ121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1econ122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1econ123", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1econ124", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1econ125", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1econ126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1econ127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1econ128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1econ129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1econ1210", 0);
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
                        editor.putString("scoreecon121", str3);
                        editor.putLong("date1econ121", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreecon122", str5);
                            editor.putLong("date1econ122", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreecon123", str5);
                            editor.putLong("date1econ123", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreecon124", str5);
                            editor.putLong("date1econ124", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreecon125", str5);
                            editor.putLong("date1econ125", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreecon126", str5);
                            editor.putLong("date1econ126", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreecon127", str5);
                            editor.putLong("date1econ127", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreecon128", str5);
                            editor.putLong("date1econ128", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreecon129", str5);
                            editor.putLong("date1econ129", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreecon1210", str5);
                            editor.putLong("date1econ1210", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateecon121", 0);
                    long j12 = defaultSharedPreferences.getLong("dateecon122", 0);
                    long j13 = defaultSharedPreferences.getLong("dateecon123", 0);
                    long j14 = defaultSharedPreferences.getLong("dateecon124", 0);
                    long j15 = defaultSharedPreferences.getLong("dateecon125", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateecon126", 0);
                    long j17 = defaultSharedPreferences.getLong("dateecon127", 0);
                    long j18 = defaultSharedPreferences.getLong("dateecon128", 0);
                    long j19 = defaultSharedPreferences.getLong("dateecon129", 0);
                    long j20 = defaultSharedPreferences.getLong("dateecon1210", 0);
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
                        editor2.putString("iScoreecon121", str4);
                        editor2.putLong("dateecon121", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreecon122", str6);
                            editor2.putLong("dateecon122", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreecon123", str6);
                            editor2.putLong("dateecon123", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreecon124", str6);
                            editor2.putLong("dateecon124", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreecon125", str6);
                            editor2.putLong("dateecon125", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreecon126", str6);
                            editor2.putLong("dateecon126", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreecon127", str6);
                            editor2.putLong("dateecon127", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreecon128", str6);
                            editor2.putLong("dateecon128", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreecon129", str6);
                            editor2.putLong("dateecon129", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreecon1210", str6);
                            editor2.putLong("dateecon1210", l.longValue());
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
                        economics2012.this.scr.setVisibility(8);
                        economics2012.this.chr.stop();
                        economics2012.this.toolbar.setVisibility(8);
                        economics2012.this.Relative.setBackgroundColor(-7829368);
                        economics2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2012.this.getBaseContext());
                        int unused = economics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = economics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = economics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = economics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = economics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = economics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = economics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = economics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = economics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = economics2012.this.highscoreEconomics2012 = defaultSharedPreferences.getInt("econ2012hs", 0);
                        int access$600 = economics2012.this.part1 + economics2012.this.part2 + economics2012.this.part3 + economics2012.this.part4 + economics2012.this.part5 + economics2012.this.part6 + economics2012.this.part7 + economics2012.this.part8 + economics2012.this.part9;
                        TextView access$1600 = economics2012.this.resultText;
                        access$1600.setText(access$600 + "/80");
                        economics2012.this.progressbar.setProgress(access$600);
                        economics2012.this.progressbar.setMax(80);
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
                        int unused11 = economics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = economics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = economics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = economics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = economics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = economics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = economics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = economics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = economics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = economics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = economics2012.this.answered1 + economics2012.this.answered2 + economics2012.this.answered3 + economics2012.this.answered4 + economics2012.this.answered5 + economics2012.this.answered6 + economics2012.this.answered7 + economics2012.this.answered8 + economics2012.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > economics2012.this.highscoreEconomics2012) {
                            edit.putInt("econ2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - economics2012.this.chr.getBase()) / 1000;
                        String str = "dateecon1210";
                        String str2 = "dateecon129";
                        String str3 = "dateecon128";
                        String str4 = "dateecon127";
                        String str5 = "dateecon126";
                        String str6 = "dateecon125";
                        String str7 = "dateecon124";
                        String str8 = "dateecon123";
                        String str9 = "dateecon122";
                        String str10 = "dateecon121";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1econ1210";
                        String str12 = "date1econ129";
                        if (economics2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1econ121", 0);
                            String str13 = "date1econ121";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1econ122", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1econ123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1econ124", 0);
                            long j5 = defaultSharedPreferences.getLong("date1econ125", 0);
                            String str16 = "date1econ125";
                            String str17 = "date1econ124";
                            String str18 = "date1econ126";
                            long j6 = defaultSharedPreferences.getLong("date1econ126", 0);
                            long j7 = defaultSharedPreferences.getLong("date1econ127", 0);
                            String str19 = str12;
                            String str20 = "date1econ128";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1econ127";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1econ123";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1econ128", 0));
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
                                editor3.putString("scoreecon121", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreecon122", str25);
                                    editor3.putLong("date1econ122", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreecon123", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreecon124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreecon125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreecon126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreecon127", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreecon128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreecon129", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreecon1210", str25);
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
                                editor4.putString("iScoreecon121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreecon122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreecon123", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreecon124", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreecon125", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreecon126", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreecon127", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreecon128", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreecon129", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreecon1210", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1econ121";
                            String str30 = "date1econ124";
                            String str31 = str12;
                            String str32 = "date1econ123";
                            String str33 = "date1econ127";
                            String str34 = "date1econ126";
                            String str35 = str11;
                            String str36 = "date1econ125";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1econ122", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1econ122";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1econ128";
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
                                editor2.putString("scoreecon121", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreecon122", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreecon123", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreecon124", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreecon125", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreecon126", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreecon127", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreecon128", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreecon129", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreecon1210", str49);
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
                                editor.putString("iScoreecon121", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreecon122", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreecon123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreecon124", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreecon125", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreecon126", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreecon127", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreecon128", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreecon129", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreecon1210", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        economics2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2012.this.scr.setVisibility(8);
                economics2012.this.chr.stop();
                economics2012.this.toolbar.setVisibility(8);
                economics2012.this.Relative.setBackgroundColor(economics2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                economics2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2012.this.scr.setVisibility(0);
                economics2012.this.toolbar.setVisibility(0);
                economics2012.this.telegram_layout.setVisibility(8);
                economics2012.this.chr.start();
                economics2012.this.Relative.setBackgroundColor(economics2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = economics2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = economics2012.this.mInterstitialAd = null;
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
                economics2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
