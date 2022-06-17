package com.slfortuner.slbutterflydirectory.u120;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter120 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter120(FragmentManager fm, int NoofTabs){
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
                Info_120_Fragment home = new Info_120_Fragment();
                return home;
            case 1:
                Photos_120_Fragment about = new Photos_120_Fragment();
                return about;
            default:
                return null;
        }
    }
}

