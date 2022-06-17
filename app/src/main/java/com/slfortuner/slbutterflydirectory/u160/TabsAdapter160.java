package com.slfortuner.slbutterflydirectory.u160;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter160 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter160(FragmentManager fm, int NoofTabs){
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
                Info_160_Fragment home = new Info_160_Fragment();
                return home;
            case 1:
                Photos_160_Fragment about = new Photos_160_Fragment();
                return about;
            default:
                return null;
        }
    }
}

