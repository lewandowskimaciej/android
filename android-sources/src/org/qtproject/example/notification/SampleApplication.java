package org.qtproject.example.notification;

import android.app.Application;
import io.intercom.android.sdk.Intercom;

public class SampleApplication extends org.qtproject.qt5.android.bindings.QtApplication {
    //----------------------------------------------------------------------------------------------
        // You need to enter your API key and app ID here to use Intercom for Android
        // To get these keys go to https://app.intercom.com/a/apps/_/settings/android and follow the step-up guide
        //----------------------------------------------------------------------------------------------
        static final String YOUR_API_KEY = "android_sdk-dce75cd2e49502cec0c275ea92e672e8f275967b";
        static final String YOUR_APP_ID = "twem4gqf";

        @Override public void onCreate() {
            super.onCreate();

            Intercom.initialize(this, YOUR_API_KEY, YOUR_APP_ID);

        }

    }
