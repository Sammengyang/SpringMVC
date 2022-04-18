<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/18
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form method="post" action="/user">
        用户名：<input type="text" name="uname"><br>
        密码 ： <input type="password" name="upassword"><br>
        <input type="submit" value="add">
    </form>
</body>
</html>
