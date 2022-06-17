package com.slfortuner.slbutterflydirectory.u148;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter148 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter148(FragmentManager fm, int NoofTabs){
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
                Info_148_Fragment home = new Info_148_Fragment();
                return home;
            case 1:
                Photos_148_Fragment about = new Photos_148_Fragment();
                return about;
            default:
                return null;
        }
    }
}

