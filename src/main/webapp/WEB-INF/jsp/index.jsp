<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>

<head>

    <title>Детский клуб</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="/resources/images/faces.png" type="image/x-icon">

</head>

<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>

<div class="container">
    <div class="jumbotron">
        <div class="row text-center">
            <div class="">
                <h2>Kids Club - Diving into the JAVA course</h2>

                <h3>Outcome project</h3>
            </div>
        </div>
        <div class="row text-center">
            <img src="/images/welcome.png" width="400"
                 th:src="@{/images/welcome.png}" />
        </div>
    </div>
</div>

</body>
</html>
