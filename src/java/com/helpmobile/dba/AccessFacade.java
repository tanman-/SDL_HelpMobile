/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author terra
 */
@Stateless
public class AccessFacade {
    
    @PersistenceContext
    EntityManager entityManager;
    
    public void createUser(User newUser) {
        entityManager.persist(newUser);
    }
    
    public void createActivity(Activity newActivity) {
        entityManager.persist(newActivity);
    }
    
    public User getUser(String id){
        return entityManager.find(User.class,id);
    }
    
    public List<User> getAllUsers(){
        entityManager.getTransaction().begin();
        List<User> result = entityManager.createQuery("SELECT p FROM applicant p").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }
}
