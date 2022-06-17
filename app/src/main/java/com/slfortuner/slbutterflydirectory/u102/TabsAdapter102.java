package com.slfortuner.slbutterflydirectory.u102;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter102 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter102(FragmentManager fm, int NoofTabs){
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
                Info_102_Fragment home = new Info_102_Fragment();
                return home;
            case 1:
                Photos_102_Fragment about = new Photos_102_Fragment();
                return about;
            default:
                return null;
        }
    }
}

