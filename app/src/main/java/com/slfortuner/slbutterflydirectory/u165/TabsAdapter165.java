package com.slfortuner.slbutterflydirectory.u165;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter165 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter165(FragmentManager fm, int NoofTabs){
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
                Info_165_Fragment home = new Info_165_Fragment();
                return home;
            case 1:
                Photos_165_Fragment about = new Photos_165_Fragment();
                return about;
            default:
                return null;
        }
    }
}

