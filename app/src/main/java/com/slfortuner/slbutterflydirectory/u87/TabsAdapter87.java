package com.slfortuner.slbutterflydirectory.u87;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter87 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter87(FragmentManager fm, int NoofTabs){
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
                Info_87_Fragment home = new Info_87_Fragment();
                return home;
            case 1:
                Photos_87_Fragment about = new Photos_87_Fragment();
                return about;
            default:
                return null;
        }
    }
}

