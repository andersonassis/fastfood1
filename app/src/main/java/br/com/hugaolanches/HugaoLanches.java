package br.com.hugaolanches;

import android.app.Application;
import com.onesignal.OneSignal;

public class HugaoLanches extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .init();
    }
}
