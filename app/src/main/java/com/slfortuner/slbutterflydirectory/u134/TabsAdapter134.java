package com.slfortuner.slbutterflydirectory.u134;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter134 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter134(FragmentManager fm, int NoofTabs){
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
                Info_134_Fragment home = new Info_134_Fragment();
                return home;
            case 1:
                Photos_134_Fragment about = new Photos_134_Fragment();
                return about;
            default:
                return null;
        }
    }
}

