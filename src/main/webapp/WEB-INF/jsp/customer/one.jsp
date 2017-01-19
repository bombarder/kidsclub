<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One customer</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div class="container">
    <div class="jumbotron">

        Name ${customer.firstName} ${customer.lastName}
        <br>
        login ${customer.login}
    </div>
</div>
</body>
</html>
