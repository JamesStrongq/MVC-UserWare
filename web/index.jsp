<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/12
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>用户登录界面</title>
  </head>
  <body>
  <form action="LoginServlet" method="post">
    用户名:<input type="text" name="username"/><br>
    密&nbsp;&nbsp;码:<input type="password" name="userpass"/><br>
    <input type="submit" value="登录"/>
    <input type="reset" value="重置"/>
  </form>
  </body>
</html>
