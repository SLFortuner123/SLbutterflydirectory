package com.slfortuner.slbutterflydirectory.u62;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter62 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter62(FragmentManager fm, int NoofTabs){
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
                Info_62_Fragment home = new Info_62_Fragment();
                return home;
            case 1:
                Photos_62_Fragment about = new Photos_62_Fragment();
                return about;
            default:
                return null;
        }
    }
}

