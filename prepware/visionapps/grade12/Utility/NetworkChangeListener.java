package com.visionapps.grade12.Utility;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.common.ConnectionResult;
import com.visionapps.grade12.C2719R;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class NetworkChangeListener extends BroadcastReceiver {

    /* renamed from: b */
    public boolean f476b;
    ProgressDialog progressDialog;

    public void onReceive(Context context, Intent intent) {
        new CheckInternetAsyncTask(context).execute(new Void[0]);
    }

    public class CheckInternetAsyncTask extends AsyncTask<Void, Integer, Boolean> {
        /* access modifiers changed from: private */
        public Context mcontext;

        public CheckInternetAsyncTask(Context context) {
            this.mcontext = context;
        }

        public Boolean doInBackground(Void... voidArr) {
            try {
                Socket socket = new Socket();
                socket.connect(new InetSocketAddress("8.8.8.8", 53), ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                socket.close();
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NetworkChangeListener.this.f476b = bool.booleanValue();
            try {
                if (!NetworkChangeListener.this.f476b) {
                    View inflate = LayoutInflater.from(this.mcontext).inflate(C2719R.C2724layout.check_internet_dialog, (ViewGroup) null);
                    final AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(C2719R.C2722id.btnRetry);
                    appCompatButton.setText("Retry");
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.mcontext);
                    builder.setView(inflate);
                    final AlertDialog create = builder.create();
                    if (!create.isShowing()) {
                        create.show();
                    }
                    create.setCancelable(false);
                    create.getWindow().setGravity(17);
                    appCompatButton.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            new CheckInternetAsyncTask(CheckInternetAsyncTask.this.mcontext).execute(new Void[0]);
                            appCompatButton.setText("Reconnecting...");
                            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                                public void run() {
                                    create.dismiss();
                                }
                            }, 1000);
                        }
                    });
                }
            } catch (WindowManager.BadTokenException unused) {
                Toast.makeText(this.mcontext, "Oops, something went wrong, Please try again.", 0).show();
            }
            Log.d("TAG", "result " + bool);
        }

        /* access modifiers changed from: protected */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
        }
    }
}
