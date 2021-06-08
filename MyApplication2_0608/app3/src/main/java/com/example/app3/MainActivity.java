package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int o1 = 0;
    int o2 = 0;
    int op = -1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = findViewById(R.id.button17);
        Button minus = findViewById(R.id.button9);
        Button multi = findViewById(R.id.button18);
        Button enter = findViewById(R.id.button5);

        Button n1 = findViewById(R.id.button14);
        Button n2 = findViewById(R.id.button15);
        Button n3 = findViewById(R.id.button16);
        Button n4 = findViewById(R.id.button6);
        Button n5 = findViewById(R.id.button7);
        Button n6 = findViewById(R.id.button8);
        Button n7 = findViewById(R.id.button2);
        Button n8 = findViewById(R.id.button3);
        Button n9 = findViewById(R.id.button4);
        Button n0 = findViewById(R.id.button19);


        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o1 = Integer.valueOf(n1.getText().toString());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = 0;
            }
        });


        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                o2 = 3;
            }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.textview);
                if( op == 0) { // plus
                tv.setText((o1 + o2));
                }
            }
        });


    }
}