package com.slfortuner.slbutterflydirectory.u232;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter232 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter232(FragmentManager fm, int NoofTabs){
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
                Info_232_Fragment home = new Info_232_Fragment();
                return home;
            case 1:
                Photos_232_Fragment about = new Photos_232_Fragment();
                return about;
            default:
                return null;
        }
    }
}

