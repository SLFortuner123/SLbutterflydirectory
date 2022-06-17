package com.slfortuner.slbutterflydirectory.u190;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter190 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter190(FragmentManager fm, int NoofTabs){
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
                Info_190_Fragment home = new Info_190_Fragment();
                return home;
            case 1:
                Photos_190_Fragment about = new Photos_190_Fragment();
                return about;
            default:
                return null;
        }
    }
}

