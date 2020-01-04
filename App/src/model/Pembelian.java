/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author khoirul-06990
 */
public class Pembelian {
    private String nama;
    private String jenis;
    private int jumlah;
    private int harga;
    private int total;

    public Pembelian(String nama, String jenis, int jumlah, int harga, int total) {
        this.nama = nama;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.harga = harga;
        this.total = total;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        return total;
    }
    
}
