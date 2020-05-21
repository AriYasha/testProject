<%--
  Created by IntelliJ IDEA.
  User: ирина
  Date: 11.05.2020
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

</head>
<body>
<form action="/save" method="post">
    <label>name room : </label>
    <input type="text" id="name" name="name" placeholder="Enter name"/>
    <select name="choiceCountry">
        <c:forEach var="result" items="${requestScope.allCountryNames}">
            <option><c:out value="${result}"/></option>
        </c:forEach>
    </select>
    <input type="submit" name="save" value="save">
</form>
    <form action="/goBack" method="get">
    <p><input type="submit" name="back" value="Go back" /></p>
    </form>
    <p>${requestScope.message}</p>


</body>
</html>
