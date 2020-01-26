<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/8
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%--将数据封装到Account类中, 类中存在List与Map集合--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求参数中集合类型绑定</title>
</head>
<body>
    <form action="param/saveAccountList" method="post" ><br>
        姓名: <input type="text" name="username"/><br>
        密码: <input type="password" name="password" /><br>
        金额: <input type="text" name="money" /><br>
        用户姓名: <input type="text" name="list[0].name" /><br>
        用户年龄: <input type="text" name="list[0].age" /><br>
        用户姓名: <input type="text" name="list[1].name" /><br>
        用户年龄: <input type="text" name="list[1].age" /><br>
        用户姓名: <input type="text" name="map['one'].name" /><br>
        用户年龄: <input type="text" name="map['one'].age" /><br>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>