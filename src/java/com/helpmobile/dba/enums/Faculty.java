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
public enum Faculty implements LabeledEnum{
    BUSINESS("Business"),
    DAB("DAB"),
    FASS("FASS"),
    FEIT("FEIT"),
    GSH("GSH"),
    HEALTH("Health"),
    LAW("Law"),
    SCIENCE("Science");
    
    private final String label;
    
    private Faculty(String label) {
        this.label = label;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
}
