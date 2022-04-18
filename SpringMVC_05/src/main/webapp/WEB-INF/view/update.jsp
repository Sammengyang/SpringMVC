<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/17
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body>
    <form method="post" action="/user">
        <input type="hidden" name="_mothod" value="PUT">
        <input type="hidden" name="uid" value="${user.uid}">
        uid :<input type="text" name="uid" value="${user.uid}" disabled="disabled"><br>
        用户名：<input type="text" name="uname" value="${user.uname}"><br>
        密码 ： <input type="text" name="upassword" value="${user.upassword}"><br>
        <input type="submit" value="add">
    </form>
</body>
</html>
