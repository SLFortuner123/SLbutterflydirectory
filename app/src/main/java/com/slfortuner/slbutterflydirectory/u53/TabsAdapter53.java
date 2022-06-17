package com.slfortuner.slbutterflydirectory.u53;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter53 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter53(FragmentManager fm, int NoofTabs){
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
                Info_53_Fragment home = new Info_53_Fragment();
                return home;
            case 1:
                Photos_53_Fragment about = new Photos_53_Fragment();
                return about;
            default:
                return null;
        }
    }
}

