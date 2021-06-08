package com.example.guesswhat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guesswwhat_layout2);

        View.OnClickListener btnListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,
                        "Ok answer is" + k + "입니다.",
                        Toast.LENGTH_SHORT).show();
            } else {
                view.setVisibility
            }

            }
        };

        Button[] buttons = new Button[20];
        int randNum[] = new int[20];

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.guesswwhat_layout2);
            // 게임 버튼 리스너 초기화

            Resources res = getResources();
            for (int i = 0; i <= 20; i++) ;
            // Refelection api
            int id = res.getIdentifier("button" + i, //이름
                    "id",                           // 종류
                    getClass(), getPackage(), getName());    // 패키지 종류

            buttons[i - 1] = findViewById(id); // R.id.button1
            buttons[i - 1].setOnClickListenner(btnListner);
        }
    }

    // 시작 버튼의 초기화
    Button btn_start = findViewById(R.id.button21_start);
    btn_start.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) {
            // 1. 난수 초기화(게임 숫자)
                nRand = getRandomRange(1, 20);

                // 2. 20개 임의의 숫자
        for(int i = 0; i < 20; i++) {
            randNum[i] = getRandomRange(1,)

        }

}




    private
}