package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Click to jump to target page
        ImageView ImageViewHistory = findViewById(R.id.imageViewHistory);
        ImageViewHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewLandmarks = findViewById(R.id.imageViewLandmarks);
        ImageViewLandmarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, LandmarksActivity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCollege = findViewById(R.id.imageViewCollege);
        ImageViewCollege.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, CollegeActivity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewCuisine= findViewById(R.id.imageViewCuisine);
        ImageViewCuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, CuisineActivity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewMap = findViewById(R.id.imageViewMap);
        ImageViewMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        ImageView ImageViewWeather = findViewById(R.id.imageViewWeather);
        ImageViewWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });







    }
}