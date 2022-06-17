package com.slfortuner.slbutterflydirectory.u195;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter195 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter195(FragmentManager fm, int NoofTabs){
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
                Info_195_Fragment home = new Info_195_Fragment();
                return home;
            case 1:
                Photos_195_Fragment about = new Photos_195_Fragment();
                return about;
            default:
                return null;
        }
    }
}

