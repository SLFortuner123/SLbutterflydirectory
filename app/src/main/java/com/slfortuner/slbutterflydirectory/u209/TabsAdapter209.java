package com.slfortuner.slbutterflydirectory.u209;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter209 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter209(FragmentManager fm, int NoofTabs){
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
                Info_209_Fragment home = new Info_209_Fragment();
                return home;
            case 1:
                Photos_209_Fragment about = new Photos_209_Fragment();
                return about;
            default:
                return null;
        }
    }
}

