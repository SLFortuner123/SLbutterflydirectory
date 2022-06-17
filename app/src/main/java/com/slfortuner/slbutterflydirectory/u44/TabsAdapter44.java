package com.slfortuner.slbutterflydirectory.u44;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter44 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter44(FragmentManager fm, int NoofTabs){
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
                Info_44_Fragment home = new Info_44_Fragment();
                return home;
            case 1:
                Photos_44_Fragment about = new Photos_44_Fragment();
                return about;
            default:
                return null;
        }
    }
}

