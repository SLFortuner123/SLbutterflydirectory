package com.slfortuner.slbutterflydirectory.u174;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter174 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter174(FragmentManager fm, int NoofTabs){
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
                Info_174_Fragment home = new Info_174_Fragment();
                return home;
            case 1:
                Photos_174_Fragment about = new Photos_174_Fragment();
                return about;
            default:
                return null;
        }
    }
}

