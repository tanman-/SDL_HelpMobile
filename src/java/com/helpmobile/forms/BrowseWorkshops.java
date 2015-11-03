/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.Workshop;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author terra
 */
@Named
@RequestScoped
public class BrowseWorkshops {
    
    @Inject
    RestAccess rest;
    
    public List<Workshop> getWorkshops() throws Exception{
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params = fc.getExternalContext().getRequestParameterMap();
        
        String id = params.get("id");
        return rest.getWorkshop(new Integer(id)).getWorkshops();
        
    }
    
    
}
