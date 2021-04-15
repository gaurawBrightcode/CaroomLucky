package com.gaming.caroomlucky.uifragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.gaming.caroomlucky.R;

public class PowerFragment extends Fragment {
    View view;
    Animation animation;
    RelativeLayout img1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_power, container, false);
        img1 = view.findViewById(R.id.img1);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        img1.startAnimation(animation);
        return view;
    }
}