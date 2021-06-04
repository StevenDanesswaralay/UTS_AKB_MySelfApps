package com.steven.uts_akb_myselfapps;
/*
*Tanggal Pengerjaan : 4 juni 2021
Nim : 10118078
Nama : Steven Danesswaralay
email : Steven.10118078@mahasiswa.unikom.ac.id
Kelas : IF-2 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DailyFragment extends Fragment {
    ListView listView;
    RecyclerView recyclerView;
    ArrayList<MainModel> mainModels;
    Adapter_horizontal adapter_horizontal;

    String mTitle[] = {"Bermain game", "Belajar", "Rapat bersama organisasi", "Olahraga", "Dating" };
    String mDescription[] = {"Bersama teman teman","Belajar berbagai hal", "Melakukan diskusi", "Membuat tubuh bugar" , "Jalan jalan bersama pacar"};
    int mimages[] = {R.drawable.playing, R.drawable.study, R.drawable.videoconference, R.drawable.sport2, R.drawable.tinder};
    int[] img_friend = {R.drawable.mirraz, R.drawable.fikri, R.drawable.rakha };
    String[] keterangan = {"Mirraz","Fikri", "Rakha"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainModels = new ArrayList<>();
        for (int i=0;i<img_friend.length;i++){
            MainModel model = new MainModel(img_friend[i],keterangan[i]);
            mainModels.add(model);
        }


        View rootView = inflater.inflate(R.layout.frag_daily, container, false);
        listView = rootView.findViewById(R.id.list_view);
        recyclerView = rootView.findViewById(R.id.recyclerView_friend);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Adapter_horizontal adapter_horizontal = new Adapter_horizontal(getContext(),mainModels);
        Adapter_listview adapter_listview = new Adapter_listview(getActivity(),mTitle, mDescription, mimages);

        listView.setAdapter(adapter_listview);
        recyclerView.setAdapter(adapter_horizontal);
        return rootView;
    }
}
