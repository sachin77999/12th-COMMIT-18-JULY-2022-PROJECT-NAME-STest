/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author hp
 */
public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        System.out.println("this is get method ........");
        //setContentType is used for what type of data 
        //we are going to send in our response 
        response.setContentType("text/html");
        //dynamic response generate krna hae then we use this
        PrintWriter out=response.getWriter();
        out.print("<h1>this is get method of my servlet</h1>");
        out.println(new Date().toString());
        
    }
    @Override
    protected void doPost(HttpServletRequest $req,HttpServletResponse $res)throws ServletException,IOException{
        
        
    }
    
    
}
