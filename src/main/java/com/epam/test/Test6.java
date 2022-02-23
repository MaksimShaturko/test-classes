package com.epam.test;

public enum Test6 {
    WINTER(), SUMMER(20, "warm"), FALL(5, "cold"), SPRING(7);

    private int temperature;
    private String feelsLike;

    private Test6(int temperature){
        this.temperature = temperature;
    }

    private Test6(int temperature, String feelsLike){
        this.temperature = temperature;
        this.feelsLike = feelsLike;
    }

    private Test6(){

    }
}
