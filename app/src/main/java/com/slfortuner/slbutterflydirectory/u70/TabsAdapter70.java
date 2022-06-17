package com.slfortuner.slbutterflydirectory.u70;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter70 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter70(FragmentManager fm, int NoofTabs){
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
                Info_70_Fragment home = new Info_70_Fragment();
                return home;
            case 1:
                Photos_70_Fragment about = new Photos_70_Fragment();
                return about;
            default:
                return null;
        }
    }
}

