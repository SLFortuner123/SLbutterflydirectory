package com.slfortuner.slbutterflydirectory.u3;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter3 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter3(FragmentManager fm, int NoofTabs){
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
                Info_3_Fragment home = new Info_3_Fragment();
                return home;
            case 1:
                Photos_3_Fragment about = new Photos_3_Fragment();
                return about;
            default:
                return null;
        }
    }
}

