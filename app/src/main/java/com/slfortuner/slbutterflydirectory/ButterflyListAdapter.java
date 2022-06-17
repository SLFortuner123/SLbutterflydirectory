package com.slfortuner.slbutterflydirectory;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.slfortuner.slbutterflydirectory.u10.Banded_Blue_Pierrot;
import com.slfortuner.slbutterflydirectory.u100.Grass_Demon;
import com.slfortuner.slbutterflydirectory.u101.Grass_Jewel;
import com.slfortuner.slbutterflydirectory.u102.Great_Crow;
import com.slfortuner.slbutterflydirectory.u103.Great_Eggfly;
import com.slfortuner.slbutterflydirectory.u104.Great_Orange_Tip;
import com.slfortuner.slbutterflydirectory.u105.Grey_Pansy;
import com.slfortuner.slbutterflydirectory.u106.Grizzled_Skipper;
import com.slfortuner.slbutterflydirectory.u107.Hampsons_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u108.Indian_Sunbeam;
import com.slfortuner.slbutterflydirectory.u109.Indigo_Flash;
import com.slfortuner.slbutterflydirectory.u11.Banded_Peacock;
import com.slfortuner.slbutterflydirectory.u110.Jezebel;
import com.slfortuner.slbutterflydirectory.u111.Joker;
import com.slfortuner.slbutterflydirectory.u112.Lace_Wing;
import com.slfortuner.slbutterflydirectory.u113.Large_Branded_Swift;
import com.slfortuner.slbutterflydirectory.u114.Large_Four_Lineblue;
import com.slfortuner.slbutterflydirectory.u115.Large_Guava_Blue;
import com.slfortuner.slbutterflydirectory.u116.Large_Oakblue;
import com.slfortuner.slbutterflydirectory.u117.Large_Salmon_Arab;
import com.slfortuner.slbutterflydirectory.u118.Lemon_Emigrant;
import com.slfortuner.slbutterflydirectory.u119.Lemon_Pansy;
import com.slfortuner.slbutterflydirectory.u12.Banded_Red_Eye;
import com.slfortuner.slbutterflydirectory.u120.Lesser_Grass_Blue;
import com.slfortuner.slbutterflydirectory.u121.Lesser_Gull;
import com.slfortuner.slbutterflydirectory.u122.Lime_Blue;
import com.slfortuner.slbutterflydirectory.u123.Lime_Butterfly;
import com.slfortuner.slbutterflydirectory.u124.Little_Branded_Swift;
import com.slfortuner.slbutterflydirectory.u125.Little_Orange_Tip;
import com.slfortuner.slbutterflydirectory.u126.Long_Banded_Silverline;
import com.slfortuner.slbutterflydirectory.u127.Malabar_Flash;
import com.slfortuner.slbutterflydirectory.u128.Malayan;
import com.slfortuner.slbutterflydirectory.u129.Medus_Brown;
import com.slfortuner.slbutterflydirectory.u13.Baron;
import com.slfortuner.slbutterflydirectory.u130.Metallic_Cerulean;
import com.slfortuner.slbutterflydirectory.u131.Mime;
import com.slfortuner.slbutterflydirectory.u132.Monkey_Puzzle;
import com.slfortuner.slbutterflydirectory.u133.Mottled_Emigrant;
import com.slfortuner.slbutterflydirectory.u134.Nawab;
import com.slfortuner.slbutterflydirectory.u135.Nilgiri_Tit;
import com.slfortuner.slbutterflydirectory.u136.Opaque_Six_Lineblue;
import com.slfortuner.slbutterflydirectory.u137.Orange_Migrant;
import com.slfortuner.slbutterflydirectory.u138.Orange_Tailed_Awl;
import com.slfortuner.slbutterflydirectory.u139.Oriental_Common_Awl;
import com.slfortuner.slbutterflydirectory.u14.Baronet;
import com.slfortuner.slbutterflydirectory.u140.Oriental_Cupid;
import com.slfortuner.slbutterflydirectory.u141.Oriental_Palm_Bob;
import com.slfortuner.slbutterflydirectory.u142.Painted_Lady;
import com.slfortuner.slbutterflydirectory.u143.Painted_Sawtooth;
import com.slfortuner.slbutterflydirectory.u144.Pale_Four_Lineblue;
import com.slfortuner.slbutterflydirectory.u145.Pale_Palm_Dart;
import com.slfortuner.slbutterflydirectory.u146.Pallid_Dart;
import com.slfortuner.slbutterflydirectory.u147.Pea_Blue;
import com.slfortuner.slbutterflydirectory.u148.Peacock_Pansy;
import com.slfortuner.slbutterflydirectory.u149.Peacock_Royal;
import com.slfortuner.slbutterflydirectory.u15.Beak;
import com.slfortuner.slbutterflydirectory.u150.Philippine_Swift;
import com.slfortuner.slbutterflydirectory.u151.Pioneer;
import com.slfortuner.slbutterflydirectory.u152.Plain_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u153.Plain_Orange_Tip;
import com.slfortuner.slbutterflydirectory.u154.Plain_Puffin;
import com.slfortuner.slbutterflydirectory.u155.Plain_Tiger;
import com.slfortuner.slbutterflydirectory.u156.Plains_Blue_Royal;
import com.slfortuner.slbutterflydirectory.u157.Plains_Cupid;
import com.slfortuner.slbutterflydirectory.u158.Plane;
import com.slfortuner.slbutterflydirectory.u159.Plum_Judy;
import com.slfortuner.slbutterflydirectory.u16.Black_Angle;
import com.slfortuner.slbutterflydirectory.u160.Plumbeous_Silverline;
import com.slfortuner.slbutterflydirectory.u161.Pointed_Ciliate_Blue;
import com.slfortuner.slbutterflydirectory.u162.Pointed_Lineblue;
import com.slfortuner.slbutterflydirectory.u163.Psyche;
import com.slfortuner.slbutterflydirectory.u164.Purple_Leaf_Blue;
import com.slfortuner.slbutterflydirectory.u165.Quaker;
import com.slfortuner.slbutterflydirectory.u166.Red_Admiral;
import com.slfortuner.slbutterflydirectory.u167.Red_Flash;
import com.slfortuner.slbutterflydirectory.u168.Red_Helen;
import com.slfortuner.slbutterflydirectory.u169.Red_Pierrot;
import com.slfortuner.slbutterflydirectory.u17.Black_Prince;
import com.slfortuner.slbutterflydirectory.u170.Redspot;
import com.slfortuner.slbutterflydirectory.u171.Redspot_Duke;
import com.slfortuner.slbutterflydirectory.u172.Restricted_Demon;
import com.slfortuner.slbutterflydirectory.u173.Rounded_Palm_Red_Eye;
import com.slfortuner.slbutterflydirectory.u174.Rounded_Six_Lineblue;
import com.slfortuner.slbutterflydirectory.u175.Rustic;
import com.slfortuner.slbutterflydirectory.u176.Scarce_Shot_Silverline;
import com.slfortuner.slbutterflydirectory.u177.Silver_Forget_Me_Not;
import com.slfortuner.slbutterflydirectory.u178.Silver_Streak_Blue;
import com.slfortuner.slbutterflydirectory.u179.Slate_Flash;
import com.slfortuner.slbutterflydirectory.u18.Black_Rajah;
import com.slfortuner.slbutterflydirectory.u180.Small_Branded_Swift;
import com.slfortuner.slbutterflydirectory.u181.Small_Cupid;
import com.slfortuner.slbutterflydirectory.u182.Small_Grass_Yellow;
import com.slfortuner.slbutterflydirectory.u183.Small_Leopard;
import com.slfortuner.slbutterflydirectory.u184.Small_Palm_Bob;
import com.slfortuner.slbutterflydirectory.u185.Small_Salmon_Arab;
import com.slfortuner.slbutterflydirectory.u186.Smallest_Swift;
import com.slfortuner.slbutterflydirectory.u187.Southern_Duffer;
import com.slfortuner.slbutterflydirectory.u188.Spot_Swordtail;
import com.slfortuner.slbutterflydirectory.u189.Spotless_Grass_Yellow;
import com.slfortuner.slbutterflydirectory.u19.Blank_Swift;
import com.slfortuner.slbutterflydirectory.u190.Sri_Lankan_Birdwing;
import com.slfortuner.slbutterflydirectory.u191.Sri_Lankan_Black_Flat;
import com.slfortuner.slbutterflydirectory.u192.Sri_Lankan_Blue_Oak_Leaf;
import com.slfortuner.slbutterflydirectory.u193.Sri_Lankan_Cerulean;
import com.slfortuner.slbutterflydirectory.u194.Sri_Lankan_Cingalese_Bushbrown;
import com.slfortuner.slbutterflydirectory.u195.Sri_Lankan_Clouded_Silverline;
import com.slfortuner.slbutterflydirectory.u196.Sri_Lankan_Dart;
import com.slfortuner.slbutterflydirectory.u197.Sri_Lankan_Decorated_Ace;
import com.slfortuner.slbutterflydirectory.u198.Sri_Lankan_Forester;
import com.slfortuner.slbutterflydirectory.u199.Sri_Lankan_Greens_Silverline;
import com.slfortuner.slbutterflydirectory.u20.Blue_Admiral;
import com.slfortuner.slbutterflydirectory.u200.Sri_Lankan_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u201.Sri_Lankan_Hedge_Hopper;
import com.slfortuner.slbutterflydirectory.u202.Sri_Lankan_Highland_Ace;
import com.slfortuner.slbutterflydirectory.u203.Sri_Lankan_Indigo_Royal;
import com.slfortuner.slbutterflydirectory.u204.Sri_Lankan_Jewel_Four_Ring;
import com.slfortuner.slbutterflydirectory.u205.Sri_Lankan_Lesser_Albatross;
import com.slfortuner.slbutterflydirectory.u206.Sri_Lankan_Lowland_Ace;
import com.slfortuner.slbutterflydirectory.u207.Sri_Lankan_Milky_Cerulean;
import com.slfortuner.slbutterflydirectory.u208.Sri_Lankan_One_Spot_Grass_Yellow;
import com.slfortuner.slbutterflydirectory.u209.Sri_Lankan_Ormistons_Oakblue;
import com.slfortuner.slbutterflydirectory.u21.Blue_Glassy_Tiger;
import com.slfortuner.slbutterflydirectory.u210.Sri_Lankan_Paint_Brush_Swift;
import com.slfortuner.slbutterflydirectory.u211.Sri_Lankan_Pale_Six_Lineblue;
import com.slfortuner.slbutterflydirectory.u212.Sri_Lankan_Palmfly;
import com.slfortuner.slbutterflydirectory.u213.Sri_Lankan_Pied_Flat;
import com.slfortuner.slbutterflydirectory.u214.Sri_Lankan_Rose;
import com.slfortuner.slbutterflydirectory.u215.Sri_Lankan_Singalese_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u216.Sri_Lankan_Tamil_Bushbrown;
import com.slfortuner.slbutterflydirectory.u217.Sri_Lankan_Tiger;
import com.slfortuner.slbutterflydirectory.u218.Sri_Lankan_Tree_Nymph;
import com.slfortuner.slbutterflydirectory.u219.Sri_Lankan_Treebrown;
import com.slfortuner.slbutterflydirectory.u22.Blue_Mormon;
import com.slfortuner.slbutterflydirectory.u220.Sri_Lankan_Woodhouses_Four_Lineblue;
import com.slfortuner.slbutterflydirectory.u221.Striped_Albatross;
import com.slfortuner.slbutterflydirectory.u222.Striped_Pierrot;
import com.slfortuner.slbutterflydirectory.u223.Shiva_Sunbeam;
import com.slfortuner.slbutterflydirectory.u224.Tail_Less_Lineblue;
import com.slfortuner.slbutterflydirectory.u225.Tailed_Jay;
import com.slfortuner.slbutterflydirectory.u226.Tamil_Oakblue;
import com.slfortuner.slbutterflydirectory.u227.Tamil_Treebrown;
import com.slfortuner.slbutterflydirectory.u228.Tamil_Yeoman;
import com.slfortuner.slbutterflydirectory.u229.Tawny_Coster;
import com.slfortuner.slbutterflydirectory.u23.Blue_Onyx;
import com.slfortuner.slbutterflydirectory.u230.Tawny_Rajah;
import com.slfortuner.slbutterflydirectory.u231.Three_spot_Grass_Yellow;
import com.slfortuner.slbutterflydirectory.u232.Tiny_Grass_Blue;
import com.slfortuner.slbutterflydirectory.u233.Transparent_Six_Lineblue;
import com.slfortuner.slbutterflydirectory.u234.Tree_Flitter;
import com.slfortuner.slbutterflydirectory.u235.Tropical_Fritillary;
import com.slfortuner.slbutterflydirectory.u236.Wallaces_Swift;
import com.slfortuner.slbutterflydirectory.u237.Water_Snow_Flat;
import com.slfortuner.slbutterflydirectory.u238.White_Banded_Awl;
import com.slfortuner.slbutterflydirectory.u239.White_Four_ring;
import com.slfortuner.slbutterflydirectory.u24.Blue_Pansy;
import com.slfortuner.slbutterflydirectory.u240.White_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u241.White_Orange_Tip;
import com.slfortuner.slbutterflydirectory.u242.White_Royal;
import com.slfortuner.slbutterflydirectory.u243.White_tipped_Lineblue;
import com.slfortuner.slbutterflydirectory.u244.Yamfly;
import com.slfortuner.slbutterflydirectory.u245.Yellow_Orange_Tip;
import com.slfortuner.slbutterflydirectory.u246.Yellow_Palm_Dart;
import com.slfortuner.slbutterflydirectory.u247.Yellow_Pansy;
import com.slfortuner.slbutterflydirectory.u248.Zebra_Blue;
import com.slfortuner.slbutterflydirectory.u25.Blue_Tiger;
import com.slfortuner.slbutterflydirectory.u26.Branded_Orange_Awlet;
import com.slfortuner.slbutterflydirectory.u27.Bright_Babul_Blue;
import com.slfortuner.slbutterflydirectory.u28.Brown_Awl;
import com.slfortuner.slbutterflydirectory.u29.Brown_King_Crow;
import com.slfortuner.slbutterflydirectory.u3.African_Marbled_Skipper;
import com.slfortuner.slbutterflydirectory.u30.Brown_Onyx;
import com.slfortuner.slbutterflydirectory.u31.Bush_Hopper;
import com.slfortuner.slbutterflydirectory.u32.Buttlers_Spotted_Pierrot;
import com.slfortuner.slbutterflydirectory.u33.Centaur_Oakblue;
import com.slfortuner.slbutterflydirectory.u34.Chestnut_Bob;
import com.slfortuner.slbutterflydirectory.u35.Chestnut_Streaked_Sailor;
import com.slfortuner.slbutterflydirectory.u36.Chocolate_Albatross;
import com.slfortuner.slbutterflydirectory.u37.Chocolate_Soldier;
import com.slfortuner.slbutterflydirectory.u38.Clipper;
import com.slfortuner.slbutterflydirectory.u39.Club_Beak;
import com.slfortuner.slbutterflydirectory.u4.Alida_Angle;
import com.slfortuner.slbutterflydirectory.u40.Commander;
import com.slfortuner.slbutterflydirectory.u41.Common_Acacia_Blue;
import com.slfortuner.slbutterflydirectory.u42.Common_Albatross;
import com.slfortuner.slbutterflydirectory.u43.Common_Banded_Awl;
import com.slfortuner.slbutterflydirectory.u44.Common_Banded_Demon;
import com.slfortuner.slbutterflydirectory.u45.Common_Bluebottle;
import com.slfortuner.slbutterflydirectory.u46.Common_Bushbrown;
import com.slfortuner.slbutterflydirectory.u47.Common_Castor;
import com.slfortuner.slbutterflydirectory.u48.Common_Cerulean;
import com.slfortuner.slbutterflydirectory.u49.Common_Crow;
import com.slfortuner.slbutterflydirectory.u5.Angled_Castor;
import com.slfortuner.slbutterflydirectory.u50.Common_Dart;
import com.slfortuner.slbutterflydirectory.u51.Common_Dartlet;
import com.slfortuner.slbutterflydirectory.u52.Common_Evening_Brown;
import com.slfortuner.slbutterflydirectory.u53.Common_Grass_Dart;
import com.slfortuner.slbutterflydirectory.u54.Common_Grass_Yellow;
import com.slfortuner.slbutterflydirectory.u55.Common_Guava_Blue;
import com.slfortuner.slbutterflydirectory.u56.Common_Gull;
import com.slfortuner.slbutterflydirectory.u57.Common_Hedge_Blue;
import com.slfortuner.slbutterflydirectory.u58.Common_Imperial;
import com.slfortuner.slbutterflydirectory.u59.Common_Jay;
import com.slfortuner.slbutterflydirectory.u6.Angled_Pierrot;
import com.slfortuner.slbutterflydirectory.u60.Common_Lascar;
import com.slfortuner.slbutterflydirectory.u61.Common_Leopard;
import com.slfortuner.slbutterflydirectory.u62.Common_Lineblue;
import com.slfortuner.slbutterflydirectory.u63.Common_Mormon;
import com.slfortuner.slbutterflydirectory.u64.Common_Palmfly;
import com.slfortuner.slbutterflydirectory.u65.Common_Pierrot;
import com.slfortuner.slbutterflydirectory.u66.Common_Red_Eye;
import com.slfortuner.slbutterflydirectory.u67.Common_Rose;
import com.slfortuner.slbutterflydirectory.u68.Common_Sailor;
import com.slfortuner.slbutterflydirectory.u69.Common_Shot_Silverline;
import com.slfortuner.slbutterflydirectory.u7.Apefly;
import com.slfortuner.slbutterflydirectory.u70.Common_Silverline;
import com.slfortuner.slbutterflydirectory.u71.Common_Small_Flat;
import com.slfortuner.slbutterflydirectory.u72.Common_Snow_Flat;
import com.slfortuner.slbutterflydirectory.u73.Common_Tiger;
import com.slfortuner.slbutterflydirectory.u74.Common_Tinsel;
import com.slfortuner.slbutterflydirectory.u75.Common_Treebrown;
import com.slfortuner.slbutterflydirectory.u76.Conjoined_Swift;
import com.slfortuner.slbutterflydirectory.u77.Cornelian;
import com.slfortuner.slbutterflydirectory.u78.Crimson_Rose;
import com.slfortuner.slbutterflydirectory.u79.Crimson_Tip;
import com.slfortuner.slbutterflydirectory.u8.Autum_Leaf;
import com.slfortuner.slbutterflydirectory.u80.Cruiser;
import com.slfortuner.slbutterflydirectory.u81.Danaid_Eggfly;
import com.slfortuner.slbutterflydirectory.u82.Dark_Blue_Tiger;
import com.slfortuner.slbutterflydirectory.u83.Dark_Cerulean;
import com.slfortuner.slbutterflydirectory.u84.Dark_Evening_Brown;
import com.slfortuner.slbutterflydirectory.u85.Dark_Grass_Blue;
import com.slfortuner.slbutterflydirectory.u86.Dark_Palm_Dart;
import com.slfortuner.slbutterflydirectory.u87.Dark_Six_Lineblue;
import com.slfortuner.slbutterflydirectory.u88.Dark_Wanderer;
import com.slfortuner.slbutterflydirectory.u89.Dark_Brand_Bushbrown;
import com.slfortuner.slbutterflydirectory.u9.Awl_King;
import com.slfortuner.slbutterflydirectory.u90.Dingy_Lineblue;
import com.slfortuner.slbutterflydirectory.u91.Double_Branded_Crow;
import com.slfortuner.slbutterflydirectory.u92.Fivebar_Swordtail;
import com.slfortuner.slbutterflydirectory.u93.Forget_me_not;
import com.slfortuner.slbutterflydirectory.u94.Gaudy_Baron;
import com.slfortuner.slbutterflydirectory.u95.Giant_Red_Eye;
import com.slfortuner.slbutterflydirectory.u96.Gladeye_Bushbrown;
import com.slfortuner.slbutterflydirectory.u97.Glassy_Tiger;
import com.slfortuner.slbutterflydirectory.u98.Golden_Angle;
import com.slfortuner.slbutterflydirectory.u99.Gram_Blue;
import com.slfortuner.slbutterflydirectory.ui.Aberrant_Bush_Blue;
import com.slfortuner.slbutterflydirectory.ui1.African_Babul_Blue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class ButterflyListAdapter extends ArrayAdapter<Butterfly> {

    private  final String TAG = "ButterflyListAdapter";

    private final Context mContext;
    private final int mResource;
    private final List<Butterfly> objects;
    private final ArrayList<Butterfly> arrayList;


    private  class ViewHolder {
        TextView cName;
        TextView sName;
        ImageView img;
    }

    public ButterflyListAdapter(Context context, int resource, ArrayList<Butterfly> objects) {
        super(context, resource, objects);
        this.objects = objects;
        this.arrayList = new ArrayList< Butterfly>( );
        this.arrayList.addAll( objects );

        mContext = context;
        mResource = resource;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        setupImageLoader();

        //get the Butterflys information

        String cName = getItem(position).getCName();
        String sName = getItem(position).getSName();
        String imgURL = getItem(position).getImgURL();

        //Create the Butterfly object with the information

        //create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;


        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder= new ViewHolder();
            holder.cName = convertView.findViewById(R.id.textView2);
            holder.sName = convertView.findViewById(R.id.textView3);
            holder.img = convertView.findViewById(R.id.image);

            result = convertView;

            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }
        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = mContext.getResources().getIdentifier( "@drawable/final_splash_logo3", null, mContext.getPackageName() );

        DisplayImageOptions options;
        options = new DisplayImageOptions.Builder().cacheInMemory(false)
                .cacheOnDisc(false)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage)
                .bitmapConfig( Bitmap.Config.ARGB_4444)
                .imageScaleType( ImageScaleType.EXACTLY)
                .build();


        imageLoader.displayImage( imgURL, holder.img, options );


        holder.cName.setText(cName);
        holder.sName.setText(sName);

        convertView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (objects.get(position).getCName().equals( "Aberrant Bushblue" )) {

                    Intent intent= new Intent( mContext, Aberrant_Bush_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "African Babul Blue" )) {

                    Intent intent= new Intent( mContext, African_Babul_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "African Marbled Skipper" )) {

                    Intent intent= new Intent( mContext, African_Marbled_Skipper.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Alida Angle (Ceylon Golden Angle)" )) {

                    Intent intent= new Intent( mContext, Alida_Angle.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Angled Castor" )) {

                    Intent intent= new Intent( mContext, Angled_Castor.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Angled Pierrot" )) {

                    Intent intent= new Intent( mContext, Angled_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Apefly" )) {

                    Intent intent= new Intent( mContext, Apefly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Autumn Leaf" )) {

                    Intent intent= new Intent( mContext, Autum_Leaf.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Awl King" )) {

                    Intent intent= new Intent( mContext, Awl_King.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Banded Blue Pierrot" )) {

                    Intent intent= new Intent( mContext, Banded_Blue_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Banded Peacock" )) {

                    Intent intent= new Intent( mContext, Banded_Peacock.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Banded Red Eye" )) {

                    Intent intent= new Intent( mContext, Banded_Red_Eye.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Baron" )) {

                    Intent intent= new Intent( mContext, Baron.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Baronet" )) {

                    Intent intent= new Intent( mContext, Baronet.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Beak" )) {

                    Intent intent= new Intent( mContext, Beak.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Black Angle" )) {

                    Intent intent= new Intent( mContext, Black_Angle.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Black Prince" )) {

                    Intent intent= new Intent( mContext, Black_Prince.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Black Rajah" )) {

                    Intent intent= new Intent( mContext, Black_Rajah.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blank Swift" )) {

                    Intent intent= new Intent( mContext, Blank_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Admiral" )) {

                    Intent intent= new Intent( mContext, Blue_Admiral.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Glassy Tiger" )) {

                    Intent intent= new Intent( mContext, Blue_Glassy_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Mormon" )) {

                    Intent intent= new Intent( mContext, Blue_Mormon.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Onyx" )) {

                    Intent intent= new Intent( mContext, Blue_Onyx.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Pansy" )) {

                    Intent intent= new Intent( mContext, Blue_Pansy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Blue Tiger" )) {

                    Intent intent= new Intent( mContext, Blue_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Branded Orange Awlet" )) {

                    Intent intent= new Intent( mContext, Branded_Orange_Awlet.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Bright Babul Blue" )) {

                    Intent intent= new Intent( mContext, Bright_Babul_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Brown Awl" )) {

                    Intent intent= new Intent( mContext, Brown_Awl.class );
                    mContext.startActivity( intent );
                }if (objects.get(position).getCName().equals( "Brown King Crow" )) {

                    Intent intent= new Intent( mContext, Brown_King_Crow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Brown Onyx" )) {

                    Intent intent= new Intent( mContext, Brown_Onyx.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Bush Hopper" )) {

                    Intent intent= new Intent( mContext, Bush_Hopper.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Buttler's Spotted Pierrot" )) {

                    Intent intent= new Intent( mContext, Buttlers_Spotted_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Centaur Oakblue" )) {

                    Intent intent= new Intent( mContext, Centaur_Oakblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Chestnut Bob" )) {

                    Intent intent= new Intent( mContext, Chestnut_Bob.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Chestnut Streaked Sailor" )) {

                    Intent intent= new Intent( mContext, Chestnut_Streaked_Sailor.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Chocolate Albatross" )) {

                    Intent intent= new Intent( mContext, Chocolate_Albatross.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Chocolate Soldier" )) {

                    Intent intent= new Intent( mContext, Chocolate_Soldier.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Clipper" )) {

                    Intent intent= new Intent( mContext, Clipper.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Club Beak" )) {

                    Intent intent= new Intent( mContext, Club_Beak.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Commander" )) {

                    Intent intent= new Intent( mContext, Commander.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Acacia Blue" )) {

                    Intent intent= new Intent( mContext, Common_Acacia_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Albatross" )) {

                    Intent intent= new Intent( mContext, Common_Albatross.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Banded Awl" )) {

                    Intent intent= new Intent( mContext, Common_Banded_Awl.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Banded Demon" )) {

                    Intent intent= new Intent( mContext, Common_Banded_Demon.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Bluebottle" )) {

                    Intent intent= new Intent( mContext, Common_Bluebottle.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Bushbrown" )) {

                    Intent intent= new Intent( mContext, Common_Bushbrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Castor" )) {

                    Intent intent= new Intent( mContext, Common_Castor.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Cerulean" )) {

                    Intent intent= new Intent( mContext, Common_Cerulean.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Crow" )) {

                    Intent intent= new Intent( mContext, Common_Crow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Dart" )) {

                    Intent intent= new Intent( mContext, Common_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Dartlet" )) {

                    Intent intent= new Intent( mContext, Common_Dartlet.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Evening Brown" )) {

                    Intent intent= new Intent( mContext, Common_Evening_Brown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Grass Dart" )) {

                    Intent intent= new Intent( mContext, Common_Grass_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Grass Yellow" )) {

                    Intent intent= new Intent( mContext, Common_Grass_Yellow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Guava Blue" )) {

                    Intent intent= new Intent( mContext, Common_Guava_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Gull" )) {

                    Intent intent= new Intent( mContext, Common_Gull.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Hedge Blue" )) {

                    Intent intent= new Intent( mContext, Common_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Imperial" )) {

                    Intent intent= new Intent( mContext, Common_Imperial.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Jay" )) {

                    Intent intent= new Intent( mContext, Common_Jay.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Lascar" )) {

                    Intent intent= new Intent( mContext, Common_Lascar.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Leopard" )) {

                    Intent intent= new Intent( mContext, Common_Leopard.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Lineblue" )) {

                    Intent intent= new Intent( mContext, Common_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Mormon" )) {

                    Intent intent= new Intent( mContext, Common_Mormon.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Palmfly" )) {

                    Intent intent= new Intent( mContext, Common_Palmfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Pierrot" )) {

                    Intent intent= new Intent( mContext, Common_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Red Eye" )) {

                    Intent intent= new Intent( mContext, Common_Red_Eye.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Rose" )) {

                    Intent intent= new Intent( mContext, Common_Rose.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Sailor" )) {

                    Intent intent= new Intent( mContext, Common_Sailor.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Shot Silverline (Ceylon Silverline)" )) {

                    Intent intent= new Intent( mContext, Common_Shot_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Silverline" )) {

                    Intent intent= new Intent( mContext, Common_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Small Flat" )) {

                    Intent intent= new Intent( mContext, Common_Small_Flat.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Snow Flat (Ceylon Snow Flat)" )) {

                    Intent intent= new Intent( mContext, Common_Snow_Flat.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Tiger" )) {

                    Intent intent= new Intent( mContext, Common_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Tinsel" )) {

                    Intent intent= new Intent( mContext, Common_Tinsel.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Common Treebrown" )) {

                    Intent intent= new Intent( mContext, Common_Treebrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Conjoined Swift" )) {

                    Intent intent= new Intent( mContext, Conjoined_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Cornelian" )) {

                    Intent intent= new Intent( mContext, Cornelian.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Crimson Rose" )) {

                    Intent intent= new Intent( mContext, Crimson_Rose.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Crimson Tip" )) {

                    Intent intent= new Intent( mContext, Crimson_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Cruiser" )) {

                    Intent intent= new Intent( mContext, Cruiser.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Danaid Eggfly" )) {

                    Intent intent= new Intent( mContext, Danaid_Eggfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Blue Tiger" )) {

                    Intent intent= new Intent( mContext, Dark_Blue_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Cerulean" )) {

                    Intent intent= new Intent( mContext, Dark_Cerulean.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Evening Brown" )) {

                    Intent intent= new Intent( mContext, Dark_Evening_Brown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Grass Blue" )) {

                    Intent intent= new Intent( mContext, Dark_Grass_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Palm Dart" )) {

                    Intent intent= new Intent( mContext, Dark_Palm_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Six Lineblue" )) {

                    Intent intent= new Intent( mContext, Dark_Six_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark Wanderer" )) {

                    Intent intent= new Intent( mContext, Dark_Wanderer.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dark-brand Bushbrown" )) {

                    Intent intent= new Intent( mContext, Dark_Brand_Bushbrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Dingy Lineblue" )) {

                    Intent intent= new Intent( mContext, Dingy_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Double Branded Crow" )) {

                    Intent intent= new Intent( mContext, Double_Branded_Crow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Five-bar Swordtail" )) {

                    Intent intent= new Intent( mContext, Fivebar_Swordtail.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Forget-me-not" )) {

                    Intent intent= new Intent( mContext, Forget_me_not.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Gaudy Baron" )) {

                    Intent intent= new Intent( mContext, Gaudy_Baron.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Giant Red Eye" )) {

                    Intent intent= new Intent( mContext, Giant_Red_Eye.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Gladeye Bushbrown" )) {

                    Intent intent= new Intent( mContext, Gladeye_Bushbrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Glassy Tiger" )) {

                    Intent intent= new Intent( mContext, Glassy_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Golden Angle" )) {

                    Intent intent= new Intent( mContext, Golden_Angle.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Gram Blue" )) {

                    Intent intent= new Intent( mContext, Gram_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Grass Demon" )) {

                    Intent intent= new Intent( mContext, Grass_Demon.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Grass Jewel" )) {

                    Intent intent= new Intent( mContext, Grass_Jewel.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Great Crow" )) {

                    Intent intent= new Intent( mContext, Great_Crow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Great Eggfly" )) {

                    Intent intent= new Intent( mContext, Great_Eggfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Great Orange Tip" )) {

                    Intent intent= new Intent( mContext, Great_Orange_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Grey Pansy" )) {

                    Intent intent= new Intent( mContext, Grey_Pansy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Grizzled Skipper (Indian Skipper)" )) {

                    Intent intent= new Intent( mContext, Grizzled_Skipper.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Hampson's Hedge Blue" )) {

                    Intent intent= new Intent( mContext, Hampsons_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Indian Sunbeam" )) {

                    Intent intent= new Intent( mContext, Indian_Sunbeam.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Indigo Flash" )) {

                    Intent intent= new Intent( mContext, Indigo_Flash.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Jezebel" )) {

                    Intent intent= new Intent( mContext, Jezebel.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Joker" )) {

                    Intent intent= new Intent( mContext, Joker.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lace Wing" )) {

                    Intent intent= new Intent( mContext, Lace_Wing.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Large Branded Swift" )) {

                    Intent intent= new Intent( mContext, Large_Branded_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Large Four Lineblue" )) {

                    Intent intent= new Intent( mContext, Large_Four_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Large Guava Blue" )) {

                    Intent intent= new Intent( mContext, Large_Guava_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Large Oakblue" )) {

                    Intent intent= new Intent( mContext, Large_Oakblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Large Salmon Arab" )) {

                    Intent intent= new Intent( mContext, Large_Salmon_Arab.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lemon Emigrant" )) {

                    Intent intent= new Intent( mContext, Lemon_Emigrant.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lemon Pansy" )) {

                    Intent intent= new Intent( mContext, Lemon_Pansy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lesser Grass Blue" )) {

                    Intent intent= new Intent( mContext, Lesser_Grass_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lesser Gull" )) {

                    Intent intent= new Intent( mContext, Lesser_Gull.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lime Blue" )) {

                    Intent intent= new Intent( mContext, Lime_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Lime Butterfly" )) {

                    Intent intent= new Intent( mContext, Lime_Butterfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Little Branded Swift" )) {

                    Intent intent= new Intent( mContext, Little_Branded_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Little Orange Tip" )) {

                    Intent intent= new Intent( mContext, Little_Orange_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Long-banded Silverline" )) {

                    Intent intent= new Intent( mContext, Long_Banded_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Malabar Flash" )) {

                    Intent intent= new Intent( mContext, Malabar_Flash.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Malayan" )) {

                    Intent intent= new Intent( mContext, Malayan.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Medus Brown (Nigger)" )) {

                    Intent intent= new Intent( mContext, Medus_Brown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Metallic Cerulean" )) {

                    Intent intent= new Intent( mContext, Metallic_Cerulean.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Mime" )) {

                    Intent intent= new Intent( mContext, Mime.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Monkey-puzzle" )) {

                    Intent intent= new Intent( mContext, Monkey_Puzzle.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Mottled Emigrant" )) {

                    Intent intent= new Intent( mContext, Mottled_Emigrant.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Nawab" )) {

                    Intent intent= new Intent( mContext, Nawab.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Nilgiri Tit" )) {

                    Intent intent= new Intent( mContext, Nilgiri_Tit.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Opaque Six Lineblue" )) {

                    Intent intent= new Intent( mContext, Opaque_Six_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Orange Migrant" )) {

                    Intent intent= new Intent( mContext, Orange_Migrant.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Orange-tailed Awl" )) {

                    Intent intent= new Intent( mContext, Orange_Tailed_Awl.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Oriental Common Awl (Ceylon Awl)" )) {

                    Intent intent= new Intent( mContext, Oriental_Common_Awl.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Oriental Cupid (Indian Cupid)" )) {

                    Intent intent= new Intent( mContext, Oriental_Cupid.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Oriental Palm Bob (Indian Palm Bob)" )) {

                    Intent intent= new Intent( mContext, Oriental_Palm_Bob.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Painted Lady" )) {

                    Intent intent= new Intent( mContext, Painted_Lady.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Painted Sawtooth" )) {

                    Intent intent= new Intent( mContext, Painted_Sawtooth.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pale Four Lineblue" )) {

                    Intent intent= new Intent( mContext, Pale_Four_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pale Palm Dart" )) {

                    Intent intent= new Intent( mContext, Pale_Palm_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pallid Dart (Indian Dart)" )) {

                    Intent intent= new Intent( mContext, Pallid_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pea Blue" )) {

                    Intent intent= new Intent( mContext, Pea_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Peacock Pansy" )) {

                    Intent intent= new Intent( mContext, Peacock_Pansy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Peacock Royal" )) {

                    Intent intent= new Intent( mContext, Peacock_Royal.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Philippine Swift" )) {

                    Intent intent= new Intent( mContext, Philippine_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pioneer" )) {

                    Intent intent= new Intent( mContext, Pioneer.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plain Hedge Blue" )) {

                    Intent intent= new Intent( mContext, Plain_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plain Orange Tip" )) {

                    Intent intent= new Intent( mContext, Plain_Orange_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plain Puffin" )) {

                    Intent intent= new Intent( mContext, Plain_Puffin.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plain Tiger" )) {

                    Intent intent= new Intent( mContext, Plain_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plains Blue Royal" )) {

                    Intent intent= new Intent( mContext, Plains_Blue_Royal.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plains Cupid" )) {

                    Intent intent= new Intent( mContext, Plains_Cupid.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plane" )) {

                    Intent intent= new Intent( mContext, Plane.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plum Judy" )) {

                    Intent intent= new Intent( mContext, Plum_Judy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Plumbeous Silverline" )) {

                    Intent intent= new Intent( mContext, Plumbeous_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pointed Ciliate Blue" )) {

                    Intent intent= new Intent( mContext, Pointed_Ciliate_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Pointed Lineblue" )) {

                    Intent intent= new Intent( mContext, Pointed_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Psyche" )) {

                    Intent intent= new Intent( mContext, Psyche.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Purple Leaf Blue" )) {

                    Intent intent= new Intent( mContext, Purple_Leaf_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Quaker" )) {

                    Intent intent= new Intent( mContext, Quaker.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Red Admiral" )) {

                    Intent intent= new Intent( mContext, Red_Admiral.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Red Flash" )) {

                    Intent intent= new Intent( mContext, Red_Flash.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Red Helen" )) {

                    Intent intent= new Intent( mContext, Red_Helen.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Red Pierrot" )) {

                    Intent intent= new Intent( mContext, Red_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Redspot" )) {

                    Intent intent= new Intent( mContext, Redspot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Redspot Duke" )) {

                    Intent intent= new Intent( mContext, Redspot_Duke.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Restricted Demon" )) {

                    Intent intent= new Intent( mContext, Restricted_Demon.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Rounded Palm Red Eye" )) {

                    Intent intent= new Intent( mContext, Rounded_Palm_Red_Eye.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Rounded Six Lineblue" )) {

                    Intent intent= new Intent( mContext, Rounded_Six_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Rustic" )) {

                    Intent intent= new Intent( mContext, Rustic.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Scarce Shot Silverline" )) {

                    Intent intent= new Intent( mContext, Scarce_Shot_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Shiva Sunbeam" )) {

                    Intent intent= new Intent( mContext, Shiva_Sunbeam.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Purple Leaf Blue" )) {

                    Intent intent= new Intent( mContext, Purple_Leaf_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Silver Forget-me-not" )) {

                    Intent intent= new Intent( mContext, Silver_Forget_Me_Not.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Silver Streak Blue" )) {

                    Intent intent= new Intent( mContext, Silver_Streak_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Slate Flash" )) {

                    Intent intent= new Intent( mContext, Slate_Flash.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Branded Swift" )) {

                    Intent intent= new Intent( mContext, Small_Branded_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Cupid" )) {

                    Intent intent= new Intent( mContext, Small_Cupid.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Grass Yellow" )) {

                    Intent intent= new Intent( mContext, Small_Grass_Yellow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Leopard" )) {

                    Intent intent= new Intent( mContext, Small_Leopard.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Palm Bob (Ceylon Palm Bob)" )) {

                    Intent intent= new Intent( mContext, Small_Palm_Bob.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Small Salmon Arab" )) {

                    Intent intent= new Intent( mContext, Small_Salmon_Arab.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Smallest Swift" )) {

                    Intent intent= new Intent( mContext, Smallest_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Southern Duffer" )) {

                    Intent intent= new Intent( mContext, Southern_Duffer.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Spot Swordtail" )) {

                    Intent intent= new Intent( mContext, Spot_Swordtail.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Spotless Grass Yellow" )) {

                    Intent intent= new Intent( mContext, Spotless_Grass_Yellow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Birdwing" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Birdwing.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Black Flat" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Black_Flat.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Blue Oak Leaf" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Blue_Oak_Leaf.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Cerulean" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Cerulean.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Cingalese Bushbrown" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Cingalese_Bushbrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Clouded Silverline" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Clouded_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Dart (Tropic Dart)" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Decorated Ace" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Decorated_Ace.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Forester" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Forester.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Green's Silverline" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Greens_Silverline.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Hedge Blue" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Hedge Hopper" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Hedge_Hopper.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Highland Ace (Rare Ace)" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Highland_Ace.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Indigo Royal" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Indigo_Royal.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Jewel Four-ring" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Jewel_Four_Ring.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Lesser Albatross" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Lesser_Albatross.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Lowland Ace (Ceylon Ace)" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Lowland_Ace.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Milky Cerulean" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Milky_Cerulean.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan One-spot Grass Yellow" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_One_Spot_Grass_Yellow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Ormiston's Oakblue" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Ormistons_Oakblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Paint Brush Swift" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Paint_Brush_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Pale Six Lineblue" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Pale_Six_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Palmfly" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Palmfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Pied Flat" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Pied_Flat.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Rose" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Rose.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Singalese Hedge Blue" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Singalese_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Tamil Bushbrown" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Tamil_Bushbrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Tiger" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Tiger.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Tree-nymph" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Tree_Nymph.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Treebrown" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Treebrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Sri Lankan Woodhouse's Four Lineblue" )) {

                    Intent intent= new Intent( mContext, Sri_Lankan_Woodhouses_Four_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Striped Albatross" )) {

                    Intent intent= new Intent( mContext, Striped_Albatross.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Striped Pierrot" )) {

                    Intent intent= new Intent( mContext, Striped_Pierrot.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tail-less Lineblue" )) {

                    Intent intent= new Intent( mContext, Tail_Less_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tailed Jay" )) {

                    Intent intent= new Intent( mContext, Tailed_Jay.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tamil Oakblue" )) {

                    Intent intent= new Intent( mContext, Tamil_Oakblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tamil Treebrown" )) {

                    Intent intent= new Intent( mContext, Tamil_Treebrown.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tamil Yeoman" )) {

                    Intent intent= new Intent( mContext, Tamil_Yeoman.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tawny Coster" )) {

                    Intent intent= new Intent( mContext, Tawny_Coster.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tawny Rajah" )) {

                    Intent intent= new Intent( mContext, Tawny_Rajah.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Three-spot Grass Yellow" )) {

                    Intent intent= new Intent( mContext, Three_spot_Grass_Yellow.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tiny Grass Blue" )) {

                    Intent intent= new Intent( mContext, Tiny_Grass_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Transparent Six Lineblue" )) {

                    Intent intent= new Intent( mContext, Transparent_Six_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tree Flitter" )) {

                    Intent intent= new Intent( mContext, Tree_Flitter.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Tropical Fritillary (Indian Fritillary)" )) {

                    Intent intent= new Intent( mContext, Tropical_Fritillary.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Wallace's Swift" )) {

                    Intent intent= new Intent( mContext, Wallaces_Swift.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Water Snow Flat" )) {

                    Intent intent= new Intent( mContext, Water_Snow_Flat.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White Banded Awl" )) {

                    Intent intent= new Intent( mContext, White_Banded_Awl.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White Four-ring" )) {

                    Intent intent= new Intent( mContext, White_Four_ring.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White Hedge Blue" )) {

                    Intent intent= new Intent( mContext, White_Hedge_Blue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White Orange Tip" )) {

                    Intent intent= new Intent( mContext, White_Orange_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White Royal" )) {

                    Intent intent= new Intent( mContext, White_Royal.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "White-tipped Lineblue" )) {

                    Intent intent= new Intent( mContext, White_tipped_Lineblue.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Yamfly" )) {

                    Intent intent= new Intent( mContext, Yamfly.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Yellow Orange Tip" )) {

                    Intent intent= new Intent( mContext, Yellow_Orange_Tip.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Yellow Palm Dart" )) {

                    Intent intent= new Intent( mContext, Yellow_Palm_Dart.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Yellow Pansy" )) {

                    Intent intent= new Intent( mContext, Yellow_Pansy.class );
                    mContext.startActivity( intent );
                }
                if (objects.get(position).getCName().equals( "Zebra Blue" )) {

                    Intent intent= new Intent( mContext, Zebra_Blue.class );
                    mContext.startActivity( intent );
                }




            }
        } );




        return convertView;
    }




    private void setupImageLoader(){


        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext)
                .memoryCache(new WeakMemoryCache())
                .denyCacheImageMultipleSizesInMemory()
                .threadPoolSize(30)
                .tasksProcessingOrder( QueueProcessingType.LIFO)
                .threadPriority(Thread.MAX_PRIORITY)
                .discCacheSize(20* 1024 * 1024).build();



        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }



    //filter
    void filter(String charText){
        charText = charText.toLowerCase( Locale.getDefault());
        objects.clear();
        if (charText.length()==0){
            objects.addAll(arrayList);
        }
        else {
            for (Butterfly model : arrayList){
                if (model.getCName().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    objects.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }

}

























