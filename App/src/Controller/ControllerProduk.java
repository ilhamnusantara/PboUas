/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import  java.util.ArrayList;
import model.Mod;
import model.Pod;
import model.Freebase;
import model.SaltNic;
/**
 *
 * @author ilham-07010
 */
public class ControllerProduk {
    private static ArrayList<Mod> mod = new ArrayList<Mod>();
    private static ArrayList<Pod> pod = new ArrayList<Pod>();
    private static ArrayList<Freebase> freebase = new ArrayList<Freebase>();
    private static ArrayList<SaltNic> saltnic = new ArrayList<SaltNic>();

    public static ArrayList<Mod> getMod() {
        return mod;
    }

    public static ArrayList<Pod> getPod() {
        return pod;
    }

    public static ArrayList<Freebase> getFreebase() {
        return freebase;
    }

    public static ArrayList<SaltNic> getSaltnic() {
        return saltnic;
    }
    
    
    private static void AddMod()
    {
        mod.add(new Mod("Tesla WYE 200W", "mod", 576000, 5));
        mod.add(new Mod("Geekvape Aegis", "mod", 520000, 5));
        mod.add(new Mod("Voopoo Drag", "mod", 699000, 5));
        mod.add(new Mod("Vapor Strom Puma", "mod", 520000, 5));
        mod.add(new Mod("Smoant Battle Star", "mod", 215000, 5));
        mod.add(new Mod("Druga Poxy", "mod", 897700,5));
    }
    
    private static  void AddPod()
    {
        pod.add(new Pod("Juul", "pod", 585000, 5));
        pod.add(new Pod("Last Vape DNA", "pod", 884000, 5));
        pod.add(new Pod("SMOK Infinix", "pod", 190000, 5));
        pod.add(new Pod("SMOK Nord", "pod", 175000, 5));
        pod.add(new Pod("Uwell Caliburn", "pod" ,160000, 5));
        pod.add(new Pod("Thumb Turbo Vape", "pod", 280000, 5));
        pod.add(new Pod("Suarin Air","pod", 318000, 5));
    }
    
    private static void AddFreeBase()
    {
        freebase.add(new Freebase("furst monster", "freebase", 60, 90000, 5));
        freebase.add(new Freebase("Adam Hawa", "freebase", 100, 150000, 5));
        freebase.add(new Freebase("Man hattan", "freebase", 60, 90000, 5));
        freebase.add(new Freebase("Tobacco Ridge", "freebase", 30, 60000, 5));
        freebase.add(new Freebase("E-Juice", "freebase", 60, 90000, 5));
        freebase.add(new Freebase("King Reserve", "freebase", 30, 60000, 5));
        freebase.add(new Freebase("Dark Luna", "freebase", 100, 15000, 5));
    }
    
    public static void AddSaltNic()
    {
        saltnic.add(new SaltNic("fire pawn", "saltnic", 60, 90000, 5));
        saltnic.add(new SaltNic("no cloud", "saltnic", 30, 75000, 5));
        saltnic.add(new SaltNic("Aqua Hydra", "saltnic", 60, 90000, 5));
        saltnic.add(new SaltNic("Charlie Noble", "saltnic", 60, 120000, 5));
        saltnic.add(new SaltNic("Elite Bacco", "saltnic", 30, 60000, 5));
        saltnic.add(new SaltNic("Coffe Culture", "saltnic", 60, 100000, 6));
    }
    
    public static void AddItems()
    {
        AddMod();
        AddPod();
        AddFreeBase();
        AddSaltNic();
    }
//    public static void updateQty(ArrayList list, int index, String jenis,int volume, int harga, int Qty)
//    {
//        if(list.equals(freebase))
//        {
//            freebase.set(index, new Freebase(jenis, "freebase", volume, harga, Qty));
//        }
//        else if(list.equals(saltnic))
//        {
//            saltnic.set(index, new SaltNic(jenis, "saltnic", volume, harga, Qty));
//        }
//    }
    
    public static void updateQty(String list, int index, int Qty)
    {
        switch (list) {
            case "Mod":
                mod.set(index, new Mod(mod.get(index).getNamaProduk(), "mod",mod.get(index).getHarga(), mod.get(index).getJumlahProduk()-Qty));
                break;
            case "Pod":
                pod.set(index, new Pod(pod.get(index).getNamaProduk(), "pod", pod.get(index).getHarga(), pod.get(index).getJumlahProduk()-Qty));
                break;
            case "FreeBase":
                freebase.set(index, new Freebase(freebase.get(index).getNamaProduk(), "freebase", freebase.get(index).getVolume(), freebase.get(index).getHarga(), freebase.get(index).getJumlahProduk()-Qty));
                break;
            case "SaltNic":
                saltnic.set(index, new SaltNic(saltnic.get(index).getNamaProduk(), "saltnic", saltnic.get(index).getVolume(), freebase.get(index).getHarga(), saltnic.get(index).getJumlahProduk()-Qty));
                break;
//            default:
//                break;
        }
    }
//    public static void setSaltNic(int index, int jual)
//    {
//        int jumlah = saltnic.get(index).getJumlahProduk()-jual;
//        saltnic.set(index, new SaltNic(saltnic.get(index).getNamaProduk(), saltnic.get(index).getJenisProduk(), saltnic.get(index).getVolume(), saltnic.get(index).getHarga(), jumlah));
//    }
    
//    public static void setFreeBase(int index)
    public static void updateData(ArrayList list, int index, String name, String jenis, int ml, int harga, int stok)
    {
        list.set(index, name);
    }
}
