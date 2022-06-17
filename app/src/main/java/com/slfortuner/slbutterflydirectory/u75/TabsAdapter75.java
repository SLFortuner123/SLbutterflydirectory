package com.slfortuner.slbutterflydirectory.u75;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter75 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter75(FragmentManager fm, int NoofTabs){
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
                Info_75_Fragment home = new Info_75_Fragment();
                return home;
            case 1:
                Photos_75_Fragment about = new Photos_75_Fragment();
                return about;
            default:
                return null;
        }
    }
}

