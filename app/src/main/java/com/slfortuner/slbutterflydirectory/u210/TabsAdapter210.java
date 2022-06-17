package com.slfortuner.slbutterflydirectory.u210;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter210 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter210(FragmentManager fm, int NoofTabs){
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
                Info_210_Fragment home = new Info_210_Fragment();
                return home;
            case 1:
                Photos_210_Fragment about = new Photos_210_Fragment();
                return about;
            default:
                return null;
        }
    }
}

