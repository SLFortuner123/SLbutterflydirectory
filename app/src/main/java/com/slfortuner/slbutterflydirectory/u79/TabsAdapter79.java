package com.slfortuner.slbutterflydirectory.u79;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter79 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter79(FragmentManager fm, int NoofTabs){
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
                Info_79_Fragment home = new Info_79_Fragment();
                return home;
            case 1:
                Photos_79_Fragment about = new Photos_79_Fragment();
                return about;
            default:
                return null;
        }
    }
}

