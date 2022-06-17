package com.slfortuner.slbutterflydirectory.u17;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter17 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter17(FragmentManager fm, int NoofTabs){
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
                Info_17_Fragment home = new Info_17_Fragment();
                return home;
            case 1:
                Photos_17_Fragment about = new Photos_17_Fragment();
                return about;
            default:
                return null;
        }
    }
}

