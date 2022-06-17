package com.slfortuner.slbutterflydirectory.u12;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter12 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter12(FragmentManager fm, int NoofTabs){
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
                Info_12_Fragment home = new Info_12_Fragment();
                return home;
            case 1:
                Photos_12_Fragment about = new Photos_12_Fragment();
                return about;
            default:
                return null;
        }
    }
}

