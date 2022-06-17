package com.slfortuner.slbutterflydirectory.u169;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter169 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter169(FragmentManager fm, int NoofTabs){
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
                Info_169_Fragment home = new Info_169_Fragment();
                return home;
            case 1:
                Photos_169_Fragment about = new Photos_169_Fragment();
                return about;
            default:
                return null;
        }
    }
}

