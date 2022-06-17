package com.slfortuner.slbutterflydirectory.u40;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter40 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter40(FragmentManager fm, int NoofTabs){
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
                Info_40_Fragment home = new Info_40_Fragment();
                return home;
            case 1:
                Photos_40_Fragment about = new Photos_40_Fragment();
                return about;
            default:
                return null;
        }
    }
}

