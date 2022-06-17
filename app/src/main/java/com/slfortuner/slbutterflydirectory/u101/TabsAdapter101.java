package com.slfortuner.slbutterflydirectory.u101;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter101 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter101(FragmentManager fm, int NoofTabs){
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
                Info_101_Fragment home = new Info_101_Fragment();
                return home;
            case 1:
                Photos_101_Fragment about = new Photos_101_Fragment();
                return about;
            default:
                return null;
        }
    }
}

