package com.slfortuner.slbutterflydirectory.u222;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter222 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter222(FragmentManager fm, int NoofTabs){
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
                Info_222_Fragment home = new Info_222_Fragment();
                return home;
            case 1:
                Photos_222_Fragment about = new Photos_222_Fragment();
                return about;
            default:
                return null;
        }
    }
}

