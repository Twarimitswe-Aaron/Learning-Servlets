package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Divide extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        if(num2==0){
            response.getWriter().println("Invalid denominator not equal to zero");
        }

        int divide = num1 / num2;
        request.setAttribute("value", divide);
        RequestDispatcher rd = request.getRequestDispatcher("display");
        rd.forward(request, response);
    }
}
