package com.slfortuner.slbutterflydirectory.u47;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter47 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter47(FragmentManager fm, int NoofTabs){
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
                Info_47_Fragment home = new Info_47_Fragment();
                return home;
            case 1:
                Photos_47_Fragment about = new Photos_47_Fragment();
                return about;
            default:
                return null;
        }
    }
}

