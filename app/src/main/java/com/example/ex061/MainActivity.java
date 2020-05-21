package com.example.ex061;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tb;

    Switch swBtn;

    LinearLayout MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        swBtn = (Switch) findViewById(R.id.swBtn);
        MainActivity = (LinearLayout) findViewById(R.id.MainActivity);
    }
    
    public void showBackground(View view) {
        if (tb.isChecked() && swBtn.isChecked()){
            MainActivity.setBackgroundColor(Color.parseColor("#eaff7b"));
        }
        else if (tb.isChecked() && !swBtn.isChecked()){
            MainActivity.setBackgroundColor(Color.parseColor("#00ffab"));
        }
        else if (!tb.isChecked() && !swBtn.isChecked()){
            MainActivity.setBackgroundColor(Color.parseColor("#29bdc1"));
        }
        else {
            MainActivity.setBackgroundColor(Color.parseColor("#d84242"));
        }
    }
}
