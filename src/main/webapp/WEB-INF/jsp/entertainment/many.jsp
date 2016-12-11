<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Some Entertainment</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<table>
    <thead>
    <tr>
        <th>link</th>
        <th>name</th>
        <th>description</th>
        <th>duration</th>
        <th>price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="food" items="${someEntertainment}">
        <tr>
            <spring:url value="/entertainment" var="foodLink">
                <spring:param name="id" value="${food.id}"/>
            </spring:url>
            <td><a href="${foodLink}">link</a></td>
            <td>${food.name}</td>
            <td>${food.description}</td>
            <td>${food.duration}</td>
            <td>${food.price}</td>
        </tr>
    </c:forEach>
    <form action="${createEntertainment}" method="post" >
        <a href="/order/edit"><img src="resources/images/birthdayParty.jpg"></a>
        <a href="/order/edit"><img src="resources/images/pool.jpeg"></a>
        <a href="/order/edit"><img src="resources/images/wpid-clown-pennywise.jpg"></a>
    </form>
    </tbody>
</table>
