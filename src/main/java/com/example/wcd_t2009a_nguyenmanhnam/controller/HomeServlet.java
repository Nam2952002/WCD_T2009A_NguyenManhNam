package com.example.wcd_t2009a_nguyenmanhnam.controller;

import com.example.wcd_t2009a_nguyenmanhnam.dao.PhoneDAO;
import com.example.wcd_t2009a_nguyenmanhnam.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {

    PhoneDAO dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new PhoneDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Phone> list = getAllProduct();
        request.setAttribute("phone", list);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String price = request.getParameter("price");
        String description = request.getParameter("description");
        Phone phone1 = new Phone(name, brand, Integer.valueOf(price), description);
        dao.insertPhone(phone1);
        response.sendRedirect("list");
    }

    private List<Phone> getAllProduct(){
        List<Phone> list = dao.getList();
        for (Phone p : list){
            System.out.println(p.getName());
        }
        return dao.getList();
    }
}
