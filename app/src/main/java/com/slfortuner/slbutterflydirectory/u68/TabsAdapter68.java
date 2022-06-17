package com.slfortuner.slbutterflydirectory.u68;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter68 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter68(FragmentManager fm, int NoofTabs){
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
                Info_68_Fragment home = new Info_68_Fragment();
                return home;
            case 1:
                Photos_68_Fragment about = new Photos_68_Fragment();
                return about;
            default:
                return null;
        }
    }
}

