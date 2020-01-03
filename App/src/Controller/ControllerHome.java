/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author khoirul-06990
 */
public class ControllerHome {
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
        tblData.removeEditor();
        tblData.repaint();
        tblData.revalidate();
        DefaultTableModel view = (DefaultTableModel)tblData.getModel();
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
        tblData.repaint();
        tblData.revalidate();
        
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

}
