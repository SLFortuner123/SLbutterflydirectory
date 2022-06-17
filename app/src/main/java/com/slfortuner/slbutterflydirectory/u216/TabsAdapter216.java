package com.slfortuner.slbutterflydirectory.u216;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter216 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter216(FragmentManager fm, int NoofTabs){
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
                Info_216_Fragment home = new Info_216_Fragment();
                return home;
            case 1:
                Photos_216_Fragment about = new Photos_216_Fragment();
                return about;
            default:
                return null;
        }
    }
}

