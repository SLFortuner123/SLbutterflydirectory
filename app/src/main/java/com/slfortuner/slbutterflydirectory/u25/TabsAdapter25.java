package com.slfortuner.slbutterflydirectory.u25;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter25 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter25(FragmentManager fm, int NoofTabs){
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
                Info_25_Fragment home = new Info_25_Fragment();
                return home;
            case 1:
                Photos_25_Fragment about = new Photos_25_Fragment();
                return about;
            default:
                return null;
        }
    }
}

