/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import model.User;
import java.util.*;
/**
 *
 * @author ilham-07010
 */
public class ControllerLogin {

   
    public static ArrayList<User> user = new ArrayList<User>();
    public String nama;
    
    
//    public static void guruInsert(){
//        user.add(new User("guru", "guru", "yanto","guru",null,null,null));
//    }
 
    
    public static String login(String username, String pass)
    {
        
        String hasil = "gagal";
        for (int i = 0; i<user.size(); i++)
        {
            if ((username == null ? user.get(i).getUsername() == null : username.equals(user.get(i).getUsername()))&& (pass == null ? user.get(i).getPassword() == null : pass.equals(user.get(i).getPassword())))
            {   
                if(username.equals("admin")&&pass.equals("admin")){
                    hasil = "admin";
          }
        }
        return hasil;
    }
