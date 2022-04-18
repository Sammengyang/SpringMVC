<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 2022/4/17
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserList</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <script>
        $(document).ready(function(){
            $(".delete").click(function (event){
                // 禁止a标签跳转
                event.preventDefault();
                // 获取到form表单
                var form = $("form[id='deleteform']");
                // 获取被点击的 a标签的href属性，赋值给表单form
                form.attr('action',event.target.href);
                form.submit();
            });
        });
    </script>
</head>
<body>
    <table border="1" cellspacing="0" cellpadding="8" style="text-align: center" id="usertable">
      <tr>
        <th colspan="5">User Info</th>
      </tr>
      <tr>
        <th>id</th>
        <th>username</th>
        <th>password</th>
        <th>options(<a href="/adduser">AddUser</a>)</th>
      </tr>
      <c:forEach var="user" items="${userlist}">
          <tr>
            <td>${user.uid}</td>
            <td>${user.uname}</td>
            <td>${user.upassword}</td>
            <td>
              <a href="/user/${user.uid}">update</a>
              <a class="delete" href="/user/${user.uid}">delete</a>
            </td>
          </tr>
      </c:forEach>
    </table>
    <form id="deleteform" method="post">
        <input type="hidden" name="_method" value="delete">
    </form>
</body>
</html>
