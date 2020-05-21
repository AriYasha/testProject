<%--
  Created by IntelliJ IDEA.
  User: ирина
  Date: 11.05.2020
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Details</title>
    <script type="text/javascript"
            src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
    <script type="text/javascript">
        function crunchifyAjax() {

            $.ajax({
                url : 'onTheLight.html',
                method: 'get',
                success : function(data) {
                    $('#result').html(data);
                }
            });
        }
    </script>


    <%--${requestScope.choiceRoom}--%>
</head>
<body>
<input  type="hidden" id="nameRoom" name="nameRoom" value="${requestScope.choiceRoom}">
<div id="state"><h3>"${message}"</h3></div>
<input  id="on" type="submit" name="on" value="Включить свет">

<input id="off" type="submit" name="off" value="Выключить свет">

<div id="content"></div>

<script>
    $(document).ready(function(){

        $('#on').click(function(){
            var nameRoom = $('#nameRoom').val();

            $.ajax({
                url: "onTheLight.html",
                method: 'post',
                data : 'nameRoom='+nameRoom,

                success: function(resp){
                    $("#state").html(resp);
                }
            });
        });

        $('#off').click(function(){
            var nameRoom = $('#nameRoom').val();

            $.ajax({
                url: "offTheLight.html",
                method: "post",
                data: 'nameRoom='+nameRoom,


                success: function(resp){
                    $("#state").html(resp);
                }
            });
        });

    });

    $(document).ready(function getStateTheLight() {

        $('#on').click(function getStateTheLight() {
            var nameRoom = $('#nameRoom').val();

            $.ajax({
                url: "getStateTheLight.html",
                method: 'post',
                data: 'nameRoom=' + nameRoom,

                success: function (resp) {
                    $("#state").html(resp);
                }

            });
            setTimeout(getStateTheLight, 3000);
        });
    });

</script>

</body>
</html>
