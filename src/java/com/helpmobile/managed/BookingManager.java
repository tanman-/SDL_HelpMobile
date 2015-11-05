/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.managed;

import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.WorkshopBooking;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author terra
 */
@Named
@RequestScoped
public class BookingManager implements Serializable{
    
    @Inject
    private RestAccess rest;
    
    @Inject
    private UserManager userManager;
    
    public List<WorkshopBooking> getBookings() throws IOException{
        System.out.println(userManager.getUser().getId());
        //return rest.searchBooking(userManager.getUser().getId());
        return null;
    }
    
}
