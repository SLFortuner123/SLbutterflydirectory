package com.slfortuner.slbutterflydirectory.u19;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter19 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter19(FragmentManager fm, int NoofTabs){
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
                Info_19_Fragment home = new Info_19_Fragment();
                return home;
            case 1:
                Photos_19_Fragment about = new Photos_19_Fragment();
                return about;
            default:
                return null;
        }
    }
}

