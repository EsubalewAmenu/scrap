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

public class physics2009 extends AppCompatActivity {
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
    private Boolean f606b;
    private Button cancel;
    /* access modifiers changed from: private */
    public Chronometer chr;
    private Button constantValue;
    private int correctanswer;
    boolean doubleBackToExitPressedOnce = false;
    private Button finish;
    /* access modifiers changed from: private */
    public int highscorePhysics2009;
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
    private Toolbar f607tb;
    /* access modifiers changed from: private */
    public View telegram_layout;
    /* access modifiers changed from: private */
    public TextView timer;
    /* access modifiers changed from: private */
    public Toolbar toolbar;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_physics2009);
        this.f606b = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.finish = (Button) findViewById(C2719R.C2722id.finish);
        this.layout = findViewById(C2719R.C2722id.result);
        this.resultText = (TextView) findViewById(C2719R.C2722id.resultTextPhysics2009);
        this.constantValue = (Button) findViewById(C2719R.C2722id.formulaReference);
        this.telegram_layout = findViewById(C2719R.C2722id.report_layout);
        this.cancel = (Button) findViewById(C2719R.C2722id.cancel_report);
        this.actualReport = (Button) findViewById(C2719R.C2722id.telegram_report);
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
        this.progressbar = (ProgressBar) findViewById(C2719R.C2722id.highScore_physics2009);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        LoadAd();
        this.constantValue.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2009.this.startActivity(new Intent(physics2009.this, P_Constant_Value.class));
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(new questions("1.", "The range of cannon-ball fired horizontally from a laboratory table is equal to 8/3 times the height of the table. What is the direction of velocity vector of the projectile as it strikes the ground?", 0, 0, 0, 0, 0, "45 degree from the horizontal", "53 degree from the horizontal", "60 degree from the horizontal", "37 degree from the horizontal", "", "d", C2719R.C2721drawable.phy091e, 1, this.f606b));
        arrayList.add(new questions("2.", "", C2719R.C2721drawable.p2009q2, 0, 0, 0, 0, "The ball would never reach point B in all instances.", "The ball would reach B in all instances even if point B keeps on receding to infinity in (c).", "The ball would reach point B in (a) and (b) and not in (c).", "The ball would reach point B only in (a).", "Since the experiment is carried out in the absence of friction the ball would reach B in all instances even if point B keeps on receding to infinity in (C).", "b", 0, 1, this.f606b));
        arrayList.add(new questions("3.", "", C2719R.C2721drawable.p2009q3, 0, 0, 0, 0, "25.6 m/s", "21.3 m/s", "16 m/s", "14.8 m/s", "", "c", C2719R.C2721drawable.phy093e, 1, this.f606b));
        arrayList.add(new questions("4.", "", C2719R.C2721drawable.p2009q4, C2719R.C2721drawable.p2009q4a, C2719R.C2721drawable.p2009q4b, C2719R.C2721drawable.p2009q4c, C2719R.C2721drawable.p2009q4d, "", "", "", "", "", "b", C2719R.C2721drawable.phy094e, 1, this.f606b));
        arrayList.add(new questions("5.", "Which of the following statements is not correct?", 0, 0, 0, 0, 0, "Dynamic equilibrium is an equilibrium in which a body is moving at steady velocity without net force of torque acting on it.", "Static equilibrium is an equilibrium in which a body is at rest without net force or torque acting on it.", "Couples are set of forces with a resultant torque but no net force.", "The necessary and sufficient condition for equilibrium of a rigid body is to have the sum of all torques acting on it is zero.", "The necessary and sufficient condition for equilibrium of a rigid body\nis to have the sum of all torques and the sum of all forces acting on it is\nzero.\n∑F ⃗=0 And ∑τ ⃗=0\n", "d", 0, 1, this.f606b));
        arrayList.add(new questions("6.", "A spring with a spring constant of 300 N/m is stretched 20 cm in 2 seconds. What is the power applied to stretch the spring?", 0, 0, 0, 0, 0, "3W", "6W", "30KW", "60KW", "", "a", C2719R.C2721drawable.phy096e, 1, this.f606b));
        arrayList.add(new questions("7.", "A 50KW machine is used to lift heavy objects to the top of a building under construction. If this machine is replaced with a new machine of 100KW power, then which of the following statements is not true about the new machine?", 0, 0, 0, 0, 0, "The new machine can raise objects with the same mass at twice the speed of the old machine.", "The new machine can raise objects with twice as much mass at the same speed as the old machine.", "The new machine takes twice as much time to do the same work as the old machine.", "The new machine can do twice as much work in the same time as the old machine.", "", "c", C2719R.C2721drawable.phy097e, 1, this.f606b));
        arrayList.add(new questions("8.", "Which of the following is correct about a work done for dissipative forces?", 0, 0, 0, 0, 0, "Path dependent", "The same as the loss in kinetic energy.", "The same as the gain in potential energy.", "The same as the potential energy stored in spring.", "The work done by dissipative forces is\npath dependent and the same as the loss in mechanical energy.\n", "a", 0, 1, this.f606b));
        arrayList.add(new questions("9.", "", C2719R.C2721drawable.p2009q9, C2719R.C2721drawable.p2009q9a, C2719R.C2721drawable.p2009q9b, C2719R.C2721drawable.p2009q9c, C2719R.C2721drawable.p2009q9d, "", "", "", "", "", "d", C2719R.C2721drawable.phy099e, 1, this.f606b));
        arrayList.add(new questions("10.", "A pulley is rotating at a frequency of 20rev/min. A motor speeds up the wheel so that 30 s later the frequency of the motion is 60rev/min. How far will point on the pool 0.30m from its center has travelled during that period?", 0, 0, 0, 0, 0, "125.7 m", "0.13 m", "37.68 m", "4.2 m", "", "c", C2719R.C2721drawable.phy0910e, 1, this.f606b));
        arrayList.add(new questions("11.", "", C2719R.C2721drawable.p2009q11, 0, 0, 0, 0, "2.5 Nm", "4 Nm", "5 Nm", "12 Nm", "", "d", C2719R.C2721drawable.phy0911e, 1, this.f606b));
        arrayList.add(new questions("12.", "Which of the following statements is correct about the first condition of equilibrium?", 0, 0, 0, 0, 0, "The net force on an object must be zero.", "The sum of all torques must be zero.", "Clockwise moments should balance counter clockwise moments.", "The torque produced by a force should be perpendicular to the force.", "The first condition of equilibrium states that when several forces act at a point on a body the vector sum of the forces acting on the body is zero. (The net force on an object must be zero)\n \tΣF ⃗=F ⃗_\"net \" =0 or ∑F ⃗_x=0 and ∑F ⃗_y=0\n", "a", 0, 1, this.f606b));
        arrayList.add(new questions("13.", "", C2719R.C2721drawable.p2009q13, 0, 0, 0, 0, "10 N ", "50 N", "70 N", "110 N", "", "c", C2719R.C2721drawable.phy0913e, 1, this.f606b));
        arrayList.add(new questions("14.", "Which of the following refers to the definition of strain as a ratio?", 0, 0, 0, 0, 0, "Extension to the original length.", "Force applied to area of the object normal to the force.", "Stress to Young modulus.", "Tensile to applied force.", "The strain caused by stress is defined as the ratio of extension of the material to its original length. Thus,\n  \t■(\" Strain \" & =\" extension on material \" /\" original length \" @& =Δx/\" Lo \" )\n", "a", 0, 1, this.f606b));
        arrayList.add(new questions("15.", "Which of the following is the application of Pascal's law?", 0, 0, 0, 0, 0, "Hydraulic brake in vehicles.", "Siphon to remove fluids.", "Working of submarines.", "Sucking of liquid into a syringe.", "Hydraulic brake in vehicles, cranes, elevators, forklifts etc. Use the working principle of Pascal's law.", "a", 0, 1, this.f606b));
        arrayList.add(new questions("16.", "A large (very large in height and cross-section) water open at the top has a small hole through its side near the bottom. To what height should the water be filled, to double the speed of water that flow out of the hole when it was filled to a height h ?", 0, 0, 0, 0, 0, "h", "2h", "3h", "4h", "", "b", C2719R.C2721drawable.phy0916e, 1, this.f606b));
        arrayList.add(new questions("17.", "If a precision of surveyor measured a distance of 500 meters / between two points in a village/ using a meter that has centimeter division on it, then what is the measurement result?", 0, 0, 0, 0, 0, "500 m", "500.0 m", "500.00 m", "500.000 m", "Given: \tDistance between two points in a village is S=500\" \" m\n \t\twhen the measuring instrument has centimeter division on it\n \t\t, the resulting measurement is written as S=500.00\" \" m.\n", "c", 0, 1, this.f606b));
        arrayList.add(new questions("18.", "From the figures given below, which one of them shows precise but not accurate measurements? T represents the true value.", 0, C2719R.C2721drawable.p2009q18a, C2719R.C2721drawable.p2009q18b, C2719R.C2721drawable.p2009q18c, C2719R.C2721drawable.p2009q18d, "", "", "", "", "In part A of the graph the measurement is not accurate because the measured value has more deviation than the true value (T) than the other cases.", "a", 0, 1, this.f606b));
        arrayList.add(new questions("19.", "", C2719R.C2721drawable.p2009q19q, C2719R.C2721drawable.p2009q19qa, C2719R.C2721drawable.p2009q19qb, C2719R.C2721drawable.p2009q19qc, C2719R.C2721drawable.p2009q19qd, "", "", "", "", "", "a", C2719R.C2721drawable.phy0919e, 1, this.f606b));
        arrayList.add(new questions("20.", "", C2719R.C2721drawable.p2009q20q, 0, 0, 0, 0, "60 degree", "53 degree", "45 degree", "30 degree", "", "a", C2719R.C2721drawable.phy0920e, 1, this.f606b));
        arrayList.add(new questions("21.", "", C2719R.C2721drawable.p2009q21q, 0, 0, 0, 0, "√(10) m/s", "√(13) m/s", "7 m/s", "√(130) m/s", "", "c", 0, 1, this.f606b));
        arrayList.add(new questions("22.", "A cricketer throws a ball vertically upwards with initial speed of 20\" \" m/s. How long is it in the air before it returns to the cricketer's hands?", 0, 0, 0, 0, 0, "2 s", "10 s", "1.5 s", "4 s", "", "d", C2719R.C2721drawable.phy0922e, 1, this.f606b));
        arrayList.add(new questions("23.", "Abeba walks to school. She walks 1 km in 15 minutes. She meets her friend Makeda- they talk for 5 minutes and then carry on walking to school. They walk 800 m in 10 minutes. Which of the following displacement-time graph shows Abeba's journey to school?", 0, C2719R.C2721drawable.p2009q23qa, C2719R.C2721drawable.p2009q23qb, C2719R.C2721drawable.p2009q23qc, C2719R.C2721drawable.p2009q23qd, "", "", "", "", "For the first time interval between t_0=0 and t_1=15\" \" min the displacement of Abeba increases uniformly from 0 to 100\" \" m.\n\tBetween the time interval t_1=15\" \" min and t_2=20\" \" min the displacement of Abeba is zero and the graph of displacement against time is a horizontal line.\n\tBetween the time interval t_2=20\" \" min and t_3=30\" \" min Abeba walked to school in the same direction with a steady velocity and the shape of displacement against time graph, for third interval is a straight line. \nThe graph of displacement against time shown in choice B describes Abeba's motion for the entire journey to school.\n", "b", 0, 1, this.f606b));
        arrayList.add(new questions("24.", "A fun making boy swings a blinking ball tied to the end of a string in a vertical circle. If the radius of the circle is 0.5\" \" m, then what should be the minimum speed of the ball at the bottom of the circle to make a complete circular motion at the top?", 0, 0, 0, 0, 0, "5 m/s", "√5 m/s", "√15 m/s", "2√5 m/s", "", "a", C2719R.C2721drawable.phy0924e, 1, this.f606b));
        arrayList.add(new questions("25.", "", C2719R.C2721drawable.p2009q25q, C2719R.C2721drawable.p2009q25qa, C2719R.C2721drawable.p2009q25qb, C2719R.C2721drawable.p2009q25qc, C2719R.C2721drawable.p2009q25qd, "", "", "", "", "", "b", C2719R.C2721drawable.phy0925e, 1, this.f606b));
        arrayList.add(new questions("26.", "Which of the following phenomena clearly demonstrates the particle nature of light?", 0, 0, 0, 0, 0, "Refraction of light by prism.", "The photoelectric effect.", "Diffraction of light by double slit.", "Dispersion of white light.", "Photoelectric effect states that light travels in the form of bundles or packets of energy, called photons. This effect is explained on the basis of the quantum nature of light. So, it clearly explains the particle's nature of light.", "b", 0, 1, this.f606b));
        arrayList.add(new questions("27.", "Which of the following statements is correct?", 0, 0, 0, 0, 0, "Irreversible process is a process that can be reversed through finite change in the system.", "Complete conversion of energy from a hot source into work is possible.", "There are processes in which there is an overall decrease in entropy.", "Entropy is a measure of the amount of disorder.", "Entropy of a system is the measure of the amount of disorder.\n \t✓ Complete conversion of energy from a hot source in to work is impossible.\n \t✓ There is no process in which there is an overall decrease in entropy of the universe.\n \t✓ Irreversible process is a process which cannot be reversed.\n", "d", 0, 1, this.f606b));
        arrayList.add(new questions("28.", "A certain heat engine draws 500cal/s from a water bath at 27 degree Celsius and rejects 400 calories to a reservoir at a lower temperature. What is the efficiency of this engine?", 0, 0, 0, 0, 0, "80%", "75%", "25%", "20%", "", "d", C2719R.C2721drawable.phy0928e, 1, this.f606b));
        arrayList.add(new questions("29.", "Three metals are in contact and in thermal equilibrium. The metals have different specific heat capacity. What can be concluded about the temperature of the metals?", 0, 0, 0, 0, 0, "Since they have different specific heat capacity, they must have different temperature at thermal equilibrium.", "They must have the same temperature at thermal equilibrium.", "They must have different internal energy.", "They must have different kinetic energy.", "Solution: The three metals are in contact and are in thermal equilibrium each having different specific heat capacity means there is no net heat flow between them and they must have the same temperature.", "b", 0, 1, this.f606b));
        arrayList.add(new questions("30.", "Metal A has a coefficient of linear expansion that is three times the coefficient of linear expansion of metal B. How does their coefficient of areal expansion, Y, compare?", 0, 0, 0, 0, 0, "YA = 2YB", "YA = 3YB", "YA = 4YB", "YA = 6YB", "", "b", C2719R.C2721drawable.phy0930e, 1, this.f606b));
        arrayList.add(new questions("31.", "", C2719R.C2721drawable.p2009q31q, C2719R.C2721drawable.p2009q31qa, C2719R.C2721drawable.p2009q31qb, C2719R.C2721drawable.p2009q31qc, C2719R.C2721drawable.p2009q31qd, "", "", "", "", "", "b", C2719R.C2721drawable.phy0931e, 1, this.f606b));
        arrayList.add(new questions("32.", "", C2719R.C2721drawable.p2009q32q, 0, 0, 0, 0, "3 kg", "2 kg", "1 kg", "0 kg ", "", "a", C2719R.C2721drawable.phy0932e, 1, this.f606b));
        arrayList.add(new questions("33.", "", C2719R.C2721drawable.p2009q33q, 0, 0, 0, 0, "209.6 V", "104.8 V", "200 V", "182.4 V", "", "a", C2719R.C2721drawable.phy0933e, 1, this.f606b));
        arrayList.add(new questions("34.", "", C2719R.C2721drawable.p2009q34q, 0, 0, 0, 0, "Zero current as transformer is not working on DC.", "A nonzero current for a short instant.", "A steady current.", "emf Will be induced but not current.", "Since the primary coil of the transformer is connected to a direct current source (battery) the current in the primary coil is steady and this current circulate only in the primary coil. There is no induced current or voltage in the secondary coil because electromagnetic induction will not take place. The ammeter connected to the output show zero current as transformer is not working on DC. ", "a", 0, 1, this.f606b));
        arrayList.add(new questions("35.", "Which of the following statement is correct?", 0, 0, 0, 0, 0, "The direction of induced e.m.f is in such a direction as to re-enforce the change produces it.", "Self-inductance of a coil is e.m.f divided by magnitude of rate change of current with time.", "The induced e.m.f in a coil is inversely proportional to its number of turns.", "Self inductance of a coil is inversely proportional to the cross sectional area of the coil.", "", "b", C2719R.C2721drawable.phy0935e, 1, this.f606b));
        arrayList.add(new questions("36.", "The induced electromotive force in a current carrying coil placed in a magnetic field does not depend on which of the following?", 0, 0, 0, 0, 0, "The speed at which the coil moves if the relative motion does not result in changing the magnetic flux.", "The change of magnetic flux density.", "The length of the coil that is moving in a direction perpendicular to that of the magnetic field.", "The area of the coil outside the field.", "The induced electromotive force in a current carrying coil depends on. ✓ The change in magnetic flux density.\n✓ The area of the coil.\n✓ The length of the coil that is moving in a direction perpendicular to that of the magnetic field.\n✓ It is independent of the speed of the coil if the relative motion does not result in changing the magnetic flux.\n", "a", 0, 1, this.f606b));
        arrayList.add(new questions("37.", "", C2719R.C2721drawable.p2009q37q, C2719R.C2721drawable.p2009q37qa, C2719R.C2721drawable.p2009q37qb, C2719R.C2721drawable.p2009q37qc, C2719R.C2721drawable.p2009q37qd, "", "", "", "", "", "d", C2719R.C2721drawable.phy0937e, 1, this.f606b));
        arrayList.add(new questions("38.", "A charged particle moves perpendicular to a uniform magnetic field. Which statement is correct about the motion of the particle?", 0, 0, 0, 0, 0, "Both kinetic energy and linear momentum of the particle change.", "The kinetic energy of the particle changes but not its linear momentum.", "The linear momentum of the particle changes but not its kinetic energy.", "Both the energy and momentum do not change.", "When a charged particle moves perpendicular to a uniform magnetic field.\na) The charge will follow a circular path.\nb) The tangential velocity changes in direction but remains constant in magnitude.\nc) The magnitude of the linear momentum of the charged particle remains constant but changes in direction.\nd) The kinetic energy remains constant.\nFrom the above facts we can say that the linear momentum of the particle changes but not its kinetic energy.\n", "c", 0, 1, this.f606b));
        arrayList.add(new questions("39.", "Which of the following is not correct about magnetic field?", 0, 0, 0, 0, 0, "Magnetic field lines are closed.", "Magnetic monopoles exist.", "The closer the field lines are, the stronger the magnetic field.", "Magnetic field is produced by moving charge.", "Magnetic field lines are closed lines without beginning and end.\n✓In a region where the field lines are cross together the magnetic field is very strong.\n✓A charged particle set in to motion can produce a magnetic field.\n✓ Magnetic monopoles does not exist.\n", "b", 0, 1, this.f606b));
        arrayList.add(new questions("40.", "", C2719R.C2721drawable.p2009q40q, C2719R.C2721drawable.p2009q40qa, C2719R.C2721drawable.p2009q40qb, C2719R.C2721drawable.p2009q40qc, C2719R.C2721drawable.p2009q40qd, "", "", "", "", "", "d", 0, 1, this.f606b));
        arrayList.add(new questions("41.", "A galvanometer of full-scale deflection 10 mA is to be converted into a 0-10.0A ammeter. If its coil has a resistance of 100 Ω, then what value of shunt resistance must be fitted?", 0, 0, 0, 0, 0, "0.1 Ω", "10 Ω", "9.99 Ω", "0.999 Ω", "", "a", C2719R.C2721drawable.phy0941e, 1, this.f606b));
        arrayList.add(new questions("42.", "If a cell supplies a current of 0.9 A when connected to a 2 Ω resistor and a current of 0.3 A, then what will be the internal resistance of the cell when connected to a 7 Ω resistor?", 0, 0, 0, 0, 0, "2 Ω", "1.2 Ω", "1 Ω", "0.5 Ω", "", "d", C2719R.C2721drawable.phy0942e, 1, this.f606b));
        arrayList.add(new questions("43.", "The capacitance of a parallel plate capacitor is 10μF. If the distance between the plates is halved, keeping all other quantities constant, then what is the new capacitance of the capacitor?", 0, 0, 0, 0, 0, "0.2μF", "5μF", "10μF", "20μF", "", "d", C2719R.C2721drawable.phy0943e, 1, this.f606b));
        arrayList.add(new questions("44.", "", C2719R.C2721drawable.p2009q44q, 0, 0, 0, 0, "3.6KV", "0.72KV", "2.16KV", "1.44KV", "", "a", C2719R.C2721drawable.phy0944e, 1, this.f606b));
        arrayList.add(new questions("45.", "", C2719R.C2721drawable.p2009q45, C2719R.C2721drawable.p2009q45a, C2719R.C2721drawable.p2009q45b, C2719R.C2721drawable.p2009q45c, C2719R.C2721drawable.p2009q45d, "", "", "", "", "", "a", C2719R.C2721drawable.phy0945e, 1, this.f606b));
        arrayList.add(new questions("46.", "In a Young's experiment, there are two slits, rather than one. What do you think the reason?", 0, 0, 0, 0, 0, "To increase the intensity.", "One slit is for frequency, the other for wavelength.", "To create a path length difference.", "One slit is for electric fields, and the other is for magnetic fields.", "", "c", C2719R.C2721drawable.phy0946e, 1, this.f606b));
        arrayList.add(new questions("47.", "", C2719R.C2721drawable.p2009q47, 0, 0, 0, 0, "1", ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "", "c", C2719R.C2721drawable.phy0947e, 1, this.f606b));
        arrayList.add(new questions("48.", "Which of the following statements is correct?", 0, 0, 0, 0, 0, "Interference is not superposition of waves.", "Constructive interference results in a decrease in the intensity.", "Destructive interference results in an increase in the intensity.", "Path difference which is integer multiple of wavelength results in constructive interference.", "", "d", C2719R.C2721drawable.phy0948e, 1, this.f606b));
        arrayList.add(new questions("49.", "Which of the following is not correct about a simple harmonic oscillator?", 0, 0, 0, C2719R.C2721drawable.p2009q49c, 0, "Total mechanical energy is conserved.", "The acceleration is directly proportional to and opposite in direction to displacement.", "", "The frequency of an oscillating mass attached to a massless spring is independent of the spring constant.", "", "d", C2719R.C2721drawable.phy0949e, 1, this.f606b));
        arrayList.add(new questions("50.", "Which one of the following indicates the wavelength of a travelling wave?", 0, 0, 0, 0, 0, "The distance between an adjacent trough and a peak.", "The amplitude of the wave.", "The distance between a node and antinodes.", "The distance between two adjacent points which are in phase.", "The wavelength of a travelling wave is defined as\ni) The distance between two consecutive peak or crest points or\nii) The distance between two consecutive troughs or\niii) The distance between two adjacent points which are in phase.\n", "d", 0, 1, this.f606b));
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
        this.f607tb = toolbar3;
        setSupportActionBar(toolbar3);
        Boolean valueOf = Boolean.valueOf(getIntent().getExtras().getBoolean("mode"));
        this.mode = valueOf;
        if (valueOf.booleanValue()) {
            new CountDownTimer(TimeUnit.MINUTES.toMillis(120), 1000) {
                public void onTick(long j) {
                    String format = String.format(Locale.ENGLISH, "%02d : %02d : %02d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j)))});
                    physics2009.this.timer.setVisibility(0);
                    physics2009.this.timer.setText(format);
                }

                public void onFinish() {
                    SharedPreferences.Editor editor;
                    SharedPreferences.Editor editor2;
                    physics2009.this.scr.setVisibility(8);
                    physics2009.this.chr.stop();
                    physics2009.this.toolbar.setVisibility(8);
                    physics2009.this.Relative.setBackgroundColor(-7829368);
                    physics2009.this.layout.setVisibility(0);
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2009.this.getBaseContext());
                    int unused = physics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                    int unused2 = physics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                    int unused3 = physics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                    int unused4 = physics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                    int unused5 = physics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                    int unused6 = physics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                    int unused7 = physics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                    int unused8 = physics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                    int unused9 = physics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                    int unused10 = physics2009.this.highscorePhysics2009 = defaultSharedPreferences.getInt("phy2009hs", 0);
                    int access$600 = physics2009.this.part1 + physics2009.this.part2 + physics2009.this.part3 + physics2009.this.part4 + physics2009.this.part5 + physics2009.this.part6 + physics2009.this.part7 + physics2009.this.part8 + physics2009.this.part9;
                    TextView access$1600 = physics2009.this.resultText;
                    access$1600.setText(access$600 + "/50");
                    physics2009.this.progressbar.setProgress(access$600);
                    physics2009.this.progressbar.setMax(50);
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
                    int unused11 = physics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                    int unused12 = physics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                    int unused13 = physics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                    int unused14 = physics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                    int unused15 = physics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                    int unused16 = physics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                    int unused17 = physics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                    int unused18 = physics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                    int unused19 = physics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                    int unused20 = physics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                    int access$1800 = physics2009.this.answered1 + physics2009.this.answered2 + physics2009.this.answered3 + physics2009.this.answered4 + physics2009.this.answered5 + physics2009.this.answered6 + physics2009.this.answered7 + physics2009.this.answered8 + physics2009.this.answered9 + physics2009.this.answered10;
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
                    if (access$600 > physics2009.this.highscorePhysics2009) {
                        edit.putInt("phy2009hs", access$600);
                    }
                    Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                    int i = (access$600 * 100) / 50;
                    DecimalFormat decimalFormat = new DecimalFormat("##.##");
                    String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - ((SystemClock.elapsedRealtime() - physics2009.this.chr.getBase()) / 1000)) * 3600) / 7200))))))).floatValue());
                    String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                    long j = defaultSharedPreferences.getLong("date1phy091", 0);
                    long j2 = defaultSharedPreferences.getLong("date1phy092", 0);
                    long j3 = defaultSharedPreferences.getLong("date1phy093", 0);
                    long j4 = defaultSharedPreferences.getLong("date1phy094", 0);
                    SharedPreferences.Editor editor3 = edit;
                    String str = f2;
                    long j5 = defaultSharedPreferences.getLong("date1phy095", 0);
                    long j6 = defaultSharedPreferences.getLong("date1phy096", 0);
                    long j7 = defaultSharedPreferences.getLong("date1phy097", 0);
                    long j8 = defaultSharedPreferences.getLong("date1phy098", 0);
                    long j9 = defaultSharedPreferences.getLong("date1phy099", 0);
                    long j10 = defaultSharedPreferences.getLong("date1phy0910", 0);
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
                        editor.putString("scorephy091", str);
                        editor.putLong("date1phy091", valueOf.longValue());
                    } else {
                        editor = editor3;
                        String str2 = str;
                        if (date11.compareTo(date2) == 0) {
                            editor.putString("scorephy092", str2);
                            editor.putLong("date1phy092", valueOf.longValue());
                        } else if (date11.compareTo(date3) == 0) {
                            editor.putString("scorephy093", str2);
                            editor.putLong("date1phy093", valueOf.longValue());
                        } else if (date11.compareTo(date4) == 0) {
                            editor.putString("scorephy094", str2);
                            editor.putLong("date1phy094", valueOf.longValue());
                        } else if (date11.compareTo(date5) == 0) {
                            editor.putString("scorephy095", str2);
                            editor.putLong("date1phy095", valueOf.longValue());
                        } else if (date11.compareTo(date6) == 0) {
                            editor.putString("scorephy096", str2);
                            editor.putLong("date1phy096", valueOf.longValue());
                        } else if (date11.compareTo(date7) == 0) {
                            editor.putString("scorephy097", str2);
                            editor.putLong("date1phy097", valueOf.longValue());
                        } else if (date11.compareTo(date8) == 0) {
                            editor.putString("scorephy098", str2);
                            editor.putLong("date1phy098", valueOf.longValue());
                        } else if (date11.compareTo(date9) == 0) {
                            editor.putString("scorephy099", str2);
                            editor.putLong("date1phy099", valueOf.longValue());
                        } else if (date11.compareTo(date10) == 0) {
                            editor.putString("scorephy0910", str2);
                            editor.putLong("date1phy0910", valueOf.longValue());
                        }
                    }
                    long j11 = defaultSharedPreferences.getLong("datephy091", 0);
                    long j12 = defaultSharedPreferences.getLong("datephy092", 0);
                    long j13 = defaultSharedPreferences.getLong("datephy093", 0);
                    long j14 = defaultSharedPreferences.getLong("datephy094", 0);
                    SharedPreferences.Editor editor4 = editor;
                    long j15 = defaultSharedPreferences.getLong("datephy095", 0);
                    long j16 = defaultSharedPreferences.getLong("datephy096", 0);
                    long j17 = defaultSharedPreferences.getLong("datephy097", 0);
                    long j18 = defaultSharedPreferences.getLong("datephy098", 0);
                    long j19 = defaultSharedPreferences.getLong("datephy099", 0);
                    long j20 = defaultSharedPreferences.getLong("datephy0910", 0);
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
                        editor2.putString("iScorephy091", f);
                        editor2.putLong("datephy091", valueOf.longValue());
                    } else {
                        editor2 = editor4;
                        if (date22.compareTo(date13) == 0) {
                            editor2.putString("iScorephy092", f);
                            editor2.putLong("datephy092", valueOf.longValue());
                        } else if (date22.compareTo(date14) == 0) {
                            editor2.putString("iScorephy093", f);
                            editor2.putLong("datephy093", valueOf.longValue());
                        } else if (date22.compareTo(date15) == 0) {
                            editor2.putString("iScorephy094", f);
                            editor2.putLong("datephy094", valueOf.longValue());
                        } else if (date22.compareTo(date16) == 0) {
                            editor2.putString("iScorephy095", f);
                            editor2.putLong("datephy095", valueOf.longValue());
                        } else if (date22.compareTo(date17) == 0) {
                            editor2.putString("iScorephy096", f);
                            editor2.putLong("datephy096", valueOf.longValue());
                        } else if (date22.compareTo(date18) == 0) {
                            editor2.putString("iScorephy097", f);
                            editor2.putLong("datephy097", valueOf.longValue());
                        } else if (date22.compareTo(date19) == 0) {
                            editor2.putString("iScorephy098", f);
                            editor2.putLong("datephy098", valueOf.longValue());
                        } else if (date22.compareTo(date20) == 0) {
                            editor2.putString("iScorephy099", f);
                            editor2.putLong("datephy099", valueOf.longValue());
                        } else if (date22.compareTo(date21) == 0) {
                            editor2.putString("iScorephy0910", f);
                            editor2.putLong("datephy0910", valueOf.longValue());
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
                        physics2009.this.scr.setVisibility(8);
                        physics2009.this.chr.stop();
                        physics2009.this.toolbar.setVisibility(8);
                        physics2009.this.Relative.setBackgroundColor(-7829368);
                        physics2009.this.layout.setVisibility(0);
                        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(physics2009.this.getBaseContext());
                        int unused = physics2009.this.part1 = defaultSharedPreferences.getInt("ans1", 0);
                        int unused2 = physics2009.this.part2 = defaultSharedPreferences.getInt("ans2", 0);
                        int unused3 = physics2009.this.part3 = defaultSharedPreferences.getInt("ans3", 0);
                        int unused4 = physics2009.this.part4 = defaultSharedPreferences.getInt("ans4", 0);
                        int unused5 = physics2009.this.part5 = defaultSharedPreferences.getInt("ans5", 0);
                        int unused6 = physics2009.this.part6 = defaultSharedPreferences.getInt("ans6", 0);
                        int unused7 = physics2009.this.part7 = defaultSharedPreferences.getInt("ans7", 0);
                        int unused8 = physics2009.this.part8 = defaultSharedPreferences.getInt("ans8", 0);
                        int unused9 = physics2009.this.part9 = defaultSharedPreferences.getInt("ans9", 0);
                        int unused10 = physics2009.this.highscorePhysics2009 = defaultSharedPreferences.getInt("phy2009hs", 0);
                        int access$600 = physics2009.this.part1 + physics2009.this.part2 + physics2009.this.part3 + physics2009.this.part4 + physics2009.this.part5 + physics2009.this.part6 + physics2009.this.part7 + physics2009.this.part8 + physics2009.this.part9;
                        TextView access$1600 = physics2009.this.resultText;
                        access$1600.setText(access$600 + "/50");
                        physics2009.this.progressbar.setProgress(access$600);
                        physics2009.this.progressbar.setMax(50);
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
                        int unused11 = physics2009.this.answered1 = defaultSharedPreferences.getInt("answered1", 0);
                        int unused12 = physics2009.this.answered2 = defaultSharedPreferences.getInt("answered2", 0);
                        int unused13 = physics2009.this.answered3 = defaultSharedPreferences.getInt("answered3", 0);
                        int unused14 = physics2009.this.answered4 = defaultSharedPreferences.getInt("answered4", 0);
                        int unused15 = physics2009.this.answered5 = defaultSharedPreferences.getInt("answered5", 0);
                        int unused16 = physics2009.this.answered6 = defaultSharedPreferences.getInt("answered6", 0);
                        int unused17 = physics2009.this.answered7 = defaultSharedPreferences.getInt("answered7", 0);
                        int unused18 = physics2009.this.answered8 = defaultSharedPreferences.getInt("answered8", 0);
                        int unused19 = physics2009.this.answered9 = defaultSharedPreferences.getInt("answered9", 0);
                        int unused20 = physics2009.this.answered10 = defaultSharedPreferences.getInt("answered10", 0);
                        int access$1800 = physics2009.this.answered1 + physics2009.this.answered2 + physics2009.this.answered3 + physics2009.this.answered4 + physics2009.this.answered5 + physics2009.this.answered6 + physics2009.this.answered7 + physics2009.this.answered8 + physics2009.this.answered9 + physics2009.this.answered10;
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
                        if (access$600 > physics2009.this.highscorePhysics2009) {
                            edit.putInt("phy2009hs", access$600);
                        }
                        long elapsedRealtime = (SystemClock.elapsedRealtime() - physics2009.this.chr.getBase()) / 1000;
                        String str = "datephy0910";
                        String str2 = "datephy099";
                        String str3 = "datephy098";
                        String str4 = "datephy097";
                        String str5 = "datephy096";
                        String str6 = "datephy095";
                        String str7 = "datephy094";
                        String str8 = "datephy093";
                        String str9 = "datephy092";
                        String str10 = "datephy091";
                        SharedPreferences.Editor editor5 = edit;
                        String str11 = "date1phy0910";
                        String str12 = "date1phy099";
                        if (physics2009.this.mode.booleanValue()) {
                            Long valueOf = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat = new DecimalFormat("##.##");
                            String f = Float.toString(Float.valueOf(decimalFormat.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i) / ((int) (((7200 - elapsedRealtime) * 3600) / 7200))))))).floatValue());
                            String f2 = Float.toString(Float.valueOf(decimalFormat.format((long) i)).floatValue());
                            long j = defaultSharedPreferences.getLong("date1phy091", 0);
                            String str13 = "date1phy091";
                            String str14 = f;
                            long j2 = defaultSharedPreferences.getLong("date1phy092", 0);
                            Long l = valueOf;
                            String str15 = f2;
                            long j3 = defaultSharedPreferences.getLong("date1phy093", 0);
                            long j4 = defaultSharedPreferences.getLong("date1phy094", 0);
                            long j5 = defaultSharedPreferences.getLong("date1phy095", 0);
                            String str16 = "date1phy095";
                            String str17 = "date1phy094";
                            String str18 = "date1phy096";
                            long j6 = defaultSharedPreferences.getLong("date1phy096", 0);
                            long j7 = defaultSharedPreferences.getLong("date1phy097", 0);
                            String str19 = str12;
                            String str20 = "date1phy098";
                            long j8 = defaultSharedPreferences.getLong(str19, 0);
                            String str21 = str19;
                            String str22 = str11;
                            String str23 = "date1phy097";
                            long j9 = defaultSharedPreferences.getLong(str22, 0);
                            Date date = new Date(j);
                            Date date2 = new Date(j2);
                            Date date3 = new Date(j3);
                            Date date4 = new Date(j4);
                            Date date5 = new Date(j5);
                            String str24 = "date1phy093";
                            SharedPreferences sharedPreferences = defaultSharedPreferences;
                            Date date6 = new Date(j7);
                            Date date7 = new Date(j6);
                            Date date8 = new Date(defaultSharedPreferences.getLong("date1phy098", 0));
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
                                editor3.putString("scorephy091", str15);
                                editor3.putLong(str13, l.longValue());
                            } else {
                                editor3 = editor5;
                                String str25 = str15;
                                if (date12.compareTo(date2) == 0) {
                                    editor3.putString("scorephy092", str25);
                                    editor3.putLong("date1phy092", l.longValue());
                                } else if (date12.compareTo(date3) == 0) {
                                    editor3.putString("scorephy093", str25);
                                    editor3.putLong(str24, l.longValue());
                                } else if (date12.compareTo(date4) == 0) {
                                    editor3.putString("scorephy094", str25);
                                    editor3.putLong(str17, l.longValue());
                                } else if (date12.compareTo(date5) == 0) {
                                    editor3.putString("scorephy095", str25);
                                    editor3.putLong(str16, l.longValue());
                                } else if (date12.compareTo(date11) == 0) {
                                    editor3.putString("scorephy096", str25);
                                    editor3.putLong(str18, l.longValue());
                                } else if (date12.compareTo(date6) == 0) {
                                    editor3.putString("scorephy097", str25);
                                    editor3.putLong(str23, l.longValue());
                                } else if (date12.compareTo(date8) == 0) {
                                    editor3.putString("scorephy098", str25);
                                    editor3.putLong(str20, l.longValue());
                                } else if (date12.compareTo(date9) == 0) {
                                    editor3.putString("scorephy099", str25);
                                    editor3.putLong(str21, l.longValue());
                                } else if (date12.compareTo(date10) == 0) {
                                    editor3.putString("scorephy0910", str25);
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
                                editor4.putString("iScorephy091", str14);
                                editor4.putLong(str26, l.longValue());
                            } else {
                                editor4 = editor6;
                                String str28 = str14;
                                if (date23.compareTo(date14) == 0) {
                                    editor4.putString("iScorephy092", str28);
                                    editor4.putLong(str27, l.longValue());
                                } else if (date23.compareTo(date15) == 0) {
                                    editor4.putString("iScorephy093", str28);
                                    editor4.putLong(str8, l.longValue());
                                } else if (date23.compareTo(date16) == 0) {
                                    editor4.putString("iScorephy094", str28);
                                    editor4.putLong(str7, l.longValue());
                                } else if (date23.compareTo(date17) == 0) {
                                    editor4.putString("iScorephy095", str28);
                                    editor4.putLong(str6, l.longValue());
                                } else if (date23.compareTo(date18) == 0) {
                                    editor4.putString("iScorephy096", str28);
                                    editor4.putLong(str5, l.longValue());
                                } else if (date23.compareTo(date19) == 0) {
                                    editor4.putString("iScorephy097", str28);
                                    editor4.putLong(str4, l.longValue());
                                } else if (date23.compareTo(date20) == 0) {
                                    editor4.putString("iScorephy098", str28);
                                    editor4.putLong(str3, l.longValue());
                                } else if (date23.compareTo(date21) == 0) {
                                    editor4.putString("iScorephy099", str28);
                                    editor4.putLong(str2, l.longValue());
                                } else if (date23.compareTo(date22) == 0) {
                                    editor4.putString("iScorephy0910", str28);
                                    editor4.putLong(str, l.longValue());
                                }
                            }
                            editor = editor4;
                        } else {
                            SharedPreferences sharedPreferences2 = defaultSharedPreferences;
                            String str29 = "date1phy091";
                            String str30 = "date1phy094";
                            String str31 = str12;
                            String str32 = "date1phy093";
                            String str33 = "date1phy097";
                            String str34 = "date1phy096";
                            String str35 = str11;
                            String str36 = "date1phy095";
                            Long valueOf2 = Long.valueOf(new Date(System.currentTimeMillis()).getTime());
                            int i2 = (access$600 * 100) / 50;
                            DecimalFormat decimalFormat2 = new DecimalFormat("##.##");
                            String f3 = Float.toString(Float.valueOf(decimalFormat2.format((double) ((float) Math.sqrt((double) (((access$1800 * access$1800) * i2) / ((int) ((elapsedRealtime * 3600) / 7200))))))).floatValue());
                            String f4 = Float.toString(Float.valueOf(decimalFormat2.format((long) i2)).floatValue());
                            long j20 = sharedPreferences2.getLong(str29, 0);
                            String str37 = str29;
                            String str38 = f4;
                            long j21 = sharedPreferences2.getLong("date1phy092", 0);
                            long j22 = sharedPreferences2.getLong(str32, 0);
                            String str39 = str32;
                            String str40 = f3;
                            long j23 = sharedPreferences2.getLong(str30, 0);
                            String str41 = "date1phy092";
                            String str42 = str30;
                            long j24 = sharedPreferences2.getLong(str36, 0);
                            long j25 = sharedPreferences2.getLong(str34, 0);
                            String str43 = str36;
                            String str44 = str34;
                            String str45 = str33;
                            long j26 = sharedPreferences2.getLong(str33, 0);
                            String str46 = "date1phy098";
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
                                editor2.putString("scorephy091", str38);
                                editor2.putLong(str37, valueOf2.longValue());
                            } else {
                                editor2 = editor5;
                                String str49 = str38;
                                if (date34.compareTo(date25) == 0) {
                                    editor2.putString("scorephy092", str49);
                                    editor2.putLong(str41, valueOf2.longValue());
                                } else if (date34.compareTo(date26) == 0) {
                                    editor2.putString("scorephy093", str49);
                                    editor2.putLong(str39, valueOf2.longValue());
                                } else if (date34.compareTo(date27) == 0) {
                                    editor2.putString("scorephy094", str49);
                                    editor2.putLong(str42, valueOf2.longValue());
                                } else if (date34.compareTo(date28) == 0) {
                                    editor2.putString("scorephy095", str49);
                                    editor2.putLong(str43, valueOf2.longValue());
                                } else if (date34.compareTo(date29) == 0) {
                                    editor2.putString("scorephy096", str49);
                                    editor2.putLong(str44, valueOf2.longValue());
                                } else if (date34.compareTo(date30) == 0) {
                                    editor2.putString("scorephy097", str49);
                                    editor2.putLong(str45, valueOf2.longValue());
                                } else if (date34.compareTo(date31) == 0) {
                                    editor2.putString("scorephy098", str49);
                                    editor2.putLong(str48, valueOf2.longValue());
                                } else if (date34.compareTo(date32) == 0) {
                                    editor2.putString("scorephy099", str49);
                                    editor2.putLong(str47, valueOf2.longValue());
                                } else if (date34.compareTo(date33) == 0) {
                                    editor2.putString("scorephy0910", str49);
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
                                editor.putString("iScorephy091", str40);
                                editor.putLong(str50, l2.longValue());
                            } else {
                                editor = editor7;
                                String str56 = str40;
                                if (date46.compareTo(date36) == 0) {
                                    editor.putString("iScorephy092", str56);
                                    editor.putLong(str9, l2.longValue());
                                } else if (date46.compareTo(date37) == 0) {
                                    editor.putString("iScorephy093", str56);
                                    editor.putLong(str55, l2.longValue());
                                } else if (date46.compareTo(date38) == 0) {
                                    editor.putString("iScorephy094", str56);
                                    editor.putLong(str7, l2.longValue());
                                } else if (date46.compareTo(date39) == 0) {
                                    editor.putString("iScorephy095", str56);
                                    editor.putLong(str53, l2.longValue());
                                } else if (date46.compareTo(date40) == 0) {
                                    editor.putString("iScorephy096", str56);
                                    editor.putLong(str5, l2.longValue());
                                } else if (date46.compareTo(date45) == 0) {
                                    editor.putString("iScorephy097", str56);
                                    editor.putLong(str4, l2.longValue());
                                } else if (date46.compareTo(date42) == 0) {
                                    editor.putString("iScorephy098", str56);
                                    editor.putLong(str3, l2.longValue());
                                } else if (date46.compareTo(date43) == 0) {
                                    editor.putString("iScorephy099", str56);
                                    editor.putLong(str2, l2.longValue());
                                } else if (date46.compareTo(date44) == 0) {
                                    editor.putString("iScorephy0910", str56);
                                    editor.putLong(str54, l2.longValue());
                                }
                            }
                        }
                        editor.commit();
                        physics2009.this.showAd();
                    }
                }.run();
            }
        });
        this.report.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2009.this.scr.setVisibility(8);
                physics2009.this.chr.stop();
                physics2009.this.toolbar.setVisibility(8);
                physics2009.this.Relative.setBackgroundColor(physics2009.this.getResources().getColor(C2719R.C2720color.transparent_black));
                physics2009.this.telegram_layout.setVisibility(0);
            }
        });
        this.actualReport.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2009.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/joinchat/f9CZJT9B7Wk2OGQ0")));
            }
        });
        this.cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                physics2009.this.scr.setVisibility(0);
                physics2009.this.toolbar.setVisibility(0);
                physics2009.this.telegram_layout.setVisibility(8);
                physics2009.this.chr.start();
                physics2009.this.Relative.setBackgroundColor(physics2009.this.getResources().getColor(C2719R.C2720color.white));
            }
        });
    }

    private void LoadAd() {
        InterstitialAd.load(this, "ca-app-pub-3123762277153478/7386221140", new AdRequest.Builder().build(), new InterstitialAdLoadCallback() {
            public void onAdLoaded(InterstitialAd interstitialAd) {
                InterstitialAd unused = physics2009.this.mInterstitialAd = interstitialAd;
            }

            public void onAdFailedToLoad(LoadAdError loadAdError) {
                InterstitialAd unused = physics2009.this.mInterstitialAd = null;
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
                physics2009.this.doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
