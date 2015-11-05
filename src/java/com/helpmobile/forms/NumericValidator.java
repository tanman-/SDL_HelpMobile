/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
/**
 *
 * @author Tanman
 */

@FacesValidator("com.helpmobile.NumericValidator")
public class NumericValidator implements Validator {
    
    private static final String NUMERIC_PATTERN = "^[0-9]+$";
    
    private Pattern pattern;
    private Matcher matcher;
    
    public NumericValidator() {
        pattern = Pattern.compile(NUMERIC_PATTERN);
    }

    @Override
    public void validate(FacesContext context, UIComponent component, 
            Object value) throws ValidatorException {
        matcher = pattern.matcher(value.toString());
        if(!matcher.matches()) {
            FacesMessage msg = new FacesMessage("Numeric validation failed.", 
                    "Must be a number");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
    
}
