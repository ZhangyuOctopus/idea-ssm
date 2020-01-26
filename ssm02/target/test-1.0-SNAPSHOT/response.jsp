<%--
  Created by IntelliJ IDEA.
  User: yf
  Date: 2020/1/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.4.1.min.js" type="text/javascript"> </script>
    <script>
        /*页面加载绑定单机事件*/
        $(function(){
            $("#btn").click(function () {
                alert("点击了")
                /*发送ajax请求*/
                $.ajax({
                    //编写json格式,设置属性和值
                    url: "user/testJson",
                    contentType : "application/json;charset=UTF-8",
                    data : '{"username" : "zhangyu2", "password" : "123", "age" : 12}',
                    dataType : "json",
                    type : "post",
                    success : function (data) {
                        /*data服务器端响应的json数据, 进行解析*/
                        alert(data.username);
                        alert(data.password);
                        alert(data.age);
                    }
                });
            })
        });
    </script>
</head>

<body>
    <a href="user/testString">testString</a><br>
    <a href="user/testVoid">testVoid</a><br>
    <a href="user/testModelAndView">testModelAndView</a><br>
    <%--模拟发送异步请求--%>
    <button id="btn">发送异步请求</button>
</body>
</html>
