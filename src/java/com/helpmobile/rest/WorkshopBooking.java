/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import static java.lang.Integer.parseInt;
import java.util.Date;

/**
 *
 * @author terra
 */
public class WorkshopBooking {

    int workshopId;
    String studentId;
    int userId;

    public WorkshopBooking(int workshopId, String studentId) {
        this.workshopId = workshopId;
        this.studentId = studentId;
        this.userId = parseInt(studentId);
    }
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWorkshopId() {
        return workshopId;
    }

    public void setWorkshopId(int workshopId) {
        this.workshopId = workshopId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
}
