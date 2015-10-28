/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.managed;

import com.helpmobile.dba.AccessFacade;
import com.helpmobile.dba.User;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author terra
 */
@Named
@SessionScoped
public class UserManager implements Serializable{
    
    @Inject
    private AccessFacade facade;
    
    @Inject
    HttpServletRequest request;
    
    private User user;
    
    public String login(String id, String pass){

        try{
            request.logout();
            request.login(id, pass);
            return "login";
        }
        catch(Exception e){
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, e);
            return "fail";
        }
    }
    
    public String logout(){
        try{
            request.logout();
            return "logout";
        }
        catch(Exception e){
            return "fail";
        }
    }
    
    public boolean isLogged(){
        boolean globalLogged = request.isUserInRole("Users");
        if(globalLogged&&user==null){
            user=facade.getUser(request.getRemoteUser());
        }
        //System.out.println("Loged: "+globalLogged);
        return globalLogged;
        //return getUser()!=null;
    }
    
    public static String hash256(String data) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(data.getBytes());
        return bytesToHex(md.digest());
    }
    public static String bytesToHex(byte[] bytes) {
      StringBuffer result = new StringBuffer();
      for (byte byt : bytes) {
        result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
      }
      return result.toString();
    }
}
