<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-11
  Time: 오후 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo Modify</title>
</head>
<body>

<h1>Todo Modify</h1>
<hr>

<form method="post">
    tno <input type="text" name="tno" value="1" readonly> <br>
    todo <input type="text" name="todo" value="잠자기"> <br>
    duedate <input type="date" name="duedate" value="2023-05-14"> <br>
    <input type="checkbox" name="finished" checked> <br> <%--checked하면 on값 대입--%>
    <input type="reset" value="reset"> <input type="submit" value="regist">

</form>
</body>
</html>
