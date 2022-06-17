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

public class Fam3 extends AppCompatActivity {

    ListView fam3ListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();
    ButterflyListAdapter adapter;

    private AdView mAdview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_fam3 );
        Fam3.this.setTitle("Nymphalidae");

        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adViewf3 );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );


        fam3ListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B5  = new Butterfly(	"Angled Castor",		"Ariadne ariadne",	 "drawable://" + R.drawable.angled_castor);
        Butterfly B8  = new Butterfly(	"Autumn Leaf",		"Doleschallia bisaltide",	 "drawable://" + R.drawable.autumn_leaf);
        Butterfly B13  = new Butterfly(	"Baron",		"Euthalia aconthea",	 "drawable://" + R.drawable.baron_female);
        Butterfly B14  = new Butterfly(	"Baronet",		"Euthalia nais",	 "drawable://" + R.drawable.baronet);
        Butterfly B15  = new Butterfly(	"Beak",		"Libythea lepita",	 "drawable://" + R.drawable.beak);
        Butterfly B17  = new Butterfly(	"Black Prince",		"Rohana parisatis",	 "drawable://" + R.drawable.black_prince_male);
        Butterfly B18  = new Butterfly(	"Black Rajah",		"Charaxes solon",	 "drawable://" + R.drawable.black_rajah);
        Butterfly B20  = new Butterfly(	"Blue Admiral",		"Kaniska canace",	 "drawable://" + R.drawable.blue_admiral);
        Butterfly B21  = new Butterfly(	"Blue Glassy Tiger",		"Ideopsis similis exprompta",	 "drawable://" + R.drawable.blue_glassy_tiger);
        Butterfly B24  = new Butterfly(	"Blue Pansy",		"Junonia orithya patenas",	 "drawable://" + R.drawable.blue_pansy);
        Butterfly B25  = new Butterfly(	"Blue Tiger",		"Tirumala limniace exoticus",	 "drawable://" + R.drawable.blue_tiger);
        Butterfly B29  = new Butterfly(	"Brown King Crow",		"Euploea klugii sinhala",	 "drawable://" + R.drawable.brown_king_crow);
        Butterfly B35  = new Butterfly(	"Chestnut Streaked Sailor",		"Neptis jumbah nalanda ",	 "drawable://" + R.drawable.chestnut_streaked_sailor);
        Butterfly B37  = new Butterfly(	"Chocolate Soldier",		"Junonia iphita iphita",	 "drawable://" + R.drawable.chocolate_soldier);
        Butterfly B38  = new Butterfly(	"Clipper",		"Parthenos sylvia cyaneus",	 "drawable://" + R.drawable.clipper);
        Butterfly B39  = new Butterfly(	"Club Beak",		"Libythea myrrha rama",	 "drawable://" + R.drawable.club_beak);
        Butterfly B40  = new Butterfly(	"Commander",		"Moduza procris calidasa",	 "drawable://" + R.drawable.commander);
        Butterfly B46  = new Butterfly(	"Common Bushbrown",		"Mycalesis perseus typhlus",	 "drawable://" + R.drawable.common_bush_brown);
        Butterfly B47  = new Butterfly(	"Common Castor",		"Ariadne merione taprobana",	 "drawable://" + R.drawable.common_castor);
        Butterfly B49  = new Butterfly(	"Common Crow",		"Euploea core asela",	 "drawable://" + R.drawable.common_crow);
        Butterfly B52  = new Butterfly(	"Common Evening Brown",		"Melanitis leda",	 "drawable://" + R.drawable.common_evening_brown);
        Butterfly B60  = new Butterfly(	"Common Lascar",		"Pantoporia hordonia sinuata",	 "drawable://" + R.drawable.common_lascar);
        Butterfly B61  = new Butterfly(	"Common Leopard",		"Phalanta phalantha phalantha",	 "drawable://" + R.drawable.common_leopard);
        Butterfly B64  = new Butterfly(	"Common Palmfly",		"Elymnias hypermnestra fraterna",	 "drawable://" + R.drawable.common_palmfly_male);
        Butterfly B68  = new Butterfly(	"Common Sailor",		"Neptis hylas varmona",	 "drawable://" + R.drawable.common_sailor);
        Butterfly B73  = new Butterfly(	"Common Tiger",		"Danaus genutia genutia",	 "drawable://" + R.drawable.common_tiger);
        Butterfly B75  = new Butterfly(	"Common Treebrown",		"Lethe rohria neelgheriensis",	 "drawable://" + R.drawable.common_tree_brown);
        Butterfly B80  = new Butterfly(	"Cruiser",		"Vindula erota asela",	 "drawable://" + R.drawable.cruiser_male);
        Butterfly B81  = new Butterfly(	"Danaid Eggfly",		"Hypolimnas misippus",	 "drawable://" + R.drawable.danaid_eggfly_male);
        Butterfly B82  = new Butterfly(	"Dark Blue Tiger",		"Tirumala septentrionis musikanos",	 "drawable://" + R.drawable.dark_blue_tiger);
        Butterfly B84  = new Butterfly(	"Dark Evening Brown",		"Melanitis phedima tambra",	 "drawable://" + R.drawable.dark_evening_brown);
        Butterfly B89  = new Butterfly(	"Dark-brand Bushbrown",		"Mycalesis mineus polydecta",	 "drawable://" + R.drawable.darkbrand_bushbrown);
        Butterfly B91  = new Butterfly(	"Double Branded Crow",		"Euploea sylvester montana",	 "drawable://" + R.drawable.double_branded_crow);
        Butterfly B94  = new Butterfly(	"Gaudy Baron",		"Euthalia lubentina psittacus",	 "drawable://" + R.drawable.gaudy_baron);
        Butterfly B96  = new Butterfly(	"Gladeye Bushbrown",		"Mycalesis patnia patnia ",	 "drawable://" + R.drawable.gladeye_bushbrown);
        Butterfly B97  = new Butterfly(	"Glassy Tiger",		"Parantica aglea aglea ",	 "drawable://" + R.drawable.glassy_tiger);
        Butterfly B102  = new Butterfly(	"Great Crow",		"Euploea phaenareta corus ",	 "drawable://" + R.drawable.great_crow);
        Butterfly B103  = new Butterfly(	"Great Eggfly",		"Hypolimnas bolina bolina",	 "drawable://" + R.drawable.great_eggfly);
        Butterfly B105  = new Butterfly(	"Grey Pansy",		"Junonia atlites atlites",	 "drawable://" + R.drawable.grey_pansy);
        Butterfly B111  = new Butterfly(	"Joker",		"Byblia ilithyia",	 "drawable://" + R.drawable.joker);
        Butterfly B112  = new Butterfly(	"Lace Wing",		"Cethosia nietneri nietneri ",	 "drawable://" + R.drawable.lace_wing);
        Butterfly B119  = new Butterfly(	"Lemon Pansy",		"Junonia lemonias vaisya",	 "drawable://" + R.drawable.lemon_pansy);
        Butterfly B129  = new Butterfly(	"Medus Brown (Nigger)",		"Orsotriaena medus mandata",	 "drawable://" + R.drawable.medus_brown);
        Butterfly B134  = new Butterfly(	"Nawab",		"Charaxes athamas athamas",	 "drawable://" + R.drawable.nawab);
        Butterfly B142  = new Butterfly(	"Painted Lady",		"Vanessa cardui",	 "drawable://" + R.drawable.painted_lady);
        Butterfly B148  = new Butterfly(	"Peacock Pansy",		"Junonia almana almana",	 "drawable://" + R.drawable.peacock_pansy);
        Butterfly B155  = new Butterfly(	"Plain Tiger",		"Danaus chrysippus chrysippu",	 "drawable://" + R.drawable.plain_tiger);
        Butterfly B166  = new Butterfly(	"Red Admiral",		"Vanessa indica nubicola",	 "drawable://" + R.drawable.red_admiral);
        Butterfly B171  = new Butterfly(	"Redspot Duke",		"Dophla evelina evelina",	 "drawable://" + R.drawable.redspot_duke);
        Butterfly B184  = new Butterfly(	"Small Leopard",		"Phalanta alcippe ceylonica",	 "drawable://" + R.drawable.small_leopard);
        Butterfly B188  = new Butterfly(	"Southern Duffer",		"Discophora lepida ceylonica",	 "drawable://" + R.drawable.southern_duffer);
        Butterfly B193  = new Butterfly(	"Sri Lankan Blue Oak Leaf",		"Kallima philarchus",	 "drawable://" + R.drawable.srilankan_blue_oak_leaf);
        Butterfly B195  = new Butterfly(	"Sri Lankan Cingalese Bushbrown",		"Mycalesis rama",	 "drawable://" + R.drawable.srilankan_cingalese_bushbrown);
        Butterfly B199  = new Butterfly(	"Sri Lankan Forester",		"Lethe dynsate",	 "drawable://" + R.drawable.srilankan_forester);
        Butterfly B205  = new Butterfly(	"Sri Lankan Jewel Four-ring",		"Ypthima singala",	 "drawable://" + R.drawable.srilanka_jewel_four_ring);
        Butterfly B213  = new Butterfly(	"Sri Lankan Palmfly",		"Elymnias singhala",	 "drawable://" + R.drawable.srilankan_palmfly);
        Butterfly B217  = new Butterfly(	"Sri Lankan Tamil Bushbrown",		"Mycalesis subdita",	 "drawable://" + R.drawable.srilankan_tamil_bushbrown);
        Butterfly B218  = new Butterfly(	"Sri Lankan Tiger",		"Parantica taprobana",	 "drawable://" + R.drawable.srilankan_tiger);
        Butterfly B219  = new Butterfly(	"Sri Lankan Tree-nymph",		"Idea iasonia",	 "drawable://" + R.drawable.srilanka_tree_nymph);
        Butterfly B220  = new Butterfly(	"Sri Lankan Treebrown",		"Lethe daretis",	 "drawable://" + R.drawable.srilanka_treebrown);
        Butterfly B227  = new Butterfly(	"Tamil Treebrown",		"Lethe drypetis drypetis",	 "drawable://" + R.drawable.tamil_treebrown);
        Butterfly B228  = new Butterfly(	"Tamil Yeoman",		"Cirrochroa thais lanka",	 "drawable://" + R.drawable.tamil_yeoman);
        Butterfly B229  = new Butterfly(	"Tawny Coster",		"Acraea terpsicore",	 "drawable://" + R.drawable.tawny_coster);
        Butterfly B230  = new Butterfly(	"Tawny Rajah",		"Charaxes psaphon psaphon",	 "drawable://" + R.drawable.tawny_rajah);
        Butterfly B235  = new Butterfly(	"Tropical Fritillary (Indian Fritillary)",		"Argynnis hyperbius taprobana",	 "drawable://" + R.drawable.tropical_fritillary);
        Butterfly B239  = new Butterfly(	"White Four-ring",		"Ypthima ceylonica",	 "drawable://" + R.drawable.white_four_ring);
        Butterfly B247  = new Butterfly(	"Yellow Pansy",		"Junonia hierta",	 "drawable://" + R.drawable.yellow_pansy);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );




        peopleList.add(         B5  );
        peopleList.add(         B8  );
        peopleList.add(         B13  );
        peopleList.add(         B14  );
        peopleList.add(         B15  );
        peopleList.add(         B17  );
        peopleList.add(         B18  );
        peopleList.add(         B20  );
        peopleList.add(         B21  );
        peopleList.add(         B24  );
        peopleList.add(         B25  );
        peopleList.add(         B29  );
        peopleList.add(         B35  );
        peopleList.add(         B37  );
        peopleList.add(         B38  );
        peopleList.add(         B39  );
        peopleList.add(         B40  );
        peopleList.add(         B46  );
        peopleList.add(         B47  );
        peopleList.add(         B49  );
        peopleList.add(         B52  );
        peopleList.add(         B60  );
        peopleList.add(         B61  );
        peopleList.add(         B64  );
        peopleList.add(         B68  );
        peopleList.add(         B73  );
        peopleList.add(         B75  );
        peopleList.add(         B80  );
        peopleList.add(         B81  );
        peopleList.add(         B82  );
        peopleList.add(         B84  );
        peopleList.add(         B89  );
        peopleList.add(         B91  );
        peopleList.add(         B94  );
        peopleList.add(         B96  );
        peopleList.add(         B97  );
        peopleList.add(         B102  );
        peopleList.add(         B103  );
        peopleList.add(         B105  );
        peopleList.add(         B111  );
        peopleList.add(         B112  );
        peopleList.add(         B119  );
        peopleList.add(         B129  );
        peopleList.add(         B134  );
        peopleList.add(         B142  );
        peopleList.add(         B148  );
        peopleList.add(         B155  );
        peopleList.add(         B166  );
        peopleList.add(         B171  );
        peopleList.add(         B184  );
        peopleList.add(         B188  );
        peopleList.add(         B193  );
        peopleList.add(         B195  );
        peopleList.add(         B199  );
        peopleList.add(         B205  );
        peopleList.add(         B213  );
        peopleList.add(         B217  );
        peopleList.add(         B218  );
        peopleList.add(         B219  );
        peopleList.add(         B220  );
        peopleList.add(         B227  );
        peopleList.add(         B228  );
        peopleList.add(         B229  );
        peopleList.add(         B230  );
        peopleList.add(         B235  );
        peopleList.add(         B239  );
        peopleList.add(         B247  );
        peopleList.add(B249);



        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        fam3ListView.setScrollingCacheEnabled(false);
        fam3ListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        fam3ListView.setAdapter(adapter);

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
                    fam3ListView.clearTextFilter();
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