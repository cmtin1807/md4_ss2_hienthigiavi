<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 13/08/2024
  Time: 2:39 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Selected Condiments</title>
</head>
<body>
<h1>Your Sandwich Condiments</h1>
<ul>
    <c:forEach var="condiment" items="${condiments}">
        <li>${condiment}</li>
    </c:forEach>
</ul>
<a href="/">Back</a>
</body>
</html>
