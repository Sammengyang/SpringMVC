<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/18
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script>
        $(function (){
           $("a[id='ResponseAjax']").click(function (event){
               // 取消默认行为
               event.preventDefault();
               $.ajax({
                   type:"post",
                   url:event.target.href,
                   data:{"user":"san","password":"123456"},
                   dataType:"text",
                   success:function (d){
                       if (d=="success"){
                            alert(d);
                       }else {
                            alert(d);
                       }
                   },
                   error:function (d,error){
                        alert(error);
                   }
               });
           });
        });
    </script>
</head>
<body>
    <h1>home</h1>
    <form method="post" action="/testRequestBody">
        用户名：<input name="uname" type="text">
        密码：<input name="upassword" type="text">
        <input value="测试@RequestBody" type="submit">
    </form>
    <form method="post" action="/testRequestEntity">
        用户名：<input name="uname" type="text">
        密码：<input name="upassword" type="text">
        <input value="测试@testRequestEntity" type="submit">
    </form>
    <a href="/testResponse">testResponse</a><br>
    <a href="/testResponseUser">testResponseUser</a>
    <a id="ResponseAjax" href="/testResponseAjax">testResponseAjax</a>
    <a href="/file">File Down</a>
</body>
</html>
