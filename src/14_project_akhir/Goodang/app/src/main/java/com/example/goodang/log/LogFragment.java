package com.example.goodang.log;

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

public class LogFragment extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private List<LogActivities> lstLog;

    public LogFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_log, container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.log_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstLog);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstLog = new ArrayList<>();
        lstLog.add(new LogActivities("Barang Masuk","Buku Tulis 3 Box", "13/12/2020", R.drawable.checked));
        lstLog.add(new LogActivities("Barang Keluar","Buku Tulis 1 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Gambar A4 5 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Bulpoin Hitam 4 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Tulis 3 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Keluar","Buku Tulis 1 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Gambar A4 5 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Bulpoin Hitam 4 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Tulis 3 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Keluar","Buku Tulis 1 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Gambar A4 5 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Bulpoin Hitam 4 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Tulis 3 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Keluar","Buku Tulis 1 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Gambar A4 5 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Bulpoin Hitam 4 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Tulis 3 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Keluar","Buku Tulis 1 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Buku Gambar A4 5 Box", "13/12/2020",R.drawable.checked));
        lstLog.add(new LogActivities("Barang Masuk","Bulpoin Hitam 4 Box", "13/12/2020",R.drawable.checked));

    }
}
