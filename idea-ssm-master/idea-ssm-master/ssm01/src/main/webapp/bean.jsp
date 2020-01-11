<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/8
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="param/saveAccount" method="post" ><br>
        姓名: <input type="text" name="username"/><br>
        密码: <input type="password" name="password" /><br>
        金额: <input type="text" name="money" /><br>
        用户姓名: <input type="text" name="user.name" /><br>
        用户性别: <input type="text" name="user.age" /><br>
    <input type="submit" value="提交"/>
    </form>
</body>
</html>
