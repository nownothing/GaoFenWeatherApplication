package com.example.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;
    @SerializedName("basic")
    public Basic basics;
    @SerializedName("aqi")
    public AQI aqi;
    @SerializedName("wind")
    public Wind wind;
    @SerializedName("now")
    public Now now;
    @SerializedName("suggestion")
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
