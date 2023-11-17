package com.example.guide2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap cityMap;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

       button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MapsActivity.this,settingsActivity.class));
            }
        });

        SupportMapFragment cityMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.citymap);
        cityMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

        this.cityMap = googleMap;
        LatLng Glasgow = new LatLng(55.8617, -4.2583);
        this.cityMap.addMarker(new MarkerOptions().position(Glasgow).title("Glasgow"));
        this.cityMap.moveCamera(CameraUpdateFactory.newLatLng(Glasgow));

    }
}
