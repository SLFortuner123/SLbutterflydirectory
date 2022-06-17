package com.slfortuner.slbutterflydirectory.u48;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter48 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter48(FragmentManager fm, int NoofTabs){
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
                Info_48_Fragment home = new Info_48_Fragment();
                return home;
            case 1:
                Photos_48_Fragment about = new Photos_48_Fragment();
                return about;
            default:
                return null;
        }
    }
}

