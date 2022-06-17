package com.slfortuner.slbutterflydirectory.u170;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter170 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter170(FragmentManager fm, int NoofTabs){
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
                Info_170_Fragment home = new Info_170_Fragment();
                return home;
            case 1:
                Photos_170_Fragment about = new Photos_170_Fragment();
                return about;
            default:
                return null;
        }
    }
}

