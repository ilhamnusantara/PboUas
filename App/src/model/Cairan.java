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
public class Cairan extends Barang{

    int volume;
    public Cairan(String namaProduk, String jenisProduk,int volume) {
        super(namaProduk, jenisProduk);
        this.volume = volume;
    }
    
}
