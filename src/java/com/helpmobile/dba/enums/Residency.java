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
public enum Residency implements LabeledEnum{
    LOCAL("Local"),
    INTERNATIONAL("International");
    
    private final String label;
    
    private Residency(String label) {
        this.label = label;
    }
    
    @Override
    public String getLabel() {
        return label;
    }
}
