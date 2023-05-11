<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Read</title>
</head>
<body>
<h1>Todo Read</h1>
<hr>
tno <input type="text" name="tno" readonly> <br>
todo <input type="text" name="todo" readonly> <br>
duedate <input type="date" name="duedate" readonly> <br>
<input type="checkbox" name="complete"> <br>
<a href="/todo/modify">modify</a>
<a href="/todo/delete">delete</a>
</body>
</html>
