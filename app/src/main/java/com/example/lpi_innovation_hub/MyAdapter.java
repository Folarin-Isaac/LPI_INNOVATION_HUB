package com.example.lpi_innovation_hub;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs){
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    //this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentAll fragmentAll = new FragmentAll();
                return fragmentAll;
            case 1:
                FragmentLogin fragmentLogin = new FragmentLogin();
                return fragmentLogin;
            case 2:
                FragmentSubscribed fragmentSubscribed = new FragmentSubscribed();
                return fragmentSubscribed;
                default:
                    return null;
        }

    }
    //this counts the total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
