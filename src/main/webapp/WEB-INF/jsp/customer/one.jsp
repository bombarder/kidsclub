<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One customer</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div>
    Name ${customer.firstName} ${customer.lastName}
    <br>
    login ${customer.login}
</div>
</body>
</html>
