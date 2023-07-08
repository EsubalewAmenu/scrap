package com.visionapps.grade12.Utility;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.IOException;

public class Common {
    public static boolean isConnectedTOInternet(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || connectivityManager.getAllNetworkInfo() == null) {
            return false;
        }
        try {
            if (Runtime.getRuntime().exec("/system/bin/ping -c 1 8.8.8.8").waitFor() == 0) {
                return true;
            }
            return false;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return true;
        }
    }
}
