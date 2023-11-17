package com.example.guide2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class intro extends AppCompatActivity {

    private static int Splash=5000;

    ImageView logo;
    LottieAnimationView lottieAnimationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introxml);

        logo=findViewById(R.id.whitelo);
        lottieAnimationView=findViewById(R.id.lottie);


        logo.animate().translationY(-1400).setDuration(4000).setStartDelay(180);
        lottieAnimationView.animate().translationY(1400).setDuration(4000).setStartDelay(200);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(intro.this,welcomePage.class);
                startActivity(intent);
            }
        },Splash);

    }
}