package com.slfortuner.slbutterflydirectory.u219;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter219 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter219(FragmentManager fm, int NoofTabs){
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
                Info_219_Fragment home = new Info_219_Fragment();
                return home;
            case 1:
                Photos_219_Fragment about = new Photos_219_Fragment();
                return about;
            default:
                return null;
        }
    }
}

