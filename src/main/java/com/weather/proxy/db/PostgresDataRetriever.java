package com.weather.proxy.db;

import com.weather.proxy.db.DbDataRetriever;

public class PostgresDataRetriever implements DbDataRetriever {

    public PostgresDataRetriever() throws InterruptedException {
        Thread.sleep(5000);
        //refreshData();
    }

    @Override
    public String getWeather() {
        return "Morning: wheather will be sunny and without cloud. Temperature will be 28 degree.";
    }

    @Override
    public String refreshData() {
        return "Afternoon: Wheather will be runny and cloud. Temperature will be 15 degree.";
    }

}