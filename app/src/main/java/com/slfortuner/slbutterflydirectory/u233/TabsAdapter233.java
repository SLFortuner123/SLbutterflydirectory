package com.slfortuner.slbutterflydirectory.u233;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter233 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter233(FragmentManager fm, int NoofTabs){
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
                Info_233_Fragment home = new Info_233_Fragment();
                return home;
            case 1:
                Photos_233_Fragment about = new Photos_233_Fragment();
                return about;
            default:
                return null;
        }
    }
}

