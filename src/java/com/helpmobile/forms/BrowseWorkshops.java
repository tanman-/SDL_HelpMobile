/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.Workshop;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author terra
 */
@Named
@SessionScoped
public class BrowseWorkshops implements Serializable{
    
    @Inject
    RestAccess rest;
    
    private List<Workshop> workshops;
    
    public List<Workshop> getWorkshops() throws Exception{
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        
        String id = params.get("id");
        workshops = rest.getWorkshopList(new Integer(id)).getWorkshops();
        return workshops;
        
    }
    
    public Workshop getWorkshop() throws Exception{
        if(workshops==null){
            getWorkshops();
        }
        
        
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        
        int id = Integer.decode(params.get("id"));
       
        Iterator<Workshop> iterator = workshops.iterator();
        while(iterator.hasNext()){
            Workshop next = iterator.next();
            if(next.getId() == id){
                return next;
            }
        }
        
        return null;
        
    }
    
    @PostConstruct
    public void clean(){
        this.workshops=null;
    }
    
    
}
