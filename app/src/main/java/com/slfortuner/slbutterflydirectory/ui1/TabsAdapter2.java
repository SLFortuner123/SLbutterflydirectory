package com.slfortuner.slbutterflydirectory.ui1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter2 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter2(FragmentManager fm, int NoofTabs){
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
                Info_2_Fragment home = new Info_2_Fragment();
                return home;
            case 1:
                Photos_2_Fragment about = new Photos_2_Fragment();
                return about;
            default:
                return null;
        }
    }
}

