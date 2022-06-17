package com.slfortuner.slbutterflydirectory.u243;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter243 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter243(FragmentManager fm, int NoofTabs){
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
                Info_243_Fragment home = new Info_243_Fragment();
                return home;
            case 1:
                Photos_243_Fragment about = new Photos_243_Fragment();
                return about;
            default:
                return null;
        }
    }
}

