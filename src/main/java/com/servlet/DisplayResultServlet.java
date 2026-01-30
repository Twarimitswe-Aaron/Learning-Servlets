package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DisplayResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int value = (int) req.getAttribute("value");
        res.setContentType("text/html");

        req.getRequestDispatcher("/header").include(req, res);

        PrintWriter out = res.getWriter();
        out.println("<h2>Result: " + value + "</h2>");

        req.getRequestDispatcher("/footer").include(req, res);
    }
}
