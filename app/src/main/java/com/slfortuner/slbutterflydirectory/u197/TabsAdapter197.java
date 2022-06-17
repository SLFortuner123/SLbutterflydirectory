package com.slfortuner.slbutterflydirectory.u197;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter197 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter197(FragmentManager fm, int NoofTabs){
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
                Info_197_Fragment home = new Info_197_Fragment();
                return home;
            case 1:
                Photos_197_Fragment about = new Photos_197_Fragment();
                return about;
            default:
                return null;
        }
    }
}

