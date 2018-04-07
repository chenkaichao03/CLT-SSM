<%--
  Created by IntelliJ IDEA.
  User: chenkaichao
  Date: 2018/4/5
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="/shiro/login" method="post">
    Account:<input type = "text" name = "username"/>
    <br/>
    Password:<input type = "password" name = "password"/>
    <br/>
    <input type = "submit" value = "submit"/>
</form>
</body>
</html>
