<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div>
    Name ${food.name}
    <br>
    Description ${food.description}
    <br>
    Price ${food.price}
</div>
</body>
</html>