/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.helpmobile.dba.User;
import com.helpmobile.rest.mapper.RestObjectMapper;
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

    public final String METHOD_POST = "POST";
    public final String METHOD_GET = "GET";
    private final String KEY = "sdpmobile_test";
    private final String USER_ID = "123456";
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
        URL path;
        if (method.equalsIgnoreCase(METHOD_GET)) {
            path = new URL(ADDRESS + request + "?" + postData.toString());
        } else {
            path = new URL(ADDRESS + request);
        }
        HttpURLConnection conn = (HttpURLConnection) path.openConnection();
        conn.setRequestMethod(method);
        conn.setRequestProperty("Content-Type", "application/json");

        conn.setRequestProperty("AppKey", KEY);
        conn.setUseCaches(false);
        conn.setDoInput(true);
        if (method.equalsIgnoreCase(METHOD_POST)) {
            byte[] result = postData.toString().getBytes("UTF-8");
            conn.setRequestProperty("Content-Length", Integer.toString(result.length));
            conn.setDoOutput(true);
            OutputStream output = conn.getOutputStream();
            output.write(result);
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
        return response.toString();
    }
    
       public String doGetRequest(String request, Map<String, Object> data, String method) throws MalformedURLException, IOException {

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String, Object> param : data.entrySet()) {
            if (postData.length() != 0) {
                postData.append('&');
            }
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        URL path;
        path = new URL(ADDRESS + request + "?" + postData.toString());

        HttpURLConnection conn = (HttpURLConnection) path.openConnection();
        conn.setRequestMethod(method);
        conn.setRequestProperty("Content-Type", "application/json");

        conn.setRequestProperty("AppKey", KEY);
        conn.setUseCaches(false);
        conn.setDoInput(true);

        conn.setRequestProperty("Content-Length", "0");
        conn.setDoOutput(true);
        OutputStream output = conn.getOutputStream();
        output.flush();
        
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

    public boolean registerStudent(User user) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(user);
        String response = doJsonRequest("student/register", json, METHOD_POST);
        RegisterReply reply = mapper.readValue(response, RegisterReply.class);
        System.out.println(json);
        System.out.println(response);
        return reply.isSuccess();
    }
    
    public User retriveId(String student) throws IOException{
        ObjectMapper mapper = new RestObjectMapper();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("studentId", student);
        String data = doPostRequest("student/"+student, map, METHOD_GET);
        return mapper.readValue(data, UserReply.class).getResult();
    }

    public WorkshopSetList getWorkshops(boolean active) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("active", true);
        String data = doPostRequest("workshop/workshopSets/", map, METHOD_GET);
        WorkshopSetList list = mapper.readValue(data, WorkshopSetList.class);

        return list;
    }

    public WorkshopList getWorkshopList(int id) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("active", true);
        map.put("workshopSetId", id);
        String data = doPostRequest("workshop/search/", map, METHOD_GET);

        System.out.println(data);
        return mapper.readValue(data, WorkshopList.class);
    }

    public boolean bookWorkshop(String workId,String studentId) throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = new LinkedHashMap<>();
        map.put("workshopId", workId);
        map.put("studentId", studentId);
        map.put("userId",studentId);
        String result = doGetRequest("workshop/booking/create",map,METHOD_POST);
        System.out.println(result);
        RestReply reply = mapper.readValue(result, RestReply.class);
        return reply.isAvailable();
    }
    
}
