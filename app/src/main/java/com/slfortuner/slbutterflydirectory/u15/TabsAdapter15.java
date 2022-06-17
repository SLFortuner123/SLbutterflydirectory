package com.slfortuner.slbutterflydirectory.u15;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter15 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter15(FragmentManager fm, int NoofTabs){
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
                Info_15_Fragment home = new Info_15_Fragment();
                return home;
            case 1:
                Photos_15_Fragment about = new Photos_15_Fragment();
                return about;
            default:
                return null;
        }
    }
}

