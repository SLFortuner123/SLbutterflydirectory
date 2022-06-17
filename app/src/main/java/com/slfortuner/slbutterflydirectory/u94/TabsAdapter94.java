package com.slfortuner.slbutterflydirectory.u94;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter94 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter94(FragmentManager fm, int NoofTabs){
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
                Info_94_Fragment home = new Info_94_Fragment();
                return home;
            case 1:
                Photos_94_Fragment about = new Photos_94_Fragment();
                return about;
            default:
                return null;
        }
    }
}

