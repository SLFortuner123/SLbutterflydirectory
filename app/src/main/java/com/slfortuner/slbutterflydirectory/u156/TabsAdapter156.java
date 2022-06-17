package com.slfortuner.slbutterflydirectory.u156;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter156 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter156(FragmentManager fm, int NoofTabs){
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
                Info_156_Fragment home = new Info_156_Fragment();
                return home;
            case 1:
                Photos_156_Fragment about = new Photos_156_Fragment();
                return about;
            default:
                return null;
        }
    }
}

