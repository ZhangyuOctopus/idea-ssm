<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/8
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自定义类型转换</title>
</head>
<body>
    <%--自定义类型转换: 比如封装在JavaBean中但是有可能SSM框架不支持这样的格式那么就会报错--%>
    <form action="param/userDate" method="post" ><br>
        姓名: <input type="text" name="name"/><br>
        密码: <input type="password" name="age" /><br>
        生日: <input type="text" name="date" /><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
