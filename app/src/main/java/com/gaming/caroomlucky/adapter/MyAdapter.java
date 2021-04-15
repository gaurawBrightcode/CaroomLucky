package com.gaming.caroomlucky.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.gaming.caroomlucky.uifragment.PowerFragment;
import com.gaming.caroomlucky.uifragment.PucksFragment;
import com.gaming.caroomlucky.uifragment.StrickerFragment;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                StrickerFragment equipmentFragment = new StrickerFragment();
                return equipmentFragment;
            case 1:
                PowerFragment powersFragment = new PowerFragment();
                return powersFragment;
            case 2:
                PucksFragment pucksFragment = new PucksFragment();
                return pucksFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }


}
