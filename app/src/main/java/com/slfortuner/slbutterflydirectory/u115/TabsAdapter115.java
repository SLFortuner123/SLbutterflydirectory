package com.slfortuner.slbutterflydirectory.u115;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter115 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter115(FragmentManager fm, int NoofTabs){
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
                Info_115_Fragment home = new Info_115_Fragment();
                return home;
            case 1:
                Photos_115_Fragment about = new Photos_115_Fragment();
                return about;
            default:
                return null;
        }
    }
}

