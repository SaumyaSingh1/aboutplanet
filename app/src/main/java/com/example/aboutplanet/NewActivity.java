package com.example.aboutplanet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import android.nfc.Tag;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;

public class NewActivity extends AppCompatActivity{
    public static final String TAG="IMG";
    protected void onCreate(Bundle savedInstanceState)
    { Log.i(TAG,"ONCREATE ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }}