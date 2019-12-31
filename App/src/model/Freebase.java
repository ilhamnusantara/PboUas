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
public class Freebase extends Cairan{
    private int harga;
    private int jumlahProduk;
    public Freebase(String namaProduk, String jenisProduk, int volume,int harga, int jumlahProduk) {
        super(namaProduk, jenisProduk, volume);
        this.harga = harga;
        this.jumlahProduk = jumlahProduk;
    }

    public int getHarga() {
        return harga;
    }

    public int getJumlahProduk() {
        return jumlahProduk;
    }

    public int getVolume() {
        return volume;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getJenisProduk() {
        return jenisProduk;
    }
    
    
}
