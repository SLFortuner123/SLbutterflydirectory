package com.slfortuner.slbutterflydirectory.u155;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter155 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter155(FragmentManager fm, int NoofTabs){
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
                Info_155_Fragment home = new Info_155_Fragment();
                return home;
            case 1:
                Photos_155_Fragment about = new Photos_155_Fragment();
                return about;
            default:
                return null;
        }
    }
}

