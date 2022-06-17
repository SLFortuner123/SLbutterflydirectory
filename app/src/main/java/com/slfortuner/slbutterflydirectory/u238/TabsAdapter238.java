package com.slfortuner.slbutterflydirectory.u238;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter238 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter238(FragmentManager fm, int NoofTabs){
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
                Info_238_Fragment home = new Info_238_Fragment();
                return home;
            case 1:
                Photos_238_Fragment about = new Photos_238_Fragment();
                return about;
            default:
                return null;
        }
    }
}

