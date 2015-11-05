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
import java.util.Iterator;
import java.util.LinkedList;
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
    private HelpCache cache;
    
    @Inject
    private UserManager userManager;
    
    public List<WorkshopBooking> getBookings() throws IOException{
        List<WorkshopBooking> globalBookins = cache.getBookings();
        LinkedList<WorkshopBooking> localList = new LinkedList<>();
        
        String userId = userManager.getUser().getId();
        Iterator<WorkshopBooking> iterator = globalBookins.iterator();
        while(iterator.hasNext()){
            WorkshopBooking checkedBook = iterator.next();
            if(checkedBook.getStudent().getId().equals(userId)){
                localList.add(checkedBook);
            }
        }
        return localList;
    }
    
}
