package com.visionapps.grade12;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private final InstallStateUpdatedListener installStateUpdatedListener = new InstallStateUpdatedListener() {
        public void onStateUpdate(InstallState installState) {
            if (installState.installStatus() == 11) {
                MainActivity.this.showcompletedupdate();
            }
        }
    };
    LottieAnimationView lottie;
    /* access modifiers changed from: private */
    public AppUpdateManager updatemanager;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_main);
        try {
            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
                public void onCancelled(DatabaseError databaseError) {
                }

                public void onDataChange(DataSnapshot dataSnapshot) {
                    String str = ((User) dataSnapshot.getValue(User.class)).pay;
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(MainActivity.this.getBaseContext()).edit();
                    edit.putString("pay", str);
                    edit.commit();
                }
            });
        } catch (Exception unused) {
        }
        this.lottie = (LottieAnimationView) findViewById(C2719R.C2722id.splash_lottie);
        createnotificationchannel();
        final FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
        AppUpdateManager create = AppUpdateManagerFactory.create(this);
        this.updatemanager = create;
        create.getAppUpdateInfo().addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
            public void onSuccess(AppUpdateInfo appUpdateInfo) {
                if (appUpdateInfo.updateAvailability() == 2 && appUpdateInfo.isUpdateTypeAllowed(0)) {
                    try {
                        MainActivity.this.updatemanager.startUpdateFlowForResult(appUpdateInfo, 0, (Activity) MainActivity.this, 100);
                    } catch (IntentSender.SendIntentException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        this.updatemanager.registerListener(this.installStateUpdatedListener);
        new Thread() {
            public void run() {
                if (currentUser != null) {
                    try {
                        Intent intent = new Intent(MainActivity.this, homePage.class);
                        intent.setFlags(268468224);
                        sleep(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                        super.run();
                        MainActivity.this.startActivity(intent);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Intent intent2 = new Intent(MainActivity.this, already.class);
                        sleep(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                        super.run();
                        MainActivity.this.startActivity(intent2);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                    MainActivity.this.finish();
                }
            }
        }.start();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        AppUpdateManager appUpdateManager = this.updatemanager;
        if (appUpdateManager != null) {
            appUpdateManager.unregisterListener(this.installStateUpdatedListener);
        }
        super.onStop();
    }

    /* access modifiers changed from: private */
    public void showcompletedupdate() {
        Snackbar make = Snackbar.make(findViewById(C2719R.C2722id.content), (CharSequence) "New app is ready!", -2);
        make.setAction((CharSequence) "Install", (View.OnClickListener) new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.updatemanager.completeUpdate();
            }
        });
        make.show();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100 && i != -1) {
            Toast.makeText(this, "Cancel", 0).show();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void createnotificationchannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("channel1", "channel 1", 4);
            notificationChannel.setDescription("notify");
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    public void setalarm() {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        String date = Calendar.getInstance().getTime().toString();
        String string = defaultSharedPreferences.getString("lastdate", "");
        String valueOf = String.valueOf(date.toCharArray()[9]);
        if (!valueOf.equals(string)) {
            edit.putString("lastdate", valueOf);
            edit.commit();
            int i = defaultSharedPreferences.getInt(NotificationCompat.CATEGORY_ALARM, 0);
            Calendar instance = Calendar.getInstance();
            instance.set(11, i);
            instance.set(12, 0);
            instance.set(13, 0);
            ((AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM)).setRepeating(0, instance.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(getApplicationContext(), Notreceiver.class), 134217728));
        }
    }
}
