package com.example.goodang;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.goodang.keluar.KeluarFragment;
import com.example.goodang.log.LogFragment;
import com.example.goodang.masuk.MasukFragment;
import com.example.goodang.produk.ProdukFragment;

public class MainFragment  extends Fragment {

    CardView log_act, produk_act, produk_in, produk_out;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        /*----------------------------------Hooks--------------------------------*/
        log_act = view.findViewById(R.id.log_act);
        produk_act = view.findViewById(R.id.produk_act);
        produk_in = view.findViewById(R.id.produk_in);
        produk_out = view.findViewById(R.id.produk_out);
        /*----------------------------------Set Onclick--------------------------------*/
        log_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogFragment logFragment = new LogFragment();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container_fragment, new LogFragment());
                fragmentTransaction.commit();
            }
        });
        produk_act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProdukFragment produkFragment = new ProdukFragment();
                FragmentTransaction fragmentTransactionpro = getFragmentManager().beginTransaction();
                fragmentTransactionpro.replace(R.id.container_fragment, new ProdukFragment());
                fragmentTransactionpro.commit();
            }
        });
        produk_in.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                MasukFragment masukFragments = new MasukFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_fragment, new MasukFragment());
                transaction.commit();
            }
        });
        produk_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeluarFragment keluarFragment = new KeluarFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.container_fragment, new KeluarFragment());
                transaction.commit();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RelativeLayout produk = view.findViewById(R.id.produk);
        produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getChildFragmentManager().beginTransaction().replace(R.id.container_fragment, new ProdukFragment()).commit();
            }
        });
    }

}
