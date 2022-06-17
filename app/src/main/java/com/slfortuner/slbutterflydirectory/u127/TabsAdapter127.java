package com.slfortuner.slbutterflydirectory.u127;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter127 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter127(FragmentManager fm, int NoofTabs){
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
                Info_127_Fragment home = new Info_127_Fragment();
                return home;
            case 1:
                Photos_127_Fragment about = new Photos_127_Fragment();
                return about;
            default:
                return null;
        }
    }
}

