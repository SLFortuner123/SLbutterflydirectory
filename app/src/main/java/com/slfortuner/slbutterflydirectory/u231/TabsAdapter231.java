package com.slfortuner.slbutterflydirectory.u231;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter231 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter231(FragmentManager fm, int NoofTabs){
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
                Info_231_Fragment home = new Info_231_Fragment();
                return home;
            case 1:
                Photos_231_Fragment about = new Photos_231_Fragment();
                return about;
            default:
                return null;
        }
    }
}

