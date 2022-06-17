package com.slfortuner.slbutterflydirectory.u211;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter211 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter211(FragmentManager fm, int NoofTabs){
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
                Info_211_Fragment home = new Info_211_Fragment();
                return home;
            case 1:
                Photos_211_Fragment about = new Photos_211_Fragment();
                return about;
            default:
                return null;
        }
    }
}

