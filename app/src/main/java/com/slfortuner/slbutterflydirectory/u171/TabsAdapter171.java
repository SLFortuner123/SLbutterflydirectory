package com.slfortuner.slbutterflydirectory.u171;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter171 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter171(FragmentManager fm, int NoofTabs){
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
                Info_171_Fragment home = new Info_171_Fragment();
                return home;
            case 1:
                Photos_171_Fragment about = new Photos_171_Fragment();
                return about;
            default:
                return null;
        }
    }
}

