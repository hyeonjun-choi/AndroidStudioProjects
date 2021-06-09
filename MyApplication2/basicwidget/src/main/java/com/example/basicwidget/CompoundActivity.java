package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CompoundActivity extends AppCompatActivity {

    CompoundButton.OnCheckedChangeListener myCheckedListener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
          int id = compoundButton.getId();
          CheckBox cb = (CheckBox)compoundButton;
            TextView tv = findViewById(R.id.textView4);
          if(b == true) {
              switch (id) {
                  case R.id.checkBox4:
                      tv.setTextColor(Color.RED);
                      break;
                  case R.id.checkBox5:
                      tv.setTextColor(Color.BLUE);
                      break;
              }
          } else {
              tv.setTextColor(Color.GRAY);
          }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);

        CheckBox cbAndroid = findViewById(R.id.checkbox);
        CheckBox cbIphone = findViewById(R.id.checkbox2);
        CheckBox cbHandphone = findViewById(R.id.checkbox3);

        cbIphone.setOnCheckedChangeListener(myCheckedListener);
        cbHandphone.setOnCheckedChangeListener(myCheckedListener);

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                CheckBox cb = (CheckBox)compoundButton;

                if(b == true) {
                    Toast.makeText(CompoundActivity.this,
                            "" + cb.getText() + " is Checked!",
                            Toast.LENGTH_SHORT)
                            .show();
                } else {
                    Toast.makeText(CompoundActivity.this,
                            "" + cb.getText() + " is Checked!",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });


        RadioGroup rg = findViewById(R.id.radiogroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.radioButton:
                        Toast.makeText(CompoundActivity.this,
                        "남성",
                                Toast.LENGTH_SHORT)
                                .show();
                        break;
                    case R.id.radioButton2:
                        Toast.makeText(CompoundActivity.this,
                                "여성",
                                Toast.LENGTH_SHORT)
                                .show();
                }
            }
        });
















    }

    public void ohHandPhone(View V) {
        CheckBox cb = (CheckBox)v;

        Toast.makeText(CompoundActivity.this,
                ""+cb)
    }
}