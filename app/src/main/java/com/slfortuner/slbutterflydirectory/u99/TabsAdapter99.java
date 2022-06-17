package com.slfortuner.slbutterflydirectory.u99;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter99 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter99(FragmentManager fm, int NoofTabs){
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
                Info_99_Fragment home = new Info_99_Fragment();
                return home;
            case 1:
                Photos_99_Fragment about = new Photos_99_Fragment();
                return about;
            default:
                return null;
        }
    }
}

