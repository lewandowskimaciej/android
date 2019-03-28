package org.qtproject.example.notification;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;
import android.content.Intent;

public class IntercomActivity extends org.qtproject.qt5.android.bindings.QtActivity
{

    private static final String USER_ID = "123456";

        @Override
        public void onCreate(Bundle icicle) {
            super.onCreate(icicle);
            //setContentView(R.layout.activity_main);
            //Enable default launcher
            Intent intentaction = getIntent();
            if (intentaction.hasExtra("key") || intentaction.hasExtra("skrot")) {

                   Intercom.client().setLauncherVisibility(Intercom.Visibility.VISIBLE);
                   Intercom.client().registerIdentifiedUser(Registration.create().withUserId(USER_ID));
                   NotificationClient.notify("weszło ze skrótu");
                }
            //Register a user with Intercom

            //Custom launcher
            //Intercom.client().displayMessenger();






        }

}
