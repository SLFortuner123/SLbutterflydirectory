package com.slfortuner.slbutterflydirectory.u140;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter140 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter140(FragmentManager fm, int NoofTabs){
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
                Info_140_Fragment home = new Info_140_Fragment();
                return home;
            case 1:
                Photos_140_Fragment about = new Photos_140_Fragment();
                return about;
            default:
                return null;
        }
    }
}

