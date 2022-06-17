package com.slfortuner.slbutterflydirectory.u193;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter193 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter193(FragmentManager fm, int NoofTabs){
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
                Info_193_Fragment home = new Info_193_Fragment();
                return home;
            case 1:
                Photos_193_Fragment about = new Photos_193_Fragment();
                return about;
            default:
                return null;
        }
    }
}

