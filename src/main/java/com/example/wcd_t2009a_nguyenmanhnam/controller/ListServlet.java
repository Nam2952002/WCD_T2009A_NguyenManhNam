package com.example.wcd_t2009a_nguyenmanhnam.controller;

import com.example.wcd_t2009a_nguyenmanhnam.dao.PhoneDAO;
import com.example.wcd_t2009a_nguyenmanhnam.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListServlet", value = "/list")
public class ListServlet extends HttpServlet {
    PhoneDAO dao;

    @Override
    public void init() throws ServletException {
        super.init();
        dao = new PhoneDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Phone> listPhone  = getAllPhone();
        request.setAttribute("phone", listPhone);
        request.getRequestDispatcher("listphone.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private List<Phone> getAllPhone(){
        List<Phone> list = dao.getList();
        for (Phone phone : list){
            System.out.println(phone.getName());
        }
        return dao.getList();
    }
}
