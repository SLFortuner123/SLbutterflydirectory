package com.slfortuner.slbutterflydirectory;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;
import java.util.Random;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyFirebaseMessagingServices extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(@Nullable RemoteMessage remoteMessage) {
        super.onMessageReceived( remoteMessage );

        if (remoteMessage.getData().isEmpty()) {
            showNotification( remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody() );
        }else {
            showNotification( remoteMessage.getData() );
        }
    }

    private void showNotification(Map<String, String>data) {
        String title = data.get( "title" );
        String body = data.get( "body" );

        NotificationManager notificationManager = (NotificationManager)getSystemService( Context.NOTIFICATION_SERVICE );
        String NOTIFICATION_CHANNEL_ID = "slfortuner.slbutterflydirectory.test";

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            NotificationChannel notificationChannel = new NotificationChannel( NOTIFICATION_CHANNEL_ID, "Notification", NotificationManager.IMPORTANCE_DEFAULT );
            notificationChannel.setDescription( "code sphere" );
            notificationChannel.enableLights( true );
            notificationChannel.setLightColor( Color.GREEN );
            notificationChannel.enableLights( true );
            notificationManager.createNotificationChannel( notificationChannel );
        }
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder( this, NOTIFICATION_CHANNEL_ID );
        notificationBuilder.setAutoCancel( true )
                .setDefaults( Notification.DEFAULT_ALL )
                .setWhen( System.currentTimeMillis() )
                .setSmallIcon( R.drawable.butterfly_notifi_white )
                .setContentTitle( title )
                .setContentText( body)
                .setContentInfo( "info" );

        notificationManager.notify( new Random() .nextInt(), notificationBuilder.build() );

    }
    private void showNotification(String title, String body){

        NotificationManager notificationManager = (NotificationManager)getSystemService( Context.NOTIFICATION_SERVICE );
        String NOTIFICATION_CHANNEL_ID = "slfortuner.slbutterflydirectory.test";

        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            NotificationChannel notificationChannel = new NotificationChannel( NOTIFICATION_CHANNEL_ID, "Notification", NotificationManager.IMPORTANCE_DEFAULT );
            notificationChannel.setDescription( "code sphere" );
            notificationChannel.enableLights( true );
            notificationChannel.setLightColor( Color.GREEN );
            notificationChannel.enableLights( true );
            notificationManager.createNotificationChannel( notificationChannel );
        }
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder( this, NOTIFICATION_CHANNEL_ID );
        notificationBuilder.setAutoCancel( true )
                .setDefaults( Notification.DEFAULT_ALL )
                .setWhen( System.currentTimeMillis() )
                .setSmallIcon( R.drawable.butterfly_notifi_white )
                .setContentTitle( title )
                .setContentText( body)
                .setContentInfo( "info" );

        notificationManager.notify( new Random() .nextInt(), notificationBuilder.build() );

    }

    @Override
    public void onNewToken(String s) {
        super.onNewToken( s );

        Log.d ("TOKENFIREBASE", s);
    }
}
