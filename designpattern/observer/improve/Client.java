package com.atguigu.designpattern.observer.improve;
/*
 * Name: Weijie Zhang
 * Matrikelnummer: s0582504
 */

/**
 * @author Weijie Zhang, weijiezhangpku@gmail.com
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer currentConditionsObserver = new CurrentConditionsObserver();

        weatherData.registerObserver(currentConditionsObserver);

        System.out.println("notify all registers");
        weatherData.setData(10,100,30);

        //add another current conditions observer
        Observer anotherCurrentConditionsObserver = new AnotherCurrentConditionsObserver();
        weatherData.registerObserver(anotherCurrentConditionsObserver);

        System.out.println("notify all registers");
        weatherData.setData(20,110,40);
    }
}
