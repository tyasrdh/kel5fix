package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class layout5 extends AppCompatActivity {

    Button button;
    EditText edit1;

    private void initializeLayout(){
        edit1 = (EditText) findViewById(R.id.edit1);
        button = (Button) findViewById(R.id.button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5);

        initializeLayout();

        Intent intent = getIntent();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent.setClass(layout5.this, layout6.class);
                startActivity(intent);
            }
        });
    }
}
