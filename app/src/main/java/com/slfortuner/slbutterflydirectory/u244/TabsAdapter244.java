package com.slfortuner.slbutterflydirectory.u244;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter244 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter244(FragmentManager fm, int NoofTabs){
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
                Info_244_Fragment home = new Info_244_Fragment();
                return home;
            case 1:
                Photos_244_Fragment about = new Photos_244_Fragment();
                return about;
            default:
                return null;
        }
    }
}

