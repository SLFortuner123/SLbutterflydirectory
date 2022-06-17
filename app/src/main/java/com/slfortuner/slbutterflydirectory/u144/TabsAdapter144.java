package com.slfortuner.slbutterflydirectory.u144;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter144 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter144(FragmentManager fm, int NoofTabs){
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
                Info_144_Fragment home = new Info_144_Fragment();
                return home;
            case 1:
                Photos_144_Fragment about = new Photos_144_Fragment();
                return about;
            default:
                return null;
        }
    }
}

