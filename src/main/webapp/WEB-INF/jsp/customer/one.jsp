<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One customer</title>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>

<div class="container">
    <div class="row">
        <div class="col-md-8 col-sm-12">
            <table class="table table-bordered table-hover">
                <thead>
                <tr class="success">
                    <th>Name</th>
                    <th>Login</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${customer.firstName} ${customer.lastName}</td>
                    <td>${customer.login}</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
