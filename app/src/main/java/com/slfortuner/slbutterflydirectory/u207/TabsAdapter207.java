package com.slfortuner.slbutterflydirectory.u207;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter207 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter207(FragmentManager fm, int NoofTabs){
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
                Info_207_Fragment home = new Info_207_Fragment();
                return home;
            case 1:
                Photos_207_Fragment about = new Photos_207_Fragment();
                return about;
            default:
                return null;
        }
    }
}

