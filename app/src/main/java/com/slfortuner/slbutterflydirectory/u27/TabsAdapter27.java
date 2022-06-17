package com.slfortuner.slbutterflydirectory.u27;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter27 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter27(FragmentManager fm, int NoofTabs){
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
                Info_27_Fragment home = new Info_27_Fragment();
                return home;
            case 1:
                Photos_27_Fragment about = new Photos_27_Fragment();
                return about;
            default:
                return null;
        }
    }
}

