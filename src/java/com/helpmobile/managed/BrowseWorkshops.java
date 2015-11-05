/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.managed;

import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.Workshop;
import com.helpmobile.rest.WorkshopSet;
import java.io.Serializable;
import java.util.ArrayList;
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
    
    @Inject
    HelpCache cache;
    
    private List<Workshop> workshops;
    
    public List<Workshop> getWorkshops() throws Exception{
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        
        int id = Integer.decode(params.get("id"));
        
        return cache.getWorkshopSets().get(id).getWorkshops();
    }
    
    public List<WorkshopSet> getWorkshopSets(){
        return new ArrayList(cache.getWorkshopSets().values());
    }
    
    public Workshop getWorkshop() throws Exception{
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        
        int id = Integer.decode(params.get("id"));
       
        return cache.getWorkshops().get(id);
        
    }
    
    
}
