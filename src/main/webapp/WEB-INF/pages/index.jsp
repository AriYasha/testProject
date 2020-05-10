<%--
  Created by IntelliJ IDEA.
  User: ирина
  Date: 10.05.2020
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form  method="post" action="/richest">
    <label for="name" class="col-sm-2 control-label">name of country : </label>
    <input type="text" class="form-control" id="name" name="name"/>
    <select name="choiceCountry">
        <c:forEach var="result" items="${requestScope.allCountryNames}">
            <option><c:out value="${result}"/></option>
        </c:forEach>
    </select>
    <input type="submit" name="call" value="go" >

</form>
</body>
</html>
