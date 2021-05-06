package com.gaming.caroomlucky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.gaming.caroomlucky.ui.StartScreenActivity;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        logo=findViewById(R.id.iv_carrom);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), StartScreenActivity.class));
            }
        },8000);
    }
//keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android
//    SHA1: 5C:8A:64:66:A2:65:0A:C6:29:24:14:CE:AC:3B:42:E0:E7:E9:BF:37
//    SHA256: 52:E0:C3:5E:77:CF:90:B8:3D:50:76:2E:99:00:DB:DC:92:A5:14:69:73:E2:C1:D2:2F:CB:E9:B2:83:3E:88:9E

}