package com.example.goodang.masuk;

public class Masuk {
    private String nama, kode, deskripsi, jmlh, tanggal;
    private int gambar;

    public Masuk(String nama, String kode, String deskripsi, String jmlh, String tanggal, int gambar) {
        this.nama = nama;
        this.kode = kode;
        this.deskripsi = deskripsi;
        this.jmlh = jmlh;
        this.tanggal = tanggal;
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

    public String getJmlh() {
        return jmlh;
    }

    public void setJmlh(String jmlh) {
        this.jmlh = jmlh;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
