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
public class WorkshopSetList extends RestReply{
    
    @JsonProperty("Results")
    private List<WorkshopSet> workshopSets;
    /**
     * @return the workshops
     */
    public List<WorkshopSet> getWorkshopSets() {
        return workshopSets;
    }

    /**
     * @param workshops the workshops to set
     */
    public void setWorkshopSets(List<WorkshopSet> workshops) {
        this.workshopSets = workshops;
    }


    
}
