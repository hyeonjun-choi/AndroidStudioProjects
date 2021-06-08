package com.example.mycoller;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onRed (View v) {
        LinearLayout layout = findViewById(R.id.Lay);
        layout.setBackgroundColor(Color.RED);
    }

    public void onBlue (View v) {
        LinearLayout layout = findViewById(R.id.Lay);
        layout.setBackgroundColor(Color.BLUE);
    }

    public void onGreen (View v) {
        LinearLayout layout = findViewById(R.id.Lay);
        layout.setBackgroundColor(Color.GREEN);
    }



}