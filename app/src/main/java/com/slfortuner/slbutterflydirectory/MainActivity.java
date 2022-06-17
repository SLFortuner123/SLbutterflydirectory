package com.slfortuner.slbutterflydirectory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import hotchemi.android.rate.AppRate;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSimpleTabs;
    private Button btnSimpleTabs2;
    private Button btnSimpleTabs3;
    ImageButton about_us;
    ImageButton notification;
    private long backPressedTime;
    private Toast backToast;


    //////////////////////////////////////////////////////////////////double press exit//////////////////////////////////////////
    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        AppRate.with(this)
                .setInstallDays(2) // default 10, 0 means install day.
                .setLaunchTimes(3) // default 10
                .setRemindInterval(2)// default 1
                .monitor();
        AppRate.showRateDialogIfMeetsConditions( this );

        notification=(ImageButton) findViewById( R.id.notification );
        notification.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this, Firebase_Notification.class ) );
            }
        } );

        about_us = (ImageButton)findViewById( R.id.about_us );
        about_us.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent( MainActivity.this, InfoTab.class ) );
            }
        } );


        btnSimpleTabs = (Button) findViewById( R.id.btnSimpleTabs );
        btnSimpleTabs2 = (Button) findViewById( R.id.btnSimpleTabs2 );
        btnSimpleTabs3 = (Button) findViewById( R.id.btnSimpleTabs3 );

        btnSimpleTabs3.setOnClickListener( this );

        btnSimpleTabs2.setOnClickListener( this );

        btnSimpleTabs.setOnClickListener( this );


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSimpleTabs:
                startActivity( new Intent( MainActivity.this, MainActivity2.class ) );
                                    break;
            case R.id.btnSimpleTabs2:
                startActivity( new Intent( MainActivity.this, Families.class ) );
                break;
            case R.id.btnSimpleTabs3:
                startActivity( new Intent( MainActivity.this, Firebase.class ) );
                break;


        }
    }
}