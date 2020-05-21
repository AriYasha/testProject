<%--
  Created by IntelliJ IDEA.
  User: ирина
  Date: 11.05.2020
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome</title>

</head>
<body>
<h3>Hello, my dear friend</h3>
<h4> Now, you can create your own room</h4>
<form  method="get" action="/createRoom">
    <input type="submit" name="create" value="Create new room" >
</form>

    <form method="get" action="/seeDetails">
        <label>name room</label>
        <select name="choiceRoom">
            <c:forEach var="result" items="${requestScope.allNamesRooms}">
                <option><c:out value="${result}"/></option>
            </c:forEach>
        </select>
    <input type="submit"  name="see" value="see details">
        <p>${requestScope.access}</p>
    </form>
</form>
</body>
</html>
