package com.slfortuner.slbutterflydirectory.u153;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter153 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter153(FragmentManager fm, int NoofTabs){
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
                Info_153_Fragment home = new Info_153_Fragment();
                return home;
            case 1:
                Photos_153_Fragment about = new Photos_153_Fragment();
                return about;
            default:
                return null;
        }
    }
}

