<%@ page import="com.hyq.vo.Ware" %>
<%@ page import="com.hyq.waredaofactory.WareDaoFactory" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/13
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
<%
    Ware ware = new Ware();
    String wareid = request.getParameter("wareid");
    ware.setWareid(wareid);
    WareDaoFactory.getInstanceWare().selectWareId(ware);
    String warename = ware.getWarename();
    String wareprice = ware.getWareprice();

%>
    <form action="UpdateServlet?wareid=<%=wareid%>" method="post">
        商品名称:<input type="text" name="warename" value="<%=warename%>"/><br>
        商品价格:<input type="text" name="wareprice" value="<%=wareprice%>"/><br>
        <input type="submit" value="修改"/>
    </form>
</body>
</html>
