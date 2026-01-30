package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class Calculate extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);

        RequestDispatcher rd;

        switch (operation) {
            case "add":
                rd = request.getRequestDispatcher("add");
                break;
            case "subtract":
                rd = request.getRequestDispatcher("subtract");
                break;
            case "multiply":
                rd = request.getRequestDispatcher("multiply");
                break;
            case "divide":
                rd = request.getRequestDispatcher("divide");
                break;
            default:
                response.getWriter().println("Invalid operation");
                return;
        }

        rd.forward(request, response);
    }
}
