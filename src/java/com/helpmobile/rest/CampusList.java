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
public class CampusList extends RestReply{
    
    @JsonProperty("Results")
    private List<Campus> campuses;

    /**
     * @return the campuses
     */
    public List<Campus> getCampuses() {
        return campuses;
    }

    /**
     * @param campuses the campuses to set
     */
    public void setCampuses(List<Campus> campuses) {
        this.campuses = campuses;
    }
    
}
