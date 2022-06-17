package com.slfortuner.slbutterflydirectory.u37;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter37 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter37(FragmentManager fm, int NoofTabs){
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
                Info_37_Fragment home = new Info_37_Fragment();
                return home;
            case 1:
                Photos_37_Fragment about = new Photos_37_Fragment();
                return about;
            default:
                return null;
        }
    }
}

