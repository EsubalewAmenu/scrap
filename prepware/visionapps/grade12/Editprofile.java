package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

public class Editprofile extends AppCompatActivity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_editprofile);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String string = defaultSharedPreferences.getString(AppMeasurementSdk.ConditionalUserProperty.NAME, "");
        String string2 = defaultSharedPreferences.getString("email", "");
        String string3 = defaultSharedPreferences.getString("school", "");
        String string4 = defaultSharedPreferences.getString("time", "");
        String string5 = defaultSharedPreferences.getString("field", "");
        ((TextView) findViewById(C2719R.C2722id.textView23)).setText(string);
        ((TextView) findViewById(C2719R.C2722id.textView25)).setText(string3);
        ((TextView) findViewById(C2719R.C2722id.textView27)).setText(string4 + " : 00");
        ((TextView) findViewById(C2719R.C2722id.textView29)).setText(string2);
        ((TextView) findViewById(C2719R.C2722id.textView31)).setText(string5);
    }

    public void edit(View view) {
        startActivity(new Intent(this, Editpage.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        finish();
    }

    public void onBackPressed() {
        startActivity(new Intent(this, homePage.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        finish();
    }
}
