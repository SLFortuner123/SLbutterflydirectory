package com.slfortuner.slbutterflydirectory.u21;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter21 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter21(FragmentManager fm, int NoofTabs){
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
                Info_21_Fragment home = new Info_21_Fragment();
                return home;
            case 1:
                Photos_21_Fragment about = new Photos_21_Fragment();
                return about;
            default:
                return null;
        }
    }
}

