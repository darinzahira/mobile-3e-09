package com.example.goodang.produk;

public class Produk {

    private String nama, kode, deskripsi, stok;
    private int gambar;

    public Produk(String nama, String kode, String deskripsi, String stok, int gambar) {
        this.nama = nama;
        this.kode = kode;
        this.deskripsi = deskripsi;
        this.stok = stok;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
