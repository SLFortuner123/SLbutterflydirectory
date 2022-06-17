package com.slfortuner.slbutterflydirectory.u143;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter143 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter143(FragmentManager fm, int NoofTabs){
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
                Info_143_Fragment home = new Info_143_Fragment();
                return home;
            case 1:
                Photos_143_Fragment about = new Photos_143_Fragment();
                return about;
            default:
                return null;
        }
    }
}

