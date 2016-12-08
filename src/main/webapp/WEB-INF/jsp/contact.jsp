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

    <!-- css -->
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/default.css" rel="stylesheet">
    <link href="/css/font-awesome.css" rel="stylesheet">
    <link href="/css/image.css" rel="stylesheet">
    <!--js-->
    <script src="/js/bootstrap.js"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/js/bootstrap.js"></script>


    <!--FOR Google-->
    <script type='text/javascript' src='http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js'></script>
    <script type='text/javascript' src='js/example.js'></script>
    <script type='text/javascript' src='http://maps.google.com/maps/api/js?sensor=true'></script>

</head>
<body>

<div class="body">
    <div class="col-xs-4 blackback">

        <li data-geo-lat="48.458085" data-geo-long="35.057470">
            <a href="#" onClick="showNext();">
                <h3>Адрес кафе</h3>

                <p class="longdesc">
                    Адрес:<br/>
                    ул. Юности, 1. Винница<br/>
                    Винницкая область, Украина<br/>
                    Телефон:(098) 530 5000<br/>
                    e-mail: bombarder@mail.ru</p>
            </a></li>
    </div>

    <spring:url value="some" var="someUrl"/>
    <h1><a href="${someUrl}">ссылка на контроллер</a></h1>

    <spring:url value="create" var="createUrl"/>
    <form action="${createUrl}" method="post" >
        <input type="text" name="firstName" class="form-control"/>
        <input type="text" name="lastName" class="form-control"/>
        <input class="btn  btn-primary" type="submit" value="send">
    </form>


</div>


</body>
</html>