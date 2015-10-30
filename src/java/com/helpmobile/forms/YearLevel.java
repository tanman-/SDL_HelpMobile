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
public enum YearLevel {
    FIRSTYEAR("First year"),
    SECONDYEAR("Second year"),
    THIRDYEAR("Third year"),
    FOURTHYEAR("Fourth year"),
    FIFTHYEAR("Fifth year");
    
    private final String label;
    
    private YearLevel(String label) {
        this.label = label;
    }
    
    public String getLabel() {
        return label;
    }
}
