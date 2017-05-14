package com.hyq.servlet;

import com.hyq.userdaofactory.UserDaoFactory;
import com.hyq.vo.User;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/5/13.
 */
public class LoginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
            response.setContentType("text/html;charset=utf-8");
            String username = request.getParameter("username");
            String userpass = request.getParameter("userpass");
            List<String> list = new ArrayList<String>();
            if(username == null || "".equals(username)){
                list.add("用户名不能为空，请重新输入");
            }else if(userpass == null || "".equals(userpass)){
                list.add("密码不能为空，请重新输入");
            }
            if(list.size() == 0){
                User user = new User();
                user.setUsername(username);
                user.setUserpass(userpass);
                ResultSet rs = UserDaoFactory.getInstanceUser().selectUser();
                boolean flag = false;
                try {
                    while (rs.next()) {

                        if(username.equals(rs.getString("username")) && userpass.equals(rs.getString("userpass"))){
                            response.getWriter().print("用户登录成功，即将进入商品信息页面...");
                            response.setHeader("refresh","3;URL=select.jsp");
                            flag = true;
                            break;
                        }else if (username.equals(rs.getString("username")) && !userpass.equals(rs.getString("userpass"))){
                            response.getWriter().println("用户密码错误，请重新输入！");
                            response.setHeader("refresh","3;URL=index.jsp");
                            flag = true;
                            break;
                        }

                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                if(!flag){
                    response.getWriter().println("用户不存在，请注册后再登录。");
                    request.getRequestDispatcher("register.jsp").forward(request,response);
                }
            }
    }
}
