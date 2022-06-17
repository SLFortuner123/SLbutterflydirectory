package com.slfortuner.slbutterflydirectory.u86;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter86 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter86(FragmentManager fm, int NoofTabs){
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
                Info_86_Fragment home = new Info_86_Fragment();
                return home;
            case 1:
                Photos_86_Fragment about = new Photos_86_Fragment();
                return about;
            default:
                return null;
        }
    }
}

