package com.slfortuner.slbutterflydirectory.u18;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter18 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter18(FragmentManager fm, int NoofTabs){
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
                Info_18_Fragment home = new Info_18_Fragment();
                return home;
            case 1:
                Photos_18_Fragment about = new Photos_18_Fragment();
                return about;
            default:
                return null;
        }
    }
}

