/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khoirul-06990
 */
public class ControllerHome {
    private static ArrayList<String> radioName = new ArrayList<>();
    
    public static void AddCmb(JComboBox Cmb, ArrayList L)
    {
        Cmb.removeAllItems();
        Cmb.repaint();
        Cmb.revalidate();
        for (int i = 0; i<L.size(); i++)
        {
            if (L==ControllerProduk.getMod())
            {
                Cmb.addItem(ControllerProduk.getMod().get(i).getNamaProduk());
            }
            else if (L==ControllerProduk.getPod())
            {
                Cmb.addItem(ControllerProduk.getPod().get(i).getNamaProduk());
            }
            else if (L==ControllerProduk.getFreebase())
            {
                Cmb.addItem(ControllerProduk.getFreebase().get(i).getNamaProduk());
            }
            else if (L==ControllerProduk.getSaltnic())
            {
                Cmb.addItem(ControllerProduk.getSaltnic().get(i).getNamaProduk());
            }
        }
        Cmb.repaint();
        Cmb.revalidate();
    }
    
    public static void addTbl(JTable tblData, String produk){
//        Mod, Pod, Liquid FireBase, Liquid Saltnic
//        tblData.removeEditor();
//        tblData.repaint();
//        tblData.revalidate();
        DefaultTableModel view = (DefaultTableModel)tblData.getModel();
        view.setRowCount(0);
        for(int i = 0; i<6; i++){
            if(produk=="Mod"){
               view.addRow(new Object[]{ControllerProduk.getMod().get(i).getNamaProduk(),
               ControllerProduk.getMod().get(i).getJenisProduk(),
               ControllerProduk.getMod().get(i).getHarga(),
               ControllerProduk.getMod().get(i).getJumlahProduk()});
            }else if(produk=="Pod"){
               view.addRow(new Object[]{ControllerProduk.getPod().get(i).getNamaProduk(),
               ControllerProduk.getPod().get(i).getJenisProduk(),
               ControllerProduk.getPod().get(i).getHarga(),
               ControllerProduk.getPod().get(i).getJumlahProduk()}); 
            }else if(produk=="Liquid FreeBase"){
               view.addRow(new Object[]{ControllerProduk.getFreebase().get(i).getNamaProduk(),
               ControllerProduk.getFreebase().get(i).getJenisProduk(),
               ControllerProduk.getFreebase().get(i).getHarga(),
               ControllerProduk.getFreebase().get(i).getJumlahProduk()}); 
            }else if(produk=="Liquid Saltnic"){
               view.addRow(new Object[]{ControllerProduk.getSaltnic().get(i).getNamaProduk(),
               ControllerProduk.getSaltnic().get(i).getJenisProduk(),
               ControllerProduk.getSaltnic().get(i).getHarga(),
               ControllerProduk.getSaltnic().get(i).getJumlahProduk()});  
            }
        }
//        tblData.repaint();
//        tblData.revalidate();
        
    }
    
    public static void RemovePanel(JPanel panel)
    {
        panel.removeAll();
        panel.repaint();
        panel.revalidate();
    }
    
    public static void AddPanel(JPanel main, JPanel add)
    {
        main.add(add);
        main.repaint();
        main.revalidate();
    }
    
    public static ImageIcon icon(int width, int heigth)
    {
       ImageIcon icon = new ImageIcon("/home/khoirul-06990/Documents/PboUas/download (1).jpeg");
       Image img = icon.getImage();
       Image newimg = img.getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH);
       icon = new ImageIcon(newimg);
       return icon;
    }
    
    public static void addRadioName(ButtonGroup group)
    {
        radioName.add(group.getSelection().getActionCommand());
    }
    
//    public static ArrayList<String> getRadioName() {
//        return radioName;
//    }
    
    // cari index produk dari tabel pembelian
    public static int index(String nameButton, JTable table, int awal)
    {
        int Index = -1;
        for(int i=awal; i<table.getRowCount(); i++)
         {
             System.out.println("index ke- "+i);
            String jenis = (String)table.getValueAt(i, 1);
            switch (nameButton) {
                case "Mod":
                    for(int x=0; x<ControllerProduk.getMod().size(); x++)
                    {
                        if(jenis.equals(ControllerProduk.getMod().get(x).getNamaProduk()))
                        {
                            Index = x;
                            System.out.println("mod");
                            System.out.println("=========");
                            break;
                        }
                    }
                    break;
                case "Pod":
                    for(int x=0; x<ControllerProduk.getPod().size(); x++)
                    {
                        if(jenis.equals(ControllerProduk.getPod().get(x).getNamaProduk()))
                        {
                            Index = x;
                            System.out.println("pod");
                            System.out.println("=========");
                            break;
                        }
                    }
                    break;
                case "FreeBase":
                    for(int x=0; x<ControllerProduk.getFreebase().size(); x++)
                    {
                        if(jenis.equals(ControllerProduk.getFreebase().get(x).getNamaProduk()))
                        {
                            Index = x;
                            System.out.println("free");
                            System.out.println("=========");
                            break;
                        }
                    }
                    break;
                case "SaltNic":
                    for(int x=0; x<ControllerProduk.getSaltnic().size(); x++)
                    {
                        if(jenis.equals(ControllerProduk.getSaltnic().get(x).getNamaProduk()))
                        {
                            Index = x;
                            System.out.println("salt");
                            System.out.println("=========");
                            break;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return Index;
    }
    
    public static void update(JTable table, int beli)
    {
//        int banyakData = table.getRowCount();
//        System.out.println("ini loop i ke- "+table.getRowCount());
        for(int i=0; i<table.getRowCount(); i++)
        {
            System.out.println("update");
            ControllerProduk.updateQty(radioName.get(i), index(radioName.get(i), table, i), beli);
//            System.out.println(radioName.get(i));
            
//            System.out.println(index(radioName.get(i), table, i));
        }
    }
    
    public static void coba()
    {
        for(int i=0; i<radioName.size(); i++)
        {
            System.out.println(radioName.get(i));
        }
    }
//    public static String nameJrSelected(ButtonGroup button, JRadioButton)
//    {
//        String name = null;
//        return name;
//    } 

//    public static void remove(ButtonGroup group)
//    {
//        switch (group.getSelection().getActionCommand()) {
//            case "Mod":
//                break;
//            case "Pod":
//                break;
//            case "FreeBase":
//                break;
//            case "SaltNic":
//                break;
//            default:
//                break;
//        }
//    }
//    
//    public static String index()
//    {
//        
//    }


}
