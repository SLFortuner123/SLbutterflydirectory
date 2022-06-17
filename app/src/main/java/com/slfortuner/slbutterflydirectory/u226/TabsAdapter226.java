package com.slfortuner.slbutterflydirectory.u226;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter226 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter226(FragmentManager fm, int NoofTabs){
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
                Info_226_Fragment home = new Info_226_Fragment();
                return home;
            case 1:
                Photos_226_Fragment about = new Photos_226_Fragment();
                return about;
            default:
                return null;
        }
    }
}

