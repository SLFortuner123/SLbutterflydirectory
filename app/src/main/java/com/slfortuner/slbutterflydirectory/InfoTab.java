package com.slfortuner.slbutterflydirectory;

import androidx.appcompat.app.AppCompatActivity;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import java.util.Calendar;

public class InfoTab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );

        mehdi.sakout.aboutpage.Element adsElement = new Element();
        adsElement.setTitle( "Sri Lanka Butterfly Directory provides easy and offline access to discover and identify all butterfly species in Sri Lanka. \n\nThe butterflies are categorized according to their families for quick search. A platform has been created where you can record your own butterfly observations. \n\nMore features and options will be available through future updates. \n\nSLFortuner would like to express gratitude to the following digital platforms and individuals for their knowledge, resources, and guidance.\n\n" +
                "• www.slbutterflies.lk\n" +
                "• www.ifoundbutterflies.org\n" +
                "• www.dilmahconservation.org\n" +
                "• www.biodiversityofsrilanka.blogspot.com\n" +
                "\n" +
                "• Mr. Himesh Dilruwan \n" +
                "• Mr. Medhisha Gunawardena\n" +
                "• Mr. Eranda Mandawala ");

        View aboutPage = new AboutPage( this )
                .isRTL( false )
                .setImage(  R.drawable.presentation1 )
                .addItem( new Element(  ).setTitle( "Version 1.0" ))
                .setDescription( "SRI LANKA BUTTERFLY DIRECTORY")
                .addItem( adsElement )
                .addGroup( "Contact with us" )
                .addEmail( "slbutterflyd@gmail.com" )
                .addFacebook( "Sri-Lanka-Butterfly-Directory-111227710668014" )
                .addYoutube( "UCjpmLRiZ6eS-WOttp_kPOZQ" )
                .addPlayStore( "SL Butterfly Directory" )
                .addItem(createCopyright() )
                .create();

        setContentView( aboutPage );
                
    }

    private Element createCopyright() {
        Element copyright = new Element(  );
        final String copyrightString = String.format( "Copyright %d by SLFortuner", Calendar.getInstance().get(Calendar.YEAR) );
        copyright.setTitle( copyrightString );
        copyright.setIconDrawable( R.mipmap.ic_launcher );
        copyright.setGravity( Gravity.CENTER );
        copyright.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText( InfoTab.this, copyrightString, Toast.LENGTH_SHORT).show();
            }
        } );
        return copyright;
    }
}