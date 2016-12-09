<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Many Customers</title>
</head>
<body>

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
    <c:forEach var="cust" items="${customers}">
        <tr>
            <spring:url value="/customer" var="customerLink">
                <spring:param name="id" value="${cust.id}"/>
            </spring:url>
            <td><a href="${customerLink}">link</a></td>
            <td>${cust.firstName}</td>
            <td>${cust.lastName}</td>
            <td>${cust.login}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
