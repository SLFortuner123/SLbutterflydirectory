package com.slfortuner.slbutterflydirectory.u66;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter66 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter66(FragmentManager fm, int NoofTabs){
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
                Info_66_Fragment home = new Info_66_Fragment();
                return home;
            case 1:
                Photos_66_Fragment about = new Photos_66_Fragment();
                return about;
            default:
                return null;
        }
    }
}

