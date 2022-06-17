package com.slfortuner.slbutterflydirectory.u61;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter61 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter61(FragmentManager fm, int NoofTabs){
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
                Info_61_Fragment home = new Info_61_Fragment();
                return home;
            case 1:
                Photos_61_Fragment about = new Photos_61_Fragment();
                return about;
            default:
                return null;
        }
    }
}

