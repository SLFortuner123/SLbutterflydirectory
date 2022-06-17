package com.slfortuner.slbutterflydirectory.u119;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter119 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter119(FragmentManager fm, int NoofTabs){
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
                Info_119_Fragment home = new Info_119_Fragment();
                return home;
            case 1:
                Photos_119_Fragment about = new Photos_119_Fragment();
                return about;
            default:
                return null;
        }
    }
}

