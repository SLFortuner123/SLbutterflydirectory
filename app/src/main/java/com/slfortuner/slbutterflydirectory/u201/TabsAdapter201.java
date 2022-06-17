package com.slfortuner.slbutterflydirectory.u201;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter201 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter201(FragmentManager fm, int NoofTabs){
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
                Info_201_Fragment home = new Info_201_Fragment();
                return home;
            case 1:
                Photos_201_Fragment about = new Photos_201_Fragment();
                return about;
            default:
                return null;
        }
    }
}

