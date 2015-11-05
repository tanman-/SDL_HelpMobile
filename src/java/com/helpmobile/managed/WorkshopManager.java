/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.managed;

import com.helpmobile.rest.RestAccess;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
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
public class WorkshopManager implements Serializable {

    @Inject
    private RestAccess rest;
    @Inject
    private UserManager userManager;

    public String bookWorkshop() throws IOException {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();

        String id = params.get("id");
        String studentId = userManager.getUser().getId();
        System.out.println(id);
        boolean result = rest.bookWorkshop(id, studentId);

        if (result) {
            return "booked";
        }
        return "fail";
    }

}
