package com.slfortuner.slbutterflydirectory.u175;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter175 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter175(FragmentManager fm, int NoofTabs){
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
                Info_175_Fragment home = new Info_175_Fragment();
                return home;
            case 1:
                Photos_175_Fragment about = new Photos_175_Fragment();
                return about;
            default:
                return null;
        }
    }
}

