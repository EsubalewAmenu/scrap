package com.visionapps.grade12;

import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import p013io.reactivex.Single;
import p013io.reactivex.android.schedulers.AndroidSchedulers;
import p013io.reactivex.schedulers.Schedulers;

/* renamed from: com.visionapps.grade12.rx */
public class C3329rx {
    public static Single<Boolean> hasInternetConnection() {
        return Single.fromCallable(rx$$ExternalSyntheticLambda0.INSTANCE).subscribeOn(Schedulers.m377io()).observeOn(AndroidSchedulers.mainThread());
    }

    static /* synthetic */ Boolean lambda$hasInternetConnection$0() throws Exception {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress("8.8.8.8", 53), ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            socket.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
