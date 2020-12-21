package com.example.p0731_preferencesenable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.util.Log;
import android.widget.CheckBox;

public class PrefActivity extends AppCompatActivity {

    CheckBoxPreference chb3;
    PreferenceCategory categ2;

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

            CheckBoxPreference chb3 = (CheckBoxPreference) findPreference("chb3");
            PreferenceCategory categ2 = (PreferenceCategory) findPreference("categ2");
            categ2.setEnabled(chb3.isChecked());

            chb3.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    categ2.setEnabled(chb3.isChecked());
                    return false;
                }
            });
        }
    }
}

