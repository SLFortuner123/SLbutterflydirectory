package com.slfortuner.slbutterflydirectory.u123;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter123 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter123(FragmentManager fm, int NoofTabs){
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
                Info_123_Fragment home = new Info_123_Fragment();
                return home;
            case 1:
                Photos_123_Fragment about = new Photos_123_Fragment();
                return about;
            default:
                return null;
        }
    }
}

