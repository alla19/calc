<%--
  Created by IntelliJ IDEA.
  User: kohal
  Date: 26.12.2019
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculation</title>
</head>
<body>

Result ${requestScope.result}

<form action="${pageContext.request.contextPath}/calc" method="post">
    <label>
        <input type="text" placeholder="Введите число а" name="num1">
    </label>

    <label>
        <select name="operation">
            <option value="sum">+</option>
            <option value="sub">-</option>
            <option value="multi">*</option>
            <option value="div">:</option>
        </select>
    </label>

    <label>
        <input type="text" placeholder="Введите число b" name="num2">
    </label>
    <button type="submit">Calculation</button>
</form>

<div>
    <p>
        Ваш результат = <%=request.getParameter("result")%>
    </p>
</div>


</body>
</html>
