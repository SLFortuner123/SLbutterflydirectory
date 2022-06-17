package com.slfortuner.slbutterflydirectory.u7;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter7 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter7(FragmentManager fm, int NoofTabs){
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
                Info_7_Fragment home = new Info_7_Fragment();
                return home;
            case 1:
                Photos_7_Fragment about = new Photos_7_Fragment();
                return about;
            default:
                return null;
        }
    }
}

