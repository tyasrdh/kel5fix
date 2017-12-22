package com.example.portal.kel5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity_15_OFFERS extends AppCompatActivity {

    ListView lv1;
    String[] Judul = {"Yo! Chain", "Promo Code RH5KX643", "Order Above $50"};
    String[] Keterangan = {
            "Offer valid 10 June 2016",
            "Valid for new customer only",
            "Valid for new customer only"};
    String[] Diskon = {};
    Integer[] Gambar = {R.drawable.a15_1, R.drawable.a15_2, R.drawable.a15_3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15__offers);

        lv1 = findViewById(R.id.lvt_1);
        final ArrayAdapter adapter = null;

        customAdapter1 cs = new customAdapter1(this, Judul, Keterangan, Gambar);
        lv1.setAdapter(cs);
    }
}
