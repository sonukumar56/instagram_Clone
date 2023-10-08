package com.example.instagram_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(splashScreen.this,Login_Activity.class);
                startActivity(intent);
                finish();
            }
        }, 900);




    }
}