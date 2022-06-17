package com.slfortuner.slbutterflydirectory.u145;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter145 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter145(FragmentManager fm, int NoofTabs){
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
                Info_145_Fragment home = new Info_145_Fragment();
                return home;
            case 1:
                Photos_145_Fragment about = new Photos_145_Fragment();
                return about;
            default:
                return null;
        }
    }
}

