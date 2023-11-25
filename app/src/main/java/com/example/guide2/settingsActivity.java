package com.example.guide2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class settingsActivity extends AppCompatActivity {
    ImageView openAbout;
    ImageView lan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        openAbout = (ImageView) findViewById(R.id.about);
        lan = (ImageView) findViewById(R.id.lang);

        openAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(settingsActivity.this, popmenu.class));
            }

        });
        lan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(settingsActivity.this, Weather.class));
            }
        });

    }
}