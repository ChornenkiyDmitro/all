package com.example.p1161_mngtasks1;

import android.content.Intent;
import android.view.View;

public class ActivityС extends MainActivity {
    public void onClick(View v) {
        startActivity(new Intent(this, ActivityD.class));
    }
}
