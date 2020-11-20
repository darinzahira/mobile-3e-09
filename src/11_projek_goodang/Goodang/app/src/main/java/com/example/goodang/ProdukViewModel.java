package com.example.goodang;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProdukViewModel extends ViewModel {

    public MutableLiveData<Produk> produk = new MutableLiveData<>();

    public void setProduk(Produk produk) {
        this.produk.setValue(produk);
    }
}
