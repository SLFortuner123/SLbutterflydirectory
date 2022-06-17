package com.slfortuner.slbutterflydirectory.u60;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter60 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter60(FragmentManager fm, int NoofTabs){
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
                Info_60_Fragment home = new Info_60_Fragment();
                return home;
            case 1:
                Photos_60_Fragment about = new Photos_60_Fragment();
                return about;
            default:
                return null;
        }
    }
}

