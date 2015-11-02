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
public enum ActivityTarget {
    ALL("All students"),
    NONENGLISH("Non-English speaking background students");
    
    private final String label;
    
    private ActivityTarget(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
