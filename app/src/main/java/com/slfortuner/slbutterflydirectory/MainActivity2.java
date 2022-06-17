package com.slfortuner.slbutterflydirectory;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private final String TAG = "MainActivity";



    private long backPressedTime;
    private Toast backToast;
    ButterflyListAdapter adapter;
    ListView mListView;
    ArrayList<Butterfly> peopleList = new ArrayList<>();

    AdView mAdview;


///////////////////////////////////////////////////////////////////adapter/////////////////////////////////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main2);
        MainActivity2.this.setTitle("All Butterflies");
        MobileAds.initialize( this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        } );

        mAdview = (AdView) findViewById( R.id.adView );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd( adRequest );



        Log.d(TAG, "onCreate: Started.");
        mListView  = findViewById(R.id.listView);

        //Create the Butterfly objects
        Butterfly B1  = new Butterfly(	"Aberrant Bushblue",	"Arhopala abseus",	"drawable://" + R.drawable.aberrant_bush_blue);
        Butterfly B2  = new Butterfly(	"African Babul Blue",	"Azanus jesous",	"drawable://" + R.drawable.african_babul_blue);
        Butterfly B3  = new Butterfly(	"African Marbled Skipper",	"Gomalia elma",	"drawable://" + R.drawable.african_marbled_skipper);
        Butterfly B4  = new Butterfly(	"Alida Angle (Ceylon Golden Angle)",	"Caprona alida",	"drawable://" + R.drawable.alida_angle);
        Butterfly B5  = new Butterfly(	"Angled Castor",	"Ariadne ariadne",	"drawable://" + R.drawable.angled_castor);
        Butterfly B6  = new Butterfly(	"Angled Pierrot",	"Caleta decidia",	"drawable://" + R.drawable.angled_pierrot);
        Butterfly B7  = new Butterfly(	"Apefly",	"Spalgis epius",	"drawable://" + R.drawable.apefly);
        Butterfly B8  = new Butterfly(	"Autumn Leaf",	"Doleschallia bisaltide",	"drawable://" + R.drawable.autumn_leaf);
        Butterfly B9  = new Butterfly(	"Awl King",	"Choaspes benjaminii",	"drawable://" + R.drawable.awl_king);
        Butterfly B10  = new Butterfly(	"Banded Blue Pierrot",	"Discolampa ethion",	"drawable://" + R.drawable.baded_peacock);
        Butterfly B11  = new Butterfly(	"Banded Peacock",	"Papilio crino",	"drawable://" + R.drawable.banded_blue_pierrot);
        Butterfly B12  = new Butterfly(	"Banded Red Eye",	"Gangara lebadea",	"drawable://" + R.drawable.banded_red_eye);
        Butterfly B13  = new Butterfly(	"Baron",	"Euthalia aconthea",	"drawable://" + R.drawable.baron_female);
        Butterfly B14  = new Butterfly(	"Baronet",	"Euthalia nais",	"drawable://" + R.drawable.baronet);
        Butterfly B15  = new Butterfly(	"Beak",	"Libythea lepita",	"drawable://" + R.drawable.beak);
        Butterfly B16  = new Butterfly(	"Black Angle",	"Tapena thwaitesi",	"drawable://" + R.drawable.black_angle);
        Butterfly B17  = new Butterfly(	"Black Prince",	"Rohana parisatis",	"drawable://" + R.drawable.black_prince_male);
        Butterfly B18  = new Butterfly(	"Black Rajah",	"Charaxes solon",	"drawable://" + R.drawable.black_rajah);
        Butterfly B19  = new Butterfly(	"Blank Swift",	"Caltoris kumara",	"drawable://" + R.drawable.blank_swift);
        Butterfly B20  = new Butterfly(	"Blue Admiral",	"Kaniska canace",	"drawable://" + R.drawable.blue_admiral);
        Butterfly B21  = new Butterfly(	"Blue Glassy Tiger",	"Ideopsis similis exprompta",	"drawable://" + R.drawable.blue_glassy_tiger);
        Butterfly B22  = new Butterfly(	"Blue Mormon",	" Papilio polymnestor parinda",	"drawable://" + R.drawable.blue_mormon);
        Butterfly B23  = new Butterfly(	"Blue Onyx",	"Horaga onyx cingalensis",	"drawable://" + R.drawable.blue_onyx);
        Butterfly B24  = new Butterfly(	"Blue Pansy",	"Junonia orithya patenas",	"drawable://" + R.drawable.blue_pansy);
        Butterfly B25  = new Butterfly(	"Blue Tiger",	"Tirumala limniace exoticus",	"drawable://" + R.drawable.blue_tiger);
        Butterfly B26  = new Butterfly(	"Branded Orange Awlet",	"Burara oedipodea ataphus",	"drawable://" + R.drawable.branded_orange_awlet);
        Butterfly B27  = new Butterfly(	"Bright Babul Blue",	"Azanus ubaldus",	"drawable://" + R.drawable.bright_babul_blue);
        Butterfly B28  = new Butterfly(	"Brown Awl",	" Badamia exclamationis",	"drawable://" + R.drawable.brown_awl);
        Butterfly B29  = new Butterfly(	"Brown King Crow",	"Euploea klugii sinhala",	"drawable://" + R.drawable.brown_king_crow);
        Butterfly B30  = new Butterfly(	"Brown Onyx",	"Horaga albimacula viola",	"drawable://" + R.drawable.brown_onyx);
        Butterfly B31  = new Butterfly(	"Bush Hopper",	"Ampittia dioscorides singa",	"drawable://" + R.drawable.bush_hopper);
        Butterfly B32  = new Butterfly(	"Buttler's Spotted Pierrot",	"Tarucus callinara",	"drawable://" + R.drawable.butlers_spotted_pierrot);
        Butterfly B33  = new Butterfly(	"Centaur Oakblue",	"Arhopala centaurus pirama",	"drawable://" + R.drawable.centaur_oakblue);
        Butterfly B34  = new Butterfly(	"Chestnut Bob",	"Iambrix salsala luteipalpis",	"drawable://" + R.drawable.chestnut_bob);
        Butterfly B35  = new Butterfly(	"Chestnut Streaked Sailor",	"Neptis jumbah nalanda ",	"drawable://" + R.drawable.chestnut_streaked_sailor);
        Butterfly B36  = new Butterfly(	"Chocolate Albatross",	"Appias lyncida taprobana",	"drawable://" + R.drawable.chocolate_albatross);
        Butterfly B37  = new Butterfly(	"Chocolate Soldier",	"Junonia iphita iphita",	"drawable://" + R.drawable.chocolate_soldier);
        Butterfly B38  = new Butterfly(	"Clipper",	"Parthenos sylvia cyaneus",	"drawable://" + R.drawable.clipper);
        Butterfly B39  = new Butterfly(	"Club Beak",	"Libythea myrrha rama",	"drawable://" + R.drawable.club_beak);
        Butterfly B40  = new Butterfly(	"Commander",	"Moduza procris calidasa",	"drawable://" + R.drawable.commander);
        Butterfly B41  = new Butterfly(	"Common Acacia Blue",	"Surendra quercetorum discalis",	"drawable://" + R.drawable.common_acacia_blue);
        Butterfly B42  = new Butterfly(	"Common Albatross",	"Appias albina swinhoei",	"drawable://" + R.drawable.common_albatross_male);
        Butterfly B43  = new Butterfly(	"Common Banded Awl",	"Hasora chromus",	"drawable://" + R.drawable.common_banded_awl);
        Butterfly B44  = new Butterfly(	"Common Banded Demon",	"Notocrypta paralysos alysia",	"drawable://" + R.drawable.common_banded_demon);
        Butterfly B45  = new Butterfly(	"Common Bluebottle",	"Graphium sarpedon",	"drawable://" + R.drawable.common_bluebottle);
        Butterfly B46  = new Butterfly(	"Common Bushbrown",	"Mycalesis perseus typhlus",	"drawable://" + R.drawable.common_bush_brown);
        Butterfly B47  = new Butterfly(	"Common Castor",	"Ariadne merione taprobana",	"drawable://" + R.drawable.common_castor);
        Butterfly B48  = new Butterfly(	"Common Cerulean",	"Jamides celeno tissama",	"drawable://" + R.drawable.common_cerulean);
        Butterfly B49  = new Butterfly(	"Common Crow",	"Euploea core asela",	"drawable://" + R.drawable.common_crow);
        Butterfly B50  = new Butterfly(	"Common Dart",	"Potanthus pseudomaesa pseudomaesa",	"drawable://" + R.drawable.common_darlet);
        Butterfly B51  = new Butterfly(	"Common Dartlet",	"Oriens goloides",	"drawable://" + R.drawable.common_dart);
        Butterfly B52  = new Butterfly(	"Common Evening Brown",	"Melanitis leda",	"drawable://" + R.drawable.common_evening_brown);
        Butterfly B53  = new Butterfly(	"Common Grass Dart",	"Taractrocera maevius",	"drawable://" + R.drawable.common_grass_dart);
        Butterfly B54  = new Butterfly(	"Common Grass Yellow",	"Eurema hecabe hecabe",	"drawable://" + R.drawable.common_grass_yellow);
        Butterfly B55  = new Butterfly(	"Common Guava Blue",	"Virachola isocrates",	"drawable://" + R.drawable.common_guava_blue);
        Butterfly B56  = new Butterfly(	"Common Gull",	"Cepora nerissa phryne ",	"drawable://" + R.drawable.common_gull);
        Butterfly B57  = new Butterfly(	"Common Hedge Blue",	"Acytolepis puspa felderi",	"drawable://" + R.drawable.common_headge_blue);
        Butterfly B58  = new Butterfly(	"Common Imperial",	"Cheritra freja pseudojafra",	"drawable://" + R.drawable.common_imperial);
        Butterfly B59  = new Butterfly(	"Common Jay",	"Graphium doson doson ",	"drawable://" + R.drawable.common_jay);
        Butterfly B60  = new Butterfly(	"Common Lascar",	"Pantoporia hordonia sinuata",	"drawable://" + R.drawable.common_lascar);
        Butterfly B61  = new Butterfly(	"Common Leopard",	"Phalanta phalantha phalantha",	"drawable://" + R.drawable.common_leopard);
        Butterfly B62  = new Butterfly(	"Common Lineblue",	"Prosotas nora ardates",	"drawable://" + R.drawable.common_lineblue);
        Butterfly B63  = new Butterfly(	"Common Mormon",	"Papilio polytes romulus",	"drawable://" + R.drawable.common_mormon);
        Butterfly B64  = new Butterfly(	"Common Palmfly",	"Elymnias hypermnestra fraterna",	"drawable://" + R.drawable.common_palmfly_male);
        Butterfly B65  = new Butterfly(	"Common Pierrot",	"Castalius rosimon rosimon",	"drawable://" + R.drawable.common_pierrot);
        Butterfly B66  = new Butterfly(	"Common Red Eye",	"Matapa aria",	"drawable://" + R.drawable.common_red_eye);
        Butterfly B67  = new Butterfly(	"Common Rose",	"Pachliopta aristolochiae ceylonica ",	"drawable://" + R.drawable.common_rose);
        Butterfly B68  = new Butterfly(	"Common Sailor",	"Neptis hylas varmona",	"drawable://" + R.drawable.common_sailor);
        Butterfly B69  = new Butterfly(	"Common Shot Silverline (Ceylon Silverline)",	"Spindasis ictis ceylonica",	"drawable://" + R.drawable.common_shot_silverline_male);
        Butterfly B70  = new Butterfly(	"Common Silverline",	"Spindasis vulcanus fusca",	"drawable://" + R.drawable.common_silverline);
        Butterfly B71  = new Butterfly(	"Common Small Flat",	"Sarangesa dasahara albicilia",	"drawable://" + R.drawable.common_small_flat);
        Butterfly B72  = new Butterfly(	"Common Snow Flat (Ceylon Snow Flat)",	"Tagiades japetus obscurus",	"drawable://" + R.drawable.common_snow_flat);
        Butterfly B73  = new Butterfly(	"Common Tiger",	"Danaus genutia genutia",	"drawable://" + R.drawable.common_tiger);
        Butterfly B74  = new Butterfly(	"Common Tinsel",	"Catapaecilma major myosotina",	"drawable://" + R.drawable.common_tinsel);
        Butterfly B75  = new Butterfly(	"Common Treebrown",	"Lethe rohria neelgheriensis",	"drawable://" + R.drawable.common_tree_brown);
        Butterfly B76  = new Butterfly(	"Conjoined Swift",	"Pelopidas conjuncta narooa",	"drawable://" + R.drawable.conjoined_swift);
        Butterfly B77  = new Butterfly(	"Cornelian",	"Deudorix epijarbas epijarbus",	"drawable://" + R.drawable.cornelian);
        Butterfly B78  = new Butterfly(	"Crimson Rose",	"Pachliopta hector",	"drawable://" + R.drawable.crimson_rose);
        Butterfly B79  = new Butterfly(	"Crimson Tip",	"Colotis danae danae",	"drawable://" + R.drawable.crimson_tip);
        Butterfly B80  = new Butterfly(	"Cruiser",	"Vindula erota asela",	"drawable://" + R.drawable.cruiser_male);
        Butterfly B81  = new Butterfly(	"Danaid Eggfly",	"Hypolimnas misippus",	"drawable://" + R.drawable.danaid_eggfly_male);
        Butterfly B82  = new Butterfly(	"Dark Blue Tiger",	"Tirumala septentrionis musikanos",	"drawable://" + R.drawable.dark_blue_tiger);
        Butterfly B83  = new Butterfly(	"Dark Cerulean",	"Jamides bochus bochus",	"drawable://" + R.drawable.dark_cerulean);
        Butterfly B84  = new Butterfly(	"Dark Evening Brown",	"Melanitis phedima tambra",	"drawable://" + R.drawable.dark_evening_brown);
        Butterfly B85  = new Butterfly(	"Dark Grass Blue",	"Zizeeria karsandra",	"drawable://" + R.drawable.dark_grass_blue);
        Butterfly B86  = new Butterfly(	"Dark Palm Dart",	"Telicota bambusae lanka",	"drawable://" + R.drawable.dark_palm_dart);
        Butterfly B87  = new Butterfly(	"Dark Six Lineblue",	"Nacaduba calauria evansi",	"drawable://" + R.drawable.dark_sixline_blue_xxhd );
        Butterfly B88  = new Butterfly(	"Dark Wanderer",	"Pareronia ceylanica ceylanica",	"drawable://" + R.drawable.dark_wanderer);
        Butterfly B89  = new Butterfly(	"Dark-brand Bushbrown",	"Mycalesis mineus polydecta",	"drawable://" + R.drawable.darkbrand_bushbrown);
        Butterfly B90  = new Butterfly(	"Dingy Lineblue",	"Petrelaea dana",	"drawable://" + R.drawable.dingly_lineblue_xxhd );
        Butterfly B91  = new Butterfly(	"Double Branded Crow",	"Euploea sylvester montana",	"drawable://" + R.drawable.double_branded_crow);
        Butterfly B92  = new Butterfly(	"Five-bar Swordtail",	"Graphium antiphates ceylonicus ",	"drawable://" + R.drawable.fivebar_swordtail);
        Butterfly B93  = new Butterfly(	"Forget-me-not",	"Catochrysops strabo strabo",	"drawable://" + R.drawable.forget_me_not);
        Butterfly B94  = new Butterfly(	"Gaudy Baron",	"Euthalia lubentina psittacus",	"drawable://" + R.drawable.gaudy_baron);
        Butterfly B95  = new Butterfly(	"Giant Red Eye",	"Gangara thyrsis clothilda",	"drawable://" + R.drawable.giant_red_eye);
        Butterfly B96  = new Butterfly(	"Gladeye Bushbrown",	"Mycalesis patnia patnia ",	"drawable://" + R.drawable.gladeye_bushbrown);
        Butterfly B97  = new Butterfly(	"Glassy Tiger",	"Parantica aglea aglea ",	"drawable://" + R.drawable.glassy_tiger);
        Butterfly B98  = new Butterfly(	"Golden Angle",	"Caprona ransonnettii ransonnettii",	"drawable://" + R.drawable.golden_angle);
        Butterfly B99  = new Butterfly(	"Gram Blue",	"Euchrysops cnejus cnejus ",	"drawable://" + R.drawable.gram_blue);
        Butterfly B100  = new Butterfly(	"Grass Demon",	"Udaspes folus",	"drawable://" + R.drawable.grass_demon);
        Butterfly B101  = new Butterfly(	"Grass Jewel",	"Freyeria putli",	"drawable://" + R.drawable.grass_jewel);
        Butterfly B102  = new Butterfly(	"Great Crow",	"Euploea phaenareta corus ",	"drawable://" + R.drawable.great_crow);
        Butterfly B103  = new Butterfly(	"Great Eggfly",	"Hypolimnas bolina bolina",	"drawable://" + R.drawable.great_eggfly);
        Butterfly B104  = new Butterfly(	"Great Orange Tip",	"Hebomoia glaucippe ceylonica",	"drawable://" + R.drawable.great_orange_tip);
        Butterfly B105  = new Butterfly(	"Grey Pansy",	"Junonia atlites atlites",	"drawable://" + R.drawable.grey_pansy);
        Butterfly B106  = new Butterfly(	"Grizzled Skipper (Indian Skipper)",	"Spialia galba",	"drawable://" + R.drawable.grizzled_skipper);
        Butterfly B107  = new Butterfly(	"Hampson's Hedge Blue",	"Acytolepis lilacea moorei",	"drawable://" + R.drawable.hampsons_hedge_blue);
        Butterfly B108  = new Butterfly(	"Indian Sunbeam",	"Curetis thetis",	"drawable://" + R.drawable.indian_sunbeam);
        Butterfly B109  = new Butterfly(	"Indigo Flash",	"Rapala varuna lazulina",	"drawable://" + R.drawable.indigo_flash_xxhd );
        Butterfly B110  = new Butterfly(	"Jezebel",	"Delias eucharis",	"drawable://" + R.drawable.jezebel);
        Butterfly B111  = new Butterfly(	"Joker",	"Byblia ilithyia",	"drawable://" + R.drawable.joker);
        Butterfly B112  = new Butterfly(	"Lace Wing",	"Cethosia nietneri nietneri ",	"drawable://" + R.drawable.lace_wing);
        Butterfly B113  = new Butterfly(	"Large Branded Swift",	"Pelopidas subochracea subochracea",	"drawable://" + R.drawable.large_branded_swift);
        Butterfly B114  = new Butterfly(	"Large Four Lineblue",	"Nacaduba pactolus ceylonica",	"drawable://" + R.drawable.large_four_lineblue);
        Butterfly B115  = new Butterfly(	"Large Guava Blue",	"Virachola perse ghela",	"drawable://" + R.drawable.large_guava_blue_xxhd );
        Butterfly B116  = new Butterfly(	"Large Oakblue",	"Arhopala amantes amantes ",	"drawable://" + R.drawable.large_oakblue);
        Butterfly B117  = new Butterfly(	"Large Salmon Arab",	"Colotis fausta fulvia",	"drawable://" + R.drawable.large_salmon_arab);
        Butterfly B118  = new Butterfly(	"Lemon Emigrant",	"Catopsilia pomona",	"drawable://" + R.drawable.lemon_emigrant);
        Butterfly B119  = new Butterfly(	"Lemon Pansy",	"Junonia lemonias vaisya",	"drawable://" + R.drawable.lemon_pansy);
        Butterfly B120  = new Butterfly(	"Lesser Grass Blue",	"Zizina otis indica",	"drawable://" + R.drawable.lesser_grass_blue_xxhd );
        Butterfly B121  = new Butterfly(	"Lesser Gull",	"Cepora nadina cingala",	"drawable://" + R.drawable.lesser_gull);
        Butterfly B122  = new Butterfly(	"Lime Blue",	"Chilades lajus lajus",	"drawable://" + R.drawable.lime_blue);
        Butterfly B123  = new Butterfly(	"Lime Butterfly",	"Papilio demoleus demoleus",	"drawable://" + R.drawable.lime_butterfly);
        Butterfly B124  = new Butterfly(	"Little Branded Swift",	"Pelopidas agna agna",	"drawable://" + R.drawable.little_branded_swift);
        Butterfly B125  = new Butterfly(	"Little Orange Tip",	"Colotis etrida limbata",	"drawable://" + R.drawable.little_orange_tip);
        Butterfly B126  = new Butterfly(	"Long-banded Silverline",	"Spindasis lohita lazularia",	"drawable://" + R.drawable.long_banded_silverline);
        Butterfly B127  = new Butterfly(	"Malabar Flash",	"Rapala lankana",	"drawable://" + R.drawable.malabar_flash);
        Butterfly B128  = new Butterfly(	"Malayan",	"Megisba malaya thwaitesi",	"drawable://" + R.drawable.malayan);
        Butterfly B129  = new Butterfly(	"Medus Brown (Nigger)",	"Orsotriaena medus mandata",	"drawable://" + R.drawable.medus_brown);
        Butterfly B130  = new Butterfly(	"Metallic Cerulean",	"Jamides alecto meilichius",	"drawable://" + R.drawable.metallic_cerulean);
        Butterfly B131  = new Butterfly(	"Mime",	"Papilio clytia lankeswara",	"drawable://" + R.drawable.mime_2_dissimillis);
        Butterfly B132  = new Butterfly(	"Monkey-puzzle",	"Rathinda amor",	"drawable://" + R.drawable.monkey_puzzle);
        Butterfly B133  = new Butterfly(	"Mottled Emigrant",	"Catopsilia pyranthe pyranthe",	"drawable://" + R.drawable.mottled_emigrant);
        Butterfly B134  = new Butterfly(	"Nawab",	"Charaxes athamas athamas",	"drawable://" + R.drawable.nawab);
        Butterfly B135  = new Butterfly(	"Nilgiri Tit",	"Hypolycaena nilgirica",	"drawable://" + R.drawable.nilgiri_tit);
        Butterfly B136  = new Butterfly(	"Opaque Six Lineblue",	"Nacaduba beroe minima",	"drawable://" + R.drawable.opaque_six_lineblue);
        Butterfly B137  = new Butterfly(	"Orange Migrant",	"Catopsilia scylla",	"drawable://" + R.drawable.orange_emigrant);
        Butterfly B138  = new Butterfly(	"Orange-tailed Awl",	"Bibasis sena sena",	"drawable://" + R.drawable.orange_tailed_awl);
        Butterfly B139  = new Butterfly(	"Oriental Common Awl (Ceylon Awl)",	"Hasora badra lanka",	"drawable://" + R.drawable.oriental_common_awl);
        Butterfly B140  = new Butterfly(	"Oriental Cupid (Indian Cupid)",	"Everes lacturnus lacturnus",	"drawable://" + R.drawable.oriental_cupid);
        Butterfly B141  = new Butterfly(	"Oriental Palm Bob (Indian Palm Bob)",	" Suastus gremius subgrisea",	"drawable://" + R.drawable.oriental_palm_bob);
        Butterfly B142  = new Butterfly(	"Painted Lady",	"Vanessa cardui",	"drawable://" + R.drawable.painted_lady);
        Butterfly B143  = new Butterfly(	"Painted Sawtooth",	"Prioneris sita",	"drawable://" + R.drawable.painted_sawtooth);
        Butterfly B144  = new Butterfly(	"Pale Four Lineblue",	"Nacaduba hermus sidoma",	"drawable://" + R.drawable.pale_four_lineblue);
        Butterfly B145  = new Butterfly(	"Pale Palm Dart",	"Telicota colon kala",	"drawable://" + R.drawable.pale_palm_dart);
        Butterfly B146  = new Butterfly(	"Pallid Dart (Indian Dart)",	"Potanthus pallida",	"drawable://" + R.drawable.pallid_dart);
        Butterfly B147  = new Butterfly(	"Pea Blue",	"Lampides boeticus",	"drawable://" + R.drawable.pea_blue);
        Butterfly B148  = new Butterfly(	"Peacock Pansy",	"Junonia almana almana",	"drawable://" + R.drawable.peacock_pansy);
        Butterfly B149  = new Butterfly(	"Peacock Royal",	"Tajuria cippus longinus",	"drawable://" + R.drawable.peacock_royal);
        Butterfly B150  = new Butterfly(	"Philippine Swift",	"Caltoris philippina seriata",	"drawable://" + R.drawable.philippine_swift_xxhd );
        Butterfly B151  = new Butterfly(	"Pioneer",	"Belenois aurota taprobana",	"drawable://" + R.drawable.pioneer);
        Butterfly B152  = new Butterfly(	"Plain Hedge Blue",	"Celastrina lavendularis lavendularis",	"drawable://" + R.drawable.plain_hedge_blue);
        Butterfly B153  = new Butterfly(	"Plain Orange Tip",	"Colotis aurora",	"drawable://" + R.drawable.plain_orange_tip);
        Butterfly B154  = new Butterfly(	"Plain Puffin",	"Appias indra narendra",	"drawable://" + R.drawable.plain_puffin);
        Butterfly B155  = new Butterfly(	"Plain Tiger",	"Danaus chrysippus chrysippu",	"drawable://" + R.drawable.plain_tiger);
        Butterfly B156  = new Butterfly(	"Plains Blue Royal",	"Tajuria jehana ceylanica",	"drawable://" + R.drawable.plains_blue_royal);
        Butterfly B157  = new Butterfly(	"Plains Cupid",	"Chilades pandava lanka",	"drawable://" + R.drawable.plains_cupid);
        Butterfly B158  = new Butterfly(	"Plane",	"Bindahara phocides moorei",	"drawable://" + R.drawable.plane_male_xxhd );
        Butterfly B159  = new Butterfly(	"Plum Judy",	"Abisara echerius prunosa",	"drawable://" + R.drawable.plum_judy);
        Butterfly B160  = new Butterfly(	"Plumbeous Silverline",	"Spindasis schistacea",	"drawable://" + R.drawable.plumbeous_silverline);
        Butterfly B161  = new Butterfly(	"Pointed Ciliate Blue",	"Anthene lycaenina lycaenina",	"drawable://" + R.drawable.pointed_ciliate_blue);
        Butterfly B162  = new Butterfly(	"Pointed Lineblue",	"Lonolyce helicon viola",	"drawable://" + R.drawable.pointed_lineblue);
        Butterfly B163  = new Butterfly(	"Psyche",	"Leptosia nina nina",	"drawable://" + R.drawable.psyche);
        Butterfly B164  = new Butterfly(	"Purple Leaf Blue",	"Amblypodia anita naradoides ",	"drawable://" + R.drawable.purple_leaf_blue);
        Butterfly B165  = new Butterfly(	"Quaker",	"Neopithecops zalmora dharma",	"drawable://" + R.drawable.quaker);
        Butterfly B166  = new Butterfly(	"Red Admiral",	"Vanessa indica nubicola",	"drawable://" + R.drawable.red_admiral);
        Butterfly B167  = new Butterfly(	"Red Flash",	"Rapala iarbus sorya",	"drawable://" + R.drawable.red_flash_xxhd );
        Butterfly B168  = new Butterfly(	"Red Helen",	"Papilio helenus mooreanus ",	"drawable://" + R.drawable.red_helen);
        Butterfly B169  = new Butterfly(	"Red Pierrot",	"Talicada nyseus nyseus",	"drawable://" + R.drawable.red_pierrot);
        Butterfly B170  = new Butterfly(	"Redspot",	"Zesius chrysomallus",	"drawable://" + R.drawable.redspot);
        Butterfly B171  = new Butterfly(	"Redspot Duke",	"Dophla evelina evelina",	"drawable://" + R.drawable.redspot_duke);
        Butterfly B172  = new Butterfly(	"Restricted Demon",	"Notocrypta curvifascia curvifascia",	"drawable://" + R.drawable.restricted_demon);
        Butterfly B173  = new Butterfly(	"Rounded Palm Red Eye",	"Erionota torus",	"drawable://" + R.drawable.rounded_palm_red_eye);
        Butterfly B174  = new Butterfly(	"Rounded Six Lineblue",	"Nacaduba berenice ormistoni",	"drawable://" + R.drawable.rounded_six_lineblue);
        Butterfly B175  = new Butterfly(	"Rustic",	"Cupha erymanthis placida",	"drawable://" + R.drawable.rustic);
        Butterfly B176  = new Butterfly(	"Scarce Shot Silverline",	"Spindasis elima fairliei",	"drawable://" + R.drawable.scarce_shot_silverline_male_xxhd );
        Butterfly B177  = new Butterfly(	"Shiva Sunbeam",	"Curetis siva",	"drawable://" + R.drawable.shiva_sunbeam);
        Butterfly B178  = new Butterfly(	"Silver Forget-me-not",	"Catochrysops panormus panormus",	"drawable://" + R.drawable.silver_forget_me_not);
        Butterfly B179  = new Butterfly(	"Silver Streak Blue",	"Iraota timoleon nicevillei",	"drawable://" + R.drawable.silver_streak_blue);
        Butterfly B180  = new Butterfly(	"Slate Flash",	"Rapala manea schistacea",	"drawable://" + R.drawable.slate_flash);
        Butterfly B181  = new Butterfly(	"Small Branded Swift",	"Pelopidas mathias mathias",	"drawable://" + R.drawable.small_branded_swift);
        Butterfly B182  = new Butterfly(	"Small Cupid",	"Chilades parrhasius nila",	"drawable://" + R.drawable.small_cupid);
        Butterfly B183  = new Butterfly(	"Small Grass Yellow",	"Eurema brigitta rubella",	"drawable://" + R.drawable.small_grass_yellow);
        Butterfly B184  = new Butterfly(	"Small Leopard",	"Phalanta alcippe ceylonica",	"drawable://" + R.drawable.small_leopard);
        Butterfly B185  = new Butterfly(	"Small Palm Bob (Ceylon Palm Bob)",	"Suastus minuta minuta",	"drawable://" + R.drawable.small_palm_bob);
        Butterfly B186  = new Butterfly(	"Small Salmon Arab",	"Colotis amata modesta",	"drawable://" + R.drawable.small_salmon_arab);
        Butterfly B187  = new Butterfly(	"Smallest Swift",	"Parnara bada bada",	"drawable://" + R.drawable.smallest_swift);
        Butterfly B188  = new Butterfly(	"Southern Duffer",	"Discophora lepida ceylonica",	"drawable://" + R.drawable.southern_duffer);
        Butterfly B189  = new Butterfly(	"Spot Swordtail",	"Graphium nomius nomius",	"drawable://" + R.drawable.spot_swordtail);
        Butterfly B190  = new Butterfly(	"Spotless Grass Yellow",	"Eurema laeta rama",	"drawable://" + R.drawable.spotless_grass_yellow);
        Butterfly B191  = new Butterfly(	"Sri Lankan Birdwing",	"Troides darsius",	"drawable://" + R.drawable.srilanka_bird_wing);
        Butterfly B192  = new Butterfly(	"Sri Lankan Black Flat",	"Celaenorrhinus spilothyrus",	"drawable://" + R.drawable.srilankan_black_flat_email_the_owner);
        Butterfly B193  = new Butterfly(	"Sri Lankan Blue Oak Leaf",	"Kallima philarchus",	"drawable://" + R.drawable.srilankan_blue_oak_leaf);
        Butterfly B194  = new Butterfly(	"Sri Lankan Cerulean",	"Jamides coruscans", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B195  = new Butterfly(	"Sri Lankan Cingalese Bushbrown",	"Mycalesis rama",	"drawable://" + R.drawable.srilankan_cingalese_bushbrown);
        Butterfly B196  = new Butterfly(	"Sri Lankan Clouded Silverline",	"Spindasis nubilus",	"drawable://" + R.drawable.srilankan_clouded_silverline);
        Butterfly B197  = new Butterfly(	"Sri Lankan Dart (Tropic Dart)",	"Potanthus satra",	"drawable://" + R.drawable.srilankan_dart);
        Butterfly B198  = new Butterfly(	"Sri Lankan Decorated Ace",	"Thoressa decorata", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B199  = new Butterfly(	"Sri Lankan Forester",	"Lethe dynsate",	"drawable://" + R.drawable.srilankan_forester);
        Butterfly B200  = new Butterfly(	"Sri Lankan Green's Silverline",	"Spindasis greeni",	"drawable://" + "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B201  = new Butterfly(	"Sri Lankan Hedge Blue",	"Udara lanka",	"drawable://" + R.drawable.srilankan_hedge_blue);
        Butterfly B202  = new Butterfly(	"Sri Lankan Hedge Hopper",	"Baracus vittatus",	"drawable://" + R.drawable.srilanka_hedge_hopper);
        Butterfly B203  = new Butterfly(	"Sri Lankan Highland Ace (Rare Ace)",	"Halpe egena", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B204  = new Butterfly(	"Sri Lankan Indigo Royal",	"Tajuria arida", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B205  = new Butterfly(	"Sri Lankan Jewel Four-ring",	"Ypthima singala",	"drawable://" + R.drawable.srilanka_jewel_four_ring);
        Butterfly B206  = new Butterfly(	"Sri Lankan Lesser Albatross",	"Appias galene",	"drawable://" + R.drawable.srilankan_lesser_albatross);
        Butterfly B207  = new Butterfly(	"Sri Lankan Lowland Ace (Ceylon Ace)",	"Halpe ceylonica", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B208  = new Butterfly(	"Sri Lankan Milky Cerulean",	"Jamides lacteata",	"drawable://" + R.drawable.srilankan_milky_cerulean);
        Butterfly B209  = new Butterfly(	"Sri Lankan One-spot Grass Yellow",	"Eurema ormistoni",	"drawable://" + R.drawable.srilankan_onespot_grass_yellow);
        Butterfly B210  = new Butterfly(	"Sri Lankan Ormiston's Oakblue",	"Arhopala ormistoni", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B211  = new Butterfly(	"Sri Lankan Paint Brush Swift",	"Baoris penicillata", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B212  = new Butterfly(	"Sri Lankan Pale Six Lineblue",	"Nacaduba sinhala",	"drawable://" + R.drawable.srilankan_pale_six_lineblue);
        Butterfly B213  = new Butterfly(	"Sri Lankan Palmfly",	"Elymnias singhala",	"drawable://" + R.drawable.srilankan_palmfly);
        Butterfly B214  = new Butterfly(	"Sri Lankan Pied Flat",	"Coladenia tissa",	"drawable://" + R.drawable.srilankan_pied_flat);
        Butterfly B215  = new Butterfly(	"Sri Lankan Rose",	"Pachliopta jophon",	"drawable://" + R.drawable.srilankan_rose);
        Butterfly B216  = new Butterfly(	"Sri Lankan Singalese Hedge Blue",	"Udara singalensis", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B217  = new Butterfly(	"Sri Lankan Tamil Bushbrown",	"Mycalesis subdita",	"drawable://" + R.drawable.srilankan_tamil_bushbrown);
        Butterfly B218  = new Butterfly(	"Sri Lankan Tiger",	"Parantica taprobana",	"drawable://" + R.drawable.srilankan_tiger);
        Butterfly B219  = new Butterfly(	"Sri Lankan Tree-nymph",	"Idea iasonia",	"drawable://" + R.drawable.srilanka_tree_nymph);
        Butterfly B220  = new Butterfly(	"Sri Lankan Treebrown",	"Lethe daretis",	"drawable://" + R.drawable.srilanka_treebrown);
        Butterfly B221  = new Butterfly(	"Sri Lankan Woodhouse's Four Lineblue",	"Nacaduba ollyetti", "drawable://" + R.drawable.final_splash_logo2);
        Butterfly B222  = new Butterfly(	"Striped Albatross",	"Appias libythea libythea",	"drawable://" + R.drawable.striped_albatross);
        Butterfly B223  = new Butterfly(	"Striped Pierrot",	"Tarucus nara",	"drawable://" + R.drawable.striped_pierrot);
        Butterfly B224  = new Butterfly(	"Tail-less Lineblue",	"Prosotas dubiosa indica",	"drawable://" + R.drawable.tail_less_lineblue);
        Butterfly B225  = new Butterfly(	"Tailed Jay",	"Graphium agamemnon menides",	"drawable://" + R.drawable.tailed_jay);
        Butterfly B226  = new Butterfly(	"Tamil Oakblue",	"Arhopala bazaloides lanka",	"drawable://" + R.drawable.tamil_oakblue);
        Butterfly B227  = new Butterfly(	"Tamil Treebrown",	"Lethe drypetis drypetis",	"drawable://" + R.drawable.tamil_treebrown);
        Butterfly B228  = new Butterfly(	"Tamil Yeoman",	"Cirrochroa thais lanka",	"drawable://" + R.drawable.tamil_yeoman);
        Butterfly B229  = new Butterfly(	"Tawny Coster",	"Acraea terpsicore",	"drawable://" + R.drawable.tawny_coster);
        Butterfly B230  = new Butterfly(	"Tawny Rajah",	"Charaxes psaphon psaphon",	"drawable://" + R.drawable.tawny_rajah);
        Butterfly B231  = new Butterfly(	"Three-spot Grass Yellow",	"Eurema blanda citrina",	"drawable://" + R.drawable.threespot_grass_yellow);
        Butterfly B232  = new Butterfly(	"Tiny Grass Blue",	"Zizula hylax hylax",	"drawable://" + R.drawable.tiny_grass_blue);
        Butterfly B233  = new Butterfly(	"Transparent Six Lineblue",	"Nacaduba kurava prominens",	"drawable://" + R.drawable.transparent_six_lineblue);
        Butterfly B234  = new Butterfly(	"Tree Flitter",	"Hyarotis adrastus adrastus",	"drawable://" + R.drawable.tree_flitter);
        Butterfly B235  = new Butterfly(	"Tropical Fritillary (Indian Fritillary)",	"Argynnis hyperbius taprobana",	"drawable://" + R.drawable.tropical_fritillary);
        Butterfly B236  = new Butterfly(	"Wallace's Swift",	"Borbo cinnara",	"drawable://" + R.drawable.wallaces_swift);
        Butterfly B237 = new Butterfly(	"Water Snow Flat",	"Tagiades litigiosa ceylonica",	"drawable://" + R.drawable.water_snow_flat);
        Butterfly B238  = new Butterfly(	"White Banded Awl",	"Hasora taminatus",	"drawable://" + R.drawable.white_banded_awl);
        Butterfly B239  = new Butterfly(	"White Four-ring",	"Ypthima ceylonica",	"drawable://" + R.drawable.white_four_ring);
        Butterfly B240  = new Butterfly(	"White Hedge Blue",	"Udara akasa mavisa",	"drawable://" + R.drawable.white_hedge_blue);
        Butterfly B241  = new Butterfly(	"White Orange Tip",	"Ixias marianne",	"drawable://" + R.drawable.white_orange_tip);
        Butterfly B242  = new Butterfly(	"White Royal",	"Pratapa deva deva",	"drawable://" + R.drawable.white_royal);
        Butterfly B243  = new Butterfly(	"White-tipped Lineblue",	"Prosotas noreia noreia",	"drawable://" + R.drawable.white_tripped_lineblue);
        Butterfly B244  = new Butterfly(	"Yamfly",	"Loxura atymnus arcuata",	"drawable://" + R.drawable.yamfly);
        Butterfly B245  = new Butterfly(	"Yellow Orange Tip",	"Ixias pyrene cingalensis",	"drawable://" + R.drawable.yellow_orange_tip);
        Butterfly B246  = new Butterfly(	"Yellow Palm Dart",	"Cephrenes trichopepla",	"drawable://" + R.drawable.yellow_palm_dart);
        Butterfly B247  = new Butterfly(	"Yellow Pansy",	"Junonia hierta",	"drawable://" + R.drawable.yellow_pansy);
        Butterfly B248  = new Butterfly(	"Zebra Blue",	"Leptotes plinius plinius",	"drawable://" + R.drawable.zebra_blue);
        Butterfly B249  = new Butterfly(	"  ",	"     ",	"drawable://" );


        //Add the Butterfly objects to an ArrayList
        peopleList.add(B1);
        peopleList.add(B2);
        peopleList.add(B3);
        peopleList.add(B4);
        peopleList.add(B5);
        peopleList.add(B6);
        peopleList.add(B7);
        peopleList.add(B8);
        peopleList.add(B9);
        peopleList.add(B10);
        peopleList.add(B11);
        peopleList.add(B12);
        peopleList.add(B13);
        peopleList.add(B14);
        peopleList.add(B15);
        peopleList.add(B16);
        peopleList.add(B17);
        peopleList.add(B18);
        peopleList.add(B19);
        peopleList.add(B20);
        peopleList.add(B21);
        peopleList.add(B22);
        peopleList.add(B23);
        peopleList.add(B24);
        peopleList.add(B25);
        peopleList.add(B26);
        peopleList.add(B27);
        peopleList.add(B28);
        peopleList.add(B29);
        peopleList.add(B30);
        peopleList.add(B31);
        peopleList.add(B32);
        peopleList.add(B33);
        peopleList.add(B34);
        peopleList.add(B35);
        peopleList.add(B36);
        peopleList.add(B37);
        peopleList.add(B38);
        peopleList.add(B39);
        peopleList.add(B40);
        peopleList.add(B41);
        peopleList.add(B42);
        peopleList.add(B43);
        peopleList.add(B44);
        peopleList.add(B45);
        peopleList.add(B46);
        peopleList.add(B47);
        peopleList.add(B48);
        peopleList.add(B49);
        peopleList.add(B50);
        peopleList.add(B51);
        peopleList.add(B52);
        peopleList.add(B53);
        peopleList.add(B54);
        peopleList.add(B55);
        peopleList.add(B56);
        peopleList.add(B57);
        peopleList.add(B58);
        peopleList.add(B59);
        peopleList.add(B60);
        peopleList.add(B61);
        peopleList.add(B62);
        peopleList.add(B63);
        peopleList.add(B64);
        peopleList.add(B65);
        peopleList.add(B66);
        peopleList.add(B67);
        peopleList.add(B68);
        peopleList.add(B69);
        peopleList.add(B70);
        peopleList.add(B71);
        peopleList.add(B72);
        peopleList.add(B73);
        peopleList.add(B74);
        peopleList.add(B75);
        peopleList.add(B76);
        peopleList.add(B77);
        peopleList.add(B78);
        peopleList.add(B79);
        peopleList.add(B80);
        peopleList.add(B81);
        peopleList.add(B82);
        peopleList.add(B83);
        peopleList.add(B84);
        peopleList.add(B85);
        peopleList.add(B86);
        peopleList.add(B87);
        peopleList.add(B88);
        peopleList.add(B89);
        peopleList.add(B90);
        peopleList.add(B91);
        peopleList.add(B92);
        peopleList.add(B93);
        peopleList.add(B94);
        peopleList.add(B95);
        peopleList.add(B96);
        peopleList.add(B97);
        peopleList.add(B98);
        peopleList.add(B99);
        peopleList.add(B100);
        peopleList.add(B101);
        peopleList.add(B102);
        peopleList.add(B103);
        peopleList.add(B104);
        peopleList.add(B105);
        peopleList.add(B106);
        peopleList.add(B107);
        peopleList.add(B108);
        peopleList.add(B109);
        peopleList.add(B110);
        peopleList.add(B111);
        peopleList.add(B112);
        peopleList.add(B113);
        peopleList.add(B114);
        peopleList.add(B115);
        peopleList.add(B116);
        peopleList.add(B117);
        peopleList.add(B118);
        peopleList.add(B119);
        peopleList.add(B120);
        peopleList.add(B121);
        peopleList.add(B122);
        peopleList.add(B123);
        peopleList.add(B124);
        peopleList.add(B125);
        peopleList.add(B126);
        peopleList.add(B127);
        peopleList.add(B128);
        peopleList.add(B129);
        peopleList.add(B130);
        peopleList.add(B131);
        peopleList.add(B132);
        peopleList.add(B133);
        peopleList.add(B134);
        peopleList.add(B135);
        peopleList.add(B136);
        peopleList.add(B137);
        peopleList.add(B138);
        peopleList.add(B139);
        peopleList.add(B140);
        peopleList.add(B141);
        peopleList.add(B142);
        peopleList.add(B143);
        peopleList.add(B144);
        peopleList.add(B145);
        peopleList.add(B146);
        peopleList.add(B147);
        peopleList.add(B148);
        peopleList.add(B149);
        peopleList.add(B150);
        peopleList.add(B151);
        peopleList.add(B152);
        peopleList.add(B153);
        peopleList.add(B154);
        peopleList.add(B155);
        peopleList.add(B156);
        peopleList.add(B157);
        peopleList.add(B158);
        peopleList.add(B159);
        peopleList.add(B160);
        peopleList.add(B161);
        peopleList.add(B162);
        peopleList.add(B163);
        peopleList.add(B164);
        peopleList.add(B165);
        peopleList.add(B166);
        peopleList.add(B167);
        peopleList.add(B168);
        peopleList.add(B169);
        peopleList.add(B170);
        peopleList.add(B171);
        peopleList.add(B172);
        peopleList.add(B173);
        peopleList.add(B174);
        peopleList.add(B175);
        peopleList.add(B176);
        peopleList.add(B177);
        peopleList.add(B178);
        peopleList.add(B179);
        peopleList.add(B180);
        peopleList.add(B181);
        peopleList.add(B182);
        peopleList.add(B183);
        peopleList.add(B184);
        peopleList.add(B185);
        peopleList.add(B186);
        peopleList.add(B187);
        peopleList.add(B188);
        peopleList.add(B189);
        peopleList.add(B190);
        peopleList.add(B191);
        peopleList.add(B192);
        peopleList.add(B193);
        peopleList.add(B194);
        peopleList.add(B195);
        peopleList.add(B196);
        peopleList.add(B197);
        peopleList.add(B198);
        peopleList.add(B199);
        peopleList.add(B200);
        peopleList.add(B201);
        peopleList.add(B202);
        peopleList.add(B203);
        peopleList.add(B204);
        peopleList.add(B205);
        peopleList.add(B206);
        peopleList.add(B207);
        peopleList.add(B208);
        peopleList.add(B209);
        peopleList.add(B210);
        peopleList.add(B211);
        peopleList.add(B212);
        peopleList.add(B213);
        peopleList.add(B214);
        peopleList.add(B215);
        peopleList.add(B216);
        peopleList.add(B217);
        peopleList.add(B218);
        peopleList.add(B219);
        peopleList.add(B220);
        peopleList.add(B221);
        peopleList.add(B222);
        peopleList.add(B223);
        peopleList.add(B224);
        peopleList.add(B225);
        peopleList.add(B226);
        peopleList.add(B227);
        peopleList.add(B228);
        peopleList.add(B229);
        peopleList.add(B230);
        peopleList.add(B231);
        peopleList.add(B232);
        peopleList.add(B233);
        peopleList.add(B234);
        peopleList.add(B235);
        peopleList.add(B236);
        peopleList.add(B237);
        peopleList.add(B238);
        peopleList.add(B239);
        peopleList.add(B240);
        peopleList.add(B241);
        peopleList.add(B242);
        peopleList.add(B243);
        peopleList.add(B244);
        peopleList.add(B245);
        peopleList.add(B246);
        peopleList.add(B247);
        peopleList.add(B248);
        peopleList.add(B249);




        adapter = new ButterflyListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setScrollingCacheEnabled(false);
        mListView.setFriction( ViewConfiguration.getScrollFriction()  * 4 );
        mListView.setAdapter(adapter);

    }

    /////////////////////////////////////////////////////////search view//////////////////////////////////////////////////////////
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
                    mListView.clearTextFilter();
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


