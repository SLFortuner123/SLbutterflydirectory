package com.slfortuner.slbutterflydirectory.u139;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter139 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter139(FragmentManager fm, int NoofTabs){
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
                Info_139_Fragment home = new Info_139_Fragment();
                return home;
            case 1:
                Photos_139_Fragment about = new Photos_139_Fragment();
                return about;
            default:
                return null;
        }
    }
}

