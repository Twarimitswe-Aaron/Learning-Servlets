package com.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class PositiveNumbers implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // Only validate POST requests
        if ("POST".equalsIgnoreCase(req.getMethod())) {

            String num2Str = req.getParameter("num2");

            if (num2Str != null) {
                int num2 = Integer.parseInt(num2Str);

                if (num2 < 0) {
                    req.setAttribute("error", "Negative numbers not allowed");
                    req.getRequestDispatcher("/index.jsp")
                            .forward(req, res);
                    return;
                }
            }
        }

        chain.doFilter(request, response);
    }
}
