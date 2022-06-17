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

public class Fam2 extends AppCompatActivity {

    ListView fam2ListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam2 );
        Fam2.this.setTitle("Lycaenidae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf2 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );

        fam2ListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B1  = new Butterfly(	"Aberrant Bushblue",		"Arhopala abseus",	 "drawable://" + R.drawable.aberrant_bush_blue);
        Butterfly B2  = new Butterfly(	"African Babul Blue",		"Azanus jesous",	 "drawable://" + R.drawable.african_babul_blue);
        Butterfly B6  = new Butterfly(	"Angled Pierrot",		"Caleta decidia",	 "drawable://" + R.drawable.angled_pierrot);
        Butterfly B7  = new Butterfly(	"Apefly",		"Spalgis epius",	 "drawable://" + R.drawable.apefly);
        Butterfly B10  = new Butterfly(	"Banded Blue Pierrot",		"Discolampa ethion",	 "drawable://" + R.drawable.baded_peacock);
        Butterfly B23  = new Butterfly(	"Blue Onyx",		"Horaga onyx cingalensis",	 "drawable://" + R.drawable.blue_onyx);
        Butterfly B27  = new Butterfly(	"Bright Babul Blue",		"Azanus ubaldus",	 "drawable://" + R.drawable.bright_babul_blue);
        Butterfly B30  = new Butterfly(	"Brown Onyx",		"Horaga albimacula viola",	 "drawable://" + R.drawable.brown_onyx);
        Butterfly B32  = new Butterfly(	"Buttler's Spotted Pierrot",		"Tarucus callinara",	 "drawable://" + R.drawable.butlers_spotted_pierrot);
        Butterfly B33  = new Butterfly(	"Centaur Oakblue",		"Arhopala centaurus pirama",	 "drawable://" + R.drawable.centaur_oakblue);
        Butterfly B41  = new Butterfly(	"Common Acacia Blue",		"Surendra quercetorum discalis",	 "drawable://" + R.drawable.common_acacia_blue);
        Butterfly B48  = new Butterfly(	"Common Cerulean",		"Jamides celeno tissama",	 "drawable://" + R.drawable.common_cerulean);
        Butterfly B55  = new Butterfly(	"Common Guava Blue",		"Virachola isocrates",	 "drawable://" + R.drawable.common_guava_blue);
        Butterfly B57  = new Butterfly(	"Common Hedge Blue",		"Acytolepis puspa felderi",	 "drawable://" + R.drawable.common_headge_blue);
        Butterfly B58  = new Butterfly(	"Common Imperial",		"Cheritra freja pseudojafra",	 "drawable://" + R.drawable.common_imperial);
        Butterfly B62  = new Butterfly(	"Common Lineblue",		"Prosotas nora ardates",	 "drawable://" + R.drawable.common_lineblue);
        Butterfly B65  = new Butterfly(	"Common Pierrot",		"Castalius rosimon rosimon",	 "drawable://" + R.drawable.common_pierrot);
        Butterfly B69  = new Butterfly(	"Common Shot Silverline (Ceylon Silverline)",		"Spindasis ictis ceylonica",	 "drawable://" + R.drawable.common_shot_silverline_male);
        Butterfly B70  = new Butterfly(	"Common Silverline",		"Spindasis vulcanus fusca",	 "drawable://" + R.drawable.common_silverline);
        Butterfly B74  = new Butterfly(	"Common Tinsel",		"Catapaecilma major myosotina",	 "drawable://" + R.drawable.common_tinsel);
        Butterfly B77  = new Butterfly(	"Cornelian",		"Deudorix epijarbas epijarbus",	 "drawable://" + R.drawable.cornelian);
        Butterfly B83  = new Butterfly(	"Dark Cerulean",		"Jamides bochus bochus",	 "drawable://" + R.drawable.dark_cerulean);
        Butterfly B85  = new Butterfly(	"Dark Grass Blue",		"Zizeeria karsandra",	 "drawable://" + R.drawable.dark_grass_blue);
        Butterfly B87  = new Butterfly(	"Dark Six Lineblue",		"Nacaduba calauria evansi",	 "drawable://" + R.drawable.dark_sixline_blue_xxhd );
        Butterfly B90  = new Butterfly(	"Dingy Lineblue",		"Petrelaea dana",	 "drawable://" + R.drawable.dingly_lineblue_xxhd );
        Butterfly B93  = new Butterfly(	"Forget-me-not",		"Catochrysops strabo strabo",	 "drawable://" + R.drawable.forget_me_not);
        Butterfly B99  = new Butterfly(	"Gram Blue",		"Euchrysops cnejus cnejus ",	 "drawable://" + R.drawable.gram_blue);
        Butterfly B101  = new Butterfly(	"Grass Jewel",		"Freyeria putli",	 "drawable://" + R.drawable.grass_jewel);
        Butterfly B107  = new Butterfly(	"Hampson's Hedge Blue",		"Acytolepis lilacea moorei",	 "drawable://" + R.drawable.hampsons_hedge_blue);
        Butterfly B108  = new Butterfly(	"Indian Sunbeam",		"Curetis thetis",	 "drawable://" + R.drawable.indian_sunbeam);
        Butterfly B109  = new Butterfly(	"Indigo Flash",		"Rapala varuna lazulina",	 "drawable://" + R.drawable.indigo_flash_xxhd );
        Butterfly B114  = new Butterfly(	"Large Four Lineblue",		"Nacaduba pactolus ceylonica",	 "drawable://" + R.drawable.large_four_lineblue);
        Butterfly B115  = new Butterfly(	"Large Guava Blue",		"Virachola perse ghela",	 "drawable://" + R.drawable.large_guava_blue_xxhd );
        Butterfly B116  = new Butterfly(	"Large Oakblue",		"Arhopala amantes amantes ",	 "drawable://" + R.drawable.large_oakblue);
        Butterfly B120  = new Butterfly(	"Lesser Grass Blue",		"Zizina otis indica",	 "drawable://" + R.drawable.lesser_grass_blue_xxhd );
        Butterfly B122  = new Butterfly(	"Lime Blue",		"Chilades lajus lajus",	 "drawable://" + R.drawable.lime_blue);
        Butterfly B126  = new Butterfly(	"Long-banded Silverline",		"Spindasis lohita lazularia",	 "drawable://" + R.drawable.long_banded_silverline);
        Butterfly B127  = new Butterfly(	"Malabar Flash",		"Rapala lankana",	 "drawable://" + R.drawable.malabar_flash);
        Butterfly B128  = new Butterfly(	"Malayan",		"Megisba malaya thwaitesi",	 "drawable://" + R.drawable.malayan);
        Butterfly B130  = new Butterfly(	"Metallic Cerulean",		"Jamides alecto meilichius",	 "drawable://" + R.drawable.metallic_cerulean);
        Butterfly B132  = new Butterfly(	"Monkey-puzzle",		"Rathinda amor",	 "drawable://" + R.drawable.monkey_puzzle);
        Butterfly B135  = new Butterfly(	"Nilgiri Tit",		"Hypolycaena nilgirica",	 "drawable://" + R.drawable.nilgiri_tit);
        Butterfly B136  = new Butterfly(	"Opaque Six Lineblue",		"Nacaduba beroe minima",	 "drawable://" + R.drawable.opaque_six_lineblue);
        Butterfly B140  = new Butterfly(	"Oriental Cupid (Indian Cupid)",		"Everes lacturnus lacturnus",	 "drawable://" + R.drawable.oriental_cupid);
        Butterfly B144  = new Butterfly(	"Pale Four Lineblue",		"Nacaduba hermus sidoma",	 "drawable://" + R.drawable.pale_four_lineblue);
        Butterfly B147  = new Butterfly(	"Pea Blue",		"Lampides boeticus",	 "drawable://" + R.drawable.pea_blue);
        Butterfly B149  = new Butterfly(	"Peacock Royal",		"Tajuria cippus longinus",	 "drawable://" + R.drawable.peacock_royal);
        Butterfly B152  = new Butterfly(	"Plain Hedge Blue",		"Celastrina lavendularis lavendularis",	 "drawable://" + R.drawable.plain_hedge_blue);
        Butterfly B156  = new Butterfly(	"Plains Blue Royal",		"Tajuria jehana ceylanica",	 "drawable://" + R.drawable.plains_blue_royal);
        Butterfly B157  = new Butterfly(	"Plains Cupid",		"Chilades pandava lanka",	 "drawable://" + R.drawable.plains_cupid);
        Butterfly B158  = new Butterfly(	"Plane",		"Bindahara phocides moorei",	 "drawable://" + R.drawable.plane_male_xxhd );
        Butterfly B160  = new Butterfly(	"Plumbeous Silverline",		"Spindasis schistacea",	 "drawable://" + R.drawable.plumbeous_silverline);
        Butterfly B161  = new Butterfly(	"Pointed Ciliate Blue",		"Anthene lycaenina lycaenina",	 "drawable://" + R.drawable.pointed_ciliate_blue);
        Butterfly B162  = new Butterfly(	"Pointed Lineblue",		"Lonolyce helicon viola",	 "drawable://" + R.drawable.pointed_lineblue);
        Butterfly B164  = new Butterfly(	"Purple Leaf Blue",		"Amblypodia anita naradoides ",	 "drawable://" + R.drawable.purple_leaf_blue);
        Butterfly B165  = new Butterfly(	"Quaker",		"Neopithecops zalmora dharma",	 "drawable://" + R.drawable.quaker);
        Butterfly B167  = new Butterfly(	"Red Flash",		"Rapala iarbus sorya",	 "drawable://" + R.drawable.red_flash_xxhd );
        Butterfly B169  = new Butterfly(	"Red Pierrot",		"Talicada nyseus nyseus",	 "drawable://" + R.drawable.red_pierrot);
        Butterfly B170  = new Butterfly(	"Redspot",		"Zesius chrysomallus",	 "drawable://" + R.drawable.redspot);
        Butterfly B174  = new Butterfly(	"Rounded Six Lineblue",		"Nacaduba berenice ormistoni",	 "drawable://" + R.drawable.rounded_six_lineblue);
        Butterfly B176  = new Butterfly(	"Scarce Shot Silverline",		"Spindasis elima fairliei",	 "drawable://" + R.drawable.scarce_shot_silverline_male_xxhd );
        Butterfly B177  = new Butterfly(	"Shiva Sunbeam",		"Curetis siva",	 "drawable://" + R.drawable.shiva_sunbeam);
        Butterfly B178  = new Butterfly(	"Silver Forget-me-not",		"Catochrysops panormus panormus",	 "drawable://" + R.drawable.silver_forget_me_not);
        Butterfly B179  = new Butterfly(	"Silver Streak Blue",		"Iraota timoleon nicevillei",	 "drawable://" + R.drawable.silver_streak_blue);
        Butterfly B180  = new Butterfly(	"Slate Flash",		"Rapala manea schistacea",	 "drawable://" + R.drawable.slate_flash);
        Butterfly B182  = new Butterfly(	"Small Cupid",		"Chilades parrhasius nila",	 "drawable://" + R.drawable.small_cupid);
        Butterfly B194  = new Butterfly(	"Sri Lankan Cerulean",		"Jamides coruscans ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B196  = new Butterfly(	"Sri Lankan Clouded Silverline",		"Spindasis nubilus",	 "drawable://" + R.drawable.srilankan_clouded_silverline);
        Butterfly B200  = new Butterfly(	"Sri Lankan Green's Silverline",		"Spindasis greeni",	 "drawable://" +  "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B201  = new Butterfly(	"Sri Lankan Hedge Blue",		"Udara lanka",	 "drawable://" + R.drawable.srilankan_hedge_blue);
        Butterfly B204  = new Butterfly(	"Sri Lankan Indigo Royal",		"Tajuria arida ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B208  = new Butterfly(	"Sri Lankan Milky Cerulean",		"Jamides lacteata",	 "drawable://" + R.drawable.srilankan_milky_cerulean);
        Butterfly B210  = new Butterfly(	"Sri Lankan Ormiston's Oakblue",		"Arhopala ormistoni",	  "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B212  = new Butterfly(	"Sri Lankan Pale Six Lineblue",		"Nacaduba sinhala",	 "drawable://" + R.drawable.srilankan_pale_six_lineblue);
        Butterfly B216  = new Butterfly(	"Sri Lankan Singalese Hedge Blue",		"Udara singalensis ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B221  = new Butterfly(	"Sri Lankan Woodhouse's Four Lineblue",		"Nacaduba ollyetti ",	 "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B223  = new Butterfly(	"Striped Pierrot",		"Tarucus nara",	 "drawable://" + R.drawable.striped_pierrot);
        Butterfly B224  = new Butterfly(	"Tail-less Lineblue",		"Prosotas dubiosa indica",	 "drawable://" + R.drawable.tail_less_lineblue);
        Butterfly B232  = new Butterfly(	"Tiny Grass Blue",		"Zizula hylax hylax",	 "drawable://" + R.drawable.tiny_grass_blue);
        Butterfly B233  = new Butterfly(	"Transparent Six Lineblue",		"Nacaduba kurava prominens",	 "drawable://" + R.drawable.transparent_six_lineblue);
        Butterfly B240  = new Butterfly(	"White Hedge Blue",		"Udara akasa mavisa",	 "drawable://" + R.drawable.white_hedge_blue);
        Butterfly B242  = new Butterfly(	"White Royal",		"Pratapa deva deva",	 "drawable://" + R.drawable.white_royal);
        Butterfly B243  = new Butterfly(	"White-Tipped Lineblue",		"Prosotas noreia noreia",	 "drawable://" + R.drawable.white_tripped_lineblue);
        Butterfly B244  = new Butterfly(	"Yamfly",		"Loxura atymnus arcuata",	 "drawable://" + R.drawable.yamfly);
        Butterfly B248  = new Butterfly(	"Zebra Blue",		"Leptotes plinius plinius",	 "drawable://" + R.drawable.zebra_blue);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );




        peopleList.add( B1  );
        peopleList.add(         B2  );
        peopleList.add(         B6  );
        peopleList.add(         B7  );
        peopleList.add(         B10  );
        peopleList.add(         B23  );
        peopleList.add(         B27  );
        peopleList.add(         B30  );
        peopleList.add(         B32  );
        peopleList.add(         B33  );
        peopleList.add(         B41  );
        peopleList.add(         B48  );
        peopleList.add(         B55  );
        peopleList.add(         B57  );
        peopleList.add(         B58  );
        peopleList.add(         B62  );
        peopleList.add(         B65  );
        peopleList.add(         B69  );
        peopleList.add(         B70  );
        peopleList.add(         B74  );
        peopleList.add(         B77  );
        peopleList.add(         B83  );
        peopleList.add(         B85  );
        peopleList.add(         B87  );
        peopleList.add(         B90  );
        peopleList.add(         B93  );
        peopleList.add(         B99  );
        peopleList.add(         B101  );
        peopleList.add(         B107  );
        peopleList.add(         B108  );
        peopleList.add(         B109  );
        peopleList.add(         B114  );
        peopleList.add(         B115  );
        peopleList.add(         B116  );
        peopleList.add(         B120  );
        peopleList.add(         B122  );
        peopleList.add(         B126  );
        peopleList.add(         B127  );
        peopleList.add(         B128  );
        peopleList.add(         B130  );
        peopleList.add(         B132  );
        peopleList.add(         B135  );
        peopleList.add(         B136  );
        peopleList.add(         B140  );
        peopleList.add(         B144  );
        peopleList.add(         B147  );
        peopleList.add(         B149  );
        peopleList.add(         B152  );
        peopleList.add(         B156  );
        peopleList.add(         B157  );
        peopleList.add(         B158  );
        peopleList.add(         B160  );
        peopleList.add(         B161  );
        peopleList.add(         B162  );
        peopleList.add(         B164  );
        peopleList.add(         B165  );
        peopleList.add(         B167  );
        peopleList.add(         B169  );
        peopleList.add(         B170  );
        peopleList.add(         B174  );
        peopleList.add(         B176  );
        peopleList.add(         B177  );
        peopleList.add(         B178  );
        peopleList.add(         B179  );
        peopleList.add(         B180  );
        peopleList.add(         B182  );
        peopleList.add(         B194  );
        peopleList.add(         B196  );
        peopleList.add(         B200  );
        peopleList.add(         B201  );
        peopleList.add(         B204  );
        peopleList.add(         B208  );
        peopleList.add(         B210  );
        peopleList.add(         B212  );
        peopleList.add(         B216  );
        peopleList.add(         B221  );
        peopleList.add(         B223  );
        peopleList.add(         B224  );
        peopleList.add(         B232  );
        peopleList.add(         B233  );
        peopleList.add(         B240  );
        peopleList.add(         B242  );
        peopleList.add(         B243  );
        peopleList.add(         B244  );
        peopleList.add(         B248  );
        peopleList.add(B249);



        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        fam2ListView.setScrollingCacheEnabled(false);
        fam2ListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        fam2ListView.setAdapter(adapter);

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
                    fam2ListView.clearTextFilter();
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