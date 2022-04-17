<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/17
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <h1>首页</h1>
    <a href="/testRequest">testRequest</a><br>
    <a href="/testModeAdnView">testModeAdnView</a><br>
    <a href="/testMode">testMode</a><br>
    <a href="/testMap">testMap</a><br>
    <a href="/testModelMap">testModelMap</a><br>
    <a href="/testSession">testSession</a><br>
    <a href="/testThymeleafView">testThymeleafView</a><br>
    <a href="/testForward">testForward</a><br>
    <a href="${pageContext.request.contextPath}/testRedirect">testRedirect</a><br>
</body>
</html>
