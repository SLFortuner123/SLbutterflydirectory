package com.slfortuner.slbutterflydirectory.u105;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter105 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter105(FragmentManager fm, int NoofTabs){
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
                Info_105_Fragment home = new Info_105_Fragment();
                return home;
            case 1:
                Photos_105_Fragment about = new Photos_105_Fragment();
                return about;
            default:
                return null;
        }
    }
}

