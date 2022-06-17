package com.slfortuner.slbutterflydirectory.u188;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter188 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter188(FragmentManager fm, int NoofTabs){
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
                Info_188_Fragment home = new Info_188_Fragment();
                return home;
            case 1:
                Photos_188_Fragment about = new Photos_188_Fragment();
                return about;
            default:
                return null;
        }
    }
}

