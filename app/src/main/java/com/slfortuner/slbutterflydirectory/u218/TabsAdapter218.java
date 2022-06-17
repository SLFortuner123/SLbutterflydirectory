package com.slfortuner.slbutterflydirectory.u218;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter218 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter218(FragmentManager fm, int NoofTabs){
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
                Info_218_Fragment home = new Info_218_Fragment();
                return home;
            case 1:
                Photos_218_Fragment about = new Photos_218_Fragment();
                return about;
            default:
                return null;
        }
    }
}

