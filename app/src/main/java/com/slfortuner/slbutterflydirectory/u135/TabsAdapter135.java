package com.slfortuner.slbutterflydirectory.u135;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter135 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter135(FragmentManager fm, int NoofTabs){
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
                Info_135_Fragment home = new Info_135_Fragment();
                return home;
            case 1:
                Photos_135_Fragment about = new Photos_135_Fragment();
                return about;
            default:
                return null;
        }
    }
}

