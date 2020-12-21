package com.example.p1101_dialogfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Dialog1 dlg1;
    Dialog2 dlg2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dlg1 = new Dialog1();
        dlg2 = new Dialog2();
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDlg1:
                dlg1.show(getFragmentManager(), "dlg1");
                break;
            case R.id.btnDlg2:
                dlg2.show(getFragmentManager(), "dlg2");
                break;
            default:
                break;
        }

    }
}