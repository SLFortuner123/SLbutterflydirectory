package com.slfortuner.slbutterflydirectory.u184;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter184 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter184(FragmentManager fm, int NoofTabs){
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
                Info_184_Fragment home = new Info_184_Fragment();
                return home;
            case 1:
                Photos_184_Fragment about = new Photos_184_Fragment();
                return about;
            default:
                return null;
        }
    }
}

