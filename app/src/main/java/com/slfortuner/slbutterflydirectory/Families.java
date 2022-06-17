package com.slfortuner.slbutterflydirectory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Families extends AppCompatActivity implements View.OnClickListener {

    private Button fam1;
    private Button fam2;
    private Button fam3;
    private Button fam4;
    private Button fam5;
    private Button fam6;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_families );
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.endColor)));
        Families.this.setTitle("Families");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );


        fam1 = (Button) findViewById( R.id.fam1 );
        fam2 = (Button) findViewById( R.id.fam2 );
        fam3 = (Button) findViewById( R.id.fam3 );
        fam4 = (Button) findViewById( R.id.fam4 );
        fam5 = (Button) findViewById( R.id.fam5 );
        fam6 = (Button) findViewById( R.id.fam6 );



        fam1.setOnClickListener( this );
        fam2.setOnClickListener( this );
        fam3.setOnClickListener( this );
        fam4.setOnClickListener( this );
        fam5.setOnClickListener( this );
        fam6.setOnClickListener( this );








    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fam1:
                startActivity( new Intent( Families.this, Fam1.class ) );
                break;
            case R.id.fam2:
                startActivity( new Intent( Families.this, Fam2.class ) );
                break;
            case R.id.fam3:
                startActivity( new Intent( Families.this, Fam3.class ) );
                break;
            case R.id.fam4:
                startActivity( new Intent( Families.this, Fam4.class ) );
                break;
            case R.id.fam5:
                startActivity( new Intent( Families.this, Fam5.class ) );
                break;
            case R.id.fam6:
                startActivity( new Intent( Families.this, Fam6.class ) );
                break;


        }
    }
}