package com.helpmobile.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.helpmobile.rest.WorkshopBooking;
import com.helpmobile.rest.RestAccess;
import java.io.IOException;
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
public class CreateWorkshopBookingTest {

    public CreateWorkshopBookingTest() {
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
    
    @Test
    public void test1() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        RestAccess restAccess = new RestAccess();
        boolean isBooked = restAccess.createWorkshopBooking(new WorkshopBooking(1409,"10795119"));
        assert(isBooked);
    }
}
