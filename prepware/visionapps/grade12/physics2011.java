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

public class physics2011 extends AppCompatActivity {
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
    private Boolean f610b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private Button constantValue;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscorePhysics2011;
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
    private Toolbar f611tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_physics2011);
        this.f610b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextPhysics2011);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_physics2011);
        this.constantValue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2011.this.startActivity(new Intent(physics2011.this, P_Constant_Value.class));
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "", C2719R.C2721drawable.p2011q1, C2719R.C2721drawable.p2011q1a, C2719R.C2721drawable.p2011q1b, C2719R.C2721drawable.p2011q1c, C2719R.C2721drawable.p2011q1d, "", "", "", "", "", "d", C2719R.C2721drawable.phy111e, 1, this.f610b));
        arrayList.add(new questions("2.", "A driver of an automobile travelling at a constant speed 20\" \" m/s suddenly applies a brake and the automobile comes to rest in 2.0 seconds after skidding for a certain distance. What is the length of the skid distance?", 0, 0, 0, 0, 0, "400 m", "40 m", "20 m", "10 m", "", "c", C2719R.C2721drawable.phy112e, 1, this.f610b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.p2011q3, 0, 0, 0, C2719R.C2721drawable.p2011q3d, "Between C and D, the motion is with constant acceleration ", "Total displacement is 84m  ", "Between D and E, the motion is with constant positive acceleration.", "", "", "b", C2719R.C2721drawable.phy113e, 1, this.f610b));
        arrayList.add(new questions("4.", "An object of mass M is set in a vertical circular motion. The tension I from the rope keeps the object in a circular path with speed v. Where does the rope experience a maximum tension?", 0, 0, 0, 0, 0, "At the bottom of the circle", "At the top of the circle", "When the object is at half of the circle,", "When it is at 45 degrees to the vertical.", "", "a", C2719R.C2721drawable.phy114e, 1, this.f610b));
        arrayList.add(new questions("5.", "", C2719R.C2721drawable.p2011q5, C2719R.C2721drawable.p2011q5a, C2719R.C2721drawable.p2011q5b, C2719R.C2721drawable.p2011q5c, C2719R.C2721drawable.p2011q5d, "", "", "", "", "", "d", C2719R.C2721drawable.phy115e, 1, this.f610b));
        arrayList.add(new questions("6.", "A shell is fired from a gun, whose barrel is inclined at an angle to the horizontal. During the flight, the shell explodes in air into fragments. The center of mass of different fragments will follow", 0, 0, 0, 0, 0, "A parabola", "A vertical straight line", "A horizontal straight line", "An unpredictable path", "When the shell fired at an angel to the horizontal, the shell explodes in air into fragments and moves in different directions the center of mass of different fragments will follow an unpredictable path because the coordinates of each fragment is unknown.", "d", 0, 1, this.f610b));
        arrayList.add(new questions("7.", "Which part of a scientific report discusses the accuracy of measurements taken?", 0, 0, 0, 0, 0, "Methods", "Theory", "Aim", "Results", "Accuracy is defined as the degree of closeness of measured values to the actual value. Therefore, the results of the measurements taken determines the accuracy.", "d", 0, 1, this.f610b));
        arrayList.add(new questions("8.", "What is the magnitude of the resultant velocity for a bird flying first at a speed of 10 m/s, North East and they flying to South at a speed of 8 m/s ?", 0, 0, 0, 0, 0, "16.6 m/s", "7.13 m/s", "12.8 m/s", "7.07 m/s", "", "b", C2719R.C2721drawable.phy118e, 1, this.f610b));
        arrayList.add(new questions("9.", "", C2719R.C2721drawable.p2011q9, 0, 0, 0, 0, "The velocity of the raindrop", "The velocity of the extra mass added to the raindrop", "The velocity of the loss in mass of raindrop", "The rate of change of the velocity for combined system.", "", "c", C2719R.C2721drawable.phy119e, 1, this.f610b));
        arrayList.add(new questions("10.", "A trolley is set to move on a smooth track that is banked at an angle of 30 degrees. For a trolley moving with a speed 5 m/s to round the curve, what is the radius of the banked surface?", 0, 0, 0, 0, 0, "10 m", "2.5 m", "5.0 m", "3.5 m", "", "c", C2719R.C2721drawable.phy1110e, 1, this.f610b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.p2011q11, 0, 0, 0, 0, "4.5rad/s", "2.5rad/s", "5.4rad/s", "3rad/s", "", "b", C2719R.C2721drawable.phy1111e, 1, this.f610b));
        arrayList.add(new questions("12.", "", C2719R.C2721drawable.p2011q12, C2719R.C2721drawable.p2011q12a, C2719R.C2721drawable.p2011q12b, C2719R.C2721drawable.p2011q12c, C2719R.C2721drawable.p2011q12d, "", "", "", "", "", "b", C2719R.C2721drawable.phy1112e, 1, this.f610b));
        arrayList.add(new questions("13.", "Five beads of equal mass are fixed on a rigid light rod that is free to rotate about a frictionless vertical bearing. The arrangement is such that, four of them are placed at 0.25 m and the fifth on is at 0.5 m from the axis of rotation. The rotational kinetic energy is 144J when the beads were rotating with angular speed of 48rad/s. What is the mass of each bead?", 0, 0, 0, 0, 0, "0.75Kg", "0.5Kg", "0.25Kg", "1Kg", "", "c", C2719R.C2721drawable.phy1113e, 1, this.f610b));
        arrayList.add(new questions("14.", "A grade 11 physics teacher ordered four of his students to measure the length of a class room. He provided them the following length measuring instruments. The instruments are meter rule with millimeter division, Vernier calipers, micrometer screw gauge and 'meter tape with centimeter scale, but its zero reading is not visible. Which one of these instruments is appropriate for the task?", 0, 0, 0, 0, 0, "Meter tape", "Meter rule", "Vernier calipers", "Micrometer screw gauge", "Vernier caliper and micro meter screw gauge are used to measure inner and outer diameters of circular bolts, whereas a meter rule calibrated in millimeter scale is more appropriate than a meter tape which is calibrated in centimeter.", "b", 0, 1, this.f610b));
        arrayList.add(new questions("15.", "", C2719R.C2721drawable.p2011q15, 0, 0, 0, 0, "5.0 N", "25.0 N", "30.0 N", "20.0 N", "", "c", C2719R.C2721drawable.phy1115e, 1, this.f610b));
        arrayList.add(new questions("16.", "", C2719R.C2721drawable.p2011q16, C2719R.C2721drawable.p2011q16a, C2719R.C2721drawable.p2011q16b, C2719R.C2721drawable.p2011q16c, C2719R.C2721drawable.p2011q16d, "", "", "", "", "", "a", C2719R.C2721drawable.phy1116e, 1, this.f610b));
        arrayList.add(new questions("17.", "Which of the following is equal to the amount of work required to stop moving object", 0, 0, 0, 0, 0, "The mass of the object times its acceleration", "The mass of the object times is velocity", "The square of the velocity of the object", "The kinetic energy of the object", "The amount of work required to stop a moving object is equal to the loss of kinetic energy of the object.", "d", 0, 1, this.f610b));
        arrayList.add(new questions("18.", "A 1 kg roller coaster is acted on by a 4N force over a displacement of 2m in the direction of torce and then set free. The roller is moving on a smooth and horizontal surface towards a frec end of a spring is compressed by 20cm to bring the roller coaster to rest, then what is the value of the spring constant?", 0, 0, 0, 0, 0, "400 N/m", "200 N/m", "100 N/m", "800 N/m", "", "a", C2719R.C2721drawable.phy1118e, 1, this.f610b));
        arrayList.add(new questions("19.", "Which of the following case is no work done by a dissipative force?", 0, 0, 0, 0, 0, "When a parachute jump from a plane", "when someone slides a box on a horizontal rough surface", "On a racing car that moves in a desert", "for a freely falling object", "No work is done by a dissipative force for a feely falling object because air resistance is negligible and the force acting on the object is the force of gravity which is a conservative force.", "d", 0, 1, this.f610b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.p2011q20, 0, 0, 0, 0, "70 N, East ", "30 N, west", "28 N,West", "14 N, West", "", "d", C2719R.C2721drawable.phy1120e, 1, this.f610b));
        arrayList.add(new questions("21.", "Water flows at a rate of 0.4 litter per second through garden hose of inside diameter 4.0 cm. The nozzle of the hose is a circular opening of diameter 2.0 cm. What is the speed of the water when it emerges? (π=3.14)", 0, 0, 0, 0, 0, "1.27 m/s", "0.32 m/s", "3.2 m/s", "12.7 m/s", "", "a", C2719R.C2721drawable.phy1121e, 1, this.f610b));
        arrayList.add(new questions("22.", "How much heat would be absorbed by 2 g of ice at 0 degree Celsius dropped into water at 0 degree C, to melt it totally to water at 0 degree C ? (Latent heat of melting, L=340,000 J(Kg)", 0, 0, 0, 0, 0, "420J", "840 J", "340 J", "680 J", "", "d", C2719R.C2721drawable.phy1122e, 1, this.f610b));
        arrayList.add(new questions("23.", "The direction of heat flow is from", 0, 0, 0, 0, 0, "high pressure to low pressure", "high density to low density", "high temperature to low temperature", "a point of higher emissivity to lower one", "Heat always flows from high temperature to low temperature region  ", "c", 0, 1, this.f610b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.p2011q24, 0, 0, 0, 0, "8 degree K", "4 degree K", "0.004 degree K", "0.008 degree K", "", "a", C2719R.C2721drawable.phy1124e, 1, this.f610b));
        arrayList.add(new questions("25.", "The statement of Kirchhoff’s point rule follows from", 0, 0, 0, 0, 0, "Ohm's law", "conservation of energy", "conservation of charge", "dependence of resistance on temperature", "Kirchhoff’s point rule states that at the in an electric circuit at the junction the sum of currents entering junction is equal to the sum of the currents leaving the junction. This rule is stated based on the law of conservation of charge.", "c", 0, 1, this.f610b));
        arrayList.add(new questions("26.", "Which of the following statement is correct? (Here ρ is the density of an ideal gas, m, is the mass of the gas and c is speed of particles)", 0, C2719R.C2721drawable.p2011q26a, C2719R.C2721drawable.p2011q26b, C2719R.C2721drawable.p2011q26c, C2719R.C2721drawable.p2011q26d, "", "", "", "", "", "a", C2719R.C2721drawable.phy1126e, 1, this.f610b));
        arrayList.add(new questions("27.", "Which of the following statement is correct about elastic behavior of materials?", 0, 0, 0, 0, 0, "With plastic materials, the body goes to original dimensions after removal of the force that caused deformation.", "In tensile stress the force is parallel to the cross-sectional are, where as in shear stress, the force is perpendicular to the area.", "All materials do not necessarily have elastic limit.", "For sufficiently small stress, stress is proportional to strain.", "In tensile stress (when a thin wire is stretched by a force) the force is applied parallel to the cross-sectional area of the wire where as in shear stress the force is applied to the surface perpendicularly. ", "b", 0, 1, this.f610b));
        arrayList.add(new questions("28.", "Which of the following statement is correct?", 0, 0, 0, 0, 0, "Surface tension is proportional to the length along with the surface tension force acts.", "The angle between the wall of a container and the liquid surface has no role on the capillary action.", "Surface tension pulls the liquid column up until there is sufficient mass of liquid for weight to overcome the intermolecular forces.", "In a given tube, the capillary action is large for a liquid of larger density.", "", "c", C2719R.C2721drawable.phy1128e, 1, this.f610b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.p2011q29, 0, 0, 0, 0, "Full wavelength", "At the origin", "A quarter of the wavelength", "Half the wavelength", "", "d", C2719R.C2721drawable.phy1129e, 1, this.f610b));
        arrayList.add(new questions("30.", "A 50 cm pipe is open at one end closed at the other end. When air is blow at 150 Hz. What is the velocity of the sound along the pipe?", 0, 0, 0, 0, 0, "150 m/s", "300 m/s", "330 m/s", "100 m/s", "", "b", C2719R.C2721drawable.phy1130e, 1, this.f610b));
        arrayList.add(new questions("31.", "A metal rod is measured to have a resistance R. If the same metal rod is stretched to reduce its radius by half without affecting its density, what is its new resistance?", 0, 0, 0, 0, 0, "16R", "4R", "2R", "8R", "", "b", C2719R.C2721drawable.phy1131e, 1, this.f610b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.p2011q32, C2719R.C2721drawable.p2011q32a, C2719R.C2721drawable.p2011q32b, C2719R.C2721drawable.p2011q32c, C2719R.C2721drawable.p2011q32d, "", "", "", "", "", "a", C2719R.C2721drawable.phy1132e, 1, this.f610b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.p2011q33, 0, 0, 0, 0, "4.5MV", "1.8MV", "3.6MV", "Zero", "", "d", C2719R.C2721drawable.phy1133e, 1, this.f610b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.p2011q34, 0, 0, 0, 0, "0.7 N", "2.1 N", "2.8 N", "1.4 N", "", "b", C2719R.C2721drawable.phy1134e, 1, this.f610b));
        arrayList.add(new questions("35.", "Which of the following statements is not correct? ", 0, 0, 0, 0, 0, "No process is possible in which there is an overall decrease in the entropy of the universe", "Spreading out of random kinetic energy through heating does not represent an overall increase in entropy.", "The spontaneous transfer of energy from cooler body to a hotter body is not possible.", "The complete conversion of energy from a hot source into work is not possible.", "Choices A, C and D describe the statement of the second law of thermodynamics and they are all true, but choice B, is not correct.", "b", 0, 1, this.f610b));
        arrayList.add(new questions("36.", "Which one of the following is not an example of simple harmonic motion?", 0, 0, 0, 0, 0, "Rotation of second pointer in hand watch.", "Oscillation of simple pendulum.", "A mass attached to a spring system oscillating in horizontal direction to the surface of the Earth", "A mass attached to a spring system oscillating in vertical direction to the surface of the earth.", "The oscillation of a simple pendulum, the oscillation of mass spring system when it oscillates back and forth or up and down periodically represent SHM. Whereas the rotation of second pointer of hand watch is not SHM, it is rotational motion.", "a", 0, 1, this.f610b));
        arrayList.add(new questions("37.", "In Young's double slit experiment, if the slit separation is 1.2 mm and the average spacing of the bright fringes observed on a screen placed 4\" \" m away from the source is 2\" \" mm. What is the wavelength of the light source?", 0, 0, 0, 0, 0, "550 nm", "630 nm", "600 nm", "750 mm", "", "c", C2719R.C2721drawable.phy1137e, 1, this.f610b));
        arrayList.add(new questions("38.", "The colors seen from soap bubbles and oil slicks are a manifestation of thin film interference. What is the cause of this interference?", 0, 0, 0, 0, 0, "Interference from refection of light from the two surfaces of the film", "Interference from refraction of light.", "Interference from diffraction of light.", "Interference from superposition of lights that are incident & reflected", "The colors seen from soap bubbles and oil slicks which are manifestation of thin film interference pattern are caused by interference from the two surfaces of the film.", "a", 0, 1, this.f610b));
        arrayList.add(new questions("39.", "", C2719R.C2721drawable.p2011q39, 0, 0, 0, 0, "It stays at y = b", "along a line y = -bx/a + b", "along y-axis", "along a line y = bx/a + b", "", "c", C2719R.C2721drawable.phy1139e, 1, this.f610b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.p2011q40, C2719R.C2721drawable.p2011q40a, C2719R.C2721drawable.p2011q40b, C2719R.C2721drawable.p2011q40c, C2719R.C2721drawable.p2011q40d, "", "", "", "", "no answer", "n", 0, 1, this.f610b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.p2011q41, 0, 0, 0, 0, "Capacitor", "Inductor", "Resistor", "Diode", "", "a", C2719R.C2721drawable.phy1141e, 1, this.f610b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.p2011q42, 0, 0, 0, 0, "80V", "20V", "40V", "34.64 V", "", "b", C2719R.C2721drawable.phy1142e, 1, this.f610b));
        arrayList.add(new questions("43.", "Lenz's law in electromagnetic induction follows from which law of conservation?", 0, 0, 0, 0, 0, "Energy", "Charge ", "Momentum", "Mass", "Lenz's law states that the induced current in a circuit always opposes the change that produces is and this law is stated based on the law of conservation of charge.", "b", 0, 1, this.f610b));
        arrayList.add(new questions("44.", "When ultraviolet light is shone on a clean metal surface the surface will emit electrons. What the magnitude is of induced emf?", 0, 0, 0, 0, 0, "The intensity of light must be high enough.", "The wave length of the light has to be greater than that of ultraviolet light.", "The minimum energy required to release the electron is the same as the work function of the metal.", "The frequency of the metal has to be less than that of ultraviolet light.", "When ultraviolet light is shone on a clean metal surface photoelectrons are emitted or escape from the metal surface. That means work must be done to free and pull out the electron from the metal surface. The minimum amount of energy necessary to eject an electron from a metal surface is the work function.", "c", 0, 1, this.f610b));
        arrayList.add(new questions("45.", "A series circuit consisting of 50Ω resistor and capacitor of capacitive reactance 50Ω are connected to alternating source of voltage (rms)100\" \" V. What is the average power output and power factor of the circuit?", 0, 0, 0, 0, 0, "100 W,0.707", "200 W,0.8", "70.7 W,0.707", "141.4 W,0.8", "", "a", C2719R.C2721drawable.phy1145e, 1, this.f610b));
        arrayList.add(new questions("46.", "What is the exception of the centripetal acceleration of a particle of charge q mass m moving in a uniform magnetic field B ⃗ on a circle of radius r if B is perpendicular to the particle's direction of motion?", 0, C2719R.C2721drawable.p2011q46a, C2719R.C2721drawable.p2011q46b, C2719R.C2721drawable.p2011q46c, C2719R.C2721drawable.p2011q46d, "", "", "", "", "", "b", C2719R.C2721drawable.phy1146e, 1, this.f610b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.p2011q47, 0, 0, 0, 0, "neutron", "Proton", "Electron", "Alpha particle ", "When uranium absorbs slow moving neutron, unstable compound nucleus is created. The compound nucleus then disintegrates into Rubidium (Rb) and Cesium (Cs) and two neutrons. Thus, the particle represented by X is neutron.", "a", 0, 1, this.f610b));
        arrayList.add(new questions("48.", "", C2719R.C2721drawable.p2011q48, 0, 0, 0, 0, "Ry/H3 = R2/R4", "The bridge is balanced when R1/R2 = R3/R1", "Rx/R3 = R1/R4", "The bridge balance condition is given byy Rx/R3 = R2/R2", "", "d", C2719R.C2721drawable.phy1148e, 1, this.f610b));
        arrayList.add(new questions("49.", "Two long wires of 10 m in length carries a current of 2.0 A and 0.5 A in the same direction. The wires are separated by 4.0 cm. What is the mannete force that the wires exerted on each other?", 0, C2719R.C2721drawable.p2011q49a, C2719R.C2721drawable.p2011q49b, C2719R.C2721drawable.p2011q49c, C2719R.C2721drawable.p2011q49d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1149e, 1, this.f610b));
        arrayList.add(new questions("50.", "", C2719R.C2721drawable.p2011q50, 0, 0, 0, 0, "Be lifted upward", "Be deflected outward", "be deflected inward", "Experience no force", "Applying the right hand rule the magnetic force exerted on the wire directed upward in the +z-axis, so the copper wire suspended on the clamp would be lifted upward.", "a", 0, 1, this.f610b));
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
        this.f611tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    physics2011.this.timer.setVisibility(0);
                    physics2011.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    physics2011.this.scr.setVisibility(8);
                    physics2011.this.chr.stop();
                    physics2011.this.toolbar.setVisibility(8);
                    physics2011.this.Relative.setBackgroundColor(-7829368);
                    physics2011.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2011.this.getBaseContext());
                    int unused = physics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = physics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = physics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = physics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = physics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = physics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = physics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = physics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = physics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = physics2011.this.highscorePhysics2011 = defaultSharedPreferences.getInt("phy2011hs", 0);
                    int access$600 = physics2011.this.part1 + physics2011.this.part2 + physics2011.this.part3 + physics2011.this.part4 + physics2011.this.part5 + physics2011.this.part6 + physics2011.this.part7 + physics2011.this.part8 + physics2011.this.part9;
                    TextView access$1600 = physics2011.this.resultText;
                    access$1600.setText(access$600 + "/50");
                    physics2011.this.progressbar.setProgress(access$600);
                    physics2011.this.progressbar.setMax(50);
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
                    int unused11 = physics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = physics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = physics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = physics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = physics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = physics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = physics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = physics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = physics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = physics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = physics2011.this.answered1 + physics2011.this.answered2 + physics2011.this.answered3 + physics2011.this.answered4 + physics2011.this.answered5 + physics2011.this.answered6 + physics2011.this.answered7 + physics2011.this.answered8 + physics2011.this.answered9 + physics2011.this.answered10;
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
                    if (access$600 > physics2011.this.highscorePhysics2011) {
                        edit.putInt("phy2011hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 50;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - physics2011.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1phy111", 0);
                    long j2 = defaultSharedPreferences.getLong("date1phy112", 0);
                    long j3 = defaultSharedPreferences.getLong("date1phy113", 0);
                    long j4 = defaultSharedPreferences.getLong("date1phy114", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1phy115", 0);
                    long j6 = defaultSharedPreferences.getLong("date1phy116", 0);
                    long j7 = defaultSharedPreferences.getLong("date1phy117", 0);
                    long j8 = defaultSharedPreferences.getLong("date1phy118", 0);
                    long j9 = defaultSharedPreferences.getLong("date1phy119", 0);
                    long j10 = defaultSharedPreferences.getLong("date1phy1110", 0);
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
                        editor.putString("scorephy111", str);
                        editor.putLong("date1phy111", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorephy112", str2);
                            editor.putLong("date1phy112", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorephy113", str2);
                            editor.putLong("date1phy113", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorephy114", str2);
                            editor.putLong("date1phy114", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorephy115", str2);
                            editor.putLong("date1phy115", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorephy116", str2);
                            editor.putLong("date1phy116", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorephy117", str2);
                            editor.putLong("date1phy117", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorephy118", str2);
                            editor.putLong("date1phy118", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorephy119", str2);
                            editor.putLong("date1phy119", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorephy1110", str2);
                            editor.putLong("date1phy1110", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datephy111", 0);
                    long j12 = defaultSharedPreferences.getLong("datephy112", 0);
                    long j13 = defaultSharedPreferences.getLong("datephy113", 0);
                    long j14 = defaultSharedPreferences.getLong("datephy114", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datephy115", 0);
                    long j16 = defaultSharedPreferences.getLong("datephy116", 0);
                    long j17 = defaultSharedPreferences.getLong("datephy117", 0);
                    long j18 = defaultSharedPreferences.getLong("datephy118", 0);
                    long j19 = defaultSharedPreferences.getLong("datephy119", 0);
                    long j20 = defaultSharedPreferences.getLong("datephy1110", 0);
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
                        editor2.putString("iScorephy111", f);
                        editor2.putLong("datephy111", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorephy112", f);
                            editor2.putLong("datephy112", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorephy113", f);
                            editor2.putLong("datephy113", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorephy114", f);
                            editor2.putLong("datephy114", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorephy115", f);
                            editor2.putLong("datephy115", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorephy116", f);
                            editor2.putLong("datephy116", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorephy117", f);
                            editor2.putLong("datephy117", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorephy118", f);
                            editor2.putLong("datephy118", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorephy119", f);
                            editor2.putLong("datephy119", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorephy1110", f);
                            editor2.putLong("datephy1110", valueOf.longValue());
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
                        physics2011.this.scr.setVisibility(8);
                        physics2011.this.chr.stop();
                        physics2011.this.toolbar.setVisibility(8);
                        physics2011.this.Relative.setBackgroundColor(-7829368);
                        physics2011.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2011.this.getBaseContext());
                        int unused = physics2011.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = physics2011.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = physics2011.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = physics2011.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = physics2011.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = physics2011.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = physics2011.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = physics2011.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = physics2011.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = physics2011.this.highscorePhysics2011 = defaultSharedPreferences.getInt("phy2011hs", 0);
                        int access$600 = physics2011.this.part1 + physics2011.this.part2 + physics2011.this.part3 + physics2011.this.part4 + physics2011.this.part5 + physics2011.this.part6 + physics2011.this.part7 + physics2011.this.part8 + physics2011.this.part9;
                        TextView access$1600 = physics2011.this.resultText;
                        access$1600.setText(access$600 + "/50");
                        physics2011.this.progressbar.setProgress(access$600);
                        physics2011.this.progressbar.setMax(50);
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
                        int unused11 = physics2011.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = physics2011.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = physics2011.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = physics2011.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = physics2011.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = physics2011.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = physics2011.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = physics2011.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = physics2011.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = physics2011.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = physics2011.this.answered1 + physics2011.this.answered2 + physics2011.this.answered3 + physics2011.this.answered4 + physics2011.this.answered5 + physics2011.this.answered6 + physics2011.this.answered7 + physics2011.this.answered8 + physics2011.this.answered9 + physics2011.this.answered10;
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
                        if (access$600 > physics2011.this.highscorePhysics2011) {
                            edit.putInt("phy2011hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - physics2011.this.chr.getBase()) / 1000;
                        String str = "datephy1110";
                        String str2 = "datephy119";
                        String str3 = "datephy118";
                        String str4 = "datephy117";
                        String str5 = "datephy116";
                        String str6 = "datephy115";
                        String str7 = "datephy114";
                        String str8 = "datephy113";
                        String str9 = "datephy112";
                        String str10 = "datephy111";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1phy1110";
                        String str12 = "date1phy119";
                        if (physics2011.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1phy111", 0);
                            String str13 = "date1phy111";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1phy112", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1phy113", 0);
                            long j4 = defaultSharedPreferences.getLong("date1phy114", 0);
                            long j5 = defaultSharedPreferences.getLong("date1phy115", 0);
                            String str16 = "date1phy115";
                            String str17 = "date1phy114";
                            String str18 = "date1phy116";
                            long j6 = defaultSharedPreferences.getLong("date1phy116", 0);
                            long j7 = defaultSharedPreferences.getLong("date1phy117", 0);
                            String str19 = str12;
                            String str20 = "date1phy118";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1phy117";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1phy113";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1phy118", 0));
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
                                editor3.putString("scorephy111", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorephy112", str25);
                                    editor3.putLong("date1phy112", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorephy113", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorephy114", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorephy115", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorephy116", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorephy117", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorephy118", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorephy119", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorephy1110", str25);
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
                                editor4.putString("iScorephy111", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorephy112", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorephy113", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorephy114", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorephy115", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorephy116", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorephy117", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorephy118", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorephy119", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorephy1110", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1phy111";
                            String str30 = "date1phy114";
                            String str31 = str12;
                            String str32 = "date1phy113";
                            String str33 = "date1phy117";
                            String str34 = "date1phy116";
                            String str35 = str11;
                            String str36 = "date1phy115";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1phy112", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1phy112";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1phy118";
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
                                editor2.putString("scorephy111", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorephy112", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorephy113", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorephy114", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorephy115", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorephy116", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorephy117", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorephy118", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorephy119", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorephy1110", str49);
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
                                editor.putString("iScorephy111", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorephy112", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorephy113", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorephy114", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorephy115", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorephy116", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorephy117", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorephy118", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorephy119", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorephy1110", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        physics2011.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2011.this.scr.setVisibility(8);
                physics2011.this.chr.stop();
                physics2011.this.toolbar.setVisibility(8);
                physics2011.this.Relative.setBackgroundColor(physics2011.this.getResources().getColor(C2719R.C2720color.transparent_black));
                physics2011.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2011.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2011.this.scr.setVisibility(0);
                physics2011.this.toolbar.setVisibility(0);
                physics2011.this.telegram_layout.setVisibility(8);
                physics2011.this.chr.start();
                physics2011.this.Relative.setBackgroundColor(physics2011.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = physics2011.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = physics2011.this.mInterstitialAd = null;
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
                physics2011.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
