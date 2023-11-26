package com.example.menupage2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfoL5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_l5);

        ImageView ImageViewBack = findViewById(R.id.imageViewBack);
        ImageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent intent = new Intent(InfoL5Activity.this, L4Activity.class);
                startActivity(intent);
            }
        });


    }
}