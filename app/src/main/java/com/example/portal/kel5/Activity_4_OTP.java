package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_4_OTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4__otp);
    }

    public void btnSGNUP(View view) {
        Intent sds = new Intent(this,Activity_3_REGISTER.class);
        startActivity(sds);
    }
}
