<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/8
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequsetBody</title>
</head>
<body>
    <%--使用表单来模拟RequestBody--%>
    <form action="anno/testRequestBody" method="post" ><br>
        用户姓名: <input type="text" name="username"/><br>
        用户年龄: <input type="text" name="age" /><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
