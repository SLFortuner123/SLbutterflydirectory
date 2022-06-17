package com.slfortuner.slbutterflydirectory.u49;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter49 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter49(FragmentManager fm, int NoofTabs){
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
                Info_49_Fragment home = new Info_49_Fragment();
                return home;
            case 1:
                Photos_49_Fragment about = new Photos_49_Fragment();
                return about;
            default:
                return null;
        }
    }
}

