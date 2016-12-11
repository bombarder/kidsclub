<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Many Customers</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<table>
    <thead>
    <tr>
        <th>link</th>
        <th>first name</th>
        <th>last name</th>
        <th>login</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="food" items="${customers}">
        <tr>
            <spring:url value="/customer" var="foodLink">
                <spring:param name="id" value="${food.id}"/>
            </spring:url>
            <td><a href="${foodLink}">link</a></td>
            <td>${food.firstName}</td>
            <td>${food.lastName}</td>
            <td>${food.login}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
