package com.slfortuner.slbutterflydirectory.u52;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter52 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter52(FragmentManager fm, int NoofTabs){
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
                Info_52_Fragment home = new Info_52_Fragment();
                return home;
            case 1:
                Photos_52_Fragment about = new Photos_52_Fragment();
                return about;
            default:
                return null;
        }
    }
}

