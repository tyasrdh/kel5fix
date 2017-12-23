package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_10_ORDER extends AppCompatActivity {

    Button button;

    private void initializeLayout(){
        button = (Button) findViewById(R.id.button);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10__order);
        initializeLayout();

        Intent intent = getIntent();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Activity_10_ORDER.this, Activity_11_ORDERDETAILS.class);
                startActivity(intent);
            }
        });
    }
}
