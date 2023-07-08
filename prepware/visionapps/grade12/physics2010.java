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

public class physics2010 extends AppCompatActivity {
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
    private Boolean f608b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private Button constantValue;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscorePhysics2010;
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
    private Toolbar f609tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_physics2010);
        this.f608b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextPhysics2010);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
        this.constantValue = (Button) findViewById(C2719R.C2722id.formulaReference);
        this.scr = (ScrollView) findViewById(C2719R.C2722id.scr);
        this.Relative = (RelativeLayout) findViewById(C2719R.C2722id.scroll);
        this.toolbar = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.recview = (RecyclerView) findViewById(C2719R.C2722id.questionsMaths);
        this.recview2 = (RecyclerView) findViewById(C2719R.C2722id.questions1);
        this.recview3 = (RecyclerView) findViewById(C2719R.C2722id.questions2);
        this.recview4 = (RecyclerView) findViewById(C2719R.C2722id.questions4);
        this.recview5 = (RecyclerView) findViewById(C2719R.C2722id.questions5);
        this.recview6 = (RecyclerView) findViewById(C2719R.C2722id.questions6);
        this.recview7 = (RecyclerView) findViewById(C2719R.C2722id.questions7);
        this.recview8 = (RecyclerView) findViewById(C2719R.C2722id.questions8);
        this.recview9 = (RecyclerView) findViewById(C2719R.C2722id.questions9);
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_physics2010);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        this.constantValue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2010.this.startActivity(new Intent(physics2010.this, P_Constant_Value.class));
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which of the following statement is correct about errors in measurement?", 0, 0, 0, 0, 0, "Experimental error is the same as a mistake.", "Errors occur in every scientific investigation.", "Errors make measured values same as accepted value.", "Errors can be avoided by using modern measuring instruments.", "During measurement errors can be avoided by using modern measuring instruments.", "b", 0, 1, this.f608b));
        arrayList.add(new questions("2.", "What can be concluded when the number of significant figures increase?", 0, 0, 0, 0, 0, "True reading increases", "Uncertainty increases", "Precision increases", "Accuracy increases", "When the number of significant figures increases during measurement the measured value is very closer to the actual value and the measurement is more accurate or accuracy increases.", "d", 0, 1, this.f608b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.p2010q3, 0, 0, 0, 0, "15N, 37 degree", "5N, -37 degree", "5N, 143 degree", "225N, 143 degree", "", "a", C2719R.C2721drawable.phy103e, 1, this.f608b));
        arrayList.add(new questions("4.", "", C2719R.C2721drawable.p2010q4, 0, 0, 0, 0, "↗", "⟶", "↙", "↘", "", "d", C2719R.C2721drawable.phy104e, 1, this.f608b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.p2010q5, C2719R.C2721drawable.p2010q5a, C2719R.C2721drawable.p2010q5b, C2719R.C2721drawable.p2010q5c, C2719R.C2721drawable.p2010q5d, "", "", "", "", "", "d", C2719R.C2721drawable.phy105e, 1, this.f608b));
        arrayList.add(new questions("6.", "", C2719R.C2721drawable.p2010q6, 0, 0, 0, 0, "35 m/s", "60 m/s", "65 m/s", "5 m/s", "", "c", C2719R.C2721drawable.phy106e, 1, this.f608b));
        arrayList.add(new questions("7.", "", C2719R.C2721drawable.p2010q7, 0, 0, 0, 0, "1.67 m/s", "5.67 m/s", "5 m/s", "6 m/s", "", "b", C2719R.C2721drawable.phy107e, 1, this.f608b));
        arrayList.add(new questions("8.", "Which one of the following statements is correct regarding the motion in a plane?", 0, 0, 0, 0, 0, "When a body moves in a horizontal circle, its velocity is constant.", "When a body moves in a vertical circle, its speed is constant.", "In projectile motion the horizontal component of the motion is uniformly accelerated motion.", "The centripetal force for a body moving in either vertical or horizontal circle is toward the center.", "the centripetal force for a body moving in either vertical or horizontal circle is directed toward the center.\n-\tWhen a body moves in a horizontal circle its tangential speed remains the same but tangential velocity changes in direction.\n-\tIn a horizontal projectile motion acceleration in the horizontal direction is always zero.\n-\t For a body that moves in a vertical circle velocity changes both in magnitude and indirection.\n", "d", 0, 1, this.f608b));
        arrayList.add(new questions("9.", "", C2719R.C2721drawable.p2010q9, C2719R.C2721drawable.p2010q9a, C2719R.C2721drawable.p2010q9b, C2719R.C2721drawable.p2010q9c, C2719R.C2721drawable.p2010q9d, "", "", "", "", "As the bullet reaches the maximum height (point A) its acceleration in the y-direction is 10\" \" m/s^2 in magnitude and directed down ward. Since the horizontal motion is uniform throughout a_x=0 ", "b", 0, 1, this.f608b));
        arrayList.add(new questions("10.", "", C2719R.C2721drawable.p2010q10, 0, 0, 0, 0, "The acceleration of student A is less than that of student B.", "The acceleration of student B is less than that of student A.", "Both boys will be accelerated by the same magnitude but in opposite directions.", "There would be no acceleration because the forces are equal and opposite.", "When student A pushes student B by exerting a force F to the right student B reacts by the same force in the opposite direction according to the statement of Newton's third law of motion. Since they exert the same force on each other with m_A>m_B student B will have more acceleration after impact.", "a", 0, 1, this.f608b));
        arrayList.add(new questions("11.", "For a constant force F, if the impulse imparted to the system is large, then what can you conclude about the collision?", 0, 0, 0, 0, 0, "Linear momentum is conserved.", "Kinetic energy is conserved.", "The contact or impact time is large.", "The change in velocity is small.", "The impulse imparted by a constant force F ⃗ on a body is given by J ⃗=ΔP ⃗=F ⃗.Δt. The impulse imparted is large when the contact or impact time is large because F ⃗ is constant.", "c", 0, 1, this.f608b));
        arrayList.add(new questions("12.", "", 0, 0, 0, 0, 0, "It increases because of conservation of mechanical energy.", "It decreases because of conservation of momentum.", "It decreases because of conservation of mechanical energy.", "It remains the same because the raindrops are falling perpendicular to the direction of the cart's motion.", "", "b", C2719R.C2721drawable.phy1012e, 1, this.f608b));
        arrayList.add(new questions("13.", "A satellite moves at a constant speed in a circular orbit about the center of the Earth at an altitude half the radius of the Earth above its surface. If g is the gravitational acceleration at the surface of the Earth and R its radius, then what is the speed of the satellite?", 0, C2719R.C2721drawable.p2010q13a, C2719R.C2721drawable.p2010q13b, C2719R.C2721drawable.p2010q13c, C2719R.C2721drawable.p2010q13d, "", "", "", "", "", "d", C2719R.C2721drawable.phy1013e, 1, this.f608b));
        arrayList.add(new questions("14.", "", C2719R.C2721drawable.p2010q14, 0, 0, 0, 0, "1J", "4J", "8J", "16J", "", "d", C2719R.C2721drawable.phy1014e, 1, this.f608b));
        arrayList.add(new questions("15.", "A body that is released from the top of a tall building reaches the ground after six seconds. What is the ratio of the kinetic energy acquired by it at the end of the first three the kinetic energy during the next three seconds?", 0, 0, 0, 0, 0, "1/3", "1", "3/2", ExifInterface.GPS_MEASUREMENT_2D, "", "a", C2719R.C2721drawable.phy1015e, 1, this.f608b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.p2010q16, 0, 0, 0, 0, "7W", "8W", "6W", "4W", "", "c", C2719R.C2721drawable.phy1016e, 1, this.f608b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.p2010q17, 0, 0, 0, 0, "10√5 rad/s", "20√10 rad/s", "10 rad/s", "18.8 rad/s", "", "b", C2719R.C2721drawable.phy1017e, 1, this.f608b));
        arrayList.add(new questions("18.", "", C2719R.C2721drawable.p2010q18, 0, 0, 0, 0, "All will reach the bottom at the same time.", "Sphere, solid cylinder, ring", "Ring, solid cylinder, sphere.", "Solid cylinder, sphere, ring.", "", "b", C2719R.C2721drawable.phy1018e, 1, this.f608b));
        arrayList.add(new questions("19.", "If in a given rotational system of a body the angular momentum is increased with lime, which one of the following statements is not correct?", 0, 0, 0, 0, 0, "The radius of rotation may increase.", "The moment of inertial may increase.", "There is a torque exerted on the system.", "There is no torque exerted on the system", "", "d", C2719R.C2721drawable.phy1019e, 1, this.f608b));
        arrayList.add(new questions("20.", "Which of the following is a correct statement about the first condition of equilibrium?", 0, 0, 0, 0, 0, "The net force on an object must be zero.", "The sum of all torques must be zero.", "Clockwise moments should balance counter clockwise moments.", "The torque produced by a force should be perpendicular to the force.", "", "a", C2719R.C2721drawable.phy1020e, 1, this.f608b));
        arrayList.add(new questions("21.", "From the figures given below, which one is in equilibrium?", 0, C2719R.C2721drawable.p2010q21a, C2719R.C2721drawable.p2010q21b, C2719R.C2721drawable.p2010q21c, C2719R.C2721drawable.p2010q21d, "", "", "", "", "In all the figures shown the forces are couple and their net translational effect is zero because they cancel out satisfying the first condition of equilibrium but the forces shown in B, C and D have rotational effect.\nIn A both conditions of equilibrium are satisfied.\n", "a", 0, 1, this.f608b));
        arrayList.add(new questions("22.", "Which of the following figure indicates tensile deformation?", 0, C2719R.C2721drawable.p2010q22a, C2719R.C2721drawable.p2010q22b, C2719R.C2721drawable.p2010q22c, C2719R.C2721drawable.p2010q22d, "", "", "", "", "The figure shown in A indicates compression deformation.\n\tThe figure shown B indicates torsional deformation.\n\tThe figure shown in C indicates hear deformation.\n\tThe figure shown in D indicates tensile deformation. \n", "d", 0, 1, this.f608b));
        arrayList.add(new questions("23.", "A beaker with water resting on a scale weight 40\" \" N. A block suspended on a hanging spring weight 20\" \" N. The spring scale reads 15\" \" N when a block is fully submerged in the water. What is the reading of a scale on which the beaker with water rests, while the block is submerged in the water after detached from the hanging spring?", 0, 0, 0, 0, 0, "25N", "45N", "55N", "60N", "", "c", C2719R.C2721drawable.phy1023e, 1, this.f608b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.p2010q24, 0, 0, 0, 0, "25%", "50%", "75%", "100%", "", "a", C2719R.C2721drawable.phy1024e, 1, this.f608b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.p2010q25, 0, 0, 0, 0, "0.3 m/s", "0.9 m/s ", "3.3 m/s", "3.6 m⁄s", "", "a", C2719R.C2721drawable.phy1025e, 1, this.f608b));
        arrayList.add(new questions("26.", "An electric immersion water heater is rated at 400W. How long will it take to heat one kilogram of water from 10 degree C to 30 degree C ? (The specific heat of water is 4.2 l/gK ) ", 0, 0, 0, 0, 0, "3.5 min ", "-1 min ", "15 min", "45 min", "", "a", C2719R.C2721drawable.phy1026e, 1, this.f608b));
        arrayList.add(new questions("27.", "If the internal energy of the system decreases, then what can be concluded energy of the system decreases, then what can be", 0, 0, 0, 0, 0, "Heat is added to the system and work is done by the system.", "Heat is removed from the system and work is done on the system.", "Heat is added to the system and work is done on the system.", "Heat is removed from the system and work is done by the system.", "According to the first law of thermodynamics ΔU=ΔQ+Δw when heat is removed from the system ΔQ<0 and when work is done on the system by its surrounding Δw<0, hence ΔU=ΔQ+Δw<0 which means the internal energy of the system decreases.", "b", 0, 1, this.f608b));
        arrayList.add(new questions("28.", "If a thermodynamic system undergoes a process in which its internal energy increased by 400 J while doing 200 J of work on its surrounding then what is the energy absorbed in or extracted from it in the form of heat?", 0, 0, 0, 0, 0, "-600 J", "600 J", "200 J", "-200 J", "", "b", C2719R.C2721drawable.phy1028e, 1, this.f608b));
        arrayList.add(new questions("29.", "Which of the following statements is not correct?", 0, 0, 0, 0, 0, "A system can absorb heat from a hot reservoir and can convert it entirely into work without additional changes in the system and its surroundings.", "No process is possible in which there is an overall decrease in the entropy of the universe.", "The complete conversion of energy from hot source into work is not possible.", "The transfer of energy from a cooler body to hotter body is quite possible.", "According to the second law of thermodynamics\ni. The complete conservation of energy from a hot source into work is not possible.\nii. No process is possible in which there is an overall decrease in the entropy of the universe.\niii. The spontaneous transfer of energy from a cooler body to hotter body is quite possible.\nIn choice a system that absorb heat from a hot reservoir can convert it entirely (wholly) in to work without additional change in the system contradicts the second law of thermodynamics.\n", "a", 0, 1, this.f608b));
        arrayList.add(new questions("30.", "A heat engine operating between 100^∘ C and 700^∘ C has efficiency equal to 40% of the maximum theoretical efficiency. How much energy does this engine extract from the hot reservoir in order to do 5000J of mechanical work?", 0, 0, 0, 0, 0, "810.4 J", "81.0 J", "20259.32 J", "20.3 J", "", "c", C2719R.C2721drawable.phy1030e, 1, this.f608b));
        arrayList.add(new questions("31.", "What makes the oscillatory motion a simple harmonic motion?", 0, 0, 0, 0, 0, "The acceleration of the motion is directly proportional in magnitude but opposite in direction to the displacement.", "The acceleration of the motion is directly proportional to the velocity.", "The velocity of the motion is directly proportional to the displacement.", "The velocity of the motion is inversely proportional to the displacement.", "An oscillatory motion is said to be simple harmonic motion it the acceleration of the motion is directly proportional in magnitude but opposite in direction to the displacement. a ⃗∼-x ⃗", "a", 0, 1, this.f608b));
        arrayList.add(new questions("32.", "The two-end fixed string of length 0.5 m has a mass per unit length 2g/m. If the tension in the string is 80 N, what is the second harmonic frequency?", 0, 0, 0, 0, 0, "100√2 Hz", "200 Hz", "400 Hz", "600 Hz", "", "c", C2719R.C2721drawable.phy1032e, 1, this.f608b));
        arrayList.add(new questions("33.", "Which one of the followings is not the use of Doppler Effect?", 0, 0, 0, 0, 0, "Astronomy", "Blood flow measurement", "Radar", "Energy transmission", "The Doppler Effect has a number of applications including.\n-\ti) Astronomy: to observe spectral lines in the visible spectrum of light distant galaxies show a re-shift.\n-\tii) Medical imaging and blood flow measurement an echo diagram is used to determine the direction and velocity of blood flow.\n-\tiii) Radar: The Doppler effect is used in some types of radar to measure the velocity of a range of objects by fringe a radar beam at a moving target and reflects from the surface back to the detector. \n", "d", 0, 1, this.f608b));
        arrayList.add(new questions("34.", "A 632.8 nm laser light produces an interference pattern on a screen of 4.0 m from a pair of slits. The slit space is equal to 0.2 mm. Calculate the fringe width.", 0, 0, 0, 0, 0, "12.7 mm", "25.3 mm", "6.33 mm", "15.3 cm", "", "a", C2719R.C2721drawable.phy1034e, 1, this.f608b));
        arrayList.add(new questions("35.", "Why is an interference pattern not observed between the lights produced from a pair of car headlights?", 0, 0, 0, 0, 0, "The light sources are not collimated.", "Interference is observed only in laboratory conditions.", "The spread of light as it travels out of the source.", "The light sources are not coherent.", "The lights produced from a pair of car head lights cannot produce interference patterns because the light sources are not coherent.", "d", 0, 1, this.f608b));
        arrayList.add(new questions("36.", "Suppose that three point charges are placed along a straight line and the electrostatic force exerted on the middle charge is zero. What can we conclude about the charges?", 0, 0, 0, 0, 0, "The signs of the three charges should be the same.", "The middle charge should be placed at the center between the two charges.", "The charges at the ends must have the same sign.", "The charge at the middle and at the left and should have the same sign.", "", "c", C2719R.C2721drawable.phy1036e, 1, this.f608b));
        arrayList.add(new questions("37.", "", 0, 0, 0, 0, 0, "Towards A ", "Towards B", "Remains at O", "Parallel to the plates", "The electron will more towards plate B by gaining electrical potential energy.", "b", 0, 1, this.f608b));
        arrayList.add(new questions("38.", "A capacitor of 12μF capacitance can be fully charged after it is connected between a potential difference of 9V. How much electrical energy is used in charging the capacitor?", 0, C2719R.C2721drawable.p2010q38a, C2719R.C2721drawable.p2010q38b, C2719R.C2721drawable.p2010q38c, C2719R.C2721drawable.p2010q38d, "", "", "", "", "", "a", C2719R.C2721drawable.phy1038e, 1, this.f608b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.p2010q39, C2719R.C2721drawable.p2010q39a, C2719R.C2721drawable.p2010q39b, C2719R.C2721drawable.p2010q39c, C2719R.C2721drawable.p2010q39d, "", "", "", "", "", "n", C2719R.C2721drawable.phy1039e, 1, this.f608b));
        arrayList.add(new questions("40.", "Which of the following statement is correct?", 0, 0, 0, 0, 0, "Galvanometer can be converted to ammeter of different scale by connecting variety of low valued shunt resistance in parallel.", "Galvanometer can be converted to voltmeter of different scale by, connecting low valued resistance in parallel:", "Low valued internal resistance increases accuracy of voltmeter.", "High value internal resistance increases the accuracy of ammeter.", "In order to convert a galvanometer at full scale deflection into ammeter we must connect a variety of low valued shunt resistance in parallel.", "a", 0, 1, this.f608b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.p2010q41, 0, 0, 0, 0, "0.125A", "1.0A", "0.625A", "0.75A ", "", "c", C2719R.C2721drawable.phy1041e, 1, this.f608b));
        arrayList.add(new questions("42.", "Suppose you obtain a piece of iron from your laboratory shelf. How can you experimentally determine, for sure, that it is magnetized?", 0, 0, 0, 0, 0, "If it attracts another magnet.", "If it repels another magnet.", "If it diverges a charged electroscope", "There is no single and sure way to determine its magnetization.", "There is no single and exact way to determine the magnetization of the iron piece.", "d", 0, 1, this.f608b));
        arrayList.add(new questions("43.", "If a charged particle enters into a uniform magnetic field perpendicular to its direction, then what will happen?", 0, 0, 0, 0, 0, "It moves in an elliptical path.", "The radius of its path is proportional to the magnetic field strength.", "The period of the motion is inversely related to the magnetic field strength.", "The charged particle will not be affected by magnetic field.", "", "c", C2719R.C2721drawable.phy1043e, 1, this.f608b));
        arrayList.add(new questions("44.", "Two parallel wires each carrying 5A current in the same direction are separated by 2.5\" \" cm. What is the magnitude of the force per unit length acting on the wires? Is the force attractive or repulsive?", 0, C2719R.C2721drawable.p2010q44a, C2719R.C2721drawable.p2010q44b, C2719R.C2721drawable.p2010q44c, C2719R.C2721drawable.p2010q44d, "", "", "", "", "", "b", C2719R.C2721drawable.phy1044e, 1, this.f608b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.p2010q45, C2719R.C2721drawable.p2010q44a, C2719R.C2721drawable.p2010q44b, C2719R.C2721drawable.p2010q44c, C2719R.C2721drawable.p2010q44d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1045e, 1, this.f608b));
        arrayList.add(new questions("46.", "An inductor has a self-inductance of 12mH. The current in the circuit decreases at a rate of 2.0 A/S. What is the magnitude of the induced electromotive force?", 0, C2719R.C2721drawable.p2010q46a, C2719R.C2721drawable.p2010q46b, C2719R.C2721drawable.p2010q46c, C2719R.C2721drawable.p2010q46d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1046e, 1, this.f608b));
        arrayList.add(new questions("47.", "Which of the following is correct about the characteristic of current and voltage in a.c circuits?", 0, 0, 0, 0, 0, "If the current is in phase with the voltage, the circuit is inductive.", "If the current leads the voltage, its capacitive reactance is greater than inductive reactance.", "If the current leads the voltage, it is inductive circuit.", "If the current lags the voltage, the circuit is capacitive.", "", "b", C2719R.C2721drawable.phy1047e, 1, this.f608b));
        arrayList.add(new questions("48.", "An RLC circuit is designed to have a resistance of 400Ω, capacitive reactance of 350Ω and inductive reactance of 50Ω. The circuit is connected to an alternative voltage source of effective (rms) value 50 V, and frequency 50 Hz. What is the output average power?", 0, 0, 0, 0, 0, "40 W", "4.0 W", "400 W", "62.5 W", "", "b", C2719R.C2721drawable.phy1048e, 1, this.f608b));
        arrayList.add(new questions("49.", "Which of the following has an electron volt unit?", 0, 0, 0, 0, 0, "Charge", "Potential difference", "Energy", "Electromagnetic intensity", "", "c", C2719R.C2721drawable.phy1049e, 1, this.f608b));
        arrayList.add(new questions("50.", "In Rutherford experiment, a beam of positively charged alpha particles was projected into a thin piece of gold foil. One of the observation of this experiment is that some charged particles deflected through a large angle (10 degree to 90 degree) be those concentrated in one place. What conclusion can be drawn from this observation?", 0, 0, 0, 0, 0, "Most of the atom is empty space.", "All the atom is positive charge.", "Most of the mass and all positive charge is in tiny central nucleus.", "All the atom's negative charge.", "According to Rutherford's nuclear model of the atom all the positive charge and most of the mass is concentrated in a tiny central nucleus. Most of the atom is empty space, and electrons orbit at the edge.", "c", 0, 1, this.f608b));
        recviewquestionmaths recviewquestionmaths = new recviewquestionmaths();
        recviewquestionmaths.setQuestions(arrayList);
        this.recview.setAdapter(recviewquestionmaths);
        this.recview.setLayoutManager(new LinearLayoutManager(this));
        Toolbar toolbar2 = (Toolbar) findViewById(C2719R.C2722id.app);
        this.toolbar = toolbar2;
        setSupportActionBar(toolbar2);
        this.timer = (TextView) findViewById(C2719R.C2722id.timer);
        this.report = (TextView) findViewById(C2719R.C2722id.report);
        this.chr = (Chronometer) findViewById(C2719R.C2722id.chron);
        Toolbar toolbar3 = (Toolbar) findViewById(C2719R.C2722id.bar);
        this.f609tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    physics2010.this.timer.setVisibility(0);
                    physics2010.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    physics2010.this.scr.setVisibility(8);
                    physics2010.this.chr.stop();
                    physics2010.this.toolbar.setVisibility(8);
                    physics2010.this.Relative.setBackgroundColor(-7829368);
                    physics2010.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2010.this.getBaseContext());
                    int unused = physics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = physics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = physics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = physics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = physics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = physics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = physics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = physics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = physics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = physics2010.this.highscorePhysics2010 = defaultSharedPreferences.getInt("phy2010hs", 0);
                    int access$600 = physics2010.this.part1 + physics2010.this.part2 + physics2010.this.part3 + physics2010.this.part4 + physics2010.this.part5 + physics2010.this.part6 + physics2010.this.part7 + physics2010.this.part8 + physics2010.this.part9;
                    TextView access$1600 = physics2010.this.resultText;
                    access$1600.setText(access$600 + "/50");
                    physics2010.this.progressbar.setProgress(access$600);
                    physics2010.this.progressbar.setMax(50);
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
                    int unused11 = physics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = physics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = physics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = physics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = physics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = physics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = physics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = physics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = physics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = physics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = physics2010.this.answered1 + physics2010.this.answered2 + physics2010.this.answered3 + physics2010.this.answered4 + physics2010.this.answered5 + physics2010.this.answered6 + physics2010.this.answered7 + physics2010.this.answered8 + physics2010.this.answered9 + physics2010.this.answered10;
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
                    if (access$600 > physics2010.this.highscorePhysics2010) {
                        edit.putInt("phy2010hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 50;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - physics2010.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1phy101", 0);
                    long j2 = defaultSharedPreferences.getLong("date1phy102", 0);
                    long j3 = defaultSharedPreferences.getLong("date1phy103", 0);
                    long j4 = defaultSharedPreferences.getLong("date1phy104", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1phy105", 0);
                    long j6 = defaultSharedPreferences.getLong("date1phy106", 0);
                    long j7 = defaultSharedPreferences.getLong("date1phy107", 0);
                    long j8 = defaultSharedPreferences.getLong("date1phy108", 0);
                    long j9 = defaultSharedPreferences.getLong("date1phy109", 0);
                    long j10 = defaultSharedPreferences.getLong("date1phy1010", 0);
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
                        editor.putString("scorephy101", str);
                        editor.putLong("date1phy101", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorephy102", str2);
                            editor.putLong("date1phy102", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorephy103", str2);
                            editor.putLong("date1phy103", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorephy104", str2);
                            editor.putLong("date1phy104", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorephy105", str2);
                            editor.putLong("date1phy105", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorephy106", str2);
                            editor.putLong("date1phy106", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorephy107", str2);
                            editor.putLong("date1phy107", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorephy108", str2);
                            editor.putLong("date1phy108", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorephy109", str2);
                            editor.putLong("date1phy109", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorephy1010", str2);
                            editor.putLong("date1phy1010", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datephy101", 0);
                    long j12 = defaultSharedPreferences.getLong("datephy102", 0);
                    long j13 = defaultSharedPreferences.getLong("datephy103", 0);
                    long j14 = defaultSharedPreferences.getLong("datephy104", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datephy105", 0);
                    long j16 = defaultSharedPreferences.getLong("datephy106", 0);
                    long j17 = defaultSharedPreferences.getLong("datephy107", 0);
                    long j18 = defaultSharedPreferences.getLong("datephy108", 0);
                    long j19 = defaultSharedPreferences.getLong("datephy109", 0);
                    long j20 = defaultSharedPreferences.getLong("datephy1010", 0);
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
                        editor2.putString("iScorephy101", f);
                        editor2.putLong("datephy101", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorephy102", f);
                            editor2.putLong("datephy102", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorephy103", f);
                            editor2.putLong("datephy103", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorephy104", f);
                            editor2.putLong("datephy104", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorephy105", f);
                            editor2.putLong("datephy105", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorephy106", f);
                            editor2.putLong("datephy106", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorephy107", f);
                            editor2.putLong("datephy107", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorephy108", f);
                            editor2.putLong("datephy108", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorephy109", f);
                            editor2.putLong("datephy109", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorephy1010", f);
                            editor2.putLong("datephy1010", valueOf.longValue());
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
                        physics2010.this.scr.setVisibility(8);
                        physics2010.this.chr.stop();
                        physics2010.this.toolbar.setVisibility(8);
                        physics2010.this.Relative.setBackgroundColor(-7829368);
                        physics2010.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2010.this.getBaseContext());
                        int unused = physics2010.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = physics2010.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = physics2010.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = physics2010.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = physics2010.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = physics2010.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = physics2010.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = physics2010.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = physics2010.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = physics2010.this.highscorePhysics2010 = defaultSharedPreferences.getInt("phy2010hs", 0);
                        int access$600 = physics2010.this.part1 + physics2010.this.part2 + physics2010.this.part3 + physics2010.this.part4 + physics2010.this.part5 + physics2010.this.part6 + physics2010.this.part7 + physics2010.this.part8 + physics2010.this.part9;
                        TextView access$1600 = physics2010.this.resultText;
                        access$1600.setText(access$600 + "/50");
                        physics2010.this.progressbar.setProgress(access$600);
                        physics2010.this.progressbar.setMax(50);
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
                        int unused11 = physics2010.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = physics2010.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = physics2010.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = physics2010.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = physics2010.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = physics2010.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = physics2010.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = physics2010.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = physics2010.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = physics2010.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = physics2010.this.answered1 + physics2010.this.answered2 + physics2010.this.answered3 + physics2010.this.answered4 + physics2010.this.answered5 + physics2010.this.answered6 + physics2010.this.answered7 + physics2010.this.answered8 + physics2010.this.answered9 + physics2010.this.answered10;
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
                        if (access$600 > physics2010.this.highscorePhysics2010) {
                            edit.putInt("phy2010hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - physics2010.this.chr.getBase()) / 1000;
                        String str = "datephy1010";
                        String str2 = "datephy109";
                        String str3 = "datephy108";
                        String str4 = "datephy107";
                        String str5 = "datephy106";
                        String str6 = "datephy105";
                        String str7 = "datephy104";
                        String str8 = "datephy103";
                        String str9 = "datephy102";
                        String str10 = "datephy101";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1phy1010";
                        String str12 = "date1phy109";
                        if (physics2010.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1phy101", 0);
                            String str13 = "date1phy101";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1phy102", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1phy103", 0);
                            long j4 = defaultSharedPreferences.getLong("date1phy104", 0);
                            long j5 = defaultSharedPreferences.getLong("date1phy105", 0);
                            String str16 = "date1phy105";
                            String str17 = "date1phy104";
                            String str18 = "date1phy106";
                            long j6 = defaultSharedPreferences.getLong("date1phy106", 0);
                            long j7 = defaultSharedPreferences.getLong("date1phy107", 0);
                            String str19 = str12;
                            String str20 = "date1phy108";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1phy107";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1phy103";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1phy108", 0));
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
                                editor3.putString("scorephy101", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorephy102", str25);
                                    editor3.putLong("date1phy102", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorephy103", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorephy104", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorephy105", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorephy106", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorephy107", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorephy108", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorephy109", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorephy1010", str25);
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
                                editor4.putString("iScorephy101", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorephy102", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorephy103", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorephy104", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorephy105", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorephy106", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorephy107", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorephy108", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorephy109", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorephy1010", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1phy101";
                            String str30 = "date1phy104";
                            String str31 = str12;
                            String str32 = "date1phy103";
                            String str33 = "date1phy107";
                            String str34 = "date1phy106";
                            String str35 = str11;
                            String str36 = "date1phy105";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1phy102", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1phy102";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1phy108";
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
                                editor2.putString("scorephy101", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorephy102", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorephy103", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorephy104", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorephy105", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorephy106", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorephy107", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorephy108", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorephy109", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorephy1010", str49);
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
                                editor.putString("iScorephy101", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorephy102", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorephy103", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorephy104", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorephy105", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorephy106", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorephy107", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorephy108", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorephy109", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorephy1010", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        physics2010.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2010.this.scr.setVisibility(8);
                physics2010.this.chr.stop();
                physics2010.this.toolbar.setVisibility(8);
                physics2010.this.Relative.setBackgroundColor(physics2010.this.getResources().getColor(C2719R.C2720color.transparent_black));
                physics2010.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2010.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2010.this.scr.setVisibility(0);
                physics2010.this.toolbar.setVisibility(0);
                physics2010.this.telegram_layout.setVisibility(8);
                physics2010.this.chr.start();
                physics2010.this.Relative.setBackgroundColor(physics2010.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = physics2010.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = physics2010.this.mInterstitialAd = null;
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
                physics2010.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
