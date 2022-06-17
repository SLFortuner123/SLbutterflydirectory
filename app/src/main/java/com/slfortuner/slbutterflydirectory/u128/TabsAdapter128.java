package com.slfortuner.slbutterflydirectory.u128;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter128 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter128(FragmentManager fm, int NoofTabs){
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
                Info_128_Fragment home = new Info_128_Fragment();
                return home;
            case 1:
                Photos_128_Fragment about = new Photos_128_Fragment();
                return about;
            default:
                return null;
        }
    }
}

