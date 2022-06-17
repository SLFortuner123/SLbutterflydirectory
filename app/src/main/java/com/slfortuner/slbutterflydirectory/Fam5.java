package com.slfortuner.slbutterflydirectory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class Fam5 extends AppCompatActivity {

    ListView fam5ListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam5 );
        Fam5.this.setTitle("Pieridae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf5 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );

        fam5ListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B36  = new Butterfly(	"Chocolate Albatross",		"Appias lyncida taprobana",	 "drawable://" + R.drawable.chocolate_albatross);
        Butterfly B42  = new Butterfly(	"Common Albatross",		"Appias albina swinhoei",	 "drawable://" + R.drawable.common_albatross_male);
        Butterfly B54  = new Butterfly(	"Common Grass Yellow",		"Eurema hecabe hecabe",	 "drawable://" + R.drawable.common_grass_yellow);
        Butterfly B56  = new Butterfly(	"Common Gull",		"Cepora nerissa phryne ",	 "drawable://" + R.drawable.common_gull);
        Butterfly B79  = new Butterfly(	"Crimson Tip",		"Colotis danae danae",	 "drawable://" + R.drawable.crimson_tip);
        Butterfly B88  = new Butterfly(	"Dark Wanderer",		"Pareronia ceylanica ceylanica",	 "drawable://" + R.drawable.dark_wanderer);
        Butterfly B104  = new Butterfly(	"Great Orange Tip",		"Hebomoia glaucippe ceylonica",	 "drawable://" + R.drawable.great_orange_tip);
        Butterfly B110  = new Butterfly(	"Jezebel",		"Delias eucharis",	 "drawable://" + R.drawable.jezebel);
        Butterfly B117  = new Butterfly(	"Large Salmon Arab",		"Colotis fausta fulvia",	 "drawable://" + R.drawable.large_salmon_arab);
        Butterfly B118  = new Butterfly(	"Lemon Emigrant",		"Catopsilia pomona",	 "drawable://" + R.drawable.lemon_emigrant);
        Butterfly B121  = new Butterfly(	"Lesser Gull",		"Cepora nadina cingala",	 "drawable://" + R.drawable.lesser_gull);
        Butterfly B125  = new Butterfly(	"Little Orange Tip",		"Colotis etrida limbata",	 "drawable://" + R.drawable.little_orange_tip);
        Butterfly B133  = new Butterfly(	"Mottled Emigrant",		"Catopsilia pyranthe pyranthe",	 "drawable://" + R.drawable.mottled_emigrant);
        Butterfly B137  = new Butterfly(	"Orange Migrant",		"Catopsilia scylla",	 "drawable://" + R.drawable.orange_emigrant);
        Butterfly B143  = new Butterfly(	"Painted Sawtooth",		"Prioneris sita",	 "drawable://" + R.drawable.painted_sawtooth);
        Butterfly B151  = new Butterfly(	"Pioneer",		"Belenois aurota taprobana",	 "drawable://" + R.drawable.pioneer);
        Butterfly B153  = new Butterfly(	"Plain Orange Tip",		"Colotis aurora",	 "drawable://" + R.drawable.plain_orange_tip);
        Butterfly B154  = new Butterfly(	"Plain Puffin",		"Appias indra narendra",	 "drawable://" + R.drawable.plain_puffin);
        Butterfly B163  = new Butterfly(	"Psyche",		"Leptosia nina nina",	 "drawable://" + R.drawable.psyche);
        Butterfly B183  = new Butterfly(	"Small Grass Yellow",		"Eurema brigitta rubella",	 "drawable://" + R.drawable.small_grass_yellow);
        Butterfly B186  = new Butterfly(	"Small Salmon Arab",		"Colotis amata modesta",	 "drawable://" + R.drawable.small_salmon_arab);
        Butterfly B190  = new Butterfly(	"Spotless Grass Yellow",		"Eurema laeta rama",	 "drawable://" + R.drawable.spotless_grass_yellow);
        Butterfly B206  = new Butterfly(	"Sri Lankan Lesser Albatross",		"Appias galene",	 "drawable://" + R.drawable.srilankan_lesser_albatross);
        Butterfly B209  = new Butterfly(	"Sri Lankan One-spot Grass Yellow",		"Eurema ormistoni",	 "drawable://" + R.drawable.srilankan_onespot_grass_yellow);
        Butterfly B222  = new Butterfly(	"Striped Albatross",		"Appias libythea libythea",	 "drawable://" + R.drawable.striped_albatross);
        Butterfly B231  = new Butterfly(	"Three-spot Grass Yellow",		"Eurema blanda citrina",	 "drawable://" + R.drawable.threespot_grass_yellow);
        Butterfly B241  = new Butterfly(	"White Orange Tip",		"Ixias marianne",	 "drawable://" + R.drawable.white_orange_tip);
        Butterfly B245  = new Butterfly(	"Yellow Orange Tip",		"Ixias pyrene cingalensis",	 "drawable://" + R.drawable.yellow_orange_tip);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );




        peopleList.add(         B36  );
        peopleList.add(         B42  );
        peopleList.add(         B54  );
        peopleList.add(         B56  );
        peopleList.add(         B79  );
        peopleList.add(         B88  );
        peopleList.add(         B104  );
        peopleList.add(         B110  );
        peopleList.add(         B117  );
        peopleList.add(         B118  );
        peopleList.add(         B121  );
        peopleList.add(         B125  );
        peopleList.add(         B133  );
        peopleList.add(         B137  );
        peopleList.add(         B143  );
        peopleList.add(         B151  );
        peopleList.add(         B153  );
        peopleList.add(         B154  );
        peopleList.add(         B163  );
        peopleList.add(         B183  );
        peopleList.add(         B186  );
        peopleList.add(         B190  );
        peopleList.add(         B206  );
        peopleList.add(         B209  );
        peopleList.add(         B222  );
        peopleList.add(         B231  );
        peopleList.add(         B241  );
        peopleList.add(         B245  );
        peopleList.add(B249);



        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        fam5ListView.setScrollingCacheEnabled(false);
        fam5ListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        fam5ListView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) MenuItemCompat.getActionView( myActionMenuItem );
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                if (TextUtils.isEmpty(s)){
                    adapter.filter("");
                    fam5ListView.clearTextFilter();
                }
                else {
                    adapter.filter(s);
                }
                return true;
            }
        });
        return true;
    }
}