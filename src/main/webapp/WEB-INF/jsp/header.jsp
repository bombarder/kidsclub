<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>

<link href="/kidsclub/resources/static/css/main.css" rel="stylesheet"/>

<div class="container">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <ul class="nav navbar-nav">
                    <spring:url var="home" value="/"/>
                    <li><a href="${home}">На главную</a></li>

                    <spring:url var="cust" value="/customer/all"/>
                    <li><a href="${cust}">Посетители</a></li>

                    <spring:url var="ents" value="/entertainment/all"/>
                    <li><a href="${ents}">Развлечения</a></li>

                    <spring:url var="food" value="/food/all"/>
                    <li><a href="${food}">Еда</a></li>

                    <spring:url var="ord" value="/order"/>
                    <li><a href="${ord}">Заказ</a></li>

                    <spring:url var="feed" value="/feedback"/>
                    <li><a href="${feed}">Отзывы</a></li>

                    <c:if test="${pageContext.request.userPrincipal.name != null}">
                        <form id="logoutForm" method="POST" action="${contextPath}/kidsclub/login">
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>
                    </c:if>

                    <li><a> Welcome ${pageContext.request.userPrincipal.name}</a> </li>
                    <button onclick="document.forms['logoutForm'].submit()">Logout</button>
                </ul>
            </div>
        </div>
    </nav>
</div>


