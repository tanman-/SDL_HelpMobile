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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
//importing this for enums only. is this a proper separation of concerns?
import com.helpmobile.forms.*;
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
    @Enumerated(EnumType.ORDINAL)
    private Faculty faculty;
    private String courseNumber;
    private String email;
    private int homePhone;
    private int mobilePhone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    
    // mutable by end user
    private String preferredName;
    private int preferredPhone;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    @Enumerated(EnumType.ORDINAL)
    private DegreeLevel degreeLevel;
    @Enumerated(EnumType.ORDINAL)
    private YearLevel yearLevel;
    @Enumerated(EnumType.ORDINAL)
    private Residency residency;
    @Enumerated(EnumType.ORDINAL)
    private Language firstLanguage;
    @Enumerated(EnumType.ORDINAL)
    private Country countryOrigin;
    private String educationalBackground;
    
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

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public int getPreferredPhone() {
        return preferredPhone;
    }

    public void setPreferredPhone(int preferredPhone) {
        this.preferredPhone = preferredPhone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public DegreeLevel getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(DegreeLevel degreeLevel) {
        this.degreeLevel = degreeLevel;
    }

    public YearLevel getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(YearLevel yearLevel) {
        this.yearLevel = yearLevel;
    }

    public Residency getResidency() {
        return residency;
    }

    public void setResidency(Residency residency) {
        this.residency = residency;
    }

    public Language getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(Language firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public Country getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(Country countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
    
    public String getEducationalBackground() {
        return educationalBackground;
    }

    public void setEducationalBackground(String educationalBackground) {
        this.educationalBackground = educationalBackground;
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<WaitingList> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<WaitingList> waitingList) {
        this.waitingList = waitingList;
    }
}
