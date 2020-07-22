package com.example.lpi_innovation_hub.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.lpi_innovation_hub.Adapters.MemberDeatilsAdapter;
import com.example.lpi_innovation_hub.R;
import com.google.android.material.tabs.TabLayout;

public class MemberDetails extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_details);

        tabLayout = findViewById(R.id.detailsTab);
        viewPager = findViewById(R.id.detailsViewPager);

        tabLayout.addTab(tabLayout.newTab().setText("DETAILS"));
        tabLayout.addTab(tabLayout.newTab().setText("ACTIVITIES"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final MemberDeatilsAdapter memberDeatilsAdapter = new MemberDeatilsAdapter(MemberDetails.this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(memberDeatilsAdapter);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
