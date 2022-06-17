package com.slfortuner.slbutterflydirectory.u51;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter51 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter51(FragmentManager fm, int NoofTabs){
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
                Info_51_Fragment home = new Info_51_Fragment();
                return home;
            case 1:
                Photos_51_Fragment about = new Photos_51_Fragment();
                return about;
            default:
                return null;
        }
    }
}

