package com.visionapps.grade12;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class mobileBanking extends AppCompatActivity {
    /* access modifiers changed from: private */
    public TextView check1;
    private Button iPaid1;
    /* access modifiers changed from: private */
    public EditText name;
    /* access modifiers changed from: private */
    public EditText phoneNumber;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_mobile_banking);
        Spinner spinner = (Spinner) findViewById(C2719R.C2722id.mobileSpinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.mobileBanking));
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        this.name = (EditText) findViewById(C2719R.C2722id.mobileName);
        this.phoneNumber = (EditText) findViewById(C2719R.C2722id.mobileNumber);
        this.check1 = (TextView) findViewById(C2719R.C2722id.check1);
        this.iPaid1 = (Button) findViewById(C2719R.C2722id.iPaid1);
        final String obj = spinner.getSelectedItem().toString();
        this.iPaid1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String obj = mobileBanking.this.name.getText().toString();
                String obj2 = mobileBanking.this.phoneNumber.getText().toString();
                String str = obj;
                DatabaseReference child = FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("mobileBanking");
                child.setValue(str + " , " + obj + " , " + obj2);
                mobileBanking.this.check1.setVisibility(0);
            }
        });
    }
}
