/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba;

import com.helpmobile.forms.ActivityArea;
import com.helpmobile.forms.ActivityTarget;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.helpmobile.forms.ActivityType;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;

/**
 *
 * @author Tanman
 */
// Note there are more fields in the REST specification
@Entity
@Table
public class Activity implements Serializable {
    @Id
    private Long id;
    private boolean available;
    private Timestamp activityDate;
    @Enumerated(EnumType.ORDINAL)
    private ActivityType type;
    private int duration;
    private String location;
    private int capacity;
    private boolean bookable;
    private String lecturerName;
    @Enumerated(EnumType.ORDINAL)
    private ActivityArea area;
    private String topic;
    @Lob
    @Column
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private ActivityTarget target;
    @OneToOne
    @JoinColumn(name = "waitingListId")
    private WaitingList waitingList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Timestamp getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Timestamp activityDate) {
        this.activityDate = activityDate;
    }

    public ActivityType getType() {
        return type;
    }

    public void setType(ActivityType type) {
        this.type = type;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isBookable() {
        return bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public ActivityArea getArea() {
        return area;
    }

    public void setArea(ActivityArea area) {
        this.area = area;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ActivityTarget getTarget() {
        return target;
    }

    public void setTarget(ActivityTarget target) {
        this.target = target;
    }

    public WaitingList getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(WaitingList waitingList) {
        this.waitingList = waitingList;
    }
    
    
    
}