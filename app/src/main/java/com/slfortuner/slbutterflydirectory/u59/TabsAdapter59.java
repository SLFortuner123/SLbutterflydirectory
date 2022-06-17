package com.slfortuner.slbutterflydirectory.u59;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter59 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter59(FragmentManager fm, int NoofTabs){
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
                Info_59_Fragment home = new Info_59_Fragment();
                return home;
            case 1:
                Photos_59_Fragment about = new Photos_59_Fragment();
                return about;
            default:
                return null;
        }
    }
}

