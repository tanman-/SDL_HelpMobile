/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.proxy;

import com.helpmobile.dba.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tanman
 */
@Local
public interface UserProxyLocal {

    void addUser(User user);

    void editUser(User user);

    void deleteUser(String userId);

    User getUser(String userId);

    List<User> getAllUsers();
    
}
