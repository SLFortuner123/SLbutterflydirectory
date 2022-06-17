package com.slfortuner.slbutterflydirectory.u215;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter215 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter215(FragmentManager fm, int NoofTabs){
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
                Info_215_Fragment home = new Info_215_Fragment();
                return home;
            case 1:
                Photos_215_Fragment about = new Photos_215_Fragment();
                return about;
            default:
                return null;
        }
    }
}

