package com.slfortuner.slbutterflydirectory.u57;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class TabsAdapter57 extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public TabsAdapter57(FragmentManager fm, int NoofTabs){
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
                Info_57_Fragment home = new Info_57_Fragment();
                return home;
            case 1:
                Photos_57_Fragment about = new Photos_57_Fragment();
                return about;
            default:
                return null;
        }
    }
}

