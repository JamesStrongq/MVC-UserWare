package com.hyq.servlet;

import com.hyq.userdaofactory.UserDaoFactory;
import com.hyq.vo.User;
import com.hyq.waredaofactory.WareDaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;

/**
 * Created by admin on 2017/5/13.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String username = request.getParameter("username");
       String userpass = request.getParameter("userpass");
        User user = new User();
        user.setUsername(username);
        user.setUserpass(userpass);
        UserDaoFactory.getInstanceUser().insertUser(user);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
