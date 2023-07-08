package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Settings extends AppCompatActivity {
    RelativeLayout areyousurereset;
    Button choose;
    Button delete;
    Button reset;
    Button resetNo;
    Button resetYes;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_settings);
        this.reset = (Button) findViewById(C2719R.C2722id.resetButton);
        this.resetYes = (Button) findViewById(C2719R.C2722id.resetYes);
        this.resetNo = (Button) findViewById(C2719R.C2722id.ResetNo);
        this.areyousurereset = (RelativeLayout) findViewById(C2719R.C2722id.areyousurereset);
        this.choose = (Button) findViewById(C2719R.C2722id.button2);
        this.delete = (Button) findViewById(C2719R.C2722id.deleteButton);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        final Spinner spinner = (Spinner) findViewById(C2719R.C2722id.spinner2);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.field));
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(arrayAdapter.getPosition(defaultSharedPreferences.getString("field", "")));
        ((Button) findViewById(C2719R.C2722id.button2)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String obj = spinner.getSelectedItem().toString();
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Settings.this.getBaseContext()).edit();
                edit.putString("field", obj);
                edit.commit();
                FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("field").setValue(obj);
                Settings.this.startActivity(new Intent(Settings.this, Settings.class), ActivityOptions.makeSceneTransitionAnimation(Settings.this, new Pair[0]).toBundle());
                Settings.this.finish();
            }
        });
        this.reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Settings.this.areyousurereset.setVisibility(0);
                Settings.this.delete.setEnabled(false);
                Settings.this.delete.setClickable(false);
                Settings.this.reset.setClickable(false);
                Settings.this.reset.setEnabled(false);
                Settings.this.choose.setClickable(false);
                Settings.this.choose.setEnabled(false);
            }
        });
        this.resetYes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(Settings.this.getBaseContext()).edit();
                edit.putInt("bio2009hs", 0);
                edit.putInt("bio2010hs", 0);
                edit.putInt("bio2011hs", 0);
                edit.putInt("bio2012hs", 0);
                edit.putInt("chemistry2009hs", 0);
                edit.putInt("chemistry2010hs", 0);
                edit.putInt("chemistry2011hs", 0);
                edit.putInt("chemistry2012hs", 0);
                edit.putInt("Civics2009hs", 0);
                edit.putInt("Civics2010hs", 0);
                edit.putInt("Civics2011hs", 0);
                edit.putInt("Civics2012hs", 0);
                edit.putInt("Economics2009hs", 0);
                edit.putInt("Economics2010hs", 0);
                edit.putInt("Economics2011hs", 0);
                edit.putInt("Economics2012hs", 0);
                edit.putInt("eng2009hs", 0);
                edit.putInt("eng2010hs", 0);
                edit.putInt("eng2011hs", 0);
                edit.putInt("eng2012hs", 0);
                edit.putInt("Geography2009hs", 0);
                edit.putInt("Geography2010hs", 0);
                edit.putInt("Geography2011hs", 0);
                edit.putInt("Geography2012hs", 0);
                edit.putInt("History2009hs", 0);
                edit.putInt("History2010hs", 0);
                edit.putInt("History2011hs", 0);
                edit.putInt("History2012hs", 0);
                edit.putInt("maths2009hs", 0);
                edit.putInt("maths2010hs", 0);
                edit.putInt("maths2011hs", 0);
                edit.putInt("maths2012hs", 0);
                edit.putInt("physics2009hs", 0);
                edit.putInt("physics2010hs", 0);
                edit.putInt("physics2011hs", 0);
                edit.putInt("physics2012hs", 0);
                edit.putInt("sat2009hs", 0);
                edit.putInt("sat2010hs", 0);
                edit.putInt("sat2011hs", 0);
                edit.putInt("sat2012hs", 0);
                edit.commit();
                Settings.this.areyousurereset.setVisibility(8);
                Toast.makeText(Settings.this, "Your Progress has been reset", 0).show();
            }
        });
        this.resetNo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Settings.this.areyousurereset.setVisibility(8);
                Settings.this.delete.setEnabled(true);
                Settings.this.delete.setClickable(true);
                Settings.this.reset.setClickable(true);
                Settings.this.reset.setEnabled(true);
                Settings.this.choose.setClickable(true);
                Settings.this.choose.setEnabled(true);
            }
        });
        this.delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Settings.this.startActivity(new Intent(Settings.this, deleteAccount.class), ActivityOptions.makeSceneTransitionAnimation(Settings.this, new Pair[0]).toBundle());
            }
        });
    }

    public void onBackPressed() {
        startActivity(new Intent(this, homePage.class), ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle());
        finish();
    }
}
