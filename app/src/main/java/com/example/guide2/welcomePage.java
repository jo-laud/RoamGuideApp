package com.example.guide2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import pl.droidsonroids.gif.GifDrawable;


public class welcomePage extends AppCompatActivity {
    private Button myRoamButton;
    String[] item = {"EB","FR","CN","ES"};


    AutoCompleteTextView autoCompleteTextView;

    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomepage);

        myRoamButton = (Button) findViewById(R.id.mRB);
        myRoamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(welcomePage.this,MapsActivity.class));
            }
        });

        autoCompleteTextView=findViewById(R.id.autoCompleteTextView);
        adapterItems=new ArrayAdapter<String>(this,R.layout.dropdown_item, item);

        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item=parent.getItemAtPosition(position).toString();
                Toast.makeText(welcomePage.this,"EN:"+ item,Toast.LENGTH_SHORT);
            }
        });

        /*Language languages = getResources().getStringArray(R.array.languages);*/
    }


}
