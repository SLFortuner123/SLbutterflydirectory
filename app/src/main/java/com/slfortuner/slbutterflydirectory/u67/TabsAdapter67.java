package com.slfortuner.slbutterflydirectory.u67;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter67 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter67(FragmentManager fm, int NoofTabs){
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
                Info_67_Fragment home = new Info_67_Fragment();
                return home;
            case 1:
                Photos_67_Fragment about = new Photos_67_Fragment();
                return about;
            default:
                return null;
        }
    }
}

