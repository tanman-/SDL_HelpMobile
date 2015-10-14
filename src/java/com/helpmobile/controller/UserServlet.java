/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helpmobile.controller;

import com.helpmobile.dba.User;
import com.helpmobile.proxy.UserProxyLocal;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tanman
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    
    @EJB
    private UserProxyLocal userProxy;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phoneStr = request.getParameter("phone");
        int phone = phoneStr.equals("") ? -1 : Integer.parseInt(phoneStr);
        String dobStr = request.getParameter("dob");
        Date dob = null;
        String genderStr = request.getParameter("gender");
        int gender = genderStr.equals("") ? -1 : Integer.parseInt(genderStr);
        String firstLanguage = request.getParameter("firstLanguage");
        String countryOrigin = request.getParameter("countryOrigin");
        String yearLevel = request.getParameter("yearLevel");
        String degree = request.getParameter("degree");
        
        User user = new User(id, password, firstName, lastName, email,  phone,
                dob, gender, firstLanguage, countryOrigin, yearLevel, degree);
        
        if (action.equalsIgnoreCase("Add")) {
            userProxy.addUser(user);
        } else if (action.equalsIgnoreCase("Edit")) {
            userProxy.editUser(user);
        } else if (action.equalsIgnoreCase("Delete")) {
            userProxy.deleteUser(id);
        } else if (action.equalsIgnoreCase("Search")) {
            user = userProxy.getUser(id);
        }
        
        request.setAttribute("user", user);
        request.setAttribute("allUsers", userProxy.getAllUsers());
        // request.getRequestDispatcher("");
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
