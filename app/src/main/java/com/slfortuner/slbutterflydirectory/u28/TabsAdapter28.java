package com.slfortuner.slbutterflydirectory.u28;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter28 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter28(FragmentManager fm, int NoofTabs){
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
                Info_28_Fragment home = new Info_28_Fragment();
                return home;
            case 1:
                Photos_28_Fragment about = new Photos_28_Fragment();
                return about;
            default:
                return null;
        }
    }
}

