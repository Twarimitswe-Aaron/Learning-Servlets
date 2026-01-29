package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
        HttpSession  session=req.getSession();
        int num= (int)session.getAttribute("value");
        out.println("Session value: "+num);

        RequestDispatcher rd1=req.getRequestDispatcher("/footer");
        rd1.include(req,res);

    }
}
