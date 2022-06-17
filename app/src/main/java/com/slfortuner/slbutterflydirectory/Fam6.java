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

public class Fam6 extends AppCompatActivity {


    ListView fam6ListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam6 );
        Fam6.this.setTitle("Riodinidae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf6 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );

        fam6ListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B159  = new Butterfly(	"Plum Judy",		"Abisara echerius prunosa",	 "drawable://" + R.drawable.plum_judy);





        peopleList.add(B159);



        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        fam6ListView.setScrollingCacheEnabled(false);
        fam6ListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        fam6ListView.setAdapter(adapter);

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
                    fam6ListView.clearTextFilter();
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