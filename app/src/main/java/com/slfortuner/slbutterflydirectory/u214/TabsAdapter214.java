package com.slfortuner.slbutterflydirectory.u214;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter214 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter214(FragmentManager fm, int NoofTabs){
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
                Info_214_Fragment home = new Info_214_Fragment();
                return home;
            case 1:
                Photos_214_Fragment about = new Photos_214_Fragment();
                return about;
            default:
                return null;
        }
    }
}

