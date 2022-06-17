package com.slfortuner.slbutterflydirectory.u81;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter81 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter81(FragmentManager fm, int NoofTabs){
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
                Info_81_Fragment home = new Info_81_Fragment();
                return home;
            case 1:
                Photos_81_Fragment about = new Photos_81_Fragment();
                return about;
            default:
                return null;
        }
    }
}

