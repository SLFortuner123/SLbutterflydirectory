package com.slfortuner.slbutterflydirectory.u100;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter100 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter100(FragmentManager fm, int NoofTabs){
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
                Info_100_Fragment home = new Info_100_Fragment();
                return home;
            case 1:
                Photos_100_Fragment about = new Photos_100_Fragment();
                return about;
            default:
                return null;
        }
    }
}

