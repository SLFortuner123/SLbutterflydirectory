package com.slfortuner.slbutterflydirectory.u227;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter227 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter227(FragmentManager fm, int NoofTabs){
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
                Info_227_Fragment home = new Info_227_Fragment();
                return home;
            case 1:
                Photos_227_Fragment about = new Photos_227_Fragment();
                return about;
            default:
                return null;
        }
    }
}

