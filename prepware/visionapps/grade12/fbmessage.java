package com.visionapps.grade12;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class fbmessage extends FirebaseMessagingService {
    public static final String tag = "fbmessage";

    public void onNewToken(String str) {
        super.onNewToken(str);
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        try {
            if (remoteMessage.getNotification() != null) {
                show(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public void show(String str, String str2) {
        try {
            ((NotificationManager) getApplicationContext().getSystemService("notification")).notify(1, new NotificationCompat.Builder(getApplicationContext(), "channel1").setContentText(str).setContentText(str2).setAutoCancel(true).setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, new Intent(this, MainActivity.class), 134217728)).build());
        } catch (IllegalArgumentException unused) {
        }
    }
}
