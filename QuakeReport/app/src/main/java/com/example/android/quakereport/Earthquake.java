package com.example.android.quakereport;

/**
 * Created by rajpa on 24-Oct-16.
 */

public class Earthquake {

    private String mMagnitute;
    private String mLocation;
    private String mDate;


    public Earthquake(String mMagnitute, String mLocation, String mDate) {
        this.mMagnitute = mMagnitute;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public String getmMagnitute() {
        return mMagnitute;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }
}
