package com.slfortuner.slbutterflydirectory.u77;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter77 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter77(FragmentManager fm, int NoofTabs){
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
                Info_77_Fragment home = new Info_77_Fragment();
                return home;
            case 1:
                Photos_77_Fragment about = new Photos_77_Fragment();
                return about;
            default:
                return null;
        }
    }
}

