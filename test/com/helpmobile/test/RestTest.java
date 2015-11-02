package com.helpmobile.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import com.helpmobile.dba.enums.Country;
import com.helpmobile.dba.enums.DegreeLevel;
import com.helpmobile.dba.enums.Gender;
import com.helpmobile.dba.enums.Language;
import com.helpmobile.rest.RestAccess;
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
public class RestTest {
    
    public RestTest() {
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
    public void connect() throws IOException{
        RestAccess restAccess = new RestAccess();
        String response = restAccess.doJsonRequest("misc/campus", "","GET");
        System.out.println(response);
    }
    
    @Test
    public void testRegister() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        
        User testUser = new User();
        testUser.setName("Bob");
        testUser.setId("12345");
        testUser.setPassword("test");
        testUser.setCountryOrigin(Country.ARUBA);
        testUser.setDegreeLevel(DegreeLevel.POSTGRADUATE);
        testUser.setGender(Gender.MALE);
        testUser.setFirstLanguage(Language.ALBANIAN);
        testUser.setDob(new Date());
        String json = mapper.writeValueAsString(testUser);
        RestAccess restAccess = new RestAccess();
        System.out.println(json);
        String response = restAccess.doJsonRequest("student/register", json, "POST");
        System.out.println(response);
        
    }
    
    @Test
    public void testWorkshop() throws Exception{
        RestAccess restAccess = new RestAccess();
        String data = restAccess.doJsonRequest("workshop/workshopSets/", "", "GET");
        System.out.println(data);
    }
    
    @Test
    public void getWorkshop() throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        RestAccess restAccess = new RestAccess();
        WorkshopList data = restAccess.getWorkshop(4);
        String json = mapper.writeValueAsString(data);
        System.out.println(json);
    }
}
