package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SumServer extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Parse parameters
        int num1 = (int)req.getAttribute("num1");
        int num2 = (int)req.getAttribute("num2");

        int sum = num1 + num2;

        ServletConfig conf=getServletConfig();
        String servletDesc=conf.getInitParameter("ServletDescription");
        ServletContext cnxt=getServletContext();
        String appName=cnxt.getInitParameter("appName");
        PrintWriter out=resp.getWriter();

        req.setAttribute("value",sum);
        HttpSession session=req.getSession();
        session.setAttribute("value",sum);



        RequestDispatcher rd=req.getRequestDispatcher("display");
        rd.forward(req,resp);

    }
}
