package com.slfortuner.slbutterflydirectory.u167;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter167 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter167(FragmentManager fm, int NoofTabs){
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
                Info_167_Fragment home = new Info_167_Fragment();
                return home;
            case 1:
                Photos_167_Fragment about = new Photos_167_Fragment();
                return about;
            default:
                return null;
        }
    }
}

