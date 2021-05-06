package com.gaming.caroomlucky.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.gaming.caroomlucky.R;
import com.gaming.caroomlucky.adapter.MyAdapter;
import com.google.android.material.tabs.TabLayout;

public class ProfileActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        tabLayout=(TabLayout)findViewById(R.id.tabLayout);
        viewPager=(ViewPager)findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Info"));
        tabLayout.addTab(tabLayout.newTab().setText("Avatars"));
        tabLayout.addTab(tabLayout.newTab().setText("Frames"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        MyAdapter adapter = new MyAdapter(getApplicationContext(),getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

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