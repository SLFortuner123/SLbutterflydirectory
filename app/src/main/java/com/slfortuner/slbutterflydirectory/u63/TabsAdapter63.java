package com.slfortuner.slbutterflydirectory.u63;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter63 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter63(FragmentManager fm, int NoofTabs){
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
                Info_63_Fragment home = new Info_63_Fragment();
                return home;
            case 1:
                Photos_63_Fragment about = new Photos_63_Fragment();
                return about;
            default:
                return null;
        }
    }
}

