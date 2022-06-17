package com.slfortuner.slbutterflydirectory.u126;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter126 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter126(FragmentManager fm, int NoofTabs){
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
                Info_126_Fragment home = new Info_126_Fragment();
                return home;
            case 1:
                Photos_126_Fragment about = new Photos_126_Fragment();
                return about;
            default:
                return null;
        }
    }
}

