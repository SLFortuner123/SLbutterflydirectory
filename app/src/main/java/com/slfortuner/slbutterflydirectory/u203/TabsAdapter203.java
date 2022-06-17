package com.slfortuner.slbutterflydirectory.u203;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter203 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter203(FragmentManager fm, int NoofTabs){
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
                Info_203_Fragment home = new Info_203_Fragment();
                return home;
            case 1:
                Photos_203_Fragment about = new Photos_203_Fragment();
                return about;
            default:
                return null;
        }
    }
}

