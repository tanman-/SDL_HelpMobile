/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.managed.UserManager;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author terra
 */
@RequestScoped
@Named
public class LoginForm {
   
    
    private String username;
    private String password;
    
    @Inject
    private UserManager manager;
    
    public String login(){
        return manager.login(getUsername(), getPassword());
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
}
