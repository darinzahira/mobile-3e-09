package com.example.goodang.about;

public class About {
    private String nama, email, nomer, github;

    public About(String nama, String email, String nomer, String github) {
        this.nama = nama;
        this.email = email;
        this.nomer = nomer;
        this.github = github;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}
