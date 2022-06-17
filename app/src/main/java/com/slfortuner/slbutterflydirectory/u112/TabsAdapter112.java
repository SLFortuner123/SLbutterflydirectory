package com.slfortuner.slbutterflydirectory.u112;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter112 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter112(FragmentManager fm, int NoofTabs){
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
                Info_112_Fragment home = new Info_112_Fragment();
                return home;
            case 1:
                Photos_112_Fragment about = new Photos_112_Fragment();
                return about;
            default:
                return null;
        }
    }
}

