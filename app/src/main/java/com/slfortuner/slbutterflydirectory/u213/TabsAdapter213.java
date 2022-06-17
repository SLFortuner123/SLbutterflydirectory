package com.slfortuner.slbutterflydirectory.u213;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter213 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter213(FragmentManager fm, int NoofTabs){
        super(fm);
        this.mNumOfTabs = NoofTabs;
    }
    @Override
    public int getCount() {
        return mNumOfTabs;
    }
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                Info_213_Fragment home = new Info_213_Fragment();
                return home;
            case 1:
                Photos_213_Fragment about = new Photos_213_Fragment();
                return about;
            default:
                return null;
        }
    }
}

