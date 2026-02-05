package com.servlet.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import com.servlet.dao.HouseDAO;
import com.servlet.model.House;


@WebServlet("/house")
public class HouseServlet extends HttpServlet {


    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {


        String address = req.getParameter("address");
        int rooms = Integer.parseInt(req.getParameter("rooms"));
        System.out.println("Saving house is hit");


        House house = new House();
        house.setAddress(address);
        house.setRooms(rooms);
        System.out.println("Saving house is hit with"+house);



        new HouseDAO().save(house);


        res.sendRedirect("index.jsp");
    }
}
