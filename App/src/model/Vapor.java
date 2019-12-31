/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ilham-07010
 */
public class Vapor extends RokokElektronik{
    private int harga;
    private int jumlahProduk;
    public Vapor(String namaProduk, String jenisProduk, int harga, int jumlahProduk) {
        super(namaProduk, jenisProduk);
        this.harga = harga;
        this.jumlahProduk = jumlahProduk;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getJenisProduk() {
        return jenisProduk;
    }
    
    
}
