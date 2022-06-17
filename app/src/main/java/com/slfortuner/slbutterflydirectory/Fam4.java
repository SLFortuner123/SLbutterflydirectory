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

public class Fam4 extends AppCompatActivity {


    ListView fam4ListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam4 );
        Fam4.this.setTitle("Papilionidae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf4 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );

        fam4ListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B11  = new Butterfly(	"Banded Peacock",		"Papilio crino",	 "drawable://" + R.drawable.banded_blue_pierrot);
        Butterfly B22  = new Butterfly(	"Blue Mormon",		" Papilio polymnestor parinda",	 "drawable://" + R.drawable.blue_mormon);
        Butterfly B45  = new Butterfly(	"Common Bluebottle",		"Graphium sarpedon",	 "drawable://" + R.drawable.common_bluebottle);
        Butterfly B59  = new Butterfly(	"Common Jay",		"Graphium doson doson ",	 "drawable://" + R.drawable.common_jay);
        Butterfly B63  = new Butterfly(	"Common Mormon",		"Papilio polytes romulus",	 "drawable://" + R.drawable.common_mormon);
        Butterfly B67  = new Butterfly(	"Common Rose",		"Pachliopta aristolochiae ceylonica ",	 "drawable://" + R.drawable.common_rose);
        Butterfly B78  = new Butterfly(	"Crimson Rose",		"Pachliopta hector",	 "drawable://" + R.drawable.crimson_rose);
        Butterfly B92  = new Butterfly(	"Five-bar Swordtail",		"Graphium antiphates ceylonicus ",	 "drawable://" + R.drawable.fivebar_swordtail);
        Butterfly B123  = new Butterfly(	"Lime Butterfly",		"Papilio demoleus demoleus",	 "drawable://" + R.drawable.lime_butterfly);
        Butterfly B131  = new Butterfly(	"Mime",		"Papilio clytia lankeswara",	 "drawable://" + R.drawable.mime_2_dissimillis);
        Butterfly B168  = new Butterfly(	"Red Helen",		"Papilio helenus mooreanus ",	 "drawable://" + R.drawable.red_helen);
        Butterfly B189  = new Butterfly(	"Spot Swordtail",		"Graphium nomius nomius",	 "drawable://" + R.drawable.spot_swordtail);
        Butterfly B191  = new Butterfly(	"Sri Lankan Birdwing",		"Troides darsius",	 "drawable://" + R.drawable.srilanka_bird_wing);
        Butterfly B215  = new Butterfly(	"Sri Lankan Rose",		"Pachliopta jophon",	 "drawable://" + R.drawable.srilankan_rose);
        Butterfly B225  = new Butterfly(	"Tailed Jay",		"Graphium agamemnon menides",	 "drawable://" + R.drawable.tailed_jay);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );



        peopleList.add(         B11  );
        peopleList.add(         B22  );
        peopleList.add(         B45  );
        peopleList.add(         B59  );
        peopleList.add(         B63  );
        peopleList.add(         B67  );
        peopleList.add(         B78  );
        peopleList.add(         B92  );
        peopleList.add(         B123  );
        peopleList.add(         B131  );
        peopleList.add(         B168  );
        peopleList.add(         B189  );
        peopleList.add(         B191  );
        peopleList.add(         B215  );
        peopleList.add(         B225  );
        peopleList.add(B249);



        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        fam4ListView.setScrollingCacheEnabled(false);
        fam4ListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        fam4ListView.setAdapter(adapter);

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
                    fam4ListView.clearTextFilter();
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