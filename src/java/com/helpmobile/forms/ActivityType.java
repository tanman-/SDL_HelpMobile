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
public enum ActivityType {
    SINGLE("Single"),
    WORKSHOP("Workshop"),
    PROGRAMME("Programme");

    private final String label;
    
    private ActivityType(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }    
}
