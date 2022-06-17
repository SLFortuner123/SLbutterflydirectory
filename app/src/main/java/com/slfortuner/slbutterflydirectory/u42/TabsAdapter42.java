package com.slfortuner.slbutterflydirectory.u42;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter42 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter42(FragmentManager fm, int NoofTabs){
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
                Info_42_Fragment home = new Info_42_Fragment();
                return home;
            case 1:
                Photos_42_Fragment about = new Photos_42_Fragment();
                return about;
            default:
                return null;
        }
    }
}

