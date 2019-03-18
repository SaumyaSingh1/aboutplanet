package com.example.aboutplanet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {  //EXPLICIT INTENTS, add an activity to the app
 TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);
        ListView lv;


        textView.setOnClickListener(new View.OnClickListener() {     //on clicking the imagebutton a new activity will open which wil display a msg
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this,NewActivity.class);
                startActivity(intentLoadNewActivity); //starting activity

                //THis is example of explicit Intent
                //we are adding an action , an activity in our app


            } } );
    }

    }

