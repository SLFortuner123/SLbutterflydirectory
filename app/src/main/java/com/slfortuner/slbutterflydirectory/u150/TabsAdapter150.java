package com.slfortuner.slbutterflydirectory.u150;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter150 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter150(FragmentManager fm, int NoofTabs){
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
                Info_150_Fragment home = new Info_150_Fragment();
                return home;
            case 1:
                Photos_150_Fragment about = new Photos_150_Fragment();
                return about;
            default:
                return null;
        }
    }
}

