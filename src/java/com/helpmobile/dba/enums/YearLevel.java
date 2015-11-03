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
public enum YearLevel implements LabeledEnum {

    FIRSTYEAR("First year", "1st"),
    SECONDYEAR("Second year", "2nd"),
    THIRDYEAR("Third year", "3rd"),
    FOURTHYEAR("Fourth year", "4th"),
    FIFTHYEAR("Fifth year", "5th");

    private final String label;
    private final String shortLabel;

    private YearLevel(String label, String shortLabel) {
        this.label = label;
        this.shortLabel = shortLabel;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    @JsonValue
    @Override
    public String getShort() {
        return shortLabel;
    }
}
