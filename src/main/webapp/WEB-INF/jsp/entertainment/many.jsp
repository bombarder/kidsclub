<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Entertainment</title>
    <link href="<c:url value="/resources/static/css/main.css" />" rel="stylesheet">
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
    <c:forEach var="entertainment" items="${someEntertainment}">
        <tr>
            <spring:url value="/entertainment" var="foodOrderLink">
                <spring:param name="id" value="${entertainment.id}"/>
            </spring:url>
            <td><a href="${foodOrderLink}">link</a></td>
            <td>${entertainment.name}</td>
            <td>${entertainment.description}</td>
            <td>${entertainment.duration}</td>
            <td>${entertainment.price}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<spring:url value="/entertainment/add" var="createUrl"/>
<form action="${createUrl}" method="post">
    <input type="text" name="name" class="form-control"/>
    <input type="text" name="description" class="form-control"/>
    <input type="text" name="duration" class="form-control"/>
    <input type="text" name="price" class="form-control"/>
    <input class="btn  btn-primary" type="submit" value="add">
</form>
</body>
</html>