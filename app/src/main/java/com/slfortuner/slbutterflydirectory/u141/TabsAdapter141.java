package com.slfortuner.slbutterflydirectory.u141;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter141 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter141(FragmentManager fm, int NoofTabs){
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
                Info_141_Fragment home = new Info_141_Fragment();
                return home;
            case 1:
                Photos_141_Fragment about = new Photos_141_Fragment();
                return about;
            default:
                return null;
        }
    }
}

