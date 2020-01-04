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

/**
 *
 * @author khoirul-06990
 */
public class ControllerHome {
    private static String namaJrButton;
    
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
    
//    public static String nameJrSelected(ButtonGroup button, JRadioButton)
//    {
//        String name = null;
//        return name;
//    } 

    public static String getNamaJrButton() {
        return namaJrButton;
    }

    public static void setNamaJrButton(String nama) {
        namaJrButton = nama;
    }
}
