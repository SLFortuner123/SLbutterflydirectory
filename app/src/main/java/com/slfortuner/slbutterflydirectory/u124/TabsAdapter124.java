package com.slfortuner.slbutterflydirectory.u124;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter124 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter124(FragmentManager fm, int NoofTabs){
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
                Info_124_Fragment home = new Info_124_Fragment();
                return home;
            case 1:
                Photos_124_Fragment about = new Photos_124_Fragment();
                return about;
            default:
                return null;
        }
    }
}

