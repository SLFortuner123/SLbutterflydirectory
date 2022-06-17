package com.slfortuner.slbutterflydirectory.u208;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter208 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter208(FragmentManager fm, int NoofTabs){
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
                Info_208_Fragment home = new Info_208_Fragment();
                return home;
            case 1:
                Photos_208_Fragment about = new Photos_208_Fragment();
                return about;
            default:
                return null;
        }
    }
}

