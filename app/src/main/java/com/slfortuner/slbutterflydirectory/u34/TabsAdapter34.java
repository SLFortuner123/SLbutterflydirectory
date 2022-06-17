package com.slfortuner.slbutterflydirectory.u34;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter34 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter34(FragmentManager fm, int NoofTabs){
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
                Info_34_Fragment home = new Info_34_Fragment();
                return home;
            case 1:
                Photos_34_Fragment about = new Photos_34_Fragment();
                return about;
            default:
                return null;
        }
    }
}

