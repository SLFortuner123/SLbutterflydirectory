package com.slfortuner.slbutterflydirectory.u24;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter24 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter24(FragmentManager fm, int NoofTabs){
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
                Info_24_Fragment home = new Info_24_Fragment();
                return home;
            case 1:
                Photos_24_Fragment about = new Photos_24_Fragment();
                return about;
            default:
                return null;
        }
    }
}

