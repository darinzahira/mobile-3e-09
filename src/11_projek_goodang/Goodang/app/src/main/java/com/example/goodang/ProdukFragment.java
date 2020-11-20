package com.example.goodang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.goodang.databinding.FragmentProdukBinding;

public class ProdukFragment extends Fragment{

    private ProdukViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        FragmentProdukBinding fragmentProdukBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_produk, container, false);
        viewModel = new ViewModelProvider(this).get(ProdukViewModel.class);
        fragmentProdukBinding.setViewmodel(viewModel);

        Produk produk = new Produk("Buku Tulis", "0999294353535", "1 Box berisi 12 buku", 3);
        viewModel.setProduk(produk);

        return fragmentProdukBinding.getRoot();
    }
}
