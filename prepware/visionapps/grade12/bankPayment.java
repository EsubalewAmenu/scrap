package com.visionapps.grade12;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.UploadTask;

public class bankPayment extends AppCompatActivity {
    /* access modifiers changed from: private */
    public TextView check;
    private Button chooseFile;
    private Button iPaid;
    ImageView imageUpload;
    public Uri imguri;
    StorageReference mStorageRef;
    /* access modifiers changed from: private */
    public EditText payersName;
    /* access modifiers changed from: private */
    public EditText payersNumber;
    private ProgressBar progressBar;
    /* access modifiers changed from: private */
    public StorageTask uploadTask;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_bank_payment);
        Spinner spinner = (Spinner) findViewById(C2719R.C2722id.bankSpinner);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367043, getResources().getStringArray(C2719R.array.bank));
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter(arrayAdapter);
        this.progressBar = (ProgressBar) findViewById(C2719R.C2722id.progressBarPay);
        this.mStorageRef = FirebaseStorage.getInstance().getReference("Images");
        this.imageUpload = (ImageView) findViewById(C2719R.C2722id.uploadPhoto);
        this.chooseFile = (Button) findViewById(C2719R.C2722id.chooseFile);
        this.check = (TextView) findViewById(C2719R.C2722id.check);
        this.payersName = (EditText) findViewById(C2719R.C2722id.payersName);
        this.payersNumber = (EditText) findViewById(C2719R.C2722id.payersNumber);
        this.iPaid = (Button) findViewById(C2719R.C2722id.iPaid);
        final String obj = spinner.getSelectedItem().toString();
        this.chooseFile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bankPayment.this.Filechooser();
            }
        });
        this.iPaid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String obj = bankPayment.this.payersName.getText().toString();
                String obj2 = bankPayment.this.payersNumber.getText().toString();
                String str = obj;
                DatabaseReference child = FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("bank");
                child.setValue(str + " , " + obj + " , " + obj2);
                if (bankPayment.this.uploadTask != null && bankPayment.this.uploadTask.isInProgress()) {
                    Toast.makeText(bankPayment.this, "Upload in progress", 1).show();
                } else if (bankPayment.this.imguri == null) {
                    Toast.makeText(bankPayment.this, "choose photo", 0).show();
                } else {
                    bankPayment.this.Fileuploader();
                }
                bankPayment.this.check.setVisibility(0);
            }
        });
    }

    private String getExtension(Uri uri) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(getContentResolver().getType(uri));
    }

    /* access modifiers changed from: private */
    public void Fileuploader() {
        StorageReference storageReference = this.mStorageRef;
        this.uploadTask = storageReference.child(System.currentTimeMillis() + "," + getExtension(this.imguri)).putFile(this.imguri).addOnSuccessListener((OnSuccessListener) new OnSuccessListener<UploadTask.TaskSnapshot>() {
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                Toast.makeText(bankPayment.this, "Image uploaded successfully", 1).show();
            }
        }).addOnFailureListener((OnFailureListener) new OnFailureListener() {
            public void onFailure(Exception exc) {
                Toast.makeText(bankPayment.this, "Image was unable to upload, Please try again", 1).show();
            }
        });
    }

    /* access modifiers changed from: private */
    public void Filechooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1 || i2 != -1 || intent == null || intent.getData() == null) {
            Toast.makeText(this, "fhaskj", 0).show();
            return;
        }
        Uri data = intent.getData();
        this.imguri = data;
        this.imageUpload.setImageURI(data);
    }
}
