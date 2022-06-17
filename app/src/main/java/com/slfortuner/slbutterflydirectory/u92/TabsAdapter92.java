package com.slfortuner.slbutterflydirectory.u92;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter92 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter92(FragmentManager fm, int NoofTabs){
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
                Info_92_Fragment home = new Info_92_Fragment();
                return home;
            case 1:
                Photos_92_Fragment about = new Photos_92_Fragment();
                return about;
            default:
                return null;
        }
    }
}

