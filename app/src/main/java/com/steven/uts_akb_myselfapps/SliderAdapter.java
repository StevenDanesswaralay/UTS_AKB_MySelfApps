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
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderAdapter(Context context){
        this.context = context;
    }

    //arrays
    public int[] slide_images ={
            R.drawable.idcard,
            R.drawable.sport,
            R.drawable.comment,
    };

    public String[] slide_headings ={
            "Welcome To My Self Apps",
            "Closer",
            "Daily"
    };
    public String[] slide_descs ={
            "Pada aplikasi ini menampilkan seluruh biodata mengenai Steven Danesswaralay",
            "Aplikasi ini berisi data mengenai hobby kegiatan pemilik",
            "Aplikasi MySelft berisi tentang Daily activity,Interest,Friendlist."
    };
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}