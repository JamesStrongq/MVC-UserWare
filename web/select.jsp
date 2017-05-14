<%@ page import="com.hyq.userdaofactory.UserDaoFactory" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.hyq.waredaofactory.WareDaoFactory" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/5/13
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息界面</title>
</head>
<%
    ResultSet rs = WareDaoFactory.getInstanceWare().selectWare();


%>
<body>
    <table border="2">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
        </tr>
        <%
            while(rs.next()){
        %>
        <tr>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><a href="insert.jsp">增加商品</a></td>
            <td><a href="update.jsp?wareid=<%=rs.getString(1)%>">修改商品</a></td>
            <td><a href="DeleteServlet?wareid=<%=rs.getString(1)%>">删除商品</a></td>
        </tr>
        <%
            }
        %>
    </table>

</body>
</html>