package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class Activity_01_SPLASH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01__splash);

        activity1();
    }

    public void activity1(){
        ImageView logo = findViewById(R.id.gambar1);
        AlphaAnimation animaton1 = new AlphaAnimation(0.0f, 1.0f);
        animaton1.setDuration(1000);
        animaton1.setStartOffset(1000);

        logo.startAnimation(animaton1);
        Thread timerThread = new Thread() {
            public void run () {
                try{
                    sleep(3000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(Activity_01_SPLASH.this, Activity_2_LOGIN.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }
}
