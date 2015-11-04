/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

/**
 *
 * @author terra
 */
public class Workshop {
    
    /*
          "WorkshopId": 11,
          "topic": "Planning and researching for an assignment",
          "description": "“I have an assignment due soon, but I don’t know where and how to begin.",
          "targetingGroup": "all students",
          "campus": "CB02.05.32",
          "StartDate": "2012-08-07T17:00:00",
          "EndDate": "2012-08-07T18:00:00",
          "maximum": 45,
          "WorkShopSetID": 4,
          "cutoff": null,
          "type": "single",
          "reminder_num": 9999,
          "reminder_sent": 0,
          "DaysOfWeek": null,
          "BookingCount": 44,
          "archived": null
    */
    @JsonProperty("WorkshopId")
    private int id;
    
    private String topic;
    private String description;
    private String targetingGroup;
    private String campus;
    @JsonProperty("StartDate")
    private Date startDate;
    @JsonProperty("EndDate")
    private Date endDate;
    private int maximum;
    @JsonProperty("WorkShopSetID")
    private int setId;
    private String cutoff;
    private String type;
    @JsonProperty("reminder_num")
    private int reminderNumber;
    @JsonProperty("reminder_sent")
    private int reminderSent;
    @JsonProperty("DaysOfWeek")
    private String daysOfWeek;
    @JsonProperty("BookingCount")
    private int bookingCount;
    private Date archived;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the targetingGroup
     */
    public String getTargetingGroup() {
        return targetingGroup;
    }

    /**
     * @param targetingGroup the targetGroup to set
     */
    public void setTargetingGroup(String targetingGroup) {
        this.targetingGroup = targetingGroup;
    }

    /**
     * @return the campus
     */
    public String getCampus() {
        return campus;
    }

    /**
     * @param campus the campus to set
     */
    public void setCampus(String campus) {
        this.campus = campus;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the maximum
     */
    public int getMaximum() {
        return maximum;
    }

    /**
     * @param maximum the maximum to set
     */
    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    /**
     * @return the setId
     */
    public int getSetId() {
        return setId;
    }

    /**
     * @param setId the setId to set
     */
    public void setSetId(int setId) {
        this.setId = setId;
    }

    /**
     * @return the cutoff
     */
    public String getCutoff() {
        return cutoff;
    }

    /**
     * @param cutoff the cutoff to set
     */
    public void setCutoff(String cutoff) {
        this.cutoff = cutoff;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the reminderNumber
     */
    public int getReminderNumber() {
        return reminderNumber;
    }

    /**
     * @param reminderNumber the reminderNumber to set
     */
    public void setReminderNumber(int reminderNumber) {
        this.reminderNumber = reminderNumber;
    }

    /**
     * @return the reminderSent
     */
    public int getReminderSent() {
        return reminderSent;
    }

    /**
     * @param reminderSent the reminderSent to set
     */
    public void setReminderSent(int reminderSent) {
        this.reminderSent = reminderSent;
    }

    /**
     * @return the daysOfWeek
     */
    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * @param daysOfWeek the daysOfWeek to set
     */
    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    /**
     * @return the bookingCount
     */
    public int getBookingCount() {
        return bookingCount;
    }

    /**
     * @param bookingCount the bookingCount to set
     */
    public void setBookingCount(int bookingCount) {
        this.bookingCount = bookingCount;
    }

    /**
     * @return the archived
     */
    public Date getArchived() {
        return archived;
    }

    /**
     * @param archived the archived to set
     */
    public void setArchived(Date archived) {
        this.archived = archived;
    }
    
    
}
