package com.slfortuner.slbutterflydirectory.u73;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter73 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter73(FragmentManager fm, int NoofTabs){
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
                Info_73_Fragment home = new Info_73_Fragment();
                return home;
            case 1:
                Photos_73_Fragment about = new Photos_73_Fragment();
                return about;
            default:
                return null;
        }
    }
}

