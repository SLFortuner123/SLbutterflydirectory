package com.slfortuner.slbutterflydirectory.u178;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter178 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter178(FragmentManager fm, int NoofTabs){
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
                Info_178_Fragment home = new Info_178_Fragment();
                return home;
            case 1:
                Photos_178_Fragment about = new Photos_178_Fragment();
                return about;
            default:
                return null;
        }
    }
}

