package com.example.weatherapi.api;


import androidx.lifecycle.LiveData;


import com.example.weatherapi.model.Uvi;
import com.example.weatherapi.model.WeatherForecast;

import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {
    @GET("forecast/daily/")
    LiveData<ApiResponse<WeatherForecast>> getWeatherForecast(@Query("q") String city,
                                                              @Query("cnt") String numDays,
                                                              @Query("units") String units,
                                                              @Query("APPID") String apiKey);

    @GET("uvi")
    LiveData<ApiResponse<Uvi>> getUvi(@Query("lat") Double latitude,
                                      @Query("lon") Double longitude,
                                      @Query("appid") String apiKey);
}
