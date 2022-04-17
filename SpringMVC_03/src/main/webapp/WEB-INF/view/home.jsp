<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/14
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h1>首页</h1>
    <a href="/testRequestMapping">@RequestMapping_value属性</a>
    <a href="/test">@RequestMapping_value属性</a>
    <form action="/test" method="post">
        <button type="submit" >测试method属性post请求</button>
    </form>
    <a href="/test?username='1'&password=‘123456’">测试@RequestMapping注解的params</a>
    <a href="/awa/sam">测试@RequestMapping使用ant风格---?</a><br>
    <a href="/awsa/sam">测试@RequestMapping使用ant风格---*</a><br>
    <a href="/aa/sam">测试@RequestMapping使用ant风格---*</a><br>
    <a href="/awa/s/asd/sam">测试@RequestMapping使用ant风格---**</a><br>
    <a href="/sam/1">测试@RequestMapping支持路径中的占位符</a><br>
    <a href="/sam/1/admin">测试@RequestMapping支持路径中的占位符</a><br>

</body>
</html>
