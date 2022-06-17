package com.slfortuner.slbutterflydirectory.u179;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter179 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter179(FragmentManager fm, int NoofTabs){
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
                Info_179_Fragment home = new Info_179_Fragment();
                return home;
            case 1:
                Photos_179_Fragment about = new Photos_179_Fragment();
                return about;
            default:
                return null;
        }
    }
}

