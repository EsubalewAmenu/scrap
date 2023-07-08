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

public class physics2012 extends AppCompatActivity {
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
    private Boolean f612b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private Button constantValue;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscorePhysics2012;
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
    private Toolbar f613tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_physics2012);
        this.f612b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextPhysics2012);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_physics2012);
        this.constantValue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2012.this.startActivity(new Intent(physics2012.this, P_Constant_Value.class));
            }
        });
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "Which one of the following is correct about diffraction of light?", 0, 0, 0, 0, 0, "Diffraction of light passing through a circular aperture results in parallel bright and dark fringes.", "Diffraction of light passing through a single slit produces bright and dark fringes of equal widths.", "As the width of the slit decreases, the width of the central bright fringe decreases too.", "As the number of slits in diffraction grating increase, the bright fringes appear brighter, taller and narrower.", "during the diffraction of light\na) Light passing through a circular aperture results circular bright and dark fringes.\nb) Light passing through a single slit produces bright and dark fringes of different widths.\nc) Decreasing the width of a single slit produces a wider bright fringe.\nd) As the number of slits of a diffraction grating increase, slit width decrease and the bright fringes formed appear brighter, taller and narrower.\n", "d", 0, 1, this.f612b));
        arrayList.add(new questions("2.", "In Millikan's oil drop experiment,", 0, 0, 0, 0, 0, "the mass of the droplet was determined by measuring its terminal velocity in the absence of electric field.", "Tiny droplets of negatively charged mineral oil where balanced under the action of downward electric force and weight.", "The electric field between the anode and cathode can be increased by decreasing the distance and the potential difference between them.", "The charge of the droplet was found to be half - integer multiple of electron charge.", "According to Millikan's oil drop experiment in the absence of an electric field the droplet moves with its terminal velocity and the weight of the droplet is balanced by the drag force which is directly proportional to the terminal velocity. This fact helps him in determining the mass of the droplet.", "a", 0, 1, this.f612b));
        arrayList.add(new questions("3.", "Many chemical reactions release energy. Suppose that at the beginning of a reaction, an electron and a proton are separated by 0.110 nm, and their final separation is 0.100 nm. The change in the electric potential energy in this reaction (in eV) is", 0, 0, 0, 0, 0, "14.4eV", "27.5eV", "1.30eV", "13.1eV", "", "c", C2719R.C2721drawable.phy123e, 1, this.f612b));
        arrayList.add(new questions("4.", "When an insulator is placed in an external electric field,", 0, 0, 0, 0, 0, "The external electric field induced with in the insulator is greater than the external electric field, but has the same direction as the external field.", "Electric dipoles are induced within the insulator and produce induced electric field opposite to the external field.", "The induced electric field within the insulator is perpendicular to the external field.", "The net electric field within the insulator is greater than the external electric field.", "When an insulator such as a dielectric is placed in an external uniform electric field between the plates of oppositely charged parallel plate capacitor the external electric field decrease in size and electric dipoles are induced within the insulator. This induced electric field opposes the external electric field.", "b", 0, 1, this.f612b));
        arrayList.add(new questions("5.", "Consider a parallel plate capacitor with plate area A. plate separation d, charge Q, capacitance C, potential difference V and electric field E between the plates. The electrical energy density stored by the capacitor", 0, 0, 0, 0, 0, "Increases as the capacitance C and potential difference V increase.", "depends on the plate area A and plate separation d.", "Is directly proportional to the square of the electric field E between the plates.", "Is directly proportional to the electric field E between the plates.", "", "c", C2719R.C2721drawable.phy125e, 1, this.f612b));
        arrayList.add(new questions("6.", "A potential difference V is applied across the ends of a uniform conducting wire of length 1, cross-sectional area A, and containing n free charge carriers per unit volume.\nWhich one of the following is true?\n", 0, 0, 0, 0, 0, "The electric current in the conductor flows arbitrarily in all directions.", "The free electrons in the conductor flow in the direction of the electric field in the conductor.", "The current density in the conductor is directed in the direction of the drift velocity of the free charge carriers.", "The electric current in the conductor flows perpendicularly to the drift velocity of the free charges.", "", "c", C2719R.C2721drawable.phy126e, 1, this.f612b));
        arrayList.add(new questions("7.", "Three resistors are connected across a battery as\" shown below, the potential difference across the resistors R_1,R_2 and R_2 are, respectively,", 0, 0, 0, 0, 0, "55 V,82.5 V,165 V", "50 V,30 V,30 V ", "110 V,25 V,30 V", "55 V,55 V,55 V.", "", "d", C2719R.C2721drawable.phy127e, 1, this.f612b));
        arrayList.add(new questions("8.", "According to Kirchhoff’s junction rule", 0, 0, 0, 0, 0, "The amount of electric charge flowing into a junction is less than the amount flowing out of the junction", "The amount of electric charge flowing into a junction is greater than the amount flowing out of the junction", "The amount of electric charge entering a junction is equal to the amount leaving the junction.", "Charge can disappear or appear at the junction.", "According to Kirchhoff's junction or point rule the sum of currents (charge entering) entering into a junction is equal to the sum of currents (charge leaving) leaving the junction.", "c", 0, 1, this.f612b));
        arrayList.add(new questions("9.", "Which of the following is true about galvanometer?", 0, 0, 0, 0, 0, "A galvanometer can be converted to a voltmeter by connecting a small resistance in parallel with the galvanometer.", "To use a galvanometer as an ammeter that can measure large currents. We need to increase its resistance by connecting a large resistance in series with the galvanometer.", "A galvanometer can be converted to an ammeter that can read large currents by connecting a small resistance in parallel with it, and can be converted to a voltmeter by connecting a large resistance in series with the galvanometer.", "To use a galvanometer as an ammeter that can read large voltage, we connect a small resistance in series with the galvanometer.", "A galvanometer can be modified as an ammeter to read large current by A galvanometer can be modified as an ammeter to read large current by connecting a small resistance known as shunt resistor in parallel to the coil resistance of the galvanometer.\nA galvanometer can be modified as a volunteer by connecting a very large resistor known as multiplier resistor in series to the coil resistance of the galvanometer.\n", "c", 0, 1, this.f612b));
        arrayList.add(new questions("10.", "A galvanometer has an internal resistance of 100Ω and deflects full scale for 1m. The shunt resistance required to use it as an ammeter to read currents up to 1.0A, and the resistance required to use it as a voltmeter to respectively,", 0, C2719R.C2721drawable.p2012q10a, C2719R.C2721drawable.p2012q10b, C2719R.C2721drawable.p2012q10c, C2719R.C2721drawable.p2012q10d, "", "", "", "", "", "n", C2719R.C2721drawable.phy1210e, 1, this.f612b));
        arrayList.add(new questions("11.", "Equilibrium is the state of an object when", 0, 0, 0, 0, 0, "The net force acting on it is constant.", "The object has a constant linear acceleration.", "The net force and net torque are both zero.", "The object has constant angular acceleration", "", "c", C2719R.C2721drawable.phy1211e, 1, this.f612b));
        arrayList.add(new questions("12.", "The fulcrum of a uniform 20 kg seesaw that is 4.0m lomy is located 2.5 m from one cnd. A 30 kg child sits on the long end. The weight of a person sitting on the other end in order to balance the seesaw is", 0, 0, 0, 0, 0, "750 N", "850 N", "433 N", "567 N", "", "d", C2719R.C2721drawable.phy1212e, 1, this.f612b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.p2012q13, C2719R.C2721drawable.p2012q13a, C2719R.C2721drawable.p2012q13b, C2719R.C2721drawable.p2012q13c, C2719R.C2721drawable.p2012q13d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1213e, 1, this.f612b));
        arrayList.add(new questions("14.", "Which one of the following is NOT true about Pascal's principle and its application?", 0, 0, 0, 0, 0, "It has applications in hydraulic brakes for vehicles, where confined oil connects a small piston (brake pedal) to a large piston connected to the brake drums on the wheel of the car.", "It has applications in hydraulic lift in which a small force applied to smaller piston is used to lift heavy object on large piston.", "In pneumatic application, air is used for pressure transmission instead of liquid.", "The hydraulic lift is a speed multiplying device in which a large force lifts a light object over a long distance.", "Pascal's principle is applied in hydraulic brakes for vehicles, in a hydraulic lift as a force multiplying machine and in pneumatic application. Since a hydraulic machine cannot multiply force and speed at the same time so it multiplies only force.", "d", 0, 1, this.f612b));
        arrayList.add(new questions("15.", "Which one of the following is NOT correct about factors that affecting the streamlining of objects moving in a fluid?", 0, 0, 0, 0, 0, "Compressibility of the fluid.", "Density of the fluid.", "The mass of the object.", "Shape and surface area of the object moving in a fluid", "The streamlining of objects moving in a fluid depends on\n \ti. compressibility of the fluid \n \tii. Density of the fluid, \n \tiii. Shape and surface area of the object moving in a fluid;\nfor example birds and air planes flying in air, ships sailing in water have pointing nose but, the streamlining of objects moving in a fluid does not depend on the mass of the object.\n", "c", 0, 1, this.f612b));
        arrayList.add(new questions("16.", "Which of the following is correct?", 0, 0, 0, 0, 0, "Temperature is the measure of the amount of energy that flows from hot to colder region.", "Heat is energy that can be transferred from one object to another at equal temperature.", "Internal energy of a system is independent of its mass or the number of molecules in the system.", "Temperature is a measure of the average molecular kinetic energy of a gas.", "Heat is energy that can be transferred one object to the other due to temperature difference. Temperature indicates the direction of heat flow. The internal energy of a system depend on\nits mass or on the number of molecules in the system.\nTemperature is the measure of the average molecular kinetic energy of a gas.\n", "d", 0, 1, this.f612b));
        arrayList.add(new questions("17.", "", C2719R.C2721drawable.p2012q17, C2719R.C2721drawable.p2012q17a, C2719R.C2721drawable.p2012q17b, C2719R.C2721drawable.p2012q17c, C2719R.C2721drawable.p2012q17d, "", "", "", "", "", "a", C2719R.C2721drawable.phy1217e, 1, this.f612b));
        arrayList.add(new questions("18.", "A glass contains 12 mole of water molecule (H_2 O). The number of water molecules, the mass of water, and the mass of each water molecule in the glass are, respectively \n(Molar mass of H is 1.0 g and O is 16 g )\n", 0, C2719R.C2721drawable.p2012q18a, C2719R.C2721drawable.p2012q18b, C2719R.C2721drawable.p2012q18c, C2719R.C2721drawable.p2012q18d, "", "", "", "", "", "b", C2719R.C2721drawable.phy1218e, 1, this.f612b));
        arrayList.add(new questions("19.", "Which of the following statements is correct about thermodynamic processes?", 0, 0, 0, C2719R.C2721drawable.p2012q19c, 0, "An isobaric process occurs at constant volume and its p - v diagram is a vertical line.", "An isothermal process occurs at constant pressure and its p-v diagram is a linearly increasing plot.", "", "In an adiabatic process, there is no heat removed from or absorbed by the system and its p-v diagram is a decreasing plot.", "During an isobaric process the pressure of the gas is constant and the p-v diagram is a horizontal line.\nDuring an isothermal process the temperature of the gas is constant and the p-v diagram is a parabola.\nAn isochoric process occurs at constant volume of a gas and the p-v diagram is a vertical line.\nDuring an adiabatic process there is no heat added or removed from the system and the p-v diagram is a decreasing (hyperbolic) plot.\n", "d", 0, 1, this.f612b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.p2012q20, C2719R.C2721drawable.p2012q20a, C2719R.C2721drawable.p2012q20b, C2719R.C2721drawable.p2012q20c, C2719R.C2721drawable.p2012q20d, "", "", "", "", "", "c", C2719R.C2721drawable.phy1220e, 1, this.f612b));
        arrayList.add(new questions("21.", "Which one of the following is true about fundamental forces?", 0, 0, 0, 0, 0, "Gravitational force is a long-range attractive force between particles due to their charges.", "Strong nuclear force is a short - range that holds protons and neutrons to form atomic nucleus.", "A weak nuclear force is an extremely short-range force that binds protons and neutrons together in the nucleus.", "Electromagnetic force is a long-range attractive force between particles due to their masses.", "Gravitational force is a long range attractive force between particles due their masses\n \tWeak nuclear force is a force which is responsible for radioactive decay.\n \tElectromagnetic force is attractive or repulsive force and acts on charged bodies.\nStrong nuclear force is a short range force that binds protons and neutrons in the nucleus.\n", "b", 0, 1, this.f612b));
        arrayList.add(new questions("22.", "", C2719R.C2721drawable.p2012q22, C2719R.C2721drawable.p2012q22a, C2719R.C2721drawable.p2012q22b, C2719R.C2721drawable.p2012q22c, C2719R.C2721drawable.p2012q22d, "", "", "", "", "", "d", C2719R.C2721drawable.phy1222e, 1, this.f612b));
        arrayList.add(new questions("23.", "Which of the following is correct about an astronaut inside an international space station orbiting the Earth?", 0, 0, 0, 0, 0, "Since the Earth exerts equal forces on both the astronaut and the space, the astronaut experiences weightlessness.", "The astronaut experiences weightlessness since the Earth's gravitational force on the astronaut is less than the Earth's force on the space station.", "The astronauts experiences weightlessness because the space station and the astronauts are freely falling towards the center of the earth.", "Because the Earth exerts a large force on the astronaut than on the space station, the astronaut experienced weightlessness.", "For an astronaut an international space orbiting the Earth the astronaut experiences weightlessness because the earth's gravitational force on the astronaut is less than the Earth's force on the space station.", "b", 0, 1, this.f612b));
        arrayList.add(new questions("24.", "Two masses of m1 and m2 are balanced on a horizontal stick of negligible mass pivoted at the center of mass of the system. If the distance of m1 to the center of mass is 3.0m and the distance from the mass m2 to the center of mass is 1.0m, the ratio of m1 to m2 (m1/m2) is", 0, 0, 0, 0, 0, "4/3", "3/4", ExifInterface.GPS_MEASUREMENT_3D, "1/3", "", "d", C2719R.C2721drawable.phy1224e, 1, this.f612b));
        arrayList.add(new questions("25.", "Identify the correct statement about energy, work, and force.", 0, 0, 0, 0, 0, "Work is said to be done by a force whenever the force is exerted on the object.", "Force is a vector quantity, whereas work and energy are scalars.", "Machine can multiply energy, but not force.", "Energy cannot be possessed by an object at rest.", "Work is done when a net force is applied in the direction of the displacement.\n-\tA machine can multiply force or speed, but not energy.\n-\tBoth work and energy are scalars, whereas force is a vector quantity.\n", "b", 0, 1, this.f612b));
        arrayList.add(new questions("26.", "Distinguish between conservative and non-conservative forces.", 0, 0, 0, 0, 0, "Work done by a conservative force along any closed path is 7ero, whereas the work done by non-conservative force along a closed path is not zero.", "Work done by a conservative force. is path dependent, whereas work done by non-conservative force does not depend on the path followed.", "Friction force is an example of conservative force, whereas spring force and gravitational force are typical examples of non-conservative force.", "A conservative force dissipates energy, whereas a non-conservative force does not.", "Work done by a conservative force\n \ti. path independent,\n \tii. The work done along any closed path is zero and\n \tiii. Recoverable. In general field forces are examples of conservative forces.\nThe work done by a non-conservative force is path dependent, irrecoverable and there is energy dissipation. Forces like, friction, air resistance and drag forces are good examples.\n", "a", 0, 1, this.f612b));
        arrayList.add(new questions("27.", "A crane raises 75.0kg of bricks from the ground to a height of 45.0m in 52 s at a cons ", 0, 0, 0, 0, 0, "3,375 W", "144 W", "14.4 W", "649 W", "", "d", C2719R.C2721drawable.phy1227e, 1, this.f612b));
        arrayList.add(new questions("28.", "For a rigid body rotating about a fixed axis, ", 0, 0, 0, 0, 0, "a point closer to the axis has smaller linear speed than a point farther from the axis", "a point closer to the axis has greater linear speed than a point farther from the axis.", "for the same time interval, a point closer to the axis a point farther from the axis travel the same linear distance.", "For the same time interval, a point closer to the axis turn through a smaller angle than a point farther from the axis.", "For a rigid body that undergo rotation about a fixed axis:\n-\tA point closer to the axis of rotation and farther away from the axis will have the same angular speed and angle turned in the same time, but a point farther away from the axis will has greater linear speed than a point closer to the axis.\n", "a", 0, 1, this.f612b));
        arrayList.add(new questions("29.", "", C2719R.C2721drawable.p2012q29, 0, 0, 0, 0, "0.2 N.m and 400rad/s", "0.1 N.m and 200rad/s", "0.5 N.m and 100rad/s", "0.2 N.m and 800rad/s", "", "d", C2719R.C2721drawable.phy1229e, 1, this.f612b));
        arrayList.add(new questions("30.", "Identify the correct statement about torque and angular acceleration", 0, 0, 0, 0, 0, "For the same time interval, a small torque and a large torque change angular momentum by the same amount.", "A small torque applied for a longer time and a large torque exerted for a shorter time have the same effect on the change of angular momentum.", "No torque acts on an object when its angular momentum increases.", "The change in angular momentum is inversely proportional to the torque exerted for a given time interval.", "When a net torque is exerted on a rigid body for some time interval the angular momentum of the rigid body changes. When a small torque is applied for a longer time and a larger torque is exerted for a short period of time in the change in angular momentum is the same.", "b", 0, 1, this.f612b));
        arrayList.add(new questions("31.", "What is scientific method? ", 0, 0, 0, 0, 0, "Scientific method is a scientific procedure which ensures a rigorous evidence-based structure in which only ideas that have been carefully tasted are accepted as scientific theory.", "It is a scientific procedure in which a researcher begins with performing experiments.", "It is a scientific procedure where a researcher first predicts the result of a problem before proposing the possible hypothesis.", "Begins from an accepted scientific theory and concludes with designing an experiment.", "A scientific method is a scientific procedure which ensures a rigorous evidence based structure in which only ideas that have been carefully tasted are accepted as scientific theory.", "a", 0, 1, this.f612b));
        arrayList.add(new questions("32.", "Which one of the following is correct about accuracy and precision of a measurement?", 0, 0, 0, 0, 0, "Accuracy describes the closeness of repeatedly measured data to each other, whereas precision describes about the closeness of a data to a true value.", "Accuracy refers to the closeness of repeatedly measured data to a true value, whereas precision is related to the closeness of the measured data to each other.", "Accuracy is related to the number of significant figures, whereas precision describes how well we minimize random errors.", "A more accurate measurement has larger uncertainty, whereas a more precise data has smaller uncertainty.", "Precision is the degree of closeness or exactness of measured values to each other, whereas accuracy is the closeness of a repeatedly measured value to the true or accepted value.", "b", 0, 1, this.f612b));
        arrayList.add(new questions("33.", "In an experiment to measure the velocity of a ball rolling along x-axis, a student recorded the distance traveled and time taken by the ball. Which of the following data represents constant velocity of the ball?", 0, C2719R.C2721drawable.p2012q33a, C2719R.C2721drawable.p2012q33b, C2719R.C2721drawable.p2012q33c, C2719R.C2721drawable.p2012q33d, "", "", "", "", "", "f", C2719R.C2721drawable.phy1233e, 1, this.f612b));
        arrayList.add(new questions("34.", "A position vector of an object", 0, 0, 0, 0, 0, "Describes its distance from a point in a specified direction.", "Describes its distance from a given point in all direction.", "It is independent of the origin from which it is measured.", "It is a measure of how fast it is moving relative to stationary reference frame.", "Position vector describes the distance covered by a body in a specified direction.", "a", 0, 1, this.f612b));
        arrayList.add(new questions("35.", "Consider two force vectors in x-y plane; F1=10N making a 30 degree along above the horizontal and F2=20 N making a 60 degree angle above the horizontal. Which of the following is true?", 0, 0, 0, 0, 0, "The horizontal and vertical components of their resultant are 18.66 N and 22.32 N, respectively.", "The horizontal and vertical components of their resultant are 15N and 26N, respectively.", "The direction of their resultant vector is 45 degree above the horizontal.", "The magnitude of their resultant is 42N.", "", "a", C2719R.C2721drawable.phy1235e, 1, this.f612b));
        arrayList.add(new questions("36.", "", C2719R.C2721drawable.p2012q36, C2719R.C2721drawable.p2012q36a, C2719R.C2721drawable.p2012q36b, C2719R.C2721drawable.p2012q36c, C2719R.C2721drawable.p2012q36d, "", "", "", "", "", "d", C2719R.C2721drawable.phy1236e, 1, this.f612b));
        arrayList.add(new questions("37.", "While going to school, a student travels 3 km, East and 4km. North in 2hrs. The magnitude of student's average velocity and average speed are respectively", 0, 0, 0, 0, 0, "5 km/hr and 7 km/hr.", "3.5 km/hr And 2.5 km/hr.", "2.5 km/hr And 3.5 km/hr.", "2km/hr And 7km/hr", "", "c", C2719R.C2721drawable.phy1237e, 1, this.f612b));
        arrayList.add(new questions("38.", "A boy throws a ball vertically upward with an initial speed of 20m/s Neglecting air resistance which of the following is true about the motion of the ball?", 0, 0, 0, 0, 0, "Its maximum height is 20m.", "Its velocity 1s later is 30m/s, upward.", "The time taken to reach the maximum height is 4s.", "Its velocity after 3s is 50m/s, downward.", "", "a", C2719R.C2721drawable.phy1238e, 1, this.f612b));
        arrayList.add(new questions("39.", "Choose a correct statement about centripetal force and centripetal acceleration.", 0, 0, 0, 0, 0, "Centripetal force on an object moving in a circular path is perpendicular to the radius of the path.", "Centripetal force on an object moving in a circular path tends to pull the object outward from the path.", "For an object moving in a circular path, its centripetal force and centripetal acceleration are parallel and directed toward the center of the path.", "Centripetal acceleration and centripetal force are constant in direction, but vary in magnitude.", "Centripetal force is a center seeking force that pulls the mass toward the center of the circle, According to Newton's second law of motion, both centripetal force directed to the center of the circle and both are also perpendicular to the tangential velocity,", "c", 0, 1, this.f612b));
        arrayList.add(new questions("40.", "According to Newton's law of Universal Gravitation,", 0, 0, 0, 0, 0, "The period of a satellite orbiting the Earth in a circular orbit increases as the radius of its orbit increases.", "The gravitational attraction between two objects is directly proportional to the square of the distance between them.", "The speed of a satellite moving around the Earth in a circular orbit depends on the mass of the satellite.", "For two interacting objects, the gravitational force exerted on a light object is less than the force on the heavy one.", "According to Kepler's third law of planetary motion the square of period of revolution of the satellite is directly proportional to the cube of the mean distance between the satellite and the earth. Newton formulated his law of universal gravitation based on Kepler's third law. Therefore, the period of a satellite orbiting the earth increases as the radius of its orbit increases.", "a", 0, 1, this.f612b));
        arrayList.add(new questions("41.", "According the kinetic theory of gases, the", 0, 0, 0, 0, 0, "Average translational kinetic energy of the particles of an ideal gas increases as the gas gets cooled.", "Internal energy of an ideal gas is equal to the potential energy due to interaction between the particles of the gas.", "Diffusion rate of a gas is inversely proportional to the square root of the molar mass because it is directly proportional to the molecular speed.", "Particles of an ideal gas undergo inelastic collision between ", "According to the kinetic theory of gases,\n-\tThe average KE of the particles of an ideal gas increase, as the temperature of the gas increases.\n-\tThe collision between the molecules is perfectly elastic.\n-\tThe internal energy of an ideal gas is only due to molecular KE of the molecules, because in an ideal gas molecular interaction is negligible.\n", "c", 0, 1, this.f612b));
        arrayList.add(new questions("42.", "At t=0, an object undergoing SHM has maximum displacement of 0.650 m and angular frequency of 740rad/s. Which of the following is correct about the motion of the oscillator?", 0, 0, 0, 0, 0, "The position of the object is x = 0.650cos(7.40t) and its acceleration is a = -3.59sin(7.40r).", "The position of the object is x = 0.650sin(7.40t) and its velocity is v = 4.81cos(7.40t)", "The frequency of the oscillator is 7.40 Hz and its period is 0.135 s.", "The position of the object is x = 0.650cos(7.40r) and its acceleration is a = -35.59cos(7.40t).", "", "d", C2719R.C2721drawable.phy1242e, 1, this.f612b));
        arrayList.add(new questions("43.", "A 0.35kg mass attached to the end of a spring oscillates 2.5 times per second with amplitude of 0.15m. Which of the following is true about the motion of the mass?", 0, 0, 0, 0, 0, "The total energy of the system is 97.0 J.", "The velocity when it passes the equilibrium is 2.355m/s.", "The acceleration when it is 0.10m from equilibrium is 25.00m/s^2.", "The velocity when it is 0.10m from equilibrium is 3.0m/s.", "", "b", C2719R.C2721drawable.phy1243e, 1, this.f612b));
        arrayList.add(new questions("44.", "Identify a true statement about a mechanical wave.", 0, 0, 0, 0, 0, "The velocity of a traveling wave is equal to the velocity of the particles through which the wave propagates.", "As a wave travels from one point to another along a medium, it transmits energy and particles of the medium from point to point.", "The speed of a wave traveling along a string increases as the tension in the string increases and as the linear density of the string decreases.", "The speed of a wave traveling across a thin string is equal to its speed when traveling across a thick string of the same length and tension.", "", "c", C2719R.C2721drawable.phy1244e, 1, this.f612b));
        arrayList.add(new questions("45.", "Which of the following is a correct statement about the intensity of sound?", 0, 0, 0, 0, 0, "It is energy transmitted per unit time.", "It is the product of power of a sound and area through which the sound is transmitted.", "It is inversely proportional to the square of the distance from the source of sound.", "It is directly proportional to the square of the distance from the sound source.", "", "c", C2719R.C2721drawable.phy1245e, 1, this.f612b));
        arrayList.add(new questions("46.", "Which of the following is correct about Doppler Effect?", 0, 0, 0, 0, 0, "When a source of sound wave moves toward stationary observer, the wavelength of the wave increases while its frequency decreases", "It is the change m the velocity of a wave due to relative motion between the source of the wave and an observer.", "Doppler Effect is the change in the frequency of a wave due to relative motion between the wave source and an observer.", "When a sound source moves away from stationary observer, the frequency detected by the observer increases, whereas the wavelength decreases.", "Doppler Effect is the alternate variation or the change in the frequency of a wave due to relative motion of the source and the observer away or toward each other.", "c", 0, 1, this.f612b));
        arrayList.add(new questions("47.", "Huygens's principle states that", 0, 0, 0, 0, 0, "The secondary wavelets combine to produce a new wave front which has a shape different from the original wave front.", "All points along a wave front acts as a source of plane secondary wavelets that travel at speeds and frequencies greater than that of the original wave front.", "The secondary wavelets are parallel to the original wave front.", "All points along a wave front behave as a source of secondary wavelets that have the same frequency and speed as the original wave front.", "Huygens’s principle states that; - \n- Every point on a wave front acts as a source of spherical secondary wavelets.\n-  The secondary wavelets spread in all directions with the same frequency, speed and wavelength as the original wave.\n-  New wave front is formed when these wavelets combine.\n", "d", 0, 1, this.f612b));
        arrayList.add(new questions("48.", "Which one of the following is correct about the law of reflection and the law of refraction?", 0, 0, 0, 0, 0, "The speed and wave length of a reflected wave are different from that of an incident wave.", "The incident and refracted rays make equal angles with the boundary of the two interface.", "The ratio of the sine of incident angle to the sine of the refracted angle is equal to the ratio of the speed of the incident wave to the speed of the refracted wave.", "If the speed of the incident wave is less than the speed of the refracted wave, the refracted wave bends towards the normal line.", "During reflection of wave the speed, wavelength and frequency of the wave is the same before and after reflection.\n \t- The angle of incidence is equal to the angle of reflection.\n- During refraction of wave, if the speed of the incident wave is less than the speed of the refracted wave, the refracted wave bends away from the normal.\n - During refraction of a wave both speed and wavelength change whereas frequency will remain the same.\n  - Snell's law states that the ratio of the sine incident angle to the sine of the refracted angle is equal to the ratio of the speed of the incident wave to the speed of the refracted wave.\n", "c", 0, 1, this.f612b));
        arrayList.add(new questions("49.", "Choose the correct statement about interference pattern due to diffraction of light through single and double slits.", 0, 0, 0, 0, 0, "Constructive interference due to double slit and single slit interference occur when the path difference between interfering waves is half-integer multiple of the wave length.", "The bright and dark fringes formed when light passes through double slit have equal widths, whereas the central bright fringe formed in single slit diffraction is twice wider as the first order maxima.", "The light intensity of interference pattern due to double and single slits remain the same as the distance from the central bright fringe increases.", "The central bright fringes in both double and single slits interference are twice as wide as the first order bright fringes.", "The interference pattern due to diffraction when light pass through a double slit produces bright and dark fringes of equal widths.\n- The interference pattern due to diffraction when light pass through a single slit, the central bright fringe appears twice as wide as the first order maxima.\n", "b", 0, 1, this.f612b));
        arrayList.add(new questions("50.", "In order for interference of light waves to occur, the interfering light waves should", 0, 0, 0, 0, 0, "Have constant phase difference and the same frequency and speed.", "Be of different types", "Be coherent.", "Be in phase", "In order for interference of light waves to occur coherent source of light must be used.\nIn order for two waves to be coherent, they must\n-\tBe the same type of wave,\n-\tHave same frequency and maintain constant phase relationship.\n", "a", 0, 1, this.f612b));
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
        this.f613tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    physics2012.this.timer.setVisibility(0);
                    physics2012.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    physics2012.this.scr.setVisibility(8);
                    physics2012.this.chr.stop();
                    physics2012.this.toolbar.setVisibility(8);
                    physics2012.this.Relative.setBackgroundColor(-7829368);
                    physics2012.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2012.this.getBaseContext());
                    int unused = physics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = physics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = physics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = physics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = physics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = physics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = physics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = physics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = physics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = physics2012.this.highscorePhysics2012 = defaultSharedPreferences.getInt("phy2012hs", 0);
                    int access$600 = physics2012.this.part1 + physics2012.this.part2 + physics2012.this.part3 + physics2012.this.part4 + physics2012.this.part5 + physics2012.this.part6 + physics2012.this.part7 + physics2012.this.part8 + physics2012.this.part9;
                    TextView access$1600 = physics2012.this.resultText;
                    access$1600.setText(access$600 + "/50");
                    physics2012.this.progressbar.setProgress(access$600);
                    physics2012.this.progressbar.setMax(50);
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
                    int unused11 = physics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = physics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = physics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = physics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = physics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = physics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = physics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = physics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = physics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = physics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = physics2012.this.answered1 + physics2012.this.answered2 + physics2012.this.answered3 + physics2012.this.answered4 + physics2012.this.answered5 + physics2012.this.answered6 + physics2012.this.answered7 + physics2012.this.answered8 + physics2012.this.answered9 + physics2012.this.answered10;
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
                    if (access$600 > physics2012.this.highscorePhysics2012) {
                        edit.putInt("phy2012hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 50;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - physics2012.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1phy121", 0);
                    long j2 = defaultSharedPreferences.getLong("date1phy122", 0);
                    long j3 = defaultSharedPreferences.getLong("date1phy123", 0);
                    long j4 = defaultSharedPreferences.getLong("date1phy124", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1phy125", 0);
                    long j6 = defaultSharedPreferences.getLong("date1phy126", 0);
                    long j7 = defaultSharedPreferences.getLong("date1phy127", 0);
                    long j8 = defaultSharedPreferences.getLong("date1phy128", 0);
                    long j9 = defaultSharedPreferences.getLong("date1phy129", 0);
                    long j10 = defaultSharedPreferences.getLong("date1phy1210", 0);
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
                        editor.putString("scorephy121", str);
                        editor.putLong("date1phy121", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorephy122", str2);
                            editor.putLong("date1phy122", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorephy123", str2);
                            editor.putLong("date1phy123", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorephy124", str2);
                            editor.putLong("date1phy124", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorephy125", str2);
                            editor.putLong("date1phy125", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorephy126", str2);
                            editor.putLong("date1phy126", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorephy127", str2);
                            editor.putLong("date1phy127", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorephy128", str2);
                            editor.putLong("date1phy128", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorephy129", str2);
                            editor.putLong("date1phy129", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorephy1210", str2);
                            editor.putLong("date1phy1210", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datephy121", 0);
                    long j12 = defaultSharedPreferences.getLong("datephy122", 0);
                    long j13 = defaultSharedPreferences.getLong("datephy123", 0);
                    long j14 = defaultSharedPreferences.getLong("datephy124", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datephy125", 0);
                    long j16 = defaultSharedPreferences.getLong("datephy126", 0);
                    long j17 = defaultSharedPreferences.getLong("datephy127", 0);
                    long j18 = defaultSharedPreferences.getLong("datephy128", 0);
                    long j19 = defaultSharedPreferences.getLong("datephy129", 0);
                    long j20 = defaultSharedPreferences.getLong("datephy1210", 0);
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
                        editor2.putString("iScorephy121", f);
                        editor2.putLong("datephy121", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorephy122", f);
                            editor2.putLong("datephy122", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorephy123", f);
                            editor2.putLong("datephy123", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorephy124", f);
                            editor2.putLong("datephy124", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorephy125", f);
                            editor2.putLong("datephy125", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorephy126", f);
                            editor2.putLong("datephy126", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorephy127", f);
                            editor2.putLong("datephy127", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorephy128", f);
                            editor2.putLong("datephy128", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorephy129", f);
                            editor2.putLong("datephy129", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorephy1210", f);
                            editor2.putLong("datephy1210", valueOf.longValue());
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
                        physics2012.this.scr.setVisibility(8);
                        physics2012.this.chr.stop();
                        physics2012.this.toolbar.setVisibility(8);
                        physics2012.this.Relative.setBackgroundColor(-7829368);
                        physics2012.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2012.this.getBaseContext());
                        int unused = physics2012.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = physics2012.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = physics2012.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = physics2012.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = physics2012.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = physics2012.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = physics2012.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = physics2012.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = physics2012.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = physics2012.this.highscorePhysics2012 = defaultSharedPreferences.getInt("phy2012hs", 0);
                        int access$600 = physics2012.this.part1 + physics2012.this.part2 + physics2012.this.part3 + physics2012.this.part4 + physics2012.this.part5 + physics2012.this.part6 + physics2012.this.part7 + physics2012.this.part8 + physics2012.this.part9;
                        TextView access$1600 = physics2012.this.resultText;
                        access$1600.setText(access$600 + "/50");
                        physics2012.this.progressbar.setProgress(access$600);
                        physics2012.this.progressbar.setMax(50);
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
                        int unused11 = physics2012.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = physics2012.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = physics2012.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = physics2012.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = physics2012.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = physics2012.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = physics2012.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = physics2012.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = physics2012.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = physics2012.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = physics2012.this.answered1 + physics2012.this.answered2 + physics2012.this.answered3 + physics2012.this.answered4 + physics2012.this.answered5 + physics2012.this.answered6 + physics2012.this.answered7 + physics2012.this.answered8 + physics2012.this.answered9 + physics2012.this.answered10;
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
                        if (access$600 > physics2012.this.highscorePhysics2012) {
                            edit.putInt("phy2012hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - physics2012.this.chr.getBase()) / 1000;
                        String str = "datephy1210";
                        String str2 = "datephy129";
                        String str3 = "datephy128";
                        String str4 = "datephy127";
                        String str5 = "datephy126";
                        String str6 = "datephy125";
                        String str7 = "datephy124";
                        String str8 = "datephy123";
                        String str9 = "datephy122";
                        String str10 = "datephy121";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1phy1210";
                        String str12 = "date1phy129";
                        if (physics2012.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1phy121", 0);
                            String str13 = "date1phy121";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1phy122", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1phy123", 0);
                            long j4 = defaultSharedPreferences.getLong("date1phy124", 0);
                            long j5 = defaultSharedPreferences.getLong("date1phy125", 0);
                            String str16 = "date1phy125";
                            String str17 = "date1phy124";
                            String str18 = "date1phy126";
                            long j6 = defaultSharedPreferences.getLong("date1phy126", 0);
                            long j7 = defaultSharedPreferences.getLong("date1phy127", 0);
                            String str19 = str12;
                            String str20 = "date1phy128";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1phy127";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1phy123";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1phy128", 0));
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
                                editor3.putString("scorephy121", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorephy122", str25);
                                    editor3.putLong("date1phy122", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorephy123", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorephy124", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorephy125", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorephy126", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorephy127", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorephy128", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorephy129", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorephy1210", str25);
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
                                editor4.putString("iScorephy121", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorephy122", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorephy123", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorephy124", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorephy125", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorephy126", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorephy127", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorephy128", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorephy129", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorephy1210", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1phy121";
                            String str30 = "date1phy124";
                            String str31 = str12;
                            String str32 = "date1phy123";
                            String str33 = "date1phy127";
                            String str34 = "date1phy126";
                            String str35 = str11;
                            String str36 = "date1phy125";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1phy122", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1phy122";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1phy128";
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
                                editor2.putString("scorephy121", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorephy122", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorephy123", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorephy124", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorephy125", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorephy126", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorephy127", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorephy128", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorephy129", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorephy1210", str49);
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
                                editor.putString("iScorephy121", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorephy122", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorephy123", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorephy124", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorephy125", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorephy126", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorephy127", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorephy128", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorephy129", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorephy1210", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        physics2012.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2012.this.scr.setVisibility(8);
                physics2012.this.chr.stop();
                physics2012.this.toolbar.setVisibility(8);
                physics2012.this.Relative.setBackgroundColor(physics2012.this.getResources().getColor(C2719R.C2720color.transparent_black));
                physics2012.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2012.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2012.this.scr.setVisibility(0);
                physics2012.this.toolbar.setVisibility(0);
                physics2012.this.telegram_layout.setVisibility(8);
                physics2012.this.chr.start();
                physics2012.this.Relative.setBackgroundColor(physics2012.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = physics2012.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = physics2012.this.mInterstitialAd = null;
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
                physics2012.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
