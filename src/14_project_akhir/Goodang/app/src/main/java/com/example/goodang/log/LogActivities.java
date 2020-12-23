package com.example.goodang.log;

public class LogActivities {
    private String nama_log;
    private String nama_barang;
    private String tanggal;
    private int icon;


    public LogActivities() {
    }

    public LogActivities(String nama_log, String nama_barang, String tanggal, int icon) {
        this.nama_log = nama_log;
        this.nama_barang = nama_barang;
        this.icon = icon;
        this.tanggal = tanggal;
    }

    public String getNama_log() {
        return nama_log;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getIcon() {
        return icon;
    }

    public void setNama_log(String nama_log) {
        this.nama_log = nama_log;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
