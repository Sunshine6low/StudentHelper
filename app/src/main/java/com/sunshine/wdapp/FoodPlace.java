package com.sunshine.wdapp;

import java.util.Date;

class FoodPlace {
    private String name;
    // String pathToImg;
    private float rating;
    private String desc;
    private double longitude;
    private double latitude;
    //private Date timeOfClose;
    //private Date timeOfStart

    FoodPlace(String name, float rating, String desc, double longitude, double latitude/*, Date timeOfClose, Date timeOfStart*/) {
        this.name = name;
        this.rating = rating;
        this.desc = desc;
        this.longitude = longitude;
        this.latitude = latitude;
        //this.timeOfClose = timeOfClose;
        //this.timeOfStart = timeOfStart;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getRatingString() {
        return "Рейтинг: " + rating;
    }
}
