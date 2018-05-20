package com.bignerdranch.android.criminalintent.model;

import android.content.Context;

import com.bignerdranch.android.criminalintent.model.dto.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by knowaknet on 20.05.2018.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private List<Crime> mCrimes;

    private CrimeLab(Context context){
        mCrimes = new ArrayList<>();
    }

    public CrimeLab get(Context context){
        if(sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id){
        for (Crime c : mCrimes) {
            if(c.getID().equals(id)){
                return c;
            }
        }

        return null;
    }
}
