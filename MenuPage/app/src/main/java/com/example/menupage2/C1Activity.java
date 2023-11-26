package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class C1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(C1Activity.this, CollegeActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageViewC11  = findViewById(R.id.imageViewC11);
        imageViewC11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.gla.ac.uk/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView ImageViewC12= findViewById(R.id.imageViewC12);
        ImageViewC12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(C1Activity.this, InfoC1Activity.class);
                startActivity(intent);
            }
        });

    }
}