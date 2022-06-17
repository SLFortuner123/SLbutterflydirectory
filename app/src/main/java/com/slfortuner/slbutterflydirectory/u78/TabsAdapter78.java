package com.slfortuner.slbutterflydirectory.u78;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter78 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter78(FragmentManager fm, int NoofTabs){
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
                Info_78_Fragment home = new Info_78_Fragment();
                return home;
            case 1:
                Photos_78_Fragment about = new Photos_78_Fragment();
                return about;
            default:
                return null;
        }
    }
}

