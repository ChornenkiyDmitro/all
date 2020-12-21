package com.example.p1161_mngtasks1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ActivityA extends MainActivity{
    public void onClick(View v){
        startActivity(new Intent(this, ActivityB.class));
    }
}
