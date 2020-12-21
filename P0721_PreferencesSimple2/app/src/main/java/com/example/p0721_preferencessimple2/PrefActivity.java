package com.example.p0721_preferencessimple2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.util.Log;

public class PrefActivity extends AppCompatActivity {

    private static String LOG_TAG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefFragment1()).commit();
        Log.d(LOG_TAG,"onCreatePrefActivity");

    }

    public static class PrefFragment1 extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //PreferenceManager.setDefaultValues(getActivity());
            addPreferencesFromResource(R.xml.pref);
        }
    }
}