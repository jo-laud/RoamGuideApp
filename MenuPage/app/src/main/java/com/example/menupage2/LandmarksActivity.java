package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LandmarksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landmarks);


        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Click to jump to target page
        ImageView ImageViewL1= findViewById(R.id.imageViewL1);
        ImageViewL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, L1Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewL2= findViewById(R.id.imageViewL2);
        ImageViewL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, L2Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewL3= findViewById(R.id.imageViewL3);
        ImageViewL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, L3Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewL4= findViewById(R.id.imageViewL4);
        ImageViewL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, L4Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewL5= findViewById(R.id.imageViewL5);
        ImageViewL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(LandmarksActivity.this, L5Activity.class);
                startActivity(intent);
            }
        });


    }
}