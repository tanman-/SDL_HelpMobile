/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import com.helpmobile.dba.enums.Country;
import com.helpmobile.dba.enums.DegreeLevel;
import com.helpmobile.dba.enums.Gender;
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
public class DoubleJsonTest {
    
    public DoubleJsonTest() {
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
    public void test() throws JsonProcessingException, IOException, Exception{
                ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
        
        User testUser = new User();
        testUser.setName("Bob");
        testUser.setId("da");
        testUser.setCountryOrigin(Country.ARUBA);
        testUser.setDegreeLevel(DegreeLevel.POSTGRADUATE);
        testUser.setGender(Gender.MALE);
        String json = mapper.writeValueAsString(testUser);
        System.out.println(json);
        testUser = mapper.readValue(json, User.class);
        String newJson = mapper.writeValueAsString(testUser);
        System.out.println(newJson);
        if(!json.equals(newJson)){
            
            
            throw new Exception("Missmatch!");
        }
        
        
    }
    
}
