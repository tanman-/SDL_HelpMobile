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
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String label;
    
    private Gender(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }    
}
