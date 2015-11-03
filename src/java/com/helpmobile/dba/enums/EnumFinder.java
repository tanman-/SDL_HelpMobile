/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.dba.enums;

/**
 *
 * @author terra
 */
public class EnumFinder {
    
    public static String jsonValue(LabeledEnum labeledEnum){
        return labeledEnum.getLabel();
    }
    
    public static LabeledEnum getEnum(String label,LabeledEnum[] base) throws Exception{
        for(LabeledEnum check : base){
            if(check.getShort().equalsIgnoreCase(label)){
                return check;
            }
        }
        throw new Exception("Invalid label");
    }

}
