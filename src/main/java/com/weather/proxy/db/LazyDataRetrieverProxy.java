package com.weather.proxy.db;

import com.weather.proxy.db.DbDataRetriever;
import com.weather.proxy.db.PostgresDataRetriever;

public class LazyDataRetrieverProxy implements DbDataRetriever {

    private DbDataRetriever retriever;

    @Override
    public String getWeather() throws InterruptedException {
        if (retriever == null)
            retriever = new PostgresDataRetriever();
        return retriever.getWeather();
    }

    @Override
    public String refreshData() throws InterruptedException {
        if (retriever == null)
            retriever = new PostgresDataRetriever();
        return retriever.refreshData();
    }

}