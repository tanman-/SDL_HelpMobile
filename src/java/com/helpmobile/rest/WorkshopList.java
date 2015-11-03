/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author terra
 */
public class WorkshopList extends RestReply{
    
    @JsonProperty("Results")
    private List<Workshop> workshops;

    /**
     * @return the workshops
     */
    public List<Workshop> getWorkshops() {
        return workshops;
    }

    /**
     * @param workshops the workshops to set
     */
    public void setWorkshops(List<Workshop> workshops) {
        this.workshops = workshops;
    }
    
    
}
