package com.slfortuner.slbutterflydirectory.u235;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter235 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter235(FragmentManager fm, int NoofTabs){
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
                Info_235_Fragment home = new Info_235_Fragment();
                return home;
            case 1:
                Photos_235_Fragment about = new Photos_235_Fragment();
                return about;
            default:
                return null;
        }
    }
}

