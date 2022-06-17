package com.slfortuner.slbutterflydirectory.u76;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter76 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter76(FragmentManager fm, int NoofTabs){
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
                Info_76_Fragment home = new Info_76_Fragment();
                return home;
            case 1:
                Photos_76_Fragment about = new Photos_76_Fragment();
                return about;
            default:
                return null;
        }
    }
}

