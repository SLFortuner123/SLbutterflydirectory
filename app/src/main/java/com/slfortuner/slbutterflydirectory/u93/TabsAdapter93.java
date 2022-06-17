package com.slfortuner.slbutterflydirectory.u93;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter93 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter93(FragmentManager fm, int NoofTabs){
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
                Info_93_Fragment home = new Info_93_Fragment();
                return home;
            case 1:
                Photos_93_Fragment about = new Photos_93_Fragment();
                return about;
            default:
                return null;
        }
    }
}

