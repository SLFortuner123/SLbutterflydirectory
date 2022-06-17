package com.slfortuner.slbutterflydirectory.u162;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter162 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter162(FragmentManager fm, int NoofTabs){
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
                Info_162_Fragment home = new Info_162_Fragment();
                return home;
            case 1:
                Photos_162_Fragment about = new Photos_162_Fragment();
                return about;
            default:
                return null;
        }
    }
}
