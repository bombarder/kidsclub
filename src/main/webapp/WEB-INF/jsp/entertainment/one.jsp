<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One entertainment</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div>
    Name ${entertainment.name}
    <br>
    Description ${entertainment.description}
    <br>
    Duration ${entertainment.duration}
    <br>
    Price ${entertainment.price}
</div>
<input type="button"  onclick="location.href='/register.htm'" value="Add to bucket" >
</body>
</html>
