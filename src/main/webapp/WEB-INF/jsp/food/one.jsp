<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food</title>
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
                    $('#container').html('<img src="https://yt3.ggpht.com/-PmpVPRyZwN0/AAAAAAAAAAI/AAAAAAAAAAA/cBHsSy9U4Vo/s88-c-k-no-mo-rj-c0xffffff/photo.jpg" alt="no image">');
                    alert(response);
                })
            })
        })
    </script>
</head>
<body>
<jsp:include page="/WEB-INF/jsp/header.jsp"/>
<div>
    Name ${food.name}
    <br>
    Description ${food.description}
    <br>
    Price ${food.price}
    <input id="user-id" type="hidden" value="1">
    <input id="item-id" type="hidden" value="${food.id}">
    <div id="container"></div>
</div>
<button id="add-to-order">Add to bucket</button>

</body>
</html>