/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Tanman
 */
@ManagedBean
@ApplicationScoped
public class Data {
    
    public Faculty[] getFacultys() {
        return Faculty.values();
    }
    
    public DegreeLevel[] getDegreeLevels() {
        return DegreeLevel.values();
    }
    
    public YearLevel[] getYearLevels() {
        return YearLevel.values();
    }
    
    public Residency[] getResidencys() {
        return Residency.values();
    }
    
    public Gender[] getGenders() {
        return Gender.values();
    }
    
    public Country[] getCountrys() {
        return Country.values();
    }
    
    public Language[] getLanguages() {
        return Language.values();
    }
    
    public ActivityType[] getActivitys() {
        return ActivityType.values();
    }
}
