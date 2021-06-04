package com.steven.uts_akb_myselfapps;
/*
*Tanggal Pengerjaan : 4 juni 2021
Nim : 10118078
Nama : Steven Danesswaralay
email : Steven.10118078@mahasiswa.unikom.ac.id
Kelas : IF-2 */
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    ImageButton wa_btn,map_btn,info_btn;
    String num = "6285311853108";
    String text = "Hello";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_profile, container, false);
        wa_btn = rootView.findViewById(R.id.wa_btn);
        map_btn = rootView.findViewById(R.id.map_btn);
        info_btn = rootView.findViewById(R.id.about_btn);


        info_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog alert = new ViewDialog();
                alert.showDialog(getActivity(), "My Selft Apps merupakan aplikasi biodta mengenai  \n Steven Danesswaralay\n 10118078 \n Untuk memenuhi salah satu tugas UTS \n Mata Kuliah AKB");
            }
        });

        wa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean installed = isAppInstalled("com.whatsapp");

                if (installed){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+num+"&text"+text));
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getActivity(),"whatsapp is not installed", Toast.LENGTH_SHORT);
                }
            }
        });


        map_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                boolean installed = isAppInstalled("com.google.android.apps.maps");
                if (installed){
                    Intent intent2 = new Intent(Intent.ACTION_VIEW);
                    intent2.setData(Uri.parse("geo:-6,0619645, 106,1185637"));
                    startActivity(intent2);
                }
                else {
                    Toast.makeText(getActivity(),"Maps is not installed", Toast.LENGTH_SHORT);
                }
            }
        });
        return rootView;
    }
    private boolean isAppInstalled(String s){
        PackageManager packageManager = getActivity().getPackageManager();
        boolean is_installed;
        try {
            packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            is_installed = true;

        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;
    }
}