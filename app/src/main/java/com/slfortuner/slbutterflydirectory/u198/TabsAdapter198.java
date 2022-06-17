package com.slfortuner.slbutterflydirectory.u198;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter198 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter198(FragmentManager fm, int NoofTabs){
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
                Info_198_Fragment home = new Info_198_Fragment();
                return home;
            case 1:
                Photos_198_Fragment about = new Photos_198_Fragment();
                return about;
            default:
                return null;
        }
    }
}

