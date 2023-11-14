package com.example.guide2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    String[] item = {"EB","FR","CN","ES"};

    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        adapterItems=new ArrayAdapter<String>(this,R.layout.dropdown_item, item);

        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(MainActivity.this,"EN:"+ item,Toast.LENGTH_SHORT);
            }
        });

        /*Language languages = getResources().getStringArray(R.array.languages);*/
    }


}

    /*VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.appvid);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }

    @Override
    protected void onPostResume(){
        videoView.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        videoView.start();
        super.onRestart();
    }
    @Override
    protected void onPause() {
        videoView.suspend();
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        videoView.stopPlayback();
        super.onDestroy();
    }*/
