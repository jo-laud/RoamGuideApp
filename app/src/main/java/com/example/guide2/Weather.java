package com.example.guide2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import Api.WeatherApi;
import Api.WeatherResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Weather extends AppCompatActivity {

    private TextView textLocation;
    private TextView textTemperature;
    private Button btnAccess;

    private static final String BASE_URL = "https://home.openweathermap.org/api_keys";
    private static final String API_KEY = "47a7f1fa8637d2c5fcc23e4c9b314a7a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        textLocation = findViewById(R.id.textLocation);
        textTemperature = findViewById(R.id.textTemperature);
        btnAccess = findViewById(R.id.btnRefresh);

        btnAccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fetchWeatherData("Glasgow");
            }
        });
    }

    private void fetchWeatherData(String cityName) {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        WeatherApi weatherApi = retrofit.create(WeatherApi.class);
        Call<WeatherResponse> call = weatherApi.getWeather(cityName, API_KEY);

        call.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    WeatherResponse weatherResponse = response.body();
                    String location = weatherResponse.getName() + ", " + weatherResponse.getSys().getCountry();
                    double tempCelsius = weatherResponse.getMain().getTemp() - 273.15;
                    String temperature = String.format("%.2f°C", tempCelsius);

                    updateWeather(location, temperature);
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

    private void updateWeather(String location, String temperature) {
        textLocation.setText(location);
        textTemperature.setText("Temperature: " + temperature);
    }
}