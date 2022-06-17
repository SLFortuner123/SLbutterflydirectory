package com.slfortuner.slbutterflydirectory.u6;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter6 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter6(FragmentManager fm, int NoofTabs){
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
                Info_6_Fragment home = new Info_6_Fragment();
                return home;
            case 1:
                Photos_6_Fragment about = new Photos_6_Fragment();
                return about;
            default:
                return null;
        }
    }
}

