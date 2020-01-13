/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.Pembelian;

/**
 *
 * @author ilham-07010
 */
public class ControllerPembelian {
    private static ArrayList<Pembelian> beli =  new  ArrayList<>();
    private static ArrayList<Integer> pembelian = new ArrayList<>();
    public static void Add(String button, String nama, String jenis, int jumlah)
    {
        beli.add(new Pembelian(nama, jenis, jumlah, Harga(button, jenis), Harga(button, jenis)*jumlah));
    }
    
//    public static int HargaTotal()
//    {
//        
//    }
    
    //harga satuan barang
    private static int Harga(String button, String jenis)
    {
        int harga = 0;
        switch (button) {
            case "Mod":
                for(int i = 0; i<ControllerProduk.getMod().size(); i++)
                {
                    if(ControllerProduk.getMod().get(i).getNamaProduk().equals(jenis))
                    {
                        harga = ControllerProduk.getMod().get(i).getHarga();
                        break;
                    }
                }   break;
            case "Pod":
                for(int i = 0; i<ControllerProduk.getPod().size(); i++)
                {
                    if(ControllerProduk.getPod().get(i).getNamaProduk().equals(jenis))
                    {
                        harga = ControllerProduk.getPod().get(i).getHarga();
                        break;
                    }
                }   break;
            case "FreeBase":
                for(int i = 0; i<ControllerProduk.getFreebase().size(); i++)
                {
                    if(ControllerProduk.getFreebase().get(i).getNamaProduk().equals(jenis))
                    {
                        harga = ControllerProduk.getFreebase().get(i).getHarga();
                        break;
                    }
                }   break;
            case "Salt Nic":
                for(int i = 0; i<ControllerProduk.getSaltnic().size(); i++)
                {
                    if(ControllerProduk.getSaltnic().get(i).getNamaProduk().equals(jenis))
                    {
                        harga = ControllerProduk.getSaltnic().get(i).getHarga();
                        break;
                    }
                }   break;
//            default:
//                break;
        }
        return harga;
    }
    
    public static void AddTablePembelian(JTable table, JTextField field)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        for (int i = 0; i < beli.size(); i++)
        {
            model.addRow(new Object[]{beli.get(i).getNama(), 
                beli.get(i).getJenis(), 
                beli.get(i).getJumlah(),
                beli.get(i).getHarga(),
                beli.get(i).getTotal()});
            field.setText((String.valueOf(PendapatanHari(table))));
        }
    }
    
    public static int PendapatanHari(JTable table){
        int pendapatan = 0;
        for(int i = 0; i<table.getRowCount(); i++){
            pendapatan = pendapatan + (Integer)table.getValueAt(i,4);
        }
//        for(int)
        return pendapatan;
    }
    
    public static void StrukPembelian(JTextArea struk, String total){
        String tampil = "\t\t\t======WELCOME====="+"\n"+"nama pembeli : "+beli.get(0).getNama()+"\n\t\tJenis"+
                "\tJumlah"+"\tHarga"+"\tTotal Harga";
        for(int i = 0; i < beli.size(); i++){      
            System.out.println("Jenis :"+beli.get(i).getJenis());
            tampil += "\n*"+beli.get(i).getJenis()+"\t\t"+beli.get(i).getJumlah()+
                    "\t"+beli.get(i).getHarga()+"\t"+beli.get(i).getTotal()+"\n";
        }        
         struk.setText(tampil+"\n"+total);
                
    } 
 
    public void Remove()
    {
        beli.clear();
    }

    public static ArrayList<Pembelian> getBeli() {
        return beli;
    }
    
}
