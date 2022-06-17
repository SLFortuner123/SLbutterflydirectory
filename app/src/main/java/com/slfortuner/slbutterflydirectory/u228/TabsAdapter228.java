package com.slfortuner.slbutterflydirectory.u228;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter228 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter228(FragmentManager fm, int NoofTabs){
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
                Info_228_Fragment home = new Info_228_Fragment();
                return home;
            case 1:
                Photos_228_Fragment about = new Photos_228_Fragment();
                return about;
            default:
                return null;
        }
    }
}

