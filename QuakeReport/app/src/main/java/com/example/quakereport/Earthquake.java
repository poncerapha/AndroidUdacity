package com.example.quakereport;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    public Earthquake(String mMagnitude, String mLocation, long mTimeInMilliseconds) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
