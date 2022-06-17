package com.slfortuner.slbutterflydirectory.u56;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter56 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter56(FragmentManager fm, int NoofTabs){
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
                Info_56_Fragment home = new Info_56_Fragment();
                return home;
            case 1:
                Photos_56_Fragment about = new Photos_56_Fragment();
                return about;
            default:
                return null;
        }
    }
}

