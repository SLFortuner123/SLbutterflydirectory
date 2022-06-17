package com.slfortuner.slbutterflydirectory.u147;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter147 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter147(FragmentManager fm, int NoofTabs){
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
                Info_147_Fragment home = new Info_147_Fragment();
                return home;
            case 1:
                Photos_147_Fragment about = new Photos_147_Fragment();
                return about;
            default:
                return null;
        }
    }
}

