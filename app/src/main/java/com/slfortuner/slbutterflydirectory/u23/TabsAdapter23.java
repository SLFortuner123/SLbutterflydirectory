package com.slfortuner.slbutterflydirectory.u23;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter23 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter23(FragmentManager fm, int NoofTabs){
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
                Info_23_Fragment home = new Info_23_Fragment();
                return home;
            case 1:
                Photos_23_Fragment about = new Photos_23_Fragment();
                return about;
            default:
                return null;
        }
    }
}

