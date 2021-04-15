package com.gaming.caroomlucky.uifragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.gaming.caroomlucky.R;

public class StrickerFragment extends Fragment {
  private View view;
    Animation animation;
    ImageView img,img1,img2,i,star;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_stricker, container, false);
        img2 = view.findViewById(R.id.img2);
        img = view.findViewById(R.id.img);
        img1 = view.findViewById(R.id.img1);
        i = view.findViewById(R.id.i);

        star = view.findViewById(R.id.star);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        img2.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        img.startAnimation(animation);

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        img1.startAnimation(animation);

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        i.startAnimation(animation);
        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.circular);
        star.startAnimation(animation);
        return view;
    }
}