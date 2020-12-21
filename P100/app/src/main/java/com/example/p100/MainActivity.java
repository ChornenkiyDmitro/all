package com.example.p100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(intent.putExtra("time", 3).putExtra("label", "Call 1") );
        startService(intent.putExtra("time", 1).putExtra("label", "Call 2") );
        startService(intent.putExtra("time", 4).putExtra("label", "Call 3") );
    }
}