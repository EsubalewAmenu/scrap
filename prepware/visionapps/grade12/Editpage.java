package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.visionapps.grade12.Utility.NetworkChangeListener;
import java.util.Calendar;

public class Editpage extends AppCompatActivity {
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_editpage);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String string = defaultSharedPreferences.getString("time", "");
        final Spinner spinner = (Spinner) findViewById(C2719R.C2722id.spinner2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.field));
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        final Spinner spinner2 = (Spinner) findViewById(C2719R.C2722id.spinner8);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.time));
        arrayAdapter2.setDropDownViewResource(17367049);
        spinner2.setAdapter(arrayAdapter2);
        spinner2.setSelection(arrayAdapter2.getPosition(string));
        String string2 = defaultSharedPreferences.getString(AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        String string3 = defaultSharedPreferences.getString("school", "");
        spinner.setSelection(arrayAdapter2.getPosition(defaultSharedPreferences.getString("field", "")));
        ((TextView) findViewById(C2719R.C2722id.textView23)).setText(string2);
        ((TextView) findViewById(C2719R.C2722id.textView25)).setText(string3);
        ((Button) findViewById(C2719R.C2722id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String charSequence = ((TextView) Editpage.this.findViewById(C2719R.C2722id.textView23)).getText().toString();
                String charSequence2 = ((TextView) Editpage.this.findViewById(C2719R.C2722id.textView25)).getText().toString();
                String obj = spinner2.getSelectedItem().toString();
                String obj2 = spinner.getSelectedItem().toString();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(Editpage.this.getBaseContext());
                SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                edit.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, charSequence);
                edit.putString("field", obj2);
                edit.putString("school", charSequence2);
                edit.putInt(NotificationCompat.CATEGORY_ALARM, Integer.parseInt(obj));
                edit.putString("time", obj);
                edit.commit();
                int i = defaultSharedPreferences.getInt(NotificationCompat.CATEGORY_ALARM, 0);
                Calendar instance = Calendar.getInstance();
                instance.set(11, i);
                instance.set(12, 0);
                instance.set(13, 0);
                ((AlarmManager) Editpage.this.getSystemService(NotificationCompat.CATEGORY_ALARM)).setRepeating(0, instance.getTimeInMillis(), 86400000, PendingIntent.getBroadcast(Editpage.this.getApplicationContext(), 0, new Intent(Editpage.this.getApplicationContext(), Notreceiver.class), 134217728));
                FirebaseUser currentUser = FirebaseAuth.getInstance().getCurrentUser();
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Users");
                String uid = currentUser.getUid();
                reference.child(uid).child("fname").setValue(charSequence);
                reference.child(uid).child("schoolname").setValue(charSequence2);
                reference.child(uid).child("field").setValue(obj2);
                Editpage.this.startActivity(new Intent(Editpage.this, Editprofile.class));
                Editpage.this.finish();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        super.onStart();
    }

    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, Editprofile.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        unregisterReceiver(this.networkChangeListener);
        super.onStop();
    }
}
