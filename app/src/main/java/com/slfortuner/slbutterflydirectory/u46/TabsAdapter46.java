package com.slfortuner.slbutterflydirectory.u46;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter46 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter46(FragmentManager fm, int NoofTabs){
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
                Info_46_Fragment home = new Info_46_Fragment();
                return home;
            case 1:
                Photos_46_Fragment about = new Photos_46_Fragment();
                return about;
            default:
                return null;
        }
    }
}

