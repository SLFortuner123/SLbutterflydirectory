package com.slfortuner.slbutterflydirectory.u97;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter97 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter97(FragmentManager fm, int NoofTabs){
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
                Info_97_Fragment home = new Info_97_Fragment();
                return home;
            case 1:
                Photos_97_Fragment about = new Photos_97_Fragment();
                return about;
            default:
                return null;
        }
    }
}

