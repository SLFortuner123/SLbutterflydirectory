package com.slfortuner.slbutterflydirectory.u205;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter205 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter205(FragmentManager fm, int NoofTabs){
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
                Info_205_Fragment home = new Info_205_Fragment();
                return home;
            case 1:
                Photos_205_Fragment about = new Photos_205_Fragment();
                return about;
            default:
                return null;
        }
    }
}

