package com.weather.proxy;

import com.weather.proxy.db.DbDataRetriever;
import com.weather.proxy.db.LazyDataRetrieverProxy;
import com.weather.proxy.db.PostgresDataRetriever;
import java.util.Random;

public class WeatherApp {

    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 7; n++) {
            DbDataRetriever dbDataRetriever = new LazyDataRetrieverProxy();
            int number = new Random().nextInt(100);
            System.out.println(dbDataRetriever.getWeather());
            if (number < 20) {
                System.out.println(dbDataRetriever.refreshData());
            }
            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }

}