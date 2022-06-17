package com.slfortuner.slbutterflydirectory.u225;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter225 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter225(FragmentManager fm, int NoofTabs){
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
                Info_225_Fragment home = new Info_225_Fragment();
                return home;
            case 1:
                Photos_225_Fragment about = new Photos_225_Fragment();
                return about;
            default:
                return null;
        }
    }
}

