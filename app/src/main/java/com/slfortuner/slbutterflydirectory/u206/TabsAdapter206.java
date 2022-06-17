package com.slfortuner.slbutterflydirectory.u206;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter206 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter206(FragmentManager fm, int NoofTabs){
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
                Info_206_Fragment home = new Info_206_Fragment();
                return home;
            case 1:
                Photos_206_Fragment about = new Photos_206_Fragment();
                return about;
            default:
                return null;
        }
    }
}

