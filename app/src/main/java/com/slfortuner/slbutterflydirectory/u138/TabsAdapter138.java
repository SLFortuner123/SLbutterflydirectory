package com.slfortuner.slbutterflydirectory.u138;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter138 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter138(FragmentManager fm, int NoofTabs){
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
                Info_138_Fragment home = new Info_138_Fragment();
                return home;
            case 1:
                Photos_138_Fragment about = new Photos_138_Fragment();
                return about;
            default:
                return null;
        }
    }
}

