/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author Tanman
 */
public enum Gender implements LabeledEnum {

    MALE("Male","M"),
    FEMALE("Female","F"),
    OTHER("Other","O");

    private final String label;
    private final String shortLabel;

    private Gender(String label,String shortLabel) {
        this.label = label;
        this.shortLabel = shortLabel;
    }
    
    @JsonValue
    public String getShort(){
        return shortLabel;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
    
    public static Gender getEnum(){
        return null;
    }

    @Override
    public String toString() {
        return label;
    }
}
