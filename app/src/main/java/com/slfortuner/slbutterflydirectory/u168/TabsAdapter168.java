package com.slfortuner.slbutterflydirectory.u168;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter168 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter168(FragmentManager fm, int NoofTabs){
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
                Info_168_Fragment home = new Info_168_Fragment();
                return home;
            case 1:
                Photos_168_Fragment about = new Photos_168_Fragment();
                return about;
            default:
                return null;
        }
    }
}

