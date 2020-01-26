<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/10
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="account/findAll">测试springmvc</a><br>
<%--测试保存方法--%>
<form action="account/save" method="post">
    姓名: <input type="text" name="name" /><br>
    金额: <input type="text" name="money" /><br>
    <input type="submit" value="保存"><br>
</form>
</body>
</html>
