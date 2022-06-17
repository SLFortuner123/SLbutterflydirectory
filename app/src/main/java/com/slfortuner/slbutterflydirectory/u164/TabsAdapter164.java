package com.slfortuner.slbutterflydirectory.u164;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter164 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter164(FragmentManager fm, int NoofTabs){
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
                Info_164_Fragment home = new Info_164_Fragment();
                return home;
            case 1:
                Photos_164_Fragment about = new Photos_164_Fragment();
                return about;
            default:
                return null;
        }
    }
}

