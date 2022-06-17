package com.slfortuner.slbutterflydirectory.u159;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter159 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter159(FragmentManager fm, int NoofTabs){
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
                Info_159_Fragment home = new Info_159_Fragment();
                return home;
            case 1:
                Photos_159_Fragment about = new Photos_159_Fragment();
                return about;
            default:
                return null;
        }
    }
}

