package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;

public class RotationActivity extends AppCompatActivity {

private boolean is_disabled

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotation);


        RadioGroup rg = findViewById(R.id.radiogroup1);
        RadioGroup rg = findViewById(R.id.radiogroup2);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                Button btn = findViewById(R.id.button5);

                if(!is_disabled) {
                switch (id) {
                    case R.id.radiobutton10:
                        btn.setEnabled(true);
                        break;
                    case R.id.radiobutton11:
                        btn.setEnabled(true);
                        break;

                }
            }
        });


        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                Button btn = findViewById(R.id.button5);

                switch (R.id.radiobutton13:
                btn.setRotation((float)0);
                break;
                switch (R.id.radiobutton14:
                btn.setRotation((float)45);
                break;
                switch (R.id.radiobutton15:
                btn.setRotation((float)90);
                break;
                switch (R.id.radiobutton16:
                btn.setRotation((float)135);
                break;


    }
}