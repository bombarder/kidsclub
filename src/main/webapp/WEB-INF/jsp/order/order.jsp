<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>

<table>
    <thead>
    <tr>
        <th>Customer</th>
        <th>Entertainment</th>
        <th>Food</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${entertainments}" var="foodNumber" varStatus="foodStatus">
        <c:if test="${foodStatus.index < n}">
            <tr>
                <td><c:out value="${foodNumber}" /><td>
            </tr>
        </c:if>
    </c:forEach>

    <c:forEach items="${food}" var="foodNumber" varStatus="foodStatus">
        <c:if test="${foodStatus.index < n}">
            <tr>
                <td><c:out value="${foodNumber}" /><td>
            </tr>
        </c:if>
    </c:forEach>
    </tbody>
</table>
</body>
</html>