package com.slfortuner.slbutterflydirectory.u14;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter14 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter14(FragmentManager fm, int NoofTabs){
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
                Info_14_Fragment home = new Info_14_Fragment();
                return home;
            case 1:
                Photos_14_Fragment about = new Photos_14_Fragment();
                return about;
            default:
                return null;
        }
    }
}

