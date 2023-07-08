package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import java.util.Calendar;

public class nameact extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_nameact);
        PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.time));
        arrayAdapter.setDropDownViewResource(17367049);
        ((Spinner) findViewById(C2719R.C2722id.spinner3)).setAdapter(arrayAdapter);
    }

    public void notify(View view) {
        String obj = ((Spinner) findViewById(C2719R.C2722id.spinner3)).getSelectedItem().toString();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        edit.putInt(NotificationCompat.CATEGORY_ALARM, Integer.parseInt(obj));
        edit.putString("time", obj);
        edit.commit();
        int i = defaultSharedPreferences.getInt(NotificationCompat.CATEGORY_ALARM, 0);
        Calendar instance = Calendar.getInstance();
        instance.set(11, i);
        instance.set(12, 0);
        instance.set(13, 0);
        try {
            ((AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM)).setRepeating(0, instance.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(getApplicationContext(), 0, new Intent(getApplicationContext(), Notreceiver.class), 134217728));
        } catch (Exception unused) {
            Toast.makeText(this, "Oops, something went wrong, please try again!", 0).show();
        }
        startActivity(new Intent(this, homePage.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        finish();
    }
}
