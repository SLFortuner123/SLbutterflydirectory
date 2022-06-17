package com.slfortuner.slbutterflydirectory.u220;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter220 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter220(FragmentManager fm, int NoofTabs){
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
                Info_220_Fragment home = new Info_220_Fragment();
                return home;
            case 1:
                Photos_220_Fragment about = new Photos_220_Fragment();
                return about;
            default:
                return null;
        }
    }
}

