package com.gaming.caroomlucky.adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gaming.caroomlucky.uifragment.ChallengeFragment;
import com.gaming.caroomlucky.uifragment.GiftsFragment;
import com.gaming.caroomlucky.uifragment.InboxFragment;


public class FriendAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public FriendAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ChallengeFragment challengeFragment = new ChallengeFragment();
                return challengeFragment;
            case 1:
               GiftsFragment giftsFragment = new GiftsFragment();
                return giftsFragment;
            case 2:
                InboxFragment inboxFragment = new InboxFragment();
                return inboxFragment;
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
