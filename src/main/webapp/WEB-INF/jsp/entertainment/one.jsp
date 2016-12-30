<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Entertainment</title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script>
        $(function () {
            $('#add-to-order').on('click', function() {
                var userId = $('#user-id').attr('value');
                var itemId = $('#item-id').attr('value');
                var data = {
                    userId : userId,
                    itemId : itemId
                };

                $.post("/order", data, function (response) {
                    $('#container').html('<img src="/resources/images/pool.jpeg" alt="no image" height="42" width="42">');
                    alert(response);
                })
            })
        })
    </script>
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
    <input id="user-id" type="hidden" value="1">
    <input id="item-id" type="hidden" value="${entertainment.id}">
    <div id="container"></div>
</div>
<button id="add-to-order">Add to bucket</button>
</body>
</html>
