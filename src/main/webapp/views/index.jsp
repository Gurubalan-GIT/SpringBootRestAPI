<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.example.rest.Users" %>
<%@ page import="com.example.rest.UserRepository" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %><%--
  Created by IntelliJ IDEA.
  User: hg898
  Date: 7/19/2019
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring man</title>
</head>
<body>
Hey!
<ol>
    <c:forEach var="users" items="${UserList}">

        <li>${users}</li>

    </c:forEach>
</ol>
</body>
</html>
