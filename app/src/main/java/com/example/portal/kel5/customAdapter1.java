package com.example.portal.kel5;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nmms on 12/22/2017.
 */

public class customAdapter1 extends ArrayAdapter {
    String[] judul;
    String[] konten;
    Integer[] gambar;
    Activity context;

    public customAdapter1(@NonNull Activity context, String[] judul, String[] konten, Integer[] gambar) {
        super(context, R.layout.customlayout_offers, judul);
        this.judul = judul;
        this.konten = konten;
        this.gambar = gambar;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;

        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.customlayout_offers, null, true);
            viewHolder = new ViewHolder(r);

        } else {
            viewHolder = (ViewHolder) r.getTag();
        }

        viewHolder.imgv1.setImageResource(gambar[position]);
        viewHolder.tv1.setText(judul[position]);
        viewHolder.tv2.setText(konten[position]);
        return r;


    }

    class ViewHolder {
        TextView tv1, tv2;

        ImageView imgv1;

        ViewHolder(View v) {
            tv1 = v.findViewById(R.id.Judul);
            tv2 = v.findViewById(R.id.keterangan);
            imgv1 = v.findViewById(R.id.gambar1);
        }
    }
}
