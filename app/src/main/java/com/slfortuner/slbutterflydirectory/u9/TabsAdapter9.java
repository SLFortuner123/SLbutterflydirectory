package com.slfortuner.slbutterflydirectory.u9;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter9 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter9(FragmentManager fm, int NoofTabs){
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
                Info_9_Fragment home = new Info_9_Fragment();
                return home;
            case 1:
                Photos_9_Fragment about = new Photos_9_Fragment();
                return about;
            default:
                return null;
        }
    }
}

