package com.slfortuner.slbutterflydirectory.u5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter5 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter5(FragmentManager fm, int NoofTabs){
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
                Info_5_Fragment home = new Info_5_Fragment();
                return home;
            case 1:
                Photos_5_Fragment about = new Photos_5_Fragment();
                return about;
            default:
                return null;
        }
    }
}

