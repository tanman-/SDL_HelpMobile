/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

/**
 *
 * @author Tanman
 */
public enum DegreeLevel {
    UNDERGRADUATE("Undergraduate"),
    POSTGRADUATE("Postgraduate");
    
    private final String label;
    
    private DegreeLevel(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
