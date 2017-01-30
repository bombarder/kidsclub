<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Контакты</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-sm-12">
            <c:forEach var="feedback" items="${someFeedback}">
                <tr>
                    <spring:url value="/feedback" var="feedbackLink">
                        <spring:param name="id" value="${feedback.id}"/>
                    </spring:url>
                    <td><a href="${feedbackLink}">${feedback.feedbackName}</a></td>
                </tr>
            </c:forEach>
        </div>
        <div class="input-group">
            <spring:url value="/feedback/add" var="createUrl"/>
            <form action="${createUrl}" method="post">
                <input type="text" class="form-control" placeholder="Username" aria-describedby="basic-addon1">
                <input type="text" class="form-control" placeholder="feedback" name="feedbackName"
                       aria-describedby="basic-addon1"/>
                <input class="btn  btn-primary" type="submit" value="add">
            </form>
        </div>
    </div>
</div>
</body>
</html>
