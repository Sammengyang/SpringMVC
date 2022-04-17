<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/17
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="/user">查询所有用户信息</a><br>
    <a href="/user/1">根据id查询用户信息</a><br>
    <form action="/user" method="post">
        id：<input type="text" name="uid"><br>
        用户名：<input type="text" name="uname"><br>
        密码：<input type="password" name="upassword"><br>
        <input type="submit" value="添加">
    </form>
    <form action="/user" method="post">
        <input type="hidden" name="_method" value="PUT">
        id：<input type="text" name="uid"><br>
        用户名：<input type="text" name="uname"><br>
        密码：<input type="password" name="upassword"><br>
        <input type="submit" value="修改">
    </form>
    <a href=""
</body>
</html>
