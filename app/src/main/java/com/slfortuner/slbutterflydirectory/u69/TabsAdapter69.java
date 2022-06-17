package com.slfortuner.slbutterflydirectory.u69;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter69 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter69(FragmentManager fm, int NoofTabs){
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
                Info_69_Fragment home = new Info_69_Fragment();
                return home;
            case 1:
                Photos_69_Fragment about = new Photos_69_Fragment();
                return about;
            default:
                return null;
        }
    }
}

