package com.slfortuner.slbutterflydirectory.u161;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter161 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter161(FragmentManager fm, int NoofTabs){
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
                Info_161_Fragment home = new Info_161_Fragment();
                return home;
            case 1:
                Photos_161_Fragment about = new Photos_161_Fragment();
                return about;
            default:
                return null;
        }
    }
}

