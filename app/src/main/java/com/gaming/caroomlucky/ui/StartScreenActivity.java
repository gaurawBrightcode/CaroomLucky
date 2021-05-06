package com.gaming.caroomlucky.ui;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.gaming.caroomlucky.R;
import com.gaming.caroomlucky.session.SessionManager;

public class StartScreenActivity extends AppCompatActivity {
    TextView blink;
    SessionManager sessionManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        sessionManager=new SessionManager(getApplicationContext());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        blink = findViewById(R.id.tv_blink);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);
        blink.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              /*  startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                finish();*/
                if (sessionManager.checkisGoogleSession()){
                    startActivity(new Intent(StartScreenActivity.this, DashboardActivity.class));
                    finish();
                }else if (sessionManager.checkisFacebookSession()){
                    startActivity(new Intent(StartScreenActivity.this, DashboardActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(StartScreenActivity.this,LoginActivity.class));
                    finish();
                }
            }
        },3000);


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", (dialog, id) -> {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                    System.exit(0);
                })
                .setNegativeButton("No", (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }

}