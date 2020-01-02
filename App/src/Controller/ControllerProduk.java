/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import  java.util.ArrayList;
import model.Vapor;
import model.Pod;
import model.Freebase;
import model.SaltNic;
/**
 *
 * @author ilham-07010
 */
public class ControllerProduk {
    private static ArrayList<Vapor> vapor = new ArrayList<Vapor>();
    private static ArrayList<Pod> pod = new ArrayList<Pod>();
    private static ArrayList<Freebase> freebase = new ArrayList<Freebase>();
    private static ArrayList<SaltNic> saltnic = new ArrayList<SaltNic>();

    public static ArrayList<Vapor> getVapor() {
        return vapor;
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
    
    
    private static void AddVapor()
    {
        vapor.add(new Vapor("kingertech", "vapor", 750, 5));
        vapor.add(new Vapor("joytech", "vapor", 800, 5));
    }
    
    private static  void AddPod()
    {
        pod.add(new Pod("kingertech", "pod", 275, 5));
        pod.add(new Pod("joutech", "pod", 275, 5));
    }
    
    private static void AddFreeBase()
    {
        freebase.add(new Freebase("e-juice", "freebase", 100, 150, 5));
        freebase.add(new Freebase("e-juice", "freebase", 50, 80, 5));
        freebase.add(new Freebase("monkey", "freebase", 100, 150, 5));
    }
    
//    public static void AddSaltNic()
//    {
//        saltnic.add(new SaltNic(namaProduk, jenisProduk, 0, 0, 0));
//    }
    
//    public static String getItemVapor(int index)
//    {
//        return vapor.get(index).getNamaProduk();
//    }
//    
//    public static String getItemFreeBase(int index)
//    {
//        return freebase.get(index).getNamaProduk();
//    }
//    
//    public static String getItemPod(int index)
//    {
//        return pod.get(index).getNamaProduk();
//    }
//    
//    public static void getItemSaltNic(int index)
//    {
//        saltnic.get(index).getNamaProduk();
//    }
    
    public static void AddItems()
    {
        AddVapor();
        AddPod();
        AddFreeBase();
    }
}
