package org.qtproject.example.notification;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;
//import android.app.Application;
import android.content.Intent;

public class Shortcuts  extends org.qtproject.example.notification.IntercomActivity
{

    private static final String USER_ID = "123456";


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        Intercom.client().registerIdentifiedUser(Registration.create().withUserId(USER_ID));
        Intercom.client().displayMessenger();

        Intent intentaction = getIntent();
        if (intentaction.hasExtra("skrot")) {

               NotificationClient.notify("dupa");
            }


    }
}
