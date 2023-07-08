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

public class economics2009 extends AppCompatActivity {
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
    private Boolean f543b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscoreEconomics2009;
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
    private Toolbar f544tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_economics2009);
        this.f543b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextEconomics2009);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_economics2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "An important benefit of a monopolistically competitive market is ", 0, 0, 0, 0, 0, "concentration of market power into a single firm.", "uniformity of goods and services produced in the economy.", "satisfaction of different consumer preferences due to increase variety ", "a benchmark for efficient allocation of resources and hence economic efficiency.", "Monopolistically competition refers to a situation where there are many sellers of differentiated products. since products are differentiated each seller can independently decide his/her price output polices. Monopolistically competitive market has the following characteristics:\n\tMany sellers\n\tProduct differentiation\n\tFree entry and exit has selling cost \n\thas non-price competition and\n\tindependent price policy.\n\tChoice under letters A, B and D are not important benefits of monopolistic competitive market.\n", "c", 0, 1, this.f543b));
        arrayList.add(new questions("2.", "The firm's short run marginal cost curve is increasing when", 0, 0, 0, 0, 0, "total fixed cost is increasing", "marginal product is increasing ", "marginal product is decreasing", "average fixed cost is decreasing", "The firm's short- nun marginal cost and marginal produce curves are inversely related. Marginal cost curve is increasing when marginal product is decreasing.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("3.", "If a more efficient technology was discovered by a firm, there would be ", 0, 0, 0, 0, 0, "a downward shift in the marginal cost curve.", "an upward shift in the average fixed cost curve, ", "A downward shift in the average fixed cost curve.", "An upward shift in the average variable cost curve. ", "When a more efficient technology was discovered by a firm there would be a downward shift in the marginal cost curve. \n\tMarginal cost has nothing to do with fixed cost. It is associated with the variable cost and thereby with total cost.\n", "a", 0, 1, this.f543b));
        arrayList.add(new questions("4.", "If total product is at a maximum, then", 0, 0, 0, 0, 0, "Average product must equal marginal product. ", "Marginal product must be failing and be equal to zero.", "Marginal product must be greater than zero and must be falling ", "Average product must be rising and must lie above marginal product.", "If total product is at a maximum, then marginal product must be failing and be equal to zero. \n\tWhen total product (TP) increases at increasing rate, marginal product increases, while TP increases at diminishing rate, marginal product (MP) declines when TP decreases MP becomes negative and when TP product reaches its maximum marginal product becomes zero.\n", "b", 0, 1, this.f543b));
        arrayList.add(new questions("5.", "Rising short run average variable costs of production for a firm indicates that its", 0, 0, 0, 0, 0, "average fixed cost is constant. ", "average total cost is at a maximum.", "average variable cost is below marginal costs.", "average variable costs are below average ", "Rising average variable cost (AVC) indicates average variable cost is below marginal cost. When AVC is failing, AVC is greater than MC and when AVC is equal to MC, AVC is at its minimum level but when AVC is rising, MC is above AVC (AVC is below MC).", "c", 0, 1, this.f543b));
        arrayList.add(new questions("6.", "The law of diminishing returns states that: fixed costs.", 0, 0, 0, 0, 0, "In the short run, the average total costs of the firm will eventually diminish. ", "In the long run, the average total costs of the firm will eventually diminish.", "As a firm uses more of a variable resource given the quantity of fixed resources, the average product of the firm will increase. ", "As a firm uses more of a variable resource, given the quantity of resource, marginal product of the firm will eventually decrease", "The law of diminishing returns states that a point at which the level of outputs gained is less than the amount of inputs used. It occurs when output increases by a smaller proportion than the proportion of inputs increases.\n\tAs the firm uses more of a variable resource given the quantity of fixed resources marginal product of the firm will eventually decreases.\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("7.", "Which of the following approaches is used to study consumer behavior in the context of ordinal utility theory?", 0, 0, 0, 0, 0, "Price elasticity of demand. ", "Indifference curve.", "Income elasticity of demand.", "Cross price elasticity of demand.", "An approach which is used to study consumer behavior in the context of ordinal utility theory is indifference curve. Since ordinal utility theory makes use of indifference curves to study consumer behavior it is also known as indifference curve approach.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("8.", "In a two-good economy, suppose the prices of the goods and the incomes of the individuals are doubled, what happens to the budge line?", 0, 0, 0, 0, 0, "There will be no effect on the budge line. ", "The intercepts of the budget line will increase.", "The intercepts of the budge line will decrease", "The slope of the budget line may either increase or decrease. ", "In a two good economy, if the price of a good and the income of the individual are doubled the intercepts of the budget line will increase and there will be no change on the slop of the budget line.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("9.", "As a consumer moves away from the origin to higher indifference curves, what would be the consequence on his/ her preferred choice?", 0, 0, 0, 0, 0, "The consumer reaches less preferred combinations of goods, ", "The consumer reaches more affordable combinations of goods.", "The consumer reaches more preferred combinations of goods.", "The consumer is indifferent to the different combinations of goods. ", "As a consumer move away from the original to higher indifference curves, the consumer reaches more preferred combinations of goods as shown below.\nAs shown in the figure as the consumer moves from indifference curve 1 (IC) to indifference curve 2 (IC₂) gets more satisfaction. When the consumer becomes far. from the origin it gets more satisfaction therefore IC > IC₂ > IC₁\n", "c", C2719R.C2721drawable.econ2009q9e, 1, this.f543b));
        arrayList.add(new questions("10.", "The total utility of a product is calculated by", 0, 0, 0, 0, 0, "multiplying price by quantity and dividing by the marginal utility. ", "summing the marginal utilities for each successive unit of the product that is consumed. ", "summing the marginal utility from the first and the last unit of a product consumed", "multiplying the marginal utility of a unit of the product consumed by the average quantity consumed.", ". Total utility is the sum of all marginal utilities.\nAs shown in the table\nTU-Sum of all marginal utilities\n\tWhen the consumer consumes I of orange the MU is 10 and TU 10+0=10. In consuming 2 units of orange TU=10+8=18 for 3 units of orange \nTU=10+8+5-23 etc therefore total utility is the sum of all marginal utilities.\n", "b", C2719R.C2721drawable.econ2009q10e, 1, this.f543b));
        arrayList.add(new questions("11.", "The problem of scarcity applies to ", 0, 0, 0, 0, 0, "All economic systems, regardless of their level of development.", "Only in industrially developed countries because resources are scarce in these countries.", "Only in underdeveloped countries, because there are few productive these countries.", "Only in economic systems that are just beginning to develop, because specialized resources are scarce in these systems. ", "The problem of scarcity applies to all economic systems, regardless of their level of development. Either the country is rich or poor, developed or developing all of them faces the problem of scarcity because scarcity is a universal condition.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("12.", "Economists usually say that \"there's no such thing as a free lunch.\" What does this imply?", 0, 0, 0, 0, 0, "Everyone has to pay for his own lunch.", "No one has time for a good lunch anymore. ", "The person consuming a good must always pay for it. ", "Opportunity costs are incurred when resources are used to produce goods and services. ", "The economic theory and also the lay opinion, that whatever goods and services are provided they must be paid for by someone that is you don't get something for nothing. The phrase is also known by the acronym of \"there is no such thing as a free lunch\".", "c", 0, 1, this.f543b));
        arrayList.add(new questions("13.", "A central economic problem involves making choices among alterative ends. Which of the following necessitates the making of such choices?", 0, 0, 0, 0, 0, "Choices are made without sacrifices. ", "Choices do not involve opportunity costs.", "Scarcity of resources relative to human wants.", "Abundance of resources relative to human wants.", "Because there is scarcity there must be choice and when make choice there is also opportunity cost choice also made based on scarcity of resources relative to human wants and needs.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("14.", "Voluntary trade promotes economic progress because it", 0, 0, 0, 0, 0, "benefit buyers at the expense of sellers.", "makes larger outputs possible as a result of specialization. ", "Encourages individuals to become self-sufficient", "Moves goods, services and resources from people who value them more to individuals who value them less.", "Voluntary trade promotes economic progress because it moves goods, service and resources from people who value the goods services and resources more to individuals who value them.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("15.", "Which one of the following is not a possible reason for rightward shift in the supply curve of a commodity?", 0, 0, 0, 0, 0, "Decrease in the price of the commodity.", "More suppliers have entered the industry. ", "Decrease in the quantity supplied at each price.", "An increase in the quantity supplied at each price, ", "Decrease in the price of the commodity is not a possible reason for a right word shift in the supply curve of a commodity because as the supply law states. As the price of the commodity increases the supply also increases and as price decrease supply decreases therefore when price increase the supply curve shift right ward. ", "a", 0, 1, this.f543b));
        arrayList.add(new questions("16.", "In a market for any commodity that is at disequilibrium price, whether controlled or not, the quantity actually exchanged is determined by", 0, 0, 0, 0, 0, "The lesser of quantity demanded and quantity supplied.", "Government decree or direction ", "The elasticity of demand.", "The greater of quantity demanded and quantity supplied.", "In a market for any commodity that is at disequilibrium price, whether controlled or not, the quantity actually exchanged is determined by elasticity of demand.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("17.", "Which of the following is true about the different notations of elasticity? ", 0, 0, 0, 0, 0, "Price and income elasticity refer to movements along the demand curve; other elasticity refer to shifts of the entire demand curve.", "Price and cross price elasticities analyze movements along the demand curve, other elasticities refer to shifts of the entire demand curve.", "Price elasticity refers to movements along the demand curve; income and cross price elasticities refer to shifts of the entire demand curve. ", "Income and cross price elasticities refer to movements along the demand curve; price elasticity refers to shifts of the entire demand curve.", "Movement along a demand curve occurs if the quantity demanded increases or decreases due to a fall or rise in the price of the commodity alone, other things being equal, where as a shift in the demand curve occurs more or less of a commodity is demanded at the same price, due change in factors other than the price of the commodity is concerned such a change income change in price of other related goods. ", "c", 0, 1, this.f543b));
        arrayList.add(new questions("18.", "Which of the following statements is true about the elasticity of demand?", 0, 0, 0, 0, 0, "When quantity demand for a commodity does not change as a result of changes in its own price, it is said to be perfectly elastic.", "When quantity demand for a commodity does not change as a result of changes in its own price, It is said to be perfectly inelastic. ", "When the demand for a commodity changes by a larger percentage than the percentage change in its own price, it is said to be perfectly inelastic. ", "When the demand for a commodity changes by a smaller percentage than the percentage change in its own price, it is said to be perfectly inelastic.", "When /ed/=0 it is said to be perfectly in elastic at this point change in price does not affect demand at all.\n\tWhen /ed/<l it is said to be in elastic here percentage change in demand is less than % change in price.\n\tWhen /ed/=1 it is called unity elastic at this point % change in demand is equal to % change in price. \n\tWhen /ed/>1 it is said to be elastic here % change in demand is more than % change in price.\n\tWhen /ed/=0 it is called perfectly elastic here demand changes infinitely. \n", "b", 0, 1, this.f543b));
        arrayList.add(new questions("19.", "What is the long run effect of a price ceiling?", 0, 0, 0, 0, 0, "Deflation", "Shortages ", "Inflation", "Surpluses", "Sometimes the supply of a commodity is so short that it creates shortage in the market and common consumers are unable to get the commodity from the market, in such a situation government comes forward and fixes the maximum price for the commodity. This process is known as maximum price fixation (price ceiling).", "b", 0, 1, this.f543b));
        arrayList.add(new questions("20.", "The satisfaction obtained from consumption of one extra unit of commodity is known as", 0, 0, 0, 0, 0, "total utility", "average utility", "elastic utility", "marginal utility", "Marginal utility refers to the satisfaction consumers obtain from consumption of one extra unit of a commodity.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("21.", "In the context of international trade, \"Terms of Trade\" means the", 0, 0, 0, 0, 0, "excess of exports over imports.", "Excess of capital inflow over capital outflow.", "Ratio of a country's export price to import price.", "Ratio of a country's import price to export price.", "Term of Trade (TOT) refers to the relative price of imports in terms of export and is defined as the ratio of export price to import price. It can be interpreted as the amount of import goods an economy can purchase per unit of export goods.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("22.", "In the short run expansionary fiscal policy would result in aggregate ", 0, 0, 0, 0, 0, "supply moving to the left. ", "supply moving to the right.", "demand moving to the left ", "demand moving to the right.", "In a situation in which an economy is facing the problem of deficit demand that is aggregate demand is falling government takes expansionary fiscal policy to rise the falling demand and the policy measure rises the falling demand that is aggregate demand move to the right /aggregate demand increases.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("23.", "An expansionary monetary policy may promote long run growth if it leads to", 0, 0, 0, 0, 0, "an increase in investment.", "an increase in consumption.", "an increase in government spending. ", "a constant level of government spending.", "In a situation of deficit demand government takes a monetary policy measure by instruments such as reducing bank rate, by buying Semitics and reducing cash reserve ratio /CRR/ then these measures promote long run growth. If it leads to an increase in investment.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("24.", "The policy mix that causes the interest rate to increase and investment to decrease, but has an intermundane effect on aggregate output, is a mix of ", 0, 0, 0, 0, 0, "Expansionary fiscal policy & expansionary monetary policy.", "Contractionary fiscal policy and expansionary monetary policy. ", "Expansionary fiscal policy and contractionary monetary policy.", "Contractionary fiscal policy and contractionary monetary policy.", "Increasing interest rate is a contractionary monetary policy measure instrument and a decrease in investment is a contractionary fiscal policy therefore the policy mix is a contractionary physical policy and contractionary monetary policy.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("25.", "When the consumption curve is a straight line, the marginal propensity to save", 0, 0, 0, 0, 0, "is equal to one plus the MPC.", "increases as income increases.", "is equal to one minus the MPC.", "decrease as income increases.", "When the consumption curve is a straight-line consumption is said to be constant therefore because consumption is constant marginal propensity to save will increase an income increase. ", "b", 0, 1, this.f543b));
        arrayList.add(new questions("26.", "If producers expect economic growth to be more rapid in the future, then it is likely that", 0, 0, 0, 0, 0, "saving will decrease", "the investment curve will shift upwards.", "interest rates will decrease.", "the marginal propensity to consume will decrease. ", "If producers expect economic growth to be more rapid in the future then it is likely that they will decrease the amount of consumption that can be consumed from additional unit of income. i.e. the marginal propensity to consume will decrease so as to increase their saving and invert in the future.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("27.", "Which of the following are the major traditional energy sources in Ethiopia?", 0, 0, 0, 0, 0, "Firewood, solar, geothermal, crop residue. ", "Solar, geothermal, charcoal, animal dung. ", "Firewood, crop residue, charcoal, animal dung.", "Hydroelectric power, solar, firewood, crop residue.", "The major traditional energy sources in Ethiopia are firewood crop residue, charcoal and animal dugs. Whereas solar geo thermal hydroelectric power are modern energy sources.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("28.", "Which of the following is true about the role of agricultural sector in Ethiopia? ", 0, 0, 0, 0, 0, "About 65% of the sector's GDP comes from crop production.", "About 5% of the sectors contribution comes from the sub sectors allied to agriculture. ", "Its contribution in the economy increased from 45% in the early 1960% to 76% in 2003/04. ", "About 30% of the sector's contribution comes from animal husbandry (livestock rearing)", "The agriculture sector of Ethiopia is composing of the crop- production, livestock forestry and fishery sub sectors. About 65% of the sector's GDP comes from crop-production, while animal husbandry contributes 25% the remaining 10% is generated from lied sectors, forestry, fishing and others.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("29.", "Which one of the following is not true about the role of agricultural sector in Ethiopia economy? ", 0, 0, 0, 0, 0, "Its contribution to GDP is expected to increase as the country develops. ", "It provides employment and livelihood for large proportion of the labor force.", "It has significant contribution to GDP though it has declined over the last decade.", "It is expected to serve as a source of capital for the development of other sectors. ", "As the country is implementing Agricultural Development Led Industrialization (ADLI) as the country develops its contribution will decrease because the economy will turn to industrialization. ", "a", 0, 1, this.f543b));
        arrayList.add(new questions("30.", "Which of the following is true about the policies and strategies of the agricultural sector during the post 1991 period? ", 0, 0, 0, 0, 0, "minimum package projects to reach stallholders.", "Large scale mechanized commercial farm approach.", "Comprehensive package projects that are supported by Swedish International Development Agency (SIDA)", "Dualistic approach promoting both the stallholder farm system and large scale mechanized farm system.", "During the post 1991 period the policies and strategies of the agriculture sector is Dualistic approach that is it promotes both small holder farm system and large scale mechanized farm system.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("31.", "Which of the following represents the capital account component of the balance of payments of a country?", 0, 0, 0, 0, 0, "The inflow and outflow of foreign currency resulting from the sale of goods. ", "The inflow and outflow of foreign currency resulting from the sale of services.", "The flow of net transfers, including gifts and remittances that the country receives. ", "The flow of loans and investments that change a country's foreign assets and liabilities.", "The capital account component of the balance of payment (BOP) is the flow of loans and investment that change a country's foreign assets and liabilities. Whereas the choice under A, B and C are current account components that are trade balance, Net service and Net transfers respectively.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("32.", "A potential problem with freely floating exchange rates is that ", 0, 0, 0, 0, 0, "exchange rates may never reach equilibrium.", "the currency markets may become monopolized. ", "people who practice arbitrage may gain from the losses of others.", "uncertainty in exchange rate fluctuations may hinder international trade. ", "Freely floating exchange rate is a rate which is governed by market forces of demand and supply of money because there is no government intervention its potential problem will be hindering international trade due to uncertainty in exchange rate fluctuations.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("33.", "Depreciation of the United States Dollar (USD) relative to the Ethiopian Birr (ETB) would tend to:", 0, 0, 0, 0, 0, "discourage US citizens from buying Ethiopian goods. ", "discourage Ethiopian tourists from traveling to US. ", "discourage Ethiopians from buying US goods.", "increase the number of Birr that could be bought with a dollar.", "Depreciation of US dollar relative to the Ethiopian birr would tend to discourage US citizens from buying Ethiopian goods because the Ethiopian expected goods at US market will be expensive by contrary the US export items in Ethiopian market will be cheaper to Ethiopians.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("34.", "Which of the following distinguishes demand-pull inflation from cost-push inflation? ", 0, 0, 0, 0, 0, "Demand-pull inflation is persistent, while cost-push inflation is temporary.", "Demand-pull inflation is temporary, while cost-push inflation is persistent.", "Demand-pull inflation arises due to excess demand for goods and services, while cost-push inflation arises due to the rise in the costs of production.", "Demand-pull inflation arises due to excess demand for goods and services, while cost-push inflation arises due to excess supply of goods and services.", "Demand-pull inflation arises due to excess demand for goods and service that is when \"too much money is chasing too little goods\". Whereas cost push inflation arises due to the rise in the cost of production.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("35.", "Which of the following is true about the relationship between Net Domestic Product (NDP) & Gross Domestic Product (GDP)? ", 0, 0, 0, 0, 0, "NDP is equal to GDP plus depreciation or capital consumption allowance.", "NDP is equal to GDP minus depreciation or capital consumption allowance.", "NDP is equal to GDP times depreciation or capital consumption allowance.", "NDP is equal to GDP divided by depreciation or capital consumption allowance.", "The relationship between Net Domestic Product (NDP) and Gross Domestic Product (GDP) is that Net Domestic Product at market price is equal to the Gross Domestic Product at market price minus depreciation or capital consumption allowance, i.e.\nNDPMP=GDPM-Depreciation or capital consumptions allowance.\n", "b", 0, 1, this.f543b));
        arrayList.add(new questions("36.", "What are the three approaches to measuring economic ", 0, 0, 0, 0, 0, "cost, income, and expenditure approaches.", "private, public and international approaches.", "product, income and expenditure approaches.", "consumer, business and government approaches. ", "There are three approaches to measuring economic activity or measuring\nGDP these are \n1.\tProduct approach\n2.\tIncome approach and\n3.\tExpenditure approach \n", "c", 0, 1, this.f543b));
        arrayList.add(new questions("37.", "Which of the following is true about disguised unemployment?", 0, 0, 0, 0, 0, "It is a situation where workers become jobless due to loss of demand in a particular regions or industries. ", "It is a situation in which more workers are engaged in a type of work than that which is actually required to do the job.", "It is a situation which is associated with a period of recession or depression in trade or business cycles.", "It is a situation in which workers are thrown out of work in one location ", "When more workers are engaged in a type of work than actually are required to do that work it is called Disguised unemployment.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("38.", "When inflation increases and becomes more volatile, resulting in greater and are unwilling or unable to move to a similar work in another area. uncertainty, which of the following is most likely to occur? ", 0, 0, 0, 0, 0, "Investment by firms is likely to increase.", "Consumption by households is likely to increase. ", "International competitiveness is likely to improve.", "The price system becomes less efficient as a coordinating mechanism. ", "When inflation increases and becomes more volatile or show sudden changes resulting in greater uncertainty the price system become less efficient as a coordinating mechanism. ", "d", 0, 1, this.f543b));
        arrayList.add(new questions("39.", "In a free market economy, consumption & investment decisions; ", 0, 0, 0, 0, 0, "are mostly controlled by the government.", "are necessarily controlled by big businesses.", "determine the future course of the national economy. ", "Require protection from foreign forces, if it is desired that wealth is accumulated. ", "In agree market economy consumption and investment decisions determine the future course of the national economy.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("40.", "A market structure where there exists only a single seller of a product, who is the only producer of the product, and that product has no close substitutes is known as ", 0, 0, 0, 0, 0, "Monopoly", "Monopsony", "Duopoly ", "Oligopoly", "A market structure was there existing only a single (Mono) seller of a product who is the only producer of the product and that products has no close substitutes is called monopoly market structure and if there are only two sellers it is known or duopoly and if there are few cage sellers it is called oligopoly.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("41.", "Which of the following is not one of the direct contributions of the tourism subsector of the Ethiopian economy?", 0, 0, 0, 0, 0, "Contribution to employment. ", "Foreign exchange contribution.", "Contribution to Gross Domestic Product (GDP).", "Contribution to the productivity of the manufacturing sub sector. ", "The Ethiopian tourism sub-sector has employment contribution foreign exchange contribution and contribution to the GDP of Ethiopian Economy but it has no direct contribution to the productivity of manufacturing sub sector. ", "d", 0, 1, this.f543b));
        arrayList.add(new questions("42.", "According to the data from the Central Statistical Agency (CSA, 2007/08), which sub-sector of the manufacturing sector made the largest contribution to foreign exchange in Ethiopia?", 0, 0, 0, 0, 0, "Food and beverages ", "Leather and footwear", "Textiles", "Wood and furniture", "According to central statistics Agency (CSA 2007/08) the largest contribution to foreign exchange of Ethiopia comes from food and beverages followed by textile and leather products.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("43.", "Which of the following statements is true about the foreign trade of Ethiopia?", 0, 0, 0, 0, 0, "The main destination of exports is Asia. ", "Imports are mainly agricultural products.", "Manufactured goods and services dominate exports.", "Agricultural commodities are main contributors to export earnings. ", "The Ethiopian economy is mainly based on agriculture therefore the main contributors to export earnings are agricultural commodities. The choices under A, B and C are not true statements about foreign trade of Ethiopia.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("44.", "Which one of the following statements is not true about the performance of export sub-sector of the Ethiopian economy?", 0, 0, 0, 0, 0, "Coffee is the largest in value of exports.", "Oil seeds are the leading item in terms of the value of export.", "The value of exports of chat is greater than that of livestock. ", "The value of exports of meat and meat products is greater than that of fruits and vegetables. ", "All of the Choice under A, C and D are true but that of B is not true because the oilseeds is not leading item in terms of the value of export in export subsector of the Ethiopian economy.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("45.", "The theory of comparative advantage states that", 0, 0, 0, 0, 0, "the basis for international trade is the difference in absolute costs.", "the basis for international trade is the difference in tastes and preference. ", "a country specializes and exports those goods in which it has lower relative costs. ", "a country specializes and exports those goods in which it has higher relative costs.", "The comparative advantage theory states a country tends to specialize in the production of those goods for which it has lower comparative costs. To put it differently a country tends to specialize in the production of those goods for which it has greater comparative advantage or lower relative costs.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("46.", "Which of the following statements is true about the impact of foreign exchange rate on a country's balance of payments? ", 0, 0, 0, 0, 0, "An increase in the value of a country's currency leads to favorable balance of payments. ", "A decrease in the value of a country's currency leads to unfavorable balance of payments. ", "An increase in the value of a country's currency makes imports cheaper and exports expensive, leading to unfavorable balance of payments.", "A decrease in the value of a country's currency makes exports cheaper and imports expensive, leading to unfavorable balance of payments.", "An increase in the value of country's currency in terms of another currency makes imports cheaper in the domestic market but it makes the country's export expensive in foreign markets therefore the demand for the country's export items decreases by then it results in balance of payment deflect or unfavorable balance of payment.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("47.", "Which one of the following is an economic role of governments in a market economy system?", 0, 0, 0, 0, 0, "Provision of public goods and services.", "Production of private goods and services. ", "Allocation of resources to their efficient use.", "Engaging in export and import of private goods & services.", "The economic role of governments in market economy system is different from that of command economic system. The role of government in market economy is the provision of public goods and services.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("48.", "Government budget deficit is commonly financed by all of the following except one", 0, 0, 0, 0, 0, "money printing", "external borrowing", "domestic borrowing", "sale of public assets and properties", "Government budget deficit is commonly financed in three easy these\n1.\tDomestic borrowing \n2.\tExternal borrowing\n3.\tMoney printing\n\tThe 3rd way that is money printing is not advisable because it may result in inflation sales of public assets and properties is not the government budget deficit financing mechanism.\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("49.", "Ethiopian income tax is__________ because it __________ with taxable income.", 0, 0, 0, 0, 0, "progressive........... increases", "progressive ..........decreases", "regressive.............. increases", "neutral ...............does not change", "Ethiopian income tax is progressive because it increases with taxable income. In case of regressive tax system tax rate decreases as taxable income increases.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("50.", "Which of the following is not a rationale for fiscal decentralization in Ethiopia?", 0, 0, 0, 0, 0, "Developing fiscal decision-making power to lower level of governments. ", "Narrowing existing in-balances in economic growth and development among regions.", "Assisting regional governments by boosting their capacity for developing their localities through self- initiative. ", "Reducing the burden on the central government by eliminating fiscal transfers to regional governments. ", "A rational for fiscal decentralization in Ethiopian are developing fiscal decision-making power to lower level of governments boosting regional governments capacity for developing their localities and narrowing the disparities between regions.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("51.", "Which of the following modes of transport has a high potential of increasing efficiency and competitiveness of the Ethiopian economy by decreasing cost of inland transport?", 0, 0, 0, 0, 0, "Railway", "Road Transport", "Air Transport ", "Shipping lines ", "Among the in-land transport systems railway has a high potential of increasing efficiency and competitiveness in international trade of Ethiopian economy by decreasing cost of in land transport.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("52.", "What are the main goals of the post- 1991 education policies and strategies?", 0, 0, 0, 0, 0, "Achieving high quality by reducing quantity. ", "Addressing the problem of equality quantity.", "Achieving high quality and quantity from given inputs by increasing ", "Addressing the problem of providing education to large number of pupils by reducing quality.", "The main goal of the post 1991 (EPRDF) education policies and strategies is achieving high quality and quantity from given inputs by increasing efficiency.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("53.", "Which one of the following is NOT among the problems that the Ethiopian industrial sector faces to develop? ", 0, 0, 0, 0, 0, "Shortage of raw materials.", "High domestic demand from manufacturing output.", "Use of obsolete technology in production process.", "Low Productivity and low competitiveness with foreign produces. ", "Among the problems that the Ethiopian industrial sector faces to develop \n\tShortage of row material \n\tbackward technology in production \n\tconsumer bias on domestic products\n\tlow productivity and competitiveness with foreign producers etc. \nTherefore high domestic demand for manufacturing output is not the problem of Ethiopian industry sector. \n", "b", 0, 1, this.f543b));
        arrayList.add(new questions("54.", "Which one of the following is true about the different measures used to evaluate the performance of the industrial sector?", 0, 0, 0, 0, 0, "Value added at current market price refers to the sum of value added at factor cost and indirect taxes.", "Gross value of output refers to the total output produced per-worker during a given period of time. ", "Value added at factor cost refers to the sum of the value of output per-worker.", "Gross value of output refers to the total output produced per-unit of capital during a given period of time.", "Value added at current market price refers to the sum of value added at factor cost and indirect taxes regardless subsidies, i.e VACMP=VAFC+IBT-S", "a", 0, 1, this.f543b));
        arrayList.add(new questions("55.", "Which one of following is NOT true about post- Derg industrial development strategies and policies? ", 0, 0, 0, 0, 0, "The government introduced measures to promote inter- and intra-sectoral linkages.", "The government introduced policy measures to enhance access to finance for investors in the sector.", "The government took the lead in industrial development by increasing investment in state owned enterprises.", "The government has invested in infrastructure to create conductive environment for industrial development ", "Since post Derg industrial development strategy and policy indicates EPRDF's policy and strategy the choice under C does not allow the government to do so. That is the government doesn't take the lead in industrial development by increasing investment in state owned enterprises' because it promotes privatizations they transferred to the private sector.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("56.", "Which one of the following statements is true about the industrial sector of the Ethiopian economy? ", 0, 0, 0, 0, 0, "Its contribution to employment is less than both the agricultural and service sectors. ", "Its contribution to employment is less than the agricultural sector but greater than the service sector.", "Its contribution to the gross domestic product (GDP) is larger than the service sector but less than the agricultural sector. ", "Its contribution to the gross domestic product (GDP) is larger than the agricultural sector but less than the service sector.", "The Ethiopian industrial sector has been small compared to the agricultural and service sectors. The sector contributes about 13% to the GDP and 9.5% of employment where as the service sectors contribution 2008/09 was 45.1% and about 10% the population has been engaged in the service sector. Agriculture sector's GDP contribution in 2006 was 45.1 and 85% to employment.", "a", 0, 1, this.f543b));
        arrayList.add(new questions("57.", "Which of the following features does NOT characterize the industrial sector in Ethiopia currently?", 0, 0, 0, 0, 0, "Small-scale and cottage/ handcraft industries are owned and managed by the private sector. ", "Large- and medium- scale manufacturing industries account for 80 percent of the national put", "Ethiopian manufacturing industries are concentrated in food and beverages, textiles, and non-metallic minerals.", "The role of the public sector is largely limited to the areas of large-scale engineering communications, power, and pharmaceutical industries ", "Communication, power and large-scale engineering are reserved for the public sector. The small scale and cottage industries are owned and managed by the private sector the other characteristics of the Ethiopian industrial sector is that the manufacturing industries are concentrated in production of food& beverage textile and non-metallic minerals. 58. D. Under the choices given the true statement about the industrial development stagey of Ethiopia during Derg regime (1974-1991) was nationalization of large and medium scale private manufacturing firms.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("58.", "Which of the following is true about the industrial development strategy of Ethiopia during the Derg regime (1974-1991)?", 0, 0, 0, 0, 0, "Enhancement of active participation of the private sector. ", "Development of infrastructure and technological capability", "Privatization of large- and medium-scale public manufacturing firms ", "Nationalization of large- and medium-scale private manufacturing firms", "Under the choices given the true statement about the industrial development strategy of Ethiopia during Derg regime (1974-1991) was nationalization of large and medium scale private manufacturing firms. ", "d", 0, 1, this.f543b));
        arrayList.add(new questions("59.", "Which one of the following is NOT among the arguments behind developing countries, such as Ethiopia's, emphasis on the development of their industrial sector?", 0, 0, 0, 0, 0, "Unlike the agricultural sector, the labor absorption potential of industrial sector is high", "Unlike the agricultural sector, the industrial sector is not limited by natural events and phenomena.", "Unlike the agricultural sector, the industrial sector is not affected by the competition from other countries.", "Unlike the agricultural sector, the industrial sector had significant backward and forward linkages ", "C is also an answer. There are five basic arguments, development that maintain the idea that the industrial sector's development should be given priority over that of the other sectors these arguments are.\n1.\tThe development argument\n2.\tThe Employment argument\n3.\tThe balance of payment argument\n4.\tThe linkage argument\n5.\tThe selling argument \nThe choices under letters A and D indicates the employment argument and linkage arguments respectively where as the choice under B and C are out of the arguments.\n", "b", 0, 1, this.f543b));
        arrayList.add(new questions("60.", "Which of the following did NOT have a negative effect on the development of the agriculture sector in Ethiopia?", 0, 0, 0, 0, 0, "Adoption of Agricultural Development- Led Industrialization (ADLI). ", "Land fragmentation and lack of effective land ownership entitlement.", "Uncertainty of the weather condition, resulting in drought and famine ", "Collectivization of peasants into peasant associations and forced grain delivery.", "Except adoption of Agricultural Development Led Industrialization (ADLI). All of the choices given have a negative effect on the development of the agricultural sector of Ethiopia or choices under B, C and D are problems of Ethiopian agricultures sector. ", "a", 0, 1, this.f543b));
        arrayList.add(new questions("61.", "All of the following are components of structural adjustment program EXCEPT one ", 0, 0, 0, 0, 0, "Reduction of public spending level by decreasing public deficit.", "Redirection of productive resources from non-productive sectors. ", "Restructuring institutions towards competitiveness and efficiency.", "Reduction of public spending level by decreasing public investment in infrastructure. ", "The structural adjustment program has three components\n1.\tExpenditure reducing policy: reduction of public spending level by decreasing public deflects. \n2.\tExpenditure switching policy: redirection of productive resources from non productive sectors.\n3.\tInstitutional policy reforms: Restructures in institutions towards competitiveness and efficiency. The exception from components of structural adjustment program is the one that founds in choice D.\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("62.", "Which of the following is NOT among the structural adjustment policy measures undertaken in Ethiopia in the early 1990s?", 0, 0, 0, 0, 0, "Devaluation of the Birr. ", "Introduction of tight monetary policy.", "Expansion of economic role of the public sector and its expenditure. ", "Abolition of the interest rate ceilings so that interest rates are determined by the market forces. ", "Devaluation of the Birr was one of the structural adjustment policy measures undertaken in Ethiopia in 1992 under exchange rate policy and pursues tight monetary policy under its monetary were abolished under interest rate policy measures undertaken in structural adjustment is not among the policy measures undertaken in Ethiopia in the early 1990s.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("63.", "Which of the following is NOT a basic assumption behind the investment policy climate of Ethiopia currently?", 0, 0, 0, 0, 0, "public sector investment in infrastructure plays key role for development of the industrial sector. ", "Private sector development is key to the development of the industrial sector and development of the economy", "Prohibiting the participation of foreign investors in manufacturing sector increases the growth of domestic private sector. ", "Public sector provision of incentive packages to the private sector is necessary to enhance the productivity and growth of the industrial sector.", "All of the choices except the one under C are basic assumptions behind the investment policy climate of Ethiopia currently but prohibiting the participation foreign investors in manufacturing sector is not under a basic assumption of the current investment policy climate of Ethiopia. ", "c", 0, 1, this.f543b));
        arrayList.add(new questions("64.", "Which one of the following are NOT the major goals of national development plans under EPRDF?", 0, 0, 0, 0, 0, "Poverty reduction through rapid economic growth. ", "Development of a governance system that ensures social justice.", "People's participation in the democratic governance of the country. ", "Increasing income inequality to increase domestic capital accumulation. ", "Poverty reduction through rapid economic growth. \n\tDevelopment of a governance system that ensures social justice. \n\tPeople's participation in the democratic governance of the country are the major goals of national development plan under EPRDF but increasing income inequality is not under the major goals of national development plan under EPRDF. \n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("65.", "According to the constitution of the Federal Democratic Republic of Ethiopia, which of the following is NOT among powers and functions given to the Federal Government?", 0, 0, 0, 0, 0, "Rural land administration. ", "Maintaining sovereignty and security.", "Designing and implementing foreign policy.", "Designing and implementing monetary policy. ", "According to the constitution of the Federal Democratic Republic of Ethiopia some powers and functions given to the Federal Government are:\n\tMaintaining sovereignty and security \n\tDesigning and implementing foreign policy and\n\tDesigning and implementing monetary policy\nRural land administration is not the power and function of the Federal government rather it is the power of the respective regional governments.\n", "a", 0, 1, this.f543b));
        arrayList.add(new questions("66.", "In the Ethiopian context, \"Broad money supply' is constituted of the sum of", 0, 0, 0, 0, 0, "Saving deposits and time deposit. ", "Narrow money and quasi money.", "Currency in circulation and saving deposits.", "Currency in circulation and demand deposit.", "In the Ethiopian context Broad money supply is of narrow money and quasi money. constituted of the sum the problem", "b", 0, 1, this.f543b));
        arrayList.add(new questions("67.", "Which of the following instruments of monetary policy is expansionary? ", 0, 0, 0, 0, 0, "An increase in taxes and/ or a decrease in government spending.", "A decrease in taxes and /or an increase in government spending. ", "The National Bank of Ethiopia sells government bonds and securities to commercial banks. ", "The National Bank of Ethiopia buys government bonds and securities from commercial banks. ", "Expansionary monetary policy measures are taken to solve of deficit demand therefore the instruments are:\n1.\tReducing Bank rate \n2.\tBuying securities and\n3.\tReducing cash reserve ratio (CRR) \nThe choice under A and B are Fiscal policies and a choice under C is contractionary monetary policy so the correct expansionary monetary policy measure is buying of government bonds and securities from commercial banks.\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("68.", "Which of the following monetary policy instruments is appropriate when deficit demand affects an economy? ", 0, 0, 0, 0, 0, "The increase in discount rate.", "The decrease in discount rate. ", "The increase in cash reserve ratio.", "The increase in the selling of government securities to commercial banks. ", "The increase in discount rate, increasing in the cash reserve ratio and selling of government securities are contractionary monetary policies that is they are taken when there is excess demand but decreasing the discount rate is an expansionary monetary policy measure which helps to solve the deflect demand.", "b", 0, 1, this.f543b));
        arrayList.add(new questions("69.", "Which of the following reasons best explains the major problem facing the financial sector in Ethiopia?", 0, 0, 0, 0, 0, "Lending and collecting activities are limited. ", "The monetized sector of the economy is limited.", "The credit authorization procedures are limited. ", "Lending institutions and their capacities are limited.", "The limitation of the monetized sector of the economy is the major problem facing the financial sector in Ethiopia. ", "b", 0, 1, this.f543b));
        arrayList.add(new questions("70.", "Which one of the following was NOT among the factors that put the Ethiopian economy into a very problematic situation during the end of the Derg regime?", 0, 0, 0, 0, 0, "The civil wars that led to internal instability. ", "Mismanagement of the economy by the regime.", "High inflow of foreign capital that was beyond the absorptive capacity of the economy.", "Recurrent drought that negatively affected the performance of the agricultural sector.", "Except high inflow of capital, the civil war mismanagement and recurrent drought were among the factors that put the Ethiopian economy in to a very problematic situation during the end of the Derg regime. ", "c", 0, 1, this.f543b));
        arrayList.add(new questions("71.", "Assume that the consumer price index (CPI) in 2016 was 220 and in year 2015 it was 200. What is the annual CPI inflation rate between the two years?", 0, 0, 0, 0, 0, "5%", "10%", "20%", "No enough information to answer this question.", "No enough information to answer this question it should be asked the inflation rate of 2015 or 2016 not between the years.", "d", 0, 1, this.f543b));
        arrayList.add(new questions("72.", "Assume that the cyclical unemployment rate in a country is 4% and the structural unemployment rate is 6%. What is the number of unemployed persons given that labor force in this country amounts to 100 million?", 0, 0, 0, 0, 0, "2 million", "4 million", "6 million", "10 million", "Given Cyclical unemployment-4% \n(Structural unemployment=6%)/(Total unemployment 10%)  \nLabor force 100million\nTherefore the number of unemployed=(total unemployed)/(Total labor force)  x 100 \n=10million 100million x 100%=10million\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("73.", "If the price elasticity of demand for commodity X is -3.0, then", 0, 0, 0, 0, 0, "12% drop in price leads to a 45 rise in the quantity demanded.", "12% rise in price leads to a 36% rise in the quantity demanded.", "12% drop in price leads to a 36% rise in the quantity demanded.", "$1,000 drop in price leads to a 3,000- unit rise in the quantity demanded.", "If the price elasticity of demand for good x is 3. it can be interpreted as 1% increase in price leads to 3% decrease in the demand for the good and visa versa Therefore 12% drop in price leads to 36% rise in quantity demanded or 12% rise in price leads to 36% decrease in the quantity demanded.", "c", 0, 1, this.f543b));
        arrayList.add(new questions("74.", "Consider a production function of the form Q = k²L²\nWhose marginal product of capital is MP = 2kL²\nand marginal product of labor is MP₁ = 2K²L What is the marginal rate of technical substitution of labor for capital at the point where K= 5 and L=5?\n", 0, 0, 0, 0, 0, "5", "25", "50", "1", "Given: Marginal product of capital\n〖MP〗_K=2KL²\nMarginal product of labor is\n〖MP〗_L=2K²L\nK=5,L=5 then Marginal rate of technical substitution \nMRTS=  〖MP〗_K/〖MP〗_L =2KL²/(2K²L )=2x5x5²/(2 x 5² x 5)=  (10 x 25 )/(50 x 5)  =250/250  = 1\n", "d", 0, 1, this.f543b));
        arrayList.add(new questions("75.", "When a production function has the form Q = aL + bk\nWe can say that", 0, 0, 0, 0, 0, "The production function is linear and inputs are perfect substitutes. ", "The production function is non-linear and the inputs are perfect substitutes.", "The production function is linear and the inputs are perfect complements.", "The production function is linear and the inputs are used in fixed factor proportions only.", "The production function with the form Q=aL+bk is two input linear production function. In such a form the inputs are perfect substitutes. A linear production function is the simplest form of production function.", "a", 0, 1, this.f543b));
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
        this.f544tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    economics2009.this.timer.setVisibility(0);
                    economics2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    economics2009.this.scr.setVisibility(8);
                    economics2009.this.chr.stop();
                    economics2009.this.toolbar.setVisibility(8);
                    economics2009.this.Relative.setBackgroundColor(-7829368);
                    economics2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2009.this.getBaseContext());
                    int unused = economics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = economics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = economics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = economics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = economics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = economics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = economics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = economics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = economics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = economics2009.this.highscoreEconomics2009 = defaultSharedPreferences.getInt("econ2009hs", 0);
                    int access$600 = economics2009.this.part1 + economics2009.this.part2 + economics2009.this.part3 + economics2009.this.part4 + economics2009.this.part5 + economics2009.this.part6 + economics2009.this.part7 + economics2009.this.part8 + economics2009.this.part9;
                    economics2009.this.resultText.setText(String.valueOf(access$600));
                    economics2009.this.progressbar.setProgress(access$600);
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
                    int unused11 = economics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = economics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = economics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = economics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = economics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = economics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = economics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = economics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    String str = "econ2009hs";
                    int unused19 = economics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = economics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = economics2009.this.answered1 + economics2009.this.answered2 + economics2009.this.answered3 + economics2009.this.answered4 + economics2009.this.answered5 + economics2009.this.answered6 + economics2009.this.answered7 + economics2009.this.answered8 + economics2009.this.answered9;
                    edit.putInt("answered1", 0);
                    edit.putInt("answered2", 0);
                    edit.putInt("answered3", 0);
                    edit.putInt("answered4", 0);
                    edit.putInt("answered5", 0);
                    edit.putInt("answered6", 0);
                    edit.putInt("answered7", 0);
                    edit.putInt("answered8", 0);
                    edit.putInt("answered9", 0);
                    if (access$600 > economics2009.this.highscoreEconomics2009) {
                        edit.putInt(str, access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 75;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - economics2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1econ091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1econ092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1econ093", 0);
                    String str2 = f;
                    long j4 = defaultSharedPreferences.getLong("date1econ094", 0);
                    Long l = valueOf;
                    String str3 = f2;
                    long j5 = defaultSharedPreferences.getLong("date1econ095", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str4 = str2;
                    long j6 = defaultSharedPreferences.getLong("date1econ096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1econ097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1econ098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1econ099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1econ0910", 0);
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
                        editor.putString("scoreecon091", str3);
                        editor.putLong("date1econ091", l.longValue());
                    } else {
                        String str5 = str3;
                        editor = editor3;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scoreecon092", str5);
                            editor.putLong("date1econ092", l.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scoreecon093", str5);
                            editor.putLong("date1econ093", l.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scoreecon094", str5);
                            editor.putLong("date1econ094", l.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scoreecon095", str5);
                            editor.putLong("date1econ095", l.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scoreecon096", str5);
                            editor.putLong("date1econ096", l.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scoreecon097", str5);
                            editor.putLong("date1econ097", l.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scoreecon098", str5);
                            editor.putLong("date1econ098", l.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scoreecon099", str5);
                            editor.putLong("date1econ099", l.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scoreecon0910", str5);
                            editor.putLong("date1econ0910", l.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("dateecon091", 0);
                    long j12 = defaultSharedPreferences.getLong("dateecon092", 0);
                    long j13 = defaultSharedPreferences.getLong("dateecon093", 0);
                    long j14 = defaultSharedPreferences.getLong("dateecon094", 0);
                    long j15 = defaultSharedPreferences.getLong("dateecon095", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j16 = defaultSharedPreferences.getLong("dateecon096", 0);
                    long j17 = defaultSharedPreferences.getLong("dateecon097", 0);
                    long j18 = defaultSharedPreferences.getLong("dateecon098", 0);
                    long j19 = defaultSharedPreferences.getLong("dateecon099", 0);
                    long j20 = defaultSharedPreferences.getLong("dateecon0910", 0);
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
                        editor2.putString("iScoreecon091", str4);
                        editor2.putLong("dateecon091", l.longValue());
                    } else {
                        editor2 = editor4;
                        String str6 = str4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScoreecon092", str6);
                            editor2.putLong("dateecon092", l.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScoreecon093", str6);
                            editor2.putLong("dateecon093", l.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScoreecon094", str6);
                            editor2.putLong("dateecon094", l.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScoreecon095", str6);
                            editor2.putLong("dateecon095", l.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScoreecon096", str6);
                            editor2.putLong("dateecon096", l.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScoreecon097", str6);
                            editor2.putLong("dateecon097", l.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScoreecon098", str6);
                            editor2.putLong("dateecon098", l.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScoreecon099", str6);
                            editor2.putLong("dateecon099", l.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScoreecon0910", str6);
                            editor2.putLong("dateecon0910", l.longValue());
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
                        economics2009.this.scr.setVisibility(8);
                        economics2009.this.chr.stop();
                        economics2009.this.toolbar.setVisibility(8);
                        economics2009.this.Relative.setBackgroundColor(-7829368);
                        economics2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(economics2009.this.getBaseContext());
                        int unused = economics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = economics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = economics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = economics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = economics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = economics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = economics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = economics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = economics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = economics2009.this.highscoreEconomics2009 = defaultSharedPreferences.getInt("econ2009hs", 0);
                        int access$600 = economics2009.this.part1 + economics2009.this.part2 + economics2009.this.part3 + economics2009.this.part4 + economics2009.this.part5 + economics2009.this.part6 + economics2009.this.part7 + economics2009.this.part8 + economics2009.this.part9;
                        TextView access$1600 = economics2009.this.resultText;
                        access$1600.setText(access$600 + "/75");
                        economics2009.this.progressbar.setProgress(access$600);
                        economics2009.this.progressbar.setMax(75);
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
                        int unused11 = economics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = economics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = economics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = economics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = economics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = economics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = economics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = economics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = economics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = economics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = economics2009.this.answered1 + economics2009.this.answered2 + economics2009.this.answered3 + economics2009.this.answered4 + economics2009.this.answered5 + economics2009.this.answered6 + economics2009.this.answered7 + economics2009.this.answered8 + economics2009.this.answered9;
                        edit.putInt("answered1", 0);
                        edit.putInt("answered2", 0);
                        edit.putInt("answered3", 0);
                        edit.putInt("answered4", 0);
                        edit.putInt("answered5", 0);
                        edit.putInt("answered6", 0);
                        edit.putInt("answered7", 0);
                        edit.putInt("answered8", 0);
                        edit.putInt("answered9", 0);
                        if (access$600 > economics2009.this.highscoreEconomics2009) {
                            edit.putInt("econ2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - economics2009.this.chr.getBase()) / 1000;
                        String str = "dateecon0910";
                        String str2 = "dateecon099";
                        String str3 = "dateecon098";
                        String str4 = "dateecon097";
                        String str5 = "dateecon096";
                        String str6 = "dateecon095";
                        String str7 = "dateecon094";
                        String str8 = "dateecon093";
                        String str9 = "dateecon092";
                        String str10 = "dateecon091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1econ0910";
                        String str12 = "date1econ099";
                        if (economics2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1econ091", 0);
                            String str13 = "date1econ091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1econ092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1econ093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1econ094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1econ095", 0);
                            String str16 = "date1econ095";
                            String str17 = "date1econ094";
                            String str18 = "date1econ096";
                            long j6 = defaultSharedPreferences.getLong("date1econ096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1econ097", 0);
                            String str19 = str12;
                            String str20 = "date1econ098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1econ097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1econ093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1econ098", 0));
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
                                editor3.putString("scoreecon091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scoreecon092", str25);
                                    editor3.putLong("date1econ092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scoreecon093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scoreecon094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scoreecon095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scoreecon096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scoreecon097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scoreecon098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scoreecon099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scoreecon0910", str25);
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
                                editor4.putString("iScoreecon091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScoreecon092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScoreecon093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScoreecon094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScoreecon095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScoreecon096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScoreecon097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScoreecon098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScoreecon099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScoreecon0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1econ091";
                            String str30 = "date1econ094";
                            String str31 = str12;
                            String str32 = "date1econ093";
                            String str33 = "date1econ097";
                            String str34 = "date1econ096";
                            String str35 = str11;
                            String str36 = "date1econ095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 75;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1econ092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1econ092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1econ098";
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
                                editor2.putString("scoreecon091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scoreecon092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scoreecon093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scoreecon094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scoreecon095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scoreecon096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scoreecon097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scoreecon098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scoreecon099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scoreecon0910", str49);
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
                                editor.putString("iScoreecon091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScoreecon092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScoreecon093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScoreecon094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScoreecon095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScoreecon096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScoreecon097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScoreecon098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScoreecon099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScoreecon0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        economics2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2009.this.scr.setVisibility(8);
                economics2009.this.chr.stop();
                economics2009.this.toolbar.setVisibility(8);
                economics2009.this.Relative.setBackgroundColor(economics2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                economics2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                economics2009.this.scr.setVisibility(0);
                economics2009.this.toolbar.setVisibility(0);
                economics2009.this.telegram_layout.setVisibility(8);
                economics2009.this.chr.start();
                economics2009.this.Relative.setBackgroundColor(economics2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = economics2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = economics2009.this.mInterstitialAd = null;
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
                economics2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
