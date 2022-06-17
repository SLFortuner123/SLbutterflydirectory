package com.slfortuner.slbutterflydirectory.u43;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter43 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter43(FragmentManager fm, int NoofTabs){
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
                Info_43_Fragment home = new Info_43_Fragment();
                return home;
            case 1:
                Photos_43_Fragment about = new Photos_43_Fragment();
                return about;
            default:
                return null;
        }
    }
}

