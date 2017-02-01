package com.example.android.quakereport;

/**
 * Created by aarshad on 1/9/17.
 */

public class Earthquake  {
    private double mMagnitude ;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long date, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
        mUrl = url;
    }



    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getUrl() {
        return mUrl;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

}
