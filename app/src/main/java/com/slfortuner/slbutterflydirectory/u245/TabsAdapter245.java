package com.slfortuner.slbutterflydirectory.u245;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter245 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter245(FragmentManager fm, int NoofTabs){
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
                Info_245_Fragment home = new Info_245_Fragment();
                return home;
            case 1:
                Photos_245_Fragment about = new Photos_245_Fragment();
                return about;
            default:
                return null;
        }
    }
}

