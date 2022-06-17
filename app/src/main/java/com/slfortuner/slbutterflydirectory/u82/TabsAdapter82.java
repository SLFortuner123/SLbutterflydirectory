package com.slfortuner.slbutterflydirectory.u82;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter82 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter82(FragmentManager fm, int NoofTabs){
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
                Info_82_Fragment home = new Info_82_Fragment();
                return home;
            case 1:
                Photos_82_Fragment about = new Photos_82_Fragment();
                return about;
            default:
                return null;
        }
    }
}

