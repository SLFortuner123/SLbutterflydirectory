package com.slfortuner.slbutterflydirectory.u196;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter196 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter196(FragmentManager fm, int NoofTabs){
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
                Info_196_Fragment home = new Info_196_Fragment();
                return home;
            case 1:
                Photos_196_Fragment about = new Photos_196_Fragment();
                return about;
            default:
                return null;
        }
    }
}

