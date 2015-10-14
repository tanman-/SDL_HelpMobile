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

    private final User user = new User();

    /**
     * @return the firstName
     */
    public String register() {
        try {
            facade.createUser(user);
            return "done";
        } catch (Exception e) {
            return "failed";
        }
    }

    public User getUser() {
        return user;
    }
}
