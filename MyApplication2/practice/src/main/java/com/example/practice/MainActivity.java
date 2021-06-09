package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.linear_baseline);

        // parameter
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT

                );

        LinearLayout layout = new LinearLayout(MainActivity.this)
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.red());
    }
}