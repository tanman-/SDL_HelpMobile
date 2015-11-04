package com.helpmobile.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import com.helpmobile.dba.enums.Country;
import com.helpmobile.dba.enums.DegreeLevel;
import com.helpmobile.dba.enums.Gender;
import com.helpmobile.dba.enums.Language;
import com.helpmobile.rest.RestAccess;
import com.helpmobile.rest.WorkshopBookingList;
import com.helpmobile.rest.WorkshopList;
import java.io.IOException;
import java.util.Date;
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
    public void testCreateWorkshopBooking() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        RestAccess restAccess = new RestAccess();
        boolean isBooked = restAccess.createWorkshopBooking(1409,"10795119");
        assert(isBooked);
    }
}
