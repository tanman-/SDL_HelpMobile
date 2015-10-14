/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.proxy;

import com.helpmobile.dba.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tanman
 */
@Stateless
public class UserProxy implements UserProxyLocal {
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void editUser(User user) {
        em.merge(user);
    }

    @Override
    public void deleteUser(String userId) {
        em.remove(getUser(userId));
    }

    @Override
    public User getUser(String userId) {
        return em.find(User.class, userId);
    }

    @Override
    public List<User> getAllUsers() {
        return em.createNamedQuery("User.getAll").getResultList();
    }


}
