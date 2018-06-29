package com.example.android.quakereport;

public class Earthquake {
    private double magnitude;
    private String places;
    private long timeInMilli;

    /**
     * @param magintude   Earthquake Intensity
     * @param places      Earthquake place
     * @param timeInMilli Earthquake time in milliseconds
     */
    Earthquake(double magintude, String places, long timeInMilli) {
        this.magnitude = magintude;
        this.places = places;
        this.timeInMilli = timeInMilli;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public long getTimeInMilli() {
        return timeInMilli;
    }

    public String getPlaces() {
        return places;
    }
}
