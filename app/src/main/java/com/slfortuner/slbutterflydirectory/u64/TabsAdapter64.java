package com.slfortuner.slbutterflydirectory.u64;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter64 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter64(FragmentManager fm, int NoofTabs){
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
                Info_64_Fragment home = new Info_64_Fragment();
                return home;
            case 1:
                Photos_64_Fragment about = new Photos_64_Fragment();
                return about;
            default:
                return null;
        }
    }
}

