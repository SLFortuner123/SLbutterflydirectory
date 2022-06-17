package com.slfortuner.slbutterflydirectory.u152;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter152 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter152(FragmentManager fm, int NoofTabs){
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
                Info_152_Fragment home = new Info_152_Fragment();
                return home;
            case 1:
                Photos_152_Fragment about = new Photos_152_Fragment();
                return about;
            default:
                return null;
        }
    }
}

