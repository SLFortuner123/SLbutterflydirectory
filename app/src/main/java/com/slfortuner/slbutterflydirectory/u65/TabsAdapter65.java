package com.slfortuner.slbutterflydirectory.u65;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter65 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter65(FragmentManager fm, int NoofTabs){
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
                Info_65_Fragment home = new Info_65_Fragment();
                return home;
            case 1:
                Photos_65_Fragment about = new Photos_65_Fragment();
                return about;
            default:
                return null;
        }
    }
}

