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
public class WorkshopBookingList extends RestReply{
    
    @JsonProperty("Results")
    private List<WorkshopBooking> workshopBookings;

    public List<WorkshopBooking> getWorkshopBookings() {
        return workshopBookings;
    }

    public void setWorkshopBookings(List<WorkshopBooking> workshopBookings) {
        this.workshopBookings = workshopBookings;
    } 
}
