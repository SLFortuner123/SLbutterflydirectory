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

import java.util.ArrayList;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Fam1 extends AppCompatActivity {

    ListView famListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam1 );
        Fam1.this.setTitle("Hesperiidae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf1 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );

        famListView  = findViewById(R.id.listView);

        //Create the Butterfly objects



        Butterfly B3  = new Butterfly(	"African Marbled Skipper",		"Gomalia elma",	 "drawable://" + R.drawable.african_marbled_skipper);
        Butterfly B4  = new Butterfly(	"Alida Angle (Ceylon Golden Angle)",		"Caprona alida",	 "drawable://" + R.drawable.alida_angle);
        Butterfly B9  = new Butterfly(	"Awl King",	"Choaspes benjaminii",	"drawable://" + R.drawable.awl_king);
        Butterfly B12  = new Butterfly(	"Banded Red Eye",		"Gangara lebadea",	 "drawable://" + R.drawable.banded_red_eye);
        Butterfly B16  = new Butterfly(	"Black Angle",		"Tapena thwaitesi",	 "drawable://" + R.drawable.black_angle);
        Butterfly B19  = new Butterfly(	"Blank Swift",		"Caltoris kumara",	 "drawable://" + R.drawable.blank_swift);
        Butterfly B26  = new Butterfly(	"Branded Orange Awlet",		"Burara oedipodea ataphus",	 "drawable://" + R.drawable.branded_orange_awlet);
        Butterfly B28  = new Butterfly(	"Brown Awl",		" Badamia exclamationis",	 "drawable://" + R.drawable.brown_awl);
        Butterfly B31  = new Butterfly(	"Bush Hopper",		"Ampittia dioscorides singa",	 "drawable://" + R.drawable.bush_hopper);
        Butterfly B34  = new Butterfly(	"Chestnut Bob",		"Iambrix salsala luteipalpis",	 "drawable://" + R.drawable.chestnut_bob);
        Butterfly B43  = new Butterfly(	"Common Banded Awl",		"Hasora chromus",	 "drawable://" + R.drawable.common_banded_awl);
        Butterfly B44  = new Butterfly(	"Common Banded Demon",		"Notocrypta paralysos alysia",	 "drawable://" + R.drawable.common_banded_demon);
        Butterfly B50  = new Butterfly(	"Common Dart",		"Potanthus pseudomaesa pseudomaesa",	 "drawable://" + R.drawable.common_darlet);
        Butterfly B51  = new Butterfly(	"Common Dartlet",		"Oriens goloides",	 "drawable://" + R.drawable.common_dart);
        Butterfly B53  = new Butterfly(	"Common Grass Dart",		"Taractrocera maevius",	 "drawable://" + R.drawable.common_grass_dart);
        Butterfly B66  = new Butterfly(	"Common Red Eye",		"Matapa aria",	 "drawable://" + R.drawable.common_red_eye);
        Butterfly B71  = new Butterfly(	"Common Small Flat",		"Sarangesa dasahara albicilia",	 "drawable://" + R.drawable.common_small_flat);
        Butterfly B72  = new Butterfly(	"Common Snow Flat (Ceylon Snow Flat)",		"Tagiades japetus obscurus",	 "drawable://" + R.drawable.common_snow_flat);
        Butterfly B76  = new Butterfly(	"Conjoined Swift",		"Pelopidas conjuncta narooa",	 "drawable://" + R.drawable.conjoined_swift);
        Butterfly B86  = new Butterfly(	"Dark Palm Dart",		"Telicota bambusae lanka",	 "drawable://" + R.drawable.dark_palm_dart);
        Butterfly B95  = new Butterfly(	"Giant Red Eye",		"Gangara thyrsis clothilda",	 "drawable://" + R.drawable.giant_red_eye);
        Butterfly B98  = new Butterfly(	"Golden Angle",		"Caprona ransonnettii ransonnettii",	 "drawable://" + R.drawable.golden_angle);
        Butterfly B100  = new Butterfly(	"Grass Demon",		"Udaspes folus",	 "drawable://" + R.drawable.grass_demon);
        Butterfly B106  = new Butterfly(	"Grizzled Skipper (Indian Skipper)",		"Spialia galba",	 "drawable://" + R.drawable.grizzled_skipper);
        Butterfly B113  = new Butterfly(	"Large Branded Swift",		"Pelopidas subochracea subochracea",	 "drawable://" + R.drawable.large_branded_swift);
        Butterfly B124  = new Butterfly(	"Little Branded Swift",		"Pelopidas agna agna",	 "drawable://" + R.drawable.little_branded_swift);
        Butterfly B138  = new Butterfly(	"Orange-tailed Awl",		"Bibasis sena sena",	 "drawable://" + R.drawable.orange_tailed_awl);
        Butterfly B139  = new Butterfly(	"Oriental Common Awl (Ceylon Awl)",		"Hasora badra lanka",	 "drawable://" + R.drawable.oriental_common_awl);
        Butterfly B141  = new Butterfly(	"Oriental Palm Bob (Indian Palm Bob)",		" Suastus gremius subgrisea",	 "drawable://" + R.drawable.oriental_palm_bob);
        Butterfly B145  = new Butterfly(	"Pale Palm Dart",		"Telicota colon kala",	 "drawable://" + R.drawable.pale_palm_dart);
        Butterfly B146  = new Butterfly(	"Pallid Dart (Indian Dart)",		"Potanthus pallida",	 "drawable://" + R.drawable.pallid_dart);
        Butterfly B150  = new Butterfly(	"Philippine Swift",		"Caltoris philippina seriata",	 "drawable://" + R.drawable.philippine_swift_xxhd );
        Butterfly B172  = new Butterfly(	"Restricted Demon",		"Notocrypta curvifascia curvifascia",	 "drawable://" + R.drawable.restricted_demon);
        Butterfly B173  = new Butterfly(	"Rounded Palm Red Eye",		"Erionota torus",	 "drawable://" + R.drawable.rounded_palm_red_eye);
        Butterfly B181  = new Butterfly(	"Small Branded Swift",		"Pelopidas mathias mathias",	 "drawable://" + R.drawable.small_branded_swift);
        Butterfly B185  = new Butterfly(	"Small Palm Bob (Ceylon Palm Bob)",		"Suastus minuta minuta",	 "drawable://" + R.drawable.small_palm_bob);
        Butterfly B187  = new Butterfly(	"Smallest Swift",		"Parnara bada bada",	 "drawable://" + R.drawable.smallest_swift);
        Butterfly B192  = new Butterfly(	"Sri Lankan Black Flat",		"Celaenorrhinus spilothyrus",	 "drawable://" + R.drawable.srilankan_black_flat_email_the_owner);
        Butterfly B197  = new Butterfly(	"Sri Lankan Dart (Tropic Dart)",		"Potanthus satra",	 "drawable://" + R.drawable.srilankan_dart);
        Butterfly B198  = new Butterfly(	"Sri Lankan Decorated Ace",		"Thoressa decorata ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B202  = new Butterfly(	"Sri Lankan Hedge Hopper",		"Baracus vittatus",	 "drawable://" + R.drawable.srilanka_hedge_hopper);
        Butterfly B203  = new Butterfly(	"Sri Lankan Highland Ace (Rare Ace)",		"Halpe egena ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B207  = new Butterfly(	"Sri Lankan Lowland Ace (Ceylon Ace)",		"Halpe ceylonica ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B211  = new Butterfly(	"Sri Lankan Paint Brush Swift",		"Baoris penicillata ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B214  = new Butterfly(	"Sri Lankan Pied Flat",		"Coladenia tissa",	 "drawable://" + R.drawable.srilankan_pied_flat);
        Butterfly B234  = new Butterfly(	"Tree Flitter",		"Hyarotis adrastus adrastus",	 "drawable://" + R.drawable.tree_flitter);
        Butterfly B236  = new Butterfly(	"Wallace's Swift",		"Borbo cinnara",	 "drawable://" + R.drawable.wallaces_swift);
        Butterfly B237 = new Butterfly(	"Water Snow Flat",		"Tagiades litigiosa ceylonica",	 "drawable://" + R.drawable.water_snow_flat);
        Butterfly B238  = new Butterfly(	"White Banded Awl",		"Hasora taminatus",	 "drawable://" + R.drawable.white_banded_awl);
        Butterfly B246  = new Butterfly(	"Yellow Palm Dart",		"Cephrenes trichopepla",	 "drawable://" + R.drawable.yellow_palm_dart);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );


        peopleList.add(B3);
        peopleList.add(B4);
        peopleList.add(B9);
        peopleList.add(B12);
        peopleList.add(B16);
        peopleList.add(B19);
        peopleList.add(B26);
        peopleList.add(B28);
        peopleList.add(B31);
        peopleList.add(B34);
        peopleList.add(B43);
        peopleList.add(B44);
        peopleList.add(B50);
        peopleList.add(B51);
        peopleList.add(B53);
        peopleList.add(B66);
        peopleList.add(B71);
        peopleList.add(B72);
        peopleList.add(B76);
        peopleList.add(B86);
        peopleList.add(B95);
        peopleList.add(B98);
        peopleList.add(B100);
        peopleList.add(B106);
        peopleList.add(B113);
        peopleList.add(B124);
        peopleList.add(B138);
        peopleList.add(B139);
        peopleList.add(B141);
        peopleList.add(B145);
        peopleList.add(B146);
        peopleList.add(B150);
        peopleList.add(B172);
        peopleList.add(B173);
        peopleList.add(B181);
        peopleList.add(B185);
        peopleList.add(B187);
        peopleList.add(B192);
        peopleList.add(B197);
        peopleList.add(B198);
        peopleList.add(B202);
        peopleList.add(B203);
        peopleList.add(B207);
        peopleList.add(B211);
        peopleList.add(B214);
        peopleList.add(B234);
        peopleList.add(B236);
        peopleList.add(B237);
        peopleList.add(B238);
        peopleList.add(B246);
        peopleList.add(B249);








        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        famListView.setScrollingCacheEnabled(false);
        famListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        famListView.setAdapter(adapter);




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
                    famListView.clearTextFilter();
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