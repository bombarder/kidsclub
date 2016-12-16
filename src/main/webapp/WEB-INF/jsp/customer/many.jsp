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
    <c:forEach var="customer" items="${customers}">
        <tr>
            <spring:url value="/customer" var="foodOrderLink">
                <spring:param name="id" value="${customer.id}"/>
            </spring:url>
            <td><a href="${foodOrderLink}">link</a></td>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.login}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<spring:url value="/customer/add" var="createUrl"/>
<form action="${createUrl}" method="post" >
    <input type="text" name="firstName" class="form-control"/>
    <input type="text" name="lastName" class="form-control"/>
    <input type="text" name="login" class="form-control"/>
    <input class="btn  btn-primary" type="submit" value="add">
</form>
</body>
</html>
