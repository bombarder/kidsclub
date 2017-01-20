<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(function () {
            $('#add-to-order').on('click', function () {
                var userId = $('#user-id').attr('value');
                var itemId = $('#item-id').attr('value');
                var data = {
                    userId: userId,
                    itemId: itemId
                };

                $.post("/kidsclub/order", data, function (response) {
                    $('#container');
                    alert(response);
                })
            })
        })
    </script>
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
                    <th>Description</th>
                    <th>Price</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${food.name}</td>
                    <td>${food.description}</td>
                    <td>${food.price}</td>
                </tr>

                <input id="user-id" type="hidden" value="1">
                <input id="item-id" type="hidden" value="${food.id}">
                <div id="container"></div>
                </tbody>
            </table>
            <button id="add-to-order">Add to bucket</button>
        </div>
    </div>
</div>
</body>
</html>