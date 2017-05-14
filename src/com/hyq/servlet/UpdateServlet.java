package com.hyq.servlet;

import com.hyq.vo.Ware;
import com.hyq.waredao.WareDao;
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
@WebServlet(name = "UpdateServlet")
public class UpdateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ware ware = new Ware();
        ware.setWarename(request.getParameter("warename"));
        ware.setWareprice(request.getParameter("wareprice"));
        ware.setWareid(request.getParameter("wareid"));

        WareDaoFactory.getInstanceWare().updateWare(ware);
//        response.setHeader("refresh","3:URL=select.jsp");
        request.getRequestDispatcher("select.jsp").forward(request,response);

    }
}
