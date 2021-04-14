package com.gaming.caroomlucky.uifragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.gaming.caroomlucky.R;
public class FriendsFragment extends Fragment {
    private View view;
    TextView pageunder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_friends, container, false);
        pageunder=view.findViewById(R.id.tv_pageunder);
        Animation animation = AnimationUtils.loadAnimation(getActivity(),
                R.anim.blink);
        pageunder.startAnimation(animation);
        return view;
    }
}