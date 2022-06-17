package com.slfortuner.slbutterflydirectory.u117;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter117 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter117(FragmentManager fm, int NoofTabs){
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
                Info_117_Fragment home = new Info_117_Fragment();
                return home;
            case 1:
                Photos_117_Fragment about = new Photos_117_Fragment();
                return about;
            default:
                return null;
        }
    }
}

