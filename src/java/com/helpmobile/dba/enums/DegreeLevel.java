/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author Tanman
 */
public enum DegreeLevel implements LabeledEnum {

    UNDERGRADUATE("Undergraduate","UG"),
    POSTGRADUATE("Postgraduate","PG");

    private final String label;
    private final String shortLabel;
    
    private DegreeLevel(String label,String shortLabel) {
        this.label = label;
        this.shortLabel=shortLabel;
    }


    @Override
    public String getLabel() {
        return label;
    }

    @JsonCreator
    public static DegreeLevel getEnum(String label) throws Exception{
        return (DegreeLevel) EnumFinder.getEnum(label, DegreeLevel.values());
    }
    
    @JsonValue
    @Override
    public String getShort(){
        return shortLabel;
    }
    
    @Override
    public String toString() {
        return label;
    }
}
