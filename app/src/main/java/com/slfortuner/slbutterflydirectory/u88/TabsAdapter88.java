package com.slfortuner.slbutterflydirectory.u88;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter88 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter88(FragmentManager fm, int NoofTabs){
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
                Info_88_Fragment home = new Info_88_Fragment();
                return home;
            case 1:
                Photos_88_Fragment about = new Photos_88_Fragment();
                return about;
            default:
                return null;
        }
    }
}

