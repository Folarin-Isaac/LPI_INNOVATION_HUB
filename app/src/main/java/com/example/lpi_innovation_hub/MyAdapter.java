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
                AllFragment allFragment = new AllFragment();
                return allFragment;
            case 1:
                LoginFragment loginFragment = new LoginFragment();
                return loginFragment;
            case 2:
                SubscribedFragment subscribedFragment = new SubscribedFragment();
                return subscribedFragment;
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
