package com.slfortuner.slbutterflydirectory.u30;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter30 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter30(FragmentManager fm, int NoofTabs){
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
                Info_30_Fragment home = new Info_30_Fragment();
                return home;
            case 1:
                Photos_30_Fragment about = new Photos_30_Fragment();
                return about;
            default:
                return null;
        }
    }
}

