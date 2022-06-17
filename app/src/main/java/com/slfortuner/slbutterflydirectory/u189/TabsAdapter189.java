package com.slfortuner.slbutterflydirectory.u189;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter189 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter189(FragmentManager fm, int NoofTabs){
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
                Info_189_Fragment home = new Info_189_Fragment();
                return home;
            case 1:
                Photos_189_Fragment about = new Photos_189_Fragment();
                return about;
            default:
                return null;
        }
    }
}
