package com.slfortuner.slbutterflydirectory.u11;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter11 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter11(FragmentManager fm, int NoofTabs){
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
                Info_11_Fragment home = new Info_11_Fragment();
                return home;
            case 1:
                Photos_11_Fragment about = new Photos_11_Fragment();
                return about;
            default:
                return null;
        }
    }
}

