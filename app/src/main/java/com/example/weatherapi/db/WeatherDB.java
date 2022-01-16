package com.example.weatherapi.db;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.weatherapi.model.SavedDailyForecast;
import com.example.weatherapi.model.UviDb;


@Database(entities = {SavedDailyForecast.class, UviDb.class},
        version = 1,
        exportSchema = false)

public abstract class WeatherDB extends RoomDatabase {
    abstract public ForecastDao forecastDao();
}
