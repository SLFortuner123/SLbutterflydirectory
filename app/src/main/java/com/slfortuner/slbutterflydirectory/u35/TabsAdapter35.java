package com.slfortuner.slbutterflydirectory.u35;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter35 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter35(FragmentManager fm, int NoofTabs){
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
                Info_35_Fragment home = new Info_35_Fragment();
                return home;
            case 1:
                Photos_35_Fragment about = new Photos_35_Fragment();
                return about;
            default:
                return null;
        }
    }
}

