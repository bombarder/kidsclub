<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script
            src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" media="screen"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />

    <link href="/css/main.css" th:href="@{/css/main.css}"
          rel="stylesheet" media="screen" />

</head>
<body>
<div class="container">
    <div th:fragment="header">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <ul class="nav navbar-nav">
                        <li><a href="/"><i class="index"></i> На главную</a></li>
                        <li><a href="/customer/all"><i class="customer/many"></i> Customers</a></li>
                        <li><a href="/entertainment/all"><i class="entertainment/many"></i> Развлечения</a></li>
                        <li><a href="/food/all"><i class="food/many"></i> Еда</a></li>
                        <li><a href="/order"><i class="order/order"></i> Order</a></li>
                        <li><a href="/contact"><i class="contact"></i> Контакты</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>
</div>
</body>
</html>