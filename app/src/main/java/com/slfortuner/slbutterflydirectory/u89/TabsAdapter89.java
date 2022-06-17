package com.slfortuner.slbutterflydirectory.u89;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter89 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter89(FragmentManager fm, int NoofTabs){
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
                Info_89_Fragment home = new Info_89_Fragment();
                return home;
            case 1:
                Photos_89_Fragment about = new Photos_89_Fragment();
                return about;
            default:
                return null;
        }
    }
}

