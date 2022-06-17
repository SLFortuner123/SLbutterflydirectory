package com.slfortuner.slbutterflydirectory.u247;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter247 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter247(FragmentManager fm, int NoofTabs){
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
                Info_247_Fragment home = new Info_247_Fragment();
                return home;
            case 1:
                Photos_247_Fragment about = new Photos_247_Fragment();
                return about;
            default:
                return null;
        }
    }
}

