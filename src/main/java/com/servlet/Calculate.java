package com.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Calculate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("operation");
        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);

        RequestDispatcher rd=null;


        switch (operation) {
            case "add":
                rd = request.getRequestDispatcher("add");
                rd.forward(request, response);
                break;
                case "subtract":
                rd = request.getRequestDispatcher("sub");
                rd.forward(request, response);
                break;
                case "multiply":
                    rd = request.getRequestDispatcher("mult");
                    rd.forward(request, response);
                    break;
                    case "divide":
                        rd = request.getRequestDispatcher("divide");
                        rd.forward(request, response);
                        break;
            default:
                response.getWriter().println("error");
                break;


        }
    }
}
