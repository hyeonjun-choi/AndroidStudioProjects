package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int o1 = 0;
    int o3 = 0;

    int op = 0; // 0; +, 1: -, 3: *, 4: /


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Plus = findViewById(R.id.button12);
        Button enter = findViewById(R.id.button16);


        Button n1 = findViewById(R.id.button9);
        Button n2 = findViewById(R.id.button10);
        Button n3 = findViewById(R.id.button11);
        Button n4 = findViewById(R.id.button5);
        Button n5 = findViewById(R.id.button6);
        Button n6 = findViewById(R.id.button7);
        Button n7 = findViewById(R.id.button);
        Button n8 = findViewById(R.id.button2);
        Button n9 = findViewById(R.id.button3);

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { o1 = Integer.valueOf(n1.getText().toString()); }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) { o3 = 3; }
        });

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = findViewById(R.id.TextView);
                if (op == 0) {
                    tv.setText("" + (o1 + o3));
                }
            }
        });



    }

}




