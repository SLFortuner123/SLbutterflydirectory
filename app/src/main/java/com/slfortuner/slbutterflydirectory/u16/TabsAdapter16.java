package com.slfortuner.slbutterflydirectory.u16;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter16 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter16(FragmentManager fm, int NoofTabs){
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
                Info_16_Fragment home = new Info_16_Fragment();
                return home;
            case 1:
                Photos_16_Fragment about = new Photos_16_Fragment();
                return about;
            default:
                return null;
        }
    }
}

