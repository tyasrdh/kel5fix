package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_2_LOGIN extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2__login);
    }

    public void tvSIGNUP(View view) {
        Intent sd = new Intent(this,Activity_3_REGISTER.class);
        startActivity(sd);

    }
}
