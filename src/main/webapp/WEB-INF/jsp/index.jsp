<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
    <c:url value="/resources/text.txt" var="url"/>
    <spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
    Spring URL: ${springUrl} at ${time}
    <br>
    JSTL URL: ${url}
    <br>
    Message: ${message}
    <br>

    <h1>Your lucky number is</h1>
    <h2>${random}</h2>

    <img src="https://tpc.googlesyndication.com/simgad/15443604829256092015" alt="Smiley face">
</body>

</html>