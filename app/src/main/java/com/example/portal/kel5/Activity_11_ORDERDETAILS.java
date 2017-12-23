package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_11_ORDERDETAILS extends AppCompatActivity {
    Button button;

    private void initializeLayout(){
        button = (Button) findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11__orderdetails);
        initializeLayout();

        Intent intent = getIntent();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(Activity_11_ORDERDETAILS.this, Activity_12_ORDERING.class);
                startActivity(intent);
            }
        });
    }
}
