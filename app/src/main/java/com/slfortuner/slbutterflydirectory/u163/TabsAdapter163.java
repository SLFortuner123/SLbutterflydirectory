package com.slfortuner.slbutterflydirectory.u163;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter163 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter163(FragmentManager fm, int NoofTabs){
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
                Info_163_Fragment home = new Info_163_Fragment();
                return home;
            case 1:
                Photos_163_Fragment about = new Photos_163_Fragment();
                return about;
            default:
                return null;
        }
    }
}

