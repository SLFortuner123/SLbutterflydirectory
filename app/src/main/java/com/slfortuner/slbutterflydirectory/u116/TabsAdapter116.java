package com.slfortuner.slbutterflydirectory.u116;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter116 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter116(FragmentManager fm, int NoofTabs){
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
                Info_116_Fragment home = new Info_116_Fragment();
                return home;
            case 1:
                Photos_116_Fragment about = new Photos_116_Fragment();
                return about;
            default:
                return null;
        }
    }
}

