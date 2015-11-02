/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba.enums;

/**
 *
 * @author Tanman
 */
public enum Gender implements LabeledEnum{
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String label;
    
    private Gender(String label) {
        this.label = label;
    }
    
    @Override
    public String getLabel() {
        return label;
    }    
}
