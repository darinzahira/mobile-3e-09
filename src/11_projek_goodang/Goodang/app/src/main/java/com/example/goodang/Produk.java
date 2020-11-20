package com.example.goodang;

import java.lang.reflect.Constructor;

public class Produk {

    public final String nama, kode, deskripsi;
    public final int stok;

    public Produk(String nama, String kode, String deskripsi, int stok) {
        this.nama = nama;
        this.kode = kode;
        this.deskripsi = deskripsi;
        this.stok = stok;
    }

}
