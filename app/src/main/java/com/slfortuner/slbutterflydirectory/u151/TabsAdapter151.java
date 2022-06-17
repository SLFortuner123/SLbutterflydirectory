package com.slfortuner.slbutterflydirectory.u151;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter151 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter151(FragmentManager fm, int NoofTabs){
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
                Info_151_Fragment home = new Info_151_Fragment();
                return home;
            case 1:
                Photos_151_Fragment about = new Photos_151_Fragment();
                return about;
            default:
                return null;
        }
    }
}

