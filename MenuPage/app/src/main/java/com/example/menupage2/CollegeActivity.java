package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CollegeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Click to jump to target page
        ImageView ImageViewC1= findViewById(R.id.imageViewC1);
        ImageViewC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CollegeActivity.this, C1Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewC2= findViewById(R.id.imageViewC2);
        ImageViewC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CollegeActivity.this, C2Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewC3= findViewById(R.id.imageViewC3);
        ImageViewC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CollegeActivity.this, C3Activity.class);
                startActivity(intent);
            }
        });
    }
}