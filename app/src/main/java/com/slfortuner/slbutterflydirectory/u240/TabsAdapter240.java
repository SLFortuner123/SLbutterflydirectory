package com.slfortuner.slbutterflydirectory.u240;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter240 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter240(FragmentManager fm, int NoofTabs){
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
                Info_240_Fragment home = new Info_240_Fragment();
                return home;
            case 1:
                Photos_240_Fragment about = new Photos_240_Fragment();
                return about;
            default:
                return null;
        }
    }
}

