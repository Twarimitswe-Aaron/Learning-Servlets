package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DisplayResultServlet extends HttpServlet {
    protected  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int value=(int)req.getAttribute("value");
        res.setContentType("text/html");

        RequestDispatcher rd=req.getRequestDispatcher("/header");
        rd.include(req,res);

        PrintWriter out = res.getWriter();
        out.println("Value: "+value);

        RequestDispatcher rd1=req.getRequestDispatcher("/footer");
        rd1.include(req,res);

    }
}
