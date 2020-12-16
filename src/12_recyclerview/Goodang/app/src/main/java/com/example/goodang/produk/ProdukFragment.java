package com.example.goodang.produk;

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

public class ProdukFragment extends Fragment{
    View v;
    private RecyclerView recyclerView;
    private List<Produk> produkList;

    public ProdukFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_produk, container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.pro_recyclerview);
        RecyclerViewAdapterPro recyclerViewAdapter = new RecyclerViewAdapterPro(getContext(),produkList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        produkList = new ArrayList<>();
        produkList.add(new Produk("Buku Tulis", "00009864862861", "Buku Tulis 52 lembar, 1 box isi 12 buku", "3", R.drawable.cetak_buku_tulis_sekolah ));
        produkList.add(new Produk("Buku Gambar", "00006764386299","Buku Gambar A4, 1 box isi 12 buku", "5", R.drawable.bukugambar));
        produkList.add(new Produk("Bulpoin Hitam", "00002287538999", "Bulpoin Standart warna hitam, i box isi 6 bulpoin", "6", R.drawable.bulpoint));
        produkList.add(new Produk("Buku Tulis", "00009864862861", "Buku Tulis 52 lembar, 1 box isi 12 buku", "3" , R.drawable.cetak_buku_tulis_sekolah ));
        produkList.add(new Produk("Buku Gambar", "00006764386299","Buku Gambar A4, 1 box isi 12 buku", "5", R.drawable.bukugambar));
        produkList.add(new Produk("Bulpoin Hitam", "00002287538999", "Bulpoin Standart warna hitam, i box isi 6 bulpoin", "6", R.drawable.bulpoint));
    }
}
