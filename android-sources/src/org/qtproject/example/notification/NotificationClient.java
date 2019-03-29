/****************************************************************************
**
** Copyright (C) 2016 The Qt Company Ltd.
** Contact: https://www.qt.io/licensing/
**
** This file is part of the QtAndroidExtras module of the Qt Toolkit.
**
** $QT_BEGIN_LICENSE:BSD$
** Commercial License Usage
** Licensees holding valid commercial Qt licenses may use this file in
** accordance with the commercial license agreement provided with the
** Software or, alternatively, in accordance with the terms contained in
** a written agreement between you and The Qt Company. For licensing terms
** and conditions see https://www.qt.io/terms-conditions. For further
** information use the contact form at https://www.qt.io/contact-us.
**
** BSD License Usage
** Alternatively, you may use this file under the terms of the BSD license
** as follows:
**
** "Redistribution and use in source and binary forms, with or without
** modification, are permitted provided that the following conditions are
** met:
**   * Redistributions of source code must retain the above copyright
**     notice, this list of conditions and the following disclaimer.
**   * Redistributions in binary form must reproduce the above copyright
**     notice, this list of conditions and the following disclaimer in
**     the documentation and/or other materials provided with the
**     distribution.
**   * Neither the name of The Qt Company Ltd nor the names of its
**     contributors may be used to endorse or promote products derived
**     from this software without specific prior written permission.
**
**
** THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
** "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
** LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
** A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
** OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
** SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
** LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
** DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
** THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
** (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
** OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE."
**
** $QT_END_LICENSE$
**
****************************************************************************/

package org.qtproject.example.notification;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.support.v4.app.NotificationCompat;
//import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
import android.support.annotation.RequiresApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;

import io.intercom.android.sdk.Intercom;
import io.intercom.android.sdk.identity.Registration;

//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Switch;
//import android.widget.Toast;
//import android.app.PendingIntent;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.graphics.BitmapFactory;

public class NotificationClient extends org.qtproject.qt5.android.bindings.QtActivity
{
    private static NotificationManager m_notificationManager;
    private static Notification.Builder m_builder;
    private static NotificationClient m_instance;

    public NotificationClient()
    {
        m_instance = this;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void notify(String s)
    {
        NotificationManager m_notificationManager = (NotificationManager) m_instance.getSystemService(Context.NOTIFICATION_SERVICE);
        String NOTIFICATION_CHANNEL_ID = "tutorialspoint_01";
        //if (m_notificationManager == null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                     @SuppressLint("WrongConstant") NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "My Notifications", NotificationManager.IMPORTANCE_MAX);
                     // Configure the notification channel.
                     notificationChannel.setDescription("Sample Channel description");
                     notificationChannel.enableLights(true);
                     notificationChannel.setLightColor(Color.RED);
                     notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
                     notificationChannel.enableVibration(true);
                     m_notificationManager.createNotificationChannel(notificationChannel);
                  }
                  NotificationCompat.Builder m_builder = new NotificationCompat.Builder(m_instance, NOTIFICATION_CHANNEL_ID);
                  m_builder.setAutoCancel(true)
                     .setDefaults(Notification.DEFAULT_ALL)
                     .setWhen(System.currentTimeMillis())
                     .setSmallIcon(R.drawable.icon)
                     .setTicker("Tutorialspoint")
                     .setPriority(Notification.PRIORITY_MAX)
                     .setContentTitle("Moja Notyfikacja")
                     .setContentText(s)
                     .setContentInfo("Informacja z notyfikacji");
                   m_notificationManager.notify(1, m_builder.build());

        //}

        //m_builder.setContentText(s);
        //m_notificationManager.notify(1, m_builder.build());
    }
}
