<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Entertainment</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="container">
    <div class="col-md-8 col-sm-12">
        <div class="row">
            <table class="table table-bordered table-hover">
                <thead>
                <tr class="success">
                    <th>Name</th>
                    <th>Description</th>
                    <th>Duration</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="feedbackName" items="${someEntertainment}">
                    <tr>
                        <spring:url value="/entertainment" var="feedbackLink">
                            <spring:param name="id" value="${feedbackName.id}"/>
                        </spring:url>
                        <td><a href="${feedbackLink}">${feedbackName.name}</a></td>
                        <td>${feedbackName.description}</td>
                        <td>${feedbackName.duration}</td>
                        <td>${feedbackName.price}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="col-md-4 col-sm-12">
            <spring:url value="/entertainment/add" var="createUrl"/>
            <form action="${createUrl}" method="post">
                <input type="text" name="name" class="form-control"/>
                <input type="text" name="description" class="form-control"/>
                <input type="text" name="duration" class="form-control"/>
                <input type="text" name="price" class="form-control"/>
                <input class="btn  btn-primary" type="submit" value="add">
            </form>
        </div>
    </div>
</div>
</body>
</html>