package com.slfortuner.slbutterflydirectory.u58;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter58 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter58(FragmentManager fm, int NoofTabs){
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
                Info_58_Fragment home = new Info_58_Fragment();
                return home;
            case 1:
                Photos_58_Fragment about = new Photos_58_Fragment();
                return about;
            default:
                return null;
        }
    }
}

