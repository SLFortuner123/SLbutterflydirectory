package com.slfortuner.slbutterflydirectory.u4;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter4 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter4(FragmentManager fm, int NoofTabs){
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
                Info_4_Fragment home = new Info_4_Fragment();
                return home;
            case 1:
                Photos_4_Fragment about = new Photos_4_Fragment();
                return about;
            default:
                return null;
        }
    }
}

