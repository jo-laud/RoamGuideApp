package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Cu1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cu1);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(Cu1Activity.this, CuisineActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageViewCu11  = findViewById(R.id.imageViewCu11);
        imageViewCu11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://opiumrestaurant.co.uk/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}