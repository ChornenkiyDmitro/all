package com.example.p0691_parcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Second extends AppCompatActivity {

    final String LOG_TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        MyObject myObj = (MyObject) getIntent().getParcelableExtra(
                MyObject.class.getCanonicalName());
        Log.d(LOG_TAG, "myObj: " + myObj.s + ", " + myObj.i);

    }
}