package com.visionapps.grade12;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class Notreceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            NotificationManagerCompat.from(context).notify(1, new NotificationCompat.Builder(context, "channel1").setSmallIcon((int) C2719R.C2721drawable.ic_baseline_school_24).setContentTitle("Grade 12 Matric Prepware").setContentText("It's time for you to Study!").setAutoCancel(true).setContentIntent(PendingIntent.getActivity(context, 0, new Intent(context, MainActivity.class), 134217728)).setPriority(1).build());
        } catch (RuntimeException unused) {
            Toast.makeText(context, "Oops, something went wrong!", 0).show();
        }
    }
}
