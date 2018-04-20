package com.bignerdranch.android.criminalintent.dto;

import java.util.Date;
import java.util.UUID;

/**
 * Created by knowaknet on 20.04.2018.
 */

public class Crime {
    private UUID mID;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mID = UUID.randomUUID();
        mDate = new Date();
    }
}
