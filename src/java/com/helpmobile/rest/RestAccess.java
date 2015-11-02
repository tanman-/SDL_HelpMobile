/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author terra
 */
@Named
@Stateless
public class RestAccess {

    private final String METHOD_POST = "POST";
    private final String METHOD_GET = "GET";
    private final String KEY = "sdpmobile_test";
    private final String ADDRESS = "http://hitgub.cloudapp.net/api/";

    public String doJsonRequest(String request, String data, String method) throws MalformedURLException, IOException {
        URL path = new URL(ADDRESS + request);
        HttpURLConnection conn = (HttpURLConnection) path.openConnection();
        conn.setRequestMethod(method);
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Content-Length ", Integer.toString(data.length()));
        conn.setRequestProperty("AppKey", KEY);
        conn.setUseCaches(false);
        conn.setDoInput(true);
        if (data.length() != 0) {
            conn.setDoOutput(true);
            OutputStream output = conn.getOutputStream();
            output.write(data.getBytes("UTF-8"));
            output.flush();
        }
        BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        conn.disconnect();
        //print result
        return (String) response.toString();
    }

    public String doPostRequest(String request, Map<String, Object> data, String method) throws MalformedURLException, IOException {





        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : data.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }

                URL path = new URL(ADDRESS + request+postData.toString());
        HttpURLConnection conn = (HttpURLConnection) path.openConnection();
        conn.setRequestMethod(method);
        conn.setRequestProperty("Content-Type", "application/json");
        
 //      byte[] result = 
//        conn.setRequestProperty("Content-Length", Integer.toString(result.length));
        conn.setRequestProperty("AppKey", KEY);
        conn.setUseCaches(false);
        conn.setDoInput(true);
   //     conn.setDoOutput(true);
  //      OutputStream output = conn.getOutputStream();
   //     output.write(result);
    //    output.flush();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        conn.disconnect();
        //print result
        return response.toString();
    }

    public User getStudent() {
        return null;
    }

    public boolean registerStudent(User user) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        String response = doJsonRequest("student/register", json, METHOD_POST);
        RegisterReply reply = mapper.readValue(response, RegisterReply.class);
        return reply.isSuccess();
    }

    public WorkshopSetList getWorkshops(boolean active) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String data = doJsonRequest("workshop/workshopSets/", "", METHOD_GET);
        WorkshopSetList list = mapper.readValue(data, WorkshopSetList.class);

        return list;
    }

    public WorkshopList getWorkshop(int id) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new LinkedHashMap<>();
 //       map.put("active", true);
        map.put("workshopSetId", id);
        String data = doPostRequest("workshop/search?", map, METHOD_GET);
        
        System.out.println(data);
        return mapper.readValue(data, WorkshopList.class);

    }

}
