package com.slfortuner.slbutterflydirectory.u90;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter90 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter90(FragmentManager fm, int NoofTabs){
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
                Info_90_Fragment home = new Info_90_Fragment();
                return home;
            case 1:
                Photos_90_Fragment about = new Photos_90_Fragment();
                return about;
            default:
                return null;
        }
    }
}

