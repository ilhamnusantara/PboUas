/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import frame.Home;
/**
 *
 * @author ilham-07010
 */
public class ControllerLogin {
    
    public static void login(String username, String pass)
    {
        String username1 = "admin";
        String password1 = "admin";
        
        String hasil = "gagal";
         if(username1 == username && password1 == pass){
         hasil = "admin";
         Home d = new Home();
         d.setVisible(true);
         }
        
//        return hasil;
                 
    }
}
