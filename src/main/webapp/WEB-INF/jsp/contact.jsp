<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Контакты</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="http://s3.gazu.ru/favicon.ico" type="image/x-icon">

</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="jumbotron">
        <spring:url value="create" var="createUrl"/>
        <form action="${createUrl}" method="post">
            <input type="text" name="firstName" class="form-control"/>
            <input type="text" name="lastName" class="form-control"/>
            <input class="btn  btn-primary" type="submit" value="send">
        </form>
    </div>
</div>

<script src="/js/home.js"></script>
</body>
</html>
