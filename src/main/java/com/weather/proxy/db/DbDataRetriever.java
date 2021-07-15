package com.weather.proxy.db;

public interface DbDataRetriever {
    String getWeather() throws InterruptedException;
    String refreshData() throws InterruptedException;
}