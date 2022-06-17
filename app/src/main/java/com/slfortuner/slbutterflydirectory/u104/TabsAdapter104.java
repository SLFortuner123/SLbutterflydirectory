package com.slfortuner.slbutterflydirectory.u104;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter104 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter104(FragmentManager fm, int NoofTabs){
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
                Info_104_Fragment home = new Info_104_Fragment();
                return home;
            case 1:
                Photos_104_Fragment about = new Photos_104_Fragment();
                return about;
            default:
                return null;
        }
    }
}

