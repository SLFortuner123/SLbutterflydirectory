package com.slfortuner.slbutterflydirectory.u242;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter242 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter242(FragmentManager fm, int NoofTabs){
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
                Info_242_Fragment home = new Info_242_Fragment();
                return home;
            case 1:
                Photos_242_Fragment about = new Photos_242_Fragment();
                return about;
            default:
                return null;
        }
    }
}

