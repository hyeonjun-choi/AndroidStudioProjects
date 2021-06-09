package com.example.basicwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTextSize(View v) {
        EditText ed = findViewById(R.id.editTextNumber2);
        TextView tv = findViewById(R.id.textView2);

        if( ! "".equals(ed.getText())) {
            int size = Integer.parseInt(ed.getText().toString());
            //getTextSize()
            ((TextView)v).setTextSize((float)size);
        }
    }

    public void onColorRed(View v) {
        TextView tv = findViewById(R.id.textView);
        tv.setTextColor(Color.BLUE);
        tv.setTextColor(Color.rgb());
    }

    public void onTextSize(View v) {

    }

    public void onTextSize(View v) {

    }

}