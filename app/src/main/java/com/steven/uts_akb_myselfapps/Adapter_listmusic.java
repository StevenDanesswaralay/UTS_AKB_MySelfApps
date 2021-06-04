package com.steven.uts_akb_myselfapps;
/*
*Tanggal Pengerjaan : 4 juni 2021
Nim : 10118078
Nama : Steven Danesswaralay
email : Steven.10118078@mahasiswa.unikom.ac.id
Kelas : IF-2 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Adapter_listmusic extends ArrayAdapter<String> {
    Context c;
    String[] mTitle;
    int[] mimages;
    LayoutInflater inflater;
    public Adapter_listmusic(@NonNull Context context, String[] mTitle,int[] mimages) {
        super(context, R.layout.list_music,mTitle);
        this.c = context;
        this.mTitle = mTitle;
        this.mimages = mimages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_music,null);

        }
        //inisialisasi
        TextView nama =convertView.findViewById(R.id.nama);
        ImageView image = (ImageView) convertView.findViewById(R.id.photo);

        //set Text and image
        nama.setText(mTitle[position]);
        image.setImageResource(mimages[position]);
        return convertView;
    }
}