<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-md-8 col-sm-12">
            <table class="table table-bordered table-hover">
                <thead>
                <tr class="success">
                    <th>Customer</th>
                    <th>Entertainment</th>
                    <th>Food</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${order}" var="orderNumber">
                    <tr>
                        <td><c:out value="${orderNumber}"/><td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>