package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;


public class SumServer extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int num1 = (int) request.getAttribute("num1");
        int num2 = (int) request.getAttribute("num2");

        int result = num1 + num2;

        request.setAttribute("value", result);
        request.getRequestDispatcher("display").forward(request, response);
    }
}
