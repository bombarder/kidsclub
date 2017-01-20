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
    <div class="row">
        <div class="col-md-8 col-sm-12">
            <table class="table table-bordered table-hover">
                <thead>
                <tr class="success">
                    <th>First name</th>
                    <th>Last name</th>
                    <th>Login</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <spring:url value="/customer" var="entertainmentOrderLink">
                            <spring:param name="id" value="${customer.id}"/>
                        </spring:url>
                        <td><a href="${entertainmentOrderLink}">${customer.firstName}</a></td>
                        <td>${customer.lastName}</td>
                        <td>${customer.login}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>

        <div class="col-md-4 col-sm-12">
            <spring:url value="/customer/add" var="createUrl"/>
            <form action="${createUrl}" method="post">
                <input type="text" name="firstName" class="form-control"/>
                <input type="text" name="lastName" class="form-control"/>
                <input type="text" name="login" class="form-control"/>
                <input class="btn btn-primary" type="submit" value="add">
            </form>
        </div>
    </div>
</div>
</body>
</html>
