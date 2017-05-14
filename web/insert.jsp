<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/13
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加商品</title>
</head>
<body>
<form action="InsertServlet" method="post">
    商品名称:<input type="text" name="warename"/><br>
    商品价格:<input type="text" name="wareprice"/><br>
    <input type="submit" value="增加"/>
</form>
</body>
</html>
