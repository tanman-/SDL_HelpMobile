/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.dba.AccessFacade;
import com.helpmobile.dba.User;
import com.helpmobile.managed.UserManager;
import com.helpmobile.rest.RestAccess;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author terra
 */
@RequestScoped
@Named
public class RegisterUser {

    @EJB
    private AccessFacade facade;
    
    @Inject
    private UserManager manager;
    @Inject
    private RestAccess rest;
    
    
    private final User user = new User();

    public String register() {
        try {
            User test = facade.getUser(user.getId());
            if(test!=null){
                return "failed";
            }
            
            if(rest.registerStudent(user)){
            
            String password = user.getPassword();
            String hashed = UserManager.hash256(password);
            
            user.setPassword(hashed);
            facade.createUser(user);
            manager.login(user.getId(), password);
            }
            else{
                System.out.println("Refused reg");
                return "failed";
            }
            return "done";
        } catch (Exception e) {
            return "failed";
        }
    }

    public User getUser() {
        return user;
    } 
}
