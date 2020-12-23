package com.example.goodang.keluar;

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

public class KeluarFragment extends Fragment {

    View v;
    private RecyclerView recyclerView;
    private List<Keluar> keluarList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        keluarList = new ArrayList<>();
        keluarList.add(new Keluar("Buku Tulis", "009953119759", "Buku Tulis 34 Lembar", "1", "22/04/2020", R.drawable.cetak_buku_tulis_sekolah));
        keluarList.add(new Keluar("Buku Gambar", "0997779776690", "Buku Gambar A4", "1", "19/03/2020", R.drawable.bukugambar));
        keluarList.add(new Keluar("Bulpoin", "0997779776690", "Bulpoin Warna Hitam", "1", "19/03/2020", R.drawable.bulpoint));
        keluarList.add(new Keluar("Buku Tulis", "0997779776690", "Buku Tulis 34 lembar", "2", "19/03/2020", R.drawable.cetak_buku_tulis_sekolah));
        keluarList.add(new Keluar("Buku Gambar", "0997779776690", "Buku Gambar A4", "2", "19/03/2020", R.drawable.bukugambar));
        keluarList.add(new Keluar("Bulpoin", "0997779776690", "Bulpoin Warna Hitam", "1", "19/03/2020", R.drawable.bulpoint));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_keluar, container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.out_recycler);
        RecylerViewAdapterOut recylerViewAdapterOut = new RecylerViewAdapterOut(getContext(),keluarList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recylerViewAdapterOut);
        return v;
    }
}
