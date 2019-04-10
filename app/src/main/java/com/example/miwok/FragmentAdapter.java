package com.example.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i == 0) {
            return new FamilyFragment();
        } else if (i == 1){
            return new NumbersFragment();
        } else if (i == 2) {
            return new PhrasesFragment();
        } else {
            return new ColorsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
