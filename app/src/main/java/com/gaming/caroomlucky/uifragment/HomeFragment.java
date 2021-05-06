package com.gaming.caroomlucky.uifragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.gaming.caroomlucky.R;
import com.gaming.caroomlucky.ui.ProfileActivity;
import com.gaming.caroomlucky.ui.SettingActivity;
public class HomeFragment extends Fragment implements View.OnClickListener {
   ImageView profile;
   FrameLayout setting;
   View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_home, container, false);
        profile=view.findViewById(R.id.iv_profile);
        setting=view.findViewById(R.id.flip_setting);
        setting.setOnClickListener(this);
        profile.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case(R.id.flip_setting):
              Intent i = new Intent(getActivity(),SettingActivity.class);
              startActivity(i);
              ((Activity) getActivity()).overridePendingTransition(0, 0);
              break;
          case (R.id.iv_profile):
              Intent  ip = new Intent(getActivity(), ProfileActivity.class);
              startActivity(ip);
              ((Activity) getActivity()).overridePendingTransition(0, 0);
              break;
      }
    }
}