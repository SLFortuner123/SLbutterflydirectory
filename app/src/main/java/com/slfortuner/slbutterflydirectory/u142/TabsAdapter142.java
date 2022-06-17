package com.slfortuner.slbutterflydirectory.u142;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter142 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter142(FragmentManager fm, int NoofTabs){
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
                Info_142_Fragment home = new Info_142_Fragment();
                return home;
            case 1:
                Photos_142_Fragment about = new Photos_142_Fragment();
                return about;
            default:
                return null;
        }
    }
}
