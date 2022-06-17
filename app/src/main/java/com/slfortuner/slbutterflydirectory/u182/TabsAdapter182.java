package com.slfortuner.slbutterflydirectory.u182;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter182 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter182(FragmentManager fm, int NoofTabs){
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
                Info_182_Fragment home = new Info_182_Fragment();
                return home;
            case 1:
                Photos_182_Fragment about = new Photos_182_Fragment();
                return about;
            default:
                return null;
        }
    }
}

