package Api;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse {

    @SerializedName("name")
    private String name;

    @SerializedName("sys")
    private Sys sys;

    @SerializedName("main")
    private Main main;

    public String getName() {
        return name;
    }

    public Sys getSys() {
        return sys;
    }

    public Main getMain() {
        return main;
    }

    public static class Sys {
        @SerializedName("country")
        private String country;

        public String getCountry() {
            return country;
        }
    }

    public static class Main {
        @SerializedName("temp")
        private double temp;

        public double getTemp() {
            return temp;
        }
    }
}