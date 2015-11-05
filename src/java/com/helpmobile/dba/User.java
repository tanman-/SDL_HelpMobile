/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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

import com.helpmobile.dba.enums.Faculty;
import com.helpmobile.dba.enums.Gender;
import com.helpmobile.dba.enums.DegreeLevel;
import com.helpmobile.dba.enums.YearLevel;
import com.helpmobile.dba.enums.Residency;
import com.helpmobile.dba.enums.Language;
import com.helpmobile.dba.enums.Country;
import com.helpmobile.rest.WorkshopBooking;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Transient;
/**
 *
 * @author terra
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ManagedBean(name="user")
@SessionScoped
@Entity
@Table(name = "applicant")
@NamedQueries(@NamedQuery(name = "User.getAll", query = "SELECT e FROM User e"))
public class User implements Serializable {

    
    @Transient
    @JsonProperty("userId")
    private String userId;
    
    @Id
    @Column(length = 16)
    @JsonProperty("studentID")
    private String id;
    private String password;
    private String name;
    private String surname;
    @Transient
    private String degree;
    @Transient
    private String status;
    
    @Enumerated(EnumType.ORDINAL)
    private Faculty faculty;
    
    
    private String courseNumber;
    private String email;
    private String homePhone;
    private String mobilePhone;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
    
    // mutable by end user
    private String preferredName;
    private String preferredPhone;
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
    @Enumerated(EnumType.ORDINAL)
    private DegreeLevel degreeLevel;
    @JsonIgnore
    @Enumerated(EnumType.ORDINAL)
    private YearLevel yearLevel;
    @Enumerated(EnumType.ORDINAL)
    private Residency residency;
    //@JsonProperty("first_language")
    @Enumerated(EnumType.ORDINAL)
    private Language firstLanguage;
    //@JsonProperty("country_origin")
    @Enumerated(EnumType.ORDINAL)
    private Country countryOrigin;
    @JsonProperty("background")
    private String educationalBackground;
    
    @Transient
    @JsonProperty("HSC")
    private boolean hsc;
    
    @Transient
    @JsonProperty("HSC_mark")
    private int hscMark;
    
    @Transient
    @JsonProperty("IELTS")
    private boolean ielts;
    
    @Transient
    @JsonProperty("IELTS_mark")
    private int ieltsMark;
    
    
    @JsonIgnore
    @Transient
    private List<WorkshopBooking> bookings;
    
    @Transient
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
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

    public String getPreferredPhone() {
        return preferredPhone;
    }

    public void setPreferredPhone(String preferredPhone) {
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

    public List<WaitingList> getWaitingList() {
        return waitingList;
    }

    public void setWaitingList(List<WaitingList> waitingList) {
        this.waitingList = waitingList;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the hscMark
     */
    public int getHscMark() {
        return hscMark;
    }

    /**
     * @param hscMark the hscMark to set
     */
    public void setHscMark(int hscMark) {
        this.hscMark = hscMark;
    }

    /**
     * @return the ieltsMark
     */
    public int getIeltsMark() {
        return ieltsMark;
    }

    /**
     * @param ieltsMark the ieltsMark to set
     */
    public void setIeltsMark(int ieltsMark) {
        this.ieltsMark = ieltsMark;
    }

    /**
     * @return the hsc
     */
    public boolean isHsc() {
        return hsc;
    }

    /**
     * @param hsc the hsc to set
     */
    public void setHsc(boolean hsc) {
        this.hsc = hsc;
    }

    /**
     * @return the ielts
     */
    public boolean isIelts() {
        return ielts;
    }

    /**
     * @param ielts the ielts to set
     */
    public void setIelts(boolean ielts) {
        this.ielts = ielts;
    }

    /**
     * @return the bookings
     */
    public List<WorkshopBooking> getBookings() {
        return bookings;
    }

    /**
     * @param bookings the bookings to set
     */
    public void setBookings(List<WorkshopBooking> bookings) {
        this.bookings = bookings;
    }
}
