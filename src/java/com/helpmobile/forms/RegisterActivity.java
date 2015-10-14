/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.forms;

import com.helpmobile.dba.AccessFacade;
import com.helpmobile.dba.Activity;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Tanman
 */
@Named
@RequestScoped
public class RegisterActivity {

    @Inject
    private AccessFacade facade;

    private final Activity activity = new Activity();

    public String register() {
        try {
            facade.createActivity(activity);
            return "done";
        } catch (Exception e) {
            return "failed";
        }
    }

    public Activity getActivity() {
        return activity;
    }

}
