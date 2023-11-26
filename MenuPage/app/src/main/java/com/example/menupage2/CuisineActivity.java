package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CuisineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //Click to jump to target page
        ImageView ImageViewCu1= findViewById(R.id.imageViewCu1);
        ImageViewCu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu1Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCu2= findViewById(R.id.imageViewCu2);
        ImageViewCu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu2Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCu3= findViewById(R.id.imageViewCu3);
        ImageViewCu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu3Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCu4= findViewById(R.id.imageViewCu4);
        ImageViewCu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu4Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCu5= findViewById(R.id.imageViewCu5);
        ImageViewCu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu5Activity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCu6= findViewById(R.id.imageViewCu6);
        ImageViewCu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(CuisineActivity.this, Cu6Activity.class);
                startActivity(intent);
            }
        });

    }
}