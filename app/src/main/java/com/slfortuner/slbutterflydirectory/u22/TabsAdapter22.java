package com.slfortuner.slbutterflydirectory.u22;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter22 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter22(FragmentManager fm, int NoofTabs){
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
                Info_22_Fragment home = new Info_22_Fragment();
                return home;
            case 1:
                Photos_22_Fragment about = new Photos_22_Fragment();
                return about;
            default:
                return null;
        }
    }
}

