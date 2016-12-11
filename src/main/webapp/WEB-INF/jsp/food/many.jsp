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
    <c:forEach var="food" items="${someFood}">
        <tr>
            <spring:url value="/food" var="foodLink">
                <spring:param name="id" value="${food.id}"/>
            </spring:url>
            <td><a href="${foodLink}">link</a></td>
            <td>${food.name}</td>
            <td>${food.description}</td>
            <td>${food.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<form action="${createEntertainment}" method="post" >
    <a href="/food/edit"><img src="/resources/images/balls.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/cake.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/eggs.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/fresh.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/fruits.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/plate.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/sausage.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/strawberry.jpg"></a>
    <a href="/food/edit"><img src="/resources/images/welcome.jpg"></a>
</form>

</body>
</html>