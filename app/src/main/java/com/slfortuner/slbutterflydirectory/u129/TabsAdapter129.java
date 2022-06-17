package com.slfortuner.slbutterflydirectory.u129;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter129 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter129(FragmentManager fm, int NoofTabs){
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
                Info_129_Fragment home = new Info_129_Fragment();
                return home;
            case 1:
                Photos_129_Fragment about = new Photos_129_Fragment();
                return about;
            default:
                return null;
        }
    }
}

