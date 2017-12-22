package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_13_SUPPORT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13__support);
    }

    public void send(View view)
    {
        Intent sd = new Intent(this,Activity_14_PROFILE.class);
        startActivity(sd);
    }
}
