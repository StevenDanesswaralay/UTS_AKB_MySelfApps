package com.steven.uts_akb_myselfapps;
/*
*Tanggal Pengerjaan : 4 juni 2021
Nim : 10118078
Nama : Steven Danesswaralay
email : Steven.10118078@mahasiswa.unikom.ac.id
Kelas : IF-2 */
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MusicFragment extends Fragment {

    ListView listView,listView2;
    String mnama_musik[] = {"Semestinya", "Dandelions", "Silk Sonic"};
    int mimg_musik[] = {R.drawable.lagu1, R.drawable.lagu2, R.drawable.lagu3};
    String mnama_video[] = {"Transformers", "Godzilla", };
    int mimg_video[] = {R.drawable.movie1, R.drawable.movie2};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_music, container, false);
        listView = rootView.findViewById(R.id.list_view_music);
        listView2 = rootView.findViewById(R.id.list_view_video);
        Adapter_listmusic adapter_listmusic = new Adapter_listmusic(getActivity(),mnama_musik, mimg_musik);
        Adapter_listmusic adapter_listmusic2 = new Adapter_listmusic(getActivity(),mnama_video, mimg_video);


        listView.setAdapter(adapter_listmusic);
        listView2.setAdapter(adapter_listmusic2);
        return rootView;
    }

}