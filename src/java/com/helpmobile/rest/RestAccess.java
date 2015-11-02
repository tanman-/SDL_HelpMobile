/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.ejb.Stateless;

/**
 *
 * @author terra
 */
@Stateless
public class RestAccess {

    private final String METHOD_POST = "POST";
    private final String METHOD_GET = "GET";
    private final String KEY = "sdpmobile_test";
    private final String ADDRESS = "http://hitgub.cloudapp.net/api/";

    public String doGetRequest(String request, String data) throws MalformedURLException, IOException {
        URL path = new URL(ADDRESS + request);
        HttpURLConnection conn = (HttpURLConnection) path.openConnection();
        conn.setRequestProperty("Content-Length ", Integer.toString(data.length()));
        conn.setRequestProperty("AppKey", KEY);
        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        return (String) response.toString();
    }

}
