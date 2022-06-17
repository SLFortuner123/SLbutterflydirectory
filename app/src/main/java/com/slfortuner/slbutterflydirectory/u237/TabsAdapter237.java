package com.slfortuner.slbutterflydirectory.u237;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter237 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter237(FragmentManager fm, int NoofTabs){
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
                Info_237_Fragment home = new Info_237_Fragment();
                return home;
            case 1:
                Photos_237_Fragment about = new Photos_237_Fragment();
                return about;
            default:
                return null;
        }
    }
}

