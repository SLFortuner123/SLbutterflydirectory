package com.slfortuner.slbutterflydirectory.u20;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter20 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter20(FragmentManager fm, int NoofTabs){
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
                Info_20_Fragment home = new Info_20_Fragment();
                return home;
            case 1:
                Photos_20_Fragment about = new Photos_20_Fragment();
                return about;
            default:
                return null;
        }
    }
}

