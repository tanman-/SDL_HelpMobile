/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.rest.RestAccess;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author terra
 */
public class Booking {
    
    public Booking() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void book() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        RestAccess restAccess = new RestAccess();
        String back = restAccess.doPostRequest("workshop/booking/create", null, "POST");
    }
}
