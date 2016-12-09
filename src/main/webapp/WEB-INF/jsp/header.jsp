<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/default.css" rel="stylesheet">
    <link href="/css/font-awesome.css" rel="stylesheet">
    <!--for VK-->
    <script src="http://vk.com/js/api/openapi.js" type="text/javascript"></script>

</head>

<body>
<div class="header">
    <div class="navbar navbar-inverse  navbar-static-top">

        <!--Меню-->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle ="collapse" data-target = "#responsive-menu">
                    <span class="sr-only">Открыть навигацию</span>
                    <span class="icon-bar"> </span>
                    <span class="icon-bar"> </span>
                    <span class="icon-bar"> </span>
                </button>

                <a class="navbar-brand" href="/">
                    <img src="/images/logo.png"  id = "imgInLineLogo">
                </a>
            </div>

            <div class="collapse navbar-collapse" id="responsive-menu">
                <ul class="nav navbar-nav headerbar">
                    <li><a href="/"><i class="index"></i> На главную</a></li>
                    <li><a href="/entertainment"><i class="entertainment"></i> Развлечения</a></li>
                    <li><a href="/food"><i class="food"></i>Еда</a></li>
                    <li><a href="/order/edit"><i class="fa fa-mobile fa-2x"></i> Заказ</a></li>
                    <li><a href="/contact"><i class="fa fa-mobile fa-2x"></i> Контакты</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>