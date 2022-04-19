<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/18
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试文件上传和下载</title>
</head>
<body>
    <a href="/testDown">下载图片</a>
    <form action="/testUp" method="post" enctype="multipart/form-data">
        头像：<input type="file" name="photo"><br>
        <input type="submit" value="上传">
    </form>
</body>
</html>
