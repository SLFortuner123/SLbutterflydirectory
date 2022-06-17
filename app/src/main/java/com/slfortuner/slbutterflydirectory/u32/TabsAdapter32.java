package com.slfortuner.slbutterflydirectory.u32;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter32 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter32(FragmentManager fm, int NoofTabs){
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
                Info_32_Fragment home = new Info_32_Fragment();
                return home;
            case 1:
                Photos_32_Fragment about = new Photos_32_Fragment();
                return about;
            default:
                return null;
        }
    }
}

