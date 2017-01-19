<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Many Customers</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="container">
    <div class="jumbotron">
        <table>
            <thead>
            <tr>
                <th>link</th>
                <th>name</th>
                <th>description</th>
                <th>price</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="food" items="${someFood}">
                <tr>
                    <spring:url value="/food" var="foodOrderLink">
                        <spring:param name="id" value="${food.id}"/>
                    </spring:url>
                    <td><a href="${foodOrderLink}">link</a></td>
                    <td>${food.name}</td>
                    <td>${food.description}</td>
                    <td>${food.price}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

        <spring:url value="/food/add" var="createUrl"/>
        <form action="${createUrl}" method="post">
            <input type="text" name="name" class="form-control"/>
            <input type="text" name="description" class="form-control"/>
            <input type="text" name="price" class="form-control"/>
            <input class="btn  btn-primary" type="submit" value="add">
        </form>

        <form action="${createEntertainment}" method="post">
            <a href="/food/edit"><img src="/images/balls.jpg"></a>
            <a href="/food/edit"><img src="/images/cake.jpg"></a>
            <a href="/food/edit"><img src="/images/eggs.jpg"></a>
            <a href="/food/edit"><img src="/images/fresh.jpg"></a>
            <a href="/food/edit"><img src="/images/fruits.jpg"></a>
            <a href="/food/edit"><img src="/images/plate.jpg"></a>
            <a href="/food/edit"><img src="/images/sausage.jpg"></a>
            <a href="/food/edit"><img src="/images/strawberry.jpg"></a>
            <a href="/food/edit"><img src="/images/welcome.jpg"></a>
        </form>
    </div>
</div>

</body>
</html>