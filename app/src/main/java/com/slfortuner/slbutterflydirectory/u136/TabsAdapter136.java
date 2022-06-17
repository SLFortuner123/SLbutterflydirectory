package com.slfortuner.slbutterflydirectory.u136;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter136 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter136(FragmentManager fm, int NoofTabs){
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
                Info_136_Fragment home = new Info_136_Fragment();
                return home;
            case 1:
                Photos_136_Fragment about = new Photos_136_Fragment();
                return about;
            default:
                return null;
        }
    }
}

