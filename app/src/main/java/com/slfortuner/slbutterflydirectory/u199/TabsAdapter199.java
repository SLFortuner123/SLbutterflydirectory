package com.slfortuner.slbutterflydirectory.u199;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter199 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter199(FragmentManager fm, int NoofTabs){
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
                Info_199_Fragment home = new Info_199_Fragment();
                return home;
            case 1:
                Photos_199_Fragment about = new Photos_199_Fragment();
                return about;
            default:
                return null;
        }
    }
}

