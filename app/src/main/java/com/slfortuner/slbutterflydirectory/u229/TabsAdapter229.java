package com.slfortuner.slbutterflydirectory.u229;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter229 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter229(FragmentManager fm, int NoofTabs){
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
                Info_229_Fragment home = new Info_229_Fragment();
                return home;
            case 1:
                Photos_229_Fragment about = new Photos_229_Fragment();
                return about;
            default:
                return null;
        }
    }
}

