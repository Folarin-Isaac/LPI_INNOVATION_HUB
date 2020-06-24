package com.example.lpi_innovation_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

   private ImageView imgView;
   private static int splashTimeOut=5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        //Declare an image to show the animation
        imgView = (ImageView) findViewById(R.id.imgView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);
        //create the animation
        Animation myanim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.mysplashanimation);
        imgView.startAnimation(myanim);
    }
}
