<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/10
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--jstl表达式--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>查询数据库</title>
</head>
<body>
    ${list}
    <br>
    <c:forEach items="${list}" var="account">
        ${account.name}
        ${account.money}
    </c:forEach>
</body>
</html>
