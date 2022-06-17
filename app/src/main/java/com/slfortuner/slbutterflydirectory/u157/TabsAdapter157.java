package com.slfortuner.slbutterflydirectory.u157;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter157 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter157(FragmentManager fm, int NoofTabs){
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
                Info_157_Fragment home = new Info_157_Fragment();
                return home;
            case 1:
                Photos_157_Fragment about = new Photos_157_Fragment();
                return about;
            default:
                return null;
        }
    }
}

