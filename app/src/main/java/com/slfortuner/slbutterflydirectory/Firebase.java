package com.slfortuner.slbutterflydirectory;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;


public class Firebase extends AppCompatActivity implements View.OnClickListener {

    Button dateButton, timeButton;
    TextView dateTextView, timeTextView;
    EditText notice1;
    private final String TAG = "Firebase";

    DatabaseHelper myDB;

    AutoCompleteTextView editTextName;
    Button button;
    Spinner spinner;

    FloatingActionButton bt_float;

    private Button btLocation;
    TextView textView1, textView2, textView3, textView4, textView5;



    DatabaseReference databaseButterfly;


    private final String[] BUTTERFLIES = new String[]{"Aberrant Bush Blue", "African Babul Blue", "African Marbled Skipper", "Alida Angle", "Angled Castor", "Angled Pierrot", "Apefly", "Autumn Leaf", "Awl King", "Banded Blue Pierrot", "Banded Peacock", "Banded Red Eye", "Baron", "Baronet", "Beak", "Black Angle", "Black Prince", "Black Rajah", "Blank Swift", "Blue Admiral", "Blue Glassy Tiger", "Blue Mormon", "Blue Onyx", "Blue Pansy", "Blue Tiger", "Branded Orange Awlet", "Bright Babul Blue", "Brown Awl", "Brown King Crow", "Brown Onyx", "Bush Hopper", "Buttler's Spotted Pierrot", "Centaur Oakblue", "Chestnut Bob", "Chestnut Streaked Sailor", "Chocolate Albatross", "Chocolate Soldier", "Clipper", "Club Beak", "Commander", "Common Acacia Blue", "Common Albatross", "Common Banded Awl", "Common Banded Demon", "Common Bluebottle", "Common Bushbrown", "Common Castor", "Common Cerulean", "Common Crow", "Common Dart", "Common Dartlet", "Common Evening Brown", "Common Grass Dart", "Common Grass Yellow", "Common Guava Blue", "Common Gull", "Common Hedge Blue", "Common Imperial", "Common Jay", "Common Lascar", "Common Leopard", "Common Lineblue", "Common Mormon", "Common Palmfly", "Common Pierrot", "Common Red Eye", "Common Rose", "Common Sailor", "Common Shot Silverline", "Common Silverline", "Common Small Flat", "Common Snow Flat", "Common Tiger", "Common Tinsel", "Common Treebrown", "Conjoined Swift", "Cornelian", "Crimson Rose", "Crimson Tip", "Cruiser", "Danaid Eggfly", "Dark Blue Tiger", "Dark Cerulean", "Dark Evening Brown", "Dark Grass Blue", "Dark Palm Dart", "Dark Six Lineblue", "Dark Wanderer", "Dark-Brand Bushbrown", "Dingy Lineblue", "Double Branded Crow", "Five-bar Swordtail", "Forget-me-not", "Gaudy Baron", "Giant Red Eye", "Gladeye Bushbrown", "Glassy Tiger", "Golden Angle", "Gram Blue", "Grass Demon", "Grass Jewel", "Great Crow", "Great Eggfly", "Great Orange Tip", "Grey Pansy", "Grizzled Skipper", "Hampson's Hedge Blue", "Indian Sunbeam", "Indigo Flash", "Jezebel", "Joker", "Lace Wing", "Large Branded Swift", "Large Four Lineblue", "Large Guava Blue", "Large Oakblue", "Large Salmon Arab", "Lemon Emigrant", "Lemon Pansy", "Lesser Grass Blue", "Lesser Gull", "Lime Blue", "Lime Butterfly", "Little Branded Swift", "Little Orange Tip", "Long-banded Silverline", "Malabar Flash", "Malayan", "Medus Brown", "Metallic Cerulean", "Mime", "Monkey-puzzle", "Mottled Emigrant", "Nawab", "Nilgiri Tit", "Opaque Six Lineblue", "Orange Migrant", "Orange-Tailed Awl", "Oriental Common Awl", "Oriental Cupid", "Oriental Palm Bob", "Painted Lady", "Painted Sawtooth", "Pale Four Lineblue", "Pale Palm Dart", "Pallid Dart", "Pea Blue", "Peacock Pansy", "Peacock Royal", "Philippine Swift", "Pioneer", "Plain Hedge Blue", "Plain Orange Tip", "Plain Puffin", "Plain Tiger", "Plains Blue Royal", "Plains Cupid", "Plane", "Plum Judy", "Plumbeous Silverline", "Pointed Ciliate Blue", "Pointed Lineblue", "Psyche", "Purple Leaf Blue", "Quaker", "Red Admiral", "Red Flash", "Red Helen", "Red Pierrot", "Redspot", "Redspot Duke", "Restricted Demon", "Rounded Palm Red Eye", "Rounded Six Lineblue", "Rustic"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_firebase );
        myDB = new DatabaseHelper(this);

        bt_float= (FloatingActionButton)findViewById( R.id.bt_float );
        bt_float.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Firebase.this,ViewListContents.class);
                startActivity(intent);
            }
        } );

        notice1= (EditText) findViewById( R.id.notice1 );

        dateButton = findViewById(R.id.dateButton);
        timeButton = findViewById(R.id.timeButton);
        dateTextView = findViewById(R.id.dateTextView);
        timeTextView = findViewById(R.id.timeTextView);

        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleDateButton();
            }
        });
        timeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                handleTimeButton();
            }
        });

        String location = getIntent().getStringExtra( "location" );
        textView1 = (TextView)findViewById( R.id.text_view1 );
        textView1.setText( location );


        String location2 = getIntent().getStringExtra( "location2" );
        textView2 = (TextView)findViewById( R.id.text_view2 );
        textView2.setText( location2 );


        databaseButterfly = FirebaseDatabase.getInstance().getReference( "butterfly" );


        editTextName = (AutoCompleteTextView) findViewById( R.id.editTextTextName );
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this,
                android.R.layout.simple_list_item_1, BUTTERFLIES );
        editTextName.setAdapter( adapter );
        button = (Button) findViewById( R.id.button );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addButterfly();
                String fName = editTextName.getText().toString();
                String lName = dateTextView.getText().toString();
                String fFood = timeTextView.getText().toString();
                if(fName.length() != 0 && lName.length() != 0 && fFood.length() != 0){
                    AddData(fName,lName, fFood);
                    timeTextView.setText("");
                    dateTextView.setText("");
                    editTextName.setText("");
                }else{
                    Toast.makeText(Firebase.this,"You must put something in the text field!",Toast.LENGTH_LONG).show();
                }



            }
        } );



        /// location variables///////////
        btLocation = findViewById( R.id.bt_location );

        btLocation.setOnClickListener(this);


        textView3 = findViewById( R.id.text_view3 );
        textView4 = findViewById( R.id.text_view4 );



    }

    public void AddData(String firstName,String lastName, String favFood ){
        boolean insertData = myDB.addData(firstName,lastName,favFood);

        if(insertData){
            Toast.makeText(Firebase.this,"Successfully Entered Data!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(Firebase.this,"Something went wrong :(.",Toast.LENGTH_LONG).show();
        }
    }

    private void handleDateButton() {
        Calendar calendar = Calendar.getInstance();
        int YEAR = calendar.get(Calendar.YEAR);
        int MONTH = calendar.get(Calendar.MONTH);
        int DATE = calendar.get( Calendar.DATE);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int date) {

                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(Calendar.YEAR, year);
                calendar1.set(Calendar.MONTH, month);
                calendar1.set(Calendar.DATE, date);
                String dateText = DateFormat.format("MMM d, yyyy", calendar1).toString();

                dateTextView.setText(dateText);
            }
        }, YEAR, MONTH, DATE);

        datePickerDialog.show();




    }

    private void handleTimeButton() {
        Calendar calendar = Calendar.getInstance();
        int HOUR = calendar.get(Calendar.HOUR);
        int MINUTE = calendar.get(Calendar.MINUTE);
        boolean is24HourFormat = DateFormat.is24HourFormat(this);

        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                Log.i(TAG, "onTimeSet: " + hour + minute);
                Calendar calendar1 = Calendar.getInstance();
                calendar1.set(Calendar.HOUR, hour);
                calendar1.set(Calendar.MINUTE, minute);
                String dateText = DateFormat.format("h:mm a", calendar1).toString();
                timeTextView.setText(dateText);
            }
        }, HOUR, MINUTE, is24HourFormat);

        timePickerDialog.show();

    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_location:
                startActivity( new Intent( Firebase.this, MapsActivity.class ) );
                break;


        }
    }



    private void addButterfly() {
        String name = editTextName.getText().toString().trim();
        String longitude = textView1.getText().toString().trim();
        String latitude = textView2.getText().toString().trim();
        String time = timeTextView.getText().toString().trim();
        String date = dateTextView.getText().toString().trim();
        String notice = notice1.getText().toString().trim();


        if(!TextUtils.isEmpty( name )){

            String id = databaseButterfly.push().getKey();
            FirebaseList firebaselist = new FirebaseList( id, name, longitude, latitude, time, date, notice );

            assert id != null;
            databaseButterfly.child(id).setValue( firebaselist );

            Toast.makeText( this, "A butterfly added", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText( this, "You should enter a butterfly", Toast.LENGTH_LONG ).show();
        }

    }
}