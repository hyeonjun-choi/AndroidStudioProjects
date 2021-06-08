package com.example.intendcall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHomepage(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void onPhone(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-1111"));
        startActivity(intent);
    }

    public void onGallery(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.563563, 126.975331"));
        startActivity(intent);
    }
    public void onFinish(View v) {
        finish();
    }


}