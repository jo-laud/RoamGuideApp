package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class L2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l2);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(L2Activity.this, LandmarksActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageViewL21  = findViewById(R.id.imageViewL21);
        imageViewL21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.historicenvironment.scot/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView ImageViewL22= findViewById(R.id.imageViewL22);
        ImageViewL22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(L2Activity.this, InfoL2Activity.class);
                startActivity(intent);
            }
        });


    }
}