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
@WebServlet(name = "DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ware ware = new Ware();
        String wareid = request.getParameter("wareid");
        ware.setWareid(wareid);
        WareDaoFactory.getInstanceWare().deleteWare(ware);
        request.getRequestDispatcher("select.jsp").forward(request,response);
    }
}
