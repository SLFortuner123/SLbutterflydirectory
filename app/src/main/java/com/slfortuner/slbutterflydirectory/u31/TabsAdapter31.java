package com.slfortuner.slbutterflydirectory.u31;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter31 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter31(FragmentManager fm, int NoofTabs){
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
                Info_31_Fragment home = new Info_31_Fragment();
                return home;
            case 1:
                Photos_31_Fragment about = new Photos_31_Fragment();
                return about;
            default:
                return null;
        }
    }
}

