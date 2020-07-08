package com.example.lpi_innovation_hub;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MemberDeatilsAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int tooTabs;

    public MemberDeatilsAdapter(Context context, FragmentManager fm, int tooTabs) {
        super(fm);
        myContext = context;
        this.tooTabs = tooTabs;
    }

    //This is created for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentActivities fragmentActivities = new FragmentActivities();
                return fragmentActivities;
            case 1:
                FragmentDetails fragmentDetails = new FragmentDetails();
                return fragmentDetails;
                default:
                    return null;
        }

    }

    //This counts the total number of tabs
    @Override
    public int getCount() {
        return tooTabs;
    }
}
