package com.hyq.servlet;

import com.hyq.vo.Ware;
import com.hyq.waredaofactory.WareDaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 2017/5/13.
 */
@WebServlet(name = "InsertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ware ware = new Ware();
        ware.setWarename(request.getParameter("warename"));
        ware.setWareprice(request.getParameter("wareprice"));
        WareDaoFactory.getInstanceWare().insertWare(ware);
        request.getRequestDispatcher("select.jsp").forward(request,response);
    }
}
