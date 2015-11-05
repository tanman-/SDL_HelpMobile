/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.helpmobile.dba.User;
import static java.lang.Integer.parseInt;
import java.util.Date;

/**
 *
 * @author terra
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkshopBooking {

/*
        "BookingId": 12,
          "workshopID": 6,
          "studentID": "123456",
          "topic": "Oral Presentation - evening",
          "description": "The workshop (total of 10 hours) aims to equip you with the skills to prepare for and deliver an effective presentation.",
          "targetingGroup": "All UTS students",
          "campusID": 3,
          "starting": "2012-07-16T18:00:00",
          "ending": "2012-07-20T20:00:00",
          "maximum": 50,
          "cutoff": null,
          "canceled": null,
          "attended": null,
          "WorkShopSetID": 2,
          "type": "single",
          "reminder_num": 9999,
          "reminder_sent": 0,
          "WorkshopArchived": null,
          "BookingArchived": null
    */
    private User student;
    @JsonProperty("studentID")
    private String studentId;
    @JsonProperty("BookingId")
    private int bookingId;
    private Workshop workshop;
    @JsonProperty("workshopID")
    private int workshopId;
    private String canceled;
    private String attended;

    /**
     * @return the student
     */
    public User getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(User student) {
        this.student = student;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the bookingId
     */
    public int getBookingId() {
        return bookingId;
    }

    /**
     * @param bookingId the bookingId to set
     */
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    /**
     * @return the workshop
     */
    public Workshop getWorkshop() {
        return workshop;
    }

    /**
     * @param workshop the workshop to set
     */
    public void setWorkshop(Workshop workshop) {
        this.workshop = workshop;
    }

    /**
     * @return the workshopId
     */
    public int getWorkshopId() {
        return workshopId;
    }

    /**
     * @param workshopId the workshopId to set
     */
    public void setWorkshopId(int workshopId) {
        this.workshopId = workshopId;
    }

    /**
     * @return the canceled
     */
    public String getCanceled() {
        return canceled;
    }

    /**
     * @param canceled the canceled to set
     */
    public void setCanceled(String canceled) {
        this.canceled = canceled;
    }

    /**
     * @return the attended
     */
    public String getAttended() {
        return attended;
    }

    /**
     * @param attended the attended to set
     */
    public void setAttended(String attended) {
        this.attended = attended;
    }

    
}
