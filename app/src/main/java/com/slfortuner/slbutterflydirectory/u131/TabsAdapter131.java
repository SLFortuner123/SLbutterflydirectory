package com.slfortuner.slbutterflydirectory.u131;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter131 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter131(FragmentManager fm, int NoofTabs){
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
                Info_131_Fragment home = new Info_131_Fragment();
                return home;
            case 1:
                Photos_131_Fragment about = new Photos_131_Fragment();
                return about;
            default:
                return null;
        }
    }
}

