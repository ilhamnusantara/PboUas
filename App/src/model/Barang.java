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
abstract class Barang {
    String namaProduk;
    String jenisProduk;
    
    public Barang(String namaProduk, String jenisProduk){
        this.namaProduk = namaProduk;
        this.jenisProduk = jenisProduk;
    }
}
