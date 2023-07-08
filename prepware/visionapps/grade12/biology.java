package com.visionapps.grade12;

import android.app.ActivityOptions;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdRequest;
import com.visionapps.grade12.Utility.NetworkChangeListener;
import java.util.Random;

public class biology extends AppCompatActivity {
    private Button exam;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private Button practice;
    ProgressDialog progressDialog;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_biology);
        this.practice = (Button) findViewById(C2719R.C2722id.practiceBio);
        this.exam = (Button) findViewById(C2719R.C2722id.examBio);
        new AdRequest.Builder().build();
        this.practice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(biology.this, chooseyear.class);
                intent.putExtra("subject", "biology");
                biology.this.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(biology.this, new Pair[0]).toBundle());
                biology.this.finish();
            }
        });
        this.exam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                biology.this.progressDialog = new ProgressDialog(biology.this);
                biology.this.progressDialog.show();
                biology.this.progressDialog.setContentView(C2719R.C2724layout.progress_dialog);
                biology.this.progressDialog.getWindow().setBackgroundDrawableResource(17170445);
                new Thread() {
                    public void run() {
                        int nextInt = new Random().nextInt(5);
                        if (nextInt == 0) {
                            try {
                                Intent intent = new Intent(biology.this, bio2012.class);
                                intent.putExtra("mode", true);
                                biology.this.startActivity(intent);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (nextInt == 1) {
                            try {
                                Intent intent2 = new Intent(biology.this, bio2013.class);
                                intent2.putExtra("mode", true);
                                biology.this.startActivity(intent2);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (nextInt == 2) {
                            try {
                                Intent intent3 = new Intent(biology.this, Bio2008.class);
                                intent3.putExtra("mode", true);
                                biology.this.startActivity(intent3);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (nextInt == 3) {
                            try {
                                Intent intent4 = new Intent(biology.this, bio2009.class);
                                intent4.putExtra("mode", true);
                                biology.this.startActivity(intent4);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (nextInt == 4) {
                            try {
                                Intent intent5 = new Intent(biology.this, bio2010.class);
                                intent5.putExtra("mode", true);
                                biology.this.startActivity(intent5);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (nextInt == 5) {
                            try {
                                Intent intent6 = new Intent(biology.this, bio2011.class);
                                intent6.putExtra("mode", true);
                                biology.this.startActivity(intent6);
                                sleep(6000);
                                biology.this.progressDialog.dismiss();
                                biology.this.finish();
                                super.run();
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                    }
                }.start();
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            registerReceiver(this.networkChangeListener, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        if (PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("pay", "unpaid").equals("unpaid")) {
            unregisterReceiver(this.networkChangeListener);
        }
        super.onStop();
    }
}
