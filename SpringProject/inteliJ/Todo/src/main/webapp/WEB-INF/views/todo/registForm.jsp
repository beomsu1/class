<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 1:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Regist</title>
</head>
<body>
<h1>Todo Regist</h1>
<hr>
<form method="post">
todo <input type="text" name="todo"> <br>
duedate <input type="date" name="duedate"> <br>
<input type="reset" value="reset"> <input type="submit" value="regist">
    <a href="/todo/list">list</a>
</form>
</body>
</html>
