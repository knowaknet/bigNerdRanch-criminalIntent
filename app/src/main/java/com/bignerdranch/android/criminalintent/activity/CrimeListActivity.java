package com.bignerdranch.android.criminalintent.activity;

import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.fragments.CrimeFragment;
import com.bignerdranch.android.criminalintent.fragments.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
