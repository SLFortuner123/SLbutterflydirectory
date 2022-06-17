package com.slfortuner.slbutterflydirectory.u154;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter154 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter154(FragmentManager fm, int NoofTabs){
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
                Info_154_Fragment home = new Info_154_Fragment();
                return home;
            case 1:
                Photos_154_Fragment about = new Photos_154_Fragment();
                return about;
            default:
                return null;
        }
    }
}

