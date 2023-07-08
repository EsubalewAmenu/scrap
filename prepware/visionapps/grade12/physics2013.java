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

public class physics2013 extends AppCompatActivity {
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
    private Boolean f614b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private Button constantValue;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscorePhysics2013;
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
    private Toolbar f615tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_physics2013);
        this.f614b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextPhysics2013);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_physics2013);
        this.constantValue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2013.this.startActivity(new Intent(physics2013.this, P_Constant_Value.class));
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The second law of thermodynamics states that ", 0, 0, 0, 0, 0, "no process is possible in which there is an overall increase in the entropy of the universe.", "no process is possible in which there is an overall decrease in the entropy of the universe.", "two bodies that are separately in thermal equilibrium with a third body must be in thermal equilibrium with each other.", "the increase in the internal energy of a system is equal to the sum of the energy entering the system through heating, and work done on the system. ", "The second law of thermodynamics states that; \nNo process is possible in which there is an overall decrease in the entropy of the universe. Or \nComplete conversion of heat into useful work is not possible. Or \nSpontaneous flow of heat from a colder body to a hotter body is impossible. ", "b", 0, 1, this.f614b));
        arrayList.add(new questions("2.", "A mass-spring system set to oscillate in a simple harmonic motion over friction less horizontal surface. The amplitude of this oscillation is 20 cm. A second mass-spring system with the same spring constant is set to oscillate in the same way but with amplitude Of 10 cm. The energy of the ", 0, 0, 0, 0, 0, "second mass-spring system has half of the first one. ", "first mass-spring system has twice the second one.", "second mass-spring system has the square of the first one. ", "first mass-spring system has four times the second one. ", "", "d", C2719R.C2721drawable.phy1302e, 1, this.f614b));
        arrayList.add(new questions("3.", "A string vibrates with speed of in its frequency of 880Hz. What is the length of the string? ", 0, 0, 0, 0, 0, "31.3 cm ", "50.0 cm ", "12.5 cm ", "25.0 cm ", "", "d", C2719R.C2721drawable.phy1303e, 1, this.f614b));
        arrayList.add(new questions("4.", "An interference patterns observed after a monochromatic beam of light passes through a single slit and a double slit. Which one of the following is Correct about the width of the central maxima and the first order maxima in single slit and double slit? ", 0, 0, 0, 0, 0, "The width Of the central maxima has twice the width of the first order maxima in a single slit interference while it has equal width in double slit interference. ", "The width of the central maxima and first order maxima has equal width in both cases. ", "The width of the central maxima has twice the width of the first order maxima in both cases. ", "The width Of the central maxima has equal with the width Of the first order maxima in a single slit interference while it has twice the width of the order maxima in double slit interference. ", "", "a", 0, 1, this.f614b));
        arrayList.add(new questions("5.", "A light wave of wavelength 590nm pass through a narrow double slit of 0.2mm slit separation. An interference pattern is formed on a screen at a distance of 1.5m. \nWhat is the distance between the consecutive bright fringes on the screen? ", 0, 0, 0, 0, 0, "44.3 mm ", "0.43 mm ", "4.43 mm ", "1.97 mm ", "", "c", C2719R.C2721drawable.phy1305e, 1, this.f614b));
        arrayList.add(new questions("6.", "According to Gauss's law the net electric flux through any hypothetical closed surface is proportional to the enclosed; ", 0, 0, 0, 0, 0, "Electric charge. ", "Electric current. ", "Potential difference. ", "Electric field. ", "", "a", C2719R.C2721drawable.phy1306e, 1, this.f614b));
        arrayList.add(new questions("7.", "When a dielectric material placed between tv parallel metal plates in the presence of electric fields they enable the plates to store ", 0, 0, 0, 0, 0, "much more charge at different potential difference.", "much more charge at the same potential difference. ", "the same charge at the same potential difference. ", "much less charge at difference potential difference. ", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("8.", "", C2719R.C2721drawable.phy1308q, C2719R.C2721drawable.phy1308a, C2719R.C2721drawable.phy1308b, C2719R.C2721drawable.phy1308c, C2719R.C2721drawable.phy1308d, "", "", "", "", "", "d", C2719R.C2721drawable.phy1308e, 1, this.f614b));
        arrayList.add(new questions("9.", "A uniform conductor of length L and cross-sectional area A carries a current I when a potential difference V is applied across its ends. If the number free electrons per unit volume Of the conductor is n, and the electron charge is e, then the drift velocity Of the electrons in the conductor is ", 0, 0, 0, 0, 0, "V = I/neL ", "V = I/neLA ", "V = I/neA ", "V = I/eAL ", "The total charge is obtained by : \nQ = nVe , v = AL = VoIume \nQ = nALe, L = vt \nQ = nAvte , \nv = Q/(nAte) but Q/T=I \nv = l/neA ", "c", 0, 1, this.f614b));
        arrayList.add(new questions("10.", "Which one of the following statement is correct about, a bar on which a force acts at one end and pivoted at the other? ", 0, 0, 0, 0, 0, "The force is collinear with the angular velocity. ", "The force is coplanar with the torque it produces. ", "The force, angular velocity and the torque are coplanar. ", "The force is parallel to the angular acceleration produced. ", "T = r x F", "b", 0, 1, this.f614b));
        arrayList.add(new questions("11.", "The necessary condition for an object to be in rotational equilibrium is ", 0, 0, 0, 0, 0, "the sum of clockwise torques equals to the sum of counter clock-wise torques. ", "the net force exerting on the object must be zero. ", "the net torque action on the object is different from zero. ", "the net moment Of all forces should be non-zero. ", "If clockwise torque sum equals counter clockwise torque sum,then second condition or the rotational equilibrium is satisfied. ", "a", 0, 1, this.f614b));
        arrayList.add(new questions("12.", "An aluminum wire of initial length 2.0m where increased by 2.0 cmin its length being on application Of a force Of 9.0N. \nWhat is the strain energy Of the material? ", 0, C2719R.C2721drawable.phy1312a, C2719R.C2721drawable.phy1312b, C2719R.C2721drawable.phy1312c, C2719R.C2721drawable.phy1312d, "", "", "", "", "", "b", C2719R.C2721drawable.phy1312e, 1, this.f614b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.phy1313q, 0, 0, 0, 0, "1.6 mm ", "3.2 mm ", "0.16 mm ", "0.32 mm ", "", "d", C2719R.C2721drawable.phy1313e, 1, this.f614b));
        arrayList.add(new questions("14.", "Suppose a stream of fluid flows past a solid object, which one of the following does NOT affect the linear flow of the fluid. ", 0, 0, 0, 0, 0, "The speed Of the solid object ", "The shape of the solid object ", "The density of the solid object ", "Viscosity of the fluid ", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("15.", "Water enters a tube of non-uniform diameter. The speed of the force at the entry of area A1 is 12m/s and the speed becomes 4m/s at the exit opening Of area A2. Which one is correct about the ratio of A1/A2? ", 0, 0, 0, 0, 0, "1/3 ", ExifInterface.GPS_MEASUREMENT_3D, "4", "1/4", "From continuity equation: \nA1V1 = A2V2\n12A1 = 4A2\nA1/A2 = 4/12 = 1/3", "a", 0, 1, this.f614b));
        arrayList.add(new questions("16.", "The particular temperature and pressure at which the solid, liquid, and gaseous phases of a given substance are all at equilibrium with another is known as: ", 0, 0, 0, 0, 0, "Phase change. ", "Critical point. ", "Triple point. ", "Heat capacity. ", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("17.", "Most solids expand upon heating, which one of the following statements correctly describe the phenomena? ", 0, 0, 0, 0, 0, "Increase in temperature decreases the vibrational kinetic energy and amplitude of the atoms constituting the solid. ", "Increase in temperature increases the vibrational kinetic energy and amplitude of the atoms constituting the solid. ", "Increase in temperature increases the vibrational kinetic energy and decreases the amplitude of the atoms constituting the solid. ", "Increase in temperature decreases the vibrational kinetic energy and increases the amplitude of the atoms constituting the solid. ", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("18.", "If 25J is taken away by heat from a system, and the system does 20J of work, what is the change in internal energy of the system? ", 0, 0, 0, 0, 0, "-5.0 J", "5.0 J ", "-45.0 J ", "45.0 J ", "", "c", C2719R.C2721drawable.phy1318e, 1, this.f614b));
        arrayList.add(new questions("19.", "A sample mixture of gas contains 72% of hydrogen and 28% Of Helium. What is the partial pressure of helium at an atmospheric pressure of 76cm of mercury (Hg)? ", 0, 0, 0, 0, 0, "21.8 cm of Hg ", "54.72 cm of Hg ", "76.0 cm of Hg ", "33.44 cm of Hg", "From Dalton's partial pressure: \nP1 = P(n1/ (n1 + n2)) = 76 (28/ (28 + 72)) = 21.8 cmHg", "a", 0, 1, this.f614b));
        arrayList.add(new questions("20.", "Kirchhoff's junction rule state that ", 0, 0, 0, 0, 0, "the same of the voltage drop across any closed loop equals the sum Of electromotive force. ", "charge entering the junction equals the charge leaving that junction at a particular time. ", "the potential drop at a given junction equals the electromotive force at that particular point. ", "current traversing any closed loop at particular time is zero. ", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("21.", "Which one of the following statement is NOT correct about the magnetic properties of matter? ", 0, 0, 0, 0, 0, "The unpaired electrons in paramagnetic substance which will tend to align themselves in the same direction as the applied magnetic field. ", "The unpaired electrons in ferromagnetic materials will align with the applied magnetic field and parallel to each other. ", "The unpaired electrons in diamagnetic materials will align with the applied magnetic field and parallel to each other. ", "There is a tendency to oppose the applied magnetic field in a diamagnetic substance.", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("22.", "Suppose a conductor of length l carrying a current I placed in a uniform magnetic field of magnitude B. When the conductor is making an angle with that of the magnetic field then force experienced by the conductor due to the magnetic field is given by ", 0, 0, 0, 0, 0, "F = l (l x B)", "F = lB (l tanθ)", "F = lB (l cosθ)", "F = l (B x l)", "", "a", 0, 1, this.f614b));
        arrayList.add(new questions("23.", "Which one of the following statement is correct about tangent galvanometer? ", 0, 0, 0, 0, 0, "It is a device used to measure the electric current in terms of the electric field it produces. ", "The current is inversely proportional to the tangent of the angle of the needle's deflection. ", "It consists of a coil of insulated copper wire on a circular magnetic frame. ", "The current through a coil of the wire generates a magnetic field at the center of coil. ", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("24.", "", C2719R.C2721drawable.phy1324q, 0, 0, 0, 0, "The field strength is directly proportional to the distance from the conductor. ", "The magnetic field encircles conductor. ", "Reversing the current direction will reverse the direction of the magnetic field. ", "Doubling the current through the conductor doubles the field strength. ", "From Ampere's law and the right hand rule", "a", 0, 1, this.f614b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.phy1325q, 0, 0, 0, 0, "1.8 mV ", "18 mV ", "9.0 mV ", "3.2 mv ", "", "a", C2719R.C2721drawable.phy1325e, 1, this.f614b));
        arrayList.add(new questions("26.", "A 15.0 mH inductor is used to induce an electromotive force of 5.0 mV, What is the rate change Of the induced current?", 0, 0, 0, 0, 0, "3.3 A/s ", "0.33 A/s ", "0.3 A/s ", "3.0 A/s ", "", "b", C2719R.C2721drawable.phy1326e, 1, this.f614b));
        arrayList.add(new questions("27.", "A coil and a permanent magnet are set in relative motion. Which one of the following statement is NOT correct about induced electromotive force? ", 0, 0, 0, 0, 0, "The direction in which the coil moves relative to the magnetic field does not have any effect on the induced electromotive force.", "The magnitude of the induced electromotive force is directly proportional to the relative velocity between the two. ", "Moving a magnet relative to the coil and the coil relative to the magnet with equal speed will produce the same electromotive force.", "Coil with larger number of turns produce greater induced electromotive forces. ", "From Faraday's and Lenz's law", "a", 0, 1, this.f614b));
        arrayList.add(new questions("28.", "What is the advantage of using alternating current in transmission of electric energy? ", 0, 0, 0, 0, 0, "It uses very high current in the transmission line. ", "It completely avoids energy loss due to heating.", "It enables a transformer to increase or decrease the voltage as required. ", "It enables to reach the consumers at very high voltage. ", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("29.", "Capacitive reactance is defined as ", 0, 0, 0, 0, 0, "The equivalent quantity to resistance when we are talking about resistors. ", "The equivalent quantity to resistance when we are talking about inductors. ", "The equivalent quantity to impedance in RLC circuit. ", "The equivalent quantity to resistance when we are talking about capacitors. ", "", "d", 0, 1, this.f614b));
        arrayList.add(new questions("30.", "Which one of the following is NOT correct about the concept and units of coefficient or friction? ", 0, 0, 0, 0, 0, "The coefficient of friction is always less or equal to unity (1). ", "Coefficient of static friction has no unit. ", "Coefficient of static friction is less than its value of kinetic friction. ", "Coefficient of friction is the ratio of frictional force to normal force. ", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("31.", "A car is travelling at constant velocity along a straight line. Which statement is correct? ", 0, 0, 0, 0, 0, "The acceleration Of the car is in opposite direction. ", "The net force on the car is different from zero.", "The displacement of the car is in opposite direction.", "The displacement of the car increase linearly with time. ", "", "d", 0, 1, this.f614b));
        arrayList.add(new questions("32.", "Which one of the following statements is correct about the impulse on an object? ", 0, 0, 0, 0, 0, "Impulse is the rate of change in momentum due to external force exerted on an object for a very short period of time.", "Impulse is the change in momentum when a force is exerted on an object for a very short period of time. ", "The area under the curve of momentum versus time graph is the impulse on an object. ", "The impulse on an object is changed when the net force acting on the object is zero. ", "", "b", C2719R.C2721drawable.phy1332e, 1, this.f614b));
        arrayList.add(new questions("33.", "Consider collisions, that occurred between two trollies having the same mass: moving the same speed, and in opposite directions, \nCollision 1:- after collision the two trollies bounce back with the same speed. \nCollision 2:- after collision the two trollies back with the same coupler ", 0, 0, 0, 0, 0, "Collision 1 is inelastic is inelastic and collision 2 elastic.", "Both collisions are inelastic. ", "Collision 1 is elastic and collision 2 is inelastic. ", "Both collisions are elastic. ", "", "c", 0, 1, this.f614b));
        arrayList.add(new questions("34.", "Suppose that you are given a mass attached to a spring and oscillates up and down. This mass-spring system has maximum gravitational potential energy (GPE), elastic potential energy (EPE) and kinetic energy (KE) at the ", 0, 0, 0, 0, 0, "top, bottom and middle respectively. ", "bottom, middle and top respectively. ", "middle, bottom and top respectively. ", "middle, top and bottom respectively. ", "", "a", 0, 1, this.f614b));
        arrayList.add(new questions("35.", "", C2719R.C2721drawable.phy1335q, 0, 0, 0, 0, "0.4 m ", "0.2 m ", "2.5 m ", "0.1 m ", "", "b", C2719R.C2721drawable.phy1335e, 1, this.f614b));
        arrayList.add(new questions("36.", "A 5.0 kg stone is dropped from a top of 30.0 m building. At a height of 10.0m above the ground, 60% of its initial potential energy is converted to kinetic energy. \nWhich one of the following statements is correct about the transformation of energy for the stone? ", 0, 0, 0, 0, 0, "The remaining 40% of the energy is still available as gravitational potential energy. ", "60% Of its original potential energy is converted to heat energy dues to air resistance. ", "6.7% of gravitational potential energy is dissipated due to air resistance. ", "The sum of its potential energy and kinetic energy is the same at every point during its fall. ", "When the stone is at a height of 30m, its potential energy is: \nPE1 = mgh1 = 5(10)(30) = 1500J \nAnd, when the stone is at 10m from the ground, \nPE2 = mgh2 = 5(10)(10) = 500J \nIn percent: PE2/PE1 = (500/1500) 100% = 33.3%, hence 6.7% is waste. ", "c", 0, 1, this.f614b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.phy1337q, 0, 0, 0, 0, "7.0 k ", "24.0 k ", "-24.0 Nm k ", "-7.0 k", "", "a", C2719R.C2721drawable.phy1337e, 1, this.f614b));
        arrayList.add(new questions("38.", "A wheel starts rotating at 1.2 Hz and reaches 1.8 Hz. in 5 seconds. Calculate the angular displacement it covers within 5 seconds. ", 0, 0, 0, 0, 0, "15 π rad ", "30 π rad ", "3 π rad ", "10 π rad ", "", "a", C2719R.C2721drawable.phy1338e, 1, this.f614b));
        arrayList.add(new questions("39.", "If you are given the following physical quantities in angular motion:torque (r), Linear momentum(p), moment of inertia (l), angular speed (w) and angular acceleration (a). The angular momentum (L) is the ", 0, 0, 0, 0, 0, "ratio of linear momentum to moment of inertia. ", "product of moment of inertia and torque. ", "ratio of moment of inertia to angular acceleration. ", "product of moment of inertia and angular speed. ", "L = Iw = r(p)sinθ = r(m)vsinθ", "d", 0, 1, this.f614b));
        arrayList.add(new questions("40.", "A student wants to measure the length and height of the school laboratory. There are vernier calipers, meter stick, micrometer screw gauge and meter tape measuring instruments in the laboratory \nWhich one of the following measuring instruments and unit is appropriate for the measurement? ", 0, 0, 0, 0, 0, "Meter stick and centimeter ", "Micrometer screw gauge and millimeter ", "Vernier calipers and millimeter ", "Meter tape and meter ", "", "d", 0, 1, this.f614b));
        arrayList.add(new questions("41.", "", C2719R.C2721drawable.phy1341q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("42.", "", C2719R.C2721drawable.phy1342q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "North-East means North of East", "d", 0, 1, this.f614b));
        arrayList.add(new questions("43.", "", C2719R.C2721drawable.phy1343q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "Join the vectors head to tail and the resultant will be from the tail of first vectors to the head of the second vector. ", "c", 0, 1, this.f614b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.phy1344q, 0, 0, 0, 0, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", "Two vectors are collinear if their cross product is zero. ", "d", 0, 1, this.f614b));
        arrayList.add(new questions("45.", "Instantaneous velocity is different from average velocity in that; instantaneous velocity is ", 0, 0, 0, 0, 0, "the average velocity during the time of acceleration. ", "the total displacement to the time taken. ", "in opposite direction to the displacement of the moving object. ", "the velocity at a particular instant of time. ", "", "d", 0, 1, this.f614b));
        arrayList.add(new questions("46.", "A car travelling at 20m/s starts to speedup. After 5 minutes its speed is 144m/s. What is the acceleration of the car? ", 0, C2719R.C2721drawable.phy1346a, C2719R.C2721drawable.phy1346b, C2719R.C2721drawable.phy1346c, C2719R.C2721drawable.phy1346d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1346e, 1, this.f614b));
        arrayList.add(new questions("47.", "A bullet Of 200g mass fired from a 30.0 m high building, horizontally, At the same time a bullet Of the same mass fired vertically down from the same height, What can be concluded about the motion of the two bullets? ", 0, 0, 0, 0, 0, "A bullet fired horizontally takes more time to strike the ground. ", "Both bullets strike the ground at the same time. ", "Both bullets move with the same horizontal velocity. ", "A bullet fired vertically takes more time to strike the ground ", "", "b", 0, 1, this.f614b));
        arrayList.add(new questions("48.", "A bird flies at speed of 10m/s south relative to the Earth. A wind blows at speed of 4m/s to east relative to the Earth. What is the speed of the bird relative to the wind? ", 0, 0, 0, 0, 0, "10.8m/s in the direction of South-West ", "6m/s in the direction Of South-East ", "10.8m/s in the direction of North-West ", "6m/s in the direction Of North-East ", "", "a", C2719R.C2721drawable.phy1348e, 1, this.f614b));
        arrayList.add(new questions("49.", "Dynamics is a branch of mechanics concerned with the motion of an object ", 0, 0, 0, 0, 0, "whose velocity is constant. ", "without its causes. ", "under the cation of balanced forces. ", "under the cation of forces. ", "", "d", 0, 1, this.f614b));
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
        this.f615tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    physics2013.this.timer.setVisibility(0);
                    physics2013.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    physics2013.this.scr.setVisibility(8);
                    physics2013.this.chr.stop();
                    physics2013.this.toolbar.setVisibility(8);
                    physics2013.this.Relative.setBackgroundColor(-7829368);
                    physics2013.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2013.this.getBaseContext());
                    int unused = physics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = physics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = physics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = physics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = physics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = physics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = physics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = physics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = physics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = physics2013.this.highscorePhysics2013 = defaultSharedPreferences.getInt("phy2013hs", 0);
                    int access$600 = physics2013.this.part1 + physics2013.this.part2 + physics2013.this.part3 + physics2013.this.part4 + physics2013.this.part5 + physics2013.this.part6 + physics2013.this.part7 + physics2013.this.part8 + physics2013.this.part9;
                    TextView access$1600 = physics2013.this.resultText;
                    access$1600.setText(access$600 + "/50");
                    physics2013.this.progressbar.setProgress(access$600);
                    physics2013.this.progressbar.setMax(50);
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
                    int unused11 = physics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = physics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = physics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = physics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = physics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = physics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = physics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = physics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = physics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = physics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = physics2013.this.answered1 + physics2013.this.answered2 + physics2013.this.answered3 + physics2013.this.answered4 + physics2013.this.answered5 + physics2013.this.answered6 + physics2013.this.answered7 + physics2013.this.answered8 + physics2013.this.answered9 + physics2013.this.answered10;
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
                    if (access$600 > physics2013.this.highscorePhysics2013) {
                        edit.putInt("phy2013hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 50;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - physics2013.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1phy131", 0);
                    long j2 = defaultSharedPreferences.getLong("date1phy132", 0);
                    long j3 = defaultSharedPreferences.getLong("date1phy133", 0);
                    long j4 = defaultSharedPreferences.getLong("date1phy134", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1phy135", 0);
                    long j6 = defaultSharedPreferences.getLong("date1phy136", 0);
                    long j7 = defaultSharedPreferences.getLong("date1phy137", 0);
                    long j8 = defaultSharedPreferences.getLong("date1phy138", 0);
                    long j9 = defaultSharedPreferences.getLong("date1phy139", 0);
                    long j10 = defaultSharedPreferences.getLong("date1phy1310", 0);
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
                        editor.putString("scorephy131", str);
                        editor.putLong("date1phy131", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorephy132", str2);
                            editor.putLong("date1phy132", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorephy133", str2);
                            editor.putLong("date1phy133", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorephy134", str2);
                            editor.putLong("date1phy134", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorephy135", str2);
                            editor.putLong("date1phy135", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorephy136", str2);
                            editor.putLong("date1phy136", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorephy137", str2);
                            editor.putLong("date1phy137", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorephy138", str2);
                            editor.putLong("date1phy138", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorephy139", str2);
                            editor.putLong("date1phy139", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorephy1310", str2);
                            editor.putLong("date1phy1310", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datephy131", 0);
                    long j12 = defaultSharedPreferences.getLong("datephy132", 0);
                    long j13 = defaultSharedPreferences.getLong("datephy133", 0);
                    long j14 = defaultSharedPreferences.getLong("datephy134", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datephy135", 0);
                    long j16 = defaultSharedPreferences.getLong("datephy136", 0);
                    long j17 = defaultSharedPreferences.getLong("datephy137", 0);
                    long j18 = defaultSharedPreferences.getLong("datephy138", 0);
                    long j19 = defaultSharedPreferences.getLong("datephy139", 0);
                    long j20 = defaultSharedPreferences.getLong("datephy1310", 0);
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
                        editor2.putString("iScorephy131", f);
                        editor2.putLong("datephy131", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorephy132", f);
                            editor2.putLong("datephy132", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorephy133", f);
                            editor2.putLong("datephy133", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorephy134", f);
                            editor2.putLong("datephy134", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorephy135", f);
                            editor2.putLong("datephy135", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorephy136", f);
                            editor2.putLong("datephy136", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorephy137", f);
                            editor2.putLong("datephy137", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorephy138", f);
                            editor2.putLong("datephy138", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorephy139", f);
                            editor2.putLong("datephy139", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorephy1310", f);
                            editor2.putLong("datephy1310", valueOf.longValue());
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
                        physics2013.this.scr.setVisibility(8);
                        physics2013.this.chr.stop();
                        physics2013.this.toolbar.setVisibility(8);
                        physics2013.this.Relative.setBackgroundColor(-7829368);
                        physics2013.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2013.this.getBaseContext());
                        int unused = physics2013.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = physics2013.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = physics2013.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = physics2013.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = physics2013.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = physics2013.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = physics2013.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = physics2013.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = physics2013.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = physics2013.this.highscorePhysics2013 = defaultSharedPreferences.getInt("phy2013hs", 0);
                        int access$600 = physics2013.this.part1 + physics2013.this.part2 + physics2013.this.part3 + physics2013.this.part4 + physics2013.this.part5 + physics2013.this.part6 + physics2013.this.part7 + physics2013.this.part8 + physics2013.this.part9;
                        TextView access$1600 = physics2013.this.resultText;
                        access$1600.setText(access$600 + "/50");
                        physics2013.this.progressbar.setProgress(access$600);
                        physics2013.this.progressbar.setMax(50);
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
                        int unused11 = physics2013.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = physics2013.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = physics2013.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = physics2013.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = physics2013.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = physics2013.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = physics2013.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = physics2013.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = physics2013.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = physics2013.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = physics2013.this.answered1 + physics2013.this.answered2 + physics2013.this.answered3 + physics2013.this.answered4 + physics2013.this.answered5 + physics2013.this.answered6 + physics2013.this.answered7 + physics2013.this.answered8 + physics2013.this.answered9 + physics2013.this.answered10;
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
                        if (access$600 > physics2013.this.highscorePhysics2013) {
                            edit.putInt("phy2013hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - physics2013.this.chr.getBase()) / 1000;
                        String str = "datephy1310";
                        String str2 = "datephy139";
                        String str3 = "datephy138";
                        String str4 = "datephy137";
                        String str5 = "datephy136";
                        String str6 = "datephy135";
                        String str7 = "datephy134";
                        String str8 = "datephy133";
                        String str9 = "datephy132";
                        String str10 = "datephy131";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1phy1310";
                        String str12 = "date1phy139";
                        if (physics2013.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1phy131", 0);
                            String str13 = "date1phy131";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1phy132", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1phy133", 0);
                            long j4 = defaultSharedPreferences.getLong("date1phy134", 0);
                            long j5 = defaultSharedPreferences.getLong("date1phy135", 0);
                            String str16 = "date1phy135";
                            String str17 = "date1phy134";
                            String str18 = "date1phy136";
                            long j6 = defaultSharedPreferences.getLong("date1phy136", 0);
                            long j7 = defaultSharedPreferences.getLong("date1phy137", 0);
                            String str19 = str12;
                            String str20 = "date1phy138";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1phy137";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1phy133";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1phy138", 0));
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
                                editor3.putString("scorephy131", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorephy132", str25);
                                    editor3.putLong("date1phy132", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorephy133", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorephy134", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorephy135", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorephy136", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorephy137", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorephy138", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorephy139", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorephy1310", str25);
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
                                editor4.putString("iScorephy131", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorephy132", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorephy133", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorephy134", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorephy135", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorephy136", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorephy137", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorephy138", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorephy139", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorephy1310", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1phy131";
                            String str30 = "date1phy134";
                            String str31 = str12;
                            String str32 = "date1phy133";
                            String str33 = "date1phy137";
                            String str34 = "date1phy136";
                            String str35 = str11;
                            String str36 = "date1phy135";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1phy132", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1phy132";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1phy138";
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
                                editor2.putString("scorephy131", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorephy132", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorephy133", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorephy134", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorephy135", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorephy136", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorephy137", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorephy138", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorephy139", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorephy1310", str49);
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
                                editor.putString("iScorephy131", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorephy132", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorephy133", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorephy134", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorephy135", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorephy136", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorephy137", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorephy138", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorephy139", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorephy1310", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        physics2013.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2013.this.scr.setVisibility(8);
                physics2013.this.chr.stop();
                physics2013.this.toolbar.setVisibility(8);
                physics2013.this.Relative.setBackgroundColor(physics2013.this.getResources().getColor(C2719R.C2720color.transparent_black));
                physics2013.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2013.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2013.this.scr.setVisibility(0);
                physics2013.this.toolbar.setVisibility(0);
                physics2013.this.telegram_layout.setVisibility(8);
                physics2013.this.chr.start();
                physics2013.this.Relative.setBackgroundColor(physics2013.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = physics2013.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = physics2013.this.mInterstitialAd = null;
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
                physics2013.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
