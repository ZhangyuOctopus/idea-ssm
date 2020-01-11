<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/8
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数绑定</title>
</head>
<body>
<%--注意是相对路径不能够写/--%>
    <a href="param/testparam?username=zy">请求参数绑定</a>
    <br>
    <%--获取原生的Servlet API--%>
    <a href="param/testServlet">获取原生的Servlet API</a>
</body>
</html>
