package com.example.goodang.masuk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.goodang.R;

import java.util.ArrayList;
import java.util.List;

public class MasukFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<Masuk> masukList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        masukList = new ArrayList<>();
        masukList.add(new Masuk("Buku Tulis", "0997779776690", "Buku Tulis 34 lembar", "5", "19/03/2020", R.drawable.cetak_buku_tulis_sekolah));
        masukList.add(new Masuk("Buku Gambar", "0997779776690", "Buku Gambar A4", "3", "19/03/2020", R.drawable.bukugambar));
        masukList.add(new Masuk("Bulpoin", "0997779776690", "Bulpoin Warna Hitam", "2", "19/03/2020", R.drawable.bulpoint));
        masukList.add(new Masuk("Buku Tulis", "0997779776690", "Buku Tulis 34 lembar", "5", "19/03/2020", R.drawable.cetak_buku_tulis_sekolah));
        masukList.add(new Masuk("Buku Gambar", "0997779776690", "Buku Gambar A4", "3", "19/03/2020", R.drawable.bukugambar));
        masukList.add(new Masuk("Bulpoin", "0997779776690", "Bulpoin Warna Hitam", "2", "19/03/2020", R.drawable.bulpoint));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_masuk, container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.in_recycler);
        RecylerViewAdapterIn recyclerViewAdapter = new RecylerViewAdapterIn(getContext(),masukList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }
}
