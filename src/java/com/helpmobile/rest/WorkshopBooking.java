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

    int workShopId;
    String studentId;
    int userId;

    public WorkshopBooking(int workShopId, String studentId) {
        this.workShopId = workShopId;
        this.studentId = studentId;
        this.userId = parseInt(studentId);
    }
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWorkShopId() {
        return workShopId;
    }

    public void setWorkShopId(int workShopId) {
        this.workShopId = workShopId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
}
