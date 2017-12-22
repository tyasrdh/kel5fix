package com.example.portal.kel5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_3_REGISTER extends AppCompatActivity {

    EditText uname,password;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3__register);

        uname = (EditText) findViewById(R.id.textmail2);
        password = (EditText) findViewById(R.id.textpassword2);
        btnlogin = (Button) findViewById(R.id.tombolup);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String unameKey = uname.getText().toString();
                String passwordKey = password.getText().toString();
                if ((unameKey.contains("arifahfariza@example.com")&&(passwordKey.contains("******")))) {
                    Toast.makeText(getApplicationContext(), "Sign in sukses", Toast.LENGTH_SHORT).show();
                    //Intent intents = new Intent(Activity_3_REGISTER.this,activity_4_OTP.class);
                    //startActivity(intents);
                }

                else if ((unameKey.matches("")||(passwordKey.matches("")))) {
                    Toast.makeText(getApplicationContext(), "Silakan masukkan email dan password", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText (getApplicationContext(), "email atau password salah. sign in gagal", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }

    public void tvSIGN(View view)
    {
        Intent sd = new Intent(this,Activity_2_LOGIN.class);
        startActivity(sd);

    }

    public void btnSign(View view) {
        Intent sds = new Intent(this,Activity_2_LOGIN.class);
        startActivity(sds);
    }
}
