<%--
  Created by IntelliJ IDEA.
  User: shestakov.m
  Date: 19.01.2017
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<div>
    <form action="/j_spring_security_check" method="post">
        <br>
        <c: if ${error} !="null"> ${error} </c:>
        <br>
        <td>Username :</td>
        <input type="text" name="user" >
        <br>
        <td>Password :</td>
        <input type="password" name = "pass">
        <input type="submit" name="submit" value="Submit">
    </form>
</div>
</body>
</html>
