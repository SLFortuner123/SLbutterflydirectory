package com.slfortuner.slbutterflydirectory.u111;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter111 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter111(FragmentManager fm, int NoofTabs){
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
                Info_111_Fragment home = new Info_111_Fragment();
                return home;
            case 1:
                Photos_111_Fragment about = new Photos_111_Fragment();
                return about;
            default:
                return null;
        }
    }
}

