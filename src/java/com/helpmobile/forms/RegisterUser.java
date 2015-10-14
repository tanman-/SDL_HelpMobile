/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.dba.AccessFacade;
import com.helpmobile.dba.User;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author terra
 */

@Named
@RequestScoped
public class RegisterUser {
    
    @Inject
    private AccessFacade facade;
    
    private User user = new User();
    private Date dob; // is this usable?

    /**
     * @return the firstName
     */
    
    public void register(){
        facade.createUser(getUser());
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
}
