/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author terra
 */
@Entity
@Table(name="applicant") //applicant?
@NamedQueries(@NamedQuery(name="User.getAll", query="SELECT e FROM User e"))
public class User implements Serializable {
    
    @Id
    @Column(length=16)
    private String id; 
    private String password; 
    private String firstName;   
    private String lastName;
    
    private String email;
    private int phone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    private int gender;
    private String firstLanguage;
    private String countryOrigin;
    private String yearLevel;
    private String degree;
    
    @OneToMany(mappedBy = "user")
    private List<Reminder> reminders;
    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;
    @OneToMany(mappedBy = "user")
    private List<WaitingList> waitingList;

    public User(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }    

    /**
     * @return the reminders
     */
    public List<Reminder> getReminders() {
        return reminders;
    }

    /**
     * @param reminders the reminders to set
     */
    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    /**
     * @return the bookings
     */
    public List<Booking> getBookings() {
        return bookings;
    }

    /**
     * @param bookings the bookings to set
     */
    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     * @return the waitingList
     */
    public List<WaitingList> getWaitingList() {
        return waitingList;
    }

    /**
     * @param waitingList the waitingList to set
     */
    public void setWaitingList(List<WaitingList> waitingList) {
        this.waitingList = waitingList;
    }
}
