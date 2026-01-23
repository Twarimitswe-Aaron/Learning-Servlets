package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class  Subtract extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1= (int) request.getAttribute("num1");
        int num2=(int)request.getAttribute("num2");

        int diff=num1-num2;
        request.setAttribute("value",diff);
        RequestDispatcher rd=request.getRequestDispatcher("display");
        rd.forward(request,response);

    }
}
