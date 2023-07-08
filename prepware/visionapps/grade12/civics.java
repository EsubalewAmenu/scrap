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
import com.visionapps.grade12.Utility.NetworkChangeListener;
import java.util.Random;

public class civics extends AppCompatActivity {
    private Button exam;
    NetworkChangeListener networkChangeListener = new NetworkChangeListener();
    private Button practice;
    ProgressDialog progressDialog;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C2719R.C2724layout.activity_civics);
        this.practice = (Button) findViewById(C2719R.C2722id.practiceCivics);
        this.exam = (Button) findViewById(C2719R.C2722id.examenglish);
        this.practice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(civics.this, chooseyear.class);
                intent.putExtra("subject", "civics");
                civics.this.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(civics.this, new Pair[0]).toBundle());
                civics.this.finish();
            }
        });
        this.exam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                civics.this.progressDialog = new ProgressDialog(civics.this);
                civics.this.progressDialog.show();
                civics.this.progressDialog.setContentView(C2719R.C2724layout.progress_dialog);
                civics.this.progressDialog.getWindow().setBackgroundDrawableResource(17170445);
                new Thread() {
                    public void run() {
                        int nextInt = new Random().nextInt(4);
                        if (nextInt == 0) {
                            try {
                                Intent intent = new Intent(civics.this, civics2009.class);
                                intent.putExtra("mode", true);
                                civics.this.startActivity(intent);
                                sleep(6000);
                                civics.this.progressDialog.dismiss();
                                civics.this.finish();
                                super.run();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (nextInt == 1) {
                            try {
                                Intent intent2 = new Intent(civics.this, civics2010.class);
                                intent2.putExtra("mode", true);
                                civics.this.startActivity(intent2);
                                sleep(6000);
                                civics.this.progressDialog.dismiss();
                                civics.this.finish();
                                super.run();
                            } catch (InterruptedException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (nextInt == 2) {
                            try {
                                Intent intent3 = new Intent(civics.this, civics2011.class);
                                intent3.putExtra("mode", true);
                                civics.this.startActivity(intent3);
                                sleep(6000);
                                civics.this.progressDialog.dismiss();
                                civics.this.finish();
                                super.run();
                            } catch (InterruptedException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (nextInt == 3) {
                            try {
                                Intent intent4 = new Intent(civics.this, civics2012.class);
                                intent4.putExtra("mode", true);
                                civics.this.startActivity(intent4);
                                sleep(6000);
                                civics.this.progressDialog.dismiss();
                                civics.this.finish();
                                super.run();
                            } catch (InterruptedException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (nextInt == 4) {
                            try {
                                Intent intent5 = new Intent(civics.this, civics2013.class);
                                intent5.putExtra("mode", true);
                                civics.this.startActivity(intent5);
                                sleep(6000);
                                civics.this.progressDialog.dismiss();
                                civics.this.finish();
                                super.run();
                            } catch (InterruptedException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                }.start();
            }
        });
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
