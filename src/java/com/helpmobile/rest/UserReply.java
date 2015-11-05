/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.helpmobile.dba.User;
import java.util.List;

/**
 *
 * @author terra
 */
public class UserReply extends RestReply{
    
    @JsonProperty("Result")
    private User result;

    /**
     * @return the result
     */
    public User getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(User result) {
        this.result = result;
    }


    
}
